package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.9jz  reason: invalid class name and case insensitive filesystem */
public final class C386059jz extends C268694dq implements C300645xY, B1L, C369878vT {
    public final Drawable A00;
    public final C369848vQ A01;
    public final GradientDrawable A02;
    public final UserSession A03;
    public final C3498482b A04;
    public final List A05 = 0sr.A1M(new Drawable[]{this.A00, this.A01});

    public final void draw(Canvas canvas) {
        AnonymousClass2Fj r0;
        0qQ.A0B(canvas, 0);
        this.A00.draw(canvas);
        C3498482b r02 = this.A04;
        if (r02 == null || (r0 = r02.A05) == null || !AnonymousClass7TF.A1Y(r0.A02(), true)) {
            this.A02.draw(canvas);
            canvas.save();
            canvas.scale(1.3157895f, 1.3157895f);
            this.A01.draw(canvas);
            canvas.restore();
        }
    }

    public final void onBoundsChange(Rect rect) {
        0qQ.A0B(rect, 0);
        Iterator it = this.A05.iterator();
        while (it.hasNext()) {
            AnonymousClass7TE.A0Z(it).setBounds(rect);
        }
    }

    public final List A07() {
        return this.A05;
    }

    public final Drawable Aco() {
        return this.A00;
    }

    public final C369848vQ Bgf() {
        return this.A01;
    }

    public final String C4F() {
        AnonymousClass2Fj r0;
        C3498482b r02 = this.A04;
        if (r02 == null || (r0 = r02.A05) == null || !AnonymousClass7TF.A1Y(r0.A02(), true)) {
            return "reel_mention_post";
        }
        return "reel_mention_post_fullscreen_photo";
    }

    public final int getIntrinsicHeight() {
        C3498482b r0 = this.A04;
        if (r0 != null) {
            return r0.A00;
        }
        return this.A00.getIntrinsicHeight();
    }

    public final int getIntrinsicWidth() {
        C3498482b r0 = this.A04;
        if (r0 != null) {
            return r0.A01;
        }
        return this.A00.getIntrinsicWidth();
    }

    public C386059jz(Context context, Drawable drawable, Drawable drawable2, UserSession userSession, C3498482b r19, User user, String str, String str2) {
        this.A00 = drawable;
        this.A03 = userSession;
        this.A04 = r19;
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.add_account_icon_circle_radius);
        int A0F = AnonymousClass7TE.A0F(resources);
        int A0D = AnonymousClass7TE.A0D(resources);
        User user2 = user;
        0qQ.A0B(user2, 2);
        Resources resources2 = context.getResources();
        resources2.getDimensionPixelSize(R.dimen.abc_alert_dialog_button_dimen);
        resources2.getDimensionPixelSize(R.dimen.font_large);
        resources2.getDimensionPixelSize(R.dimen.account_discovery_bottom_gap);
        this.A01 = new C369848vQ(context, drawable2, 0qm.A0v, user2, str2, str, A0D, A0D, dimensionPixelSize, A0F, A0D, false);
        int[] intArray = context.getResources().getIntArray(R.array.media_sticker_top_legibility_gradient_colors);
        0qQ.A07(intArray);
        int intrinsicWidth = getIntrinsicWidth();
        int intrinsicHeight = getIntrinsicHeight();
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, intArray);
        gradientDrawable.setShape(0);
        gradientDrawable.setBounds(0, 0, intrinsicWidth, (int) (((float) intrinsicHeight) * 0.22f));
        gradientDrawable.setCornerRadius(((float) intrinsicWidth) * 0.04f);
        this.A02 = gradientDrawable;
    }
}
