package X;

import android.graphics.PointF;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/* renamed from: X.VvB  reason: case insensitive filesystem */
public final class C18618VvB {
    public static final PointF A09 = new PointF(0.0f, 0.0f);
    public float A00 = 0.0f;
    public float A01 = 1.0f;
    public float A02 = 0.0f;
    public float A03 = 1.0f;
    public C18610Vv3 A04;
    public float A05 = 0.0f;
    public float A06;
    public C18610Vv3 A07;
    public final NavigableMap A08 = new TreeMap();

    public final void A01(float[] fArr, int i) {
        float f;
        float A002;
        float f2 = ((float) i) * this.A03;
        if (f2 < this.A01 || f2 > this.A00) {
            Map.Entry floorEntry = this.A08.floorEntry(Float.valueOf(f2));
            if (floorEntry == null) {
                this.A04 = null;
                this.A01 = 1.0f;
                A002 = 0.0f;
            } else {
                this.A04 = (C18610Vv3) floorEntry.getValue();
                float A042 = AnonymousClass7TE.A04(floorEntry.getKey());
                this.A01 = A042;
                A002 = A042 + this.A04.A00();
            }
            this.A00 = A002;
        }
        C18610Vv3 vv3 = this.A04;
        if (vv3 != null) {
            f = (f2 - this.A01) / vv3.A00();
        } else {
            vv3 = this.A07;
            vv3.getClass();
            f = 1.0f;
        }
        vv3.A01(fArr, f);
    }

    public final void A00(PointF pointF, PointF pointF2, float f) {
        C18610Vv3 vv3 = this.A07;
        if (vv3 == null) {
            PointF pointF3 = A09;
            float f2 = pointF3.x;
            float[] fArr = {f2, f2, pointF2.x, pointF.x};
            float f3 = pointF3.y;
            this.A07 = new C18610Vv3(fArr, new float[]{f3, f3, pointF2.y, pointF.y});
            this.A06 = f;
            return;
        }
        float[] fArr2 = vv3.A02;
        float[] fArr3 = {fArr2[3], fArr2[2], pointF2.x, pointF.x};
        float[] fArr4 = vv3.A03;
        C18610Vv3 vv32 = new C18610Vv3(fArr3, new float[]{fArr4[3], fArr4[2], pointF2.y, pointF.y});
        this.A07 = vv32;
        this.A08.put(Float.valueOf(this.A02), vv32);
        this.A02 += this.A07.A00();
        this.A05 = f - this.A06;
    }
}
