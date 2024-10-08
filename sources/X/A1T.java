package X;

import android.text.Layout;

public abstract class A1T {
    public static final float[][] A00(Layout layout) {
        0qQ.A0B(layout, 0);
        int lineCount = layout.getLineCount();
        float[][] fArr = new float[lineCount][];
        for (int i = 0; i < lineCount; i++) {
            fArr[i] = new float[]{layout.getLineLeft(i), (float) layout.getLineBaseline(i)};
        }
        return fArr;
    }
}
