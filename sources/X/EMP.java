package X;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.facebook.fbreactmodules.datepicker.DatePickerDialogModule;
import com.instagram.android.R;

public final class EMP extends C47500E5f {
    public static final String __redex_internal_original_name = "RecoveryEmailVerifyFragment";
    public String A00;
    public boolean A01;
    public Dialog A02;
    public C49922FEx A03;

    public final EXD B6Y() {
        return null;
    }

    public final C46634DiE BzS() {
        return C46634DiE.A1I;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(186371889);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        17k.A07(bundle2, "Arguments in RecoveryEmailVerifyFragment cannot be null.");
        this.A02 = 09i.A0A.A02(bundle2);
        this.A00 = DbU.A0l(bundle2, "lookup_user_input");
        this.A06 = bundle2.getString("lookup_email");
        this.A01 = DbT.A1X(bundle2, "arg_is_multiple_account_recovery");
        C49922FEx A002 = C49922FEx.A00(bundle2);
        this.A03 = A002;
        AnonymousClass0wW r2 = this.A02;
        AnonymousClass7TG.A1N(r2, "recovery_email_code_confirmation");
        C49938FFr.A00(r2, A002, (EXD) null, (Integer) null, "recovery_email_code_confirmation", (String) null);
        AnonymousClass0fD.A09(-226510578, A022);
    }

    public final void onStop() {
        int A022 = AnonymousClass0fD.A02(389204690);
        EMP.super.onStop();
        Dialog dialog = this.A02;
        if (dialog != null && dialog.isShowing()) {
            dialog.dismiss();
        }
        AnonymousClass0fD.A09(1519173988, A022);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        FragmentActivity activity = getActivity();
        if (activity != null && this.A01 && this.A02 == null) {
            C358248ab A0X = DbS.A0X(activity);
            A0X.A09(2131965624);
            A0X.A0q(DbV.A0z(this, this.A06, 2131965623));
            A0X.A07(R.drawable.confirmation_icon);
            A0X.A06();
            Dialog A022 = A0X.A02();
            this.A02 = A022;
            AnonymousClass0fN.A00(A022);
            0xI A05 = 1Q0.A1E.A02(this.A02).A05((EXD) null, C46634DiE.A1I);
            this.A03.A00.putString(DbX.A0s(C48071EUp.A09), "email");
            this.A03.A03(A05);
            DbU.A1R(A05, this.A02);
        }
        02m.A0p.markerAnnotate(725096125, DatePickerDialogModule.ARG_MODE, "email");
        02m.A0p.markerEnd(725096125, 2);
    }
}
