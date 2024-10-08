package X;

import android.net.Uri;

/* renamed from: X.Ndf  reason: case insensitive filesystem */
public final class C69043Ndf extends C71885OsT {
    public final Uri A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C69043Ndf) && 0qQ.A0K(this.A00, ((C69043Ndf) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public C69043Ndf(Uri uri) {
        this.A00 = uri;
    }
}
