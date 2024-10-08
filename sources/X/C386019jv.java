package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.9jv  reason: invalid class name and case insensitive filesystem */
public final class C386019jv extends C268694dq {
    public final int A00;
    public final int A01;
    public final Paint A02 = new Paint();
    public final Paint A03;
    public final U1N A04;
    public final U1N A05;
    public final List A06;

    public C386019jv(Context context, UserSession userSession, User user) {
        AnonymousClass7TF.A1B(context, 1, userSession);
        ArrayList A1C = AnonymousClass7TE.A1C();
        this.A06 = A1C;
        U1N u1n = new U1N(context);
        this.A04 = u1n;
        Paint A0V = AnonymousClass7TE.A0V(1);
        this.A03 = A0V;
        u1n.setCallback(this);
        u1n.A00(AnonymousClass7TF.A0Q(userSession).Bh3());
        U1N u1n2 = new U1N(context);
        this.A05 = u1n2;
        u1n2.setCallback(this);
        u1n2.A00(user.Bh3());
        Resources resources = context.getResources();
        this.A00 = resources.getDimensionPixelSize(R.dimen.ad_not_delivering_thumbnail_height);
        this.A01 = AnonymousClass7TE.A0D(resources);
        A0V.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_OUT));
        A0V.setStyle(Paint.Style.STROKE);
        A0V.setColor(0);
        A0V.setStrokeWidth((float) AnonymousClass7TE.A0E(resources));
        Collections.addAll(A1C, new U1N[]{u1n, u1n2});
    }

    public final void draw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        canvas.saveLayer((RectF) null, this.A02);
        this.A04.draw(canvas);
        U1N u1n = this.A05;
        canvas.drawCircle((float) AnonymousClass7TF.A04(u1n), (float) AnonymousClass7TF.A05(u1n), (float) (this.A00 / 2), this.A03);
        u1n.draw(canvas);
        canvas.restore();
    }

    public final List A07() {
        return this.A06;
    }

    public final int getIntrinsicHeight() {
        return this.A00;
    }

    public final int getIntrinsicWidth() {
        return (this.A00 * 2) - this.A01;
    }

    public final void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        int i5 = (i + i3) / 2;
        U1N u1n = this.A04;
        int i6 = this.A00;
        int i7 = this.A01;
        int i8 = i6 - i7;
        int i9 = i6 + i2;
        u1n.setBounds(i5 - i8, i2, i7 + i5, i9);
        this.A05.setBounds(i5 - i7, i2, i5 + i8, i9);
    }
}
