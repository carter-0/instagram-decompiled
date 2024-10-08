package X;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import java.util.List;

public final class I13 {
    public Paint A00;
    public Paint A01;
    public Paint A02;
    public C53405Gnx A03;
    public C53407Gnz A04;
    public C53408Go0 A05;
    public final 01e A06;
    public final 0vW A07;

    public final Path A00(C53418GoA goA, C53426GoI goI) {
        Path.FillType fillType;
        0qQ.A0B(goA, 0);
        01e r5 = this.A06;
        Path path = (Path) r5.A02(AnonymousClass7TE.A1L(goA, goI));
        if (path == null) {
            path = C51965G9l.A0C();
            if (goA.A00 == 0) {
                fillType = Path.FillType.WINDING;
            } else {
                fillType = Path.FillType.EVEN_ODD;
            }
            if (path.getFillType() != fillType) {
                path.setFillType(fillType);
            }
            List list = goA.A01;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ((C59539JNl) list.get(i)).AC7(path, this);
            }
            r5.A05(AnonymousClass7TE.A1L(goA, goI), path);
        }
        return path;
    }

    public final void A01(C53426GoI goI, 0sP r4) {
        0qQ.A0B(goI, 0);
        0vW r1 = this.A07;
        Matrix matrix = (Matrix) r1.A7A();
        if (matrix == null) {
            matrix = new Matrix();
        }
        goI.AC6(matrix);
        r4.invoke(matrix);
        matrix.reset();
        r1.ECR(matrix);
    }

    public I13(int i, int i2) {
        this.A07 = new 0vW(i);
        this.A06 = new 01e(i2);
    }

    public I13() {
        this(5, 10);
    }
}
