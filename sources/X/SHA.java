package X;

import android.graphics.PointF;
import java.util.List;

public final class SHA {
    public PointF A00;
    public boolean A01;
    public final List A02;

    public SHA(PointF pointF, List list, boolean z) {
        this.A00 = pointF;
        this.A01 = z;
        this.A02 = AnonymousClass7TE.A1D(list);
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("ShapeData{numCurves=");
        A1A.append(this.A02.size());
        A1A.append("closed=");
        A1A.append(this.A01);
        return Pxg.A0x(A1A);
    }

    public SHA() {
        this.A02 = AnonymousClass7TE.A1C();
    }
}
