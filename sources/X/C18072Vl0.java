package X;

import com.instagram.model.venue.LocationDict;
import com.instagram.model.venue.Venue;

/* renamed from: X.Vl0  reason: case insensitive filesystem */
public final class C18072Vl0 {
    public UXL A00;
    public LocationDict A01;
    public String A02;
    public String A03;
    public String A04;

    /* JADX WARNING: type inference failed for: r0v1, types: [com.instagram.model.venue.Venue, java.lang.Object] */
    public final Venue A00() {
        LocationDict locationDict = this.A01;
        if (locationDict != null) {
            ? obj = new Object();
            obj.A00 = locationDict;
            return obj;
        }
        throw AnonymousClass7TE.A0y();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18072Vl0)) {
            return false;
        }
        return 0qQ.A0K(A00(), ((C18072Vl0) obj).A00());
    }

    public final String A01() {
        String name = A00().A00.getName();
        if (name != null) {
            return name;
        }
        throw AnonymousClass7TE.A0y();
    }

    public final int hashCode() {
        return A00().hashCode();
    }

    public final String toString() {
        String A042 = A00().A04();
        if (A042 != null) {
            return A042;
        }
        throw AnonymousClass7TE.A0y();
    }
}
