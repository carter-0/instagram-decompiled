package X;

public final class E87 extends C361178fn {
    public final /* synthetic */ C229382nI A00;
    public final /* synthetic */ C307896Rx A01;
    public final /* synthetic */ C277014uI A02;
    public final /* synthetic */ C277014uI A03;
    public final /* synthetic */ String A04;

    public final void A04(C268654dm r3) {
        0qQ.A0B(r3, 0);
        DbS.A1Q(this.A01, this.A02);
        C48723Ej8.A00(r3, "AsyncLoad", this.A04);
    }

    public E87(C229382nI r1, C307896Rx r2, C277014uI r3, C277014uI r4, String str) {
        this.A03 = r3;
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = r4;
        this.A04 = str;
    }

    public final /* bridge */ /* synthetic */ void A05(Object obj) {
        C3034368u r8 = (C3034368u) obj;
        0qQ.A0B(r8, 0);
        C46620Di0 di0 = new C46620Di0((C361078fd) null, r8.A01, this.A03, r8.A03);
        C307896Rx r4 = this.A01;
        C307786Rm r2 = r4.A03;
        C308276Tl A0P = DbS.A0P();
        A0P.A03(r8.A02, 0);
        AnonymousClass6Tm A002 = A0P.A00();
        if (r2 != null) {
            C299275ur.A00(C307886Rw.A00(di0, r2, 0Yt.A0E()), A002, di0.A02);
            return;
        }
        0wb.A03("bloks_async_load", "Async Load run with null context, this is legacy behavior");
        C307886Rw.A02(Dba.A08(r4), di0, this.A00, A002, 0Yt.A0E());
    }
}
