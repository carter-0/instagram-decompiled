package X;

/* renamed from: X.INu  reason: case insensitive filesystem */
public final class C57080INu implements 27S {
    public final /* synthetic */ C275794rx A00;

    public C57080INu(C275794rx r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ boolean A72(Object obj) {
        return this.A00.isShowing();
    }

    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int A03 = AnonymousClass0fD.A03(812920797);
        int A032 = AnonymousClass0fD.A03(2091659523);
        C275794rx r5 = this.A00;
        if (((C52451GTd) obj).A00) {
            C311686d5 r0 = r5.A03;
            if (r0 != null) {
                r0.DYA();
            }
            C60064Jem jem = r5.A0G;
            C71392co r02 = C315596kB.A02;
            C294975nL.A01(jem, 0).A0G();
            r5.A06 = false;
            jem.setVisibility(4);
        } else {
            if (r5.A0G.getVisibility() == 0) {
                r5.A03(false);
            } else {
                C57080INu.super.dismiss();
            }
            AnonymousClass1Nd.A00(r5.A0I.A09).A02(this, C52451GTd.class);
        }
        AnonymousClass0fD.A0A(346233040, A032);
        AnonymousClass0fD.A0A(1549645490, A03);
    }
}
