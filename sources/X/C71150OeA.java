package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.Patterns;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.OeA  reason: case insensitive filesystem */
public final class C71150OeA {
    public static final Pattern A0M = Pattern.compile("(?i)\\bcharset=\\s*\"?([^\\s;\"]*)", 34);
    public static final Pattern A0N = Pattern.compile("<head[^>]*>(.*)</head>", 34);
    public static final Pattern A0O = Pattern.compile("<link([^>]+?)/?>", 34);
    public static final Pattern A0P = Pattern.compile("https://(www\\.)?pbs\\.twimg\\.com/profile_images", 2);
    public static final Pattern A0Q = Pattern.compile("https://(www\\.)?pbs\\.twimg\\.com", 2);
    public static final Set A0R = C66580MXl.A12(Arrays.asList(new String[]{"og:image", "og:image:type", "og:video", "og:video:type", "og:video:url", "og:video:secure_url", "og:video:width", "og:video:height", "og:thumbnail", "og:title", "og:description", "og:url", "og:site_name", "og:audio", "og:audio:type", "og:restrictions:country:allowed", "image", "thumbnail", "twitter:image", DialogModule.KEY_TITLE, "twitter:title", DevServerEntity.COLUMN_DESCRIPTION, "twitter:description", "twitter:url", "invite_link_type", "music:preview_url:secure_url", "music:preview_url:type"}));
    public static final Pattern A0S = Pattern.compile("\\s*([^=]+)\\s*=\\s*(?:\"([^\"]+)\"|\\'([^\\']+)\\'|([^\\s\"\\']+)\\s+)", 34);
    public static final Pattern A0T = Pattern.compile("<meta([^>]+?)/?>", 34);
    public static final Pattern A0U = Pattern.compile("<title[^>]*>(.*)</title>", 34);
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public OYg A07;
    public ODA A08;
    public String A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public String A0D;
    public String A0E;
    public LinkedHashSet A0F = DbS.A0y();
    public List A0G;
    public byte[] A0H;
    public byte[] A0I;
    public boolean A0J;
    public final OM9 A0K;
    public final String A0L;

    private ODA A01(Map map, String... strArr) {
        HttpURLConnection httpURLConnection;
        HttpURLConnection httpURLConnection2 = null;
        for (String A11 : strArr) {
            String A112 = DbT.A11(A11, map);
            if (A112 != null && DbV.A1b(A112, Patterns.WEB_URL)) {
                try {
                    httpURLConnection = A04((String) null, new URL(A112));
                    if (httpURLConnection != null) {
                        try {
                            ODA A002 = A00(A112, httpURLConnection.getHeaderField("Content-Type"), httpURLConnection.getContentLength());
                            if (A002 != null) {
                                A07(httpURLConnection);
                                return A002;
                            }
                        } catch (IOException e) {
                            e = e;
                            try {
                                0KC.A0H("WebPageInfo", "WebPageInfo/getGifOnPage Cannot connect.", e);
                                A07(httpURLConnection);
                            } catch (Throwable th) {
                                th = th;
                                httpURLConnection2 = httpURLConnection;
                                A07(httpURLConnection2);
                                throw th;
                            }
                        }
                    }
                } catch (IOException e2) {
                    e = e2;
                    httpURLConnection = null;
                    0KC.A0H("WebPageInfo", "WebPageInfo/getGifOnPage Cannot connect.", e);
                    A07(httpURLConnection);
                } catch (Throwable th2) {
                    th = th2;
                    A07(httpURLConnection2);
                    throw th;
                }
                A07(httpURLConnection);
            }
        }
        return null;
    }

