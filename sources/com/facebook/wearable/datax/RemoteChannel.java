package com.facebook.wearable.datax;

import X.0qQ;
import X.C16476UvW;
import X.C16803V6k;
import X.C17131VJg;
import X.C18435Vre;
import X.C20570Wun;
import X.C20596WvZ;
import X.W0C;
import java.nio.ByteBuffer;

public final class RemoteChannel extends C17131VJg {
    public static final C16803V6k Companion = new Object();

    /* renamed from: native  reason: not valid java name */
    public final C20570Wun f3native;

    private final native long allocateNative(long j);

    public static final native void deallocateNative(long j);

    private final native int idNative(long j);

    private final native int sendErrorNative(long j, int i);

    private final native int sendNative(long j, int i, ByteBuffer byteBuffer, int i2, int i3);

    public final void send(C18435Vre vre) {
        0qQ.A0B(vre, 0);
        ByteBuffer byteBuffer = vre.A00;
        if (byteBuffer != null) {
            W0C w0c = new W0C(sendNative(this.f3native.A00(), vre.A01, byteBuffer, byteBuffer.position(), byteBuffer.remaining()));
            if (w0c.equals(W0C.A08)) {
                byteBuffer.position(byteBuffer.limit());
                return;
            }
            throw new C16476UvW(w0c);
        }
        throw new IllegalStateException("invalid buffer");
    }

    public final int getId() {
        return idNative(this.f3native.A00());
    }

    public RemoteChannel(long j) {
        this.f3native = new C20570Wun(this, new C20596WvZ(Companion, 3), allocateNative(j));
    }

    public final void send(W0C w0c) {
        0qQ.A0B(w0c, 0);
        W0C w0c2 = new W0C(sendErrorNative(this.f3native.A00(), w0c.A00));
        if (!w0c2.equals(W0C.A08)) {
            throw new C16476UvW(w0c2);
        }
    }
}
