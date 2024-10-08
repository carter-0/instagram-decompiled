package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.instagram.android.R;
import com.instagram.user.model.User;

/* renamed from: X.9ll  reason: invalid class name and case insensitive filesystem */
public final class C387159ll extends C369508us {
    public int A00;
    public int A01;
    public final int A02;
    public final int A03;
    public final Drawable A04;
    public final Drawable A05;

    public C387159ll(Context context, User user, Integer num, String str, int i) {
        super(context, user, str, i);
        this.A03 = AnonymousClass7TH.A01(context);
        this.A02 = context.getResources().getDimensionPixelSize(R.dimen.abc_star_medium);
        Resources resources = context.getResources();
        int intValue = num.intValue();
        Drawable A002 = AnonymousClass2dd.A00(resources, intValue != 0 ? R.drawable.anti_valentines_heart_left : R.drawable.valentines_heart_left);
        0qQ.A07(A002);
        this.A04 = A002;
        Drawable A003 = AnonymousClass2dd.A00(context.getResources(), intValue != 0 ? R.drawable.anti_valentines_heart_right : R.drawable.valentines_heart_right);
        0qQ.A07(A003);
        this.A05 = A003;
        if (A002 instanceof C262364Dk) {
            ((C262364Dk) A002).A01(new AZK(this, 2));
        }
        if (A003 instanceof C262364Dk) {
            ((C262364Dk) A003).A01(new AZK(this, 3));
        }
    }

    public final void draw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        super.draw(canvas);
        canvas.save();
        int i = this.A02;
        float f = (float) i;
        float f2 = f * 0.55f;
        canvas.translate((((float) this.A00) + ((float) this.A0A)) - f2, ((float) this.A01) - (0.2f * f));
        Drawable drawable = this.A05;
        drawable.setBounds(0, 0, i, i);
        AnonymousClass7TF.A14(canvas, drawable);
        canvas.translate(((float) this.A00) - (f * 0.45f), ((((float) this.A01) + ((float) this.A06)) - ((float) this.A03)) - f2);
        Drawable drawable2 = this.A04;
        drawable2.setBounds(0, 0, i, i);
        drawable2.draw(canvas);
        canvas.restore();
    }

    public final void onBoundsChange(Rect rect) {
        0qQ.A0B(rect, 0);
        super.onBoundsChange(rect);
        this.A00 = rect.left;
        this.A01 = rect.top;
    }
}
