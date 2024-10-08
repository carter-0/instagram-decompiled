package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.UjJ  reason: case insensitive filesystem */
public final class C15833UjJ extends C268694dq {
    public boolean A00;
    public final int A01;
    public final int A02;
    public final Drawable A03;
    public final Interpolator A04 = new DecelerateInterpolator(1.5f);
    public final U1V A05;
    public final List A06;

    public final List A07() {
        return this.A06;
    }

    public final void draw(Canvas canvas) {
        U1V u1v;
        float f;
        if (this.A00) {
            long currentTimeMillis = System.currentTimeMillis() % 4200;
            if (currentTimeMillis < 350) {
                f = this.A04.getInterpolation(0mi.A01((float) currentTimeMillis, 0.0f, 350.0f, 0.0f, 1.0f));
                u1v = this.A05;
            } else if (currentTimeMillis < 2100) {
                this.A05.A01(0.5f);
            } else if (currentTimeMillis < 2450) {
                float interpolation = this.A04.getInterpolation(0mi.A01((float) currentTimeMillis, 2100.0f, 2450.0f, 0.0f, 1.0f));
                u1v = this.A05;
                f = 1.0f - interpolation;
            } else {
                this.A05.A01(0.0f);
            }
            u1v.A01(f * 0.5f);
        }
        this.A03.draw(canvas);
        this.A05.draw(canvas);
        if (this.A00) {
            invalidateSelf();
        }
    }

    public C15833UjJ(UserSession userSession, Context context, boolean z) {
        GradientDrawable gradientDrawable;
        ArrayList arrayList = new ArrayList();
        this.A06 = arrayList;
        Resources resources = context.getResources();
        double A002 = C346897vw.A00(userSession);
        this.A01 = (int) (((double) resources.getDimensionPixelSize(R.dimen.biz_sign_up_divider_bottom_margin)) * A002 * A002);
        this.A02 = (int) (((double) resources.getDimensionPixelSize(R.dimen.achievements_only_you_top_margin)) * A002);
        if (z) {
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            gradientDrawable2.setShape(0);
            gradientDrawable2.setColor(AnonymousClass7TE.A09(context));
            gradientDrawable2.setCornerRadius((float) (((double) resources.getDimension(R.dimen.account_discovery_bottom_gap)) * A002));
            gradientDrawable = gradientDrawable2;
        } else {
            gradientDrawable = context.getDrawable(R.drawable.slider_sticker_tray_background);
        }
        this.A03 = gradientDrawable;
        gradientDrawable.setCallback(this);
        U1V u1v = new U1V(context, userSession);
        this.A05 = u1v;
        u1v.setCallback(this);
        u1v.A09 = true;
        u1v.invalidateSelf();
        u1v.A02((int) (((double) resources.getDimensionPixelSize(R.dimen.abc_select_dialog_padding_start_material)) * A002 * A002));
        u1v.A04(AnonymousClass05K.A00);
        C15840UjQ ujQ = u1v.A0N;
        ujQ.A06.A0M("😍");
        ujQ.invalidateSelf();
        u1v.A03((int) (((double) AnonymousClass7TE.A0C(resources)) * A002));
        Collections.addAll(arrayList, new Drawable[]{this.A03, u1v});
    }

    public final void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        Drawable drawable = this.A03;
        int i5 = ((i4 - i2) / 2) + i2;
        int i6 = this.A01 / 2;
        drawable.setBounds(i, i5 - i6, i3, i5 + i6);
        U1V u1v = this.A05;
        int i7 = this.A02;
        u1v.setBounds(i + i7, i2, i3 - i7, i4);
    }
}
