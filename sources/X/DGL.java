package X;

import android.util.SparseArray;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.instagram.common.session.UserSession;
import java.lang.reflect.InvocationTargetException;

public final class DGL implements C13737Tg9 {
    public final UserSession A00;

    public final C2818759x EE9(SparseArray sparseArray, S4g s4g) {
        String str = this.A00.A06;
        Object obj = sparseArray.get(22);
        AnonymousClass2hV r4 = C10034RlW.A00;
        0Df A03 = C41845B3m.A03(GraphQlCallInput.A02, C41847B3o.A15(sparseArray, 12), "phone_id");
        C41848B3p.A1M(A03, "FBPAY_HUB", "payment_type");
        0Df.A00(A03, str, "actor_id");
        if (obj != null) {
            0Df.A00(A03, obj, "logging_id");
        }
        try {
            C45945DFz dFz = (C45945DFz) C41847B3o.A16(C45475CxB.class);
            C41848B3p.A1L(A03, dFz.A00);
            dFz.A01 = true;
            return C8294Qna.A01(s4g, C41847B3o.A0t(), dFz.build(), new DGZ(17), r4);
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            throw C41845B3m.A0j(e);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0027, code lost:
        if (((java.lang.Boolean) r9.get(3)).booleanValue() == false) goto L_0x0029;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C2818759x EM7(android.util.SparseArray r9, X.S4g r10) {
        /*
            r8 = this;
            r3 = 12
            java.lang.Object r1 = r9.get(r3)
            com.instagram.common.session.UserSession r0 = r8.A00
            java.lang.String r5 = r0.A06
            r0 = 22
            java.lang.Object r4 = r9.get(r0)
            X.2hV r2 = X.C10034RlW.A00
            if (r1 != 0) goto L_0x0079
            r1 = 3
            java.lang.Object r0 = r9.get(r1)
            r6 = 0
            if (r0 == 0) goto L_0x0029
            java.lang.Object r0 = r9.get(r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r7 = 1
            if (r0 != 0) goto L_0x002a
        L_0x0029:
            r7 = 0
        L_0x002a:
            java.lang.Object r3 = X.C41847B3o.A15(r9, r6)
            X.0K0 r1 = com.facebook.graphql.calls.GraphQlCallInput.A02
            r0 = 101(0x65, float:1.42E-43)
            java.lang.String r0 = X.Pxd.A00(r0)
            X.0Df r3 = X.C41845B3m.A03(r1, r3, r0)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r7)
            java.lang.String r0 = "is_default"
            X.0Df.A00(r3, r1, r0)
            java.lang.String r1 = "FBPAY_HUB"
            java.lang.String r0 = "payment_type"
            X.C41848B3p.A1M(r3, r1, r0)
            java.lang.String r0 = "actor_id"
            X.0Df.A00(r3, r5, r0)
            if (r4 == 0) goto L_0x0056
            java.lang.String r0 = "logging_id"
            X.0Df.A00(r3, r4, r0)
        L_0x0056:
            java.lang.Class<X.Cx4> r1 = X.C45468Cx4.class
            java.lang.String r0 = "create"
            java.lang.Object r1 = X.C41847B3o.A17(r1, r0, r6)     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0073 }
            X.DFs r1 = (X.C45938DFs) r1     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0073 }
            X.2IS r0 = r1.A00
            X.C41848B3p.A1L(r3, r0)
            r0 = 1
            r1.A01 = r0
            com.facebook.pando.PandoGraphQLRequest r4 = r1.build()
            com.instagram.fbpay.graphql.FBPayIGGraphQLQueryExecutor r3 = X.C41847B3o.A0t()
            r1 = 15
            goto L_0x00dd
        L_0x0073:
            r0 = move-exception
            java.lang.RuntimeException r0 = X.C41845B3m.A0j(r0)
            throw r0
        L_0x0079:
            java.lang.Object r3 = X.C41847B3o.A15(r9, r3)
            r7 = 0
            java.lang.Object r6 = X.C41847B3o.A15(r9, r7)
            r1 = 3
            java.lang.Object r0 = r9.get(r1)
            if (r0 == 0) goto L_0x0096
            java.lang.Object r0 = r9.get(r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0096
            r7 = 1
        L_0x0096:
            X.0K0 r1 = com.facebook.graphql.calls.GraphQlCallInput.A02
            java.lang.String r0 = "phone_id"
            X.0Df r3 = X.C41845B3m.A03(r1, r3, r0)
            r0 = 101(0x65, float:1.42E-43)
            java.lang.String r0 = X.Pxd.A00(r0)
            X.0Df.A00(r3, r6, r0)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r7)
            java.lang.String r0 = "is_default"
            X.0Df.A00(r3, r1, r0)
            java.lang.String r1 = "FBPAY_HUB"
            java.lang.String r0 = "payment_type"
            X.C41848B3p.A1M(r3, r1, r0)
            java.lang.String r0 = "actor_id"
            X.0Df.A00(r3, r5, r0)
            if (r4 == 0) goto L_0x00c3
            java.lang.String r0 = "logging_id"
            X.0Df.A00(r3, r4, r0)
        L_0x00c3:
            java.lang.Class<X.CxG> r0 = X.C45480CxG.class
            java.lang.Object r1 = X.C41847B3o.A16(r0)     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x00e7 }
            X.DG4 r1 = (X.DG4) r1     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x00e7 }
            X.2IS r0 = r1.A00
            X.C41848B3p.A1L(r3, r0)
            r0 = 1
            r1.A01 = r0
            com.facebook.pando.PandoGraphQLRequest r4 = r1.build()
            com.instagram.fbpay.graphql.FBPayIGGraphQLQueryExecutor r3 = X.C41847B3o.A0t()
            r1 = 16
        L_0x00dd:
            X.DGZ r0 = new X.DGZ
            r0.<init>(r1)
            X.Qna r0 = X.C8294Qna.A01(r10, r3, r4, r0, r2)
            return r0
        L_0x00e7:
            r0 = move-exception
            java.lang.RuntimeException r0 = X.C41845B3m.A0j(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DGL.EM7(android.util.SparseArray, X.S4g):X.59x");
    }

    public DGL(UserSession userSession) {
        this.A00 = userSession;
    }
}
