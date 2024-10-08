package X;

public final class MM7 extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MM7(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    public static AnonymousClass0eM A00(Object obj, int i) {
        return AnonymousClass1YB.A00(new MM7(obj, i));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x008b, code lost:
        r1 = r1.getSerializable(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0092, code lost:
        if ((r1 instanceof java.lang.String) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0094, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0192, code lost:
        return X.AnonymousClass7I4.A00(X.AnonymousClass7TE.A0l(r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:?, code lost:
        return X.C60340gF.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x003e, code lost:
        r4.A00 = 0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            r5 = this;
            int r0 = r5.A00
            switch(r0) {
                case 0: goto L_0x0095;
                case 1: goto L_0x01f8;
                case 2: goto L_0x01e8;
                case 3: goto L_0x01dd;
                case 4: goto L_0x01f8;
                case 5: goto L_0x01cd;
                case 6: goto L_0x0005;
                case 7: goto L_0x01c2;
                case 8: goto L_0x01f8;
                case 9: goto L_0x01b2;
                case 10: goto L_0x0193;
                case 11: goto L_0x0184;
                case 12: goto L_0x0083;
                case 13: goto L_0x0076;
                case 14: goto L_0x0065;
                case 15: goto L_0x01ff;
                case 16: goto L_0x017d;
                case 17: goto L_0x0176;
                case 18: goto L_0x0166;
                case 19: goto L_0x0005;
                case 20: goto L_0x0005;
                case 21: goto L_0x014a;
                case 22: goto L_0x0143;
                case 23: goto L_0x0043;
                case 24: goto L_0x01ff;
                case 25: goto L_0x017d;
                case 26: goto L_0x0176;
                case 27: goto L_0x0133;
                case 28: goto L_0x0117;
                case 29: goto L_0x0110;
                case 30: goto L_0x01ff;
                case 31: goto L_0x017d;
                case 32: goto L_0x0176;
                case 33: goto L_0x0100;
                case 34: goto L_0x0005;
                case 35: goto L_0x0005;
                case 36: goto L_0x0005;
                case 37: goto L_0x0005;
                case 38: goto L_0x0005;
                case 39: goto L_0x0005;
                case 40: goto L_0x0005;
                case 41: goto L_0x0005;
                case 42: goto L_0x0005;
                case 43: goto L_0x00f5;
                case 44: goto L_0x00e1;
                case 45: goto L_0x00d7;
                case 46: goto L_0x002d;
                case 47: goto L_0x001d;
                case 48: goto L_0x00cc;
                case 49: goto L_0x000d;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r5.A01
            X.DbS.A1U(r0)
        L_0x000a:
            X.0gF r3 = X.C60340gF.A00
        L_0x000c:
            return r3
        L_0x000d:
            java.lang.Object r3 = r5.A01
            X.7TN r3 = (X.AnonymousClass7TN) r3
            X.1QP r2 = r3.A02
            long r0 = r3.A00
            r2.flowEndSuccess(r0)
            r0 = 0
            r3.A00 = r0
            goto L_0x000a
        L_0x001d:
            java.lang.Object r4 = r5.A01
            X.Lis r4 = (X.C64831Lis) r4
            X.0eM r0 = r4.A02
            com.facebook.quicklog.reliability.UserFlowLoggerImpl r2 = X.C51965G9l.A0a(r0)
            long r0 = r4.A00
            r2.flowEndSuccess(r0)
            goto L_0x003e
        L_0x002d:
            java.lang.Object r4 = r5.A01
            X.Lis r4 = (X.C64831Lis) r4
            X.0eM r0 = r4.A02
            com.facebook.quicklog.reliability.UserFlowLoggerImpl r3 = X.C51965G9l.A0a(r0)
            long r1 = r4.A00
            java.lang.String r0 = "user_cancelled"
            r3.flowEndCancel(r1, r0)
        L_0x003e:
            r0 = 0
            r4.A00 = r0
            goto L_0x000a
        L_0x0043:
            java.lang.Object r0 = r5.A01
            X.5tX r0 = (X.C298505tX) r0
            X.0eM r0 = r0.A07
            java.lang.Object r1 = r0.getValue()
            X.JiO r1 = (X.C60267JiO) r1
            X.3ls r0 = r1.A00
            if (r0 == 0) goto L_0x000a
            X.Cvn r3 = X.C60267JiO.A00(r0)
            if (r3 == 0) goto L_0x000a
            X.L5o r2 = r1.A01
            X.1vn r1 = r2.A01
            r0 = 5
            com.facebook.pando.IPandoGraphQLService$Token r0 = X.C44756CkS.A00(r3, r1, r0)
            r2.token = r0
            goto L_0x000a
        L_0x0065:
            java.lang.Object r0 = r5.A01
            X.K56 r0 = (X.K56) r0
            X.0eM r0 = r0.A07
            java.lang.Object r1 = r0.getValue()
            X.Ji0 r1 = (X.C60243Ji0) r1
            r0 = 0
            r1.A00(r0)
            goto L_0x000a
        L_0x0076:
            java.lang.Object r0 = r5.A01
            android.os.Bundle r1 = X.DbS.A0B(r0)
            r0 = 607(0x25f, float:8.5E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            goto L_0x008b
        L_0x0083:
            java.lang.Object r0 = r5.A01
            android.os.Bundle r1 = X.DbS.A0B(r0)
            java.lang.String r0 = "entry_point"
        L_0x008b:
            java.io.Serializable r1 = r1.getSerializable(r0)
            boolean r0 = r1 instanceof java.lang.String
            r3 = 0
            if (r0 == 0) goto L_0x000c
            return r1
        L_0x0095:
            java.lang.Object r4 = r5.A01
            X.K5j r4 = (X.C61389K5j) r4
            X.0eM r3 = r4.A02
            X.7I6 r0 = X.JTO.A0U(r3)
            java.lang.String r1 = "avatar_gen_dismissed"
            r2 = 673058094(0x281e0d2e, float:8.77362E-15)
            X.02m r0 = r0.A06
            r0.markerPoint(r2, r1)
            X.7I6 r1 = X.JTO.A0U(r3)
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            X.JVT.A01(r1, r0, r2)
            X.0eM r0 = r4.A04
            X.JjJ r0 = X.JTO.A0R(r0)
            X.KX0 r2 = r0.A00
            X.4Co r0 = r2.A02
            r1 = 0
            if (r0 == 0) goto L_0x00c2
            r0.AG7(r1)
        L_0x00c2:
            X.05G r0 = r2.A0Y
            r0.Epw(r1)
            X.DbT.A1I(r4)
            goto L_0x000a
        L_0x00cc:
            java.lang.Object r0 = r5.A01
            X.Lis r0 = (X.C64831Lis) r0
            com.instagram.common.session.UserSession r0 = r0.A01
            X.1QP r3 = X.AnonymousClass1QO.A00(r0)
            return r3
        L_0x00d7:
            java.lang.Object r0 = r5.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.Lis r3 = new X.Lis
            r3.<init>(r0)
            return r3
        L_0x00e1:
            java.lang.Object r0 = r5.A01
            X.LRW r0 = (X.LRW) r0
            com.instagram.common.session.UserSession r2 = r0.A00
            r0 = 45
            X.MM7 r1 = new X.MM7
            r1.<init>(r2, r0)
            java.lang.Class<X.Lis> r0 = X.C64831Lis.class
            java.lang.Object r3 = r2.A01(r0, r1)
            return r3
        L_0x00f5:
            java.lang.Object r0 = r5.A01
            X.Ji0 r0 = (X.C60243Ji0) r0
            com.instagram.common.session.UserSession r0 = r0.A01
            X.7I6 r3 = X.AnonymousClass7I4.A00(r0)
            return r3
        L_0x0100:
            java.lang.Object r0 = r5.A01
            X.K4M r0 = (X.K4M) r0
            X.0eM r0 = r0.A04
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.KBM r3 = new X.KBM
            r3.<init>(r0)
            return r3
        L_0x0110:
            java.lang.Object r0 = r5.A01
            X.K4M r0 = (X.K4M) r0
            X.0eM r0 = r0.A04
            goto L_0x018a
        L_0x0117:
            java.lang.Object r3 = r5.A01
            X.K4M r3 = (X.K4M) r3
            X.0eM r0 = r3.A04
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r0)
            X.0eM r0 = r3.A05
            java.lang.String r1 = X.DbS.A0t(r0)
            X.0eM r0 = r3.A02
            java.lang.String r0 = X.DbS.A0t(r0)
            X.LRW r3 = new X.LRW
            r3.<init>(r2, r1, r0)
            return r3
        L_0x0133:
            java.lang.Object r0 = r5.A01
            X.5tX r0 = (X.C298505tX) r0
            X.0eM r0 = r0.A05
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.KBK r3 = new X.KBK
            r3.<init>(r0)
            return r3
        L_0x0143:
            java.lang.Object r0 = r5.A01
            X.5tX r0 = (X.C298505tX) r0
            X.0eM r0 = r0.A05
            goto L_0x018a
        L_0x014a:
            java.lang.Object r3 = r5.A01
            X.5tX r3 = (X.C298505tX) r3
            X.0eM r0 = r3.A05
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r0)
            X.0eM r0 = r3.A06
            java.lang.String r1 = X.DbS.A0t(r0)
            X.0eM r0 = r3.A02
            java.lang.String r0 = X.DbS.A0t(r0)
            X.LRW r3 = new X.LRW
            r3.<init>(r2, r1, r0)
            return r3
        L_0x0166:
            java.lang.Object r0 = r5.A01
            X.K56 r0 = (X.K56) r0
            X.0eM r0 = r0.A04
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.KBL r3 = new X.KBL
            r3.<init>(r0)
            return r3
        L_0x0176:
            java.lang.Object r0 = r5.A01
            X.07f r3 = X.DbY.A0I(r0)
            return r3
        L_0x017d:
            java.lang.Object r0 = r5.A01
            java.lang.Object r3 = X.DbT.A0r(r0)
            return r3
        L_0x0184:
            java.lang.Object r0 = r5.A01
            X.K56 r0 = (X.K56) r0
            X.0eM r0 = r0.A04
        L_0x018a:
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.7I6 r3 = X.AnonymousClass7I4.A00(r0)
            return r3
        L_0x0193:
            java.lang.Object r3 = r5.A01
            X.K56 r3 = (X.K56) r3
            X.0eM r0 = r3.A04
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r0)
            X.0eM r0 = r3.A05
            java.lang.String r1 = X.DbS.A0t(r0)
            X.0eM r0 = r3.A02
            java.lang.String r0 = X.DbS.A0t(r0)
            if (r0 != 0) goto L_0x01ac
            r0 = 0
        L_0x01ac:
            X.LRW r3 = new X.LRW
            r3.<init>(r2, r1, r0)
            return r3
        L_0x01b2:
            java.lang.Object r0 = r5.A01
            X.K4m r0 = (X.C61368K4m) r0
            X.0eM r0 = r0.A01
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.KBI r3 = new X.KBI
            r3.<init>(r0)
            return r3
        L_0x01c2:
            java.lang.Object r0 = r5.A01
            X.K4m r0 = (X.C61368K4m) r0
            X.0eM r0 = r0.A01
            X.LTH r3 = X.LTH.A03(r0)
            return r3
        L_0x01cd:
            java.lang.Object r0 = r5.A01
            X.K5t r0 = (X.C61399K5t) r0
            X.0eM r0 = r0.A03
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.KBI r3 = new X.KBI
            r3.<init>(r0)
            return r3
        L_0x01dd:
            java.lang.Object r0 = r5.A01
            X.K5t r0 = (X.C61399K5t) r0
            X.0eM r0 = r0.A03
            X.LTH r3 = X.LTH.A03(r0)
            return r3
        L_0x01e8:
            java.lang.Object r0 = r5.A01
            X.K5j r0 = (X.C61389K5j) r0
            X.0eM r0 = r0.A03
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.KBI r3 = new X.KBI
            r3.<init>(r0)
            return r3
        L_0x01f8:
            java.lang.Object r0 = r5.A01
            X.07f r3 = X.C51971G9r.A0U(r0)
            return r3
        L_0x01ff:
            java.lang.Object r3 = r5.A01
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MM7.invoke():java.lang.Object");
    }
}
