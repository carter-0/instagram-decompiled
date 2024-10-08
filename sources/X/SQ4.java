package X;

import android.content.Context;
import android.util.Base64;
import com.google.common.collect.ImmutableList;
import java.security.KeyPair;
import java.util.Iterator;
import java.util.List;
import javax.crypto.Cipher;

public abstract class SQ4 {
    public static final void A02(Context context, QD8 qd8, QDH qdh) {
        String str;
        KeyPair keyPair;
        Cipher cipher;
        if (qdh.A09() && (str = (String) qdh.A07.A00("OTC_CREDIT_CARD_NUMBER")) != null && str.length() != 0) {
            C11370SQb.A01(context);
            if (C11370SQb.A01 == null || (keyPair = C11370SQb.A00) == null || (cipher = C11370SQb.A02) == null) {
                0KC.A0C("CryptographyUtil", "isCryptographyInitialized is false");
            } else {
                cipher.init(2, keyPair.getPrivate());
                byte[] decode = Base64.decode(str, 0);
                Cipher cipher2 = C11370SQb.A02;
                if (cipher2 == null) {
                    0qQ.A0F("cipher");
                    throw AnonymousClass00P.createAndThrow();
                }
                byte[] doFinal = cipher2.doFinal(decode);
                0qQ.A0A(doFinal);
                str = new String(doFinal, AnonymousClass15Q.A05);
            }
            SRc A01 = qd8.A01(13);
            if (A01 instanceof C8043Qfn) {
                SRc A0L = ((C298475tU) A01).A0L(13);
                if (A0L instanceof C8048Qfv) {
                    ((C8041Qfl) A0L).A0P(str);
                }
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: X.QRJ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: X.QRJ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v0, resolved type: X.RGd} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v0, resolved type: X.RGo} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v0, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: X.QRJ} */
    /* JADX WARNING: type inference failed for: r9v0, types: [X.TlY] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final com.facebookpay.common.recyclerview.adapteritems.SelectionPaymentMethodItem A00(com.facebookpay.paymentmethod.model.PaymentMethod r28, java.lang.Integer r29, boolean r30, boolean r31) {
        /*
            r0 = r28
            r27 = 0
            boolean r2 = r0 instanceof com.facebookpay.paymentmethod.model.CreditCard
            r1 = 3
            java.lang.Integer r15 = java.lang.Integer.valueOf(r1)
            r28 = r31
            if (r2 == 0) goto L_0x007e
            if (r30 == 0) goto L_0x007b
            X.RH6 r8 = X.RH6.A07
        L_0x0013:
            r2 = r0
            r1 = r2
            com.facebookpay.paymentmethod.model.CreditCard r1 = (com.facebookpay.paymentmethod.model.CreditCard) r1
            java.lang.String r16 = r1.Asm()
            java.lang.String r17 = r1.getTitle()
            java.lang.String r18 = r1.getSubtitle()
            X.RGd r11 = r1.A00()
            java.lang.String r19 = X.Pxj.A0q(r1)
            java.lang.String r20 = r1.A02()
            X.TlY r9 = r1.A00
            X.RGo r12 = r1.A01()
            java.lang.String r5 = r1.A03
            X.QRJ r7 = r1.A01
            X.XRm r10 = r1.Asn()
            java.lang.String r22 = r1.BEP()
            boolean r3 = r1 instanceof com.facebookpay.paymentmethod.model.TokenizedCard
            if (r3 == 0) goto L_0x0078
            com.facebookpay.paymentmethod.model.TokenizedCard r1 = (com.facebookpay.paymentmethod.model.TokenizedCard) r1
            boolean r4 = r1.A04
        L_0x0049:
            r1 = 0
            if (r3 != 0) goto L_0x004d
            r2 = r1
        L_0x004d:
            com.facebookpay.paymentmethod.model.CreditCard r2 = (com.facebookpay.paymentmethod.model.CreditCard) r2
            if (r2 == 0) goto L_0x0076
            com.facebookpay.paymentmethod.model.TokenizedCard r2 = (com.facebookpay.paymentmethod.model.TokenizedCard) r2
            java.lang.String r2 = r2.A02
        L_0x0055:
            if (r3 != 0) goto L_0x0058
            r0 = r1
        L_0x0058:
            com.facebookpay.paymentmethod.model.CreditCard r0 = (com.facebookpay.paymentmethod.model.CreditCard) r0
            if (r0 == 0) goto L_0x0060
            com.facebookpay.paymentmethod.model.TokenizedCard r0 = (com.facebookpay.paymentmethod.model.TokenizedCard) r0
            java.lang.String r1 = r0.A03
        L_0x0060:
            java.lang.Integer r13 = X.AnonymousClass05K.A0N
            r25 = 1
            com.facebookpay.common.recyclerview.adapteritems.SelectionPaymentMethodItem r6 = new com.facebookpay.common.recyclerview.adapteritems.SelectionPaymentMethodItem
            r14 = r29
            r21 = r5
            r23 = r2
            r24 = r1
            r26 = r4
            r29 = r27
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            return r6
        L_0x0076:
            r2 = r1
            goto L_0x0055
        L_0x0078:
            boolean r4 = r1.A04
            goto L_0x0049
        L_0x007b:
            X.RH6 r8 = X.RH6.A0h
            goto L_0x0013
        L_0x007e:
            boolean r1 = r0 instanceof com.facebookpay.paymentmethod.model.PayPalCredential
            if (r1 == 0) goto L_0x00be
            if (r30 == 0) goto L_0x00bb
            X.RH6 r8 = X.RH6.A07
        L_0x0086:
            r7 = 0
            com.facebookpay.paymentmethod.model.PayPalCredential r0 = (com.facebookpay.paymentmethod.model.PayPalCredential) r0
            java.lang.String r16 = r0.Asm()
            java.lang.String r17 = r0.getTitle()
            java.lang.String r18 = r0.getSubtitle()
            X.XRm r10 = X.C21267XRm.A08
            java.lang.String r22 = r0.BEP()
            java.lang.Integer r15 = X.Pxe.A0m()
        L_0x009f:
            java.lang.Integer r13 = X.AnonymousClass05K.A0N
            r25 = 1
            com.facebookpay.common.recyclerview.adapteritems.SelectionPaymentMethodItem r6 = new com.facebookpay.common.recyclerview.adapteritems.SelectionPaymentMethodItem
            r9 = r7
            r11 = r7
            r12 = r7
            r14 = r7
            r19 = r7
            r20 = r7
            r21 = r7
            r23 = r7
            r24 = r7
            r26 = r27
            r29 = r27
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            return r6
        L_0x00bb:
            X.RH6 r8 = X.RH6.A0h
            goto L_0x0086
        L_0x00be:
            boolean r1 = r0 instanceof com.facebookpay.paymentmethod.model.APMCredential
            if (r1 == 0) goto L_0x00da
            X.RH6 r8 = X.RH6.A07
            r7 = 0
            com.facebookpay.paymentmethod.model.APMCredential r0 = (com.facebookpay.paymentmethod.model.APMCredential) r0
            java.lang.String r16 = r0.Asm()
            java.lang.String r17 = r0.getTitle()
            java.lang.String r18 = r0.getSubtitle()
            X.XRm r10 = r0.A00
            java.lang.String r22 = r0.BEP()
            goto L_0x009f
        L_0x00da:
            java.lang.IllegalArgumentException r0 = X.Pxe.A0g()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SQ4.A00(com.facebookpay.paymentmethod.model.PaymentMethod, java.lang.Integer, boolean, boolean):com.facebookpay.common.recyclerview.adapteritems.SelectionPaymentMethodItem");
    }

    public static final ImmutableList A01(List list) {
        ImmutableList.Builder builder = ImmutableList.builder();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C7709QTy A0E = ((C7798QXj) it.next()).A0E();
            if (A0E != null) {
                C249803kO A0J = C66580MXl.A0J(A0E.getRequiredCompactedTreeListField(2, "available_card_types_v2", C7708QTx.class, 2089560051));
                while (A0J.hasNext()) {
                    builder.add(C11334SNo.A01(Pxi.A0g(C41845B3m.A0V(A0J).A01(BSr.class, -992342626), C8927RFv.UNSET_OR_UNRECOGNIZED_ENUM_VALUE, C66579MXk.A00(267), 4)));
                }
            }
        }
        return DbZ.A0K(builder);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0023, code lost:
        if (r7.length() == 0) goto L_0x0025;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A03(android.content.Context r8, X.QD8 r9, X.QDH r10) {
        /*
            boolean r0 = r10.A09()
            if (r0 == 0) goto L_0x0043
            r1 = 13
            X.SRc r0 = r9.A01(r1)
            if (r0 == 0) goto L_0x0043
            android.util.SparseArray r0 = r0.A0B()
            if (r0 == 0) goto L_0x0043
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r7 = r0.toString()
            if (r7 == 0) goto L_0x0025
            int r1 = r7.length()
            r0 = 0
            if (r1 != 0) goto L_0x0026
        L_0x0025:
            r0 = 1
        L_0x0026:
            java.lang.String r6 = "OTC_CREDIT_CARD_NUMBER"
            if (r0 == 0) goto L_0x0044
            X.6rJ r2 = r10.A07
            java.util.Map r0 = r2.A03
            r0.remove(r6)
            java.util.Map r0 = r2.A02
            java.lang.Object r1 = r0.remove(r6)
            X.QCo r1 = (X.C7423QCo) r1
            if (r1 == 0) goto L_0x003e
            r0 = 0
            r1.A00 = r0
        L_0x003e:
            java.util.Map r0 = r2.A01
            r0.remove(r6)
        L_0x0043:
            return
        L_0x0044:
            X.6rJ r5 = r10.A07
            r4 = 0
            r3 = 1
            X.0qQ.A0B(r7, r3)
            X.C11370SQb.A01(r8)
            java.security.KeyStore r0 = X.C11370SQb.A01
            if (r0 == 0) goto L_0x006f
            java.security.KeyPair r0 = X.C11370SQb.A00
            if (r0 == 0) goto L_0x006f
            javax.crypto.Cipher r1 = X.C11370SQb.A02
            if (r1 == 0) goto L_0x006f
            java.lang.String r2 = "cipher"
            java.security.PublicKey r0 = r0.getPublic()
            r1.init(r3, r0)
            javax.crypto.Cipher r1 = X.C11370SQb.A02
            if (r1 != 0) goto L_0x0077
            X.0qQ.A0F(r2)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x006f:
            java.lang.String r1 = "CryptographyUtil"
            java.lang.String r0 = "isCryptographyInitialized is false"
            X.0KC.A0C(r1, r0)
            goto L_0x0083
        L_0x0077:
            byte[] r0 = X.C66582MXn.A1a(r7)
            byte[] r0 = r1.doFinal(r0)
            java.lang.String r7 = X.Pxf.A0p(r0, r4)
        L_0x0083:
            r5.A01(r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SQ4.A03(android.content.Context, X.QD8, X.QDH):void");
    }
}
