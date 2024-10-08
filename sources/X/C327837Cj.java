package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.7Cj  reason: invalid class name and case insensitive filesystem */
public final class C327837Cj {
    public static CharSequence A00;
    public static final C327837Cj A01 = new Object();

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0044, code lost:
        if (X.182.A06(r4, r8, 36316692971917920L) == false) goto L_0x004d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String A02(android.content.Context r7, com.instagram.common.session.UserSession r8, X.AnonymousClass170 r9, java.lang.String r10, boolean r11) {
        /*
            X.0Tu r4 = X.0Tu.A05
            r0 = 36598167948495996(0x8205d700000c7c, double:3.208167007397982E-306)
            long r5 = X.182.A01(r4, r8, r0)
            r3 = 0
            r1 = 1
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x007e
            java.lang.String r2 = r9.getUsername()
            boolean r0 = r9 instanceof com.instagram.user.model.User
            r1 = 1
            if (r0 == 0) goto L_0x0046
            com.instagram.user.model.User r9 = (com.instagram.user.model.User) r9
            X.4Cl r0 = r9.A03
            java.lang.String r5 = r0.getCategory()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            X.4Cl r0 = r9.A03
            java.lang.Boolean r0 = r0.BuZ()
            boolean r1 = r1.equals(r0)
            if (r5 == 0) goto L_0x0046
            int r0 = r5.length()
            if (r0 == 0) goto L_0x0046
            if (r1 == 0) goto L_0x0046
            r0 = 36316692971917920(0x8105d700021260, double:3.03016109880125E-306)
            boolean r0 = X.182.A06(r4, r8, r0)
            if (r0 == 0) goto L_0x004d
        L_0x0046:
            r0 = 2131969125(0x7f134465, float:1.9575164E38)
            java.lang.String r5 = r7.getString(r0)
        L_0x004d:
            X.0qQ.A0A(r5)
            android.text.SpannableStringBuilder r3 = new android.text.SpannableStringBuilder
            r3.<init>()
            r3.append(r5)
            r0 = 36329968715776396(0x8111ea0001418c, double:3.03855673267448E-306)
            boolean r0 = X.182.A06(r4, r8, r0)
            if (r0 != 0) goto L_0x0079
            boolean r0 = r10.equals(r2)
            if (r0 != 0) goto L_0x0079
            if (r11 != 0) goto L_0x0079
            r0 = 2131961000(0x7f1324a8, float:1.9558685E38)
            java.lang.String r0 = r7.getString(r0)
            android.text.SpannableStringBuilder r0 = r3.append(r0)
            r0.append(r2)
        L_0x0079:
            java.lang.String r0 = r3.toString()
            return r0
        L_0x007e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C327837Cj.A02(android.content.Context, com.instagram.common.session.UserSession, X.170, java.lang.String, boolean):java.lang.String");
    }

    private final User A01(UserSession userSession, AnonymousClass2Ep r7) {
        C242243Te r1;
        String str;
        List<User> BRZ = r7.BRZ();
        if (BRZ.size() > 1 || r7.CUG()) {
            if (r7.C6a() != 29 || (r1 = ((AnonymousClass3U9) r7).A01.A0s) == null || (str = r1.A07) == null) {
                return null;
            }
            for (User user : BRZ) {
                if (0qQ.A0K(user.getId(), str)) {
                    return user;
                }
            }
            return null;
        } else if (BRZ.isEmpty()) {
            return 0eE.A00(userSession).A00();
        } else {
            return (User) BRZ.get(0);
        }
    }

    private final boolean A03(UserSession userSession, AnonymousClass2Ep r5) {
        String str;
        User A012 = A01(userSession, r5);
        if (r5.C6a() == 1014) {
            if (A012 != null) {
                str = A012.A03.AaR();
            } else {
                str = null;
            }
            if (!0qQ.A0K(str, userSession.A06) || r5.BHS() == 1) {
                return false;
            }
            return true;
        }
        return false;
    }

    public static final boolean A04(UserSession userSession, AnonymousClass2Ep r5) {
        if (r5.CUG()) {
            return false;
        }
        C251033mS A002 = C251033mS.A00(userSession);
        0sn r0 = r5.BJy().A02;
        if (r0 == null) {
            r0 = 0sn.A00;
        }
        if (C250993mO.A01(userSession).A0E(C250993mO.A03(A002, r0))) {
            return true;
        }
        return false;
    }

    public static final boolean A05(UserSession userSession, AnonymousClass2Ep r5) {
        if (r5.C6a() == 29) {
            1Av A002 = 1Au.A00(userSession);
            String C6C = r5.C6C();
            if (C6C == null) {
                C6C = "";
            }
            if (A002.A01.getBoolean(002.A0R("broadcast_channel_tap_for_more_info_in_thread_header/", C6C), false) || !182.A06(0Tu.A05, userSession, 36328723175259702L)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public static final boolean A06(AnonymousClass2Ep r2) {
        if (r2.BRZ().size() != 1 || !((User) 00k.A0I(r2.BRZ())).A1X()) {
            return false;
        }
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v70, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v73, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v75, resolved type: android.text.SpannableStringBuilder} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v17, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v21, resolved type: android.text.SpannableStringBuilder} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v76, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v90, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v92, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v93, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v94, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v102, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v105, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v106, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v107, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v108, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v60, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v61, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v62, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v63, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v64, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v110, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r2v32, types: [android.text.SpannableStringBuilder] */
    /* JADX WARNING: type inference failed for: r2v41, types: [android.text.SpannableStringBuilder] */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0239, code lost:
        if (X.182.A06(r4, r1, 36330479816950417L) != false) goto L_0x04ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x027a, code lost:
        if (X.182.A06(X.0Tu.A05, r1, 36330479816819343L) == false) goto L_0x027c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x0368, code lost:
        if (r3.CaM() == false) goto L_0x036c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x03ac, code lost:
        if (X.I5N.A03(r1) == false) goto L_0x03ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x03cc, code lost:
        if (r4.A01.getBoolean(X.002.A0R("show_blends_add_icon_for_thread", r0), false) != false) goto L_0x03ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:252:0x050e, code lost:
        if (X.C66649MaI.A01(r0, r3.C6C(), r3.BRZ()) == false) goto L_0x0152;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:267:0x054e, code lost:
        if (r0.A0D(r8) != false) goto L_0x0550;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:273:0x0569, code lost:
        if (X.C66649MaI.A00(r3.C6a()) == false) goto L_0x04f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:287:0x05a0, code lost:
        if (X.C66649MaI.A01(r0, r3.C6C(), r3.BRZ()) == false) goto L_0x0124;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:317:0x0663, code lost:
        if (r4 == 0) goto L_0x0665;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:340:0x06bf, code lost:
        if (r2 != null) goto L_0x065f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:370:0x075c, code lost:
        if (r2 != null) goto L_0x065f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:373:0x0764, code lost:
        r2 = r6.getString(2131957105);
        X.0qQ.A07(r2);
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:374:0x0772, code lost:
        if (r3.AYf() == 0) goto L_0x065f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:375:0x0774, code lost:
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:376:0x077a, code lost:
        if (r3.BHS() == 8) goto L_0x065f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:377:0x077c, code lost:
        r7 = r6.getResources();
        X.0qQ.A07(r7);
        r5 = r6.getString(2131959355, new java.lang.Object[]{X.C253673rC.A04(r7, java.lang.Integer.valueOf(r3.AYf()), com.facebook.cameracore.instagram.ardelivery.networkconsentmanager.IgNetworkConsentStorage.MAX_ENTRIES, true, true)});
        X.0qQ.A07(r5);
        r2 = X.002.A0g(r2, " • ", r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0122, code lost:
        if (X.182.A06(r4, r1, 36316409504272735L) == false) goto L_0x0570;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0150, code lost:
        if (X.182.A06(r4, r1, 36316409504272735L) == false) goto L_0x04d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01ac, code lost:
        if (r0.A1T() != true) goto L_0x04d4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01d3, code lost:
        if (r26.equals("ai_home_from_thread") == false) goto L_0x01d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x01e8, code lost:
        if (X.182.A06(X.0Tu.A05, r1, 36325145467957892L) == false) goto L_0x01ea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0053, code lost:
        if (r4 == 8) goto L_0x0055;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x0263  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x026d  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x02c4  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x02d2  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x02d6  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x031d  */
    /* JADX WARNING: Removed duplicated region for block: B:217:0x0480  */
    /* JADX WARNING: Removed duplicated region for block: B:218:0x0483  */
    /* JADX WARNING: Removed duplicated region for block: B:219:0x0487  */
    /* JADX WARNING: Removed duplicated region for block: B:224:0x04a2  */
    /* JADX WARNING: Removed duplicated region for block: B:233:0x04c7  */
    /* JADX WARNING: Removed duplicated region for block: B:323:0x067e  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x012c  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0182  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0196  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.AnonymousClass7LZ A00(android.content.Context r89, com.instagram.common.session.UserSession r90, com.instagram.direct.capabilities.Capabilities r91, X.C329967Kx r92, X.AnonymousClass2Ep r93, java.lang.String r94, int r95, boolean r96, boolean r97, boolean r98, boolean r99, boolean r100, boolean r101, boolean r102, boolean r103, boolean r104, boolean r105, boolean r106) {
        /*
            r13 = 0
            r14 = 1
            r1 = r90
            X.0qQ.A0B(r1, r14)
            r2 = 2
            r31 = r91
            r0 = r31
            X.0qQ.A0B(r0, r2)
            r2 = 6
            r30 = r92
            r0 = r30
            X.0qQ.A0B(r0, r2)
            r2 = 14
            r26 = r94
            r0 = r26
            X.0qQ.A0B(r0, r2)
            r23 = 0
            r6 = r89
            X.MaI r0 = X.C66653MaM.A00(r6, r1)
            X.7Cj r22 = A01
            r3 = r93
            if (r96 == 0) goto L_0x0915
            java.util.List r2 = r3.BRZ()
            java.lang.String r17 = X.AnonymousClass50n.A00(r6, r1, r2)
        L_0x0036:
            X.0qQ.A07(r17)
            r2 = r3
            X.3U9 r2 = (X.AnonymousClass3U9) r2
            X.3S9 r2 = r2.A01
            r28 = r2
            X.3Te r2 = r2.A0s
            if (r2 == 0) goto L_0x0911
            int r2 = r2.A01
            r20 = r2
        L_0x0048:
            int r4 = r3.BHS()
            r7 = 6
            if (r4 == r7) goto L_0x0055
            r2 = 8
            r65 = 0
            if (r4 != r2) goto L_0x0057
        L_0x0055:
            r65 = 1
        L_0x0057:
            r2 = r22
            com.instagram.user.model.User r29 = r2.A01(r1, r3)
            java.util.List r16 = r3.AxI()
            X.MaQ r2 = X.C66650MaJ.A00(r1, r3)
            com.instagram.model.reels.Reel r18 = X.C66650MaJ.A01(r1, r2)
            if (r18 == 0) goto L_0x090d
            r2 = r18
            boolean r52 = r2.A16(r1)
        L_0x0071:
            X.7LZ r2 = X.AnonymousClass7LZ.A0y
            r2 = r30
            int r2 = r2.A03
            r19 = r2
            java.lang.Integer r8 = java.lang.Integer.valueOf(r19)
            r2 = 0
            A00 = r23
            int r5 = r3.BHS()
            boolean r15 = r3.CUG()
            java.util.List r12 = r3.BRZ()
            boolean r4 = X.C66640Ma9.A05(r12, r15)
            if (r4 == 0) goto L_0x05b5
            X.1YZ r4 = X.1YZ.A02
            if (r4 == 0) goto L_0x05b5
            r2 = 2131972358(0x7f135106, float:1.9581721E38)
            java.lang.String r2 = r6.getString(r2)
        L_0x009d:
            r4 = r17
            boolean r4 = android.text.TextUtils.equals(r4, r2)
            if (r4 == 0) goto L_0x00a6
            r2 = 0
        L_0x00a6:
            com.instagram.model.direct.DirectThreadKey r4 = r3.BJy()
            X.3t3 r27 = X.C66647MaG.A08(r4)
            boolean r4 = X.C66648MaH.A01(r1, r3)
            r45 = 0
            if (r4 != 0) goto L_0x00fa
            com.instagram.model.direct.DirectThreadKey r4 = r3.BJy()
            java.util.List r6 = r4.A02
            if (r6 != 0) goto L_0x00c0
            X.0sn r6 = X.0sn.A00
        L_0x00c0:
            boolean r4 = r3.CUG()
            if (r4 != 0) goto L_0x05a9
            X.3su r4 = r3.BKv()
            if (r4 != 0) goto L_0x05a9
            java.util.List r4 = r3.BRZ()
            int r4 = r4.size()
            if (r4 != r14) goto L_0x05a9
            java.util.List r4 = r3.BRZ()
            java.lang.Object r4 = r4.get(r13)
            com.instagram.user.model.User r4 = (com.instagram.user.model.User) r4
            boolean r4 = r4.CPm()
            if (r4 == 0) goto L_0x05a9
        L_0x00e6:
            X.3mS r5 = X.C251033mS.A00(r1)
            X.3mO r4 = X.C250993mO.A01(r1)
            java.util.List r5 = X.C250993mO.A03(r5, r6)
            boolean r4 = r4.A0D(r5)
            if (r4 == 0) goto L_0x00fa
            r45 = 1
        L_0x00fa:
            r94 = r98
            if (r98 != 0) goto L_0x0124
            boolean r4 = X.C66648MaH.A01(r1, r3)
            if (r4 != 0) goto L_0x05a2
            if (r99 == 0) goto L_0x0570
            X.0Tu r4 = X.0Tu.A05
            r5 = 36316740216427125(0x8105e200001275, double:3.03019097641911E-306)
            boolean r5 = X.182.A06(r4, r1, r5)
            if (r5 != 0) goto L_0x0124
            boolean r5 = X.C272094k5.A00(r1)
            if (r5 == 0) goto L_0x0570
            r5 = 36316409504272735(0x8105950005115f, double:3.029981832721003E-306)
            boolean r4 = X.182.A06(r4, r1, r5)
            if (r4 == 0) goto L_0x0570
        L_0x0124:
            r46 = 0
        L_0x0126:
            boolean r47 = r0.A04(r3)
            if (r98 != 0) goto L_0x0152
            boolean r4 = X.C66648MaH.A00(r1, r3)
            if (r4 != 0) goto L_0x0510
            if (r99 == 0) goto L_0x04d8
            X.0Tu r4 = X.0Tu.A05
            r5 = 36316740216427125(0x8105e200001275, double:3.03019097641911E-306)
            boolean r5 = X.182.A06(r4, r1, r5)
            if (r5 != 0) goto L_0x0152
            boolean r5 = X.C272094k5.A00(r1)
            if (r5 == 0) goto L_0x04d8
            r5 = 36316409504272735(0x8105950005115f, double:3.029981832721003E-306)
            boolean r4 = X.182.A06(r4, r1, r5)
            if (r4 == 0) goto L_0x04d8
        L_0x0152:
            r48 = 0
        L_0x0154:
            boolean r49 = r0.A03(r3)
            boolean r50 = r3.CUG()
            boolean r51 = r3.Ca9()
            X.34S r24 = X.AnonymousClass48N.A00(r1, r3)
            X.0t1 r0 = X.0eE.A00(r1)
            com.instagram.user.model.User r5 = r0.A00()
            java.util.List r4 = r3.BRZ()
            boolean r0 = r3.CUG()
            r0 = r0 ^ 1
            java.util.ArrayList r35 = X.AnonymousClass3UE.A05(r5, r4, r0)
            int r0 = r3.C6M()
            r53 = 0
            if (r0 != r14) goto L_0x0184
            r53 = 1
        L_0x0184:
            boolean r54 = X.C66648MaH.A01(r1, r3)
            r0 = r22
            com.instagram.user.model.User r0 = r0.A01(r1, r3)
            boolean r4 = r3.CQq()
            r55 = 1
            if (r4 == 0) goto L_0x04d4
            if (r0 == 0) goto L_0x04d1
            X.4Cl r4 = r0.A03
            java.lang.String r4 = r4.AaZ()
        L_0x019e:
            java.lang.String r5 = r1.A06
            boolean r4 = X.0qQ.A0K(r4, r5)
            if (r4 != 0) goto L_0x01ae
            if (r0 == 0) goto L_0x04d4
            boolean r0 = r0.A1T()
            if (r0 != r14) goto L_0x04d4
        L_0x01ae:
            r0 = r22
            boolean r56 = r0.A03(r1, r3)
            java.lang.String r4 = "ai_home_chat_with_ai"
            r0 = r26
            boolean r0 = r0.equals(r4)
            r57 = 0
            if (r0 != 0) goto L_0x01d5
            java.lang.String r4 = "ai_home_inbox_qp"
            r0 = r26
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x01d5
            java.lang.String r4 = "ai_home_from_thread"
            r0 = r26
            boolean r0 = r0.equals(r4)
            r8 = 0
            if (r0 == 0) goto L_0x01d6
        L_0x01d5:
            r8 = 1
        L_0x01d6:
            boolean r0 = A06(r3)
            if (r0 == 0) goto L_0x01ea
            X.0Tu r0 = X.0Tu.A05
            r4 = 36325145467957892(0x810d8700083284, double:3.035506491332398E-306)
            boolean r0 = X.182.A06(r0, r1, r4)
            r7 = 1
            if (r0 != 0) goto L_0x01eb
        L_0x01ea:
            r7 = 0
        L_0x01eb:
            boolean r0 = r3.COb()
            if (r0 == 0) goto L_0x04ce
            boolean r0 = A06(r3)
            if (r0 != 0) goto L_0x04ce
            X.0Tu r4 = X.0Tu.A05
            r5 = 36325145467761281(0x810d8700053281, double:3.035506491208061E-306)
            boolean r0 = X.182.A06(r4, r1, r5)
            if (r0 == 0) goto L_0x04ce
            boolean r0 = r3.COb()
            if (r0 == 0) goto L_0x023b
            com.instagram.user.model.User r0 = r3.BZK()
            if (r0 == 0) goto L_0x04ca
            X.4Cl r0 = r0.A03
            java.lang.String r5 = r0.AaR()
        L_0x0216:
            java.lang.String r0 = r1.A06
            boolean r0 = X.0qQ.A0K(r5, r0)
            if (r0 == 0) goto L_0x023b
            com.instagram.user.model.User r0 = r3.BZK()
            if (r0 == 0) goto L_0x022a
            X.4Cl r0 = r0.A03
            com.instagram.api.schemas.IGAIAgentVisibilityStatus r23 = r0.AaY()
        L_0x022a:
            com.instagram.api.schemas.IGAIAgentVisibilityStatus r5 = com.instagram.api.schemas.IGAIAgentVisibilityStatus.PUBLIC
            r0 = r23
            if (r0 != r5) goto L_0x023b
            r5 = 36330479816950417(0x81126100024291, double:3.0388799551149704E-306)
            boolean r0 = X.182.A06(r4, r1, r5)
            if (r0 != 0) goto L_0x04ce
        L_0x023b:
            r0 = 1
        L_0x023c:
            if (r7 != 0) goto L_0x0240
            if (r0 == 0) goto L_0x0251
        L_0x0240:
            if (r8 != 0) goto L_0x0251
            X.0Tu r0 = X.0Tu.A05
            r4 = 36325145467433598(0x810d870000327e, double:3.0355064910008326E-306)
            boolean r0 = X.182.A06(r0, r1, r4)
            if (r0 == 0) goto L_0x0251
            r57 = 1
        L_0x0251:
            boolean r0 = r3.COb()
            if (r0 == 0) goto L_0x027c
            boolean r0 = A06(r3)
            if (r0 != 0) goto L_0x027c
            com.instagram.user.model.User r0 = r3.BZK()
            if (r0 == 0) goto L_0x04c7
            X.4Cl r0 = r0.A03
            com.instagram.api.schemas.IGAIAgentVisibilityStatus r0 = r0.AaY()
        L_0x0269:
            com.instagram.api.schemas.IGAIAgentVisibilityStatus r4 = com.instagram.api.schemas.IGAIAgentVisibilityStatus.PUBLIC
            if (r0 != r4) goto L_0x027c
            X.0Tu r0 = X.0Tu.A05
            r4 = 36330479816819343(0x8112610000428f, double:3.0388799550320787E-306)
            boolean r0 = X.182.A06(r0, r1, r4)
            r58 = 1
            if (r0 != 0) goto L_0x027e
        L_0x027c:
            r58 = 0
        L_0x027e:
            java.lang.Integer r4 = r3.BMT()
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            r59 = 0
            if (r4 == r0) goto L_0x02be
            if (r97 == 0) goto L_0x02be
            boolean r0 = r3.isPending()
            if (r0 != 0) goto L_0x02be
            boolean r0 = r3.COb()
            if (r0 != 0) goto L_0x02be
            X.0t1 r0 = X.0eE.A00(r1)
            com.instagram.user.model.User r0 = r0.A00()
            boolean r0 = X.2Ek.A02(r0)
            if (r0 != 0) goto L_0x02be
            r0 = r22
            boolean r0 = r0.A03(r1, r3)
            if (r0 != 0) goto L_0x02be
            boolean r4 = r3.CUG()
            java.util.List r0 = r3.BRZ()
            boolean r0 = X.C66640Ma9.A05(r0, r4)
            if (r0 == 0) goto L_0x04c3
            X.1YZ r0 = X.1YZ.A02
            if (r0 == 0) goto L_0x04c3
        L_0x02be:
            boolean r0 = r3.COb()
            if (r0 != 0) goto L_0x04a2
            boolean r60 = r3.isPending()
        L_0x02c8:
            java.util.List r0 = r3.BRZ()
            boolean r4 = r3.CUG()
            if (r4 == 0) goto L_0x0487
            r61 = 0
        L_0x02d4:
            if (r29 == 0) goto L_0x0483
            com.instagram.direct.model.messaginguser.MessagingUser r26 = com.instagram.direct.model.messaginguser.MessagingUser.A00(r29)
        L_0x02da:
            boolean r62 = X.AnonymousClass48N.A0C(r3)
            r0 = r30
            int r12 = r0.A0O
            int r11 = r0.A00
            int r10 = r0.A01
            int r9 = r0.A02
            X.0Tu r8 = X.0Tu.A05
            r4 = 36313845408467208(0x81034000000908, double:3.0283602882088024E-306)
            boolean r0 = X.182.A06(r8, r1, r4)
            r64 = 0
            if (r0 == 0) goto L_0x02ff
            X.9IV r0 = r3.Bbp()
            if (r0 == 0) goto L_0x02ff
            r64 = 1
        L_0x02ff:
            int r43 = r3.C6a()
            java.util.List r0 = r3.AZs()
            java.lang.String r5 = r1.A06
            boolean r66 = r0.contains(r5)
            boolean r67 = X.C66651MaK.A04(r3)
            boolean r68 = A04(r1, r3)
            if (r16 == 0) goto L_0x0480
            boolean r0 = r16.isEmpty()
            if (r0 != 0) goto L_0x0480
            r0 = r16
            java.lang.Object r6 = r0.get(r13)
            X.9Iv r6 = (X.C376659Iv) r6
        L_0x0325:
            boolean r69 = r3.CVr()
            int r4 = r3.C6a()
            r0 = r28
            X.3Te r0 = r0.A0s
            boolean r70 = X.C329997La.A05(r0, r5, r4)
            boolean r0 = r3.COb()
            r71 = 0
            if (r0 == 0) goto L_0x0356
            java.lang.String r4 = r3.BZP()
            if (r4 == 0) goto L_0x0356
            X.7ZW r0 = new X.7ZW
            r0.<init>(r1)
            java.lang.Boolean r0 = r0.A00(r4)
            if (r0 == 0) goto L_0x0356
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0356
            r71 = 1
        L_0x0356:
            boolean r0 = r3.isMuted()
            if (r0 != 0) goto L_0x036a
            boolean r0 = r3.CeU()
            if (r0 != 0) goto L_0x036a
            boolean r0 = r3.CaM()
            r73 = 0
            if (r0 == 0) goto L_0x036c
        L_0x036a:
            r73 = 1
        L_0x036c:
            int r0 = r3.BHS()
            r74 = 1
            if (r0 == r14) goto L_0x0376
            r74 = 0
        L_0x0376:
            boolean r75 = r3.COP()
            X.9HW r7 = X.AnonymousClass9HV.A00(r1)
            com.instagram.model.direct.DirectThreadKey r0 = r3.BJy()
            X.3t3 r4 = X.C66647MaG.A08(r0)
            r0 = 71
            boolean r0 = r7.A00(r4, r0)
            if (r0 != 0) goto L_0x047a
            r77 = 0
        L_0x0390:
            if (r106 == 0) goto L_0x03ae
            X.9HW r7 = X.AnonymousClass9HV.A00(r1)
            com.instagram.model.direct.DirectThreadKey r0 = r3.BJy()
            X.3t3 r4 = X.C66647MaG.A08(r0)
            r0 = 69
            boolean r0 = r7.A00(r4, r0)
            if (r0 == 0) goto L_0x03ae
            boolean r0 = X.I5N.A03(r1)
            r78 = 1
            if (r0 != 0) goto L_0x03b0
        L_0x03ae:
            r78 = 0
        L_0x03b0:
            if (r104 != 0) goto L_0x03ce
            X.1Av r4 = X.1Au.A00(r1)
            java.lang.String r0 = r3.C6C()
            if (r0 != 0) goto L_0x03be
            java.lang.String r0 = ""
        L_0x03be:
            X.0xa r7 = r4.A01
            java.lang.String r4 = "show_blends_add_icon_for_thread"
            java.lang.String r0 = X.002.A0R(r4, r0)
            boolean r0 = r7.getBoolean(r0, r13)
            r79 = 0
            if (r0 == 0) goto L_0x03d0
        L_0x03ce:
            r79 = 1
        L_0x03d0:
            int r44 = r3.BRT()
            boolean r82 = A05(r1, r3)
            boolean r4 = A05(r1, r3)
            r0 = 6
            java.lang.Integer r32 = java.lang.Integer.valueOf(r0)
            if (r4 != 0) goto L_0x03e9
            java.lang.CharSequence r0 = A00
            if (r0 != 0) goto L_0x03e9
            r32 = 0
        L_0x03e9:
            boolean r0 = A05(r1, r3)
            if (r0 == 0) goto L_0x0476
            r0 = 4000(0xfa0, float:5.605E-42)
            java.lang.Integer r33 = java.lang.Integer.valueOf(r0)
        L_0x03f5:
            com.instagram.model.direct.DirectThreadKey r0 = r3.BJy()
            X.3t3 r86 = X.C66647MaG.A08(r0)
            int r88 = r3.C6a()
            r0 = r28
            X.3Te r0 = r0.A0s
            if (r0 == 0) goto L_0x0474
            java.lang.String r7 = r0.A07
        L_0x0409:
            java.util.List r0 = r3.AZs()
            boolean r89 = r0.contains(r5)
            r83 = 0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r13)
            X.7Cl r85 = X.C327847Ck.A00(r0)
            boolean r0 = X.AnonymousClass7GL.A02(r1, r3)
            r92 = 0
            if (r0 == 0) goto L_0x0425
            r92 = 1
        L_0x0425:
            X.9Gx r4 = X.C376179Gx.THREAD_DETAILS_ADD_MEMBER_TO_GROUP_CHAT
            r0 = r31
            boolean r93 = r0.A00(r4)
            boolean r90 = r3.isPending()
            boolean r91 = r3.CUG()
            r84 = r1
            r87 = r7
            boolean r0 = X.C327867Cm.A00(r84, r85, r86, r87, r88, r89, r90, r91, r92, r93, r94)
            if (r0 == 0) goto L_0x044c
            r3 = 36329058182643467(0x81111600003f0b, double:3.0379809078547933E-306)
            boolean r0 = X.182.A06(r8, r1, r3)
            if (r0 == 0) goto L_0x044c
            r83 = 1
        L_0x044c:
            java.lang.CharSequence r31 = A00
            X.7LZ r23 = new X.7LZ
            r81 = r102
            r63 = r103
            r80 = r105
            r41 = r95
            r72 = r100
            r76 = r101
            r25 = r6
            r28 = r18
            r30 = r2
            r34 = r17
            r36 = r12
            r37 = r11
            r38 = r19
            r39 = r10
            r40 = r9
            r42 = r20
            r23.<init>(r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r70, r71, r72, r73, r74, r75, r76, r77, r78, r79, r80, r81, r82, r83)
            return r23
        L_0x0474:
            r7 = 0
            goto L_0x0409
        L_0x0476:
            r33 = 0
            goto L_0x03f5
        L_0x047a:
            boolean r77 = X.I5N.A03(r1)
            goto L_0x0390
        L_0x0480:
            r6 = 0
            goto L_0x0325
        L_0x0483:
            r26 = 0
            goto L_0x02da
        L_0x0487:
            boolean r4 = r0.isEmpty()
            if (r4 == 0) goto L_0x049b
            X.0t1 r0 = X.0eE.A00(r1)
            com.instagram.user.model.User r0 = r0.A00()
        L_0x0495:
            boolean r61 = r0.isVerified()
            goto L_0x02d4
        L_0x049b:
            java.lang.Object r0 = r0.get(r13)
            com.instagram.user.model.User r0 = (com.instagram.user.model.User) r0
            goto L_0x0495
        L_0x04a2:
            boolean r0 = r3.CQq()
            if (r0 != 0) goto L_0x04bf
            boolean r0 = r3.COb()
            if (r0 == 0) goto L_0x04bb
            X.0Tu r0 = X.0Tu.A05
            r4 = 36330479816884880(0x81126100014290, double:3.0388799550735245E-306)
            boolean r0 = X.182.A06(r0, r1, r4)
            if (r0 != 0) goto L_0x04bf
        L_0x04bb:
            r60 = 1
            goto L_0x02c8
        L_0x04bf:
            r60 = 0
            goto L_0x02c8
        L_0x04c3:
            r59 = 1
            goto L_0x02be
        L_0x04c7:
            r0 = 0
            goto L_0x0269
        L_0x04ca:
            r5 = r23
            goto L_0x0216
        L_0x04ce:
            r0 = 0
            goto L_0x023c
        L_0x04d1:
            r4 = 0
            goto L_0x019e
        L_0x04d4:
            r55 = 0
            goto L_0x01ae
        L_0x04d8:
            boolean r4 = r3.CUG()
            if (r4 == 0) goto L_0x056c
            X.9Gx r5 = X.C376179Gx.RTC_GROUP_VOICE_CALL
        L_0x04e0:
            r4 = r31
            boolean r4 = r4.A00(r5)
            if (r4 == 0) goto L_0x0152
            com.instagram.common.session.UserSession r4 = r0.A01
            boolean r5 = X.C66648MaH.A00(r4, r3)
            if (r5 == 0) goto L_0x0514
            boolean r5 = r0.A06(r3)
            if (r5 == 0) goto L_0x0514
        L_0x04f6:
            boolean r5 = X.C66648MaH.A01(r4, r3)
            if (r5 != 0) goto L_0x0510
            boolean r4 = X.C66648MaH.A02(r4, r3)
            if (r4 != 0) goto L_0x0510
            java.lang.String r5 = r3.C6C()
            java.util.List r4 = r3.BRZ()
            boolean r4 = X.C66649MaI.A01(r0, r5, r4)
            if (r4 == 0) goto L_0x0152
        L_0x0510:
            r48 = 1
            goto L_0x0154
        L_0x0514:
            int r5 = r3.BHS()
            if (r5 != 0) goto L_0x0152
            boolean r5 = r0.A05(r3)
            if (r5 == 0) goto L_0x0152
            X.0Tu r5 = X.0Tu.A05
            r6 = 36314932035193759(0x81043d00000b9f, double:3.029047475326168E-306)
            boolean r6 = X.182.A06(r5, r4, r6)
            if (r6 == 0) goto L_0x0533
            boolean r6 = r0.A08(r3)
            if (r6 != 0) goto L_0x0152
        L_0x0533:
            boolean r8 = r3.CUG()
            android.content.Context r6 = r0.A00
            boolean r6 = X.0oI.A0C(r6)
            if (r6 == 0) goto L_0x0152
            r6 = 2342153680641327341(0x2081005d000000ed, double:4.057676042191083E-152)
            boolean r6 = X.182.A06(r5, r4, r6)
            if (r6 != 0) goto L_0x0550
            boolean r6 = r0.A0D(r8)
            if (r6 == 0) goto L_0x0152
        L_0x0550:
            r6 = 36311298492858864(0x8100ef000001f0, double:3.0267496085224796E-306)
            boolean r5 = X.182.A06(r5, r4, r6)
            if (r5 == 0) goto L_0x0152
            boolean r5 = r3.Ca9()
            if (r5 != 0) goto L_0x0152
            int r5 = r3.C6a()
            boolean r5 = X.C66649MaI.A00(r5)
            if (r5 != 0) goto L_0x0152
            goto L_0x04f6
        L_0x056c:
            X.9Gx r5 = X.C376179Gx.RTC_VOICE_CALL
            goto L_0x04e0
        L_0x0570:
            boolean r4 = r3.CUG()
            if (r4 == 0) goto L_0x05a6
            X.9Gx r5 = X.C376179Gx.RTC_GROUP_VIDEO_CALL
        L_0x0578:
            r4 = r31
            boolean r4 = r4.A00(r5)
            if (r4 == 0) goto L_0x0124
            boolean r4 = r0.A09(r3)
            if (r4 == 0) goto L_0x0124
            com.instagram.common.session.UserSession r4 = r0.A01
            boolean r5 = X.C66648MaH.A01(r4, r3)
            if (r5 != 0) goto L_0x05a2
            boolean r4 = X.C66648MaH.A02(r4, r3)
            if (r4 != 0) goto L_0x05a2
            java.lang.String r5 = r3.C6C()
            java.util.List r4 = r3.BRZ()
            boolean r4 = X.C66649MaI.A01(r0, r5, r4)
            if (r4 == 0) goto L_0x0124
        L_0x05a2:
            r46 = 1
            goto L_0x0126
        L_0x05a6:
            X.9Gx r5 = X.C376179Gx.RTC_VIDEO_CALL
            goto L_0x0578
        L_0x05a9:
            X.1Av r4 = X.1Au.A00(r1)
            boolean r4 = r4.A21()
            if (r4 == 0) goto L_0x00fa
            goto L_0x00e6
        L_0x05b5:
            X.3mO r11 = X.C250993mO.A01(r1)
            X.0qQ.A07(r11)
            int r9 = r3.C6a()
            r4 = 29
            if (r9 != r4) goto L_0x06a8
            r2 = r28
            X.3Te r8 = r2.A0s
            java.lang.String r4 = ""
            android.text.SpannableStringBuilder r2 = new android.text.SpannableStringBuilder
            r2.<init>(r4)
            if (r8 == 0) goto L_0x065f
            java.lang.String r7 = r8.A08
            if (r7 == 0) goto L_0x069c
            int r4 = r7.length()
            if (r4 == 0) goto L_0x069c
            X.0Tu r9 = X.0Tu.A05
            r4 = 36328723175259702(0x8110c800013e36, double:3.037769047836334E-306)
            boolean r4 = X.182.A06(r9, r1, r4)
            if (r4 == 0) goto L_0x069c
            android.text.SpannableStringBuilder r5 = new android.text.SpannableStringBuilder
            r5.<init>(r7)
            X.17i r4 = X.17h.A00(r1)
            java.util.concurrent.ConcurrentMap r4 = r4.A02
            java.lang.Object r4 = r4.get(r7)
            com.instagram.user.model.User r4 = (com.instagram.user.model.User) r4
            if (r4 == 0) goto L_0x0614
            boolean r4 = r4.isVerified()
            if (r4 == 0) goto L_0x0614
            int r9 = X.00l.A08(r5, r7, r13, r13)
            r4 = -1
            if (r9 == r4) goto L_0x0614
            int r4 = X.00l.A08(r5, r7, r13, r13)
            int r7 = r7.length()
            int r4 = r4 + r7
            X.C244273av.A03(r6, r5, r4)
        L_0x0614:
            r2.append(r5)
            int r8 = r8.A02
            X.0Tu r7 = X.0Tu.A05
            r4 = 36315868340358777(0x81051700230e79, double:3.0296395984827235E-306)
            boolean r4 = X.182.A06(r7, r1, r4)
            if (r4 == 0) goto L_0x065f
            if (r8 <= 0) goto L_0x065f
            r4 = 36315868340489850(0x81051700250e7a, double:3.0296395985656146E-306)
            boolean r4 = X.182.A06(r7, r1, r4)
            if (r4 == 0) goto L_0x0697
            android.content.res.Resources r7 = r6.getResources()
            X.0qQ.A07(r7)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r8)
            r4 = 1000(0x3e8, float:1.401E-42)
            java.lang.String r4 = X.C253673rC.A04(r7, r5, r4, r14, r14)
        L_0x0644:
            android.content.res.Resources r7 = r6.getResources()
            r5 = 2131820658(0x7f110072, float:1.9274037E38)
            java.lang.Object[] r4 = new java.lang.Object[]{r4}
            java.lang.String r5 = r7.getQuantityString(r5, r8, r4)
            X.0qQ.A07(r5)
            java.lang.String r4 = " • "
            java.lang.String r4 = X.002.A0R(r4, r5)
            r2.append(r4)
        L_0x065f:
            int r4 = r2.length()
            if (r4 != 0) goto L_0x009d
        L_0x0665:
            if (r15 != 0) goto L_0x009d
            boolean r4 = r12.isEmpty()
            if (r4 != 0) goto L_0x009d
            java.lang.Object r5 = r12.get(r13)
            X.170 r5 = (X.AnonymousClass170) r5
            java.lang.String r2 = X.AnonymousClass50n.A06(r5)
            java.lang.Long r7 = r3.CBk()
            r4 = 0
            if (r7 == 0) goto L_0x067f
            r4 = 1
        L_0x067f:
            if (r2 == 0) goto L_0x0687
            int r7 = r2.length()
            if (r7 != 0) goto L_0x068d
        L_0x0687:
            boolean r7 = r5.CPm()
            if (r7 != 0) goto L_0x068f
        L_0x068d:
            if (r4 == 0) goto L_0x009d
        L_0x068f:
            r2 = r17
            java.lang.String r2 = A02(r6, r1, r5, r2, r4)
            goto L_0x009d
        L_0x0697:
            java.lang.String r4 = java.lang.String.valueOf(r8)
            goto L_0x0644
        L_0x069c:
            r4 = 2131959325(0x7f131e1d, float:1.9555287E38)
            java.lang.String r5 = r6.getString(r4)
            X.0qQ.A07(r5)
            goto L_0x0614
        L_0x06a8:
            boolean r4 = X.AnonymousClass48O.A02(r9)
            if (r4 == 0) goto L_0x0742
            com.instagram.direct.model.thread.CreatorSubscriberThreadInfo r8 = r3.Asg()
            if (r8 == 0) goto L_0x06bf
            if (r5 == 0) goto L_0x06c2
            if (r5 != r7) goto L_0x06bf
            r2 = 2131957107(0x7f131573, float:1.9550789E38)
            java.lang.String r2 = r6.getString(r2)
        L_0x06bf:
            if (r2 == 0) goto L_0x0665
            goto L_0x065f
        L_0x06c2:
            X.3mS r4 = X.C251033mS.A00(r1)
            java.util.Map r4 = X.C250993mO.A04(r4, r12)
            X.0qQ.A07(r4)
            java.util.Set r4 = r4.keySet()
            java.util.Iterator r24 = r4.iterator()
            r21 = 0
        L_0x06d7:
            boolean r4 = r24.hasNext()
            if (r4 == 0) goto L_0x06f8
            java.lang.Object r7 = r24.next()
            X.3mU r7 = (X.C251053mU) r7
            long r4 = r7.A01
            r10 = 0
            int r9 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r9 <= 0) goto L_0x06d7
            long r4 = java.lang.System.currentTimeMillis()
            boolean r4 = X.C250993mO.A06(r7, r4)
            if (r4 == 0) goto L_0x06d7
            int r21 = r21 + 1
            goto L_0x06d7
        L_0x06f8:
            if (r21 == 0) goto L_0x0709
            r4 = 2131959355(0x7f131e3b, float:1.9555348E38)
            java.lang.String r2 = java.lang.String.valueOf(r21)
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            java.lang.String r2 = r6.getString(r4, r2)
        L_0x0709:
            java.lang.Long r4 = r8.A01
            long r24 = java.lang.System.currentTimeMillis()
            r7 = 1000(0x3e8, double:4.94E-321)
            long r24 = r24 / r7
            if (r4 == 0) goto L_0x06bf
            long r4 = r4.longValue()
            int r7 = (r4 > r24 ? 1 : (r4 == r24 ? 0 : -1))
            if (r7 <= 0) goto L_0x06bf
            long r10 = r4 - r24
            java.util.concurrent.TimeUnit r9 = java.util.concurrent.TimeUnit.DAYS
            r7 = 1
            long r8 = r9.toSeconds(r7)
            int r7 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r7 >= 0) goto L_0x06bf
            android.content.res.Resources r9 = r6.getResources()
            X.0qQ.A07(r9)
            double r7 = (double) r4
            java.lang.String r5 = X.1G0.A0A(r9, r7)
            if (r2 == 0) goto L_0x073f
            java.lang.String r4 = " • "
            java.lang.String r5 = X.002.A0g(r2, r4, r5)
        L_0x073f:
            r2 = r5
            goto L_0x06bf
        L_0x0742:
            boolean r4 = X.AnonymousClass48O.A01(r9)
            if (r4 == 0) goto L_0x07a7
            r2 = r28
            X.JwJ r2 = r2.A0Y
            if (r2 == 0) goto L_0x0762
            java.lang.Object r2 = r2.A00
            X.BBV r2 = (X.BBV) r2
            if (r2 == 0) goto L_0x0760
            java.lang.String r2 = r2.A00
        L_0x0756:
            boolean r4 = r3.CbG()
            if (r4 == 0) goto L_0x0764
            if (r2 == 0) goto L_0x0764
            goto L_0x065f
        L_0x0760:
            r2 = 0
            goto L_0x0756
        L_0x0762:
            r2 = 0
            goto L_0x0756
        L_0x0764:
            r2 = 2131957105(0x7f131571, float:1.9550785E38)
            java.lang.String r2 = r6.getString(r2)
            X.0qQ.A07(r2)
            int r4 = r3.AYf()
            if (r4 == 0) goto L_0x065f
            int r5 = r3.BHS()
            r4 = 8
            if (r5 == r4) goto L_0x065f
            r8 = 2131959355(0x7f131e3b, float:1.9555348E38)
            android.content.res.Resources r7 = r6.getResources()
            X.0qQ.A07(r7)
            int r4 = r3.AYf()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            r4 = 1000(0x3e8, float:1.401E-42)
            java.lang.String r4 = X.C253673rC.A04(r7, r5, r4, r14, r14)
            java.lang.Object[] r4 = new java.lang.Object[]{r4}
            java.lang.String r5 = r6.getString(r8, r4)
            X.0qQ.A07(r5)
            java.lang.String r4 = " • "
            java.lang.String r2 = X.002.A0g(r2, r4, r5)
            goto L_0x06bf
        L_0x07a7:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)
            boolean r4 = X.AnonymousClass48O.A06(r4)
            if (r4 == 0) goto L_0x0821
            boolean r4 = X.AnonymousClass9B8.A07(r1)
            if (r4 == 0) goto L_0x0665
            if (r8 == 0) goto L_0x07bb
            if (r19 != 0) goto L_0x07c6
        L_0x07bb:
            r2 = 2130969273(0x7f0402b9, float:1.7547223E38)
            int r2 = X.2Yu.A0F(r6, r2)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r2)
        L_0x07c6:
            boolean r2 = A06(r3)
            if (r2 == 0) goto L_0x07d8
            java.lang.String r2 = X.C3262475z.A01(r1)
            if (r2 == 0) goto L_0x07d8
            java.lang.String r2 = X.C3262475z.A01(r1)
            goto L_0x06bf
        L_0x07d8:
            java.util.List r2 = r3.BRZ()
            X.00k.A0J(r2)
            java.util.List r2 = r3.BRZ()
            java.lang.Object r2 = X.00k.A0J(r2)
            com.instagram.user.model.User r2 = (com.instagram.user.model.User) r2
            if (r2 == 0) goto L_0x080c
            X.4Cl r2 = r2.A03
            java.lang.String r5 = r2.AaS()
            if (r5 == 0) goto L_0x080c
            int r2 = r5.length()
            if (r2 == 0) goto L_0x080c
            X.AnonymousClass9B9.A00()
            r4 = 2131975311(0x7f135c8f, float:1.958771E38)
            java.lang.Object[] r2 = new java.lang.Object[]{r5}
            java.lang.String r2 = r6.getString(r4, r2)
            X.0qQ.A07(r2)
            goto L_0x065f
        L_0x080c:
            X.AnonymousClass9B9.A00()
            r2 = 2131975293(0x7f135c7d, float:1.9587674E38)
            java.lang.CharSequence r4 = r6.getText(r2)
            X.0qQ.A07(r4)
            r2 = r23
            android.text.SpannableStringBuilder r2 = X.C69835Nsx.A00(r6, r4, r2, r8, r13)
            goto L_0x06bf
        L_0x0821:
            boolean r4 = r3.CQq()
            if (r4 == 0) goto L_0x085f
            java.lang.String r7 = r1.A06
            com.instagram.user.model.User r4 = r3.BZK()
            if (r4 == 0) goto L_0x085d
            X.4Cl r4 = r4.A03
            java.lang.String r4 = r4.AaZ()
        L_0x0835:
            boolean r4 = X.0qQ.A0K(r7, r4)
            if (r4 == 0) goto L_0x085f
            r2 = 2131952636(0x7f1303fc, float:1.954172E38)
            java.lang.String r4 = r6.getString(r2)
            X.0qQ.A07(r4)
            if (r8 == 0) goto L_0x0855
            r2 = r19
        L_0x0849:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r2)
            r2 = r23
            android.text.SpannableStringBuilder r2 = X.C69835Nsx.A00(r6, r4, r2, r5, r14)
            goto L_0x06bf
        L_0x0855:
            r2 = 2130969273(0x7f0402b9, float:1.7547223E38)
            int r2 = X.2Yu.A0F(r6, r2)
            goto L_0x0849
        L_0x085d:
            r4 = 0
            goto L_0x0835
        L_0x085f:
            if (r5 != 0) goto L_0x0665
            X.3mS r2 = X.C251033mS.A00(r1)
            java.util.Map r2 = X.C250993mO.A04(r2, r12)
            X.0qQ.A07(r2)
            boolean r4 = A04(r1, r3)
            if (r4 == 0) goto L_0x087b
            r2 = 2131971177(0x7f134c69, float:1.9579326E38)
            java.lang.String r2 = r6.getString(r2)
            goto L_0x06bf
        L_0x087b:
            android.content.res.Resources r7 = r6.getResources()
            if (r15 == 0) goto L_0x0887
            java.lang.String r2 = r11.A09(r7, r2)
            goto L_0x06bf
        L_0x0887:
            boolean r4 = r2.isEmpty()
            if (r4 == 0) goto L_0x08ce
            r2 = 0
        L_0x088e:
            if (r2 == 0) goto L_0x06bf
            java.lang.Long r4 = r3.CBk()
            r7 = 0
            if (r4 == 0) goto L_0x0898
            r7 = 1
        L_0x0898:
            java.util.List r4 = r3.BRZ()
            boolean r5 = r4.isEmpty()
            if (r5 != 0) goto L_0x06bf
            if (r7 != 0) goto L_0x08b0
            java.lang.Object r4 = r4.get(r13)
            X.178 r4 = (X.AnonymousClass178) r4
            boolean r4 = r4.CPm()
            if (r4 == 0) goto L_0x06bf
        L_0x08b0:
            boolean r4 = r12.isEmpty()
            if (r4 != 0) goto L_0x06bf
            java.lang.Object r7 = r12.get(r13)
            X.170 r7 = (X.AnonymousClass170) r7
            java.lang.Long r4 = r3.CBk()
            r5 = 0
            if (r4 == 0) goto L_0x08c4
            r5 = 1
        L_0x08c4:
            r4 = r17
            java.lang.String r4 = A02(r6, r1, r7, r4, r5)
            A00 = r4
            goto L_0x06bf
        L_0x08ce:
            java.util.Set r4 = r2.keySet()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>(r4)
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.Set r2 = r2.entrySet()
            java.util.Iterator r21 = r2.iterator()
        L_0x08e4:
            boolean r2 = r21.hasNext()
            if (r2 == 0) goto L_0x0908
            java.lang.Object r4 = r21.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r2 = r4.getKey()
            X.3mU r2 = (X.C251053mU) r2
            long r8 = java.lang.System.currentTimeMillis()
            boolean r2 = X.C250993mO.A06(r2, r8)
            if (r2 == 0) goto L_0x08e4
            java.lang.Object r2 = r4.getValue()
            r10.add(r2)
            goto L_0x08e4
        L_0x0908:
            java.lang.String r2 = r11.A08(r7, r5)
            goto L_0x088e
        L_0x090d:
            r52 = 0
            goto L_0x0071
        L_0x0911:
            r20 = -1
            goto L_0x0048
        L_0x0915:
            java.lang.String r17 = X.AnonymousClass48N.A07(r6, r1, r3)
            goto L_0x0036
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C327837Cj.A00(android.content.Context, com.instagram.common.session.UserSession, com.instagram.direct.capabilities.Capabilities, X.7Kx, X.2Ep, java.lang.String, int, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean):X.7LZ");
    }
}
