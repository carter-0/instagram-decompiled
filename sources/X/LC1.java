package X;

import com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsSharingDraftViewModel;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.repository.ClipsDraftRepository;

public final class LC1 {
    public final /* synthetic */ ClipsSharingDraftViewModel A00;

    public LC1(ClipsSharingDraftViewModel clipsSharingDraftViewModel) {
        this.A00 = clipsSharingDraftViewModel;
    }

    public final Object A00(C293505kq r5, AnonymousClass4D7 r6) {
        Object A0A;
        C63818L7z l7z = this.A00.A06;
        ClipsDraftRepository clipsDraftRepository = l7z.A00;
        if (r5.A0G == JXu.A03) {
            A0A = clipsDraftRepository.A0B(r5, new C65115Lnd(l7z, r5), r6, false);
        } else {
            A0A = clipsDraftRepository.A0A((B2W) null, r5, r6);
        }
        1Hj r0 = 1Hj.A02;
        if (A0A != r0) {
            A0A = C60340gF.A00;
        }
        if (A0A != r0) {
            return C60340gF.A00;
        }
        return A0A;
    }
}
