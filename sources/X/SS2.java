package X;

import android.net.Uri;
import android.text.TextUtils;
import com.facebook.browser.lite.pixelrequestbuffer.igpixelrequestbuffer.IGPixelRequestBuffer;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.regex.Pattern;

public abstract class SS2 {
    public static final Set A00;
    public static final Set A01;
    public static final Set A02;

    public static boolean A01(Uri uri) {
        boolean z;
        String fragment;
        Uri build;
        String str = null;
        String str2 = null;
        Uri uri2 = uri;
        if (uri == null || !A02(uri) || uri.getHost() == null) {
            uri2 = null;
            z = false;
        } else {
            String host = uri.getHost();
            0Sd.A00(host);
            Locale locale = Locale.ENGLISH;
            str = host.toLowerCase(locale);
            String scheme = uri.getScheme();
            0Sd.A00(scheme);
            str2 = scheme.toLowerCase(locale);
            z = true;
        }
        if (!z || ((!str.equals(IGPixelRequestBuffer.URL_PREFIX) && !str.endsWith(002.A0R(".", IGPixelRequestBuffer.URL_PREFIX))) || !str2.equals("https") || str.startsWith("apps") || (!uri2.getPathSegments().isEmpty() && AnonymousClass7TE.A19(uri2.getPathSegments(), 0).equalsIgnoreCase("apps")))) {
            return false;
        }
        if (uri == null || !A03(uri) || (fragment = uri.getFragment()) == null || !fragment.startsWith("!/") || (build = Pxe.A0I().scheme(uri.getScheme()).authority(uri.getHost()).path(fragment.substring(1)).build()) == null || build.equals(uri)) {
            return true;
        }
        return A01(build);
    }

    public static boolean A02(Uri uri) {
        String scheme = uri.getScheme();
        if (scheme != null) {
            return scheme.equalsIgnoreCase("http") || scheme.equalsIgnoreCase("https");
        }
        return false;
    }

    public static boolean A03(Uri uri) {
        if (uri == null || !A02(uri) || uri.getHost() == null) {
            return false;
        }
        String host = uri.getHost();
        0Sd.A00(host);
        String lowerCase = host.toLowerCase(Locale.ENGLISH);
        0Sd.A00(uri.getScheme());
        if (lowerCase.equals(IGPixelRequestBuffer.URL_PREFIX) || lowerCase.endsWith(002.A0R(".", IGPixelRequestBuffer.URL_PREFIX))) {
            return true;
        }
        return false;
    }

    static {
        HashSet A1F = AnonymousClass7TE.A1F();
        A01 = A1F;
        A1F.add("dev");
        A1F.add("intern");
        A1F.add("alpha");
        A1F.add("beta");
        A1F.add("latest");
        A1F.add("prod");
        HashSet A1F2 = AnonymousClass7TE.A1F();
        A00 = A1F2;
        A1F2.add("app");
        A1F2.add("developers");
        A1F2.add("partners");
        HashSet A1F3 = AnonymousClass7TE.A1F();
        A02 = A1F3;
        A1F3.add("our");
        A1F3.add("tools");
        A1F3.add("fiddle");
        A1F3.add("interngraph");
    }

    public static boolean A00(Uri uri) {
        if (!A03(uri) || uri == null || TextUtils.isEmpty(uri.getPath())) {
            return false;
        }
        return DbV.A1b(uri.getPath(), Pattern.compile(String.format(Locale.US, "^(/pg/([^/]+)/([^/]+)/?)*$", new Object[0])));
    }
}
