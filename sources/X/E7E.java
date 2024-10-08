package X;

import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.RadioGroup;
import com.instagram.actionbar.ActionButton;
import com.instagram.android.R;
import com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger;
import com.instagram.model.business.PublicPhoneContact;
import com.instagram.phonenumber.model.CountryCodeData;
import com.instagram.ui.widget.editphonenumber.EditPhoneNumberView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

public final class E7E extends C273374mT implements G86, AnonymousClass4DS, G6B {
    public static final String A09 = 002.A0R(E7E.class.getName(), ".EXTRA_PUBLIC_PHONE_CONTACT");
    public static final String __redex_internal_original_name = "BusinessPhoneNumberEditFragment";
    public RadioGroup A00;
    public ActionButton A01;
    public EditPhoneNumberView A02;
    public String A03;
    public String A04;
    public boolean A05 = false;
    public BusinessFlowAnalyticsLogger A06;
    public PublicPhoneContact A07;
    public final Handler A08 = AnonymousClass7TF.A0D();

    public final boolean DBR(int i) {
        return false;
    }

    public final void DWw() {
    }

    public final void Dws() {
    }

    public final String getModuleName() {
        return "business_edit_phone_number";
    }

    public static void A00(E7E e7e) {
        PublicPhoneContact publicPhoneContact = e7e.A07;
        boolean z = false;
        17k.A0F(AnonymousClass7TF.A1V(publicPhoneContact));
        if (!TextUtils.isEmpty(publicPhoneContact.A03) || !TextUtils.isEmpty(AnonymousClass7TF.A0f(e7e.A02.A01))) {
            z = !e7e.A02.getPhoneNumber().equals(e7e.A07.A03);
        }
        e7e.A05 = z;
    }

    public final void Cvy() {
        BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger = this.A06;
        if (businessFlowAnalyticsLogger != null) {
            businessFlowAnalyticsLogger.Ckp(new C22030Xtl("business_contact_info", "edit_profile", "area_code", (String) null, (String) null, Collections.singletonMap("area_code", this.A02.getCountryCode()), (Map) null, (Map) null));
        }
    }

    public final void DvR() {
        if (this.A01 != null) {
            A00(this);
            this.A01.setEnabled(this.A05);
        }
    }

    public final void ESy(CountryCodeData countryCodeData) {
        this.A02.setCountryCodeWithPlus(countryCodeData);
        BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger = this.A06;
        if (businessFlowAnalyticsLogger != null) {
            businessFlowAnalyticsLogger.ChY(new C22030Xtl("business_contact_info", "edit_profile", (String) null, (String) null, (String) null, (Map) null, Collections.singletonMap("area_code", this.A02.getCountryCode()), (Map) null));
        }
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.Jbl, java.lang.Object] */
    public final void configureActionBar(2da r4) {
        ? obj = new Object();
        C59922Jbl.A01(DbV.A05(this), obj, 2131969389);
        ActionButton A002 = C59904JbT.A00(FPB.A00(this, 28), r4, obj);
        this.A01 = A002;
        A002.setEnabled(this.A05);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        View view2 = view;
        super.onViewCreated(view2, bundle);
        EditPhoneNumberView editPhoneNumberView = (EditPhoneNumberView) view2.requireViewById(R.id.phone_number_edit_view);
        this.A02 = editPhoneNumberView;
        EditPhoneNumberView.A01(this, (0hq) null, getSession(), (EVZ) null, (G6B) null, this, editPhoneNumberView);
        EditPhoneNumberView editPhoneNumberView2 = this.A02;
        PublicPhoneContact publicPhoneContact = this.A07;
        publicPhoneContact.getClass();
        editPhoneNumberView2.setupEditPhoneNumberView(publicPhoneContact.A01, this.A07.A02);
        String str = this.A07.A00;
        str.getClass();
        this.A03 = str;
        if ("UNKNOWN".equals(str)) {
            this.A03 = "TEXT";
        }
        this.A00 = (RadioGroup) view2.requireViewById(R.id.contact_method_group);
        DbU.A0G(view2, R.id.contact_method_header).getPaint().setFakeBoldText(true);
        this.A00.setOnCheckedChangeListener((RadioGroup.OnCheckedChangeListener) null);
        this.A00.removeAllViews();
        this.A04 = new String(this.A03);
        ArrayList A1C = AnonymousClass7TE.A1C();
        DbV.A1V("CALL", DbV.A05(this).getString(2131954428), A1C);
        DbV.A1V("TEXT", DbV.A05(this).getString(2131975081), A1C);
        RadioGroup.LayoutParams layoutParams = new RadioGroup.LayoutParams(-1, -2, 16.0f);
        int i = 0;
        while (i < A1C.size()) {
            CompoundButton compoundButton = (CompoundButton) DbV.A0E(this).inflate(R.layout.contact_method_radio_button_item, (ViewGroup) null);
            compoundButton.setText(((C70953OTa) A1C.get(i)).A03);
            compoundButton.setLayoutParams(layoutParams);
            int i2 = i + 1;
            compoundButton.setId(i2);
            this.A00.addView(compoundButton);
            DbV.A0E(this).inflate(R.layout.row_divider, this.A00);
            if (((C70953OTa) A1C.get(i)).A02.equals(this.A03)) {
                compoundButton.setChecked(true);
            }
            i = i2;
        }
        this.A00.setOnCheckedChangeListener(new FQU(this, 0));
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(796659274);
        E7E.super.onCreate(bundle);
        Dbc.A0p(this);
        this.A07 = (PublicPhoneContact) requireArguments().getParcelable(A09);
        this.A06 = C319596qs.A00(C319586qr.EDIT_PROFILE, this, getSession(), AnonymousClass7TF.A0b());
        AnonymousClass0fD.A09(2091854250, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1648518273);
        View A0C = DbT.A0C(layoutInflater, viewGroup, R.layout.business_phone_number_layout);
        AnonymousClass0fD.A09(1987211193, A022);
        return A0C;
    }
}
