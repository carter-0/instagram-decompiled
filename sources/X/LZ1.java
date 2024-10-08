package X;

import android.content.Context;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.creation.fragment.EditMediaInfoFragment;

public final class LZ1 implements ViewTreeObserver.OnPreDrawListener {
    public final int A00;
    public final Object A01;

    public LZ1(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final boolean onPreDraw() {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        switch (this.A00) {
            case 0:
                C63847L9c l9c = (C63847L9c) this.A01;
                if (l9c.A00) {
                    return true;
                }
                l9c.A00 = true;
                View view = (View) l9c.A02.get();
                if (view == null) {
                    return true;
                }
                view.postDelayed(new C65876M2r(l9c), 300);
                return true;
            case 1:
                C59772JXp jXp = (C59772JXp) this.A01;
                ViewGroup viewGroup = jXp.A06;
                viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
                View view2 = jXp.A04;
                View view3 = jXp.A05;
                int BwF = jXp.A07.BwF();
                0qQ.A0B(view3, 2);
                Context context = viewGroup.getContext();
                RectF rectF = 0nA.A01;
                RectF A0Y = AnonymousClass7TE.A0Y();
                0nA.A0L(A0Y, viewGroup);
                0qQ.A0A(context);
                int A08 = (BwF - ((int) (((float) 0nA.A08(context)) - A0Y.bottom))) - (context.getResources().getDimensionPixelSize(R.dimen.clips_segment_button_size) / 2);
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                if (!(!(layoutParams instanceof ViewGroup.MarginLayoutParams) || (marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams) == null || marginLayoutParams2.bottomMargin == A08)) {
                    marginLayoutParams2.bottomMargin = A08;
                    view2.setLayoutParams(marginLayoutParams2);
                }
                ViewGroup.LayoutParams layoutParams2 = view3.getLayoutParams();
                if (!(layoutParams2 instanceof ViewGroup.MarginLayoutParams) || (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2) == null || marginLayoutParams.bottomMargin == A08) {
                    return false;
                }
                marginLayoutParams.bottomMargin = A08;
                view3.setLayoutParams(marginLayoutParams);
                return false;
            default:
                EditMediaInfoFragment editMediaInfoFragment = (EditMediaInfoFragment) this.A01;
                TextView textView = editMediaInfoFragment.mBelowUsernameLabel;
                if (textView == null || editMediaInfoFragment.mTextContainer == null || editMediaInfoFragment.mTimestamp == null || editMediaInfoFragment.mUserImageView == null) {
                    return false;
                }
                textView.getViewTreeObserver().removeOnPreDrawListener(this);
                EditMediaInfoFragment.A0B(editMediaInfoFragment);
                return false;
        }
    }
}
