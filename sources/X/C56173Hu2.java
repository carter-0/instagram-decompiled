package X;

import android.graphics.Rect;
import android.view.View;

/* renamed from: X.Hu2  reason: case insensitive filesystem */
public abstract class C56173Hu2 {
    public static final Rect A00(View view, View view2, AnonymousClass5QZ r8) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int[] iArr2 = new int[2];
        view2.getLocationOnScreen(iArr2);
        C268794e0 A00 = C56608I4i.A00(((AnonymousClass5QY) r8).A01);
        if (A00 == null) {
            return null;
        }
        AnonymousClass5VN A02 = C56608I4i.A02(A00);
        int i = iArr[0];
        int i2 = iArr2[0];
        int i3 = iArr[1];
        int i4 = iArr2[1];
        return new Rect((((int) A02.A01) + i) - i2, (((int) A02.A03) + i3) - i4, (((int) A02.A02) + i) - i2, (((int) A02.A00) + i3) - i4);
    }

    public static final View A01(C267794cD r0) {
        View view;
        C52849Gdi gdi = AnonymousClass5WH.A02(r0.A03).A0E;
        if (gdi != null && (view = gdi.A0J) != null) {
            return view;
        }
        throw AnonymousClass7TE.A0z("Could not fetch interop view");
    }
}
