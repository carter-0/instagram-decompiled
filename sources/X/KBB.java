package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import java.util.List;

public final class KBB extends LBv {
    public final Bitmap A00;
    public final Canvas A01;
    public final Paint A02;
    public final List A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KBB(Paint paint, Q8d q8d, List list) {
        super(q8d);
        AnonymousClass7TG.A1Q(list, paint);
        this.A03 = list;
        this.A02 = paint;
        Bitmap A0B = AnonymousClass7TF.A0B(q8d.A01, q8d.A00);
        this.A00 = A0B;
        this.A01 = JTO.A0B(A0B);
    }
}
