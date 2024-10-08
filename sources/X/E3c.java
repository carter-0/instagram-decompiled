package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import com.instagram.android.R;
import com.instagram.registration.model.RegFlowExtras;
import com.instagram.ui.widget.progressbutton.ProgressButton;

public final class E3c extends AnonymousClass4DH implements AnonymousClass4DR {
    public static final String __redex_internal_original_name = "AgreeToTermsOfUseFragment";
    public AnonymousClass0aP A00;
    public C47575E8n A01;
    public RegFlowExtras A02;
    public ProgressButton A03;

    public final String getModuleName() {
        return "agree_to_terms";
    }

    public final AnonymousClass0wW getSession() {
        return this.A00;
    }

    public final boolean onBackPressed() {
        C49920FEv.A00.A01(this.A00, this.A02.A01(), "agree_to_terms");
        return false;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1998780351);
        E3c.super.onCreate(bundle);
        this.A00 = Dba.A0D(this);
        this.A02 = (RegFlowExtras) Dba.A03(this);
        AnonymousClass0fD.A09(-1847442678, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(795546946);
        View A0C = DbT.A0C(layoutInflater, viewGroup, R.layout.reg_container);
        layoutInflater.inflate(R.layout.agree_to_terms_of_use_fragment, Dba.A04(A0C), true);
        this.A03 = Dba.A0O(A0C);
        this.A01 = new C47575E8n(getContext(), this, this);
        ((AbsListView) A0C.requireViewById(16908298)).setAdapter(this.A01);
        this.A01.A0C();
        this.A03.setEnabled(false);
        FP0.A00(this.A03, 30, this);
        AnonymousClass0fD.A09(1181816833, A022);
        return A0C;
    }
}
