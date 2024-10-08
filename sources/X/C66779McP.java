package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;

/* renamed from: X.McP  reason: case insensitive filesystem */
public final class C66779McP implements C328057Dg {
    public boolean A00;
    public final RectF A01 = AnonymousClass7TE.A0Y();
    public final C242553Us A02 = new C242553Us();
    public final C70530OAe A03 = new C70530OAe();
    public final C70531OAf A04 = new C70531OAf();

    /* JADX INFO: finally extract failed */
    public final void AQJ(Canvas canvas, Paint paint) {
        int i;
        if (this.A00) {
            C242553Us r1 = this.A02;
            switch (r1.A00.intValue()) {
                case 0:
                case 1:
                    break;
                case 2:
                    C70531OAf oAf = this.A04;
                    RectF rectF = this.A01;
                    0qQ.A0B(rectF, 0);
                    OT3 ot3 = oAf.A01;
                    RectF rectF2 = ot3.A00;
                    rectF2.set(rectF);
                    RectF rectF3 = ot3.A01;
                    rectF3.set(rectF);
                    float centerY = rectF.centerY();
                    float[] fArr = r1.A01;
                    rectF2.bottom = Math.max(fArr[1], fArr[3]) + centerY;
                    rectF3.top = centerY - Math.max(fArr[7], fArr[5]);
                    OT3 ot32 = oAf.A00;
                    RectF rectF4 = ot32.A00;
                    rectF4.set(rectF);
                    RectF rectF5 = ot32.A01;
                    rectF5.set(rectF);
                    rectF4.bottom = centerY;
                    rectF5.top = centerY;
                    break;
                case 3:
                    C70531OAf oAf2 = this.A04;
                    RectF rectF6 = this.A01;
                    0qQ.A0B(rectF6, 0);
                    OT3 ot33 = oAf2.A01;
                    RectF rectF7 = ot33.A00;
                    rectF7.set(rectF6);
                    RectF rectF8 = ot33.A01;
                    rectF8.set(rectF6);
                    float centerX = rectF6.centerX();
                    float[] fArr2 = r1.A01;
                    rectF7.right = Math.max(fArr2[0], fArr2[6]) + centerX;
                    rectF8.left = centerX - Math.max(fArr2[2], fArr2[4]);
                    OT3 ot34 = oAf2.A00;
                    RectF rectF9 = ot34.A00;
                    rectF9.set(rectF6);
                    RectF rectF10 = ot34.A01;
                    rectF10.set(rectF6);
                    rectF9.right = centerX;
                    rectF10.left = centerX;
                    break;
                case 4:
                case 5:
                    C70530OAe oAe = this.A03;
                    RectF rectF11 = this.A01;
                    0qQ.A0B(rectF11, 0);
                    float[] fArr3 = r1.A01;
                    0qQ.A07(fArr3);
                    float width = rectF11.width() / 2.0f;
                    float height = rectF11.height() / 2.0f;
                    OTQ otq = oAe.A01;
                    RectF rectF12 = otq.A02;
                    rectF12.set(rectF11);
                    rectF12.right = rectF11.left + width + fArr3[0];
                    rectF12.bottom = rectF11.top + height + fArr3[1];
                    RectF rectF13 = otq.A03;
                    rectF13.set(rectF11);
                    rectF13.left = (rectF11.right - width) - fArr3[2];
                    rectF13.bottom = rectF11.top + height + fArr3[3];
                    RectF rectF14 = otq.A00;
                    rectF14.set(rectF11);
                    rectF14.right = rectF14.left + width + fArr3[6];
                    rectF14.top = (rectF14.bottom - height) - fArr3[7];
                    RectF rectF15 = otq.A01;
                    rectF15.set(rectF11);
                    rectF15.left = (rectF15.right - width) - fArr3[4];
                    rectF15.top = (rectF15.bottom - height) - fArr3[5];
                    OTQ otq2 = oAe.A00;
                    RectF rectF16 = otq2.A02;
                    rectF16.set(rectF12);
                    rectF16.right -= fArr3[0];
                    rectF16.bottom -= fArr3[1];
                    RectF rectF17 = otq2.A03;
                    rectF17.set(rectF13);
                    rectF17.left += fArr3[2];
                    rectF17.bottom -= fArr3[3];
                    RectF rectF18 = otq2.A00;
                    rectF18.set(rectF14);
                    rectF18.right -= fArr3[6];
                    rectF18.top += fArr3[7];
                    RectF rectF19 = otq2.A01;
                    rectF19.set(rectF15);
                    rectF19.left += fArr3[4];
                    rectF19.top += fArr3[5];
                    break;
                default:
                    throw new RuntimeException();
            }
            this.A00 = false;
        }
        C242553Us r0 = this.A02;
        float[] fArr4 = r0.A01;
        0qQ.A07(fArr4);
        Canvas canvas2 = canvas;
        Paint paint2 = paint;
        switch (r0.A00.intValue()) {
            case 0:
            case 1:
                canvas2.drawRoundRect(this.A01, fArr4[0], fArr4[1], paint2);
                return;
            case 2:
            case 3:
                C70531OAf oAf3 = this.A04;
                OT3 ot35 = oAf3.A00;
                RectF rectF20 = ot35.A00;
                i = canvas2.save();
                canvas2.clipRect(rectF20);
                RectF rectF21 = oAf3.A01.A00;
                canvas2.drawRoundRect(rectF21, fArr4[0], fArr4[1], paint2);
                canvas2.restoreToCount(i);
                RectF rectF22 = ot35.A01;
                i = canvas2.save();
                canvas2.clipRect(rectF22);
                canvas2.drawRoundRect(rectF21, fArr4[4], fArr4[5], paint2);
                break;
            case 4:
            case 5:
                C70530OAe oAe2 = this.A03;
                OTQ otq3 = oAe2.A00;
                RectF rectF23 = otq3.A02;
                i = canvas2.save();
                canvas2.clipRect(rectF23);
                try {
                    OTQ otq4 = oAe2.A01;
                    canvas2.drawRoundRect(otq4.A02, fArr4[0], fArr4[1], paint2);
                    canvas2.restoreToCount(i);
                    RectF rectF24 = otq3.A03;
                    i = canvas2.save();
                    canvas2.clipRect(rectF24);
                    canvas2.drawRoundRect(otq4.A03, fArr4[2], fArr4[3], paint2);
                    canvas2.restoreToCount(i);
                    RectF rectF25 = otq3.A01;
                    i = canvas2.save();
                    canvas2.clipRect(rectF25);
                    canvas2.drawRoundRect(otq4.A01, fArr4[4], fArr4[5], paint2);
                    canvas2.restoreToCount(i);
                    RectF rectF26 = otq3.A00;
                    i = canvas2.save();
                    canvas2.clipRect(rectF26);
                    canvas2.drawRoundRect(otq4.A00, fArr4[6], fArr4[7], paint2);
                    break;
                } catch (Throwable th) {
                    canvas2.restoreToCount(i);
                    throw th;
                }
            default:
                throw new RuntimeException();
        }
        canvas2.restoreToCount(i);
    }

    public final void EPz(RectF rectF) {
        RectF rectF2 = this.A01;
        if (!0qQ.A0K(rectF2, rectF)) {
            rectF2.set(rectF);
            this.A00 = true;
        }
    }

    public final void ESv(C242553Us r3) {
        C242553Us r1 = this.A02;
        if (!r3.equals(r1)) {
            r1.A08(r3, AnonymousClass05K.A00);
            this.A00 = true;
        }
    }
}
