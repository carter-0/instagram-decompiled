package X;

import android.widget.TextView;
import com.instagram.direct.fragment.recipientpicker.controller.DirectPrivateStoryRecipientController;
import com.instagram.pendingmedia.model.UserStoryTarget;

public final class Lr0 implements MVA {
    public final /* synthetic */ DirectPrivateStoryRecipientController A00;

    public final boolean Cbi() {
        throw AnonymousClass00P.createAndThrow();
    }

    public Lr0(DirectPrivateStoryRecipientController directPrivateStoryRecipientController) {
        this.A00 = directPrivateStoryRecipientController;
    }

    public final int BPH(TextView textView) {
        return this.A00.A0H.A05(textView);
    }

    public final void Djv(UserStoryTarget userStoryTarget) {
        DirectPrivateStoryRecipientController directPrivateStoryRecipientController = this.A00;
        directPrivateStoryRecipientController.A02++;
        DirectPrivateStoryRecipientController.A05(directPrivateStoryRecipientController);
        DirectPrivateStoryRecipientController.A06(directPrivateStoryRecipientController);
    }

    public final void Dua(UserStoryTarget userStoryTarget) {
        DirectPrivateStoryRecipientController directPrivateStoryRecipientController = this.A00;
        directPrivateStoryRecipientController.A03++;
        DirectPrivateStoryRecipientController.A05(directPrivateStoryRecipientController);
        DirectPrivateStoryRecipientController.A06(directPrivateStoryRecipientController);
    }
}
