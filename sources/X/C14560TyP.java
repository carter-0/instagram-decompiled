package X;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;

/* renamed from: X.TyP  reason: case insensitive filesystem */
public final class C14560TyP extends View {
    public final Drawable A00;

    public static int A00(boolean z, boolean z2) {
        C21255XRa xRa;
        if (z2 || z) {
            xRa = C21255XRa.A2M;
        } else {
            xRa = C21255XRa.A0A;
        }
        return 1Kq.A03(xRa, z);
    }

    public void setIsSwirlAnimating(boolean z) {
        Drawable drawable = this.A00;
        if (drawable instanceof U15) {
            ((U15) drawable).A01(z);
        }
    }

    public C14560TyP(Context context, C361838gt r5, EX7 ex7, C307796Rn r7, float[] fArr, float f, int i) {
        super(context);
        boolean CRA = r7.CRA();
        Integer num = AnonymousClass05K.A0u;
        0qQ.A0B(r5, 0);
        if (C21115XFf.A00(r5).AVl(num)) {
            this.A00 = new C14570TyZ(i, fArr);
            setLayerType(2, (Paint) null);
            setAlpha(f);
        } else {
            U15 u15 = new U15(context, fArr, i, CRA);
            this.A00 = u15;
            if (ex7.equals(EX7.ANIMATED)) {
                u15.A01(true);
            }
        }
        setBackground(this.A00);
    }

    public final void A01(int i, int i2) {
        setMeasuredDimension(i, i2);
    }
}
