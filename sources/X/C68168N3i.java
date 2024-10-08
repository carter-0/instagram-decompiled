package X;

import android.graphics.RectF;
import android.view.View;

/* renamed from: X.N3i  reason: case insensitive filesystem */
public final class C68168N3i extends AnonymousClass0T0 {
    public final float A00;
    public final RectF A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C68168N3i) {
                C68168N3i n3i = (C68168N3i) obj;
                if (!0qQ.A0K(this.A01, n3i.A01) || Float.compare(this.A00, n3i.A00) != 0) {
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

    public C68168N3i(RectF rectF, float f) {
        this.A01 = rectF;
        this.A00 = f;
    }

    public static C68168N3i A00(View view) {
        return new C68168N3i(0nA.A0F(view), view.getRotation());
    }
}
