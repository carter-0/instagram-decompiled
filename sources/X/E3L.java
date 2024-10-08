package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.phonenumber.model.CountryCodeData;
import com.instagram.ui.widget.editphonenumber.EditPhoneNumberView;
import com.instagram.ui.widget.progressbutton.ProgressButton;

public final class E3L extends AnonymousClass4DH implements AnonymousClass4DS, G6B {
    public static final String __redex_internal_original_name = "TwoFacEnterPhoneNumberFragment";
    public EditPhoneNumberView A00;
    public ProgressButton A01;
    public String A02;
    public boolean A03;
    public boolean A04;
    public final AnonymousClass0eM A05 = Dba.A0i(this, 47);
    public final AnonymousClass0eM A06 = Dba.A0i(this, 48);
    public final AnonymousClass0eM A07 = Dba.A0i(this, 49);
    public final AnonymousClass0eM A08 = C227642jf.A02(this);

    public final void ESy(CountryCodeData countryCodeData) {
        0qQ.A0B(countryCodeData, 0);
        EditPhoneNumberView editPhoneNumberView = this.A00;
        if (editPhoneNumberView == null) {
            0qQ.A0F("editPhoneNumberView");
            throw AnonymousClass00P.createAndThrow();
        } else {
            editPhoneNumberView.setCountryCodeWithCountryPrefix(countryCodeData);
        }
    }

    public final void configureActionBar(2da r3) {
        0qQ.A0B(r3, 0);
        int i = 2131975681;
        if (this.A03) {
            i = 2131975646;
        }
        DbW.A1B(r3, i);
    }

    public final String getModuleName() {
        return Dbq.A02();
    }

    public static final void A00(E3L e3l) {
        EditPhoneNumberView editPhoneNumberView = e3l.A00;
        if (editPhoneNumberView == null) {
            0qQ.A0F("editPhoneNumberView");
            throw AnonymousClass00P.createAndThrow();
        }
        String phoneNumber = editPhoneNumberView.getPhoneNumber();
        AnonymousClass0eM r3 = e3l.A08;
        0lg A0X = DbT.A0X(r3);
        0qQ.A0A(phoneNumber);
        0qQ.A0B(A0X, 0);
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(C49852F9r.A01, A0X), "instagram_two_fac_setup_action");
        DbS.A1J(A0e, "next");
        A0e.AAJ("view", "");
        Dbc.A0W(A0e);
        A0e.AAJ("phone_numer", phoneNumber);
        A0e.Cgf();
        int length = phoneNumber.length();
        Context requireContext = e3l.requireContext();
        if (length == 0) {
            DbZ.A0w(requireContext, e3l, 2131969398);
            return;
        }
        1OC A022 = FFP.A02(requireContext, AnonymousClass7TE.A0l(r3), phoneNumber);
        A022.A00 = (1P0) e3l.A07.getValue();
        e3l.schedule(A022);
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A08);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-2015511356);
        E3L.super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A02 = requireArguments.getString(Dbq.A00(), "");
        this.A03 = requireArguments.getBoolean(Dbq.A05(0, 33, 94));
        this.A04 = requireArguments.getBoolean("ARG_IS_ENABLING_WHATSAPP", false);
        FCE.A02(AnonymousClass7TE.A0l(this.A08), "add_phone_number");
        AnonymousClass0fD.A09(-82341167, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String str;
        int A022 = AnonymousClass0fD.A02(1572219643);
        LayoutInflater layoutInflater2 = layoutInflater;
        0qQ.A0B(layoutInflater2, 0);
        boolean z = false;
        View inflate = layoutInflater2.inflate(R.layout.two_fac_enter_phone_number_fragment, viewGroup, false);
        TextView A0R = AnonymousClass7TG.A0R(inflate, R.id.two_fac_add_phone_number_description);
        if (this.A03) {
            DbU.A1G(AnonymousClass7TG.A0R(inflate, R.id.two_fac_add_phone_number_title), this, 2131975647);
            DbU.A1G(A0R, this, 2131975645);
        } else if (this.A04) {
            Dbb.A0t(inflate, R.id.two_fac_add_phone_whatsapp_disclaimer, 0);
            A0R.setText(2131975797);
        }
        this.A00 = (EditPhoneNumberView) inflate.requireViewById(R.id.edit_phone_number_view);
        String str2 = this.A02;
        if (str2 == null) {
            str = "currPhoneNumber";
        } else {
            if (str2.length() > 0) {
                z = true;
            }
            str = "editPhoneNumberView";
            if (z) {
                Bundle requireArguments = requireArguments();
                EditPhoneNumberView editPhoneNumberView = this.A00;
                if (editPhoneNumberView != null) {
                    editPhoneNumberView.setupEditPhoneNumberView(C3270479e.A01(requireContext(), DbT.A0w(requireArguments, "country_code", "")), requireArguments.getString("national_number", ""));
                }
            }
            EditPhoneNumberView editPhoneNumberView2 = this.A00;
            if (editPhoneNumberView2 != null) {
                EditPhoneNumberView.A01(this, (0hq) null, AnonymousClass7TE.A0l(this.A08), EVZ.ARGUMENT_TWOFAC_FLOW, (G6B) null, (C50994Fmh) this.A06.getValue(), editPhoneNumberView2);
                EditPhoneNumberView editPhoneNumberView3 = this.A00;
                if (editPhoneNumberView3 != null) {
                    editPhoneNumberView3.requestFocus();
                    ProgressButton A0O = Dba.A0O(inflate);
                    this.A01 = A0O;
                    if (A0O == null) {
                        str = "nextButton";
                    } else {
                        AnonymousClass0fU.A00((View.OnClickListener) this.A05.getValue(), A0O);
                        FGN.A02(new ESx(this, Dbb.A06(this), 30), new ESx(this, Dbb.A06(this), 31), AnonymousClass7TG.A0R(inflate, R.id.learn_more_and_policy), DbU.A0m(this, 2131975685), DbU.A0m(this, 2131975686));
                        Dbb.A1N(this);
                        AnonymousClass0fD.A09(-1647906659, A022);
                        return inflate;
                    }
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void onPause() {
        int A022 = AnonymousClass0fD.A02(1380118780);
        E3L.super.onPause();
        Window A0G = DbV.A0G(this);
        if (A0G != null) {
            A0G.setSoftInputMode(0);
        }
        DbS.A1D(this);
        AnonymousClass0fD.A09(1968566447, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(-1867134172);
        super.onResume();
        EditPhoneNumberView editPhoneNumberView = this.A00;
        if (editPhoneNumberView == null) {
            0qQ.A0F("editPhoneNumberView");
            throw AnonymousClass00P.createAndThrow();
        }
        editPhoneNumberView.A01.postDelayed(editPhoneNumberView.A0A, 200);
        Window A0G = DbV.A0G(this);
        if (A0G != null) {
            A0G.setSoftInputMode(16);
        }
        AnonymousClass0fD.A09(-1965408002, A022);
    }
}
