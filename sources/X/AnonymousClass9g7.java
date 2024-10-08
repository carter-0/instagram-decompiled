package X;

import android.opengl.GLES20;
import android.opengl.Matrix;
import com.instagram.android.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.Deprecated;

/* renamed from: X.9g7  reason: invalid class name */
public final class AnonymousClass9g7 extends C368948ta implements C368958tb {
    public C345557ti A00;
    public final Ahw A01;
    public final Map A02;
    public final float A03 = 0.02f;
    public final float A04 = 0.2f;
    public final float A05 = 0.05f;
    public final C345997uQ A06;
    public final C345987uP A07;
    public final boolean A08 = true;
    public final float[] A09;

    /* JADX WARNING: type inference failed for: r0v1, types: [X.Ahw, java.lang.Object] */
    public AnonymousClass9g7() {
        Integer num = AnonymousClass05K.A00;
        ? obj = new Object();
        obj.A00 = num;
        obj.A01 = true;
        this.A01 = obj;
        this.A02 = AnonymousClass7TE.A1E();
        float[] fArr = new float[16];
        this.A09 = fArr;
        C345987uP r1 = new C345987uP(new float[]{-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f});
        this.A07 = r1;
        Matrix.setIdentityM(fArr, 0);
        HashMap A1E = AnonymousClass7TE.A1E();
        ArrayList A1C = AnonymousClass7TE.A1C();
        A1E.put("aPosition", r1);
        A1C.add("aPosition");
        A1E.put("aTextureCoord", new C345987uP(new float[]{0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f}));
        A1C.add("aTextureCoord");
        this.A06 = new C345997uQ(A1C, A1E);
    }

    public final boolean DAo(C368538so r8, long j) {
        String str;
        0qQ.A0B(r8, 0);
        Ahw ahw = this.A01;
        if (ahw.A01 != r8.A05()) {
            if (!this.A08) {
                Map map = this.A02;
                Iterator A0v = AnonymousClass7TF.A0v(map);
                while (A0v.hasNext()) {
                    C361248fu r0 = (C361248fu) A0v.next();
                    0qQ.A0A(r0);
                    r0.A02();
                }
                map.clear();
            }
            ahw.A01 = r8.A05();
        }
        GLES20.glDisable(3042);
        GLES20.glDisable(2929);
        GLES20.glDisable(2884);
        if (this.A00 != null) {
            Map map2 = this.A02;
            C361248fu r1 = (C361248fu) map2.get(ahw);
            if (r1 == null) {
                int intValue = ahw.A00.intValue();
                if (intValue == 0) {
                    C345557ti r2 = this.A00;
                    0qQ.A0A(r2);
                    r1 = r2.A02(R.raw.copy_vs, R.raw.enhance_fs, ahw.A01);
                    map2.put(ahw.clone(), r1);
                } else if (intValue != 1) {
                    String A002 = Pxd.A00(181);
                    if (2 - intValue != 0) {
                        str = "DEFAULT";
                    } else {
                        str = "YUV_GL3";
                    }
                    throw AnonymousClass7TF.A0W(A002, str);
                } else {
                    throw AnonymousClass7TE.A1B("BGRA format is not supported in EnhanceRenderer");
                }
            }
            0qQ.A0A(r1);
            C361258fv A012 = r1.A01();
            0qQ.A07(A012);
            A012.A04("uSurfaceTransformMatrix", r8.A04);
            A012.A04("uVideoTransformMatrix", r8.A05);
            A012.A04("uSceneTransformMatrix", r8.A03);
            A012.A02("uBrightness", this.A03);
            A012.A02("uContrast", this.A04);
            A012.A02("uSaturation", this.A05);
            A012.A03("sTexture", r8.A00());
            A012.A01(this.A06);
            C345907uH.A02(Pxd.A00(204), new Object[0]);
            return true;
        }
        throw AnonymousClass7TE.A0z("Called without a program factory");
    }

    public final void DpY(C345557ti r2) {
        0qQ.A0B(r2, 0);
        this.A00 = r2;
    }

    public final void Dpb() {
        this.A00 = null;
        Map map = this.A02;
        Iterator A0v = AnonymousClass7TF.A0v(map);
        while (A0v.hasNext()) {
            C361248fu r0 = (C361248fu) A0v.next();
            0qQ.A0A(r0);
            r0.A02();
        }
        map.clear();
    }

    public final void EOi(C13586TdE tdE) {
    }

    public final void ESt(Integer num) {
        0qQ.A0B(num, 0);
        this.A01.A00 = num;
    }

    @Deprecated(message = "")
    public final boolean EtX() {
        return false;
    }

    public final boolean isEnabled() {
        return true;
    }

    public final Integer BHb() {
        return AnonymousClass05K.A00;
    }
}
