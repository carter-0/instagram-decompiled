package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import java.util.List;

public final class KBC extends LBv {
    public final float A00;
    public final Bitmap A01;
    public final Canvas A02;
    public final Paint A03;
    public final List A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KBC(Paint paint, Q8d q8d, List list) {
        super(q8d);
        AnonymousClass7TG.A1Q(list, paint);
        this.A04 = list;
        this.A03 = paint;
        this.A00 = 0nA.A00(AnonymousClass7TE.A0S(q8d), 2.0f);
        Bitmap A0B = AnonymousClass7TF.A0B(q8d.A01, q8d.A00);
        this.A01 = A0B;
        this.A02 = JTO.A0B(A0B);
    }
}
