package X;

import com.facebook.react.views.webview.ReactWebViewManager;
import java.nio.charset.Charset;
import java.security.MessageDigest;

/* renamed from: X.Hd5  reason: case insensitive filesystem */
public abstract class C55155Hd5 {
    public static final String A00(String str) {
        MessageDigest instance = MessageDigest.getInstance("SHA-256");
        Charset forName = Charset.forName(ReactWebViewManager.HTML_ENCODING);
        0qQ.A07(forName);
        byte[] bytes = str.getBytes(forName);
        0qQ.A07(bytes);
        byte[] digest = instance.digest(bytes);
        0qQ.A07(digest);
        return AnonymousClass7TF.A0j(C56478HzA.A00(digest));
    }
}
