package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.Spannable;
import com.instagram.android.R;
import java.util.List;

/* renamed from: X.JZh  reason: case insensitive filesystem */
public final class C59813JZh extends C268694dq {
    public final int A00;
    public final Context A01;
    public final Drawable A02;
    public final C306386Ly A03;

    public final void draw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        Drawable drawable = this.A02;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        this.A03.draw(canvas);
    }

    public final List A07() {
        Drawable drawable = this.A02;
        C306386Ly r0 = this.A03;
        if (drawable != null) {
            return 0sr.A1P(new Drawable[]{drawable, r0});
        }
        return AnonymousClass7TE.A1I(r0);
    }

    public final int getIntrinsicHeight() {
        Drawable drawable = this.A02;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return this.A03.A06;
    }

    public final int getIntrinsicWidth() {
        int i;
        Drawable drawable = this.A02;
        if (drawable != null) {
            i = drawable.getIntrinsicWidth();
        } else {
            i = 0;
        }
        return i + this.A00 + this.A03.A0A;
    }

    public C59813JZh(Context context, int i) {
        this.A01 = context;
        this.A00 = JTR.A05(context);
        Drawable drawable = null;
        Drawable drawable2 = context.getDrawable(R.drawable.instagram_camera_filled_16);
        if (drawable2 != null) {
            AnonymousClass7TE.A1R(drawable2, i);
            drawable2.setCallback(this);
            drawable = drawable2;
        }
        this.A02 = drawable;
        Spannable spannable = C306386Ly.A0d;
        C306386Ly A0s = AnonymousClass7TE.A0s(context, context.getResources().getDimensionPixelSize(R.dimen.browser_error_screen_description_width));
        Integer num = AnonymousClass05K.A01;
        Context context2 = A0s.A0Z;
        0qQ.A07(context2);
        C339207jE.A00(context2, AnonymousClass7TG.A0N(context2), A0s, num);
        A0s.A0A((float) C51972G9s.A08(context2));
        A0s.A0F(i);
        A0s.A0M(context2.getString(2131970878));
        A0s.setCallback(this);
        this.A03 = A0s;
    }

    public final void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        float f = ((float) (i + i3)) / 2.0f;
        float f2 = ((float) (i2 + i4)) / 2.0f;
        float intrinsicWidth = f - (((float) getIntrinsicWidth()) / 2.0f);
        float intrinsicHeight = f2 - (((float) getIntrinsicHeight()) / 2.0f);
        float intrinsicWidth2 = f + (((float) getIntrinsicWidth()) / 2.0f);
        float intrinsicHeight2 = (((float) getIntrinsicHeight()) / 2.0f) + f2;
        Drawable drawable = this.A02;
        if (drawable != null) {
            int i5 = (int) intrinsicWidth;
            drawable.setBounds(i5, (int) intrinsicHeight, drawable.getIntrinsicWidth() + i5, (int) intrinsicHeight2);
        }
        C306386Ly r1 = this.A03;
        JTS.A1U(r1, intrinsicWidth2, (float) r1.A0A, f2);
    }
}
