package X;

import android.graphics.RectF;
import java.util.Arrays;

/* renamed from: X.6yh  reason: invalid class name and case insensitive filesystem */
public final class C324136yh implements C297935sb {
    public final float A00;

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C324136yh) && this.A00 == ((C324136yh) obj).A00;
        }
        return true;
    }

    public final float ArV(RectF rectF) {
        return this.A00 * rectF.height();
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.A00)});
    }

    public C324136yh(float f) {
        this.A00 = f;
    }
}
