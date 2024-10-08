package X;

/* renamed from: X.F3e  reason: case insensitive filesystem */
public final class C49718F3e {
    public Object A00;
    public boolean A01;
    public final String A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && DbY.A1b(this, obj)) {
                C49718F3e f3e = (C49718F3e) obj;
                if (this.A01 != f3e.A01 || !0qQ.A0K(this.A00, f3e.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        if (!this.A01) {
            return super.hashCode();
        }
        Object obj = this.A00;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public final String toString() {
        if (this.A01) {
            return String.valueOf(this.A00);
        }
        return "[Error] Uninitialized";
    }

    public C49718F3e(String str) {
        this.A02 = str;
    }
}
