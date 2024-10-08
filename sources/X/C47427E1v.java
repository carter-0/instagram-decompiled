package X;

import android.os.Bundle;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.ui.widget.progressbutton.ProgressButton;
import com.instagram.ui.widget.searchedittext.SearchEditText;

/* renamed from: X.E1v  reason: case insensitive filesystem */
public final class C47427E1v extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "TwoFacContactFormFragment";
    public CheckBox A00;
    public EditText A01;
    public RadioGroup A02;
    public RadioGroup A03;
    public AnonymousClass0aP A04;
    public ProgressButton A05;
    public SearchEditText A06;
    public SearchEditText A07;
    public final TextWatcher A08 = new FKk(this, 11);
    public final 1P0 A09 = new C47699EDi(this, 17);

    public final String getModuleName() {
        return "two_fac_contact_form";
    }

    public static String A00(C47427E1v e1v) {
        Integer num;
        int checkedRadioButtonId = e1v.A02.getCheckedRadioButtonId();
        if (checkedRadioButtonId == R.id.account_type_company) {
            num = AnonymousClass05K.A00;
        } else if (checkedRadioButtonId == R.id.account_type_personal_with_photo) {
            num = AnonymousClass05K.A01;
        } else if (checkedRadioButtonId != R.id.account_type_personal_without_photo) {
            return "";
        } else {
            num = AnonymousClass05K.A0C;
        }
        switch (num.intValue()) {
            case 0:
                return "COMPANY";
            case 1:
                return "PERSONAL_WITH_PHOTO";
            default:
                return "PERSONAL_WITHOUT_PHOTO";
        }
    }

    public final AnonymousClass0wW getSession() {
        return this.A04;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-658856937);
        C47427E1v.super.onCreate(bundle);
        AnonymousClass0aP A023 = 09i.A0A.A02(this.mArguments);
        this.A04 = A023;
        AnonymousClass7TG.A1N(A023, "request_support_impression");
        C49938FFr.A01(A023, "request_support_impression");
        AnonymousClass0fD.A09(708410926, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1060891684);
        View A0C = DbT.A0C(layoutInflater, viewGroup, R.layout.reg_container);
        layoutInflater.inflate(R.layout.two_fac_contact_form, Dba.A04(A0C), true);
        DbU.A0G(A0C, R.id.field_title).setText(2131975675);
        TextView A0G = DbU.A0G(A0C, R.id.field_detail);
        Bundle bundle2 = this.mArguments;
        0qQ.A0B(bundle2, 0);
        EVZ evz = EVZ.values()[bundle2.getInt("flow_key")];
        EVZ evz2 = EVZ.ARGUMENT_TWO_FAC_LOGIN_SUPPORT_FLOW;
        int i = 2131965606;
        if (evz == evz2) {
            i = 2131975674;
        }
        A0G.setText(i);
        SearchEditText searchEditText = (SearchEditText) A0C.requireViewById(R.id.signup_email_edittext);
        this.A07 = searchEditText;
        searchEditText.setHint(2131975671);
        C49948FGd.A04(this.A07);
        SearchEditText searchEditText2 = (SearchEditText) A0C.requireViewById(R.id.contact_email_edittext);
        this.A06 = searchEditText2;
        searchEditText2.setHint(2131975670);
        C49948FGd.A04(this.A06);
        SearchEditText searchEditText3 = this.A07;
        TextWatcher textWatcher = this.A08;
        searchEditText3.addTextChangedListener(textWatcher);
        this.A06.addTextChangedListener(textWatcher);
        EditText A0E = DbU.A0E(A0C, R.id.additional_details_edittext);
        this.A01 = A0E;
        A0E.setHint(2131975669);
        this.A01.setOnTouchListener(new C50113FPd(this, 1));
        ProgressButton A0O = Dba.A0O(A0C);
        this.A05 = A0O;
        A0O.setText(2131975675);
        this.A05.setEnabled(false);
        FP3.A00(this.A05, 16, this);
        this.A02 = (RadioGroup) A0C.findViewById(R.id.account_type_radiogroup);
        TextView A0G2 = DbU.A0G(A0C, R.id.log_in_button);
        Dbb.A0l(DbV.A05(this), A0G2, 2131975704);
        FP3.A00(A0G2, 17, this);
        FCK.A00(A0G2, requireContext());
        this.A03 = (RadioGroup) A0C.requireViewById(R.id.failed_reason_radiogroup);
        Bundle bundle3 = this.mArguments;
        0qQ.A0B(bundle3, 0);
        EVZ evz3 = EVZ.values()[bundle3.getInt("flow_key")];
        RadioGroup radioGroup = this.A03;
        int i2 = 0;
        if (evz3 == evz2) {
            i2 = 8;
        }
        radioGroup.setVisibility(i2);
        CheckBox checkBox = (CheckBox) A0C.requireViewById(R.id.same_email_chbox);
        this.A00 = checkBox;
        FQO.A00(checkBox, this, 16);
        AnonymousClass0fD.A09(-1554092179, A022);
        return A0C;
    }

    public final void onPause() {
        int A022 = AnonymousClass0fD.A02(245706080);
        C47427E1v.super.onPause();
        DbV.A0G(this).setSoftInputMode(0);
        AnonymousClass0fD.A09(383453669, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(820693324);
        super.onResume();
        Dbb.A10(this);
        AnonymousClass0fD.A09(1166372088, A022);
    }
}
