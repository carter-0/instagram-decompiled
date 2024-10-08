package X;

import android.content.Context;

public abstract class HX4 {
    public static final C321076tX A00(Context context, C337197fs r7, int i) {
        float A04 = 0nA.A04(context, i);
        float f = ((float) r7.A01) / ((float) r7.A00);
        C321076tX A01 = C321066tW.A01(context, 0.4f, f, -1);
        C321076tX A00 = C321066tW.A00(f, (int) (f * A04), (int) A04, -1);
        if (((float) A01.A00) > A04 || A00.A02 > A01.A02) {
            return A00;
        }
        return A01;
    }
}
