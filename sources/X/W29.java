package X;

import android.content.Context;
import android.os.BaseBundle;
import android.os.Bundle;
import android.os.Parcelable;
import com.instagram.api.schemas.XIGIGBoostDestination;
import com.instagram.business.boost.model.BoostFlowType;
import com.instagram.business.promote.model.PromoteLaunchOrigin;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import java.io.Serializable;
import kotlin.Deprecated;

@Deprecated(message = "To be removed after Boost launcher migration")
public final class W29 {
    public XIGIGBoostDestination A00;
    public BoostFlowType A01 = BoostFlowType.ORIGINAL;
    public PromoteLaunchOrigin A02;
    public UserSession A03;
    public ImageUrl A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public String A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public final Context A0E;
    public final 1Yg A0F;

    public static Bundle A01(BoostFlowType boostFlowType, PromoteLaunchOrigin promoteLaunchOrigin, UserSession userSession, String str, String str2, String str3, String str4, String str5, int i, int i2) {
        Bundle A092 = DbY.A09(userSession);
        A092.putString("media_id", str4);
        A092.putSerializable(AnonymousClass000.A00(751), promoteLaunchOrigin);
        A092.putSerializable("boost_flow_type", boostFlowType);
        A092.putString("audience_id", (String) null);
        A092.putParcelable("media_url", (Parcelable) null);
        A092.putString("ad_account_id", (String) null);
        DbS.A1B(A092, str3);
        A092.putBoolean("is_sub_flow", false);
        A092.putString("coupon_offer_id", str2);
        A092.putString("objective", str5);
        A092.putString("destination_cta", (String) null);
        A092.putString("political_ad_byline_text", (String) null);
        A092.putBoolean("has_product_tag", false);
        A092.putStringArray("sponsor_ids", (String[]) null);
        A092.putSerializable("destination", (Serializable) null);
        A092.putSerializable("personalized_destination", (Serializable) null);
        A092.putInt("default_budget", i);
        A092.putInt("default_duration", i2);
        A092.putBoolean("is_from_ctwa_upsell", false);
        A092.putBoolean("is_ctwa_coupon_aymt", false);
        A092.putBoolean("is_from_lead_ads_upsell", false);
        A092.putString("aymt_channel", str);
        A092.putString("reference_code_for_aymt_dropoff", (String) null);
        A092.putSerializable("media_product_type", (Serializable) null);
        A092.putBoolean(AnonymousClass000.A00(81), false);
        A092.putString("selected_audio_spec", (String) null);
        A092.putParcelable("selected_audio_overlay_track", (Parcelable) null);
        A092.putString("draft_id", (String) null);
        A03(A092);
        return A092;
    }

    public static final String A02(String str) {
        String A19 = AnonymousClass7TE.A19(DbV.A18(str, "_"), 0);
        if (00l.A0d(A19, ".", false)) {
            return DbU.A0t(DbV.A18(A19, "\\."), 1);
        }
        return A19;
    }

    public static void A03(BaseBundle baseBundle) {
        baseBundle.putString(AnonymousClass000.A00(582), (String) null);
        baseBundle.putInt("elapsed_duration_in_days", 0);
        baseBundle.putString("page_id", (String) null);
        baseBundle.putString(AnonymousClass000.A00(1753), (String) null);
        baseBundle.putString(AnonymousClass000.A00(1754), (String) null);
        baseBundle.putInt(AnonymousClass000.A00(761), 0);
        baseBundle.putInt("spent_budget_offset_amount", 0);
        baseBundle.putInt("total_budget_offset_amount", 0);
        baseBundle.putInt("total_duration_in_days", 0);
    }

    public static final Bundle A00(W29 w29) {
        Bundle bundle = new Bundle();
        DbU.A1D(bundle, w29.A03);
        bundle.putString("media_id", w29.A0A);
        bundle.putSerializable(AnonymousClass000.A00(751), w29.A02);
        bundle.putSerializable("boost_flow_type", w29.A01);
        bundle.putString("audience_id", w29.A06);
        bundle.putParcelable("media_url", w29.A04);
        bundle.putString("ad_account_id", w29.A05);
        DbS.A1B(bundle, w29.A09);
        bundle.putBoolean("is_sub_flow", false);
        bundle.putString("coupon_offer_id", w29.A07);
        bundle.putString("objective", (String) null);
        bundle.putString("destination_cta", (String) null);
        bundle.putString("political_ad_byline_text", (String) null);
        bundle.putBoolean("has_product_tag", w29.A0B);
        bundle.putStringArray("sponsor_ids", (String[]) null);
        bundle.putSerializable("destination", (Serializable) null);
        bundle.putSerializable("personalized_destination", w29.A00);
        bundle.putInt("default_budget", 0);
        bundle.putInt("default_duration", 0);
        bundle.putBoolean("is_from_ctwa_upsell", w29.A0C);
        bundle.putBoolean("is_ctwa_coupon_aymt", false);
        bundle.putBoolean("is_from_lead_ads_upsell", false);
        bundle.putString("aymt_channel", (String) null);
        bundle.putString("reference_code_for_aymt_dropoff", (String) null);
        bundle.putSerializable("media_product_type", (Serializable) null);
        bundle.putBoolean(AnonymousClass000.A00(81), w29.A0D);
        bundle.putString("selected_audio_spec", (String) null);
        bundle.putParcelable("selected_audio_overlay_track", (Parcelable) null);
        bundle.putString("draft_id", w29.A08);
        A03(bundle);
        return bundle;
    }

    public W29(Context context, 1Yg r3, UserSession userSession, String str, String str2) {
        this.A0A = A02(str);
        this.A09 = str2;
        this.A03 = userSession;
        this.A0E = context;
        this.A0F = r3;
    }
}
