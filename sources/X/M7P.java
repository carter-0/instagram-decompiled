package X;

import android.view.View;
import android.widget.TextView;
import com.instagram.direct.fragment.recipientpicker.controller.DirectPrivateStoryRecipientController;

public final /* synthetic */ class M7P implements Runnable {
    public final /* synthetic */ TextView A00;
    public final /* synthetic */ DirectPrivateStoryRecipientController A01;

    public /* synthetic */ M7P(TextView textView, DirectPrivateStoryRecipientController directPrivateStoryRecipientController) {
        this.A01 = directPrivateStoryRecipientController;
        this.A00 = textView;
    }

    public final void run() {
        DirectPrivateStoryRecipientController directPrivateStoryRecipientController = this.A01;
        TextView textView = this.A00;
        View view = directPrivateStoryRecipientController.A04;
        if (view != null) {
            0nA.A0T(view, textView.getHeight());
        }
    }
}
