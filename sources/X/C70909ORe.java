package X;

import com.facebook.react.views.webview.ReactWebViewManager;
import java.nio.charset.Charset;

/* renamed from: X.ORe  reason: case insensitive filesystem */
public abstract class C70909ORe {
    public static final Charset A00 = Charset.forName(ReactWebViewManager.HTML_ENCODING);

    public static boolean A00(CharSequence charSequence) {
        if (charSequence.length() < 7) {
            return false;
        }
        int i = 0;
        while (charSequence.charAt(i) == "#".charAt(i)) {
            i++;
            if (i >= 7) {
                return true;
            }
        }
        return false;
    }
}
