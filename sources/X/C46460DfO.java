package X;

import com.instagram.user.userlist.fragment.UnifiedFollowFragment;
import java.util.List;

/* renamed from: X.DfO  reason: case insensitive filesystem */
public final class C46460DfO implements Runnable {
    public final /* synthetic */ UnifiedFollowFragment A00;

    public C46460DfO(UnifiedFollowFragment unifiedFollowFragment) {
        this.A00 = unifiedFollowFragment;
    }

    public final void run() {
        String str;
        UnifiedFollowFragment unifiedFollowFragment = this.A00;
        if (unifiedFollowFragment.viewPager != null) {
            C14072TpM tpM = unifiedFollowFragment.A06;
            if (tpM == null) {
                str = "onPageChangedCallback";
            } else {
                List list = unifiedFollowFragment.A0L;
                if (list == null) {
                    str = "tabs";
                } else {
                    tpM.A01(list.indexOf(unifiedFollowFragment.A0A));
                    return;
                }
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
    }
}
