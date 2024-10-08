package X;

public final class EQW extends H4J {
    public final /* synthetic */ C49681F1p A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EQW(0hq r1, C49681F1p f1p, String str, String str2, String str3) {
        super(r1);
        this.A00 = f1p;
        this.A01 = str;
        this.A02 = str2;
        this.A03 = str3;
    }

    public final void onFail(C268654dm r7) {
        int A032 = AnonymousClass0fD.A03(-1494344044);
        11Z.A03(new C51288Frh(this));
        this.A00.A00.A04.A02(this.A01, this.A02, this.A03, false);
        AnonymousClass0fD.A0A(-1229608265, A032);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        boolean equals;
        1Av A002;
        0s0 r2;
        AnonymousClass0YZ[] r1;
        int i;
        int A032 = AnonymousClass0fD.A03(-1646768855);
        int A033 = AnonymousClass0fD.A03(-805514613);
        String str = this.A01;
        if (str.equals(AnonymousClass000.A00(1281))) {
            equals = this.A02.equals("off");
            A002 = 1Au.A00(this.A00.A00.A02);
            r2 = A002.A0z;
            r1 = 1Av.A8a;
            i = 336;
        } else if (str.equals(AnonymousClass000.A00(1672))) {
            equals = this.A02.equals("off");
            A002 = 1Au.A00(this.A00.A00.A02);
            r2 = A002.A10;
            r1 = 1Av.A8a;
            i = 337;
        } else {
            if (str.equals("direct_media_creator_share_activity")) {
                1Av A003 = 1Au.A00(this.A00.A00.A02);
                String str2 = this.A02;
                0qQ.A0B(str2, 0);
                0xY A0p = AnonymousClass7TE.A0p(A003);
                A0p.E5g(C66579MXk.A00(297), str2);
                A0p.apply();
            }
            11Z.A03(new C51287Frg(this));
            this.A00.A00.A04.A02(str, this.A02, this.A03, true);
            AnonymousClass0fD.A0A(1399265177, A033);
            AnonymousClass0fD.A0A(145710442, A032);
        }
        AnonymousClass7TF.A1J(A002, r2, r1, i, equals);
        11Z.A03(new C51287Frg(this));
        this.A00.A00.A04.A02(str, this.A02, this.A03, true);
        AnonymousClass0fD.A0A(1399265177, A033);
        AnonymousClass0fD.A0A(145710442, A032);
    }
}
