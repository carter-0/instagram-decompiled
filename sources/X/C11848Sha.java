package X;

import java.net.URI;

/* renamed from: X.Sha  reason: case insensitive filesystem */
public final class C11848Sha implements C13528Tc0 {
    public final String A00;
    public final URI A01;

    public final String Bph() {
        return this.A00;
    }

    public final String toString() {
        return DbT.A10(this.A01);
    }

    public C11848Sha(URI uri) {
        this.A01 = uri;
        this.A00 = uri.getScheme();
        0qQ.A07(uri.getSchemeSpecificPart());
        uri.getPath();
    }
}
