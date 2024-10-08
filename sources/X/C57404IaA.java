package X;

import android.os.Bundle;
import com.instagram.adshistory.fragment.RecentAdActivityFragment;

/* renamed from: X.IaA  reason: case insensitive filesystem */
public final class C57404IaA implements C322776wO {
    public final int A00;
    public final Object A01;

    public final /* synthetic */ void DBz(C320156rr r1) {
    }

    public C57404IaA(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void DBx() {
    }

    public final void DBy() {
        HMH hmh;
        switch (this.A00) {
            case 0:
                RecentAdActivityFragment recentAdActivityFragment = (RecentAdActivityFragment) this.A01;
                C270804hK.A01(recentAdActivityFragment.requireActivity(), AnonymousClass7TE.A0l(recentAdActivityFragment.A0D));
                return;
            case 1:
                ((C52770GcN) this.A01).A0S.CHs();
                return;
            default:
                Bundle A0a = AnonymousClass7TE.A0a();
                H15 h15 = (H15) this.A01;
                if (h15.A0T) {
                    hmh = HMH.ADD_TO_FAVORITES_COLLECTION;
                } else {
                    hmh = HMH.ADD_TO_EXISTING_COLLECTION;
                }
                A0a.putSerializable("SaveFragment.SAVE_HOME_TAB_MODE", hmh);
                A0a.putParcelable("SaveFragment.ARGUMENT_SAVED_FEED_COLLECTION", h15.A0C);
                DbU.A1K(h15, C51975G9x.A0a(A0a, h15, h15.A05));
                return;
        }
    }
}
