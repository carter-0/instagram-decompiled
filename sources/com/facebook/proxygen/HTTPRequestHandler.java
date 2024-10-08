package com.facebook.proxygen;

import X.DbS;
import X.JTO;
import X.Pxe;
import com.facebook.proxygen.utils.RequestDefragmentingOutputStream;
import java.io.BufferedOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import org.apache.http.HttpEntity;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.client.methods.HttpUriRequest;

public class HTTPRequestHandler {
    public static final byte[] EMPTY_BYTE_ARRAY = new byte[0];
    public static final int MAX_BUFFER_COUNT = 20;
    public static final int SMALL_REQUESTS_BODY_BUFFER_SIZE = 4096;
    public static final int STREAMING_BUFFER_SIZE = 8096;
    public ArrayList mBodyBuffersPool;
    public JniHandler mDelegate;
    public HandlerInterface mHandlerInterface;
    public boolean mIsCanceled;
    public boolean mSkipBufferedOutputStream;
    public int mStreamingBufferSize;

    public class AndroidBufferedOutputStream extends BufferedOutputStream {
        public boolean mClosed;

        private void checkNotClosed() {
            if (this.mClosed) {
                throw JTO.A0u("stream already closed");
            }
        }

        public void close() {
            if (!this.mClosed) {
                try {
                    super.close();
                } finally {
                    this.mClosed = true;
                }
            }
        }

        public void flush() {
            checkNotClosed();
            super.flush();
        }

        public void write(byte[] bArr, int i, int i2) {
            checkNotClosed();
            super.write(bArr, i, i2);
        }

        public AndroidBufferedOutputStream(OutputStream outputStream) {
            super(outputStream);
        }

        public void write(int i) {
            checkNotClosed();
            super.write(i);
        }
    }

    public class CloseSuppressingOutputStream extends FilterOutputStream {
        public void close() {
        }

        public void reallyClose() {
            this.out.close();
        }

        public void write(byte[] bArr, int i, int i2) {
            this.out.write(bArr, i, i2);
        }

        public CloseSuppressingOutputStream(OutputStream outputStream) {
            super(outputStream);
        }

        public void write(int i) {
            this.out.write(i);
        }

        public void write(byte[] bArr) {
            this.out.write(bArr);
        }
    }

    public class HandlerInterface implements RequestDefragmentingOutputStream.HandlerInterface {
        public boolean sendBody(byte[] bArr, int i, int i2) {
            return HTTPRequestHandler.this.sendBody(bArr, i, i2);
        }

        public boolean sendEOM() {
            return HTTPRequestHandler.this.sendEOM();
        }

        public boolean sendHeaders(HttpEntityEnclosingRequest httpEntityEnclosingRequest) {
            return HTTPRequestHandler.this.sendHeaders((HttpUriRequest) httpEntityEnclosingRequest);
        }

        public boolean sendRequestWithBodyAndEom(HttpEntityEnclosingRequest httpEntityEnclosingRequest, byte[] bArr, int i, int i2) {
            return HTTPRequestHandler.this.sendHeadersWithBodyAndEom((HttpUriRequest) httpEntityEnclosingRequest, bArr, i, i2);
        }

        public HandlerInterface() {
        }
    }

    public class LigerBodyOutputStream extends OutputStream {
        public void write(byte[] bArr, int i, int i2) {
            if (!HTTPRequestHandler.this.sendBody(bArr, i, i2)) {
                throw new IOException();
            }
        }

        public LigerBodyOutputStream() {
        }

        public void write(int i) {
            if (!HTTPRequestHandler.this.sendBody(new byte[]{(byte) i}, 0, 1)) {
                throw new IOException();
            }
        }
    }

    private synchronized byte[] acquireBodyBuffer() {
        byte[] bArr;
        ArrayList arrayList = this.mBodyBuffersPool;
        if (arrayList.isEmpty()) {
            bArr = new byte[4096];
        } else {
            bArr = (byte[]) arrayList.remove(Pxe.A0A(arrayList));
        }
        return bArr;
    }

    private synchronized void releaseBodyBuffer(byte[] bArr) {
        ArrayList arrayList = this.mBodyBuffersPool;
        if (arrayList.size() != 20) {
            arrayList.add(bArr);
        }
    }

    /* access modifiers changed from: private */
    public boolean sendBody(byte[] bArr, int i, int i2) {
        JniHandler jniHandler = this.mDelegate;
        if (jniHandler != null) {
            return jniHandler.sendBody(bArr, i, i2);
        }
        return this.mIsCanceled;
    }

