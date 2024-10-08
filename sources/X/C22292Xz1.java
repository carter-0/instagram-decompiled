package X;

import android.net.Uri;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.Xz1  reason: case insensitive filesystem */
public abstract class C22292Xz1 implements C257113ws, C257133wu {
    public int A00;
    public int A01;
    public C257103wr A02;
    public byte[] A03;

    public static void A01(C250833m8 r3, String str, Map map) {
        List list = (List) map.get(str);
        if (list != null && !list.isEmpty()) {
            r3.Dtb(str, list.get(0));
        }
    }

    public final void changeHttpPriority(byte b, boolean z) {
    }

    public final void A02(C250813m6 r7, boolean z) {
        Map responseHeaders;
        C257103wr r0 = this.A02;
        if (r0 != null && r7 != null && (responseHeaders = r0.getResponseHeaders()) != null) {
            List list = (List) responseHeaders.get("x-fb-origin-hit");
            if (list != null && !list.isEmpty()) {
                r7.Dtb("x-fb-origin-hit", list.get(0));
            }
            A01(r7, "x-fb-edge-hit", responseHeaders);
            List A012 = C2607847a.A01("X-FB-Connection-Quality", responseHeaders, z);
            if (A012 != null && !A012.isEmpty()) {
                r7.Dtb("X-FB-Connection-Quality", A012.get(0));
            }
            A01(r7, "x-fb-response-time-ms", responseHeaders);
            A01(r7, "x-bwe-mean", responseHeaders);
            A01(r7, "x-bwe-std-dev", responseHeaders);
            A01(r7, AnonymousClass000.A00(4222), responseHeaders);
            A01(r7, "x-fb-dynamic-predictive-response-chunk-size", responseHeaders);
            Iterator A0u = AnonymousClass7TF.A0u(responseHeaders);
            while (A0u.hasNext()) {
                Map.Entry A1J = AnonymousClass7TE.A1J(A0u);
                if (!(A1J.getKey() == null || A1J.getValue() == null || ((List) A1J.getValue()).isEmpty())) {
                    if (((String) A1J.getKey()).startsWith("x-fb-dynamic-") || ((String) A1J.getKey()).startsWith("x-fb-ull-")) {
                        r7.Dtb((String) A1J.getKey(), ((List) A1J.getValue()).get(0));
                    }
                }
            }
            A01(r7, "x-fb-dynamic-client-wallclock-offset-ms", responseHeaders);
        }
    }

    public boolean A03() {
        int i = this.A01;
        if (i < 0 || i != this.A00) {
            return false;
        }
        return true;
    }

    public final Uri getUri() {
        C257103wr r0 = this.A02;
        if (r0 == null) {
            return null;
        }
        return r0.getUri();
    }

    public final /* synthetic */ Map getResponseHeaders() {
        return Collections.emptyMap();
    }
}
