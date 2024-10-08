package X;

import android.util.SparseArray;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.instagram.common.session.UserSession;

public final class DGK implements C13737Tg9 {
    public final 1vn A00;

    public final C2818759x EE9(SparseArray sparseArray, S4g s4g) {
        throw AnonymousClass7TE.A1B("removeMutation not supported for Full Name on Instagram");
    }

    public final C2818759x EM7(SparseArray sparseArray, S4g s4g) {
        S4g s4g2 = s4g;
        SparseArray sparseArray2 = sparseArray;
        boolean A1Z = AnonymousClass7TG.A1Z(sparseArray2, s4g2);
        0Df A03 = C41845B3m.A03(GraphQlCallInput.A02, "FBPAY_HUB", "payment_type");
        Object obj = sparseArray2.get(2);
        0qQ.A0C(obj, "null cannot be cast to non-null type kotlin.String");
        0Df.A00(A03, obj, "payer_name");
        2IS A04 = C41845B3m.A04();
        return C8294Qna.A00(s4g2, this.A00, new PandoGraphQLRequest(C41847B3o.A04(A03, A04, "input"), "IgPaymentsUpdatePaymentAccountNameMutation", A04.getParamsCopy(), C41845B3m.A04().getParamsCopy(), C43313BwD.class, A1Z, (PandoRealtimeInfoJNI) null, 8, "input", "payment_account_update_payer_name", AnonymousClass7TE.A1C()), C45187Crp.A00);
    }

    public DGK(UserSession userSession) {
        this.A00 = 1vm.A01(userSession);
    }
}
