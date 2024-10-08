package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.instagram.android.R;
import java.util.HashMap;

public final class Uu5 extends C252633pQ {
    public FrameLayout A00;
    public final Context A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Uu5(Context context) {
        super(context);
        0qQ.A0B(context, 1);
        this.A01 = context;
    }

    public final View A03(Context context, ViewGroup viewGroup) {
        View A09 = DbU.A09(DbT.A0B(context), viewGroup, R.layout.ifu_feed_component, false);
        A09.setTag(new UC7(A09));
        return A09;
    }

    public final void A05(View view) {
    }

    public final int A02() {
        return R.layout.ifu_feed_component;
    }

    public final void A06(C376579In r5, UC7 uc7) {
        ViewParent viewParent;
        FrameLayout frameLayout;
        AnonymousClass7TG.A1N(uc7, r5);
        this.A00 = uc7.A00;
        HashMap hashMap = AnonymousClass3KD.A05;
        String str = r5.A00;
        View view = (View) hashMap.get(str);
        if (view != null) {
            viewParent = view.getParent();
        } else {
            viewParent = null;
        }
        ViewGroup viewGroup = (ViewGroup) viewParent;
        if (viewGroup != null) {
            viewGroup.removeView((View) hashMap.get(str));
        }
        View view2 = (View) hashMap.get(str);
        if (view2 != null && (frameLayout = this.A00) != null) {
            frameLayout.addView(view2);
        }
    }
}
