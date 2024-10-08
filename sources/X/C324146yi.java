package X;

import android.graphics.RectF;
import java.util.Arrays;

/* renamed from: X.6yi  reason: invalid class name and case insensitive filesystem */
public final class C324146yi implements C297935sb {
    public final float A00;
    public final C297935sb A01;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C324146yi)) {
            return false;
        }
        C324146yi r4 = (C324146yi) obj;
        return this.A01.equals(r4.A01) && this.A00 == r4.A00;
    }

    public final float ArV(RectF rectF) {
        return Math.max(0.0f, this.A01.ArV(rectF) + this.A00);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A01, Float.valueOf(this.A00)});
    }

    public C324146yi(C297935sb r3, float f) {
        if (r3 instanceof C324146yi) {
            throw new NullPointerException("adjustment");
        }
        this.A01 = r3;
        this.A00 = f;
    }
}
