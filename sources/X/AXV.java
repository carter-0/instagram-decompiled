package X;

import com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsCreationDraftViewModel;
import java.util.List;

public final class AXV implements B2W {
    public final /* synthetic */ ClipsCreationDraftViewModel A00;

    public AXV(ClipsCreationDraftViewModel clipsCreationDraftViewModel) {
        this.A00 = clipsCreationDraftViewModel;
    }

    public final void Dlo(List list) {
        ClipsCreationDraftViewModel clipsCreationDraftViewModel = this.A00;
        AnonymousClass7TE.A1Z(new MGV(clipsCreationDraftViewModel, list, (AnonymousClass4D7) null, 43), C318116oQ.A00(clipsCreationDraftViewModel));
    }

    public final void onFailure() {
        this.A00.A0P.Epw(new AnonymousClass88W(AnonymousClass7TE.A0v()));
    }

    public final void onSuccess() {
        this.A00.A0Q.Epw(new AnonymousClass88W(AnonymousClass7TE.A0v()));
    }
}
