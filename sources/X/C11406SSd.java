package X;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import com.facebook.react.views.webview.ReactWebViewManager;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Iterator;

/* renamed from: X.SSd  reason: case insensitive filesystem */
public abstract class C11406SSd {
    public static String A03(byte[] bArr) {
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA-1");
            instance.update(bArr);
            byte[] digest = instance.digest();
            StringBuilder A1A = AnonymousClass7TE.A1A();
            for (byte b : digest) {
                A1A.append(Integer.toHexString((b >> 4) & 15));
                A1A.append(Integer.toHexString((b >> 0) & 15));
            }
            return A1A.toString();
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    public static boolean A05(String str) {
        if (str == null || str.length() == 0) {
            return true;
        }
        return false;
    }

    public static Uri A00(Bundle bundle, String str, String str2) {
        Uri.Builder A0I = Pxe.A0I();
        A0I.scheme("https");
        A0I.authority(str);
        A0I.path(str2);
        if (bundle != null) {
            Iterator A0t = Pxf.A0t(bundle);
            while (A0t.hasNext()) {
                String A18 = AnonymousClass7TE.A18(A0t);
                Object obj = bundle.get(A18);
                if (obj instanceof String) {
                    A0I.appendQueryParameter(A18, (String) obj);
                }
            }
        }
        return A0I.build();
    }

    public static Bundle A01(String str) {
        Uri A03 = 0cp.A03(str);
        Bundle A02 = A02(A03.getQuery());
        A02.putAll(A02(A03.getFragment()));
        return A02;
    }

    public static Bundle A02(String str) {
        String str2;
        String str3;
        Bundle A0a = AnonymousClass7TE.A0a();
        if (!A05(str)) {
            for (String split : str.split("&")) {
                String[] split2 = split.split("=");
                try {
                    if (split2.length == 2) {
                        str2 = URLDecoder.decode(split2[0], ReactWebViewManager.HTML_ENCODING);
                        str3 = URLDecoder.decode(split2[1], ReactWebViewManager.HTML_ENCODING);
                    } else if (split2.length == 1) {
                        str2 = URLDecoder.decode(split2[0], ReactWebViewManager.HTML_ENCODING);
                        str3 = "";
                    }
                    A0a.putString(str2, str3);
                } catch (UnsupportedEncodingException e) {
                    e.toString();
                }
            }
        }
        return A0a;
    }

    public static void A04(Context context, String str) {
        CookieSyncManager.createInstance(context).sync();
        CookieManager instance = CookieManager.getInstance();
        String cookie = instance.getCookie(str);
        if (cookie != null) {
            for (String split : cookie.split(";")) {
                String[] split2 = split.split("=");
                if (split2.length > 0) {
                    instance.setCookie(str, 002.A0R(Pxe.A13(split2, 0), "=;expires=Sat, 1 Jan 2000 00:00:01 UTC;"));
                }
            }
            instance.removeExpiredCookie();
        }
    }
}
