package X;

import android.content.res.Configuration;

/* renamed from: X.3X3  reason: invalid class name */
public final class AnonymousClass3X3 {
    public final synchronized 2V2 A00(Configuration configuration) {
        2V3 r1;
        0qQ.A0B(configuration, 0);
        r1 = 2V2.latest;
        if (r1 == null || !0qQ.A0K(r1.A00, configuration)) {
            r1 = new 2V3(new Configuration(configuration));
            2V2.latest = r1;
        }
        return r1;
    }
}
