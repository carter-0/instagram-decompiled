package X;

import android.widget.TextView;
import com.instagram.direct.fragment.recipientpicker.controller.DirectPrivateStoryRecipientController;
import com.instagram.pendingmedia.model.UserStoryTarget;
import java.util.Set;

/* renamed from: X.LxC  reason: case insensitive filesystem */
public final class C65635LxC implements C311316cU, MVA {
    public final /* synthetic */ DirectPrivateStoryRecipientController A00;

    public final boolean Cbi() {
        return true;
    }

    public C65635LxC(DirectPrivateStoryRecipientController directPrivateStoryRecipientController) {
        this.A00 = directPrivateStoryRecipientController;
    }

    public final int BPH(TextView textView) {
        return this.A00.A0H.A05(textView);
    }

    public final void Cx5(AnonymousClass818 r4, C255773uh r5) {
        DirectPrivateStoryRecipientController directPrivateStoryRecipientController = this.A00;
        directPrivateStoryRecipientController.A0F(C368278sM.ACCEPT, r5);
        directPrivateStoryRecipientController.A0P.A05(true, "ig_story_composer");
    }

    public final void D7w(AnonymousClass818 r3, C255773uh r4) {
        this.A00.A0F(C368278sM.DECLINE, r4);
    }

    public final void Djv(UserStoryTarget userStoryTarget) {
        DirectPrivateStoryRecipientController directPrivateStoryRecipientController = this.A00;
        LT8.A06(directPrivateStoryRecipientController.A0B);
        directPrivateStoryRecipientController.A02++;
        directPrivateStoryRecipientController.A1K.add(UserStoryTarget.A01);
        DirectPrivateStoryRecipientController.A06(directPrivateStoryRecipientController);
    }

    public final void Dku(AnonymousClass818 r3, C255773uh r4) {
        DirectPrivateStoryRecipientController directPrivateStoryRecipientController = this.A00;
        directPrivateStoryRecipientController.A0F(C368278sM.OTHER, r4);
        directPrivateStoryRecipientController.A0P.A04(true);
    }

    public final void DnK() {
        DirectPrivateStoryRecipientController directPrivateStoryRecipientController = this.A00;
        directPrivateStoryRecipientController.A0F(C368278sM.OTHER, (C255773uh) null);
        directPrivateStoryRecipientController.A0P.A05(false, "ig_story_composer");
    }

    public final void DnS() {
        DirectPrivateStoryRecipientController directPrivateStoryRecipientController = this.A00;
        directPrivateStoryRecipientController.A0F(C368278sM.ACCEPT, (C255773uh) null);
        directPrivateStoryRecipientController.A0P.A04(false);
    }

    public final void Dua(UserStoryTarget userStoryTarget) {
        DirectPrivateStoryRecipientController directPrivateStoryRecipientController = this.A00;
        directPrivateStoryRecipientController.A03++;
        Set<UserStoryTarget> set = directPrivateStoryRecipientController.A1K;
        for (UserStoryTarget userStoryTarget2 : set) {
            String CAh = userStoryTarget2.CAh();
            if (CAh.equals("ALL") || CAh.equals("ALL_WITH_BLACKLIST")) {
                set.remove(userStoryTarget2);
            }
        }
        DirectPrivateStoryRecipientController.A06(directPrivateStoryRecipientController);
    }
}
