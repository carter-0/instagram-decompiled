package X;

import android.os.Bundle;
import com.instagram.igtv.uploadflow.upload.IGTVUploadViewModel;

public final class KTT extends C61382K5a implements AnonymousClass4DU, C66517MUv {
    public static final String __redex_internal_original_name = "IGTVUploadEditProfileCropFragment";
    public C64720Lgx A00;
    public final AnonymousClass0eM A01 = C66306MMp.A00(this, C66306MMp.A02(this, 31), new C73666Phf(8, (Object) null, this), DbS.A0z(IGTVUploadViewModel.class), 32);

    public final void configureActionBar(2da r3) {
        0qQ.A0B(r3, 0);
        r3.setTitle(getString(2131964024));
        DbX.A19(LY6.A00(this, 10), LJA.A00(this, r3), r3);
    }

    public final String getModuleName() {
        return "igtv_edit_profile_crop_fragment";
    }

    public final boolean isOrganicEligible() {
        return true;
    }

    public final boolean isSponsoredEligible() {
        return false;
    }

    public final boolean BCK() {
        return this.A03;
    }

    public final void Cxb() {
        C63299Kui.A00(this, this.A01);
    }

    public final void D92() {
        JTO.A0k(this.A01).A04(this, KTQ.A00);
    }

    public final boolean onBackPressed() {
        C64720Lgx lgx = this.A00;
        if (lgx != null) {
            return lgx.onBackPressed();
        }
        0qQ.A0F("backHandlerDelegate");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void onCreate(Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(-2053818176);
        super.onCreate(bundle);
        this.A00 = new C64720Lgx(requireContext(), this);
        AnonymousClass0fD.A09(-1462994465, A02);
    }
}
