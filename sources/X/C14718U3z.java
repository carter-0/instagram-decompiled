package X;

import android.graphics.Matrix;
import android.view.animation.ScaleAnimation;
import android.view.animation.Transformation;

/* renamed from: X.U3z  reason: case insensitive filesystem */
public final class C14718U3z extends ScaleAnimation {
    public final C17220VMy A00;
    public final float[] A01 = new float[9];

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14718U3z(C17220VMy vMy, float f, float f2, float f3, float f4, float f5, float f6) {
        super(f, f2, f3, f4, f5, f6);
        0qQ.A0B(vMy, 7);
        this.A00 = vMy;
    }

    public final void applyTransformation(float f, Transformation transformation) {
        0qQ.A0B(transformation, 1);
        super.applyTransformation(f, transformation);
        Matrix matrix = transformation.getMatrix();
        float[] fArr = this.A01;
        matrix.getValues(fArr);
        C17220VMy vMy = this.A00;
        float f2 = fArr[0];
        float f3 = fArr[4];
        WVI wvi = vMy.A00;
        wvi.A00 = f2;
        wvi.A01 = f3;
    }
}
