package X;

import android.util.SparseArray;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebookpay.logging.LoggingContext;
import com.facebookpay.offsite.models.message.PaymentDetailChangeTypes$Companion;
import com.facebookpay.otc.models.OtcInput;
import com.google.common.collect.ImmutableList;
import java.util.List;

public final class Stb implements C13730Tg1 {
    public final C11281SIz A00 = new C11281SIz();
    public final C10900S0a A01 = new C10900S0a();
    public final C10901S0b A02 = new C10901S0b();

    public static final synchronized void A00(AnonymousClass2gB r2, Stb stb, String str, List list) {
        synchronized (stb) {
            SUj.A0K(r2, new C10580Rua(((C10580Rua) SUj.A0C(r2)).A00, str, list));
        }
    }

    public final synchronized void A04(SJ1 sj1) {
        SUj sUj;
        AnonymousClass2gB A012 = A01(sj1);
        0qQ.A0C(A012, "null cannot be cast to non-null type androidx.lifecycle.MediatorLiveData<com.fbpay.util.resource.FBPayResource<com.facebookpay.shippingaddress.model.FBPayShippingAddressComponent>>");
        SUj A0W = Pxe.A0W(A012);
        if (A0W != null) {
            sUj = SUj.A04(C11594Sct.A00, A0W);
        } else {
            sUj = null;
        }
        A012.A0B(sUj);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0067, code lost:
        if (((com.facebookpay.shippingaddress.model.ShippingAddress) r3.get(0)).A0C != false) goto L_0x0069;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A05(X.SJ1 r8, X.SUj r9, java.lang.String r10, boolean r11) {
        /*
            r7 = this;
            r6 = 0
            X.AnonymousClass7TF.A1H(r8, r10)
            X.2gB r5 = r7.A01(r8)
            java.lang.String r0 = "null cannot be cast to non-null type androidx.lifecycle.MediatorLiveData<com.fbpay.util.resource.FBPayResource<com.facebookpay.shippingaddress.model.FBPayShippingAddressComponent>>"
            X.0qQ.A0C(r5, r0)
            boolean r0 = X.SUj.A0V(r9)
            if (r0 == 0) goto L_0x0072
            java.lang.Object r3 = X.SUj.A0D(r9)
            X.QXc r3 = (X.C7791QXc) r3
            X.QVK r0 = r3.A0E()
            if (r0 != 0) goto L_0x0072
            boolean r0 = X.SUj.A0Q(r5)
            if (r0 == 0) goto L_0x0072
            java.lang.Class<X.QVL> r2 = X.QVL.class
            java.lang.String r1 = "shipping_address"
            r0 = 482258055(0x1cbeac87, float:1.2617743E-21)
            X.3lr r3 = r3.getOptionalTreeField(r6, r1, r2, r0)
            r1 = 0
            if (r3 == 0) goto L_0x0075
            java.lang.Class<X.QVN> r2 = X.QVN.class
            r0 = -1235561061(0xffffffffb65ad59b, float:-3.2608866E-6)
            X.3lr r0 = r3.reinterpretRequired(r6, r2, r0)
            X.QVN r0 = (X.QVN) r0
            if (r0 == 0) goto L_0x0075
            com.facebookpay.shippingaddress.model.ShippingAddress r4 = X.SQ0.A02(r0, r11)
            java.lang.Object r0 = X.SUj.A0C(r5)
            X.Rua r0 = (X.C10580Rua) r0
            java.util.List r3 = r0.A02
            java.lang.String r0 = "CREATE"
            boolean r0 = r10.equals(r0)
            r2 = 1
            if (r0 == 0) goto L_0x0073
            java.lang.String r1 = r4.A04
            boolean r0 = X.AnonymousClass7TE.A1b(r3)
            if (r0 == 0) goto L_0x0073
            java.lang.Object r0 = r3.get(r6)
            com.facebookpay.shippingaddress.model.ShippingAddress r0 = (com.facebookpay.shippingaddress.model.ShippingAddress) r0
            boolean r0 = r0.A0C
            if (r0 == 0) goto L_0x0073
        L_0x0069:
            X.TYW r0 = X.TYW.A00
            java.util.List r0 = X.C11296SKe.A02(r4, r3, r0, r2)
            A00(r5, r7, r1, r0)
        L_0x0072:
            return
        L_0x0073:
            r2 = 0
            goto L_0x0069
        L_0x0075:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Stb.A05(X.SJ1, X.SUj, java.lang.String, boolean):void");
    }

    public final void A03(SJ1 sj1) {
        C11281SIz.A00(this.A00, sj1.A00, sj1);
    }

    public final 2Fk AOW(SparseArray sparseArray, LoggingContext loggingContext, OtcInput otcInput, OtcInput otcInput2, String str, String str2, String str3, int i) {
        Object obj = sparseArray.get(12);
        if (obj != null) {
            String str4 = (String) obj;
            SEB seb = null;
            SUU suu = C9962RkH.A00;
            0bb r3 = new 0bb();
            r3.A06("mutation_data", "shipping_address");
            r3.A01(C69426NlW.valueOf(DbY.A0k("DELETE")), "mutation_type");
            List A1I = AnonymousClass7TE.A1I(r3);
            OtcInput otcInput3 = otcInput;
            if (otcInput != null) {
                seb = C11300SKk.A01(otcInput3);
            }
            LoggingContext loggingContext2 = loggingContext;
            suu.A0G(loggingContext2, seb, "DELETE", (String) null, A1I, false);
            0Df A03 = C41845B3m.A03(GraphQlCallInput.A02, "DELETE", "mutation_type");
            0Df.A00(A03, str4, "shipping_address_id");
            0Df.A00(A03, AnonymousClass7TE.A0v(), "skip_validation");
            GraphQlCallInput graphQlCallInput = new GraphQlCallInput();
            String str5 = str2;
            Pxj.A1E(graphQlCallInput, str, str5, str3);
            Pxf.A1E(A03, graphQlCallInput, "shipping_address_input");
            graphQlCallInput.A07("", "platform_trust_token");
            C11300SKk.A02(graphQlCallInput, otcInput3);
            C7422QCn A032 = SSC.A03(new C8281QnN(graphQlCallInput, loggingContext2, otcInput3, this, AnonymousClass2E0.A06(), "DELETE", (String) null, str5));
            0qQ.A0C(A032, "null cannot be cast to non-null type androidx.lifecycle.LiveData<com.fbpay.util.resource.FBPayResource<*>>");
            AnonymousClass2gB A012 = AnonymousClass72Y.A01(A032, new MYK(str4, 9));
            AnonymousClass2gB A013 = A01(new SJ1(otcInput2, str5));
            0qQ.A0C(A013, "null cannot be cast to non-null type androidx.lifecycle.MediatorLiveData<com.fbpay.util.resource.FBPayResource<com.facebookpay.shippingaddress.model.FBPayShippingAddressComponent>>");
            Pxi.A1A(A012, A013, new C74189PqV((Object) A012, (Object) this, (Object) A013, str4, 21), 26);
            return A032;
        }
        throw AnonymousClass7TE.A0y();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v3, resolved type: java.lang.Object} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass2gB EM8(android.util.SparseArray r26, com.facebookpay.logging.LoggingContext r27, com.facebookpay.otc.models.OtcInput r28, com.facebookpay.otc.models.OtcInput r29, java.lang.String r30, java.lang.String r31, java.lang.String r32, int r33) {
        /*
            r25 = this;
            r24 = 0
            r14 = 1
            r9 = r30
            r7 = r31
            int r3 = X.DbW.A02(r14, r9, r7)
            r0 = 3
            r2 = 5
            r12 = r26
            java.lang.Object r1 = r12.get(r0)
            boolean r0 = r1 instanceof java.lang.Boolean
            r6 = 0
            if (r0 == 0) goto L_0x01a1
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            if (r1 == 0) goto L_0x01a1
            boolean r16 = r1.booleanValue()
        L_0x0020:
            r0 = 4
            java.lang.Object r13 = X.Pxj.A0j(r12, r0)
            java.lang.String r11 = ""
            r15 = r11
            if (r13 != 0) goto L_0x002b
            r13 = r11
        L_0x002b:
            java.lang.Object r10 = r12.get(r3)
            boolean r0 = r10 instanceof java.lang.String
            if (r0 == 0) goto L_0x0035
            if (r10 != 0) goto L_0x0036
        L_0x0035:
            r10 = r11
        L_0x0036:
            java.lang.Object r8 = r12.get(r2)
            boolean r0 = r8 instanceof java.lang.String
            if (r0 == 0) goto L_0x0040
            if (r8 != 0) goto L_0x0041
        L_0x0040:
            r8 = r11
        L_0x0041:
            r0 = 6
            java.lang.Object r5 = r12.get(r0)
            boolean r0 = r5 instanceof java.lang.String
            if (r0 == 0) goto L_0x004c
            if (r5 != 0) goto L_0x004d
        L_0x004c:
            r5 = r11
        L_0x004d:
            r0 = 7
            java.lang.Object r4 = r12.get(r0)
            boolean r0 = r4 instanceof java.lang.String
            if (r0 == 0) goto L_0x0058
            if (r4 != 0) goto L_0x0059
        L_0x0058:
            r4 = r11
        L_0x0059:
            r0 = 8
            java.lang.Object r3 = r12.get(r0)
            boolean r0 = r3 instanceof java.lang.String
            if (r0 == 0) goto L_0x0065
            if (r3 != 0) goto L_0x0066
        L_0x0065:
            r3 = r11
        L_0x0066:
            r0 = 9
            java.lang.Object r1 = r12.get(r0)
            boolean r0 = r1 instanceof java.lang.String
            if (r0 == 0) goto L_0x0073
            if (r1 == 0) goto L_0x0073
            r11 = r1
        L_0x0073:
            java.lang.String r2 = X.C11385SQy.A01(r12)
            X.0K0 r1 = com.facebook.graphql.calls.GraphQlCallInput.A02
            r22 = 0
            java.lang.String r0 = "label"
            X.0Df r0 = X.C41845B3m.A03(r1, r13, r0)
            java.lang.String r1 = "care_of"
            X.0Df.A00(r0, r10, r1)
            java.lang.String r1 = "street_1"
            X.0Df.A00(r0, r8, r1)
            java.lang.String r1 = "street_2"
            X.0Df.A00(r0, r5, r1)
            java.lang.String r1 = "city"
            X.0Df.A00(r0, r4, r1)
            java.lang.String r1 = "state"
            X.0Df.A00(r0, r3, r1)
            java.lang.String r1 = "postal_code"
            X.0Df.A00(r0, r11, r1)
            java.lang.String r1 = "country_code"
            X.0Df.A00(r0, r2, r1)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r16)
            java.lang.String r1 = "is_default"
            X.0Df.A00(r0, r2, r1)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r14)
            java.lang.String r1 = "provide_suggestion"
            X.0Df.A00(r0, r4, r1)
            r1 = 12
            java.lang.Object r2 = r12.get(r1)
            boolean r1 = r2 instanceof java.lang.String
            if (r1 == 0) goto L_0x00c8
            r6 = r2
            java.lang.String r6 = (java.lang.String) r6
        L_0x00c8:
            X.0rm r2 = X.C51965G9l.A11()
            java.lang.String r1 = "CREATE"
            r5 = r1
            r2.A00 = r1
            if (r6 == 0) goto L_0x00dd
            int r3 = r6.length()
            if (r3 == 0) goto L_0x00dd
            java.lang.String r1 = "UPDATE"
            r2.A00 = r1
        L_0x00dd:
            boolean r3 = r1.equals(r5)
            r20 = 0
            if (r3 == 0) goto L_0x00e8
            java.lang.String r22 = "pux_checkout"
        L_0x00e8:
            X.SUU r18 = X.C9962RkH.A00
            X.QIu r8 = new X.QIu
            r8.<init>()
            java.lang.String r5 = "shipping_address"
            java.lang.String r3 = "mutation_data"
            r8.A06(r3, r5)
            java.lang.String r3 = X.DbY.A0k(r1)
            X.NlW r3 = X.C69426NlW.valueOf(r3)
            java.lang.String r5 = "mutation_type"
            r8.A01(r3, r5)
            java.util.List r23 = X.AnonymousClass7TE.A1I(r8)
            r3 = r28
            if (r28 == 0) goto L_0x0112
            X.SEB r20 = X.C11300SKk.A01(r3)
        L_0x0112:
            r17 = r27
            r19 = r17
            r21 = r1
            r18.A0G(r19, r20, r21, r22, r23, r24)
            X.2IV r8 = X.Pxe.A0R()
            r8.A09(r1, r5)
            java.lang.String r5 = "shipping_address_id"
            r8.A09(r6, r5)
            java.lang.String r5 = "skip_validation"
            r8.A08(r5, r4)
            java.lang.String r4 = "save_shipping_address_input"
            X.Pxf.A1E(r0, r8, r4)
            X.QNI r4 = new X.QNI
            r4.<init>()
            r0 = r32
            X.Pxj.A1E(r4, r9, r7, r0)
            java.lang.String r0 = "shipping_address_input"
            r4.A06(r8, r0)
            java.lang.String r0 = "platform_trust_token"
            r4.A07(r15, r0)
            X.C11300SKk.A02(r4, r3)
            X.5A3 r20 = X.AnonymousClass2E0.A06()
            X.QnN r15 = new X.QnN
            r8 = r25
            r23 = r7
            r16 = r4
            r18 = r3
            r19 = r8
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23)
            X.QCn r9 = X.SSC.A03(r15)
            java.lang.String r0 = "null cannot be cast to non-null type androidx.lifecycle.LiveData<com.fbpay.util.resource.FBPayResource<*>>"
            X.0qQ.A0C(r9, r0)
            r1 = 10
            X.MYK r0 = new X.MYK
            r0.<init>(r6, r1)
            X.2gB r6 = X.AnonymousClass72Y.A01(r9, r0)
            X.SJ1 r5 = new X.SJ1
            r0 = r29
            r5.<init>(r0, r7)
            X.2gB r4 = r8.A01(r5)
            java.lang.String r0 = "null cannot be cast to non-null type androidx.lifecycle.MediatorLiveData<com.fbpay.util.resource.FBPayResource<com.facebookpay.shippingaddress.model.FBPayShippingAddressComponent>>"
            X.0qQ.A0C(r4, r0)
            X.Ixk r1 = new X.Ixk
            r10 = r1
            r11 = r14
            r12 = r6
            r13 = r8
            r14 = r5
            r15 = r4
            r16 = r3
            r17 = r2
            r10.<init>(r11, r12, r13, r14, r15, r16, r17)
            r0 = 26
            X.Pxi.A1A(r6, r4, r1, r0)
            X.TXN r0 = X.TXN.A00
            X.2gB r0 = X.AnonymousClass72Y.A01(r9, r0)
            return r0
        L_0x01a1:
            r16 = 0
            goto L_0x0020
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Stb.EM8(android.util.SparseArray, com.facebookpay.logging.LoggingContext, com.facebookpay.otc.models.OtcInput, com.facebookpay.otc.models.OtcInput, java.lang.String, java.lang.String, java.lang.String, int):X.2gB");
    }

    public final AnonymousClass2gB A01(SJ1 sj1) {
        boolean A05 = C11431STx.A05();
        SUj sUj = null;
        C11281SIz sIz = this.A00;
        if (!A05) {
            sUj = SUj.A08((Object) null);
        }
        return sIz.A01(sUj, sj1);
    }

    public final AnonymousClass2gB A02(SJK sjk, LoggingContext loggingContext, boolean z) {
        SEB seb;
        C12411Sto A0g = C51965G9l.A0g();
        List A1I = AnonymousClass7TE.A1I(C298525tb.SHIPPING_ADDRESS);
        SJK sjk2 = sjk;
        String str = sjk.A09;
        boolean A0K = 0qQ.A0K(str, "PRE_WARM");
        OtcInput otcInput = sjk.A04;
        if (otcInput != null) {
            seb = C11300SKk.A01(otcInput);
        } else {
            seb = null;
        }
        A0g.A0T(loggingContext, str, A1I, Pxj.A0x(seb), A0K);
        String str2 = sjk.A0C;
        A04(new SJ1(otcInput, str2));
        ImmutableList of = ImmutableList.of(PaymentDetailChangeTypes$Companion.SHIPPING_ADDRESS);
        0qQ.A0B(of, 0);
        sjk.A01 = of;
        C7422QCn A03 = SSC.A03(new C8277QnJ(AnonymousClass2E0.A06(), this, sjk2, 1, z));
        AnonymousClass2gB A012 = A01(new SJ1(otcInput, str2));
        0qQ.A0C(A012, "null cannot be cast to non-null type androidx.lifecycle.MediatorLiveData<com.fbpay.util.resource.FBPayResource<com.facebookpay.shippingaddress.model.FBPayShippingAddressComponent>>");
        if (A012.A02() == null) {
            SUj.A0L(A012, (Object) null);
        }
        0qQ.A0A(A03);
        SQB.A02(A03, A012, new C11650Sds(A012, sjk, loggingContext, 9));
        return A012;
    }

    public final boolean A06(SJ1 sj1) {
        C10580Rua rua;
        SUj A0W = Pxe.A0W(A01(sj1));
        if (A0W == null || (rua = (C10580Rua) A0W.A01) == null || !AnonymousClass7TE.A1b(rua.A02)) {
            return false;
        }
        return true;
    }
}
