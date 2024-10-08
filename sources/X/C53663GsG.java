package X;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import java.util.Arrays;

/* renamed from: X.GsG  reason: case insensitive filesystem */
public final class C53663GsG extends C251343mx {
    public final 2WX A00;
    public final C57545IcX A01;

    public final C251263mp A0X(AnonymousClass3Y5 r12) {
        C59535JNh A002 = I3I.A00(r12);
        C57545IcX icX = this.A01;
        C56081HsU hsU = (C56081HsU) I3I.A02(r12, icX);
        Drawable drawable = (Drawable) AnonymousClass3Zw.A00(r12, C58677Ivm.A00(hsU, 7), Arrays.copyOf(new Object[]{icX, A002}, 2));
        if (drawable == null) {
            drawable = null;
        }
        if (drawable == null) {
            return null;
        }
        long A07 = C51965G9l.A07(hsU.A00);
        AnonymousClass3XV r2 = 2WX.A02;
        2WX A0M = C51974G9v.A0M((2WX) null, AnonymousClass05K.A00, 0, A07);
        2WX r0 = this.A00;
        if (r0 != null) {
            A0M = r0.A00(A0M);
        }
        return new C53949Gwt(drawable, ImageView.ScaleType.CENTER_CROP, A0M, 0, false);
    }

    public C53663GsG(2WX r1, C57545IcX icX) {
        this.A01 = icX;
        this.A00 = r1;
    }
}
