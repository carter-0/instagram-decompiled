package com.facebook.wearable.datax;

import X.0qQ;
import X.0sL;
import X.0sP;
import X.C16801V6i;
import X.C16804V6l;
import X.C17131VJg;
import X.C18435Vre;
import X.C20570Wun;
import X.C74179PqL;
import java.nio.ByteBuffer;

public class Service extends C17131VJg {
    public static final C16804V6l Companion = new Object();
    public static final String TAG = "DataXService";
    public final int id;

    /* renamed from: native  reason: not valid java name */
    public final C20570Wun f4native;
    public 0sP onConnected;
    public 0sP onDisconnected;
    public 0sL onReceived;

    private final native long allocateNative(int i);

    public static final native void deallocateNative(long j);

    public static /* synthetic */ void getNative$annotations() {
    }

    private final native long handleNative(long j);

    private final native void unregisterNative(long j);

    public void onConnected(RemoteChannel remoteChannel) {
    }

    public void onDisconnected(RemoteChannel remoteChannel) {
    }

    public void onReceived(RemoteChannel remoteChannel, C18435Vre vre) {
    }

    public void onUnregister() {
    }

    private final void handleConnected(RemoteChannel remoteChannel) {
        0sP r0 = this.onConnected;
        if (r0 != null) {
            r0.invoke(remoteChannel);
        }
    }

    private final void handleDisconnected(RemoteChannel remoteChannel) {
        0sP r0 = this.onDisconnected;
        if (r0 != null) {
            r0.invoke(remoteChannel);
        }
        C16801V6i.A00();
    }

    public final long getHandle$fbandroid_java_com_facebook_wearable_datax_datax() {
        return handleNative(this.f4native.A00());
    }

    public final int getId() {
        return this.id;
    }

    public final 0sP getOnConnected() {
        return this.onConnected;
    }

    public final 0sP getOnDisconnected() {
        return this.onDisconnected;
    }

    public final 0sL getOnReceived() {
        return this.onReceived;
    }

    public final void setOnConnected(0sP r1) {
        this.onConnected = r1;
    }

    public final void setOnDisconnected(0sP r1) {
        this.onDisconnected = r1;
    }

    public final void setOnReceived(0sL r1) {
        this.onReceived = r1;
    }

    public final void unregister() {
        unregisterNative(this.f4native.A00());
        C16801V6i.A00();
    }

    public Service(int i) {
        this.id = i;
        this.f4native = new C20570Wun(this, new C74179PqL(this, 27), allocateNative(i));
    }

    private final void handleReceived(RemoteChannel remoteChannel, int i, ByteBuffer byteBuffer) {
        ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        0qQ.A07(asReadOnlyBuffer);
        C18435Vre vre = new C18435Vre(i, asReadOnlyBuffer);
        try {
            ByteBuffer byteBuffer2 = vre.A00;
            if (byteBuffer2 != null) {
                byteBuffer2.rewind();
            }
            0sL r0 = this.onReceived;
            if (r0 != null) {
                r0.invoke(remoteChannel, vre);
            }
        } finally {
            vre.A00 = null;
        }
    }
}
