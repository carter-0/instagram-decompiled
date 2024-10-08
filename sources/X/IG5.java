package X;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;

public final class IG5 implements AnonymousClass5S2 {
    public C3018060d A00 = C3026864w.A00();
    public final Path A01;
    public final float[] A02 = AnonymousClass5S4.A06();

    public final C289315dO AMX(C268024cd r6, AnonymousClass5Q8 r7, long j) {
        AnonymousClass7TF.A1B(r7, 1, r6);
        ((C3018160e) this.A00).A03.rewind();
        Path path = this.A01;
        this.A00 = new C3018160e(path);
        float[] fArr = this.A02;
        AnonymousClass5S4.A02(fArr);
        RectF A0Y = AnonymousClass7TE.A0Y();
        path.computeBounds(A0Y, true);
        float max = Math.max(A0Y.width(), A0Y.height());
        AnonymousClass5S4.A03(fArr, C288025bF.A02(j) / max, C288025bF.A00(j) / max);
        AnonymousClass5S4.A04(fArr, -A0Y.left, -A0Y.top);
        C3018160e r2 = (C3018160e) this.A00;
        Matrix matrix = r2.A00;
        if (matrix == null) {
            matrix = new Matrix();
            r2.A00 = matrix;
        }
        C298435tQ.A00(matrix, fArr);
        Path path2 = r2.A03;
        Matrix matrix2 = r2.A00;
        0qQ.A0A(matrix2);
        path2.transform(matrix2);
        return new C289335dQ(this.A00);
    }

    public IG5(Path path) {
        this.A01 = path;
    }
}
