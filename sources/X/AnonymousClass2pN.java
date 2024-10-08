package X;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.instagram.feed.ui.state.IntentAwareAdPivotState;

/* renamed from: X.2pN  reason: invalid class name */
public final class AnonymousClass2pN {
    public IntentAwareAdPivotState A00;
    public C53082GiG A01;

    public final void A00() {
        C53082GiG giG = this.A01;
        if (giG != null && giG.A04.size() >= 2) {
            C252553pI r1 = null;
            if (giG.A0A) {
                ViewPager2 viewPager2 = giG.A07;
                if (viewPager2 != null) {
                    IntentAwareAdPivotState intentAwareAdPivotState = giG.A01;
                    if (intentAwareAdPivotState != null) {
                        viewPager2.A03(intentAwareAdPivotState.A01 + 1, true);
                    }
                }
                giG.A06.postDelayed(new C57736Ifd(giG), 182.A01(0Tu.A06, giG.A08, 36594362613696188L));
                return;
            }
            C67784Muo muo = new C67784Muo(giG.A05, (C62320sa) null);
            muo.A00 = 1;
            RecyclerView recyclerView = giG.A00;
            if (recyclerView != null) {
                r1 = recyclerView.A0D;
            }
            if ((r1 instanceof LinearLayoutManager) && r1 != null) {
                r1.A0t(muo);
            }
            IntentAwareAdPivotState intentAwareAdPivotState2 = giG.A01;
            if (intentAwareAdPivotState2 != null) {
                intentAwareAdPivotState2.A04 = new C53261Gl9();
                return;
            }
            0qQ.A0F("intentAwareAdPivotState");
            throw AnonymousClass00P.createAndThrow();
        }
    }
}
