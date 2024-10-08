package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.facebook.browser.lite.extensions.igleadformextension.IGLeadFormExtensionModel;
import com.instagram.igds.components.button.IgdsButton;
import com.instagram.realtimeclient.RealtimeConstants;

public final class WYV implements C20955X6i {
    public final /* synthetic */ int A00;
    public final /* synthetic */ UHW A01;
    public final /* synthetic */ C340027ka A02;
    public final /* synthetic */ IgdsButton A03;
    public final /* synthetic */ WYW A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ String A09;
    public final /* synthetic */ String A0A;

    public WYV(UHW uhw, C340027ka r2, IgdsButton igdsButton, WYW wyw, String str, String str2, String str3, String str4, String str5, String str6, int i) {
        this.A04 = wyw;
        this.A01 = uhw;
        this.A09 = str;
        this.A06 = str2;
        this.A08 = str3;
        this.A0A = str4;
        this.A05 = str5;
        this.A00 = i;
        this.A07 = str6;
        this.A02 = r2;
        this.A03 = igdsButton;
    }

    public final void DoP(C18027Vk5 vk5, boolean z) {
        WYW.A00(this.A04, "lead_ads_iab_form_extension_banner", "iab_form_extension_lead_ads_content_fetch", RealtimeConstants.SEND_SUCCESS).Cgf();
        Bundle bundle = new Bundle();
        UHW uhw = this.A01;
        IGLeadFormExtensionModel iGLeadFormExtensionModel = uhw.A01;
        bundle.putString("mediaID", iGLeadFormExtensionModel.A0A);
        String str = iGLeadFormExtensionModel.A04;
        if (str == null) {
            str = "";
        }
        bundle.putString("advertiser_fbidv2", str);
        bundle.putString("formID", this.A09);
        bundle.putString("adID", this.A06);
        DbS.A1B(bundle, this.A08);
        bundle.putString("trackingToken", this.A0A);
        bundle.putString("dynamicItemID", iGLeadFormExtensionModel.A07);
        bundle.putBoolean("submitted", uhw.A00);
        DbU.A1D(bundle, uhw.A02);
        bundle.putString("ad_creation_source", this.A05);
        bundle.putInt("advertiserFollowerCount", this.A00);
        bundle.putString("cta_label", this.A07);
        C340027ka r2 = this.A02;
        0hq parentFragmentManager = r2.getParentFragmentManager();
        C15263UYd uYd = new C15263UYd();
        uYd.setArguments(bundle);
        uYd.A0B(parentFragmentManager, "ig_lead_form_extension_controller");
        FragmentActivity activity = r2.getActivity();
        if (activity != null) {
            parentFragmentManager.A0v(new WE4(0, (Object) this.A03, (Object) uhw), activity, "request_key");
        }
    }

    public final void onFailure() {
        WYW.A00(this.A04, "lead_ads_iab_form_extension_banner", "iab_form_extension_lead_ads_content_fetch", RealtimeConstants.SEND_FAIL).Cgf();
    }
}
