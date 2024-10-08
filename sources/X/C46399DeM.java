package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.instagram.common.session.UserSession;
import fxcache.model.FxCalAccountWithSwitcherInfo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.DeM  reason: case insensitive filesystem */
public final class C46399DeM implements CallerContextable {
    public static final CallerContext A00 = CallerContext.A00(C46399DeM.class);
    public static final AtomicLong A01 = new AtomicLong();
    public static final String __redex_internal_original_name = "CompanyIdentitySwitcherHelper";

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0036  */
    public static void A04(android.content.Context r19, X.C46398DeL r20, com.instagram.common.session.UserSession r21, java.lang.Integer r22) {
        /*
            r6 = 1
            r2 = r21
            r1 = r22
            if (r22 == 0) goto L_0x000e
            boolean r0 = A07(r2, r1)
            r14 = 1
            if (r0 != 0) goto L_0x004b
        L_0x000e:
            r14 = 0
            if (r22 != 0) goto L_0x004b
            r0 = 0
        L_0x0013:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r6)
            java.lang.String r3 = r2.A06
            java.lang.Long r10 = X.DbV.A0q(r3)
            java.lang.Long r11 = X.DbV.A0q(r3)
            r4 = r20
            r7 = r4
            r8 = r2
            r12 = r0
            java.util.HashMap r1 = X.C46400DeN.A02(r7, r8, r9, r10, r11, r12, r14)
            java.lang.String r0 = "event_session_id"
            java.lang.String r8 = X.DbS.A0r(r0, r1)
            java.lang.String r3 = ""
            java.util.regex.Pattern r0 = X.0mp.A01
            if (r8 != 0) goto L_0x0037
            r8 = r3
        L_0x0037:
            java.lang.String r7 = r4.A00
            java.lang.String r0 = "entry_point"
            java.lang.String r1 = X.DbS.A0r(r0, r1)
            if (r1 != 0) goto L_0x0042
            r1 = r3
        L_0x0042:
            java.lang.String r0 = "native_FoA"
            X.C46400DeN.A04(r2, r1, r0)
            java.lang.Class<X.DeN> r4 = X.C46400DeN.class
            monitor-enter(r4)
            goto L_0x0051
        L_0x004b:
            int r0 = A00(r2, r1)
            long r0 = (long) r0
            goto L_0x0013
        L_0x0051:
            X.02m r3 = X.02m.A0p     // Catch:{ all -> 0x00c4 }
            X.0qQ.A07(r3)     // Catch:{ all -> 0x00c4 }
            r1 = 857814227(0x332134d3, float:3.7533777E-8)
            r5 = 0
            boolean r0 = r3.isMarkerOn(r1, r5)     // Catch:{ all -> 0x00c4 }
            if (r0 == 0) goto L_0x0065
            java.lang.String r0 = "is_native_foa_xmds_switcher"
            r3.markerAnnotate(r1, r0, r6)     // Catch:{ all -> 0x00c4 }
        L_0x0065:
            monitor-exit(r4)
            r1 = 1579841632(0x5e2a7860, float:3.07091838E18)
            java.lang.String r0 = "CompanyIdentitySwitcherHelper.openSwitcherV1"
            X.0fh.A01(r0, r1)
            com.instagram.foa.session.IgMetaSessionImpl r4 = new com.instagram.foa.session.IgMetaSessionImpl     // Catch:{ all -> 0x00bc }
            r4.<init>(r2)     // Catch:{ all -> 0x00bc }
            X.Eyf r3 = new X.Eyf     // Catch:{ all -> 0x00bc }
            r3.<init>(r4, r7, r8)     // Catch:{ all -> 0x00bc }
            X.0Tu r6 = X.0Tu.A05     // Catch:{ all -> 0x00bc }
            r0 = 18301950868394253(0x4105870035110d, double:1.8937148803410924E-307)
            boolean r0 = X.1AW.A06(r6, r0)     // Catch:{ all -> 0x00bc }
            X.Di6 r14 = X.C46626Di6.FLEXIBLE_SHEET     // Catch:{ all -> 0x00bc }
            r8 = 0
            java.lang.Integer r16 = X.AnonymousClass05K.A0C     // Catch:{ all -> 0x00bc }
            X.Di7 r13 = X.C46471DfZ.A0S     // Catch:{ all -> 0x00bc }
            X.EX7 r9 = X.C46471DfZ.A0O     // Catch:{ all -> 0x00bc }
            X.EX6 r12 = X.C46471DfZ.A0R     // Catch:{ all -> 0x00bc }
            X.EX5 r11 = X.EX5.SAME_SIZE     // Catch:{ all -> 0x00bc }
            com.meta.foa.cds.CdsBottomSheetDimmingBehaviour$Default r7 = com.meta.foa.cds.CdsBottomSheetDimmingBehaviour.Default.A00     // Catch:{ all -> 0x00bc }
            X.FA0 r6 = new X.FA0     // Catch:{ all -> 0x00bc }
            r10 = r8
            r15 = r8
            r17 = r8
            r18 = r5
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)     // Catch:{ all -> 0x00bc }
            if (r0 == 0) goto L_0x00a2
            X.F3f r0 = X.C55400Hh6.A01     // Catch:{ all -> 0x00bc }
            goto L_0x00a4
        L_0x00a2:
            X.F3f r0 = X.C55400Hh6.A00     // Catch:{ all -> 0x00bc }
        L_0x00a4:
            r1 = r19
            X.C49258Es1.A00(r1, r6, r0, r4, r3)     // Catch:{ all -> 0x00bc }
            android.os.Handler r1 = X.AnonymousClass7TF.A0D()     // Catch:{ all -> 0x00bc }
            X.FqN r0 = new X.FqN     // Catch:{ all -> 0x00bc }
            r0.<init>(r2)     // Catch:{ all -> 0x00bc }
            r1.post(r0)     // Catch:{ all -> 0x00bc }
            r0 = -1814750570(0xffffffff93d51a96, float:-5.3794975E-27)
            X.0fh.A00(r0)
            return
        L_0x00bc:
            r1 = move-exception
            r0 = -1949439234(0xffffffff8bcdeafe, float:-7.9316705E-32)
            X.0fh.A00(r0)
            throw r1
        L_0x00c4:
            r1 = move-exception
            monitor-exit(r4)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C46399DeM.A04(android.content.Context, X.DeL, com.instagram.common.session.UserSession, java.lang.Integer):void");
    }

    public static void A02(Context context, Fragment fragment, C46398DeL deL, UserSession userSession, Integer num) {
        boolean A05;
        boolean A06 = 1AW.A06(0Tu.A05, 2324144960081694986L);
        if (A06) {
            A05 = false;
        } else {
            A05 = AnonymousClass3EM.A05(18301950867542275L, true);
        }
        UserSession userSession2 = userSession;
        Context context2 = context;
        C46398DeL deL2 = deL;
        Integer num2 = num;
        if (C324546zV.A00(userSession).A00() != null || !C324536zU.A01(userSession)) {
            A04(context, deL, userSession, num);
        } else {
            C44809ClL.A00(new C51614Fx2(context2, fragment, deL2, userSession2, num2, A06, A05), userSession);
        }
    }

    public static void A03(Context context, C46398DeL deL, UserSession userSession, Integer num) {
        boolean A05;
        boolean A06 = 1AW.A06(0Tu.A05, 2324144960081694986L);
        if (A06) {
            A05 = false;
        } else {
            A05 = AnonymousClass3EM.A05(18301950867542275L, true);
        }
        UserSession userSession2 = userSession;
        Context context2 = context;
        C46398DeL deL2 = deL;
        Integer num2 = num;
        if (C324546zV.A00(userSession).A00() != null || !C324536zU.A01(userSession)) {
            A04(context, deL, userSession, num);
        } else {
            C44809ClL.A00(new C51613Fx1(context2, deL2, userSession2, num2, A06, A05), userSession);
        }
    }

    public static int A00(UserSession userSession, Integer num) {
        boolean z;
        boolean A012 = AnonymousClass3EM.A01();
        int A002 = AnonymousClass3H7.A00(userSession);
        boolean A05 = AnonymousClass3EM.A05(18301950865379573L, true);
        boolean A04 = AnonymousClass3EM.A04();
        if (!A05 || (!A04 && num != AnonymousClass05K.A00)) {
            z = false;
        } else {
            z = true;
        }
        int A02 = AnonymousClass3H5.A01.A02(userSession, z);
        if (A012) {
            return A002 + A02;
        }
        return A002;
    }

    public static ArrayList A01(UserSession userSession, List list) {
        ArrayList A1C = AnonymousClass7TE.A1C();
        boolean A05 = AnonymousClass3EM.A05(18301950866428154L, true);
        boolean A09 = AnonymousClass3EM.A09(userSession, 2Lv.A00(userSession).A00(A00, "fx_company_identity_switcher_linking_cache"));
        if ((!A05 || !A09) && !C324536zU.A00(userSession)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                FxCalAccountWithSwitcherInfo fxCalAccountWithSwitcherInfo = (FxCalAccountWithSwitcherInfo) it.next();
                if (!fxCalAccountWithSwitcherInfo.A04.equals("INSTAGRAM")) {
                    String num = Integer.toString(fxCalAccountWithSwitcherInfo.A02);
                    HashMap A1E = AnonymousClass7TE.A1E();
                    A1E.put("OBFUSCATED_ACCOUNT_ID", fxCalAccountWithSwitcherInfo.A07);
                    String str = "";
                    A1E.put("USER_ID", str);
                    String str2 = fxCalAccountWithSwitcherInfo.A08;
                    if (str2 == null) {
                        str2 = str;
                    }
                    A1E.put("PROFILE_PICTURE_URL", str2);
                    A1E.put("ACCOUNT_TYPE", fxCalAccountWithSwitcherInfo.A04);
                    String str3 = fxCalAccountWithSwitcherInfo.A0B;
                    if (str3 == null) {
                        str3 = str;
                    }
                    A1E.put("USERNAME", str3);
                    String str4 = fxCalAccountWithSwitcherInfo.A06;
                    if (str4 != null) {
                        str = str4;
                    }
                    A1E.put("NAME", str);
                    A1E.put("BADGE_COUNT", num);
                    A1E.put("UNPACKED_NOTIFICATIONS", fxCalAccountWithSwitcherInfo.A0A);
                    A1C.add(A1E);
                }
            }
        }
        return A1C;
    }

    public static boolean A06() {
        long currentTimeMillis = System.currentTimeMillis();
        AtomicLong atomicLong = A01;
        if (currentTimeMillis - atomicLong.get() < 500) {
            return true;
        }
        atomicLong.set(currentTimeMillis);
        return false;
    }

    public static boolean A07(UserSession userSession, Integer num) {
        boolean z;
        int A002 = AnonymousClass3H7.A00(userSession);
        boolean A05 = AnonymousClass3EM.A05(18301950865379573L, true);
        boolean A04 = AnonymousClass3EM.A04();
        if (!A05 || (!A04 && num != AnonymousClass05K.A00)) {
            z = false;
        } else {
            z = true;
        }
        int A02 = AnonymousClass3H5.A01.A02(userSession, z);
        if (A002 > 0 || A02 > 0) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:114:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0175, code lost:
        r0.A00 = r6;
        X.1ES.A03(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x017a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x01b3, code lost:
        if (r3.equals(r1) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x01b5, code lost:
        r4 = X.AnonymousClass0BO.A00(r8);
        r6 = r4.BO0().iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x01c5, code lost:
        if (r6.hasNext() == false) goto L_0x02f5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x01c7, code lost:
        r3 = (com.instagram.user.model.User) r6.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x01d5, code lost:
        if (r3.getId().equals(r0) == false) goto L_0x01c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x01db, code lost:
        if (r4.AG1(r2, r8, r3) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x01e3, code lost:
        if (r13.equals("mini_switcher_select") == false) goto L_0x0226;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x01e5, code lost:
        r5 = X.C46398DeL.A06;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x01e9, code lost:
        if (r5 == X.C46398DeL.A04) goto L_0x021b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x01ef, code lost:
        if (r20.booleanValue() != false) goto L_0x021b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x01f1, code lost:
        r7 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x01f2, code lost:
        r4.E2T(r2, r7, r8, r3, r13, false);
        r8.getClass();
        X.C46400DeN.A03(r8, X.DbV.A0q(r0), X.DbV.A0q(r0), "intra_app", r12, r13, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, r21.doubleValue(), true, true, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x021a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x021b, code lost:
        r7 = X.F5W.A00(r2, "all", "direct_inbox_account_switch", (java.lang.String) null, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x022c, code lost:
        if (r13.equals("profile_title") == false) goto L_0x0231;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x022e, code lost:
        r5 = X.C46398DeL.A09;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0237, code lost:
        if (r13.equals("tab_bar_long_press") == false) goto L_0x023c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0239, code lost:
        r5 = X.C46398DeL.A0D;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0242, code lost:
        if (r13.equals("tab_bar_double_tap") == false) goto L_0x0247;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0244, code lost:
        r5 = X.C46398DeL.A0C;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x024d, code lost:
        if (r13.equals("bookmark") == false) goto L_0x0252;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x024f, code lost:
        r5 = X.C46398DeL.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0256, code lost:
        if (r13.equals("direct_inbox") == false) goto L_0x025b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0258, code lost:
        r5 = X.C46398DeL.A04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0261, code lost:
        if (r13.equals("unknown_nt_action") == false) goto L_0x0266;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0263, code lost:
        r5 = X.C46398DeL.A0F;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x026c, code lost:
        if (r13.equals("new_account_created") == false) goto L_0x0272;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x026e, code lost:
        r5 = X.C46398DeL.A07;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0278, code lost:
        if (r13.equals("snack_bar") == false) goto L_0x027e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x027a, code lost:
        r5 = X.C46398DeL.A0B;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0284, code lost:
        if (r13.equals("horizontal_switch") == false) goto L_0x028a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0286, code lost:
        r5 = X.C46398DeL.A05;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x028a, code lost:
        r5 = X.C46398DeL.A0E;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x02f5, code lost:
        X.0wb.A03(__redex_internal_original_name, "No users found");
        new android.app.AlertDialog.Builder(r2).setMessage(2131968486).setTitle(2131961740).setPositiveButton(2131960862, new X.C49969FHc(5)).show();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x031f, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A05(androidx.fragment.app.Fragment r16, androidx.fragment.app.FragmentActivity r17, X.AnonymousClass0iw r18, com.instagram.common.session.UserSession r19, java.lang.Boolean r20, java.lang.Double r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, java.lang.String r25, java.lang.String r26) {
        /*
            java.lang.String r0 = "bloks"
            r8 = r19
            r13 = r25
            X.C46400DeN.A05(r8, r0, r13)
            java.lang.String r5 = "direct_inbox"
            boolean r1 = r5.equals(r13)
            r0 = r22
            if (r1 == 0) goto L_0x003b
            X.C282375Cv.A00(r8)
            r3 = 0
            r2 = 10000008(0x989688, float:1.4012996E-38)
            r1 = 0
            com.facebook.msys.mci.TraceLogger.broadcastEvent(r2, r1, r3)
            X.0BQ r1 = X.AnonymousClass0BO.A00(r8)
            com.instagram.user.model.User r1 = r1.BNw(r0)
            X.3H3 r3 = X.FFg.A00(r1)
            X.02m r1 = X.02m.A0p
            X.MpW r2 = X.C67537MpW.A00(r1)
            r2.A01()
            r2.A02(r3)
            java.lang.String r1 = r8.A06
            r2.A03(r1, r0)
        L_0x003b:
            r3 = r24
            int r1 = r3.hashCode()
            r15 = r16
            r2 = r17
            r16 = r18
            r12 = r26
            switch(r1) {
                case -1701125773: goto L_0x004d;
                case -1040357245: goto L_0x00a0;
                case -452568510: goto L_0x010e;
                case -190139236: goto L_0x0116;
                case 2358863: goto L_0x017b;
                case 1002241282: goto L_0x01ad;
                case 1004714737: goto L_0x028e;
                default: goto L_0x004c;
            }
        L_0x004c:
            return
        L_0x004d:
            r1 = 974(0x3ce, float:1.365E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L_0x004c
            r5 = 0
            X.0qQ.A0B(r8, r5)
            X.AnonymousClass7TG.A1O(r2, r0)
            X.08y r4 = X.09i.A0A
            r3 = 6
            X.Fl4 r1 = new X.Fl4
            r1.<init>(r3)
            X.0aP r10 = r4.A03(r1)
            X.1CU r3 = X.AnonymousClass1CT.A00(r8)
            X.1NY r4 = X.AnonymousClass7TG.A0a(r10)
            java.lang.String r1 = "permissions/one_tap_shared_account_login/"
            r4.A0A(r1)
            java.lang.String r1 = "shared_account_igid"
            r4.A9m(r1, r0)
            java.lang.String r1 = r3.A04
            java.lang.String r0 = "authorization_token"
            r4.A9m(r0, r1)
            java.lang.Class<X.EM4> r3 = X.EM4.class
            java.lang.Class<X.FCB> r0 = X.FCB.class
            r1 = 0
            r4.A0O(r1, r3, r0, r5)
            X.1OC r0 = X.DbW.A0K(r4)
            java.lang.Integer r13 = X.AnonymousClass05K.A00
            X.EDe r6 = new X.EDe
            r9 = r1
            r11 = r1
            r12 = r1
            r14 = r1
            r7 = r2
            r8 = r1
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14)
            goto L_0x0175
        L_0x00a0:
            java.lang.String r1 = "DEFERRED_RECOVERED"
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L_0x004c
            X.9BG r1 = X.AnonymousClass9BG.A01(r8)
            X.3EO r1 = r1.A00
            if (r1 == 0) goto L_0x004c
            java.util.HashMap r1 = r1.A02
            java.util.Collection r1 = r1.values()
            com.google.common.collect.ImmutableList r1 = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) r1)
            X.3kO r3 = r1.iterator()
        L_0x00be:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L_0x02f5
            java.lang.Object r5 = r3.next()
            X.Exs r5 = (X.C49557Exs) r5
            com.instagram.user.model.User r1 = r5.A00
            java.lang.String r1 = r1.getId()
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x00be
            r1 = 3
            X.Fl4 r3 = new X.Fl4
            r3.<init>(r1)
            X.08y r1 = X.09i.A0A
            X.0aP r4 = r1.A03(r3)
            X.Fdb r3 = new X.Fdb
            r3.<init>(r2)
            X.DiE r17 = X.C46634DiE.A0Z
            com.instagram.user.model.User r1 = r5.A00
            java.lang.String r18 = r1.getUsername()
            X.EMX r6 = new X.EMX
            r9 = r6
            r10 = r15
            r11 = r2
            r12 = r16
            r13 = r12
            r14 = r4
            r15 = r3
            r16 = r5
            r19 = r0
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            java.lang.String r3 = r5.A01
            com.instagram.user.model.User r0 = r5.A00
            java.lang.String r1 = r0.getId()
            r0 = 0
            X.1OC r0 = X.FHA.A03(r2, r4, r3, r1, r0)
            goto L_0x0175
        L_0x010e:
            r1 = 454(0x1c6, float:6.36E-43)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            goto L_0x01af
        L_0x0116:
            java.lang.String r1 = "DEFERRED_CHILD"
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L_0x004c
            X.9BG r1 = X.AnonymousClass9BG.A01(r8)
            X.3EO r1 = r1.A00
            if (r1 == 0) goto L_0x004c
            java.util.HashMap r1 = r1.A01
            java.util.Collection r1 = r1.values()
            com.google.common.collect.ImmutableList r1 = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) r1)
            X.3kO r3 = r1.iterator()
        L_0x0134:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L_0x02f5
            java.lang.Object r5 = r3.next()
            X.ExJ r5 = (X.C49537ExJ) r5
            java.lang.String r1 = r5.A01
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0134
            r1 = 2
            X.Fl4 r3 = new X.Fl4
            r3.<init>(r1)
            X.08y r1 = X.09i.A0A
            X.0aP r4 = r1.A03(r3)
            X.Fdb r3 = new X.Fdb
            r3.<init>(r2)
            X.DiE r11 = X.C46634DiE.A0Z
            X.9GU r1 = r5.A00
            com.instagram.user.model.User r1 = r1.A01
            java.lang.String r12 = r1.getUsername()
            X.EMV r6 = new X.EMV
            r7 = r15
            r8 = r16
            r9 = r4
            r10 = r3
            r13 = r0
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)
            java.lang.String r3 = r5.A02
            r1 = 0
            X.1OC r0 = X.FHA.A03(r2, r4, r3, r0, r1)
        L_0x0175:
            r0.A00 = r6
            X.1ES.A03(r0)
            return
        L_0x017b:
            java.lang.String r0 = "MANI"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x004c
            r0 = 5
            X.Fl4 r1 = new X.Fl4
            r1.<init>(r0)
            X.08y r0 = X.09i.A0A
            X.0aP r6 = r0.A03(r1)
            com.instagram.fx.access.sso.FxSsoViewModel r0 = X.DbY.A0V(r2)
            X.0eM r0 = r0.A03
            X.2Fk r1 = X.DbT.A0H(r0)
            X.FQv r0 = new X.FQv
            r9 = r23
            r3 = r0
            r4 = r2
            r5 = r16
            r7 = r8
            r8 = r21
            r10 = r12
            r11 = r13
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            r1.A06(r2, r0)
            return
        L_0x01ad:
            java.lang.String r1 = "LOGGED_IN"
        L_0x01af:
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L_0x004c
            X.0BQ r4 = X.AnonymousClass0BO.A00(r8)
            java.util.List r1 = r4.BO0()
            java.util.Iterator r6 = r1.iterator()
        L_0x01c1:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L_0x02f5
            java.lang.Object r3 = r6.next()
            com.instagram.user.model.User r3 = (com.instagram.user.model.User) r3
            java.lang.String r1 = r3.getId()
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x01c1
            boolean r1 = r4.AG1(r2, r8, r3)
            if (r1 == 0) goto L_0x004c
            java.lang.String r1 = "mini_switcher_select"
            boolean r1 = r13.equals(r1)
            if (r1 == 0) goto L_0x0226
            X.DeL r5 = X.C46398DeL.A06
        L_0x01e7:
            X.DeL r1 = X.C46398DeL.A04
            if (r5 == r1) goto L_0x021b
            boolean r1 = r20.booleanValue()
            if (r1 != 0) goto L_0x021b
            r7 = 0
        L_0x01f2:
            r11 = 0
            r5 = r4
            r6 = r2
            r9 = r3
            r10 = r13
            r5.E2T(r6, r7, r8, r9, r10, r11)
            r8.getClass()
            r20 = 1
            double r18 = r21.doubleValue()
            java.lang.Long r9 = X.DbV.A0q(r0)
            java.lang.Long r10 = X.DbV.A0q(r0)
            r14 = 0
            java.lang.String r11 = "intra_app"
            r15 = r14
            r16 = r14
            r17 = r14
            r21 = r20
            r22 = r20
            X.C46400DeN.A03(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r20, r21, r22)
            return
        L_0x021b:
            r7 = 0
            java.lang.String r6 = "all"
            java.lang.String r5 = "direct_inbox_account_switch"
            r1 = 0
            android.content.Intent r7 = X.F5W.A00(r2, r6, r5, r1, r7)
            goto L_0x01f2
        L_0x0226:
            java.lang.String r1 = "profile_title"
            boolean r1 = r13.equals(r1)
            if (r1 == 0) goto L_0x0231
            X.DeL r5 = X.C46398DeL.A09
            goto L_0x01e7
        L_0x0231:
            java.lang.String r1 = "tab_bar_long_press"
            boolean r1 = r13.equals(r1)
            if (r1 == 0) goto L_0x023c
            X.DeL r5 = X.C46398DeL.A0D
            goto L_0x01e7
        L_0x023c:
            java.lang.String r1 = "tab_bar_double_tap"
            boolean r1 = r13.equals(r1)
            if (r1 == 0) goto L_0x0247
            X.DeL r5 = X.C46398DeL.A0C
            goto L_0x01e7
        L_0x0247:
            java.lang.String r1 = "bookmark"
            boolean r1 = r13.equals(r1)
            if (r1 == 0) goto L_0x0252
            X.DeL r5 = X.C46398DeL.A03
            goto L_0x01e7
        L_0x0252:
            boolean r1 = r13.equals(r5)
            if (r1 == 0) goto L_0x025b
            X.DeL r5 = X.C46398DeL.A04
            goto L_0x01e7
        L_0x025b:
            java.lang.String r1 = "unknown_nt_action"
            boolean r1 = r13.equals(r1)
            if (r1 == 0) goto L_0x0266
            X.DeL r5 = X.C46398DeL.A0F
            goto L_0x01e7
        L_0x0266:
            java.lang.String r1 = "new_account_created"
            boolean r1 = r13.equals(r1)
            if (r1 == 0) goto L_0x0272
            X.DeL r5 = X.C46398DeL.A07
            goto L_0x01e7
        L_0x0272:
            java.lang.String r1 = "snack_bar"
            boolean r1 = r13.equals(r1)
            if (r1 == 0) goto L_0x027e
            X.DeL r5 = X.C46398DeL.A0B
            goto L_0x01e7
        L_0x027e:
            java.lang.String r1 = "horizontal_switch"
            boolean r1 = r13.equals(r1)
            if (r1 == 0) goto L_0x028a
            X.DeL r5 = X.C46398DeL.A05
            goto L_0x01e7
        L_0x028a:
            X.DeL r5 = X.C46398DeL.A0E
            goto L_0x01e7
        L_0x028e:
            java.lang.String r1 = "LOGGED_OUT"
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L_0x004c
            X.6qt r1 = X.C319606qt.A01(r8)
            java.util.ArrayList r4 = r1.A05()
            r1 = 4
            X.Fl4 r3 = new X.Fl4
            r3.<init>(r1)
            X.08y r1 = X.09i.A0A
            X.0aP r5 = r1.A03(r3)
            java.util.Iterator r6 = r4.iterator()
        L_0x02ae:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L_0x004c
            java.lang.Object r4 = r6.next()
            X.6qx r4 = (X.C319646qx) r4
            java.lang.String r1 = r4.A06
            boolean r1 = X.2Ob.A00(r1, r0)
            if (r1 == 0) goto L_0x02ae
            X.Fdb r3 = new X.Fdb
            r3.<init>(r2)
            X.DiE r20 = X.C46634DiE.A1A
            java.lang.String r1 = r4.A07
            r1.getClass()
            X.EMY r14 = new X.EMY
            r17 = r5
            r18 = r8
            r19 = r3
            r22 = r1
            r23 = r0
            r24 = r12
            r25 = r0
            r26 = r13
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            java.lang.String r3 = r4.A05
            if (r3 == 0) goto L_0x02ae
            java.lang.String r1 = r4.A02()
            X.1OC r1 = X.FHA.A03(r2, r5, r3, r0, r1)
            r1.A00 = r14
            X.1ES.A03(r1)
            goto L_0x02ae
        L_0x02f5:
            java.lang.String r1 = "CompanyIdentitySwitcherHelper"
            java.lang.String r0 = "No users found"
            X.0wb.A03(r1, r0)
            android.app.AlertDialog$Builder r1 = new android.app.AlertDialog$Builder
            r1.<init>(r2)
            r0 = 2131968486(0x7f1341e6, float:1.9573868E38)
            android.app.AlertDialog$Builder r1 = r1.setMessage(r0)
            r0 = 2131961740(0x7f13278c, float:1.9560185E38)
            android.app.AlertDialog$Builder r3 = r1.setTitle(r0)
            r2 = 2131960862(0x7f13241e, float:1.9558405E38)
            r1 = 5
            X.FHc r0 = new X.FHc
            r0.<init>(r1)
            android.app.AlertDialog$Builder r0 = r3.setPositiveButton(r2, r0)
            r0.show()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C46399DeM.A05(androidx.fragment.app.Fragment, androidx.fragment.app.FragmentActivity, X.0iw, com.instagram.common.session.UserSession, java.lang.Boolean, java.lang.Double, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }
}
