package X;

public final class WIL implements X2R {
    public final String A00;

    public final boolean FMt(X2R x2r) {
        return ((WIL) x2r).A00.equals(this.A00);
    }

    public WIL(String str) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("Non-null/Non-empty identifier required");
        }
        this.A00 = str;
    }
}
