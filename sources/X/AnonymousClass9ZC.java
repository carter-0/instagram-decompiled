package X;

import android.graphics.RectF;

/* renamed from: X.9ZC  reason: invalid class name */
public final class AnonymousClass9ZC extends C21289XSu {
    public final float A00;
    public final RectF A01;

    public AnonymousClass9ZC(RectF rectF, float f) {
        0qQ.A0B(rectF, 1);
        this.A01 = rectF;
        this.A00 = f;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass9ZC) {
                AnonymousClass9ZC r5 = (AnonymousClass9ZC) obj;
                if (!0qQ.A0K(this.A01, r5.A01) || Float.compare(this.A00, r5.A00) != 0) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0K(this.A01) + Float.floatToIntBits(this.A00);
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("BoundingBox(box=");
        A1A.append(this.A01);
        A1A.append(", score=");
        A1A.append(this.A00);
        return AnonymousClass7TG.A0p(A1A);
    }
}
