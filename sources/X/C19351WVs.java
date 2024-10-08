package X;

import com.instagram.discovery.mediamap.fragment.MapBottomSheetController;
import com.instagram.model.reels.Reel;

/* renamed from: X.WVs  reason: case insensitive filesystem */
public final class C19351WVs implements C20904X3v {
    public final /* synthetic */ C19353WVu A00;

    public C19351WVs(C19353WVu wVu) {
        this.A00 = wVu;
    }

    public final void D3E(Reel reel, AnonymousClass3N3 r8) {
        0qQ.A0B(r8, 1);
        C19353WVu wVu = this.A00;
        MapBottomSheetController mapBottomSheetController = wVu.A03.A0A;
        if (((float) mapBottomSheetController.mBottomSheetBehavior.A0F.A01) == mapBottomSheetController.A01()) {
            C13990Tnq.A1K(wVu.A02.A0A);
        } else {
            wVu.A01.A08(reel, AnonymousClass3BQ.MAP_BOTTOM_SHEET, r8);
        }
    }
}
