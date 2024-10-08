package X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.4iz  reason: invalid class name and case insensitive filesystem */
public abstract class C271524iz {
    public static 1R7 A00(JSONObject jSONObject) {
        Set set;
        1R6 r10;
        JSONObject jSONObject2 = jSONObject;
        JSONArray optJSONArray = jSONObject2.optJSONArray("walletDefinitionsKeys");
        JSONObject optJSONObject = jSONObject2.optJSONObject("carrierSingalConfig");
        String string = jSONObject2.getString("hash");
        String optString = jSONObject2.optString("carrierName");
        String optString2 = jSONObject2.optString("deadline");
        ArrayList A00 = AnonymousClass4j0.A00(jSONObject2.getJSONArray("rewriteRules"));
        ArrayList A002 = AnonymousClass4j0.A00(jSONObject2.getJSONArray("backupRewriteRules"));
        JSONArray jSONArray = jSONObject2.getJSONArray("features");
        HashSet hashSet = new HashSet(jSONArray.length());
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            hashSet.add(jSONArray.getString(i));
        }
        String optString3 = jSONObject2.optString("campaignId");
        int i2 = jSONObject2.getInt("ttl");
        long j = jSONObject2.getLong("fetchedAt");
        int optInt = jSONObject2.optInt("carrierID");
        if (optJSONArray == null) {
            set = Collections.emptySet();
        } else {
            HashSet hashSet2 = new HashSet(optJSONArray.length());
            int length2 = optJSONArray.length();
            for (int i3 = 0; i3 < length2; i3++) {
                hashSet2.add(optJSONArray.getString(i3));
            }
            set = hashSet2;
        }
        int optInt2 = jSONObject2.optInt("cmsFetchIntervalSeconds", 86400);
        if (optJSONObject != null) {
            JSONArray jSONArray2 = optJSONObject.getJSONArray("pingConfigs");
            int length3 = jSONArray2.length();
            ArrayList arrayList = new ArrayList(length3);
            for (int i4 = 0; i4 != length3; i4++) {
                JSONObject jSONObject3 = jSONArray2.getJSONObject(i4);
                arrayList.add(new C17978VjG(jSONObject3.getString("key"), jSONObject3.getString("url"), jSONObject3.getInt("cooldown")));
            }
            r10 = new 1R6(arrayList);
        } else {
            r10 = new 1R6();
        }
        return new 1R7(r10, string, optString, optString2, optString3, jSONObject2.optString("eligibilityHash"), A00, A002, hashSet, set, i2, optInt, optInt2, j);
    }

    public static JSONObject A01(1R7 r5) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("version", 1);
        jSONObject.put("hash", r5.A09);
        jSONObject.put("ttl", r5.A02);
        jSONObject.put("fetchedAt", r5.A03);
        jSONObject.put("carrierName", r5.A06);
        jSONObject.put("campaignId", r5.A05);
        jSONObject.put("features", new JSONArray(r5.A0C));
        jSONObject.put("rewriteRules", AnonymousClass4j0.A01(r5.A0B));
        jSONObject.put("backupRewriteRules", AnonymousClass4j0.A01(r5.A0A));
        jSONObject.put("carrierID", r5.A00);
        jSONObject.put("walletDefinitionsKeys", new JSONArray(r5.A0D));
        jSONObject.put("cmsFetchIntervalSeconds", r5.A01);
        jSONObject.put("carrierSingalConfig", C281955Af.A00(r5.A04));
        return jSONObject;
    }
}
