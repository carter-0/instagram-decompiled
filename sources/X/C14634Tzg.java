package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.location.Location;
import com.instagram.android.R;

/* renamed from: X.Tzg  reason: case insensitive filesystem */
public final class C14634Tzg extends C14633Tzf implements X2F {
    public float A00;
    public float A01;
    public boolean A02;
    public boolean A03;
    public final C14635Tzh A04;
    public final float A05;
    public final float A06;
    public final Paint A07;
    public final Paint A08;
    public final AnonymousClass2R4 A09 = new Object();
    public final 2cs A0A;
    public final 2cs A0B;
    public final X4K A0C;

    public final void A0D(Canvas canvas) {
        2cs r5;
        2cs r1;
        Location AuA = this.A0C.AuA("CurrentLocationDrawable");
        if (AuA != null) {
            double A012 = W2R.A01(AuA.getLongitude());
            double A002 = W2R.A00(AuA.getLatitude());
            if (!this.A03) {
                this.A03 = true;
                r5 = this.A0A;
                r5.A08(A012, true);
                r1 = this.A0B;
                r1.A08(A002, true);
            } else {
                r5 = this.A0A;
                r5.A06(A012);
                r1 = this.A0B;
                r1.A06(A002);
            }
            double d = r5.A09.A00;
            double d2 = r1.A09.A00;
            W2R w2r = this.A08;
            AnonymousClass2R4 r0 = this.A09;
            w2r.A05(r0);
            float[] fArr = this.A0C;
            w2r.A07(fArr, d + ((double) ((int) Math.ceil(r0.A01 - d))), d2);
            float f = fArr[0];
            float f2 = fArr[1];
            canvas.drawCircle(f, f2, this.A06, this.A07);
            canvas.drawCircle(f, f2, this.A00 * this.A05, this.A08);
        }
    }

    public final void CvQ(C14635Tzh tzh) {
        float f;
        float f2 = tzh.A00;
        if (f2 < this.A01) {
            this.A02 = !this.A02;
        }
        if (this.A02) {
            f = (1.0f - f2) * 0.25f;
        } else {
            f = 0.25f * f2;
        }
        this.A00 = 1.0f - f;
        this.A01 = f2;
        A05();
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.2R4, java.lang.Object] */
    public C14634Tzg(Context context, WFU wfu, X4K x4k) {
        super(wfu);
        Paint paint = new Paint(1);
        this.A08 = paint;
        Paint paint2 = new Paint(3);
        this.A07 = paint2;
        this.A0C = x4k;
        this.A03 = 0;
        this.A02 = 0.0f;
        float f = this.A0A;
        this.A05 = 8.0f * f;
        this.A06 = 11.0f * f;
        C14635Tzh A002 = C14635Tzh.A00(0.0f, 1.0f);
        this.A04 = A002;
        A002.A05 = -1;
        A002.A08(this);
        A002.A07 = 1800;
        AnonymousClass7TE.A1N(context, paint, R.color.badge_color);
        C13988Tno.A0p(-1, paint2);
        paint2.setShadowLayer(f * 14.0f, 0.0f, 0.0f, context.getColor(R.color.black_40_transparent));
        2cs A022 = 2cp.A00().A02();
        A022.A06 = true;
        A022.A02 = 1.0E-16d;
        A022.A00 = 1.0E-16d;
        this.A0A = A022;
        2cs A023 = 2cp.A00().A02();
        A023.A06 = true;
        A023.A02 = 1.0E-16d;
        A023.A00 = 1.0E-16d;
        this.A0B = A023;
        CvQ(A002);
    }
}
