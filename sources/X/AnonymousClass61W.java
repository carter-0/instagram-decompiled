package X;

import android.animation.Animator;
import com.instagram.ui.widget.searchedittext.SearchEditText;

/* renamed from: X.61W  reason: invalid class name */
public final class AnonymousClass61W implements Animator.AnimatorListener {
    public final /* synthetic */ SearchEditText A00;

    public final void onAnimationCancel(Animator animator) {
    }

    public final void onAnimationRepeat(Animator animator) {
    }

    public final void onAnimationStart(Animator animator) {
    }

    public AnonymousClass61W(SearchEditText searchEditText) {
        this.A00 = searchEditText;
    }

    public final void onAnimationEnd(Animator animator) {
        SearchEditText searchEditText = this.A00;
        searchEditText.A0M = false;
        searchEditText.A0N = true;
        SearchEditText.A01(searchEditText);
        AnonymousClass61R r1 = searchEditText.A06;
        if (r1 != null && !r1.A03.isRunning()) {
            r1.EFK();
            r1.E2p();
        }
    }
}
