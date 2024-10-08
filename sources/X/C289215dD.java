package X;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.os.Build;
import androidx.compose.ui.graphics.layer.GraphicsLayer;

/* renamed from: X.5dD  reason: invalid class name and case insensitive filesystem */
public final class C289215dD implements C289225dE {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public int A04;
    public int A05;
    public long A06;
    public long A07 = 0;
    public long A08;
    public C54727HQg A09;
    public boolean A0A;
    public float A0B;
    public float A0C;
    public float A0D;
    public float A0E;
    public float A0F;
    public float A0G;
    public Matrix A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public final RenderNode A0L;
    public final AnonymousClass5R2 A0M;
    public final AnonymousClass5Q5 A0N;

    public /* synthetic */ C289215dD() {
        AnonymousClass5R2 r1 = new AnonymousClass5R2();
        AnonymousClass5Q5 r0 = new AnonymousClass5Q5();
        this.A0M = r1;
        this.A0N = r0;
        RenderNode renderNode = new RenderNode("graphicsLayer");
        this.A0L = renderNode;
        renderNode.setClipToBounds(false);
        renderNode.setUseCompositingLayer(false, (Paint) null);
        renderNode.setHasOverlappingRendering(true);
        this.A00 = 1.0f;
        this.A04 = 3;
        this.A02 = 1.0f;
        this.A03 = 1.0f;
        long j = AnonymousClass5RW.A01;
        this.A06 = j;
        this.A08 = j;
        this.A01 = 8.0f;
        this.A05 = 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0015, code lost:
        r4.A0I = r1;
        r4.A0L.setClipToBounds(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001e, code lost:
        if (r2 == r4.A0J) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0020, code lost:
        r4.A0J = r2;
        r4.A0L.setClipToOutline(r2);
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
            boolean r3 = r4.A0A
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
            android.graphics.RenderNode r0 = r4.A0L
            r0.setClipToBounds(r1)
        L_0x001c:
            boolean r0 = r4.A0J
            if (r2 == r0) goto L_0x0027
            r4.A0J = r2
            android.graphics.RenderNode r0 = r4.A0L
            r0.setClipToOutline(r2)
        L_0x0027:
            return
        L_0x0028:
            r2 = 0
            goto L_0x0011
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C289215dD.A00():void");
    }

    public final Matrix AF2() {
        Matrix matrix = this.A0H;
        if (matrix == null) {
            matrix = new Matrix();
            this.A0H = matrix;
        }
        this.A0L.getMatrix(matrix);
        return matrix;
    }

    public final void APS() {
        this.A0L.discardDisplayList();
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
        return this.A0A;
    }

    public final C288195bW Ap0() {
        return null;
    }

    public final int Apj() {
        return this.A05;
    }

    public final boolean BAw() {
        return this.A0L.hasDisplayList();
    }

    public final C54727HQg Bli() {
        return this.A09;
    }

    public final float Boj() {
        return this.A0B;
    }

    public final float Bok() {
        return this.A0C;
    }

    public final float Bol() {
        return this.A0D;
    }

    public final float BpX() {
        return this.A02;
    }

    public final float BpY() {
        return this.A03;
    }

    public final float Bt8() {
        return this.A0E;
    }

    public final long ByQ() {
        return this.A08;
    }

    public final float C9c() {
        return this.A0F;
    }

    public final float C9d() {
        return this.A0G;
    }

    public final void EAi(C268024cd r8, AnonymousClass5Q8 r9, GraphicsLayer graphicsLayer, 0sP r11) {
        RenderNode renderNode = this.A0L;
        RecordingCanvas beginRecording = renderNode.beginRecording();
        try {
            AnonymousClass5R3 r5 = this.A0M.A00;
            Canvas canvas = r5.A00;
            r5.A00 = beginRecording;
            AnonymousClass5Q5 r3 = this.A0N;
            AnonymousClass5QD r2 = r3.A03;
            r2.EUC(r8);
            r2.Ebv(r9);
            ((AnonymousClass5QC) r2).A00 = graphicsLayer;
            r2.ElR(this.A07);
            r2.ER3(r5);
            r11.invoke(r3);
            r5.A00 = canvas;
        } finally {
            renderNode.endRecording();
        }
    }

    public final void EOX(float f) {
        this.A00 = f;
        this.A0L.setAlpha(f);
    }

    public final void EOc(long j) {
        this.A06 = j;
        this.A0L.setAmbientShadowColor(C285595Rx.A00(j));
    }

    public final void EQN(float f) {
        this.A01 = f;
        this.A0L.setCameraDistance(f);
    }

    public final void ERg(boolean z) {
        this.A0A = z;
        A00();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0008, code lost:
        if (r4.A09 != null) goto L_0x000a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void ESX(int r5) {
        /*
            r4 = this;
            r4.A05 = r5
            r0 = 1
            if (r5 == r0) goto L_0x000a
            X.HQg r0 = r4.A09
            r1 = 0
            if (r0 == 0) goto L_0x000b
        L_0x000a:
            r1 = 1
        L_0x000b:
            android.graphics.RenderNode r3 = r4.A0L
            if (r1 == 0) goto L_0x0010
            r5 = 1
        L_0x0010:
            r2 = 1
            if (r5 != r2) goto L_0x001b
            r0 = 0
            r3.setUseCompositingLayer(r2, r0)
        L_0x0017:
            r3.setHasOverlappingRendering(r2)
            return
        L_0x001b:
            r1 = 0
            r0 = 0
            r3.setUseCompositingLayer(r1, r0)
            goto L_0x0017
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C289215dD.ESX(int):void");
    }

    public final void Ef4(Outline outline) {
        this.A0L.setOutline(outline);
        boolean z = false;
        if (outline != null) {
            z = true;
        }
        this.A0K = z;
        A00();
    }

    public final void Eg9(int i, int i2, long j) {
        this.A0L.setPosition(i, i2, ((int) (j >> 32)) + i, C289005cr.A00(j) + i2);
        this.A07 = C289155d7.A01(j);
    }

    public final void EiT(C54727HQg hQg) {
        this.A09 = hQg;
        if (Build.VERSION.SDK_INT >= 31) {
            HRP.A00(this.A0L, hQg);
        }
    }

    public final void Ej3(float f) {
        this.A0B = f;
        this.A0L.setRotationX(f);
    }

    public final void Ej4(float f) {
        this.A0C = f;
        this.A0L.setRotationY(f);
    }

    public final void Ej5(float f) {
        this.A0D = f;
        this.A0L.setRotationZ(f);
    }

    public final void EjG(float f) {
        this.A02 = f;
        this.A0L.setScaleX(f);
    }

    public final void EjH(float f) {
        this.A03 = f;
        this.A0L.setScaleY(f);
    }

    public final void Ek7(float f) {
        this.A0E = f;
        this.A0L.setElevation(f);
    }

    public final void Elm(long j) {
        this.A08 = j;
        this.A0L.setSpotShadowColor(C285595Rx.A00(j));
    }

    public final void EpG(float f) {
        this.A0F = f;
        this.A0L.setTranslationX(f);
    }

    public final void EpH(float f) {
        this.A0G = f;
        this.A0L.setTranslationY(f);
    }

    public final void AQL(AnonymousClass5QA r3) {
        AnonymousClass5R4.A00(r3).drawRenderNode(this.A0L);
    }

    public final void Efm(long j) {
        if ((j & 9223372034707292159L) == 9205357640488583168L) {
            this.A0L.resetPivot();
            return;
        }
        RenderNode renderNode = this.A0L;
        renderNode.setPivotX(C289295dM.A01(j));
        renderNode.setPivotY(C289295dM.A02(j));
    }
}
