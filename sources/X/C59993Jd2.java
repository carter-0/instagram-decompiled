package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.interactive.InteractiveDrawableContainer;

/* renamed from: X.Jd2  reason: case insensitive filesystem */
public final class C59993Jd2 extends Drawable {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final int A09;
    public final int A0A;
    public final int A0B;
    public final int A0C;
    public final Context A0D;
    public final Bitmap A0E;
    public final C3499282m A0F;
    public final String A0G;
    public final AnonymousClass0eM A0H = C66295MMe.A00(this, 13);
    public final AnonymousClass0eM A0I = C66295MMe.A00(this, 14);
    public final AnonymousClass0eM A0J = C66295MMe.A00(this, 15);
    public final AnonymousClass0eM A0K = C66295MMe.A00(this, 16);
    public final AnonymousClass0eM A0L = C66295MMe.A00(this, 17);
    public final AnonymousClass0eM A0M = C66295MMe.A00(this, 18);
    public final AnonymousClass0eM A0N = C66295MMe.A00(this, 19);
    public final float A0O;
    public final float A0P;
    public final UserSession A0Q;
    public final InteractiveDrawableContainer A0R;

    public C59993Jd2(Context context, Bitmap bitmap, UserSession userSession, C3499282m r6, InteractiveDrawableContainer interactiveDrawableContainer) {
        DbW.A1N(r6, 3, interactiveDrawableContainer);
        this.A0Q = userSession;
        this.A0D = context;
        this.A0F = r6;
        this.A0E = bitmap;
        this.A0R = interactiveDrawableContainer;
        this.A0P = (float) AnonymousClass7TH.A01(context);
        this.A0O = (float) AnonymousClass7TG.A02(context);
        int A092 = (int) (((float) 0nA.A09(context)) * 0.75f);
        this.A01 = A092;
        this.A00 = (int) (((float) A092) / 0.75f);
        this.A0G = r6.A03;
        this.A08 = AnonymousClass7TE.A09(context);
        this.A0C = context.getColor(R.color.black_50_transparent);
        this.A0A = context.getColor(R.color.black_30_transparent);
        this.A07 = context.getColor(R.color.black_10_transparent);
        this.A0B = context.getColor(2Yu.A0A(context));
        this.A06 = bitmap.getWidth();
        this.A09 = JTR.A06(context);
    }

    public final int getOpacity() {
        return -3;
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public final int getIntrinsicHeight() {
        return (int) (((float) this.A01) / 0.75f);
    }

    public final int getIntrinsicWidth() {
        return (int) (JTO.A02(this.A0E) * 0.75f);
    }

    public final void setAlpha(int i) {
        Drawable A0D2 = JTO.A0D(this.A0H);
        if (A0D2 != null) {
            A0D2.setAlpha(i);
        }
    }

    public static void A00(Canvas canvas, AnonymousClass0eM r4, int i, int i2) {
        ((Drawable) r4.getValue()).setBounds(i2, i - ((Drawable) r4.getValue()).getIntrinsicHeight(), ((Drawable) r4.getValue()).getIntrinsicWidth() + i2, i);
        canvas.save();
        ((Drawable) r4.getValue()).draw(canvas);
        canvas.restore();
    }

    public final void draw(Canvas canvas) {
        Rect A0L2 = AnonymousClass7TG.A0L(this, canvas);
        int i = (A0L2.left + A0L2.right) / 2;
        int i2 = (A0L2.top + A0L2.bottom) / 2;
        int i3 = this.A01;
        int i4 = i - (i3 / 2);
        this.A03 = i4;
        int i5 = this.A00;
        int i6 = i2 - (i5 / 2);
        this.A05 = i6;
        this.A04 = i4 + i3;
        this.A02 = i6 + i5;
        AnonymousClass0eM r5 = this.A0H;
        if (r5.getValue() != null) {
            Drawable A0D2 = JTO.A0D(r5);
            if (A0D2 != null) {
                A0D2.setBounds(this.A03, this.A05, this.A04, this.A02);
            }
            Drawable A0D3 = JTO.A0D(r5);
            if (A0D3 != null) {
                A0D3.draw(canvas);
            }
            canvas.save();
            Context context = this.A0D;
            canvas.drawRoundRect(new RectF((float) this.A03, ((float) this.A05) + 0nA.A04(context, 140), (float) this.A04, (float) this.A02), 12.0f, 12.0f, (Paint) this.A0I.getValue());
            canvas.restore();
            int i7 = this.A03;
            int i8 = (int) this.A0P;
            int i9 = i7 + i8;
            int i10 = this.A05 + i8;
            AnonymousClass0eM r3 = this.A0L;
            JTO.A0D(r3).setBounds(i9, i10, JTO.A0D(r3).getIntrinsicWidth() + i9, JTT.A09(r3) + i10);
            canvas.save();
            JTQ.A0u(canvas, r3);
            canvas.restore();
            int i11 = this.A02;
            int i12 = (int) this.A0O;
            int i13 = i11 - i12;
            int i14 = this.A03 + i12;
            AnonymousClass0eM r1 = this.A0K;
            Drawable A0D4 = JTO.A0D(r1);
            int i15 = this.A09;
            int i16 = i13 - i15;
            int i17 = i15 + i14;
            A0D4.setBounds(i14, i16, i17, i13);
            canvas.save();
            JTQ.A0u(canvas, r1);
            canvas.restore();
            int A052 = i17 + JTR.A05(context);
            AnonymousClass0eM r12 = this.A0N;
            A00(canvas, r12, i13 - ((i15 - JTT.A09(r12)) / 2), A052);
            int dimensionPixelSize = i16 - context.getResources().getDimensionPixelSize(R.dimen.abc_action_bar_elevation_material);
            AnonymousClass0eM r13 = this.A0M;
            int A092 = JTT.A09(r13);
            A00(canvas, r13, dimensionPixelSize, i14);
            A00(canvas, this.A0J, (dimensionPixelSize - A092) - AnonymousClass7TF.A02(context, R.dimen.abc_action_bar_elevation_material), i14);
        }
    }
}
