package X;

/* renamed from: X.IZj  reason: case insensitive filesystem */
public final class C57378IZj implements C273414mX {
    public final /* synthetic */ 1Xj A00;
    public final /* synthetic */ AnonymousClass338 A01;
    public final /* synthetic */ C55865Hom A02;
    public final /* synthetic */ AnonymousClass3W1 A03;

    public C57378IZj(1Xj r1, AnonymousClass338 r2, C55865Hom hom, AnonymousClass3W1 r4) {
        this.A01 = r2;
        this.A02 = hom;
        this.A00 = r1;
        this.A03 = r4;
    }

    public final void Cyc() {
        C55865Hom hom = this.A02;
        hom.A02 = false;
        hom.A01 = false;
    }

    public final void Cyf() {
        AnonymousClass338 r4 = this.A01;
        r4.A02 = false;
        r4.A01 = false;
        C55865Hom hom = this.A02;
        hom.A02 = true;
        C51967G9n.A0w(C51972G9s.A08(hom.A05.A01), hom.A04.A00.A0A);
        1Xj r0 = this.A00;
        AnonymousClass3W1 r2 = this.A03;
        AnonymousClass338.A00(r0, r4, r2, false);
        Integer num = AnonymousClass05K.A01;
        if (r2.A13 != num) {
            r2.A13 = num;
            AnonymousClass3W1.A00(r2, 50);
        }
    }
}
