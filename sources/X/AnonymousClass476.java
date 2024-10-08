package X;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.476  reason: invalid class name */
public abstract class AnonymousClass476 {
    public static final C253993rl A00(View view) {
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        0qQ.A0C(view, "null cannot be cast to non-null type android.view.ViewGroup");
        C253993rl r2 = new C253993rl((ViewGroup) view);
        ViewGroup viewGroup = r2.A00;
        viewGroup.setTouchDelegate(new AnonymousClass479(viewGroup));
        return r2;
    }
}
