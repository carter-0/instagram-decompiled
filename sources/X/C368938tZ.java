package X;

import android.opengl.GLES20;
import android.opengl.Matrix;
import com.instagram.android.R;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.8tZ  reason: invalid class name and case insensitive filesystem */
public final class C368938tZ extends C368948ta implements C368958tb {
    public C345557ti A00;
    public C345997uQ A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public final C368968tc A05;
    public final Map A06;
    public final C345987uP A07;
    public final boolean A08;
    public final float[] A09;

    public final void A00(float[] fArr) {
        boolean z = false;
        if (fArr.length == 8) {
            z = true;
        }
        0JA.A08(z, "Positional data must contain 8 elements");
        FloatBuffer floatBuffer = this.A07.A01;
        floatBuffer.put(fArr);
        floatBuffer.position(0);
    }

    public final void Dpb() {
        this.A00 = null;
        Map map = this.A06;
        for (C361248fu A022 : map.values()) {
            A022.A02();
        }
        map.clear();
    }

    public final void EOi(C13586TdE tdE) {
    }

    @Deprecated
    public final boolean EtX() {
        return false;
    }

    public final boolean isEnabled() {
        return true;
    }

    public final Integer BHb() {
        return AnonymousClass05K.A00;
    }

    public final boolean DAo(C368538so r7, long j) {
        int i;
        C368968tc r5 = this.A05;
        if (r5.A01 != r7.A05()) {
            if (!this.A08) {
                Map map = this.A06;
                for (C361248fu A022 : map.values()) {
                    A022.A02();
                }
                map.clear();
            }
            r5.A01 = r7.A05();
        }
        if (this.A02) {
            GLES20.glDisable(3042);
        }
        if (this.A04) {
            GLES20.glDisable(2929);
        }
        if (this.A03) {
            GLES20.glDisable(2884);
        }
        0JA.A03(this.A00, "Called without a program factory");
        Map map2 = this.A06;
        C361248fu r1 = (C361248fu) map2.get(r5);
        if (r1 == null) {
            int i2 = R.raw.copy_vs;
            int intValue = r5.A00.intValue();
            if (intValue == 0) {
                i = R.raw.copy_fs;
            } else if (intValue == 1) {
                i = R.raw.copy_bgra_fs;
            } else if (intValue == 2) {
                i = R.raw.copy_fs_nv12_gl3;
                i2 = R.raw.copy_vs_gl3;
            } else {
                throw new IllegalArgumentException(002.A0R(Pxd.A00(181), "DEFAULT"));
            }
            r1 = this.A00.A02(i2, i, r5.A01);
            map2.put(r5.A00(), r1);
        }
        C361258fv A012 = r1.A01();
        A012.A04("uSurfaceTransformMatrix", r7.A04);
        A012.A04("uVideoTransformMatrix", r7.A05);
        A012.A04("uSceneTransformMatrix", r7.A03);
        A012.A03("sTexture", r7.A00());
        A012.A01(this.A01);
        C345907uH.A02(Pxd.A00(204), new Object[0]);
        return true;
    }

    public final void ESt(Integer num) {
        this.A05.A00 = num;
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [java.lang.Object, X.8tc] */
    public C368938tZ(boolean z) {
        C345987uP r4 = new C345987uP(new float[]{-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f});
        this.A07 = r4;
        this.A02 = true;
        this.A04 = true;
        this.A03 = true;
        this.A08 = z;
        this.A06 = new HashMap();
        Integer num = AnonymousClass05K.A00;
        ? obj = new Object();
        obj.A00 = num;
        obj.A01 = true;
        this.A05 = obj;
        float[] fArr = new float[16];
        this.A09 = fArr;
        Matrix.setIdentityM(fArr, 0);
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        hashMap.put("aPosition", r4);
        arrayList.add("aPosition");
        hashMap.put("aTextureCoord", new C345987uP(new float[]{0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f}));
        arrayList.add("aTextureCoord");
        this.A01 = new C345997uQ(arrayList, hashMap);
    }

    public final void DpY(C345557ti r1) {
        this.A00 = r1;
    }

    public C368938tZ() {
        this(false);
    }
}
