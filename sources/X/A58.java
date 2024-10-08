package X;

import com.facebook.common.math.matrix.Matrix4;

public final class A58 {
    public final Matrix4 A00;
    public final B2Z A01;

    public A58(Integer num, int i, int i2) {
        B2Z aaR;
        if (num.intValue() != 1) {
            aaR = new C40331AaQ(i, i2);
        } else {
            aaR = new C40332AaR(0.5f);
        }
        B2Z b2z = aaR;
        this.A01 = b2z;
        float BpX = b2z.BpX();
        float BpY = b2z.BpY();
        float C9d = (1.0f - BpY) - (b2z.C9d() * 2.0f);
        Matrix4 matrix4 = new Matrix4();
        matrix4.A02(BpX, BpY);
        Matrix4 matrix42 = new Matrix4();
        Matrix4 matrix43 = new Matrix4();
        matrix43.A03(-1.0f + BpX + (0.0f * 2.0f), C9d, 0.0f);
        matrix42.A05(matrix4.A01);
        matrix43.A05(matrix42.A01);
        this.A00 = matrix43;
    }
}
