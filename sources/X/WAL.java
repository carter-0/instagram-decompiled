package X;

import android.view.View;
import com.facebook.browser.lite.extensions.igleadformextension.IGLeadFormExtensionModel;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.button.IgdsButton;
import java.lang.ref.WeakReference;

public final class WAL implements View.OnClickListener {
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

    public WAL(UHW uhw, C340027ka r2, IgdsButton igdsButton, WYW wyw, String str, String str2, String str3, String str4, String str5, String str6, int i) {
        this.A03 = igdsButton;
        this.A04 = wyw;
        this.A01 = uhw;
        this.A06 = str;
        this.A09 = str2;
        this.A08 = str3;
        this.A0A = str4;
        this.A05 = str5;
        this.A00 = i;
        this.A07 = str6;
        this.A02 = r2;
    }

    public final void onClick(View view) {
        int A052 = AnonymousClass0fD.A05(-1795480442);
        IgdsButton igdsButton = this.A03;
        igdsButton.setClickable(false);
        WYW wyw = this.A04;
        WYW.A00(wyw, "lead_ads_iab_form_extension_banner", "iab_form_extension_cta_button_click", "click").Cgf();
        UHW uhw = this.A01;
        IGLeadFormExtensionModel iGLeadFormExtensionModel = uhw.A01;
        String str = iGLeadFormExtensionModel.A09;
        if (str == null) {
            str = "";
        }
        UserSession userSession = uhw.A02;
        0qQ.A0B(str, 1);
        String str2 = iGLeadFormExtensionModel.A0B;
        String str3 = this.A06;
        String str4 = this.A09;
        String str5 = this.A08;
        String str6 = this.A0A;
        String str7 = this.A05;
        int i = this.A00;
        String str8 = this.A07;
        String str9 = str7;
        String str10 = str5;
        String str11 = str3;
        String str12 = str4;
        WYW wyw2 = wyw;
        IgdsButton igdsButton2 = igdsButton;
        C340027ka r14 = this.A02;
        UHW uhw2 = uhw;
        String str13 = str2;
        String str14 = str3;
        UserSession userSession2 = userSession;
        String str15 = str;
        C18709Vye.A01(new C17587Vaf(userSession2, str15, str13, str14, 0sr.A1L(new WeakReference[]{new WeakReference(new WYV(uhw2, r14, igdsButton2, wyw2, str12, str11, str10, str6, str9, str8, i))}), false));
        AnonymousClass0fD.A0C(655001199, A052);
    }
}
