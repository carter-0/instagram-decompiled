package X;

/* renamed from: X.Lba  reason: case insensitive filesystem */
public final class C64419Lba implements C346267ut {
    public final /* synthetic */ C364988mL A00;
    public final /* synthetic */ LAM A01;
    public final /* synthetic */ C63927LDk A02;
    public final /* synthetic */ C64149LQm A03;
    public final /* synthetic */ C365358my A04;

    public C64419Lba(C364988mL r1, LAM lam, C63927LDk lDk, C64149LQm lQm, C365358my r5) {
        this.A00 = r1;
        this.A02 = lDk;
        this.A04 = r5;
        this.A03 = lQm;
        this.A01 = lam;
    }

    public final void DGm() {
        try {
            C364988mL r1 = this.A00;
            C365358my r5 = this.A04;
            r1.A0C(new C66061M9u(r1, this.A01, this.A02, this.A03, r5));
        } catch (RuntimeException e) {
            this.A02.A00(e);
        }
    }
}
