package X;

import android.graphics.Bitmap;
import android.graphics.RectF;
import android.net.Uri;
import android.opengl.Matrix;
import com.instagram.android.R;
import java.util.ArrayList;
import java.util.HashMap;

public final class Sr2 implements C361878gy {
    public int A00;
    public int A01;
    public Bitmap.Config A02;
    public Uri A03;
    public C249903kY A04;
    public C346337v0 A05;
    public C368798tL A06 = null;
    public C13724Tfu A07;
    public S4T A08;
    public Integer A09;
    public boolean A0A;
    public boolean A0B = false;
    public C361248fu A0C;
    public C361248fu A0D;
    public final RectF A0E = new RectF(0.0f, 0.0f, 1.0f, 1.0f);
    public final C345997uQ A0F;
    public final C345987uP A0G;
    public final float[] A0H;
    public volatile C13586TdE A0I;

    public static void A00(Sr2 sr2, boolean z) {
        C346337v0 r0;
        sr2.A0A = true;
        if (z && (r0 = sr2.A05) != null) {
            r0.A01();
            sr2.A05 = null;
        }
        C249903kY r02 = sr2.A04;
        if (r02 != null) {
            r02.close();
        }
        sr2.A04 = null;
        sr2.A09 = null;
    }

    public final boolean CXr() {
        return true;
    }

    public final void DpY(C345557ti r6) {
        A00(this, true);
        this.A0D = r6.A01(R.raw.lite_overlay_vs, R.raw.lite_overlay_fs);
        try {
            int[] iArr = {R.raw.inverse_tonemap_hlg_lib};
            String A002 = C345557ti.A00(r6, R.raw.overlay_hdr_fs);
            String A003 = C345557ti.A00(r6, R.raw.overlay_300_vs);
            String A004 = C345557ti.A00(r6, iArr[0]);
            this.A0C = r6.A03(002.A0g(A003, "\n", A004), 002.A0g(A002, "\n", A004), false);
        } catch (RuntimeException e) {
            0KC.A0G("LiteOverlayRenderer", "Could not compile HDR shader", e);
        }
    }

    public final void Dpb() {
        A00(this, true);
        C361248fu r0 = this.A0D;
        if (r0 != null) {
            r0.A02();
            this.A0D = null;
        }
        C361248fu r02 = this.A0C;
        if (r02 != null) {
            r02.A02();
            this.A0C = null;
        }
    }

    @Deprecated
    public final boolean EtX() {
        return false;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.S4T, java.lang.Object] */
    public Sr2(Uri uri, C13724Tfu tfu) {
        ? obj = new Object();
        obj.A00 = uri;
        obj.A01 = null;
        obj.A02 = new float[]{-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f};
        float[] fArr = new float[16];
        this.A0H = fArr;
        this.A07 = tfu;
        this.A08 = obj;
        float[] fArr2 = obj.A02;
        fArr2.getClass();
        C345987uP r3 = new C345987uP(fArr2);
        this.A0G = r3;
        Matrix.setIdentityM(fArr, 0);
        HashMap A1E = AnonymousClass7TE.A1E();
        ArrayList A1C = AnonymousClass7TE.A1C();
        A1E.put("aPosition", r3);
        A1C.add("aPosition");
        this.A0F = Pxj.A0Q(A1E, A1C, new float[]{0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f});
        this.A03 = uri;
        this.A0A = true;
    }

