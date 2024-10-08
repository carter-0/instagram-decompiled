package X;

/* renamed from: X.8gK  reason: invalid class name and case insensitive filesystem */
public final class C361498gK extends C282595Dw {
    public static final C361498gK A01 = new C361498gK(false);
    public static final C361498gK A02 = new C361498gK(true);
    public final boolean A00;

    public final boolean equals(Object obj) {
        if (obj != this) {
            return obj != null && (obj instanceof C361498gK) && this.A00 == ((C361498gK) obj).A00;
        }
        return true;
    }

    public final String A06() {
        if (this.A00) {
            return "true";
        }
        return "false";
    }

    public final 16L A0B() {
        if (this.A00) {
            return 16L.A0K;
        }
        return 16L.A0F;
    }

    public final void EN9(17Z r2, C269504fE r3) {
        r2.A0x(this.A00);
    }

    public final int hashCode() {
        if (this.A00) {
            return 3;
        }
        return 1;
    }

    public C361498gK(boolean z) {
        this.A00 = z;
    }

    public final int A03(int i) {
        return this.A00 ? 1 : 0;
    }
}
