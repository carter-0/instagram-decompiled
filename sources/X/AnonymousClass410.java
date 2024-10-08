package X;

import com.facebook.odin.model.Matrix;
import java.util.List;

/* renamed from: X.410  reason: invalid class name */
public final class AnonymousClass410 extends AnonymousClass0T0 implements AnonymousClass411 {
    public final Matrix A00;
    public final Matrix A01;
    public final List A02;
    public final float[] A03;
    public final float[] A04;
    public final float[] A05;
    public final int[] A06;
    public final Matrix[] A07;
    public final float[][] A08;

    public AnonymousClass410(Matrix matrix, Matrix matrix2, List list, float[] fArr, float[] fArr2, float[] fArr3, int[] iArr, Matrix[] matrixArr, float[][] fArr4) {
        0qQ.A0B(iArr, 2);
        0qQ.A0B(fArr, 3);
        0qQ.A0B(fArr3, 6);
        0qQ.A0B(matrixArr, 7);
        0qQ.A0B(fArr4, 8);
        0qQ.A0B(matrix, 9);
        0qQ.A0B(matrix2, 10);
        this.A02 = list;
        this.A06 = iArr;
        this.A03 = fArr;
        this.A04 = fArr2;
        this.A05 = fArr3;
        this.A07 = matrixArr;
        this.A08 = fArr4;
        this.A00 = matrix;
        this.A01 = matrix2;
    }

    public final String BWX() {
        return "range";
    }

    public final float[] CDF(int i) {
        return new float[0];
    }

    public final float[] AfW(int i) {
        return this.A00.A00[i - 1];
    }

    public final float[] AfX(int i) {
        return this.A01.A00[i - 1];
    }

    public final float[] Afk(int i) {
        return this.A08[i - 1];
    }

    public final List BTc() {
        return 0sn.A00;
    }

    public final int[] BVv() {
        return this.A06;
    }

    public final List BeY() {
        return this.A02;
    }

    public final Matrix CGO(int i) {
        return this.A07[i - 1];
    }

    public final float[] BPc(int i) {
        return this.A03;
    }

    public final float[] CDE(int i) {
        return this.A05;
    }
}
