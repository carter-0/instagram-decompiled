package X;

import android.opengl.Matrix;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: X.RyV  reason: case insensitive filesystem */
public final class C10809RyV {
    public C345997uQ A00;
    public C361248fu A01;
    public final C11354SOn A02;
    public final float[] A03;
    public final float[] A04;
    public final float[] A05;
    public final C345557ti A06;
    public final C345987uP A07;

    public C10809RyV(C345557ti r9, C11354SOn sOn) {
        C345987uP r6 = new C345987uP(new float[]{-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f});
        this.A07 = r6;
        float[] fArr = new float[16];
        this.A05 = fArr;
        float[] fArr2 = new float[16];
        this.A03 = fArr2;
        float[] fArr3 = new float[16];
        this.A04 = fArr3;
        this.A06 = r9;
        this.A02 = sOn;
        Matrix.setIdentityM(fArr, 0);
        Matrix.setIdentityM(fArr2, 0);
        Matrix.setIdentityM(fArr3, 0);
        HashMap A1E = AnonymousClass7TE.A1E();
        ArrayList A1C = AnonymousClass7TE.A1C();
        A1E.put("aPosition", r6);
        A1C.add("aPosition");
        this.A00 = Pxj.A0Q(A1E, A1C, new float[]{0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f});
        S9W.A01(sOn, fArr2, fArr3);
        this.A01 = r9.A03("attribute vec4 aPosition;\nattribute vec4 aTextureCoord;\n\nuniform mat4 uSTMatrix;\nuniform mat4 uConstMatrix;\nuniform mat4 uContentTransform;\n\nvarying vec2 vTextureCoord;\n\nvoid main() {\n  gl_Position = uContentTransform * aPosition;\n  vTextureCoord = (uSTMatrix * uConstMatrix * aTextureCoord).xy;\n}\n", "#extension GL_OES_EGL_image_external : require\nprecision mediump float; // highp here doesn't seem to matter\n\nuniform sampler2D sTexture;\n\nvarying vec2 vTextureCoord;\n\nvoid main() {\n  gl_FragColor = texture2D(sTexture, vTextureCoord).rgba;\n}", false);
    }
}
