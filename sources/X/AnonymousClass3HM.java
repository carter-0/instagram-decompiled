package X;

/* renamed from: X.3HM  reason: invalid class name */
public abstract class AnonymousClass3HM {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: X.0c9} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: X.0c9} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: X.0c9} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: X.0c9} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: X.Q00} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: X.0c9} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: X.0c9} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v12, resolved type: java.lang.reflect.InvocationTargetException} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: X.0c9} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: X.16F} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v24, resolved type: X.Q00} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v25, resolved type: X.Q00} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v27, resolved type: java.lang.IllegalArgumentException} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v28, resolved type: java.lang.IllegalStateException} */
    /* JADX WARNING: Can't wrap try/catch for region: R(14:31|(1:33)|34|(4:36|37|38|(1:40))|41|43|44|(1:46)|47|48|49|50|51|52) */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0169, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x016a, code lost:
        r2 = X.0wj.A01.AEf("AutoResponseParserUtil", 817896653);
        r2.ABO(com.facebook.proxygen.TraceFieldType.StatusCode, r11.A02);
        r2.ABQ("reason_phrase", X.002.A0R("", r11.A03));
        r2.ERJ(r3);
        r2.report();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x018f, code lost:
        throw r3;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:50:0x00b1 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:84:0x012b */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:97:0x0152=Splitter:B:97:0x0152, B:93:0x0148=Splitter:B:93:0x0148} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.1XR A00(X.15p r10, X.2ZL r11, X.1FX r12, java.io.InputStream r13, java.lang.Class r14, boolean r15) {
        /*
            r4 = 0
            r2 = 0
            if (r13 == 0) goto L_0x010d
            if (r15 == 0) goto L_0x001a
            java.lang.String r1 = "Content-Type"
            X.1Fn r0 = r11.A01(r1)     // Catch:{ 1bD -> 0x010b, 3HN -> 0x0109 }
            if (r0 == 0) goto L_0x00d6
            java.lang.String r0 = r0.A01     // Catch:{ 1bD -> 0x010b, 3HN -> 0x0109 }
            if (r0 == 0) goto L_0x00d6
            java.lang.String r3 = "application/json"
            int r0 = X.00l.A08(r0, r3, r4, r4)     // Catch:{ 1bD -> 0x010b, 3HN -> 0x0109 }
            if (r0 < 0) goto L_0x00d6
        L_0x001a:
            java.lang.String r0 = "X-IG-Cache-Control"
            X.1Fn r0 = r11.A01(r0)     // Catch:{ 1bD -> 0x010b, 3HN -> 0x0109 }
            java.io.InputStream r13 = r12.FNb(r0, r13)     // Catch:{ 1bD -> 0x010b, 3HN -> 0x0109 }
            if (r10 == 0) goto L_0x002b
            X.16F r3 = r10.A01(r13)     // Catch:{ 1bD -> 0x010b, 3HN -> 0x0109 }
            goto L_0x0031
        L_0x002b:
            X.15p r0 = X.AnonymousClass15o.A00     // Catch:{ 1bD -> 0x010b, 3HN -> 0x0109 }
            X.16F r3 = r0.A01(r13)     // Catch:{ 1bD -> 0x010b, 3HN -> 0x0109 }
        L_0x0031:
            r3.A1J()     // Catch:{ 1bD -> 0x0150, 3HN -> 0x0146, all -> 0x015c }
            X.16L r0 = r3.A11()     // Catch:{ 1bD -> 0x0150, 3HN -> 0x0146, all -> 0x015c }
            if (r0 == 0) goto L_0x010e
            java.lang.String r1 = "parseFromJson"
            java.lang.Class<X.16F> r0 = X.16F.class
            java.lang.Class[] r0 = new java.lang.Class[]{r0}     // Catch:{ NoSuchMethodException -> 0x00c5, InvocationTargetException -> 0x0131, IllegalAccessException -> 0x00bd }
            java.lang.reflect.Method r6 = r14.getMethod(r1, r0)     // Catch:{ NoSuchMethodException -> 0x00c5, InvocationTargetException -> 0x0131, IllegalAccessException -> 0x00bd }
            boolean r0 = r3 instanceof X.0c9     // Catch:{ NoSuchMethodException -> 0x00c5, InvocationTargetException -> 0x0131, IllegalAccessException -> 0x00bd }
            java.lang.String r5 = "X-IG-ANDROID-FROM-DISK-CACHE"
            if (r0 == 0) goto L_0x0059
            r4 = r3
            X.0c9 r4 = (X.0c9) r4     // Catch:{ NoSuchMethodException -> 0x00c5, InvocationTargetException -> 0x0131, IllegalAccessException -> 0x00bd }
            X.1Fn r1 = r11.A01(r5)     // Catch:{ NoSuchMethodException -> 0x00c5, InvocationTargetException -> 0x0131, IllegalAccessException -> 0x00bd }
            r0 = 0
            if (r1 == 0) goto L_0x0057
            r0 = 1
        L_0x0057:
            r4.A00 = r0     // Catch:{ NoSuchMethodException -> 0x00c5, InvocationTargetException -> 0x0131, IllegalAccessException -> 0x00bd }
        L_0x0059:
            java.lang.Object[] r0 = new java.lang.Object[]{r3}     // Catch:{ NoSuchMethodException -> 0x00c5, InvocationTargetException -> 0x0131, IllegalAccessException -> 0x00bd }
            java.lang.Object r2 = r6.invoke(r2, r0)     // Catch:{ NoSuchMethodException -> 0x00c5, InvocationTargetException -> 0x0131, IllegalAccessException -> 0x00bd }
            X.1XR r2 = (X.1XR) r2     // Catch:{ NoSuchMethodException -> 0x00c5, InvocationTargetException -> 0x0131, IllegalAccessException -> 0x00bd }
            if (r2 == 0) goto L_0x00b5
            int r0 = r11.A02     // Catch:{ NoSuchMethodException -> 0x00c5, InvocationTargetException -> 0x0131, IllegalAccessException -> 0x00bd }
            r2.setStatusCode(r0)     // Catch:{ NoSuchMethodException -> 0x00c5, InvocationTargetException -> 0x0131, IllegalAccessException -> 0x00bd }
            X.1Fn r1 = r11.A01(r5)     // Catch:{ NoSuchMethodException -> 0x00c5, InvocationTargetException -> 0x0131, IllegalAccessException -> 0x00bd }
            r0 = 0
            if (r1 == 0) goto L_0x0072
            r0 = 1
        L_0x0072:
            r2.setFromDiskCache(r0)     // Catch:{ NoSuchMethodException -> 0x00c5, InvocationTargetException -> 0x0131, IllegalAccessException -> 0x00bd }
            java.lang.String r0 = "Date"
            X.1Fn r5 = r11.A01(r0)     // Catch:{ NoSuchMethodException -> 0x00c5, InvocationTargetException -> 0x0131, IllegalAccessException -> 0x00bd }
            if (r5 == 0) goto L_0x0095
            java.lang.String r4 = "EEE, dd MMM yyyy HH:mm:ss z"
            java.util.Locale r0 = java.util.Locale.US     // Catch:{ Exception -> 0x0095 }
            java.text.SimpleDateFormat r1 = new java.text.SimpleDateFormat     // Catch:{ Exception -> 0x0095 }
            r1.<init>(r4, r0)     // Catch:{ Exception -> 0x0095 }
            java.lang.String r0 = r5.A01     // Catch:{ Exception -> 0x0095 }
            java.util.Date r0 = r1.parse(r0)     // Catch:{ Exception -> 0x0095 }
            if (r0 == 0) goto L_0x0095
            long r0 = r0.getTime()     // Catch:{ Exception -> 0x0095 }
            r2.setResponseTimestamp(r0)     // Catch:{ Exception -> 0x0095 }
        L_0x0095:
            java.lang.String r0 = "X-IG-Request-Elapsed-Time-MS"
            X.1Fn r0 = r11.A01(r0)     // Catch:{ NoSuchMethodException -> 0x00c5, InvocationTargetException -> 0x0131, IllegalAccessException -> 0x00bd }
            if (r0 == 0) goto L_0x00a9
            java.lang.String r0 = r0.A01     // Catch:{ NoSuchMethodException -> 0x00c5, InvocationTargetException -> 0x0131, IllegalAccessException -> 0x00bd }
            X.0qQ.A06(r0)     // Catch:{ NoSuchMethodException -> 0x00c5, InvocationTargetException -> 0x0131, IllegalAccessException -> 0x00bd }
            long r0 = java.lang.Long.parseLong(r0)     // Catch:{ NoSuchMethodException -> 0x00c5, InvocationTargetException -> 0x0131, IllegalAccessException -> 0x00bd }
            r2.setServerElapsedTime(r0)     // Catch:{ NoSuchMethodException -> 0x00c5, InvocationTargetException -> 0x0131, IllegalAccessException -> 0x00bd }
        L_0x00a9:
            int r0 = r11.A01     // Catch:{ NoSuchMethodException -> 0x00c5, InvocationTargetException -> 0x0131, IllegalAccessException -> 0x00bd }
            r2.setResponseId(r0)     // Catch:{ NoSuchMethodException -> 0x00c5, InvocationTargetException -> 0x0131, IllegalAccessException -> 0x00bd }
            r3.close()     // Catch:{ IOException -> 0x00b1 }
        L_0x00b1:
            r13.close()     // Catch:{ Exception -> 0x0169 }
            return r2
        L_0x00b5:
            java.lang.String r1 = "response should be parsed successfully"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ NoSuchMethodException -> 0x00c5, InvocationTargetException -> 0x0131, IllegalAccessException -> 0x00bd }
            r0.<init>(r1)     // Catch:{ NoSuchMethodException -> 0x00c5, InvocationTargetException -> 0x0131, IllegalAccessException -> 0x00bd }
            throw r0     // Catch:{ NoSuchMethodException -> 0x00c5, InvocationTargetException -> 0x0131, IllegalAccessException -> 0x00bd }
        L_0x00bd:
            r0 = move-exception
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ 1bD -> 0x0150, 3HN -> 0x0146, all -> 0x015c }
            r1.<init>(r0)     // Catch:{ 1bD -> 0x0150, 3HN -> 0x0146, all -> 0x015c }
            goto L_0x0145
        L_0x00c5:
            r2 = move-exception
            java.lang.String r1 = r14.getCanonicalName()     // Catch:{ 1bD -> 0x0150, 3HN -> 0x0146, all -> 0x015c }
            java.lang.String r0 = "On Class "
            java.lang.String r0 = X.002.A0R(r0, r1)     // Catch:{ 1bD -> 0x0150, 3HN -> 0x0146, all -> 0x015c }
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch:{ 1bD -> 0x0150, 3HN -> 0x0146, all -> 0x015c }
            r1.<init>(r0, r2)     // Catch:{ 1bD -> 0x0150, 3HN -> 0x0146, all -> 0x015c }
            goto L_0x0145
        L_0x00d6:
            int r0 = r11.A01     // Catch:{ 1bD -> 0x010b, 3HN -> 0x0109 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r0)     // Catch:{ 1bD -> 0x010b, 3HN -> 0x0109 }
            int r0 = r11.A02     // Catch:{ 1bD -> 0x010b, 3HN -> 0x0109 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r0)     // Catch:{ 1bD -> 0x010b, 3HN -> 0x0109 }
            java.lang.String r9 = r11.A03     // Catch:{ 1bD -> 0x010b, 3HN -> 0x0109 }
            X.1Fn r6 = r11.A01(r1)     // Catch:{ 1bD -> 0x010b, 3HN -> 0x0109 }
            java.io.ByteArrayOutputStream r5 = new java.io.ByteArrayOutputStream     // Catch:{ 1bD -> 0x010b, 3HN -> 0x0109 }
            r5.<init>()     // Catch:{ 1bD -> 0x010b, 3HN -> 0x0109 }
            r0 = 4096(0x1000, float:5.74E-42)
            byte[] r3 = new byte[r0]     // Catch:{ 1bD -> 0x010b, 3HN -> 0x0109 }
            int r1 = r13.read(r3)     // Catch:{ IOException -> 0x0102 }
            if (r1 <= 0) goto L_0x0102
            r5.write(r3, r4, r1)     // Catch:{ IOException -> 0x0102 }
            java.nio.charset.Charset r0 = X.AnonymousClass15Q.A05     // Catch:{ IOException -> 0x0102 }
            java.lang.String r10 = new java.lang.String     // Catch:{ IOException -> 0x0102 }
            r10.<init>(r3, r4, r1, r0)     // Catch:{ IOException -> 0x0102 }
            goto L_0x0103
        L_0x0102:
            r10 = 0
        L_0x0103:
            X.3HN r5 = new X.3HN     // Catch:{ 1bD -> 0x010b, 3HN -> 0x0109 }
            r5.<init>(r6, r7, r8, r9, r10)     // Catch:{ 1bD -> 0x010b, 3HN -> 0x0109 }
            throw r5     // Catch:{ 1bD -> 0x010b, 3HN -> 0x0109 }
        L_0x0109:
            r4 = move-exception
            goto L_0x0148
        L_0x010b:
            r4 = move-exception
            goto L_0x0152
        L_0x010d:
            r3 = r2
        L_0x010e:
            int r6 = r11.A02     // Catch:{ 1bD -> 0x0150, 3HN -> 0x0146, all -> 0x015c }
            if (r13 == 0) goto L_0x012b
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream     // Catch:{ 1bD -> 0x0150, 3HN -> 0x0146, all -> 0x015c }
            r1.<init>()     // Catch:{ 1bD -> 0x0150, 3HN -> 0x0146, all -> 0x015c }
            r0 = 4096(0x1000, float:5.74E-42)
            byte[] r5 = new byte[r0]     // Catch:{ 1bD -> 0x0150, 3HN -> 0x0146, all -> 0x015c }
            int r2 = r13.read(r5)     // Catch:{ IOException -> 0x012b }
            if (r2 <= 0) goto L_0x012b
            r1.write(r5, r4, r2)     // Catch:{ IOException -> 0x012b }
            java.nio.charset.Charset r1 = X.AnonymousClass15Q.A05     // Catch:{ IOException -> 0x012b }
            java.lang.String r0 = new java.lang.String     // Catch:{ IOException -> 0x012b }
            r0.<init>(r5, r4, r2, r1)     // Catch:{ IOException -> 0x012b }
        L_0x012b:
            X.Q00 r1 = new X.Q00     // Catch:{ 1bD -> 0x0150, 3HN -> 0x0146, all -> 0x015c }
            r1.<init>(r6)     // Catch:{ 1bD -> 0x0150, 3HN -> 0x0146, all -> 0x015c }
            goto L_0x0145
        L_0x0131:
            r1 = move-exception
            java.lang.Throwable r0 = r1.getTargetException()     // Catch:{ 1bD -> 0x0150, 3HN -> 0x0146, all -> 0x015c }
            boolean r0 = r0 instanceof java.lang.Exception     // Catch:{ 1bD -> 0x0150, 3HN -> 0x0146, all -> 0x015c }
            if (r0 == 0) goto L_0x0145
            java.lang.Throwable r1 = r1.getTargetException()     // Catch:{ 1bD -> 0x0150, 3HN -> 0x0146, all -> 0x015c }
            java.lang.String r0 = "null cannot be cast to non-null type java.lang.Exception"
            X.0qQ.A0C(r1, r0)     // Catch:{ 1bD -> 0x0150, 3HN -> 0x0146, all -> 0x015c }
            java.lang.Exception r1 = (java.lang.Exception) r1     // Catch:{ 1bD -> 0x0150, 3HN -> 0x0146, all -> 0x015c }
        L_0x0145:
            throw r1     // Catch:{ 1bD -> 0x0150, 3HN -> 0x0146, all -> 0x015c }
        L_0x0146:
            r4 = move-exception
            r2 = r3
        L_0x0148:
            int r0 = r11.A02     // Catch:{ all -> 0x015a }
            X.NiA r1 = new X.NiA     // Catch:{ all -> 0x015a }
            r1.<init>(r0, r4)     // Catch:{ all -> 0x015a }
            goto L_0x0159
        L_0x0150:
            r4 = move-exception
            r2 = r3
        L_0x0152:
            int r0 = r11.A02     // Catch:{ all -> 0x015a }
            X.NiA r1 = new X.NiA     // Catch:{ all -> 0x015a }
            r1.<init>(r0, r4)     // Catch:{ all -> 0x015a }
        L_0x0159:
            throw r1     // Catch:{ all -> 0x015a }
        L_0x015a:
            r0 = move-exception
            goto L_0x015e
        L_0x015c:
            r0 = move-exception
            r2 = r3
        L_0x015e:
            if (r2 == 0) goto L_0x0163
            r2.close()     // Catch:{ IOException -> 0x0163 }
        L_0x0163:
            if (r13 == 0) goto L_0x0168
            r13.close()     // Catch:{ Exception -> 0x0169 }
        L_0x0168:
            throw r0     // Catch:{ Exception -> 0x0169 }
        L_0x0169:
            r3 = move-exception
            X.0wj r2 = X.0wj.A01
            r1 = 817896653(0x30c01ccd, float:1.3978024E-9)
            java.lang.String r0 = "AutoResponseParserUtil"
            X.0f9 r2 = r2.AEf(r0, r1)
            int r1 = r11.A02
            java.lang.String r0 = "status_code"
            r2.ABO(r0, r1)
            java.lang.String r1 = ""
            java.lang.String r0 = r11.A03
            java.lang.String r1 = X.002.A0R(r1, r0)
            java.lang.String r0 = "reason_phrase"
            r2.ABQ(r0, r1)
            r2.ERJ(r3)
            r2.report()
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3HM.A00(X.15p, X.2ZL, X.1FX, java.io.InputStream, java.lang.Class, boolean):X.1XR");
    }
}
