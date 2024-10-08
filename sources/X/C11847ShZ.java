package X;

import android.net.Uri;

/* renamed from: X.ShZ  reason: case insensitive filesystem */
public final class C11847ShZ implements C13528Tc0 {
    public final Uri A00;
    public final String A01;

    public final String Bph() {
        return this.A01;
    }

    public final String toString() {
        return DbT.A10(this.A00);
    }

    public C11847ShZ(Uri uri) {
        this.A00 = uri;
        this.A01 = uri.getScheme();
        0qQ.A07(uri.getSchemeSpecificPart());
        uri.getPath();
    }
}
