package X;

import com.instagram.discovery.mediamap.fragment.MapBottomSheetController;
import com.instagram.model.reels.Reel;

/* renamed from: X.Vfk  reason: case insensitive filesystem */
public final class C17773Vfk {
    public final /* synthetic */ C19354WVv A00;

    public C17773Vfk(C19354WVv wVv) {
        this.A00 = wVv;
    }

    public final void A00(Reel reel, AnonymousClass3N3 r8) {
        C19354WVv wVv = this.A00;
        MapBottomSheetController mapBottomSheetController = wVv.A0D.A0A;
        if (((float) mapBottomSheetController.mBottomSheetBehavior.A0F.A01) == mapBottomSheetController.A01()) {
            C13990Tnq.A1K(wVv.A0C.A0A);
        } else {
            wVv.A0B.A08(reel, AnonymousClass3BQ.MAP_BOTTOM_SHEET, r8);
        }
    }
}
