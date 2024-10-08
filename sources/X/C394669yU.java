package X;

import android.graphics.Matrix;
import android.view.TextureView;
import android.view.ViewGroup;

/* renamed from: X.9yU  reason: invalid class name and case insensitive filesystem */
public abstract class C394669yU {
    public static final 0eP A00(TextureView textureView, int i, int i2, int i3, int i4, boolean z, boolean z2) {
        float f;
        C71492dQ r1;
        ViewGroup.LayoutParams layoutParams = textureView.getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = i2;
        if ((layoutParams instanceof C71492dQ) && (r1 = (C71492dQ) layoutParams) != null) {
            r1.A0F = -1;
        }
        float f2 = (float) i3;
        float f3 = (float) i4;
        boolean z3 = false;
        if (((double) (f2 / f3)) <= 0.5625d) {
            z3 = true;
        }
        if (!z2 || z || z3) {
            float f4 = (float) i;
            float f5 = (float) i2;
            if (!z || z3) {
                f = f4 / f2;
            } else {
                f = f5 / f3;
            }
            0eP A1L = AnonymousClass7TE.A1L(Float.valueOf((f2 / f4) * f), Float.valueOf((f3 / f5) * f));
            layoutParams.width = i;
            layoutParams.height = i2;
            if (z2) {
                Float valueOf = Float.valueOf(Math.max(AnonymousClass7TE.A04(A1L.A00), AnonymousClass7TE.A04(A1L.A01)));
                A1L = new 0eP(valueOf, valueOf);
            }
            Matrix A0U = AnonymousClass7TE.A0U();
            float f6 = f4 / 2.0f;
            float f7 = f5 / 2.0f;
            A0U.setScale(AnonymousClass7TE.A04(A1L.A00), AnonymousClass7TE.A04(A1L.A01), f6, f7);
            textureView.setPivotX(f6);
            textureView.setPivotY(f7);
            textureView.setTransform(A0U);
            return A1L;
        }
        textureView.setTransform((Matrix) null);
        textureView.setLayoutParams(layoutParams);
        Float valueOf2 = Float.valueOf(1.0f);
        return new 0eP(valueOf2, valueOf2);
    }
}
