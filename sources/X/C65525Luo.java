package X;

import java.util.Arrays;

/* renamed from: X.Luo  reason: case insensitive filesystem */
public final class C65525Luo implements AnonymousClass2sT {
    public C270184gK A00;
    public C309616Yy A01;

    public final void DaJ(AnonymousClass3Q2 r3) {
        this.A01.DaI(this.A00);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return 2Ob.A00(this.A01, ((C65525Luo) obj).A01);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A01});
    }
}
