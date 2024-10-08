package X;

import com.facebook.advancedcryptotransport.LigerStreamEventBaseThread;

/* renamed from: X.5oI  reason: invalid class name */
public final class AnonymousClass5oI extends Thread {
    public final /* synthetic */ long A00;
    public final /* synthetic */ LigerStreamEventBaseThread A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5oI(LigerStreamEventBaseThread ligerStreamEventBaseThread, long j) {
        super("MCCWLigerStreamEventBaseThread");
        this.A01 = ligerStreamEventBaseThread;
        this.A00 = j;
    }

    public final void run() {
        LigerStreamEventBaseThread.nativeLigerStreamEventBaseThreadRun(this.A00);
    }
}
