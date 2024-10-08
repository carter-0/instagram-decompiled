package X;

import androidx.recyclerview.widget.RecyclerView;
import com.instagram.direct.fragment.recipientpicker.controller.DirectPrivateStoryRecipientController;

public final class M48 implements Runnable {
    public final /* synthetic */ DirectPrivateStoryRecipientController A00;

    public M48(DirectPrivateStoryRecipientController directPrivateStoryRecipientController) {
        this.A00 = directPrivateStoryRecipientController;
    }

    public final void run() {
        RecyclerView recyclerView = this.A00.A06;
        if (recyclerView != null) {
            recyclerView.A0p(0);
        }
    }
}
