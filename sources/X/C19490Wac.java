package X;

import com.instagram.discovery.mediamap.fragment.LocationListFragment;
import com.instagram.model.reels.Reel;

/* renamed from: X.Wac  reason: case insensitive filesystem */
public final class C19490Wac implements C230222pE {
    public final /* synthetic */ LocationListFragment A00;
    public final /* synthetic */ boolean A01;

    public final /* synthetic */ void DcC(Reel reel) {
    }

    public final /* synthetic */ void Dcl(Reel reel) {
    }

    public C19490Wac(LocationListFragment locationListFragment, boolean z) {
        this.A00 = locationListFragment;
        this.A01 = z;
    }

    public final void DFj(Reel reel, AnonymousClass6UY r4) {
        LocationListFragment locationListFragment = this.A00;
        locationListFragment.mAdapter.notifyDataSetChanged();
        C13990Tnq.A0P(locationListFragment).mMapChromeController.A03();
        if (this.A01 && LocationListFragment.A06(locationListFragment)) {
            LocationListFragment.A05(locationListFragment, LocationListFragment.A02(locationListFragment));
        }
    }
}
