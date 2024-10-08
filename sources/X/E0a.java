package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.instagram.android.R;

public final class E0a extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "TwoFacLoginHelpSheetFragment";
    public final boolean A00 = 1AW.A06(0Tu.A05, 18306387566142303L);
    public final AnonymousClass0eM A01 = C227642jf.A01(this);

    public final String getModuleName() {
        return Dbq.A02();
    }

    public final AnonymousClass0wW getSession() {
        return DbS.A0T(this.A01);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        EW8 ew8;
        int A02 = AnonymousClass0fD.A02(509417227);
        LayoutInflater layoutInflater2 = layoutInflater;
        0qQ.A0B(layoutInflater2, 0);
        View A0A = DbU.A0A(layoutInflater2, viewGroup, R.layout.two_fac_login_help_sheet_fragment, false);
        Button button = (Button) AnonymousClass7TF.A0F(A0A, R.id.use_text_message_button);
        Button button2 = (Button) AnonymousClass7TF.A0F(A0A, R.id.use_recovery_code_button);
        Button button3 = (Button) AnonymousClass7TF.A0F(A0A, R.id.use_whatsapp_button);
        Button button4 = (Button) AnonymousClass7TF.A0F(A0A, R.id.use_authenticator_app_button);
        Button button5 = (Button) AnonymousClass7TF.A0F(A0A, R.id.learn_more_button);
        Button button6 = (Button) AnonymousClass7TF.A0F(A0A, R.id.request_support_button);
        if (this.A00) {
            button6.setText(2131975706);
            button5.setVisibility(8);
        }
        View A0G = AnonymousClass7TF.A0G(A0A, R.id.cancel_button);
        int i = 0;
        button.setVisibility(DbW.A01(requireArguments().getBoolean("argument_sms_two_factor_on") ? 1 : 0));
        button3.setVisibility(DbW.A01(requireArguments().getBoolean("argument_whatsapp_two_factor_on") ? 1 : 0));
        if (!requireArguments().getBoolean("argument_totp_two_factor_on")) {
            i = 8;
        }
        button4.setVisibility(i);
        int i2 = requireArguments().getInt("arg_two_fac_clear_method");
        EW8[] values = EW8.values();
        int length = values.length;
        int i3 = 0;
        while (true) {
            if (i3 >= length) {
                ew8 = EW8.UNKNOWN;
                break;
            }
            ew8 = values[i3];
            if (ew8.A00 == i2) {
                break;
            }
            i3++;
        }
        int ordinal = ew8.ordinal();
        if (ordinal == 0) {
            button.setVisibility(8);
        } else if (ordinal == 5) {
            button3.setVisibility(8);
        } else if (ordinal == 2) {
            button4.setVisibility(8);
        } else if (ordinal != 1) {
            0wb.A03(Dbq.A02(), "no clear method");
        } else {
            button2.setVisibility(8);
        }
        if (requireArguments().getBoolean("argument_sms_not_allowed")) {
            DbT.A17(requireContext(), button, 2Yu.A08(getContext()));
            DbT.A17(requireContext(), button3, 2Yu.A08(getContext()));
        }
        FPF.A00(button, 53, AnonymousClass05K.A00, this);
        FPF.A00(button3, 53, AnonymousClass05K.A0u, this);
        FPF.A00(button2, 53, AnonymousClass05K.A0C, this);
        FPF.A00(button4, 53, AnonymousClass05K.A0N, this);
        FPF.A00(button6, 53, AnonymousClass05K.A0Y, this);
        FPF.A00(button5, 53, AnonymousClass05K.A0j, this);
        FP3.A00(A0G, 47, this);
        AnonymousClass0fD.A09(-325282201, A02);
        return A0A;
    }
}
