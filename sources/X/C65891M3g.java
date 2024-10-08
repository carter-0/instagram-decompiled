package X;

import android.app.Activity;
import com.instagram.api.schemas.MediaCroppingCoordinates;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsSharingDraftViewModel;

/* renamed from: X.M3g  reason: case insensitive filesystem */
public final class C65891M3g implements Runnable {
    public final /* synthetic */ K66 A00;

    public C65891M3g(K66 k66) {
        this.A00 = k66;
    }

    public final void run() {
        K66 k66 = this.A00;
        Activity rootActivity = k66.getRootActivity();
        if (rootActivity != null) {
            AnonymousClass3Q2 A02 = C61829KNs.A02(k66);
            if (A02 == null) {
                0kD.A07(K66.__redex_internal_original_name, "pendingMedia is null in maybeQuickPublishPendingMedia", (Throwable) null);
            } else if (K66.A04(k66) != null && ClipsSharingDraftViewModel.A02(k66)) {
                C293505kq A002 = ClipsSharingDraftViewModel.A00(k66);
                if (k66.A0A == null) {
                    k66.A0A = DbV.A0h(rootActivity);
                }
                boolean z = A002.A17;
                UserSession A0l = AnonymousClass7TE.A0l(k66.A0T);
                C60228Jhl jhl = k66.A07;
                if (jhl == null) {
                    0qQ.A0F("clipsShareSheetViewModel");
                    throw AnonymousClass00P.createAndThrow();
                } else {
                    LRt.A01(rootActivity, (MediaCroppingCoordinates) jhl.A01.A00("PROFILE_CROP_COORDINATES_KEY"), A0l, A002, new C65116Lne(rootActivity, k66, A02), k66, A02, (String) null, z, false);
                }
            }
        }
    }
}
