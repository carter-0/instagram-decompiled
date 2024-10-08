package X;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.RenderNode;
import android.os.Build;
import androidx.compose.ui.platform.AndroidComposeView;

/* renamed from: X.IGe  reason: case insensitive filesystem */
public final class C56883IGe implements JRP {
    public C54727HQg A00;
    public final RenderNode A01 = new RenderNode("Compose");
    public final AndroidComposeView A02;

    public final boolean EYb(boolean z) {
        return this.A01.setHasOverlappingRendering(true);
    }

    public final void APS() {
        this.A01.discardDisplayList();
    }

    public final void AQg(Canvas canvas) {
        canvas.drawRenderNode(this.A01);
    }

    public final float AbF() {
        return this.A01.getAlpha();
    }

    public final int AhC() {
        return this.A01.getBottom();
    }

    public final boolean Ano() {
        return this.A01.getClipToBounds();
    }

    public final boolean Anp() {
        return this.A01.getClipToOutline();
    }

    public final float B0b() {
        return this.A01.getElevation();
    }

    public final boolean BAw() {
        return this.A01.hasDisplayList();
    }

    public final void BP5(Matrix matrix) {
        this.A01.getMatrix(matrix);
    }

    public final int C8J() {
        return this.A01.getTop();
    }

    public final void Csl(int i) {
        this.A01.offsetLeftAndRight(i);
    }

    public final void Cso(int i) {
        this.A01.offsetTopAndBottom(i);
    }

    public final void EAh(AnonymousClass5R2 r5, C3018060d r6, 0sP r7) {
        RenderNode renderNode = this.A01;
        AnonymousClass5R3 r2 = r5.A00;
        Canvas canvas = r2.A00;
        r2.A00 = renderNode.beginRecording();
        if (r6 != null) {
            r2.EJt();
            r2.AHw(r6, 1);
        }
        r7.invoke(r2);
        if (r6 != null) {
            r2.EIm();
        }
        r2.A00 = canvas;
        renderNode.endRecording();
    }

    public final void EOX(float f) {
        this.A01.setAlpha(f);
    }

    public final void EOb(int i) {
        this.A01.setAmbientShadowColor(i);
    }

    public final void EQN(float f) {
        this.A01.setCameraDistance(f);
    }

    public final void ERi(boolean z) {
        this.A01.setClipToBounds(z);
    }

    public final void ERj(boolean z) {
        this.A01.setClipToOutline(z);
    }

    public final void ESY(int i) {
        RenderNode renderNode = this.A01;
        if (AnonymousClass7TF.A1S(i, 1)) {
            renderNode.setUseCompositingLayer(true, (Paint) null);
        } else if (AnonymousClass7TF.A1S(i, 2)) {
            renderNode.setUseCompositingLayer(false, (Paint) null);
            renderNode.setHasOverlappingRendering(false);
            return;
        } else {
            renderNode.setUseCompositingLayer(false, (Paint) null);
        }
        renderNode.setHasOverlappingRendering(true);
    }

    public final void EUx(float f) {
        this.A01.setElevation(f);
    }

    public final void Ef4(Outline outline) {
        this.A01.setOutline(outline);
    }

    public final void Efn(float f) {
        this.A01.setPivotX(f);
    }

    public final void Efo(float f) {
        this.A01.setPivotY(f);
    }

    public final boolean Eg8(int i, int i2, int i3, int i4) {
        return this.A01.setPosition(i, i2, i3, i4);
    }

    public final void EiT(C54727HQg hQg) {
        this.A00 = hQg;
        if (Build.VERSION.SDK_INT >= 31) {
            C54745HRd.A00(this.A01, hQg);
        }
    }

    public final void Ej3(float f) {
        this.A01.setRotationX(f);
    }

    public final void Ej4(float f) {
        this.A01.setRotationY(f);
    }

    public final void Ej5(float f) {
        this.A01.setRotationZ(f);
    }

    public final void EjG(float f) {
        this.A01.setScaleX(f);
    }

    public final void EjH(float f) {
        this.A01.setScaleY(f);
    }

    public final void Ell(int i) {
        this.A01.setSpotShadowColor(i);
    }

    public final void EpG(float f) {
        this.A01.setTranslationX(f);
    }

    public final void EpH(float f) {
        this.A01.setTranslationY(f);
    }

    public final int getHeight() {
        return this.A01.getHeight();
    }

    public final int getLeft() {
        return this.A01.getLeft();
    }

    public final int getRight() {
        return this.A01.getRight();
    }

    public final int getWidth() {
        return this.A01.getWidth();
    }

    public C56883IGe(AndroidComposeView androidComposeView) {
        this.A02 = androidComposeView;
    }
}
