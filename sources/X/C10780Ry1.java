package X;

import android.opengl.Matrix;
import com.instagram.android.R;

/* renamed from: X.Ry1  reason: case insensitive filesystem */
public final class C10780Ry1 {
    public C361248fu A00;
    public final C345997uQ A01 = S9W.A00();
    public final C345557ti A02;
    public final float[] A03;
    public final float[] A04;
    public final float[] A05;

    public C10780Ry1(C345557ti r5) {
        float[] fArr = new float[16];
        this.A03 = fArr;
        float[] fArr2 = new float[16];
        this.A05 = fArr2;
        float[] fArr3 = new float[16];
        this.A04 = fArr3;
        this.A02 = r5;
        Matrix.setIdentityM(fArr, 0);
        Matrix.setIdentityM(fArr2, 0);
        Matrix.setIdentityM(fArr3, 0);
        this.A00 = this.A02.A01(R.raw.video_transcode_vs, R.raw.video_transcode_fs_rgba);
    }
}
