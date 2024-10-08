package X;

import com.instagram.model.mapquery.MapQuery;

/* renamed from: X.Nff  reason: case insensitive filesystem */
public final class C69156Nff extends C66942Mfb {
    public MapQuery A00 = new MapQuery("", "", AnonymousClass7TF.A0j("CATEGORY"));

    public C69156Nff() {
        super(6);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C69156Nff) || !0qQ.A0K(this.A00, ((C69156Nff) obj).A00)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }
}
