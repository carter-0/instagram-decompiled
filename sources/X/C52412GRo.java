package X;

import com.instagram.compose.ui.gradientspinner.BezierControlPoints;
import java.util.List;

/* renamed from: X.GRo  reason: case insensitive filesystem */
public final class C52412GRo {
    public static final C286015Tp A0C = C305126Gq.A00(GSR.A00, C52370GPr.A00);
    public float A00;
    public float A01;
    public Float A02;
    public final float A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final JNL A08;
    public final C284945Oz A09 = C51970G9q.A0S(AnonymousClass7TE.A0u());
    public final BezierControlPoints A0A;
    public final List A0B;

    public C52412GRo(BezierControlPoints bezierControlPoints, List list, float f, int i, int i2, int i3, int i4) {
        DbW.A1O(list, 1, bezierControlPoints);
        this.A0B = list;
        this.A07 = i;
        this.A06 = i2;
        this.A04 = i3;
        this.A05 = i4;
        this.A0A = bezierControlPoints;
        this.A03 = f;
        this.A08 = new C7227Pzw(bezierControlPoints.A00, bezierControlPoints.A02, bezierControlPoints.A01, bezierControlPoints.A03);
    }
}
