package com.facebookpay.expresscheckout.api.executor;

import X.AnonymousClass0eM;
import X.AnonymousClass0eN;
import X.TUP;

public final class ECPCheckoutSetupMutationAPI {
    public final AnonymousClass0eM A00 = AnonymousClass0eN.A01(TUP.A00);

    /* JADX WARNING: type inference failed for: r6v1, types: [X.MEC, X.4D7] */
    /* JADX WARNING: type inference failed for: r6v4 */
    /* JADX WARNING: type inference failed for: r6v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(java.lang.String r12, java.lang.String r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, java.util.List r17, X.AnonymousClass4D7 r18) {
        /*
            r11 = this;
            r3 = 29
            r4 = r18
            boolean r0 = X.MEC.A03(r3, r4)
            if (r0 == 0) goto L_0x00cf
            r6 = r4
            X.MEC r6 = (X.MEC) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00cf
            int r2 = r2 - r1
            r6.A00 = r2
        L_0x0018:
            java.lang.Object r1 = r6.A01
            X.1Hj r5 = X.1Hj.A02
            int r0 = r6.A00
            r4 = 1
            if (r0 == 0) goto L_0x002d
            if (r0 != r4) goto L_0x00d5
            X.0eS.A00(r1)
        L_0x0026:
            X.S21 r1 = (X.S21) r1
            X.SUj r0 = r1.A00()
            return r0
        L_0x002d:
            X.0eS.A00(r1)
            r2 = 0
            X.QNI r3 = new X.QNI
            r3.<init>()
            java.lang.String r0 = X.Py7.A00()
            r3.A07(r12, r0)
            java.lang.String r0 = "product_id"
            r3.A07(r13, r0)
            java.lang.String r0 = "receiver_id"
            r3.A07(r14, r0)
            java.lang.String r0 = "order_id"
            r3.A07(r15, r0)
            if (r17 == 0) goto L_0x007c
            java.util.ArrayList r10 = X.AnonymousClass7TG.A0r(r17)
            java.util.Iterator r9 = r17.iterator()
        L_0x0059:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x007e
            java.lang.Object r8 = r9.next()
            com.facebookpay.expresscheckout.models.CheckoutSetupKeyValue r8 = (com.facebookpay.expresscheckout.models.CheckoutSetupKeyValue) r8
            X.2IV r7 = X.Pxe.A0R()
            java.lang.String r1 = r8.A00
            java.lang.String r0 = "key"
            r7.A09(r1, r0)
            java.lang.String r1 = r8.A01
            java.lang.String r0 = "value"
            r7.A09(r1, r0)
            r10.add(r7)
            goto L_0x0059
        L_0x007c:
            r1 = 0
            goto L_0x0082
        L_0x007e:
            java.util.List r1 = X.00k.A0a(r10)
        L_0x0082:
            java.lang.String r0 = "product_data"
            r3.A05(r0, r1)
            r7 = r16
            if (r16 == 0) goto L_0x009a
            X.2IV r1 = X.Pxe.A0R()
            java.lang.String r0 = "bloks_versioning_id"
            r1.A09(r7, r0)
            java.lang.String r0 = "bloks_input"
            r3.A06(r1, r0)
        L_0x009a:
            java.lang.Class<X.S8X> r1 = X.S8X.class
            java.lang.String r0 = "create"
            java.lang.Object r2 = X.C41847B3o.A17(r1, r0, r2)     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x00da }
            X.Sn8 r2 = (X.Sn8) r2     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x00da }
            X.2IS r1 = r2.A00
            java.lang.String r0 = "input"
            r1.A00(r3, r0)
            r2.A01 = r4
            com.facebook.pando.PandoGraphQLRequest r3 = r2.build()
            r1 = 0
            X.S1I r0 = new X.S1I
            r0.<init>(r1, r1)
            X.0qQ.A0A(r3)
            r0.A00(r3)
            X.0eM r0 = r11.A00
            java.lang.Object r0 = r0.getValue()
            com.instagram.fbpay.graphql.FBPayIGGraphQLQueryExecutor r0 = (com.instagram.fbpay.graphql.FBPayIGGraphQLQueryExecutor) r0
            r6.A00 = r4
            java.lang.Object r1 = r0.A00(r3, r6)
            if (r1 != r5) goto L_0x0026
            return r5
        L_0x00cf:
            X.MEC r6 = X.MEC.A00(r11, r4, r3)
            goto L_0x0018
        L_0x00d5:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x00da:
            r0 = move-exception
            java.lang.RuntimeException r0 = X.C41845B3m.A0j(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebookpay.expresscheckout.api.executor.ECPCheckoutSetupMutationAPI.A00(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, X.4D7):java.lang.Object");
    }
}
