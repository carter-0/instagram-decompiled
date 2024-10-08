package X;

import android.os.Bundle;
import com.facebook.react.bridge.ReadableMap;
import java.util.Iterator;
import java.util.regex.Pattern;

public abstract class SAW {
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0087, code lost:
        if (r11 == null) goto L_0x008c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00b5, code lost:
        if (r0.equals(r11) == false) goto L_0x00a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0116, code lost:
        if (r1 == android.util.JsonToken.STRING) goto L_0x0118;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0118, code lost:
        r8.putString(r11, r7.nextString());
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.0yf A00(android.content.Context r14, java.io.InputStream r15) {
        /*
            r6 = 1
            X.0qQ.A0B(r14, r6)
            r5 = 0
            X.0yf r4 = X.Pxe.A0N(r5)
            java.io.InputStreamReader r0 = new java.io.InputStreamReader
            r0.<init>(r15)
            android.util.JsonReader r7 = new android.util.JsonReader
            r7.<init>(r0)
            r7.beginArray()
        L_0x0016:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x01f6
            android.os.Bundle r3 = X.AnonymousClass7TE.A0a()
            r7.beginObject()
            r2 = 0
        L_0x0024:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x01e5
            java.lang.String r8 = r7.nextName()
            if (r8 == 0) goto L_0x0037
            int r0 = r8.hashCode()
            switch(r0) {
                case -1068411414: goto L_0x003b;
                case 3373707: goto L_0x01b0;
                case 3433509: goto L_0x01c2;
                case 418403409: goto L_0x01d4;
                default: goto L_0x0037;
            }
        L_0x0037:
            r7.skipValue()
            goto L_0x0024
        L_0x003b:
            java.lang.String r10 = "navigationOptions"
            boolean r0 = r8.equals(r10)
            if (r0 == 0) goto L_0x0037
            java.util.HashMap r9 = X.AnonymousClass7TE.A1E()
            r11 = 0
            android.content.res.Resources r1 = r14.getResources()     // Catch:{ IOException -> 0x0087, all -> 0x01ef }
            r0 = 2131886148(0x7f120044, float:1.9406867E38)
            java.io.InputStream r11 = r1.openRawResource(r0)     // Catch:{ IOException -> 0x0087, all -> 0x01ef }
            java.io.InputStreamReader r0 = new java.io.InputStreamReader     // Catch:{ IOException -> 0x0087, all -> 0x01ef }
            r0.<init>(r11)     // Catch:{ IOException -> 0x0087, all -> 0x01ef }
            android.util.JsonReader r12 = new android.util.JsonReader     // Catch:{ IOException -> 0x0087, all -> 0x01ef }
            r12.<init>(r0)     // Catch:{ IOException -> 0x0087, all -> 0x01ef }
            r12.beginObject()     // Catch:{ IOException -> 0x0087, all -> 0x01ef }
        L_0x0061:
            boolean r0 = r12.hasNext()     // Catch:{ IOException -> 0x0087, all -> 0x01ef }
            if (r0 == 0) goto L_0x007e
            java.lang.String r8 = r12.nextName()     // Catch:{ IOException -> 0x0087, all -> 0x01ef }
            android.util.JsonToken r1 = r12.peek()     // Catch:{ IOException -> 0x0087, all -> 0x01ef }
            android.util.JsonToken r0 = android.util.JsonToken.STRING     // Catch:{ IOException -> 0x0087, all -> 0x01ef }
            if (r1 == r0) goto L_0x0076
            r12.skipValue()     // Catch:{ IOException -> 0x0087, all -> 0x01ef }
        L_0x0076:
            java.lang.String r0 = r12.nextString()     // Catch:{ IOException -> 0x0087, all -> 0x01ef }
            r9.put(r8, r0)     // Catch:{ IOException -> 0x0087, all -> 0x01ef }
            goto L_0x0061
        L_0x007e:
            r12.endObject()     // Catch:{ IOException -> 0x0087, all -> 0x01ef }
            r12.close()     // Catch:{ IOException -> 0x0087, all -> 0x01ef }
            if (r11 == 0) goto L_0x008c
            goto L_0x0089
        L_0x0087:
            if (r11 == 0) goto L_0x008c
        L_0x0089:
            r11.close()     // Catch:{ IOException -> 0x008c }
        L_0x008c:
            android.os.Bundle r8 = X.AnonymousClass7TE.A0a()
            r7.beginObject()
        L_0x0093:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x01a8
            java.lang.String r0 = r7.nextName()
            if (r0 == 0) goto L_0x00a7
            int r1 = r0.hashCode()
            r11 = 0
            switch(r1) {
                case -1509809893: goto L_0x0197;
                case -1439500848: goto L_0x0172;
                case -305028090: goto L_0x0149;
                case -271593121: goto L_0x0121;
                case 110371416: goto L_0x00b8;
                case 313127314: goto L_0x00af;
                case 426715394: goto L_0x00ab;
                default: goto L_0x00a7;
            }
        L_0x00a7:
            r7.skipValue()
            goto L_0x0093
        L_0x00ab:
            java.lang.String r11 = "perfLogger_ttiEventName"
            goto L_0x00b1
        L_0x00af:
            java.lang.String r11 = "analyticsModule"
        L_0x00b1:
            boolean r0 = r0.equals(r11)
            if (r0 != 0) goto L_0x0118
            goto L_0x00a7
        L_0x00b8:
            java.lang.String r11 = "title"
            boolean r0 = r0.equals(r11)
            if (r0 == 0) goto L_0x00a7
            android.util.JsonToken r1 = r7.peek()
            android.util.JsonToken r0 = android.util.JsonToken.BEGIN_OBJECT
            if (r1 != r0) goto L_0x0114
            r7.beginObject()
            r12 = 0
            r1 = r12
        L_0x00ce:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x00f7
            java.lang.String r13 = r7.nextName()
            java.lang.String r0 = "text"
            boolean r0 = X.0qQ.A0K(r13, r0)
            if (r0 == 0) goto L_0x00e6
            java.lang.String r1 = r7.nextString()
            goto L_0x00ce
        L_0x00e6:
            java.lang.String r0 = "hashKey"
            boolean r0 = X.0qQ.A0K(r13, r0)
            if (r0 == 0) goto L_0x00f3
            java.lang.String r12 = r7.nextString()
            goto L_0x00ce
        L_0x00f3:
            r7.skipValue()
            goto L_0x00ce
        L_0x00f7:
            boolean r0 = r9.containsKey(r12)
            if (r0 == 0) goto L_0x010d
            java.lang.String r1 = X.DbS.A0r(r12, r9)
            X.0qQ.A0A(r1)
            int r0 = r1.length()
            int r0 = r0 - r6
            java.lang.String r1 = X.C51967G9n.A0q(r1, r6, r0)
        L_0x010d:
            r8.putString(r11, r1)
            r7.endObject()
            goto L_0x0093
        L_0x0114:
            android.util.JsonToken r0 = android.util.JsonToken.STRING
            if (r1 != r0) goto L_0x00a7
        L_0x0118:
            java.lang.String r0 = r7.nextString()
            r8.putString(r11, r0)
            goto L_0x0093
        L_0x0121:
            java.lang.String r11 = "navigationBar"
            boolean r0 = r0.equals(r11)
            if (r0 == 0) goto L_0x00a7
            java.lang.String r1 = r7.nextString()
            java.lang.String r0 = "hidden"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x013b
            r8.putBoolean(r11, r5)
            goto L_0x0093
        L_0x013b:
            java.lang.String r0 = "shown"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0093
            r8.putBoolean(r11, r6)
            goto L_0x0093
        L_0x0149:
            java.lang.String r12 = "fb_analyticsExtras"
            boolean r0 = r0.equals(r12)
            if (r0 == 0) goto L_0x00a7
            android.os.Bundle r11 = X.AnonymousClass7TE.A0a()
            r7.beginObject()
        L_0x0158:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x016a
            java.lang.String r1 = r7.nextName()
            java.lang.String r0 = r7.nextString()
            r11.putString(r1, r0)
            goto L_0x0158
        L_0x016a:
            r7.endObject()
            r8.putParcelable(r12, r11)
            goto L_0x0093
        L_0x0172:
            java.lang.String r1 = "orientation"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00a7
            java.lang.String r12 = r7.nextString()
            java.lang.String r0 = "PORTRAIT"
            boolean r0 = X.0qQ.A0K(r12, r0)
            if (r0 == 0) goto L_0x018d
            r11 = 1
        L_0x0188:
            r8.putInt(r1, r11)
            goto L_0x0093
        L_0x018d:
            java.lang.String r0 = "LANDSCAPE"
            boolean r0 = X.0qQ.A0K(r12, r0)
            if (r0 != 0) goto L_0x0188
            r11 = -1
            goto L_0x0188
        L_0x0197:
            java.lang.String r1 = "logoAsTitle"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00a7
            boolean r0 = r7.nextBoolean()
            r8.putBoolean(r1, r0)
            goto L_0x0093
        L_0x01a8:
            r7.endObject()
            r3.putBundle(r10, r8)
            goto L_0x0024
        L_0x01b0:
            java.lang.String r1 = "name"
            boolean r0 = r8.equals(r1)
            if (r0 == 0) goto L_0x0037
            java.lang.String r2 = r7.nextString()
            r3.putString(r1, r2)
            goto L_0x0024
        L_0x01c2:
            java.lang.String r1 = "path"
            boolean r0 = r8.equals(r1)
            if (r0 == 0) goto L_0x0037
            java.lang.String r0 = r7.nextString()
            r3.putString(r1, r0)
            goto L_0x0024
        L_0x01d4:
            java.lang.String r1 = "isFromRegistry"
            boolean r0 = r8.equals(r1)
            if (r0 == 0) goto L_0x0037
            boolean r0 = r7.nextBoolean()
            r3.putBoolean(r1, r0)
            goto L_0x0024
        L_0x01e5:
            r7.endObject()
            if (r2 == 0) goto L_0x0016
            r4.put(r2, r3)
            goto L_0x0016
        L_0x01ef:
            r0 = move-exception
            if (r11 == 0) goto L_0x01f5
            r11.close()     // Catch:{ IOException -> 0x01f5 }
        L_0x01f5:
            throw r0
        L_0x01f6:
            r7.endArray()
            r7.close()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SAW.A00(android.content.Context, java.io.InputStream):X.0yf");
    }

    public static final void A01(Bundle bundle, ReadableMap readableMap) {
        String str;
        String string;
        boolean A1Z = AnonymousClass7TG.A1Z(bundle, readableMap);
        Pattern compile = Pattern.compile("^<(\\S+)>$");
        Iterator A0t = Pxf.A0t(bundle);
        while (A0t.hasNext()) {
            String A18 = AnonymousClass7TE.A18(A0t);
            Object obj = bundle.get(A18);
            if ((obj instanceof String) && (str = (String) obj) != null && DbV.A1b(str, compile) && (string = readableMap.getString(C51967G9n.A0q(str, A1Z, str.length() - (A1Z ? 1 : 0)))) != null) {
                bundle.putString(A18, string);
            }
        }
    }
}
