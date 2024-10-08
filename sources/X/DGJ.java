package X;

import android.util.SparseArray;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.pando.PandoGraphQLRequest;
import com.instagram.fbpay.graphql.FBPayIGGraphQLQueryExecutor;
import java.lang.reflect.InvocationTargetException;

public final class DGJ implements C13737Tg9 {
    public final C2818759x EE9(SparseArray sparseArray, S4g s4g) {
        boolean A1U = AnonymousClass7TF.A1U(0, sparseArray, s4g);
        AnonymousClass2hV r4 = C10034RlW.A00;
        Object A15 = C41847B3o.A15(sparseArray, 12);
        try {
            C45944DFy dFy = (C45944DFy) C41847B3o.A17(C45474CxA.class, "create", 0);
            AnonymousClass0K0 r2 = GraphQlCallInput.A02;
            Object A152 = C41847B3o.A15(sparseArray, 22);
            0Df A02 = r2.A02();
            C41848B3p.A1M(A02, A152, "logging_id");
            0Df.A00(A02, A15, "email_id");
            0Df.A00(A02, "FBPAY_HUB", "payment_type");
            C41848B3p.A1L(A02, dFy.A00);
            dFy.A01 = A1U;
            return C8294Qna.A01(s4g, C41847B3o.A0t(), dFy.build(), new DGZ(14), r4);
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            throw C41845B3m.A0j(e);
        }
    }

    public final C2818759x EM7(SparseArray sparseArray, S4g s4g) {
        PandoGraphQLRequest pandoGraphQLRequest;
        FBPayIGGraphQLQueryExecutor fBPayIGGraphQLQueryExecutor;
        DGZ dgz;
        boolean A1U = AnonymousClass7TF.A1U(0, sparseArray, s4g);
        Object obj = sparseArray.get(12);
        AnonymousClass2hV r4 = C10034RlW.A00;
        boolean z = true;
        Object A15 = C41847B3o.A15(sparseArray, A1U ? 1 : 0);
        if (obj == null) {
            if (sparseArray.get(3) == null || !((Boolean) sparseArray.get(3)).booleanValue()) {
                z = false;
            }
            try {
                C45937DFr dFr = (C45937DFr) C41847B3o.A17(C45467Cx3.class, "create", 0);
                AnonymousClass0K0 r2 = GraphQlCallInput.A02;
                Object A152 = C41847B3o.A15(sparseArray, 22);
                0Df A02 = r2.A02();
                C41848B3p.A1M(A02, A152, "logging_id");
                0Df.A00(A02, Boolean.valueOf(z), "is_default");
                0Df.A00(A02, "FBPAY_HUB", "payment_type");
                0Df.A00(A02, A15, "user_input_email_address");
                C41848B3p.A1L(A02, dFr.A00);
                dFr.A01 = A1U;
                pandoGraphQLRequest = dFr.build();
                fBPayIGGraphQLQueryExecutor = C41847B3o.A0t();
                dgz = new DGZ(12);
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
                throw C41845B3m.A0j(e);
            }
        } else {
            Object A153 = C41847B3o.A15(sparseArray, 12);
            if (sparseArray.get(3) == null || !((Boolean) sparseArray.get(3)).booleanValue()) {
                z = false;
            }
            try {
                DG3 dg3 = (DG3) C41847B3o.A17(C45479CxF.class, "create", 0);
                AnonymousClass0K0 r22 = GraphQlCallInput.A02;
                Object A154 = C41847B3o.A15(sparseArray, 22);
                0Df A022 = r22.A02();
                C41848B3p.A1M(A022, A154, "logging_id");
                0Df.A00(A022, A153, "email_id");
                0Df.A00(A022, Boolean.valueOf(z), "is_default");
                0Df.A00(A022, "FBPAY_HUB", "payment_type");
                0Df.A00(A022, A15, "user_input_email_address");
                C41848B3p.A1L(A022, dg3.A00);
                dg3.A01 = A1U;
                pandoGraphQLRequest = dg3.build();
                fBPayIGGraphQLQueryExecutor = C41847B3o.A0t();
                dgz = new DGZ(13);
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e2) {
                throw C41845B3m.A0j(e2);
            }
        }
        return C8294Qna.A01(s4g, fBPayIGGraphQLQueryExecutor, pandoGraphQLRequest, dgz, r4);
    }
}
