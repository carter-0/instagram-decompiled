package X;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.ConstrainedImageView;

public abstract class AIM {
    public static final RectF A00 = AnonymousClass7TE.A0Y();
    public static final RectF A01 = AnonymousClass7TE.A0Y();

    /* JADX WARNING: type inference failed for: r1v1, types: [android.widget.ImageView, android.view.View, com.instagram.common.ui.widget.imageview.ConstrainedImageView] */
    public static final void A02(UserSession userSession, C357638Yz r13, AnonymousClass8MJ r14, C380519Ym r15, C317876nz r16, Long l) {
        C279284yO r0;
        C268684dp r132;
        C380519Ym r8 = r15;
        C317876nz r9 = r16;
        AnonymousClass7TG.A1O(r15, r9);
        UserSession userSession2 = userSession;
        29J r2 = 27p.A01(userSession).A01;
        0qQ.A07(r2);
        r2.A02(r9.A0Z, r9.A00().name());
        ? r1 = r15.A03;
        Context A0S = AnonymousClass7TE.A0S(r1);
        if (r13 != null) {
            r0 = (C279284yO) r13.A08.A00;
        } else {
            r0 = null;
        }
        A66 A012 = AJA.A01(A0S, userSession, r0, r14, r9);
        r15.A02.A02();
        r1.setVisibility(0);
        Drawable drawable = A012.A00;
        r1.setImageDrawable(drawable);
        r1.setContentDescription(A012.A02);
        r15.A00 = new A74(userSession2, r14, r8, r9, l);
        AnonymousClass7TG.A1B(r1, drawable);
        int ordinal = r9.A00().ordinal();
        if (ordinal == 104 || ordinal == 37 || ordinal == 65) {
            Drawable drawable2 = r1.getDrawable();
            if (!(drawable2 instanceof C268684dp) || (r132 = (C268684dp) drawable2) == null || !r132.isLoading()) {
                r1.setScaleType(ImageView.ScaleType.MATRIX);
                r1.A01 = new AZI(drawable2, r15, r9);
            } else {
                r1.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                r1.A01 = null;
                0qQ.A0C(drawable2, "null cannot be cast to non-null type com.instagram.common.ui.drawables.LoadingDrawable");
                r132.A9D(new AZ3(0, drawable2, r132, r15, r9));
            }
        } else if (ordinal == 38 || ordinal == 64) {
            r1.setImageMatrix((Matrix) null);
            r1.setScaleType(ImageView.ScaleType.FIT_CENTER);
            r1.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            r1.A01 = null;
        } else {
            r1.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            r1.A01 = null;
        }
        if (r9.A00() != C318046oG.CUTOUT_VIDEO) {
            new C55973Hqe(r1, new MJ9(3, r9, r2), 182.A06(AnonymousClass7TF.A0H(userSession2), userSession2, 36327297246050631L)).A00();
        }
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [android.view.View, com.instagram.common.ui.widget.imageview.ConstrainedImageView] */
    public static /* synthetic */ ConstrainedImageView A00(Context context, float f, boolean z) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(context.getResources().getDimensionPixelSize(R.dimen.ad_stories_more_info_footer_width), -2, 1.0f);
        ? constrainedImageView = new ConstrainedImageView(context);
        if (z) {
            layoutParams.setMarginEnd(AnonymousClass7TG.A06(context));
        }
        constrainedImageView.setLayoutParams(layoutParams);
        constrainedImageView.A00 = f;
        constrainedImageView.setFocusable(true);
        constrainedImageView.setTag(new C380519Ym(constrainedImageView));
        return constrainedImageView;
    }

    /* JADX WARNING: type inference failed for: r0v8, types: [android.widget.ImageView, com.instagram.common.ui.widget.imageview.ConstrainedImageView] */
    public static final void A01(Drawable drawable, C380519Ym r8, C317876nz r9, int i, int i2) {
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
        RectF rectF = A01;
        rectF.set(0.0f, 0.0f, (float) intrinsicWidth, (float) intrinsicHeight);
        RectF rectF2 = A00;
        rectF2.set(0.0f, 0.0f, (float) i, (float) i2);
        Matrix matrix = r8.A01;
        matrix.reset();
        matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
        float f = ((C317966o8) r9.A0O.get(0)).A07;
        matrix.postScale(f, f, rectF2.centerX(), rectF2.centerY());
        r8.A03.setImageMatrix(matrix);
    }
}
