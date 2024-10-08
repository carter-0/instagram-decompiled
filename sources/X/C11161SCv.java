package X;

import com.facebook.react.views.webview.ReactWebViewManager;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

/* renamed from: X.SCv  reason: case insensitive filesystem */
public abstract class C11161SCv {
    public static final Pattern A00 = Pattern.compile("^(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)(\\.(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)){3}$");
    public static final Pattern A01 = Pattern.compile("^(?:[0-9a-fA-F]{1,4}:){7}[0-9a-fA-F]{1,4}$");
    public static final Pattern A02 = Pattern.compile("^((?:[0-9A-Fa-f]{1,4}(?::[0-9A-Fa-f]{1,4})*)?)::((?:[0-9A-Fa-f]{1,4}(?::[0-9A-Fa-f]{1,4})*)?)$");

    public static Map A00(URI uri) {
        String str;
        Map emptyMap = Collections.emptyMap();
        String rawQuery = uri.getRawQuery();
        HashMap hashMap = emptyMap;
        if (rawQuery != null) {
            hashMap = emptyMap;
            if (rawQuery.length() > 0) {
                HashMap A1E = AnonymousClass7TE.A1E();
                C10271RpV rpV = new C10271RpV(new C8437Quf('='));
                C9020RLv rLv = C8438Qug.A00;
                C8436Que que = new C8436Que(rLv, new C10271RpV(new C8437Quf('&')), rawQuery, true);
                while (que.hasNext()) {
                    String A18 = AnonymousClass7TE.A18(que);
                    A18.getClass();
                    C8436Que que2 = new C8436Que(rLv, rpV, A18, false);
                    ArrayList A1C = AnonymousClass7TE.A1C();
                    while (que2.hasNext()) {
                        JTT.A1U(A1C, que2);
                    }
                    List unmodifiableList = Collections.unmodifiableList(A1C);
                    if (unmodifiableList.isEmpty() || unmodifiableList.size() > 2) {
                        throw AnonymousClass7TE.A0w("bad parameter");
                    }
                    try {
                        String decode = URLDecoder.decode(AnonymousClass7TE.A19(unmodifiableList, 0), ReactWebViewManager.HTML_ENCODING);
                        if (unmodifiableList.size() == 2) {
                            try {
                                str = URLDecoder.decode(AnonymousClass7TE.A19(unmodifiableList, 1), ReactWebViewManager.HTML_ENCODING);
                            } catch (UnsupportedEncodingException e) {
                                throw new IllegalArgumentException(e);
                            }
                        } else {
                            str = null;
                        }
                        A1E.put(decode, str);
                    } catch (UnsupportedEncodingException e2) {
                        throw new IllegalArgumentException(e2);
                    }
                }
                hashMap = A1E;
            }
        }
        return hashMap;
    }
}
