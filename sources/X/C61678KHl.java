package X;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Spannable;
import com.instagram.android.R;
import java.util.List;

/* renamed from: X.KHl  reason: case insensitive filesystem */
public final class C61678KHl extends C268694dq {
    public final C306386Ly A00;
    public final int A01;

    public C61678KHl(Context context, int i) {
        this.A01 = JTR.A05(context);
        Spannable spannable = C306386Ly.A0d;
        C306386Ly A0s = AnonymousClass7TE.A0s(context, context.getResources().getDimensionPixelSize(R.dimen.achievements_list_container_height));
        C339207jE.A00(context, AnonymousClass7TG.A0N(context), A0s, AnonymousClass05K.A01);
        A0s.A0A((float) AnonymousClass7TH.A01(context));
        A0s.A0F(i);
        JTU.A0f(context, this, A0s, 2131965999, 1);
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
        return this.A01 + this.A00.A0A;
    }

    public final void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        float intrinsicWidth = (((float) (i + i3)) / 2.0f) + (((float) getIntrinsicWidth()) / 2.0f);
        C306386Ly r1 = this.A00;
        JTS.A1U(r1, intrinsicWidth, (float) r1.A0A, ((float) (i2 + i4)) / 2.0f);
    }
}
