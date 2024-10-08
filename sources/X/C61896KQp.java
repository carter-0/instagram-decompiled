package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.fragment.recipientpicker.controller.DirectPrivateStoryRecipientController;
import com.instagram.pendingmedia.model.UserStoryTarget;
import java.util.Set;

/* renamed from: X.KQp  reason: case insensitive filesystem */
public final class C61896KQp extends C65305Lqy {
    public final /* synthetic */ DirectPrivateStoryRecipientController A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C61896KQp(DirectPrivateStoryRecipientController directPrivateStoryRecipientController) {
        super(directPrivateStoryRecipientController);
        this.A00 = directPrivateStoryRecipientController;
    }

    public final boolean Cbi() {
        C2355930l r4 = this.A00.A09;
        r4.getClass();
        UserSession userSession = r4.A01;
        if (C63112Krf.A00(userSession) > 0) {
            return true;
        }
        LPM.A01(r4.A00, C62574Ki7.STORY_SHARE_SHORTCUT, userSession, false, false);
        return false;
    }

    public final void Djv(UserStoryTarget userStoryTarget) {
        LT8.A06(this.A00.A0B);
        UserStoryTarget userStoryTarget2 = UserStoryTarget.A09;
        if (userStoryTarget != userStoryTarget2) {
            userStoryTarget2 = UserStoryTarget.A02;
        }
        super.Djv(userStoryTarget2);
    }

    public final void Dua(UserStoryTarget userStoryTarget) {
        DirectPrivateStoryRecipientController directPrivateStoryRecipientController = this.A00;
        directPrivateStoryRecipientController.A03++;
        Set<UserStoryTarget> set = directPrivateStoryRecipientController.A1K;
        for (UserStoryTarget userStoryTarget2 : set) {
            String CAh = userStoryTarget2.CAh();
            if (CAh.equals("CLOSE_FRIENDS") || CAh.equals("CLOSE_FRIENDS_WITH_BLACKLIST") || CAh.equals("PRIVATE_STORY")) {
                set.remove(userStoryTarget2);
            }
        }
        DirectPrivateStoryRecipientController.A06(directPrivateStoryRecipientController);
    }
}
