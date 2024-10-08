package X;

import com.facebook.common.stringformat.StringFormatUtil;

/* renamed from: X.SNt  reason: case insensitive filesystem */
public final class C11338SNt {
    public static final C11338SNt A00 = new Object();
    public static final String[] A01;

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, X.SNt] */
    static {
        String[] strArr = new String[128];
        int i = 0;
        do {
            strArr[i] = StringFormatUtil.formatStrLocaleSafe("\\u%04x", Integer.valueOf(i));
            i++;
        } while (i < 32);
        Pxh.A1U(strArr);
        strArr[60] = "\\u003c";
        strArr[62] = "\\u003e";
        strArr[38] = "\\u0026";
        strArr[61] = "\\u003d";
        strArr[39] = "\\u0027";
        A01 = strArr;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: org.json.JSONArray} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: org.json.JSONObject} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: org.json.JSONArray} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: org.json.JSONArray} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A01(java.lang.Object r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof org.json.JSONObject
            if (r0 == 0) goto L_0x0034
            org.json.JSONObject r7 = (org.json.JSONObject) r7
            org.json.JSONObject r5 = X.DbS.A11()
            java.util.Iterator r4 = r7.keys()
            X.0qQ.A07(r4)
        L_0x0011:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0056
            java.lang.String r3 = X.AnonymousClass7TE.A18(r4)
            X.SNt r2 = A00     // Catch:{ JSONException -> 0x0011 }
            X.0qQ.A0A(r3)     // Catch:{ JSONException -> 0x0011 }
            r0 = 1
            java.lang.String r1 = A00(r3, r0)     // Catch:{ JSONException -> 0x0011 }
            java.lang.Object r0 = r7.get(r3)     // Catch:{ JSONException -> 0x0011 }
            X.0qQ.A07(r0)     // Catch:{ JSONException -> 0x0011 }
            java.lang.Object r0 = r2.A01(r0)     // Catch:{ JSONException -> 0x0011 }
            r5.put(r1, r0)     // Catch:{ JSONException -> 0x0011 }
            goto L_0x0011
        L_0x0034:
            boolean r0 = r7 instanceof org.json.JSONArray
            if (r0 == 0) goto L_0x0057
            org.json.JSONArray r7 = (org.json.JSONArray) r7
            org.json.JSONArray r5 = X.Pxe.A1E()
            int r2 = r7.length()
            r1 = 0
        L_0x0043:
            if (r1 >= r2) goto L_0x0056
            java.lang.Object r0 = r7.get(r1)     // Catch:{ JSONException -> 0x0053 }
            X.0qQ.A07(r0)     // Catch:{ JSONException -> 0x0053 }
            java.lang.Object r0 = r6.A01(r0)     // Catch:{ JSONException -> 0x0053 }
            r5.put(r0)     // Catch:{ JSONException -> 0x0053 }
        L_0x0053:
            int r1 = r1 + 1
            goto L_0x0043
        L_0x0056:
            return r5
        L_0x0057:
            boolean r0 = r7 instanceof java.lang.Integer
            if (r0 != 0) goto L_0x0069
            boolean r0 = r7 instanceof java.lang.Boolean
            if (r0 != 0) goto L_0x0069
            java.lang.String r1 = r7.toString()
            r0 = 1
            java.lang.String r7 = A00(r1, r0)
            return r7
        L_0x0069:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11338SNt.A01(java.lang.Object):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0017 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String A00(java.lang.String r4, boolean r5) {
        /*
            java.lang.StringBuilder r3 = X.AnonymousClass7TE.A1A()
            r2 = 0
        L_0x0005:
            int r0 = r4.length()
            if (r2 >= r0) goto L_0x003a
            char r1 = r4.charAt(r2)
            r0 = 92
            if (r1 != r0) goto L_0x001d
            if (r5 == 0) goto L_0x002f
            java.lang.String r0 = "\\\\\\\\"
        L_0x0017:
            r3.append(r0)
            int r2 = r2 + 1
            goto L_0x0005
        L_0x001d:
            r0 = 128(0x80, float:1.794E-43)
            if (r1 < r0) goto L_0x002f
            r0 = 8232(0x2028, float:1.1535E-41)
            if (r1 != r0) goto L_0x0028
            java.lang.String r0 = "\\u2028"
            goto L_0x0017
        L_0x0028:
            r0 = 8233(0x2029, float:1.1537E-41)
            if (r1 != r0) goto L_0x0035
            java.lang.String r0 = "\\u2029"
            goto L_0x0017
        L_0x002f:
            java.lang.String[] r0 = A01
            r0 = r0[r1]
            if (r0 != 0) goto L_0x0017
        L_0x0035:
            java.lang.String r0 = java.lang.String.valueOf(r1)
            goto L_0x0017
        L_0x003a:
            java.lang.String r0 = X.DbT.A10(r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11338SNt.A00(java.lang.String, boolean):java.lang.String");
    }
}
