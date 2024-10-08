package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.Spannable;
import android.text.StaticLayout;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import kotlin.Deprecated;
import kotlin.ReplaceWith;

/* renamed from: X.9We  reason: invalid class name and case insensitive filesystem */
public final class C380009We extends Drawable {
    public final C306386Ly A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final Paint A09;
    public final Paint A0A;
    public final RectF A0B = AnonymousClass7TE.A0Y();
    public final RectF A0C = AnonymousClass7TE.A0Y();

    public C380009We(Context context, UserSession userSession) {
        Context context2 = context;
        Resources resources = context2.getResources();
        this.A01 = AnonymousClass7TE.A0C(resources);
        this.A02 = AnonymousClass7TE.A0E(resources);
        this.A08 = resources.getDimensionPixelSize(R.dimen.abc_button_inset_vertical_material);
        this.A07 = resources.getDimensionPixelSize(R.dimen.abc_button_inset_vertical_material);
        this.A03 = resources.getDimensionPixelSize(R.dimen.abc_control_corner_material);
        this.A06 = AnonymousClass7TE.A0G(resources);
        this.A05 = resources.getDimensionPixelSize(R.dimen.ai_agent_share_profile_sticker_padding);
        this.A04 = resources.getDimensionPixelSize(R.dimen.abc_control_corner_material);
        Paint A0V = AnonymousClass7TE.A0V(1);
        this.A09 = A0V;
        AnonymousClass7TE.A1N(context2, A0V, R.color.canvas_bottom_sheet_description_text_color);
        Paint A0V2 = AnonymousClass7TE.A0V(1);
        this.A0A = A0V2;
        AnonymousClass7TE.A1N(context2, A0V2, R.color.chat_sticker_button_divider_color);
        String A0d = AnonymousClass7TF.A0d(resources, 2131956790);
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.abc_action_bar_elevation_material);
        Spannable spannable = C306386Ly.A0d;
        C306386Ly A0P = AnonymousClass7TF.A0P(context2, dimensionPixelSize, getIntrinsicWidth());
        this.A00 = A0P;
        A0P.A0K(Layout.Alignment.ALIGN_CENTER);
        A0P.A0M(A0d);
        AnonymousClass7TG.A0y(context2, A0P, R.attr.igds_color_gradient_lavender);
        C306386Ly r10 = this.A00;
        StaticLayout staticLayout = r10.A0G;
        if (staticLayout != null) {
            Resources resources2 = context2.getResources();
            int A0G = AnonymousClass7TE.A0G(resources2);
            float f = (float) A0G;
            UserSession userSession2 = userSession;
            AJB.A05(context2, userSession2, r10, f, 0.0f, 0.0f);
            if (staticLayout.getLineCount() != 1) {
                int A0E = AnonymousClass7TE.A0E(resources2);
                AJB.A05(context2, userSession2, r10, (float) A0E, 0.0f, 0.0f);
                if (staticLayout.getLineCount() <= 1) {
                    while (A0E < A0G) {
                        int ceil = ((int) Math.ceil((double) (((float) (A0G - A0E)) / 2.0f))) + A0E;
                        AJB.A05(context2, userSession2, r10, (float) ceil, 0.0f, 0.0f);
                        if (staticLayout.getLineCount() == 1) {
                            A0E = ceil;
                        } else {
                            A0G = ceil - 1;
                        }
                    }
                    f = (float) A0E;
                }
                AJB.A05(context2, userSession2, r10, f, 0.0f, 0.0f);
            }
        }
    }

    public final void draw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        RectF rectF = this.A0B;
        float f = (float) this.A01;
        canvas.drawRoundRect(rectF, f, f, this.A09);
        this.A00.draw(canvas);
        canvas.save();
        int i = 0;
        do {
            RectF rectF2 = this.A0C;
            float f2 = (float) this.A03;
            canvas.drawRoundRect(rectF2, f2, f2, this.A0A);
            canvas.translate((float) (this.A06 + this.A04), 0.0f);
            i++;
        } while (i < 4);
        canvas.restore();
    }

    @Deprecated(message = "Deprecated in Java", replaceWith = @ReplaceWith(expression = "PixelFormat.TRANSLUCENT", imports = {"android.graphics.PixelFormat"}))
    public final int getOpacity() {
        return -3;
    }

    public final int getIntrinsicHeight() {
        return this.A08 + this.A00.A06 + this.A07 + this.A05 + this.A02;
    }

    public final int getIntrinsicWidth() {
        return (this.A02 * 2) + (this.A06 * 4) + (this.A04 * 3);
    }

    public final void setAlpha(int i) {
        this.A09.setAlpha(i);
        this.A0A.setAlpha(i);
        this.A00.setAlpha(i);
    }

    public final void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        float f = ((float) (i + i3)) / 2.0f;
        float intrinsicWidth = (float) getIntrinsicWidth();
        float intrinsicHeight = (float) getIntrinsicHeight();
        float f2 = f - (intrinsicWidth / 2.0f);
        float f3 = (((float) (i2 + i4)) / 2.0f) - (intrinsicHeight / 2.0f);
        C306386Ly r5 = this.A00;
        float f4 = (float) r5.A0A;
        int i5 = this.A08;
        float f5 = (float) (i5 + r5.A06 + this.A07);
        float descent = r5.A0b.descent();
        float f6 = ((float) this.A02) + f2;
        float f7 = f5 + f3;
        this.A0B.set(f2, f3, intrinsicWidth + f2, intrinsicHeight + f3);
        this.A0C.set(f6, f7, ((float) this.A06) + f6, ((float) this.A05) + f7);
        float f8 = f4 / 2.0f;
        float f9 = descent / 2.0f;
        r5.setBounds((int) (f - f8), (int) (f3 + ((float) i5) + f9), (int) (f + f8), (int) (f7 - f9));
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.A09.setColorFilter(colorFilter);
        this.A0A.setColorFilter(colorFilter);
        this.A00.setColorFilter(colorFilter);
    }
}
