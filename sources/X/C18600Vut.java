package X;

import java.util.Comparator;

/* renamed from: X.Vut  reason: case insensitive filesystem */
public final class C18600Vut {
    public static Comparator A02 = new C20373WqD(2);
    public final int A00;
    public final int A01;

    public final boolean equals(Object obj) {
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        C18600Vut vut = (C18600Vut) obj;
        return this.A00 == vut.A00 && this.A01 == vut.A01;
    }

    public final String toString() {
        return 002.A0n("[", ", ", "]", this.A01, this.A00);
    }

    public C18600Vut(int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
    }
}
