package X;

import android.graphics.RectF;
import android.opengl.Matrix;
import java.util.ArrayList;
import java.util.HashMap;

public abstract class S9W {
    public static void A01(C11354SOn sOn, float[] fArr, float[] fArr2) {
        int i;
        int i2;
        float[] fArr3 = fArr;
        Matrix.setIdentityM(fArr, 0);
        Matrix.setIdentityM(fArr2, 0);
        0Sd.A00(sOn.A0E);
        RectF rectF = sOn.A0E;
        Matrix.translateM(fArr, 0, rectF.left, rectF.top, 0.0f);
        Matrix.scaleM(fArr, 0, sOn.A0E.width(), sOn.A0E.height(), 1.0f);
        if (sOn.A0O) {
            if (sOn.A07 % 180 != 0) {
                i = sOn.A06;
                i2 = sOn.A08;
            } else {
                i = sOn.A08;
                i2 = sOn.A06;
            }
            RectF rectF2 = sOn.A0E;
            float width = (((float) i) * rectF2.width()) / (((float) i2) * rectF2.height());
            if (sOn.A0B % 180 != 0) {
                width = 1.0f / width;
            }
            Matrix.scaleM(fArr2, 0, 1.0f, (((float) sOn.A0C) / width) / ((float) sOn.A0A), 1.0f);
        }
        Matrix.translateM(fArr, 0, 0.5f, 0.5f, 0.0f);
        if (sOn.A0H == AnonymousClass05K.A01) {
            Matrix.scaleM(fArr, 0, -1.0f, 1.0f, 1.0f);
        }
        Matrix.rotateM(fArr3, 0, (float) sOn.A0B, 0.0f, 0.0f, -1.0f);
        Matrix.translateM(fArr3, 0, -0.5f, -0.5f, 0.0f);
    }

    public static C345997uQ A00() {
        HashMap A1E = AnonymousClass7TE.A1E();
        ArrayList A1C = AnonymousClass7TE.A1C();
        A1E.put("aPosition", new C345987uP(new float[]{-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f}));
        A1C.add("aPosition");
        return Pxj.A0Q(A1E, A1C, new float[]{0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f});
    }
}