    /* access modifiers changed from: private */
    public boolean sendEOM() {
        JniHandler jniHandler = this.mDelegate;
        if (jniHandler != null) {
            return jniHandler.sendEOM();
        }
        return this.mIsCanceled;
    }

    public void cancel() {
        JniHandler jniHandler = this.mDelegate;
        if (jniHandler != null) {
            jniHandler.cancel();
            this.mIsCanceled = true;
            this.mDelegate = null;
        }
    }

    public void changePriority(byte b, boolean z) {
        JniHandler jniHandler = this.mDelegate;
        if (jniHandler != null) {
            jniHandler.changePriority(b, z);
        }
    }

    public void executeWithDefragmentation(HttpUriRequest httpUriRequest) {
        if (httpUriRequest instanceof HttpEntityEnclosingRequest) {
            HttpEntityEnclosingRequest httpEntityEnclosingRequest = (HttpEntityEnclosingRequest) httpUriRequest;
            if (httpEntityEnclosingRequest.getEntity() != null) {
                HttpEntity entity = httpEntityEnclosingRequest.getEntity();
                byte[] acquireBodyBuffer = acquireBodyBuffer();
                try {
                    RequestDefragmentingOutputStream requestDefragmentingOutputStream = new RequestDefragmentingOutputStream(this.mHandlerInterface, httpEntityEnclosingRequest, acquireBodyBuffer, this.mStreamingBufferSize, this.mSkipBufferedOutputStream);
                    entity.writeTo(requestDefragmentingOutputStream);
                    requestDefragmentingOutputStream.writeEomIfNecessary();
                    return;
                } finally {
                    releaseBodyBuffer(acquireBodyBuffer);
                }
            }
        }
        sendHeadersWithBodyAndEom(httpUriRequest, EMPTY_BYTE_ARRAY, 0, 0);
    }

    public boolean sendHeaders(HttpUriRequest httpUriRequest) {
        JniHandler jniHandler = this.mDelegate;
        if (jniHandler != null) {
            return jniHandler.sendHeaders(httpUriRequest);
        }
        return this.mIsCanceled;
    }

    public boolean sendHeadersWithBodyAndEom(HttpUriRequest httpUriRequest, byte[] bArr, int i, int i2) {
        JniHandler jniHandler = this.mDelegate;
        if (jniHandler != null) {
            return jniHandler.sendRequestWithBodyAndEom(httpUriRequest, bArr, i, i2);
        }
        return this.mIsCanceled;
    }

    public void sendRequestBody(HttpUriRequest httpUriRequest) {
        if (httpUriRequest instanceof HttpEntityEnclosingRequest) {
            try {
                processEntityRequest((HttpEntityEnclosingRequest) httpUriRequest);
            } catch (LigerNetworkException unused) {
            } catch (IOException e) {
                cancel();
                throw e;
            }
        }
    }

    public void setDelegate(JniHandler jniHandler) {
        this.mDelegate = jniHandler;
    }

    public HTTPRequestHandler(int i, boolean z) {
        this.mHandlerInterface = new HandlerInterface();
        this.mBodyBuffersPool = DbS.A0v(20);
        this.mStreamingBufferSize = i;
        this.mSkipBufferedOutputStream = z;
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [java.io.OutputStream, com.facebook.proxygen.HTTPRequestHandler$CloseSuppressingOutputStream, java.io.FilterOutputStream] */
    private void processEntityRequest(HttpEntityEnclosingRequest httpEntityEnclosingRequest) {
        HttpEntity entity = httpEntityEnclosingRequest.getEntity();
        if (entity != null) {
            ? filterOutputStream = new FilterOutputStream(new BufferedOutputStream(new LigerBodyOutputStream()));
            try {
                entity.writeTo(filterOutputStream);
                filterOutputStream.flush();
            } finally {
                filterOutputStream.reallyClose();
            }
        }
    }

    public class LigerNetworkException extends IOException {
        public /* synthetic */ LigerNetworkException(AnonymousClass1 r1) {
        }

        public LigerNetworkException() {
        }
    }

    public HTTPRequestHandler() {
        this.mHandlerInterface = new HandlerInterface();
        this.mBodyBuffersPool = DbS.A0v(20);
        this.mStreamingBufferSize = STREAMING_BUFFER_SIZE;
    }
}
