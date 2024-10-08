package com.facebook.proxygen;

import X.AnonymousClass7TE;
import com.facebook.jni.Countable;
import java.io.IOException;

public class NativeReadBuffer extends Countable implements ReadBuffer {
    public boolean mClosed;
    public boolean mError;
    public boolean mInitialized;

    private native void nativeInit();

    private native int nativeRead(byte[] bArr, int i, int i2);

    private native int nativeSize();

    public void close() {
        try {
            dispose();
        } finally {
            this.mClosed = true;
        }
    }

    private void checkBufferInUsableState() {
        if (!this.mInitialized) {
            throw AnonymousClass7TE.A0z("Buffer not initialized");
        } else if (this.mClosed) {
            throw AnonymousClass7TE.A0z("Buffer already closed");
        } else if (this.mError) {
            throw AnonymousClass7TE.A0z("Trying to read after error");
        }
    }

    public void init() {
        if (!this.mInitialized) {
            nativeInit();
            this.mInitialized = true;
            return;
        }
        throw AnonymousClass7TE.A0z("Already initalized");
    }

    public int read(byte[] bArr, int i, int i2) {
        checkBufferInUsableState();
        if (i < 0 || i2 < 0) {
            throw AnonymousClass7TE.A0w("Negative length or offset is not allowed");
        } else if (bArr == null || bArr.length - i < i2) {
            throw AnonymousClass7TE.A0w("Array null, or not large enough");
        } else if (i2 == 0) {
            return 0;
        } else {
            try {
                return nativeRead(bArr, i, i2);
            } catch (IOException e) {
                this.mError = true;
                throw e;
            }
        }
    }

    public int size() {
        checkBufferInUsableState();
        return nativeSize();
    }
}
