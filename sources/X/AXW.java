package X;

import com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.repository.ClipsDraftRepository;
import java.util.List;

public final class AXW implements B2W {
    public final /* synthetic */ C293505kq A00;
    public final /* synthetic */ B24 A01;
    public final /* synthetic */ ClipsDraftRepository A02;
    public final /* synthetic */ boolean A03;

    public final /* synthetic */ void Dlo(List list) {
    }

    public AXW(C293505kq r1, B24 b24, ClipsDraftRepository clipsDraftRepository, boolean z) {
        this.A03 = z;
        this.A02 = clipsDraftRepository;
        this.A00 = r1;
        this.A01 = b24;
    }

    public final void onFailure() {
        B24 b24 = this.A01;
        if (b24 != null) {
            b24.onFailure();
        }
    }

    public final void onSuccess() {
        if (this.A03) {
            1Av r1 = this.A02.A08;
            String str = this.A00.A0e;
            0xY A0p = AnonymousClass7TE.A0p(r1);
            A0p.E5g("last_saved_draft_date_and_count", str);
            A0p.apply();
        }
        B24 b24 = this.A01;
        if (b24 != null) {
            b24.onSuccess();
        }
    }
}
