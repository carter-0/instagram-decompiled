package X;

import android.content.Context;

/* renamed from: X.TvF  reason: case insensitive filesystem */
public final class C14386TvF extends C15812Uiv {
    public int A00 = -1;
    public final C14411Tvf A01;

    public final int CEi(Context context) {
        int i;
        if (this.A00 == -1) {
            this.A00 = 0nA.A08(context);
        }
        int A09 = 0nA.A09(context);
        float intBitsToFloat = Float.intBitsToFloat(C13989Tnp.A0B(context));
        float f = ((((float) A09) - (2.0f * intBitsToFloat)) / 3.0f) + intBitsToFloat;
        C14411Tvf tvf = this.A01;
        if (tvf == C14411Tvf.MEMORY_GRID_MEDIA_GRID) {
            i = (int) f;
        } else {
            if (tvf == C14411Tvf.MEMORY_GRID_ONE_BY_TWO_LEFT || tvf == C14411Tvf.MEMORY_GRID_ONE_BY_TWO_RIGHT || tvf == C14411Tvf.MEMORY_GRID_ONE_BY_TWO_ROW || tvf == C14411Tvf.MEMORY_GRID_ONE_BY_TWO_LEFT_RIGHT || tvf == C14411Tvf.MEMORY_GRID_TWO_BY_TWO_RIGHT || tvf == C14411Tvf.MEMORY_GRID_TWO_BY_TWO_LEFT) {
                i = ((int) f) * 2;
            }
            return this.A00;
        }
        this.A00 = i;
        return this.A00;
    }

    public C14386TvF(C14411Tvf tvf) {
        this.A01 = tvf;
    }
}
