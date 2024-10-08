package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.instagram.android.R;

/* renamed from: X.Jcx  reason: case insensitive filesystem */
public final class C59988Jcx extends Drawable {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final String A05;
    public final AnonymousClass0eM A06;
    public final AnonymousClass0eM A07;
    public final AnonymousClass0eM A08;
    public final AnonymousClass0eM A09;
    public final AnonymousClass0eM A0A;
    public final AnonymousClass0eM A0B;
    public final AnonymousClass0eM A0C;
    public final AnonymousClass0eM A0D = AnonymousClass0eN.A01(MLJ.A00);
    public final AnonymousClass0eM A0E;
    public final AnonymousClass0eM A0F = AnonymousClass0eN.A01(MLK.A00);
    public final int A0G;

    public final int getOpacity() {
        return -3;
    }

    public final void setBounds(Rect rect) {
        0qQ.A0B(rect, 0);
        super.setBounds(rect);
        float f = ((float) (rect.left + rect.right)) / 2.0f;
        int i = this.A03;
        float f2 = ((float) ((rect.top + rect.bottom) + i)) / 2.0f;
        AnonymousClass0eM r8 = this.A08;
        JTO.A0D(r8).setBounds((int) (f - (((float) ((C306386Ly) r8.getValue()).A0A) / 2.0f)), (int) (f2 - (((float) ((C306386Ly) r8.getValue()).A06) / 2.0f)), (int) (f + (((float) ((C306386Ly) r8.getValue()).A0A) / 2.0f)), (int) (f2 + (((float) ((C306386Ly) r8.getValue()).A0A) / 2.0f)));
        Path path = (Path) this.A0D.getValue();
        path.reset();
        float f3 = (float) i;
        RectF rectF = new RectF((float) rect.left, ((float) rect.top) + f3, (float) rect.right, (float) rect.bottom);
        AnonymousClass0eM r6 = this.A0B;
        path.addRoundRect(rectF, new float[]{AnonymousClass7TE.A04(r6.getValue()), AnonymousClass7TE.A04(r6.getValue()), AnonymousClass7TE.A04(r6.getValue()), AnonymousClass7TE.A04(r6.getValue()), AnonymousClass7TE.A04(r6.getValue()), AnonymousClass7TE.A04(r6.getValue()), AnonymousClass7TE.A04(r6.getValue()), AnonymousClass7TE.A04(r6.getValue())}, Path.Direction.CW);
        Path path2 = (Path) this.A0F.getValue();
        path2.reset();
        float f4 = ((float) rect.top) + f3 + 1.0f;
        float f5 = (((float) (rect.left + rect.right)) / 2.0f) + (((float) this.A00) / 2.0f);
        path2.moveTo(f5, f4);
        path2.lineTo(f5, f4 - f3);
        path2.lineTo(f5 + ((float) this.A04), f4);
    }

    public final int getIntrinsicHeight() {
        return ((C306386Ly) this.A08.getValue()).A06 + this.A03;
    }

    public final int getIntrinsicWidth() {
        return this.A0G - (DbX.A07(this.A06) * 2);
    }

    public final void setAlpha(int i) {
        JTO.A0D(this.A08).setAlpha(i);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        JTO.A0D(this.A08).setColorFilter(colorFilter);
    }

    public C59988Jcx(Context context, int i, int i2, String str) {
        AnonymousClass7TG.A1P(context, str);
        this.A0G = i;
        this.A05 = str;
        this.A01 = i2;
        this.A00 = context.getResources().getDimensionPixelSize(R.dimen.audience_selector_pill_layout_height);
        this.A03 = context.getResources().getDimensionPixelSize(R.dimen.action_bar_item_spacing_right);
        this.A04 = AnonymousClass7TF.A02(context, R.dimen.action_bar_item_spacing_right);
        this.A09 = AnonymousClass0eN.A01(new MJ1(context, 44));
        this.A07 = AnonymousClass0eN.A01(new MJ1(context, 43));
        this.A0A = AnonymousClass0eN.A01(new MJ1(context, 45));
        this.A06 = AnonymousClass0eN.A01(new MJ1(context, 42));
        this.A0B = AnonymousClass0eN.A01(new MJ1(context, 46));
        this.A02 = (i - (DbX.A07(this.A06) * 2)) - (DbX.A07(this.A07) * 2);
        this.A08 = AnonymousClass0eN.A01(new MJ8(11, context, this));
        this.A0C = AnonymousClass0eN.A01(new MJ1(context, 47));
        this.A0E = AnonymousClass0eN.A01(new MJ8(12, context, this));
    }

    public final void draw(Canvas canvas) {
        AnonymousClass7TF.A12(canvas);
        canvas.drawPath((Path) this.A0D.getValue(), (Paint) this.A0C.getValue());
        canvas.drawPath((Path) this.A0F.getValue(), (Paint) this.A0E.getValue());
        JTQ.A0u(canvas, this.A08);
        canvas.restore();
    }
}
