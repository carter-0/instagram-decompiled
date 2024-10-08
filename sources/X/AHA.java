package X;

import android.opengl.GLES20;
import android.opengl.Matrix;
import com.instagram.android.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public final class AHA {
    public C345557ti A00;
    public final Map A01 = AnonymousClass7TE.A1E();
    public final C345997uQ A02;
    public final C392269uU A03;

    public final void A02() {
        this.A00 = null;
        Map map = this.A01;
        Iterator A0v = AnonymousClass7TF.A0v(map);
        while (A0v.hasNext()) {
            ((C361248fu) A0v.next()).A02();
        }
        map.clear();
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [java.lang.Object, X.9uU] */
    public static C361258fv A00(AHA aha, Integer num) {
        int i;
        17k.A0H(AnonymousClass7TF.A1V(aha.A00), "Called without a program factory");
        C392269uU r5 = aha.A03;
        r5.A00 = num;
        Map map = aha.A01;
        C361248fu r3 = (C361248fu) map.get(r5);
        if (r3 == null) {
            int intValue = num.intValue();
            if (intValue != 0) {
                i = R.raw.echo_fs;
                if (intValue != 1) {
                    i = R.raw.duo_fs;
                }
            } else {
                i = R.raw.copy_fs;
            }
            r3 = aha.A00.A02(R.raw.copy_vs, i, r5.A01);
            Integer num2 = r5.A00;
            boolean z = r5.A01;
            ? obj = new Object();
            obj.A00 = num2;
            obj.A01 = z;
            map.put(obj, r3);
        }
        return r3.A01();
    }

    public static void A01(AHA aha, C368538so r5) {
        C392269uU r3 = aha.A03;
        if (r3.A01 != r5.A05()) {
            Map map = aha.A01;
            Iterator A0v = AnonymousClass7TF.A0v(map);
            while (A0v.hasNext()) {
                ((C361248fu) A0v.next()).A02();
            }
            map.clear();
            r3.A01 = r5.A05();
        }
    }

    public final void A03(C361258fv r3, C368538so r4) {
        GLES20.glDisable(3042);
        GLES20.glDisable(2929);
        GLES20.glDisable(2884);
        r3.A04("uSurfaceTransformMatrix", r4.A04);
        r3.A04("uVideoTransformMatrix", r4.A05);
        r3.A04("uSceneTransformMatrix", r4.A03);
        r3.A03("sTexture", r4.A00());
        r3.A01(this.A02);
        C345907uH.A02("BoomerangFramesGLRenderer::draw", new Object[0]);
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [java.lang.Object, X.9uU] */
    public AHA(C345557ti r6) {
        Integer num = AnonymousClass05K.A00;
        ? obj = new Object();
        obj.A00 = num;
        obj.A01 = true;
        this.A03 = obj;
        Matrix.setIdentityM(new float[16], 0);
        C345987uP r1 = new C345987uP(new float[]{-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f});
        HashMap A1E = AnonymousClass7TE.A1E();
        ArrayList A1C = AnonymousClass7TE.A1C();
        A1E.put("aPosition", r1);
        A1C.add("aPosition");
        A1E.put("aTextureCoord", new C345987uP(new float[]{0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f}));
        A1C.add("aTextureCoord");
        this.A02 = new C345997uQ(A1C, A1E);
        this.A00 = r6;
    }

    public final void A04(C368538so r2) {
        A01(this, r2);
        A03(A00(this, AnonymousClass05K.A00), r2);
    }
}
