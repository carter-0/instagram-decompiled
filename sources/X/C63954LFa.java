package X;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;

/* renamed from: X.LFa  reason: case insensitive filesystem */
public final class C63954LFa {
    public int A00;
    public int A01;
    public final Paint A02;
    public final int A03;
    public final Rect A04;
    public final boolean A05;
    public final boolean A06;
    public final float[] A07;
    public final float[] A08;
    public final float[] A09 = {0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
    public final float[] A0A;

    public C63954LFa(Paint paint, float f, int i, int i2, int i3, boolean z, boolean z2) {
        this.A02 = paint;
        this.A01 = i;
        this.A00 = i2;
        this.A03 = i3;
        this.A05 = z;
        this.A06 = z2;
        this.A08 = new float[]{f, f, 0.0f, 0.0f, 0.0f, 0.0f, f, f};
        this.A0A = new float[]{0.0f, 0.0f, f, f, f, f, 0.0f, 0.0f};
        this.A07 = new float[]{f, f, f, f, f, f, f, f};
        this.A04 = AnonymousClass7TE.A0W();
    }

    public final Path A00() {
        float[] fArr;
        Rect rect = this.A04;
        rect.set(this.A01, 0, this.A00, this.A03);
        Path A0C = C51965G9l.A0C();
        RectF rectF = new RectF((float) rect.left, (float) rect.top, (float) rect.right, (float) rect.bottom);
        boolean z = this.A05;
        boolean z2 = this.A06;
        if (z) {
            if (z2) {
                fArr = this.A07;
            } else {
                fArr = this.A08;
            }
        } else if (z2) {
            fArr = this.A0A;
        } else {
            fArr = this.A09;
        }
        A0C.addRoundRect(rectF, fArr, Path.Direction.CW);
        return A0C;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("DrawableSegment(startPos=");
        A1A.append(this.A01);
        A1A.append(", endPos=");
        A1A.append(this.A00);
        A1A.append(", height=");
        A1A.append(this.A03);
        A1A.append(", isFirst=");
        A1A.append(this.A05);
        A1A.append(", isLast=");
        return G9t.A1C(A1A, this.A06);
    }
}
