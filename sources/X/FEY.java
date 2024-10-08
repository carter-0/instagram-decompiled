package X;

import android.content.Context;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.DecelerateInterpolator;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgTextView;

public abstract class FEY {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public final float A05;
    public final Context A06;
    public final View A07;
    public final AnonymousClass0iw A08;
    public final IgTextView A09;

    public static final void A00(FEY fey, float f, float f2) {
        View view = fey.A07;
        ViewPropertyAnimator duration = view.animate().setInterpolator(new DecelerateInterpolator()).scaleX(f).scaleY(f2).setDuration(200);
        0qQ.A07(duration);
        view.setPivotY((float) view.getMeasuredHeight());
        duration.start();
    }

    public static final void A01(FEY fey, float f, float f2, float f3) {
        fey.A09.animate().setInterpolator(new DecelerateInterpolator()).scaleX(f).scaleY(f2).y(f3).setDuration(200).start();
    }

    public FEY(Context context, View view, AnonymousClass0iw r5, IgTextView igTextView) {
        this.A06 = context;
        this.A07 = view;
        this.A09 = igTextView;
        this.A08 = r5;
        this.A05 = context.getResources().getDimension(R.dimen.add_to_story_dual_destination_share_sheet_avatar_icon_size);
    }
}
