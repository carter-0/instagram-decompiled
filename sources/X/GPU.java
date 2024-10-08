package X;

import java.util.List;

public final class GPU {
    public long A00 = 0;
    public C55582Hk2 A01;
    public List A02;
    public final float A03;
    public final int A04;
    public final long A05;
    public final long A06;
    public final long A07;
    public final long A08;
    public final long A09;
    public final long A0A;
    public final boolean A0B;
    public final boolean A0C;

    public static void A00(GPU gpu, 0sP r3) {
        r3.invoke(new C289295dM(gpu.A06));
    }

    public final void A01() {
        C55582Hk2 hk2 = this.A01;
        hk2.A00 = true;
        hk2.A01 = true;
    }

    public final boolean A02() {
        C55582Hk2 hk2 = this.A01;
        if (hk2.A00 || hk2.A01) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [X.Hk2, java.lang.Object] */
    public GPU(float f, int i, long j, long j2, long j3, long j4, long j5, long j6, boolean z, boolean z2, boolean z3) {
        this.A05 = j;
        this.A0A = j2;
        this.A06 = j3;
        this.A0B = z;
        this.A03 = f;
        this.A08 = j4;
        this.A07 = j5;
        this.A0C = z2;
        this.A04 = i;
        this.A09 = j6;
        ? obj = new Object();
        boolean z4 = z3;
        obj.A01 = z4;
        obj.A00 = z4;
        this.A01 = obj;
    }

    public final String toString() {
        String str;
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("PointerInputChange(id=");
        A1A.append(002.A0K("PointerId(value=", ')', this.A05));
        A1A.append(Pxd.A00(335));
        A1A.append(this.A0A);
        A1A.append(", position=");
        G9w.A0z(this.A06, A1A);
        A1A.append(", pressed=");
        A1A.append(this.A0B);
        A1A.append(", pressure=");
        A1A.append(this.A03);
        A1A.append(", previousUptimeMillis=");
        A1A.append(this.A08);
        A1A.append(", previousPosition=");
        G9w.A0z(this.A07, A1A);
        A1A.append(", previousPressed=");
        A1A.append(this.A0C);
        A1A.append(", isConsumed=");
        A1A.append(A02());
        A1A.append(", type=");
        int i = this.A04;
        if (i == 1) {
            str = "Touch";
        } else if (i == 2) {
            str = "Mouse";
        } else if (i == 3) {
            str = "Stylus";
        } else if (i != 4) {
            str = "Unknown";
        } else {
            str = "Eraser";
        }
        A1A.append(str);
        A1A.append(", historical=");
        0sn r0 = this.A02;
        if (r0 == null) {
            r0 = 0sn.A00;
        }
        A1A.append(r0);
        A1A.append(",scrollDelta=");
        G9w.A0z(this.A09, A1A);
        return C51967G9n.A0r(A1A, ')');
    }
}
