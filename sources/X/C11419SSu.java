package X;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.opengl.GLES20;
import android.opengl.Matrix;
import com.instagram.android.R;
import com.instagram.react.modules.base.IgReactQEModule;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.SSu  reason: case insensitive filesystem */
public final class C11419SSu {
    public C345557ti A00;
    public final TA0 A01;
    public final Map A02 = AnonymousClass7TE.A1E();
    public final C345997uQ A03;

    public final void A05(C361258fv r4, C368538so r5) {
        GLES20.glDisable(3042);
        GLES20.glDisable(2929);
        GLES20.glDisable(2884);
        r4.A04("uSurfaceTransformMatrix", r5.A04);
        r4.A04("uVideoTransformMatrix", r5.A05);
        r4.A04("uSceneTransformMatrix", r5.A03);
        r4.A01(this.A03);
        C345907uH.A02("PosesFramesGLRenderer::draw", new Object[0]);
    }

    public static final C369008tg A00(C369008tg r17, C368538so r18, C11419SSu sSu) {
        C369008tg r3 = r17;
        int i = r3.A02;
        int i2 = r3.A01;
        C369008tg r7 = new C369008tg(i / 2, i2 / 2);
        GLES20.glBindFramebuffer(36160, r7.A00);
        int i3 = r7.A02;
        int i4 = r7.A01;
        GLES20.glViewport(0, 0, i3, i4);
        Integer num = AnonymousClass05K.A01;
        C11419SSu sSu2 = sSu;
        C361258fv A012 = A01(sSu2, num);
        A012.A03("u_Texture", r3.A03);
        Pxh.A1B(A012, "u_TextureSize", (float) i, (float) i2);
        C368538so r14 = r18;
        sSu2.A05(A012, r14);
        GLES20.glBindFramebuffer(36160, 0);
        GLES20.glBindTexture(3553, 0);
        C369008tg r4 = new C369008tg(i / 4, i2 / 4);
        GLES20.glBindFramebuffer(36160, r4.A00);
        int i5 = r4.A02;
        int i6 = r4.A01;
        GLES20.glViewport(0, 0, i5, i6);
        C361258fv A013 = A01(sSu2, num);
        A013.A03("u_Texture", r7.A03);
        Pxh.A1B(A013, "u_TextureSize", (float) i3, (float) i4);
        sSu2.A05(A013, r14);
        GLES20.glBindFramebuffer(36160, 0);
        GLES20.glBindTexture(3553, 0);
        r7.A01();
        C369008tg r8 = new C369008tg(i5, i6);
        GLES20.glBindFramebuffer(36160, r8.A00);
        int i7 = r8.A02;
        int i8 = r8.A01;
        GLES20.glViewport(0, 0, i7, i8);
        Integer num2 = AnonymousClass05K.A0C;
        C361258fv A014 = A01(sSu2, num2);
        GLES20.glUniform1i(C361258fv.A00(A014, "u_DirX"), 1);
        GLES20.glUniform1i(C361258fv.A00(A014, "u_DirY"), 0);
        A014.A02("u_BlurAmount", 5.0f);
        A014.A02("u_VignetteAmount", 1.0f);
        A014.A03("u_Texture", r4.A03);
        Pxh.A1B(A014, "u_RenderSize", (float) i7, (float) i8);
        sSu2.A05(A014, r14);
        GLES20.glBindFramebuffer(36160, 0);
        GLES20.glBindTexture(3553, 0);
        r4.A01();
        C369008tg r42 = new C369008tg(i7, i8);
        GLES20.glBindFramebuffer(36160, r42.A00);
        int i9 = r42.A02;
        int i10 = r42.A01;
        GLES20.glViewport(0, 0, i9, i10);
        C361258fv A015 = A01(sSu2, num2);
        GLES20.glUniform1i(C361258fv.A00(A015, "u_DirX"), 0);
        GLES20.glUniform1i(C361258fv.A00(A015, "u_DirY"), 1);
        A015.A02("u_BlurAmount", 5.0f);
        A015.A02("u_VignetteAmount", 1.0f);
        A015.A03("u_Texture", r8.A03);
        Pxh.A1B(A015, "u_RenderSize", (float) i9, (float) i10);
        sSu2.A05(A015, r14);
        GLES20.glBindFramebuffer(36160, 0);
        GLES20.glBindTexture(3553, 0);
        r8.A01();
        return r42;
    }

