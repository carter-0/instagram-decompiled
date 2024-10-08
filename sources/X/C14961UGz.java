package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import com.facebook.android.maps.model.LatLng;

/* renamed from: X.UGz  reason: case insensitive filesystem */
public final class C14961UGz extends C14633Tzf {
    public double A00;
    public float A01;
    public float A02;
    public float A03;
    public int A04;
    public int A05;
    public LatLng A06;
    public final Paint A07 = new Paint(1);
    public final AnonymousClass2R4 A08 = new Object();
    public final float[] A09 = new float[2];

    /* JADX WARNING: type inference failed for: r0v3, types: [X.2R4, java.lang.Object] */
    public C14961UGz(WFU wfu, LatLng latLng, double d, int i, int i2) {
        super(wfu);
        this.A06 = latLng;
        this.A04 = i;
        this.A00 = d;
        this.A05 = i2;
        this.A02 = -10.0f;
        this.A04 = true;
        A00(this);
    }

    public static void A00(C14961UGz uGz) {
        LatLng latLng = uGz.A06;
        double A012 = W2R.A01(latLng.A01);
        uGz.A00 = A012;
        double d = latLng.A00;
        double A002 = W2R.A00(d);
        uGz.A01 = A002;
        AnonymousClass2R4 r8 = uGz.A08;
        double A003 = W2R.A00(d + Math.toDegrees(uGz.A00 / 6371009.0d));
        r8.A03 = A003;
        double d2 = A002 - A003;
        r8.A00 = A002 + d2;
        r8.A01 = A012 - d2;
        r8.A02 = A012 + d2;
    }

    public final void A0D(Canvas canvas) {
        float f;
        AnonymousClass2R4 r7 = this.A08;
        float[] fArr = this.A0C;
        W2R w2r = this.A08;
        AnonymousClass2R4 r6 = this.A09;
        w2r.A05(r6);
        if (r7.A00 >= r6.A03 && r7.A03 <= r6.A00) {
            fArr[0] = (float) ((int) Math.ceil(r6.A01 - r7.A02));
            float floor = (float) ((int) Math.floor(r6.A02 - r7.A01));
            fArr[1] = floor;
            float f2 = fArr[0];
            if (f2 <= floor) {
                double d = this.A00;
                double d2 = this.A01;
                float[] fArr2 = this.A09;
                w2r.A07(fArr2, d, d2);
                this.A01 = fArr2[0];
                this.A02 = fArr2[1];
                w2r.A07(fArr2, this.A00, r7.A03);
                this.A03 = (float) Math.hypot((double) (fArr2[0] - this.A01), (double) (fArr2[1] - this.A02));
                C14723U4m u4m = this.A07.A0I;
                Canvas canvas2 = canvas;
                canvas2.save();
                float f3 = floor - f2;
                for (int i = 0; ((float) i) <= f3; i++) {
                    if (i == 0) {
                        f = ((float) u4m.A0K) * f2;
                    } else if (i == 1) {
                        f = (float) u4m.A0K;
                    } else {
                        canvas2.translate(fArr[0], fArr[1]);
                        Paint paint = this.A07;
                        AnonymousClass7TE.A1Q(paint);
                        paint.setColor(this.A04);
                        canvas2.drawCircle(this.A01, this.A02, this.A03, paint);
                        JTO.A1N(paint);
                        paint.setColor(this.A05);
                        paint.setStrokeWidth(10.0f);
                        canvas2.drawCircle(this.A01, this.A02, this.A03, paint);
                    }
                    fArr[0] = f;
                    fArr[1] = 0.0f;
                    u4m.A0g.mapVectors(fArr);
                    canvas2.translate(fArr[0], fArr[1]);
                    Paint paint2 = this.A07;
                    AnonymousClass7TE.A1Q(paint2);
                    paint2.setColor(this.A04);
                    canvas2.drawCircle(this.A01, this.A02, this.A03, paint2);
                    JTO.A1N(paint2);
                    paint2.setColor(this.A05);
                    paint2.setStrokeWidth(10.0f);
                    canvas2.drawCircle(this.A01, this.A02, this.A03, paint2);
                }
                canvas2.restore();
            }
        }
    }
}
