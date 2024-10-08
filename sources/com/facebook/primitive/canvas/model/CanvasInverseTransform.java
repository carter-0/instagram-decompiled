package com.facebook.primitive.canvas.model;

import X.0qQ;
import X.2SK;
import X.C59540JNm;
import android.graphics.Matrix;

public final class CanvasInverseTransform implements C59540JNm {
    public static final CanvasInverseTransform A00 = new Object();

    public final void AC6(Matrix matrix) {
        0qQ.A0B(matrix, 0);
        if (!matrix.invert(matrix)) {
            2SK.A02("com.facebook.primitive.canvas.model.CanvasInverseTransform", "The matrix supplied cannot be inverted");
        }
    }
}
