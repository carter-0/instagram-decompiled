package X;

import android.graphics.Canvas;
import android.graphics.Point;
import android.view.View;

/* renamed from: X.GdZ  reason: case insensitive filesystem */
public final class C52843GdZ extends View.DragShadowBuilder {
    public final long A00;
    public final C268024cd A01;
    public final 0sP A02;

    public final void onDrawShadow(Canvas canvas) {
        AnonymousClass5Q5 r12 = new AnonymousClass5Q5();
        C268024cd r11 = this.A01;
        long j = this.A00;
        AnonymousClass5Q8 r10 = AnonymousClass5Q8.Ltr;
        Canvas canvas2 = AnonymousClass5R4.A00;
        AnonymousClass5R3 r9 = new AnonymousClass5R3();
        r9.A00 = canvas;
        0sP r8 = this.A02;
        AnonymousClass5QB r7 = r12.A02;
        C268024cd r6 = r7.A02;
        AnonymousClass5Q8 r3 = r7.A03;
        AnonymousClass5QA r2 = r7.A01;
        long j2 = r7.A00;
        r7.A02 = r11;
        r7.A03 = r10;
        r7.A01 = r9;
        r7.A00 = j;
        r9.EJt();
        r8.invoke(r12);
        r9.EIm();
        r7.A02 = r6;
        r7.A03 = r3;
        r7.A01 = r2;
        r7.A00 = j2;
    }

    public final void onProvideShadowMetrics(Point point, Point point2) {
        C268024cd r4 = this.A01;
        long j = this.A00;
        point.set(r4.EJS(r4.Ezv(C288025bF.A02(j))), r4.EJS(r4.Ezv(C288025bF.A00(j))));
        point2.set(point.x / 2, point.y / 2);
    }

    public C52843GdZ(C268024cd r1, 0sP r2, long j) {
        this.A01 = r1;
        this.A00 = j;
        this.A02 = r2;
    }
}
