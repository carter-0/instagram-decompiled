package X;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import androidx.fragment.app.FragmentActivity;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.common.session.UserSession;
import com.instagram.direct.fragment.sharesheet.DirectShareSheetFragment;
import java.util.BitSet;
import java.util.HashMap;

/* renamed from: X.FGf  reason: case insensitive filesystem */
public abstract class C49950FGf {
    public static final SpannableStringBuilder A00(FragmentActivity fragmentActivity, UserSession userSession) {
        0qQ.A0B(userSession, 1);
        String A16 = AnonymousClass7TE.A16(fragmentActivity, 2131954128);
        SpannableStringBuilder A0C = DbS.A0C(DbY.A0c(fragmentActivity, A16, 2131969176));
        AnonymousClass7AV.A05(A0C, new C48053ESw(fragmentActivity, userSession, DbV.A02(fragmentActivity), 2), A16);
        return A0C;
    }

    public static final void A01(Context context, FragmentActivity fragmentActivity, AnonymousClass0iw r7, UserSession userSession, String str, String str2, String str3, String str4) {
        boolean A1U = AnonymousClass7TF.A1U(0, context, fragmentActivity);
        AnonymousClass7TG.A0w(2, userSession, r7, str);
        C49731F3w A07 = 1as.A04.A02.A07(r7, userSession, 2FW.A1K);
        A07.A08(false);
        Bundle bundle = A07.A07;
        bundle.putString("DirectShareSheetConstants.partnership_ad_code", str);
        bundle.putString(AnonymousClass000.A00(921), AnonymousClass7TE.A16(context, 2131969175));
        DirectShareSheetFragment A00 = A07.A00();
        C331127Pr A0W = DbS.A0W(userSession);
        A0W.A0T = A00;
        A0W.A03 = 0.66f;
        DbS.A1S(A0W, A1U);
        DbU.A0y(fragmentActivity, A00, A0W);
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r7, userSession), "instagram_bc_boost_code_access_token_share");
        A0e.AAJ("media_id", str2);
        A0e.AAJ("media_type", str3);
        A0e.AAJ(AnonymousClass000.A00(527), str4);
        A0e.Cgf();
    }

    public static final void A02(Context context, AnonymousClass0iw r3, UserSession userSession, String str, String str2, String str3) {
        ClipboardManager clipboardManager;
        0qQ.A0B(context, 0);
        AnonymousClass7TG.A1U(userSession, r3, str);
        Object A0e = DbZ.A0e(context);
        if ((A0e instanceof ClipboardManager) && (clipboardManager = (ClipboardManager) A0e) != null) {
            clipboardManager.setPrimaryClip(ClipData.newPlainText(AnonymousClass7TE.A16(context, 2131969184), str));
            C310336ap A0W = DbV.A0W();
            DbS.A19(context, A0W, 2131954126);
            DbY.A1N(A0W);
            0Aj A0e2 = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r3, userSession), "instagram_bc_boost_code_access_token_copy");
            DbU.A1N(A0e2, AnonymousClass000.A00(527), str3, str2);
            A0e2.AAJ("sponsor_igid", (String) null);
            A0e2.Cgf();
        }
    }

    public static final void A04(FragmentActivity fragmentActivity, UserSession userSession, String str, String str2, boolean z) {
        long j;
        Long A10;
        AnonymousClass7TF.A1H(fragmentActivity, userSession);
        IgBloksScreenConfig A0N = DbS.A0N(userSession);
        A0N.A0R = "com.bloks.www.ig.branded_content_ads.permissions";
        DbS.A18(fragmentActivity, A0N, 2131969185);
        HashMap A1E = AnonymousClass7TE.A1E();
        HashMap A1E2 = AnonymousClass7TE.A1E();
        HashMap A0v = DbX.A0v();
        A1E.put("prior_module", str);
        if (str2 == null || (A10 = AnonymousClass7TE.A10(str2)) == null) {
            j = 0;
        } else {
            j = A10.longValue();
        }
        A1E.put("permission_id", Long.valueOf(j));
        C46649DiU A05 = C46649DiU.A05("com.bloks.www.ig.branded_content_ads.permissions", A1E, A1E2);
        A05.A03 = null;
        A05.A02 = null;
        A05.A04 = null;
        A05.A0H(A0v);
        C309516Yo A01 = C46649DiU.A01(fragmentActivity, A0N, A05, userSession);
        if (z) {
            A01.A0D = false;
        }
        A01.A04();
    }

    public static final void A05(FragmentActivity fragmentActivity, UserSession userSession, String str, String str2, boolean z) {
        0qQ.A0B(fragmentActivity, 0);
        AnonymousClass7TF.A1B(userSession, 1, str);
        IgBloksScreenConfig A0N = DbS.A0N(userSession);
        A0N.A0R = "com.bloks.www.ig.branded_content_ads.settings.ads_by_partner";
        DbS.A18(fragmentActivity, A0N, 2131969188);
        HashMap A1E = AnonymousClass7TE.A1E();
        HashMap A1E2 = AnonymousClass7TE.A1E();
        HashMap A1E3 = AnonymousClass7TE.A1E();
        BitSet A0w = DbS.A0w(1);
        A1E.put("ad_partner_igid", str2);
        A1E.put("selected_tab", DbS.A0j(z ? 1 : 0));
        A0w.set(0);
        A1E.put("prior_module", str);
        if (A0w.nextClearBit(0) >= 1) {
            C46649DiU A05 = C46649DiU.A05("com.bloks.www.ig.branded_content_ads.settings.ads_by_partner", A1E, A1E2);
            A05.A03 = null;
            A05.A02 = null;
            A05.A04 = null;
            A05.A0H(A1E3);
            C46649DiU.A01(fragmentActivity, A0N, A05, userSession).A04();
            return;
        }
        throw DbU.A0i();
    }

    public static final void A06(FragmentActivity fragmentActivity, UserSession userSession, String str, boolean z) {
        AnonymousClass7TF.A1H(fragmentActivity, userSession);
        IgBloksScreenConfig A0N = DbS.A0N(userSession);
        A0N.A0R = "com.bloks.www.ig.branded_content_ads.individual_posts";
        DbS.A18(fragmentActivity, A0N, 2131954139);
        HashMap A1E = AnonymousClass7TE.A1E();
        HashMap A1E2 = AnonymousClass7TE.A1E();
        HashMap A0v = DbX.A0v();
        A1E.put("prior_module", str);
        C46649DiU A05 = C46649DiU.A05("com.bloks.www.ig.branded_content_ads.individual_posts", A1E, A1E2);
        A05.A03 = null;
        A05.A02 = null;
        A05.A04 = null;
        A05.A0H(A0v);
        C309516Yo A01 = C46649DiU.A01(fragmentActivity, A0N, A05, userSession);
        if (z) {
            A01.A0D = false;
        }
        A01.A04();
    }

    public static final void A07(FragmentActivity fragmentActivity, UserSession userSession, String str, boolean z, boolean z2) {
        IgBloksScreenConfig A0N = DbS.A0N(userSession);
        A0N.A0R = "com.bloks.www.ig.branded_content_ads.settings";
        DbS.A18(fragmentActivity, A0N, 2131969188);
        HashMap A1E = AnonymousClass7TE.A1E();
        HashMap A1E2 = AnonymousClass7TE.A1E();
        HashMap A0v = DbX.A0v();
        A1E.put("prior_module", str);
        C46649DiU A05 = C46649DiU.A05("com.bloks.www.ig.branded_content_ads.settings", A1E, A1E2);
        A05.A03 = null;
        A05.A02 = null;
        A05.A04 = null;
        A05.A0H(A0v);
        C309516Yo A01 = C46649DiU.A01(fragmentActivity, A0N, A05, userSession);
        if (z2) {
            A01.A0F = true;
        }
        if (z) {
            A01.A0D = false;
        }
        A01.A04();
    }

    public static final void A03(FragmentActivity fragmentActivity, UserSession userSession, String str, int i) {
        String str2 = DbU.A1b(DbW.A0o(str, "_"), 0)[0];
        IgBloksScreenConfig A0N = DbS.A0N(userSession);
        A0N.A0R = "com.bloks.www.ig.branded_content_ads.ad_details";
        DbS.A18(fragmentActivity, A0N, 2131953752);
        HashMap A1E = AnonymousClass7TE.A1E();
        HashMap A1E2 = AnonymousClass7TE.A1E();
        HashMap A0v = DbX.A0v();
        A1E.put("media_igid", str2);
        A1E.put("prior_module", "bc_inbox");
        A1E.put("notification_type", DbS.A0j(i));
        C46649DiU A05 = C46649DiU.A05("com.bloks.www.ig.branded_content_ads.ad_details", A1E, A1E2);
        A05.A03 = null;
        A05.A02 = null;
        A05.A04 = null;
        A05.A0H(A0v);
        C46649DiU.A01(fragmentActivity, A0N, A05, userSession).A04();
    }
}
