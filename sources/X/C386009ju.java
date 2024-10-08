package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.Spannable;
import com.instagram.android.R;
import java.util.List;

/* renamed from: X.9ju  reason: invalid class name and case insensitive filesystem */
public final class C386009ju extends C268694dq {
    public final Drawable A00;
    public final int A01;
    public final Context A02;
    public final Resources A03;
    public final C306386Ly A04;

    public final void draw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        this.A00.draw(canvas);
        this.A04.draw(canvas);
    }

    public final List A07() {
        return 0sr.A1P(new Drawable[]{this.A00, this.A04});
    }

    public final int getIntrinsicHeight() {
        return this.A00.getIntrinsicHeight();
    }

    public final int getIntrinsicWidth() {
        return this.A00.getIntrinsicWidth() + this.A01 + this.A04.A0A;
    }

    public C386009ju(Context context) {
        this.A02 = context;
        Resources resources = context.getResources();
        this.A03 = resources;
        this.A01 = AnonymousClass7TE.A0C(resources);
        int color = context.getColor(2Yu.A0D(context));
        Drawable drawable = context.getDrawable(R.drawable.instagram_app_messenger_filled_16);
        if (drawable != null) {
            AnonymousClass7TE.A1R(drawable, color);
            drawable.setCallback(this);
            this.A00 = drawable;
            Spannable spannable = C306386Ly.A0d;
            C306386Ly A0s = AnonymousClass7TE.A0s(context, resources.getDimensionPixelSize(R.dimen.eu_stamp_icon_size));
            Context context2 = A0s.A0Z;
            0qQ.A07(context2);
            AnonymousClass7TE.A1X(0qm.A13, AnonymousClass0qo.A00(context2), A0s);
            AnonymousClass7TF.A11(resources, A0s, R.dimen.account_discovery_bottom_gap);
            A0s.A0F(color);
            A0s.A0M(context2.getString(2131972889));
            A0s.setCallback(this);
            this.A04 = A0s;
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public final void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        float f = ((float) (i + i3)) / 2.0f;
        float f2 = ((float) (i2 + i4)) / 2.0f;
        float intrinsicWidth = f - (((float) getIntrinsicWidth()) / 2.0f);
        Drawable drawable = this.A00;
        float intrinsicHeight = f2 - (((float) drawable.getIntrinsicHeight()) / 2.0f);
        float intrinsicWidth2 = f + (((float) getIntrinsicWidth()) / 2.0f);
        int i5 = (int) intrinsicWidth;
        drawable.setBounds(i5, (int) intrinsicHeight, drawable.getIntrinsicWidth() + i5, (int) ((((float) drawable.getIntrinsicHeight()) / 2.0f) + f2));
        C306386Ly r5 = this.A04;
        int i6 = (int) (intrinsicWidth2 - ((float) r5.A0A));
        float f3 = (float) (r5.A06 / 2);
        r5.setBounds(i6, (int) (f2 - f3), (int) intrinsicWidth2, (int) (f2 + f3));
    }
}
