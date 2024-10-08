package X;

import android.content.Context;
import com.instagram.brandedcontent.disclosure.BrandedContentDisclosureBaseViewModel;
import com.instagram.pendingmedia.model.BrandedContentTag;

public abstract class K82 extends MYR {
    public static final String __redex_internal_original_name = "BrandedContentDisclosureBaseFragment";
    public String A00;
    public final AnonymousClass0eM A01 = C227642jf.A02(this);

    public static final void A00(G5Q g5q, K82 k82, BrandedContentDisclosureBaseViewModel brandedContentDisclosureBaseViewModel, String str, String str2) {
        K82 k822 = k82;
        0lg A0X = DbT.A0X(k82.A01);
        0qQ.A0B(A0X, 0);
        1NY A0a = AnonymousClass7TG.A0a(A0X);
        A0a.A0A("ads/validate_story_ad_eligibility_existing_media/");
        String str3 = str;
        JTO.A1W(A0a, DbU.A1b(DbW.A0o(str, "_"), 0)[0]);
        String str4 = str2;
        A0a.A9m("sponsor_id", str2);
        A0a.A0Q(CF5.class, D0U.class);
        if (str2 != null) {
            A0a.A9m("sponsor_id", str2);
        }
        1OC A0M = A0a.A0M();
        A0M.A00 = new EC9(brandedContentDisclosureBaseViewModel, k822, g5q, str4, str3, 0);
        k82.schedule(A0M);
    }

    public final boolean A0C(BrandedContentDisclosureBaseViewModel brandedContentDisclosureBaseViewModel, String str, boolean z) {
        int size;
        String str2;
        BrandedContentTag brandedContentTag;
        Context A06 = DbT.A06(this, brandedContentDisclosureBaseViewModel, 0);
        AnonymousClass0eM r3 = this.A01;
        if (!C49946FGa.A06(A06, this, AnonymousClass7TE.A0l(r3)) && (size = brandedContentDisclosureBaseViewModel.A06.size()) > 0 && size <= 2) {
            if (!z || !0qQ.A0K(brandedContentDisclosureBaseViewModel.A05, "story") || !brandedContentDisclosureBaseViewModel.A0D || !brandedContentDisclosureBaseViewModel.A09) {
                0lg A0X = DbT.A0X(r3);
                boolean z2 = brandedContentDisclosureBaseViewModel.A0D;
                if (brandedContentDisclosureBaseViewModel.A06.isEmpty() || (brandedContentTag = (BrandedContentTag) brandedContentDisclosureBaseViewModel.A06.get(0)) == null) {
                    str2 = null;
                } else {
                    str2 = brandedContentTag.A01;
                }
                String str3 = brandedContentDisclosureBaseViewModel.A05;
                0Aj A0e = AnonymousClass7TE.A0e(DbT.A0Q(this, A0X, 0), "instagram_bc_update_permission");
                A0e.A7p("is_editing", Boolean.valueOf(z2));
                A0e.A7p("is_permission_enabled", Boolean.valueOf(z));
                DbU.A1N(A0e, "sponsor_igid", str2, str);
                A0e.AAJ("media_type", str3);
                A0e.AAJ("prior_module", getModuleName());
                A0e.Cgf();
                return brandedContentDisclosureBaseViewModel.A08(z);
            } else if (str != null) {
                String str4 = ((BrandedContentTag) brandedContentDisclosureBaseViewModel.A06.get(0)).A01;
                if (str4 != null) {
                    A00(new LdT(brandedContentDisclosureBaseViewModel), this, brandedContentDisclosureBaseViewModel, str, str4);
                } else {
                    throw AnonymousClass7TE.A0z("Required value was null.");
                }
            } else {
                throw AnonymousClass7TE.A0z("Required value was null.");
            }
        }
        return false;
    }

    public static final void A01(K82 k82, C45335Cud cud, String str, String str2, boolean z) {
        String str3;
        0lg A0X = DbT.A0X(k82.A01);
        if (cud != null) {
            str3 = cud.A02;
            if (str3 == null) {
                0qQ.A0F("errorIdentifier");
                throw AnonymousClass00P.createAndThrow();
            }
        } else {
            str3 = null;
        }
        0Aj A0e = AnonymousClass7TE.A0e(DbX.A0O(k82, A0X), "instagram_bc_story_ad_eligibility_check");
        A0e.A7p("is_request_success", Boolean.valueOf(z));
        if (str3 != null) {
            A0e.AAJ(C66579MXk.A00(13), str3);
        }
        if (str2 != null) {
            A0e.AAJ("sponsor_igid", str2);
        }
        A0e.AAJ("media_id", str);
        A0e.Cgf();
    }

    public final void onDestroyView() {
        int A02 = AnonymousClass0fD.A02(1633282111);
        super.onDestroyView();
        DbX.A0R(this.A01).A04("branded_content_tag_event_story_edit");
        AnonymousClass0fD.A09(824098802, A02);
    }
}
