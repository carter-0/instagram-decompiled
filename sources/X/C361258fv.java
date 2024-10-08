package X;

import android.opengl.GLES20;
import java.nio.FloatBuffer;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* renamed from: X.8fv  reason: invalid class name and case insensitive filesystem */
public final class C361258fv {
    public final /* synthetic */ C361248fu A00;

    public C361258fv(C361248fu r1) {
        this.A00 = r1;
    }

    public static int A00(C361258fv r2, String str) {
        C361248fu r1 = r2.A00;
        Map map = r1.A04;
        if (map.containsKey(str)) {
            return ((Number) map.get(str)).intValue();
        }
        int glGetUniformLocation = GLES20.glGetUniformLocation(r1.A00, str);
        if (glGetUniformLocation != -1) {
            map.put(str, Integer.valueOf(glGetUniformLocation));
            return glGetUniformLocation;
        }
        throw new IllegalStateException(String.format((Locale) null, "Uniform location not found: %s", new Object[]{str}));
    }

    public final void A01(C345997uQ r15) {
        int glGetAttribLocation;
        C361248fu r5 = this.A00;
        Map map = r15.A03;
        List list = r15.A02;
        for (int i = 0; i < list.size(); i++) {
            String str = (String) list.get(i);
            Map map2 = r5.A05;
            if (map2.containsKey(str)) {
                glGetAttribLocation = ((Number) map2.get(str)).intValue();
            } else {
                glGetAttribLocation = GLES20.glGetAttribLocation(r5.A00, str);
                if (glGetAttribLocation != -1) {
                    map2.put(str, Integer.valueOf(glGetAttribLocation));
                } else {
                    throw new IllegalStateException(String.format((Locale) null, "Vertex attribute location not found: %s", new Object[]{str}));
                }
            }
            if (glGetAttribLocation != -1) {
                C345987uP r7 = (C345987uP) map.get(str);
                FloatBuffer floatBuffer = r7.A01;
                int position = floatBuffer.position();
                GLES20.glBindBuffer(34962, 0);
                GLES20.glVertexAttribPointer(glGetAttribLocation, r7.A00, 5126, false, 0, floatBuffer.position(position));
                GLES20.glEnableVertexAttribArray(glGetAttribLocation);
                floatBuffer.position(position);
            }
        }
        GLES20.glDrawArrays(5, 0, 4);
    }

    public final void A03(String str, C346337v0 r16) {
        int size;
        Map map = this.A00.A03;
        if (map.containsKey(str)) {
            size = ((Number) map.get(str)).intValue();
        } else {
            size = map.size();
            map.put(str, Integer.valueOf(size));
        }
        C346337v0 r0 = r16;
        int i = r0.A01;
        int i2 = r0.A00;
        C345907uH.A02(002.A0p("gl.Program::setTexture::before: textureUnit: ", " textureTarget: ", " textureHandle: ", size, i, i2), new Object[0]);
        int A002 = A00(this, str);
        GLES20.glActiveTexture(33984 + size);
        GLES20.glBindTexture(i, i2);
        GLES20.glUniform1i(A002, size);
        C345907uH.A02(002.A0p("gl.Program::setTexture::after: textureUnit: ", " textureTarget: ", " textureHandle: ", size, i, i2), new Object[0]);
    }

    public final void A02(String str, float f) {
        GLES20.glUniform1f(A00(this, str), f);
    }

    public final void A04(String str, float[] fArr) {
        GLES20.glUniformMatrix4fv(A00(this, str), 1, false, fArr, 0);
    }
}
