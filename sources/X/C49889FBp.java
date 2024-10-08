package X;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.feed.intf.ContextualFeedNetworkConfig;
import com.instagram.modal.ModalActivity;
import com.instagram.modal.TransparentModalActivity;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import com.instagram.search.common.analytics.SearchContext;
import instagram.features.feed.fragment.ContextualFeedFragment;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.FBp  reason: case insensitive filesystem */
public final class C49889FBp {
    public static EO2 A00(String str, boolean z, boolean z2, boolean z3) {
        EO2 eo2 = new EO2();
        Bundle bundle = new Bundle();
        bundle.putString("argument_profile_id", str);
        bundle.putBoolean("argument_is_profile_tab", z);
        bundle.putString("argument_source_media_id", (String) null);
        bundle.putBoolean("argument_show_flip_shimmer", z2);
        bundle.putBoolean("argument_is_unship", z3);
        eo2.setArguments(bundle);
        return eo2;
    }

    public final void A01(Activity activity, View view, UserSession userSession, String str) {
        if (C318996ps.A01() && C318996ps.A00().A04(userSession) && !DbT.A1a(AnonymousClass7TE.A0q(userSession), "has_seen_feed_opal_indicator_tooltip")) {
            C318996ps.A00().A03();
            AnonymousClass5Gt A0f = AnonymousClass7TG.A0f(activity, DbY.A0c(activity, str, 2131968868));
            A0f.A03(view);
            A0f.A01();
            A0f.A00 = 5000;
            A0f.A0A = true;
            view.postDelayed(new C51387FtJ(userSession, C47898ELs.A00(A0f, userSession, 9)), 500);
        }
    }

    public final void A02(Activity activity, UserSession userSession) {
        PendingRecipient pendingRecipient;
        UserSession userSession2 = userSession;
        if (182.A06(DbS.A0J(userSession, 1), userSession, 36321082429088846L)) {
            ImageUrl imageUrl = PendingRecipient.A0g;
            pendingRecipient = new PendingRecipient(AnonymousClass7TF.A0Q(userSession));
            pendingRecipient.A0Y = true;
        } else {
            pendingRecipient = null;
        }
        Bundle A0a = AnonymousClass7TE.A0a();
        A0a.putParcelable("targetGroupProfile", pendingRecipient);
        A0a.putParcelable(C273654mx.A00(31), pendingRecipient);
        A0a.putBoolean(AnonymousClass000.A00(3616), true);
        A0a.putSerializable("cameraEntryPoint", 28D.A5J);
        A0a.putStringArrayList(AnonymousClass000.A00(1048), 0sr.A1L(new String[]{C363138jC.A00.A02, AnonymousClass9QA.A00.A02, AnonymousClass80N.A00.A02}));
        A0a.putSerializable(C273654mx.A00(175), AnonymousClass80E.OPAL);
        AnonymousClass6W8 A02 = AnonymousClass6W8.A02(activity, A0a, userSession, TransparentModalActivity.class, C273654mx.A00(1005));
        A02.A0J = new int[]{R.anim.fragment_slide_right_enter, R.anim.fragment_slide_right_exit, R.anim.fragment_slide_left_enter, R.anim.fragment_slide_left_exit};
        A02.A0C(activity);
        C49049EoT.A00(new FUG(), userSession2, "tap", "universal_create_button", "unknown", userSession.A06, (String) null);
    }

    public final void A03(FragmentActivity fragmentActivity, AnonymousClass0iw r11, UserSession userSession, String str, boolean z) {
        AnonymousClass7TG.A1U(fragmentActivity, userSession, r11);
        C318996ps.A00().A02();
        C49049EoT.A00(r11, userSession, "tap", "edit_audience", str, userSession.A06, (String) null);
        Bundle A0a = AnonymousClass7TE.A0a();
        A0a.putBoolean("argument_should_reset_dark_theme", z);
        DbV.A0Y(fragmentActivity, A0a, userSession, ModalActivity.class, C273654mx.A00(3104)).A0A(fragmentActivity, 68682);
    }

