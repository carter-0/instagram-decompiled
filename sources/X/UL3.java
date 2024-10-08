package X;

import android.graphics.PointF;

public final class UL3 extends AnonymousClass0T0 {
    public final C54026GyB A00;
    public final C54025GyA A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof UL3) {
                UL3 ul3 = (UL3) obj;
                if (!0qQ.A0K(this.A00, ul3.A00) || !0qQ.A0K(this.A01, ul3.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final boolean A00(UL3 ul3, float f) {
        Object obj;
        PointF pointF;
        PointF pointF2;
        C54026GyB gyB = this.A00;
        int i = 1;
        if (gyB != null) {
            obj = Float.valueOf(gyB.A00(f));
        } else {
            obj = 1;
        }
        C54026GyB gyB2 = ul3.A00;
        if (gyB2 != null) {
            i = Float.valueOf(gyB2.A00(f));
        }
        if (!0qQ.A0K(obj, i)) {
            return false;
        }
        C54025GyA gyA = this.A01;
        if (gyA != null) {
            pointF = gyA.A00(f);
        } else {
            pointF = new PointF();
        }
        C54025GyA gyA2 = ul3.A01;
        if (gyA2 != null) {
            pointF2 = gyA2.A00(f);
        } else {
            pointF2 = new PointF();
        }
        if (pointF.equals(pointF2)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (AnonymousClass7TG.A0C(this.A00) * 31) + AnonymousClass7TE.A0L(this.A01);
    }

    public UL3(C54026GyB gyB, C54025GyA gyA) {
        this.A00 = gyB;
        this.A01 = gyA;
    }
}
