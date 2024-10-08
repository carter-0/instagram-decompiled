package X;

import android.net.Uri;
import android.os.Bundle;
import java.util.Map;
import java.util.Set;

/* renamed from: X.ADg  reason: case insensitive filesystem */
public final class C39884ADg {
    public final Map A00;
    public final Set A01;
    public final Set A02;

    /* JADX WARNING: type inference failed for: r0v1, types: [java.lang.Object, X.0bY] */
    public final void A00(String str) {
        Set set = this.A02;
        synchronized (set) {
            Uri A012 = 0cp.A01(new Object(), str);
            if (!(A012 == null || A012.getHost() == null)) {
                set.add(A012.getHost());
            }
        }
    }

    public C39884ADg(Bundle bundle) {
        this.A00 = (Map) bundle.getSerializable("resource_counts");
        this.A02 = (Set) bundle.getSerializable("resource_domains");
        this.A01 = (Set) bundle.getSerializable("images_url");
    }

    public C39884ADg() {
        this.A00 = AnonymousClass7TE.A1E();
        this.A02 = AnonymousClass7TE.A1F();
        this.A01 = AnonymousClass7TE.A1F();
    }
}
