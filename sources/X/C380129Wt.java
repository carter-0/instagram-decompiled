package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.view.Choreographer;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.ui.text.TextColors;
import com.instagram.ui.text.TextShadow;

/* renamed from: X.9Wt  reason: invalid class name and case insensitive filesystem */
public final class C380129Wt extends Drawable implements Choreographer.FrameCallback {
    public final Drawable A00;
    public final AnonymousClass0mB A01;
    public final C358848bZ A02;
    public final C358848bZ A03;
    public final C358848bZ A04;
    public final TextColors A05;
    public final TextColors A06 = TextColors.A02;
    public final C306386Ly A07;

    public C380129Wt(Context context, UserSession userSession, int i, int i2, int i3, int i4) {
        TextColors textColors = new TextColors(TextShadow.A03, 0);
        this.A05 = textColors;
        Context context2 = context;
        int dimensionPixelSize = context2.getResources().getDimensionPixelSize(R.dimen.abc_dialog_padding_top_material);
        this.A01 = new AnonymousClass0mB(this, 700);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("  GIF");
        Paint paint = AnonymousClass3JT.A00;
        Drawable A052 = AnonymousClass3JT.A05(context2, R.drawable.instagram_search_outline_12, context2.getColor(R.color.design_dark_default_color_on_background));
        this.A00 = A052;
        A052.setBounds(0, 0, dimensionPixelSize, AnonymousClass7TE.A05((float) A052.getIntrinsicHeight(), ((float) dimensionPixelSize) / ((float) A052.getIntrinsicWidth())));
        C2606346l r1 = new C2606346l(A052);
        r1.A02 = AnonymousClass05K.A01;
        spannableStringBuilder.setSpan(r1, 0, 1, 33);
        int i5 = i3;
        spannableStringBuilder.setSpan(new C379489Uc(context2.getColor(R.color.sticker_subtle_light_background), i4, i5, false, i5, i5), 0, spannableStringBuilder.length(), 33);
        C358848bZ r12 = new C358848bZ(context2, textColors);
        this.A03 = r12;
        C358848bZ r3 = new C358848bZ(context2, textColors);
        this.A04 = r3;
        C358848bZ r2 = new C358848bZ(context2, textColors);
        this.A02 = r2;
        spannableStringBuilder.setSpan(r12, 2, 3, 33);
        spannableStringBuilder.setSpan(r3, 3, 4, 33);
        spannableStringBuilder.setSpan(r2, 4, 5, 33);
        C306386Ly A0s = AnonymousClass7TE.A0s(context2, i);
        this.A07 = A0s;
        float f = (float) i5;
        C306386Ly r7 = A0s;
        AJB.A05(context2, userSession, r7, (float) i2, f, f);
        A0s.A0L(spannableStringBuilder);
    }

    public final void draw(Canvas canvas) {
        C358848bZ r0;
        TextColors textColors;
        C358848bZ r02;
        0qQ.A0B(canvas, 0);
        int currentTimeMillis = (int) ((System.currentTimeMillis() / 700) % 4);
        if (currentTimeMillis == 0) {
            r0 = this.A03;
            textColors = this.A05;
        } else if (currentTimeMillis != 1) {
            if (currentTimeMillis == 2) {
                C358848bZ r03 = this.A03;
                TextColors textColors2 = this.A06;
                r03.A00(textColors2);
                this.A04.A00(textColors2);
                this.A02.A00(this.A05);
            } else if (currentTimeMillis == 3) {
                r0 = this.A03;
                textColors = this.A06;
            }
            this.A07.draw(canvas);
        } else {
            this.A03.A00(this.A06);
            r02 = this.A04;
            textColors = this.A05;
            r02.A00(textColors);
            this.A02.A00(textColors);
            this.A07.draw(canvas);
        }
        r0.A00(textColors);
        r02 = this.A04;
        r02.A00(textColors);
        this.A02.A00(textColors);
        this.A07.draw(canvas);
    }

    public final int getOpacity() {
        return -3;
    }

    public final int getIntrinsicHeight() {
        return this.A07.A06;
    }

    public final int getIntrinsicWidth() {
        return this.A07.A0A;
    }

    public final void setAlpha(int i) {
        this.A07.setAlpha(i);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.A07.setColorFilter(colorFilter);
    }

    public final boolean setVisible(boolean z, boolean z2) {
        AnonymousClass0mB r0 = this.A01;
        if (z) {
            r0.A00();
        } else {
            r0.A01();
        }
        return super.setVisible(z, z2);
    }

    public final void doFrame(long j) {
        invalidateSelf();
    }
}
