package X;

import androidx.compose.foundation.layout.WindowInsets;

public final class IF0 implements WindowInsets {
    public final WindowInsets A00;
    public final WindowInsets A01;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IF0)) {
            return false;
        }
        IF0 if0 = (IF0) obj;
        return 0qQ.A0K(if0.A00, this.A00) && 0qQ.A0K(if0.A01, this.A01);
    }

    public final int AhD(C268024cd r3) {
        return Math.max(this.A00.AhD(r3), this.A01.AhD(r3));
    }

    public final int BMH(C268024cd r3, AnonymousClass5Q8 r4) {
        return Math.max(this.A00.BMH(r3, r4), this.A01.BMH(r3, r4));
    }

    public final int BoT(C268024cd r3, AnonymousClass5Q8 r4) {
        return Math.max(this.A00.BoT(r3, r4), this.A01.BoT(r3, r4));
    }

    public final int C8K(C268024cd r3) {
        return Math.max(this.A00.C8K(r3), this.A01.C8K(r3));
    }

    public final int hashCode() {
        return this.A00.hashCode() + AnonymousClass7TE.A0K(this.A01);
    }

    public IF0(WindowInsets windowInsets, WindowInsets windowInsets2) {
        this.A00 = windowInsets;
        this.A01 = windowInsets2;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append('(');
        A1A.append(this.A00);
        A1A.append(" ∪ ");
        return AnonymousClass7TG.A0n(this.A01, A1A);
    }
}
