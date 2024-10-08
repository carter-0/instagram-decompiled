package com.facebook.wearable.datax;

import X.0qQ;
import X.0sP;
import X.C16476UvW;
import X.C16801V6i;
import X.C16802V6j;
import X.C17131VJg;
import X.C18435Vre;
import X.C20570Wun;
import X.C20596WvZ;
import X.C62320sa;
import X.W0C;
import java.io.Closeable;
import java.nio.ByteBuffer;

public final class LocalChannel extends C17131VJg implements Closeable {
    public static final C16802V6j Companion = new Object();

    /* renamed from: native  reason: not valid java name */
    public final C20570Wun f2native;
    public C62320sa onClosed;
    public 0sP onError;
    public 0sP onReceived;
    public final int service;

    public LocalChannel(Connection connection, int i) {
        0qQ.A0B(connection, 1);
        this.service = i;
        this.f2native = new C20570Wun(this, new C20596WvZ(Companion, 2), allocateNative(connection.getHandle$fbandroid_java_com_facebook_wearable_datax_datax(), i));
    }

    private final native long allocateNative(long j, int i);

    private final native void closeNative(long j);

    private final native boolean closedNative(long j);

    public static final native void deallocateNative(long j);

    private final native int idNative(long j);

    private final native int sendNative(long j, int i, ByteBuffer byteBuffer, int i2, int i3);

    public final void send(C18435Vre vre) {
        0qQ.A0B(vre, 0);
        ByteBuffer byteBuffer = vre.A00;
        if (byteBuffer != null) {
            W0C w0c = new W0C(sendNative(this.f2native.A00(), vre.A01, byteBuffer, byteBuffer.position(), byteBuffer.remaining()));
            if (w0c.equals(W0C.A08)) {
                byteBuffer.position(byteBuffer.limit());
                return;
            }
            throw new C16476UvW(w0c);
        }
        throw new IllegalStateException("invalid buffer");
    }

    private final void handleClosed() {
        C62320sa r0 = this.onClosed;
        if (r0 != null) {
            r0.invoke();
        }
        C16801V6i.A00();
    }

    private final void handleError(int i) {
        0sP r2 = this.onError;
        if (r2 != null) {
            r2.invoke(new C16476UvW(new W0C(i)));
        }
    }

    private final void handleReceived(int i, ByteBuffer byteBuffer) {
        0sP r1 = this.onReceived;
        if (r1 != null) {
            ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
            0qQ.A07(asReadOnlyBuffer);
            C18435Vre vre = new C18435Vre(i, asReadOnlyBuffer);
            try {
                r1.invoke(vre);
            } finally {
                vre.A00 = null;
            }
        }
    }

    public void close() {
        closeNative(this.f2native.A00());
    }

    public final boolean getClosed() {
        if (this.f2native.A01.get() == 0 || closedNative(this.f2native.A00())) {
            return true;
        }
        return false;
    }

    public final int getId() {
        return idNative(this.f2native.A00());
    }

    public final C62320sa getOnClosed() {
        return this.onClosed;
    }

    public final 0sP getOnError() {
        return this.onError;
    }

    public final 0sP getOnReceived() {
        return this.onReceived;
    }

    public final int getService() {
        return this.service;
    }

    public final void setOnClosed(C62320sa r1) {
        this.onClosed = r1;
    }

    public final void setOnError(0sP r1) {
        this.onError = r1;
    }

    public final void setOnReceived(0sP r1) {
        this.onReceived = r1;
    }
}
