package X;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import androidx.compose.ui.graphics.layer.GraphicsLayer;

public final class IG6 implements C289225dE {
    public static final Canvas A0O = new C52783Gca();
    public float A00;
    public float A01;
    public float A02;
    public int A03;
    public long A04;
    public long A05;
    public long A06;
    public boolean A07;
    public boolean A08;
    public float A09;
    public float A0A;
    public float A0B;
    public float A0C;
    public float A0D;
    public float A0E;
    public int A0F;
    public int A0G;
    public C54727HQg A0H;
    public boolean A0I;
    public final Resources A0J;
    public final Rect A0K = AnonymousClass7TE.A0W();
    public final AnonymousClass5R2 A0L;
    public final C52846Gdc A0M;
    public final C52848Gdh A0N;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0007, code lost:
        if (r4.A08 != false) goto L_0x0009;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void ERg(boolean r5) {
        /*
            r4 = this;
            r3 = 0
            r2 = 1
            if (r5 == 0) goto L_0x0009
            boolean r1 = r4.A08
            r0 = 1
            if (r1 == 0) goto L_0x000a
        L_0x0009:
            r0 = 0
        L_0x000a:
            r4.A0I = r0
            r4.A07 = r2
            X.Gdc r1 = r4.A0M
            if (r5 == 0) goto L_0x0017
            boolean r0 = r4.A08
            if (r0 == 0) goto L_0x0017
            r3 = 1
        L_0x0017:
            r1.setClipToOutline(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.IG6.ERg(boolean):void");
    }

    public /* synthetic */ IG6(C52848Gdh gdh) {
        AnonymousClass5R2 r2 = new AnonymousClass5R2();
        AnonymousClass5Q5 r0 = new AnonymousClass5Q5();
        this.A0N = gdh;
        this.A0L = r2;
        C52846Gdc gdc = new C52846Gdc(gdh, r2, r0);
        this.A0M = gdc;
        this.A0J = gdh.getResources();
        gdh.addView(gdc);
        gdc.setClipBounds((Rect) null);
        this.A05 = 0;
        View.generateViewId();
        this.A03 = 0;
        this.A00 = 1.0f;
        this.A01 = 1.0f;
        this.A02 = 1.0f;
        long j = AnonymousClass5RW.A01;
        this.A04 = j;
        this.A06 = j;
    }

    public final Matrix AF2() {
        return this.A0M.getMatrix();
    }

    public final void APS() {
        this.A0N.removeViewInLayout(this.A0M);
    }

    public final void AQL(AnonymousClass5QA r5) {
        Rect rect;
        if (this.A07) {
            C52846Gdc gdc = this.A0M;
            if (!Ank() || this.A08) {
                rect = null;
            } else {
                rect = this.A0K;
                rect.left = 0;
                rect.top = 0;
                rect.right = gdc.getWidth();
                rect.bottom = gdc.getHeight();
            }
            gdc.setClipBounds(rect);
        }
        if (AnonymousClass5R4.A00(r5).isHardwareAccelerated()) {
            C52848Gdh gdh = this.A0N;
            C52846Gdc gdc2 = this.A0M;
            gdh.A00(gdc2, r5, gdc2.getDrawingTime());
        }
    }

    public final float AbF() {
        return this.A00;
    }

    public final long AbM() {
        return this.A04;
    }

    public final int Ag3() {
        return 3;
    }

    public final float Ajj() {
        return this.A0M.getCameraDistance() / ((float) this.A0J.getDisplayMetrics().densityDpi);
    }

    public final boolean Ank() {
        if (this.A0I || this.A0M.getClipToOutline()) {
            return true;
        }
        return false;
    }

    public final C288195bW Ap0() {
        return null;
    }

    public final int Apj() {
        return this.A03;
    }

    public final /* synthetic */ boolean BAw() {
        return true;
    }

    public final C54727HQg Bli() {
        return this.A0H;
    }

    public final float Boj() {
        return this.A09;
    }

    public final float Bok() {
        return this.A0A;
    }

    public final float Bol() {
        return this.A0B;
    }

    public final float BpX() {
        return this.A01;
    }

    public final float BpY() {
        return this.A02;
    }

    public final float Bt8() {
        return this.A0C;
    }

    public final long ByQ() {
        return this.A06;
    }

    public final float C9c() {
        return this.A0D;
    }

    public final float C9d() {
        return this.A0E;
    }

    public final void EAi(C268024cd r7, AnonymousClass5Q8 r8, GraphicsLayer graphicsLayer, 0sP r10) {
        C52846Gdc gdc = this.A0M;
        if (gdc.getParent() == null) {
            this.A0N.addView(gdc);
        }
        gdc.setDrawParams(r7, r8, graphicsLayer, r10);
        if (gdc.isAttachedToWindow()) {
            gdc.setVisibility(4);
            gdc.setVisibility(0);
            try {
                AnonymousClass5R2 r1 = this.A0L;
                Canvas canvas = A0O;
                AnonymousClass5R3 r4 = r1.A00;
                Canvas canvas2 = r4.A00;
                r4.A00 = canvas;
                this.A0N.A00(gdc, r4, gdc.getDrawingTime());
                r4.A00 = canvas2;
            } catch (Throwable unused) {
            }
        }
    }

    public final void EOX(float f) {
        this.A00 = f;
        this.A0M.setAlpha(f);
    }

    public final void EOc(long j) {
        this.A04 = j;
        this.A0M.setOutlineAmbientShadowColor(C285595Rx.A00(j));
    }

    public final void EQN(float f) {
        this.A0M.setCameraDistance(f * ((float) this.A0J.getDisplayMetrics().densityDpi));
    }

    public final void ESX(int i) {
        this.A03 = i;
        int i2 = 1;
        if (i != 1) {
            i2 = 0;
        }
        C52846Gdc gdc = this.A0M;
        boolean z = true;
        if (AnonymousClass7TF.A1S(i2, 1)) {
            gdc.setLayerType(2, (Paint) null);
        } else if (AnonymousClass7TF.A1S(i2, 2)) {
            gdc.setLayerType(0, (Paint) null);
            z = false;
        } else {
            gdc.setLayerType(0, (Paint) null);
        }
        gdc.setCanUseCompositingLayer$ui_graphics_release(z);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001f, code lost:
        if (r5 != null) goto L_0x001c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Ef4(android.graphics.Outline r5) {
        /*
            r4 = this;
            X.Gdc r3 = r4.A0M
            r3.A00 = r5
            r3.invalidateOutline()
            r2 = 1
            boolean r0 = r4.Ank()
            r1 = 0
            if (r0 == 0) goto L_0x001f
            if (r5 == 0) goto L_0x0022
            r3.setClipToOutline(r2)
            boolean r0 = r4.A0I
            if (r0 == 0) goto L_0x001c
            r4.A0I = r1
            r4.A07 = r2
        L_0x001c:
            r4.A08 = r2
            return
        L_0x001f:
            if (r5 == 0) goto L_0x0022
            goto L_0x001c
        L_0x0022:
            r2 = 0
            goto L_0x001c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.IG6.Ef4(android.graphics.Outline):void");
    }

    public final void Eg9(int i, int i2, long j) {
        if (this.A05 == j) {
            int i3 = this.A0F;
            if (i3 != i) {
                this.A0M.offsetLeftAndRight(i - i3);
            }
            int i4 = this.A0G;
            if (i4 != i2) {
                this.A0M.offsetTopAndBottom(i2 - i4);
            }
        } else {
            if (Ank()) {
                this.A07 = true;
            }
            this.A0M.layout(i, i2, C51965G9l.A04(j) + i, C289005cr.A00(j) + i2);
            this.A05 = j;
        }
        this.A0F = i;
        this.A0G = i2;
    }

    public final void EiT(C54727HQg hQg) {
        this.A0H = hQg;
        if (Build.VERSION.SDK_INT >= 31) {
            HRQ.A00(this.A0M, hQg);
        }
    }

    public final void Ej3(float f) {
        this.A09 = f;
        this.A0M.setRotationX(f);
    }

    public final void Ej4(float f) {
        this.A0A = f;
        this.A0M.setRotationY(f);
    }

    public final void Ej5(float f) {
        this.A0B = f;
        this.A0M.setRotation(f);
    }

    public final void EjG(float f) {
        this.A01 = f;
        this.A0M.setScaleX(f);
    }

    public final void EjH(float f) {
        this.A02 = f;
        this.A0M.setScaleY(f);
    }

    public final void Ek7(float f) {
        this.A0C = f;
        this.A0M.setElevation(f);
    }

    public final void Elm(long j) {
        this.A06 = j;
        this.A0M.setOutlineSpotShadowColor(C285595Rx.A00(j));
    }

    public final void EpG(float f) {
        this.A0D = f;
        this.A0M.setTranslationX(f);
    }

    public final void EpH(float f) {
        this.A0E = f;
        this.A0M.setTranslationY(f);
    }

    public final void Efm(long j) {
        if ((j & 9223372034707292159L) == 9205357640488583168L) {
            this.A0M.resetPivot();
            return;
        }
        C52846Gdc gdc = this.A0M;
        gdc.setPivotX(C289295dM.A01(j));
        gdc.setPivotY(C289295dM.A02(j));
    }
}
