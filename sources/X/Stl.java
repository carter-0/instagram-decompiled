package X;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class Stl implements 2FO {
    public final C58840Ae A00;
    public final 2FO A01;

    public static C7524QHt A00() {
        0bb r2 = new 0bb();
        r2.A01(RIj.PIN, "auth_factor_type");
        return r2;
    }

    public static C7524QHt A01(Map map) {
        map.get("FBPAY_AUTH_CREDENTIAL_ID").getClass();
        return new 0bb();
    }

    public static void A03(0bb r2, Map map) {
        r2.A06("dynamicauth_operation", (String) C2818159r.A00("DYNAMIC_AUTH_OPERATION_NAME", map));
    }

    public Stl(C58840Ae r1, 2FO r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public static Map A02(String str, Map map) {
        HashMap A19 = Pxe.A19(map);
        A19.put("flow_step", str);
        return Collections.unmodifiableMap(A19);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:173:0x03de, code lost:
        r1.Cgl("payflows_display", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x03e1, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x03f6, code lost:
        r1.Cgl("payflows_fail", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x03f9, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x03fe, code lost:
        r1.Cgl(r7, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x0401, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x0411, code lost:
        r3.A01(r1, "view_name");
        r0 = "client_verify_auth_success";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x0474, code lost:
        r2 = X.C51969G9p.A0d(r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x047c, code lost:
        if (r2.isSampled() == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x047e, code lost:
        r2.AAJ(X.Py7.A00(), r5);
        r1 = X.2M7.A0K;
        r0 = X.RV4.A00(X.2M7.class, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x048d, code lost:
        if (r0 == null) goto L_0x0490;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x048f, code lost:
        r1 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x0490, code lost:
        X.Pxh.A18(r1, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x049b, code lost:
        if (r14.containsKey("logging_context") == false) goto L_0x0651;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x049d, code lost:
        r0 = (com.facebookpay.logging.LoggingContext) r14.get("logging_context");
        X.C51971G9r.A1B(r3, r0);
        r1 = X.SQ1.A00(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x04aa, code lost:
        if (r1 == null) goto L_0x0651;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x04c5, code lost:
        r3.A01(r1, "view_name");
        r0 = "user_click_auth_submit";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x04df, code lost:
        r3.A01(r1, "view_name");
        r0 = "client_verify_auth_fail";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x0510, code lost:
        r1.Cgl("payflows_success", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x0513, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x0518, code lost:
        r2 = X.C51969G9p.A0d(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x0520, code lost:
        if (r2.isSampled() == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x0522, code lost:
        r2.AAJ(X.Py7.A00(), r5);
        r1 = X.2M7.A0K;
        r0 = X.RV4.A00(X.2M7.class, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x0531, code lost:
        if (r0 == null) goto L_0x0534;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x0533, code lost:
        r1 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x0534, code lost:
        X.Pxh.A18(r1, r2);
        r3 = new X.0bb();
        r1 = X.Pxh.A0n("auth_view_name_key", r14);
        r0 = "view_name";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:0x0547, code lost:
        r3.A06(r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x0550, code lost:
        if (r14.containsKey("logging_context") == false) goto L_0x0651;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x0552, code lost:
        X.C51971G9r.A1B(r3, (com.facebookpay.logging.LoggingContext) r14.get("logging_context"));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x0587, code lost:
        r3.A01(r1, "view_name");
        r2 = X.C51969G9p.A0d(r2, "user_click_auth_atomic");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x0598, code lost:
        if (r2.isSampled() == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x059a, code lost:
        r2.AAJ(X.Py7.A00(), r5);
        r1 = X.2M7.A0K;
        r0 = X.RV4.A00(X.2M7.class, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x05a9, code lost:
        if (r0 == null) goto L_0x05ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x05ab, code lost:
        r1 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x05ac, code lost:
        X.Pxh.A18(r1, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x05b7, code lost:
        if (r14.containsKey("logging_context") == false) goto L_0x05cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:0x05b9, code lost:
        r0 = (com.facebookpay.logging.LoggingContext) r14.get("logging_context");
        X.C51971G9r.A1B(r3, r0);
        r1 = X.SQ1.A00(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x05c6, code lost:
        if (r1 == null) goto L_0x05cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x05c8, code lost:
        r3.A02(r1, "logging_policy");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x05cd, code lost:
        X.Pxe.A1Q(r2, r3);
        r1 = "AUTH_LOGGING_EXTRA_KEY";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x05d6, code lost:
        if (r14.containsKey(r1) == false) goto L_0x066e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:0x05eb, code lost:
        r3.A01(r1, "view_name");
        r0 = "client_load_auth_success";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:0x060b, code lost:
        r3.A01(r1, "view_name");
        r0 = "user_click_auth_exit";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:235:0x0614, code lost:
        r2 = X.C51969G9p.A0d(r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x061c, code lost:
        if (r2.isSampled() == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x061e, code lost:
        r2.AAJ(X.Py7.A00(), r5);
        r1 = X.2M7.A0K;
        r0 = X.RV4.A00(X.2M7.class, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x062d, code lost:
        if (r0 == null) goto L_0x0630;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:0x062f, code lost:
        r1 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:240:0x0630, code lost:
        X.Pxh.A18(r1, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:0x063b, code lost:
        if (r14.containsKey("logging_context") == false) goto L_0x0651;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x063d, code lost:
        r0 = (com.facebookpay.logging.LoggingContext) r14.get("logging_context");
        X.C51971G9r.A1B(r3, r0);
        r1 = X.SQ1.A00(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:0x064a, code lost:
        if (r1 == null) goto L_0x0651;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:0x064c, code lost:
        r3.A02(r1, "logging_policy");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:0x0651, code lost:
        X.Pxe.A1Q(r2, r3);
        r1 = "AUTH_LOGGING_EXTRA_KEY";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:246:0x065a, code lost:
        if (r14.containsKey(r1) == false) goto L_0x066e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:247:0x065c, code lost:
        r1 = r14.get(r1);
        r1.getClass();
        r1 = (java.util.Map) r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:248:0x0665, code lost:
        r2.A9H("extra_data", r1);
        r2.Cgf();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:249:0x066e, code lost:
        r1 = java.util.Collections.emptyMap();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:250:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:253:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:254:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:255:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Cgl(java.lang.String r13, java.util.Map r14) {
        /*
            r12 = this;
            r14.getClass()
            java.lang.String r5 = X.C2818159r.A04(r14)
            java.lang.String r4 = X.C2818159r.A03(r14)
            X.2FO r1 = r12.A01
            int r0 = r13.hashCode()
            java.lang.String r3 = "auth_flows_dynamic_content_display"
            java.lang.String r2 = "auth_flows_local_content_display"
            r11 = -1
            switch(r0) {
                case -2083793875: goto L_0x003c;
                case -1928304214: goto L_0x0047;
                case -1758866292: goto L_0x0051;
                case -1756869445: goto L_0x005b;
                case -1436148427: goto L_0x0065;
                case -1341966846: goto L_0x006f;
                case -1340799109: goto L_0x0079;
                case -1291801157: goto L_0x0083;
                case -1253423427: goto L_0x008e;
                case -1206646458: goto L_0x0099;
                case -1171064117: goto L_0x00a5;
                case -632237359: goto L_0x00b2;
                case -581361931: goto L_0x00be;
                case -515133225: goto L_0x00ca;
                case -512598859: goto L_0x00d6;
                case -325463866: goto L_0x00e2;
                case -302506921: goto L_0x00ee;
                case -90731406: goto L_0x00f8;
                case -59874324: goto L_0x0105;
                case 58333232: goto L_0x0111;
                case 88409299: goto L_0x011d;
                case 196680369: goto L_0x0129;
                case 238079149: goto L_0x0135;
                case 445985589: goto L_0x0141;
                case 446087463: goto L_0x014d;
                case 524264811: goto L_0x0159;
                case 562245913: goto L_0x0163;
                case 676601937: goto L_0x016f;
                case 827296144: goto L_0x017b;
                case 827398018: goto L_0x0187;
                case 844442644: goto L_0x0193;
                case 850635568: goto L_0x019f;
                case 850737442: goto L_0x01ab;
                case 853729310: goto L_0x01b7;
                case 889983079: goto L_0x01c3;
                case 898993015: goto L_0x01cf;
                case 1075051593: goto L_0x01db;
                case 1134981461: goto L_0x01e7;
                case 1242355852: goto L_0x01f3;
                case 1290616588: goto L_0x01ff;
                case 1295582546: goto L_0x020b;
                case 1610629737: goto L_0x0218;
                case 1706077836: goto L_0x0224;
                case 1813005513: goto L_0x0230;
                case 1932884837: goto L_0x023d;
                case 2079985833: goto L_0x0249;
                case 2093986803: goto L_0x0256;
                default: goto L_0x0019;
            }
        L_0x0019:
            java.lang.String r10 = "payflows_display"
            java.lang.String r9 = "payflows_fail"
            java.lang.String r8 = "payflows_success"
            r0 = 3722(0xe8a, float:5.216E-42)
            java.lang.String r7 = X.AnonymousClass000.A00(r0)
            java.lang.String r6 = "fetch_auth_flows_cache_content"
            java.lang.String r0 = "fetch_auth_flows_content"
            switch(r11) {
                case 0: goto L_0x066d;
                case 1: goto L_0x0262;
                case 2: goto L_0x0273;
                case 3: goto L_0x0285;
                case 4: goto L_0x066d;
                case 5: goto L_0x066d;
                case 6: goto L_0x028f;
                case 7: goto L_0x0295;
                case 8: goto L_0x02cb;
                case 9: goto L_0x0302;
                case 10: goto L_0x030c;
                case 11: goto L_0x031e;
                case 12: goto L_0x0337;
                case 13: goto L_0x0349;
                case 14: goto L_0x035b;
                case 15: goto L_0x0361;
                case 16: goto L_0x036b;
                case 17: goto L_0x0370;
                case 18: goto L_0x066d;
                case 19: goto L_0x066d;
                case 20: goto L_0x0382;
                case 21: goto L_0x0393;
                case 22: goto L_0x03bf;
                case 23: goto L_0x03d0;
                case 24: goto L_0x03d5;
                case 25: goto L_0x03da;
                case 26: goto L_0x03e2;
                case 27: goto L_0x03ec;
                case 28: goto L_0x03f2;
                case 29: goto L_0x03fa;
                case 30: goto L_0x0402;
                case 31: goto L_0x041b;
                case 32: goto L_0x0460;
                case 33: goto L_0x066d;
                case 34: goto L_0x04ae;
                case 35: goto L_0x04d0;
                case 36: goto L_0x04e9;
                case 37: goto L_0x0502;
                case 38: goto L_0x050c;
                case 39: goto L_0x0514;
                case 40: goto L_0x055d;
                case 41: goto L_0x0567;
                case 42: goto L_0x0577;
                case 43: goto L_0x05da;
                case 44: goto L_0x066d;
                case 45: goto L_0x05e3;
                case 46: goto L_0x05f4;
                default: goto L_0x002f;
            }
        L_0x002f:
            java.lang.String r1 = "Event name "
            r0 = 833(0x341, float:1.167E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.IllegalArgumentException r0 = X.Pxg.A0c(r1, r13, r0)
            throw r0
        L_0x003c:
            java.lang.String r0 = "sso_access_token_generation_success"
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto L_0x0019
            r11 = 0
            goto L_0x0019
        L_0x0047:
            java.lang.String r0 = "fbpay_verify_paypal_success"
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto L_0x0019
            r11 = 1
            goto L_0x0019
        L_0x0051:
            java.lang.String r0 = "display_biometric_dialog"
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto L_0x0019
            r11 = 2
            goto L_0x0019
        L_0x005b:
            java.lang.String r0 = "fbpay_verify_pin_fail"
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto L_0x0019
            r11 = 3
            goto L_0x0019
        L_0x0065:
            java.lang.String r0 = "create_biometric"
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto L_0x0019
            r11 = 4
            goto L_0x0019
        L_0x006f:
            java.lang.String r0 = "fbpay_change_pin_click"
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto L_0x0019
            r11 = 5
            goto L_0x0019
        L_0x0079:
            java.lang.String r0 = "client_render_threeds_display"
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto L_0x0019
            r11 = 6
            goto L_0x0019
        L_0x0083:
            java.lang.String r0 = "user_click_threeds_exit"
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto L_0x0019
            r11 = 7
            goto L_0x0019
        L_0x008e:
            java.lang.String r0 = "client_verify_dynamic_auth_display"
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto L_0x0019
            r11 = 8
            goto L_0x0019
        L_0x0099:
            java.lang.String r0 = "fbpay_verify_pin_success"
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto L_0x0019
            r11 = 9
            goto L_0x0019
        L_0x00a5:
            java.lang.String r0 = "verify_biometric_fail"
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto L_0x0019
            r11 = 10
            goto L_0x0019
        L_0x00b2:
            java.lang.String r0 = "fbpay_verify_cvv_confirm"
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto L_0x0019
            r11 = 11
            goto L_0x0019
        L_0x00be:
            java.lang.String r0 = "forget_fb_password_click"
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto L_0x0019
            r11 = 12
            goto L_0x0019
        L_0x00ca:
            java.lang.String r0 = "fbpay_verify_pin_cancel"
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto L_0x0019
            r11 = 13
            goto L_0x0019
        L_0x00d6:
            java.lang.String r0 = "client_load_threeds_fail"
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto L_0x0019
            r11 = 14
            goto L_0x0019
        L_0x00e2:
            java.lang.String r0 = "forget_pin_display"
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto L_0x0019
            r11 = 15
            goto L_0x0019
        L_0x00ee:
            boolean r0 = r13.equals(r2)
            if (r0 == 0) goto L_0x0019
            r11 = 16
            goto L_0x0019
        L_0x00f8:
            java.lang.String r0 = "verify_biometric"
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto L_0x0019
            r11 = 17
            goto L_0x0019
        L_0x0105:
            java.lang.String r0 = "fbpay_use_faceid_click"
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto L_0x0019
            r11 = 18
            goto L_0x0019
        L_0x0111:
            java.lang.String r0 = "fbpay_remove_biometric"
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto L_0x0019
            r11 = 19
            goto L_0x0019
        L_0x011d:
            java.lang.String r0 = "fbpay_verify_cvv_display"
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto L_0x0019
            r11 = 20
            goto L_0x0019
        L_0x0129:
            java.lang.String r0 = "client_load_dynamic_auth_success"
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto L_0x0019
            r11 = 21
            goto L_0x0019
        L_0x0135:
            java.lang.String r0 = "fbpay_verify_cvv_fail"
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto L_0x0019
            r11 = 22
            goto L_0x0019
        L_0x0141:
            java.lang.String r0 = "fetch_auth_flows_cached_content_fail"
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto L_0x0019
            r11 = 23
            goto L_0x0019
        L_0x014d:
            java.lang.String r0 = "fetch_auth_flows_cached_content_init"
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto L_0x0019
            r11 = 24
            goto L_0x0019
        L_0x0159:
            boolean r0 = r13.equals(r3)
            if (r0 == 0) goto L_0x0019
            r11 = 25
            goto L_0x0019
        L_0x0163:
            java.lang.String r0 = "confirm_pin_display"
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto L_0x0019
            r11 = 26
            goto L_0x0019
        L_0x016f:
            java.lang.String r0 = "fetch_auth_flows_content_success"
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto L_0x0019
            r11 = 27
            goto L_0x0019
        L_0x017b:
            java.lang.String r0 = "fetch_auth_flows_content_fail"
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto L_0x0019
            r11 = 28
            goto L_0x0019
        L_0x0187:
            java.lang.String r0 = "fetch_auth_flows_content_init"
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto L_0x0019
            r11 = 29
            goto L_0x0019
        L_0x0193:
            java.lang.String r0 = "fbpay_verify_cvv_success"
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto L_0x0019
            r11 = 30
            goto L_0x0019
        L_0x019f:
            java.lang.String r0 = "client_load_dynamic_auth_fail"
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto L_0x0019
            r11 = 31
            goto L_0x0019
        L_0x01ab:
            java.lang.String r0 = "client_load_dynamic_auth_init"
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto L_0x0019
            r11 = 32
            goto L_0x0019
        L_0x01b7:
            java.lang.String r0 = "fbpay_security_page_display"
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto L_0x0019
            r11 = 33
            goto L_0x0019
        L_0x01c3:
            java.lang.String r0 = "fbpay_verify_paypal_confirm"
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto L_0x0019
            r11 = 34
            goto L_0x0019
        L_0x01cf:
            java.lang.String r0 = "fbpay_verify_paypa_fail"
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto L_0x0019
            r11 = 35
            goto L_0x0019
        L_0x01db:
            java.lang.String r0 = "fbpay_verify_cvv_cancel"
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto L_0x0019
            r11 = 36
            goto L_0x0019
        L_0x01e7:
            java.lang.String r0 = "create_pin_display"
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto L_0x0019
            r11 = 37
            goto L_0x0019
        L_0x01f3:
            java.lang.String r0 = "fetch_auth_flows_cached_content_success"
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto L_0x0019
            r11 = 38
            goto L_0x0019
        L_0x01ff:
            java.lang.String r0 = "client_load_threeds_success"
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto L_0x0019
            r11 = 39
            goto L_0x0019
        L_0x020b:
            java.lang.String r0 = "verify_pin_display"
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto L_0x0019
            r11 = 40
            goto L_0x0019
        L_0x0218:
            java.lang.String r0 = "fbpay_verify_paypal_display"
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto L_0x0019
            r11 = 41
            goto L_0x0019
        L_0x0224:
            java.lang.String r0 = "forget_pin_click"
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto L_0x0019
            r11 = 42
            goto L_0x0019
        L_0x0230:
            java.lang.String r0 = "reset_pin_screen_display"
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto L_0x0019
            r11 = 43
            goto L_0x0019
        L_0x023d:
            java.lang.String r0 = "fbpay_always_ask_for_pin_click"
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto L_0x0019
            r11 = 44
            goto L_0x0019
        L_0x0249:
            java.lang.String r0 = "reset_pin_confirm_display"
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto L_0x0019
            r11 = 45
            goto L_0x0019
        L_0x0256:
            java.lang.String r0 = "fbpay_verify_paypal_cancel"
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto L_0x0019
            r11 = 46
            goto L_0x0019
        L_0x0262:
            X.0Ae r2 = r12.A00
            X.QHt r3 = A01(r14)
            X.RIj r1 = X.RIj.PAYPAL_ACCESS_TOKEN
            java.lang.String r0 = "auth_factor_type"
            r3.A01(r1, r0)
            X.RIt r1 = X.C8954RIt.FBPAY_VERIFY_PAYPAL
            goto L_0x0411
        L_0x0273:
            X.0Ae r2 = r12.A00
            X.QHt r3 = new X.QHt
            r3.<init>()
            X.RIj r1 = X.RIj.BIO
            java.lang.String r0 = "auth_factor_type"
            r3.A01(r1, r0)
            X.RIt r1 = X.C8954RIt.FBPAY_VERIFY_BIO
            goto L_0x05eb
        L_0x0285:
            X.0Ae r2 = r12.A00
            X.QHt r3 = A00()
            X.RIt r1 = X.C8954RIt.FBPAY_VERIFY_PIN
            goto L_0x04df
        L_0x028f:
            X.0Ae r1 = r12.A00
            java.lang.String r0 = "client_render_threeds_display"
            goto L_0x0518
        L_0x0295:
            X.0Ae r1 = r12.A00
            java.lang.String r0 = "user_click_threeds_exit"
            X.0Aj r2 = X.C51969G9p.A0d(r1, r0)
            boolean r0 = r2.isSampled()
            if (r0 == 0) goto L_0x066d
            java.lang.String r0 = X.Py7.A00()
            r2.AAJ(r0, r5)
            java.lang.Class<X.2M7> r0 = X.2M7.class
            X.2M7 r1 = X.2M7.A0K
            java.lang.Enum r0 = X.RV4.A00(r0, r4)
            if (r0 == 0) goto L_0x02b6
            r1 = r0
        L_0x02b6:
            X.2M7 r1 = (X.2M7) r1
            X.Pxh.A18(r1, r2)
            X.QIs r3 = new X.QIs
            r3.<init>()
            java.lang.String r0 = "auth_target_name_key"
            java.lang.String r1 = X.Pxh.A0n(r0, r14)
            java.lang.String r0 = "target_name"
            goto L_0x0547
        L_0x02cb:
            X.0Ae r2 = r12.A00
            java.util.ArrayList r6 = X.C9664Rei.A00(r14)
            X.QI9 r3 = new X.QI9
            r3.<init>()
            X.RIt r1 = X.C8954RIt.DYNAMIC_AUTH
            java.lang.String r0 = "view_name"
            r3.A01(r1, r0)
            java.lang.String r0 = "dynamicauth_auth_factors"
            r3.A07(r0, r6)
            java.lang.Object r1 = X.AnonymousClass7TE.A12(r6)
            X.RIj r1 = (X.RIj) r1
            java.lang.String r0 = "dynamicauth_auth_factor_type"
            r3.A01(r1, r0)
            int r0 = r6.size()
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "dynamicauth_auth_count"
            r3.A06(r0, r1)
            A03(r3, r14)
            java.lang.String r0 = "client_verify_dynamicauth_display"
            goto L_0x0474
        L_0x0302:
            X.0Ae r2 = r12.A00
            X.QHt r3 = A00()
            X.RIt r1 = X.C8954RIt.FBPAY_VERIFY_PIN
            goto L_0x0411
        L_0x030c:
            X.0Ae r2 = r12.A00
            X.QHt r3 = new X.QHt
            r3.<init>()
            X.RIj r1 = X.RIj.BIO
            java.lang.String r0 = "auth_factor_type"
            r3.A01(r1, r0)
            X.RIt r1 = X.C8954RIt.FBPAY_VERIFY_BIO
            goto L_0x04df
        L_0x031e:
            X.0Ae r2 = r12.A00
            X.QHt r3 = A01(r14)
            X.RIj r1 = X.RIj.CSC
            java.lang.String r0 = "auth_factor_type"
            r3.A01(r1, r0)
            X.RIw r1 = X.C8957RIw.VERIFY_CVV_CONFIRM
            java.lang.String r0 = "target_name"
            r3.A01(r1, r0)
            X.RIt r1 = X.C8954RIt.FBPAY_VERIFY_CVV
            goto L_0x04c5
        L_0x0337:
            X.0Ae r2 = r12.A00
            X.QHt r3 = A00()
            X.RIw r1 = X.C8957RIw.FORGET_PASSWORD_LINK
            java.lang.String r0 = "target_name"
            r3.A01(r1, r0)
            X.RIt r1 = X.C8954RIt.FBPAY_RESET_PIN
            goto L_0x0587
        L_0x0349:
            X.0Ae r2 = r12.A00
            X.QHt r3 = A00()
            X.RIw r1 = X.C8957RIw.VERIFY_PIN_CANCEL
            java.lang.String r0 = "target_name"
            r3.A01(r1, r0)
            X.RIt r1 = X.C8954RIt.FBPAY_VERIFY_PIN
            goto L_0x060b
        L_0x035b:
            X.0Ae r1 = r12.A00
            java.lang.String r0 = "client_load_threeds_fail"
            goto L_0x0518
        L_0x0361:
            X.0Ae r2 = r12.A00
            X.QHt r3 = A00()
            X.RIt r1 = X.C8954RIt.FBPAY_FORGET_PIN
            goto L_0x05eb
        L_0x036b:
            java.util.Map r0 = A02(r2, r14)
            goto L_0x03de
        L_0x0370:
            X.0Ae r2 = r12.A00
            X.QHt r3 = new X.QHt
            r3.<init>()
            X.RIj r1 = X.RIj.BIO
            java.lang.String r0 = "auth_factor_type"
            r3.A01(r1, r0)
            X.RIt r1 = X.C8954RIt.FBPAY_VERIFY_BIO
            goto L_0x0411
        L_0x0382:
            X.0Ae r2 = r12.A00
            X.QHt r3 = A01(r14)
            X.RIj r1 = X.RIj.CSC
            java.lang.String r0 = "auth_factor_type"
            r3.A01(r1, r0)
            X.RIt r1 = X.C8954RIt.FBPAY_VERIFY_CVV
            goto L_0x05eb
        L_0x0393:
            X.0Ae r2 = r12.A00
            java.util.ArrayList r6 = X.C9664Rei.A00(r14)
            X.QI9 r3 = new X.QI9
            r3.<init>()
            X.RIt r1 = X.C8954RIt.DYNAMIC_AUTH
            java.lang.String r0 = "view_name"
            r3.A01(r1, r0)
            java.lang.String r0 = "dynamicauth_auth_factors"
            r3.A07(r0, r6)
            int r0 = r6.size()
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "dynamicauth_auth_count"
            r3.A06(r0, r1)
            A03(r3, r14)
            java.lang.String r0 = "client_load_dynamicauth_success"
            goto L_0x0474
        L_0x03bf:
            X.0Ae r2 = r12.A00
            X.QHt r3 = A01(r14)
            X.RIj r1 = X.RIj.CSC
            java.lang.String r0 = "auth_factor_type"
            r3.A01(r1, r0)
            X.RIt r1 = X.C8954RIt.FBPAY_VERIFY_CVV
            goto L_0x04df
        L_0x03d0:
            java.util.Map r0 = A02(r6, r14)
            goto L_0x03f6
        L_0x03d5:
            java.util.Map r0 = A02(r6, r14)
            goto L_0x03fe
        L_0x03da:
            java.util.Map r0 = A02(r3, r14)
        L_0x03de:
            r1.Cgl(r10, r0)
            return
        L_0x03e2:
            X.0Ae r2 = r12.A00
            X.QHt r3 = A00()
            X.RIt r1 = X.C8954RIt.FBPAY_CONFIRM_PIN
            goto L_0x05eb
        L_0x03ec:
            java.util.Map r0 = A02(r0, r14)
            goto L_0x0510
        L_0x03f2:
            java.util.Map r0 = A02(r0, r14)
        L_0x03f6:
            r1.Cgl(r9, r0)
            return
        L_0x03fa:
            java.util.Map r0 = A02(r0, r14)
        L_0x03fe:
            r1.Cgl(r7, r0)
            return
        L_0x0402:
            X.0Ae r2 = r12.A00
            X.QHt r3 = A01(r14)
            X.RIj r1 = X.RIj.CSC
            java.lang.String r0 = "auth_factor_type"
            r3.A01(r1, r0)
            X.RIt r1 = X.C8954RIt.FBPAY_VERIFY_CVV
        L_0x0411:
            java.lang.String r0 = "view_name"
            r3.A01(r1, r0)
            java.lang.String r0 = "client_verify_auth_success"
            goto L_0x0614
        L_0x041b:
            X.0Ae r2 = r12.A00
            java.util.ArrayList r6 = X.C9664Rei.A00(r14)
            X.QI9 r3 = new X.QI9
            r3.<init>()
            X.RIt r1 = X.C8954RIt.DYNAMIC_AUTH
            java.lang.String r0 = "view_name"
            r3.A01(r1, r0)
            java.lang.String r0 = "dynamicauth_auth_factors"
            r3.A07(r0, r6)
            int r0 = r6.size()
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "dynamicauth_auth_count"
            r3.A06(r0, r1)
            java.lang.String r0 = "DYNAMIC_AUTH_ERROR_CODE"
            java.lang.Object r0 = X.C2818159r.A00(r0, r14)
            java.lang.String r1 = r0.toString()
            java.lang.String r0 = "dynamicauth_error_code"
            r3.A06(r0, r1)
            java.lang.String r0 = "DYNAMIC_AUTH_ERROR_MESSAGE"
            java.lang.String r1 = X.Pxh.A0n(r0, r14)
            java.lang.String r0 = "dynamicauth_error_message"
            r3.A06(r0, r1)
            A03(r3, r14)
            java.lang.String r0 = "client_load_dynamicauth_fail"
            goto L_0x0474
        L_0x0460:
            X.0Ae r2 = r12.A00
            X.QI9 r3 = new X.QI9
            r3.<init>()
            X.RIt r1 = X.C8954RIt.DYNAMIC_AUTH
            java.lang.String r0 = "view_name"
            r3.A01(r1, r0)
            A03(r3, r14)
            java.lang.String r0 = "client_load_dynamicauth_init"
        L_0x0474:
            X.0Aj r2 = X.C51969G9p.A0d(r2, r0)
            boolean r0 = r2.isSampled()
            if (r0 == 0) goto L_0x066d
            java.lang.String r0 = X.Py7.A00()
            r2.AAJ(r0, r5)
            java.lang.Class<X.2M7> r0 = X.2M7.class
            X.2M7 r1 = X.2M7.A0K
            java.lang.Enum r0 = X.RV4.A00(r0, r4)
            if (r0 == 0) goto L_0x0490
            r1 = r0
        L_0x0490:
            X.2M7 r1 = (X.2M7) r1
            X.Pxh.A18(r1, r2)
            java.lang.String r1 = "logging_context"
            boolean r0 = r14.containsKey(r1)
            if (r0 == 0) goto L_0x0651
            java.lang.Object r0 = r14.get(r1)
            com.facebookpay.logging.LoggingContext r0 = (com.facebookpay.logging.LoggingContext) r0
            X.C51971G9r.A1B(r3, r0)
            X.GkD r1 = X.SQ1.A00(r0)
            if (r1 == 0) goto L_0x0651
            goto L_0x064c
        L_0x04ae:
            X.0Ae r2 = r12.A00
            X.QHt r3 = A01(r14)
            X.RIj r1 = X.RIj.PAYPAL_ACCESS_TOKEN
            java.lang.String r0 = "auth_factor_type"
            r3.A01(r1, r0)
            X.RIw r1 = X.C8957RIw.VERIFY_PAYPAL_CONFIRM
            java.lang.String r0 = "target_name"
            r3.A01(r1, r0)
            X.RIt r1 = X.C8954RIt.FBPAY_VERIFY_PAYPAL
        L_0x04c5:
            java.lang.String r0 = "view_name"
            r3.A01(r1, r0)
            java.lang.String r0 = "user_click_auth_submit"
            goto L_0x0614
        L_0x04d0:
            X.0Ae r2 = r12.A00
            X.QHt r3 = A01(r14)
            X.RIj r1 = X.RIj.PAYPAL_ACCESS_TOKEN
            java.lang.String r0 = "auth_factor_type"
            r3.A01(r1, r0)
            X.RIt r1 = X.C8954RIt.FBPAY_VERIFY_PAYPAL
        L_0x04df:
            java.lang.String r0 = "view_name"
            r3.A01(r1, r0)
            java.lang.String r0 = "client_verify_auth_fail"
            goto L_0x0614
        L_0x04e9:
            X.0Ae r2 = r12.A00
            X.QHt r3 = A01(r14)
            X.RIj r1 = X.RIj.CSC
            java.lang.String r0 = "auth_factor_type"
            r3.A01(r1, r0)
            X.RIw r1 = X.C8957RIw.VERIFY_CVV_CANCEL
            java.lang.String r0 = "target_name"
            r3.A01(r1, r0)
            X.RIt r1 = X.C8954RIt.FBPAY_VERIFY_CVV
            goto L_0x060b
        L_0x0502:
            X.0Ae r2 = r12.A00
            X.QHt r3 = A00()
            X.RIt r1 = X.C8954RIt.FBPAY_CREATE_PIN
            goto L_0x05eb
        L_0x050c:
            java.util.Map r0 = A02(r6, r14)
        L_0x0510:
            r1.Cgl(r8, r0)
            return
        L_0x0514:
            X.0Ae r1 = r12.A00
            java.lang.String r0 = "client_load_threeds_success"
        L_0x0518:
            X.0Aj r2 = X.C51969G9p.A0d(r1, r0)
            boolean r0 = r2.isSampled()
            if (r0 == 0) goto L_0x066d
            java.lang.String r0 = X.Py7.A00()
            r2.AAJ(r0, r5)
            java.lang.Class<X.2M7> r0 = X.2M7.class
            X.2M7 r1 = X.2M7.A0K
            java.lang.Enum r0 = X.RV4.A00(r0, r4)
            if (r0 == 0) goto L_0x0534
            r1 = r0
        L_0x0534:
            X.2M7 r1 = (X.2M7) r1
            X.Pxh.A18(r1, r2)
            X.QIs r3 = new X.QIs
            r3.<init>()
            java.lang.String r0 = "auth_view_name_key"
            java.lang.String r1 = X.Pxh.A0n(r0, r14)
            java.lang.String r0 = "view_name"
        L_0x0547:
            r3.A06(r0, r1)
            java.lang.String r1 = "logging_context"
            boolean r0 = r14.containsKey(r1)
            if (r0 == 0) goto L_0x0651
            java.lang.Object r0 = r14.get(r1)
            com.facebookpay.logging.LoggingContext r0 = (com.facebookpay.logging.LoggingContext) r0
            X.C51971G9r.A1B(r3, r0)
            goto L_0x0651
        L_0x055d:
            X.0Ae r2 = r12.A00
            X.QHt r3 = A00()
            X.RIt r1 = X.C8954RIt.FBPAY_VERIFY_PIN
            goto L_0x05eb
        L_0x0567:
            X.0Ae r2 = r12.A00
            X.QHt r3 = A01(r14)
            X.RIj r1 = X.RIj.PAYPAL_ACCESS_TOKEN
            java.lang.String r0 = "auth_factor_type"
            r3.A01(r1, r0)
            X.RIt r1 = X.C8954RIt.FBPAY_VERIFY_PAYPAL
            goto L_0x05eb
        L_0x0577:
            X.0Ae r2 = r12.A00
            X.QHt r3 = A00()
            X.RIw r1 = X.C8957RIw.FORGET_PIN_LINK
            java.lang.String r0 = "target_name"
            r3.A01(r1, r0)
            X.RIt r1 = X.C8954RIt.FBPAY_VERIFY_PIN
        L_0x0587:
            java.lang.String r0 = "view_name"
            r3.A01(r1, r0)
            java.lang.String r0 = "user_click_auth_atomic"
            X.0Aj r2 = X.C51969G9p.A0d(r2, r0)
            boolean r0 = r2.isSampled()
            if (r0 == 0) goto L_0x066d
            java.lang.String r0 = X.Py7.A00()
            r2.AAJ(r0, r5)
            java.lang.Class<X.2M7> r0 = X.2M7.class
            X.2M7 r1 = X.2M7.A0K
            java.lang.Enum r0 = X.RV4.A00(r0, r4)
            if (r0 == 0) goto L_0x05ac
            r1 = r0
        L_0x05ac:
            X.2M7 r1 = (X.2M7) r1
            X.Pxh.A18(r1, r2)
            java.lang.String r1 = "logging_context"
            boolean r0 = r14.containsKey(r1)
            if (r0 == 0) goto L_0x05cd
            java.lang.Object r0 = r14.get(r1)
            com.facebookpay.logging.LoggingContext r0 = (com.facebookpay.logging.LoggingContext) r0
            X.C51971G9r.A1B(r3, r0)
            X.GkD r1 = X.SQ1.A00(r0)
            if (r1 == 0) goto L_0x05cd
            java.lang.String r0 = "logging_policy"
            r3.A02(r1, r0)
        L_0x05cd:
            X.Pxe.A1Q(r2, r3)
            java.lang.String r1 = "AUTH_LOGGING_EXTRA_KEY"
            boolean r0 = r14.containsKey(r1)
            if (r0 == 0) goto L_0x066e
            goto L_0x065c
        L_0x05da:
            X.0Ae r2 = r12.A00
            X.QHt r3 = A00()
            X.RIt r1 = X.C8954RIt.FBPAY_RESET_PIN
            goto L_0x05eb
        L_0x05e3:
            X.0Ae r2 = r12.A00
            X.QHt r3 = A00()
            X.RIt r1 = X.C8954RIt.RESET_PIN_CONFIRM
        L_0x05eb:
            java.lang.String r0 = "view_name"
            r3.A01(r1, r0)
            java.lang.String r0 = "client_load_auth_success"
            goto L_0x0614
        L_0x05f4:
            X.0Ae r2 = r12.A00
            X.QHt r3 = A01(r14)
            X.RIj r1 = X.RIj.PAYPAL_ACCESS_TOKEN
            java.lang.String r0 = "auth_factor_type"
            r3.A01(r1, r0)
            X.RIw r1 = X.C8957RIw.VERIFY_PAYPAL_CANCEL
            java.lang.String r0 = "target_name"
            r3.A01(r1, r0)
            X.RIt r1 = X.C8954RIt.FBPAY_VERIFY_PAYPAL
        L_0x060b:
            java.lang.String r0 = "view_name"
            r3.A01(r1, r0)
            java.lang.String r0 = "user_click_auth_exit"
        L_0x0614:
            X.0Aj r2 = X.C51969G9p.A0d(r2, r0)
            boolean r0 = r2.isSampled()
            if (r0 == 0) goto L_0x066d
            java.lang.String r0 = X.Py7.A00()
            r2.AAJ(r0, r5)
            java.lang.Class<X.2M7> r0 = X.2M7.class
            X.2M7 r1 = X.2M7.A0K
            java.lang.Enum r0 = X.RV4.A00(r0, r4)
            if (r0 == 0) goto L_0x0630
            r1 = r0
        L_0x0630:
            X.2M7 r1 = (X.2M7) r1
            X.Pxh.A18(r1, r2)
            java.lang.String r1 = "logging_context"
            boolean r0 = r14.containsKey(r1)
            if (r0 == 0) goto L_0x0651
            java.lang.Object r0 = r14.get(r1)
            com.facebookpay.logging.LoggingContext r0 = (com.facebookpay.logging.LoggingContext) r0
            X.C51971G9r.A1B(r3, r0)
            X.GkD r1 = X.SQ1.A00(r0)
            if (r1 == 0) goto L_0x0651
        L_0x064c:
            java.lang.String r0 = "logging_policy"
            r3.A02(r1, r0)
        L_0x0651:
            X.Pxe.A1Q(r2, r3)
            java.lang.String r1 = "AUTH_LOGGING_EXTRA_KEY"
            boolean r0 = r14.containsKey(r1)
            if (r0 == 0) goto L_0x066e
        L_0x065c:
            java.lang.Object r1 = r14.get(r1)
            r1.getClass()
            java.util.Map r1 = (java.util.Map) r1
        L_0x0665:
            java.lang.String r0 = "extra_data"
            r2.A9H(r0, r1)
            r2.Cgf()
        L_0x066d:
            return
        L_0x066e:
            java.util.Map r1 = java.util.Collections.emptyMap()
            goto L_0x0665
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Stl.Cgl(java.lang.String, java.util.Map):void");
    }
}
