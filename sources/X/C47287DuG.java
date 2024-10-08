package X;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.instagram.registration.model.RegFlowExtras;
import com.instagram.ui.widget.progressbutton.ProgressButton;

/* renamed from: X.DuG  reason: case insensitive filesystem */
public final class C47287DuG extends E58 {
    public static final String __redex_internal_original_name = "CreatePasswordFragment";
    public AnonymousClass0aP A00;
    public RegFlowExtras A01;

    public final String getModuleName() {
        return "sac_create_password";
    }

    public final void DUM() {
        C309516Yo A0M;
        Bundle A0a;
        Fragment r2;
        if (this.A05) {
            ProgressButton progressButton = this.A02;
            progressButton.getClass();
            progressButton.setShowProgressBar(true);
            RegFlowExtras regFlowExtras = this.A01;
            regFlowExtras.A0P = AnonymousClass7TF.A0f(this.A03);
            regFlowExtras.A0w = this.A04;
            if (getActivity() != null) {
                RegFlowExtras regFlowExtras2 = this.A01;
                if (!regFlowExtras2.A0g || regFlowExtras2.A03 != null) {
                    boolean z = regFlowExtras2.A0t;
                    A0M = DbS.A0M(requireActivity(), this.A00);
                    if (z) {
                        DbW.A0X();
                        RegFlowExtras regFlowExtras3 = this.A01;
                        Bundle A0a2 = AnonymousClass7TE.A0a();
                        A0a2.putParcelable("RegFlowExtras.EXTRA_KEY", regFlowExtras3);
                        DbS.A1A(A0a2, "IgSessionManager.LOGGED_OUT_TOKEN");
                        r2 = new E3Y();
                        r2.setArguments(A0a2);
                        A0M.A0B((Bundle) null, r2);
                        A0M.A04();
                    }
                    RegFlowExtras regFlowExtras4 = this.A01;
                    A0a = AnonymousClass7TE.A0a();
                    A0a.putParcelable("RegFlowExtras.EXTRA_KEY", regFlowExtras4);
                    r2 = new AnonymousClass4DH();
                } else {
                    A0M = DbY.A0J(requireActivity(), this.A00);
                    RegFlowExtras regFlowExtras5 = this.A01;
                    A0a = AnonymousClass7TE.A0a();
                    A0a.putParcelable("RegFlowExtras.EXTRA_KEY", regFlowExtras5);
                    DbU.A1C(A0a);
                    r2 = new C47937ENo();
                }
                r2.setArguments(A0a);
                A0M.A0B((Bundle) null, r2);
                A0M.A04();
            }
        }
    }

    public final AnonymousClass0wW getSession() {
        return this.A00;
    }

    public final boolean onBackPressed() {
        C49920FEv.A00.A01(this.A00, EXD.SAC, C48156EZy.A0D.A00.A01);
        return false;
    }

    public final void onCreate(Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(1427979047);
        C47287DuG.super.onCreate(bundle);
        this.A00 = Dba.A0D(this);
        Parcelable A03 = Dba.A03(this);
        A03.getClass();
        this.A01 = (RegFlowExtras) A03;
        AnonymousClass0fD.A09(-982883087, A02);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C49938FFr.A00.A02(this.A00, EXD.SAC, C48156EZy.A0D.A00.A01);
    }
}
