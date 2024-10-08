package X;

import android.util.SparseArray;
import com.facebook.graphql.calls.GraphQlCallInput;
import java.lang.reflect.InvocationTargetException;

public final class DGI implements C13737Tg9 {
    public final C2818759x EE9(SparseArray sparseArray, S4g s4g) {
        boolean A1U = AnonymousClass7TF.A1U(0, sparseArray, s4g);
        AnonymousClass2hV r4 = C10034RlW.A00;
        Object A15 = C41847B3o.A15(sparseArray, 12);
        try {
            C45942DFw dFw = (C45942DFw) C41847B3o.A17(C45472Cx8.class, "create", 0);
            0Df A03 = C41845B3m.A03(GraphQlCallInput.A02, A15, "mailing_address_id");
            C41848B3p.A1M(A03, "FBPAY_HUB", "payment_type");
            C41848B3p.A1L(A03, dFw.A00);
            dFw.A01 = A1U;
            return C8294Qna.A01(s4g, C41847B3o.A0t(), dFw.build(), new DGZ(11), r4);
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            throw C41845B3m.A0j(e);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x007d, code lost:
        if (((java.lang.Boolean) r2.get(3)).booleanValue() == false) goto L_0x007f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C2818759x EM7(android.util.SparseArray r17, X.S4g r18) {
        /*
            r16 = this;
            r3 = 0
            r2 = r17
            r5 = r18
            boolean r6 = X.AnonymousClass7TF.A1U(r3, r2, r5)
            r1 = 12
            java.lang.Object r4 = r2.get(r1)
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.String"
            X.0qQ.A0C(r4, r0)
            X.2hV r4 = X.C10034RlW.A00
            r7 = 4
            java.lang.Object r0 = r2.get(r7)
            java.lang.String r8 = ""
            if (r0 != 0) goto L_0x009e
            r14 = r8
        L_0x0020:
            r7 = 2
            java.lang.Object r0 = r2.get(r7)
            if (r0 != 0) goto L_0x0099
            r13 = r8
        L_0x0028:
            r7 = 5
            java.lang.Object r0 = r2.get(r7)
            if (r0 != 0) goto L_0x0094
            r12 = r8
        L_0x0030:
            r7 = 6
            java.lang.Object r0 = r2.get(r7)
            if (r0 != 0) goto L_0x008f
            r11 = r8
        L_0x0038:
            r7 = 7
            java.lang.Object r0 = r2.get(r7)
            if (r0 != 0) goto L_0x008a
            r10 = r8
        L_0x0040:
            r7 = 8
            java.lang.Object r0 = r2.get(r7)
            if (r0 != 0) goto L_0x0085
            r9 = r8
        L_0x0049:
            r7 = 9
            java.lang.Object r0 = r2.get(r7)
            if (r0 == 0) goto L_0x0055
            java.lang.Object r8 = r2.get(r7)
        L_0x0055:
            r7 = 10
            java.lang.Object r0 = r2.get(r7)
            boolean r0 = r0 instanceof com.facebook.common.locale.Country
            java.lang.Object r7 = r2.get(r7)
            if (r0 == 0) goto L_0x006b
            com.facebook.common.locale.LocaleMember r7 = (com.facebook.common.locale.LocaleMember) r7
            java.util.Locale r0 = r7.A00
            java.lang.String r7 = r0.getCountry()
        L_0x006b:
            r15 = 3
            java.lang.Object r0 = r2.get(r15)
            if (r0 == 0) goto L_0x007f
            java.lang.Object r0 = r2.get(r15)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r15 = 1
            if (r0 != 0) goto L_0x0080
        L_0x007f:
            r15 = 0
        L_0x0080:
            java.lang.Object r2 = X.C41847B3o.A15(r2, r1)
            goto L_0x00a4
        L_0x0085:
            java.lang.Object r9 = r2.get(r7)
            goto L_0x0049
        L_0x008a:
            java.lang.Object r10 = r2.get(r7)
            goto L_0x0040
        L_0x008f:
            java.lang.Object r11 = r2.get(r7)
            goto L_0x0038
        L_0x0094:
            java.lang.Object r12 = r2.get(r7)
            goto L_0x0030
        L_0x0099:
            java.lang.Object r13 = r2.get(r7)
            goto L_0x0028
        L_0x009e:
            java.lang.Object r14 = r2.get(r7)
            goto L_0x0020
        L_0x00a4:
            java.lang.Class<X.CxE> r1 = X.C45478CxE.class
            java.lang.String r0 = "create"
            java.lang.Object r3 = X.C41847B3o.A17(r1, r0, r3)     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0109 }
            X.DG2 r3 = (X.DG2) r3     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0109 }
            X.0K0 r1 = com.facebook.graphql.calls.GraphQlCallInput.A02
            java.lang.String r0 = "mailing_address_id"
            X.0Df r2 = X.C41845B3m.A03(r1, r2, r0)
            java.lang.String r0 = "label"
            X.0Df.A00(r2, r14, r0)
            java.lang.String r0 = "care_of"
            X.0Df.A00(r2, r13, r0)
            java.lang.String r0 = "street1"
            X.0Df.A00(r2, r12, r0)
            java.lang.String r0 = "street2"
            X.0Df.A00(r2, r11, r0)
            java.lang.String r0 = "city"
            X.0Df.A00(r2, r10, r0)
            java.lang.String r0 = "state"
            X.0Df.A00(r2, r9, r0)
            java.lang.String r0 = "postal_code"
            X.0Df.A00(r2, r8, r0)
            java.lang.String r0 = "country"
            X.0Df.A00(r2, r7, r0)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r15)
            java.lang.String r0 = "is_default"
            X.0Df.A00(r2, r1, r0)
            java.lang.String r1 = "FBPAY_HUB"
            java.lang.String r0 = "payment_type"
            X.C41848B3p.A1M(r2, r1, r0)
            X.2IS r0 = r3.A00
            X.C41848B3p.A1L(r2, r0)
            r3.A01 = r6
            com.facebook.pando.PandoGraphQLRequest r3 = r3.build()
            com.instagram.fbpay.graphql.FBPayIGGraphQLQueryExecutor r2 = X.C41847B3o.A0t()
            r1 = 10
            X.DGZ r0 = new X.DGZ
            r0.<init>(r1)
            X.Qna r0 = X.C8294Qna.A01(r5, r2, r3, r0, r4)
            return r0
        L_0x0109:
            r0 = move-exception
            java.lang.RuntimeException r0 = X.C41845B3m.A0j(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DGI.EM7(android.util.SparseArray, X.S4g):X.59x");
    }
}
