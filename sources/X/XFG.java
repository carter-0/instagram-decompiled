package X;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.view.DisplayListCanvas;
import android.view.RenderNode;
import androidx.compose.ui.platform.AndroidComposeView;

public final class XFG implements JRP {
    public static boolean A08 = true;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public C54727HQg A04;
    public boolean A05;
    public final RenderNode A06;
    public final AndroidComposeView A07;

    public final void ESY(int i) {
        int i2;
        RenderNode renderNode;
        if (AnonymousClass7TF.A1S(i, 1)) {
            renderNode = this.A06;
            i2 = 2;
        } else {
            boolean A1S = AnonymousClass7TF.A1S(i, 2);
            i2 = 0;
            renderNode = this.A06;
            if (A1S) {
                renderNode.setLayerType(0);
                renderNode.setHasOverlappingRendering(false);
                return;
            }
        }
        renderNode.setLayerType(i2);
        renderNode.setHasOverlappingRendering(true);
    }

    public final boolean EYb(boolean z) {
        return this.A06.setHasOverlappingRendering(true);
    }

    public final void APS() {
        XU8.A00(this.A06);
    }

    public final void AQg(Canvas canvas) {
        0qQ.A0C(canvas, "null cannot be cast to non-null type android.view.DisplayListCanvas");
        ((DisplayListCanvas) canvas).drawRenderNode(this.A06);
    }

    public final float AbF() {
        return this.A06.getAlpha();
    }

    public final boolean Anp() {
        return this.A06.getClipToOutline();
    }

    public final float B0b() {
        return this.A06.getElevation();
    }

    public final boolean BAw() {
        return this.A06.isValid();
    }

    public final void BP5(Matrix matrix) {
        this.A06.getMatrix(matrix);
    }

    public final void Csl(int i) {
        this.A01 += i;
        this.A02 += i;
        this.A06.offsetLeftAndRight(i);
    }

    public final void Cso(int i) {
        this.A03 += i;
        this.A00 += i;
        this.A06.offsetTopAndBottom(i);
    }

    public final void EAh(AnonymousClass5R2 r6, C3018060d r7, 0sP r8) {
        RenderNode renderNode = this.A06;
        Canvas start = renderNode.start(this.A02 - this.A01, this.A00 - this.A03);
        AnonymousClass5R3 r2 = r6.A00;
        Canvas canvas = r2.A00;
        r2.A00 = start;
        if (r7 != null) {
            r2.EJt();
            r2.AHw(r7, 1);
        }
        r8.invoke(r2);
        if (r7 != null) {
            r2.EIm();
        }
        r2.A00 = canvas;
        renderNode.end(start);
    }

    public final void EOX(float f) {
        this.A06.setAlpha(f);
    }

    public final void EOb(int i) {
        C22011Xqy.A02(this.A06, i);
    }

    public final void EQN(float f) {
        this.A06.setCameraDistance(-f);
    }

    public final void ERi(boolean z) {
        this.A05 = z;
        this.A06.setClipToBounds(z);
    }

    public final void ERj(boolean z) {
        this.A06.setClipToOutline(z);
    }

    public final void EUx(float f) {
        this.A06.setElevation(f);
    }

    public final void Ef4(Outline outline) {
        this.A06.setOutline(outline);
    }

    public final void Efn(float f) {
        this.A06.setPivotX(f);
    }

    public final void Efo(float f) {
        this.A06.setPivotY(f);
    }

    public final boolean Eg8(int i, int i2, int i3, int i4) {
        this.A01 = i;
        this.A03 = i2;
        this.A02 = i3;
        this.A00 = i4;
        return this.A06.setLeftTopRightBottom(i, i2, i3, i4);
    }

    public final void Ej3(float f) {
        this.A06.setRotationX(f);
    }

    public final void Ej4(float f) {
        this.A06.setRotationY(f);
    }

    public final void Ej5(float f) {
        this.A06.setRotation(f);
    }

    public final void EjG(float f) {
        this.A06.setScaleX(f);
    }

    public final void EjH(float f) {
        this.A06.setScaleY(f);
    }

    public final void Ell(int i) {
        C22011Xqy.A03(this.A06, i);
    }

    public final void EpG(float f) {
        this.A06.setTranslationX(f);
    }

    public final void EpH(float f) {
        this.A06.setTranslationY(f);
    }

    public final int getHeight() {
        return this.A00 - this.A03;
    }

    public final int getWidth() {
        return this.A02 - this.A01;
    }

    public XFG(AndroidComposeView androidComposeView) {
        this.A07 = androidComposeView;
        RenderNode create = RenderNode.create("Compose", androidComposeView);
        this.A06 = create;
        if (A08) {
            create.setScaleX(create.getScaleX());
            create.setScaleY(create.getScaleY());
            create.setTranslationX(create.getTranslationX());
            create.setTranslationY(create.getTranslationY());
            create.setElevation(create.getElevation());
            create.setRotation(create.getRotation());
            create.setRotationX(create.getRotationX());
            create.setRotationY(create.getRotationY());
            create.setCameraDistance(create.getCameraDistance());
            create.setPivotX(create.getPivotX());
            create.setPivotY(create.getPivotY());
            create.setClipToOutline(create.getClipToOutline());
            create.setClipToBounds(false);
            create.setAlpha(create.getAlpha());
            create.isValid();
            create.setLeftTopRightBottom(0, 0, 0, 0);
            create.offsetLeftAndRight(0);
            create.offsetTopAndBottom(0);
            C22011Xqy.A02(create, C22011Xqy.A00(create));
            C22011Xqy.A03(create, C22011Xqy.A01(create));
            XU8.A00(this.A06);
            create.setLayerType(0);
            create.setHasOverlappingRendering(create.hasOverlappingRendering());
            A08 = false;
        }
    }

    public final int AhC() {
        return this.A00;
    }

    public final boolean Ano() {
        return this.A05;
    }

    public final int C8J() {
        return this.A03;
    }

    public final int getLeft() {
        return this.A01;
    }

    public final int getRight() {
        return this.A02;
    }

    public final void EiT(C54727HQg hQg) {
        this.A04 = hQg;
    }
}
