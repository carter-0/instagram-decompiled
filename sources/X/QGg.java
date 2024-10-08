package X;

import android.graphics.Matrix;
import android.graphics.RectF;
import java.util.Collections;

public final class QGg extends C11796Sgi {
    public final C11790Sgc A00;
    public final C7492QGj A01;

    public QGg(S7N s7n, Q6Y q6y, C7492QGj qGj, S56 s56) {
        super(q6y, s56);
        this.A01 = qGj;
        C11790Sgc sgc = new C11790Sgc(s7n, q6y, new C11811Sgx("__container", s56.A0N, false), this);
        this.A00 = sgc;
        sgc.ESm(Collections.emptyList(), Collections.emptyList());
    }

    public final void Aha(Matrix matrix, RectF rectF, boolean z) {
        super.Aha(matrix, rectF, z);
        this.A00.Aha(this.A0A, rectF, z);
    }
}
