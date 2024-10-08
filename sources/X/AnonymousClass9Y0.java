package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Region;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.instagram.android.R;

/* renamed from: X.9Y0  reason: invalid class name */
public final class AnonymousClass9Y0 extends FrameLayout {
    public float A00;
    public C41835B2q A01;
    public boolean A02;
    public final float A03;
    public final int A04;
    public final Paint A05;
    public final Path A06 = new Path();
    public final RectF A07 = AnonymousClass7TE.A0Y();

    public AnonymousClass9Y0(Context context) {
        super(context, (AttributeSet) null, 0);
        Paint A0V = AnonymousClass7TE.A0V(1);
        this.A05 = A0V;
        setWillNotDraw(false);
        AnonymousClass7TE.A1N(getContext(), A0V, R.color.igds_secondary_button_on_media);
        Resources resources = getResources();
        this.A03 = resources.getDimension(R.dimen.add_to_story_dual_destination_share_sheet_avatar_icon_size) / 2.0f;
        this.A04 = resources.getDimensionPixelSize(R.dimen.add_to_story_dual_destination_share_sheet_avatar_icon_size) / 2;
    }

    public final void onDraw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        super.onDraw(canvas);
        C41835B2q b2q = this.A01;
        if (b2q != null) {
            Path path = this.A06;
            path.reset();
            boolean z = this.A02;
            RectF rectF = this.A07;
            if (z) {
                View view = (View) b2q;
                rectF.set(0.0f, this.A00, AnonymousClass7TE.A02(view) - this.A00, AnonymousClass7TE.A03(view));
            } else {
                float f = this.A00;
                View view2 = (View) b2q;
                rectF.set(f, f, AnonymousClass7TE.A02(view2), AnonymousClass7TE.A03(view2));
            }
            path.setFillType(Path.FillType.INVERSE_WINDING);
            float f2 = (float) this.A04;
            path.addRoundRect(rectF, f2, f2, Path.Direction.CW);
            canvas.save();
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            Paint paint = this.A05;
            canvas.drawRoundRect(rectF, f2, f2, paint);
            canvas.drawPath(path, paint);
            canvas.restore();
        }
    }

    public final void setSecondaryMenu(C41835B2q b2q) {
        0qQ.A0B(b2q, 0);
        A00(0.0f);
        setIsOnRightSide(false);
        this.A01 = b2q;
        removeAllViews();
        addView((View) b2q);
    }

    public final void A00(float f) {
        C41835B2q b2q = this.A01;
        if (b2q != null && b2q.AFg()) {
            setAlpha(f);
            float menuWidth = ((float) b2q.getMenuWidth()) * f;
            float menuHeight = ((float) b2q.getMenuHeight()) * f;
            float f2 = menuWidth;
            if (menuWidth > menuHeight) {
                f2 = menuHeight;
            }
            float f3 = this.A03 - (f2 / 2.0f);
            this.A00 = f3;
            if (f3 < 0.0f) {
                f3 = 0.0f;
            }
            this.A00 = f3;
            View view = (View) b2q;
            int i = (int) menuWidth;
            0nA.A0f(view, i);
            int i2 = (int) menuHeight;
            0nA.A0V(view, i2);
            0nA.A0f(this, i);
            0nA.A0V(this, i2);
            b2q.DVQ(f);
            invalidate();
        }
    }

    public final void setIsOnRightSide(boolean z) {
        this.A02 = z;
        C41835B2q b2q = this.A01;
        if (b2q != null) {
            b2q.setIsOnRightSide(z);
        }
    }

    public final void setSecondaryMenuBackgroundColor(int i) {
        AnonymousClass7TE.A1N(getContext(), this.A05, i);
        invalidate();
    }
}
