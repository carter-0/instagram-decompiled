package X;

public final class MM8 extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MM8(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    public static AnonymousClass0eM A00(Object obj, 0eO r2, int i) {
        return AnonymousClass0eN.A00(r2, new MM8(obj, i));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00c5, code lost:
        r2 = X.DbS.A0H(r0);
        X.C66184MGv.A02(r2, X.C318116oQ.A00(r2), 40);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00d4, code lost:
        return X.C60340gF.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0113, code lost:
        X.0qQ.A0F("viewMode");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x011c, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x015e, code lost:
        return X.C240903Nb.A00(r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x018e, code lost:
        return r1.findViewById(r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            r4 = this;
            int r0 = r4.A00
            switch(r0) {
                case 0: goto L_0x000f;
                case 1: goto L_0x0018;
                case 2: goto L_0x0021;
                case 3: goto L_0x000c;
                case 4: goto L_0x002a;
                case 5: goto L_0x0005;
                case 6: goto L_0x0031;
                case 7: goto L_0x003c;
                case 8: goto L_0x000c;
                case 9: goto L_0x002a;
                case 10: goto L_0x0005;
                case 11: goto L_0x000c;
                case 12: goto L_0x002a;
                case 13: goto L_0x0005;
                case 14: goto L_0x0046;
                case 15: goto L_0x0067;
                case 16: goto L_0x007a;
                case 17: goto L_0x000c;
                case 18: goto L_0x002a;
                case 19: goto L_0x0005;
                case 20: goto L_0x0081;
                case 21: goto L_0x00bf;
                case 22: goto L_0x000c;
                case 23: goto L_0x002a;
                case 24: goto L_0x0005;
                case 25: goto L_0x00d5;
                case 26: goto L_0x000c;
                case 27: goto L_0x002a;
                case 28: goto L_0x0005;
                case 29: goto L_0x011d;
                case 30: goto L_0x0125;
                case 31: goto L_0x012d;
                case 32: goto L_0x0135;
                case 33: goto L_0x013d;
                case 34: goto L_0x0145;
                case 35: goto L_0x0153;
                case 36: goto L_0x015f;
                case 37: goto L_0x016d;
                case 38: goto L_0x017b;
                case 39: goto L_0x0183;
                case 40: goto L_0x000c;
                case 41: goto L_0x002a;
                case 42: goto L_0x0005;
                case 43: goto L_0x000c;
                case 44: goto L_0x002a;
                case 45: goto L_0x0005;
                case 46: goto L_0x018f;
                case 47: goto L_0x000c;
                case 48: goto L_0x002a;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r4.A01
            X.07f r3 = X.DbY.A0I(r0)
            return r3
        L_0x000c:
            java.lang.Object r3 = r4.A01
            return r3
        L_0x000f:
            java.lang.Object r1 = r4.A01
            android.view.View r1 = (android.view.View) r1
            r0 = 2131438519(0x7f0b2bb7, float:1.8498967E38)
            goto L_0x018a
        L_0x0018:
            java.lang.Object r1 = r4.A01
            android.view.View r1 = (android.view.View) r1
            r0 = 2131443595(0x7f0b3f8b, float:1.8509263E38)
            goto L_0x018a
        L_0x0021:
            java.lang.Object r1 = r4.A01
            android.view.View r1 = (android.view.View) r1
            r0 = 2131443966(0x7f0b40fe, float:1.8510015E38)
            goto L_0x018a
        L_0x002a:
            java.lang.Object r0 = r4.A01
            java.lang.Object r3 = X.DbT.A0r(r0)
            return r3
        L_0x0031:
            java.lang.Object r0 = r4.A01
            X.LjG r0 = (X.C64854LjG) r0
            android.view.View r0 = r0.A05
            r1 = 2131434407(0x7f0b1ba7, float:1.8490627E38)
            goto L_0x015a
        L_0x003c:
            java.lang.Object r0 = r4.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.KC7 r3 = new X.KC7
            r3.<init>(r0)
            return r3
        L_0x0046:
            java.lang.Object r1 = r4.A01
            X.Kcj r1 = (X.C62249Kcj) r1
            X.0eM r0 = r1.A00
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r0)
            android.os.Bundle r1 = r1.requireArguments()
            java.lang.String r0 = "live_view_mode"
            java.io.Serializable r1 = r1.getSerializable(r0)
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.video.live.mvvm.model.enums.IgLiveViewMode"
            X.0qQ.A0C(r1, r0)
            X.6go r1 = (X.C313666go) r1
            X.KD2 r3 = new X.KD2
            r3.<init>(r2, r1)
            return r3
        L_0x0067:
            java.lang.Object r0 = r4.A01
            X.K8L r0 = (X.K8L) r0
            X.6go r1 = r0.A00
            if (r1 == 0) goto L_0x0113
            X.Kcj r3 = new X.Kcj
            r3.<init>()
            java.lang.String r0 = "live_view_mode"
            X.DbZ.A1B(r3, r0, r1)
            return r3
        L_0x007a:
            java.lang.Object r0 = r4.A01
            X.K8L r0 = (X.K8L) r0
            X.0eM r0 = r0.A03
            goto L_0x00c5
        L_0x0081:
            java.lang.Object r2 = r4.A01
            X.K8L r2 = (X.K8L) r2
            X.6go r0 = r2.A00
            if (r0 == 0) goto L_0x0113
            int r1 = r0.ordinal()
            r0 = 0
            if (r1 == r0) goto L_0x00b3
            r0 = 2
            if (r1 == r0) goto L_0x00a7
            r0 = 1
            if (r1 != r0) goto L_0x00a2
            X.0eM r0 = r2.A02
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.KD3 r3 = new X.KD3
            r3.<init>(r2, r0)
            return r3
        L_0x00a2:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x00a7:
            X.0eM r0 = r2.A02
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.KC8 r3 = new X.KC8
            r3.<init>(r0)
            return r3
        L_0x00b3:
            X.0eM r0 = r2.A02
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.KC9 r3 = new X.KC9
            r3.<init>(r0)
            return r3
        L_0x00bf:
            java.lang.Object r0 = r4.A01
            X.K8K r0 = (X.K8K) r0
            X.0eM r0 = r0.A02
        L_0x00c5:
            X.2YL r2 = X.DbS.A0H(r0)
            X.6oS r1 = X.C318116oQ.A00(r2)
            r0 = 40
            X.C66184MGv.A02(r2, r1, r0)
            X.0gF r3 = X.C60340gF.A00
            return r3
        L_0x00d5:
            java.lang.Object r2 = r4.A01
            X.K8K r2 = (X.K8K) r2
            X.6go r0 = r2.A00
            if (r0 == 0) goto L_0x0113
            int r1 = r0.ordinal()
            r0 = 0
            if (r1 == r0) goto L_0x0107
            r0 = 2
            if (r1 == r0) goto L_0x00fb
            r0 = 1
            if (r1 != r0) goto L_0x00f6
            X.0eM r0 = r2.A01
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.KD3 r3 = new X.KD3
            r3.<init>(r2, r0)
            return r3
        L_0x00f6:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x00fb:
            X.0eM r0 = r2.A01
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.KC8 r3 = new X.KC8
            r3.<init>(r0)
            return r3
        L_0x0107:
            X.0eM r0 = r2.A01
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.KC9 r3 = new X.KC9
            r3.<init>(r0)
            return r3
        L_0x0113:
            java.lang.String r0 = "viewMode"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x011d:
            java.lang.Object r0 = r4.A01
            android.view.View r0 = (android.view.View) r0
            r1 = 2131434324(0x7f0b1b54, float:1.8490459E38)
            goto L_0x015a
        L_0x0125:
            java.lang.Object r1 = r4.A01
            android.view.View r1 = (android.view.View) r1
            r0 = 2131434317(0x7f0b1b4d, float:1.8490445E38)
            goto L_0x018a
        L_0x012d:
            java.lang.Object r1 = r4.A01
            android.view.View r1 = (android.view.View) r1
            r0 = 2131434323(0x7f0b1b53, float:1.8490457E38)
            goto L_0x018a
        L_0x0135:
            java.lang.Object r1 = r4.A01
            android.view.View r1 = (android.view.View) r1
            r0 = 2131434354(0x7f0b1b72, float:1.849052E38)
            goto L_0x018a
        L_0x013d:
            java.lang.Object r1 = r4.A01
            android.view.View r1 = (android.view.View) r1
            r0 = 2131434396(0x7f0b1b9c, float:1.8490605E38)
            goto L_0x018a
        L_0x0145:
            java.lang.Object r0 = r4.A01
            X.IOt r0 = (X.C57105IOt) r0
            X.0eM r0 = r0.A07
            android.view.View r1 = X.JTR.A0W(r0)
            r0 = 2131440042(0x7f0b31aa, float:1.8502056E38)
            goto L_0x018a
        L_0x0153:
            java.lang.Object r0 = r4.A01
            android.view.View r0 = (android.view.View) r0
            r1 = 2131434326(0x7f0b1b56, float:1.8490463E38)
        L_0x015a:
            X.3Nc r3 = X.C240903Nb.A00(r0, r1)
            return r3
        L_0x015f:
            java.lang.Object r0 = r4.A01
            X.IOt r0 = (X.C57105IOt) r0
            X.0eM r0 = r0.A07
            android.view.View r1 = X.JTR.A0W(r0)
            r0 = 2131432903(0x7f0b15c7, float:1.8487577E38)
            goto L_0x018a
        L_0x016d:
            java.lang.Object r0 = r4.A01
            X.IOt r0 = (X.C57105IOt) r0
            X.0eM r0 = r0.A07
            android.view.View r1 = X.JTR.A0W(r0)
            r0 = 2131439970(0x7f0b3162, float:1.850191E38)
            goto L_0x018a
        L_0x017b:
            java.lang.Object r1 = r4.A01
            android.view.View r1 = (android.view.View) r1
            r0 = 2131434455(0x7f0b1bd7, float:1.8490724E38)
            goto L_0x018a
        L_0x0183:
            java.lang.Object r1 = r4.A01
            android.view.View r1 = (android.view.View) r1
            r0 = 2131434325(0x7f0b1b55, float:1.849046E38)
        L_0x018a:
            android.view.View r3 = r1.findViewById(r0)
            return r3
        L_0x018f:
            java.lang.Object r0 = r4.A01
            X.K3z r0 = (X.C61357K3z) r0
            X.0eM r0 = r0.A00
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r0)
            r0 = 1
            X.KD9 r3 = new X.KD9
            r3.<init>(r1, r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MM8.invoke():java.lang.Object");
    }
}
