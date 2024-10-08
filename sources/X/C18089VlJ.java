package X;

import android.graphics.Matrix;
import android.view.View;

/* renamed from: X.VlJ  reason: case insensitive filesystem */
public abstract class C18089VlJ {
    public static void A00(Matrix matrix, View view) {
        view.transformMatrixToGlobal(matrix);
    }

    public static void A01(Matrix matrix, View view) {
        view.transformMatrixToLocal(matrix);
    }
}
