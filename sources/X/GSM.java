package X;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewParent;

public final class GSM implements AnonymousClass5VT {
    public final float[] A00;
    public final int[] A01 = new int[2];

    public GSM(float[] fArr) {
        this.A00 = fArr;
    }

    private final void A00(View view, float[] fArr) {
        float[] fArr2;
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            A00((View) parent, fArr);
            fArr2 = this.A00;
            AnonymousClass5S4.A02(fArr2);
            AnonymousClass5S4.A04(fArr2, -((float) view.getScrollX()), -((float) view.getScrollY()));
            C285805St.A01(fArr, fArr2);
            AnonymousClass5S4.A02(fArr2);
            AnonymousClass5S4.A04(fArr2, (float) view.getLeft(), (float) view.getTop());
            C285805St.A01(fArr, fArr2);
        } else {
            int[] iArr = this.A01;
            view.getLocationInWindow(iArr);
            fArr2 = this.A00;
            AnonymousClass5S4.A02(fArr2);
            AnonymousClass5S4.A04(fArr2, -((float) view.getScrollX()), -((float) view.getScrollY()));
            C285805St.A01(fArr, fArr2);
            AnonymousClass5S4.A02(fArr2);
            AnonymousClass5S4.A04(fArr2, (float) iArr[0], (float) iArr[1]);
            C285805St.A01(fArr, fArr2);
        }
        Matrix matrix = view.getMatrix();
        if (!matrix.isIdentity()) {
            C298435tQ.A01(matrix, fArr2);
            C285805St.A01(fArr, fArr2);
        }
    }

    public final void AF3(View view, float[] fArr) {
        AnonymousClass5S4.A02(fArr);
        A00(view, fArr);
    }
}
