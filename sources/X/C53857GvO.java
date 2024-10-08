package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.GvO  reason: case insensitive filesystem */
public final class C53857GvO extends C251343mx {
    public final C267324bN A00;
    public final C52058GDe A01;
    public final UserSession A02;
    public final JTB A03;
    public final C52046GCs A04;
    public final Integer A05;
    public final boolean A06;
    public final int A07;
    public final 2WX A08;
    public final AnonymousClass4DU A09;

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0060, code lost:
        if (r10 != 2) goto L_0x0062;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0078, code lost:
        if (r13 == X.AnonymousClass05K.A00) goto L_0x007a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C251263mp A0X(X.AnonymousClass3Y5 r19) {
        /*
            r18 = this;
            r5 = 0
            r4 = r19
            X.0qQ.A0B(r4, r5)
            X.2V1 r0 = r4.A05
            r17 = r0
            android.content.Context r3 = r0.A0C
            android.content.res.Resources r0 = X.AnonymousClass7TF.A0A(r3)
            int r0 = X.AnonymousClass3ZC.A00(r0)
            r9 = r18
            int r2 = r9.A07
            float r6 = (float) r2
            float r1 = (float) r0
            r0 = 1048576000(0x3e800000, float:0.25)
            float r1 = r1 * r0
            r7 = 0
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x016e
            java.lang.Integer r13 = r9.A05
            int r10 = r13.intValue()
            if (r10 == r5) goto L_0x014e
            r0 = 1
            if (r10 == r0) goto L_0x013a
            r0 = 2
            if (r10 == r0) goto L_0x0120
            r0 = 3
            if (r10 != r0) goto L_0x0169
            X.4bN r12 = r9.A00
            X.1Xj r0 = r12.A02
            if (r0 == 0) goto L_0x016e
            X.1Xy r0 = r0.A0C
            X.41Z r0 = r0.BUC()
            if (r0 == 0) goto L_0x016e
            X.4hQ r0 = r0.B7C()
            if (r0 == 0) goto L_0x016e
            com.instagram.sponsored.signals.model.AdsRatingInfoIntf r0 = r0.Aa4()
            if (r0 == 0) goto L_0x016e
            java.lang.String r6 = r0.AyC()
        L_0x0051:
            if (r6 == 0) goto L_0x016e
            long r0 = X.C244013aV.A06(r4)
            if (r10 == r5) goto L_0x011b
            r3 = 1
            if (r10 == r3) goto L_0x0062
            r8 = 2
            r3 = 2131238007(0x7f081c77, float:1.809228E38)
            if (r10 == r8) goto L_0x0065
        L_0x0062:
            r3 = 2131238840(0x7f081fb8, float:1.809397E38)
        L_0x0065:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            if (r3 == 0) goto L_0x016e
            int r8 = r3.intValue()
            java.lang.Integer r10 = X.AnonymousClass05K.A01
            r16 = 1
            if (r13 == r10) goto L_0x007a
            java.lang.Integer r3 = X.AnonymousClass05K.A00
            r11 = 0
            if (r13 != r3) goto L_0x007b
        L_0x007a:
            r11 = 1
        L_0x007b:
            X.3XV r3 = X.2WX.A02
            java.lang.Integer r14 = X.AnonymousClass05K.A00
            X.2WX r14 = X.AnonymousClass9JR.A00(r7, r14, r5, r0)
            X.2WX r15 = X.AnonymousClass9JR.A00(r14, r10, r5, r0)
            java.lang.Integer r14 = X.AnonymousClass05K.A0D
            java.lang.String r0 = "clips_more_info_label_glyph_tag"
            r1 = 4
            X.2WX r15 = X.C51971G9r.A0Y(r15, r14, r0, r1)
            android.graphics.drawable.Drawable r14 = X.C51968G9o.A0K(r4, r8)
            r0 = 2131099843(0x7f0600c3, float:1.781205E38)
            X.C51973G9u.A0x(r14, r4, r0)
            X.GH5 r8 = new X.GH5
            r8.<init>(r14, r7, r15, r5)
            X.2WX r14 = X.C52199GIq.A00(r4)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r16)
            X.9JS r0 = X.C51965G9l.A0d(r10, r0, r1)
            if (r14 != r3) goto L_0x00ae
            r14 = r7
        L_0x00ae:
            X.2WX r10 = X.C51965G9l.A0X(r14, r0)
            r3 = 44
            X.Iwj r0 = new X.Iwj
            r0.<init>(r3, r9, r11)
            X.2WX r3 = X.C51972G9s.A0V(r10, r0)
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r13 != r0) goto L_0x00fe
            X.4DU r10 = r9.A09
            if (r10 == 0) goto L_0x00fe
            com.instagram.common.session.UserSession r1 = r9.A02
            X.3Ds r0 = X.C238863Ds.ATTRIBUTION_ROW_PILL
            X.2WX r3 = X.GFM.A01(r0, r3, r12, r1, r10)
            r0 = 2
            X.J6P r1 = X.J6P.A00(r9, r0)
            java.lang.Integer r0 = X.AnonymousClass05K.A0Y
            X.2WX r3 = X.C51971G9r.A0Z(r3, r0, r1, r7)
        L_0x00d8:
            X.2WX r9 = r9.A08
            long r0 = X.C51969G9p.A0G(r2)
            java.lang.Integer r2 = X.AnonymousClass05K.A0N
            X.2WX r0 = X.AnonymousClass9JR.A00(r7, r2, r5, r0)
            X.2WX r9 = r9.A00(r0)
            X.2Wb r2 = X.AnonymousClass7TG.A0S(r17)
            X.2V1 r0 = r2.A00
            X.2Wb r1 = X.G9t.A0v(r8, r0)
            X.2WW r0 = X.C52199GIq.A02(r1, r7, r6, r5)
            X.C51971G9r.A1E(r0, r1, r2, r3)
            X.2Tp r0 = X.C243563Zg.A0B(r2, r4, r9)
            return r0
        L_0x00fe:
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            if (r13 != r0) goto L_0x010e
            r0 = 3
            X.J6P r1 = X.J6P.A00(r9, r0)
            java.lang.Integer r0 = X.AnonymousClass05K.A0Y
            X.2WX r3 = X.C51971G9r.A0Z(r3, r0, r1, r7)
            goto L_0x00d8
        L_0x010e:
            if (r11 == 0) goto L_0x00d8
            X.J6P r1 = X.J6P.A00(r9, r1)
            java.lang.Integer r0 = X.AnonymousClass05K.A0Y
            X.2WX r3 = X.C51971G9r.A0Z(r3, r0, r1, r7)
            goto L_0x00d8
        L_0x011b:
            r3 = 2131238226(0x7f081d52, float:1.8092725E38)
            goto L_0x0065
        L_0x0120:
            X.4bN r12 = r9.A00
            X.1Xj r0 = r12.A02
            if (r0 == 0) goto L_0x016e
            X.1Xy r0 = r0.A0C
            X.41Z r0 = r0.BUC()
            if (r0 == 0) goto L_0x016e
            X.4hQ r0 = r0.B7C()
            if (r0 == 0) goto L_0x016e
            java.lang.String r6 = r0.AyB()
            goto L_0x0051
        L_0x013a:
            X.4bN r12 = r9.A00
            X.1Xj r0 = r12.A02
            if (r0 == 0) goto L_0x016e
            X.1Xy r0 = r0.A0C
            com.instagram.api.schemas.AppstoreMetadataDict r0 = r0.AcH()
            if (r0 == 0) goto L_0x016e
            java.lang.String r6 = X.C55061HbW.A00(r3, r0)
            goto L_0x0051
        L_0x014e:
            X.4bN r12 = r9.A00
            X.1Xj r0 = r12.A02
            if (r0 == 0) goto L_0x016e
            X.1Xy r0 = r0.A0C
            com.instagram.api.schemas.AppstoreMetadataDict r0 = r0.AcH()
            if (r0 == 0) goto L_0x016e
            r1 = 2131952954(0x7f13053a, float:1.9542365E38)
            java.lang.String r0 = r0.BHr()
            java.lang.String r6 = X.DbY.A0c(r3, r0, r1)
            goto L_0x0051
        L_0x0169:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x016e:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C53857GvO.A0X(X.3Y5):X.3mp");
    }

    public C53857GvO(2WX r2, C267324bN r3, C52058GDe gDe, UserSession userSession, AnonymousClass4DU r6, JTB jtb, C52046GCs gCs, Integer num, int i, boolean z) {
        AnonymousClass7TG.A1Q(gDe, userSession);
        0qQ.A0B(jtb, 6);
        this.A00 = r3;
        this.A01 = gDe;
        this.A02 = userSession;
        this.A05 = num;
        this.A08 = r2;
        this.A03 = jtb;
        this.A07 = i;
        this.A06 = z;
        this.A04 = gCs;
        this.A09 = r6;
    }
}
