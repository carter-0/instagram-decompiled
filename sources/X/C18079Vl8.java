package X;

import android.os.Bundle;
import com.instagram.api.schemas.AdsAPIInstagramPosition;
import com.instagram.api.schemas.ErrorIdentifier;
import com.instagram.api.schemas.XIGIGBoostCallToAction;
import com.instagram.api.schemas.XIGIGBoostDestination;
import com.instagram.business.boost.webview.BoostWebViewAdPreviewFragment$Config;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.music.common.model.AudioOverlayTrack;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Vl8  reason: case insensitive filesystem */
public final class C18079Vl8 {
    public final R8Q A00(UserSession userSession, String str) {
        UserSession userSession2 = userSession;
        String str2 = str;
        boolean A1U = AnonymousClass7TF.A1U(0, str2, userSession2);
        String str3 = userSession2.A05;
        BoostWebViewAdPreviewFragment$Config boostWebViewAdPreviewFragment$Config = new BoostWebViewAdPreviewFragment$Config(str2, 002.A0R("access_token=", str3), (String) null, (String) null, false, false, false, false, false, A1U, false, A1U, false, false, false);
        Bundle bundle = new Bundle();
        bundle.putParcelable(Pxd.A00(883), boostWebViewAdPreviewFragment$Config);
        bundle.putString("IgSessionManager.SESSION_TOKEN_KEY", str3);
        R8Q r8q = new R8Q();
        r8q.setArguments(bundle);
        return r8q;
    }

    public final C15324UaW A05(boolean z) {
        C15324UaW uaW = new C15324UaW();
        Bundle bundle = new Bundle();
        bundle.putBoolean("is_from_one_tap_onboarding", z);
        bundle.putBoolean("is_profile_visit_secondary_cta", false);
        uaW.setArguments(bundle);
        return uaW;
    }

    public final UZS A08(ErrorIdentifier errorIdentifier, UserSession userSession) {
        0qQ.A0B(userSession, 0);
        Bundle A09 = DbY.A09(userSession);
        A09.putString("error_type", errorIdentifier.toString());
        UZS uzs = new UZS();
        uzs.setArguments(A09);
        return uzs;
    }

    public final C15318UaQ A02(C16678UzE uzE) {
        Bundle bundle = new Bundle();
        bundle.putString("step", uzE.toString());
        C15318UaQ uaQ = new C15318UaQ();
        uaQ.setArguments(bundle);
        return uaQ;
    }

    public final C15322UaU A03(boolean z) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("should_open_special_category", z);
        C15322UaU uaU = new C15322UaU();
        uaU.setArguments(bundle);
        return uaU;
    }

    public final C16005Umm A04(boolean z, boolean z2) {
        C16005Umm umm = new C16005Umm();
        Bundle bundle = new Bundle();
        bundle.putBoolean("is_lead_form_creation_flow", z);
        bundle.putBoolean("is_standard_lead_form", z2);
        umm.setArguments(bundle);
        return umm;
    }

    public final C15328Uac A01(UserSession userSession, String str, String str2) {
        AnonymousClass7TG.A1N(userSession, str);
        Bundle A09 = DbY.A09(userSession);
        A09.putString("coupon_offer_id", str2);
        DbS.A1B(A09, str);
        C15328Uac uac = new C15328Uac();
        uac.setArguments(A09);
        return uac;
    }

    public final C15283UZn A06(XIGIGBoostCallToAction xIGIGBoostCallToAction, XIGIGBoostDestination xIGIGBoostDestination, UserSession userSession, ImageUrl imageUrl, AudioOverlayTrack audioOverlayTrack, String str, String str2, String str3, List list, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        C51974G9v.A1M(xIGIGBoostDestination, list, str);
        0qQ.A0B(xIGIGBoostCallToAction, 5);
        Bundle A09 = DbY.A09(userSession);
        A09.putBoolean("is_view_pager_child", z);
        A09.putString("destination", xIGIGBoostDestination.toString());
        ArrayList A0r = AnonymousClass7TG.A0r(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A0r.add(((AdsAPIInstagramPosition) it.next()).name());
        }
        C13992Tns.A0a(A09, A0r, xIGIGBoostCallToAction, str, z2);
        A09.putBoolean("is_fb_placement_selected", z3);
        C13992Tns.A0Y(A09, str2, z4, z5, z6);
        A09.putParcelable("selected_audio_overlay_track", audioOverlayTrack);
        A09.putString("ab_text_banner_text", str3);
        A09.putParcelable("ab_test_banner_url", imageUrl);
        C15283UZn uZn = new C15283UZn();
        uZn.setArguments(A09);
        return uZn;
    }

    public final C15282UZm A07(XIGIGBoostCallToAction xIGIGBoostCallToAction, XIGIGBoostDestination xIGIGBoostDestination, UserSession userSession, AudioOverlayTrack audioOverlayTrack, String str, String str2, List list, List list2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        C51974G9v.A1M(xIGIGBoostDestination, list, str);
        DbW.A1P(xIGIGBoostCallToAction, 5, list2);
        Bundle A09 = DbY.A09(userSession);
        A09.putBoolean("is_view_pager_child", z);
        A09.putString("destination", xIGIGBoostDestination.toString());
        ArrayList A0r = AnonymousClass7TG.A0r(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A0r.add(((AdsAPIInstagramPosition) it.next()).name());
        }
        C13992Tns.A0a(A09, A0r, xIGIGBoostCallToAction, str, z2);
        A09.putBoolean("is_fb_placement_selected", z3);
        C13992Tns.A0Y(A09, str2, z4, z5, z6);
        A09.putStringArrayList("special_requirement_categories", new ArrayList(list2));
        A09.putParcelable("selected_audio_overlay_track", audioOverlayTrack);
        C15282UZm uZm = new C15282UZm();
        uZm.setArguments(A09);
        return uZm;
    }
}
