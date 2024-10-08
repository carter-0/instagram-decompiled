package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.NQq  reason: case insensitive filesystem */
public final class C68637NQq extends C268694dq {
    public int A00 = 0;
    public int A01 = -1;
    public int A02 = -1;
    public boolean A03;
    public boolean A04 = false;
    public float A05 = 0.0f;
    public float A06 = 0.0f;
    public float A07 = 0.0f;
    public Rect A08 = AnonymousClass7TE.A0W();
    public UserSession A09;
    public final int A0A;
    public final int A0B;
    public final ValueAnimator A0C;
    public final Drawable A0D;
    public final C306386Ly A0E;
    public final C306386Ly A0F;
    public final int A0G;
    public final int A0H;
    public final Typeface A0I;
    public final String A0J;
    public final List A0K;

    private void A00(Context context, UserSession userSession, C306386Ly r9) {
        AJB.A05(context, userSession, r9, (float) this.A0H, 0.0f, 0.0f);
        r9.A0M(this.A0J);
        r9.A0F(this.A0G);
        Typeface typeface = this.A0I;
        if (typeface != null) {
            r9.A0I(typeface);
        }
    }

    public static void A01(C68637NQq nQq, int i) {
        C306386Ly r1 = nQq.A0E;
        r1.A0M(Integer.toString(i));
        A02(nQq, r1, 0.0f);
    }

    public static void A02(C68637NQq nQq, C306386Ly r8, float f) {
        if (r8 != null) {
            float f2 = nQq.A05;
            float f3 = ((float) r8.A0A) / 2.0f;
            float f4 = nQq.A06;
            float f5 = nQq.A07;
            r8.setBounds(C66580MXl.A0C((int) (f2 - f3), (int) ((f4 - f5) + f), (int) (f2 + f3), (int) (f4 + f5 + f)));
        }
    }

    public final List A07() {
        return this.A0K;
    }

    public final void A08() {
        if (!this.A03) {
            this.A03 = true;
            this.A02 = 9;
            ValueAnimator valueAnimator = this.A0C;
            valueAnimator.setRepeatCount(-1);
            valueAnimator.setDuration(50);
            C306386Ly r1 = this.A0F;
            r1.A0M(Integer.toString(this.A02));
            A02(this, r1, (float) (-this.A0A));
            this.A00 = 0;
            this.A04 = true;
            valueAnimator.start();
        }
    }

    public final void A09(int i, boolean z) {
        int i2;
        int i3 = this.A02;
        if (i3 == i || (i2 = this.A01) == i || this.A03) {
            if (i3 != i) {
                this.A00 = 0;
            } else {
                return;
            }
        } else if (!z || this.A04 || i2 == -1) {
            this.A01 = i;
            A01(this, i);
        } else {
            this.A02 = i;
            C306386Ly r1 = this.A0F;
            r1.A0M(Integer.toString(i));
            A02(this, r1, (float) (-this.A0A));
            if (182.A06(0Tu.A05, this.A09, 36324372373516336L)) {
                C342057ny.A00(new C73111PWs(this));
                return;
            }
            this.A00 = 0;
            this.A04 = true;
            this.A0C.start();
            return;
        }
        invalidateSelf();
    }

    public final void draw(Canvas canvas) {
        this.A0D.draw(canvas);
        canvas.save();
        canvas.clipRect(this.A08);
        canvas.translate(0.0f, (float) this.A00);
        this.A0F.draw(canvas);
        this.A0E.draw(canvas);
        canvas.restore();
    }

    public final int getIntrinsicHeight() {
        return this.A0A;
    }

    public final int getIntrinsicWidth() {
        return this.A0B;
    }

    public C68637NQq(Context context, Typeface typeface, UserSession userSession, int i, int i2, int i3) {
        ArrayList A1C = AnonymousClass7TE.A1C();
        this.A0K = A1C;
        this.A09 = userSession;
        this.A0B = i;
        this.A0A = i2;
        this.A0I = typeface;
        Resources resources = context.getResources();
        this.A0H = i3 == -1 ? resources.getDimensionPixelSize(R.dimen.album_preview_add_item_margin) : i3;
        this.A0J = resources.getString(2131956786);
        this.A0G = context.getColor(R.color.countdown_sticker_title_text_color);
        Drawable drawable = context.getDrawable(R.drawable.countdown_sticker_digit_background);
        this.A0D = drawable;
        C306386Ly r2 = new C306386Ly(context, i);
        this.A0E = r2;
        C306386Ly r0 = new C306386Ly(context, i);
        this.A0F = r0;
        A00(context, userSession, r2);
        A00(context, userSession, r0);
        Collections.addAll(A1C, new Drawable[]{drawable, r2, r0});
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        this.A0C = ofFloat;
        ofFloat.setDuration(400);
        C71170Oej.A00(ofFloat, this, 13);
        ofFloat.setRepeatMode(1);
        ofFloat.setRepeatCount(0);
        C71161Oea.A00(ofFloat, this, 11);
    }

    public final void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        float f = ((float) (i + i3)) / 2.0f;
        this.A05 = f;
        float f2 = ((float) (i2 + i4)) / 2.0f;
        this.A06 = f2;
        float f3 = (float) this.A0B;
        int i5 = this.A0A;
        C306386Ly r4 = this.A0E;
        this.A07 = ((float) r4.A06) / 2.0f;
        float f4 = f3 / 2.0f;
        float f5 = ((float) i5) / 2.0f;
        Rect A0C2 = C66580MXl.A0C((int) (f - f4), (int) (f2 - f5), (int) (f + f4), (int) (f2 + f5));
        this.A08 = A0C2;
        this.A0D.setBounds(A0C2);
        A02(this, r4, 0.0f);
        A02(this, this.A0F, (float) (-i5));
    }
}
