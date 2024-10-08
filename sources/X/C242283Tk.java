package X;

import java.util.Arrays;

/* renamed from: X.3Tk  reason: invalid class name and case insensitive filesystem */
public final class C242283Tk {
    public int A00;
    public String A01;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C242283Tk)) {
            return false;
        }
        C242283Tk r4 = (C242283Tk) obj;
        return this.A00 == r4.A00 && this.A01.equals(r4.A01);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.A00), this.A01});
    }

    public final String toString() {
        return 002.A05(this.A00, "type:", "\ntext:", this.A01);
    }
}
