package X;

import android.content.Context;
import android.util.AttributeSet;

/* renamed from: X.5zs  reason: invalid class name and case insensitive filesystem */
public final class C301735zs implements C301745zt {
    public float[] A00;
    public int[] A01;
    public final Context A02;

    public final float BhW(long j) {
        return ((((float) j) / 8000.0f) * 360.0f) % 360.0f;
    }

    public final float BhX(float f, long j) {
        return f;
    }

    public final float CEI() {
        return 1.525f;
    }

    public final boolean CPz() {
        return false;
    }

    public final int[] BhU(int i) {
        if (this.A01 == null) {
            int[] iArr = new int[5];
            this.A01 = iArr;
            C267014am.A03(this.A02, (AttributeSet) null, iArr, i);
        }
        return this.A01;
    }

    public final float[] BhV() {
        float[] fArr = this.A00;
        if (fArr != null) {
            return fArr;
        }
        float[] fArr2 = {0.0f, 0.27f, 0.51f, 0.75f, 1.0f};
        this.A00 = fArr2;
        return fArr2;
    }

    public C301735zs(Context context) {
        this.A02 = context;
    }
}
