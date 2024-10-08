package X;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.view.DisplayListCanvas;
import android.view.RenderNode;
import android.view.View;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import java.util.concurrent.atomic.AtomicBoolean;

public final class XEA implements C289225dE {
    public static final AtomicBoolean A0P = new AtomicBoolean(true);
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public int A04;
    public int A05;
    public long A06;
    public long A07 = 0;
    public long A08;
    public boolean A09;
    public float A0A;
    public float A0B;
    public float A0C;
    public float A0D;
    public float A0E;
    public float A0F;
    public Matrix A0G;
    public C54727HQg A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public final RenderNode A0M;
    public final AnonymousClass5R2 A0N;
    public final AnonymousClass5Q5 A0O;

    public /* synthetic */ XEA(View view) {
        AnonymousClass5R2 r1 = new AnonymousClass5R2();
        AnonymousClass5Q5 r0 = new AnonymousClass5Q5();
        this.A0N = r1;
        this.A0O = r0;
        RenderNode create = RenderNode.create("Compose", view);
        this.A0M = create;
        if (A0P.getAndSet(false)) {
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
            C22010Xqx.A02(create, C22010Xqx.A00(create));
            C22010Xqx.A03(create, C22010Xqx.A01(create));
            XFH.A00(this.A0M);
            create.setLayerType(0);
            create.setHasOverlappingRendering(create.hasOverlappingRendering());
        }
        create.setClipToBounds(false);
        RenderNode renderNode = this.A0M;
        renderNode.setLayerType(0);
        renderNode.setLayerPaint((Paint) null);
        renderNode.setHasOverlappingRendering(true);
        this.A05 = 0;
        this.A04 = 3;
        this.A00 = 1.0f;
        this.A02 = 1.0f;
        this.A03 = 1.0f;
        long j = AnonymousClass5RW.A01;
        this.A06 = j;
        this.A08 = j;
        this.A01 = 8.0f;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0015, code lost:
        r4.A0I = r1;
        r4.A0M.setClipToBounds(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001e, code lost:
        if (r2 == r4.A0J) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0020, code lost:
        r4.A0J = r2;
        r4.A0M.setClipToOutline(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0028, code lost:
        r2 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0008, code lost:
        if (r4.A0K != false) goto L_0x000a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000b, code lost:
        if (r3 != false) goto L_0x000d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000f, code lost:
        if (r4.A0K == false) goto L_0x0028;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0013, code lost:
        if (r1 == r4.A0I) goto L_0x001c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A00() {
        /*
            r4 = this;
            boolean r3 = r4.A09
            r2 = 1
            if (r3 == 0) goto L_0x000a
            boolean r0 = r4.A0K
            r1 = 1
            if (r0 == 0) goto L_0x000d
        L_0x000a:
            r1 = 0
            if (r3 == 0) goto L_0x0028
        L_0x000d:
            boolean r0 = r4.A0K
            if (r0 == 0) goto L_0x0028
        L_0x0011:
            boolean r0 = r4.A0I
            if (r1 == r0) goto L_0x001c
            r4.A0I = r1
            android.view.RenderNode r0 = r4.A0M
            r0.setClipToBounds(r1)
        L_0x001c:
            boolean r0 = r4.A0J
            if (r2 == r0) goto L_0x0027
            r4.A0J = r2
            android.view.RenderNode r0 = r4.A0M
            r0.setClipToOutline(r2)
        L_0x0027:
            return
        L_0x0028:
            r2 = 0
            goto L_0x0011
        */
        throw new UnsupportedOperationException("Method not decompiled: X.XEA.A00():void");
    }

    public final Matrix AF2() {
        Matrix matrix = this.A0G;
        if (matrix == null) {
            matrix = new Matrix();
            this.A0G = matrix;
        }
        this.A0M.getMatrix(matrix);
        return matrix;
    }

    public final void APS() {
        XFH.A00(this.A0M);
    }

    public final boolean BAw() {
        return this.A0M.isValid();
    }

    public final void EAi(C268024cd r17, AnonymousClass5Q8 r18, GraphicsLayer graphicsLayer, 0sP r20) {
        AnonymousClass5R3 r14;
        AnonymousClass5QD r10;
        AnonymousClass5QC r9;
        C268024cd r8;
        AnonymousClass5Q8 r5;
        AnonymousClass5QA r4;
        long j;
        GraphicsLayer graphicsLayer2;
        RenderNode renderNode = this.A0M;
        long j2 = this.A07;
        Canvas start = renderNode.start((int) (j2 >> 32), C289005cr.A00(j2));
        try {
            r14 = this.A0N.A00;
            Canvas canvas = r14.A00;
            r14.A00 = start;
            AnonymousClass5Q5 r11 = this.A0O;
            long A012 = C289155d7.A01(this.A07);
            r10 = r11.A03;
            r9 = (AnonymousClass5QC) r10;
            AnonymousClass5QB r0 = r9.A02.A02;
            r8 = r0.A02;
            r5 = r0.A03;
            r4 = r0.A01;
            j = r0.A00;
            graphicsLayer2 = r9.A00;
            r10.EUC(r17);
            r10.Ebv(r18);
            r10.ER3(r14);
            r10.ElR(A012);
            r9.A00 = graphicsLayer;
            r14.EJt();
            r20.invoke(r11);
            r14.EIm();
            r10.EUC(r8);
            r10.Ebv(r5);
            r10.ER3(r4);
            r10.ElR(j);
            r9.A00 = graphicsLayer2;
            r14.A00 = canvas;
            renderNode.end(start);
        } catch (Throwable th) {
            renderNode.end(start);
            throw th;
        }
    }

    public final void EOX(float f) {
        this.A00 = f;
        this.A0M.setAlpha(f);
    }

    public final void EOc(long j) {
        this.A06 = j;
        C22010Xqx.A02(this.A0M, C285595Rx.A00(j));
    }

    public final void EQN(float f) {
        this.A01 = f;
        this.A0M.setCameraDistance(-f);
    }

    public final void ERg(boolean z) {
        this.A09 = z;
        A00();
    }

    public final void ESX(int i) {
        int i2;
        this.A05 = i;
        if (i == 1) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        RenderNode renderNode = this.A0M;
        if (AnonymousClass7TF.A1S(i2, 1)) {
            renderNode.setLayerType(2);
        } else if (AnonymousClass7TF.A1S(i2, 2)) {
            renderNode.setLayerType(0);
            renderNode.setLayerPaint((Paint) null);
            renderNode.setHasOverlappingRendering(false);
            return;
        } else {
            renderNode.setLayerType(0);
        }
        renderNode.setLayerPaint((Paint) null);
        renderNode.setHasOverlappingRendering(true);
    }

    public final void Ef4(Outline outline) {
        this.A0M.setOutline(outline);
        boolean z = false;
        if (outline != null) {
            z = true;
        }
        this.A0K = z;
        A00();
    }

    public final void Eg9(int i, int i2, long j) {
        RenderNode renderNode = this.A0M;
        int i3 = (int) (j >> 32);
        int A002 = C289005cr.A00(j);
        renderNode.setLeftTopRightBottom(i, i2, i3 + i, A002 + i2);
        if (this.A07 != j) {
            if (this.A0L) {
                renderNode.setPivotX(((float) i3) / 2.0f);
                renderNode.setPivotY(((float) A002) / 2.0f);
            }
            this.A07 = j;
        }
    }

    public final void Ej3(float f) {
        this.A0A = f;
        this.A0M.setRotationX(f);
    }

    public final void Ej4(float f) {
        this.A0B = f;
        this.A0M.setRotationY(f);
    }

    public final void Ej5(float f) {
        this.A0C = f;
        this.A0M.setRotation(f);
    }

    public final void EjG(float f) {
        this.A02 = f;
        this.A0M.setScaleX(f);
    }

    public final void EjH(float f) {
        this.A03 = f;
        this.A0M.setScaleY(f);
    }

    public final void Ek7(float f) {
        this.A0D = f;
        this.A0M.setElevation(f);
    }

    public final void Elm(long j) {
        this.A08 = j;
        C22010Xqx.A03(this.A0M, C285595Rx.A00(j));
    }

    public final void EpG(float f) {
        this.A0E = f;
        this.A0M.setTranslationX(f);
    }

    public final void EpH(float f) {
        this.A0F = f;
        this.A0M.setTranslationY(f);
    }

    public final void AQL(AnonymousClass5QA r3) {
        DisplayListCanvas A002 = AnonymousClass5R4.A00(r3);
        0qQ.A0C(A002, "null cannot be cast to non-null type android.view.DisplayListCanvas");
        A002.drawRenderNode(this.A0M);
    }

    public final float AbF() {
        return this.A00;
    }

    public final long AbM() {
        return this.A06;
    }

    public final int Ag3() {
        return 3;
    }

    public final float Ajj() {
        return this.A01;
    }

    public final boolean Ank() {
        return this.A09;
    }

    public final C288195bW Ap0() {
        return null;
    }

    public final int Apj() {
        return this.A05;
    }

    public final C54727HQg Bli() {
        return this.A0H;
    }

    public final float Boj() {
        return this.A0A;
    }

    public final float Bok() {
        return this.A0B;
    }

    public final float Bol() {
        return this.A0C;
    }

    public final float BpX() {
        return this.A02;
    }

    public final float BpY() {
        return this.A03;
    }

    public final float Bt8() {
        return this.A0D;
    }

    public final long ByQ() {
        return this.A08;
    }

    public final float C9c() {
        return this.A0E;
    }

    public final float C9d() {
        return this.A0F;
    }

    public final void EiT(C54727HQg hQg) {
        this.A0H = hQg;
    }

    public final void Efm(long j) {
        RenderNode renderNode;
        float A022;
        if ((j & 9223372034707292159L) == 9205357640488583168L) {
            this.A0L = true;
            renderNode = this.A0M;
            renderNode.setPivotX(((float) ((int) (this.A07 >> 32))) / 2.0f);
            A022 = ((float) C289005cr.A00(this.A07)) / 2.0f;
        } else {
            this.A0L = false;
            renderNode = this.A0M;
            renderNode.setPivotX(C289295dM.A01(j));
            A022 = C289295dM.A02(j);
        }
        renderNode.setPivotY(A022);
    }
}
