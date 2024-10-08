package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.Spannable;
import com.instagram.android.R;
import java.util.List;

/* renamed from: X.H7e  reason: case insensitive filesystem */
public final class C54309H7e extends C268694dq {
    public final int A00;
    public final Drawable A01;
    public final C306386Ly A02;
    public final int A03;
    public final Context A04;

    public C54309H7e(Context context, Integer num) {
        int i;
        Integer valueOf;
        Drawable drawable;
        0qQ.A0B(num, 2);
        this.A04 = context;
        int A022 = AnonymousClass7TG.A02(context);
        this.A00 = A022;
        this.A03 = AnonymousClass7TE.A0C(context.getResources());
        int A002 = C56338Hwp.A00(context, num);
        int intValue = num.intValue();
        if (intValue == 0) {
            i = R.drawable.instagram_alert_check_pano_filled_24;
            valueOf = Integer.valueOf(i);
        } else if (intValue != 1) {
            valueOf = null;
        } else {
            i = R.drawable.instagram_alert_pano_filled_24;
            valueOf = Integer.valueOf(i);
        }
        Drawable drawable2 = null;
        if (!(valueOf == null || (drawable = context.getDrawable(valueOf.intValue())) == null)) {
            AnonymousClass7TE.A1R(drawable, A002);
            drawable.setCallback(this);
            drawable.setBounds(0, 0, A022, A022);
            drawable2 = drawable;
        }
        this.A01 = drawable2;
        Spannable spannable = C306386Ly.A0d;
        C306386Ly r3 = new C306386Ly(context, context.getResources().getDimensionPixelSize(R.dimen.ar_effect_picker_background_height));
        Integer num2 = AnonymousClass05K.A01;
        Context context2 = r3.A0Z;
        0qQ.A07(context2);
        C339207jE.A00(context2, AnonymousClass7TG.A0N(context2), r3, num2);
        r3.A0A((float) context2.getResources().getDimensionPixelSize(R.dimen.challenge_sticker_button_text_size));
        r3.A0F(A002);
        r3.A0M(C56338Hwp.A01(context2, num));
        r3.setCallback(this);
        this.A02 = r3;
    }

    public final void draw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        Drawable drawable = this.A01;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        this.A02.draw(canvas);
    }

    public final List A07() {
        Drawable drawable = this.A01;
        C306386Ly r0 = this.A02;
        if (drawable != null) {
            return 0sr.A1P(new Drawable[]{drawable, r0});
        }
        return AnonymousClass7TE.A1I(r0);
    }

    public final int getIntrinsicHeight() {
        int i;
        if (this.A01 == null) {
            i = 0;
        } else {
            i = this.A00;
        }
        int i2 = this.A02.A06;
        if (i <= i2) {
            return i2;
        }
        return i;
    }

    public final int getIntrinsicWidth() {
        int i;
        if (this.A01 == null) {
            i = 0;
        } else {
            i = this.A00;
        }
        return i + this.A03 + this.A02.A0A;
    }

    public final void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        float f = ((float) (i + i3)) / 2.0f;
        float f2 = ((float) (i2 + i4)) / 2.0f;
        float intrinsicWidth = ((float) getIntrinsicWidth()) / 2.0f;
        float f3 = f - intrinsicWidth;
        float intrinsicHeight = f2 - (((float) getIntrinsicHeight()) / 2.0f);
        float f4 = f + intrinsicWidth;
        int A022 = DbS.A02(this.A04, 16);
        Drawable drawable = this.A01;
        if (drawable != null) {
            int i5 = (int) f3;
            int i6 = (int) intrinsicHeight;
            drawable.setBounds(i5, i6, i5 + A022, A022 + i6);
        }
        C306386Ly r5 = this.A02;
        int i7 = (int) (f4 - ((float) r5.A0A));
        float f5 = (float) (r5.A06 / 2);
        r5.setBounds(i7, (int) (f2 - f5), (int) f4, (int) (f2 + f5));
    }
}
