package X;

import android.content.res.Resources;
import android.view.View;
import android.widget.TextView;
import com.facebook.browser.lite.extensions.igleadformextension.IGLeadFormExtensionModel;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.igds.components.button.IgdsButton;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;

public final class UHW extends C7577QKs implements AnonymousClass0iw {
    public static final String __redex_internal_original_name = "IGLeadFormExtensionController";
    public boolean A00;
    public final IGLeadFormExtensionModel A01;
    public final UserSession A02;

    public final void A03(View view, C340027ka r29) {
        IGLeadFormExtensionModel iGLeadFormExtensionModel = this.A01;
        String str = iGLeadFormExtensionModel.A03;
        String str2 = iGLeadFormExtensionModel.A0B;
        String str3 = iGLeadFormExtensionModel.A09;
        String str4 = iGLeadFormExtensionModel.A08;
        if (str4 == null) {
            str4 = 2EG.A46.toString();
        }
        String str5 = iGLeadFormExtensionModel.A02;
        if (str5 == null) {
            str5 = "UNKNOWN";
        }
        WYW wyw = new WYW(this, this.A02, str, str2, str3, str5, str4, iGLeadFormExtensionModel.A04, (String) null, false, false, false, true);
        boolean z = iGLeadFormExtensionModel.A0C;
        this.A00 = z;
        if (z) {
            this.A02 = true;
            A02();
            return;
        }
        WYW.A00(wyw, "lead_ads_iab_form_extension_banner", "iab_form_extension_banner_impression", "impression").Cgf();
        View view2 = view;
        GradientSpinnerAvatarView gradientSpinnerAvatarView = (GradientSpinnerAvatarView) view2.findViewById(R.id.profile_pic);
        ImageUrl imageUrl = iGLeadFormExtensionModel.A01;
        if (imageUrl != null) {
            gradientSpinnerAvatarView.A0F((AnonymousClass9IV) null, this, imageUrl);
            gradientSpinnerAvatarView.setGradientSpinnerVisible(false);
        }
        AnonymousClass7TE.A0d(view2, R.id.primary_text).setText(iGLeadFormExtensionModel.A05);
        TextView A0d = AnonymousClass7TE.A0d(view2, R.id.secondary_text);
        int i = iGLeadFormExtensionModel.A00;
        if (i == 0) {
            0qQ.A0A(A0d);
            A0d.setVisibility(8);
        } else {
            Integer valueOf = Integer.valueOf(i);
            Resources A0B = C66580MXl.A0B(view2);
            DbY.A0y(A0B, A0d, C253673rC.A03(A0B, valueOf), 2131964825);
        }
        IgdsButton igdsButton = (IgdsButton) view2.findViewById(R.id.action_button);
        String str6 = iGLeadFormExtensionModel.A06;
        igdsButton.setText(str6);
        AnonymousClass0fU.A00(new WAL(this, r29, igdsButton, wyw, str, str3, str4, str2, str5, str6, i), igdsButton);
    }

    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    public UHW(IGLeadFormExtensionModel iGLeadFormExtensionModel, UserSession userSession) {
        this.A02 = userSession;
        this.A01 = iGLeadFormExtensionModel;
    }

    public final int A00() {
        return R.layout.ig_lead_form_extension_view;
    }

    public final int A01() {
        return R.id.lead_form_extension_footer_stub;
    }
}
