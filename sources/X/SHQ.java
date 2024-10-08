package X;

import com.instagram.common.session.UserSession;
import java.util.List;
import java.util.Map;

public final class SHQ {
    public final C10319RqH A00;
    public final 1a8 A01 = new 1a8((C269794fh) null);
    public final 1a8 A02 = 1a8.A00();
    public final Map A03 = AnonymousClass7TE.A1E();

    public SHQ(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A00 = new C10319RqH(userSession);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00c8, code lost:
        if (r0 == null) goto L_0x00ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00fa, code lost:
        if (r0 != null) goto L_0x00fc;
     */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0122  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0184  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x018e  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0189 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(X.S1B r25, X.S1C r26, X.C13714Tfc r27, java.lang.String r28, java.lang.String r29, java.lang.String r30, java.util.List r31) {
        /*
            r24 = this;
            r0 = 0
            r3 = r28
            X.0qQ.A0B(r3, r0)
            r2 = 2
            r4 = r24
            X.1a8 r13 = r4.A02
            r22 = r31
            java.util.ArrayList r11 = X.AnonymousClass7TF.A0p(r22)
            java.util.Iterator r1 = r22.iterator()
        L_0x0015:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0029
            java.lang.Object r0 = r1.next()
            com.android.billingclient.api.Purchase r0 = (com.android.billingclient.api.Purchase) r0
            java.lang.String r0 = X.RWF.A00(r0)
            r11.add(r0)
            goto L_0x0015
        L_0x0029:
            X.1aS r0 = A00(r4, r3)
            X.RFg r15 = X.C8913RFg.IN_PROGRESS
            r19 = 0
            r21 = 112(0x70, float:1.57E-43)
            X.QP6 r14 = new X.QP6
            r17 = r30
            r18 = r11
            r20 = r19
            r16 = r3
            r14.<init>((X.C8913RFg) r15, (java.lang.String) r16, (java.lang.String) r17, (java.util.List) r18, (java.util.List) r19, (java.util.List) r20, (int) r21)
            r0.accept(r14)
            X.RqH r9 = r4.A00
            r6 = 1
            java.util.ArrayList r7 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r5 = r22.iterator()
        L_0x004e:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0065
            java.lang.Object r1 = r5.next()
            r0 = r1
            com.android.billingclient.api.Purchase r0 = (com.android.billingclient.api.Purchase) r0
            java.lang.String r0 = r0.A01()
            if (r0 == 0) goto L_0x004e
            r7.add(r1)
            goto L_0x004e
        L_0x0065:
            java.util.ArrayList r5 = X.AnonymousClass7TF.A0p(r7)
            java.util.Iterator r16 = r7.iterator()
        L_0x006d:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x01d6
            java.lang.Object r8 = r16.next()
            com.android.billingclient.api.Purchase r8 = (com.android.billingclient.api.Purchase) r8
            r7 = 0
            java.lang.String r0 = X.RWF.A00(r8)
            r1 = r25
            X.RRR r12 = r1.A00(r0)
            if (r12 == 0) goto L_0x01a4
            boolean r0 = r12 instanceof X.QYI
            if (r0 == 0) goto L_0x0196
            X.QYI r12 = (X.QYI) r12
            java.lang.String r1 = r12.A00
            if (r1 == 0) goto L_0x0196
            X.S74 r0 = r12.A01
            java.util.List r0 = r0.A04
            r14 = 0
            if (r0 == 0) goto L_0x0193
            java.util.Iterator r12 = r0.iterator()
        L_0x009b:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x0190
            java.lang.Object r10 = r12.next()
            r0 = r10
            X.Rx2 r0 = (X.C10724Rx2) r0
            java.lang.String r0 = r0.A01
            boolean r0 = X.0qQ.A0K(r0, r1)
            if (r0 == 0) goto L_0x009b
        L_0x00b0:
            X.Rx2 r10 = (X.C10724Rx2) r10
            if (r10 == 0) goto L_0x0193
            X.Rnb r0 = r10.A00
            java.util.List r0 = r0.A00
            java.lang.Object r12 = X.00k.A0J(r0)
            X.Rxn r12 = (X.C10769Rxn) r12
            if (r12 == 0) goto L_0x0193
            long r0 = r12.A02
            r14 = 10000(0x2710, double:4.9407E-320)
            long r0 = r0 / r14
            int r10 = (int) r0
            java.lang.String r0 = r12.A04
            if (r0 != 0) goto L_0x00cc
        L_0x00ca:
            java.lang.String r0 = ""
        L_0x00cc:
            X.N4G r1 = new X.N4G
            r1.<init>((int) r10, (java.lang.String) r0, (int) r6)
            X.2IV r10 = X.Pxe.A0R()
            int r0 = r1.A00
            java.lang.Integer r12 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "amount_in_hundredths"
            r10.A07(r12, r0)
            java.lang.String r1 = r1.A01
        L_0x00e2:
            java.lang.String r0 = "currency"
            r10.A09(r1, r0)
        L_0x00e7:
            org.json.JSONObject r1 = r8.A02
            java.lang.String r0 = "obfuscatedAccountId"
            java.lang.String r12 = r1.optString(r0)
            java.lang.String r0 = "obfuscatedProfileId"
            java.lang.String r0 = r1.optString(r0)
            if (r12 != 0) goto L_0x00fc
            r15 = r7
            if (r0 == 0) goto L_0x00fd
        L_0x00fc:
            r15 = r0
        L_0x00fd:
            X.2IV r12 = X.Pxe.A0R()
            java.lang.String r0 = "product_type"
            r12.A09(r3, r0)
            java.lang.String r14 = "GOOGLE"
            java.lang.String r0 = "platform"
            r12.A09(r14, r0)
            java.lang.String r14 = X.RWF.A00(r8)
            java.lang.String r0 = "external_product_id"
            r12.A09(r14, r0)
            java.lang.String r14 = r8.A00
            if (r14 == 0) goto L_0x018e
            int r0 = r14.length()
            if (r0 == 0) goto L_0x018e
            byte[] r0 = X.C66582MXn.A1a(r14)
            java.lang.String r14 = android.util.Base64.encodeToString(r0, r2)
        L_0x012a:
            java.lang.String r0 = "verification_data"
            r12.A09(r14, r0)
            java.lang.String r14 = r8.A01()
            java.lang.String r0 = "external_transaction_id"
            r12.A09(r14, r0)
            java.lang.String r14 = r8.A02()
            java.lang.String r0 = "external_purchase_token"
            r12.A09(r14, r0)
            java.lang.String r0 = "developerPayload"
            java.lang.String r14 = r1.optString(r0)
            java.lang.String r0 = "developer_payload"
            r12.A09(r14, r0)
            java.lang.String r8 = r8.A01
            java.lang.String r0 = "data_signature"
            r12.A09(r8, r0)
            if (r15 == 0) goto L_0x015d
            int r0 = r15.length()
            if (r0 <= 0) goto L_0x015d
            r7 = r15
        L_0x015d:
            java.lang.String r0 = "quote_id"
            r12.A09(r7, r0)
            java.lang.String r0 = X.Dbj.A02()
            r7 = r29
            r12.A09(r7, r0)
            java.lang.String r0 = "purchaseTime"
            long r0 = r1.optLong(r0)
            long r0 = X.AnonymousClass7TE.A0P(r0)
            int r7 = (int) r0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r7)
            java.lang.String r0 = "transaction_time"
            r12.A07(r1, r0)
            if (r10 == 0) goto L_0x0189
            java.lang.String r0 = "local_amount"
            r12.A06(r10, r0)
        L_0x0189:
            r5.add(r12)
            goto L_0x006d
        L_0x018e:
            r14 = 0
            goto L_0x012a
        L_0x0190:
            r10 = r14
            goto L_0x00b0
        L_0x0193:
            r10 = 0
            goto L_0x00ca
        L_0x0196:
            long r0 = r12.A01()
            r14 = 10000(0x2710, double:4.9407E-320)
            long r0 = r0 / r14
            int r10 = (int) r0
            java.lang.String r0 = r12.A04()
            goto L_0x00cc
        L_0x01a4:
            java.lang.String r0 = X.RWF.A00(r8)
            r1 = r26
            com.android.billingclient.api.SkuDetails r0 = r1.A00(r0)
            if (r0 == 0) goto L_0x01d3
            X.2IV r10 = X.Pxe.A0R()
            org.json.JSONObject r12 = r0.A00
            java.lang.String r0 = "price_amount_micros"
            long r0 = r12.optLong(r0)
            r14 = 10000(0x2710, double:4.9407E-320)
            long r0 = r0 / r14
            int r14 = (int) r0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r14)
            java.lang.String r0 = "amount_in_hundredths"
            r10.A07(r1, r0)
            java.lang.String r0 = "price_currency_code"
            java.lang.String r1 = r12.optString(r0)
            goto L_0x00e2
        L_0x01d3:
            r10 = r7
            goto L_0x00e7
        L_0x01d6:
            X.QNI r10 = new X.QNI
            r10.<init>()
            com.instagram.common.session.UserSession r7 = r9.A00
            java.lang.String r1 = r7.A06
            java.lang.String r0 = "actor_id"
            r10.A07(r1, r0)
            java.lang.String r1 = X.AnonymousClass7TF.A0b()
            java.lang.String r0 = "client_mutation_id"
            r10.A07(r1, r0)
            java.lang.String r0 = "digital_content_purchases"
            r10.A05(r0, r5)
            X.3Fb r8 = new X.3Fb
            r8.<init>(r7)
            X.2IS r7 = X.C41845B3m.A04()
            java.lang.String r0 = "input"
            r7.A00(r10, r0)
            java.lang.Class<X.QNL> r5 = X.QNL.class
            java.lang.String r1 = "CreateDigitalContentPurchasedMutation"
            X.3Fa r0 = new X.3Fa
            r0.<init>(r7, r5, r1, r6)
            r8.A08(r0)
            X.1OC r0 = r8.A06()
            X.1aU r1 = X.C69818Nsf.A00(r0)
            X.T7L r0 = new X.T7L
            r18 = r0
            r19 = r4
            r20 = r3
            r21 = r17
            r23 = r11
            r18.<init>(r19, r20, r21, r22, r23)
            X.1aU r1 = r1.A0L(r0)
            X.T8o r0 = new X.T8o
            r3 = r27
            r0.<init>(r3, r2)
            r13.A02(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SHQ.A01(X.S1B, X.S1C, X.Tfc, java.lang.String, java.lang.String, java.lang.String, java.util.List):void");
    }

    public static final AnonymousClass1aS A00(SHQ shq, String str) {
        Map map = shq.A03;
        String str2 = str;
        if (!map.containsKey(str)) {
            AnonymousClass1aS A012 = 1aF.A01(new QP6(C8913RFg.INIT, str2, (String) null, (List) null, (List) null, (List) null, 124));
            shq.A01.A02(A012, new C12818T8n());
            map.put(str, A012);
        }
        Object obj = map.get(str);
        0qQ.A0A(obj);
        return (AnonymousClass1aS) obj;
    }
}
