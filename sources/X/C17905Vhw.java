package X;

import android.opengl.GLES20;

/* renamed from: X.Vhw  reason: case insensitive filesystem */
public final class C17905Vhw {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;

    public final void A00(float[] fArr, float[] fArr2, float f, float f2, float f3, int i, boolean z) {
        int i2 = this.A00;
        GLES20.glActiveTexture(33984 + i2);
        GLES20.glBindTexture(36197, i);
        GLES20.glUniform1i(this.A03, i2);
        GLES20.glUniformMatrix4fv(this.A06, 1, false, fArr, 0);
        W1E.A01("glUniformMatrix4fv");
        GLES20.glUniformMatrix4fv(this.A01, 1, false, fArr2, 0);
        W1E.A01("glUniformMatrix4fv");
        GLES20.glUniform2f(this.A05, f, f2);
        W1E.A01("glUniform2f");
        GLES20.glUniform1f(this.A02, f3);
        W1E.A01("glUniform1f");
        GLES20.glUniform1f(this.A04, C51971G9r.A00(z ? 1 : 0));
        W1E.A01("glUniform1f");
    }

    public C17905Vhw(int i, int i2) {
        this.A00 = i;
        this.A03 = GLES20.glGetUniformLocation(i2, 002.A0O("uTexture", i));
        int glGetUniformLocation = GLES20.glGetUniformLocation(i2, 002.A0O("uTextureTransformMatrix", i));
        this.A06 = glGetUniformLocation;
        this.A01 = GLES20.glGetUniformLocation(i2, 002.A0O("uContentTransformMatrix", i));
        W1E.A00(glGetUniformLocation, 002.A0O("uTextureTransformMatrix", i));
        int glGetUniformLocation2 = GLES20.glGetUniformLocation(i2, 002.A0O("uTextureSize", i));
        this.A05 = glGetUniformLocation2;
        W1E.A00(glGetUniformLocation2, 002.A0O("uTextureSize", i));
        int glGetUniformLocation3 = GLES20.glGetUniformLocation(i2, 002.A0O("uCornerRadius", i));
        this.A02 = glGetUniformLocation3;
        W1E.A00(glGetUniformLocation3, 002.A0O("uCornerRadius", i));
        int glGetUniformLocation4 = GLES20.glGetUniformLocation(i2, 002.A0O("uTextureEnabled", i));
        this.A04 = glGetUniformLocation4;
        W1E.A00(glGetUniformLocation4, 002.A0O("uTextureEnabled", i));
    }
}
