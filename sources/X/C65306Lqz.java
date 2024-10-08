package X;

import android.widget.TextView;
import com.instagram.direct.fragment.recipientpicker.controller.DirectPrivateStoryRecipientController;
import com.instagram.pendingmedia.model.UserStoryTarget;

/* renamed from: X.Lqz  reason: case insensitive filesystem */
public final class C65306Lqz implements MVA {
    public final /* synthetic */ DirectPrivateStoryRecipientController A00;

    public final boolean Cbi() {
        throw AnonymousClass00P.createAndThrow();
    }

    public C65306Lqz(DirectPrivateStoryRecipientController directPrivateStoryRecipientController) {
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
        JZX.A00(JZY.SHARE_CLICK, JZZ.STORY, AnonymousClass818.IG_STORY_AFTER_SHARE_SHEET, (C60757Jqo) null, directPrivateStoryRecipientController.A0B);
    }

    public final void Dua(UserStoryTarget userStoryTarget) {
        DirectPrivateStoryRecipientController directPrivateStoryRecipientController = this.A00;
        directPrivateStoryRecipientController.A03++;
        DirectPrivateStoryRecipientController.A05(directPrivateStoryRecipientController);
        DirectPrivateStoryRecipientController.A06(directPrivateStoryRecipientController);
    }
}
