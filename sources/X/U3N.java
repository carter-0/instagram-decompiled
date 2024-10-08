package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;

public final class U3N extends View {
    public U12 A00;
    public boolean A01 = true;
    public float A02;
    public final C18730Vz9 A03 = C18730Vz9.A00(this, 7);
    public final Runnable A04 = new C19958WiV(this);
    public final Runnable A05 = new C19959WiW(this);
    public final 0sP A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public U3N(Context context, 0sP r6) {
        super(context, (AttributeSet) null, 0);
        0qQ.A0B(r6, 4);
        this.A06 = r6;
    }

    public final void onDraw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        super.onDraw(canvas);
        U12 u12 = this.A00;
        if (u12 != null) {
            u12.draw(canvas);
        }
    }

    public final void onVisibilityChanged(View view, int i) {
        0qQ.A0B(view, 0);
        super.onVisibilityChanged(view, i);
        C18730Vz9.A01(this.A03);
    }

    public final boolean verifyDrawable(Drawable drawable) {
        0qQ.A0B(drawable, 0);
        if (drawable.equals(this.A00) || super.verifyDrawable(drawable)) {
            return true;
        }
        return false;
    }

    public static final U12 A00(U3N u3n) {
        U12 u12 = u3n.A00;
        if (u12 == null) {
            u12 = (U12) u3n.A06.invoke(AnonymousClass7TE.A0S(u3n));
            float f = u3n.A02;
            if (u12.A01 != f) {
                u12.A01 = f;
                u12.A05 = true;
                u12.invalidateSelf();
            }
            float A012 = (float) C18092VlM.A01(C66580MXl.A0B(u3n), 1.0f);
            if (u12.A02 != A012) {
                u12.A02 = A012;
                u12.A05 = true;
                u12.invalidateSelf();
            }
            u12.setCallback(u3n);
            u3n.A00 = u12;
        }
        return u12;
    }

    public static final void A01(U3N u3n) {
        U12 u12 = u3n.A00;
        if (u12 != null) {
            C14090Tph tph = u12.A03;
            if (tph == null) {
                tph = new C14090Tph(U12.A0I, u12, 0.0f);
                tph.A02 = 0.00390625f;
                tph.A03(0.00390625f * 0.75f);
                C14002To4 to4 = tph.A01;
                to4.A01(0.25f);
                to4.A02(100.0f);
                u12.A03 = tph;
            }
            tph.A04 = 15.0f;
            tph.A02();
            Runnable runnable = u3n.A04;
            u3n.removeCallbacks(runnable);
            u3n.postDelayed(runnable, 2500);
        }
    }

    public final boolean getCanPopLid() {
        return false;
    }

    public final float getCornerRadiusPx() {
        return this.A02;
    }

    public final void setCornerRadiusPx(float f) {
        this.A02 = f;
        U12 u12 = this.A00;
        if (u12 != null && u12.A01 != f) {
            u12.A01 = f;
            u12.A05 = true;
            u12.invalidateSelf();
        }
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        A00(this).setBounds(getPaddingLeft(), getPaddingTop(), (i3 - i) - getPaddingRight(), (i4 - i2) - getPaddingBottom());
    }

    public final void onWindowVisibilityChanged(int i) {
        int A062 = AnonymousClass0fD.A06(355341416);
        super.onWindowVisibilityChanged(i);
        C18730Vz9 vz9 = this.A03;
        vz9.A00 = i;
        C18730Vz9.A01(vz9);
        AnonymousClass0fD.A0D(-840514723, A062);
    }
}
