package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import com.instagram.schools.management.data.CheckOTPCodeResponseImpl;

public final class HEI extends C54153H0x {
    public static final String __redex_internal_original_name = "SchoolOnboardingConfirmSchoolFragment";
    public final AnonymousClass0eM A00 = C227642jf.A02(this);

    public final String getModuleName() {
        return "confirm_school_fragment";
    }

    public static final void A02(HEI hei) {
        HEI hei2 = hei;
        G9w.A1Y(hei2.A00);
        C53035GhR A05 = hei2.A05();
        C58681Ivq ivq = new C58681Ivq(hei2, 13);
        C53393GnQ A01 = C53035GhR.A01(A05);
        String str = A01.A09;
        String str2 = A01.A0A;
        if (str2 == null || str2.length() == 0) {
            A05.A00.A00(HM5.EMPTY);
            ivq.invoke();
        } else {
            if (str != null) {
                C56031Hrd hrd = A05.A00;
                0Df A03 = C41845B3m.A03(GraphQlCallInput.A02, str, "affiliation_id");
                C53393GnQ.A03(A03, hrd.A01);
                0Df.A00(A03, str2, IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_CODE);
                2IS A04 = C41845B3m.A04();
                PandoGraphQLRequest pandoGraphQLRequest = new PandoGraphQLRequest(C41847B3o.A04(A03, A04, "input"), "CheckOTPCode", A04.getParamsCopy(), C41845B3m.A04().getParamsCopy(), CheckOTPCodeResponseImpl.class, true, (PandoRealtimeInfoJNI) null, 0, (String) null, "xdt_check_otp_code", AnonymousClass7TE.A1C());
                1vm.A01(hrd.A00).ATL(new C71556Omr(8, hrd, ivq), new DFQ(8, hrd, ivq), pandoGraphQLRequest);
            }
            ivq.invoke();
        }
        hei2.A07();
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return A03();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(1640901064);
        ComposeView A0H = DbV.A0H(this, new C59343JFv(this, 39), -730388205);
        AnonymousClass0fD.A09(-934833017, A02);
        return A0H;
    }
}
