package X;

import com.instagram.common.session.UserSession;

public final class MGN extends AnonymousClass1Ek implements 0sL {
    public int A00;
    public Object A01;
    public Object A02;
    public final int A03;
    public final String A04;
    public final String A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MGN(Object obj, String str, String str2, AnonymousClass4D7 r5, int i) {
        super(2, r5);
        this.A03 = i;
        this.A02 = obj;
        this.A05 = str;
        this.A04 = str2;
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [X.MGN, X.4D7] */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x011a, code lost:
        r1 = new X.MGN(r2, r3, r4, r5, r6);
        r1.A01 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0122, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0015, code lost:
        return new X.MGN(r1, r2, r3, r4, r5, r6);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass4D7 create(java.lang.Object r8, X.AnonymousClass4D7 r9) {
        /*
            r7 = this;
            int r0 = r7.A03
            r5 = r9
            switch(r0) {
                case 0: goto L_0x00c7;
                case 1: goto L_0x0016;
                case 2: goto L_0x00cf;
                case 3: goto L_0x00d7;
                case 4: goto L_0x0020;
                case 5: goto L_0x00e5;
                case 6: goto L_0x002a;
                case 7: goto L_0x0034;
                case 8: goto L_0x003e;
                case 9: goto L_0x0049;
                case 10: goto L_0x0054;
                case 11: goto L_0x00ed;
                case 12: goto L_0x005f;
                case 13: goto L_0x006a;
                case 14: goto L_0x0100;
                case 15: goto L_0x0075;
                case 16: goto L_0x0080;
                case 17: goto L_0x0109;
                case 18: goto L_0x008b;
                case 19: goto L_0x0112;
                case 20: goto L_0x0097;
                case 21: goto L_0x00a3;
                case 22: goto L_0x00af;
                case 23: goto L_0x00bb;
                default: goto L_0x0006;
            }
        L_0x0006:
            java.lang.Object r1 = r7.A02
            java.lang.Object r2 = r7.A01
            java.lang.String r3 = r7.A05
            java.lang.String r4 = r7.A04
            r6 = 24
        L_0x0010:
            X.MGN r0 = new X.MGN
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return r0
        L_0x0016:
            java.lang.String r4 = r7.A04
            java.lang.Object r1 = r7.A02
            java.lang.Object r2 = r7.A01
            java.lang.String r3 = r7.A05
            r6 = 1
            goto L_0x0010
        L_0x0020:
            java.lang.Object r1 = r7.A02
            java.lang.String r3 = r7.A05
            java.lang.String r4 = r7.A04
            java.lang.Object r2 = r7.A01
            r6 = 4
            goto L_0x0010
        L_0x002a:
            java.lang.Object r1 = r7.A02
            java.lang.Object r2 = r7.A01
            java.lang.String r3 = r7.A05
            java.lang.String r4 = r7.A04
            r6 = 6
            goto L_0x0010
        L_0x0034:
            java.lang.Object r1 = r7.A02
            java.lang.Object r2 = r7.A01
            java.lang.String r3 = r7.A05
            java.lang.String r4 = r7.A04
            r6 = 7
            goto L_0x0010
        L_0x003e:
            java.lang.Object r1 = r7.A02
            java.lang.Object r2 = r7.A01
            java.lang.String r4 = r7.A04
            java.lang.String r3 = r7.A05
            r6 = 8
            goto L_0x0010
        L_0x0049:
            java.lang.Object r2 = r7.A01
            java.lang.String r4 = r7.A04
            java.lang.Object r1 = r7.A02
            java.lang.String r3 = r7.A05
            r6 = 9
            goto L_0x0010
        L_0x0054:
            java.lang.Object r2 = r7.A01
            java.lang.Object r1 = r7.A02
            java.lang.String r3 = r7.A05
            java.lang.String r4 = r7.A04
            r6 = 10
            goto L_0x0010
        L_0x005f:
            java.lang.Object r1 = r7.A02
            java.lang.Object r2 = r7.A01
            java.lang.String r4 = r7.A04
            java.lang.String r3 = r7.A05
            r6 = 12
            goto L_0x0010
        L_0x006a:
            java.lang.Object r2 = r7.A01
            java.lang.String r3 = r7.A05
            java.lang.String r4 = r7.A04
            java.lang.Object r1 = r7.A02
            r6 = 13
            goto L_0x0010
        L_0x0075:
            java.lang.Object r1 = r7.A02
            java.lang.String r3 = r7.A05
            java.lang.String r4 = r7.A04
            java.lang.Object r2 = r7.A01
            r6 = 15
            goto L_0x0010
        L_0x0080:
            java.lang.Object r1 = r7.A02
            java.lang.String r3 = r7.A05
            java.lang.String r4 = r7.A04
            java.lang.Object r2 = r7.A01
            r6 = 16
            goto L_0x0010
        L_0x008b:
            java.lang.Object r1 = r7.A02
            java.lang.String r3 = r7.A05
            java.lang.Object r2 = r7.A01
            java.lang.String r4 = r7.A04
            r6 = 18
            goto L_0x0010
        L_0x0097:
            java.lang.Object r1 = r7.A02
            java.lang.String r4 = r7.A04
            java.lang.String r3 = r7.A05
            java.lang.Object r2 = r7.A01
            r6 = 20
            goto L_0x0010
        L_0x00a3:
            java.lang.Object r1 = r7.A02
            java.lang.String r4 = r7.A04
            java.lang.String r3 = r7.A05
            java.lang.Object r2 = r7.A01
            r6 = 21
            goto L_0x0010
        L_0x00af:
            java.lang.Object r1 = r7.A02
            java.lang.String r4 = r7.A04
            java.lang.String r3 = r7.A05
            java.lang.Object r2 = r7.A01
            r6 = 22
            goto L_0x0010
        L_0x00bb:
            java.lang.Object r1 = r7.A02
            java.lang.String r3 = r7.A05
            java.lang.String r4 = r7.A04
            java.lang.Object r2 = r7.A01
            r6 = 23
            goto L_0x0010
        L_0x00c7:
            java.lang.Object r2 = r7.A02
            java.lang.String r3 = r7.A05
            java.lang.String r4 = r7.A04
            r6 = 0
            goto L_0x011a
        L_0x00cf:
            java.lang.Object r2 = r7.A02
            java.lang.String r3 = r7.A05
            java.lang.String r4 = r7.A04
            r6 = 2
            goto L_0x011a
        L_0x00d7:
            java.lang.Object r2 = r7.A02
            java.lang.String r3 = r7.A05
            java.lang.String r4 = r7.A04
            r6 = 3
            X.MGN r0 = new X.MGN
            r1 = r0
            r1.<init>((java.lang.Object) r2, (java.lang.String) r3, (java.lang.String) r4, (X.AnonymousClass4D7) r5, (int) r6)
            return r0
        L_0x00e5:
            java.lang.Object r2 = r7.A02
            java.lang.String r3 = r7.A05
            java.lang.String r4 = r7.A04
            r6 = 5
            goto L_0x011a
        L_0x00ed:
            java.lang.Object r2 = r7.A01
            com.instagram.common.session.UserSession r2 = (com.instagram.common.session.UserSession) r2
            java.lang.String r3 = r7.A04
            java.lang.String r4 = r7.A05
            int r6 = r7.A00
            X.MGN r0 = new X.MGN
            r1 = r0
            r1.<init>((com.instagram.common.session.UserSession) r2, (java.lang.String) r3, (java.lang.String) r4, (X.AnonymousClass4D7) r5, (int) r6)
            r0.A02 = r8
            return r0
        L_0x0100:
            java.lang.Object r2 = r7.A02
            java.lang.String r3 = r7.A05
            java.lang.String r4 = r7.A04
            r6 = 14
            goto L_0x011a
        L_0x0109:
            java.lang.Object r2 = r7.A02
            java.lang.String r3 = r7.A05
            java.lang.String r4 = r7.A04
            r6 = 17
            goto L_0x011a
        L_0x0112:
            java.lang.Object r2 = r7.A02
            java.lang.String r4 = r7.A04
            java.lang.String r3 = r7.A05
            r6 = 19
        L_0x011a:
            X.MGN r0 = new X.MGN
            r1 = r0
            r1.<init>((java.lang.Object) r2, (java.lang.String) r3, (java.lang.String) r4, (X.AnonymousClass4D7) r5, (int) r6)
            r0.A01 = r8
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MGN.create(java.lang.Object, X.4D7):X.4D7");
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.MGN, X.4D7] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:330:0x074f, code lost:
        r1.Epw(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:452:0x0a1c, code lost:
        X.0eS.A00(r4);
     */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x032c  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x033c  */
    /* JADX WARNING: Removed duplicated region for block: B:341:0x07ae A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:372:0x084a  */
    /* JADX WARNING: Removed duplicated region for block: B:404:0x08f6  */
    /* JADX WARNING: Removed duplicated region for block: B:427:0x0986 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:455:0x0a5b A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            r21 = this;
            r0 = r21
            r4 = r22
            int r1 = r0.A03
            switch(r1) {
                case 0: goto L_0x0a0e;
                case 1: goto L_0x0a5c;
                case 2: goto L_0x09ad;
                case 3: goto L_0x088e;
                case 4: goto L_0x0864;
                case 5: goto L_0x07b9;
                case 6: goto L_0x06cc;
                case 7: goto L_0x0646;
                case 8: goto L_0x061a;
                case 9: goto L_0x092a;
                case 10: goto L_0x05b2;
                case 11: goto L_0x0598;
                case 12: goto L_0x0541;
                case 13: goto L_0x0518;
                case 14: goto L_0x04e6;
                case 15: goto L_0x04c1;
                case 16: goto L_0x047b;
                case 17: goto L_0x0356;
                case 18: goto L_0x0292;
                case 19: goto L_0x0200;
                case 20: goto L_0x00f0;
                case 21: goto L_0x00c1;
                case 22: goto L_0x0096;
                case 23: goto L_0x006d;
                default: goto L_0x0009;
            }
        L_0x0009:
            X.1Hj r1 = X.1Hj.A02
            int r3 = r0.A00
            r2 = 1
            if (r3 == 0) goto L_0x0017
            if (r3 == r2) goto L_0x0a1c
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0017:
            X.0eS.A00(r4)
            java.lang.Object r6 = r0.A02
            X.HFq r6 = (X.C54484HFq) r6
            java.lang.Object r7 = r0.A01
            java.lang.String r3 = r0.A05
            java.lang.String r5 = r0.A04
            r0.A00 = r2
            X.0eM r2 = r6.A04
            com.instagram.common.session.UserSession r4 = X.AnonymousClass7TE.A0l(r2)
            java.util.Map r2 = com.instagram.api.schemas.InstagramMidcardType.A01
            java.lang.Object r3 = r2.get(r3)
            com.instagram.api.schemas.InstagramMidcardType r3 = (com.instagram.api.schemas.InstagramMidcardType) r3
            if (r3 != 0) goto L_0x0038
            com.instagram.api.schemas.InstagramMidcardType r3 = com.instagram.api.schemas.InstagramMidcardType.A0k
        L_0x0038:
            com.instagram.api.schemas.ClipsMidCardSubtype r2 = X.HTW.A00(r5)
            X.1OC r4 = X.C56369HxN.A00(r2, r3, r4)
            r5 = 0
            r3 = 919785928(0x36d2d1c8, float:6.2829095E-6)
            r2 = 2
            X.032 r4 = r4.A04(r3, r2)
            r3 = 12
            X.ImE r2 = new X.ImE
            r2.<init>(r7, r5, r3)
            X.0rn r3 = new X.0rn
            r3.<init>(r2, r4)
            r2 = 21
            X.0ro r4 = X.C66191MHh.A00(r7, r3, r2)
            r3 = 62
            X.IkU r2 = new X.IkU
            r2.<init>(r6, r3)
            java.lang.Object r0 = r4.collect(r2, r0)
            if (r0 == r1) goto L_0x006a
            X.0gF r0 = X.C60340gF.A00
        L_0x006a:
            if (r0 != r1) goto L_0x0a7b
            return r1
        L_0x006d:
            X.1Hj r1 = X.1Hj.A02
            int r3 = r0.A00
            r6 = 2
            r2 = 1
            if (r3 == 0) goto L_0x007e
            if (r3 == r2) goto L_0x0607
            if (r3 == r6) goto L_0x0607
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x007e:
            X.0eS.A00(r4)
            java.lang.Object r5 = r0.A02
            com.meta.metaai.writewithai.creation.impl.viewmodel.WriteWithAICreationViewModel r5 = (com.meta.metaai.writewithai.creation.impl.viewmodel.WriteWithAICreationViewModel) r5
            java.lang.String r4 = r0.A05
            java.lang.String r3 = r0.A04
            java.lang.Object r2 = r0.A01
            X.HIx r2 = (X.C54562HIx) r2
            r0.A00 = r6
            java.lang.Object r2 = com.meta.metaai.writewithai.creation.impl.viewmodel.WriteWithAICreationViewModel.A01(r2, r5, r4, r3, r0)
            if (r2 != r1) goto L_0x060a
            return r1
        L_0x0096:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r6 = 1
            if (r2 == 0) goto L_0x00a4
            if (r2 == r6) goto L_0x0a1c
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x00a4:
            X.0eS.A00(r4)
            java.lang.Object r2 = r0.A02
            X.Gh8 r2 = (X.C53017Gh8) r2
            com.meta.metaai.shared.feedback.data.FeedbackRepository r5 = r2.A02
            java.lang.String r4 = r0.A04
            java.lang.String r3 = r0.A05
            java.lang.Object r2 = r0.A01
            X.HMN r2 = (X.HMN) r2
            java.lang.String r2 = X.Ky9.A00(r2)
            r0.A00 = r6
            java.lang.Object r2 = r5.A00(r4, r3, r2, r0)
            goto L_0x0a59
        L_0x00c1:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r6 = 1
            if (r2 == 0) goto L_0x00cf
            if (r2 == r6) goto L_0x0a1c
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x00cf:
            X.0eS.A00(r4)
            java.lang.Object r2 = r0.A02
            X.GgP r2 = (X.C52972GgP) r2
            com.meta.metaai.imagine.creation.impl.data.ImagineGenerationImageRepository r5 = r2.A0E
            java.lang.String r4 = r0.A04
            java.lang.String r3 = ""
            if (r4 != 0) goto L_0x00df
            r4 = r3
        L_0x00df:
            java.lang.String r2 = r0.A05
            if (r2 == 0) goto L_0x00e4
            r3 = r2
        L_0x00e4:
            java.lang.Object r2 = r0.A01
            X.HMN r2 = (X.HMN) r2
            r0.A00 = r6
            java.lang.Object r2 = r5.A01(r2, r4, r3, r0)
            goto L_0x0a59
        L_0x00f0:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r7 = 1
            if (r2 == 0) goto L_0x012d
            if (r2 != r7) goto L_0x01fb
            X.0eS.A00(r4)
        L_0x00fc:
            X.3Ii r4 = (X.C239803Ii) r4
            java.lang.Object r3 = r0.A02
            X.JiB r3 = (X.C60254JiB) r3
            java.lang.Object r5 = r0.A01
            X.Dew r5 = (X.C46434Dew) r5
            boolean r0 = r4 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x0192
            X.3Ih r4 = (X.C239793Ih) r4
            java.lang.Object r7 = r4.A00
            X.CDT r7 = (X.CDT) r7
            com.instagram.user.model.User r1 = r3.A00
            if (r1 == 0) goto L_0x0119
            java.util.List r0 = r3.A02
            r0.remove(r1)
        L_0x0119:
            java.util.List r4 = r3.A02
            java.util.ArrayList r2 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r1 = r4.iterator()
        L_0x0123:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0151
            X.DbY.A1W(r2, r1)
            goto L_0x0123
        L_0x012d:
            X.0eS.A00(r4)
            java.lang.Object r2 = r0.A02
            X.JiB r2 = (X.C60254JiB) r2
            com.instagram.common.session.UserSession r6 = r2.A01
            java.lang.String r5 = r0.A04
            java.lang.String r4 = r0.A05
            java.lang.Object r2 = r0.A01
            X.Dew r2 = (X.C46434Dew) r2
            java.lang.String r3 = r2.A00
            r0.A00 = r7
            r2 = -1
            X.1OC r3 = X.1NP.A04(r6, r5, r4, r3, r2)
            r2 = 396274682(0x179eabfa, float:1.0253924E-24)
            java.lang.Object r4 = r3.A00(r2, r0)
            if (r4 != r1) goto L_0x00fc
            return r1
        L_0x0151:
            java.util.Set r9 = X.00k.A0k(r2)
            java.util.ArrayList r8 = X.AnonymousClass7TE.A1C()
            X.XA2 r0 = r7.A00
            if (r0 == 0) goto L_0x01f3
            X.BH7 r0 = (X.BH7) r0
            X.BIt r1 = r0.A00
            com.instagram.common.session.UserSession r6 = r3.A01
            X.1E5 r0 = X.1E4.A00(r6)
            X.BIt r0 = r1.FGN(r0)
            java.util.List r0 = r0.A02
            java.util.Iterator r2 = r0.iterator()
        L_0x0171:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x019b
            java.lang.Object r0 = r2.next()
            X.BIs r0 = (X.C42137BIs) r0
            com.instagram.user.model.User r1 = r0.A01
            if (r1 == 0) goto L_0x0171
            java.lang.String r0 = r1.getId()
            boolean r0 = X.C51966G9m.A1W(r6, r0)
            if (r0 != 0) goto L_0x018f
            r8.add(r1)
            goto L_0x0171
        L_0x018f:
            r3.A00 = r1
            goto L_0x0171
        L_0x0192:
            boolean r0 = r4 instanceof X.C297815sO
            if (r0 != 0) goto L_0x01e0
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x019b:
            r1 = 32
            X.MP8 r0 = new X.MP8
            r0.<init>(r9, r1)
            X.018.A1A(r8, r0)
            r4.addAll(r8)
            com.instagram.user.model.User r0 = r3.A00
            if (r0 == 0) goto L_0x01af
            r4.add(r0)
        L_0x01af:
            X.6oS r0 = X.C318116oQ.A00(r3)
            r2 = 0
            X.C66184MGv.A02(r3, r0, r2)
            X.XA2 r0 = r7.A00
            if (r0 == 0) goto L_0x01f3
            X.BH7 r0 = (X.BH7) r0
            X.BIt r1 = r0.A00
            X.1E5 r0 = X.1E4.A00(r6)
            X.BIt r0 = r1.FGN(r0)
            java.lang.String r0 = r0.A00
            r5.A00 = r0
            r5.A02 = r2
            X.05G r2 = r3.A03
            X.62P r1 = X.AnonymousClass62Q.A00(r4)
            if (r1 != 0) goto L_0x01d7
            X.0sn r1 = X.0sn.A00
        L_0x01d7:
            X.Dty r0 = new X.Dty
            r0.<init>(r1)
            X.3Ih r4 = X.Dba.A0S(r0, r2)
        L_0x01e0:
            boolean r0 = r4 instanceof X.C239793Ih
            if (r0 != 0) goto L_0x0a7b
            boolean r0 = r4 instanceof X.C297815sO
            if (r0 == 0) goto L_0x01ee
            X.05G r1 = r3.A03
            X.FnY r0 = X.C51042FnY.A00
            goto L_0x074f
        L_0x01ee:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x01f3:
            X.C41845B3m.A0v()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x01fb:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0200:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r6 = 1
            if (r2 == 0) goto L_0x026e
            if (r2 != r6) goto L_0x028d
            X.0eS.A00(r4)
        L_0x020c:
            X.3Ii r4 = (X.C239803Ii) r4
            java.lang.Object r3 = r0.A02
            X.JgO r3 = (X.C60143JgO) r3
            boolean r0 = r4 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x0265
            java.lang.Object r0 = X.JTQ.A0Y(r4)
            X.C7u r0 = (X.C43750C7u) r0
            if (r0 == 0) goto L_0x0260
            X.C7t r0 = r0.A0E()
            if (r0 == 0) goto L_0x0260
            X.C7s r0 = r0.A0E()
            if (r0 == 0) goto L_0x0260
            X.C7r r0 = r0.A0E()
            if (r0 == 0) goto L_0x0260
            com.google.common.collect.ImmutableList r1 = r0.A0E()
            if (r1 == 0) goto L_0x0260
            r0 = 0
            java.lang.Object r1 = X.00k.A0O(r1, r0)
            X.3lr r1 = (X.C250663lr) r1
            if (r1 == 0) goto L_0x0260
            java.lang.String r0 = "cdn_url"
            java.lang.String r2 = r1.getOptionalStringField(r6, r0)
            if (r2 == 0) goto L_0x0260
            X.05G r1 = r3.A02
            X.KaR r0 = new X.KaR
            r0.<init>(r2)
        L_0x024e:
            X.3Ih r4 = X.Dba.A0S(r0, r1)
        L_0x0252:
            boolean r0 = r4 instanceof X.C239793Ih
            if (r0 != 0) goto L_0x0a7b
            boolean r0 = r4 instanceof X.C297815sO
            if (r0 == 0) goto L_0x0288
            X.05G r1 = r3.A02
            X.KaS r0 = X.C62120KaS.A00
            goto L_0x074f
        L_0x0260:
            X.05G r1 = r3.A02
            X.KaS r0 = X.C62120KaS.A00
            goto L_0x024e
        L_0x0265:
            boolean r0 = r4 instanceof X.C297815sO
            if (r0 != 0) goto L_0x0252
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x026e:
            X.0eS.A00(r4)
            java.lang.Object r5 = r0.A01
            java.lang.Object r2 = r0.A02
            X.JgO r2 = (X.C60143JgO) r2
            com.instagram.avatars.graphql.AvatarStickerGraphQLRepository r4 = r2.A00
            java.lang.String r3 = r0.A04
            java.lang.String r2 = r0.A05
            r0.A01 = r5
            r0.A00 = r6
            java.lang.Object r4 = r4.A01(r3, r2, r0)
            if (r4 != r1) goto L_0x020c
            return r1
        L_0x0288:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x028d:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0292:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r7 = 3
            r6 = 2
            r5 = 1
            if (r2 == 0) goto L_0x030d
            if (r2 == r5) goto L_0x0325
            if (r2 == r6) goto L_0x0a1c
            if (r2 != r7) goto L_0x0351
            X.0eS.A00(r4)
        L_0x02a4:
            java.lang.Object r1 = r0.A02
            X.6iS r1 = (X.C314556iS) r1
            X.0eM r1 = r1.A0A
            java.lang.Object r3 = r1.getValue()
            X.6Ym r3 = (X.C309496Ym) r3
            java.lang.String r6 = r0.A04
            r5 = 0
            X.0qQ.A0B(r6, r5)
            java.util.List r0 = r3.A01
            java.util.Iterator r2 = r0.iterator()
            r4 = 0
        L_0x02bd:
            boolean r0 = r2.hasNext()
            r1 = -1
            if (r0 == 0) goto L_0x0a7b
            java.lang.Object r0 = r2.next()
            X.9JK r0 = (X.AnonymousClass9JK) r0
            java.lang.String r0 = r0.A04
            boolean r0 = X.0qQ.A0K(r0, r6)
            if (r0 == 0) goto L_0x030a
            if (r4 == r1) goto L_0x0a7b
            java.util.List r0 = r3.A01
            int r0 = X.C51966G9m.A06(r0)
            if (r4 >= r0) goto L_0x02fb
            int r0 = r3.A00
            if (r0 != r4) goto L_0x02fb
            java.util.List r2 = r3.A01
            int r1 = r4 + 1
            int r0 = r2.size()
            java.util.List r1 = r2.subList(r1, r0)
            java.util.List r0 = r3.A01
            java.util.List r0 = r0.subList(r5, r4)
            java.util.ArrayList r0 = X.00k.A0S(r0, r1)
        L_0x02f6:
            r3.A02(r0)
            goto L_0x0a7b
        L_0x02fb:
            java.util.List r0 = r3.A01
            java.lang.Object r1 = X.00k.A0O(r0, r4)
            java.util.List r0 = r3.A01
            if (r1 == 0) goto L_0x02f6
            java.util.List r0 = X.00k.A0f(r0, r1)
            goto L_0x02f6
        L_0x030a:
            int r4 = r4 + 1
            goto L_0x02bd
        L_0x030d:
            X.0eS.A00(r4)
            java.lang.Object r2 = r0.A02
            X.6iS r2 = (X.C314556iS) r2
            com.instagram.reels.comments.repository.StoryCommentsRepository r4 = r2.A08
            java.lang.String r3 = r0.A05
            java.lang.Object r2 = r0.A01
            X.1Xj r2 = (X.1Xj) r2
            r0.A00 = r5
            java.lang.Object r4 = r4.A00(r2, r3, r0)
            if (r4 != r1) goto L_0x0328
            return r1
        L_0x0325:
            X.0eS.A00(r4)
        L_0x0328:
            boolean r2 = r4 instanceof X.C239793Ih
            if (r2 == 0) goto L_0x033c
            java.lang.Object r2 = r0.A02
            X.6iS r2 = (X.C314556iS) r2
            X.0V2 r3 = r2.A0C
            X.LwD r2 = X.C65579LwD.A00
            r0.A00 = r6
            java.lang.Object r2 = r3.emit(r2, r0)
            goto L_0x0a59
        L_0x033c:
            boolean r2 = r4 instanceof X.C297815sO
            if (r2 == 0) goto L_0x0a7b
            java.lang.Object r2 = r0.A02
            X.6iS r2 = (X.C314556iS) r2
            X.0V2 r3 = r2.A0C
            X.LwC r2 = X.C65578LwC.A00
            r0.A00 = r7
            java.lang.Object r2 = r3.emit(r2, r0)
            if (r2 != r1) goto L_0x02a4
            return r1
        L_0x0351:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0356:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r6 = 1
            if (r2 == 0) goto L_0x0457
            if (r2 != r6) goto L_0x0476
            X.0eS.A00(r4)
        L_0x0362:
            X.3Ii r4 = (X.C239803Ii) r4
            java.lang.Object r1 = r0.A02
            X.DdZ r1 = (X.DdZ) r1
            java.lang.String r3 = r0.A05
            boolean r0 = r4 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x044e
            X.3Ih r4 = (X.C239793Ih) r4
            java.lang.Object r7 = r4.A00
            X.6p5 r7 = (X.C318516p5) r7
            X.6pC r0 = r7.FH3()
            java.util.List r5 = r0.A08
            if (r5 == 0) goto L_0x0449
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto L_0x0449
            X.6pC r0 = r7.FH3()
            java.lang.Boolean r0 = r0.A01
            boolean r16 = X.AnonymousClass7TG.A1X(r0)
            java.lang.String r9 = ""
            if (r3 != 0) goto L_0x0391
            r3 = r9
        L_0x0391:
            X.6pC r0 = r7.FH3()
            com.instagram.api.schemas.AvatarCoinFlipBackgroundOptionResponse r0 = r0.A00
            if (r0 == 0) goto L_0x0446
            java.lang.String r8 = r0.A02()
            java.lang.String r4 = r0.A03()
            java.lang.String r2 = r0.A01()
            java.lang.String r0 = r0.A00()
            if (r0 == 0) goto L_0x03ac
            r9 = r0
        L_0x03ac:
            com.instagram.api.schemas.AvatarCoinFlipBackgroundOptionResponse r10 = new com.instagram.api.schemas.AvatarCoinFlipBackgroundOptionResponse
            r10.<init>(r9, r2, r8, r4)
        L_0x03b1:
            X.6pC r0 = r7.FH3()
            java.lang.String r15 = r0.A07
            X.6pC r0 = r7.FH3()
            java.lang.String r4 = r0.A04
            X.6pC r0 = r7.FH3()
            java.lang.String r2 = r0.A05
            X.6pC r0 = r7.FH3()
            java.lang.String r0 = r0.A06
            r13 = 0
            com.instagram.avatars.common.AvatarInfo r14 = new com.instagram.avatars.common.AvatarInfo
            r14.<init>(r4, r2, r0, r13)
            X.05G r4 = r1.A0D
            int r7 = r5.size()
            r2 = 0
            r0 = 2
            if (r7 != r0) goto L_0x0427
            com.instagram.common.session.UserSession r0 = r1.A09
            boolean r0 = X.DcE.A06(r0, r2)
            if (r0 == 0) goto L_0x0427
            java.lang.Object r0 = r5.get(r2)
            X.6tD r0 = (X.C320936tD) r0
            com.instagram.avatars.coinflip.AvatarCoinFlipSticker r11 = X.DdZ.A00(r0)
            java.lang.Object r0 = r5.get(r6)
        L_0x03ef:
            X.6tD r0 = (X.C320936tD) r0
            com.instagram.avatars.coinflip.AvatarCoinFlipSticker r12 = X.DdZ.A00(r0)
            X.JVC r0 = r1.A0A
            X.26t r0 = r0.A00
            X.0xa r5 = r0.A00
            java.lang.String r0 = "KEY_COIN_FLIP_INTRO_ON_PROFILE_ENALBED"
            java.lang.String r0 = X.002.A0R(r0, r3)
            boolean r17 = r5.getBoolean(r0, r6)
            com.instagram.avatars.coinflip.AvatarCoinFlipConfig r9 = new com.instagram.avatars.coinflip.AvatarCoinFlipConfig
            r18 = r2
            r19 = r2
            r20 = r2
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
        L_0x0410:
            X.6p7 r0 = new X.6p7
            r0.<init>(r9, r3)
        L_0x0415:
            X.3Ih r4 = X.Dba.A0S(r0, r4)
        L_0x0419:
            boolean r0 = r4 instanceof X.C239793Ih
            if (r0 != 0) goto L_0x0a7b
            boolean r0 = r4 instanceof X.C297815sO
            if (r0 == 0) goto L_0x0471
            X.05G r1 = r1.A0D
            X.6p8 r0 = X.C318546p8.A00
            goto L_0x074f
        L_0x0427:
            int r0 = r5.size()
            if (r0 != r6) goto L_0x0444
            com.instagram.common.session.UserSession r0 = r1.A09
            boolean r0 = X.DcE.A06(r0, r2)
            if (r0 == 0) goto L_0x0444
            java.lang.Object r0 = r5.get(r2)
            X.6tD r0 = (X.C320936tD) r0
            com.instagram.avatars.coinflip.AvatarCoinFlipSticker r11 = X.DdZ.A00(r0)
            java.lang.Object r0 = r5.get(r2)
            goto L_0x03ef
        L_0x0444:
            r9 = 0
            goto L_0x0410
        L_0x0446:
            r10 = 0
            goto L_0x03b1
        L_0x0449:
            X.05G r4 = r1.A0D
            X.6p8 r0 = X.C318546p8.A00
            goto L_0x0415
        L_0x044e:
            boolean r0 = r4 instanceof X.C297815sO
            if (r0 != 0) goto L_0x0419
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0457:
            X.0eS.A00(r4)
            java.lang.Object r5 = r0.A01
            java.lang.Object r2 = r0.A02
            X.DdZ r2 = (X.DdZ) r2
            com.instagram.common.session.UserSession r4 = r2.A09
            java.lang.String r3 = r0.A05
            java.lang.String r2 = r0.A04
            r0.A01 = r5
            r0.A00 = r6
            java.lang.Object r4 = X.JVC.A00(r4, r3, r2, r0)
            if (r4 != r1) goto L_0x0362
            return r1
        L_0x0471:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0476:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x047b:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r3 = 1
            if (r2 == 0) goto L_0x04aa
            if (r2 != r3) goto L_0x04bc
            X.0eS.A00(r4)
        L_0x0487:
            X.5vi r1 = X.C299715vi.A00
            boolean r1 = X.0qQ.A0K(r4, r1)
            if (r1 == 0) goto L_0x0a7b
            java.lang.Object r2 = r0.A02
            X.2YL r2 = (X.2YL) r2
            java.lang.String r5 = r0.A05
            java.lang.String r4 = r0.A04
            java.lang.Object r3 = r0.A01
            X.6oS r0 = X.C318116oQ.A00(r2)
            r6 = 0
            r7 = 10
            X.JVS r1 = new X.JVS
            r1.<init>(r2, r3, r4, r5, r6, r7)
            X.AnonymousClass7TE.A1Z(r1, r0)
            goto L_0x0a7b
        L_0x04aa:
            X.0eS.A00(r4)
            java.lang.Object r2 = r0.A02
            X.DdZ r2 = (X.DdZ) r2
            com.instagram.avatars.store.AvatarStore r2 = r2.A07
            r0.A00 = r3
            java.lang.Object r4 = r2.A01(r0)
            if (r4 != r1) goto L_0x0487
            return r1
        L_0x04bc:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x04c1:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r6 = 1
            if (r2 == 0) goto L_0x04cf
            if (r2 == r6) goto L_0x0a1c
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x04cf:
            X.0eS.A00(r4)
            java.lang.Object r5 = r0.A02
            com.instagram.login.credentialmanager.CredentialManagerSaveHelper r5 = (com.instagram.login.credentialmanager.CredentialManagerSaveHelper) r5
            java.lang.String r4 = r0.A05
            java.lang.String r3 = r0.A04
            java.lang.Object r2 = r0.A01
            X.EuZ r2 = (X.C49371EuZ) r2
            r0.A00 = r6
            java.lang.Object r2 = com.instagram.login.credentialmanager.CredentialManagerSaveHelper.A00(r5, r2, r4, r3, r0)
            goto L_0x0a59
        L_0x04e6:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r3 = 1
            if (r2 == 0) goto L_0x04f4
            if (r2 == r3) goto L_0x0a1c
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x04f4:
            X.0eS.A00(r4)
            java.lang.Object r5 = r0.A02
            com.instagram.leadads.activity.LeadAdsActivity r5 = (com.instagram.leadads.activity.LeadAdsActivity) r5
            X.0eM r2 = r5.A0B
            java.lang.Object r2 = r2.getValue()
            X.JgX r2 = (X.C60152JgX) r2
            X.0r6 r2 = r2.A02
            java.lang.String r6 = r0.A05
            java.lang.String r7 = r0.A04
            r8 = 0
            r9 = 5
            X.Pfh r4 = new X.Pfh
            r4.<init>(r5, r6, r7, r8, r9)
            r0.A00 = r3
            java.lang.Object r2 = X.AnonymousClass11O.A00(r0, r4, r2)
            goto L_0x0a59
        L_0x0518:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r8 = 1
            if (r2 == 0) goto L_0x0526
            if (r2 == r8) goto L_0x0a1c
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0526:
            X.0eS.A00(r4)
            java.lang.Object r7 = r0.A01
            X.0r6 r7 = (X.AnonymousClass0r6) r7
            java.lang.String r6 = r0.A05
            java.lang.String r5 = r0.A04
            java.lang.Object r4 = r0.A02
            r3 = 0
            X.MCS r2 = new X.MCS
            r2.<init>(r4, r6, r5, r3)
            r0.A00 = r8
            java.lang.Object r2 = r7.collect(r2, r0)
            goto L_0x0a59
        L_0x0541:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r6 = 1
            if (r2 == 0) goto L_0x0554
            if (r2 != r6) goto L_0x054f
            X.0eS.A00(r4)     // Catch:{ Exception -> 0x0587 }
            goto L_0x0a7b
        L_0x054f:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0554:
            X.0eS.A00(r4)
            java.lang.Object r2 = r0.A02     // Catch:{ Exception -> 0x0587 }
            X.Mot r2 = (X.C67499Mot) r2     // Catch:{ Exception -> 0x0587 }
            com.instagram.common.session.UserSession r4 = r2.A01     // Catch:{ Exception -> 0x0587 }
            r2 = 8
            X.Plm r3 = new X.Plm     // Catch:{ Exception -> 0x0587 }
            r3.<init>(r4, r2)     // Catch:{ Exception -> 0x0587 }
            java.lang.Class<com.instagram.direct.msys.mailbox.core.mutation.MsysMessageEditor> r2 = com.instagram.direct.msys.mailbox.core.mutation.MsysMessageEditor.class
            java.lang.Object r5 = r4.A01(r2, r3)     // Catch:{ Exception -> 0x0587 }
            com.instagram.direct.msys.mailbox.core.mutation.MsysMessageEditor r5 = (com.instagram.direct.msys.mailbox.core.mutation.MsysMessageEditor) r5     // Catch:{ Exception -> 0x0587 }
            java.lang.Object r4 = r0.A01     // Catch:{ Exception -> 0x0587 }
            X.3t2 r4 = (X.C254783t2) r4     // Catch:{ Exception -> 0x0587 }
            r2 = 374(0x176, float:5.24E-43)
            java.lang.String r2 = X.C66579MXk.A00(r2)     // Catch:{ Exception -> 0x0587 }
            X.0qQ.A0C(r4, r2)     // Catch:{ Exception -> 0x0587 }
            X.9HR r4 = (X.AnonymousClass9HR) r4     // Catch:{ Exception -> 0x0587 }
            java.lang.String r3 = r0.A04     // Catch:{ Exception -> 0x0587 }
            java.lang.String r2 = r0.A05     // Catch:{ Exception -> 0x0587 }
            r0.A00 = r6     // Catch:{ Exception -> 0x0587 }
            java.lang.Object r2 = r5.A00(r4, r3, r2, r0)     // Catch:{ Exception -> 0x0587 }
            goto L_0x0a59
        L_0x0587:
            r3 = move-exception
            X.0wj r2 = X.0wj.A01
            r1 = 20134884(0x1333be4, float:3.2920077E-38)
            java.lang.String r0 = "Failed to send edit message. Error: "
            java.lang.String r0 = X.AnonymousClass7TF.A0m(r0, r3)
            r2.AEf(r0, r1)
            goto L_0x0a7b
        L_0x0598:
            X.0eS.A00(r4)
            java.lang.Object r5 = r0.A02
            X.JTj r5 = (X.C59678JTj) r5
            java.lang.Object r4 = r0.A01
            com.instagram.common.session.UserSession r4 = (com.instagram.common.session.UserSession) r4
            java.lang.String r3 = r0.A04
            java.lang.String r2 = r0.A05
            int r1 = r0.A00
            java.lang.Object r0 = r5.A01
            X.4dm r0 = (X.C268654dm) r0
            X.LPX.A01(r0, r4, r3, r2, r1)
            goto L_0x0a7b
        L_0x05b2:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r6 = 2
            r5 = 1
            r3 = 0
            if (r2 == 0) goto L_0x05c8
            if (r2 == r5) goto L_0x05c4
            if (r2 == r6) goto L_0x05c4
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x05c4:
            X.0eS.A00(r4)
            return r4
        L_0x05c8:
            X.0eS.A00(r4)
            java.lang.Object r2 = r0.A01
            int r2 = X.AnonymousClass7TE.A0M(r2)
            if (r2 == r3) goto L_0x05f4
            if (r2 == r5) goto L_0x05e3
            if (r2 != r6) goto L_0x05de
            java.lang.String r0 = "Surface unknown"
            X.5sO r4 = X.C41845B3m.A0c(r0)
            return r4
        L_0x05de:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x05e3:
            java.lang.Object r2 = r0.A02
            X.KWT r2 = (X.KWT) r2
            com.instagram.creator.ghostwriter.graphql.GhostWriterGraphQLDataSource r4 = r2.A00
            java.lang.String r3 = r0.A05
            java.lang.String r2 = r0.A04
            r0.A00 = r6
            java.lang.Object r4 = r4.A01(r3, r2, r0)
            goto L_0x0604
        L_0x05f4:
            java.lang.Object r2 = r0.A02
            X.KWT r2 = (X.KWT) r2
            com.instagram.creator.ghostwriter.graphql.GhostWriterGraphQLDataSource r4 = r2.A00
            java.lang.String r3 = r0.A05
            java.lang.String r2 = r0.A04
            r0.A00 = r5
            java.lang.Object r4 = r4.A00(r3, r2, r0)
        L_0x0604:
            if (r4 != r1) goto L_0x0619
            return r1
        L_0x0607:
            X.0eS.A00(r4)
        L_0x060a:
            java.lang.Object r0 = r0.A02
            com.meta.metaai.writewithai.creation.impl.viewmodel.WriteWithAICreationViewModel r0 = (com.meta.metaai.writewithai.creation.impl.viewmodel.WriteWithAICreationViewModel) r0
            X.05G r1 = r0.A09
            X.HtX r0 = r0.A08()
            r1.Epw(r0)
            X.0gF r4 = X.C60340gF.A00
        L_0x0619:
            return r4
        L_0x061a:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r7 = 1
            if (r2 == 0) goto L_0x0628
            if (r2 == r7) goto L_0x0a1c
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0628:
            X.0eS.A00(r4)
            java.lang.Object r2 = r0.A02
            X.GhM r2 = (X.C53031GhM) r2
            X.0V2 r6 = r2.A04
            java.lang.Object r5 = r0.A01
            X.1Xj r5 = (X.1Xj) r5
            java.lang.String r4 = r0.A04
            java.lang.String r3 = r0.A05
            X.KPq r2 = new X.KPq
            r2.<init>(r5, r4, r3)
            r0.A00 = r7
            java.lang.Object r2 = r6.emit(r2, r0)
            goto L_0x0a59
        L_0x0646:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r6 = 1
            if (r2 == 0) goto L_0x0654
            if (r2 == r6) goto L_0x0a1c
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0654:
            X.0eS.A00(r4)
            java.lang.Object r7 = r0.A02
            X.L6S r7 = (X.L6S) r7
            java.lang.Object r4 = r0.A01
            com.instagram.common.gallery.Medium r4 = (com.instagram.common.gallery.Medium) r4
            java.lang.String r9 = r0.A05
            java.lang.String r5 = r0.A04
            r0.A00 = r6
            java.lang.String r3 = X.JTQ.A0Z()
            r2 = 0
            X.3Q2 r8 = X.AnonymousClass9T3.A01(r3)
            java.lang.String r3 = r4.A0X
            r8.A33 = r3
            r8.A3L = r3
            r8.A0K = r6
            com.instagram.pendingmedia.model.constants.ShareType r3 = com.instagram.pendingmedia.model.constants.ShareType.POTATO
            r8.A0e(r3)
            r3 = 18
            r8.A0N = r3
            X.3QO r3 = X.AnonymousClass3QO.MUTUAL_FOLLOWERS
            r8.A0U(r3)
            X.0iw r3 = r7.A00
            java.lang.String r3 = r3.getModuleName()
            r8.A3e = r3
            X.1iA r3 = X.1iA.A0Q
            r8.A0V(r3)
            r4 = 2
            X.Jvb r3 = new X.Jvb
            r3.<init>(r5, r9, r2, r4)
            r8.A0p = r3
            X.1v5 r3 = new X.1v5
            r3.<init>()
            r8.A0a(r3)
            boolean r3 = r8.A12()
            if (r3 != 0) goto L_0x0a59
            X.1ua r5 = r7.A02
            r5.A0E(r8)
            java.lang.String r3 = r8.A3t
            X.3Pl r4 = X.JTQ.A0m(r0)
            com.instagram.common.session.UserSession r0 = r7.A01
            X.3Q2 r3 = X.JTQ.A0M(r0, r3)
            if (r3 != 0) goto L_0x06c3
            r4.resumeWith(r2)
        L_0x06bd:
            java.lang.Object r2 = r4.A00()
            goto L_0x0a59
        L_0x06c3:
            java.lang.String r0 = r3.A35
            r5.A07(r2, r0, r6)
            r5.A0B(r3)
            goto L_0x06bd
        L_0x06cc:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r5 = 2
            r3 = 1
            if (r2 == 0) goto L_0x0768
            if (r2 == r3) goto L_0x0764
            if (r2 != r5) goto L_0x07b4
            X.0eS.A00(r4)
        L_0x06db:
            X.3Ii r4 = (X.C239803Ii) r4
            java.lang.Object r2 = r0.A02
            X.8IN r2 = (X.AnonymousClass8IN) r2
            boolean r0 = r4 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x075b
            X.3Ih r4 = (X.C239793Ih) r4
            java.lang.Object r1 = r4.A00
            X.CGO r1 = (X.CGO) r1
            java.util.List r0 = r1.A05
            int r0 = r0.size()
            if (r0 < r3) goto L_0x0756
            java.util.List r0 = r1.A05
            r9 = 0
            java.lang.Object r0 = r0.get(r9)
            X.JZC r0 = (X.JZC) r0
            com.instagram.api.schemas.TrackDataImpl r0 = r0.A08
            if (r0 == 0) goto L_0x0756
            java.util.List r0 = r1.A05
            java.lang.Object r4 = r0.get(r9)
            X.JZC r4 = (X.JZC) r4
            X.05G r1 = r2.A02
            X.0qQ.A0B(r4, r3)
            com.instagram.api.schemas.TrackDataImpl r0 = r4.A08
            r10 = 0
            com.instagram.music.common.model.MusicAssetModel r5 = com.instagram.music.common.model.MusicAssetModel.A01(r0, r9)
            com.instagram.api.schemas.TrackDataImpl r0 = r4.A08
            if (r0 == 0) goto L_0x0754
            java.util.List r0 = r0.A0M
            if (r0 == 0) goto L_0x0754
            java.lang.Object r0 = X.00k.A0J(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x0754
            int r8 = r0.intValue()
        L_0x0728:
            com.instagram.api.schemas.TrackMetadata r0 = r4.A0A
            if (r0 == 0) goto L_0x0730
            boolean r10 = r0.getAllowMediaCreationWithMusic()
        L_0x0730:
            r4 = 0
            com.instagram.music.common.config.MusicAttributionConfig r3 = new com.instagram.music.common.config.MusicAttributionConfig
            r6 = r4
            r7 = r4
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            r1.Epw(r3)
            X.05G r1 = r2.A01
            X.8IO r0 = X.AnonymousClass8IO.SUCCESS
        L_0x073f:
            X.3Ih r4 = X.Dba.A0S(r0, r1)
        L_0x0743:
            boolean r0 = r4 instanceof X.C239793Ih
            if (r0 != 0) goto L_0x0a7b
            boolean r0 = r4 instanceof X.C297815sO
            if (r0 == 0) goto L_0x07af
            X.05G r1 = r2.A01
            X.8IO r0 = X.AnonymousClass8IO.FAILED
        L_0x074f:
            r1.Epw(r0)
            goto L_0x0a7b
        L_0x0754:
            r8 = 0
            goto L_0x0728
        L_0x0756:
            X.05G r1 = r2.A01
            X.8IO r0 = X.AnonymousClass8IO.NOT_AVAILABLE
            goto L_0x073f
        L_0x075b:
            boolean r0 = r4 instanceof X.C297815sO
            if (r0 != 0) goto L_0x0743
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0764:
            X.0eS.A00(r4)
            goto L_0x07a1
        L_0x0768:
            X.0eS.A00(r4)
            java.lang.Object r2 = r0.A02
            X.8IN r2 = (X.AnonymousClass8IN) r2
            X.05G r4 = r2.A01
            X.8IO r2 = X.AnonymousClass8IO.LOADING
            r4.Epw(r2)
            java.lang.Object r7 = r0.A01
            com.instagram.common.session.UserSession r7 = (com.instagram.common.session.UserSession) r7
            java.lang.String r4 = r0.A05
            java.lang.String r10 = r0.A04
            X.27r r2 = X.27p.A01(r7)
            X.29H r2 = r2.A03
            java.lang.String r11 = r2.A07
            r0.A00 = r3
            java.lang.String r2 = "ISRC:"
            java.lang.String r8 = X.002.A0R(r2, r4)
            com.instagram.api.schemas.MusicProduct r6 = com.instagram.api.schemas.MusicProduct.CLIPS_CAMERA_FORMAT_V2
            r9 = 0
            r12 = 0
            X.0qQ.A0B(r7, r12)
            X.DbW.A1N(r8, r3, r6)
            r13 = r12
            X.1NY r2 = X.LSH.A00(r6, r7, r8, r9, r10, r11, r12, r13)
            X.1OC r4 = r2.A0M()
        L_0x07a1:
            X.1OC r4 = (X.1OC) r4
            r0.A00 = r5
            r2 = 255394061(0xf39010d, float:9.1214066E-30)
            java.lang.Object r4 = r4.A00(r2, r0)
            if (r4 != r1) goto L_0x06db
            return r1
        L_0x07af:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x07b4:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x07b9:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r3 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L_0x07cd
            if (r2 == r6) goto L_0x0805
            if (r2 == r5) goto L_0x0833
            if (r2 == r3) goto L_0x0a1c
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x07cd:
            X.0eS.A00(r4)
            java.lang.Object r4 = r0.A01
            X.4Cq r4 = (X.C262224Cq) r4
            java.lang.Object r9 = r0.A02
            com.instagram.comments.mvvm.data.MediaCommentListRepository r9 = (com.instagram.comments.mvvm.data.MediaCommentListRepository) r9
            X.7aH r2 = X.C51968G9o.A0g(r9)
            java.lang.String r11 = r0.A05
            java.lang.String r12 = r0.A04
            X.7dj r7 = X.C335067cK.A01(r2, r11, r12)
            if (r7 == 0) goto L_0x0a7b
            X.7de r2 = r7.A05
            java.lang.Integer r10 = X.AnonymousClass05K.A0Y
            r13 = 0
            r14 = 4
            X.MGN r8 = new X.MGN
            r8.<init>(r9, r10, r11, r12, r13, r14)
            X.AnonymousClass7TE.A1Z(r8, r4)
            com.instagram.common.session.UserSession r8 = r9.A0B
            X.GmL r4 = r9.A04
            java.lang.String r4 = r4.A0E
            r0.A01 = r2
            r0.A00 = r6
            java.lang.Object r4 = com.instagram.comments.mvvm.data.network.UnhideActionNetworkRequestsKt.A01(r7, r8, r4, r0)
            if (r4 != r1) goto L_0x080c
            return r1
        L_0x0805:
            java.lang.Object r2 = r0.A01
            X.7de r2 = (X.C335857de) r2
            X.0eS.A00(r4)
        L_0x080c:
            java.lang.Object r9 = r0.A02
            com.instagram.comments.mvvm.data.MediaCommentListRepository r9 = (com.instagram.comments.mvvm.data.MediaCommentListRepository) r9
            java.lang.String r8 = r0.A05
            java.lang.String r7 = r0.A04
            boolean r6 = r4 instanceof X.C239793Ih
            if (r6 == 0) goto L_0x082a
            java.lang.Integer r11 = X.AnonymousClass05K.A00
            X.7de r10 = X.C335857de.A04
            r0.A01 = r2
            r0.A00 = r5
            r12 = r8
            r13 = r7
            r14 = r0
            java.lang.Object r4 = com.instagram.comments.mvvm.data.MediaCommentListRepository.A03(r9, r10, r11, r12, r13, r14)
            if (r4 != r1) goto L_0x083a
            return r1
        L_0x082a:
            boolean r5 = r4 instanceof X.C297815sO
            if (r5 != 0) goto L_0x083e
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0833:
            java.lang.Object r2 = r0.A01
            X.7de r2 = (X.C335857de) r2
            X.0eS.A00(r4)
        L_0x083a:
            X.3Ih r4 = X.C51967G9n.A0d()
        L_0x083e:
            java.lang.Object r8 = r0.A02
            com.instagram.comments.mvvm.data.MediaCommentListRepository r8 = (com.instagram.comments.mvvm.data.MediaCommentListRepository) r8
            java.lang.String r7 = r0.A05
            java.lang.String r6 = r0.A04
            boolean r5 = r4 instanceof X.C239793Ih
            if (r5 != 0) goto L_0x0a7b
            boolean r4 = r4 instanceof X.C297815sO
            if (r4 == 0) goto L_0x085f
            java.lang.Integer r10 = X.AnonymousClass05K.A00
            r4 = 0
            r0.A01 = r4
            r0.A00 = r3
            r9 = r2
            r11 = r7
            r12 = r6
            r13 = r0
            java.lang.Object r2 = com.instagram.comments.mvvm.data.MediaCommentListRepository.A03(r8, r9, r10, r11, r12, r13)
            goto L_0x0a59
        L_0x085f:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0864:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r5 = 1
            if (r2 == 0) goto L_0x0872
            if (r2 == r5) goto L_0x0a1c
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0872:
            X.0eS.A00(r4)
            java.lang.Object r6 = r0.A02
            com.instagram.comments.mvvm.data.MediaCommentListRepository r6 = (com.instagram.comments.mvvm.data.MediaCommentListRepository) r6
            java.lang.String r3 = r0.A05
            java.lang.String r2 = r0.A04
            java.lang.Object r8 = r0.A01
            java.lang.Integer r8 = (java.lang.Integer) r8
            X.7de r7 = X.C335857de.A04
            r0.A00 = r5
            r9 = r3
            r10 = r2
            r11 = r0
            java.lang.Object r2 = com.instagram.comments.mvvm.data.MediaCommentListRepository.A03(r6, r7, r8, r9, r10, r11)
            goto L_0x0a59
        L_0x088e:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r8 = 3
            r9 = 2
            r3 = 1
            if (r2 == 0) goto L_0x08a2
            if (r2 == r3) goto L_0x08ce
            if (r2 == r9) goto L_0x08e7
            if (r2 == r8) goto L_0x0a1c
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x08a2:
            X.0eS.A00(r4)
            java.lang.Object r10 = r0.A02
            com.instagram.comments.mvvm.data.MediaCommentListRepository r10 = (com.instagram.comments.mvvm.data.MediaCommentListRepository) r10
            X.7aH r2 = X.C51968G9o.A0g(r10)
            java.lang.String r7 = r0.A05
            java.lang.String r6 = r0.A04
            X.7dj r5 = X.C335067cK.A01(r2, r7, r6)
            if (r5 == 0) goto L_0x090f
            X.7df r2 = r5.A00
            X.7df r4 = X.C335867df.APPROVED
            if (r2 == r4) goto L_0x090f
            r0.A01 = r5
            r0.A00 = r3
            r3 = 5
            X.PmU r2 = new X.PmU
            r2.<init>(r4, r6, r7, r3)
            java.lang.Object r2 = X.JTQ.A0X(r10, r1, r0, r2)
            if (r2 != r1) goto L_0x08d5
            return r1
        L_0x08ce:
            java.lang.Object r5 = r0.A01
            X.7dj r5 = (X.C335907dj) r5
            X.0eS.A00(r4)
        L_0x08d5:
            java.lang.Object r2 = r0.A02
            com.instagram.comments.mvvm.data.MediaCommentListRepository r2 = (com.instagram.comments.mvvm.data.MediaCommentListRepository) r2
            com.instagram.common.session.UserSession r3 = r2.A0B
            r2 = 0
            r0.A01 = r2
            r0.A00 = r9
            java.lang.Object r4 = com.instagram.comments.mvvm.data.network.RestrictedCommentNetworkRequestsKt.A00(r5, r3, r0)
            if (r4 != r1) goto L_0x08ea
            return r1
        L_0x08e7:
            X.0eS.A00(r4)
        L_0x08ea:
            java.lang.Object r7 = r0.A02
            com.instagram.comments.mvvm.data.MediaCommentListRepository r7 = (com.instagram.comments.mvvm.data.MediaCommentListRepository) r7
            java.lang.String r6 = r0.A05
            java.lang.String r5 = r0.A04
            boolean r2 = r4 instanceof X.C239793Ih
            if (r2 != 0) goto L_0x0a7b
            boolean r2 = r4 instanceof X.C297815sO
            if (r2 == 0) goto L_0x090a
            X.7df r4 = X.C335867df.RESTRICT_PENDING_CONTENT
            r0.A00 = r8
            r3 = 5
            X.PmU r2 = new X.PmU
            r2.<init>(r4, r5, r6, r3)
            java.lang.Object r2 = X.JTQ.A0X(r7, r1, r0, r2)
            goto L_0x0a59
        L_0x090a:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x090f:
            X.0wj r2 = X.0wj.A01
            r1 = 817892535(0x30c00cb7, float:1.3973452E-9)
            r0 = 944(0x3b0, float:1.323E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)
            X.0f9 r2 = r2.AEf(r0, r1)
            java.lang.String r1 = "reveal_click"
            java.lang.String r0 = "Reveal clicked but comment is not pending."
            r2.ABQ(r1, r0)
            r2.report()
            goto L_0x0a7b
        L_0x092a:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r5 = 1
            if (r2 == 0) goto L_0x0938
            if (r2 == r5) goto L_0x09a5
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0938:
            X.0eS.A00(r4)
            java.lang.Object r4 = r0.A01
            com.instagram.common.session.UserSession r4 = (com.instagram.common.session.UserSession) r4
            r2 = 0
            X.GPq r3 = new X.GPq
            r3.<init>(r4, r2)
            java.lang.String r7 = r0.A04
            r4 = 0
            X.0qQ.A0B(r7, r4)
            int r6 = r7.hashCode()
            r2 = -1249886828(0xffffffffb5803d94, float:-9.554665E-7)
            if (r6 == r2) goto L_0x0996
            r2 = 791971135(0x2f34853f, float:1.6418243E-10)
            if (r6 == r2) goto L_0x0987
            r2 = 2104228359(0x7d6bfa07, float:1.9604175E37)
            if (r6 != r2) goto L_0x096f
            r2 = 467(0x1d3, float:6.54E-43)
            java.lang.String r2 = X.C66579MXk.A00(r2)
            boolean r2 = r7.equals(r2)
            if (r2 == 0) goto L_0x096f
            X.HOt r2 = X.C54688HOt.A0m
        L_0x096c:
            X.C52369GPq.A01(r2, r3)
        L_0x096f:
            java.lang.Object r7 = r0.A02
            X.H2d r7 = (X.C54183H2d) r7
            X.H2T r2 = r7.A01
            X.0Ud r6 = r2.A03
            java.lang.String r3 = r0.A05
            X.IkO r2 = new X.IkO
            r2.<init>(r3, r7, r4)
            r0.A00 = r5
            java.lang.Object r0 = r6.collect(r2, r0)
            if (r0 != r1) goto L_0x09a8
            return r1
        L_0x0987:
            r2 = 4392(0x1128, float:6.155E-42)
            java.lang.String r2 = X.AnonymousClass000.A00(r2)
            boolean r2 = r7.equals(r2)
            if (r2 == 0) goto L_0x096f
            X.HOt r2 = X.C54688HOt.A0r
            goto L_0x096c
        L_0x0996:
            r2 = 4399(0x112f, float:6.164E-42)
            java.lang.String r2 = X.AnonymousClass000.A00(r2)
            boolean r2 = r7.equals(r2)
            if (r2 == 0) goto L_0x096f
            X.HOt r2 = X.C54688HOt.A0u
            goto L_0x096c
        L_0x09a5:
            X.0eS.A00(r4)
        L_0x09a8:
            X.MCr r0 = X.C51965G9l.A0x()
            throw r0
        L_0x09ad:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r5 = 1
            if (r2 == 0) goto L_0x09bb
            if (r2 == r5) goto L_0x0a1c
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x09bb:
            X.0eS.A00(r4)
            java.lang.Object r11 = r0.A01
            X.3pV r11 = (X.C252683pV) r11
            java.lang.Object r8 = r0.A02
            X.Uq1 r8 = (X.C16176Uq1) r8
            java.util.Map r2 = r8.A00
            java.lang.String r9 = r0.A05
            boolean r2 = r2.containsKey(r9)
            if (r2 == 0) goto L_0x09e2
            java.util.Map r2 = r8.A00
            java.lang.Object r2 = X.0Yt.A01(r9, r2)
            X.C301205yj.A00(r2, r11)
        L_0x09d9:
            X.MJv r2 = X.C66234MJv.A00
            r0.A00 = r5
            java.lang.Object r2 = X.C239083Et.A00(r0, r2, r11)
            goto L_0x0a59
        L_0x09e2:
            com.instagram.common.session.UserSession r6 = r8.A01
            X.WGU r2 = X.WGU.A00(r6)
            java.lang.String r4 = r2.A03
            java.lang.String r3 = r0.A04
            java.lang.String r2 = ""
            X.1OC r3 = X.W2V.A03(r6, r2, r4, r3, r9)
            r2 = 2061(0x80d, float:2.888E-42)
            java.lang.String r2 = X.AnonymousClass000.A00(r2)
            java.lang.String r10 = X.W2x.A01(r2)
            X.WGU r7 = X.WGU.A00(r6)
            X.UcU r6 = new X.UcU
            r6.<init>(r7, r8, r9, r10, r11)
            r3.A00 = r6
            r2 = 1334337496(0x4f885fd8, float:4.5759652E9)
            X.1ES.A06(r3, r2, r5)
            goto L_0x09d9
        L_0x0a0e:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r8 = 1
            if (r2 == 0) goto L_0x0a20
            if (r2 == r8) goto L_0x0a1c
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0a1c:
            X.0eS.A00(r4)
            goto L_0x0a7b
        L_0x0a20:
            X.0eS.A00(r4)
            java.lang.Object r7 = r0.A01
            X.3pV r7 = (X.C252683pV) r7
            java.lang.Object r9 = r0.A02
            X.LFO r9 = (X.LFO) r9
            X.1a8 r10 = r9.A02
            X.T7R r6 = r9.A05
            android.app.Activity r5 = r9.A00
            r2 = 150(0x96, float:2.1E-43)
            java.lang.String r4 = X.Pxd.A00(r2)
            r3 = 0
            X.Jvk r2 = new X.Jvk
            r2.<init>(r4, r3)
            X.1aU r5 = r6.A00(r5, r2)
            java.lang.String r4 = r0.A05
            java.lang.String r3 = r0.A04
            X.M1Q r2 = new X.M1Q
            r2.<init>(r9, r4, r3, r7)
            r10.A02(r5, r2)
            r2 = 49
            X.MMK r2 = X.MMK.A00(r9, r2)
            r0.A00 = r8
            java.lang.Object r2 = X.C239083Et.A00(r0, r2, r7)
        L_0x0a59:
            if (r2 != r1) goto L_0x0a7b
            return r1
        L_0x0a5c:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r11 = 1
            if (r2 == 0) goto L_0x0a7e
            if (r2 != r11) goto L_0x0af2
            X.0eS.A00(r4)
        L_0x0a68:
            boolean r1 = r4 instanceof X.C239793Ih
            if (r1 != 0) goto L_0x0a7b
            boolean r1 = r4 instanceof X.C297815sO
            if (r1 == 0) goto L_0x0a7b
            java.lang.Object r2 = r0.A02
            X.HDm r2 = (X.C54437HDm) r2
            java.lang.String r1 = r0.A04
            java.lang.String r0 = r0.A05
            X.C54437HDm.A00(r2, r1, r0, r11)
        L_0x0a7b:
            X.0gF r1 = X.C60340gF.A00
            return r1
        L_0x0a7e:
            X.0eS.A00(r4)
            r12 = 0
            X.2IS r5 = X.C41845B3m.A04()
            X.2IS r7 = X.C41845B3m.A04()
            java.util.concurrent.atomic.AtomicBoolean r2 = X.1Xj.A0i
            java.lang.String r2 = r0.A04
            java.lang.String r3 = X.1Xv.A06(r2)
            java.lang.String r2 = "media_id"
            boolean r6 = X.C41848B3p.A1Z(r5, r2, r3)
            java.lang.Object r2 = r0.A02
            X.HDm r2 = (X.C54437HDm) r2
            com.instagram.common.session.UserSession r4 = r2.A01
            java.lang.String r3 = r4.A06
            java.lang.String r2 = "user_id"
            r5.A04(r2, r3)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r11)
            r2 = 1513(0x5e9, float:2.12E-42)
            java.lang.String r2 = X.AnonymousClass000.A00(r2)
            r5.A02(r2, r3)
            r2 = 3316(0xcf4, float:4.647E-42)
            java.lang.String r3 = X.AnonymousClass000.A00(r2)
            java.lang.String r2 = "container_module"
            r5.A04(r2, r3)
            java.lang.Object r2 = r0.A01
            X.1Xj r2 = (X.1Xj) r2
            X.1Xy r2 = r2.A0C
            java.lang.String r3 = r2.getLoggingInfoToken()
            java.lang.String r2 = "ranking_info_token"
            r5.A04(r2, r3)
            r0.A00 = r11
            X.1vR r6 = X.C41845B3m.A06(r6)
            java.util.Map r8 = r5.getParamsCopy()
            java.util.Map r9 = r7.getParamsCopy()
            java.lang.Class<X.BYH> r10 = X.BYH.class
            java.util.ArrayList r16 = X.AnonymousClass7TE.A1C()
            java.lang.String r7 = "AlgoTuneUnhideMediaMutation"
            r13 = 0
            java.lang.String r15 = "xdt_text_app_unsend_negative_media_ranking_signal"
            com.facebook.pando.PandoGraphQLRequest r5 = new com.facebook.pando.PandoGraphQLRequest
            r14 = r12
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            java.lang.Object r4 = X.JTQ.A0W(r5, r4, r0)
            if (r4 != r1) goto L_0x0a68
            return r1
        L_0x0af2:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MGN.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((MGN) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MGN(UserSession userSession, String str, String str2, AnonymousClass4D7 r5, int i) {
        super(2, r5);
        this.A03 = 11;
        this.A01 = userSession;
        this.A04 = str;
        this.A05 = str2;
        this.A00 = i;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MGN(Object obj, Object obj2, String str, String str2, AnonymousClass4D7 r6, int i) {
        super(2, r6);
        this.A03 = i;
        this.A02 = obj;
        this.A05 = str;
        this.A04 = str2;
        this.A01 = obj2;
    }
}
