package X;

import android.net.Uri;
import java.util.Collection;

/* renamed from: X.QcS  reason: case insensitive filesystem */
public final class C7900QcS extends AnonymousClass0cm {
    public final Integer A00 = AnonymousClass05K.A00;
    public final Collection A01;

    public final boolean A01(Uri uri) {
        if (uri == null) {
            return false;
        }
        Integer num = this.A00;
        if (num == AnonymousClass05K.A00) {
            return this.A01.contains(uri.getScheme());
        }
        if (num == AnonymousClass05K.A01) {
            return !this.A01.contains(uri.getScheme());
        }
        return false;
    }

    public C7900QcS(Collection collection) {
        this.A01 = collection;
    }

    public final boolean A00() {
        return this.A01.isEmpty();
    }
}
