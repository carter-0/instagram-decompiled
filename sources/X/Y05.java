package X;

public final class Y05 implements C61110lV {
    public final /* synthetic */ C21301XTy A00;
    public final /* synthetic */ XU1 A01;
    public final /* synthetic */ boolean A02;
    public final /* synthetic */ boolean A03;

    public Y05(C21301XTy xTy, XU1 xu1, boolean z, boolean z2) {
        this.A03 = z;
        this.A01 = xu1;
        this.A02 = z2;
        this.A00 = xTy;
    }

    public final void onAppBackgrounded() {
        int A032 = AnonymousClass0fD.A03(-1827709525);
        if (this.A03) {
            this.A01.A00(2, (Object) null);
        }
        if (this.A02) {
            this.A01.A00(6, (Object) null);
        }
        AnonymousClass0fD.A0A(-1034895611, A032);
    }

    public final void onAppForegrounded() {
        int A032 = AnonymousClass0fD.A03(1837140771);
        if (this.A03) {
            this.A01.A00(1, (Object) null);
        }
        if (this.A02) {
            this.A01.A00(5, this.A00);
        }
        AnonymousClass0fD.A0A(209747707, A032);
    }
}
