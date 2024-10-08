package X;

import android.view.animation.AlphaAnimation;
import com.instagram.direct.inbox.notes.ui.NoteBubbleView;

/* renamed from: X.Apb  reason: case insensitive filesystem */
public final class C41177Apb implements Runnable {
    public final /* synthetic */ AlphaAnimation A00;
    public final /* synthetic */ NoteBubbleView A01;
    public final /* synthetic */ boolean A02;

    public C41177Apb(AlphaAnimation alphaAnimation, NoteBubbleView noteBubbleView, boolean z) {
        this.A01 = noteBubbleView;
        this.A00 = alphaAnimation;
        this.A02 = z;
    }

    public final void run() {
        NoteBubbleView noteBubbleView = this.A01;
        noteBubbleView.startAnimation(this.A00);
        int i = 8;
        if (this.A02) {
            i = 0;
        }
        noteBubbleView.setVisibility(i);
    }
}
