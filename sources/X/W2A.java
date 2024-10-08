package X;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;

public final class W2A {
    public static final void A00(Activity activity, DialogInterface.OnDismissListener onDismissListener, AnonymousClass818 r13, AnonymousClass819 r14, UserSession userSession, C255773uh r16, C311396cc r17, C311376ca r18, boolean z) {
        AnonymousClass3QO r1;
        AnonymousClass818 r3 = r13;
        AnonymousClass7TG.A1Q(activity, r13);
        C311376ca r8 = r18;
        0qQ.A0B(r8, 6);
        C368278sM r2 = C368278sM.VIEW;
        0bb r12 = new 0bb();
        boolean z2 = z;
        r12.A0A(Boolean.valueOf(z2));
        AnonymousClass819 r4 = r14;
        UserSession userSession2 = userSession;
        C368288sN.A00(r13, r2, r14, r12, userSession);
        C255773uh r6 = r16;
        if (r16 != null) {
            r1 = r6.A0B();
        } else {
            r1 = null;
        }
        boolean A1W = AnonymousClass7TF.A1W(r1, AnonymousClass3QO.CLOSE_FRIENDS);
        C46498Dg1 dg1 = new C46498Dg1(activity, userSession);
        int i = 2131973562;
        if (A1W) {
            i = 2131973561;
        }
        C311396cc r7 = r17;
        dg1.A03(new C64259LXl(r3, r4, userSession2, r6, r7, r8, A1W, z2), i);
        dg1.A03 = new C65348Lro(2, onDismissListener, r7);
        dg1.A09(activity.getString(2131973563));
        AnonymousClass37D A0i = DbT.A0i(activity);
        if (A0i == null || !((AnonymousClass37F) A0i).A0g) {
            C51969G9p.A11(activity, dg1);
        } else {
            new C49945FFy(dg1).A04(activity);
        }
    }

