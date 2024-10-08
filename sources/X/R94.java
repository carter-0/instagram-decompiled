package X;

public final class R94 extends C8804RAf {
    public final /* synthetic */ long A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ C12200Sop A02;

    public R94(C12200Sop sop, long j, long j2) {
        this.A02 = sop;
        this.A00 = j;
        this.A01 = j2;
    }

    public final void run() {
        this.A02.A01.onHeaderBytesReceived(this.A00, this.A01);
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("LigerUploadHttpTransportCallback.onHeaderBytesReceived: ");
        return AnonymousClass7TF.A0i(this.A02.A00.A09, A1A);
    }
}
