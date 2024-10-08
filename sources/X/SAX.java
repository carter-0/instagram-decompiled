package X;

import android.webkit.CookieManager;
import java.net.HttpCookie;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class SAX {
    public static final synchronized void A00(0lg r6, List list) {
        String domain;
        synchronized (SAX.class) {
            ArrayList A0q = AnonymousClass7TF.A0q(r6, 1);
            A0q.addAll(1Q5.A00(r6));
            A0q.addAll(F7c.A01(r6));
            if (list != null) {
                A0q.addAll(list);
            }
            Iterator A1G = AnonymousClass7TE.A1G(A0q);
            while (A1G.hasNext()) {
                HttpCookie httpCookie = (HttpCookie) AnonymousClass7TF.A0a(A1G);
                String A00 = RhY.A00(httpCookie);
                if (httpCookie.getSecure()) {
                    domain = Pxf.A0b(Pxe.A0I().authority(httpCookie.getDomain()).scheme("https"));
                } else {
                    domain = httpCookie.getDomain();
                }
                0qQ.A07(domain);
                CookieManager.getInstance().setCookie(domain, A00);
            }
        }
    }
}
