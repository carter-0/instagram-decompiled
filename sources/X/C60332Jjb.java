package X;

/* renamed from: X.Jjb  reason: case insensitive filesystem */
public final class C60332Jjb extends C63569KzI {
    public static final C60332Jjb A00 = new C63569KzI(true);
    public static final C60332Jjb A01 = new C63569KzI(false);

    public final boolean equals(Object obj) {
        if (!(obj instanceof C60332Jjb) || this.A00 != ((C63569KzI) obj).A00) {
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
        return 002.A0L("NotLoading(endOfPaginationReached=", ')', this.A00);
    }
}
