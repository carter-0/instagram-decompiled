package X;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.registration.model.RegFlowExtras;
import com.instagram.ui.widget.progressbutton.ProgressButton;

/* renamed from: X.DuH  reason: case insensitive filesystem */
public final class C47288DuH extends E58 implements G67 {
    public static final String __redex_internal_original_name = "PasswordTooEasyFragment";
    public AnonymousClass0aP A00;
    public RegFlowExtras A01;
    public final Handler A02 = new Handler();

    public final void DUM() {
        if (this.A05) {
            ProgressButton progressButton = this.A02;
            progressButton.getClass();
            progressButton.setShowProgressBar(true);
            this.A01.A0P = AnonymousClass7TF.A0f(this.A03);
            AnonymousClass0aP r4 = this.A00;
            RegFlowExtras regFlowExtras = this.A01;
            C50144FRb.A03(this.A02, this, this, r4, this, this, regFlowExtras, C50144FRb.A01(regFlowExtras), false);
        }
    }

    public final void Et4(String str, String str2) {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            C49028Eo4.A00(activity, this.A02, this, this.A00, this, this.A01, this.A00, C48156EZy.A0B.A00, str, str2, (String) null);
        }
    }

    public final String getModuleName() {
        return "password_too_easy";
    }

    public final AnonymousClass0wW getSession() {
        return this.A00;
    }

    public final boolean onBackPressed() {
        C49920FEv.A00.A01(this.A00, this.A01.A01(), C48156EZy.A0B.A00.A01);
        return false;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1001895725);
        C47288DuH.super.onCreate(bundle);
        this.A00 = Dba.A0D(this);
        this.A01 = (RegFlowExtras) Dba.A03(this);
        if (!Dba.A0Z(0Tu.A05).contains(__redex_internal_original_name)) {
            if (C49035EoF.A00().booleanValue()) {
                C49130Ept.A00().A00(requireContext(), this.A00, (B2F) null);
            }
            if (C49036EoG.A00().booleanValue()) {
                C49130Ept.A00().A01(requireContext(), this.A00, (B2F) null);
            }
        }
        AnonymousClass0fD.A09(1580057452, A022);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C49938FFr.A00.A02(this.A00, this.A01.A01(), C48156EZy.A0B.A00.A01);
    }
}
