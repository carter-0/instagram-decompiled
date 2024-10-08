package X;

import com.instagram.direct.fragment.recipientpicker.controller.DirectPrivateStoryRecipientController;
import com.instagram.pendingmedia.model.UserStoryTarget;
import java.util.Set;

/* renamed from: X.KQq  reason: case insensitive filesystem */
public final class C61897KQq extends C65305Lqy {
    public final /* synthetic */ DirectPrivateStoryRecipientController A00;

    public final boolean Cbi() {
        return true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C61897KQq(DirectPrivateStoryRecipientController directPrivateStoryRecipientController) {
        super(directPrivateStoryRecipientController);
        this.A00 = directPrivateStoryRecipientController;
    }

    public final void Djv(UserStoryTarget userStoryTarget) {
        LT8.A06(this.A00.A0B);
        super.Djv(UserStoryTarget.A03);
    }

    public final void Dua(UserStoryTarget userStoryTarget) {
        DirectPrivateStoryRecipientController directPrivateStoryRecipientController = this.A00;
        directPrivateStoryRecipientController.A03++;
        Set<UserStoryTarget> set = directPrivateStoryRecipientController.A1K;
        for (UserStoryTarget userStoryTarget2 : set) {
            if ("EXCLUSIVE_STORY".equals(userStoryTarget2.CAh())) {
                set.remove(userStoryTarget2);
            }
        }
        DirectPrivateStoryRecipientController.A06(directPrivateStoryRecipientController);
    }
}
