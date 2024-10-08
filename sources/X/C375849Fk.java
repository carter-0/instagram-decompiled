package X;

import com.instagram.common.session.UserSession;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.9Fk  reason: invalid class name and case insensitive filesystem */
public final class C375849Fk {
    public final UserSession A00;

    public C375849Fk(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
    }

    public static final void A00(C390799rr r3, JSONObject jSONObject) {
        try {
            JSONObject optJSONObject = jSONObject.optJSONObject("nta_eligibility");
            if (optJSONObject == null) {
                optJSONObject = new JSONObject();
            }
            optJSONObject.put(String.valueOf(3), r3);
            jSONObject.put("nta_eligibility", optJSONObject);
        } catch (JSONException e) {
            0KC.A0F("FXIGAccessLibrarySSOAndRegFlagAppJob", "Failed when saving SSO Eligibility", e);
        }
    }

    public static final void A01(C390799rr r2, JSONObject jSONObject) {
        try {
            JSONObject optJSONObject = jSONObject.optJSONObject("nta_eligibility");
            if (optJSONObject == null) {
                optJSONObject = new JSONObject();
            }
            optJSONObject.put(String.valueOf(3), r2);
            jSONObject.put("nta_super_eligibility", optJSONObject);
        } catch (JSONException e) {
            0KC.A0F("FXIGAccessLibrarySSOAndRegFlagAppJob", "Failed when saving SSO Eligibility", e);
        }
    }

    public static final void A02(C390799rr r3, JSONObject jSONObject) {
        try {
            JSONObject optJSONObject = jSONObject.optJSONObject("sso_eligibility");
            if (optJSONObject == null) {
                optJSONObject = new JSONObject();
            }
            optJSONObject.put(String.valueOf(3), r3);
            jSONObject.put("sso_eligibility", optJSONObject);
        } catch (JSONException e) {
            0KC.A0F("FXIGAccessLibrarySSOAndRegFlagAppJob", "Failed when saving SSO Eligibility", e);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0056, code lost:
        if (r22 != false) goto L_0x0058;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00fc, code lost:
        if (r22 != false) goto L_0x0058;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0028, code lost:
        if (r10.length() == 0) goto L_0x002a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A03(X.B2L r24, boolean r25) {
        /*
            r23 = this;
            r9 = r23
            com.instagram.common.session.UserSession r2 = r9.A00
            X.0wX r8 = r2.A03
            android.content.Context r0 = r8.A06()
            X.1Uf r1 = X.AnonymousClass1UZ.A00(r0)
            java.lang.String r0 = "XE_ACCESS_LIBRARY_DATA"
            X.1Uk r6 = r1.A00(r0)
            X.0qQ.A07(r6)
            java.lang.String r7 = "sso_settings_v2"
            r13 = 0
            java.lang.String r10 = r6.getString(r7, r13)
            java.lang.String r3 = "FXIGAccessLibrarySSOAndRegFlagAppJob"
            r12 = 0
            if (r10 == 0) goto L_0x002a
            int r1 = r10.length()     // Catch:{ JSONException -> 0x0100 }
            r0 = 0
            if (r1 != 0) goto L_0x002b
        L_0x002a:
            r0 = 1
        L_0x002b:
            java.lang.String r5 = "timestamp"
            if (r0 == 0) goto L_0x0039
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0100 }
            r4.<init>()     // Catch:{ JSONException -> 0x0100 }
            r0 = -1
            r4.put(r5, r0)     // Catch:{ JSONException -> 0x0100 }
            goto L_0x003e
        L_0x0039:
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0100 }
            r4.<init>(r10)     // Catch:{ JSONException -> 0x0100 }
        L_0x003e:
            X.0Tu r3 = X.0Tu.A05
            r0 = 36321271407125729(0x810a01000324e1, double:3.0330565196625475E-306)
            boolean r21 = X.182.A06(r3, r2, r0)
            r0 = 36321271407060192(0x810a01000224e0, double:3.0330565196211017E-306)
            boolean r22 = X.182.A06(r3, r2, r0)
            r17 = r24
            if (r21 != 0) goto L_0x00f7
            if (r22 == 0) goto L_0x008d
        L_0x0058:
            X.9rr r0 = X.C390799rr.FXAccountItemEligibilityIneligible
            A00(r0, r4)
            A01(r0, r4)
        L_0x0060:
            X.1W3 r1 = r6.AR0()
            java.lang.String r0 = r4.toString()
            r1.A09(r7, r0)
            boolean r0 = r1.A0B()
            if (r0 == 0) goto L_0x0083
            r0 = 36324935014101489(0x810d56000131f1, double:3.0353733994661794E-306)
            boolean r0 = X.182.A06(r3, r2, r0)
            if (r0 == 0) goto L_0x0083
            android.content.Context r0 = r8.A06()
            X.C49963FGw.A05(r0)
        L_0x0083:
            if (r21 == 0) goto L_0x008d
            if (r22 == 0) goto L_0x008d
            if (r24 == 0) goto L_0x008c
            r17.onSuccess()
        L_0x008c:
            return
        L_0x008d:
            r0 = -1
            long r0 = r4.optLong(r5, r0)
            long r19 = java.lang.System.currentTimeMillis()
            long r10 = r19 - r0
            r0 = 36602746383700729(0x820a01000112f9, double:3.211062428257334E-306)
            long r7 = X.182.A01(r3, r2, r0)
            r0 = 1000(0x3e8, double:4.94E-321)
            long r7 = r7 * r0
            if (r25 != 0) goto L_0x00ab
            int r0 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r0 <= 0) goto L_0x008c
        L_0x00ab:
            X.A7l r0 = new X.A7l
            r15 = r6
            r16 = r9
            r18 = r4
            r14 = r0
            r14.<init>(r15, r16, r17, r18, r19, r21, r22)
            X.2IS r4 = new X.2IS
            r4.<init>()
            X.2IS r3 = new X.2IS
            r3.<init>()
            X.2IY r1 = com.facebook.pando.PandoGraphQLRequest.Companion
            X.1vR r7 = X.AnonymousClass1vS.A00()
            java.util.Map r9 = r4.getParamsCopy()
            java.util.Map r10 = r3.getParamsCopy()
            java.lang.Class<X.9f0> r11 = X.C383089f0.class
            java.util.ArrayList r17 = new java.util.ArrayList
            r17.<init>()
            java.lang.String r8 = "IGFXAccessLibrarySSOAndRegFlagQuery"
            java.lang.String r16 = "fx_waffle_wfs_and_nta_eligibility"
            com.facebook.pando.PandoGraphQLRequest r6 = new com.facebook.pando.PandoGraphQLRequest
            r14 = r12
            r15 = r13
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r3 = 0
            r6.setMaxToleratedCacheAgeMs(r3)
            X.1vn r3 = X.1vm.A01(r2)
            X.ASt r2 = new X.ASt
            r2.<init>(r0)
            X.ASd r1 = new X.ASd
            r1.<init>(r0)
            r3.ATL(r1, r2, r6)
            return
        L_0x00f7:
            X.9rr r0 = X.C390799rr.FXAccountItemEligibilityIneligible
            A02(r0, r4)
            if (r22 == 0) goto L_0x0060
            goto L_0x0058
        L_0x0100:
            r1 = move-exception
            java.lang.String r0 = "Convert SSO settings string to json failed"
            X.0KC.A0F(r3, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C375849Fk.A03(X.B2L, boolean):void");
    }
}