    public static String A03(HashMap hashMap, String... strArr) {
        for (String A0r : strArr) {
            String A0r2 = DbS.A0r(A0r, hashMap);
            if (A0r2 != null) {
                return A0r2.trim();
            }
        }
        return null;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.net.URLConnection] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.net.HttpURLConnection A04(java.lang.String r3, java.net.URL r4) {
        /*
            r2 = 0
            java.lang.String r1 = r4.toString()     // Catch:{ MalformedURLException | URISyntaxException -> 0x0014 }
            java.net.URI r0 = new java.net.URI     // Catch:{ MalformedURLException | URISyntaxException -> 0x0014 }
            r0.<init>(r1)     // Catch:{ MalformedURLException | URISyntaxException -> 0x0014 }
            java.lang.String r1 = r0.toASCIIString()     // Catch:{ MalformedURLException | URISyntaxException -> 0x0014 }
            java.net.URL r0 = new java.net.URL     // Catch:{ MalformedURLException | URISyntaxException -> 0x0014 }
            r0.<init>(r1)     // Catch:{ MalformedURLException | URISyntaxException -> 0x0014 }
            goto L_0x0015
        L_0x0014:
            r0 = r2
        L_0x0015:
            if (r0 == 0) goto L_0x003c
            java.net.URLConnection r1 = r0.openConnection()
            boolean r0 = r1 instanceof java.net.HttpURLConnection
            if (r0 == 0) goto L_0x003c
            r2 = r1
            java.net.HttpURLConnection r2 = (java.net.HttpURLConnection) r2
            r0 = 10000(0x2710, float:1.4013E-41)
            r2.setConnectTimeout(r0)
            r2.setReadTimeout(r0)
            if (r3 == 0) goto L_0x0035
            r0 = 2099(0x833, float:2.941E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r2.setRequestProperty(r0, r3)
        L_0x0035:
            java.lang.String r1 = "User-Agent"
            java.lang.String r0 = "WhatsApp/3.0.0.0 A"
            r2.setRequestProperty(r1, r0)
        L_0x003c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71150OeA.A04(java.lang.String, java.net.URL):java.net.HttpURLConnection");
    }

    public final void A09() {
        this.A0E = null;
        this.A0D = null;
        this.A0A = null;
        this.A0F.clear();
        this.A0J = false;
    }

    private ODA A00(String str, String str2, int i) {
        if (!"image/gif".equals(str2) || i == -1) {
            return null;
        }
        if (str.endsWith("giphy.gif")) {
            try {
                if (new URI(str).getHost().contains("giphy.com")) {
                    str = 002.A0R(str.substring(0, str.length() - 9), "200.mp4");
                    HttpURLConnection httpURLConnection = null;
                    try {
                        httpURLConnection = A04((String) null, new URL(str));
                        if (httpURLConnection != null) {
                            String headerField = httpURLConnection.getHeaderField("Content-Type");
                            if (headerField.equals("video/mp4")) {
                                ODA oda = new ODA(str, httpURLConnection.getContentLength(), headerField);
                                A07(httpURLConnection);
                                return oda;
                            }
                        }
                    } catch (IOException e) {
                        0KC.A0H("WebPageInfo", "WebPageInfo/checkForMp4 Cannot connect.", e);
                    } catch (Throwable th) {
                        A07((HttpURLConnection) null);
                        throw th;
                    }
                    A07(httpURLConnection);
                }
            } catch (URISyntaxException e2) {
                0KC.A0H("WebPageInfo", "WebPageInfo/getGifInfo Cannot connect.", e2);
            }
        }
        return new ODA(str, i, str2);
    }

    public static void A07(HttpURLConnection httpURLConnection) {
        if (httpURLConnection != null) {
            try {
                try {
                    0fi.A00(httpURLConnection, 1951228165).close();
                } catch (Throwable th) {
                    th.getMessage();
                }
            } catch (IOException unused) {
            }
            httpURLConnection.disconnect();
        }
    }

    public final boolean A0A() {
        boolean z;
        boolean z2 = !TextUtils.isEmpty(this.A0E);
        boolean z3 = !TextUtils.isEmpty(this.A0D);
        ODA oda = this.A08;
        if (oda != null) {
            String str = oda.A01;
            if ("image/gif".equals(str) || "video/mp4".equals(str)) {
                z = true;
                if (!z2 || z3 || z) {
                    return true;
                }
                return false;
            }
        }
        z = false;
        return !z2 ? true : true;
    }

    public final byte[] A0B(byte[] bArr, int i, int i2, int i3, int i4, boolean z) {
        int i5;
        int i6;
        byte[] A082;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        int length = bArr.length;
        0fP.A00(bArr, 0, length, options);
        int i7 = options.outWidth;
        this.A01 = i7;
        int i8 = options.outHeight;
        this.A00 = i8;
        if (i7 < i || i8 < i2) {
            return null;
        }
        options.inDither = true;
        options.inScaled = false;
        options.inPreferQualityOverSpeed = true;
        boolean z2 = !z;
        int i9 = i4;
        int i10 = i3;
        if (i10 < 2 || i9 < 2 || (z2 && i10 != i9)) {
            i5 = Integer.MAX_VALUE;
            i6 = Integer.MAX_VALUE;
            z2 = false;
        } else {
            i5 = i10;
            i6 = i9;
        }
        if (!options.inJustDecodeBounds) {
            options.inJustDecodeBounds = true;
            0fP.A00(bArr, 0, length, options);
        }
        int i11 = options.outWidth;
        int i12 = options.outHeight;
        if (i11 <= 0 || i12 <= 0) {
            0KC.A0C("BitmapUtils", "bitmaputils/decode bad image");
            return null;
        }
        int i13 = options.inSampleSize;
        if (z2) {
            i11 = Math.max(i11, i12);
            i12 = i11;
        }
        int max = Math.max(i13, 1);
        int i14 = ((i11 - 1) / max) + 1;
        int i15 = ((i12 - 1) / max) + 1;
        while (((i14 - 1) / 2) + 1 >= i5 && ((i15 - 1) / 2) + 1 >= i6) {
            i14 = ((i14 - 1) / 2) + 1;
            i15 = ((i15 - 1) / 2) + 1;
            max *= 2;
        }
        options.inSampleSize = max;
        options.inJustDecodeBounds = false;
        options.inPurgeable = true;
        options.inInputShareable = true;
        Bitmap A002 = 0fP.A00(bArr, 0, length, options);
        if (A002 == null) {
            return null;
        }
        if (z) {
            Rect rect = new Rect(0, 0, A002.getWidth(), A002.getHeight());
            this.A03 = i10;
            this.A02 = i9;
            A082 = A08(A002, rect, i10, i9, 50);
        } else {
            int min = Math.min(140, Math.min(A002.getWidth(), A002.getHeight()));
            int min2 = Math.min(A002.getWidth(), A002.getHeight());
            Rect A0C2 = C66580MXl.A0C((A002.getWidth() - min2) / 2, (A002.getHeight() - min2) / 2, (A002.getWidth() + min2) / 2, (A002.getHeight() + min2) / 2);
            this.A05 = min;
            this.A04 = min;
            A082 = A08(A002, A0C2, min, min, 80);
        }
        A002.recycle();
        return A082;
    }

    public C71150OeA(OM9 om9, String str) {
        this.A0L = str;
        this.A0K = om9;
    }

    public static HashMap A05(String str) {
        HashMap A1E = AnonymousClass7TE.A1E();
        Matcher matcher = A0S.matcher(str);
        while (matcher.find()) {
            String group = matcher.group(1);
            String group2 = matcher.group(2);
            if (group2 == null && (group2 = matcher.group(3)) == null) {
                group2 = matcher.group(4);
            }
            if (group != null) {
                group = group.toLowerCase(Locale.US);
            }
            A1E.put(group, group2);
        }
        return A1E;
    }

    private void A06(String str, String str2, String... strArr) {
        String substring = str.substring(0, str.length() - str2.length());
        for (String A0R2 : strArr) {
            this.A0F.add(002.A0R(substring, A0R2));
        }
    }

    public static byte[] A08(Bitmap bitmap, Rect rect, int i, int i2, int i3) {
        Bitmap.Config config = bitmap.getConfig();
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, config);
        Canvas canvas = new Canvas(createBitmap);
        Paint A0C2 = JTO.A0C();
        A0C2.setAntiAlias(true);
        A0C2.setFilterBitmap(true);
        canvas.drawColor(-1);
        canvas.drawBitmap(bitmap, rect, new Rect(0, 0, i, i2), A0C2);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        0fO.A02(Bitmap.CompressFormat.JPEG, createBitmap, byteArrayOutputStream, i3);
        createBitmap.recycle();
        return byteArrayOutputStream.toByteArray();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:193:0x0433, code lost:
        if (r6 == null) goto L_0x0435;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0106, code lost:
        if ("video/mp4".equalsIgnoreCase(X.DbS.A0r("og:video:type", r1)) == false) goto L_0x0108;
     */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x0274  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x02ff  */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x03bd  */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x03df  */
    /* JADX WARNING: Removed duplicated region for block: B:183:0x03f3  */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x040e  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x01a8  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x01d8  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x01f9  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x021f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String A02(X.C71150OeA r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, java.net.URL r18, int r19) {
        /*
            r4 = r15
            java.util.regex.Pattern r0 = A0N
            java.util.regex.Matcher r1 = r0.matcher(r15)
            boolean r0 = r1.find()
            r5 = 1
            if (r0 == 0) goto L_0x0012
            java.lang.String r4 = r1.group(r5)
        L_0x0012:
            r2 = 0
            java.util.HashMap r1 = X.AnonymousClass7TE.A1E()
            java.util.ArrayList r7 = X.AnonymousClass7TE.A1C()
            java.util.regex.Pattern r0 = A0T
            java.util.regex.Matcher r6 = r0.matcher(r4)
        L_0x0021:
            boolean r0 = r6.find()
            r3 = r14
            if (r0 == 0) goto L_0x0056
            java.lang.String r0 = r6.group(r5)
            java.util.HashMap r10 = A05(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r16)
            java.lang.String r9 = "content"
            if (r0 == 0) goto L_0x04c8
            java.lang.String r0 = "charset"
            java.lang.String r8 = X.DbS.A0r(r0, r10)
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            if (r0 != 0) goto L_0x0480
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            if (r0 != 0) goto L_0x04c7
            java.lang.String r0 = X.C70395O4x.A00
            boolean r0 = r0.equalsIgnoreCase(r8)
            if (r0 != 0) goto L_0x04c7
            r14.A09()
            return r8
        L_0x0056:
            r14.A0G = r7
            java.lang.String r0 = r18.toString()
            r7 = r17
            r6 = r19
            X.ODA r7 = r14.A00(r0, r7, r6)
            if (r7 != 0) goto L_0x008e
            java.lang.String r7 = "og:url"
            java.lang.String r6 = "twitter:url"
            java.lang.String r0 = "og:video"
            java.lang.String[] r0 = new java.lang.String[]{r7, r6, r0}
            X.ODA r7 = r14.A01(r1, r0)
            if (r7 != 0) goto L_0x008e
            java.lang.String r0 = "og:image:type"
            java.lang.Object r6 = r1.get(r0)
            java.lang.String r0 = "image/gif"
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto L_0x008e
            java.lang.String r0 = "og:image"
            java.lang.String[] r0 = new java.lang.String[]{r0}
            X.ODA r7 = r14.A01(r1, r0)
        L_0x008e:
            r14.A08 = r7
            r9 = 5
            java.lang.String r10 = "og:image"
            java.lang.String r8 = "twitter:image"
            java.lang.String r7 = "image"
            java.lang.String r6 = "og:thumbnail"
            java.lang.String r0 = "thumbnail"
            java.lang.String[] r8 = new java.lang.String[]{r10, r8, r7, r6, r0}
            java.util.LinkedHashSet r7 = X.DbS.A0y()
            r6 = 0
        L_0x00a4:
            if (r6 >= r9) goto L_0x00b8
            r0 = r8[r6]
            java.lang.String r0 = X.DbS.A0r(r0, r1)
            if (r0 == 0) goto L_0x00b5
            java.lang.String r0 = r0.trim()
            r7.add(r0)
        L_0x00b5:
            int r6 = r6 + 1
            goto L_0x00a4
        L_0x00b8:
            r14.A0F = r7
            java.lang.String r7 = "og:title"
            r12 = 0
            java.lang.String r6 = "twitter:title"
            java.lang.String r0 = "title"
            java.lang.String[] r0 = new java.lang.String[]{r7, r6, r0}
            java.lang.String r0 = A03(r1, r0)
            r14.A0E = r0
            java.lang.String r7 = "og:description"
            java.lang.String r6 = "twitter:description"
            java.lang.String r0 = "description"
            java.lang.String[] r0 = new java.lang.String[]{r7, r6, r0}
            java.lang.String r0 = A03(r1, r0)
            r14.A0D = r0
            java.lang.String r6 = "og:url"
            java.lang.String r0 = "twitter:url"
            java.lang.String[] r0 = new java.lang.String[]{r6, r0}
            java.lang.String r0 = A03(r1, r0)
            r14.A0A = r0
            java.lang.String r9 = "og:site_name"
            java.lang.String r0 = X.DbS.A0r(r9, r1)
            r14.A0C = r0
            java.lang.String r8 = "og:video"
            boolean r0 = r1.containsKey(r8)
            java.lang.String r7 = "og:video:type"
            if (r0 == 0) goto L_0x0108
            java.lang.String r6 = X.DbS.A0r(r7, r1)
            java.lang.String r0 = "video/mp4"
            boolean r6 = r0.equalsIgnoreCase(r6)
            r0 = 1
            if (r6 != 0) goto L_0x0109
        L_0x0108:
            r0 = 0
        L_0x0109:
            r14.A0J = r0
            if (r0 == 0) goto L_0x0139
            java.lang.String r6 = X.DbS.A0r(r9, r1)
            java.lang.String r0 = "Facebook Watch"
            boolean r0 = r0.equalsIgnoreCase(r6)
            if (r0 == 0) goto L_0x0139
            java.lang.String r0 = r14.A0A
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0139
            java.lang.String r0 = r14.A0A
            android.net.Uri r0 = android.net.Uri.parse(r0)
            android.net.Uri$Builder r9 = r0.buildUpon()
            java.lang.String r6 = "fw"
            java.lang.String r0 = "1"
            android.net.Uri r0 = X.DbV.A08(r9, r6, r0)
            java.lang.String r0 = r0.toString()
            r14.A0A = r0
        L_0x0139:
            java.lang.String r0 = r14.A0A
            if (r0 != 0) goto L_0x0141
            java.lang.String r0 = r18.toString()
        L_0x0141:
            java.lang.String[] r6 = X.OYV.A02
            java.lang.String r0 = X.OYV.A01(r0, r6)
            android.net.Uri r9 = android.net.Uri.parse(r0)
            java.lang.String[] r0 = X.OYg.A04
            boolean r0 = X.OYg.A00(r9, r0)
            if (r0 != 0) goto L_0x0169
            java.lang.String[] r11 = X.OYg.A03
            boolean r0 = X.OYg.A00(r9, r11)
            if (r0 == 0) goto L_0x0277
            java.lang.String r0 = "fw"
            java.lang.String r10 = r9.getQueryParameter(r0)
            java.lang.String r0 = "1"
            boolean r0 = r0.equalsIgnoreCase(r10)
            if (r0 == 0) goto L_0x0277
        L_0x0169:
            r0 = 5
        L_0x016a:
            r14.A06 = r0
            java.lang.String r10 = "og:video:url"
            java.lang.String r9 = "og:video:secure_url"
            java.lang.String[] r0 = new java.lang.String[]{r8, r10, r9}
            java.lang.String r11 = A03(r1, r0)
            r1.get(r7)
            int r7 = r14.A06
            if (r11 == 0) goto L_0x0193
            if (r7 == 0) goto L_0x0193
            java.lang.String r0 = r18.toString()
            boolean r0 = android.webkit.URLUtil.isHttpsUrl(r0)
            if (r0 == 0) goto L_0x0193
            r0 = 4
            if (r7 != r0) goto L_0x0193
            java.lang.String r0 = "embed"
            r11.contains(r0)
        L_0x0193:
            boolean r0 = r14.A0J
            if (r0 == 0) goto L_0x01d0
            int r7 = r14.A06
            if (r7 == 0) goto L_0x01d0
            r0 = 4
            if (r7 == r0) goto L_0x01d0
            java.lang.String[] r0 = new java.lang.String[]{r8, r10, r9}
            java.lang.String r10 = A03(r1, r0)
            if (r10 == 0) goto L_0x0274
            java.lang.String r0 = "og:video:width"
            java.lang.String r9 = X.DbS.A0r(r0, r1)
            java.lang.String r0 = "og:video:height"
            java.lang.String r7 = X.DbS.A0r(r0, r1)
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            r8 = -1
            if (r0 != 0) goto L_0x0271
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            if (r0 != 0) goto L_0x0271
            int r8 = java.lang.Integer.parseInt(r9)
            int r7 = java.lang.Integer.parseInt(r7)
        L_0x01c9:
            X.OYg r0 = new X.OYg
            r0.<init>(r10, r8, r7)
        L_0x01ce:
            r14.A07 = r0
        L_0x01d0:
            java.lang.String r9 = "og:audio"
            boolean r0 = r1.containsKey(r9)
            if (r0 == 0) goto L_0x01f7
            java.lang.String r0 = "music:preview_url:type"
            java.lang.String r8 = X.DbS.A0r(r0, r1)
            r0 = 2669(0xa6d, float:3.74E-42)
            java.lang.String r7 = X.AnonymousClass000.A00(r0)
            boolean r0 = r7.equalsIgnoreCase(r8)
            if (r0 != 0) goto L_0x01f6
            java.lang.String r0 = "og:audio:type"
            java.lang.String r0 = X.DbS.A0r(r0, r1)
            boolean r0 = r7.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x01f7
        L_0x01f6:
            r12 = 1
        L_0x01f7:
            if (r12 == 0) goto L_0x0209
            java.lang.String r0 = "music:preview_url:secure_url"
            java.lang.String r0 = X.DbS.A0r(r0, r1)
            r14.A09 = r0
            if (r0 != 0) goto L_0x0209
            java.lang.String r0 = X.DbS.A0r(r9, r1)
            r14.A09 = r0
        L_0x0209:
            java.util.LinkedHashSet r0 = r14.A0F
            java.util.LinkedHashSet r7 = new java.util.LinkedHashSet
            r7.<init>(r0)
            java.util.LinkedHashSet r0 = r14.A0F
            r0.clear()
            java.util.Iterator r12 = r7.iterator()
        L_0x0219:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x02f7
            java.lang.String r10 = X.AnonymousClass7TE.A18(r12)
            boolean r0 = android.text.TextUtils.isEmpty(r10)
            if (r0 != 0) goto L_0x026b
            java.util.regex.Pattern r7 = A0Q
            java.lang.String r0 = X.OYV.A01(r10, r6)
            java.util.regex.Matcher r0 = r7.matcher(r0)
            boolean r0 = r0.find()
            if (r0 == 0) goto L_0x026b
            java.lang.String r11 = ":large"
            boolean r0 = r10.endsWith(r11)
            java.lang.String r9 = ":thumb"
            java.lang.String r8 = ":medium"
            java.lang.String r7 = ":small"
            if (r0 == 0) goto L_0x024f
            java.lang.String[] r0 = new java.lang.String[]{r8, r7, r9}
            r14.A06(r10, r11, r0)
            goto L_0x0219
        L_0x024f:
            boolean r0 = r10.endsWith(r8)
            if (r0 == 0) goto L_0x025d
            java.lang.String[] r0 = new java.lang.String[]{r8, r7, r9}
            r14.A06(r10, r8, r0)
            goto L_0x0219
        L_0x025d:
            boolean r0 = r10.endsWith(r7)
            if (r0 == 0) goto L_0x026b
            java.lang.String[] r0 = new java.lang.String[]{r7, r9}
            r14.A06(r10, r7, r0)
            goto L_0x0219
        L_0x026b:
            java.util.LinkedHashSet r0 = r14.A0F
            r0.add(r10)
            goto L_0x0219
        L_0x0271:
            r7 = -1
            goto L_0x01c9
        L_0x0274:
            r0 = 0
            goto L_0x01ce
        L_0x0277:
            boolean r0 = X.OYg.A00(r9, r11)
            if (r0 == 0) goto L_0x0280
            r0 = 2
            goto L_0x016a
        L_0x0280:
            java.lang.String[] r0 = X.OYg.A05
            boolean r0 = X.OYg.A00(r9, r0)
            if (r0 == 0) goto L_0x028b
            r0 = 3
            goto L_0x016a
        L_0x028b:
            java.lang.String[] r0 = X.OYg.A09
            boolean r0 = X.OYg.A00(r9, r0)
            if (r0 == 0) goto L_0x0296
            r0 = 1
            goto L_0x016a
        L_0x0296:
            r11 = 0
            if (r9 == 0) goto L_0x02c3
            java.lang.String r10 = r9.getHost()
            if (r10 == 0) goto L_0x02c3
            java.lang.String r0 = "m.youtube.com"
            boolean r0 = r0.equalsIgnoreCase(r10)
            if (r0 != 0) goto L_0x02ce
            java.lang.String r0 = "www.youtube.com"
            boolean r0 = r0.equalsIgnoreCase(r10)
            if (r0 != 0) goto L_0x02ce
            java.lang.String r0 = "youtube.com"
            boolean r0 = r0.equalsIgnoreCase(r10)
            if (r0 != 0) goto L_0x02ce
            java.lang.String r0 = "youtu.be"
            boolean r0 = r0.equalsIgnoreCase(r10)
            if (r0 == 0) goto L_0x02c3
            java.lang.String r11 = r9.getLastPathSegment()
        L_0x02c3:
            boolean r0 = android.text.TextUtils.isEmpty(r11)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x02d5
            r0 = 4
            goto L_0x016a
        L_0x02ce:
            java.lang.String r0 = "v"
            java.lang.String r11 = r9.getQueryParameter(r0)
            goto L_0x02c3
        L_0x02d5:
            java.lang.String[] r0 = X.OYg.A06
            boolean r0 = X.OYg.A00(r9, r0)
            if (r0 == 0) goto L_0x02e0
            r0 = 6
            goto L_0x016a
        L_0x02e0:
            java.lang.String[] r0 = X.OYg.A07
            boolean r0 = X.OYg.A00(r9, r0)
            if (r0 == 0) goto L_0x02eb
            r0 = 7
            goto L_0x016a
        L_0x02eb:
            java.lang.String[] r0 = X.OYg.A08
            boolean r0 = X.OYg.A00(r9, r0)
            int r0 = X.DbW.A00(r0)
            goto L_0x016a
        L_0x02f7:
            java.util.LinkedHashSet r0 = r14.A0F
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x03b5
            java.util.regex.Pattern r0 = A0O
            java.util.regex.Matcher r8 = r0.matcher(r4)
            r6 = 0
        L_0x0306:
            boolean r0 = r8.find()
            if (r0 == 0) goto L_0x0347
            java.lang.String r0 = r8.group(r5)
            java.util.HashMap r7 = A05(r0)
            java.lang.String r0 = "rel"
            java.lang.String r9 = X.DbS.A0r(r0, r7)
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            if (r0 != 0) goto L_0x0306
            java.lang.String r0 = "icon"
            boolean r0 = r0.equals(r9)
            if (r0 != 0) goto L_0x0340
            java.lang.String r0 = "image_src"
            boolean r0 = r0.equals(r9)
            if (r0 != 0) goto L_0x0340
            java.lang.String r0 = "apple-touch-icon-precomposed"
            boolean r0 = r0.equals(r9)
            if (r0 != 0) goto L_0x0340
            java.lang.String r0 = "apple-touch-icon"
            boolean r0 = r0.equals(r9)
            if (r0 == 0) goto L_0x0306
        L_0x0340:
            java.lang.String r0 = "href"
            java.lang.Object r6 = r7.get(r0)
            goto L_0x0306
        L_0x0347:
            if (r6 == 0) goto L_0x034e
            java.util.LinkedHashSet r0 = r14.A0F
            r0.add(r6)
        L_0x034e:
            java.util.LinkedHashSet r0 = r14.A0F
            java.util.LinkedHashSet r8 = X.DbS.A0y()
            java.util.Iterator r9 = r0.iterator()
        L_0x0358:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x03b3
            java.lang.String r15 = X.AnonymousClass7TE.A18(r9)
            boolean r0 = android.text.TextUtils.isEmpty(r15)
            if (r0 != 0) goto L_0x0382
            java.lang.String r0 = "http"
            boolean r0 = r15.startsWith(r0)
            if (r0 != 0) goto L_0x0382
            java.lang.String r0 = "//"
            boolean r0 = r15.startsWith(r0)
            if (r0 == 0) goto L_0x0388
            java.lang.String r6 = r18.getProtocol()
            java.lang.String r0 = ":"
            java.lang.String r15 = X.002.A0g(r6, r0, r15)
        L_0x0382:
            if (r15 == 0) goto L_0x0358
            r8.add(r15)
            goto L_0x0358
        L_0x0388:
            java.lang.String r11 = r18.getProtocol()     // Catch:{ MalformedURLException | URISyntaxException -> 0x03aa }
            java.lang.String r12 = r18.getUserInfo()     // Catch:{ MalformedURLException | URISyntaxException -> 0x03aa }
            java.lang.String r13 = r18.getHost()     // Catch:{ MalformedURLException | URISyntaxException -> 0x03aa }
            int r14 = r18.getPort()     // Catch:{ MalformedURLException | URISyntaxException -> 0x03aa }
            r16 = 0
            java.net.URI r10 = new java.net.URI     // Catch:{ MalformedURLException | URISyntaxException -> 0x03aa }
            r17 = r16
            r10.<init>(r11, r12, r13, r14, r15, r16, r17)     // Catch:{ MalformedURLException | URISyntaxException -> 0x03aa }
            java.net.URL r0 = r10.toURL()     // Catch:{ MalformedURLException | URISyntaxException -> 0x03aa }
            java.lang.String r15 = r0.toString()     // Catch:{ MalformedURLException | URISyntaxException -> 0x03aa }
            goto L_0x0382
        L_0x03aa:
            r7 = move-exception
            java.lang.String r6 = "WebPageInfo"
            java.lang.String r0 = "WebPageInfo/ensureThumbUrl Bad URL"
            X.0KC.A0H(r6, r0, r7)
            goto L_0x0382
        L_0x03b3:
            r3.A0F = r8
        L_0x03b5:
            java.lang.String r0 = r3.A0E
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x03d7
            java.util.regex.Pattern r0 = A0U
            java.util.regex.Matcher r4 = r0.matcher(r4)
        L_0x03c3:
            boolean r0 = r4.find()
            if (r0 == 0) goto L_0x03d7
            java.lang.String r0 = r4.group(r5)
            r0.getClass()
            java.lang.String r0 = r0.trim()
            r3.A0E = r0
            goto L_0x03c3
        L_0x03d7:
            java.lang.String r0 = r3.A0E
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x03eb
            java.lang.String r0 = r3.A0E
            android.text.Spanned r0 = android.text.Html.fromHtml(r0)
            java.lang.String r0 = r0.toString()
            r3.A0E = r0
        L_0x03eb:
            java.lang.String r0 = r3.A0D
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x03ff
            java.lang.String r0 = r3.A0D
            android.text.Spanned r0 = android.text.Html.fromHtml(r0)
            java.lang.String r0 = r0.toString()
            r3.A0D = r0
        L_0x03ff:
            java.lang.String r0 = "invite_link_type"
            r1.get(r0)
            java.lang.String r1 = r18.toString()
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x04c6
            android.net.Uri r4 = android.net.Uri.parse(r1)
            r6 = 0
            if (r4 == 0) goto L_0x0439
            java.lang.String r1 = r4.getScheme()
            java.lang.String r0 = "whatsapp"
            boolean r0 = r0.equals(r1)
            java.lang.String r3 = "code"
            java.lang.String r5 = "chat"
            if (r0 == 0) goto L_0x043d
            java.lang.String r0 = r4.getHost()
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0439
            java.lang.String r6 = r4.getQueryParameter(r3)
            if (r6 != 0) goto L_0x0439
        L_0x0435:
            java.lang.String r6 = r4.getLastPathSegment()
        L_0x0439:
            android.text.TextUtils.isEmpty(r6)
            return r2
        L_0x043d:
            java.lang.String r1 = r4.getScheme()
            java.lang.String r0 = "http"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0455
            java.lang.String r1 = r4.getScheme()
            java.lang.String r0 = "https"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0439
        L_0x0455:
            java.lang.String r1 = r4.getHost()
            r0 = 79
            java.lang.String r0 = X.Pxd.A00(r0)
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0435
            java.lang.String r1 = r4.getHost()
            java.lang.String r0 = "whatsapp.com"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0439
            java.lang.String r0 = r4.getLastPathSegment()
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0439
            java.lang.String r6 = r4.getQueryParameter(r3)
            goto L_0x0439
        L_0x0480:
            java.lang.String r0 = "http-equiv"
            java.lang.String r8 = X.DbS.A0r(r0, r10)
            java.lang.String r0 = "Content-Type"
            boolean r0 = r0.equalsIgnoreCase(r8)
            if (r0 == 0) goto L_0x04c8
            java.lang.String r8 = X.DbS.A0r(r9, r10)
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            if (r0 != 0) goto L_0x04c8
            java.util.regex.Pattern r0 = A0M
            java.util.regex.Matcher r8 = r0.matcher(r8)
            boolean r0 = r8.find()
            if (r0 == 0) goto L_0x04c8
            java.lang.String r0 = r8.group(r5)
            r0.getClass()
            java.lang.String r2 = r0.trim()
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r2 = r2.toUpperCase(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L_0x04c8
            java.lang.String r0 = X.C70395O4x.A00
            boolean r0 = r0.equalsIgnoreCase(r2)
            if (r0 != 0) goto L_0x04c8
            r14.A09()
        L_0x04c6:
            return r2
        L_0x04c7:
            r2 = r8
        L_0x04c8:
            r0 = 3816(0xee8, float:5.347E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.String r8 = X.DbS.A0r(r0, r10)
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            if (r0 == 0) goto L_0x04ea
            java.lang.String r0 = "name"
            java.lang.String r8 = X.DbS.A0r(r0, r10)
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            if (r0 == 0) goto L_0x04ea
            java.lang.String r0 = "itemprop"
            java.lang.String r8 = X.DbS.A0r(r0, r10)
        L_0x04ea:
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            if (r0 != 0) goto L_0x0021
            java.util.Set r0 = A0R
            boolean r0 = r0.contains(r8)
            if (r0 == 0) goto L_0x0021
            java.lang.String r3 = X.DbS.A0r(r9, r10)
            if (r3 == 0) goto L_0x0021
            java.lang.String r0 = "og:restrictions:country:allowed"
            boolean r0 = r0.equals(r8)
            if (r0 == 0) goto L_0x050d
            android.text.Spanned r0 = android.text.Html.fromHtml(r3)
            X.DbU.A1X(r0, r7)
        L_0x050d:
            android.text.Spanned r0 = android.text.Html.fromHtml(r3)
            java.lang.String r0 = r0.toString()
            r1.put(r8, r0)
            goto L_0x0021
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71150OeA.A02(X.OeA, java.lang.String, java.lang.String, java.lang.String, java.net.URL, int):java.lang.String");
    }
}
