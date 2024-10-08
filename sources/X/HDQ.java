package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Spannable;
import com.instagram.android.R;
import com.instagram.reels.prompt.model.PromptStickerModel;
import java.util.List;

public final class HDQ extends KHj {
    public final float A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final Drawable A04;
    public final C52791Gci A05;
    public final C306386Ly A06;

    public HDQ(Context context, PromptStickerModel promptStickerModel) {
        C362088hK r0;
        this.A00 = (float) AnonymousClass7TG.A02(context);
        this.A01 = C51972G9s.A08(context);
        this.A03 = AnonymousClass7TE.A0C(context.getResources());
        this.A02 = AnonymousClass7TG.A03(context);
        Drawable drawable = context.getDrawable(R.drawable.instagram_gen_ai_pano_filled_16);
        if (drawable != null) {
            DbX.A11(context, drawable, 2Yu.A05(context));
            drawable.setCallback(this);
        } else {
            drawable = null;
        }
        this.A04 = drawable;
        int ordinal = promptStickerModel.A03().ordinal();
        if (ordinal == 7) {
            r0 = C362088hK.A09;
        } else if (ordinal == 9) {
            r0 = C362088hK.A0B;
        } else {
            throw new IllegalArgumentException();
        }
        int i = r0.A04;
        Spannable spannable = C306386Ly.A0d;
        C306386Ly r2 = new C306386Ly(context, context.getResources().getDimensionPixelSize(R.dimen.browser_error_screen_description_width));
        C339207jE.A00(context, AnonymousClass7TG.A0N(context), r2, AnonymousClass05K.A01);
        r2.A0A((float) C51972G9s.A08(context));
        r2.A0F(context.getColor(2Yu.A0E(context)));
        r2.A0M(context.getString(i));
        r2.setCallback(this);
        this.A06 = r2;
        C52791Gci gci = new C52791Gci(context);
        gci.setCallback(this);
        this.A05 = gci;
    }

    public final void draw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        Path A0C = C51965G9l.A0C();
        A0C.rewind();
        RectF rectF = new RectF(0.0f, 0.0f, (float) getBounds().right, (float) getBounds().bottom);
        float f = this.A00;
        A0C.addRoundRect(rectF, f, f, Path.Direction.CW);
        canvas.clipPath(A0C);
        this.A05.draw(canvas);
        Drawable drawable = this.A04;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        this.A06.draw(canvas);
    }

    public final List A07() {
        return C51967G9n.A0s(new Drawable[]{this.A04, this.A06, this.A05});
    }

    public final int getIntrinsicHeight() {
        return this.A06.A06 + (this.A03 * 2);
    }

    public final int getIntrinsicWidth() {
        int i;
        Drawable drawable = this.A04;
        if (drawable != null) {
            i = drawable.getIntrinsicWidth();
        } else {
            i = 0;
        }
        return i + this.A02 + this.A06.A0A + (this.A01 * 2);
    }

    public final int A08() {
        return getIntrinsicHeight() / 2;
    }

    public final void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        float f = ((float) (i + i3)) / 2.0f;
        float f2 = ((float) (i2 + i4)) / 2.0f;
        float intrinsicWidth = f - (((float) getIntrinsicWidth()) / 2.0f);
        float intrinsicHeight = f2 - (((float) getIntrinsicHeight()) / 2.0f);
        float intrinsicWidth2 = f + (((float) getIntrinsicWidth()) / 2.0f);
        int i5 = (int) intrinsicWidth;
        int i6 = (int) intrinsicWidth2;
        this.A05.setBounds(i5, (int) intrinsicHeight, i6, (int) ((((float) getIntrinsicHeight()) / 2.0f) + f2));
        Drawable drawable = this.A04;
        if (drawable != null) {
            int i7 = this.A01 + i5;
            drawable.setBounds(i7, (int) (f2 - ((float) (drawable.getIntrinsicHeight() / 2))), i7 + drawable.getIntrinsicWidth(), (int) (((float) (drawable.getIntrinsicHeight() / 2)) + f2));
        }
        C306386Ly r5 = this.A06;
        int i8 = this.A01;
        int i9 = (int) ((intrinsicWidth2 - ((float) i8)) - ((float) r5.A0A));
        float f3 = (float) (r5.A06 / 2);
        r5.setBounds(i9, (int) (f2 - f3), i6 - i8, (int) (f2 + f3));
    }
}
