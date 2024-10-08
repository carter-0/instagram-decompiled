package X;

/* renamed from: X.5NG  reason: invalid class name */
public final class AnonymousClass5NG {
    public C264774Rf A00 = new C264774Rf();
    public boolean A01;
    public boolean A02;
    public final Object A03;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.A03.equals(((AnonymousClass5NG) obj).A03);
    }

    public final int hashCode() {
        return this.A03.hashCode();
    }

    public AnonymousClass5NG(Object obj) {
        this.A03 = obj;
    }
}
