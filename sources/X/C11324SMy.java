package X;

import android.net.Uri;
import com.facebook.browser.lite.pixelrequestbuffer.igpixelrequestbuffer.IGPixelRequestBuffer;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

/* renamed from: X.SMy  reason: case insensitive filesystem */
public abstract class C11324SMy {
    public static final 16f A00 = new 16f(100);
    public static final ThreadLocal A01 = new ThreadLocal();
    public static final Set A02;
    public static final Pattern A03 = Pattern.compile("^(z-.*)?(origincache.*|cdn).fbsbx.com$");

    public static boolean A00(Uri uri) {
        String host;
        if (uri == null || (host = uri.getHost()) == null) {
            return false;
        }
        if ("http".equalsIgnoreCase(uri.getScheme()) || "https".equalsIgnoreCase(uri.getScheme())) {
            return (host.endsWith(".facebook.com") || host.equals(IGPixelRequestBuffer.URL_PREFIX) || host.equals("fb.me")) && !host.startsWith("our.intern.");
        }
        return false;
    }

    static {
        HashSet hashSet = new HashSet(6);
        Collections.addAll(hashSet, new String[]{"__gda__", "oh", "oe", "hdnea", "logcdn", "efg"});
        A02 = Collections.unmodifiableSet(hashSet);
    }

    public static boolean A01(Uri uri) {
        if (!A00(uri) || !uri.getPath().equals("/l.php")) {
            return false;
        }
        return true;
    }
}
