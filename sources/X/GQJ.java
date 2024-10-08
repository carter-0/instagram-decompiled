package X;

import java.util.List;

public final class GQJ {
    public final float A00;
    public final int A01;
    public final long A02;
    public final long A03;
    public final long A04;
    public final long A05;
    public final long A06;
    public final long A07;
    public final List A08;
    public final boolean A09;
    public final boolean A0A;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof GQJ) {
                GQJ gqj = (GQJ) obj;
                if (!(this.A02 == gqj.A02 && this.A07 == gqj.A07 && this.A05 == gqj.A05 && this.A04 == gqj.A04 && this.A0A == gqj.A0A && Float.compare(this.A00, gqj.A00) == 0 && this.A01 == gqj.A01 && this.A09 == gqj.A09 && 0qQ.A0K(this.A08, gqj.A08) && this.A06 == gqj.A06 && this.A03 == gqj.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A012 = AnonymousClass7TF.A01(this.A04, AnonymousClass7TF.A01(this.A05, AnonymousClass7TF.A01(this.A07, C51967G9n.A02(this.A02))));
        int A013 = AnonymousClass7TF.A01(this.A06, AnonymousClass7TF.A07(this.A08, AnonymousClass7TF.A09(this.A09, (AnonymousClass7TF.A00(AnonymousClass7TF.A09(this.A0A, A012), this.A00) + this.A01) * 31)));
        long j = this.A03;
        return A013 + ((int) (j ^ (j >>> 32)));
    }

    public GQJ(List list, float f, int i, long j, long j2, long j3, long j4, long j5, long j6, boolean z, boolean z2) {
        this.A02 = j;
        this.A07 = j2;
        this.A05 = j3;
        this.A04 = j4;
        this.A0A = z;
        this.A00 = f;
        this.A01 = i;
        this.A09 = z2;
        this.A08 = list;
        this.A06 = j5;
        this.A03 = j6;
    }

    public final String toString() {
        String str;
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("PointerInputEventData(id=");
        A1A.append(002.A0K("PointerId(value=", ')', this.A02));
        A1A.append(", uptime=");
        A1A.append(this.A07);
        A1A.append(", positionOnScreen=");
        G9w.A0z(this.A05, A1A);
        A1A.append(", position=");
        G9w.A0z(this.A04, A1A);
        A1A.append(", down=");
        A1A.append(this.A0A);
        A1A.append(", pressure=");
        A1A.append(this.A00);
        A1A.append(", type=");
        int i = this.A01;
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
        A1A.append(", activeHover=");
        A1A.append(this.A09);
        A1A.append(", historical=");
        A1A.append(this.A08);
        A1A.append(", scrollDelta=");
        G9w.A0z(this.A06, A1A);
        A1A.append(", originalEventPosition=");
        G9w.A0z(this.A03, A1A);
        return C51967G9n.A0r(A1A, ')');
    }
}
