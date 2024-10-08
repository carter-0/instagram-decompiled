package X;

import android.graphics.PointF;

/* renamed from: X.GyA  reason: case insensitive filesystem */
public final class C54025GyA extends HPB {
    public final C54026GyB A00;
    public final C54026GyB A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C54025GyA) {
                C54025GyA gyA = (C54025GyA) obj;
                if (!0qQ.A0K(this.A00, gyA.A00) || !0qQ.A0K(this.A01, gyA.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final PointF A00(float f) {
        float f2;
        C54026GyB gyB = this.A00;
        float f3 = 0.0f;
        if (gyB != null) {
            f2 = gyB.A00(f);
        } else {
            f2 = 0.0f;
        }
        C54026GyB gyB2 = this.A01;
        if (gyB2 != null) {
            f3 = gyB2.A00(f);
        }
        return new PointF(f2, f3);
    }

    public final int hashCode() {
        return (AnonymousClass7TG.A0C(this.A00) * 31) + AnonymousClass7TE.A0L(this.A01);
    }

    public C54025GyA(C54026GyB gyB, C54026GyB gyB2) {
        this.A00 = gyB;
        this.A01 = gyB2;
    }
}
