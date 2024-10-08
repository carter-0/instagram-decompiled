package X;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.9UE  reason: invalid class name */
public final class AnonymousClass9UE implements C283245Gr {
    public ViewGroup A00;
    public final View A01;
    public final int[] A02 = new int[2];
    public final int A03;
    public final int A04;
    public final boolean A05;
    public final float[] A06 = new float[2];
    public final int[] A07 = new int[2];

    public AnonymousClass9UE(View view, int i, int i2, boolean z) {
        0qQ.A0B(view, 4);
        this.A03 = i;
        this.A04 = i2;
        this.A05 = z;
        this.A01 = view;
    }

    public final void Ahb(Rect rect) {
        float f;
        float f2;
        0qQ.A0B(rect, 0);
        View view = this.A01;
        int[] iArr = this.A07;
        view.getLocationInWindow(iArr);
        float[] fArr = this.A06;
        boolean z = this.A05;
        if (z) {
            f = (((float) view.getWidth()) / 2.0f) + ((float) this.A03);
        } else {
            f = (float) this.A03;
        }
        fArr[0] = f;
        if (z) {
            f2 = (((float) view.getHeight()) / 2.0f) + ((float) this.A04);
        } else {
            f2 = (float) this.A04;
        }
        fArr[1] = f2;
        view.getMatrix().mapVectors(fArr);
        int i = (int) fArr[0];
        int i2 = (int) fArr[1];
        rect.set(i, i2, i, i2);
        rect.offset(iArr[0], iArr[1]);
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
        Ahb(rect);
        return z3;
    }

    public final View Acv() {
        return this.A01;
    }

    public final void EfP(ViewGroup viewGroup) {
        this.A00 = viewGroup;
    }
}
