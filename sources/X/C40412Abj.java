package X;

import com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsCreationDraftViewModel;

/* renamed from: X.Abj  reason: case insensitive filesystem */
public final class C40412Abj implements B24 {
    public final /* synthetic */ ClipsCreationDraftViewModel A00;
    public final /* synthetic */ C293505kq A01;

    public final void onSuccess() {
    }

    public C40412Abj(ClipsCreationDraftViewModel clipsCreationDraftViewModel, C293505kq r2) {
        this.A00 = clipsCreationDraftViewModel;
        this.A01 = r2;
    }

    public final void onFailure() {
        this.A00.A0B.A0A(new AnonymousClass88W(this.A01));
    }
}
