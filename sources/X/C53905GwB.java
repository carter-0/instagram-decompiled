package X;

import com.instagram.common.session.UserSession;
import com.meta.foa.accountswitcher.UserAccountInfo;
import com.meta.foa.session.FoaUserSession;

/* renamed from: X.GwB  reason: case insensitive filesystem */
public final class C53905GwB extends C251343mx {
    public final UserAccountInfo A00;
    public final 0sP A01;
    public final FoaUserSession A02;
    public final String A03;
    public final C62320sa A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;

    public C53905GwB(UserAccountInfo userAccountInfo, FoaUserSession foaUserSession, String str, C62320sa r5, 0sP r6, boolean z, boolean z2, boolean z3) {
        C51973G9u.A0s(1, foaUserSession, r6, str);
        this.A02 = foaUserSession;
        this.A00 = userAccountInfo;
        this.A05 = z;
        this.A07 = z2;
        this.A04 = r5;
        this.A06 = z3;
        this.A01 = r6;
        this.A03 = str;
    }

    /* JADX WARNING: type inference failed for: r11v2 */
    /* JADX WARNING: type inference failed for: r11v4, types: [X.JT9] */
    /* JADX WARNING: type inference failed for: r18v3, types: [X.IcL] */
    /* JADX WARNING: type inference failed for: r18v4, types: [X.IcM] */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0060, code lost:
        if (r1.A05 != false) goto L_0x0062;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x019a  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x01b9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C251263mp A0X(X.AnonymousClass3Y5 r25) {
        /*
            r24 = this;
            r6 = 0
            r2 = r25
            X.0qQ.A0B(r2, r6)
            r1 = r24
            boolean r7 = r1.A07
            r3 = 0
            if (r7 == 0) goto L_0x01b6
            com.meta.foa.accountswitcher.UserAccountInfo r0 = r1.A00
            java.lang.String r5 = r0.A02
            int r4 = r5.hashCode()
            r0 = -1479469166(0xffffffffa7d11792, float:-5.803471E-15)
            if (r4 == r0) goto L_0x01aa
            r0 = -619954295(0xffffffffdb0c3f89, float:-3.9476354E16)
            if (r4 == r0) goto L_0x019e
            r0 = 1279756998(0x4c478ac6, float:5.230876E7)
            if (r4 != r0) goto L_0x01b6
            java.lang.String r0 = "FACEBOOK"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x01b6
            java.lang.Integer r0 = X.AnonymousClass05K.A00
        L_0x002e:
            X.Hs9 r5 = new X.Hs9
            r5.<init>(r0)
        L_0x0033:
            com.meta.foa.accountswitcher.UserAccountInfo r0 = r1.A00
            java.lang.String r10 = r0.A02
            java.lang.String r4 = "FACEBOOK"
            boolean r4 = X.0qQ.A0K(r10, r4)
            if (r4 == 0) goto L_0x019a
            java.lang.String r14 = r0.A05
        L_0x0041:
            if (r14 == 0) goto L_0x01b9
            java.lang.String r11 = r0.A04
            if (r11 == 0) goto L_0x004d
            int r4 = r11.length()
            if (r4 != 0) goto L_0x005d
        L_0x004d:
            java.lang.String r4 = r0.A03
            if (r4 == 0) goto L_0x0057
            int r4 = java.lang.Integer.parseInt(r4)
            if (r4 > 0) goto L_0x005d
        L_0x0057:
            boolean r4 = r1.A00(r0)
            if (r4 == 0) goto L_0x0062
        L_0x005d:
            boolean r4 = r1.A05
            r13 = 1
            if (r4 == 0) goto L_0x0063
        L_0x0062:
            r13 = 0
        L_0x0063:
            android.content.Context r9 = X.C243803a8.A00(r2)
            boolean r4 = r1.A00(r0)
            java.lang.String r8 = ""
            if (r4 == 0) goto L_0x0169
            java.lang.String r4 = r0.A07
            if (r4 == 0) goto L_0x0074
            r8 = r4
        L_0x0074:
            if (r7 == 0) goto L_0x0166
            r4 = 2131974888(0x7f135ae8, float:1.9586853E38)
            java.lang.String r7 = X.C244013aV.A0F(r2, r10, r4)
        L_0x007d:
            r4 = r3
            if (r13 == 0) goto L_0x0081
            r4 = r8
        L_0x0081:
            java.lang.CharSequence[] r4 = new java.lang.CharSequence[]{r14, r7, r4}
            java.lang.StringBuilder r4 = X.2eQ.A00(r4)
            java.lang.String r16 = X.DbT.A10(r4)
            boolean r4 = r1.A05
            if (r4 != 0) goto L_0x0162
            r7 = 2131974887(0x7f135ae7, float:1.958685E38)
            java.lang.String r17 = X.C244013aV.A0E(r2, r7)
        L_0x0098:
            java.lang.String r7 = r1.A03
            X.0qQ.A0B(r7, r6)
            java.lang.String r6 = "INSTAGRAM"
            boolean r6 = X.0qQ.A0K(r10, r6)
            if (r6 != 0) goto L_0x015f
            boolean r6 = X.AnonymousClass3H6.A01(r7)
        L_0x00a9:
            if (r13 == 0) goto L_0x015c
            r7 = 16
            if (r6 == 0) goto L_0x014d
            r7 = 15
            X.Iwc r6 = new X.Iwc
            r6.<init>(r8, r7)
            X.Gd5 r15 = new X.Gd5
            r15.<init>(r2)
            r6.invoke(r15)
        L_0x00be:
            if (r4 == 0) goto L_0x012c
            X.XSY r19 = X.XSY.CHECKMARK_CIRCLE
            X.HOw r22 = X.C54691HOw.FILLED
            X.HOv r21 = X.C54690HOv.SIZE_24
            X.XRa r23 = X.C21255XRa.A39
            X.IcM r11 = new X.IcM
            r18 = r11
            r20 = r3
            r18.<init>(r19, r20, r21, r22, r23)
        L_0x00d1:
            java.lang.String r7 = r0.A09
            java.lang.String r6 = "CURRENT_SHARED"
            if (r7 == r6) goto L_0x011d
            r6 = 454(0x1c6, float:6.36E-43)
            java.lang.String r6 = X.AnonymousClass000.A00(r6)
            if (r7 == r6) goto L_0x011d
            r6 = 974(0x3ce, float:1.365E-42)
            java.lang.String r6 = X.AnonymousClass000.A00(r6)
            if (r7 == r6) goto L_0x011d
            r13 = r3
        L_0x00e8:
            java.lang.String r0 = r0.A06
            if (r0 == 0) goto L_0x00f2
            android.net.Uri r6 = X.0cp.A03(r0)
            if (r6 != 0) goto L_0x00f4
        L_0x00f2:
            android.net.Uri r6 = android.net.Uri.EMPTY
        L_0x00f4:
            X.0qQ.A0A(r6)
            java.lang.Integer r2 = X.AnonymousClass05K.A00
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            X.IcP r12 = new X.IcP
            r12.<init>(r6, r5, r2, r0)
            X.0sa r5 = r1.A04
            X.2WX r2 = new X.2WX
            r2.<init>(r3, r3)
            java.lang.Integer r1 = X.AnonymousClass05K.A06
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            X.2WX r0 = X.G9t.A10(r3, r1, r0)
            X.2WX r10 = r2.A00(r0)
            X.Gv9 r9 = new X.Gv9
            r18 = r5
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18)
            return r9
        L_0x011d:
            r6 = 2131974892(0x7f135aec, float:1.958686E38)
            java.lang.String r6 = X.C244013aV.A0E(r2, r6)
            java.lang.Integer r2 = X.AnonymousClass05K.A0Y
            X.HlQ r13 = new X.HlQ
            r13.<init>(r6, r2)
            goto L_0x00e8
        L_0x012c:
            boolean r6 = r1.A06
            if (r6 == 0) goto L_0x014b
            X.XSY r19 = X.XSY.THREE_DOTS_HORIZONTAL
            X.HOw r20 = X.C54691HOw.FILLED
            java.lang.Integer r21 = X.AnonymousClass05K.A0C
            r6 = 2131974897(0x7f135af1, float:1.9586871E38)
            java.lang.String r22 = X.C244013aV.A0E(r2, r6)
            r6 = 36
            X.Ivv r23 = X.C58686Ivv.A00(r1, r6)
            X.IcL r11 = new X.IcL
            r18 = r11
            r18.<init>(r19, r20, r21, r22, r23)
            goto L_0x00d1
        L_0x014b:
            r11 = r3
            goto L_0x00d1
        L_0x014d:
            X.Iwc r6 = new X.Iwc
            r6.<init>(r8, r7)
            X.Gd5 r15 = new X.Gd5
            r15.<init>(r2)
            r6.invoke(r15)
            goto L_0x00be
        L_0x015c:
            r15 = r3
            goto L_0x00be
        L_0x015f:
            r6 = 0
            goto L_0x00a9
        L_0x0162:
            r17 = r3
            goto L_0x0098
        L_0x0166:
            r7 = r3
            goto L_0x007d
        L_0x0169:
            if (r11 == 0) goto L_0x0174
            int r4 = r11.length()
            if (r4 == 0) goto L_0x0174
            r8 = r11
            goto L_0x0074
        L_0x0174:
            java.lang.String r12 = r0.A03
            if (r12 == 0) goto L_0x0074
            int r4 = java.lang.Integer.parseInt(r12)
            if (r4 == 0) goto L_0x0074
            android.content.res.Resources r11 = r9.getResources()
            r9 = 2131820746(0x7f1100ca, float:1.9274216E38)
            int r8 = java.lang.Integer.parseInt(r12)
            int r4 = java.lang.Integer.parseInt(r12)
            java.lang.Object[] r4 = X.AnonymousClass7TF.A1b(r4)
            java.lang.String r8 = r11.getQuantityString(r9, r8, r4)
            X.0qQ.A0A(r8)
            goto L_0x0074
        L_0x019a:
            java.lang.String r14 = r0.A0A
            goto L_0x0041
        L_0x019e:
            java.lang.String r0 = "THREADS"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x01b6
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            goto L_0x002e
        L_0x01aa:
            java.lang.String r0 = "INSTAGRAM"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x01b6
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            goto L_0x002e
        L_0x01b6:
            r5 = r3
            goto L_0x0033
        L_0x01b9:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C53905GwB.A0X(X.3Y5):X.3mp");
    }

    private final boolean A00(UserAccountInfo userAccountInfo) {
        FoaUserSession foaUserSession = this.A02;
        String str = userAccountInfo.A07;
        String str2 = str;
        if (str == null) {
            str2 = "";
        }
        0qQ.A0B(foaUserSession, 0);
        UserSession A002 = C56316HwT.A00(foaUserSession);
        0qQ.A0B(A002, 0);
        if (str2.length() == 0 || AnonymousClass3EM.A07(A002, 36326820504877046L) || !AnonymousClass3EM.A07(A002, 36326820504811509L) || str == null || str.length() == 0) {
            return false;
        }
        return true;
    }
}
