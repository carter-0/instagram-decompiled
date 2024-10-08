package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.6M8  reason: invalid class name */
public final class AnonymousClass6M8 {
    public final float A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final boolean A05;
    public final boolean A06;
    public final UserSession A07;
    public final C255773uh A08;
    public final C250973mM A09;

    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0197, code lost:
        if (r1 == 840003) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001e, code lost:
        if (X.182.A06(X.0Tu.A05, r9, 36318617117137214L) == false) goto L_0x0020;
     */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00ab  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass6M8(com.instagram.common.session.UserSession r9, X.C255773uh r10, X.C250973mM r11) {
        /*
            r8 = this;
            r2 = 2
            r8.<init>()
            r8.A08 = r10
            r8.A09 = r11
            r8.A07 = r9
            boolean r7 = r10.A14()
            r6 = 1
            r5 = 0
            if (r7 != 0) goto L_0x0020
            X.0Tu r3 = X.0Tu.A05
            r0 = 36318617117137214(0x8107970000193e, double:3.031377935985843E-306)
            boolean r0 = X.182.A06(r3, r9, r0)
            r4 = 1
            if (r0 != 0) goto L_0x0021
        L_0x0020:
            r4 = 0
        L_0x0021:
            r8.A06 = r4
            if (r7 != 0) goto L_0x01a1
            X.0Tu r3 = X.0Tu.A05
            r0 = 36318617117202751(0x8107970001193f, double:3.0313779360272886E-306)
            boolean r0 = X.182.A06(r3, r9, r0)
            if (r0 == 0) goto L_0x01a1
        L_0x0032:
            r8.A05 = r6
            if (r4 != 0) goto L_0x0038
            if (r6 == 0) goto L_0x0044
        L_0x0038:
            X.0Tu r3 = X.0Tu.A05
            r0 = 36600092094041824(0x82079700030ee0, double:3.209383844789076E-306)
            long r0 = X.182.A01(r3, r9, r0)
            int r5 = (int) r0
        L_0x0044:
            r8.A04 = r5
            if (r7 == 0) goto L_0x0164
            r3 = 15
        L_0x004a:
            r8.A02 = r3
            boolean r0 = X.C297785sK.A0f(r10)
            if (r0 == 0) goto L_0x011a
            X.6LR r0 = r10.A0G()
            if (r0 == 0) goto L_0x01a4
            java.lang.Integer r0 = r0.A02
            if (r0 == 0) goto L_0x0160
            int r0 = r0.intValue()
        L_0x0060:
            float r0 = (float) r0
            r8.A00 = r0
            r4 = 2
            com.instagram.model.reels.Reel r3 = r11.A0H
            X.3mK r1 = X.C250953mK.TEXT_FONT_STYLE_TYPE
            java.lang.String r0 = r10.A0j
            X.0qQ.A07(r0)
            int r0 = r11.A04(r9, r0)
            java.util.Map r0 = r3.A0P(r0)
            java.lang.Object r1 = r0.get(r1)
            java.lang.Number r1 = (java.lang.Number) r1
            if (r1 == 0) goto L_0x0117
            r0 = 1100002(0x10c8e2, float:1.541431E-39)
            int r1 = r1.intValue()
            if (r1 != r0) goto L_0x00ad
            r4 = 1
        L_0x0087:
            r8.A01 = r4
            X.1Xj r0 = r10.A0b
            if (r0 == 0) goto L_0x00ab
            X.1Xy r0 = r0.A0C
            X.560 r0 = r0.C5H()
            if (r0 == 0) goto L_0x00ab
            com.instagram.api.schemas.IGStoryTextAlignmentTypeEnum r0 = r0.C4r()
            if (r0 == 0) goto L_0x00ab
            int r0 = r0.ordinal()
        L_0x009f:
            r3 = 1
            r1 = 3
            if (r0 == r1) goto L_0x00a9
            if (r0 != r2) goto L_0x00a6
            r3 = 4
        L_0x00a6:
            r8.A03 = r3
            return
        L_0x00a9:
            r3 = 6
            goto L_0x00a6
        L_0x00ab:
            r0 = -1
            goto L_0x009f
        L_0x00ad:
            r0 = 1100003(0x10c8e3, float:1.541433E-39)
            if (r1 == r0) goto L_0x0087
            r0 = 1100004(0x10c8e4, float:1.541434E-39)
            if (r1 != r0) goto L_0x00b9
            r4 = 3
            goto L_0x0087
        L_0x00b9:
            r0 = 1100005(0x10c8e5, float:1.541435E-39)
            if (r1 != r0) goto L_0x00c0
            r4 = 4
            goto L_0x0087
        L_0x00c0:
            r0 = 1100006(0x10c8e6, float:1.541437E-39)
            if (r1 != r0) goto L_0x00c7
            r4 = 5
            goto L_0x0087
        L_0x00c7:
            r0 = 1100007(0x10c8e7, float:1.541438E-39)
            if (r1 != r0) goto L_0x00ce
            r4 = 6
            goto L_0x0087
        L_0x00ce:
            r0 = 1100008(0x10c8e8, float:1.54144E-39)
            if (r1 != r0) goto L_0x00d5
            r4 = 7
            goto L_0x0087
        L_0x00d5:
            r0 = 1100009(0x10c8e9, float:1.541441E-39)
            if (r1 != r0) goto L_0x00dd
            r4 = 8
            goto L_0x0087
        L_0x00dd:
            r0 = 1100010(0x10c8ea, float:1.541442E-39)
            if (r1 != r0) goto L_0x00e5
            r4 = 9
            goto L_0x0087
        L_0x00e5:
            r0 = 1100011(0x10c8eb, float:1.541444E-39)
            if (r1 != r0) goto L_0x00ed
            r4 = 10
            goto L_0x0087
        L_0x00ed:
            r0 = 1100012(0x10c8ec, float:1.541445E-39)
            if (r1 != r0) goto L_0x00f5
            r4 = 11
            goto L_0x0087
        L_0x00f5:
            r0 = 1100013(0x10c8ed, float:1.541447E-39)
            if (r1 != r0) goto L_0x00fd
            r4 = 12
            goto L_0x0087
        L_0x00fd:
            r0 = 1100014(0x10c8ee, float:1.541448E-39)
            if (r1 != r0) goto L_0x0105
            r4 = 13
            goto L_0x0087
        L_0x0105:
            r0 = 1100015(0x10c8ef, float:1.54145E-39)
            if (r1 != r0) goto L_0x010e
            r4 = 14
            goto L_0x0087
        L_0x010e:
            r0 = 1100016(0x10c8f0, float:1.541451E-39)
            if (r1 != r0) goto L_0x0117
            r4 = 15
            goto L_0x0087
        L_0x0117:
            r4 = 0
            goto L_0x0087
        L_0x011a:
            com.instagram.model.reels.Reel r3 = r11.A0H
            X.3mK r1 = X.C250953mK.TEXT_FONT_SIZE_TYPE
            java.lang.String r0 = r10.A0j
            X.0qQ.A07(r0)
            int r0 = r11.A04(r9, r0)
            java.util.Map r0 = r3.A0P(r0)
            java.lang.Object r1 = r0.get(r1)
            java.lang.Number r1 = (java.lang.Number) r1
            if (r1 == 0) goto L_0x0160
            r0 = 1090001(0x10a1d1, float:1.527417E-39)
            int r1 = r1.intValue()
            if (r1 == r0) goto L_0x0160
            r0 = 1090002(0x10a1d2, float:1.527418E-39)
            if (r1 != r0) goto L_0x0145
            r0 = 20
            goto L_0x0060
        L_0x0145:
            r0 = 1090003(0x10a1d3, float:1.52742E-39)
            if (r1 != r0) goto L_0x014e
            r0 = 22
            goto L_0x0060
        L_0x014e:
            r0 = 1090004(0x10a1d4, float:1.527421E-39)
            if (r1 != r0) goto L_0x0157
            r0 = 24
            goto L_0x0060
        L_0x0157:
            r0 = 1090005(0x10a1d5, float:1.527422E-39)
            if (r1 != r0) goto L_0x0160
            r0 = 26
            goto L_0x0060
        L_0x0160:
            r0 = 18
            goto L_0x0060
        L_0x0164:
            r3 = 1
            com.instagram.model.reels.Reel r4 = r11.A0H
            X.3mK r1 = X.C250953mK.CAPTION_LENGTH_OPTIMIZATION_TYPE
            java.lang.String r0 = r10.A0j
            X.0qQ.A07(r0)
            int r0 = r11.A04(r9, r0)
            java.util.Map r0 = r4.A0P(r0)
            java.lang.Object r1 = r0.get(r1)
            java.lang.Number r1 = (java.lang.Number) r1
            if (r1 == 0) goto L_0x019e
            r0 = 840005(0xcd145, float:1.177098E-39)
            int r1 = r1.intValue()
            if (r1 == r0) goto L_0x019b
            r0 = 840002(0xcd142, float:1.177094E-39)
            if (r1 == r0) goto L_0x019b
            r0 = 840004(0xcd144, float:1.177096E-39)
            if (r1 != r0) goto L_0x0194
            r3 = 2
            goto L_0x004a
        L_0x0194:
            r0 = 840003(0xcd143, float:1.177095E-39)
            if (r1 != r0) goto L_0x019e
            goto L_0x004a
        L_0x019b:
            r3 = 3
            goto L_0x004a
        L_0x019e:
            r3 = 5
            goto L_0x004a
        L_0x01a1:
            r6 = 0
            goto L_0x0032
        L_0x01a4:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6M8.<init>(com.instagram.common.session.UserSession, X.3uh, X.3mM):void");
    }
}
