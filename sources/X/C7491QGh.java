package X;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;

/* renamed from: X.QGh  reason: case insensitive filesystem */
public final class C7491QGh extends C11796Sgi {
    public C11388SRb A00;
    public C11388SRb A01;
    public final Paint A02 = new Paint(3);
    public final Rect A03 = AnonymousClass7TE.A0W();
    public final Rect A04 = AnonymousClass7TE.A0W();
    public final C10765Rxj A05;

    public C7491QGh(Q6Y q6y, S56 s56) {
        super(q6y, s56);
        C10765Rxj rxj;
        String str = s56.A0K;
        S7N s7n = q6y.A0G;
        if (s7n == null) {
            rxj = null;
        } else {
            rxj = (C10765Rxj) s7n.A02().get(str);
        }
        this.A05 = rxj;
    }

    public final void AAd(SIR sir, Object obj) {
        super.AAd(sir, obj);
        QGN qgn = null;
        if (obj == C13881Tj4.A01) {
            if (sir == null) {
                this.A00 = null;
            } else {
                this.A00 = new QGN(sir, (Object) null);
            }
        } else if (obj == C13881Tj4.A00) {
            if (sir != null) {
                qgn = QGN.A00(sir);
            }
            this.A01 = qgn;
        }
    }

    public final void Aha(Matrix matrix, RectF rectF, boolean z) {
        super.Aha(matrix, rectF, z);
        C10765Rxj rxj = this.A05;
        if (rxj != null) {
            float A002 = SSo.A00();
            rectF.set(0.0f, 0.0f, ((float) rxj.A02) * A002, ((float) rxj.A01) * A002);
            this.A0A.mapRect(rectF);
        }
    }
}
