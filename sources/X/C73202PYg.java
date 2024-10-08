package X;

import androidx.core.widget.NestedScrollView;
import com.instagram.direct.ui.polls.PollMessageOptionView;

/* renamed from: X.PYg  reason: case insensitive filesystem */
public final class C73202PYg implements Runnable {
    public final /* synthetic */ NestedScrollView A00;
    public final /* synthetic */ PollMessageOptionView A01;

    public C73202PYg(NestedScrollView nestedScrollView, PollMessageOptionView pollMessageOptionView) {
        this.A00 = nestedScrollView;
        this.A01 = pollMessageOptionView;
    }

    public final void run() {
        NestedScrollView.A04(this.A00, 0, (int) this.A01.getY(), false);
    }
}
