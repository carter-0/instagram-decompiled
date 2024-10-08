package com.facebook.proxygen.utils;

import X.JTO;
import X.Pxg;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import org.apache.http.HttpEntityEnclosingRequest;

public class RequestDefragmentingOutputStream extends OutputStream {
    public static final int BODY_BUFFER_SIZE = 4096;
    public final byte[] mBuffer;
    public boolean mClosed;
    public OutputStream mFallbackOutputStream;
    public final HandlerInterface mHandlerInterface;
    public boolean mHeadersSent;
    public int mPosition;
    public final HttpEntityEnclosingRequest mRequest;
    public boolean mSkipBufferedOutputStream;
    public final int mStreamingBufferSize;

    public class FallbackOutputStream extends OutputStream {
        public void write(byte[] bArr, int i, int i2) {
            if (!RequestDefragmentingOutputStream.this.mHandlerInterface.sendBody(bArr, i, i2)) {
                throw new IOException();
            }
        }

        public FallbackOutputStream() {
        }

        public void write(int i) {
            if (!RequestDefragmentingOutputStream.this.mHandlerInterface.sendBody(new byte[]{(byte) i}, 0, 1)) {
                throw new IOException();
            }
        }
    }

    public interface HandlerInterface {
        boolean sendBody(byte[] bArr, int i, int i2);

        boolean sendEOM();

        boolean sendHeaders(HttpEntityEnclosingRequest httpEntityEnclosingRequest);

        boolean sendRequestWithBodyAndEom(HttpEntityEnclosingRequest httpEntityEnclosingRequest, byte[] bArr, int i, int i2);
    }

    public synchronized void write(byte[] bArr, int i, int i2) {
        checkStreamIsNotClosed();
        if (this.mSkipBufferedOutputStream) {
            sendHeadersIfNotSent();
            while (i2 > 0) {
                flushBufferIfNeeded();
                int i3 = this.mPosition;
                int min = Math.min(4096 - i3, i2);
                System.arraycopy(bArr, i, this.mBuffer, i3, min);
                this.mPosition += min;
                i += min;
                i2 -= min;
            }
        } else {
            OutputStream outputStream = this.mFallbackOutputStream;
            if (outputStream != null) {
                outputStream.write(bArr, i, i2);
            } else if (!canBufferMoreBytes(i2)) {
                fallbackToStreaming(bArr, i, i2);
            } else {
                System.arraycopy(bArr, i, this.mBuffer, this.mPosition, i2);
                this.mPosition += i2;
            }
        }
    }

    public synchronized void writeEomIfNecessary() {
        IOException iOException;
        checkStreamIsNotClosed();
        this.mClosed = true;
        if (this.mSkipBufferedOutputStream) {
            flushBuffer();
            if (!this.mHandlerInterface.sendEOM()) {
                iOException = new IOException();
            }
        } else {
            OutputStream outputStream = this.mFallbackOutputStream;
            if (outputStream != null) {
                outputStream.flush();
                if (!this.mHandlerInterface.sendEOM()) {
                    iOException = new IOException();
                }
            } else if (!this.mHandlerInterface.sendRequestWithBodyAndEom(this.mRequest, this.mBuffer, 0, this.mPosition)) {
                iOException = new IOException();
            }
        }
        throw iOException;
    }

    private boolean canBufferMoreBytes(int i) {
        return Pxg.A1T(i, this.mBuffer.length - this.mPosition);
    }

    private void checkStreamIsNotClosed() {
        if (this.mClosed) {
            throw JTO.A0u("writeEomIfNecessary was already called on the stream");
        }
    }

    private void fallbackToStreaming(byte[] bArr, int i, int i2) {
        if (this.mHandlerInterface.sendHeaders(this.mRequest)) {
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FallbackOutputStream(), this.mStreamingBufferSize);
            this.mFallbackOutputStream = bufferedOutputStream;
            bufferedOutputStream.write(this.mBuffer, 0, this.mPosition);
            this.mFallbackOutputStream.write(bArr, i, i2);
            return;
        }
        throw new IOException();
    }

    private void flushBuffer() {
        int i = this.mPosition;
        if (i > 0 && !this.mHandlerInterface.sendBody(this.mBuffer, 0, i)) {
            throw new IOException();
        }
    }

    private void flushBufferIfNeeded() {
        if (this.mPosition == 4096) {
            flushBuffer();
            this.mPosition = 0;
        }
    }

    private void sendHeadersIfNotSent() {
        if (this.mHeadersSent) {
            return;
        }
        if (this.mHandlerInterface.sendHeaders(this.mRequest)) {
            this.mHeadersSent = true;
            return;
        }
        throw new IOException();
    }

    public RequestDefragmentingOutputStream(HandlerInterface handlerInterface, HttpEntityEnclosingRequest httpEntityEnclosingRequest, byte[] bArr, int i, boolean z) {
        this.mHandlerInterface = handlerInterface;
        this.mRequest = httpEntityEnclosingRequest;
        this.mBuffer = bArr;
        this.mStreamingBufferSize = i;
        this.mSkipBufferedOutputStream = z;
    }

    public synchronized void write(int i) {
        checkStreamIsNotClosed();
        if (this.mSkipBufferedOutputStream) {
            write(new byte[]{(byte) i});
        } else {
            OutputStream outputStream = this.mFallbackOutputStream;
            if (outputStream != null) {
                outputStream.write(i);
            } else if (!canBufferMoreBytes(1)) {
                fallbackToStreaming(new byte[]{(byte) i}, 0, 1);
            } else {
                byte[] bArr = this.mBuffer;
                int i2 = this.mPosition;
                bArr[i2] = (byte) i;
                this.mPosition = i2 + 1;
            }
        }
    }

    public synchronized void write(byte[] bArr) {
        checkStreamIsNotClosed();
        write(bArr, 0, bArr.length);
    }
}
