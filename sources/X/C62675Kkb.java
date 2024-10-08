package X;

import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.instagram.common.session.UserSession;

/* renamed from: X.Kkb  reason: case insensitive filesystem */
public enum C62675Kkb implements CallerContextable {
    ;
    
    public static final CallerContext A01 = null;
    public static final String __redex_internal_original_name = "NoticeEligibilityRule";
    public final C62634Kj5 A00;

    /* access modifiers changed from: public */
    static {
        C62675Kkb[] kkbArr;
        A02 = 0oU.A00(kkbArr);
        A01 = CallerContext.A00(C62675Kkb.class);
    }

    public final String A02(C376569Im r3, UserSession userSession) {
        if (this instanceof C62068KYy) {
            if (r3 == null) {
                return null;
            }
            StringBuilder A1A = AnonymousClass7TE.A1A();
            A1A.append("reelCcpVisible=");
            A1A.append(r3.A06);
            A1A.append(",reelXarVisible=");
            A1A.append(r3.A08);
            A1A.append(",LauncherEnabledXAR=");
            return A01(r3, userSession, A0F, A1A);
        } else if (this instanceof C62067KYx) {
            return A00(r3, userSession);
        } else {
            if (this instanceof C62065KYv) {
                return A00(r3, userSession);
            }
            if (this instanceof C62053KYg) {
                if (r3 == null) {
                    return null;
                }
                StringBuilder A1A2 = AnonymousClass7TE.A1A();
                A1A2.append("reelCcpVisible=");
                A1A2.append(r3.A06);
                A1A2.append(",reelXarVisible=");
                A1A2.append(r3.A08);
                A1A2.append(",LauncherEnabledCCP=");
                return A01(r3, userSession, A0E, A1A2);
            } else if (this instanceof KYf) {
                return A00(r3, userSession);
            } else {
                if (this instanceof KYd) {
                    return A00(r3, userSession);
                }
                return null;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x007a A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A03(X.C376569Im r27, com.instagram.common.session.UserSession r28) {
        /*
            r26 = this;
            r1 = r26
            boolean r0 = r1 instanceof X.C62069KYz
            r3 = r28
            if (r0 == 0) goto L_0x0150
            X.818 r4 = X.AnonymousClass818.IG_REELS_COMPOSER
            X.2D6 r0 = X.2D5.A00(r3)
            long r24 = X.C367288qV.A00(r3)
            X.0xa r5 = r0.A04
            r0 = 2402(0x962, float:3.366E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r1 = 0
            long r8 = r5.getLong(r0, r1)
            r0 = 2401(0x961, float:3.365E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            long r22 = r5.getLong(r0, r1)
            r0 = 2404(0x964, float:3.369E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            long r20 = r5.getLong(r0, r1)
            java.lang.String r0 = "PREFERENCE_REELS_SHARE_TO_FACEBOOK_SIMPLIFICATION_UPSELL_LAST_SEEN"
            long r18 = r5.getLong(r0, r1)
            java.lang.String r0 = "PREFERENCE_REELS_SHARE_TO_FACEBOOK_SIMPLIFICATION_V_1_5_UPSELL_LAST_SEEN"
            long r16 = r5.getLong(r0, r1)
            long r14 = java.lang.System.currentTimeMillis()
            X.0Tu r7 = X.0Tu.A05
            r0 = 36599860166004357(0x82076100060e85, double:3.209237172564283E-306)
            long r1 = X.182.A01(r7, r3, r0)
            r12 = 86400000(0x5265c00, double:4.2687272E-316)
            long r1 = r1 * r12
            long r10 = r14 - r8
            int r0 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            if (r0 <= 0) goto L_0x007c
            r0 = 2342161394403121254(0x2081076100081866, double:4.064216657852271E-152)
            java.lang.Boolean r0 = X.AnonymousClass7TF.A0R(r7, r3, r0)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x007a
            X.819 r6 = X.AnonymousClass819.BOTTOMSHEET_XAR_CCP_MIGRATION_REELS
            X.8sM r5 = X.C368278sM.SUPPRESS
            X.81A r2 = X.JTO.A0O()
            java.lang.String r1 = "custom_cooldown:xar_setting_change"
        L_0x0072:
            java.lang.String r0 = "suppress_reason"
            r2.A06(r0, r1)
            X.C368288sN.A00(r4, r5, r6, r2, r3)
        L_0x007a:
            r2 = 0
        L_0x007b:
            return r2
        L_0x007c:
            r0 = 36599860165938820(0x82076100050e84, double:3.209237172522837E-306)
            long r5 = X.182.A01(r7, r3, r0)
            long r5 = r5 * r12
            long r1 = r14 - r24
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x00a6
            r0 = 2342161394403121254(0x2081076100081866, double:4.064216657852271E-152)
            java.lang.Boolean r0 = X.AnonymousClass7TF.A0R(r7, r3, r0)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x007a
            X.819 r6 = X.AnonymousClass819.BOTTOMSHEET_XAR_CCP_MIGRATION_REELS
            X.8sM r5 = X.C368278sM.SUPPRESS
            X.81A r2 = X.JTO.A0O()
            java.lang.String r1 = "custom_cooldown:ccp_setting_change"
            goto L_0x0072
        L_0x00a6:
            r1 = 36599860165676672(0x82076100010e80, double:3.2092371723570535E-306)
            long r8 = X.182.A01(r7, r3, r1)
            long r8 = r8 * r12
            long r5 = r14 - r20
            int r0 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r0 > 0) goto L_0x0135
            long r1 = X.182.A01(r7, r3, r1)
            long r1 = r1 * r12
            int r0 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            if (r0 > 0) goto L_0x0135
            r5 = 36599860165873283(0x82076100040e83, double:3.209237172481391E-306)
            long r8 = X.182.A01(r7, r3, r5)
            long r8 = r8 * r12
            long r1 = r14 - r22
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x00e9
            r0 = 2342161394403121254(0x2081076100081866, double:4.064216657852271E-152)
            java.lang.Boolean r0 = X.AnonymousClass7TF.A0R(r7, r3, r0)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x007a
            X.819 r6 = X.AnonymousClass819.BOTTOMSHEET_XAR_CCP_MIGRATION_REELS
            X.8sM r5 = X.C368278sM.SUPPRESS
            X.81A r2 = X.JTO.A0O()
            java.lang.String r1 = "custom_cooldown:ccp_upsell_view"
            goto L_0x0072
        L_0x00e9:
            long r8 = X.182.A01(r7, r3, r5)
            long r8 = r8 * r12
            long r1 = r14 - r18
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x010f
            r0 = 2342161394403121254(0x2081076100081866, double:4.064216657852271E-152)
            java.lang.Boolean r0 = X.AnonymousClass7TF.A0R(r7, r3, r0)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x007a
            X.819 r6 = X.AnonymousClass819.BOTTOMSHEET_XAR_CCP_MIGRATION_REELS
            X.8sM r5 = X.C368278sM.SUPPRESS
            X.81A r2 = X.JTO.A0O()
            java.lang.String r1 = "custom_cooldown:simplification_upsell_view"
            goto L_0x0072
        L_0x010f:
            long r1 = X.182.A01(r7, r3, r5)
            long r1 = r1 * r12
            long r14 = r14 - r16
            int r0 = (r1 > r14 ? 1 : (r1 == r14 ? 0 : -1))
            if (r0 <= 0) goto L_0x01a0
            r0 = 2342161394403121254(0x2081076100081866, double:4.064216657852271E-152)
            java.lang.Boolean r0 = X.AnonymousClass7TF.A0R(r7, r3, r0)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x007a
            X.819 r6 = X.AnonymousClass819.BOTTOMSHEET_XAR_CCP_MIGRATION_REELS
            X.8sM r5 = X.C368278sM.SUPPRESS
            X.81A r2 = X.JTO.A0O()
            java.lang.String r1 = "custom_cooldown:simplification_upsell_v15_view"
            goto L_0x0072
        L_0x0135:
            r0 = 2342161394403121254(0x2081076100081866, double:4.064216657852271E-152)
            java.lang.Boolean r0 = X.AnonymousClass7TF.A0R(r7, r3, r0)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x007a
            X.819 r6 = X.AnonymousClass819.BOTTOMSHEET_XAR_CCP_MIGRATION_REELS
            X.8sM r5 = X.C368278sM.SUPPRESS
            X.81A r2 = X.JTO.A0O()
            java.lang.String r1 = "custom_cooldown:xar_upsell_view"
            goto L_0x0072
        L_0x0150:
            boolean r0 = r1 instanceof X.C62068KYy
            r4 = r27
            if (r0 == 0) goto L_0x015f
            if (r27 == 0) goto L_0x007a
            java.lang.Object r0 = r4.A08
            boolean r2 = X.DbX.A1a(r0)
            return r2
        L_0x015f:
            boolean r0 = r1 instanceof X.C62067KYx
            if (r0 == 0) goto L_0x0179
            X.2D6 r0 = X.2D5.A00(r3)
            boolean r0 = r0.A0C()
            r2 = 1
            if (r0 == 0) goto L_0x007a
            if (r27 == 0) goto L_0x007a
            java.lang.Object r0 = r4.A01
            boolean r0 = X.AnonymousClass7TF.A1Y(r0, r2)
            if (r0 == 0) goto L_0x007a
            return r2
        L_0x0179:
            boolean r0 = r1 instanceof X.C62066KYw
            if (r0 == 0) goto L_0x0186
            if (r27 == 0) goto L_0x007a
            java.lang.Object r0 = r4.A07
            boolean r2 = X.DbX.A1a(r0)
            return r2
        L_0x0186:
            boolean r0 = r1 instanceof X.C62065KYv
            if (r0 == 0) goto L_0x01a2
            r1 = 0
            X.2D6 r0 = X.2D5.A00(r3)
            boolean r0 = r0.A0C()
            r2 = 0
            if (r0 != 0) goto L_0x007b
            if (r27 == 0) goto L_0x007b
            java.lang.Object r0 = r4.A01
            boolean r0 = X.AnonymousClass7TF.A1Y(r0, r1)
            if (r0 == 0) goto L_0x007b
        L_0x01a0:
            r2 = 1
            return r2
        L_0x01a2:
            boolean r0 = r1 instanceof X.C62064KYu
            if (r0 == 0) goto L_0x01b1
            java.lang.Integer r1 = X.JTS.A0e(r3)
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            boolean r2 = X.AnonymousClass7TF.A1W(r1, r0)
            return r2
        L_0x01b1:
            boolean r0 = r1 instanceof X.C62063KYt
            if (r0 == 0) goto L_0x01bc
            X.Kkb r0 = A08
            boolean r2 = r0.A03(r4, r3)
            return r2
        L_0x01bc:
            boolean r0 = r1 instanceof X.KYs
            if (r0 == 0) goto L_0x01c9
            if (r27 == 0) goto L_0x007a
            java.lang.Object r0 = r4.A02
            boolean r2 = X.DbX.A1a(r0)
            return r2
        L_0x01c9:
            boolean r0 = r1 instanceof X.C62062KYr
            if (r0 == 0) goto L_0x01d2
            boolean r2 = X.C363018iu.A00(r3)
            return r2
        L_0x01d2:
            boolean r0 = r1 instanceof X.C62061KYq
            if (r0 == 0) goto L_0x01dd
            boolean r0 = X.C363018iu.A00(r3)
            r2 = r0 ^ 1
            return r2
        L_0x01dd:
            boolean r0 = r1 instanceof X.C62060KYp
            if (r0 != 0) goto L_0x007a
            boolean r0 = r1 instanceof X.C62059KYo
            if (r0 == 0) goto L_0x01ed
            X.7wN r1 = X.C347167wN.A00
            r0 = 1
            boolean r2 = r1.A00(r3, r0)
            return r2
        L_0x01ed:
            boolean r0 = r1 instanceof X.C62058KYn
            if (r0 == 0) goto L_0x020b
            r2 = 0
            X.0Tu r4 = X.0Tu.A05
            r0 = 36315709424668146(0x8104f200060df2, double:3.0295390995600663E-306)
            boolean r0 = X.182.A06(r4, r3, r0)
            if (r0 != 0) goto L_0x007b
            r0 = 36314571257940663(0x8103e900000ab7, double:3.0288193183385765E-306)
            boolean r0 = X.182.A06(r4, r3, r0)
            if (r0 != 0) goto L_0x01a0
            return r2
        L_0x020b:
            boolean r0 = r1 instanceof X.C62057KYm
            if (r0 == 0) goto L_0x021d
            X.Kkb r0 = A0B
            boolean r1 = r0.A03(r4, r3)
            X.Kkb r0 = A0I
            boolean r2 = r0.A03(r4, r3)
            r2 = r2 ^ r1
            return r2
        L_0x021d:
            boolean r0 = r1 instanceof X.C62056KYl
            if (r0 == 0) goto L_0x022a
            if (r27 == 0) goto L_0x007a
            java.lang.Object r0 = r4.A04
            boolean r2 = X.DbX.A1a(r0)
            return r2
        L_0x022a:
            boolean r0 = r1 instanceof X.KYk
            if (r0 == 0) goto L_0x0233
            boolean r2 = X.C363558jv.A00(r3)
            return r2
        L_0x0233:
            boolean r0 = r1 instanceof X.C62055KYj
            if (r0 == 0) goto L_0x023e
            boolean r0 = X.C363558jv.A00(r3)
            r2 = r0 ^ 1
            return r2
        L_0x023e:
            boolean r0 = r1 instanceof X.C62054KYi
            if (r0 == 0) goto L_0x024d
            X.8je r1 = X.C363378jd.A08
            com.facebook.common.callercontext.CallerContext r0 = A01
            boolean r0 = r1.A04(r0, r3)
            r2 = r0 ^ 1
            return r2
        L_0x024d:
            boolean r0 = r1 instanceof X.KYh
            if (r0 == 0) goto L_0x0256
            boolean r2 = X.AnonymousClass8PU.A07(r3)
            return r2
        L_0x0256:
            boolean r0 = r1 instanceof X.C62053KYg
            if (r0 == 0) goto L_0x0263
            if (r27 == 0) goto L_0x007a
            java.lang.Object r0 = r4.A06
            boolean r2 = X.DbX.A1a(r0)
            return r2
        L_0x0263:
            boolean r0 = r1 instanceof X.KYf
            if (r0 == 0) goto L_0x0279
            boolean r0 = X.C367288qV.A06(r3)
            r2 = 1
            if (r0 == 0) goto L_0x007a
            if (r27 == 0) goto L_0x007a
            java.lang.Object r0 = r4.A00
            boolean r0 = X.AnonymousClass7TF.A1Y(r0, r2)
            if (r0 == 0) goto L_0x007a
            return r2
        L_0x0279:
            boolean r0 = r1 instanceof X.KYe
            if (r0 == 0) goto L_0x0286
            if (r27 == 0) goto L_0x007a
            java.lang.Object r0 = r4.A05
            boolean r2 = X.DbX.A1a(r0)
            return r2
        L_0x0286:
            r1 = 0
            boolean r0 = X.C367288qV.A06(r3)
            r2 = 0
            if (r0 != 0) goto L_0x007b
            if (r27 == 0) goto L_0x007b
            java.lang.Object r0 = r4.A00
            boolean r0 = X.AnonymousClass7TF.A1Y(r0, r1)
            if (r0 == 0) goto L_0x007b
            goto L_0x01a0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C62675Kkb.A03(X.9Im, com.instagram.common.session.UserSession):boolean");
    }

    /* access modifiers changed from: public */
    C62675Kkb(int i) {
        this.A00 = r1;
    }

    public static String A00(C376569Im r4, UserSession userSession) {
        boolean A062 = C367288qV.A06(userSession);
        boolean A0C2 = 2D5.A00(userSession).A0C();
        if (r4 == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("reelCcpIsOnForCurrentReel=");
        sb.append(r4.A00);
        sb.append(",reelCcpIsOnForAllReel=");
        sb.append(A062);
        sb.append(",reelXarIsOnForCurrentReel=");
        sb.append(r4.A01);
        sb.append(",reelXarIsOnForAllReel=");
        sb.append(A0C2);
        return sb.toString();
    }

    public static String A01(C376569Im r1, UserSession userSession, C62675Kkb kkb, StringBuilder sb) {
        sb.append(kkb.A03(r1, userSession));
        sb.append(",FBAccountLinked=");
        sb.append(A08.A03(r1, userSession));
        sb.append(",isCCPMoreRecentThanXAR=");
        sb.append(C367288qV.A01.A0E(userSession));
        return sb.toString();
    }
}
