package X;

import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.SAw  reason: case insensitive filesystem */
public abstract class C11117SAw {
    public static final ConcurrentHashMap A00 = new ConcurrentHashMap();

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0077, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        X.1zE.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x007b, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C3034368u A00(android.content.Context r7, java.lang.Integer r8) {
        /*
            int r5 = X.AnonymousClass7TG.A0A(r8)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
            boolean r0 = X.C276714tm.A00()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            int r0 = X.Pxf.A0A(r1, r0)
            java.util.concurrent.ConcurrentHashMap r4 = A00
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            java.lang.Object r0 = r4.get(r3)
            if (r0 != 0) goto L_0x00ab
            if (r5 == 0) goto L_0x0036
            r0 = 16969(0x4249, float:2.3779E-41)
            if (r5 == r0) goto L_0x0033
            java.lang.String r1 = "Expected a valid screen template for implementation key: "
            java.lang.String r0 = ". Please ensure that your app provides one"
            java.lang.String r0 = X.002.A0c(r1, r0, r5)
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        L_0x0033:
            java.lang.String r6 = "json/bloks_screen_template_bottomsheet.json"
            goto L_0x0038
        L_0x0036:
            java.lang.String r6 = "json/bloks_screen_template.json"
        L_0x0038:
            boolean r0 = X.C276714tm.A00()
            if (r0 == 0) goto L_0x0047
            java.lang.String r2 = ".json"
            java.lang.String r1 = "_split.json"
            r0 = 0
            java.lang.String r6 = X.00p.A0g(r6, r2, r1, r0)
        L_0x0047:
            android.content.res.AssetManager r0 = r7.getAssets()     // Catch:{ IOException -> 0x00b5 }
            java.io.InputStream r2 = r0.open(r6)     // Catch:{ IOException -> 0x00b5 }
            X.0qQ.A07(r2)     // Catch:{ IOException -> 0x00b5 }
            java.nio.charset.Charset r1 = java.nio.charset.StandardCharsets.UTF_8     // Catch:{ IOException -> 0x00b5 }
            java.io.InputStreamReader r0 = new java.io.InputStreamReader     // Catch:{ IOException -> 0x00b5 }
            r0.<init>(r2, r1)     // Catch:{ IOException -> 0x00b5 }
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ IOException -> 0x00b5 }
            r2.<init>(r0)     // Catch:{ IOException -> 0x00b5 }
            java.lang.StringBuffer r1 = new java.lang.StringBuffer     // Catch:{ all -> 0x0075 }
            r1.<init>()     // Catch:{ all -> 0x0075 }
        L_0x0063:
            java.lang.String r0 = r2.readLine()     // Catch:{ all -> 0x0075 }
            if (r0 == 0) goto L_0x006d
            r1.append(r0)     // Catch:{ all -> 0x0075 }
            goto L_0x0063
        L_0x006d:
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0075 }
            r2.close()     // Catch:{ IOException -> 0x00b5 }
            goto L_0x007c
        L_0x0075:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0077 }
        L_0x0077:
            r0 = move-exception
            X.1zE.A00(r2, r1)     // Catch:{ IOException -> 0x00b5 }
            throw r0     // Catch:{ IOException -> 0x00b5 }
        L_0x007c:
            if (r1 == 0) goto L_0x00bb
            java.io.StringReader r0 = new java.io.StringReader
            r0.<init>(r1)
            android.util.JsonReader r1 = new android.util.JsonReader
            r1.<init>(r0)
            X.8fW r0 = new X.8fW
            r0.<init>(r1)
            r0.Crg()
            r1 = 0
            X.8fY r0 = X.C361028fY.A00(r0)
            X.0qQ.A07(r0)
            X.4tN r0 = r0.A00
            if (r0 == 0) goto L_0x00ae
            X.3ew r0 = r0.A00
            if (r0 == 0) goto L_0x00ae
            X.68u r1 = X.C3034368u.A03(r1, r0, r1)
            java.lang.Object r0 = r4.putIfAbsent(r3, r1)
            if (r0 != 0) goto L_0x00ab
            r0 = r1
        L_0x00ab:
            X.68u r0 = (X.C3034368u) r0
            return r0
        L_0x00ae:
            java.lang.String r0 = "Screen template must contain a valid BloksResponse"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r0)
            throw r0
        L_0x00b5:
            r1 = move-exception
            java.lang.String r0 = "IgBloksScreenTemplateProvider"
            X.1Kn.A03(r0, r1)
        L_0x00bb:
            java.lang.String r1 = "Got null screen template for implementation key: "
            java.lang.String r0 = ". Please make sure to provide a valid screen template!"
            java.lang.String r0 = X.002.A0c(r1, r0, r5)
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11117SAw.A00(android.content.Context, java.lang.Integer):X.68u");
    }
}
