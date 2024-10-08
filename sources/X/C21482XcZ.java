package X;

/* renamed from: X.XcZ  reason: case insensitive filesystem */
public final class C21482XcZ {
    public C21479XcS A00 = new C21479XcS();
    public boolean A01;
    public final Object A02;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.A02.equals(((C21482XcZ) obj).A02);
    }

    public final int hashCode() {
        return this.A02.hashCode();
    }

    public C21482XcZ(Object obj) {
        this.A02 = obj;
    }
}
