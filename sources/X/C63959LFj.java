package X;

import java.util.Arrays;

/* renamed from: X.LFj  reason: case insensitive filesystem */
public final class C63959LFj {
    public final Integer A00;
    public final float[] A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C63959LFj) {
                C63959LFj lFj = (C63959LFj) obj;
                if (this.A00 != lFj.A00 || !0qQ.A0K(this.A01, lFj.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Integer num = this.A00;
        return (C51971G9r.A0D(num, C62960KpC.A00(num)) * 31) + Arrays.hashCode(this.A01);
    }

    public final String toString() {
        return 002.A0v("UploadEditInputPoint(type=", C62960KpC.A00(this.A00), AnonymousClass000.A00(2007), Arrays.toString(this.A01), ')');
    }

    public C63959LFj(Integer num, float[] fArr) {
        this.A00 = num;
        this.A01 = fArr;
    }
}
