package X;

public final class AUQ implements B16 {
    public final /* synthetic */ C341737nR A00;
    public final /* synthetic */ C341627nG A01;

    public AUQ(C341737nR r1, C341627nG r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void onFinished() {
        this.A00.onError(new C391719tX(20004, 002.A0g("prepareRecordingVideo can't be called in ", C378729Qz.A00(this.A01.A04), " state")));
    }
}
