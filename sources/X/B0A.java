package X;

import android.graphics.Matrix;
import android.graphics.Path;
import java.util.Arrays;

public final class B0A extends 0Yg implements 0sJ {
    public final /* synthetic */ float A00;
    public final /* synthetic */ float A01;
    public final /* synthetic */ C354428Lz A02;
    public final /* synthetic */ float[] A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public B0A(C354428Lz r2, float[] fArr, float f, float f2) {
        super(4);
        this.A02 = r2;
        this.A03 = fArr;
        this.A01 = f;
        this.A00 = f2;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        float A04 = AnonymousClass7TE.A04(obj);
        float A042 = AnonymousClass7TE.A04(obj2);
        float A043 = AnonymousClass7TE.A04(obj3);
        float A044 = AnonymousClass7TE.A04(obj4);
        Path path = this.A02.A06;
        float[] copyOf = Arrays.copyOf(this.A03, 8);
        0qQ.A07(copyOf);
        float f = this.A01;
        float f2 = this.A00;
        0qQ.A0B(path, 1);
        Matrix A0U = AnonymousClass7TE.A0U();
        A0U.preTranslate(0.0f, 0.5f - ((0.5625f / f) / 2.0f));
        float f3 = A04 * 3.0f;
        float f4 = 0.5625f / 2.0f;
        A0U.postScale(f3, f3, f4, 0.5f);
        A0U.postRotate(A042, f4, 0.5f);
        A0U.postTranslate(A043 * f2 * 0.5625f, A044 * f2);
        A0U.mapPoints(copyOf);
        Path path2 = new Path();
        path2.moveTo(copyOf[0], copyOf[1]);
        path2.lineTo(copyOf[2], copyOf[3]);
        path2.lineTo(copyOf[4], copyOf[5]);
        path2.lineTo(copyOf[6], copyOf[7]);
        path2.lineTo(copyOf[0], copyOf[1]);
        Path path3 = new Path();
        path3.op(path, path2, Path.Op.INTERSECT);
        return Boolean.valueOf(!path3.isEmpty());
    }
}
