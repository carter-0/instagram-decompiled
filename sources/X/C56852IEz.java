package X;

import androidx.compose.foundation.layout.WindowInsets;

/* renamed from: X.IEz  reason: case insensitive filesystem */
public final class C56852IEz implements WindowInsets {
    public final WindowInsets A00;
    public final WindowInsets A01;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C56852IEz)) {
            return false;
        }
        C56852IEz iEz = (C56852IEz) obj;
        return 0qQ.A0K(iEz.A01, this.A01) && 0qQ.A0K(iEz.A00, this.A00);
    }

    public final int AhD(C268024cd r3) {
        int AhD = this.A01.AhD(r3) - this.A00.AhD(r3);
        return C51970G9q.A07(AhD, AhD);
    }

    public final int BMH(C268024cd r3, AnonymousClass5Q8 r4) {
        int BMH = this.A01.BMH(r3, r4) - this.A00.BMH(r3, r4);
        return C51970G9q.A07(BMH, BMH);
    }

    public final int BoT(C268024cd r3, AnonymousClass5Q8 r4) {
        int BoT = this.A01.BoT(r3, r4) - this.A00.BoT(r3, r4);
        return C51970G9q.A07(BoT, BoT);
    }

    public final int C8K(C268024cd r3) {
        int C8K = this.A01.C8K(r3) - this.A00.C8K(r3);
        return C51970G9q.A07(C8K, C8K);
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A00, AnonymousClass7TE.A0K(this.A01));
    }

    public C56852IEz(WindowInsets windowInsets, WindowInsets windowInsets2) {
        this.A01 = windowInsets;
        this.A00 = windowInsets2;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append('(');
        A1A.append(this.A01);
        A1A.append(" - ");
        return AnonymousClass7TG.A0n(this.A00, A1A);
    }
}
