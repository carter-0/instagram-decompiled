package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.CircularImageView;

public final class WJk implements C252203oj {
    public CircularImageView A00;
    public final float A01;
    public final View A02;
    public final FrameLayout A03;
    public final 2cs A04;
    public final IgTextView A05;

    public WJk(FrameLayout frameLayout) {
        0qQ.A0B(frameLayout, 1);
        this.A03 = frameLayout;
        Context context = frameLayout.getContext();
        View A0C = DbT.A0C(LayoutInflater.from(context), frameLayout, R.layout.layout_map_pill);
        this.A02 = A0C;
        0qQ.A0A(context);
        this.A01 = 0nA.A04(context, 50);
        2cs A022 = 2cp.A00().A02();
        A022.A06 = true;
        A022.A0A(this);
        this.A04 = A022;
        this.A00 = DbU.A0X(A0C, R.id.right_image);
        this.A05 = DbT.A0a(A0C, R.id.text);
        A00((float) A022.A09.A00);
    }

    public final void DmB(2cs r1) {
    }

    public final void DmC(2cs r1) {
    }

    public final void DmD(2cs r1) {
    }

    public final void DmE(2cs r4) {
        0qQ.A0B(r4, 0);
        A00((float) r4.A09.A00);
    }

    private final void A00(float f) {
        if (this.A04.A09.A00 == 0.0d) {
            View view = this.A02;
            view.setAlpha(0.0f);
            view.setVisibility(4);
            view.setTranslationY(this.A01);
            if (view.getParent() != null) {
                C3019160o.A01(view).removeView(view);
                return;
            }
            return;
        }
        View view2 = this.A02;
        ViewParent parent = view2.getParent();
        FrameLayout frameLayout = this.A03;
        if (parent != frameLayout) {
            view2.setAlpha(0.0f);
            view2.setVisibility(4);
            view2.setTranslationY(this.A01);
            if (view2.getParent() != null) {
                C3019160o.A01(view2).removeView(view2);
            }
            frameLayout.addView(view2);
        }
        view2.setVisibility(0);
        view2.setAlpha(0mi.A02(f, 0.0f, 0.5f, 0.0f, 1.0f));
        view2.setTranslationY(0mi.A02(f, 0.0f, 1.0f, this.A01, 0.0f));
    }
}
