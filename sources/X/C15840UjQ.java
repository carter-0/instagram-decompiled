package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.Spannable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.UjQ  reason: case insensitive filesystem */
public final class C15840UjQ extends C268694dq implements C252203oj {
    public float A00;
    public Integer A01;
    public Integer A02;
    public final 2cs A03;
    public final C14671U0r A04;
    public final U1O A05;
    public final C306386Ly A06;
    public final List A07;

    public final void DmB(2cs r1) {
    }

    public final void DmC(2cs r1) {
    }

    public final void DmD(2cs r1) {
    }

    public final List A07() {
        return this.A07;
    }

    public final void draw(Canvas canvas) {
        float f = (float) this.A03.A09.A00;
        Integer num = this.A02;
        if (num != null && f < 1.0f) {
            A00(canvas, num, 1.0f - f);
        }
        Integer num2 = this.A01;
        if (num2 != null && f > 0.0f) {
            A00(canvas, num2, f);
        }
    }

    public final int getIntrinsicHeight() {
        return (int) this.A00;
    }

    public final int getIntrinsicWidth() {
        return (int) this.A00;
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [X.U1O, android.graphics.drawable.Drawable] */
    public C15840UjQ(Context context) {
        ArrayList arrayList = new ArrayList();
        this.A07 = arrayList;
        2cs A0J = AnonymousClass7TF.A0J();
        A0J.A0A(this);
        A0J.A02();
        A0J.A09(C71392co.A01());
        this.A03 = A0J;
        Spannable spannable = C306386Ly.A0d;
        C306386Ly r2 = new C306386Ly(context, 0nA.A09(context));
        this.A06 = r2;
        r2.setCallback(this);
        C14671U0r u0r = new C14671U0r(context);
        this.A04 = u0r;
        u0r.setCallback(this);
        ? drawable = new Drawable();
        this.A05 = drawable;
        drawable.setCallback(this);
        Collections.addAll(arrayList, new Drawable[]{r2, u0r, drawable});
    }

    private void A00(Canvas canvas, Integer num, float f) {
        Drawable drawable;
        String str;
        int intValue = num.intValue();
        if (intValue == 0) {
            drawable = this.A06;
        } else if (intValue == 1) {
            drawable = this.A04;
        } else if (intValue == 2) {
            drawable = this.A05;
        } else {
            Integer num2 = this.A01;
            if (num2 != null) {
                switch (num2.intValue()) {
                    case 1:
                        str = "RING";
                        break;
                    case 2:
                        str = "USER";
                        break;
                    default:
                        str = "EMOJI";
                        break;
                }
            } else {
                str = "null";
            }
            throw DbW.A0c("Unsupported handle type: ", str);
        }
        canvas.save();
        canvas.translate((this.A00 - ((float) drawable.getIntrinsicWidth())) / 2.0f, (this.A00 - ((float) drawable.getIntrinsicHeight())) / 2.0f);
        canvas.scale(f, f, C66581MXm.A01(this), getBounds().exactCenterY());
        drawable.draw(canvas);
        canvas.restore();
    }

    public final void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        this.A06.setBounds(i, i2, i3, i4);
        this.A04.setBounds(i, i2, i3, i4);
        this.A05.setBounds(i, i2, i3, i4);
    }

    public final void DmE(2cs r1) {
        invalidateSelf();
    }
}
