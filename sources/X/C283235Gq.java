package X;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.5Gq  reason: invalid class name and case insensitive filesystem */
public final class C283235Gq implements C283245Gr {
    public ViewGroup A00;
    public final View A01;
    public final int[] A02 = new int[2];
    public final Matrix A03 = new Matrix();
    public final RectF A04 = new RectF();
    public final int[] A05 = new int[2];

    public C283235Gq(View view) {
        0qQ.A0B(view, 1);
        this.A01 = view;
    }

    public final void Ahb(Rect rect) {
        float rotation;
        0qQ.A0B(rect, 0);
        View view = this.A01;
        if (view.getRotation() == 0.0f) {
            rotation = 0.0f;
        } else {
            rotation = view.getRotation();
            view.setRotation(0.0f);
        }
        int[] iArr = this.A05;
        view.getLocationInWindow(iArr);
        int A012 = AnonymousClass1GB.A01(((float) view.getWidth()) * view.getScaleX());
        int A013 = AnonymousClass1GB.A01(((float) view.getHeight()) * view.getScaleY());
        int i = iArr[0];
        int i2 = iArr[1];
        rect.set(i, i2, A012 + i, A013 + i2);
        if (rotation != 0.0f) {
            RectF rectF = this.A04;
            rectF.set(rect);
            Matrix matrix = this.A03;
            matrix.reset();
            matrix.setRotate(rotation, rectF.centerX(), rectF.centerY());
            matrix.mapRect(rectF);
            rectF.round(rect);
            view.setRotation(rotation);
        }
        ViewGroup viewGroup = this.A00;
        if (viewGroup != null) {
            viewGroup.getLocationInWindow(this.A02);
        }
        int[] iArr2 = this.A02;
        rect.offset(-iArr2[0], -iArr2[1]);
    }

    public final boolean CFc(Rect rect, boolean z, boolean z2) {
        0qQ.A0B(rect, 0);
        View view = this.A01;
        boolean z3 = true;
        if (!view.isShown() || ((z2 && !view.getGlobalVisibleRect(rect)) || (z && view.getVisibility() != 0))) {
            z3 = false;
        }
        ViewGroup viewGroup = this.A00;
        if (viewGroup != null) {
            viewGroup.getLocationInWindow(this.A02);
        }
        int[] iArr = this.A02;
        rect.offset(-iArr[0], -iArr[1]);
        return z3;
    }

    public final View Acv() {
        return this.A01;
    }

    public final void EfP(ViewGroup viewGroup) {
        this.A00 = viewGroup;
    }
}
