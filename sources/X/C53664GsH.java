package X;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* renamed from: X.GsH  reason: case insensitive filesystem */
public final class C53664GsH extends C251343mx {
    public final 2WX A00;
    public final C57542IcU A01;

    public final C251263mp A0X(AnonymousClass3Y5 r12) {
        0qQ.A0B(r12, 0);
        C56082HsV hsV = (C56082HsV) I3I.A02(r12, this.A01);
        long A07 = C51965G9l.A07(hsV.A00);
        Drawable A002 = C55218He9.A00(r12, C58677Ivm.A00(hsV, 10), new Object[]{hsV});
        2WX r5 = this.A00;
        AnonymousClass9JR A0c = C51965G9l.A0c(AnonymousClass05K.A00, 0, A07);
        if (r5 == 2WX.A02) {
            r5 = null;
        }
        return new C53949Gwt(A002, ImageView.ScaleType.CENTER_CROP, C51972G9s.A0T(C51965G9l.A0X(r5, A0c), 0, A07), 0, false);
    }

    public C53664GsH(2WX r1, C57542IcU icU) {
        this.A01 = icU;
        this.A00 = r1;
    }
}