    public static final C361258fv A01(C11419SSu sSu, Integer num) {
        int i;
        int i2;
        TA0 ta0 = sSu.A01;
        ta0.A00 = num;
        Map map = sSu.A02;
        C361248fu r1 = (C361248fu) map.get(ta0);
        if (r1 == null) {
            C345557ti r3 = sSu.A00;
            if (r3 != null) {
                switch (num.intValue()) {
                    case 0:
                        i = R.raw.copy_vs;
                        i2 = R.raw.copy_fs;
                        break;
                    case 1:
                        i = R.raw.box_vs;
                        i2 = R.raw.box_fs;
                        break;
                    case 2:
                        i = R.raw.gaussian_blur_a_vs;
                        i2 = R.raw.gaussian_blur_a_fs;
                        break;
                    case 3:
                        i = R.raw.copy_vs;
                        i2 = R.raw.flash_fs;
                        break;
                    case 4:
                        i = R.raw.leak_vs;
                        i2 = R.raw.leak_fs;
                        break;
                    case 5:
                        i = R.raw.box_vs;
                        i2 = R.raw.leak_composite_fs;
                        break;
                    case 6:
                        i = R.raw.ps_vs;
                        i2 = R.raw.ps_fs;
                        break;
                    case 7:
                        i = R.raw.box_vs;
                        i2 = R.raw.ps_composite_fs;
                        break;
                    case 8:
                        i = R.raw.fr_vs;
                        i2 = R.raw.fr_fs;
                        break;
                    case 9:
                        i = R.raw.box_vs;
                        i2 = R.raw.fr_composite_fs;
                        break;
                    case 10:
                        i = R.raw.frbw_vs;
                        i2 = R.raw.frbw_fs;
                        break;
                    case 11:
                        i = R.raw.frbw_composite_vs;
                        i2 = R.raw.frbw_composite_fs;
                        break;
                    case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                        i = R.raw.vhs_vs;
                        i2 = R.raw.vhs_fs;
                        break;
                    default:
                        i = R.raw.vhs_composite_vs;
                        i2 = R.raw.vhs_composite_fs;
                        break;
                }
                r1 = r3.A02(i, i2, ta0.A01);
                map.put(ta0.clone(), r1);
                0qQ.A0A(r1);
            } else {
                throw AnonymousClass7TE.A0y();
            }
        }
        C361258fv A012 = r1.A01();
        0qQ.A07(A012);
        return A012;
    }

    public static final C346337v0 A02(C11419SSu sSu, int i) {
        C345557ti r0 = sSu.A00;
        if (r0 != null) {
            Drawable A002 = AnonymousClass2dd.A00(r0.A00, i);
            0qQ.A07(A002);
            A002.setVisible(true, false);
            if (A002 instanceof C262364Dk) {
                C262364Dk r2 = (C262364Dk) A002;
                do {
                } while (r2.A00.A01.A06 == null);
                Bitmap bitmap = r2.A00.A01.A06;
                C346327uz r1 = new C346327uz("TextureDrawable");
                r1.A05 = bitmap;
                return new C346337v0(r1);
            }
            throw new ClassCastException("External textures required for effects unavailable");
        }
        throw AnonymousClass7TE.A0y();
    }

    public static final void A04(C368538so r4, C11419SSu sSu) {
        TA0 ta0 = sSu.A01;
        if (ta0.A01 != r4.A05()) {
            Map map = sSu.A02;
            Iterator A0v = AnonymousClass7TF.A0v(map);
            while (A0v.hasNext()) {
                C361248fu r0 = (C361248fu) A0v.next();
                if (r0 != null) {
                    r0.A02();
                }
            }
            map.clear();
            ta0.A01 = r4.A05();
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.TA0, java.lang.Object] */
    public C11419SSu() {
        Integer num = AnonymousClass05K.A0N;
        ? obj = new Object();
        obj.A00 = num;
        obj.A01 = true;
        this.A01 = obj;
        Matrix.setIdentityM(new float[16], 0);
        C345987uP r3 = new C345987uP(new float[]{-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f});
        HashMap A1E = AnonymousClass7TE.A1E();
        ArrayList A1C = AnonymousClass7TE.A1C();
        A1E.put("aPosition", r3);
        A1C.add("aPosition");
        this.A03 = Pxj.A0Q(A1E, A1C, new float[]{0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f});
    }

    public static final ArrayList A03(List list) {
        ArrayList A1C = AnonymousClass7TE.A1C();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A1C.add(((C369008tg) it.next()).A03);
        }
        return A1C;
    }
}
