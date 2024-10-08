package X;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.view.View;

/* renamed from: X.Vqw  reason: case insensitive filesystem */
public abstract class C18396Vqw {
    public static final Matrix A00 = new Matrix();
    public static final float[] A01 = new float[2];

    public static PointF A00(PointF pointF, View view) {
        float[] fArr = A01;
        fArr[0] = pointF.x - ((float) view.getLeft());
        fArr[1] = pointF.y - ((float) view.getTop());
        Matrix matrix = view.getMatrix();
        Matrix matrix2 = A00;
        matrix.invert(matrix2);
        matrix2.mapPoints(fArr);
        matrix2.reset();
        return new PointF(fArr[0], fArr[1]);
    }
}
