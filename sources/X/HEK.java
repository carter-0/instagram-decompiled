package X;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.instagram.schools.management.data.StartValidationMutationResponseImpl;

public final class HEK extends C54153H0x implements AnonymousClass4DR {
    public static final String __redex_internal_original_name = "SchoolOnboardingStudentEmailFragment";
    public boolean A00;
    public final AnonymousClass0eM A01 = C227642jf.A02(this);

    public final String getModuleName() {
        return "student_email_fragment";
    }

    public static final void A02(HEK hek) {
        HEK hek2 = hek;
        C53035GhR A05 = hek2.A05();
        C58681Ivq ivq = new C58681Ivq(hek2, 27);
        C58681Ivq ivq2 = new C58681Ivq(hek2, 28);
        C74180PqM pqM = new C74180PqM(hek2, 40);
        if (A05.A02() == HM6.VALID) {
            ivq.invoke();
            C56031Hrd hrd = A05.A00;
            C58691Iw0 iw0 = new C58691Iw0(30, ivq2, A05);
            C74186PqS pqS = new C74186PqS(30, (Object) A05, (Object) pqM);
            String str = C53035GhR.A01(A05).A0D;
            if (str == null) {
                str = "";
            }
            String A12 = DbV.A12(str);
            0qQ.A0B(A12, 2);
            0Df A03 = C41845B3m.A03(GraphQlCallInput.A02, A12, C66579MXk.A00(169));
            C53393GnQ.A03(A03, hrd.A01);
            2IS A04 = C41845B3m.A04();
            C56925IHu.A00(new DFX(iw0, pqS, hrd, A12, 2), new PandoGraphQLRequest(C41847B3o.A04(A03, A04, "input"), "StartValidationMutation", A04.getParamsCopy(), C41845B3m.A04().getParamsCopy(), StartValidationMutationResponseImpl.class, true, (PandoRealtimeInfoJNI) null, 0, (String) null, "xdt_start_validation", AnonymousClass7TE.A1C()), 1vm.A01(hrd.A00), pqS, 10);
        }
    }

    public final boolean onBackPressed() {
        if (!this.A00) {
            return super.onBackPressed();
        }
        Intent intent = new Intent();
        intent.putExtra("ARGUMENT_SCHOOL_REMOVED", true);
        DbX.A17(intent, this);
        DbT.A1K(this);
        super.onBackPressed();
        return true;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return A03();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(-1545806787);
        ComposeView A0H = DbV.A0H(this, new C59343JFv(this, 43), -1880603423);
        AnonymousClass0fD.A09(-735938630, A02);
        return A0H;
    }
}