    public final Integer BHb() {
        return AnonymousClass05K.A0N;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:47:0x010d, code lost:
        if (r1 != null) goto L_0x0043;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean DAo(X.C368538so r7, long r8) {
        /*
            r6 = this;
            X.8tL r0 = r6.A06
            r4 = 1
            if (r0 == 0) goto L_0x000c
            X.8KV r1 = r0.A00
            X.8KV r0 = X.AnonymousClass8KV.PREVIEW
            if (r1 != r0) goto L_0x000c
            return r4
        L_0x000c:
            X.7v0 r0 = r7.A00()
            X.7v3 r0 = r0.A02
            boolean r0 = r0.A03
            if (r0 == 0) goto L_0x0111
            X.8fu r3 = r6.A0C
            if (r3 == 0) goto L_0x0111
            r6.A0B = r4
        L_0x001c:
            r3.getClass()
            boolean r0 = r6.A0A
            if (r0 == 0) goto L_0x008d
            X.S4T r1 = r6.A08
            X.3kY r0 = r1.A01
            if (r0 != 0) goto L_0x002d
            android.net.Uri r0 = r1.A00
            if (r0 == 0) goto L_0x008d
        L_0x002d:
            A00(r6, r4)
            android.net.Uri r2 = r1.A00
            if (r2 == 0) goto L_0x010b
            X.Tfu r1 = r6.A07
            r0 = 0
            X.3kY r1 = r1.CgE(r0, r2)
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            r6.A09 = r0
            if (r1 == 0) goto L_0x012a
            r6.A04 = r1
        L_0x0043:
            java.lang.Object r5 = r1.A05()
            android.graphics.Bitmap r5 = (android.graphics.Bitmap) r5
            X.7v0 r0 = r6.A05
            r2 = 0
            if (r0 == 0) goto L_0x00dd
            int r1 = r5.getWidth()
            int r0 = r6.A01
            if (r1 != r0) goto L_0x00dd
            int r1 = r5.getHeight()
            int r0 = r6.A00
            if (r1 != r0) goto L_0x00dd
            android.graphics.Bitmap$Config r1 = r5.getConfig()
            android.graphics.Bitmap$Config r0 = r6.A02
            if (r1 != r0) goto L_0x00dd
            X.7v0 r0 = r6.A05
            X.7v3 r0 = r0.A02
            boolean r1 = r0.A03
            boolean r0 = r6.A0B
            if (r1 != r0) goto L_0x00dd
            boolean r0 = r5.isRecycled()
            if (r0 != 0) goto L_0x0123
            X.7v0 r0 = r6.A05
            int r1 = r0.A00
            r0 = 3553(0xde1, float:4.979E-42)
            android.opengl.GLES20.glBindTexture(r0, r1)
            android.opengl.GLUtils.texImage2D(r0, r2, r5, r2)
            android.opengl.GLES20.glBindTexture(r0, r2)
        L_0x0085:
            java.lang.Integer r1 = r6.A09
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r1 != r0) goto L_0x008d
            r6.A0A = r2
        L_0x008d:
            X.7v0 r0 = r6.A05
            r2 = 0
            if (r0 == 0) goto L_0x0115
            r0 = 3042(0xbe2, float:4.263E-42)
            android.opengl.GLES20.glEnable(r0)
            java.lang.Object[] r1 = new java.lang.Object[r2]
            java.lang.String r0 = "GL_BLEND"
            X.C345907uH.A02(r0, r1)
            r0 = 771(0x303, float:1.08E-42)
            android.opengl.GLES20.glBlendFunc(r4, r0)
            r0 = 32774(0x8006, float:4.5926E-41)
            android.opengl.GLES20.glBlendEquation(r0)
            java.lang.Object[] r1 = new java.lang.Object[r2]
            java.lang.String r0 = "blendFunc"
            X.C345907uH.A02(r0, r1)
            X.8fv r2 = r3.A01()
            float[] r1 = r7.A03
            java.lang.String r0 = "uSceneMatrix"
            r2.A04(r0, r1)
            float[] r1 = r6.A0H
            java.lang.String r0 = "uRotationMatrix"
            r2.A04(r0, r1)
            X.7v0 r1 = r6.A05
            java.lang.String r0 = "sOverlay"
            r2.A03(r0, r1)
            X.7uQ r0 = r6.A0F
            r2.A01(r0)
            X.3kY r0 = r6.A04
            if (r0 == 0) goto L_0x00db
            r0.close()
            r0 = 0
            r6.A04 = r0
        L_0x00db:
            r0 = 1
            return r0
        L_0x00dd:
            X.7v0 r0 = r6.A05
            if (r0 == 0) goto L_0x00e4
            r0.A01()
        L_0x00e4:
            java.lang.String r0 = "LiteOverlayRenderer"
            X.7uz r1 = X.Pxk.A0C(r0)
            r1.A05 = r5
            boolean r0 = r6.A0B
            r1.A09 = r0
            X.7v0 r0 = new X.7v0
            r0.<init>(r1)
            r6.A05 = r0
            int r0 = r5.getWidth()
            r6.A01 = r0
            int r0 = r5.getHeight()
            r6.A00 = r0
            android.graphics.Bitmap$Config r0 = r5.getConfig()
            r6.A02 = r0
            goto L_0x0085
        L_0x010b:
            X.3kY r1 = r1.A01
            if (r1 == 0) goto L_0x008d
            goto L_0x0043
        L_0x0111:
            X.8fu r3 = r6.A0D
            goto L_0x001c
        L_0x0115:
            X.TdE r0 = r6.A0I
            if (r0 == 0) goto L_0x0121
            r1 = 0
            java.lang.String r2 = "LiteOverlayRenderer"
            r4 = r8
            r3 = r1
            r0.AUd(r1, r2, r3, r4)
        L_0x0121:
            r0 = 0
            return r0
        L_0x0123:
            java.lang.String r0 = "bitmap is recycled"
            java.lang.RuntimeException r0 = X.AnonymousClass7TE.A15(r0)
            throw r0
        L_0x012a:
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "Fail to load image for "
            java.lang.IllegalStateException r0 = X.C66582MXn.A0k(r2, r0, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Sr2.DAo(X.8so, long):boolean");
    }

    public final void DpZ(RectF rectF) {
        this.A0E.set(rectF);
    }

    public final void EOi(C13586TdE tdE) {
        this.A0I = tdE;
    }

    public final void EUE(C368798tL r1) {
        this.A06 = r1;
    }

    public final boolean isEnabled() {
        S4T s4t = this.A08;
        if (s4t.A01 == null && s4t.A00 == null) {
            return false;
        }
        return true;
    }

    public final void DpU(int i, int i2) {
    }
}
