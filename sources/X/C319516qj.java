package X;

import android.view.View;
import android.widget.FrameLayout;
import com.instagram.common.ui.base.IgLinearLayout;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.direct.inbox.notes.ui.NoteBubbleView;

/* renamed from: X.6qj  reason: invalid class name and case insensitive filesystem */
public final class C319516qj implements Runnable {
    public final /* synthetic */ View A00;
    public final /* synthetic */ boolean A01;

    public C319516qj(View view, boolean z) {
        this.A00 = view;
        this.A01 = z;
    }

    public final void run() {
        View view = this.A00;
        0qQ.A0C(view, "null cannot be cast to non-null type com.instagram.direct.inbox.notes.ui.NoteBubbleView");
        NoteBubbleView noteBubbleView = (NoteBubbleView) view;
        boolean z = this.A01;
        if (noteBubbleView.A0F.CFV() == 0) {
            IgLinearLayout igLinearLayout = noteBubbleView.A05;
            if (igLinearLayout != null) {
                igLinearLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
            }
            IgTextView igTextView = noteBubbleView.A08;
            if (igTextView != null) {
                int i = 0;
                if (z) {
                    i = 8;
                }
                igTextView.setVisibility(i);
            }
        }
    }
}
