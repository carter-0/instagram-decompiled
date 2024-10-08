package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import com.instagram.android.R;
import com.instagram.ui.widget.editphonenumber.CountryCodeTextView;
import com.instagram.ui.widget.editphonenumber.EditPhoneNumberView;
import com.instagram.ui.widget.progressbutton.ProgressButton;

/* renamed from: X.E3u  reason: case insensitive filesystem */
public final class C47470E3u extends AnonymousClass4DH implements AnonymousClass4DR, AnonymousClass4DS {
    public static final String __redex_internal_original_name = "TwoFacCheckWhatsAppPhoneNumberFragment";
    public ProgressButton A00;
    public String A01;
    public final 1P0 A02 = new C47699EDi(this, 21);
    public final AnonymousClass0eM A03 = C227642jf.A02(this);

    public final void configureActionBar(2da r2) {
        0qQ.A0B(r2, 0);
        DbW.A1B(r2, 2131975681);
    }

    public final String getModuleName() {
        return Dbq.A02();
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A03);
    }

    public final boolean onBackPressed() {
        Dbc.A0S(FFR.A00().A02(AnonymousClass05K.A0j, true, !requireArguments().getBoolean("has_two_fac_already_on")), requireActivity(), this.A03);
        return true;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String str;
        int A022 = AnonymousClass0fD.A02(-1379017564);
        0qQ.A0B(layoutInflater, 0);
        View A0A = DbU.A0A(layoutInflater, viewGroup, R.layout.two_fac_check_whatsapp_phone_number_fragment, false);
        EditPhoneNumberView editPhoneNumberView = (EditPhoneNumberView) AnonymousClass7TF.A0F(A0A, R.id.edit_phone_number_view);
        Bundle requireArguments = requireArguments();
        String string = requireArguments.getString(Dbq.A00(), "");
        this.A01 = string;
        if (string == null) {
            str = "currPhoneNumber";
        } else {
            if (string.length() > 0) {
                String string2 = requireArguments.getString("country_code", "");
                String string3 = requireArguments.getString("national_number", "");
                Context requireContext = requireContext();
                0qQ.A0A(string2);
                editPhoneNumberView.setupEditPhoneNumberView(C3270479e.A01(requireContext, string2), string3);
            }
            FP3 fp3 = new FP3((Object) this, 33);
            int A05 = Dbb.A05(this);
            CountryCodeTextView countryCodeTextView = editPhoneNumberView.A04;
            AnonymousClass0fU.A00(fp3, countryCodeTextView);
            countryCodeTextView.setTextColor(A05);
            EditText editText = editPhoneNumberView.A01;
            AnonymousClass0fU.A00(fp3, editText);
            editText.setFocusable(false);
            editText.setTextColor(A05);
            ProgressButton A0O = Dba.A0O(A0A);
            this.A00 = A0O;
            if (A0O == null) {
                str = "nextButton";
            } else {
                FP3.A00(A0O, 32, this);
                FGN.A02(new ESx(this, Dbb.A06(this), 25), new ESx(this, Dbb.A06(this), 26), AnonymousClass7TG.A0R(A0A, R.id.learn_more_and_policy), DbU.A0m(this, 2131975685), DbU.A0m(this, 2131975686));
                AnonymousClass0fD.A09(-637058865, A022);
                return A0A;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }
}
