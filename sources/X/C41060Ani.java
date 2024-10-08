package X;

import com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsCreationDraftViewModel;

/* renamed from: X.Ani  reason: case insensitive filesystem */
public final class C41060Ani implements Runnable {
    public final /* synthetic */ ClipsCreationDraftViewModel A00;
    public final /* synthetic */ C293505kq A01;

    public C41060Ani(ClipsCreationDraftViewModel clipsCreationDraftViewModel, C293505kq r2) {
        this.A00 = clipsCreationDraftViewModel;
        this.A01 = r2;
    }

    public final void run() {
        ClipsCreationDraftViewModel clipsCreationDraftViewModel = this.A00;
        clipsCreationDraftViewModel.A08.A0A(new AnonymousClass88W(this.A01));
        clipsCreationDraftViewModel.A03 = false;
    }
}
