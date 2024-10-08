package X;

import android.content.Context;
import android.content.res.Resources;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.instagram.common.session.UserSession;

/* renamed from: X.Lap  reason: case insensitive filesystem */
public final class C64373Lap implements CallerContextable {
    public static final CallerContext A00 = CallerContext.A00(C64373Lap.class);
    public static final String __redex_internal_original_name = "CrosspostToFBFeedUpsellDialogHelper";

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0095  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(android.content.Context r9, com.instagram.common.session.UserSession r10, X.1Xj r11, X.C66461MSp r12) {
        /*
            r0 = 0
            X.0qQ.A0B(r10, r0)
            if (r9 == 0) goto L_0x00b1
            X.8jd r1 = X.C363388je.A00(r10)
            com.facebook.common.callercontext.CallerContext r0 = A00
            X.5wF r0 = r1.A00(r0)
            java.lang.String r8 = r0.A04
            X.5w9 r0 = X.AnonymousClass5w8.A05
            X.5w8 r0 = X.AnonymousClass5w9.A00(r10)
            java.lang.String r3 = r0.A05(r9, r10)
            X.8ab r4 = X.DbS.A0Y(r9)
            r0 = 2131961931(0x7f13284b, float:1.9560573E38)
            r4.A09(r0)
            X.Dba.A1M(r4)
            r2 = 2131961932(0x7f13284c, float:1.9560575E38)
            r1 = 4
            X.LUV r0 = new X.LUV
            r0.<init>(r1, r12, r10, r11)
            r4.A0I(r0, r2)
            r0 = 51
            X.LV0 r0 = X.LV0.A00(r11, r10, r0)
            r4.A0C(r0)
            X.0Tu r2 = X.0Tu.A05
            r0 = 36322873429994123(0x810b7600042a8b, double:3.034069645375348E-306)
            boolean r7 = X.182.A06(r2, r10, r0)
            int r6 = r8.length()
            if (r6 <= 0) goto L_0x00c3
            if (r3 == 0) goto L_0x00b2
            int r0 = r3.length()
            if (r0 == 0) goto L_0x00b2
            android.content.res.Resources r5 = r9.getResources()
            r1 = 2131962376(0x7f132a08, float:1.9561475E38)
            if (r7 == 0) goto L_0x0063
            r1 = 2131962377(0x7f132a09, float:1.9561477E38)
        L_0x0063:
            java.lang.Object[] r0 = new java.lang.Object[]{r8, r3}
        L_0x0067:
            android.text.Spanned r0 = X.0bC.A00(r5, r0, r1)
        L_0x006b:
            X.0qQ.A0A(r0)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r4.A0q(r0)
            boolean r0 = X.C363558jv.A00(r10)
            if (r0 != 0) goto L_0x0090
            r0 = 36322873430059660(0x810b7600052a8c, double:3.034069645416794E-306)
            boolean r0 = X.182.A06(r2, r10, r0)
            if (r0 == 0) goto L_0x0090
            r2 = 2131958475(0x7f131acb, float:1.9553563E38)
            r1 = 3
            X.LUV r0 = new X.LUV
            r0.<init>(r1, r12, r10, r11)
            r4.A0G(r0, r2)
        L_0x0090:
            X.DbT.A1V(r4)
            if (r6 != 0) goto L_0x009c
            X.8sM r1 = X.C368278sM.SUPPRESS
            java.lang.String r0 = "empty_name"
            A02(r1, r10, r11, r0)
        L_0x009c:
            if (r3 == 0) goto L_0x00a4
            int r0 = r3.length()
            if (r0 != 0) goto L_0x00ab
        L_0x00a4:
            X.8sM r1 = X.C368278sM.SUPPRESS
            java.lang.String r0 = "empty_audience"
            A02(r1, r10, r11, r0)
        L_0x00ab:
            X.8sM r1 = X.C368278sM.VIEW
            r0 = 0
            A02(r1, r10, r11, r0)
        L_0x00b1:
            return
        L_0x00b2:
            android.content.res.Resources r5 = r9.getResources()
            r1 = 2131962375(0x7f132a07, float:1.9561473E38)
            if (r7 == 0) goto L_0x00be
            r1 = 2131962378(0x7f132a0a, float:1.956148E38)
        L_0x00be:
            java.lang.Object[] r0 = new java.lang.Object[]{r8}
            goto L_0x0067
        L_0x00c3:
            if (r3 == 0) goto L_0x00dc
            int r0 = r3.length()
            if (r0 == 0) goto L_0x00dc
            android.content.res.Resources r5 = r9.getResources()
            r1 = 2131962373(0x7f132a05, float:1.956147E38)
            if (r7 == 0) goto L_0x00d7
            r1 = 2131962374(0x7f132a06, float:1.9561471E38)
        L_0x00d7:
            java.lang.Object[] r0 = new java.lang.Object[]{r3}
            goto L_0x0067
        L_0x00dc:
            android.content.res.Resources r1 = r9.getResources()
            r0 = 2131962371(0x7f132a03, float:1.9561465E38)
            if (r7 == 0) goto L_0x00e8
            r0 = 2131962372(0x7f132a04, float:1.9561467E38)
        L_0x00e8:
            java.lang.String r0 = r1.getString(r0)
            goto L_0x006b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64373Lap.A00(android.content.Context, com.instagram.common.session.UserSession, X.1Xj, X.MSp):void");
    }

    public static final void A01(Context context, UserSession userSession, C66461MSp mSp, String str) {
        CharSequence string;
        int i;
        Object[] objArr;
        int i2;
        boolean A1U = AnonymousClass7TF.A1U(0, userSession, context);
        String str2 = str;
        0qQ.A0B(str2, 4);
        C363548ju r11 = new C363548ju(userSession);
        C299935wF A002 = C363388je.A00(userSession).A00(A00);
        String str3 = A002.A04;
        AnonymousClass5w9 r0 = AnonymousClass5w8.A05;
        String A05 = AnonymousClass5w9.A00(userSession).A05(context, userSession);
        C358248ab A0Y = DbS.A0Y(context);
        A0Y.A09(2131962282);
        A0Y.A0r(A1U);
        A0Y.A0s(A1U);
        C66461MSp mSp2 = mSp;
        A0Y.A0I(new LUX(mSp2, userSession, r11, str2, 4), 2131962283);
        A0Y.A0H(new LV1(userSession, str2, 11), 2131968513);
        A0Y.A0f(new C50030FJp(6, userSession, mSp2));
        int length = str3.length();
        if (length > 0) {
            boolean A02 = C363388je.A02(A002);
            Resources resources = context.getResources();
            if (A02) {
                i2 = 2131962278;
                if (A05 != null) {
                    i = 2131962279;
                }
                objArr = new Object[]{str3};
                string = 0bC.A00(resources, objArr, i);
            } else {
                i2 = 2131962280;
                if (A05 != null) {
                    i = 2131962281;
                }
                objArr = new Object[]{str3};
                string = 0bC.A00(resources, objArr, i);
            }
            objArr = new Object[]{str3, A05};
            string = 0bC.A00(resources, objArr, i);
        } else {
            string = context.getResources().getString(2131962277);
        }
        0qQ.A0A(string);
        A0Y.A0q(string);
        DbT.A1V(A0Y);
        1Au.A00(userSession).A0W(AnonymousClass7TE.A0q(userSession).getInt("feed_fb_autoshare_upsell_dialog_display_count", 0) + 1);
        1Au.A00(userSession).A0g(System.currentTimeMillis());
        C367998ru.A01(AnonymousClass818.IG_FEED_COMPOSER_SHARE_TO_FACEBOOK_TOGGLE_ENABLE, AnonymousClass819.DIALOG_FEED, userSession);
        if (length == 0) {
            A03(C368278sM.SUPPRESS, userSession, str2, "empty_name");
        }
        if (A05 == null || A05.length() == 0) {
            A03(C368278sM.SUPPRESS, userSession, str2, "empty_audience");
        }
        A03(C368278sM.VIEW, userSession, str2, (String) null);
    }

    public static final boolean A04(UserSession userSession) {
        1Av A002 = 1Au.A00(userSession);
        boolean A03 = C363388je.A03(C363388je.A00(userSession).A00(A00));
        if (!C363558jv.A00(userSession) && A03) {
            long j = A002.A01.getLong("feed_fb_autoshare_upsell_dialog_last_seen_sec", 0);
            if ((j == 0 || JTR.A0L() - j > 604800) && AnonymousClass7TE.A0q(userSession).getInt("feed_fb_autoshare_upsell_dialog_display_count", 0) < 3) {
                if (!C367998ru.A03(AnonymousClass818.IG_FEED_COMPOSER_SHARE_TO_FACEBOOK_TOGGLE_ENABLE, AnonymousClass819.DIALOG_FEED, userSession)) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public static final void A02(C368278sM r5, UserSession userSession, 1Xj r7, String str) {
        String str2;
        AnonymousClass818 r4 = AnonymousClass818.IG_FEED_OVERFLOW_MENU;
        AnonymousClass819 r3 = AnonymousClass819.DIALOG_SHARE_LATER_FEED;
        AnonymousClass81A A0O = JTO.A0O();
        if (r7 != null) {
            str2 = r7.getId();
        } else {
            str2 = null;
        }
        JTQ.A19(A0O, "ig_media_id", str2, str);
        C368288sN.A00(r4, r5, r3, A0O, userSession);
    }

    public static final void A03(C368278sM r6, UserSession userSession, String str, String str2) {
        AnonymousClass818 r5 = AnonymousClass818.IG_FEED_COMPOSER_SHARE_TO_FACEBOOK_TOGGLE_ENABLE;
        AnonymousClass819 r4 = AnonymousClass819.DIALOG_FEED;
        AnonymousClass81A A0O = JTO.A0O();
        JTT.A1C(A0O, (long) AnonymousClass7TE.A0q(userSession).getInt("feed_fb_autoshare_upsell_dialog_display_count", 0));
        JTQ.A19(A0O, "waterfall_id", str, str2);
        C368288sN.A00(r5, r6, r4, A0O, userSession);
    }
}
