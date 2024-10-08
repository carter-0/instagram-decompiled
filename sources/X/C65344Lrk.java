package X;

/* renamed from: X.Lrk  reason: case insensitive filesystem */
public final class C65344Lrk implements C320986tO {
    public final /* synthetic */ AnonymousClass8ME A00;
    public final /* synthetic */ Runnable A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;

    public final /* synthetic */ void DH4(X9T x9t, String str, String str2) {
    }

    public final /* synthetic */ void DOb(C20997X8u x8u, String str, String str2, String str3) {
    }

    public final void DaG(String str, float f) {
    }

    public C65344Lrk(AnonymousClass8ME r1, Runnable runnable, String str, String str2) {
        this.A01 = runnable;
        this.A03 = str;
        this.A00 = r1;
        this.A02 = str2;
    }

    public final /* synthetic */ boolean EsB() {
        return false;
    }

    public final void onError(String str) {
        this.A01.run();
        0kD.A0E(AnonymousClass000.A00(2500), 002.A0R("failed to import gif ", this.A02), (Throwable) null);
        C59689JTv.A0A(this.A00.A0f, "failed_to_import_gif");
    }

    public final void DOa(C20997X8u x8u, String str, String str2) {
        AnonymousClass7TG.A1N(str, x8u);
        this.A01.run();
        String str3 = this.A03;
        C317966o8 A002 = C317966o8.A00(DbS.A0V(str), str3, str3, (float) x8u.getWidth(), (float) x8u.getHeight(), 0.6f);
        C317876nz r0 = C317876nz.A1e;
        C317876nz A05 = C317886o0.A05(A002, str3);
        AnonymousClass8ME r2 = this.A00;
        11Z.A02(new C66025M8k(C347017w8.A01(r2.A0f, r2.A0r, A05), A05, r2));
    }
}
