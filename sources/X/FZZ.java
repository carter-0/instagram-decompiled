package X;

import android.app.Activity;
import com.instagram.common.gallery.Medium;
import com.instagram.profilecard.domain.ProfileCardViewModel;

public final class FZZ implements AnonymousClass8MP {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ ProfileCardViewModel A01;

    public final void DHX(Medium medium, boolean z) {
        0qQ.A0B(medium, 0);
        DbX.A10(this.A00, AnonymousClass37D.A00);
        String str = medium.A0X;
        if (str != null) {
            ProfileCardViewModel profileCardViewModel = this.A01;
            AnonymousClass7TE.A1Z(new C66187MGy(profileCardViewModel, str, (AnonymousClass4D7) null, 34), C318116oQ.A00(profileCardViewModel));
        }
    }

    public FZZ(Activity activity, ProfileCardViewModel profileCardViewModel) {
        this.A00 = activity;
        this.A01 = profileCardViewModel;
    }
}
