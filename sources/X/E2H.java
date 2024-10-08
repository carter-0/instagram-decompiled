package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.ui.widget.progressbutton.ProgressButton;

public final class E2H extends AnonymousClass4DH implements AnonymousClass4DS {
    public static final String __redex_internal_original_name = "AutoConfConfirmationFragment";
    public IgTextView A00;
    public ProgressButton A01;
    public final AnonymousClass0eM A02 = C227642jf.A02(this);

    public final void configureActionBar(2da r2) {
        0qQ.A0B(r2, 0);
        DbW.A1B(r2, 2131952023);
    }

    public final String getModuleName() {
        return "auto_conf_confirmation";
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A02);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String str;
        int A022 = AnonymousClass0fD.A02(1629757402);
        0qQ.A0B(layoutInflater, 0);
        C49944FFx.A01(DbT.A0X(this.A02), "auto_conf_confirmation", "client_auth_show_confirmation", "optimistic_authentication_flow", "ar_code_sms");
        View A0A = DbU.A0A(layoutInflater, viewGroup, R.layout.auto_conf_confirmation_fragment, false);
        ProgressButton progressButton = (ProgressButton) A0A.requireViewById(R.id.auto_conf_continue_button);
        this.A01 = progressButton;
        if (progressButton == null) {
            str = "continueButton";
        } else {
            FP0.A00(progressButton, 31, this);
            IgTextView A0a = DbT.A0a(A0A, R.id.auto_conf_helper_button);
            Dbb.A0l(A0a.getResources(), A0a, 2131953326);
            this.A00 = A0a;
            Context requireContext = requireContext();
            IgTextView igTextView = this.A00;
            str = "helperButton";
            if (igTextView != null) {
                FCK.A00(igTextView, requireContext);
                IgTextView igTextView2 = this.A00;
                if (igTextView2 != null) {
                    FP0.A00(igTextView2, 32, this);
                    AnonymousClass0fD.A09(-1358941431, A022);
                    return A0A;
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(-915909720);
        super.onResume();
        AnonymousClass0fD.A09(-1491109159, A022);
    }
}
