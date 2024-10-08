package X;

/* renamed from: X.Jjd  reason: case insensitive filesystem */
public final class C60334Jjd extends C63569KzI {
    public static final C60334Jjd A00 = new C63569KzI(false);

    public C60334Jjd() {
        super(false);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C60334Jjd) || this.A00 != ((C63569KzI) obj).A00) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        if (this.A00) {
            return 1231;
        }
        return 1237;
    }

    public final String toString() {
        return 002.A0L("Loading(endOfPaginationReached=", ')', this.A00);
    }
}
