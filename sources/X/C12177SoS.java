package X;

import android.content.Context;
import com.google.android.gms.common.GoogleApiAvailability;
import java.util.Map;

/* renamed from: X.SoS  reason: case insensitive filesystem */
public final class C12177SoS implements C13888TjB {
    public String A00 = C2818159r.A01();
    public String A01;
    public final int A02;
    public final C10221Roc A03;
    public final C64063LLh A04;
    public final String A05;

    private final QI2 A00(String str) {
        0bb r4 = new 0bb();
        r4.A01(RIe.CATALOG, "dcp_flow");
        r4.A00.put("dcp_platform", 71);
        Boolean A0u = AnonymousClass7TE.A0u();
        r4.A03("is_retry", A0u);
        r4.A01(RIi.QUOTE, "dcp_sub_flow");
        r4.A06("app", this.A05);
        r4.A03("is_retry", A0u);
        r4.A06("external_product_id", str);
        return r4;
    }

    private final QI3 A01(Boolean bool, String str, String str2, String str3, String str4, String str5, String str6) {
        Long A10;
        0bb r2 = new 0bb();
        r2.A01(RIe.PURCHASE, "dcp_flow");
        r2.A01(RIi.FULFILLMENT, "dcp_sub_flow");
        r2.A06("app", this.A05);
        r2.A06("external_transaction_id", str);
        if (bool != null) {
            r2.A03("is_retry", Boolean.valueOf(bool.booleanValue()));
        }
        A06(r2, str2, str4);
        if (!(str5 == null || (A10 = AnonymousClass7TE.A10(str5)) == null)) {
            r2.A05("product_id", A10);
        }
        if (str6 != null) {
            r2.A05("quote_id", DbV.A0q(str6));
        }
        if (!(str3 == null || str3.length() == 0)) {
            r2.A05("internal_transaction_id", DbV.A0q(str3));
        }
        return r2;
    }

    private final QI4 A02(String str, String str2, String str3, String str4, String str5, String str6, boolean z) {
        Long A10;
        0bb r2 = new 0bb();
        r2.A01(RIe.PURCHASE, "dcp_flow");
        r2.A03("is_retry", Boolean.valueOf(z));
        r2.A01(RIi.QUOTE, "dcp_sub_flow");
        r2.A06("app", this.A05);
        A06(r2, str, str2);
        if (!(str3 == null || (A10 = AnonymousClass7TE.A10(str3)) == null)) {
            r2.A05("product_id", A10);
        }
        if (str4 != null) {
            r2.A05("quote_id", DbV.A0q(str4));
        }
        if (str5 != null) {
            r2.A06("external_transaction_id", str5);
        }
        if (str6 != null) {
            r2.A05("internal_transaction_id", DbV.A0q(str6));
        }
        return r2;
    }

    private final QI5 A03(RIi rIi, EZM ezm, Boolean bool, String str, String str2, String str3, String str4, String str5, String str6) {
        Long A10;
        0bb r2 = new 0bb();
        r2.A01(RIe.PURCHASE, "dcp_flow");
        r2.A01(rIi, "dcp_sub_flow");
        r2.A06("app", this.A05);
        r2.A06("external_transaction_id", str);
        if (bool != null) {
            r2.A03("is_retry", Boolean.valueOf(bool.booleanValue()));
        }
        A06(r2, str2, str4);
        if (!(str5 == null || (A10 = AnonymousClass7TE.A10(str5)) == null)) {
            r2.A05("product_id", A10);
        }
        if (str6 != null) {
            r2.A05("quote_id", DbV.A0q(str6));
        }
        if (ezm != null) {
            r2.A01(ezm, "target_name");
        }
        if (!(str3 == null || str3.length() == 0)) {
            r2.A05("internal_transaction_id", DbV.A0q(str3));
        }
        return r2;
    }

    private final QI6 A04(String str, String str2, String str3, String str4) {
        Long A10;
        0bb r4 = new 0bb();
        r4.A01(RIe.PURCHASE, "dcp_flow");
        Boolean A0u = AnonymousClass7TE.A0u();
        r4.A03("is_retry", A0u);
        r4.A06("app", this.A05);
        r4.A01(RIi.QUOTE, "dcp_sub_flow");
        r4.A03("is_retry", A0u);
        A06(r4, str, str2);
        if (!(str3 == null || (A10 = AnonymousClass7TE.A10(str3)) == null)) {
            r4.A05("product_id", A10);
        }
        if (str4 != null) {
            r4.A05("quote_id", DbV.A0q(str4));
        }
        return r4;
    }

