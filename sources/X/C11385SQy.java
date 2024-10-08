package X;

import android.util.SparseArray;
import com.facebook.common.locale.Country;
import com.facebook.common.locale.LocaleMember;
import com.google.common.collect.ImmutableList;

/* renamed from: X.SQy  reason: case insensitive filesystem */
public final class C11385SQy {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: X.RGo} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: X.RGo} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v12, resolved type: com.facebookpay.common.recyclerview.adapteritems.BaseCheckoutItem} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.S67 A03(android.content.Context r28, android.util.SparseArray r29, com.facebookpay.otc.models.OtcInput r30, java.lang.String r31) {
        /*
            r27 = this;
            r4 = 0
            r0 = 12
            r8 = r29
            java.lang.String r24 = X.C9623Re1.A00(r8, r0)
            int r0 = r24.length()
            r6 = r30
            if (r0 == 0) goto L_0x01a1
            if (r30 != 0) goto L_0x01a1
            java.lang.String r13 = "UPDATE"
        L_0x0015:
            java.lang.String r17 = A02(r8)
            r0 = 39
            java.lang.Object r3 = r8.get(r0)
            boolean r0 = r3 instanceof X.C8946RGo
            r2 = 0
            r1 = r2
            if (r0 == 0) goto L_0x0026
            r1 = r3
        L_0x0026:
            r0 = 15
            java.lang.Object r7 = r8.get(r0)
            boolean r0 = r7 instanceof java.lang.String
            if (r0 == 0) goto L_0x019e
            java.lang.String r7 = (java.lang.String) r7
        L_0x0032:
            java.lang.String r12 = ""
            if (r7 != 0) goto L_0x0037
            r7 = r12
        L_0x0037:
            X.RGo r0 = X.C8946RGo.AMERICAN_EXPRESS
            if (r1 != r0) goto L_0x0199
            java.lang.String r0 = "••••"
        L_0x003e:
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0045
            r7 = r12
        L_0x0045:
            int r1 = X.DbX.A05(r17)
            r11 = 6
            if (r1 < r11) goto L_0x0196
            r0 = r17
            java.lang.String r15 = X.C51967G9n.A0q(r0, r4, r11)
        L_0x0052:
            r0 = 4
            if (r1 < r0) goto L_0x0192
            int r1 = r1 - r0
            r0 = r17
            java.lang.String r16 = X.C66580MXl.A0z(r0, r1)
        L_0x005c:
            r0 = 14
            java.lang.Object r1 = r8.get(r0)
            boolean r0 = r1 instanceof java.lang.String
            if (r0 == 0) goto L_0x0282
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L_0x0282
            r3 = 2
            java.lang.String r0 = X.C51967G9n.A0q(r1, r4, r3)
            java.lang.String r5 = X.00l.A0H(r0, r3)
            java.lang.String r0 = X.C66580MXl.A0z(r1, r3)
            java.lang.String r1 = X.00l.A0H(r0, r3)
            java.lang.String r0 = "20"
            java.lang.String r4 = X.002.A0R(r0, r1)
            r0 = 33
            java.lang.Object r1 = r8.get(r0)
            boolean r0 = r1 instanceof com.facebookpay.common.recyclerview.adapteritems.BaseCheckoutItem
            if (r0 == 0) goto L_0x008e
            r2 = r1
            com.facebookpay.common.recyclerview.adapteritems.BaseCheckoutItem r2 = (com.facebookpay.common.recyclerview.adapteritems.BaseCheckoutItem) r2
        L_0x008e:
            boolean r1 = r2 instanceof com.facebookpay.common.recyclerview.adapteritems.SelectionShippingAddressItem
            if (r1 == 0) goto L_0x018c
            r0 = r2
            com.facebookpay.common.recyclerview.adapteritems.SelectionShippingAddressItem r0 = (com.facebookpay.common.recyclerview.adapteritems.SelectionShippingAddressItem) r0
            java.lang.String r3 = r0.A03
            if (r3 != 0) goto L_0x009a
            r3 = r12
        L_0x009a:
            X.2IV r0 = X.Pxe.A0R()
            if (r1 == 0) goto L_0x014f
            com.facebookpay.common.recyclerview.adapteritems.SelectionShippingAddressItem r2 = (com.facebookpay.common.recyclerview.adapteritems.SelectionShippingAddressItem) r2
            java.lang.String r8 = r2.A0E
            java.lang.String r1 = "street1"
            r0.A09(r8, r1)
            java.lang.String r8 = r2.A0F
            java.lang.String r1 = "street2"
            r0.A09(r8, r1)
            java.lang.String r8 = r2.A07
            java.lang.String r1 = "city"
            r0.A09(r8, r1)
            java.lang.String r8 = r2.A0D
            java.lang.String r1 = "state"
            r0.A09(r8, r1)
            java.lang.String r8 = r2.A0C
            java.lang.String r1 = "zip"
            r0.A09(r8, r1)
            java.lang.String r2 = r2.A08
        L_0x00cb:
            java.lang.String r1 = "country_code"
            r0.A09(r2, r1)
            X.2IV r2 = X.Pxe.A0R()
            X.0K0 r10 = com.facebook.graphql.calls.GraphQlCallInput.A02
            r18 = 0
            java.lang.String r9 = "$e2ee"
            java.lang.String r8 = "sensitive_string_value"
            X.0Df r14 = X.C41845B3m.A03(r10, r9, r8)
            java.lang.String r1 = "credit_card_number"
            X.Pxf.A1E(r14, r2, r1)
            if (r7 != r12) goto L_0x00e9
            r9 = r7
        L_0x00e9:
            X.0Df r9 = X.C41845B3m.A03(r10, r9, r8)
            java.lang.String r1 = "csc"
            X.Pxf.A1E(r9, r2, r1)
            X.0Df r9 = X.C41845B3m.A03(r10, r15, r8)
            java.lang.String r1 = "credit_card_first_6"
            X.Pxf.A1E(r9, r2, r1)
            r1 = r16
            X.0Df r8 = X.C41845B3m.A03(r10, r1, r8)
            java.lang.String r1 = "credit_card_last_4"
            X.Pxf.A1E(r8, r2, r1)
            java.lang.String r1 = "expiry_month"
            r2.A09(r5, r1)
            java.lang.String r1 = "expiry_year"
            r2.A09(r4, r1)
            java.lang.String r1 = "cardholder_name"
            r2.A09(r3, r1)
            java.lang.String r1 = "billing_address"
            r2.A06(r0, r1)
            java.lang.String r0 = "risk_features"
            r2.A09(r12, r0)
            java.lang.String r0 = "CREATE"
            boolean r0 = r13.equals(r0)
            r9 = r28
            if (r0 == 0) goto L_0x0206
            X.0sm r1 = X.0Yt.A0E()
            r0 = 5
            X.0qQ.A0B(r5, r0)
            X.0qQ.A0B(r4, r11)
            r0 = 9
            X.0qQ.A0B(r1, r0)
            java.lang.String r10 = "CHARGE"
            java.lang.String r8 = "SEND_MONEY"
            java.lang.String r0 = "CREATE_CONTAINER"
            java.lang.String[] r0 = new java.lang.String[]{r10, r8, r0}
            java.util.List r11 = X.0sr.A1P(r0)
            X.SSZ r8 = X.SOC.A00()
            java.lang.String r0 = "PAN"
            goto L_0x01a5
        L_0x014f:
            r1 = 5
            java.lang.String r2 = X.C9623Re1.A00(r8, r1)
            java.lang.String r1 = "street1"
            r0.A09(r2, r1)
            java.lang.String r2 = X.C9623Re1.A00(r8, r11)
            java.lang.String r1 = "street2"
            r0.A09(r2, r1)
            r1 = 7
            java.lang.String r2 = X.C9623Re1.A00(r8, r1)
            java.lang.String r1 = "city"
            r0.A09(r2, r1)
            r1 = 8
            java.lang.String r2 = X.C9623Re1.A00(r8, r1)
            java.lang.String r1 = "state"
            r0.A09(r2, r1)
            r1 = 9
            java.lang.String r2 = X.C9623Re1.A00(r8, r1)
            java.lang.String r1 = "zip"
            r0.A09(r2, r1)
            java.lang.String r2 = A01(r8)
            goto L_0x00cb
        L_0x018c:
            java.lang.String r3 = X.C9623Re1.A00(r8, r3)
            goto L_0x009a
        L_0x0192:
            r16 = r12
            goto L_0x005c
        L_0x0196:
            r15 = r12
            goto L_0x0052
        L_0x0199:
            java.lang.String r0 = "•••"
            goto L_0x003e
        L_0x019e:
            r7 = r2
            goto L_0x0032
        L_0x01a1:
            java.lang.String r13 = "CREATE"
            goto L_0x0015
        L_0x01a5:
            X.SNj r10 = r8.A06(r0, r11)     // Catch:{ Exception -> 0x01ab }
            r8 = r10
            goto L_0x01b5
        L_0x01ab:
            r10 = move-exception
            java.lang.String r8 = "DefaultAuthTicketManager"
            java.lang.String r0 = "create AT Safe"
            X.0KC.A0F(r8, r0, r10)
            r10 = 0
            r8 = r10
        L_0x01b5:
            com.instagram.common.session.UserSession r0 = X.Pxe.A0a(r9)
            X.SGu r12 = new X.SGu
            r12.<init>(r9, r0)
            X.SSZ r0 = X.SOC.A00()
            java.lang.String r15 = r12.A01()
            java.lang.String r16 = r9.getPackageName()
            X.0qQ.A07(r16)
            if (r10 == 0) goto L_0x01fd
            java.lang.String r12 = r10.A07
            java.lang.String r9 = r10.A03
        L_0x01d3:
            com.facebookpay.cardptt.CardPttPayload r14 = new com.facebookpay.cardptt.CardPttPayload
            r21 = r5
            r22 = r4
            r23 = r12
            r24 = r18
            r25 = r9
            r26 = r11
            r19 = r17
            r20 = r7
            r17 = r3
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            if (r10 == 0) goto L_0x0201
            java.util.HashSet r19 = X.Pxj.A0v(r10)
            if (r30 == 0) goto L_0x01f9
            java.lang.String r7 = r6.A00
            java.lang.String r5 = r6.A01
        L_0x01f6:
            java.lang.String r12 = "ADD_CARD"
            goto L_0x0249
        L_0x01f9:
            r7 = r18
            r5 = r7
            goto L_0x01f6
        L_0x01fd:
            r12 = r18
            r9 = r12
            goto L_0x01d3
        L_0x0201:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0206:
            java.lang.String r0 = "UPDATE"
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto L_0x027b
            X.0sm r1 = X.0Yt.A0E()
            X.AnonymousClass7TF.A1E(r5, r11, r4)
            r0 = 10
            X.0qQ.A0B(r1, r0)
            X.SSZ r0 = X.SOC.A00()
            java.lang.String r15 = X.C11234SGu.A00(r9)
            java.lang.String r16 = r9.getPackageName()
            X.0qQ.A07(r16)
            r8 = 0
            com.facebookpay.cardptt.CardPttPayload r14 = new com.facebookpay.cardptt.CardPttPayload
            r21 = r5
            r22 = r4
            r23 = r8
            r25 = r8
            r26 = r8
            r19 = r17
            r20 = r7
            r17 = r3
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            X.0sl r19 = X.0sl.A00
            if (r30 == 0) goto L_0x0278
            java.lang.String r7 = r6.A00
            java.lang.String r5 = r6.A01
        L_0x0247:
            java.lang.String r12 = "EDIT_CARD"
        L_0x0249:
            r4 = 1
            X.SvS r3 = new X.SvS
            r3.<init>(r0, r4)
            if (r19 != 0) goto L_0x0275
            X.0sl r0 = X.0sl.A00
        L_0x0253:
            X.SvQ r10 = X.C11095S9w.A00(r3, r0)
            if (r19 != 0) goto L_0x025b
            X.0sl r19 = X.0sl.A00
        L_0x025b:
            X.SFo r9 = new X.SFo
            r16 = r31
            r11 = r14
            r13 = r18
            r14 = r7
            r15 = r5
            r17 = r13
            r18 = r1
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r0 = 2
            X.0qQ.A0B(r9, r0)
            X.S67 r0 = new X.S67
            r0.<init>(r2, r8, r9)
            return r0
        L_0x0275:
            r0 = r19
            goto L_0x0253
        L_0x0278:
            r7 = r8
            r5 = r8
            goto L_0x0247
        L_0x027b:
            java.lang.String r0 = "MutationType is not yet supported + "
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TF.A0W(r0, r13)
            throw r0
        L_0x0282:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11385SQy.A03(android.content.Context, android.util.SparseArray, com.facebookpay.otc.models.OtcInput, java.lang.String):X.S67");
    }

    public static final String A01(SparseArray sparseArray) {
        boolean z = sparseArray.get(10) instanceof Country;
        Object obj = sparseArray.get(10);
        if (z) {
            0qQ.A0C(obj, "null cannot be cast to non-null type com.facebook.common.locale.Country");
            String country = ((LocaleMember) obj).A00.getCountry();
            0qQ.A0A(country);
            return country;
        }
        DbS.A1Y(obj);
        return (String) obj;
    }

    public static final String A02(SparseArray sparseArray) {
        String obj = sparseArray.get(13).toString();
        if (obj != null) {
            return 00p.A0g(obj, "\\s+", "", false);
        }
        throw AnonymousClass7TE.A0y();
    }

    public static final QSW A00(QXI qxi) {
        QXE A0E;
        C7795QXg A0E2;
        QXK A0E3;
        C7648QRp A0E4;
        ImmutableList requiredCompactedTreeListField;
        C250663lr r2;
        C7799QXk A0E5 = qxi.A0E();
        if (A0E5 == null || (A0E = A0E5.A0E()) == null || (A0E2 = A0E.A0E()) == null || (A0E3 = A0E2.A0E()) == null || (A0E4 = A0E3.A0E()) == null || (requiredCompactedTreeListField = A0E4.getRequiredCompactedTreeListField(16, "authentication_tickets_with_ptt_kid_filtering", BT9.class, -1717013832)) == null || (r2 = (C250663lr) 00k.A0J(requiredCompactedTreeListField)) == null) {
            return null;
        }
        return (QSW) r2.A01(QSW.class, -1563793709);
    }
}
