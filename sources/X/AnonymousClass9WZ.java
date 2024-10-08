package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import java.util.Locale;

/* renamed from: X.9WZ  reason: invalid class name */
public final class AnonymousClass9WZ extends Drawable {
    public final Resources A00;
    public final Paint A01 = AnonymousClass7TE.A0V(1);
    public final Drawable A02;
    public final Drawable A03;

    public AnonymousClass9WZ(Context context, UserSession userSession, Integer num, int i) {
        Resources resources = context.getResources();
        this.A00 = resources;
        AIr A012 = AIr.A01(context, userSession);
        AIr.A03(context, A012, R.attr.igds_color_gradient_pink);
        String A0d = AnonymousClass7TF.A0d(resources, 2131970900);
        Locale locale = Locale.ROOT;
        String upperCase = A0d.toUpperCase(locale);
        0qQ.A07(upperCase);
        A012.A05 = upperCase;
        A012.A00 = R.dimen.abc_text_size_menu_header_material;
        A012.A01 = R.dimen.abc_button_padding_horizontal_material;
        this.A02 = A012.A04();
        AIr A013 = AIr.A01(context, userSession);
        A013.A0A(new int[]{AnonymousClass7TE.A0A(context)});
        String upperCase2 = AnonymousClass7TF.A0d(resources, i).toUpperCase(locale);
        0qQ.A07(upperCase2);
        A013.A05 = upperCase2;
        A013.A00 = R.dimen.abc_text_size_menu_header_material;
        if (num != null) {
            A013.A06(num.intValue());
        }
        A013.A07(R.dimen.account_discovery_bottom_gap);
        A013.A0C = true;
        A013.A01 = R.dimen.abc_button_padding_horizontal_material;
        A013.A0A = true;
        this.A03 = A013.A04();
    }

    public final void draw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        Rect A0X = AnonymousClass7TE.A0X(this);
        canvas.saveLayer((RectF) null, this.A01);
        Drawable drawable = this.A02;
        float intrinsicHeight = ((float) ((A0X.bottom - A0X.top) - drawable.getIntrinsicHeight())) / 4.0f;
        Drawable drawable2 = this.A03;
        canvas.save();
        canvas.translate(((float) drawable.getIntrinsicWidth()) * 0.2f, (((float) drawable.getIntrinsicHeight()) * 0.75f) + intrinsicHeight);
        canvas.rotate(2.0f, ((float) drawable2.getIntrinsicWidth()) / 2.0f, ((float) drawable2.getIntrinsicHeight()) / 2.0f);
        AnonymousClass7TG.A13(drawable2);
        AnonymousClass7TF.A14(canvas, drawable2);
        canvas.translate(0.0f, intrinsicHeight);
        canvas.rotate(-6.0f, ((float) drawable.getIntrinsicWidth()) / 2.0f, ((float) drawable.getIntrinsicHeight()) / 2.0f);
        AnonymousClass7TG.A13(drawable);
        drawable.draw(canvas);
        canvas.restore();
    }

    public final int getOpacity() {
        return -3;
    }

    public final void setAlpha(int i) {
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public final int getIntrinsicHeight() {
        return (int) ((((float) this.A02.getIntrinsicHeight()) * 0.75f) + ((float) this.A03.getIntrinsicHeight()));
    }

    public final int getIntrinsicWidth() {
        return (int) ((((float) this.A02.getIntrinsicWidth()) * 0.2f) + ((float) this.A03.getIntrinsicWidth()));
    }
}
