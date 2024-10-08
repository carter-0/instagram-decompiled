package X;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Spannable;
import com.instagram.android.R;
import java.util.List;

/* renamed from: X.KHk  reason: case insensitive filesystem */
public final class C61677KHk extends C268694dq {
    public final C306386Ly A00;

    public C61677KHk(Context context) {
        Spannable spannable = C306386Ly.A0d;
        C306386Ly A0s = AnonymousClass7TE.A0s(context, context.getResources().getDimensionPixelSize(R.dimen.imagine_sticker_width));
        C339207jE.A00(context, AnonymousClass7TG.A0N(context), A0s, AnonymousClass05K.A01);
        A0s.A0A((float) AnonymousClass7TH.A01(context));
        A0s.A0F(AnonymousClass7TF.A03(context, R.attr.igds_color_text_on_white));
        JTU.A0f(context, this, A0s, 2131964136, 1);
        this.A00 = A0s;
    }

    public final void draw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        this.A00.draw(canvas);
    }

    public final List A07() {
        return AnonymousClass7TE.A1I(this.A00);
    }

    public final int getIntrinsicHeight() {
        return this.A00.A06;
    }

    public final int getIntrinsicWidth() {
        return this.A00.A0A;
    }

    public final void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        C306386Ly r2 = this.A00;
        float f = (float) r2.A0A;
        JTS.A1U(r2, (((float) (i + i3)) / 2.0f) + (f / 2.0f), f, ((float) (i2 + i4)) / 2.0f);
    }
}