    public static final void A01(Context context, DialogInterface.OnDismissListener onDismissListener, 0hq r5, AnonymousClass07i r6, UserSession userSession, C255773uh r8) {
        0qQ.A0B(r6, 3);
        FCO.A01(context, C271404in.A04(r8), new C19523Wb9(context, onDismissListener, r5, r6, userSession, r8), false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x005f, code lost:
        if (r5.A4x() == false) goto L_0x0061;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0063, code lost:
        if (r5 != null) goto L_0x0065;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0069, code lost:
        if (r5.A1k() == null) goto L_0x0072;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x006b, code lost:
        java.lang.String.valueOf(r5.A1k());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0084, code lost:
        if (X.C51970G9q.A1T(((r5.A1A() + com.instagram.debug.devoptions.sandboxselector.SandboxRepository.CACHE_TTL) > X.AnonymousClass7TG.A0I() ? 1 : ((r5.A1A() + com.instagram.debug.devoptions.sandboxselector.SandboxRepository.CACHE_TTL) == X.AnonymousClass7TG.A0I() ? 0 : -1))) != false) goto L_0x008f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x008a, code lost:
        if (r5.A5O() == false) goto L_0x008f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x008c, code lost:
        r3 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x008d, code lost:
        if (r28 != false) goto L_0x0094;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x008f, code lost:
        r3 = false;
        r27 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0092, code lost:
        if (r5 == null) goto L_0x0096;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0094, code lost:
        r27 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0096, code lost:
        r24 = r37;
        r23 = new X.C17589Vah(r24, r7, r26, r27, r28, r29);
        r10 = new java.lang.StringBuilder();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00aa, code lost:
        if (r6.A1e() == false) goto L_0x0192;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00ac, code lost:
        r9 = 2131957597;
        r1 = 2131957575;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00b2, code lost:
        X.C13988Tno.A0s(r14, r10, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00b5, code lost:
        r11 = new X.C358248ab(r14);
        r0 = r10.toString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00be, code lost:
        if (r0 != null) goto L_0x00c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00c0, code lost:
        r0 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00c2, code lost:
        r11.A0q(android.text.Html.fromHtml(r0));
        r11.A09(r9);
        r0 = 2131957531;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00cf, code lost:
        if (r3 == false) goto L_0x00d4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00d1, code lost:
        r0 = 2131957535;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00d4, code lost:
        r15 = r33;
        r16 = r35;
        r17 = r36;
        r19 = r39;
        r22 = r41;
        r20 = r6;
        r21 = r23;
        r18 = r7;
        r13 = new X.C50011FIw(r14, r15, r16, r17, r18, r19, r20, r21, r22, r3);
        r1 = X.C358278ae.RED_BOLD;
        r11.A0Q(r13, r1, r0);
        r11.A0C(new X.C49992FIb(3, r15, r7, r23, r3));
        r11.A0B(new X.C18813W4a(0, r7, r23, r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x010c, code lost:
        if (r3 == false) goto L_0x011b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x010e, code lost:
        r11.A0O(new X.C50011FIw(r14, r15, r16, r17, r18, r19, r20, r21, r22, false), r1, 2131957562);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x011f, code lost:
        if (r6.A1Y() == false) goto L_0x014b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0121, code lost:
        r9 = r6.A0d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0123, code lost:
        if (r9 == null) goto L_0x014b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0125, code lost:
        r8 = r9.A00;
        X.0qQ.A07(r8);
        r6 = r8.A3k;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x012c, code lost:
        if (r6 == null) goto L_0x014b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x012e, code lost:
        r11.A0G(new X.C71199OfL(r14, r34, r17, r24, r7, r9, r19, r8, r6), 2131972504);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x014b, code lost:
        X.DbT.A1V(r11);
        X.VFY.A00(r23, "view", "dialog", (java.lang.String) null, r3);
        X.C49089EpE.A00(r7).A02("delete_story_confirmation_dialog");
        X.C49089EpE.A00(r7).A03(com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, r24.getModuleName());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x016b, code lost:
        if (r12 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x016f, code lost:
        if (r5 == null) goto L_0x01e8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0171, code lost:
        r2 = X.C49089EpE.A00(r7);
        r1 = r5.getId();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0179, code lost:
        if (r1 == null) goto L_0x01e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x017b, code lost:
        r2.A03("media_id", r1);
        X.C49089EpE.A00(r7).A03("media_type", r5.BR7().name());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0191, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0196, code lost:
        if (r6.A1Y() == false) goto L_0x01b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0198, code lost:
        r9 = 2131957582;
        r1 = 2131957580;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x01a9, code lost:
        if (X.182.A06(X.0Tu.A05, r7, 36318943534914311L) == false) goto L_0x00b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x01ab, code lost:
        r1 = 2131957581;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x01b6, code lost:
        if (r6.A1m() == false) goto L_0x01cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x01b8, code lost:
        r9 = 2131957616;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x01bb, code lost:
        if (r3 == false) goto L_0x01dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x01bd, code lost:
        r9 = 2131957507;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x01c0, code lost:
        if (r29 == false) goto L_0x01d1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x01c2, code lost:
        X.Dba.A0s(r14, "\n\n", r10, 2131957504);
        r1 = 2131957505;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x01cd, code lost:
        r9 = 2131957584;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01d1, code lost:
        r10.append(r14.getText(2131957506));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x01dd, code lost:
        r1 = 2131957574;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01e7, code lost:
        throw new java.lang.IllegalStateException("Required value was null.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x01ed, code lost:
        throw new java.lang.IllegalStateException("Required value was null.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A04(android.app.Activity r32, android.content.DialogInterface.OnDismissListener r33, androidx.fragment.app.Fragment r34, X.0hq r35, X.AnonymousClass0iw r36, X.AnonymousClass0iw r37, com.instagram.common.session.UserSession r38, com.instagram.model.reels.Reel r39, X.C255773uh r40, X.AnonymousClass6ZF r41) {
        /*
            r31 = this;
            r8 = 0
            r0 = 1
            r7 = r38
            r6 = r40
            X.AnonymousClass7TF.A1E(r6, r0, r7)
            X.1Xj r5 = r6.A0b
            java.lang.String r26 = X.C51972G9s.A0n()
            boolean r12 = r6.CWu()
            r14 = r32
            if (r12 == 0) goto L_0x0034
            boolean r0 = r6.A0n()
            if (r0 == 0) goto L_0x0034
            X.8ab r1 = new X.8ab
            r1.<init>((android.app.Activity) r14)
            r0 = 2131975821(0x7f135e8d, float:1.9588745E38)
            r1.A09(r0)
            r0 = 2131975820(0x7f135e8c, float:1.9588743E38)
            r1.A08(r0)
            X.W5K r0 = X.W5K.A00
            X.DbX.A16(r0, r1)
        L_0x0033:
            return
        L_0x0034:
            r4 = 0
            if (r12 == 0) goto L_0x0053
            if (r5 == 0) goto L_0x0053
            X.1Xy r0 = r5.A0C
            java.lang.String r0 = r0.getBoostedBySponsor()
            if (r0 == 0) goto L_0x0053
            r0 = 2131954740(0x7f130c34, float:1.9545988E38)
            java.lang.String r1 = X.AnonymousClass7TE.A16(r14, r0)
            r0 = 2131954739(0x7f130c33, float:1.9545986E38)
            java.lang.String r0 = X.AnonymousClass7TE.A16(r14, r0)
            X.C49946FGa.A04(r14, r4, r7, r1, r0)
            return
        L_0x0053:
            boolean r28 = X.AnonymousClass8PU.A08(r7)
            if (r5 == 0) goto L_0x0061
            boolean r0 = r5.A4x()
            r29 = 1
            if (r0 != 0) goto L_0x0065
        L_0x0061:
            r29 = 0
            if (r5 == 0) goto L_0x008f
        L_0x0065:
            X.3YP r0 = r5.A1k()
            if (r0 == 0) goto L_0x0072
            X.3YP r0 = r5.A1k()
            java.lang.String.valueOf(r0)
        L_0x0072:
            long r9 = r5.A1A()
            r0 = 86400(0x15180, double:4.26873E-319)
            long r9 = r9 + r0
            long r1 = X.AnonymousClass7TG.A0I()
            int r0 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            boolean r0 = X.C51970G9q.A1T(r0)
            if (r0 != 0) goto L_0x008f
            boolean r0 = r5.A5O()
            if (r0 == 0) goto L_0x008f
            r3 = 1
            if (r28 != 0) goto L_0x0094
        L_0x008f:
            r3 = 0
            r27 = 0
            if (r5 == 0) goto L_0x0096
        L_0x0094:
            r27 = 1
        L_0x0096:
            X.Vah r2 = new X.Vah
            r24 = r37
            r23 = r2
            r25 = r7
            r23.<init>(r24, r25, r26, r27, r28, r29)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            boolean r0 = r6.A1e()
            if (r0 == 0) goto L_0x0192
            r9 = 2131957597(0x7f13175d, float:1.9551782E38)
            r1 = 2131957575(0x7f131747, float:1.9551738E38)
        L_0x00b2:
            X.C13988Tno.A0s(r14, r10, r1)
        L_0x00b5:
            X.8ab r11 = new X.8ab
            r11.<init>((android.app.Activity) r14)
            java.lang.String r0 = r10.toString()
            if (r0 != 0) goto L_0x00c2
            java.lang.String r0 = ""
        L_0x00c2:
            android.text.Spanned r0 = android.text.Html.fromHtml(r0)
            r11.A0q(r0)
            r11.A09(r9)
            r0 = 2131957531(0x7f13171b, float:1.9551649E38)
            if (r3 == 0) goto L_0x00d4
            r0 = 2131957535(0x7f13171f, float:1.9551657E38)
        L_0x00d4:
            X.FIw r13 = new X.FIw
            r15 = r33
            r16 = r35
            r17 = r36
            r19 = r39
            r22 = r41
            r20 = r6
            r21 = r2
            r23 = r3
            r18 = r7
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            X.8ae r1 = X.C358278ae.RED_BOLD
            r11.A0Q(r13, r1, r0)
            r26 = 3
            X.FIb r0 = new X.FIb
            r25 = r0
            r27 = r15
            r28 = r7
            r29 = r2
            r30 = r3
            r25.<init>(r26, r27, r28, r29, r30)
            r11.A0C(r0)
            X.W4a r0 = new X.W4a
            r0.<init>(r8, r7, r2, r3)
            r11.A0B(r0)
            if (r3 == 0) goto L_0x011b
            r0 = 2131957562(0x7f13173a, float:1.9551711E38)
            X.FIw r13 = new X.FIw
            r23 = r8
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            r11.A0O(r13, r1, r0)
        L_0x011b:
            boolean r0 = r6.A1Y()
            if (r0 == 0) goto L_0x014b
            X.4gK r9 = r6.A0d
            if (r9 == 0) goto L_0x014b
            X.3Q2 r8 = r9.A00
            X.0qQ.A07(r8)
            java.lang.String r6 = r8.A3k
            if (r6 == 0) goto L_0x014b
            r1 = 2131972504(0x7f135198, float:1.9582017E38)
            X.OfL r0 = new X.OfL
            r22 = r34
            r20 = r0
            r21 = r14
            r23 = r17
            r25 = r7
            r26 = r9
            r27 = r19
            r28 = r8
            r29 = r6
            r20.<init>(r21, r22, r23, r24, r25, r26, r27, r28, r29)
            r11.A0G(r0, r1)
        L_0x014b:
            X.DbT.A1V(r11)
            java.lang.String r1 = "view"
            java.lang.String r0 = "dialog"
            X.VFY.A00(r2, r1, r0, r4, r3)
            X.Vkw r1 = X.C49089EpE.A00(r7)
            java.lang.String r0 = "delete_story_confirmation_dialog"
            r1.A02(r0)
            X.Vkw r2 = X.C49089EpE.A00(r7)
            java.lang.String r1 = r24.getModuleName()
            java.lang.String r0 = "entry_point"
            r2.A03(r0, r1)
            if (r12 == 0) goto L_0x0033
            java.lang.String r3 = "Required value was null."
            if (r5 == 0) goto L_0x01e8
            X.Vkw r2 = X.C49089EpE.A00(r7)
            java.lang.String r1 = r5.getId()
            if (r1 == 0) goto L_0x01e2
            java.lang.String r0 = "media_id"
            r2.A03(r0, r1)
            X.Vkw r2 = X.C49089EpE.A00(r7)
            X.1iA r0 = r5.BR7()
            java.lang.String r1 = r0.name()
            java.lang.String r0 = "media_type"
            r2.A03(r0, r1)
            return
        L_0x0192:
            boolean r0 = r6.A1Y()
            if (r0 == 0) goto L_0x01b0
            r9 = 2131957582(0x7f13174e, float:1.9551752E38)
            X.0Tu r11 = X.0Tu.A05
            r0 = 36318943534914311(0x8107e300041b07, double:3.031584363902458E-306)
            boolean r0 = X.182.A06(r11, r7, r0)
            r1 = 2131957580(0x7f13174c, float:1.9551748E38)
            if (r0 == 0) goto L_0x00b2
            r1 = 2131957581(0x7f13174d, float:1.955175E38)
            goto L_0x00b2
        L_0x01b0:
            boolean r0 = r6.A1m()
            java.lang.String r1 = "\n\n"
            if (r0 == 0) goto L_0x01cd
            r9 = 2131957616(0x7f131770, float:1.955182E38)
        L_0x01bb:
            if (r3 == 0) goto L_0x01dd
            r9 = 2131957507(0x7f131703, float:1.95516E38)
            if (r29 == 0) goto L_0x01d1
            r0 = 2131957504(0x7f131700, float:1.9551594E38)
            X.Dba.A0s(r14, r1, r10, r0)
            r1 = 2131957505(0x7f131701, float:1.9551596E38)
            goto L_0x00b2
        L_0x01cd:
            r9 = 2131957584(0x7f131750, float:1.9551756E38)
            goto L_0x01bb
        L_0x01d1:
            r0 = 2131957506(0x7f131702, float:1.9551598E38)
            java.lang.CharSequence r0 = r14.getText(r0)
            r10.append(r0)
            goto L_0x00b5
        L_0x01dd:
            r1 = 2131957574(0x7f131746, float:1.9551736E38)
            goto L_0x00b2
        L_0x01e2:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r3)
            throw r0
        L_0x01e8:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.W2A.A04(android.app.Activity, android.content.DialogInterface$OnDismissListener, androidx.fragment.app.Fragment, X.0hq, X.0iw, X.0iw, com.instagram.common.session.UserSession, com.instagram.model.reels.Reel, X.3uh, X.6ZF):void");
    }

    public static final void A02(DialogInterface.OnDismissListener onDismissListener, 0hq r2) {
        if (onDismissListener != null) {
            onDismissListener.onDismiss(C19201WPh.A0X);
        }
        11Z.A03(new C20058WkI(r2));
    }

    public static void A03(AnonymousClass0iw r10, C255773uh r11, AnonymousClass6ZF r12, C19201WPh wPh) {
        W2A w2a = C19201WPh.A0Y;
        Reel reel = wPh.A0G.A0H;
        w2a.A04(wPh.A04, wPh.A01, wPh.A06, wPh.A07, wPh.A09, r10, wPh.A0B, reel, r11, r12);
    }
}
