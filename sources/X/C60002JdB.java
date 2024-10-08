package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.JdB  reason: case insensitive filesystem */
public final class C60002JdB extends Drawable implements Drawable.Callback, AnonymousClass1MK {
    public AnonymousClass8DV A00;
    public C61028JvS A01;
    public final float A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final Context A07;
    public final UserSession A08;
    public final AnonymousClass0eM A09 = MMP.A00(this, 26);
    public final AnonymousClass0eM A0A = MMP.A00(this, 27);
    public final AnonymousClass0eM A0B = MMP.A00(this, 28);
    public final AnonymousClass0eM A0C = MMP.A00(this, 29);
    public final AnonymousClass0eM A0D = MMP.A00(this, 30);

    public final void CyF(C226952iF r8, AnonymousClass3LX r9) {
        0qQ.A0B(r9, 1);
        Bitmap bitmap = r9.A01;
        if (bitmap != null) {
            int i = this.A04;
            Bitmap A092 = 1MF.A09(bitmap, i, i, 0, false);
            0qQ.A07(A092);
            AnonymousClass8DV r1 = new AnonymousClass8DV(this.A07.getResources(), A092);
            this.A00 = r1;
            r1.A02(this.A02);
            C61028JvS jvS = this.A01;
            boolean z = jvS.A04;
            this.A01 = new C61028JvS(jvS.A01, 0, true, jvS.A02, z);
            invalidateDrawable(this);
        }
    }

    public final void DJx(C226952iF r1, C254673sr r2) {
    }

    public final void DK4(C226952iF r1, int i) {
    }

    public final void draw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        int i = this.A05;
        if (i > 0) {
            A00(canvas, JTO.A0D(this.A0C), this.A04 + i);
        }
        if (this.A01.A03) {
            Drawable A0D2 = JTO.A0D(this.A0A);
            if (A0D2 != null) {
                A00(canvas, A0D2, this.A04);
            }
            AnonymousClass8DV r1 = this.A00;
            if (r1 != null) {
                A00(canvas, r1, this.A04);
                return;
            }
            return;
        }
        Drawable A0D3 = JTO.A0D(this.A0B);
        int i2 = this.A04;
        A00(canvas, A0D3, i2);
        Drawable A0D4 = JTO.A0D(this.A0D);
        if (A0D4 != null) {
            A00(canvas, A0D4, i2);
        }
        AnonymousClass0eM r2 = this.A09;
        Drawable A0D5 = JTO.A0D(r2);
        if (A0D5 != null) {
            A00(canvas, A0D5, this.A03);
        }
        Drawable A0D6 = JTO.A0D(r2);
        if (A0D6 != null) {
            DbX.A11(this.A07, A0D6, R.color.design_dark_default_color_on_background);
        }
    }

    public final int getOpacity() {
        return -3;
    }

    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
    }

    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
    }

    private final void A00(Canvas canvas, Drawable drawable, int i) {
        int i2 = (this.A06 - i) / 2;
        int i3 = i + i2;
        drawable.setBounds(i2, i2, i3, i3);
        drawable.draw(canvas);
    }

    public final int getIntrinsicHeight() {
        return this.A06;
    }

    public final int getIntrinsicWidth() {
        return this.A06;
    }

    public final void setAlpha(int i) {
        Drawable A0D2;
        if (this.A01.A02) {
            Drawable A0D3 = JTO.A0D(this.A0A);
            if (A0D3 != null) {
                A0D3.setAlpha(i);
            }
            A0D2 = this.A00;
            if (A0D2 == null) {
                return;
            }
        } else {
            Drawable A0D4 = JTO.A0D(this.A09);
            if (A0D4 != null) {
                A0D4.setAlpha(i);
            }
            A0D2 = JTO.A0D(this.A0B);
        }
        A0D2.setAlpha(i);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable A0D2;
        if (this.A01.A02) {
            Drawable A0D3 = JTO.A0D(this.A0A);
            if (A0D3 != null) {
                A0D3.setColorFilter(colorFilter);
            }
            A0D2 = this.A00;
            if (A0D2 == null) {
                return;
            }
        } else {
            Drawable A0D4 = JTO.A0D(this.A09);
            if (A0D4 != null) {
                A0D4.setColorFilter(colorFilter);
            }
            A0D2 = JTO.A0D(this.A0B);
        }
        A0D2.setColorFilter(colorFilter);
    }

    public C60002JdB(Context context, C61028JvS jvS, UserSession userSession, int i) {
        this.A07 = context;
        this.A08 = userSession;
        this.A05 = i;
        this.A01 = jvS;
        int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(R.dimen.asset_picker_section_title_horizontal_padding);
        this.A04 = dimensionPixelOffset;
        this.A02 = ((float) dimensionPixelOffset) / 2.0f;
        this.A03 = context.getResources().getDimensionPixelOffset(JTR.A1X(userSession) ? R.dimen.ai_agent_share_profile_sticker_padding : R.dimen.abc_select_dialog_padding_start_material);
        this.A06 = context.getResources().getDimensionPixelOffset(R.dimen.abc_alert_dialog_button_dimen);
        if (this.A01.A02) {
            1OO A0J = 1NK.A00().A0J(DbS.A0V(this.A01.A01), "AVATAR_STICKER_TOGGLE");
            A0J.A02(this);
            A0J.A01();
        }
    }

    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }
}
