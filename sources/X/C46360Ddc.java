package X;

import com.instagram.aistudio.profile.model.AiStudioProfileBannerModel;
import com.instagram.profile.fragment.UserDetailFragment;

/* renamed from: X.Ddc  reason: case insensitive filesystem */
public final /* synthetic */ class C46360Ddc implements AnonymousClass2gO {
    public final /* synthetic */ UserDetailFragment A00;

    public /* synthetic */ C46360Ddc(UserDetailFragment userDetailFragment) {
        this.A00 = userDetailFragment;
    }

    public final void onChanged(Object obj) {
        AiStudioProfileBannerModel aiStudioProfileBannerModel = (AiStudioProfileBannerModel) obj;
        C322476vt r0 = this.A00.A13;
        if (r0 != null) {
            C322486vu r1 = r0.A00;
            if (r1.A02 != aiStudioProfileBannerModel) {
                r1.A02 = aiStudioProfileBannerModel;
            }
        }
    }
}
