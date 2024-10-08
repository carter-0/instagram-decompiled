package X;

import android.view.ViewGroup;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;

public final class M4Y implements Runnable {
    public final /* synthetic */ LtB A00;

    public M4Y(LtB ltB) {
        this.A00 = ltB;
    }

    public final void run() {
        String str;
        LtB ltB = this.A00;
        AppBarLayout appBarLayout = ltB.A09;
        if (appBarLayout == null) {
            str = "appBarLayout";
        } else {
            ViewGroup viewGroup = ltB.A06;
            if (viewGroup != null) {
                appBarLayout.setMinimumHeight(viewGroup.getHeight() + ltB.A02);
                CollapsingToolbarLayout collapsingToolbarLayout = ltB.A0A;
                if (collapsingToolbarLayout == null) {
                    str = "collapsingToolbar";
                } else {
                    ViewGroup viewGroup2 = ltB.A06;
                    if (viewGroup2 != null) {
                        collapsingToolbarLayout.setMinimumHeight(viewGroup2.getHeight() + ltB.A02);
                        return;
                    }
                }
            }
            0qQ.A0F("actionBar");
            throw AnonymousClass00P.createAndThrow();
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }
}
