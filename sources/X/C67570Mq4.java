package X;

/* renamed from: X.Mq4  reason: case insensitive filesystem */
public final class C67570Mq4 extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C67570Mq4(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    public static AnonymousClass0eM A00(Object obj, 0eO r2, int i) {
        return AnonymousClass0eN.A00(r2, new C67570Mq4(obj, i));
    }

    /* JADX WARNING: type inference failed for: r0v98, types: [java.lang.Object, X.Kto] */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0039, code lost:
        if (X.C2604245p.A04(r1) != false) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x009e, code lost:
        r4.A03.flowEndCancel(r2, r0.A00);
        r4.A00 = null;
        r4.A02 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00ae, code lost:
        r2 = X.0wj.A01.AEf("media_gallery_logging_step_with_no_flow_id", 817899801);
        r2.ABQ("logging_step", r3.A00);
        r2.report();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00f5, code lost:
        return X.C60340gF.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01ad, code lost:
        X.0qQ.A0F("initialOption");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01b6, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            r5 = this;
            int r0 = r5.A00
            switch(r0) {
                case 0: goto L_0x0018;
                case 1: goto L_0x0028;
                case 2: goto L_0x0040;
                case 3: goto L_0x0055;
                case 4: goto L_0x0065;
                case 5: goto L_0x0065;
                case 6: goto L_0x006c;
                case 7: goto L_0x0076;
                case 8: goto L_0x008c;
                case 9: goto L_0x00c4;
                case 10: goto L_0x00d6;
                case 11: goto L_0x00e0;
                case 12: goto L_0x00e0;
                case 13: goto L_0x00e0;
                case 14: goto L_0x00ea;
                case 15: goto L_0x00f6;
                case 16: goto L_0x0104;
                case 17: goto L_0x0112;
                case 18: goto L_0x0120;
                case 19: goto L_0x012e;
                case 20: goto L_0x013c;
                case 21: goto L_0x014a;
                case 22: goto L_0x0158;
                case 23: goto L_0x000e;
                case 24: goto L_0x0011;
                case 25: goto L_0x0165;
                case 26: goto L_0x000e;
                case 27: goto L_0x0174;
                case 28: goto L_0x017b;
                case 29: goto L_0x0182;
                case 30: goto L_0x0190;
                case 31: goto L_0x000e;
                case 32: goto L_0x0174;
                case 33: goto L_0x017b;
                case 34: goto L_0x019f;
                case 35: goto L_0x01b7;
                case 36: goto L_0x000e;
                case 37: goto L_0x0174;
                case 38: goto L_0x017b;
                case 39: goto L_0x01cf;
                case 40: goto L_0x01df;
                case 41: goto L_0x01ee;
                case 42: goto L_0x0201;
                case 43: goto L_0x0005;
                case 44: goto L_0x0210;
                case 45: goto L_0x000e;
                case 46: goto L_0x0005;
                case 47: goto L_0x000e;
                case 48: goto L_0x0005;
                case 49: goto L_0x021b;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r5.A01
            X.07g r0 = (X.AnonymousClass07g) r0
            X.07f r4 = r0.getViewModelStore()
            return r4
        L_0x000e:
            java.lang.Object r4 = r5.A01
            return r4
        L_0x0011:
            java.lang.Object r0 = r5.A01
            X.Mts r0 = (X.C67739Mts) r0
            java.util.List r4 = r0.A02
            return r4
        L_0x0018:
            java.lang.Object r0 = r5.A01
            X.NIv r0 = (X.C68457NIv) r0
            X.0eM r0 = r0.A06
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.NMc r4 = new X.NMc
            r4.<init>(r0)
            return r4
        L_0x0028:
            java.lang.Object r2 = r5.A01
            X.LSl r2 = (X.C64180LSl) r2
            android.content.Context r1 = r2.A01
            boolean r0 = X.C2604245p.A03(r1)
            if (r0 == 0) goto L_0x003b
            boolean r1 = X.C2604245p.A04(r1)
            r0 = 1
            if (r1 == 0) goto L_0x003c
        L_0x003b:
            r0 = 0
        L_0x003c:
            r2.A00 = r0
            goto L_0x00f3
        L_0x0040:
            java.lang.Object r0 = r5.A01
            X.K6K r0 = (X.K6K) r0
            X.0eM r0 = r0.A0l
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r0)
            X.Kto r0 = new X.Kto
            r0.<init>()
            X.KCm r4 = new X.KCm
            r4.<init>(r1, r0)
            return r4
        L_0x0055:
            java.lang.Object r0 = r5.A01
            X.K6K r0 = (X.K6K) r0
            X.0eM r0 = r0.A0l
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.KBt r4 = new X.KBt
            r4.<init>(r0)
            return r4
        L_0x0065:
            java.lang.Object r0 = r5.A01
            X.07f r4 = X.C51971G9r.A0U(r0)
            return r4
        L_0x006c:
            java.lang.Object r0 = r5.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.OYk r4 = new X.OYk
            r4.<init>(r0)
            return r4
        L_0x0076:
            java.lang.Object r4 = r5.A01
            X.OYk r4 = (X.C71012OYk) r4
            boolean r0 = r4.A01
            if (r0 != 0) goto L_0x00f3
            java.lang.Long r0 = r4.A00
            if (r0 == 0) goto L_0x0089
            long r2 = r0.longValue()
            X.NVS r0 = X.NVS.A00
            goto L_0x009e
        L_0x0089:
            X.NVS r3 = X.NVS.A00
            goto L_0x00ae
        L_0x008c:
            java.lang.Object r4 = r5.A01
            X.OYk r4 = (X.C71012OYk) r4
            boolean r0 = r4.A02
            if (r0 != 0) goto L_0x00f3
            java.lang.Long r0 = r4.A00
            if (r0 == 0) goto L_0x00ac
            long r2 = r0.longValue()
            X.NVT r0 = X.NVT.A00
        L_0x009e:
            com.facebook.quicklog.reliability.UserFlowLogger r1 = r4.A03
            java.lang.String r0 = r0.A00
            r1.flowEndCancel(r2, r0)
            r0 = 0
            r4.A00 = r0
            r0 = 0
            r4.A02 = r0
            goto L_0x00f3
        L_0x00ac:
            X.NVT r3 = X.NVT.A00
        L_0x00ae:
            X.0wj r2 = X.0wj.A01
            r1 = 817899801(0x30c02919, float:1.3981519E-9)
            java.lang.String r0 = "media_gallery_logging_step_with_no_flow_id"
            X.0f9 r2 = r2.AEf(r0, r1)
            java.lang.String r1 = r3.A00
            java.lang.String r0 = "logging_step"
            r2.ABQ(r0, r1)
            r2.report()
            goto L_0x00f3
        L_0x00c4:
            java.lang.Object r0 = r5.A01
            X.OIL r0 = (X.OIL) r0
            X.3oV r0 = r0.A06
            android.view.View r1 = r0.getView()
            r0 = 2131433597(0x7f0b187d, float:1.8488984E38)
            X.3oV r4 = X.DbU.A0Z(r1, r0)
            return r4
        L_0x00d6:
            java.lang.Object r0 = r5.A01
            X.OVY r0 = (X.OVY) r0
            X.7HJ r0 = r0.A08
            r0.DAC()
            goto L_0x00f3
        L_0x00e0:
            java.lang.Object r0 = r5.A01
            X.OVY r0 = (X.OVY) r0
            X.7HJ r0 = r0.A08
            r0.D89()
            goto L_0x00f3
        L_0x00ea:
            java.lang.Object r0 = r5.A01
            X.OVY r0 = (X.OVY) r0
            X.7HJ r0 = r0.A08
            r0.De3()
        L_0x00f3:
            X.0gF r4 = X.C60340gF.A00
            return r4
        L_0x00f6:
            java.lang.Object r0 = r5.A01
            X.P1D r0 = (X.P1D) r0
            android.view.ViewGroup r1 = r0.A04
            r0 = 2131440512(0x7f0b3380, float:1.850301E38)
            android.view.View r4 = r1.findViewById(r0)
            return r4
        L_0x0104:
            java.lang.Object r0 = r5.A01
            X.P1D r0 = (X.P1D) r0
            android.view.ViewGroup r1 = r0.A04
            r0 = 2131440505(0x7f0b3379, float:1.8502995E38)
            android.view.View r4 = r1.findViewById(r0)
            return r4
        L_0x0112:
            java.lang.Object r0 = r5.A01
            X.P1D r0 = (X.P1D) r0
            android.view.ViewGroup r1 = r0.A04
            r0 = 2131440518(0x7f0b3386, float:1.8503022E38)
            android.view.View r4 = r1.findViewById(r0)
            return r4
        L_0x0120:
            java.lang.Object r0 = r5.A01
            X.P1D r0 = (X.P1D) r0
            android.view.ViewGroup r1 = r0.A04
            r0 = 2131440506(0x7f0b337a, float:1.8502997E38)
            android.view.View r4 = r1.findViewById(r0)
            return r4
        L_0x012e:
            java.lang.Object r0 = r5.A01
            X.P1D r0 = (X.P1D) r0
            android.view.ViewGroup r1 = r0.A04
            r0 = 2131440515(0x7f0b3383, float:1.8503016E38)
            android.view.View r4 = r1.findViewById(r0)
            return r4
        L_0x013c:
            java.lang.Object r0 = r5.A01
            X.P1D r0 = (X.P1D) r0
            android.view.ViewGroup r1 = r0.A04
            r0 = 2131440508(0x7f0b337c, float:1.8503001E38)
            android.view.View r4 = r1.findViewById(r0)
            return r4
        L_0x014a:
            java.lang.Object r0 = r5.A01
            X.P1D r0 = (X.P1D) r0
            android.view.ViewGroup r1 = r0.A04
            r0 = 2131440534(0x7f0b3396, float:1.8503054E38)
            android.view.View r4 = r1.findViewById(r0)
            return r4
        L_0x0158:
            java.lang.Object r0 = r5.A01
            X.NKF r0 = (X.NKF) r0
            com.instagram.common.session.UserSession r0 = r0.getSession()
            X.OyR r4 = X.C69869NtX.A00(r0)
            return r4
        L_0x0165:
            java.lang.Object r1 = r5.A01
            com.instagram.common.session.UserSession r1 = (com.instagram.common.session.UserSession) r1
            java.lang.String r0 = "prompt_naming_suggestions_view_model"
            X.0xG r0 = X.DbS.A0O(r0)
            X.7IQ r4 = X.AnonymousClass7IP.A00(r0, r1)
            return r4
        L_0x0174:
            java.lang.Object r0 = r5.A01
            java.lang.Object r4 = X.DbT.A0r(r0)
            return r4
        L_0x017b:
            java.lang.Object r0 = r5.A01
            X.07f r4 = X.DbY.A0I(r0)
            return r4
        L_0x0182:
            java.lang.Object r0 = r5.A01
            X.NIN r0 = (X.NIN) r0
            X.Nk9 r0 = r0.A01
            if (r0 == 0) goto L_0x01ad
            X.NMd r4 = new X.NMd
            r4.<init>(r0)
            return r4
        L_0x0190:
            java.lang.Object r0 = r5.A01
            X.NJH r0 = (X.NJH) r0
            X.0eM r0 = r0.A04
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.OyR r4 = X.C69869NtX.A00(r0)
            return r4
        L_0x019f:
            java.lang.Object r0 = r5.A01
            X.NIO r0 = (X.NIO) r0
            X.NkD r0 = r0.A01
            if (r0 == 0) goto L_0x01ad
            X.NMs r4 = new X.NMs
            r4.<init>(r0)
            return r4
        L_0x01ad:
            java.lang.String r0 = "initialOption"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x01b7:
            java.lang.Object r3 = r5.A01
            com.instagram.common.session.UserSession r3 = (com.instagram.common.session.UserSession) r3
            X.1Ng r2 = X.AnonymousClass1Nd.A00(r3)
            X.1Am r1 = X.1Al.A01(r3)
            X.1An r0 = X.1An.A2c
            X.0xa r0 = r1.A03(r0)
            X.McN r4 = new X.McN
            r4.<init>(r2, r3, r0)
            return r4
        L_0x01cf:
            java.lang.Object r0 = r5.A01
            X.NIy r0 = (X.C68460NIy) r0
            X.0eM r0 = r0.A00
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.NMe r4 = new X.NMe
            r4.<init>(r0)
            return r4
        L_0x01df:
            java.lang.Object r0 = r5.A01
            X.NKm r0 = (X.C68493NKm) r0
            X.0eM r0 = r0.A0I
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.7Qj r4 = X.C331287Qh.A00(r0)
            return r4
        L_0x01ee:
            java.lang.Object r0 = r5.A01
            X.OIQ r0 = (X.OIQ) r0
            com.instagram.direct.capabilities.Capabilities r2 = r0.A05
            if (r2 != 0) goto L_0x01f8
            r4 = 0
            return r4
        L_0x01f8:
            X.9HD r1 = X.AnonymousClass9HC.A1b
            com.instagram.common.session.UserSession r0 = r0.A04
            X.9HC r4 = r1.A00(r0, r2)
            return r4
        L_0x0201:
            java.lang.Object r0 = r5.A01
            X.NJA r0 = (X.NJA) r0
            X.0eM r0 = r0.A0A
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.OyM r4 = X.C72200OyM.A00(r0)
            return r4
        L_0x0210:
            java.lang.Object r0 = r5.A01
            X.07g r0 = (X.AnonymousClass07g) r0
            X.07P r0 = (X.AnonymousClass07P) r0
            X.2YM r4 = r0.getDefaultViewModelProviderFactory()
            return r4
        L_0x021b:
            java.lang.Object r0 = r5.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.FYb r4 = new X.FYb
            r4.<init>(r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67570Mq4.invoke():java.lang.Object");
    }
}
