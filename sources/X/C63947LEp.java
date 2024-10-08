package X;

import com.instagram.common.gallery.Medium;

/* renamed from: X.LEp  reason: case insensitive filesystem */
public final class C63947LEp {
    public int A00 = -1;
    public final Medium A01;

    public C63947LEp(Medium medium) {
        0qQ.A0B(medium, 1);
        this.A01 = medium;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C63947LEp)) {
            return false;
        }
        return this.A01.equals(((C63947LEp) obj).A01);
    }

    public final int hashCode() {
        return this.A01.hashCode();
    }
}
