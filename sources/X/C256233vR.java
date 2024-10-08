package X;

import kotlin.Deprecated;

@Deprecated(message = "")
/* renamed from: X.3vR  reason: invalid class name and case insensitive filesystem */
public abstract class C256233vR {
    public static final 0bY A00 = new 1Q7("IgSecureUriParser").A00;

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0051, code lost:
        if ((!X.C61970qY.A0G(r0)) != false) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0092, code lost:
        if (X.182.A06(r3, r8, 2342165929888393900L) == false) goto L_0x0094;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0098, code lost:
        if (r1 != false) goto L_0x009a;
     */
    @kotlin.Deprecated(message = "")
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(com.instagram.common.session.UserSession r17, X.C256203vO r18) {
        /*
            r7 = 0
            r5 = 1
            X.0Tu r3 = X.0Tu.A05
            r0 = 36318355124131936(0x81075a00001860, double:3.031212250554344E-306)
            r8 = r17
            boolean r0 = X.182.A06(r3, r8, r0)
            r4 = r18
            if (r0 == 0) goto L_0x0030
            X.3WR r1 = r4.A07
            java.util.List r0 = r1.A06()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0030
            java.lang.String r0 = r1.A03()
            if (r0 != 0) goto L_0x0030
            X.57m r0 = r1.A07
            if (r0 != 0) goto L_0x0030
            java.lang.String r0 = r1.A02()
            if (r0 != 0) goto L_0x0030
        L_0x002f:
            return
        L_0x0030:
            X.3WR r9 = r4.A07
            boolean r1 = r9.A0U
            if (r1 == 0) goto L_0x0053
            boolean r0 = X.C238173Av.A00(r8)
            if (r0 != 0) goto L_0x0053
            X.1Q4 r0 = X.1Q3.A00(r8)
            boolean r0 = r0.A01()
            if (r0 == 0) goto L_0x005d
            android.content.Context r0 = X.C60960kU.A00
            X.0qQ.A07(r0)
            boolean r0 = X.C61970qY.A0G(r0)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x005d
        L_0x0053:
            X.3vQ r0 = r4.A00()
            if (r0 == 0) goto L_0x002f
            r0.Dxq(r5)
            return
        L_0x005d:
            java.lang.String r6 = r9.A0I
            r12 = 0
            boolean r0 = X.C255613uQ.A00(r8, r12, r7, r7)
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r0)
            java.lang.String r2 = r4.A08
            java.lang.String r0 = "feed_"
            boolean r14 = X.00p.A0k(r2, r0, r7)
            boolean r15 = r9.A0T
            boolean r0 = r9.A0V
            java.util.List r13 = r9.A0N
            java.lang.String r11 = r9.A0H
            r18 = r0
            r17 = r5
            r16 = r1
            boolean r7 = X.AnonymousClass3WP.A09(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            boolean r0 = X.AnonymousClass3WP.A0A(r8, r9, r13)
            if (r0 == 0) goto L_0x0094
            r0 = 2342165929888393900(0x20810b8100052aac, double:4.068062364629055E-152)
            boolean r0 = X.182.A06(r3, r8, r0)
            r1 = 1
            if (r0 != 0) goto L_0x0095
        L_0x0094:
            r1 = 0
        L_0x0095:
            if (r7 == 0) goto L_0x009a
            r0 = 1
            if (r1 == 0) goto L_0x009b
        L_0x009a:
            r0 = 0
        L_0x009b:
            if (r6 == 0) goto L_0x00b7
            if (r0 == 0) goto L_0x00b7
            X.0bY r0 = A00
            android.net.Uri r6 = X.0cp.A01(r0, r6)
            java.lang.Class<X.S0t> r1 = X.C10916S0t.class
            X.TPP r0 = new X.TPP
            r0.<init>()
            java.lang.Object r0 = r8.A01(r1, r0)
            X.S0t r0 = (X.C10916S0t) r0
            if (r6 == 0) goto L_0x010b
            r0.A00(r6, r8, r5)
        L_0x00b7:
            java.lang.Integer r5 = r9.A0E
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r5 != r0) goto L_0x00d6
            boolean r0 = r9.A08()
            if (r0 == 0) goto L_0x00d6
            r0 = 36317517610358021(0x810697004a1505, double:3.0306826034713227E-306)
            boolean r0 = X.182.A06(r3, r8, r0)
            boolean r0 = X.AnonymousClass3PL.A00(r8, r2, r0)
            if (r0 != 0) goto L_0x00d6
            r0 = 524288(0x80000, float:7.34684E-40)
            r4.A02 = r0
        L_0x00d6:
            X.1wS r0 = X.1wS.A01(r8)
            r0.A0E(r4)
            r0 = 36313119558993696(0x81029700000720, double:3.027901258078992E-306)
            boolean r0 = X.182.A06(r3, r8, r0)
            if (r0 == 0) goto L_0x00f4
            X.Rzx r0 = X.T7A.A06
            X.T7A r1 = r0.A00(r8)
            java.lang.String r0 = r8.A06
            r1.A00(r9, r2, r0)
            return
        L_0x00f4:
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r5 == r0) goto L_0x002f
            java.lang.Class<X.3vX> r2 = X.C256293vX.class
            r1 = 36
            X.MMF r0 = new X.MMF
            r0.<init>(r8, r1)
            java.lang.Object r0 = r8.A01(r2, r0)
            X.3vX r0 = (X.C256293vX) r0
            r0.A00(r9)
            return
        L_0x010b:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C256233vR.A00(com.instagram.common.session.UserSession, X.3vO):void");
    }
}
