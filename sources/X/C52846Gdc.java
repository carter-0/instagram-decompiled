package X;

import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.compose.ui.graphics.layer.GraphicsLayer;

/* renamed from: X.Gdc  reason: case insensitive filesystem */
public final class C52846Gdc extends View {
    public static final ViewOutlineProvider A0A = new C52850Gdj(0);
    public Outline A00;
    public GraphicsLayer A01;
    public C268024cd A02 = AnonymousClass5Q6.A00;
    public AnonymousClass5Q8 A03 = AnonymousClass5Q8.Ltr;
    public 0sP A04 = C56475Hz7.A00;
    public boolean A05 = true;
    public boolean A06;
    public final View A07;
    public final AnonymousClass5R2 A08;
    public final AnonymousClass5Q5 A09;

    public final void forceLayout() {
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    /* JADX INFO: finally extract failed */
    public final void dispatchDraw(Canvas canvas) {
        AnonymousClass5R3 r13 = this.A08.A00;
        Canvas canvas2 = r13.A00;
        r13.A00 = canvas;
        AnonymousClass5Q5 r12 = this.A09;
        C268024cd r17 = this.A02;
        AnonymousClass5Q8 r16 = this.A03;
        long A002 = C288015bE.A00(AnonymousClass7TE.A02(this), AnonymousClass7TE.A03(this));
        GraphicsLayer graphicsLayer = this.A01;
        0sP r11 = this.A04;
        AnonymousClass5QD r10 = r12.A03;
        AnonymousClass5QC r9 = (AnonymousClass5QC) r10;
        AnonymousClass5QB r0 = r9.A02.A02;
        C268024cd r8 = r0.A02;
        AnonymousClass5Q8 r7 = r0.A03;
        AnonymousClass5QA r4 = r0.A01;
        long j = r0.A00;
        GraphicsLayer graphicsLayer2 = r9.A00;
        r10.EUC(r17);
        r10.Ebv(r16);
        r10.ER3(r13);
        r10.ElR(A002);
        r9.A00 = graphicsLayer;
        r13.EJt();
        try {
            r11.invoke(r12);
            C51972G9s.A12(r13, r4, r10, r8, r7);
            r10.ElR(j);
            r9.A00 = graphicsLayer2;
            r13.A00 = canvas2;
            this.A06 = false;
        } catch (Throwable th) {
            C51972G9s.A12(r13, r4, r10, r8, r7);
            r10.ElR(j);
            r9.A00 = graphicsLayer2;
            throw th;
        }
    }

    public final boolean getCanUseCompositingLayer$ui_graphics_release() {
        return this.A05;
    }

    public final AnonymousClass5R2 getCanvasHolder() {
        return this.A08;
    }

    public final View getOwnerView() {
        return this.A07;
    }

    public final boolean hasOverlappingRendering() {
        return this.A05;
    }

    public final void setCanUseCompositingLayer$ui_graphics_release(boolean z) {
        if (this.A05 != z) {
            this.A05 = z;
            invalidate();
        }
    }

    public final void setDrawParams(C268024cd r1, AnonymousClass5Q8 r2, GraphicsLayer graphicsLayer, 0sP r4) {
        this.A02 = r1;
        this.A03 = r2;
        this.A04 = r4;
        this.A01 = graphicsLayer;
    }

    public C52846Gdc(View view, AnonymousClass5R2 r3, AnonymousClass5Q5 r4) {
        super(view.getContext());
        this.A07 = view;
        this.A08 = r3;
        this.A09 = r4;
        setOutlineProvider(A0A);
        setWillNotDraw(false);
        setClipBounds((Rect) null);
    }

    public final void invalidate() {
        int A032 = AnonymousClass0fD.A03(1054330291);
        if (!this.A06) {
            this.A06 = true;
            super.invalidate();
        }
        AnonymousClass0fD.A0A(-50921733, A032);
    }

    public final void setInvalidated(boolean z) {
        this.A06 = z;
    }
}
