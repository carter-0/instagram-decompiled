package X;

import android.net.Uri;
import android.text.TextUtils;
import android.util.LruCache;
import android.webkit.MimeTypeMap;
import com.facebook.browser.lite.pixelrequestbuffer.igpixelrequestbuffer.IGPixelRequestBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.STt  reason: case insensitive filesystem */
public abstract class C11429STt {
    public static final 0bq A00;
    public static final List A01 = Arrays.asList(new String[]{"dialog/share", "share.php", "dialog/share_open_graph", "dialog/feed", "sharer.php"});
    public static final Set A02 = Pxf.A0s(new String[]{"www.facebook.com", "m.facebook.com", IGPixelRequestBuffer.URL_PREFIX, "fb.watch", "m.alpha.facebook.com", "www.alpha.facebook.com"});
    public static final List A03 = Arrays.asList(new String[]{"/home.php", "/login.php"});
    public static final Set A04 = Pxf.A0s(new String[]{"https", "http"});
    public static final Pattern A05 = Pattern.compile("(?:w{2,3}[0-9]*?\\.)?(([a-z0-9-]+\\.)+([a-z]{2,}))");

    public static String A02(String str) {
        if (str == null) {
            return null;
        }
        Matcher matcher = A05.matcher(str.trim().toLowerCase(Locale.US));
        if (matcher.find()) {
            return matcher.group(1);
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0003, code lost:
        r0 = r3.getScheme();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A04(android.net.Uri r3) {
        /*
            r2 = 0
            if (r3 == 0) goto L_0x0016
            java.lang.String r0 = r3.getScheme()
            if (r0 == 0) goto L_0x0016
            java.util.Set r1 = A04
            java.lang.String r0 = r0.toLowerCase()
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x0016
            r2 = 1
        L_0x0016:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11429STt.A04(android.net.Uri):boolean");
    }

    static {
        0bp r3 = new 0bp();
        r3.A02 = true;
        ArrayList A1C = AnonymousClass7TE.A1C();
        A1C.add(Pattern.compile(".*"));
        A1C.add(Pattern.compile(".*"));
        A1C.add(Pattern.compile(".*"));
        r3.A01.add(A1C);
        r3.A01(new String[]{"fbclid"});
        A00 = r3.A00();
    }

    public static Uri A01(String str) {
        LruCache lruCache = 0cp.A00;
        Uri parse = Uri.parse(str);
        if (!A04(parse) && (parse == null || !"data".equals(parse.getScheme()))) {
            return null;
        }
        String host = parse.getHost();
        String scheme = parse.getScheme();
        if (!(host == null || scheme == null)) {
            Locale locale = Locale.US;
            String lowerCase = host.toLowerCase(locale);
            String lowerCase2 = scheme.toLowerCase(locale);
            if ((lowerCase.endsWith(".facebook.com") || lowerCase.equals(IGPixelRequestBuffer.URL_PREFIX)) && !lowerCase.startsWith("h.") && !lowerCase.startsWith("l.") && lowerCase2.equals("http")) {
                return parse.buildUpon().scheme("https").build();
            }
        }
        return parse;
    }

    public static boolean A06(String str) {
        if (str == null) {
            return false;
        }
        if (str.endsWith("/css") || str.endsWith("/javascript")) {
            return true;
        }
        return false;
    }

    public static Uri A00(Uri uri, 0TC r2) {
        String queryParameter;
        Uri A012;
        if (!A05(uri) || (queryParameter = uri.getQueryParameter("u")) == null || (A012 = 0cp.A01(r2, queryParameter)) == null) {
            return uri;
        }
        return A012;
    }

    public static String A03(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(str);
        if (!TextUtils.isEmpty(fileExtensionFromUrl)) {
            return MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtensionFromUrl);
        }
        return "";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0060, code lost:
        if (r5.getPath().startsWith("/linkshim") == false) goto L_0x0062;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0049, code lost:
        if (r2.equals("https") == false) goto L_0x004b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A05(android.net.Uri r5) {
        /*
            java.lang.String r1 = r5.getHost()
            java.lang.String r0 = "l.instagram.com"
            boolean r4 = r0.equals(r1)
            boolean r0 = X.SS2.A02(r5)
            if (r0 == 0) goto L_0x004b
            java.lang.String r0 = r5.getHost()
            if (r0 == 0) goto L_0x004b
            java.lang.String r0 = r5.getHost()
            X.0Sd.A00(r0)
            java.util.Locale r1 = java.util.Locale.ENGLISH
            java.lang.String r3 = r0.toLowerCase(r1)
            java.lang.String r0 = r5.getScheme()
            X.0Sd.A00(r0)
            java.lang.String r2 = r0.toLowerCase(r1)
            java.lang.String r1 = "instagram.com"
            boolean r0 = r3.equals(r1)
            if (r0 != 0) goto L_0x0042
            java.lang.String r0 = "."
            java.lang.String r0 = X.002.A0R(r0, r1)
            boolean r0 = r3.endsWith(r0)
            if (r0 == 0) goto L_0x004b
        L_0x0042:
            java.lang.String r0 = "https"
            boolean r0 = r2.equals(r0)
            r1 = 1
            if (r0 != 0) goto L_0x004c
        L_0x004b:
            r1 = 0
        L_0x004c:
            r2 = 1
            if (r1 == 0) goto L_0x0062
            java.lang.String r0 = r5.getPath()
            if (r0 == 0) goto L_0x0062
            java.lang.String r1 = r5.getPath()
            java.lang.String r0 = "/linkshim"
            boolean r0 = r1.startsWith(r0)
            r1 = 1
            if (r0 != 0) goto L_0x0063
        L_0x0062:
            r1 = 0
        L_0x0063:
            boolean r0 = X.C11324SMy.A01(r5)
            if (r4 != 0) goto L_0x006e
            if (r1 != 0) goto L_0x006e
            if (r0 != 0) goto L_0x006e
            r2 = 0
        L_0x006e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11429STt.A05(android.net.Uri):boolean");
    }

    public static boolean A07(String str, String str2) {
        int length = str.length() - str2.length();
        if (!str.endsWith(str2)) {
            return false;
        }
        if (length == 0 || str.codePointAt(length - 1) == 46) {
            return true;
        }
        return false;
    }
}
