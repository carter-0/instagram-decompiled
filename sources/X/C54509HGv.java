package X;

/* renamed from: X.HGv  reason: case insensitive filesystem */
public final class C54509HGv extends C57460Ib4 {
    public final /* synthetic */ C55870Hor A00;
    public final /* synthetic */ C62320sa A01;
    public final /* synthetic */ C62320sa A02;

    public C54509HGv(C55870Hor hor, C62320sa r2, C62320sa r3) {
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = hor;
    }

    public final void Dxx(C263754Nf r2) {
        this.A01.invoke();
    }

    public final void onProgressUpdate(int i, int i2, boolean z) {
        C51967G9n.A14(this.A00.A01, ((float) i) / ((float) i2));
    }

    public final void onVideoStartedPlaying(C263754Nf r2) {
        this.A02.invoke();
    }
}
