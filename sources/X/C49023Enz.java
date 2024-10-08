package X;

import com.facebook.react.views.webview.ReactWebViewManager;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.Enz  reason: case insensitive filesystem */
public abstract class C49023Enz {
    public static final String A00(String str) {
        Object next;
        String valueOf;
        String encode = URLEncoder.encode(str, ReactWebViewManager.HTML_ENCODING);
        if (encode == null) {
            return null;
        }
        int length = encode.length();
        ArrayList A0v = DbS.A0v(length);
        for (int i = 0; i < length; i++) {
            char charAt = encode.charAt(i);
            if (charAt == '~') {
                valueOf = "%7E";
            } else if (charAt == '-') {
                valueOf = "%2D";
            } else if (charAt == '.') {
                valueOf = "%2E";
            } else if (charAt == '_') {
                valueOf = "%5F";
            } else {
                valueOf = String.valueOf(charAt);
            }
            A0v.add(valueOf);
        }
        Iterator it = A0v.iterator();
        if (!it.hasNext()) {
            next = null;
        } else {
            next = it.next();
            while (it.hasNext()) {
                next = 002.A0R((String) next, AnonymousClass7TE.A18(it));
            }
        }
        return (String) next;
    }
}
