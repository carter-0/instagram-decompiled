package X;

/* renamed from: X.5Dv  reason: invalid class name and case insensitive filesystem */
public final class C282585Dv extends C282595Dw {
    public static final C282585Dv A01 = new C282585Dv("");
    public final String A00;

    public static C282585Dv A00(String str) {
        if (str == null) {
            return null;
        }
        if (str.isEmpty()) {
            return A01;
        }
        return new C282585Dv(str);
    }

    public final int A03(int i) {
        return 16T.A01(this.A00);
    }

    public final String A06() {
        return this.A00;
    }

    public final String A07() {
        return this.A00;
    }

    public final void EN9(17Z r2, C269504fE r3) {
        String str = this.A00;
        if (str == null) {
            r2.A0a();
        } else {
            r2.A0t(str);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof C282585Dv)) {
            return false;
        }
        return ((C282585Dv) obj).A00.equals(this.A00);
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public C282585Dv(String str) {
        this.A00 = str;
    }
}
