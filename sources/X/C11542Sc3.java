package X;

/* renamed from: X.Sc3  reason: case insensitive filesystem */
public final class C11542Sc3 implements 1MD {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C11542Sc3(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    /* JADX WARNING: type inference failed for: r5v17, types: [X.R9l, X.11X] */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x01ac, code lost:
        return X.C8294Qna.A00(r6, r5, r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x01bf, code lost:
        r3 = (X.SJK) r4.A01;
        r2 = new X.S1I(0, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x01ce, code lost:
        return r5.A00(r6, r2, r3);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object apply(java.lang.Object r28) {
        /*
            r27 = this;
            r4 = r27
            r6 = r28
            int r0 = r4.A00
            switch(r0) {
                case 0: goto L_0x01cf;
                case 1: goto L_0x01b3;
                case 2: goto L_0x017a;
                case 3: goto L_0x0163;
                case 4: goto L_0x0026;
                case 5: goto L_0x0156;
                case 6: goto L_0x0121;
                case 7: goto L_0x00eb;
                case 8: goto L_0x00b5;
                case 9: goto L_0x007f;
                default: goto L_0x0009;
            }
        L_0x0009:
            X.S4g r6 = (X.S4g) r6
            java.lang.Object r0 = r4.A01
            X.S2Q r0 = (X.S2Q) r0
            com.instagram.fbpay.paymentmethods.data.IGPaymentMethodsAPI r7 = r0.A01
            java.lang.Object r10 = r4.A02
            java.util.Set r10 = (java.util.Set) r10
            r8 = 0
            r0 = 1
            X.0qQ.A0B(r10, r0)
            X.R9l r5 = new X.R9l
            r9 = r8
            r5.<init>(r6, r7, r8, r9, r10)
            X.1ES.A03(r5)
            X.59w r2 = r7.A01
        L_0x0025:
            return r2
        L_0x0026:
            X.3lr r6 = (X.C250663lr) r6
            java.lang.Class<X.QRk> r3 = X.C7643QRk.class
            r0 = 0
            java.lang.String r2 = "step_up_requirements"
            r1 = -1385379362(0xffffffffad6cc9de, float:-1.345987E-11)
            com.google.common.collect.ImmutableList r1 = r6.getRequiredCompactedTreeListField(r0, r2, r3, r1)
            r2 = 0
            if (r1 == 0) goto L_0x0025
            java.util.Iterator r8 = r1.iterator()
        L_0x003c:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L_0x007d
            java.lang.Object r6 = r8.next()
            r7 = r6
            X.3lr r7 = (X.C250663lr) r7
            java.lang.Class<X.QTD> r5 = X.QTD.class
            java.lang.String r3 = "PAYFBPayMIBToCIBStepUp"
            r1 = -1229562524(0xffffffffb6b65d64, float:-5.434895E-6)
            X.3lr r5 = r7.reinterpretIfFulfillsType(r0, r3, r5, r1)
            if (r5 == 0) goto L_0x007b
            X.RGT r3 = X.RGT.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r1 = "step_up_type"
            java.lang.Enum r3 = r5.getOptionalEnumField(r0, r1, r3)
        L_0x005f:
            X.RGT r1 = X.RGT.MIB_TO_CIB_PAYPAL
            if (r3 != r1) goto L_0x003c
        L_0x0063:
            X.3lr r6 = (X.C250663lr) r6
            if (r6 == 0) goto L_0x0025
            X.AnonymousClass2E0.A01()
            java.lang.Object r1 = r4.A01
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            X.0hq r7 = r1.getChildFragmentManager()
            if (r7 != 0) goto L_0x01e2
            java.lang.String r0 = "Input fragment or fragmentActivity cannot be null"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r0)
            throw r0
        L_0x007b:
            r3 = r2
            goto L_0x005f
        L_0x007d:
            r6 = r2
            goto L_0x0063
        L_0x007f:
            X.S4g r6 = (X.S4g) r6
            r2 = 0
            X.0qQ.A0B(r6, r2)
            java.lang.Object r4 = r4.A01
            com.facebook.graphql.calls.GraphQlCallInput r4 = (com.facebook.graphql.calls.GraphQlCallInput) r4
            r3 = 1
            X.0qQ.A0B(r4, r3)
            com.instagram.fbpay.graphql.FBPayIGGraphQLQueryExecutor r5 = X.C41847B3o.A0t()
            X.0qQ.A07(r5)
            java.lang.Class<X.S8k> r1 = X.C11065S8k.class
            java.lang.String r0 = "create"
            java.lang.Object r2 = X.C41847B3o.A17(r1, r0, r2)     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x00af }
            X.SnE r2 = (X.C12115SnE) r2     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x00af }
            X.2IS r1 = r2.A00
            java.lang.String r0 = "input"
            r1.A00(r4, r0)
            r2.A01 = r3
            com.facebook.pando.PandoGraphQLRequest r1 = r2.build()
            X.Szn r0 = X.Szn.A00
            goto L_0x01a8
        L_0x00af:
            r0 = move-exception
            java.lang.RuntimeException r0 = X.C41845B3m.A0j(r0)
            throw r0
        L_0x00b5:
            X.S4g r6 = (X.S4g) r6
            r2 = 0
            X.0qQ.A0B(r6, r2)
            java.lang.Object r4 = r4.A01
            com.facebook.graphql.calls.GraphQlCallInput r4 = (com.facebook.graphql.calls.GraphQlCallInput) r4
            r3 = 1
            X.0qQ.A0B(r4, r3)
            com.instagram.fbpay.graphql.FBPayIGGraphQLQueryExecutor r5 = X.C41847B3o.A0t()
            X.0qQ.A07(r5)
            java.lang.Class<X.S8m> r1 = X.C11067S8m.class
            java.lang.String r0 = "create"
            java.lang.Object r2 = X.C41847B3o.A17(r1, r0, r2)     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x00e5 }
            X.SnF r2 = (X.C12116SnF) r2     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x00e5 }
            X.2IS r1 = r2.A00
            java.lang.String r0 = "input"
            r1.A00(r4, r0)
            r2.A01 = r3
            com.facebook.pando.PandoGraphQLRequest r1 = r2.build()
            X.Szp r0 = X.C12606Szp.A00
            goto L_0x01a8
        L_0x00e5:
            r0 = move-exception
            java.lang.RuntimeException r0 = X.C41845B3m.A0j(r0)
            throw r0
        L_0x00eb:
            X.S4g r6 = (X.S4g) r6
            r2 = 0
            X.0qQ.A0B(r6, r2)
            java.lang.Object r4 = r4.A01
            com.facebook.graphql.calls.GraphQlCallInput r4 = (com.facebook.graphql.calls.GraphQlCallInput) r4
            r3 = 1
            X.0qQ.A0B(r4, r3)
            com.instagram.fbpay.graphql.FBPayIGGraphQLQueryExecutor r5 = X.C41847B3o.A0t()
            X.0qQ.A07(r5)
            java.lang.Class<X.S8w> r1 = X.C11076S8w.class
            java.lang.String r0 = "create"
            java.lang.Object r2 = X.C41847B3o.A17(r1, r0, r2)     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x011b }
            X.SnJ r2 = (X.C12120SnJ) r2     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x011b }
            X.2IS r1 = r2.A00
            java.lang.String r0 = "input"
            r1.A00(r4, r0)
            r2.A01 = r3
            com.facebook.pando.PandoGraphQLRequest r1 = r2.build()
            X.Szo r0 = X.Szo.A00
            goto L_0x01a8
        L_0x011b:
            r0 = move-exception
            java.lang.RuntimeException r0 = X.C41845B3m.A0j(r0)
            throw r0
        L_0x0121:
            X.S4g r6 = (X.S4g) r6
            r2 = 0
            X.0qQ.A0B(r6, r2)
            java.lang.Object r4 = r4.A01
            com.facebook.graphql.calls.GraphQlCallInput r4 = (com.facebook.graphql.calls.GraphQlCallInput) r4
            r3 = 1
            X.0qQ.A0B(r4, r3)
            com.instagram.fbpay.graphql.FBPayIGGraphQLQueryExecutor r5 = X.C41847B3o.A0t()
            X.0qQ.A07(r5)
            java.lang.Class<X.S8Z> r1 = X.S8Z.class
            java.lang.String r0 = "create"
            java.lang.Object r2 = X.C41847B3o.A17(r1, r0, r2)     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0150 }
            X.Sn9 r2 = (X.C12111Sn9) r2     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0150 }
            X.2IS r1 = r2.A00
            java.lang.String r0 = "input"
            r1.A00(r4, r0)
            r2.A01 = r3
            com.facebook.pando.PandoGraphQLRequest r1 = r2.build()
            X.Szm r0 = X.C12605Szm.A00
            goto L_0x01a8
        L_0x0150:
            r0 = move-exception
            java.lang.RuntimeException r0 = X.C41845B3m.A0j(r0)
            throw r0
        L_0x0156:
            X.S4g r6 = (X.S4g) r6
            r0 = 0
            X.0qQ.A0B(r6, r0)
            java.lang.Object r0 = r4.A02
            X.RpE r0 = (X.C10254RpE) r0
            X.S0a r5 = r0.A00
            goto L_0x01bf
        L_0x0163:
            X.S4g r6 = (X.S4g) r6
            r0 = 0
            X.0qQ.A0B(r6, r0)
            java.lang.Object r0 = r4.A02
            com.facebookpay.expresscheckout.repositoryimpl.ECPRepositoryImpl r0 = (com.facebookpay.expresscheckout.repositoryimpl.ECPRepositoryImpl) r0
            X.S0a r5 = r0.A05
            java.lang.Object r3 = r4.A01
            X.SJK r3 = (X.SJK) r3
            java.lang.String r0 = "PRODUCT_SDK_DEFAULT_COMPONENT"
            X.S1I r2 = X.C9619Rdx.A00(r0)
            goto L_0x01ca
        L_0x017a:
            X.S4g r6 = (X.S4g) r6
            r2 = 0
            X.0qQ.A0B(r6, r2)
            java.lang.Object r4 = r4.A01
            com.facebook.graphql.calls.GraphQlCallInput r4 = (com.facebook.graphql.calls.GraphQlCallInput) r4
            r3 = 1
            X.0qQ.A0B(r4, r3)
            com.instagram.fbpay.graphql.FBPayIGGraphQLQueryExecutor r5 = X.C41847B3o.A0t()
            X.0qQ.A07(r5)
            java.lang.Class<X.S8d> r1 = X.C11058S8d.class
            java.lang.String r0 = "create"
            java.lang.Object r2 = X.C41847B3o.A17(r1, r0, r2)     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x01ad }
            X.SnA r2 = (X.C12112SnA) r2     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x01ad }
            X.2IS r1 = r2.A00
            java.lang.String r0 = "input"
            r1.A00(r4, r0)
            r2.A01 = r3
            com.facebook.pando.PandoGraphQLRequest r1 = r2.build()
            X.Szc r0 = X.Szc.A00
        L_0x01a8:
            X.Qna r2 = X.C8294Qna.A00(r6, r5, r1, r0)
            return r2
        L_0x01ad:
            r0 = move-exception
            java.lang.RuntimeException r0 = X.C41845B3m.A0j(r0)
            throw r0
        L_0x01b3:
            X.S4g r6 = (X.S4g) r6
            r0 = 0
            X.0qQ.A0B(r6, r0)
            java.lang.Object r0 = r4.A02
            X.RpC r0 = (X.C10252RpC) r0
            X.S0a r5 = r0.A00
        L_0x01bf:
            java.lang.Object r3 = r4.A01
            X.SJK r3 = (X.SJK) r3
            r0 = 0
            X.S1I r2 = new X.S1I
            r2.<init>(r0, r0)
        L_0x01ca:
            X.Qna r2 = r5.A00(r6, r2, r3)
            return r2
        L_0x01cf:
            java.lang.Object r2 = r4.A01
            X.2Fk r2 = (X.2Fk) r2
            r0 = 0
            X.SUj.A0L(r2, r0)
            java.lang.Object r0 = r4.A02
            X.0sP r0 = (X.0sP) r0
            X.0qQ.A0A(r6)
            r0.invoke(r6)
            return r2
        L_0x01e2:
            java.lang.Class<X.QTD> r5 = X.QTD.class
            java.lang.String r3 = "PAYFBPayMIBToCIBStepUp"
            r1 = -1229562524(0xffffffffb6b65d64, float:-5.434895E-6)
            X.3lr r6 = r6.reinterpretIfFulfillsType(r0, r3, r5, r1)
            if (r6 == 0) goto L_0x0248
            java.lang.Class<X.QTC> r5 = X.QTC.class
            java.lang.String r3 = "paypal_consent_bottom_sheet"
            r1 = -953997546(0xffffffffc7232716, float:-41767.086)
            X.3lr r5 = r6.A04(r5, r3, r1)
            if (r5 == 0) goto L_0x0248
            java.lang.Class<X.QRs> r3 = X.C7651QRs.class
            r1 = -249277202(0xfffffffff12454ee, float:-8.1373144E29)
            X.3lr r8 = r5.reinterpretRequired(r0, r3, r1)
        L_0x0206:
            java.lang.String r10 = "Required value was null."
            if (r8 == 0) goto L_0x0318
            java.lang.Object r9 = r4.A02
            X.QDN r9 = (X.QDN) r9
            X.2Fj r3 = r9.A11
            java.lang.Object r1 = r3.A02()
            if (r1 == 0) goto L_0x0313
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r1 = (com.facebookpay.expresscheckout.models.ECPPaymentRequest) r1
            java.lang.String r6 = r1.A0A
            java.lang.Object r1 = r3.A02()
            if (r1 == 0) goto L_0x030e
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r1 = (com.facebookpay.expresscheckout.models.ECPPaymentRequest) r1
            java.lang.String r5 = r1.A08
            X.SUj r1 = r9.A0N
            java.lang.Object r1 = r1.A01
            com.facebookpay.common.recyclerview.adapteritems.PuxPaymentMethodItem r1 = (com.facebookpay.common.recyclerview.adapteritems.PuxPaymentMethodItem) r1
            if (r1 == 0) goto L_0x022e
            com.facebookpay.paymentmethod.model.PaymentMethod r2 = r1.A01
        L_0x022e:
            java.lang.String r1 = "null cannot be cast to non-null type com.facebookpay.paymentmethod.model.PayPalCredential"
            X.0qQ.A0C(r2, r1)
            com.facebookpay.paymentmethod.model.PayPalCredential r2 = (com.facebookpay.paymentmethod.model.PayPalCredential) r2
            java.lang.String r4 = r2.Asm()
            X.2Fk r1 = r9.A00
            if (r1 != 0) goto L_0x024a
            java.lang.String r0 = "_loggingPolicy"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0248:
            r8 = r2
            goto L_0x0206
        L_0x024a:
            java.lang.Object r15 = r1.A02()
            com.facebookpay.logging.LoggingPolicy r15 = (com.facebookpay.logging.LoggingPolicy) r15
            java.lang.Object r1 = r3.A02()
            if (r1 == 0) goto L_0x0309
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r1 = (com.facebookpay.expresscheckout.models.ECPPaymentRequest) r1
            boolean r3 = r1.A0B
            r13 = 1
            r10 = 2
            r11 = 3
            X.0qQ.A0B(r4, r11)
            java.lang.Class<X.BTI> r9 = X.BTI.class
            java.lang.String r2 = "paypal_policy"
            r1 = 53725783(0x333ca57, float:5.2835647E-37)
            X.3lr r12 = r8.getOptionalTreeField(r11, r2, r9, r1)
            java.lang.String r1 = ""
            r2 = 0
            if (r12 == 0) goto L_0x02d0
            java.lang.Class<X.C7X> r11 = X.C7X.class
            r9 = 1825808236(0x6cd39f6c, float:2.0466896E27)
            X.3lr r14 = r12.reinterpretRequired(r0, r11, r9)
            X.C7X r14 = (X.C7X) r14
            if (r14 == 0) goto L_0x02d0
            java.lang.String r12 = X.C41845B3m.A0l(r14, r0)
            if (r12 == 0) goto L_0x02d0
            java.lang.String r9 = "description"
            java.lang.String r9 = r8.getOptionalStringField(r0, r9)
            java.lang.Object[] r11 = new java.lang.Object[]{r9, r1}
            java.lang.String r9 = "\n\n"
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            X.C296675qS.A01(r2, r9, r1, r11)
            java.lang.String r1 = r1.toString()
            com.google.common.collect.ImmutableList r2 = r14.A0E()
            java.lang.Object r9 = r2.get(r0)
            X.3lr r9 = (X.C250663lr) r9
            java.lang.String r2 = "length"
            int r11 = r9.getCoercedIntField(r13, r2)
            com.google.common.collect.ImmutableList r2 = r14.A0E()
            java.lang.Object r9 = r2.get(r0)
            X.3lr r9 = (X.C250663lr) r9
            java.lang.String r2 = "offset"
            int r9 = r9.getCoercedIntField(r10, r2)
            com.google.common.collect.ImmutableList r2 = r14.A0E()
            X.0qQ.A07(r2)
            java.util.List r2 = X.C11295SKd.A00(r2)
            java.lang.String r0 = X.AnonymousClass7TE.A19(r2, r0)
            com.facebookpay.paypal.model.LinkableTextParams r2 = new com.facebookpay.paypal.model.LinkableTextParams
            r2.<init>(r12, r11, r9, r0)
        L_0x02d0:
            java.lang.String r0 = "header"
            java.lang.String r21 = r8.getOptionalStringField(r13, r0)
            r9 = 6
            java.lang.String r0 = "sub_header"
            java.lang.String r22 = r8.getOptionalStringField(r9, r0)
            java.lang.String r0 = "navigation_title"
            java.lang.String r23 = r8.getOptionalStringField(r10, r0)
            java.lang.String r0 = "primary_button_label"
            java.lang.String r24 = r8.A0B(r0)
            java.lang.String r0 = "secondary_button_label"
            java.lang.String r25 = r8.A0C(r0)
            com.facebookpay.paypal.model.PaypalConsentLaunchParams r14 = new com.facebookpay.paypal.model.PaypalConsentLaunchParams
            r20 = r1
            r26 = r3
            r19 = r4
            r18 = r5
            r17 = r6
            r16 = r2
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            X.2gB r2 = X.C9654ReY.A00(r7, r14)
            return r2
        L_0x0309:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r10)
            throw r0
        L_0x030e:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r10)
            throw r0
        L_0x0313:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r10)
            throw r0
        L_0x0318:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11542Sc3.apply(java.lang.Object):java.lang.Object");
    }
}
