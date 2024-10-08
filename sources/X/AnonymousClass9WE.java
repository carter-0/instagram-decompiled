package X;

import com.facebook.common.math.matrix.Matrix4;

/* renamed from: X.9WE  reason: invalid class name */
public final class AnonymousClass9WE implements B3M {
    public Matrix4 A00;
    public final /* synthetic */ Matrix4 A01;
    public final /* synthetic */ AnonymousClass9WC A02;

    public AnonymousClass9WE(Matrix4 matrix4, AnonymousClass9WC r2) {
        this.A02 = r2;
        this.A01 = matrix4;
    }

    public final float[] C5o() {
        Matrix4 matrix4 = this.A00;
        if (matrix4 == null) {
            matrix4 = new Matrix4();
            this.A00 = matrix4;
        }
        return matrix4.A01;
    }

    public final float[] CDl() {
        return this.A01.A01;
    }
}
