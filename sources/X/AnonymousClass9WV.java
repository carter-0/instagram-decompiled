package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import java.util.Locale;
import kotlin.Deprecated;
import kotlin.ReplaceWith;

/* renamed from: X.9WV  reason: invalid class name */
public final class AnonymousClass9WV extends Drawable {
    public final Resources A00;
    public final Paint A01 = AnonymousClass7TE.A0V(1);
    public final Paint A02;
    public final RectF A03;
    public final Drawable A04;
    public final Drawable A05;

    public AnonymousClass9WV(UserSession userSession, Context context) {
        Resources resources = context.getResources();
        this.A00 = resources;
        AIr A012 = AIr.A01(context, userSession);
        A012.A0A(new int[]{AnonymousClass7TF.A03(context, R.attr.igds_color_gradient_pink)});
        String A0d = AnonymousClass7TF.A0d(resources, 2131953758);
        Locale locale = Locale.ROOT;
        String upperCase = A0d.toUpperCase(locale);
        0qQ.A07(upperCase);
        A012.A05 = upperCase;
        A012.A00 = R.dimen.ai_agent_share_profile_sticker_padding;
        this.A05 = A012.A04();
        AIr A013 = AIr.A01(context, userSession);
        AIr.A03(context, A013, R.attr.igds_color_gradient_purple);
        String upperCase2 = AnonymousClass7TF.A0d(resources, 2131953757).toUpperCase(locale);
        0qQ.A07(upperCase2);
        A013.A05 = upperCase2;
        A013.A00 = R.dimen.abc_select_dialog_padding_start_material;
        C306386Ly A042 = A013.A04();
        this.A04 = A042;
        Paint paint = new Paint();
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_OUT));
        AnonymousClass7TE.A1Q(paint);
        paint.setColor(0);
        paint.setAntiAlias(true);
        this.A02 = paint;
        this.A03 = new RectF(-5.0f, 10.0f, (float) A042.A0A, (float) A042.A06);
    }

    @Deprecated(message = "Deprecated in Java", replaceWith = @ReplaceWith(expression = "PixelFormat.TRANSLUCENT", imports = {"android.graphics.PixelFormat"}))
    public final int getOpacity() {
        return -3;
    }

    public final void setAlpha(int i) {
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public final void draw(Canvas canvas) {
        Rect A0L = AnonymousClass7TG.A0L(this, canvas);
        canvas.saveLayer((RectF) null, this.A01);
        canvas.save();
        canvas.translate(10.0f, ((float) A0L.bottom) / 4.0f);
        canvas.rotate(-5.92f);
        AnonymousClass7TF.A14(canvas, this.A05);
        Drawable drawable = this.A04;
        canvas.translate(((float) A0L.right) - ((float) drawable.getIntrinsicWidth()), ((float) A0L.bottom) - ((float) drawable.getIntrinsicHeight()));
        canvas.rotate(5.92f);
        canvas.drawRoundRect(this.A03, 20.0f, 20.0f, this.A02);
        drawable.draw(canvas);
        canvas.restore();
    }
}
