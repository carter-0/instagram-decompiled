package X;

import android.graphics.RectF;
import android.opengl.GLES20;
import android.opengl.Matrix;
import com.instagram.android.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.Sr1  reason: case insensitive filesystem */
public final class C12300Sr1 implements C361868gx {
    public int A00;
    public C345557ti A01;
    public boolean A02;
    public C345997uQ A03;
    public final C12843T9z A04;
    public final Map A05;
    public final C345987uP A06;
    public final float[] A07;

    public final void DpU(int i, int i2) {
    }

    public final void DpZ(RectF rectF) {
    }

    public final void Dpb() {
        this.A01 = null;
        this.A05.clear();
    }

    public final void EOi(C13586TdE tdE) {
    }

    @Deprecated
    public final boolean EtX() {
        return false;
    }

    public final boolean isEnabled() {
        return false;
    }

    public final Integer BHb() {
        return AnonymousClass05K.A00;
    }

    public final boolean DAo(C368538so r7, long j) {
        String str;
        C345557ti r3;
        int i;
        int i2;
        GLES20.glClear(16640);
        C12843T9z t9z = this.A04;
        if (t9z.A01 != r7.A05()) {
            this.A05.clear();
            t9z.A01 = r7.A05();
        }
        GLES20.glDisable(3042);
        GLES20.glDisable(2929);
        GLES20.glDisable(2884);
        if (this.A01 != null) {
            Map map = this.A05;
            C361248fu r1 = (C361248fu) map.get(t9z);
            if (r1 == null) {
                Integer num = t9z.A00;
                if (num == AnonymousClass05K.A00) {
                    int i3 = this.A00;
                    if (i3 == 6) {
                        r1 = this.A01.A02(R.raw.video_transcode_vs_color_convert, R.raw.video_transcode_fs_rgba_color_convert, this.A02);
                    } else if (i3 != 7) {
                        r3 = this.A01;
                        i = R.raw.lite_copy_vs;
                        i2 = R.raw.copy_fs;
                    } else {
                        try {
                            r1 = this.A01.A02(R.raw.video_transcode_vs_color_convert, R.raw.video_transcode_fs_hlg_rgba_color_convert, this.A02);
                        } catch (Exception unused) {
                            r1 = this.A01.A02(R.raw.lite_copy_vs, R.raw.copy_fs, this.A02);
                        }
                    }
                    map.put(t9z.A00(), r1);
                } else if (num == AnonymousClass05K.A01) {
                    r3 = this.A01;
                    i = R.raw.lite_copy_vs;
                    i2 = R.raw.copy_bgra_fs;
                } else {
                    if (num == null) {
                        str = "null";
                    } else if (1 - num.intValue() != 0) {
                        str = "DEFAULT";
                    } else {
                        str = "BGRA";
                    }
                    throw AnonymousClass7TF.A0W("Unknown format override ", str);
                }
                r1 = r3.A02(i, i2, this.A02);
                map.put(t9z.A00(), r1);
            }
            C361258fv A012 = r1.A01();
            A012.A04("uSTMatrix", r7.A04);
            A012.A04("uConstMatrix", r7.A05);
            A012.A04("uSceneMatrix", r7.A03);
            A012.A04("uContentTransform", r7.A02);
            A012.A03("sTexture", r7.A00());
            A012.A01(this.A03);
            C345907uH.A02("copyRenderer::onDrawFrame", Pxe.A1b());
            return true;
        }
        throw AnonymousClass7TE.A15("cannot be null");
    }

    public final void DpY(C345557ti r1) {
        this.A01 = r1;
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [X.T9z, java.lang.Object] */
    public C12300Sr1(boolean z) {
        this.A02 = false;
        C345987uP r3 = new C345987uP(new float[]{-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f});
        this.A06 = r3;
        this.A00 = 0;
        this.A05 = AnonymousClass7TE.A1E();
        Integer num = AnonymousClass05K.A00;
        ? obj = new Object();
        obj.A00 = num;
        obj.A01 = true;
        this.A04 = obj;
        float[] fArr = new float[16];
        this.A07 = fArr;
        Matrix.setIdentityM(fArr, 0);
        HashMap A1E = AnonymousClass7TE.A1E();
        ArrayList A1C = AnonymousClass7TE.A1C();
        A1E.put("aPosition", r3);
        A1C.add("aPosition");
        this.A03 = Pxj.A0Q(A1E, A1C, new float[]{0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f});
        this.A02 = z;
    }

    public C12300Sr1() {
        this(true);
    }
}
