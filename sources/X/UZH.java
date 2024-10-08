package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import com.instagram.android.R;
import com.instagram.leadgen.core.api.LeadGenInfoFieldTypes;

public final class UZH extends AnonymousClass4DH implements AnonymousClass4DS {
    public static final String __redex_internal_original_name = "PromoteLeadGenCustomerInfoFragment";
    public final AnonymousClass0eM A00;

    public final void configureActionBar(2da r2) {
        0qQ.A0B(r2, 0);
        C13992Tns.A0r(r2, 2131964763);
    }

    public final String getModuleName() {
        return "promote_lead_gen_customer_info";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        AnonymousClass0eM r4 = this.A00;
        C16046UnZ unZ = (C16046UnZ) r4.getValue();
        WYX.A02(unZ.A00, unZ.A04, "lead_gen_customer_info", "customer_info_screen_impression");
        ((C14786U8w) r4.getValue()).A05();
        CompoundButton compoundButton = (CompoundButton) AnonymousClass7TF.A0F(view, R.id.phone_checkbox);
        LeadGenInfoFieldTypes leadGenInfoFieldTypes = LeadGenInfoFieldTypes.PHONE;
        compoundButton.setChecked(((C14786U8w) r4.getValue()).A01.A01);
        C18922WCz.A00(compoundButton, this, leadGenInfoFieldTypes, 1);
        CompoundButton compoundButton2 = (CompoundButton) AnonymousClass7TF.A0F(view, R.id.email_checkbox);
        LeadGenInfoFieldTypes leadGenInfoFieldTypes2 = LeadGenInfoFieldTypes.A0A;
        compoundButton2.setChecked(((C14786U8w) r4.getValue()).A01.A00);
        C18922WCz.A00(compoundButton2, this, leadGenInfoFieldTypes2, 1);
        CompoundButton compoundButton3 = (CompoundButton) AnonymousClass7TF.A0F(view, R.id.zip_checkbox);
        LeadGenInfoFieldTypes leadGenInfoFieldTypes3 = LeadGenInfoFieldTypes.ZIP;
        compoundButton3.setChecked(((C14786U8w) r4.getValue()).A01.A02);
        C18922WCz.A00(compoundButton3, this, leadGenInfoFieldTypes3, 1);
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return ((C14786U8w) this.A00.getValue()).A02();
    }

    public UZH() {
        C20690WxM wxM = new C20690WxM(this, 11);
        AnonymousClass0eM A002 = C20690WxM.A00(new C20690WxM(this, 8), 0eO.A02, 9);
        this.A00 = new C227862kA(new C20690WxM(A002, 10), wxM, new C41566AwY(31, (Object) null, A002), new 0Yh(C16046UnZ.class));
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(-1323291882);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.lead_gen_create_form_checkbox_group, viewGroup, false);
        AnonymousClass0fD.A09(1219492229, A02);
        return inflate;
    }

    public final void onPause() {
        int A02 = AnonymousClass0fD.A02(-1508134917);
        UZH.super.onPause();
        ((C14786U8w) this.A00.getValue()).A09(requireContext());
        AnonymousClass0fD.A09(1843346323, A02);
    }
}
