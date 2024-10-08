package X;

import android.widget.TextView;
import com.instagram.direct.fragment.recipientpicker.controller.DirectPrivateStoryRecipientController;
import com.instagram.pendingmedia.model.UserStoryTarget;

/* renamed from: X.Lqy  reason: case insensitive filesystem */
public abstract class C65305Lqy implements MVA {
    public final /* synthetic */ DirectPrivateStoryRecipientController A00;

    public C65305Lqy(DirectPrivateStoryRecipientController directPrivateStoryRecipientController) {
        this.A00 = directPrivateStoryRecipientController;
    }

    public final int BPH(TextView textView) {
        return this.A00.A0H.A05(textView);
    }

    public void Djv(UserStoryTarget userStoryTarget) {
        DirectPrivateStoryRecipientController directPrivateStoryRecipientController = this.A00;
        directPrivateStoryRecipientController.A02++;
        directPrivateStoryRecipientController.A1K.add(userStoryTarget);
        DirectPrivateStoryRecipientController.A06(directPrivateStoryRecipientController);
    }
}
