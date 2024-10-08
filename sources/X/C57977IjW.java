package X;

/* renamed from: X.IjW  reason: case insensitive filesystem */
public final /* synthetic */ class C57977IjW implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ I0B A01;
    public final /* synthetic */ C66125MCx A02;
    public final /* synthetic */ C66125MCx A03;
    public final /* synthetic */ C66125MCx A04;
    public final /* synthetic */ C53059Ghr A05;

    public /* synthetic */ C57977IjW(I0B i0b, C66125MCx mCx, C66125MCx mCx2, C66125MCx mCx3, C53059Ghr ghr, int i) {
        this.A02 = mCx;
        this.A03 = mCx2;
        this.A01 = i0b;
        this.A00 = i;
        this.A04 = mCx3;
        this.A05 = ghr;
    }

    public final void run() {
        C66125MCx mCx = this.A02;
        C66125MCx mCx2 = this.A03;
        I0B i0b = this.A01;
        int i = this.A00;
        C66125MCx mCx3 = this.A04;
        C53059Ghr ghr = this.A05;
        0qQ.A0B(ghr, 5);
        MCy mCy = mCx.A02;
        MCy mCy2 = mCx2.A02;
        C252303ot r0 = i0b.A07.A00;
        0qQ.A07(r0);
        i0b.A04.execute(new C57981Ija(i0b, C21991XpE.A01(mCy, mCy2, r0), mCx3, mCx2, mCx, ghr, i));
    }
}
