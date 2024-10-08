package X;

import android.graphics.RectF;
import java.util.Arrays;

/* renamed from: X.5sa  reason: invalid class name and case insensitive filesystem */
public final class C297925sa implements C297935sb {
    public final float A00;

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C297925sa) && this.A00 == ((C297925sa) obj).A00;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.A00)});
    }

    public C297925sa(float f) {
        this.A00 = f;
    }

    public final float ArV(RectF rectF) {
        return this.A00;
    }
}