    public final void A04(FragmentActivity fragmentActivity, UserSession userSession, Integer num, String str, String str2, boolean z, boolean z2) {
        0qQ.A0B(str, 0);
        AnonymousClass7TG.A1R(fragmentActivity, userSession);
        A05(fragmentActivity, userSession, num, str, str2, z, z2, false);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0042, code lost:
        r6 = X.AnonymousClass05K.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0044, code lost:
        r5 = r21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0048, code lost:
        if (r20 == false) goto L_0x00ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004a, code lost:
        r0 = X.C46548Dgp.A01(r8, r12, "opal", "opal");
        r2 = X.DbS.A0M(r15, r8);
        r2.A0B((android.os.Bundle) null, X.C46447Df9.A00(r8, r0));
        r2.A0F = true;
        r2.A03();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x005f, code lost:
        if (r17 == null) goto L_0x0080;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0065, code lost:
        switch(r17.intValue()) {
            case 1: goto L_0x007b;
            case 2: goto L_0x007e;
            default: goto L_0x0068;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0068, code lost:
        r0 = "pull";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x006a, code lost:
        r0 = r0.equals("unship");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x006e, code lost:
        r2.A0B((android.os.Bundle) null, A00(r12, r5, false, r0));
        r2.A0F = true;
        r2.A03();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x007a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x007b, code lost:
        r0 = "fab";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x007e, code lost:
        r0 = "unship";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0080, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0082, code lost:
        r6 = X.AnonymousClass05K.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0085, code lost:
        r6 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0092, code lost:
        if (r10.equals(r4) == false) goto L_0x0022;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x009a, code lost:
        if (X.2R8.A07(r8.A06, r12) != false) goto L_0x0024;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x009c, code lost:
        r11 = "profile";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00bc, code lost:
        if (r10.equals(r0) == false) goto L_0x0022;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00be, code lost:
        r11 = "opal_badge";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00c8, code lost:
        if (r10.equals(r0) != false) goto L_0x0024;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00d2, code lost:
        if (r10.equals(r0) == false) goto L_0x0022;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00d4, code lost:
        r11 = "content_header";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00ee, code lost:
        r7 = X.DbS.A0M(r15, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00f5, code lost:
        if (r1 == -2013754088) goto L_0x016f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00fa, code lost:
        if (r1 == -1641116824) goto L_0x0175;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00ff, code lost:
        if (r1 != 1110855196) goto L_0x017b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0107, code lost:
        if (r10.equals("qp_megaphone") == false) goto L_0x017b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0109, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x010a, code lost:
        r2 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x010b, code lost:
        if (r0 == false) goto L_0x0137;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x010f, code lost:
        if (r6 != X.AnonymousClass05K.A01) goto L_0x0164;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0111, code lost:
        X.C318996ps.A00();
        r6 = X.DbS.A04(X.0Tu.A05, r8, 36602557405860494L);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0120, code lost:
        if (r6 == 1) goto L_0x0155;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0024, code lost:
        X.C318996ps.A00().A02();
        X.C49049EoT.A00(new X.FUF(), r8, r9, r10, r11, r12, (java.lang.String) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0123, code lost:
        if (r6 == 2) goto L_0x0159;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0125, code lost:
        r1 = com.instagram.android.R.anim.overshoot_left_in;
        r0 = com.instagram.android.R.anim.overshoot_left_out;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x012c, code lost:
        if (r6 == 3) goto L_0x0134;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x012e, code lost:
        r1 = com.instagram.android.R.anim.rotate_left_in;
        r0 = com.instagram.android.R.anim.rotate_left_out;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0134, code lost:
        r7.A0A(r1, r0, r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0137, code lost:
        if (r17 == null) goto L_0x0153;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x013d, code lost:
        switch(r17.intValue()) {
            case 1: goto L_0x014e;
            case 2: goto L_0x0151;
            default: goto L_0x0140;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0140, code lost:
        r0 = "pull";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0036, code lost:
        if (r17 != null) goto L_0x0085;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0142, code lost:
        r0 = r0.equals("unship");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0146, code lost:
        X.Dba.A0w((android.os.Bundle) null, A00(r12, r5, r2, r0), r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x014d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x014e, code lost:
        r0 = "fab";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0151, code lost:
        r0 = "unship";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0153, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0155, code lost:
        r1 = com.instagram.android.R.anim.overshoot_extra_left_in;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0159, code lost:
        r1 = com.instagram.android.R.anim.overshoot_left_in;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x015c, code lost:
        r7.A0A(r1, com.instagram.android.R.anim.overshoot_left_out, r1, com.instagram.android.R.anim.overshoot_left_out);
        r2 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0166, code lost:
        if (r6 != X.AnonymousClass05K.A00) goto L_0x0137;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0168, code lost:
        r7.A0A(com.instagram.android.R.anim.modal_slide_up_enter, 0, com.instagram.android.R.anim.modal_slide_up_enter, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x016f, code lost:
        r2 = X.AnonymousClass000.A00(341);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0179, code lost:
        if (r10.equals(r2) != false) goto L_0x0109;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x017b, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0040, code lost:
        if (X.C318996ps.A00().A06(r8) == false) goto L_0x0082;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A05(androidx.fragment.app.FragmentActivity r15, com.instagram.common.session.UserSession r16, java.lang.Integer r17, java.lang.String r18, java.lang.String r19, boolean r20, boolean r21, boolean r22) {
        /*
            r14 = this;
            r3 = 0
            r8 = r16
            X.AnonymousClass7TG.A1R(r15, r8)
            r0 = 1651(0x673, float:2.314E-42)
            java.lang.String r4 = X.AnonymousClass000.A00(r0)
            r2 = r4
            r10 = r19
            boolean r0 = r10.equals(r4)
            if (r0 == 0) goto L_0x00ea
            java.lang.String r9 = "pull"
        L_0x0017:
            int r1 = r10.hashCode()
            java.lang.String r11 = "self_profile"
            r12 = r18
            switch(r1) {
                case -2013754088: goto L_0x0088;
                case -1641116824: goto L_0x008e;
                case -1518389013: goto L_0x009f;
                case -893651512: goto L_0x00a2;
                case -620676450: goto L_0x00a5;
                case -265713450: goto L_0x00b1;
                case -146283796: goto L_0x00b6;
                case 1110855196: goto L_0x00c2;
                case 1782764648: goto L_0x00cc;
                case 2073830337: goto L_0x00d8;
                default: goto L_0x0022;
            }
        L_0x0022:
            java.lang.String r11 = "unknown"
        L_0x0024:
            X.1q7 r0 = X.C318996ps.A00()
            r0.A02()
            X.FUF r7 = new X.FUF
            r7.<init>()
            java.lang.String r0 = "opal"
            r13 = 0
            X.C49049EoT.A00(r7, r8, r9, r10, r11, r12, r13)
            if (r17 != 0) goto L_0x0085
            X.1q7 r4 = X.C318996ps.A00()
            boolean r4 = r4.A06(r8)
            if (r4 == 0) goto L_0x0082
            java.lang.Integer r6 = X.AnonymousClass05K.A00
        L_0x0044:
            java.lang.String r4 = "unship"
            r5 = r21
            if (r20 == 0) goto L_0x00ee
            X.Dfc r0 = X.C46548Dgp.A01(r8, r12, r0, r0)
            X.6Yo r2 = X.DbS.A0M(r15, r8)
            androidx.fragment.app.Fragment r0 = X.C46447Df9.A00(r8, r0)
            r2.A0B(r13, r0)
            r1 = 1
            r2.A0F = r1
            r2.A03()
            if (r17 == 0) goto L_0x0080
            int r0 = r17.intValue()
            switch(r0) {
                case 1: goto L_0x007b;
                case 2: goto L_0x007e;
                default: goto L_0x0068;
            }
        L_0x0068:
            java.lang.String r0 = "pull"
        L_0x006a:
            boolean r0 = r0.equals(r4)
        L_0x006e:
            X.EO2 r0 = A00(r12, r5, r3, r0)
            r2.A0B(r13, r0)
            r2.A0F = r1
            r2.A03()
            return
        L_0x007b:
            java.lang.String r0 = "fab"
            goto L_0x006a
        L_0x007e:
            r0 = r4
            goto L_0x006a
        L_0x0080:
            r0 = 0
            goto L_0x006e
        L_0x0082:
            java.lang.Integer r6 = X.AnonymousClass05K.A01
            goto L_0x0044
        L_0x0085:
            r6 = r17
            goto L_0x0044
        L_0x0088:
            r0 = 341(0x155, float:4.78E-43)
            java.lang.String r4 = X.AnonymousClass000.A00(r0)
        L_0x008e:
            boolean r0 = r10.equals(r4)
            if (r0 == 0) goto L_0x0022
            java.lang.String r0 = r8.A06
            boolean r0 = X.2R8.A07(r0, r12)
            if (r0 != 0) goto L_0x0024
            java.lang.String r11 = "profile"
            goto L_0x0024
        L_0x009f:
            java.lang.String r0 = "view_user_opal_button"
            goto L_0x00b8
        L_0x00a2:
            java.lang.String r0 = "opal_profile_menu"
            goto L_0x00c4
        L_0x00a5:
            java.lang.String r0 = "opal_nux"
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x0022
            java.lang.String r11 = "opal_profile"
            goto L_0x0024
        L_0x00b1:
            java.lang.String r0 = X.Dbj.A03()
            goto L_0x00ce
        L_0x00b6:
            java.lang.String r0 = "view_self_opal_button"
        L_0x00b8:
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x0022
            java.lang.String r11 = "opal_badge"
            goto L_0x0024
        L_0x00c2:
            java.lang.String r0 = "qp_megaphone"
        L_0x00c4:
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L_0x0024
            goto L_0x0022
        L_0x00cc:
            java.lang.String r0 = "profile_picture"
        L_0x00ce:
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x0022
            java.lang.String r11 = "content_header"
            goto L_0x0024
        L_0x00d8:
            java.lang.String r0 = "profile_notification"
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x0022
            if (r22 == 0) goto L_0x00e6
            java.lang.String r11 = "activity_feed"
            goto L_0x0024
        L_0x00e6:
            java.lang.String r11 = "push"
            goto L_0x0024
        L_0x00ea:
            java.lang.String r9 = "tap"
            goto L_0x0017
        L_0x00ee:
            X.6Yo r7 = X.DbS.A0M(r15, r8)
            r0 = -2013754088(0xffffffff87f88d18, float:-3.739782E-34)
            if (r1 == r0) goto L_0x016f
            r0 = -1641116824(0xffffffff9e2e8b68, float:-9.240312E-21)
            if (r1 == r0) goto L_0x0175
            r0 = 1110855196(0x42364e1c, float:45.57628)
            if (r1 != r0) goto L_0x017b
            java.lang.String r0 = "qp_megaphone"
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x017b
        L_0x0109:
            r0 = 1
        L_0x010a:
            r2 = 0
            if (r0 == 0) goto L_0x0137
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r6 != r0) goto L_0x0164
            X.C318996ps.A00()
            X.0Tu r3 = X.0Tu.A05
            r0 = 36602557405860494(0x8209d5000c128e, double:3.210942917910217E-306)
            int r6 = X.DbS.A04(r3, r8, r0)
            r0 = 1
            if (r6 == r0) goto L_0x0155
            r0 = 2
            if (r6 == r0) goto L_0x0159
            r3 = 3
            r1 = 2130772091(0x7f01007b, float:1.714729E38)
            r0 = 2130772092(0x7f01007c, float:1.7147293E38)
            if (r6 == r3) goto L_0x0134
            r1 = 2130772098(0x7f010082, float:1.7147305E38)
            r0 = 2130772099(0x7f010083, float:1.7147307E38)
        L_0x0134:
            r7.A0A(r1, r0, r1, r0)
        L_0x0137:
            if (r17 == 0) goto L_0x0153
            int r0 = r17.intValue()
            switch(r0) {
                case 1: goto L_0x014e;
                case 2: goto L_0x0151;
                default: goto L_0x0140;
            }
        L_0x0140:
            java.lang.String r0 = "pull"
        L_0x0142:
            boolean r0 = r0.equals(r4)
        L_0x0146:
            X.EO2 r0 = A00(r12, r5, r2, r0)
            X.Dba.A0w(r13, r0, r7)
            return
        L_0x014e:
            java.lang.String r0 = "fab"
            goto L_0x0142
        L_0x0151:
            r0 = r4
            goto L_0x0142
        L_0x0153:
            r0 = 0
            goto L_0x0146
        L_0x0155:
            r1 = 2130772090(0x7f01007a, float:1.7147289E38)
            goto L_0x015c
        L_0x0159:
            r1 = 2130772091(0x7f01007b, float:1.714729E38)
        L_0x015c:
            r0 = 2130772092(0x7f01007c, float:1.7147293E38)
            r7.A0A(r1, r0, r1, r0)
            r2 = 1
            goto L_0x0137
        L_0x0164:
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            if (r6 != r0) goto L_0x0137
            r0 = 2130772079(0x7f01006f, float:1.7147266E38)
            r7.A0A(r0, r3, r0, r3)
            goto L_0x0137
        L_0x016f:
            r0 = 341(0x155, float:4.78E-43)
            java.lang.String r2 = X.AnonymousClass000.A00(r0)
        L_0x0175:
            boolean r0 = r10.equals(r2)
            if (r0 != 0) goto L_0x0109
        L_0x017b:
            r0 = 0
            goto L_0x010a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C49889FBp.A05(androidx.fragment.app.FragmentActivity, com.instagram.common.session.UserSession, java.lang.Integer, java.lang.String, java.lang.String, boolean, boolean, boolean):void");
    }

    public final void A06(FragmentActivity fragmentActivity, UserSession userSession, String str, List list) {
        FragmentActivity fragmentActivity2 = fragmentActivity;
        UserSession userSession2 = userSession;
        AnonymousClass7TF.A1B(fragmentActivity2, 1, userSession2);
        String str2 = (String) 00k.A0J(list);
        String A00 = C273654mx.A00(861);
        String A002 = AnonymousClass000.A00(2393);
        String str3 = 1L2.A00().A00;
        C318996ps.A00().A03();
        String string = fragmentActivity2.getString(2131968864);
        ArrayList A1D = AnonymousClass7TE.A1D(list);
        ContextualFeedNetworkConfig contextualFeedNetworkConfig = new ContextualFeedNetworkConfig((String) null, "", "", (String) null, (String) null, 0);
        Bundle A0a = AnonymousClass7TE.A0a();
        C14005To7 to7 = new C14005To7();
        Bundle A0a2 = AnonymousClass7TE.A0a();
        to7.A01(A0a2);
        C309516Yo A0M = DbS.A0M(fragmentActivity2, userSession2);
        ContextualFeedFragment contextualFeedFragment = new ContextualFeedFragment();
        contextualFeedFragment.setArguments(C46424Del.A00(A0a2, A0a, (0jB) null, contextualFeedNetworkConfig, (SearchContext) null, (Integer) null, A002, string, (String) null, str2, A00, (String) null, (String) null, (String) null, (String) null, "opal_posts", (String) null, str2, str3, "opal_posts", A1D, 0, false, false, true, true, false, false, true, false, true, false));
        Dba.A0w((Bundle) null, contextualFeedFragment, A0M);
        C318996ps.A00().A02();
        C49049EoT.A00(new FUH(), userSession2, "tap", "content_notification", str, "", (String) null);
    }
}
