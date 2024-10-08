package X;

import android.view.View;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsCreationDraftViewModel;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.repository.ClipsDraftRepository;

public final /* synthetic */ class ANH implements View.OnClickListener {
    public final /* synthetic */ AnonymousClass8BA A00;
    public final /* synthetic */ Runnable A01;

    public /* synthetic */ ANH(AnonymousClass8BA r1, Runnable runnable) {
        this.A00 = r1;
        this.A01 = runnable;
    }

    public final void onClick(View view) {
        AnonymousClass8BA r1 = this.A00;
        Runnable runnable = this.A01;
        if (AnonymousClass8BA.A0M(r1)) {
            ClipsCreationDraftViewModel clipsCreationDraftViewModel = r1.A1T;
            ClipsDraftRepository clipsDraftRepository = clipsCreationDraftViewModel.A0H;
            C293505kq A002 = ClipsCreationDraftViewModel.A00(clipsCreationDraftViewModel);
            if (A002 != null) {
                clipsDraftRepository.A0M(A002);
            } else {
                throw AnonymousClass7TE.A0y();
            }
        }
        runnable.run();
    }
}