    public static void A06(0bb r2, String str, String str2) {
        Long A0n;
        r2.A06("external_product_id", str);
        if (str2 != null && (A0n = 00y.A0n(10, str2)) != null) {
            r2.A05("payee_id", A0n);
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x030f, code lost:
        if (r5.equals("client_create_dcppayment_success") == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0311, code lost:
        r5 = A03(X.RIi.PAYMENT, (X.EZM) null, (java.lang.Boolean) null, r12, r13, r14, r15, r3, r2);
        r2 = r8.A03;
        A05(r1, X.C51969G9p.A0d(r2.A00, "client_create_dcppayment_success"), r5, r8.A00, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x032a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x032b, code lost:
        r2 = "client_execute_iap_store_acknowledge_purchases_fail";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x032f, code lost:
        r2 = "client_execute_iap_store_acknowledge_purchases_init";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0333, code lost:
        r2 = "client_execute_iap_store_query_product_details_success";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0337, code lost:
        r2 = "client_execute_iap_store_launch_billing_flow_success";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x033b, code lost:
        r2 = "client_execute_iap_store_query_purchase_hist_success";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x033f, code lost:
        r2 = "client_execute_iap_store_launch_billing_flow_fail";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0343, code lost:
        r2 = "client_execute_iap_store_launch_billing_flow_init";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0347, code lost:
        r2 = "client_execute_iap_store_consume_success";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x034b, code lost:
        r2 = "client_load_iap_store_purchases_fail";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x034f, code lost:
        r2 = "client_load_iap_store_purchases_init";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0353, code lost:
        r2 = "client_init_iap_store_connection_fail";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0357, code lost:
        r2 = "client_init_iap_store_connection_init";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0361, code lost:
        if (r5.equals("client_verify_dcppayment_success") == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0363, code lost:
        r5 = A03(X.RIi.FULFILLMENT, (X.EZM) null, java.lang.Boolean.valueOf(r23), r12, r13, r14, r15, r3, r2);
        r2 = r8.A03;
        A05(r1, X.C51969G9p.A0d(r2.A00, "client_verify_dcppayment_success"), r5, r8.A00, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x037f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x0380, code lost:
        r2 = "client_execute_iap_store_query_product_details_fail";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x0384, code lost:
        r2 = "client_execute_iap_store_query_product_details_init";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0388, code lost:
        r2 = "client_execute_iap_store_start_connection_fail";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x038c, code lost:
        r2 = "client_execute_iap_store_start_connection_init";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x0396, code lost:
        if (r5.equals("client_execute_dcpiap_fail") == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x0398, code lost:
        r5 = A02(r13, r15, r3, r2, (java.lang.String) null, (java.lang.String) null, false);
        r2 = r8.A03;
        r4 = r8.A00;
        r3 = X.C51969G9p.A0d(r2.A00, "client_execute_dcpiap_fail");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x03b3, code lost:
        if (r3.isSampled() == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x03b5, code lost:
        X.JTU.A0t(X.Pxg.A0P(r1, r3, X.Q2N.A00(), r4), r3, r5);
        r3.A9H("extra_data", r0);
        r1 = X.DbS.A0r(X.RH0.A0s.A00, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x03cd, code lost:
        if (r1 != null) goto L_0x03d1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x03cf, code lost:
        r1 = "FIX no error message provided";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x03d1, code lost:
        r3.AAJ("error_message", r1);
        r3.Cgf();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x03d9, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x03e0, code lost:
        if (r5.equals("client_execute_dcpiap_init") == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x03e2, code lost:
        r4 = A02(r13, r15, r3, r2, (java.lang.String) null, (java.lang.String) null, false);
        r2 = r8.A03;
        A05(r1, X.C51969G9p.A0d(r2.A00, "client_execute_dcpiap_init"), r4, r8.A00, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x03fc, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x03fd, code lost:
        r2 = "client_execute_iap_store_query_sku_details_success";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x0401, code lost:
        r2 = "client_execute_iap_store_query_purchases_success";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x040b, code lost:
        if (r5.equals("client_fetch_dcpcatalog_success") == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x040d, code lost:
        r4 = A00(r13);
        r2 = r8.A03;
        A05(r1, X.C51969G9p.A0d(r2.A00, "client_fetch_dcpcatalog_success"), r4, r8.A00, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x041e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x041f, code lost:
        r2 = "client_execute_iap_store_query_sku_details_fail";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x0423, code lost:
        r2 = "client_execute_iap_store_query_sku_details_init";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x042d, code lost:
        if (r5.equals("client_create_iap_synchronize_success") == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x042f, code lost:
        r5 = new X.0bb();
        r5.A06(com.facebook.proxygen.TraceFieldType.RequestID, r6);
        r5.A07("external_transaction_ids", r4);
        r2 = r8.A03;
        A05(r1, X.C51969G9p.A0d(r2.A00, "client_create_iapsynchronize_success"), r5, r8.A00, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x044e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0048, code lost:
        r5 = X.DbU.A1b(X.DbV.A18(r13, "."), 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x0455, code lost:
        if (r5.equals("client_execute_dcpiap_success") == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x0457, code lost:
        r4 = A02(r13, r15, r3, r2, r12, r14, r23);
        r2 = r8.A03;
        A05(r1, X.C51969G9p.A0d(r2.A00, "client_execute_dcpiap_success"), r4, r8.A00, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x0476, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x047d, code lost:
        if (r5.equals("client_create_dcpquote_fail") == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x047f, code lost:
        r5 = A04(r13, r15, r3, r2);
        r2 = r8.A03;
        r4 = r8.A00;
        r3 = X.C51969G9p.A0d(r2.A00, "client_create_dcpquote_fail");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x0491, code lost:
        if (r3.isSampled() == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x0493, code lost:
        X.JTU.A0t(X.Pxg.A0P(r1, r3, X.Q2N.A00(), r4), r3, r5);
        r3.A9H("extra_data", r0);
        r2 = X.DbS.A0r(X.RH0.A0s.A00, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x04ab, code lost:
        if (r2 != null) goto L_0x04af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x04ad, code lost:
        r2 = "FIX no error message provided";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x04af, code lost:
        r3.AAJ("error_message", r2);
        r1 = X.DbS.A0r(X.RH0.A0T.A00, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x04bc, code lost:
        if (r1 != null) goto L_0x04c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x04be, code lost:
        r1 = "FIX no error stack trace provided";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x04c0, code lost:
        r3.AAJ("error_stacktrace", r1);
        r3.Cgf();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x04c8, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x04cf, code lost:
        if (r5.equals("client_create_dcpquote_init") == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x04d1, code lost:
        r4 = A04(r13, r15, r3, r2);
        r2 = r8.A03;
        A05(r1, X.C51969G9p.A0d(r2.A00, "client_create_dcpquote_init"), r4, r8.A00, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x04e2, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x04e3, code lost:
        r2 = "client_execute_iap_store_start_connection_success";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x04e9, code lost:
        if (r5.equals(r2) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x04eb, code lost:
        r6 = new X.0bb();
        r6.A06("debug_step", r5);
        r2 = r8.A03;
        A05(r1, X.C51969G9p.A0d(r2.A00, "client_add_debug_atomic"), r6, r8.A00, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x0504, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x050b, code lost:
        if (r3.equals("AVATAR_CONTENT") == false) goto L_0x0069;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x0515, code lost:
        if (r3.equals("NME_SUBSCRIPTION") == false) goto L_0x0069;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x051f, code lost:
        if (r3.equals("INSTAGRAM_FAN_SUBS") == false) goto L_0x0069;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x0529, code lost:
        if (r3.equals("INSTAGRAM_USERPAY_BADGES") == false) goto L_0x0069;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x0533, code lost:
        if (r3.equals("NFT") == false) goto L_0x0069;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x053d, code lost:
        if (r3.equals("MV4B") == false) goto L_0x0069;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x0547, code lost:
        if (r3.equals("AFS_SUBSCRIPTION") == false) goto L_0x0069;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x0551, code lost:
        if (r3.equals("INSTAGRAM_CONTENT_APPRECIATION") == false) goto L_0x0069;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x055f, code lost:
        if (r4.equals(r1) == false) goto L_0x0062;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x0563, code lost:
        r1 = X.2M7.A0B;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x056d, code lost:
        if (r4.equals("afs") == false) goto L_0x0062;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x0571, code lost:
        r1 = X.2M7.A06;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x057c, code lost:
        if (r4.equals("nme") == false) goto L_0x0062;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x0580, code lost:
        r1 = X.2M7.A0E;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x058b, code lost:
        if (r4.equals("mv4b") == false) goto L_0x0062;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x058f, code lost:
        r1 = X.2M7.A0C;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x0599, code lost:
        if (r4.equals("fan_subs") == false) goto L_0x0062;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x059d, code lost:
        r1 = X.2M7.A0A;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x05a7, code lost:
        if (r4.equals("avatar_content") == false) goto L_0x0062;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x05ab, code lost:
        r1 = X.2M7.A08;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0069, code lost:
        r1 = X.2M7.A07;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x05b9, code lost:
        if (r4.equals(X.AnonymousClass000.A00(1217)) == false) goto L_0x0062;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:0x05bd, code lost:
        r1 = X.2M7.A09;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x05c7, code lost:
        if (r4.equals("digital_collectibles") == false) goto L_0x0062;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:0x05cb, code lost:
        r1 = X.2M7.A0D;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x006b, code lost:
        r6 = (java.lang.String) r0.remove(X.RH0.A0t.A00);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0075, code lost:
        if (r6 != null) goto L_0x0079;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:231:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:233:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:235:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0077, code lost:
        r6 = r8.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:240:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0079, code lost:
        r3 = (java.lang.String) r0.remove(X.RH0.A0k.A00);
        r15 = (java.lang.String) r0.remove(X.RH0.A0g.A00);
        r4 = (java.lang.String) r0.remove(X.RH0.A0V.A00);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0097, code lost:
        if (r4 == null) goto L_0x009a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0099, code lost:
        r12 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x009a, code lost:
        r4 = (java.util.List) r2.remove(X.RH0.A0W.A00);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00a4, code lost:
        if (r4 != null) goto L_0x00a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00a6, code lost:
        r4 = X.0sn.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00a8, code lost:
        r14 = (java.lang.String) r0.remove(X.RH0.A0Q.A00);
        r2 = (java.lang.String) r0.remove(X.RH0.A0r.A00);
        r23 = X.0qQ.A0K(r0.remove(X.RH0.A0d.A00), "true");
        r5 = r27;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00d1, code lost:
        switch(r5.hashCode()) {
            case -1886037575: goto L_0x00d5;
            case -1885935701: goto L_0x00f7;
            case -1878263884: goto L_0x0119;
            case -1878162010: goto L_0x013f;
            case -1767198480: goto L_0x0165;
            case -1563016834: goto L_0x0169;
            case -1517050058: goto L_0x0183;
            case -1516948184: goto L_0x01a8;
            case -1511210337: goto L_0x01cd;
            case -1447349844: goto L_0x01f9;
            case -1444229924: goto L_0x01fd;
            case -1444128050: goto L_0x0235;
            case -1401752681: goto L_0x024f;
            case -1401650807: goto L_0x0253;
            case -1353941419: goto L_0x0257;
            case -1310920604: goto L_0x027b;
            case -1310818730: goto L_0x027f;
            case -1305915475: goto L_0x0283;
            case -1144777565: goto L_0x02a9;
            case -1144675691: goto L_0x02d1;
            case -1130280212: goto L_0x02f9;
            case -1113130718: goto L_0x02fd;
            case -1051805723: goto L_0x0301;
            case -1051703849: goto L_0x0305;
            case -963710072: goto L_0x0309;
            case -959916719: goto L_0x032b;
            case -959814845: goto L_0x032f;
            case -690674500: goto L_0x0333;
            case -470395649: goto L_0x0337;
            case -427580182: goto L_0x033b;
            case -312261726: goto L_0x033f;
            case -312159852: goto L_0x0343;
            case -278570755: goto L_0x0347;
            case -175477227: goto L_0x034b;
            case -175375353: goto L_0x034f;
            case 244501087: goto L_0x0353;
            case 244602961: goto L_0x0357;
            case 722098411: goto L_0x035b;
            case 832296197: goto L_0x0380;
            case 832398071: goto L_0x0384;
            case 849973887: goto L_0x0388;
            case 850075761: goto L_0x038c;
            case 900714296: goto L_0x0390;
            case 900816170: goto L_0x03da;
            case 945318890: goto L_0x03fd;
            case 956618204: goto L_0x0401;
            case 1148225925: goto L_0x0405;
            case 1160481943: goto L_0x041f;
            case 1160583817: goto L_0x0423;
            case 1486379102: goto L_0x0427;
            case 1738414505: goto L_0x044f;
            case 1892925315: goto L_0x0477;
            case 1893027189: goto L_0x04c9;
            case 1959378178: goto L_0x04e3;
            default: goto L_0x00d4;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00db, code lost:
        if (r5.equals("client_create_dcppayment_fail") == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00dd, code lost:
        r5 = A03(X.RIi.PAYMENT, (X.EZM) null, (java.lang.Boolean) null, r12, r13, r14, r15, r3, r2);
        r2 = r8.A03;
        A05(r1, X.C51969G9p.A0d(r2.A00, "client_create_dcppayment_fail"), r5, r8.A00, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00f6, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00fd, code lost:
        if (r5.equals("client_create_dcppayment_init") == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00ff, code lost:
        r5 = A03(X.RIi.PAYMENT, (X.EZM) null, (java.lang.Boolean) null, r12, r13, r14, r15, r3, r2);
        r2 = r8.A03;
        A05(r1, X.C51969G9p.A0d(r2.A00, "client_create_dcppayment_init"), r5, r8.A00, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0118, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x011f, code lost:
        if (r5.equals("client_create_dcp_external_confirm_fail") == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0121, code lost:
        r5 = A01(java.lang.Boolean.valueOf(r23), r12, r13, r14, r15, r3, r2);
        r2 = r8.A03;
        A05(r1, X.C51969G9p.A0d(r2.A00, "client_notify_dcpexternalconfirm_fail"), r5, r8.A00, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x013e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0145, code lost:
        if (r5.equals("client_create_dcp_external_confirm_init") == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0147, code lost:
        r5 = A01(java.lang.Boolean.valueOf(r23), r12, r13, r14, r15, r3, r2);
        r2 = r8.A03;
        A05(r1, X.C51969G9p.A0d(r2.A00, "client_notify_dcpexternalconfirm_init"), r5, r8.A00, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0164, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0165, code lost:
        r2 = "client_execute_iap_store_acknowledge_purchases_success";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x016f, code lost:
        if (r5.equals("client_create_dcpquote_success") == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0171, code lost:
        r4 = A04(r13, r15, r3, r2);
        r2 = r8.A03;
        A05(r1, X.C51969G9p.A0d(r2.A00, "client_create_dcpquote_success"), r4, r8.A00, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0182, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0189, code lost:
        if (r5.equals("client_verify_dcppayment_fail") == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x018b, code lost:
        r5 = A03(X.RIi.FULFILLMENT, (X.EZM) null, java.lang.Boolean.valueOf(r23), r12, r13, r14, r15, r3, r2);
        r2 = r8.A03;
        A05(r1, X.C51969G9p.A0d(r2.A00, "client_verify_dcppayment_fail"), r5, r8.A00, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x01a7, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x01ae, code lost:
        if (r5.equals("client_verify_dcppayment_init") == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x01b0, code lost:
        r5 = A03(X.RIi.FULFILLMENT, (X.EZM) null, java.lang.Boolean.valueOf(r23), r12, r13, r14, r15, r3, r2);
        r2 = r8.A03;
        A05(r1, X.C51969G9p.A0d(r2.A00, "client_verify_dcppayment_init"), r5, r8.A00, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x01cc, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x01d3, code lost:
        if (r5.equals("client_create_iap_external_confirm_warning") == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x01d5, code lost:
        r7 = r8.A03;
        r5 = r8.A00;
        r4 = new X.0bb();
        r4.A06(com.facebook.proxygen.TraceFieldType.RequestID, r6);
        r4.A03("is_retry", java.lang.Boolean.valueOf(r23));
        A05(r1, X.C51969G9p.A0d(r7.A00, "client_create_iapexternalconfirm_warning"), r4, r5, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x01f8, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x01f9, code lost:
        r2 = "client_load_iap_store_purchases_success";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0203, code lost:
        if (r5.equals("client_fetch_dcpcatalog_fail") == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0205, code lost:
        r5 = A00(r13);
        r2 = r8.A03;
        r4 = r8.A00;
        r3 = X.C51969G9p.A0d(r2.A00, "client_fetch_dcpcatalog_fail");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0217, code lost:
        if (r3.isSampled() == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0219, code lost:
        X.JTU.A0t(X.Pxg.A0P(r1, r3, X.Q2N.A00(), r4), r3, r5);
        r3.A9H("extra_data", r0);
        r1 = X.DbS.A0r(X.RH0.A0s.A00, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0231, code lost:
        if (r1 != null) goto L_0x03d1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x023b, code lost:
        if (r5.equals("client_fetch_dcpcatalog_init") == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x023d, code lost:
        r4 = A00(r13);
        r2 = r8.A03;
        A05(r1, X.C51969G9p.A0d(r2.A00, "client_fetch_dcpcatalog_init"), r4, r8.A00, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x024e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x024f, code lost:
        r2 = "client_execute_iap_store_query_purchase_hist_fail";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0253, code lost:
        r2 = "client_execute_iap_store_query_purchase_hist_init";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x025e, code lost:
        if (r5.equals("user_create_dcppayment_cancel") == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0260, code lost:
        r5 = A03(X.RIi.PAYMENT, X.EZM.A02, (java.lang.Boolean) null, r12, r13, r14, r15, r3, r2);
        r2 = r8.A03;
        A05(r1, X.C51969G9p.A0d(r2.A00, "user_create_dcppayment_cancel"), r5, r8.A00, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x027a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x027b, code lost:
        r2 = "client_execute_iap_store_consume_fail";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x027f, code lost:
        r2 = "client_execute_iap_store_consume_init";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0289, code lost:
        if (r5.equals("client_create_dcp_external_confirm_success") == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x028b, code lost:
        r5 = A01(java.lang.Boolean.valueOf(r23), r12, r13, r14, r15, r3, r2);
        r2 = r8.A03;
        A05(r1, X.C51969G9p.A0d(r2.A00, "client_notify_dcpexternalconfirm_success"), r5, r8.A00, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x02a8, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x02af, code lost:
        if (r5.equals("client_create_iap_synchronize_fail") == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x02b1, code lost:
        r5 = new X.0bb();
        r5.A06(com.facebook.proxygen.TraceFieldType.RequestID, r6);
        r5.A07("external_transaction_ids", r4);
        r2 = r8.A03;
        A05(r1, X.C51969G9p.A0d(r2.A00, "client_create_iapsynchronize_fail"), r5, r8.A00, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x02d0, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x02d7, code lost:
        if (r5.equals("client_create_iap_synchronize_init") == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x02d9, code lost:
        r5 = new X.0bb();
        r5.A06(com.facebook.proxygen.TraceFieldType.RequestID, r6);
        r5.A07("external_transaction_ids", r4);
        r2 = r8.A03;
        A05(r1, X.C51969G9p.A0d(r2.A00, "client_create_iapsynchronize_init"), r5, r8.A00, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x02f8, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x02f9, code lost:
        r2 = "client_init_iap_store_connection_stopped";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x02fd, code lost:
        r2 = "client_init_iap_store_connection_success";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0301, code lost:
        r2 = "client_execute_iap_store_query_purchases_fail";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0305, code lost:
        r2 = "client_execute_iap_store_query_purchases_init";
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Cgp(java.util.Map r25, java.util.Map r26, java.lang.String r27) {
        /*
            r24 = this;
            r1 = r25
            if (r25 == 0) goto L_0x05d5
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>(r1)
        L_0x0009:
            X.RH0 r1 = X.RH0.A0Y
            java.lang.String r2 = r1.A00
            r8 = r24
            int r1 = r8.A02
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r0.put(r2, r1)
            r1 = r26
            if (r26 == 0) goto L_0x05cf
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>(r1)
        L_0x0021:
            X.RH0 r1 = X.RH0.A0n
            java.lang.String r1 = r1.A00
            java.lang.Object r3 = r0.remove(r1)
            java.lang.String r3 = (java.lang.String) r3
            if (r3 != 0) goto L_0x002f
            java.lang.String r3 = r8.A01
        L_0x002f:
            X.RH0 r1 = X.RH0.A0U
            java.lang.String r1 = r1.A00
            java.lang.Object r13 = r0.remove(r1)
            java.lang.String r13 = (java.lang.String) r13
            java.lang.String r12 = ""
            if (r13 != 0) goto L_0x003e
            r13 = r12
        L_0x003e:
            java.lang.String r3 = X.DbY.A0k(r3)
            int r1 = r13.length()
            if (r1 == 0) goto L_0x0062
            r4 = 0
            java.lang.String r1 = "."
            java.util.List r1 = X.DbV.A18(r13, r1)
            java.lang.String[] r5 = X.DbU.A1b(r1, r4)
            int r4 = r5.length
            r1 = 4
            if (r4 < r1) goto L_0x0062
            int r1 = r4 + -2
            r4 = r5[r1]
            int r1 = r4.hashCode()
            switch(r1) {
                case -1396647632: goto L_0x0555;
                case -188385773: goto L_0x0558;
                case 96494: goto L_0x0567;
                case 109190: goto L_0x0575;
                case 3362327: goto L_0x0584;
                case 807021535: goto L_0x0593;
                case 1123234707: goto L_0x05a1;
                case 1487109569: goto L_0x05af;
                case 1919073854: goto L_0x05c1;
                default: goto L_0x0062;
            }
        L_0x0062:
            int r1 = r3.hashCode()
            switch(r1) {
                case -1122126989: goto L_0x0505;
                case -1018391978: goto L_0x050f;
                case -465335796: goto L_0x0519;
                case -79900897: goto L_0x0523;
                case 77212: goto L_0x052d;
                case 2378231: goto L_0x0537;
                case 872770798: goto L_0x0541;
                case 1711011950: goto L_0x054b;
                default: goto L_0x0069;
            }
        L_0x0069:
            X.2M7 r1 = X.2M7.A07
        L_0x006b:
            X.RH0 r3 = X.RH0.A0t
            java.lang.String r3 = r3.A00
            java.lang.Object r6 = r0.remove(r3)
            java.lang.String r6 = (java.lang.String) r6
            if (r6 != 0) goto L_0x0079
            java.lang.String r6 = r8.A00
        L_0x0079:
            X.RH0 r3 = X.RH0.A0k
            java.lang.String r3 = r3.A00
            java.lang.Object r3 = r0.remove(r3)
            java.lang.String r3 = (java.lang.String) r3
            X.RH0 r4 = X.RH0.A0g
            java.lang.String r4 = r4.A00
            java.lang.Object r15 = r0.remove(r4)
            java.lang.String r15 = (java.lang.String) r15
            X.RH0 r4 = X.RH0.A0V
            java.lang.String r4 = r4.A00
            java.lang.Object r4 = r0.remove(r4)
            java.lang.String r4 = (java.lang.String) r4
            if (r4 == 0) goto L_0x009a
            r12 = r4
        L_0x009a:
            X.RH0 r4 = X.RH0.A0W
            java.lang.String r4 = r4.A00
            java.lang.Object r4 = r2.remove(r4)
            java.util.List r4 = (java.util.List) r4
            if (r4 != 0) goto L_0x00a8
            X.0sn r4 = X.0sn.A00
        L_0x00a8:
            X.RH0 r2 = X.RH0.A0Q
            java.lang.String r2 = r2.A00
            java.lang.Object r14 = r0.remove(r2)
            java.lang.String r14 = (java.lang.String) r14
            X.RH0 r2 = X.RH0.A0r
            java.lang.String r2 = r2.A00
            java.lang.Object r2 = r0.remove(r2)
            java.lang.String r2 = (java.lang.String) r2
            X.RH0 r5 = X.RH0.A0d
            java.lang.String r5 = r5.A00
            java.lang.Object r7 = r0.remove(r5)
            java.lang.String r5 = "true"
            boolean r23 = X.0qQ.A0K(r7, r5)
            r5 = r27
            int r7 = r5.hashCode()
            switch(r7) {
                case -1886037575: goto L_0x00d5;
                case -1885935701: goto L_0x00f7;
                case -1878263884: goto L_0x0119;
                case -1878162010: goto L_0x013f;
                case -1767198480: goto L_0x0165;
                case -1563016834: goto L_0x0169;
                case -1517050058: goto L_0x0183;
                case -1516948184: goto L_0x01a8;
                case -1511210337: goto L_0x01cd;
                case -1447349844: goto L_0x01f9;
                case -1444229924: goto L_0x01fd;
                case -1444128050: goto L_0x0235;
                case -1401752681: goto L_0x024f;
                case -1401650807: goto L_0x0253;
                case -1353941419: goto L_0x0257;
                case -1310920604: goto L_0x027b;
                case -1310818730: goto L_0x027f;
                case -1305915475: goto L_0x0283;
                case -1144777565: goto L_0x02a9;
                case -1144675691: goto L_0x02d1;
                case -1130280212: goto L_0x02f9;
                case -1113130718: goto L_0x02fd;
                case -1051805723: goto L_0x0301;
                case -1051703849: goto L_0x0305;
                case -963710072: goto L_0x0309;
                case -959916719: goto L_0x032b;
                case -959814845: goto L_0x032f;
                case -690674500: goto L_0x0333;
                case -470395649: goto L_0x0337;
                case -427580182: goto L_0x033b;
                case -312261726: goto L_0x033f;
                case -312159852: goto L_0x0343;
                case -278570755: goto L_0x0347;
                case -175477227: goto L_0x034b;
                case -175375353: goto L_0x034f;
                case 244501087: goto L_0x0353;
                case 244602961: goto L_0x0357;
                case 722098411: goto L_0x035b;
                case 832296197: goto L_0x0380;
                case 832398071: goto L_0x0384;
                case 849973887: goto L_0x0388;
                case 850075761: goto L_0x038c;
                case 900714296: goto L_0x0390;
                case 900816170: goto L_0x03da;
                case 945318890: goto L_0x03fd;
                case 956618204: goto L_0x0401;
                case 1148225925: goto L_0x0405;
                case 1160481943: goto L_0x041f;
                case 1160583817: goto L_0x0423;
                case 1486379102: goto L_0x0427;
                case 1738414505: goto L_0x044f;
                case 1892925315: goto L_0x0477;
                case 1893027189: goto L_0x04c9;
                case 1959378178: goto L_0x04e3;
                default: goto L_0x00d4;
            }
        L_0x00d4:
            return
        L_0x00d5:
            java.lang.String r4 = "client_create_dcppayment_fail"
            boolean r5 = r5.equals(r4)
            if (r5 == 0) goto L_0x00d4
            X.RIi r9 = X.RIi.PAYMENT
            r10 = 0
            r11 = r10
            r16 = r3
            r17 = r2
            X.QI5 r5 = r8.A03(r9, r10, r11, r12, r13, r14, r15, r16, r17)
            X.Roc r2 = r8.A03
            java.lang.String r3 = r8.A00
            X.0Ae r2 = r2.A00
            X.0Aj r2 = X.C51969G9p.A0d(r2, r4)
            A05(r1, r2, r5, r3, r0)
            return
        L_0x00f7:
            java.lang.String r4 = "client_create_dcppayment_init"
            boolean r5 = r5.equals(r4)
            if (r5 == 0) goto L_0x00d4
            X.RIi r9 = X.RIi.PAYMENT
            r10 = 0
            r11 = r10
            r16 = r3
            r17 = r2
            X.QI5 r5 = r8.A03(r9, r10, r11, r12, r13, r14, r15, r16, r17)
            X.Roc r2 = r8.A03
            java.lang.String r3 = r8.A00
            X.0Ae r2 = r2.A00
            X.0Aj r2 = X.C51969G9p.A0d(r2, r4)
            A05(r1, r2, r5, r3, r0)
            return
        L_0x0119:
            java.lang.String r4 = "client_create_dcp_external_confirm_fail"
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L_0x00d4
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r23)
            r10 = r12
            r11 = r13
            r12 = r14
            r13 = r15
            r14 = r3
            r15 = r2
            X.QI3 r5 = r8.A01(r9, r10, r11, r12, r13, r14, r15)
            X.Roc r2 = r8.A03
            java.lang.String r4 = r8.A00
            X.0Ae r3 = r2.A00
            java.lang.String r2 = "client_notify_dcpexternalconfirm_fail"
            X.0Aj r2 = X.C51969G9p.A0d(r3, r2)
            A05(r1, r2, r5, r4, r0)
            return
        L_0x013f:
            java.lang.String r4 = "client_create_dcp_external_confirm_init"
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L_0x00d4
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r23)
            r10 = r12
            r11 = r13
            r12 = r14
            r13 = r15
            r14 = r3
            r15 = r2
            X.QI3 r5 = r8.A01(r9, r10, r11, r12, r13, r14, r15)
            X.Roc r2 = r8.A03
            java.lang.String r4 = r8.A00
            X.0Ae r3 = r2.A00
            java.lang.String r2 = "client_notify_dcpexternalconfirm_init"
            X.0Aj r2 = X.C51969G9p.A0d(r3, r2)
            A05(r1, r2, r5, r4, r0)
            return
        L_0x0165:
            java.lang.String r2 = "client_execute_iap_store_acknowledge_purchases_success"
            goto L_0x04e5
        L_0x0169:
            java.lang.String r6 = "client_create_dcpquote_success"
            boolean r4 = r5.equals(r6)
            if (r4 == 0) goto L_0x00d4
            X.QI6 r4 = r8.A04(r13, r15, r3, r2)
            X.Roc r2 = r8.A03
            java.lang.String r3 = r8.A00
            X.0Ae r2 = r2.A00
            X.0Aj r2 = X.C51969G9p.A0d(r2, r6)
            A05(r1, r2, r4, r3, r0)
            return
        L_0x0183:
            java.lang.String r4 = "client_verify_dcppayment_fail"
            boolean r5 = r5.equals(r4)
            if (r5 == 0) goto L_0x00d4
            X.RIi r9 = X.RIi.FULFILLMENT
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r23)
            r10 = 0
            r16 = r3
            r17 = r2
            X.QI5 r5 = r8.A03(r9, r10, r11, r12, r13, r14, r15, r16, r17)
            X.Roc r2 = r8.A03
            java.lang.String r3 = r8.A00
            X.0Ae r2 = r2.A00
            X.0Aj r2 = X.C51969G9p.A0d(r2, r4)
            A05(r1, r2, r5, r3, r0)
            return
        L_0x01a8:
            java.lang.String r4 = "client_verify_dcppayment_init"
            boolean r5 = r5.equals(r4)
            if (r5 == 0) goto L_0x00d4
            X.RIi r9 = X.RIi.FULFILLMENT
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r23)
            r10 = 0
            r16 = r3
            r17 = r2
            X.QI5 r5 = r8.A03(r9, r10, r11, r12, r13, r14, r15, r16, r17)
            X.Roc r2 = r8.A03
            java.lang.String r3 = r8.A00
            X.0Ae r2 = r2.A00
            X.0Aj r2 = X.C51969G9p.A0d(r2, r4)
            A05(r1, r2, r5, r3, r0)
            return
        L_0x01cd:
            java.lang.String r2 = "client_create_iap_external_confirm_warning"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x00d4
            X.Roc r7 = r8.A03
            java.lang.String r5 = r8.A00
            X.QIP r4 = new X.QIP
            r4.<init>()
            java.lang.String r2 = "request_id"
            r4.A06(r2, r6)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r23)
            java.lang.String r2 = "is_retry"
            r4.A03(r2, r3)
            X.0Ae r3 = r7.A00
            java.lang.String r2 = "client_create_iapexternalconfirm_warning"
            X.0Aj r2 = X.C51969G9p.A0d(r3, r2)
            A05(r1, r2, r4, r5, r0)
            return
        L_0x01f9:
            java.lang.String r2 = "client_load_iap_store_purchases_success"
            goto L_0x04e5
        L_0x01fd:
            java.lang.String r3 = "client_fetch_dcpcatalog_fail"
            boolean r2 = r5.equals(r3)
            if (r2 == 0) goto L_0x00d4
            X.QI2 r5 = r8.A00(r13)
            X.Roc r2 = r8.A03
            java.lang.String r4 = r8.A00
            X.0Ae r2 = r2.A00
            X.0Aj r3 = X.C51969G9p.A0d(r2, r3)
            boolean r2 = r3.isSampled()
            if (r2 == 0) goto L_0x00d4
            java.lang.String r2 = X.Q2N.A00()
            X.59v r1 = X.Pxg.A0P(r1, r3, r2, r4)
            X.JTU.A0t(r1, r3, r5)
            java.lang.String r1 = "extra_data"
            r3.A9H(r1, r0)
            X.RH0 r1 = X.RH0.A0s
            java.lang.String r1 = r1.A00
            java.lang.String r1 = X.DbS.A0r(r1, r0)
            if (r1 != 0) goto L_0x03d1
            goto L_0x03cf
        L_0x0235:
            java.lang.String r6 = "client_fetch_dcpcatalog_init"
            boolean r2 = r5.equals(r6)
            if (r2 == 0) goto L_0x00d4
            X.QI2 r4 = r8.A00(r13)
            X.Roc r2 = r8.A03
            java.lang.String r3 = r8.A00
            X.0Ae r2 = r2.A00
            X.0Aj r2 = X.C51969G9p.A0d(r2, r6)
            A05(r1, r2, r4, r3, r0)
            return
        L_0x024f:
            java.lang.String r2 = "client_execute_iap_store_query_purchase_hist_fail"
            goto L_0x04e5
        L_0x0253:
            java.lang.String r2 = "client_execute_iap_store_query_purchase_hist_init"
            goto L_0x04e5
        L_0x0257:
            java.lang.String r4 = "user_create_dcppayment_cancel"
            boolean r5 = r5.equals(r4)
            if (r5 == 0) goto L_0x00d4
            X.RIi r9 = X.RIi.PAYMENT
            r11 = 0
            X.EZM r10 = X.EZM.IAP_CHECKOUT
            r16 = r3
            r17 = r2
            X.QI5 r5 = r8.A03(r9, r10, r11, r12, r13, r14, r15, r16, r17)
            X.Roc r2 = r8.A03
            java.lang.String r3 = r8.A00
            X.0Ae r2 = r2.A00
            X.0Aj r2 = X.C51969G9p.A0d(r2, r4)
            A05(r1, r2, r5, r3, r0)
            return
        L_0x027b:
            java.lang.String r2 = "client_execute_iap_store_consume_fail"
            goto L_0x04e5
        L_0x027f:
            java.lang.String r2 = "client_execute_iap_store_consume_init"
            goto L_0x04e5
        L_0x0283:
            java.lang.String r4 = "client_create_dcp_external_confirm_success"
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L_0x00d4
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r23)
            r10 = r12
            r11 = r13
            r12 = r14
            r13 = r15
            r14 = r3
            r15 = r2
            X.QI3 r5 = r8.A01(r9, r10, r11, r12, r13, r14, r15)
            X.Roc r2 = r8.A03
            java.lang.String r4 = r8.A00
            X.0Ae r3 = r2.A00
            java.lang.String r2 = "client_notify_dcpexternalconfirm_success"
            X.0Aj r2 = X.C51969G9p.A0d(r3, r2)
            A05(r1, r2, r5, r4, r0)
            return
        L_0x02a9:
            java.lang.String r2 = "client_create_iap_synchronize_fail"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x00d4
            X.QIQ r5 = new X.QIQ
            r5.<init>()
            java.lang.String r2 = "request_id"
            r5.A06(r2, r6)
            java.lang.String r2 = "external_transaction_ids"
            r5.A07(r2, r4)
            X.Roc r2 = r8.A03
            java.lang.String r4 = r8.A00
            X.0Ae r3 = r2.A00
            java.lang.String r2 = "client_create_iapsynchronize_fail"
            X.0Aj r2 = X.C51969G9p.A0d(r3, r2)
            A05(r1, r2, r5, r4, r0)
            return
        L_0x02d1:
            java.lang.String r2 = "client_create_iap_synchronize_init"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x00d4
            X.QIQ r5 = new X.QIQ
            r5.<init>()
            java.lang.String r2 = "request_id"
            r5.A06(r2, r6)
            java.lang.String r2 = "external_transaction_ids"
            r5.A07(r2, r4)
            X.Roc r2 = r8.A03
            java.lang.String r4 = r8.A00
            X.0Ae r3 = r2.A00
            java.lang.String r2 = "client_create_iapsynchronize_init"
            X.0Aj r2 = X.C51969G9p.A0d(r3, r2)
            A05(r1, r2, r5, r4, r0)
            return
        L_0x02f9:
            java.lang.String r2 = "client_init_iap_store_connection_stopped"
            goto L_0x04e5
        L_0x02fd:
            java.lang.String r2 = "client_init_iap_store_connection_success"
            goto L_0x04e5
        L_0x0301:
            java.lang.String r2 = "client_execute_iap_store_query_purchases_fail"
            goto L_0x04e5
        L_0x0305:
            java.lang.String r2 = "client_execute_iap_store_query_purchases_init"
            goto L_0x04e5
        L_0x0309:
            java.lang.String r4 = "client_create_dcppayment_success"
            boolean r5 = r5.equals(r4)
            if (r5 == 0) goto L_0x00d4
            X.RIi r9 = X.RIi.PAYMENT
            r10 = 0
            r11 = r10
            r16 = r3
            r17 = r2
            X.QI5 r5 = r8.A03(r9, r10, r11, r12, r13, r14, r15, r16, r17)
            X.Roc r2 = r8.A03
            java.lang.String r3 = r8.A00
            X.0Ae r2 = r2.A00
            X.0Aj r2 = X.C51969G9p.A0d(r2, r4)
            A05(r1, r2, r5, r3, r0)
            return
        L_0x032b:
            java.lang.String r2 = "client_execute_iap_store_acknowledge_purchases_fail"
            goto L_0x04e5
        L_0x032f:
            java.lang.String r2 = "client_execute_iap_store_acknowledge_purchases_init"
            goto L_0x04e5
        L_0x0333:
            java.lang.String r2 = "client_execute_iap_store_query_product_details_success"
            goto L_0x04e5
        L_0x0337:
            java.lang.String r2 = "client_execute_iap_store_launch_billing_flow_success"
            goto L_0x04e5
        L_0x033b:
            java.lang.String r2 = "client_execute_iap_store_query_purchase_hist_success"
            goto L_0x04e5
        L_0x033f:
            java.lang.String r2 = "client_execute_iap_store_launch_billing_flow_fail"
            goto L_0x04e5
        L_0x0343:
            java.lang.String r2 = "client_execute_iap_store_launch_billing_flow_init"
            goto L_0x04e5
        L_0x0347:
            java.lang.String r2 = "client_execute_iap_store_consume_success"
            goto L_0x04e5
        L_0x034b:
            java.lang.String r2 = "client_load_iap_store_purchases_fail"
            goto L_0x04e5
        L_0x034f:
            java.lang.String r2 = "client_load_iap_store_purchases_init"
            goto L_0x04e5
        L_0x0353:
            java.lang.String r2 = "client_init_iap_store_connection_fail"
            goto L_0x04e5
        L_0x0357:
            java.lang.String r2 = "client_init_iap_store_connection_init"
            goto L_0x04e5
        L_0x035b:
            java.lang.String r4 = "client_verify_dcppayment_success"
            boolean r5 = r5.equals(r4)
            if (r5 == 0) goto L_0x00d4
            X.RIi r9 = X.RIi.FULFILLMENT
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r23)
            r10 = 0
            r16 = r3
            r17 = r2
            X.QI5 r5 = r8.A03(r9, r10, r11, r12, r13, r14, r15, r16, r17)
            X.Roc r2 = r8.A03
            java.lang.String r3 = r8.A00
            X.0Ae r2 = r2.A00
            X.0Aj r2 = X.C51969G9p.A0d(r2, r4)
            A05(r1, r2, r5, r3, r0)
            return
        L_0x0380:
            java.lang.String r2 = "client_execute_iap_store_query_product_details_fail"
            goto L_0x04e5
        L_0x0384:
            java.lang.String r2 = "client_execute_iap_store_query_product_details_init"
            goto L_0x04e5
        L_0x0388:
            java.lang.String r2 = "client_execute_iap_store_start_connection_fail"
            goto L_0x04e5
        L_0x038c:
            java.lang.String r2 = "client_execute_iap_store_start_connection_init"
            goto L_0x04e5
        L_0x0390:
            java.lang.String r6 = "client_execute_dcpiap_fail"
            boolean r4 = r5.equals(r6)
            if (r4 == 0) goto L_0x00d4
            r14 = 0
            r16 = 0
            r9 = r8
            r10 = r13
            r11 = r15
            r12 = r3
            r13 = r2
            r15 = r14
            X.QI4 r5 = r9.A02(r10, r11, r12, r13, r14, r15, r16)
            X.Roc r2 = r8.A03
            java.lang.String r4 = r8.A00
            X.0Ae r2 = r2.A00
            X.0Aj r3 = X.C51969G9p.A0d(r2, r6)
            boolean r2 = r3.isSampled()
            if (r2 == 0) goto L_0x00d4
            java.lang.String r2 = X.Q2N.A00()
            X.59v r1 = X.Pxg.A0P(r1, r3, r2, r4)
            X.JTU.A0t(r1, r3, r5)
            java.lang.String r1 = "extra_data"
            r3.A9H(r1, r0)
            X.RH0 r1 = X.RH0.A0s
            java.lang.String r1 = r1.A00
            java.lang.String r1 = X.DbS.A0r(r1, r0)
            if (r1 != 0) goto L_0x03d1
        L_0x03cf:
            java.lang.String r1 = "FIX no error message provided"
        L_0x03d1:
            java.lang.String r0 = "error_message"
            r3.AAJ(r0, r1)
            r3.Cgf()
            return
        L_0x03da:
            java.lang.String r6 = "client_execute_dcpiap_init"
            boolean r4 = r5.equals(r6)
            if (r4 == 0) goto L_0x00d4
            r14 = 0
            r16 = 0
            r9 = r8
            r10 = r13
            r11 = r15
            r12 = r3
            r13 = r2
            r15 = r14
            X.QI4 r4 = r9.A02(r10, r11, r12, r13, r14, r15, r16)
            X.Roc r2 = r8.A03
            java.lang.String r3 = r8.A00
            X.0Ae r2 = r2.A00
            X.0Aj r2 = X.C51969G9p.A0d(r2, r6)
            A05(r1, r2, r4, r3, r0)
            return
        L_0x03fd:
            java.lang.String r2 = "client_execute_iap_store_query_sku_details_success"
            goto L_0x04e5
        L_0x0401:
            java.lang.String r2 = "client_execute_iap_store_query_purchases_success"
            goto L_0x04e5
        L_0x0405:
            java.lang.String r6 = "client_fetch_dcpcatalog_success"
            boolean r2 = r5.equals(r6)
            if (r2 == 0) goto L_0x00d4
            X.QI2 r4 = r8.A00(r13)
            X.Roc r2 = r8.A03
            java.lang.String r3 = r8.A00
            X.0Ae r2 = r2.A00
            X.0Aj r2 = X.C51969G9p.A0d(r2, r6)
            A05(r1, r2, r4, r3, r0)
            return
        L_0x041f:
            java.lang.String r2 = "client_execute_iap_store_query_sku_details_fail"
            goto L_0x04e5
        L_0x0423:
            java.lang.String r2 = "client_execute_iap_store_query_sku_details_init"
            goto L_0x04e5
        L_0x0427:
            java.lang.String r2 = "client_create_iap_synchronize_success"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x00d4
            X.QIQ r5 = new X.QIQ
            r5.<init>()
            java.lang.String r2 = "request_id"
            r5.A06(r2, r6)
            java.lang.String r2 = "external_transaction_ids"
            r5.A07(r2, r4)
            X.Roc r2 = r8.A03
            java.lang.String r4 = r8.A00
            X.0Ae r3 = r2.A00
            java.lang.String r2 = "client_create_iapsynchronize_success"
            X.0Aj r2 = X.C51969G9p.A0d(r3, r2)
            A05(r1, r2, r5, r4, r0)
            return
        L_0x044f:
            java.lang.String r6 = "client_execute_dcpiap_success"
            boolean r4 = r5.equals(r6)
            if (r4 == 0) goto L_0x00d4
            r16 = r8
            r17 = r13
            r18 = r15
            r19 = r3
            r20 = r2
            r21 = r12
            r22 = r14
            X.QI4 r4 = r16.A02(r17, r18, r19, r20, r21, r22, r23)
            X.Roc r2 = r8.A03
            java.lang.String r3 = r8.A00
            X.0Ae r2 = r2.A00
            X.0Aj r2 = X.C51969G9p.A0d(r2, r6)
            A05(r1, r2, r4, r3, r0)
            return
        L_0x0477:
            java.lang.String r6 = "client_create_dcpquote_fail"
            boolean r4 = r5.equals(r6)
            if (r4 == 0) goto L_0x00d4
            X.QI6 r5 = r8.A04(r13, r15, r3, r2)
            X.Roc r2 = r8.A03
            java.lang.String r4 = r8.A00
            X.0Ae r2 = r2.A00
            X.0Aj r3 = X.C51969G9p.A0d(r2, r6)
            boolean r2 = r3.isSampled()
            if (r2 == 0) goto L_0x00d4
            java.lang.String r2 = X.Q2N.A00()
            X.59v r1 = X.Pxg.A0P(r1, r3, r2, r4)
            X.JTU.A0t(r1, r3, r5)
            java.lang.String r1 = "extra_data"
            r3.A9H(r1, r0)
            X.RH0 r1 = X.RH0.A0s
            java.lang.String r1 = r1.A00
            java.lang.String r2 = X.DbS.A0r(r1, r0)
            if (r2 != 0) goto L_0x04af
            java.lang.String r2 = "FIX no error message provided"
        L_0x04af:
            java.lang.String r1 = "error_message"
            r3.AAJ(r1, r2)
            X.RH0 r1 = X.RH0.A0T
            java.lang.String r1 = r1.A00
            java.lang.String r1 = X.DbS.A0r(r1, r0)
            if (r1 != 0) goto L_0x04c0
            java.lang.String r1 = "FIX no error stack trace provided"
        L_0x04c0:
            java.lang.String r0 = "error_stacktrace"
            r3.AAJ(r0, r1)
            r3.Cgf()
            return
        L_0x04c9:
            java.lang.String r6 = "client_create_dcpquote_init"
            boolean r4 = r5.equals(r6)
            if (r4 == 0) goto L_0x00d4
            X.QI6 r4 = r8.A04(r13, r15, r3, r2)
            X.Roc r2 = r8.A03
            java.lang.String r3 = r8.A00
            X.0Ae r2 = r2.A00
            X.0Aj r2 = X.C51969G9p.A0d(r2, r6)
            A05(r1, r2, r4, r3, r0)
            return
        L_0x04e3:
            java.lang.String r2 = "client_execute_iap_store_start_connection_success"
        L_0x04e5:
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x00d4
            X.QI7 r6 = new X.QI7
            r6.<init>()
            java.lang.String r2 = "debug_step"
            r6.A06(r2, r5)
            X.Roc r2 = r8.A03
            java.lang.String r4 = r8.A00
            X.0Ae r3 = r2.A00
            java.lang.String r2 = "client_add_debug_atomic"
            X.0Aj r2 = X.C51969G9p.A0d(r3, r2)
            A05(r1, r2, r6, r4, r0)
            return
        L_0x0505:
            java.lang.String r1 = "AVATAR_CONTENT"
            boolean r1 = r3.equals(r1)
            if (r1 != 0) goto L_0x05ab
            goto L_0x0069
        L_0x050f:
            java.lang.String r1 = "NME_SUBSCRIPTION"
            boolean r1 = r3.equals(r1)
            if (r1 != 0) goto L_0x0580
            goto L_0x0069
        L_0x0519:
            java.lang.String r1 = "INSTAGRAM_FAN_SUBS"
            boolean r1 = r3.equals(r1)
            if (r1 != 0) goto L_0x059d
            goto L_0x0069
        L_0x0523:
            java.lang.String r1 = "INSTAGRAM_USERPAY_BADGES"
            boolean r1 = r3.equals(r1)
            if (r1 != 0) goto L_0x0563
            goto L_0x0069
        L_0x052d:
            java.lang.String r1 = "NFT"
            boolean r1 = r3.equals(r1)
            if (r1 != 0) goto L_0x05cb
            goto L_0x0069
        L_0x0537:
            java.lang.String r1 = "MV4B"
            boolean r1 = r3.equals(r1)
            if (r1 != 0) goto L_0x058f
            goto L_0x0069
        L_0x0541:
            java.lang.String r1 = "AFS_SUBSCRIPTION"
            boolean r1 = r3.equals(r1)
            if (r1 != 0) goto L_0x0571
            goto L_0x0069
        L_0x054b:
            java.lang.String r1 = "INSTAGRAM_CONTENT_APPRECIATION"
            boolean r1 = r3.equals(r1)
            if (r1 != 0) goto L_0x05bd
            goto L_0x0069
        L_0x0555:
            java.lang.String r1 = "badges"
            goto L_0x055b
        L_0x0558:
            java.lang.String r1 = "supporter_badges"
        L_0x055b:
            boolean r1 = r4.equals(r1)
            if (r1 != 0) goto L_0x0563
            goto L_0x0062
        L_0x0563:
            X.2M7 r1 = X.2M7.A0B
            goto L_0x006b
        L_0x0567:
            java.lang.String r1 = "afs"
            boolean r1 = r4.equals(r1)
            if (r1 != 0) goto L_0x0571
            goto L_0x0062
        L_0x0571:
            X.2M7 r1 = X.2M7.A06
            goto L_0x006b
        L_0x0575:
            java.lang.String r1 = "nme"
            boolean r1 = r4.equals(r1)
            if (r1 != 0) goto L_0x0580
            goto L_0x0062
        L_0x0580:
            X.2M7 r1 = X.2M7.A0E
            goto L_0x006b
        L_0x0584:
            java.lang.String r1 = "mv4b"
            boolean r1 = r4.equals(r1)
            if (r1 != 0) goto L_0x058f
            goto L_0x0062
        L_0x058f:
            X.2M7 r1 = X.2M7.A0C
            goto L_0x006b
        L_0x0593:
            java.lang.String r1 = "fan_subs"
            boolean r1 = r4.equals(r1)
            if (r1 != 0) goto L_0x059d
            goto L_0x0062
        L_0x059d:
            X.2M7 r1 = X.2M7.A0A
            goto L_0x006b
        L_0x05a1:
            java.lang.String r1 = "avatar_content"
            boolean r1 = r4.equals(r1)
            if (r1 != 0) goto L_0x05ab
            goto L_0x0062
        L_0x05ab:
            X.2M7 r1 = X.2M7.A08
            goto L_0x006b
        L_0x05af:
            r1 = 1217(0x4c1, float:1.705E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            boolean r1 = r4.equals(r1)
            if (r1 != 0) goto L_0x05bd
            goto L_0x0062
        L_0x05bd:
            X.2M7 r1 = X.2M7.A09
            goto L_0x006b
        L_0x05c1:
            java.lang.String r1 = "digital_collectibles"
            boolean r1 = r4.equals(r1)
            if (r1 != 0) goto L_0x05cb
            goto L_0x0062
        L_0x05cb:
            X.2M7 r1 = X.2M7.A0D
            goto L_0x006b
        L_0x05cf:
            java.util.LinkedHashMap r2 = X.AnonymousClass7TE.A1H()
            goto L_0x0021
        L_0x05d5:
            java.util.LinkedHashMap r0 = X.AnonymousClass7TE.A1H()
            goto L_0x0009
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C12177SoS.Cgp(java.util.Map, java.util.Map, java.lang.String):void");
    }

    public C12177SoS(Context context, C58840Ae r3, C64063LLh lLh) {
        AnonymousClass7TG.A1Q(lLh, context);
        this.A04 = lLh;
        this.A02 = Pxe.A05(context, GoogleApiAvailability.A00);
        this.A05 = context.getPackageName();
        this.A03 = new C10221Roc(r3);
        this.A01 = "all_products";
    }

    public static void A05(AnonymousClass0Ac r1, 0Aj r2, 0bb r3, String str, Map map) {
        if (r2.isSampled()) {
            r2.AAJ(Q2N.A00(), str);
            r2.A8M(r1, "product_type");
            r2.A8M(C2818559v.ANDROID, "platform");
            r2.A9F("actual_event_time", Long.valueOf(System.currentTimeMillis()));
            r2.AAK(r3, "event_payload");
            r2.A9H("extra_data", map);
            r2.Cgf();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0019, code lost:
        if (r0 != null) goto L_0x001b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.LinkedHashMap BiK(X.C11230SGo r7, com.android.billingclient.api.Purchase r8, boolean r9) {
        /*
            r6 = this;
            java.util.LinkedHashMap r2 = X.AnonymousClass7TE.A1H()
            if (r8 == 0) goto L_0x007c
            org.json.JSONObject r5 = r8.A02
            java.lang.String r0 = "obfuscatedAccountId"
            java.lang.String r1 = r5.optString(r0)
            java.lang.String r0 = "obfuscatedProfileId"
            java.lang.String r0 = r5.optString(r0)
            if (r1 != 0) goto L_0x001b
            r3 = 0
            if (r0 == 0) goto L_0x001c
        L_0x001b:
            r3 = r0
        L_0x001c:
            java.lang.String r1 = r8.A01()
            java.lang.String r0 = "external_transaction_id"
            r2.put(r0, r1)
            java.lang.String r1 = X.RWF.A00(r8)
            java.lang.String r0 = "external_product_id"
            r2.put(r0, r1)
            java.lang.String r4 = ""
            java.lang.String r0 = "purchaseTime"
            long r0 = r5.optLong(r0)
            java.lang.String r1 = X.002.A0Q(r4, r0)
            java.lang.String r0 = "external_purchase_time"
            r2.put(r0, r1)
            java.lang.String r1 = r8.A01
            java.lang.String r0 = "external_purchase_signature"
            r2.put(r0, r1)
            java.lang.String r0 = "developerPayload"
            java.lang.String r1 = r5.optString(r0)
            java.lang.String r0 = "developer_payload"
            r2.put(r0, r1)
            java.lang.String r1 = r8.A02()
            java.lang.String r0 = "external_purchase_token"
            r2.put(r0, r1)
            X.RH0 r0 = X.RH0.A0d
            java.lang.String r1 = r0.A00
            java.lang.String r0 = java.lang.String.valueOf(r9)
            r2.put(r1, r0)
            X.RH0 r0 = X.RH0.A0t
            java.lang.String r1 = r0.A00
            java.lang.String r0 = r6.A00
            r2.put(r1, r0)
            if (r3 == 0) goto L_0x007c
            boolean r0 = X.00l.A0W(r3)
            if (r0 != 0) goto L_0x007c
            X.RH0 r0 = X.RH0.A0r
            X.Pxe.A1U(r0, r3, r2)
        L_0x007c:
            if (r7 == 0) goto L_0x0088
            int r1 = r7.A00
            java.lang.String r0 = r7.A01
            X.0qQ.A07(r0)
            X.SKS.A02(r0, r2, r1)
        L_0x0088:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C12177SoS.BiK(X.SGo, com.android.billingclient.api.Purchase, boolean):java.util.LinkedHashMap");
    }
}
