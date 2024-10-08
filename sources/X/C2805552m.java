package X;

import android.content.res.ColorStateList;
import android.graphics.Rect;
import androidx.cardview.widget.CardView;

/* renamed from: X.52m  reason: invalid class name and case insensitive filesystem */
public final class C2805552m implements C2805652n {
    public final void Ecn(C2805852p r5, float f) {
        C2805752o r0 = (C2805752o) r5;
        C2806052r r3 = (C2806052r) r0.A00;
        CardView cardView = r0.A01;
        boolean z = cardView.A00;
        boolean z2 = cardView.A01;
        if (!(f == r3.A00 && r3.A03 == z && r3.A04 == z2)) {
            r3.A00 = f;
            r3.A03 = z;
            r3.A04 = z2;
            C2806052r.A00((Rect) null, r3);
            r3.invalidateSelf();
        }
        FL2(r5);
    }

    public final void EPU(ColorStateList colorStateList, C2805852p r6) {
        C2806052r r3 = (C2806052r) ((C2805752o) r6).A00;
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        r3.A02 = colorStateList;
        r3.A08.setColor(colorStateList.getColorForState(r3.getState(), r3.A02.getDefaultColor()));
        r3.invalidateSelf();
    }

    public final void FL2(C2805852p r12) {
        int i;
        int i2;
        int i3;
        int i4;
        C2805752o r122 = (C2805752o) r12;
        CardView cardView = r122.A01;
        if (!cardView.A00) {
            cardView.A03.set(0, 0, 0, 0);
            Rect rect = cardView.A02;
            i = rect.left;
            i2 = rect.top;
            i3 = rect.right;
            i4 = rect.bottom;
        } else {
            C2806052r r0 = (C2806052r) r122.A00;
            float f = r0.A00;
            float f2 = r0.A01;
            boolean z = cardView.A01;
            float f3 = f;
            double d = U0Y.A00;
            if (z) {
                f3 = (float) (((double) f) + ((1.0d - d) * ((double) f2)));
            }
            int ceil = (int) Math.ceil((double) f3);
            float f4 = f * 1.5f;
            if (z) {
                f4 = (float) (((double) f4) + ((1.0d - U0Y.A00) * ((double) f2)));
            }
            int ceil2 = (int) Math.ceil((double) f4);
            cardView.A03.set(ceil, ceil2, ceil, ceil2);
            Rect rect2 = cardView.A02;
            i = ceil + rect2.left;
            i2 = ceil2 + rect2.top;
            i3 = ceil + rect2.right;
            i4 = ceil2 + rect2.bottom;
        }
        C2805552m.super.setPadding(i, i2, i3, i4);
    }
}
