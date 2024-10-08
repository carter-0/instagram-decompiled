package X;

import android.opengl.GLES20;
import android.opengl.Matrix;
import android.util.Log;
import java.nio.FloatBuffer;

public final class W1I {
    public static final float[] A01;
    public static final FloatBuffer A02;
    public static final FloatBuffer A03;
    public static final float[] A04;
    public static final float[] A05;
    public C17613Vb5 A00 = new C17613Vb5();

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x00c1, code lost:
        if (r1 > r8) goto L_0x00c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x00c3, code lost:
        r4 = r1 / r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0024, code lost:
        if (r1 > r8) goto L_0x0026;
     */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0029  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02(float[] r21, int r22, int r23, int r24, int r25, int r26, int r27, boolean r28) {
        /*
            r20 = this;
            r12 = 0
            r9 = r20
            X.Vb5 r0 = r9.A00
            if (r0 == 0) goto L_0x00dd
            r3 = r25
            r2 = r26
            android.opengl.GLES20.glViewport(r12, r12, r3, r2)
            r0 = r23
            float r1 = (float) r0
            r0 = r24
            float r0 = (float) r0
            float r1 = r1 / r0
            float r6 = (float) r3
            float r5 = (float) r2
            float r8 = r6 / r5
            r7 = 1
            r4 = 1065353216(0x3f800000, float:1.0)
            r0 = r27
            if (r27 == 0) goto L_0x00bf
            if (r0 != r7) goto L_0x00c5
            int r0 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r0 <= 0) goto L_0x00c3
        L_0x0026:
            float r8 = r8 / r1
        L_0x0027:
            if (r28 == 0) goto L_0x002a
            float r4 = -r4
        L_0x002a:
            float[] r3 = A04
            float r2 = -r4
            r3[r12] = r2
            float r1 = -r8
            r3[r7] = r1
            r0 = 2
            r3[r0] = r4
            r0 = 3
            r3[r0] = r1
            X.C13990Tnq.A1Y(r3, r2, r8, r4)
            java.nio.FloatBuffer r14 = A02
            r14.put(r3)
            r14.position(r12)
            X.Vb5 r4 = r9.A00
            float[] r1 = A01
            java.nio.FloatBuffer r19 = A03
            r7 = 0
            r3 = 4
            r10 = 2
            r13 = 8
            java.lang.String r0 = "draw start"
            A01(r0)
            int r0 = r4.A00
            android.opengl.GLES20.glUseProgram(r0)
            java.lang.String r0 = "glUseProgram"
            A01(r0)
            r0 = 33984(0x84c0, float:4.7622E-41)
            android.opengl.GLES20.glActiveTexture(r0)
            r2 = 36197(0x8d65, float:5.0723E-41)
            r0 = r22
            android.opengl.GLES20.glBindTexture(r2, r0)
            int r0 = r4.A04
            r8 = 1
            android.opengl.GLES20.glUniformMatrix4fv(r0, r8, r12, r1, r12)
            java.lang.String r1 = "glUniformMatrix4fv"
            A01(r1)
            int r0 = r4.A05
            r9 = r21
            android.opengl.GLES20.glUniformMatrix4fv(r0, r8, r12, r9, r12)
            A01(r1)
            int r0 = r4.A06
            android.opengl.GLES20.glUniform2f(r0, r6, r5)
            java.lang.String r0 = "glUniform2f"
            A01(r0)
            int r0 = r4.A03
            android.opengl.GLES20.glUniform1f(r0, r7)
            java.lang.String r0 = "glUniform1f"
            A01(r0)
            int r9 = r4.A01
            android.opengl.GLES20.glEnableVertexAttribArray(r9)
            java.lang.String r1 = "glEnableVertexAttribArray"
            A01(r1)
            r11 = 5126(0x1406, float:7.183E-42)
            android.opengl.GLES20.glVertexAttribPointer(r9, r10, r11, r12, r13, r14)
            java.lang.String r0 = "glVertexAttribPointer"
            A01(r0)
            int r14 = r4.A02
            android.opengl.GLES20.glEnableVertexAttribArray(r14)
            A01(r1)
            r15 = r10
            r16 = r11
            r17 = r12
            r18 = r13
            android.opengl.GLES20.glVertexAttribPointer(r14, r15, r16, r17, r18, r19)
            A01(r0)
            r0 = 5
            goto L_0x00c9
        L_0x00bf:
            int r0 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r0 <= 0) goto L_0x0026
        L_0x00c3:
            float r1 = r1 / r8
            r4 = r1
        L_0x00c5:
            r8 = 1065353216(0x3f800000, float:1.0)
            goto L_0x0027
        L_0x00c9:
            android.opengl.GLES20.glDrawArrays(r0, r12, r3)     // Catch:{ RuntimeException -> 0x00d1 }
            java.lang.String r0 = "glDrawArrays"
            A01(r0)     // Catch:{ RuntimeException -> 0x00d1 }
        L_0x00d1:
            android.opengl.GLES20.glDisableVertexAttribArray(r9)
            android.opengl.GLES20.glDisableVertexAttribArray(r14)
            android.opengl.GLES20.glBindTexture(r2, r12)
            android.opengl.GLES20.glUseProgram(r12)
        L_0x00dd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.W1I.A02(float[], int, int, int, int, int, int, boolean):void");
    }

    static {
        float[] fArr = {-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f};
        A04 = fArr;
        float[] fArr2 = {0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f};
        A05 = fArr2;
        float[] fArr3 = new float[16];
        A01 = fArr3;
        Matrix.setIdentityM(fArr3, 0);
        FloatBuffer A0e = C13990Tnq.A0e(fArr, 32);
        A0e.position(0);
        A02 = A0e;
        FloatBuffer A0e2 = C13990Tnq.A0e(fArr2, 32);
        A0e2.position(0);
        A03 = A0e2;
    }

    public static void A00(int i, String str) {
        if (i < 0) {
            throw C13989Tnp.A0l("Unable to locate '", str);
        }
    }

    public static void A01(String str) {
        int glGetError = GLES20.glGetError();
        if (glGetError != 0) {
            String A0g = 002.A0g(str, ": glError 0x", Integer.toHexString(glGetError));
            Log.e("CopyRenderer", A0g);
            throw new RuntimeException(A0g);
        }
    }
}
