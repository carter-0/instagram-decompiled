package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;

public final class E2D extends AnonymousClass4DH implements AnonymousClass4DS {
    public static final String __redex_internal_original_name = "BirthdayAdditionalInfoFragment";
    public AnonymousClass0aP A00;
    public EXD A01;

    public final AnonymousClass0wW getSession() {
        return this.A00;
    }

    public final void configureActionBar(2da r4) {
        r4.Eom(2131953793);
        Dbb.A0s(new FP0((Object) this, 37), DbX.A0M(), r4);
    }

    public final String getModuleName() {
        return getClass().getSimpleName();
    }

    public final void onCreate(Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(-1805053814);
        E2D.super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A00 = 09i.A0A.A02(requireArguments);
        this.A01 = EXD.valueOf(requireArguments.getString("RegistrationFlowExtra"));
        AnonymousClass0fD.A09(1212796558, A02);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(2072221652);
        C49938FFr.A00.A02(this.A00, this.A01, "birthday_additional_info");
        View A0C = DbT.A0C(layoutInflater, viewGroup, R.layout.reg_container);
        layoutInflater.inflate(R.layout.birthday_additional_info_fragment, Dba.A04(A0C), true);
        FP0.A00(A0C.requireViewById(R.id.field_detail_link), 36, this);
        AnonymousClass0fD.A09(-528352632, A02);
        return A0C;
    }
}
