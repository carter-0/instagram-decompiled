package X;

import java.util.Arrays;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public abstract class W0X {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: X.VUd[]} */
    /* JADX WARNING: type inference failed for: r2v0, types: [X.VUd, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v1, types: [X.VUc, java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.List A03(org.json.JSONObject r9) {
        /*
            java.lang.String r1 = "outputs"
            boolean r0 = r9.isNull(r1)
            if (r0 == 0) goto L_0x000a
            r0 = 0
            return r0
        L_0x000a:
            org.json.JSONArray r6 = r9.getJSONArray(r1)
            int r5 = r6.length()
            X.VUd[] r4 = new X.VUd[r5]
            r3 = 0
        L_0x0015:
            if (r3 >= r5) goto L_0x005d
            org.json.JSONObject r7 = r6.getJSONObject(r3)
            X.VUd r2 = new X.VUd
            r2.<init>()
            java.lang.String r9 = "name"
            r8 = 0
            java.lang.String r0 = r7.optString(r9, r8)
            r2.A01 = r0
            java.lang.String r0 = "type"
            java.lang.String r0 = r7.optString(r0, r8)
            r2.A02 = r0
            java.lang.String r0 = "range"
            boolean r0 = r7.isNull(r0)
            if (r0 == 0) goto L_0x0041
            r1 = 0
        L_0x003a:
            r2.A00 = r1
            r4[r3] = r2
            int r3 = r3 + 1
            goto L_0x0015
        L_0x0041:
            X.VUc r1 = new X.VUc
            r1.<init>()
            java.lang.String r0 = r7.optString(r9, r8)
            r1.A00 = r0
            java.lang.String r0 = "strategy"
            java.lang.String r0 = r7.optString(r0, r8)
            r1.A01 = r0
            java.lang.String r0 = "values"
            java.util.List r0 = A02(r0, r7)
            r1.A02 = r0
            goto L_0x003a
        L_0x005d:
            java.util.List r0 = java.util.Arrays.asList(r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.W0X.A03(org.json.JSONObject):java.util.List");
    }

    public static List A00(String str, JSONObject jSONObject) {
        if (jSONObject.isNull(str)) {
            return null;
        }
        JSONArray jSONArray = jSONObject.getJSONArray(str);
        int length = jSONArray.length();
        C18471VsN[] vsNArr = new C18471VsN[length];
        for (int i = 0; i < length; i++) {
            vsNArr[i] = C18471VsN.A00(jSONArray.getJSONObject(i));
        }
        return Arrays.asList(vsNArr);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: X.VQd[]} */
    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.Object, X.VQd] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.List A01(java.lang.String r6, org.json.JSONObject r7) {
        /*
            boolean r0 = r7.isNull(r6)
            if (r0 == 0) goto L_0x0008
            r0 = 0
            return r0
        L_0x0008:
            org.json.JSONArray r7 = r7.getJSONArray(r6)
            int r6 = r7.length()
            X.VQd[] r5 = new X.C17302VQd[r6]
            r4 = 0
        L_0x0013:
            if (r4 >= r6) goto L_0x0034
            org.json.JSONObject r3 = r7.getJSONObject(r4)
            X.VQd r2 = new X.VQd
            r2.<init>()
            java.lang.String r0 = "name"
            r1 = 0
            java.lang.String r0 = r3.optString(r0, r1)
            r2.A00 = r0
            java.lang.String r0 = "value"
            java.lang.String r0 = r3.optString(r0, r1)
            r2.A01 = r0
            r5[r4] = r2
            int r4 = r4 + 1
            goto L_0x0013
        L_0x0034:
            java.util.List r0 = java.util.Arrays.asList(r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.W0X.A01(java.lang.String, org.json.JSONObject):java.util.List");
    }

    public static List A02(String str, JSONObject jSONObject) {
        if (jSONObject.isNull(str)) {
            return null;
        }
        JSONArray jSONArray = jSONObject.getJSONArray(str);
        int length = jSONArray.length();
        String[] strArr = new String[length];
        for (int i = 0; i < length; i++) {
            strArr[i] = jSONArray.getString(i);
        }
        return Arrays.asList(strArr);
    }
}
