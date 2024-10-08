package com.facebook.wearable.datax;

import X.0qQ;
import X.0sK;
import X.0sL;
import X.0sP;
import X.C16476UvW;
import X.C16798V6f;
import X.C16801V6i;
import X.C17131VJg;
import X.C17764Vfa;
import X.C20570Wun;
import X.C20596WvZ;
import X.DbY;
import X.W0C;
import com.facebook.wearable.datax.util.MessageInfo;
import java.io.Closeable;
import java.nio.ByteBuffer;
import kotlin.Deprecated;
import kotlin.ReplaceWith;

public final class Connection extends C17131VJg implements Closeable {
    public static final C16798V6f Companion = new Object();

    /* renamed from: native  reason: not valid java name */
    public final C20570Wun f1native;
    public 0sP onRead;
    public 0sK onWriteError;
    public final C17764Vfa receiveFragment;
    public final 0sL writer;

    private final native long allocateNative(long j);

    private final native void closeNative(long j);

    private final native boolean closedNative(long j);

    public static final native void deallocateNative(long j);

    private final native MessageInfo getMessageInfoNative(long j, ByteBuffer byteBuffer, int i, int i2, boolean z);

    private final native long handleNative(long j);

    private final native int interruptCodeNative(long j);

    private final native void interruptNative(long j, int i);

    private final native int mtuNative(long j);

    private final native boolean onReceivedNative(long j, ByteBuffer byteBuffer, int i, int i2);

    /* access modifiers changed from: private */
    public final native int pollReceiveFragmentNative(long j, ByteBuffer byteBuffer, int i);

    private final native void registerServiceNative(long j, long j2);

    private final native void resetNative(long j);

    private final native int versionNative(long j);

    public final MessageInfo getMessageInfo(ByteBuffer byteBuffer, boolean z) {
        0qQ.A0B(byteBuffer, 0);
        return getMessageInfoNative(this.f1native.A00(), byteBuffer, byteBuffer.remaining(), byteBuffer.position(), z);
    }

    public final void interruptWithError(W0C w0c) {
        0qQ.A0B(w0c, 0);
        interruptNative(this.f1native.A00(), w0c.A00);
    }

    @Deprecated(message = "Received data can be interrupted with error", replaceWith = @ReplaceWith(expression = "onReceivedWithInterrupt(bytes: ByteBuffer): Error", imports = {}))
    public final void onReceived(ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2 = byteBuffer;
        0qQ.A0B(byteBuffer, 0);
        if (!byteBuffer.isDirect()) {
            throw new IllegalStateException("Bytes buffer must be direct");
        } else if (onReceivedNative(this.f1native.A00(), byteBuffer2, byteBuffer.position(), byteBuffer.remaining())) {
            byteBuffer.position(byteBuffer.limit());
        } else {
            throw new C16476UvW(W0C.A07);
        }
    }

    public final W0C onReceivedWithInterrupt(ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2 = byteBuffer;
        0qQ.A0B(byteBuffer, 0);
        if (byteBuffer.isDirect()) {
            int position = byteBuffer.position();
            int remaining = byteBuffer.remaining();
            byteBuffer.position(byteBuffer.limit());
            if (onReceivedNative(this.f1native.A00(), byteBuffer2, position, remaining)) {
                int interruptCodeNative = interruptCodeNative(this.f1native.A00());
                if (interruptCodeNative != 0) {
                    return new W0C(interruptCodeNative);
                }
                return W0C.A08;
            }
            throw new C16476UvW(W0C.A07);
        }
        throw new IllegalStateException("Bytes buffer must be direct");
    }

    public final void register(Service service) {
        0qQ.A0B(service, 0);
        registerServiceNative(this.f1native.A00(), service.getHandle$fbandroid_java_com_facebook_wearable_datax_datax());
    }

    private final void handleRead(MessageInfo messageInfo) {
        0sP r0 = this.onRead;
        if (r0 != null) {
            r0.invoke(messageInfo);
        }
    }

    private final int handleWrite(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        0sL r0 = this.writer;
        if (r0 != null) {
            return ((W0C) r0.invoke(byteBuffer, byteBuffer2)).A00;
        }
        throw new IllegalStateException("invalid connection configuration");
    }

    private final int handleWriteError(int i, ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        W0C w0c;
        0sK r1 = this.onWriteError;
        if (r1 == null || (w0c = (W0C) r1.invoke(new W0C(i), byteBuffer, byteBuffer2)) == null) {
            return i;
        }
        return w0c.A00;
    }

    public void close() {
        closeNative(this.f1native.A00());
        C16801V6i.A00();
    }

    public final boolean getClosed() {
        if (this.f1native.A01.get() == 0 || closedNative(this.f1native.A00())) {
            return true;
        }
        return false;
    }

    public final long getHandle$fbandroid_java_com_facebook_wearable_datax_datax() {
        return handleNative(this.f1native.A00());
    }

    public final int getMtu() {
        return mtuNative(this.f1native.A00());
    }

    public final 0sP getOnRead() {
        return this.onRead;
    }

    public final 0sK getOnWriteError() {
        return this.onWriteError;
    }

    public final C17764Vfa getReceiveFragment() {
        return this.receiveFragment;
    }

    public final int getVersion() {
        return versionNative(this.f1native.A00());
    }

    public final LocalChannel openChannel(int i) {
        return new LocalChannel(this, i);
    }

    public final void reset() {
        resetNative(this.f1native.A00());
    }

    public final void setOnRead(0sP r1) {
        this.onRead = r1;
    }

    public final void setOnWriteError(0sK r1) {
        this.onWriteError = r1;
    }

    public Connection(long j) {
        this(Long.valueOf(j), (0sL) null);
    }

    public Connection(Long l, 0sL r7) {
        this.writer = r7;
        this.f1native = new C20570Wun(this, new C20596WvZ(Companion, 1), allocateNative(DbY.A04(l)));
        this.receiveFragment = new C17764Vfa(this);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public Connection(0sL r2) {
        this((Long) null, r2);
        0qQ.A0B(r2, 1);
    }
}
