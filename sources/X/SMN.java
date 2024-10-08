package X;

import java.util.regex.Pattern;

public final class SMN {
    public static final Pattern A00 = Pattern.compile("\\b((?:seg-\\d+(?:_\\d+)?|\\d+)\\.js)");

    /* JADX WARNING: Removed duplicated region for block: B:19:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00a1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String A00(java.lang.String r6, com.facebook.react.bridge.ReadableArray r7) {
        /*
            java.lang.StringBuilder r5 = X.Pxe.A16(r6)
            java.lang.String r0 = ", stack:\n"
            r5.append(r0)
            int r4 = r7.size()
            r3 = 0
        L_0x000e:
            if (r3 >= r4) goto L_0x00a6
            com.facebook.react.bridge.ReadableMap r6 = r7.getMap(r3)
            java.lang.String r0 = "methodName"
            java.lang.String r0 = r6.getString(r0)
            r5.append(r0)
            java.lang.String r0 = "@"
            r5.append(r0)
            java.lang.String r2 = "file"
            boolean r0 = r6.hasKey(r2)
            if (r0 == 0) goto L_0x00a3
            boolean r0 = r6.isNull(r2)
            if (r0 != 0) goto L_0x00a3
            com.facebook.react.bridge.ReadableType r1 = r6.getType(r2)
            com.facebook.react.bridge.ReadableType r0 = com.facebook.react.bridge.ReadableType.String
            if (r1 != r0) goto L_0x00a3
            java.lang.String r1 = r6.getString(r2)
            if (r1 == 0) goto L_0x00a3
            java.util.regex.Pattern r0 = A00
            java.util.regex.Matcher r1 = r0.matcher(r1)
            boolean r0 = r1.find()
            if (r0 == 0) goto L_0x00a3
            r0 = 1
            java.lang.String r1 = r1.group(r0)
            r0 = 58
            java.lang.String r0 = X.002.A0C(r1, r0)
        L_0x0056:
            r5.append(r0)
            java.lang.String r2 = "lineNumber"
            boolean r0 = r6.hasKey(r2)
            if (r0 == 0) goto L_0x00a1
            boolean r0 = r6.isNull(r2)
            if (r0 != 0) goto L_0x00a1
            com.facebook.react.bridge.ReadableType r1 = r6.getType(r2)
            com.facebook.react.bridge.ReadableType r0 = com.facebook.react.bridge.ReadableType.Number
            if (r1 != r0) goto L_0x00a1
            int r0 = r6.getInt(r2)
        L_0x0073:
            r5.append(r0)
            java.lang.String r2 = "column"
            boolean r0 = r6.hasKey(r2)
            if (r0 == 0) goto L_0x0098
            boolean r0 = r6.isNull(r2)
            if (r0 != 0) goto L_0x0098
            com.facebook.react.bridge.ReadableType r1 = r6.getType(r2)
            com.facebook.react.bridge.ReadableType r0 = com.facebook.react.bridge.ReadableType.Number
            if (r1 != r0) goto L_0x0098
            java.lang.String r0 = ":"
            r5.append(r0)
            int r0 = r6.getInt(r2)
            r5.append(r0)
        L_0x0098:
            java.lang.String r0 = "\n"
            r5.append(r0)
            int r3 = r3 + 1
            goto L_0x000e
        L_0x00a1:
            r0 = -1
            goto L_0x0073
        L_0x00a3:
            java.lang.String r0 = ""
            goto L_0x0056
        L_0x00a6:
            java.lang.String r0 = X.DbT.A10(r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SMN.A00(java.lang.String, com.facebook.react.bridge.ReadableArray):java.lang.String");
    }
}
