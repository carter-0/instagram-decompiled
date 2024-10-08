package X;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;

public final class QGi extends C11796Sgi {
    public C11388SRb A00;
    public C11388SRb A01;
    public final Paint A02;
    public final Path A03;
    public final S56 A04;
    public final float[] A05;
    public final RectF A06 = AnonymousClass7TE.A0Y();

    public QGi(Q6Y q6y, S56 s56) {
        super(q6y, s56);
        Paint paint = new Paint();
        this.A02 = paint;
        this.A05 = new float[8];
        this.A03 = C51965G9l.A0C();
        this.A04 = s56;
        paint.setAlpha(0);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(s56.A04);
    }

    public final void AAd(SIR sir, Object obj) {
        super.AAd(sir, obj);
        if (obj == C13881Tj4.A01) {
            if (sir == null) {
                this.A01 = null;
            } else {
                this.A01 = new QGN(sir, (Object) null);
            }
        } else if (obj != C13881Tj4.A0a) {
        } else {
            if (sir == null) {
                this.A00 = null;
                this.A02.setColor(this.A04.A04);
                return;
            }
            this.A00 = QGN.A00(sir);
        }
    }

    public final void Aha(Matrix matrix, RectF rectF, boolean z) {
        super.Aha(matrix, rectF, z);
        RectF rectF2 = this.A06;
        S56 s56 = this.A04;
        rectF2.set(0.0f, 0.0f, (float) s56.A06, (float) s56.A05);
        this.A0A.mapRect(rectF2);
        rectF.set(rectF2);
    }
}
