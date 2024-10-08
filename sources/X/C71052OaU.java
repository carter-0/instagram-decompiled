package X;

import android.util.Patterns;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.OaU  reason: case insensitive filesystem */
public abstract class C71052OaU {
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0122  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x015b  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0177  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x017e  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x018b  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0198  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x01af  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01b1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String A01(com.instagram.common.session.UserSession r17, X.1bp r18, X.2FW r19, java.lang.String r20, java.lang.String r21, java.lang.String r22) {
        /*
            r2 = 0
            r9 = 1
            r6 = r17
            X.5Cv r0 = X.C282375Cv.A00(r6)
            X.0qQ.A07(r0)
            java.util.HashMap r8 = X.AnonymousClass7TE.A1E()
            boolean r0 = A02(r20)
            java.lang.String r11 = "share_extension"
            r7 = 4
            java.lang.Integer r3 = java.lang.Integer.valueOf(r9)
            r5 = r18
            r4 = r21
            r12 = r22
            if (r0 != 0) goto L_0x00b7
            boolean r0 = X.0qQ.A0K(r12, r11)
            if (r0 != 0) goto L_0x00b7
            r14 = 1
            java.util.List r0 = r5.C6L()
            X.0qQ.A07(r0)
            java.lang.Object r0 = X.00k.A0J(r0)
            com.instagram.model.direct.DirectThreadKey r0 = (com.instagram.model.direct.DirectThreadKey) r0
            if (r0 == 0) goto L_0x007b
            X.797 r0 = X.AnonymousClass796.A00(r6, r5, r0)
            boolean r10 = r0.A00()
            if (r10 == 0) goto L_0x0044
            r14 = 13
        L_0x0044:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r10)
            java.lang.Object[] r0 = new java.lang.Object[]{r3, r0}
            java.util.List r1 = X.0sr.A1P(r0)
            java.lang.String r0 = "is_instamadillo"
            r8.put(r0, r1)
            if (r10 == 0) goto L_0x00b4
            java.lang.String r0 = "ig_advanced_crypto_transport"
        L_0x0059:
            java.lang.Object[] r0 = new java.lang.Object[]{r3, r0}
            java.util.List r1 = X.0sr.A1P(r0)
            java.lang.String r0 = "transport_type"
            r8.put(r0, r1)
            if (r21 == 0) goto L_0x007b
            boolean r0 = X.AnonymousClass3f0.A04(r4)
            if (r0 == 0) goto L_0x007b
            java.lang.Object[] r0 = new java.lang.Object[]{r3, r4}
            java.util.List r1 = X.0sr.A1P(r0)
            java.lang.String r0 = "open_thread_id"
            r8.put(r0, r1)
        L_0x007b:
            java.lang.String r3 = com.facebook.msys.mci.TraceLogger.createTraceIdForType(r14)
            if (r3 == 0) goto L_0x01ae
            java.util.ArrayList r10 = X.AnonymousClass7TE.A1C()
            boolean r12 = X.0qQ.A0K(r12, r11)
            if (r12 == 0) goto L_0x0091
            r0 = 50301(0xc47d, double:2.4852E-319)
            X.AnonymousClass7TE.A1Y(r10, r0)
        L_0x0091:
            java.lang.String r11 = "FBLegacyBroker"
            r15 = 0
            if (r14 == r9) goto L_0x00cd
            r0 = 10
            java.lang.String r1 = "AdvancedCrypto"
            if (r14 == r0) goto L_0x00d2
            r0 = 13
            if (r14 == r0) goto L_0x00d2
            r0 = 15
            if (r14 == r0) goto L_0x00d2
            if (r14 == r7) goto L_0x00cd
            r0 = 5
            if (r14 == r0) goto L_0x00cd
            r0 = 3061(0xbf5, float:4.29E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)
            java.lang.UnsupportedOperationException r0 = X.AnonymousClass7TE.A1B(r0)
            throw r0
        L_0x00b4:
            java.lang.String r0 = "ig_django"
            goto L_0x0059
        L_0x00b7:
            r14 = 4
            X.2FW r0 = X.2FW.A1x
            r1 = r19
            if (r0 == r1) goto L_0x00ca
            X.2FW r0 = X.2FW.A1C
            if (r0 == r1) goto L_0x00ca
            X.2FW r0 = X.2FW.A0U
            if (r0 == r1) goto L_0x00ca
            X.2FW r0 = X.2FW.A0b
            if (r0 != r1) goto L_0x007b
        L_0x00ca:
            r14 = 15
            goto L_0x007b
        L_0x00cd:
            com.facebook.msys.mci.PrivacyContext r13 = com.facebook.msys.mci.PrivacyContextCoding.newPrivacyContextWithTransportKeyNative(r15, r11)
            goto L_0x00d6
        L_0x00d2:
            com.facebook.msys.mci.PrivacyContext r13 = com.facebook.msys.mci.PrivacyContextCoding.newPrivacyContextWithTransportKeyNative(r15, r1)
        L_0x00d6:
            r16 = 80
            r18 = r15
            r21 = r15
            r19 = r2
            r20 = r10
            r22 = r8
            r17 = r3
            com.facebook.msys.mci.TraceLogger.logWithLabeledTags(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            if (r14 != r7) goto L_0x0104
            if (r12 != 0) goto L_0x0104
            r9 = 53
            r0 = 1
            java.lang.Long r8 = java.lang.Long.valueOf(r0)
            r0 = 7
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.Long[] r0 = new java.lang.Long[]{r8, r0}
            java.util.ArrayList r0 = X.0sr.A1M(r0)
            X.C282375Cv.A03(r3, r0, r7, r9, r2)
        L_0x0104:
            java.lang.String r0 = r5.A06()
            X.C282375Cv.A02(r14, r3, r0)
            r1 = 1305(0x519, float:1.829E-42)
            java.lang.String r0 = r5.A06()
            java.lang.Long r0 = X.DbV.A0q(r0)
            java.lang.Long[] r0 = new java.lang.Long[]{r0}
            java.util.ArrayList r0 = X.0sr.A1M(r0)
            X.C282375Cv.A03(r3, r0, r14, r1, r2)
            if (r12 == 0) goto L_0x0136
            r7 = 6000(0x1770, float:8.408E-42)
            r0 = 70501(0x11365, double:3.4832E-319)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.Long[] r0 = new java.lang.Long[]{r0}
            java.util.ArrayList r0 = X.0sr.A1M(r0)
            X.C282375Cv.A03(r3, r0, r14, r7, r2)
        L_0x0136:
            X.0Tu r7 = X.0Tu.A05
            r0 = 36320644342096566(0x81096f000622b6, double:3.0326599612131167E-306)
            boolean r0 = X.182.A06(r7, r6, r0)
            if (r0 == 0) goto L_0x01ae
            boolean r0 = X.AnonymousClass3f0.A04(r4)
            if (r0 == 0) goto L_0x01ae
            int r0 = X.DbX.A05(r4)
            int r9 = r0 / 3
            int r8 = r9 * 2
            java.util.ArrayList r7 = X.AnonymousClass7TE.A1C()
            X.MaY r0 = r5.A02
            boolean r0 = r0.A07
            if (r0 == 0) goto L_0x0160
            r0 = 131(0x83, double:6.47E-322)
            X.AnonymousClass7TE.A1Y(r7, r0)
        L_0x0160:
            java.util.List r0 = r5.C6L()
            java.lang.Object r0 = r0.get(r2)
            X.0qQ.A07(r0)
            com.instagram.model.direct.DirectThreadKey r0 = (com.instagram.model.direct.DirectThreadKey) r0
            X.797 r0 = X.AnonymousClass796.A00(r6, r5, r0)
            boolean r0 = r0.A00()
            if (r0 == 0) goto L_0x017c
            r0 = 1252(0x4e4, double:6.186E-321)
            X.AnonymousClass7TE.A1Y(r7, r0)
        L_0x017c:
            if (r4 == 0) goto L_0x01b1
            java.lang.String r0 = X.C51967G9n.A0q(r4, r2, r9)
            java.lang.Long r0 = X.AnonymousClass7TE.A10(r0)
        L_0x0186:
            r7.add(r0)
            if (r4 == 0) goto L_0x01af
            java.lang.String r0 = X.C51967G9n.A0q(r4, r9, r8)
            java.lang.Long r0 = X.AnonymousClass7TE.A10(r0)
        L_0x0193:
            r7.add(r0)
            if (r4 == 0) goto L_0x01a0
            java.lang.String r0 = X.C66580MXl.A0z(r4, r8)
            java.lang.Long r15 = X.AnonymousClass7TE.A10(r0)
        L_0x01a0:
            r7.add(r15)
            r8 = 0
            r11 = 2220(0x8ac, float:3.111E-42)
            r9 = r14
            r10 = r8
            r12 = r3
            r13 = r2
            r14 = r7
            com.facebook.msys.mci.TraceLogger.logCrucialCheckpoint(r8, r9, r10, r11, r12, r13, r14)
        L_0x01ae:
            return r3
        L_0x01af:
            r0 = r15
            goto L_0x0193
        L_0x01b1:
            r0 = r15
            goto L_0x0186
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71052OaU.A01(com.instagram.common.session.UserSession, X.1bp, X.2FW, java.lang.String, java.lang.String, java.lang.String):java.lang.String");
    }

    public static final boolean A02(String str) {
        0qQ.A0B(str, 0);
        Pattern pattern = 0mp.A06;
        Matcher matcher = Patterns.WEB_URL.matcher(str);
        0qQ.A07(matcher);
        if (!matcher.find() || 0mp.A0A(matcher.group(0))) {
            return false;
        }
        if (0mp.A09(str).find() && !0mp.A06.matcher(str).find()) {
            return false;
        }
        Matcher matcher2 = Patterns.EMAIL_ADDRESS.matcher(str);
        0qQ.A07(matcher2);
        if (!matcher2.find()) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0018  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A03(java.util.List r4) {
        /*
            r3 = 0
            if (r4 == 0) goto L_0x000d
            boolean r0 = r4 instanceof java.util.Collection
            if (r0 == 0) goto L_0x000e
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L_0x000e
        L_0x000d:
            return r3
        L_0x000e:
            java.util.Iterator r2 = r4.iterator()
        L_0x0012:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x000d
            java.lang.Object r0 = r2.next()
            X.9IY r0 = (X.AnonymousClass9IY) r0
            int r1 = r0.A03
            r0 = 5
            if (r1 == r0) goto L_0x002a
            r0 = 6
            if (r1 == r0) goto L_0x002a
            r0 = 102(0x66, float:1.43E-43)
            if (r1 != r0) goto L_0x0012
        L_0x002a:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71052OaU.A03(java.util.List):boolean");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: X.3Q2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: X.3Q2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: X.3Q2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r29v2, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v67, resolved type: X.3Q2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v68, resolved type: X.3Q2} */
    /* JADX WARNING: type inference failed for: r4v13, types: [java.lang.Boolean] */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x02f4, code lost:
        if (r23.A05() != false) goto L_0x02f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x03d8, code lost:
        if (A02(r56) != false) goto L_0x03da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x01b8, code lost:
        if (r11 != false) goto L_0x01ba;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0155  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String A00(X.N49 r57, com.instagram.common.session.UserSession r58, X.C70766OKm r59, X.C254933tI r60, com.instagram.direct.model.mentions.SendMentionData$MentionData r61, X.OCA r62, X.C69343Nji r63, com.instagram.model.direct.DirectThreadKey r64, java.lang.Boolean r65, java.lang.Boolean r66, java.lang.Integer r67, java.lang.Integer r68, java.lang.Integer r69, java.lang.Long r70, java.lang.String r71, java.lang.String r72, java.lang.String r73, java.lang.String r74, java.lang.String r75, java.lang.String r76, java.lang.String r77, java.lang.String r78, java.util.List r79, java.util.List r80, boolean r81, boolean r82, boolean r83) {
        /*
            r19 = 0
            r18 = 2
            r56 = r71
            r1 = r56
            r0 = r18
            X.0qQ.A0B(r1, r0)
            r2 = 0
            r1 = 1
            boolean r3 = X.0mp.A0B(r56)
            r8 = 0
            r0 = r58
            r53 = r75
            if (r3 == 0) goto L_0x0037
            java.lang.String r1 = "DirectSendTextHelper_empty_text_message"
            java.lang.String r2 = "Text message is empty"
            X.0wb.A03(r1, r2)
            if (r75 == 0) goto L_0x002b
            int r1 = r53.hashCode()
            java.lang.Integer r19 = java.lang.Integer.valueOf(r1)
        L_0x002b:
            r1 = r19
            com.meta.foa.instagram.performancelogging.lss.IGFOAMessagingLocalSendSpeedLogger r0 = X.C328727Fx.A00(r0, r1)
            if (r0 == 0) goto L_0x0036
            r0.onEndFlowFail(r2)
        L_0x0036:
            return r8
        L_0x0037:
            int r3 = X.JTR.A0G(r53)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            com.meta.foa.instagram.performancelogging.lss.IGFOAMessagingLocalSendSpeedLogger r3 = X.C328727Fx.A00(r0, r3)
            if (r3 == 0) goto L_0x0048
            r3.onLogCreateSendMutationStart()
        L_0x0048:
            X.2Dm r3 = X.1bJ.A00(r0)
            r6 = r64
            java.lang.Long r37 = r3.BWH(r6)
            r23 = r60
            boolean r13 = X.AnonymousClass7TF.A1V(r23)
            X.0Tu r15 = X.0Tu.A05
            r3 = 36876430290190445(0x8302eb0008006d, double:3.384141232758066E-306)
            java.lang.String r5 = X.182.A04(r15, r0, r3)
            r11 = r56
            java.lang.String r10 = X.DbV.A12(r56)
            java.util.ArrayList r14 = X.AnonymousClass7TE.A1C()
            java.util.LinkedHashSet r9 = X.DbS.A0y()
            int r3 = r5.length()
            boolean r3 = X.AnonymousClass7TF.A1Q(r3)
            if (r3 != 0) goto L_0x009b
            char[] r4 = new char[r1]
            r3 = 44
            r4[r2] = r3
            java.util.List r3 = X.00l.A0Q(r5, r4, r2)
            java.util.Iterator r4 = r3.iterator()
        L_0x0089:
            boolean r3 = r4.hasNext()
            if (r3 == 0) goto L_0x009b
            java.lang.String r3 = X.AnonymousClass7TE.A18(r4)
            java.lang.String r3 = X.DbV.A12(r3)
            r9.add(r3)
            goto L_0x0089
        L_0x009b:
            java.util.HashSet r7 = X.AnonymousClass7TE.A1F()
            java.util.regex.Pattern r3 = android.util.Patterns.EMAIL_ADDRESS
            java.util.regex.Matcher r4 = r3.matcher(r10)
        L_0x00a5:
            boolean r3 = r4.find()
            if (r3 == 0) goto L_0x00b3
            int r3 = r4.end()
            X.AnonymousClass7TF.A1M(r7, r3)
            goto L_0x00a5
        L_0x00b3:
            java.util.ArrayList r5 = X.AnonymousClass7TE.A1C()
            java.util.regex.Pattern r3 = android.util.Patterns.WEB_URL
            java.util.regex.Matcher r12 = r3.matcher(r10)
        L_0x00bd:
            boolean r3 = r12.find()
            if (r3 == 0) goto L_0x0105
            java.lang.String r4 = r12.group()
            X.0qQ.A07(r4)
            java.util.regex.Matcher r3 = X.0mp.A09(r4)
            boolean r3 = r3.find()
            if (r3 != 0) goto L_0x00bd
            boolean r3 = X.0mp.A0A(r4)
            if (r3 != 0) goto L_0x00bd
            int r3 = r12.end()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            boolean r3 = r7.contains(r3)
            if (r3 != 0) goto L_0x00bd
            boolean r3 = r9.isEmpty()
            if (r3 != 0) goto L_0x0101
            java.net.URI r3 = new java.net.URI     // Catch:{ URISyntaxException -> 0x00bd }
            r3.<init>(r4)     // Catch:{ URISyntaxException -> 0x00bd }
            java.lang.String r3 = r3.getHost()     // Catch:{ URISyntaxException -> 0x00bd }
            boolean r3 = r9.contains(r3)     // Catch:{ URISyntaxException -> 0x00bd }
            if (r3 == 0) goto L_0x00bd
            r5.add(r4)     // Catch:{ URISyntaxException -> 0x00bd }
            goto L_0x00bd
        L_0x0101:
            r5.add(r4)
            goto L_0x00bd
        L_0x0105:
            if (r13 != 0) goto L_0x03d2
            boolean r3 = X.DbT.A1b(r5)
            if (r3 == 0) goto L_0x03d2
            java.lang.Object r4 = r5.get(r2)
            java.lang.String r4 = (java.lang.String) r4
            int r3 = r5.size()
            int r3 = r3 - r1
            java.lang.Object r5 = r5.get(r3)
            java.lang.String r5 = (java.lang.String) r5
            boolean r3 = X.00p.A0k(r10, r4, r2)
            if (r3 == 0) goto L_0x03ac
            X.OC7 r3 = new X.OC7
            r3.<init>(r4, r1)
            r14.add(r3)
            int r4 = r4.length()
            int r3 = r10.length()
            java.lang.String r3 = X.C51967G9n.A0q(r10, r4, r3)
            java.lang.String r11 = X.DbV.A12(r3)
        L_0x013c:
            X.OC7 r4 = new X.OC7
            r4.<init>(r11, r2)
        L_0x0141:
            r14.add(r4)
            X.ODs r48 = X.OQO.A00(r0, r6)
            java.util.Iterator r17 = r14.iterator()
            java.lang.String r5 = ""
            r7 = 0
        L_0x014f:
            boolean r3 = r17.hasNext()
            if (r3 == 0) goto L_0x0036
            java.lang.Object r4 = r17.next()
            X.OC7 r4 = (X.OC7) r4
            java.lang.String r13 = r4.A00
            boolean r3 = X.0mp.A0B(r13)
            if (r3 != 0) goto L_0x014f
            boolean r11 = r4.A01
            r49 = r66
            r26 = r62
            r39 = r70
            r55 = r82
            r54 = r81
            r51 = r76
            r16 = r73
            r41 = r72
            if (r11 == 0) goto L_0x02d6
            if (r70 != 0) goto L_0x02d6
            java.lang.Class<X.1cX> r50 = X.1cX.class
            r47 = r0
            r52 = r16
            X.MaY r24 = X.C66669Mac.A01(r47, r48, r49, r50, r51, r52, r53, r54, r55)
            X.9Iu r4 = new X.9Iu
            r4.<init>(r13)
            long r29 = X.AnonymousClass7TG.A0H()
            X.1cX r3 = new X.1cX
            r21 = r3
            r22 = r4
            r25 = r26
            r26 = r6
            r27 = r37
            r28 = r41
            r31 = r2
            r32 = r2
            r21.<init>(r22, r23, r24, r25, r26, r27, r28, r29, r31, r32)
        L_0x01a1:
            X.1bp r3 = (X.1bp) r3
            X.2FW r9 = r3.Aqm()
            X.0qQ.A07(r9)
            java.lang.String r8 = r3.A06()
            X.MaY r4 = r3.A02
            boolean r4 = r4.A09
            X.C3265677h.A0g(r0, r6, r9, r8, r4)
            if (r7 != 0) goto L_0x01ba
            r7 = 0
            if (r11 == 0) goto L_0x01bb
        L_0x01ba:
            r7 = 1
        L_0x01bb:
            int r4 = r5.length()
            if (r4 != 0) goto L_0x02c8
            X.2FW r4 = r3.Aqm()
            java.lang.String r5 = r4.A00
        L_0x01c7:
            int r4 = X.JTR.A0G(r53)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            com.meta.foa.instagram.performancelogging.lss.IGFOAMessagingLocalSendSpeedLogger r4 = X.C328727Fx.A00(r0, r4)
            if (r4 == 0) goto L_0x01d8
            r4.onLogCreateSendMutationEnd()
        L_0x01d8:
            java.lang.String r4 = r6.A00
            r8 = r0
            r9 = r3
            r10 = r19
            r11 = r56
            r12 = r4
            r13 = r16
            java.lang.String r8 = A01(r8, r9, r10, r11, r12, r13)
            boolean r4 = A02(r56)
            if (r4 != 0) goto L_0x02c5
            java.lang.String r9 = "share_extension"
            boolean r4 = X.0qQ.A0K(r13, r9)
            if (r4 != 0) goto L_0x02c5
            r9 = 1
            boolean r4 = X.OYx.A01(r0, r3)
            if (r4 == 0) goto L_0x01fe
            r9 = 13
        L_0x01fe:
            if (r9 == r1) goto L_0x02be
            r4 = 13
            if (r9 == r4) goto L_0x02be
        L_0x0204:
            java.lang.String r4 = r3.A05
            com.meta.foa.instagram.performancelogging.s2s.IGFOAMessagingSendToSentLogger r11 = X.C66581MXm.A0k(r0, r4)
            int r12 = r14.size()
            X.3U9 r10 = X.C66582MXn.A0a(r0, r6)
            r9 = 0
            int r4 = X.JTR.A0G(r53)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            com.meta.foa.instagram.performancelogging.lss.IGFOAMessagingLocalSendSpeedLogger r8 = X.C328727Fx.A00(r0, r4)
            if (r8 == 0) goto L_0x0263
            if (r10 == 0) goto L_0x02bb
            boolean r4 = r10.CVE()
        L_0x0227:
            r8.annotateIsVm(r4)
            if (r10 == 0) goto L_0x02b8
            X.ODs r4 = r10.B25()
            if (r4 == 0) goto L_0x02b8
            boolean r4 = X.C70054NwW.A00(r4)
        L_0x0236:
            r8.annotateIsDm(r4)
            if (r10 == 0) goto L_0x02b6
            X.ODs r4 = r10.B25()
            if (r4 == 0) goto L_0x02b6
            java.lang.Long r4 = r4.A01
        L_0x0243:
            r8.annotateEphemeralLifetimeMs(r4)
            if (r10 == 0) goto L_0x0255
            boolean r4 = r10.CVb()
            if (r4 == r1) goto L_0x0254
            boolean r4 = r10.CVZ(r0)
            if (r4 != r1) goto L_0x0255
        L_0x0254:
            r9 = 1
        L_0x0255:
            r8.annotateIsInstamadillo(r9)
            r8.annotateIsLink(r7)
            if (r5 == 0) goto L_0x0260
            r8.annotateMessageSubtype(r5)
        L_0x0260:
            r8.annotateNumSendMutationsCreated(r12)
        L_0x0263:
            int r4 = X.JTR.A0G(r53)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            com.meta.foa.instagram.performancelogging.lss.IGFOAMessagingLocalSendSpeedLogger r4 = X.C328727Fx.A00(r0, r4)
            if (r4 == 0) goto L_0x0274
            r4.onLogDispatchSendMutationStart()
        L_0x0274:
            X.1Ou r10 = X.1Ou.A01(r0)
            if (r11 == 0) goto L_0x02aa
            X.0eK r4 = r10.A0J
            java.lang.Object r4 = r4.get()
            boolean r13 = X.AnonymousClass7TE.A1a(r4)
            X.5DE r9 = r10.A0A
            monitor-enter(r9)
            java.util.Map r12 = r9.A02     // Catch:{ all -> 0x03e1 }
            java.util.Iterator r16 = X.DbV.A16(r12)     // Catch:{ all -> 0x03e1 }
            r8 = 0
        L_0x028e:
            boolean r4 = r16.hasNext()     // Catch:{ all -> 0x03e1 }
            if (r4 == 0) goto L_0x02a6
            java.lang.Object r4 = r16.next()     // Catch:{ all -> 0x03e1 }
            java.lang.Object r4 = r12.get(r4)     // Catch:{ all -> 0x03e1 }
            java.util.HashMap r4 = (java.util.HashMap) r4     // Catch:{ all -> 0x03e1 }
            if (r4 == 0) goto L_0x028e
            int r4 = r4.size()     // Catch:{ all -> 0x03e1 }
            int r8 = r8 + r4
            goto L_0x028e
        L_0x02a6:
            monitor-exit(r9)     // Catch:{ all -> 0x03e1 }
            r11.onLogDispatchMutationStart(r0, r13, r8)
        L_0x02aa:
            r10.A0A(r3)
            if (r11 == 0) goto L_0x02b2
            r11.onLogDispatchMutationEnd()
        L_0x02b2:
            java.lang.String r8 = r3.A05
            goto L_0x014f
        L_0x02b6:
            r4 = 0
            goto L_0x0243
        L_0x02b8:
            r4 = 0
            goto L_0x0236
        L_0x02bb:
            r4 = 0
            goto L_0x0227
        L_0x02be:
            X.OYx r4 = X.O58.A01
            r4.A02(r0, r3, r8)
            goto L_0x0204
        L_0x02c5:
            r9 = 4
            goto L_0x01fe
        L_0x02c8:
            r8 = 124(0x7c, float:1.74E-43)
            X.2FW r4 = r3.Aqm()
            java.lang.String r4 = r4.A00
            java.lang.String r5 = X.002.A0T(r5, r4, r8)
            goto L_0x01c7
        L_0x02d6:
            java.lang.Class<X.1cE> r30 = X.1cE.class
            r27 = r0
            r28 = r48
            r29 = r49
            r31 = r51
            r32 = r16
            r33 = r53
            r34 = r54
            r35 = r2
            X.MaY r25 = X.C66669Mac.A01(r27, r28, r29, r30, r31, r32, r33, r34, r35)
            if (r60 == 0) goto L_0x02f6
            boolean r3 = r23.A05()
            r32 = 1
            if (r3 == 0) goto L_0x02f8
        L_0x02f6:
            r32 = 0
        L_0x02f8:
            r4 = 0
            r12 = r59
            if (r59 == 0) goto L_0x035b
            java.lang.String r3 = r12.A01
            if (r3 == 0) goto L_0x035b
            X.5FY r8 = r12.A00()
            X.5FV r8 = r8.A00
            if (r8 != 0) goto L_0x030b
            X.5FV r8 = X.AnonymousClass5FV.None
        L_0x030b:
            boolean r8 = r8.A01
            if (r8 == 0) goto L_0x03a8
            java.lang.Integer r30 = X.AnonymousClass05K.A09
        L_0x0311:
            if (r48 == 0) goto L_0x031b
            boolean r4 = X.C70054NwW.A00(r48)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
        L_0x031b:
            r28 = r6
            r29 = r4
            r31 = r54
            r33 = r2
            X.797 r4 = X.AnonymousClass796.A02(r27, r28, r29, r30, r31, r32, r33)
            boolean r10 = r4.A00()
            X.1ud r8 = X.1ua.A0G
            android.content.Context r4 = X.C51966G9m.A0P(r0)
            X.1ua r8 = r8.A01(r4, r0)
            r4 = r18
            X.0qQ.A0B(r8, r4)
            java.lang.String r9 = X.JTQ.A0Z()
            X.3Q2 r4 = new X.3Q2
            r4.<init>(r9)
            X.1iA r9 = X.1iA.A06
            r4.A0V(r9)
            com.instagram.pendingmedia.model.constants.ShareType r9 = com.instagram.pendingmedia.model.constants.ShareType.DIRECT_SHARE
            r4.A0e(r9)
            r4.A33 = r3
            if (r10 == 0) goto L_0x0398
            r4.A5D = r1
        L_0x0353:
            r4.A53 = r1
        L_0x0355:
            r8.A0C(r4)
            X.C64008LIv.A00(r0, r6, r4, r8)
        L_0x035b:
            long r8 = X.AnonymousClass7TG.A0H()
            java.lang.Long r38 = java.lang.Long.valueOf(r8)
            java.lang.Boolean r32 = java.lang.Boolean.valueOf(r55)
            java.lang.Boolean r33 = java.lang.Boolean.valueOf(r2)
            X.1cE r3 = new X.1cE
            r36 = r69
            r35 = r68
            r34 = r67
            r31 = r65
            r27 = r63
            r24 = r61
            r21 = r57
            r47 = r83
            r46 = r80
            r45 = r79
            r44 = r78
            r43 = r77
            r42 = r74
            r22 = r12
            r28 = r6
            r29 = r19
            r30 = r4
            r40 = r13
            r20 = r3
            r20.<init>(r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47)
            goto L_0x01a1
        L_0x0398:
            r4.A6C = r1
            r9 = 36325733878084777(0x810e10000234a9, double:3.035878604265978E-306)
            boolean r3 = X.182.A06(r15, r0, r9)
            if (r3 != 0) goto L_0x0353
            r4.A4x = r1
            goto L_0x0355
        L_0x03a8:
            java.lang.Integer r30 = X.AnonymousClass05K.A00
            goto L_0x0311
        L_0x03ac:
            boolean r3 = X.00p.A0i(r10, r5, r2)
            if (r3 == 0) goto L_0x03da
            int r4 = r10.length()
            int r3 = r5.length()
            int r4 = r4 - r3
            java.lang.String r3 = X.C51967G9n.A0q(r10, r2, r4)
            java.lang.String r4 = X.DbV.A12(r3)
            X.OC7 r3 = new X.OC7
            r3.<init>(r4, r2)
            r14.add(r3)
            X.OC7 r4 = new X.OC7
            r4.<init>(r5, r1)
            goto L_0x0141
        L_0x03d2:
            if (r13 != 0) goto L_0x013c
            boolean r3 = A02(r56)
            if (r3 == 0) goto L_0x013c
        L_0x03da:
            X.OC7 r4 = new X.OC7
            r4.<init>(r11, r1)
            goto L_0x0141
        L_0x03e1:
            r0 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x03e1 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71052OaU.A00(X.N49, com.instagram.common.session.UserSession, X.OKm, X.3tI, com.instagram.direct.model.mentions.SendMentionData$MentionData, X.OCA, X.Nji, com.instagram.model.direct.DirectThreadKey, java.lang.Boolean, java.lang.Boolean, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.util.List, boolean, boolean, boolean):java.lang.String");
    }
}
