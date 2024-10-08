package X;

import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;

/* renamed from: X.Ekp  reason: case insensitive filesystem */
public abstract class C48827Ekp {
    public static final void A00(View view) {
        ViewGroup A0E = DbS.A0E(view.getRootView(), R.id.direct_thread_content_below_action_bar);
        if (A0E != null) {
            AutoTransition autoTransition = new AutoTransition();
            autoTransition.setDuration(200);
            TransitionManager.beginDelayedTransition(A0E, autoTransition);
        }
        view.setVisibility(8);
    }
}
