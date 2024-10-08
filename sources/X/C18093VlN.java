package X;

import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.VlN  reason: case insensitive filesystem */
public abstract class C18093VlN {
    /* JADX WARNING: type inference failed for: r1v1, types: [X.Vsp, java.lang.Object, X.UIM] */
    public static UIM A00(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            ? obj = new Object();
            C18494Vsp.A00(obj, jSONObject);
            obj.A00 = W0X.A00("contexts", jSONObject);
            obj.A01 = W0X.A00("monitors", jSONObject);
            obj.A02 = W0X.A03(jSONObject);
            obj.A03 = W0X.A02("vector", jSONObject);
            obj.A04 = W0X.A02("vectorDefaults", jSONObject);
            return obj;
        } catch (JSONException e) {
            throw new IOException(e);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: X.VQc[]} */
    /* JADX WARNING: type inference failed for: r8v0, types: [X.Vsp, java.lang.Object, X.UIN] */
    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.Object, X.VQc] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.UIN A01(java.lang.String r10) {
        /*
            org.json.JSONObject r9 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0068 }
            r9.<init>(r10)     // Catch:{ JSONException -> 0x0068 }
            X.UIN r8 = new X.UIN     // Catch:{ JSONException -> 0x0068 }
            r8.<init>()     // Catch:{ JSONException -> 0x0068 }
            X.C18494Vsp.A00(r8, r9)     // Catch:{ JSONException -> 0x0068 }
            java.lang.String r0 = "contexts"
            java.util.List r0 = X.W0X.A00(r0, r9)     // Catch:{ JSONException -> 0x0068 }
            r8.A00 = r0     // Catch:{ JSONException -> 0x0068 }
            java.lang.String r0 = "monitors"
            java.util.List r0 = X.W0X.A00(r0, r9)     // Catch:{ JSONException -> 0x0068 }
            r8.A02 = r0     // Catch:{ JSONException -> 0x0068 }
            java.util.List r0 = X.W0X.A03(r9)     // Catch:{ JSONException -> 0x0068 }
            r8.A03 = r0     // Catch:{ JSONException -> 0x0068 }
            java.lang.String r1 = "table"
            boolean r0 = r9.isNull(r1)     // Catch:{ JSONException -> 0x0068 }
            if (r0 == 0) goto L_0x002d
            r0 = 0
            goto L_0x005d
        L_0x002d:
            org.json.JSONArray r7 = r9.getJSONArray(r1)     // Catch:{ JSONException -> 0x0068 }
            int r6 = r7.length()     // Catch:{ JSONException -> 0x0068 }
            X.VQc[] r5 = new X.C17301VQc[r6]     // Catch:{ JSONException -> 0x0068 }
            r4 = 0
        L_0x0038:
            if (r4 >= r6) goto L_0x0059
            org.json.JSONObject r3 = r7.getJSONObject(r4)     // Catch:{ JSONException -> 0x0068 }
            X.VQc r2 = new X.VQc     // Catch:{ JSONException -> 0x0068 }
            r2.<init>()     // Catch:{ JSONException -> 0x0068 }
            java.lang.String r1 = "bucket"
            r0 = 0
            java.lang.String r0 = r3.optString(r1, r0)     // Catch:{ JSONException -> 0x0068 }
            r2.A00 = r0     // Catch:{ JSONException -> 0x0068 }
            java.lang.String r0 = "values"
            java.util.List r0 = X.W0X.A01(r0, r3)     // Catch:{ JSONException -> 0x0068 }
            r2.A01 = r0     // Catch:{ JSONException -> 0x0068 }
            r5[r4] = r2     // Catch:{ JSONException -> 0x0068 }
            int r4 = r4 + 1
            goto L_0x0038
        L_0x0059:
            java.util.List r0 = java.util.Arrays.asList(r5)     // Catch:{ JSONException -> 0x0068 }
        L_0x005d:
            r8.A04 = r0     // Catch:{ JSONException -> 0x0068 }
            java.lang.String r0 = "defaults"
            java.util.List r0 = X.W0X.A01(r0, r9)     // Catch:{ JSONException -> 0x0068 }
            r8.A01 = r0     // Catch:{ JSONException -> 0x0068 }
            return r8
        L_0x0068:
            r1 = move-exception
            java.io.IOException r0 = new java.io.IOException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18093VlN.A01(java.lang.String):X.UIN");
    }
}
