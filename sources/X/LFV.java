package X;

import android.graphics.PathEffect;
import java.util.Arrays;

public final class LFV {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public PathEffect A08;
    public float[] A09;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (0qQ.A0K(getClass(), JTR.A0v(obj))) {
                0qQ.A0C(obj, "null cannot be cast to non-null type com.facebook.litho.drawable.BorderColorDrawable.State");
                LFV lfv = (LFV) obj;
                if (!(this.A01 == lfv.A01 && this.A03 == lfv.A03 && this.A02 == lfv.A02 && this.A00 == lfv.A00 && this.A05 == lfv.A05 && this.A07 == lfv.A07 && this.A06 == lfv.A06 && this.A04 == lfv.A04 && 0qQ.A0K(this.A08, lfv.A08) && !Arrays.equals(this.A09, lfv.A09))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        int A0E = ((((((((((((((((((int) this.A01) * 31) + ((int) this.A03)) * 31) + ((int) this.A02)) * 31) + ((int) this.A00)) * 31) + this.A05) * 31) + this.A07) * 31) + this.A06) * 31) + this.A04) * 31) + C51971G9r.A0E(this.A08)) * 31;
        float[] fArr = this.A09;
        if (fArr != null) {
            i = Arrays.hashCode(fArr);
        }
        return A0E + i;
    }
}
