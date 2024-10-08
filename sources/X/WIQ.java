package X;

import com.facebook.android.maps.model.LatLng;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

public final class WIQ implements X2T {
    public final /* synthetic */ C15930Ukv A00;

    public WIQ(C15930Ukv ukv) {
        this.A00 = ukv;
    }

    public final void DPW(LatLng latLng) {
        C15930Ukv ukv = this.A00;
        BottomSheetBehavior bottomSheetBehavior = ukv.A03;
        if (bottomSheetBehavior != null) {
            if (bottomSheetBehavior.A0G != 5) {
                bottomSheetBehavior.A0W(5);
            } else {
                return;
            }
        }
        BottomSheetBehavior bottomSheetBehavior2 = ukv.A02;
        if (bottomSheetBehavior2 != null) {
            bottomSheetBehavior2.A0W(4);
        }
    }
}
