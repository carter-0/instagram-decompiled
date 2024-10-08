package X;

import android.graphics.PointF;
import com.instagram.ui.widget.drawing.common.Point2;

/* renamed from: X.WeN  reason: case insensitive filesystem */
public final class C19721WeN implements XAU {
    public double A00;
    public C17887Vhe A01;
    public final float A02;
    public final float A03;
    public final Point2 A04 = new PointF(0.0f, 0.0f);
    public final Point2 A05 = new PointF(0.0f, 0.0f);
    public final Point2 A06 = new PointF(0.0f, 0.0f);
    public final Point2 A07 = new PointF(0.0f, 0.0f);

    public final void EXZ(C18735VzF vzF) {
        0qQ.A0B(vzF, 0);
        this.A05.set(vzF.A04);
        long j = vzF.A03;
        while (this.A00 + 8.0d < ((double) j)) {
            A00();
        }
    }

    public final void Ewg(C18735VzF vzF) {
        0qQ.A0B(vzF, 0);
        this.A01 = new C17887Vhe(vzF.A04, vzF.A03);
        this.A00 = (double) vzF.A03;
        this.A06.set(vzF.A04);
        this.A07.set(0.0f, 0.0f);
    }

    public final void A00() {
        Point2 point2 = this.A04;
        Point2 point22 = this.A05;
        Point2 point23 = this.A06;
        float f = point22.x - point23.x;
        point2.x = f;
        float f2 = point22.y - point23.y;
        point2.y = f2;
        float f3 = this.A03;
        float f4 = f * f3;
        point2.x = f4;
        float f5 = f2 * f3;
        point2.y = f5;
        Point2 point24 = this.A07;
        float f6 = point24.x + f4;
        point24.x = f6;
        float f7 = point24.y + f5;
        point24.y = f7;
        float f8 = this.A02;
        float f9 = f6 * f8;
        point24.x = f9;
        float f10 = f7 * f8;
        point24.y = f10;
        point23.x += f9;
        point23.y += f10;
        this.A00 += 8.0d;
        C17887Vhe vhe = this.A01;
        0qQ.A0A(vhe);
        vhe.A00(point23, (long) this.A00);
    }

    public final void AIc(long j) {
        Point2 point2 = this.A06;
        Point2 point22 = this.A05;
        float A002 = (float) JTR.A00(point2.x - point22.x, point2.y - point22.y);
        float f = A002;
        PointF pointF = new PointF(0.0f, 0.0f);
        while (f > 0.0f && A002 > 0.0f) {
            pointF.set(point2);
            A00();
            A002 = (float) JTR.A00(point2.x - pointF.x, point2.y - pointF.y);
            f -= A002;
        }
    }

    public final C18618VvB BtS() {
        C17887Vhe vhe = this.A01;
        0qQ.A0A(vhe);
        C18618VvB vvB = vhe.A02;
        0qQ.A07(vvB);
        return vvB;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [android.graphics.PointF, com.instagram.ui.widget.drawing.common.Point2] */
    /* JADX WARNING: type inference failed for: r0v1, types: [android.graphics.PointF, com.instagram.ui.widget.drawing.common.Point2] */
    /* JADX WARNING: type inference failed for: r0v2, types: [android.graphics.PointF, com.instagram.ui.widget.drawing.common.Point2] */
    /* JADX WARNING: type inference failed for: r0v3, types: [android.graphics.PointF, com.instagram.ui.widget.drawing.common.Point2] */
    public C19721WeN(float f, float f2) {
        this.A03 = f;
        this.A02 = f2;
    }
}
