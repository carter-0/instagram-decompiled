package com.facebook.caa.shared.passkey;

import X.0KC;
import X.0qQ;
import X.2Mg;
import X.AnonymousClass15Q;
import X.AnonymousClass1HX;
import X.AnonymousClass4D7;
import X.AnonymousClass6Tm;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C11614SdH;
import X.C277014uI;
import X.C307896Rx;
import X.C308276Tl;
import X.C59819JZr;
import X.C66580MXl;
import X.DbS;
import X.DbT;
import X.JS4;
import X.Pxe;
import X.Pxf;
import X.Pxg;
import X.QOu;
import android.content.Context;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.caa.shared.passkey.igconfig.IGContextProvider;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class PasskeyService {
    public static final QOu A08 = new QOu(Pxg.A1X(Pxf.A0p(Pxf.A1V("do_not_use_for_real_derivation", AnonymousClass15Q.A05), 0)));
    public final Context A00;
    public final JS4 A01;
    public final C307896Rx A02;
    public final C277014uI A03;
    public final C277014uI A04;
    public final C277014uI A05;
    public final Map A06;
    public final C277014uI A07;

    public PasskeyService(Context context, C307896Rx r3, C277014uI r4, C277014uI r5, C277014uI r6, C277014uI r7, Map map) {
        0qQ.A0B(map, 7);
        this.A00 = context;
        this.A02 = r3;
        this.A05 = r4;
        this.A07 = r5;
        this.A03 = r6;
        this.A04 = r7;
        this.A06 = map;
        this.A01 = new C11614SdH(context);
    }

    public static final void A02(PasskeyService passkeyService, AnonymousClass6Tm r8, C277014uI r9) {
        C277014uI r2 = r9;
        if (r9 != null) {
            AnonymousClass7TE.A1Z(new C59819JZr(r2, r8, passkeyService, (AnonymousClass4D7) null, 5), AnonymousClass1HX.A00());
        }
    }

    static {
        try {
        } catch (IllegalArgumentException unused) {
            throw AnonymousClass7TE.A0y();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0075, code lost:
        if (X.AnonymousClass7TF.A1Y(r0, true) != false) goto L_0x0077;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A01(com.facebook.caa.shared.passkey.PasskeyService r5, X.AnonymousClass4D7 r6, X.0sP r7) {
        /*
            r4 = 23
            boolean r0 = X.C66144MDw.A02(r4, r6)
            if (r0 == 0) goto L_0x0026
            r3 = r6
            X.MDw r3 = (X.C66144MDw) r3
            int r2 = r3.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0026
            int r2 = r2 - r1
            r3.A00 = r2
        L_0x0016:
            java.lang.Object r2 = r3.A02
            X.1Hj r1 = X.1Hj.A02
            int r0 = r3.A00
            r4 = 1
            if (r0 == 0) goto L_0x0035
            if (r0 != r4) goto L_0x0030
            java.lang.Object r5 = r3.A01
            com.facebook.caa.shared.passkey.PasskeyService r5 = (com.facebook.caa.shared.passkey.PasskeyService) r5
            goto L_0x002c
        L_0x0026:
            X.MDw r3 = new X.MDw
            r3.<init>(r5, r6, r4)
            goto L_0x0016
        L_0x002c:
            X.0eS.A00(r2)     // Catch:{ Exception -> 0x0043 }
            return r2
        L_0x0030:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0035:
            X.0eS.A00(r2)
            r3.A01 = r5     // Catch:{ Exception -> 0x0043 }
            r3.A00 = r4     // Catch:{ Exception -> 0x0043 }
            java.lang.Object r2 = r7.invoke(r3)     // Catch:{ Exception -> 0x0043 }
            if (r2 != r1) goto L_0x0058
            return r1
        L_0x0043:
            r3 = move-exception
            boolean r0 = r3 instanceof X.QB5
            if (r0 == 0) goto L_0x0059
            X.4uI r1 = r5.A04
        L_0x004a:
            if (r1 == 0) goto L_0x0057
            X.6Tl r0 = X.DbS.A0P()
            X.6Tm r0 = r0.A00()
            A02(r5, r0, r1)
        L_0x0057:
            r2 = 0
        L_0x0058:
            return r2
        L_0x0059:
            boolean r0 = r3 instanceof X.C7393QAv
            if (r0 != 0) goto L_0x0061
            boolean r0 = r3 instanceof X.C8988RKe
            if (r0 == 0) goto L_0x007e
        L_0x0061:
            java.lang.String r2 = "prefer_immediately_available_credentials"
            java.util.Map r1 = r5.A06
            boolean r0 = r1.containsKey(r2)
            if (r0 == 0) goto L_0x007c
            java.lang.Object r0 = r1.get(r2)
            r1 = 1
            boolean r0 = X.AnonymousClass7TF.A1Y(r0, r4)
            if (r0 == 0) goto L_0x007c
        L_0x0077:
            if (r1 == 0) goto L_0x007e
            X.4uI r1 = r5.A03
            goto L_0x004a
        L_0x007c:
            r1 = 0
            goto L_0x0077
        L_0x007e:
            A03(r5, r3)
            goto L_0x0057
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.caa.shared.passkey.PasskeyService.A01(com.facebook.caa.shared.passkey.PasskeyService, X.4D7, X.0sP):java.lang.Object");
    }

    public static final void A04(PasskeyService passkeyService, String str) {
        if (IGContextProvider.A01(passkeyService.A00) != null) {
            try {
                C66580MXl.A17(str).getString(PublicKeyCredentialControllerUtility.JSON_KEY_RAW_ID);
            } catch (JSONException e) {
                0KC.A0G("PasskeyService", "extractCredentialId: Failed to parse json", e);
            }
        }
    }

    public static final AnonymousClass6Tm A00(PasskeyService passkeyService, String str) {
        String str2;
        try {
            str2 = C66580MXl.A17(str).getString(PublicKeyCredentialControllerUtility.JSON_KEY_RAW_ID);
        } catch (JSONException e) {
            0KC.A0G("PasskeyService", "extractCredentialId: Failed to parse json", e);
            str2 = null;
        }
        if (str2 != null) {
            0qQ.A0B(str, 0);
            try {
                JSONObject A17 = C66580MXl.A17(str);
                JSONObject optJSONObject = A17.optJSONObject(PublicKeyCredentialControllerUtility.JSON_KEY_CLIENT_EXTENSION_RESULTS);
                if (optJSONObject != null) {
                    optJSONObject.remove("prf");
                }
                String obj = A17.toString();
                if (obj != null) {
                    Charset charset = AnonymousClass15Q.A05;
                    String A0p = Pxf.A0p(Pxf.A1V(obj, charset), 11);
                    C308276Tl A0P = DbS.A0P();
                    A0P.A03(str2, 0);
                    A0P.A02(A0p);
                    A0P.A03("noop", 2);
                    JSONObject A11 = DbS.A11();
                    Iterator A0u = AnonymousClass7TF.A0u(passkeyService.A06);
                    while (A0u.hasNext()) {
                        Map.Entry A1J = AnonymousClass7TE.A1J(A0u);
                        Object key = A1J.getKey();
                        boolean A1a = AnonymousClass7TE.A1a(A1J.getValue());
                        if (0qQ.A0K(key, "device_key_signature") && A1a) {
                            2Mg r2 = new 2Mg("autofill_key");
                            JSONArray A1E = Pxe.A1E();
                            JSONObject A112 = DbS.A11();
                            A112.put("pub", r2.A00());
                            A112.put("sig", r2.A02(Pxf.A1V(obj, charset)));
                            A1E.put(A112);
                            String A012 = IGContextProvider.A01(passkeyService.A00);
                            if (A012 != null) {
                                2Mg r22 = new 2Mg(A012);
                                JSONObject A113 = DbS.A11();
                                A113.put("pub", r22.A00());
                                A113.put("sig", r22.A02(Pxf.A1V(obj, charset)));
                                A1E.put(A113);
                            }
                            A11.put("device_key_signature_ext", A1E);
                        }
                    }
                    A0P.A03(Pxf.A0p(Pxf.A1V(DbT.A10(A11), charset), 11), 3);
                    return A0P.A00();
                }
            } catch (JSONException e2) {
                0KC.A0G("PasskeyUtil", "toJSONObject: Failed to parse json", e2);
            }
        }
        return null;
    }

    public static final void A03(PasskeyService passkeyService, Exception exc) {
        C308276Tl A0P = DbS.A0P();
        A0P.A01(AnonymousClass7TF.A0m("Passkey Service Exception: ", exc));
        A02(passkeyService, A0P.A00(), passkeyService.A07);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0017, code lost:
        if (X.AnonymousClass7TF.A1Y(r1.get("device_key_signature"), r8) != false) goto L_0x0019;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String A05(android.content.Context r13, java.lang.String r14, java.lang.String r15, boolean r16) {
        /*
            r12 = this;
            boolean r8 = X.AnonymousClass7TG.A1Z(r13, r14)
            java.lang.String r2 = "device_key_signature"
            java.util.Map r1 = r12.A06
            boolean r0 = r1.containsKey(r2)
            if (r0 == 0) goto L_0x00af
            java.lang.Object r0 = r1.get(r2)
            r2 = 1
            boolean r0 = X.AnonymousClass7TF.A1Y(r0, r8)
            if (r0 == 0) goto L_0x00af
        L_0x0019:
            org.json.JSONObject r5 = X.DbS.A11()
            java.lang.String r1 = "challenge"
            java.nio.charset.Charset r4 = X.AnonymousClass15Q.A05
            byte[] r0 = X.Pxf.A1V(r14, r4)
            r3 = 11
            java.lang.String r0 = X.Pxf.A0p(r0, r3)
            r5.put(r1, r0)
            org.json.JSONObject r6 = X.DbS.A11()
            if (r2 == 0) goto L_0x0093
            java.lang.String r9 = "device_key_pubs"
            org.json.JSONArray r7 = X.Pxe.A1E()
            org.json.JSONObject r2 = X.DbS.A11()
            java.lang.String r0 = "autofill_key"
            java.lang.String r0 = X.Pxf.A0k(r0)
            java.lang.String r1 = "pub"
            r2.put(r1, r0)
            java.lang.String r11 = "ig4a"
            java.lang.String r10 = "type"
            r2.put(r10, r11)
            r7.put(r2)
            java.lang.String r0 = com.facebook.caa.shared.passkey.igconfig.IGContextProvider.A01(r13)
            if (r0 == 0) goto L_0x0072
            org.json.JSONObject r2 = X.DbS.A11()
            java.lang.String r0 = X.Pxf.A0k(r0)
            r2.put(r1, r0)
            java.lang.String r0 = "_legacy"
            java.lang.String r0 = X.002.A0R(r11, r0)
            r2.put(r10, r0)
            r7.put(r2)
        L_0x0072:
            if (r15 == 0) goto L_0x0090
            org.json.JSONObject r2 = X.DbS.A11()
            r2.put(r1, r15)
            r1 = 0
            X.2Fg r0 = new X.2Fg
            r0.<init>(r13, r1)
            java.lang.String r0 = r0.A03()
            r2.put(r10, r0)
            java.lang.String r0 = "cross_app"
            r2.put(r0, r8)
            r7.put(r2)
        L_0x0090:
            r6.put(r9, r7)
        L_0x0093:
            if (r16 == 0) goto L_0x009d
            java.lang.String r1 = "payments_cc_e2ee_pub"
            java.lang.String r0 = X.C9122RPu.A00
            r6.put(r1, r0)
        L_0x009d:
            java.lang.String r0 = "additional_data"
            r5.put(r0, r6)
            java.lang.String r0 = X.DbT.A10(r5)
            byte[] r0 = X.Pxf.A1V(r0, r4)
            java.lang.String r0 = X.Pxf.A0p(r0, r3)
            return r0
        L_0x00af:
            r2 = 0
            goto L_0x0019
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.caa.shared.passkey.PasskeyService.A05(android.content.Context, java.lang.String, java.lang.String, boolean):java.lang.String");
    }
}
