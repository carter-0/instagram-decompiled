package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.9pl  reason: invalid class name and case insensitive filesystem */
public final class C389519pl extends C299875vz {
    public final int A00;
    public final int A01;
    public final Path A02 = new Path();
    public final C19469WaH A03;
    public final C306386Ly A04;
    public final C363208jL A05;
    public final int A06;
    public final Paint A07;
    public final UserSession A08;

    public C389519pl(Context context, UserSession userSession, C19469WaH waH) {
        this.A08 = userSession;
        this.A03 = waH;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.chat_sticker_width);
        int A022 = AnonymousClass7TG.A02(context);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R.dimen.account_recs_header_image_margin);
        this.A06 = dimensionPixelSize2;
        int dimensionPixelSize3 = context.getResources().getDimensionPixelSize(R.dimen.challenge_sticker_button_text_size);
        this.A00 = context.getResources().getDimensionPixelSize(R.dimen.asset_picker_redesign_sticker_height);
        this.A01 = AnonymousClass7TE.A0F(context.getResources());
        Paint A0V = AnonymousClass7TE.A0V(1);
        AnonymousClass7TE.A1N(context, A0V, R.color.canvas_bottom_sheet_description_text_color);
        this.A07 = A0V;
        C306386Ly A0s = AnonymousClass7TE.A0s(context, dimensionPixelSize - (A022 * 2));
        A0s.A0J(Typeface.SANS_SERIF, 1);
        A0s.A0A((float) dimensionPixelSize3);
        AnonymousClass7TG.A0y(context, A0s, R.attr.igds_color_controls);
        A0s.A0M(waH.A03(context, userSession));
        this.A04 = A0s;
        this.A05 = new C363208jL(context, (float) dimensionPixelSize2, R.color.chat_sticker_button_divider_color, 1);
    }

    public final void draw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        canvas.drawPath(this.A02, this.A07);
        this.A05.draw(canvas);
        this.A04.draw(canvas);
    }

    public final void setBounds(Rect rect) {
        0qQ.A0B(rect, 0);
        super.setBounds(rect);
        C363208jL r6 = this.A05;
        int i = rect.left;
        int i2 = rect.top;
        r6.setBounds(new Rect(i, i2, rect.right, i2 + this.A06));
        this.A04.setBounds(A00(AnonymousClass7TE.A0X(r6), this, (float) rect.centerX()));
        Path path = this.A02;
        path.reset();
        RectF rectF = new RectF(rect);
        float[] fArr = new float[8];
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        AnonymousClass7TG.A11(path, rectF, fArr, (float) this.A01);
    }

    public static final Rect A00(Rect rect, C389519pl r6, float f) {
        int i = rect.bottom;
        float f2 = ((float) (i + (r6.A00 + i))) / 2.0f;
        C306386Ly r1 = r6.A04;
        float f3 = ((float) r1.A0A) / 2.0f;
        int i2 = (int) (f - f3);
        float f4 = ((float) r1.A06) / 2.0f;
        return new Rect(i2, (int) (f2 - f4), (int) (f + f3), (int) (f2 + f4));
    }

    public final List A07() {
        return 0sr.A1P(new Drawable[]{this.A04, this.A05});
    }

    public final int getIntrinsicHeight() {
        return this.A00;
    }
}
