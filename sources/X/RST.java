package X;

public abstract class RST {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: X.4tU} */
    /* JADX WARNING: type inference failed for: r4v0, types: [X.4tU, X.4tV] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C276534tU A00(org.json.JSONObject r8) {
        /*
            r6 = 0
            X.0qQ.A0B(r8, r6)
            java.lang.String r5 = "__style_id"
            int r2 = r8.getInt(r5)
            int r1 = r8.length()
            r0 = 0
            X.4tU r4 = new X.4tU
            r4.<init>(r0, r2, r1)
            java.util.Iterator r7 = r8.keys()
            X.0qQ.A07(r7)
        L_0x001b:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x0075
            java.lang.String r3 = X.AnonymousClass7TE.A18(r7)
            boolean r0 = r3.equals(r5)
            if (r0 != 0) goto L_0x001b
            java.lang.Object r2 = r8.get(r3)
            boolean r0 = r2 instanceof org.json.JSONObject
            if (r0 == 0) goto L_0x0041
            org.json.JSONObject r2 = (org.json.JSONObject) r2
            X.4tU r2 = A00(r2)
        L_0x0039:
            int r0 = java.lang.Integer.parseInt(r3)
            r4.A0P(r0, r2)
            goto L_0x001b
        L_0x0041:
            boolean r0 = r2 instanceof java.lang.String
            if (r0 == 0) goto L_0x0039
            java.lang.String r2 = (java.lang.String) r2
            r1 = r2
            java.lang.String r0 = "lispx"
            boolean r0 = r2.startsWith(r0)     // Catch:{ RuntimeException -> 0x0039 }
            if (r0 == 0) goto L_0x0056
            r0 = 15
            java.lang.String r1 = r2.substring(r0)     // Catch:{ RuntimeException -> 0x0039 }
        L_0x0056:
            java.lang.String r0 = "UTF-8"
            byte[] r0 = r1.getBytes(r0)     // Catch:{ UnsupportedEncodingException -> 0x0068 }
            java.nio.ByteBuffer r1 = com.facebook.minscript.compiler.MinsCompilerImpl$Helper.doCompile(r0, r6)     // Catch:{ UnsupportedEncodingException -> 0x0068 }
            java.nio.ByteOrder r0 = java.nio.ByteOrder.nativeOrder()     // Catch:{ RuntimeException -> 0x0039 }
            r1.order(r0)     // Catch:{ RuntimeException -> 0x0039 }
            goto L_0x006e
        L_0x0068:
            r0 = move-exception
            java.lang.RuntimeException r0 = X.C41845B3m.A0j(r0)     // Catch:{ RuntimeException -> 0x0039 }
            throw r0     // Catch:{ RuntimeException -> 0x0039 }
        L_0x006e:
            java.lang.String r0 = "Invalid param"
            java.lang.RuntimeException r0 = X.AnonymousClass7TE.A15(r0)
            throw r0
        L_0x0075:
            r4.A0O()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.RST.A00(org.json.JSONObject):X.4tU");
    }
}
