package X;

import android.os.Looper;
import java.util.Arrays;

/* renamed from: X.VjF  reason: case insensitive filesystem */
public final class C17977VjF {
    public Looper A00;
    public AnonymousClass4MX A01;
    public final AnonymousClass4ND A02;

    public final C19081WKl A00() {
        UUG uug;
        AnonymousClass4MX r1 = this.A01;
        if (r1 != null) {
            uug = new UUG(this.A00, r1);
        } else {
            uug = null;
        }
        return new C19081WKl(this.A02, new UUF((X68[]) Arrays.copyOf(new XBk[]{uug, null}, 2)));
    }

    public final void A01(Looper looper, AnonymousClass4MX r2) {
        this.A01 = r2;
        this.A00 = looper;
    }

    public C17977VjF(AnonymousClass4ND r1) {
        this.A02 = r1;
    }
}
