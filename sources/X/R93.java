package X;

public final class R93 extends C8804RAf {
    public final /* synthetic */ long A00;
    public final /* synthetic */ C12200Sop A01;

    public R93(C12200Sop sop, long j) {
        this.A01 = sop;
        this.A00 = j;
    }

    public final void run() {
        this.A01.A01.onFirstByteFlushed(this.A00);
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("LigerUploadHttpTransportCallback.firstByteFlushed: ");
        return AnonymousClass7TF.A0i(this.A01.A00.A09, A1A);
    }
}
