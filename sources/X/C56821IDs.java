package X;

import android.view.View;
import android.view.ViewTreeObserver;
import androidx.fragment.app.FragmentActivity;
import instagram.features.feed.fragment.ContextualFeedFragment;

/* renamed from: X.IDs  reason: case insensitive filesystem */
public final class C56821IDs implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ View A00;
    public final /* synthetic */ ContextualFeedFragment A01;

    public C56821IDs(View view, ContextualFeedFragment contextualFeedFragment) {
        this.A01 = contextualFeedFragment;
        this.A00 = view;
    }

    public final void onGlobalLayout() {
        FragmentActivity activity = this.A01.getActivity();
        if (activity != null) {
            C51970G9q.A12(activity);
        }
        C51971G9r.A0z(this.A00, this);
    }
}
