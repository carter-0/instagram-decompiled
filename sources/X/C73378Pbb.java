package X;

import java.util.Locale;

/* renamed from: X.Pbb  reason: case insensitive filesystem */
public final /* synthetic */ class C73378Pbb implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C71150OeA A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ Locale A04;

    public /* synthetic */ C73378Pbb(C71150OeA oeA, String str, String str2, Locale locale, int i) {
        this.A01 = oeA;
        this.A04 = locale;
        this.A02 = str;
        this.A00 = i;
        this.A03 = str2;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:101|102) */
    /* JADX WARNING: Can't wrap try/catch for region: R(39:22|23|24|33|(2:35|(2:37|135)(2:38|(2:40|(2:41|(2:43|(2:45|(6:47|(2:49|(1:51))|52|(1:54)|55|(1:57)(1:234))(1:231))(1:233))(1:232)))(0)))|60|61|62|(2:64|(30:66|67|(27:69|(2:73|(1:75))|77|79|80|81|82|83|(2:84|(2:86|(1:88)(1:235))(1:237))|236|90|91|92|93|94|95|96|(1:98)(1:100)|99|103|(2:107|108)|109|110|(1:112)|113|(1:115)|116)|78|79|80|81|82|83|(2:84|(0)(0))|236|90|91|92|93|94|95|96|(0)(0)|99|103|105|107|108|109|110|(0)|113|(0)|116))|76|67|(0)|78|79|80|81|82|83|(2:84|(0)(0))|236|90|91|92|93|94|95|96|(0)(0)|99|103|105|107|108|109|110|(0)|113|(0)|116) */
    /* JADX WARNING: Code restructure failed: missing block: B:102:?, code lost:
        r2 = new java.lang.String(r3, X.C70395O4x.A00);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x012e, code lost:
        if (r1 != 2) goto L_0x0130;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0130, code lost:
        X.C71150OeA.A07(r11);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:101:0x01d8 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:109:0x0204 */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x01d5 A[Catch:{ UnsupportedEncodingException -> 0x01d8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x020f A[Catch:{ ProtocolException -> 0x008a, IOException -> 0x03ad, URISyntaxException -> 0x03a7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x0223 A[Catch:{ ProtocolException -> 0x008a, IOException -> 0x03ad, URISyntaxException -> 0x03a7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:222:0x03c1  */
    /* JADX WARNING: Removed duplicated region for block: B:230:0x03df  */
    /* JADX WARNING: Removed duplicated region for block: B:237:0x01bd A[EDGE_INSN: B:237:0x01bd->B:90:0x01bd ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:251:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0164 A[Catch:{ all -> 0x0242, all -> 0x0247 }] */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x01a0 A[Catch:{ all -> 0x0233, all -> 0x0238, all -> 0x023d }] */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x01cd A[Catch:{ UnsupportedEncodingException -> 0x01d8 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r25 = this;
            r3 = r25
            X.OeA r0 = r3.A01
            java.util.Locale r2 = r3.A04
            java.lang.String r1 = r3.A02
            r24 = r1
            r14 = 0
            java.lang.String r1 = r3.A03
            r23 = r1
            java.lang.Runnable r1 = X.O5C.A01
            java.lang.String r4 = r2.getLanguage()     // Catch:{ IOException -> 0x03ad, URISyntaxException -> 0x03a7 }
            if (r4 == 0) goto L_0x0032
            java.util.regex.Pattern r1 = X.C70396O4y.A00     // Catch:{ IOException -> 0x03ad, URISyntaxException -> 0x03a7 }
            boolean r1 = X.DbV.A1b(r4, r1)     // Catch:{ IOException -> 0x03ad, URISyntaxException -> 0x03a7 }
            if (r1 == 0) goto L_0x0032
        L_0x001f:
            java.lang.String r13 = "WebPageInfo"
            java.lang.String r1 = r0.A0L     // Catch:{ IOException -> 0x03ad, URISyntaxException -> 0x03a7 }
            android.os.SystemClock.uptimeMillis()     // Catch:{ IOException -> 0x03ad, URISyntaxException -> 0x03a7 }
            java.net.URL r5 = new java.net.URL     // Catch:{ IOException -> 0x03ad, URISyntaxException -> 0x03a7 }
            r5.<init>(r1)     // Catch:{ IOException -> 0x03ad, URISyntaxException -> 0x03a7 }
            java.lang.String r2 = r5.getHost()     // Catch:{ IOException -> 0x03ad, URISyntaxException -> 0x03a7 }
            if (r2 == 0) goto L_0x0046
            goto L_0x0035
        L_0x0032:
            java.lang.String r4 = "zz"
            goto L_0x001f
        L_0x0035:
            java.lang.String r2 = java.net.IDN.toASCII(r2)     // Catch:{ Exception -> 0x003a }
            goto L_0x0040
        L_0x003a:
            r3 = move-exception
            java.lang.String r1 = "WebPageInfo/IDNtoASCII fails."
            X.0KC.A0F(r13, r1, r3)     // Catch:{ IOException -> 0x03ad, URISyntaxException -> 0x03a7 }
        L_0x0040:
            java.util.Locale r1 = java.util.Locale.ENGLISH     // Catch:{ IOException -> 0x03ad, URISyntaxException -> 0x03a7 }
            java.lang.String r2 = r2.toLowerCase(r1)     // Catch:{ IOException -> 0x03ad, URISyntaxException -> 0x03a7 }
        L_0x0046:
            java.lang.String r3 = r5.getProtocol()     // Catch:{ IOException -> 0x03ad, URISyntaxException -> 0x03a7 }
            if (r3 == 0) goto L_0x0052
            java.util.Locale r1 = java.util.Locale.ENGLISH     // Catch:{ IOException -> 0x03ad, URISyntaxException -> 0x03a7 }
            java.lang.String r3 = r3.toLowerCase(r1)     // Catch:{ IOException -> 0x03ad, URISyntaxException -> 0x03a7 }
        L_0x0052:
            java.net.URI r1 = r5.toURI()     // Catch:{ IOException -> 0x03ad, URISyntaxException -> 0x03a7 }
            java.lang.String r7 = r1.getUserInfo()     // Catch:{ IOException -> 0x03ad, URISyntaxException -> 0x03a7 }
            int r9 = r1.getPort()     // Catch:{ IOException -> 0x03ad, URISyntaxException -> 0x03a7 }
            java.lang.String r10 = r1.getPath()     // Catch:{ IOException -> 0x03ad, URISyntaxException -> 0x03a7 }
            java.lang.String r11 = r1.getQuery()     // Catch:{ IOException -> 0x03ad, URISyntaxException -> 0x03a7 }
            java.lang.String r12 = r5.getRef()     // Catch:{ IOException -> 0x03ad, URISyntaxException -> 0x03a7 }
            java.net.URI r5 = new java.net.URI     // Catch:{ IOException -> 0x03ad, URISyntaxException -> 0x03a7 }
            r6 = r3
            r8 = r2
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)     // Catch:{ IOException -> 0x03ad, URISyntaxException -> 0x03a7 }
            java.net.URL r12 = r5.toURL()     // Catch:{ IOException -> 0x03ad, URISyntaxException -> 0x03a7 }
            java.net.HttpURLConnection r11 = X.C71150OeA.A04(r4, r12)     // Catch:{ IOException -> 0x03ad, URISyntaxException -> 0x03a7 }
            if (r11 == 0) goto L_0x024f
            r4 = 1
            r11.setInstanceFollowRedirects(r4)     // Catch:{ IOException -> 0x03ad, URISyntaxException -> 0x03a7 }
            r1 = -1780768136(0xffffffff95dba278, float:-8.8709726E-26)
            X.0fi.A02(r11, r1)     // Catch:{ ProtocolException -> 0x008a }
            int r1 = r11.getResponseCode()     // Catch:{ ProtocolException -> 0x008a }
            goto L_0x00a8
        L_0x008a:
            r5 = move-exception
            java.lang.String r3 = r5.toString()     // Catch:{ IOException -> 0x03ad, URISyntaxException -> 0x03a7 }
            java.util.Locale r1 = java.util.Locale.US     // Catch:{ IOException -> 0x03ad, URISyntaxException -> 0x03a7 }
            java.lang.String r3 = r3.toLowerCase(r1)     // Catch:{ IOException -> 0x03ad, URISyntaxException -> 0x03a7 }
            java.lang.String r1 = "too many redirects"
            boolean r1 = r3.contains(r1)     // Catch:{ IOException -> 0x03ad, URISyntaxException -> 0x03a7 }
            if (r1 != 0) goto L_0x00a6
            java.lang.String r1 = "too many follow-up requests"
            boolean r1 = r3.contains(r1)     // Catch:{ IOException -> 0x03ad, URISyntaxException -> 0x03a7 }
            if (r1 != 0) goto L_0x00a6
            throw r5     // Catch:{ IOException -> 0x03ad, URISyntaxException -> 0x03a7 }
        L_0x00a6:
            r1 = 303(0x12f, float:4.25E-43)
        L_0x00a8:
            int r1 = r1 / 100
            r8 = 2
            if (r1 == r8) goto L_0x0135
            r7 = 3
            if (r1 == r7) goto L_0x00b2
            goto L_0x024c
        L_0x00b2:
            X.C71150OeA.A07(r11)     // Catch:{ IOException -> 0x03ad, URISyntaxException -> 0x03a7 }
            java.net.HttpURLConnection r11 = X.C71150OeA.A04(r14, r12)     // Catch:{ IOException -> 0x03ad, URISyntaxException -> 0x03a7 }
            if (r11 == 0) goto L_0x024f
            r6 = 0
            r11.setInstanceFollowRedirects(r6)     // Catch:{ IOException -> 0x03ad, URISyntaxException -> 0x03a7 }
            r1 = -740744513(0xffffffffd3d922bf, float:-1.86518169E12)
            X.0fi.A02(r11, r1)     // Catch:{ IOException -> 0x03ad, URISyntaxException -> 0x03a7 }
            int r1 = r11.getResponseCode()     // Catch:{ IOException -> 0x03ad, URISyntaxException -> 0x03a7 }
            java.lang.String r5 = ""
            r3 = 0
        L_0x00cc:
            int r1 = r1 / 100
            if (r1 != r7) goto L_0x012e
            r1 = 20
            if (r3 >= r1) goto L_0x0130
            r1 = 156(0x9c, float:2.19E-43)
            java.lang.String r1 = X.Pxd.A00(r1)     // Catch:{ IOException -> 0x03ad, URISyntaxException -> 0x03a7 }
            java.lang.String r9 = r11.getHeaderField(r1)     // Catch:{ IOException -> 0x03ad, URISyntaxException -> 0x03a7 }
            boolean r1 = android.text.TextUtils.isEmpty(r9)     // Catch:{ IOException -> 0x03ad, URISyntaxException -> 0x03a7 }
            if (r1 != 0) goto L_0x0130
            r1 = 2493(0x9bd, float:3.493E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)     // Catch:{ IOException -> 0x03ad, URISyntaxException -> 0x03a7 }
            java.lang.String r10 = r11.getHeaderField(r1)     // Catch:{ IOException -> 0x03ad, URISyntaxException -> 0x03a7 }
            if (r10 == 0) goto L_0x00fb
            java.lang.String r1 = ";"
            java.lang.String[] r15 = r10.split(r1)     // Catch:{ IOException -> 0x03ad, URISyntaxException -> 0x03a7 }
            int r1 = r15.length     // Catch:{ IOException -> 0x03ad, URISyntaxException -> 0x03a7 }
            if (r1 <= 0) goto L_0x00fb
            r10 = r15[r6]     // Catch:{ IOException -> 0x03ad, URISyntaxException -> 0x03a7 }
        L_0x00fb:
            boolean r1 = android.text.TextUtils.isEmpty(r5)     // Catch:{ IOException -> 0x03ad, URISyntaxException -> 0x03a7 }
            if (r1 != 0) goto L_0x0107
            java.lang.String r1 = "; "
            java.lang.String r5 = X.002.A0R(r5, r1)     // Catch:{ IOException -> 0x03ad, URISyntaxException -> 0x03a7 }
        L_0x0107:
            java.lang.String r5 = X.002.A0R(r5, r10)     // Catch:{ IOException -> 0x03ad, URISyntaxException -> 0x03a7 }
            X.C71150OeA.A07(r11)     // Catch:{ IOException -> 0x03ad, URISyntaxException -> 0x03a7 }
            java.net.URL r1 = new java.net.URL     // Catch:{ IOException -> 0x03ad, URISyntaxException -> 0x03a7 }
            r1.<init>(r9)     // Catch:{ IOException -> 0x03ad, URISyntaxException -> 0x03a7 }
            java.net.HttpURLConnection r11 = X.C71150OeA.A04(r14, r1)     // Catch:{ IOException -> 0x03ad, URISyntaxException -> 0x03a7 }
            if (r11 == 0) goto L_0x024f
            r11.setInstanceFollowRedirects(r6)     // Catch:{ IOException -> 0x03ad, URISyntaxException -> 0x03a7 }
            java.lang.String r1 = "Cookie"
            r11.setRequestProperty(r1, r5)     // Catch:{ IOException -> 0x03ad, URISyntaxException -> 0x03a7 }
            r1 = 1478364463(0x581e0d2f, float:6.9511784E14)
            X.0fi.A02(r11, r1)     // Catch:{ IOException -> 0x03ad, URISyntaxException -> 0x03a7 }
            int r1 = r11.getResponseCode()     // Catch:{ IOException -> 0x03ad, URISyntaxException -> 0x03a7 }
            int r3 = r3 + 1
            goto L_0x00cc
        L_0x012e:
            if (r1 == r8) goto L_0x0135
        L_0x0130:
            X.C71150OeA.A07(r11)     // Catch:{ IOException -> 0x03ad, URISyntaxException -> 0x03a7 }
            goto L_0x024f
        L_0x0135:
            java.lang.String r1 = "Content-Type"
            java.lang.String r3 = r11.getHeaderField(r1)     // Catch:{ all -> 0x0247 }
            if (r3 == 0) goto L_0x017d
            java.util.regex.Pattern r1 = X.C71150OeA.A0M     // Catch:{ all -> 0x0247 }
            java.util.regex.Matcher r3 = r1.matcher(r3)     // Catch:{ all -> 0x0247 }
            boolean r1 = r3.find()     // Catch:{ all -> 0x0247 }
            if (r1 == 0) goto L_0x017d
            java.lang.String r1 = r3.group(r4)     // Catch:{ all -> 0x0247 }
            r1.getClass()     // Catch:{ all -> 0x0247 }
            java.lang.String r3 = r1.trim()     // Catch:{ all -> 0x0247 }
            java.util.Locale r1 = java.util.Locale.US     // Catch:{ all -> 0x0247 }
            java.lang.String r17 = r3.toUpperCase(r1)     // Catch:{ all -> 0x0247 }
        L_0x015a:
            java.lang.String r18 = r11.getContentType()     // Catch:{ all -> 0x0247 }
            int r20 = r11.getContentLength()     // Catch:{ all -> 0x0247 }
            if (r2 == 0) goto L_0x0183
            java.lang.String r1 = "youtu"
            boolean r1 = r2.startsWith(r1)     // Catch:{ all -> 0x0247 }
            if (r1 != 0) goto L_0x0180
            java.lang.String r1 = "m.youtu"
            boolean r1 = r2.startsWith(r1)     // Catch:{ all -> 0x0247 }
            if (r1 != 0) goto L_0x0180
            java.lang.String r1 = "www.youtu"
            boolean r1 = r2.startsWith(r1)     // Catch:{ all -> 0x0247 }
            if (r1 == 0) goto L_0x0183
            goto L_0x0180
        L_0x017d:
            java.lang.String r17 = ""
            goto L_0x015a
        L_0x0180:
            r1 = 128(0x80, float:1.794E-43)
            goto L_0x0185
        L_0x0183:
            r1 = 64
        L_0x0185:
            int r10 = r1 * 1024
            r1 = 1327568618(0x4f2116ea, float:2.70263347E9)
            X.0fV r9 = X.0fi.A00(r11, r1)     // Catch:{ all -> 0x0247 }
            java.io.ByteArrayOutputStream r8 = new java.io.ByteArrayOutputStream     // Catch:{ all -> 0x023d }
            r8.<init>()     // Catch:{ all -> 0x023d }
            r7 = 1024(0x400, float:1.435E-42)
            byte[] r6 = new byte[r7]     // Catch:{ all -> 0x0233 }
            r5 = 0
            r4 = 0
        L_0x0199:
            int r2 = r9.read(r6, r5, r7)     // Catch:{ all -> 0x0233 }
            r1 = -1
            if (r2 == r1) goto L_0x01bd
            r8.write(r6, r5, r2)     // Catch:{ all -> 0x0233 }
            int r4 = r4 + r2
            if (r4 > r10) goto L_0x01bd
            byte[] r3 = r8.toByteArray()     // Catch:{ all -> 0x0233 }
            java.lang.String r2 = X.C70395O4x.A00     // Catch:{ all -> 0x0233 }
            java.lang.String r1 = new java.lang.String     // Catch:{ all -> 0x0233 }
            r1.<init>(r3, r2)     // Catch:{ all -> 0x0233 }
            java.util.regex.Pattern r2 = X.C71150OeA.A0N     // Catch:{ all -> 0x0233 }
            java.util.regex.Matcher r1 = r2.matcher(r1)     // Catch:{ all -> 0x0233 }
            boolean r1 = r1.find()     // Catch:{ all -> 0x0233 }
            if (r1 == 0) goto L_0x0199
        L_0x01bd:
            byte[] r3 = r8.toByteArray()     // Catch:{ all -> 0x0233 }
            r8.close()     // Catch:{ all -> 0x023d }
            r9.close()     // Catch:{ all -> 0x0247 }
            boolean r1 = android.text.TextUtils.isEmpty(r17)     // Catch:{ UnsupportedEncodingException -> 0x01d8 }
            if (r1 == 0) goto L_0x01d5
            java.lang.String r1 = X.C70395O4x.A00     // Catch:{ UnsupportedEncodingException -> 0x01d8 }
        L_0x01cf:
            java.lang.String r2 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x01d8 }
            r2.<init>(r3, r1)     // Catch:{ UnsupportedEncodingException -> 0x01d8 }
            goto L_0x01df
        L_0x01d5:
            r1 = r17
            goto L_0x01cf
        L_0x01d8:
            java.lang.String r1 = X.C70395O4x.A00     // Catch:{ all -> 0x0247 }
            java.lang.String r2 = new java.lang.String     // Catch:{ all -> 0x0247 }
            r2.<init>(r3, r1)     // Catch:{ all -> 0x0247 }
        L_0x01df:
            r15 = r0
            r16 = r2
            r19 = r12
            java.lang.String r2 = X.C71150OeA.A02(r15, r16, r17, r18, r19, r20)     // Catch:{ all -> 0x0247 }
            boolean r1 = android.text.TextUtils.isEmpty(r17)     // Catch:{ all -> 0x0247 }
            if (r1 == 0) goto L_0x0204
            boolean r1 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x0247 }
            if (r1 != 0) goto L_0x0204
            java.lang.String r1 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x0204 }
            r1.<init>(r3, r2)     // Catch:{ UnsupportedEncodingException -> 0x0204 }
            r0.A09()     // Catch:{ UnsupportedEncodingException -> 0x0204 }
            r3 = r18
            r4 = r12
            r5 = r20
            X.C71150OeA.A02(r0, r1, r2, r3, r4, r5)     // Catch:{ UnsupportedEncodingException -> 0x0204 }
        L_0x0204:
            X.C71150OeA.A07(r11)     // Catch:{ IOException -> 0x03ad, URISyntaxException -> 0x03a7 }
            java.lang.String r1 = r0.A0E     // Catch:{ IOException -> 0x03ad, URISyntaxException -> 0x03a7 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ IOException -> 0x03ad, URISyntaxException -> 0x03a7 }
            if (r1 != 0) goto L_0x021b
            java.lang.String r1 = r0.A0E     // Catch:{ IOException -> 0x03ad, URISyntaxException -> 0x03a7 }
            android.text.Spanned r1 = android.text.Html.fromHtml(r1)     // Catch:{ IOException -> 0x03ad, URISyntaxException -> 0x03a7 }
            java.lang.String r1 = r1.toString()     // Catch:{ IOException -> 0x03ad, URISyntaxException -> 0x03a7 }
            r0.A0E = r1     // Catch:{ IOException -> 0x03ad, URISyntaxException -> 0x03a7 }
        L_0x021b:
            java.lang.String r1 = r0.A0D     // Catch:{ IOException -> 0x03ad, URISyntaxException -> 0x03a7 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ IOException -> 0x03ad, URISyntaxException -> 0x03a7 }
            if (r1 != 0) goto L_0x022f
            java.lang.String r1 = r0.A0D     // Catch:{ IOException -> 0x03ad, URISyntaxException -> 0x03a7 }
            android.text.Spanned r1 = android.text.Html.fromHtml(r1)     // Catch:{ IOException -> 0x03ad, URISyntaxException -> 0x03a7 }
            java.lang.String r1 = r1.toString()     // Catch:{ IOException -> 0x03ad, URISyntaxException -> 0x03a7 }
            r0.A0D = r1     // Catch:{ IOException -> 0x03ad, URISyntaxException -> 0x03a7 }
        L_0x022f:
            android.os.SystemClock.uptimeMillis()     // Catch:{ IOException -> 0x03ad, URISyntaxException -> 0x03a7 }
            goto L_0x024f
        L_0x0233:
            r2 = move-exception
            r8.close()     // Catch:{ all -> 0x0238 }
            goto L_0x023c
        L_0x0238:
            r1 = move-exception
            X.C9153RRe.A00(r2, r1)     // Catch:{ all -> 0x023d }
        L_0x023c:
            throw r2     // Catch:{ all -> 0x023d }
        L_0x023d:
            r2 = move-exception
            r9.close()     // Catch:{ all -> 0x0242 }
            goto L_0x0246
        L_0x0242:
            r1 = move-exception
            X.C9153RRe.A00(r2, r1)     // Catch:{ all -> 0x0247 }
        L_0x0246:
            throw r2     // Catch:{ all -> 0x0247 }
        L_0x0247:
            r1 = move-exception
            X.C71150OeA.A07(r11)     // Catch:{ IOException -> 0x03ad, URISyntaxException -> 0x03a7 }
            throw r1     // Catch:{ IOException -> 0x03ad, URISyntaxException -> 0x03a7 }
        L_0x024c:
            X.C71150OeA.A07(r11)     // Catch:{ IOException -> 0x03ad, URISyntaxException -> 0x03a7 }
        L_0x024f:
            boolean r1 = r0.A0A()     // Catch:{ IOException -> 0x03ad, URISyntaxException -> 0x03a7 }
            if (r1 == 0) goto L_0x03b5
            r1 = 0
            java.util.LinkedHashSet r2 = r0.A0F     // Catch:{ IOException -> 0x03ad, URISyntaxException -> 0x03a7 }
            java.util.Iterator r11 = r2.iterator()     // Catch:{ IOException -> 0x03ad, URISyntaxException -> 0x03a7 }
        L_0x025c:
            boolean r2 = r11.hasNext()     // Catch:{ IOException -> 0x03ad, URISyntaxException -> 0x03a7 }
            if (r2 == 0) goto L_0x03b5
            java.lang.String r2 = X.AnonymousClass7TE.A18(r11)     // Catch:{ IOException -> 0x03ad, URISyntaxException -> 0x03a7 }
            r3 = 2
            if (r1 < r3) goto L_0x0270
            java.util.LinkedHashSet r1 = r0.A0F     // Catch:{ IOException -> 0x03ad, URISyntaxException -> 0x03a7 }
            r1.size()     // Catch:{ IOException -> 0x03ad, URISyntaxException -> 0x03a7 }
            goto L_0x03b5
        L_0x0270:
            int r1 = r1 + 1
            java.lang.System.currentTimeMillis()     // Catch:{ Ni5 -> 0x039f }
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch:{ Ni5 -> 0x039f }
            if (r3 != 0) goto L_0x03b5
            X.0Sd.A00(r2)     // Catch:{ Ni5 -> 0x039f }
            r4 = 0
            java.net.URL r3 = new java.net.URL     // Catch:{ MalformedURLException -> 0x02a2 }
            r3.<init>(r2)     // Catch:{ MalformedURLException -> 0x02a2 }
            java.lang.String r6 = r3.getPath()     // Catch:{ Ni5 -> 0x039f }
            boolean r3 = android.text.TextUtils.isEmpty(r6)     // Catch:{ Ni5 -> 0x039f }
            if (r3 != 0) goto L_0x02ae
            r3 = 58
            int r5 = r6.lastIndexOf(r3)     // Catch:{ Ni5 -> 0x039f }
            r3 = 46
            int r4 = r6.lastIndexOf(r3)     // Catch:{ Ni5 -> 0x039f }
            int r3 = r6.length()     // Catch:{ Ni5 -> 0x039f }
            if (r5 > r4) goto L_0x02a8
            r5 = r3
            goto L_0x02a8
        L_0x02a2:
            java.lang.String r3 = "wrong url format when parsing mime type!!!"
            X.0KC.A0C(r13, r3)     // Catch:{ Ni5 -> 0x039f }
            goto L_0x02ae
        L_0x02a8:
            int r3 = r4 + 1
            java.lang.String r4 = r6.substring(r3, r5)     // Catch:{ Ni5 -> 0x039f }
        L_0x02ae:
            r0.A0B = r4     // Catch:{ Ni5 -> 0x039f }
            java.net.URL r4 = new java.net.URL     // Catch:{ Ni5 -> 0x039f }
            r4.<init>(r2)     // Catch:{ Ni5 -> 0x039f }
            java.lang.String r3 = X.C70395O4x.A00     // Catch:{ Ni5 -> 0x039f }
            java.lang.String r3 = java.net.URLDecoder.decode(r2, r3)     // Catch:{ Ni5 -> 0x039f }
            boolean r3 = r2.equals(r3)     // Catch:{ Ni5 -> 0x039f }
            if (r3 == 0) goto L_0x02e6
            java.lang.String r16 = r4.getProtocol()     // Catch:{ Ni5 -> 0x039f }
            java.lang.String r17 = r4.getUserInfo()     // Catch:{ Ni5 -> 0x039f }
            java.lang.String r18 = r4.getHost()     // Catch:{ Ni5 -> 0x039f }
            int r19 = r4.getPort()     // Catch:{ Ni5 -> 0x039f }
            java.lang.String r20 = r4.getPath()     // Catch:{ Ni5 -> 0x039f }
            java.lang.String r21 = r4.getQuery()     // Catch:{ Ni5 -> 0x039f }
            java.lang.String r22 = r4.getRef()     // Catch:{ Ni5 -> 0x039f }
            java.net.URI r15 = new java.net.URI     // Catch:{ Ni5 -> 0x039f }
            r15.<init>(r16, r17, r18, r19, r20, r21, r22)     // Catch:{ Ni5 -> 0x039f }
            java.net.URL r4 = r15.toURL()     // Catch:{ Ni5 -> 0x039f }
        L_0x02e6:
            java.net.HttpURLConnection r4 = X.C71150OeA.A04(r14, r4)     // Catch:{ Ni5 -> 0x039f }
            if (r4 == 0) goto L_0x03b5
            r3 = 10000(0x2710, float:1.4013E-41)
            r4.setConnectTimeout(r3)     // Catch:{ Ni5 -> 0x039f }
            r3 = 20000(0x4e20, float:2.8026E-41)
            r4.setReadTimeout(r3)     // Catch:{ Ni5 -> 0x039f }
            r3 = -1491840804(0xffffffffa71450dc, float:-2.058296E-15)
            X.0fV r6 = X.0fi.A00(r4, r3)     // Catch:{ Ni5 -> 0x039f }
            java.io.ByteArrayOutputStream r8 = new java.io.ByteArrayOutputStream     // Catch:{ all -> 0x0395 }
            r8.<init>()     // Catch:{ all -> 0x0395 }
            r3 = 1024(0x400, float:1.435E-42)
            byte[] r10 = new byte[r3]     // Catch:{ all -> 0x038b }
            r9 = 0
            r7 = 0
        L_0x0308:
            int r5 = r6.read(r10, r9, r3)     // Catch:{ all -> 0x038b }
            r4 = -1
            if (r5 != r4) goto L_0x0314
            byte[] r16 = r8.toByteArray()     // Catch:{ all -> 0x038b }
            goto L_0x031e
        L_0x0314:
            r8.write(r10, r9, r5)     // Catch:{ all -> 0x038b }
            int r7 = r7 + r5
            r4 = 307200(0x4b000, float:4.30479E-40)
            if (r7 <= r4) goto L_0x0308
            goto L_0x0383
        L_0x031e:
            r8.close()     // Catch:{ all -> 0x0395 }
            r6.close()     // Catch:{ Ni5 -> 0x039f }
            r17 = 100
            r19 = 140(0x8c, float:1.96E-43)
            r15 = r0
            r18 = r17
            r20 = r19
            r21 = r9
            byte[] r4 = r15.A0B(r16, r17, r18, r19, r20, r21)     // Catch:{ Ni5 -> 0x039f }
            r0.A0H = r4     // Catch:{ Ni5 -> 0x039f }
            boolean r4 = android.text.TextUtils.isEmpty(r2)     // Catch:{ Ni5 -> 0x039f }
            if (r4 != 0) goto L_0x0351
            java.util.regex.Pattern r5 = X.C71150OeA.A0P     // Catch:{ Ni5 -> 0x039f }
            java.lang.String[] r4 = X.OYV.A02     // Catch:{ Ni5 -> 0x039f }
            java.lang.String r2 = X.OYV.A01(r2, r4)     // Catch:{ Ni5 -> 0x039f }
            java.util.regex.Matcher r2 = r5.matcher(r2)     // Catch:{ Ni5 -> 0x039f }
            boolean r2 = r2.find()     // Catch:{ Ni5 -> 0x039f }
            if (r2 == 0) goto L_0x0351
            int r2 = r0.A06     // Catch:{ Ni5 -> 0x039f }
            if (r2 == 0) goto L_0x0370
        L_0x0351:
            int r6 = r0.A01     // Catch:{ Ni5 -> 0x039f }
            int r5 = r0.A00     // Catch:{ Ni5 -> 0x039f }
            r4 = 300(0x12c, float:4.2E-43)
            if (r6 <= r5) goto L_0x0374
            int r3 = java.lang.Math.min(r6, r3)     // Catch:{ Ni5 -> 0x039f }
            int r5 = r5 * r3
            int r2 = r5 / r6
        L_0x0360:
            r18 = 75
            r21 = 1
            r17 = r4
            r19 = r3
            r20 = r2
            byte[] r2 = r15.A0B(r16, r17, r18, r19, r20, r21)     // Catch:{ Ni5 -> 0x039f }
            r0.A0I = r2     // Catch:{ Ni5 -> 0x039f }
        L_0x0370:
            java.lang.System.currentTimeMillis()     // Catch:{ Ni5 -> 0x039f }
            goto L_0x03b5
        L_0x0374:
            int r2 = java.lang.Math.min(r5, r3)     // Catch:{ Ni5 -> 0x039f }
            int r3 = r2 * r6
            int r3 = r3 / r5
            if (r3 >= r4) goto L_0x0360
            int r2 = r5 * 300
            int r2 = r2 / r6
            r3 = 300(0x12c, float:4.2E-43)
            goto L_0x0360
        L_0x0383:
            java.lang.String r3 = "image too large"
            X.Ni5 r2 = new X.Ni5     // Catch:{ all -> 0x038b }
            r2.<init>(r3)     // Catch:{ all -> 0x038b }
            throw r2     // Catch:{ all -> 0x038b }
        L_0x038b:
            r3 = move-exception
            r8.close()     // Catch:{ all -> 0x0390 }
            goto L_0x0394
        L_0x0390:
            r2 = move-exception
            X.C9153RRe.A00(r3, r2)     // Catch:{ all -> 0x0395 }
        L_0x0394:
            throw r3     // Catch:{ all -> 0x0395 }
        L_0x0395:
            r3 = move-exception
            r6.close()     // Catch:{ all -> 0x039a }
            goto L_0x039e
        L_0x039a:
            r2 = move-exception
            X.C9153RRe.A00(r3, r2)     // Catch:{ Ni5 -> 0x039f }
        L_0x039e:
            throw r3     // Catch:{ Ni5 -> 0x039f }
        L_0x039f:
            r3 = move-exception
            java.lang.String r2 = "WebPageInfo/loadThumbRetrySmall Cannot fetch large thumbnail"
            X.0KC.A0H(r13, r2, r3)     // Catch:{ IOException -> 0x03ad, URISyntaxException -> 0x03a7 }
            goto L_0x025c
        L_0x03a7:
            r3 = move-exception
            java.lang.String r2 = "WebPageInfo"
            java.lang.String r1 = "URISyntaxException when loading page"
            goto L_0x03b2
        L_0x03ad:
            r3 = move-exception
            java.lang.String r2 = "WebPageInfo"
            java.lang.String r1 = "IO exception when loading page"
        L_0x03b2:
            X.0KC.A0G(r2, r1, r3)
        L_0x03b5:
            java.util.HashMap r2 = X.O5C.A02
            r1 = r24
            java.lang.Object r1 = r2.remove(r1)
            java.util.AbstractCollection r1 = (java.util.AbstractCollection) r1
            if (r1 == 0) goto L_0x03d9
            java.util.Iterator r3 = r1.iterator()
        L_0x03c5:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L_0x03d9
            java.lang.Object r2 = r3.next()
            X.OJK r2 = (X.OJK) r2
            if (r2 == 0) goto L_0x03c5
            r1 = r23
            r2.A00(r0, r1)
            goto L_0x03c5
        L_0x03d9:
            boolean r1 = r0.A0A()
            if (r1 == 0) goto L_0x03e6
            X.TSV r2 = X.O5C.A00
            r1 = r24
            r2.put(r1, r0)
        L_0x03e6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C73378Pbb.run():void");
    }
}
