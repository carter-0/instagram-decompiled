package X;

import android.graphics.Matrix;
import android.view.View;

public final class UFA extends UFB {
    public final float A00(View view) {
        return view.getTransitionAlpha();
    }

    public final void A01(Matrix matrix, View view) {
        view.transformMatrixToGlobal(matrix);
    }

    public final void A02(Matrix matrix, View view) {
        view.transformMatrixToLocal(matrix);
    }

    public final void A03(View view, float f) {
        view.setTransitionAlpha(f);
    }

    public final void A04(View view, int i) {
        view.setTransitionVisibility(i);
    }

    public final void A05(View view, int i, int i2, int i3, int i4) {
        view.setLeftTopRightBottom(i, i2, i3, i4);
    }
}
