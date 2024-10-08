package X;

import com.facebook.mqtttransport.LigerStreamEventBaseThread;

/* renamed from: X.45r  reason: invalid class name and case insensitive filesystem */
public final class C2604445r extends Thread {
    public final /* synthetic */ long A00;
    public final /* synthetic */ LigerStreamEventBaseThread A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C2604445r(LigerStreamEventBaseThread ligerStreamEventBaseThread, long j) {
        super("XplatMqttLigerEventBased");
        this.A01 = ligerStreamEventBaseThread;
        this.A00 = j;
    }

    public final void run() {
        LigerStreamEventBaseThread.nativeLigerStreamEventBaseThreadRun(this.A00);
    }
}
