package X;

import android.transition.Transition;
import android.transition.TransitionManager;
import android.view.ViewGroup;

/* renamed from: X.APp  reason: case insensitive filesystem */
public final class C40059APp implements AnonymousClass2gO {
    public final /* synthetic */ C362868ic A00;
    public final /* synthetic */ Runnable A01;

    public C40059APp(C362868ic r1, Runnable runnable) {
        this.A00 = r1;
        this.A01 = runnable;
    }

    public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
        if (AnonymousClass7TE.A1a(obj)) {
            C362868ic r4 = this.A00;
            r4.A01(false);
            AnonymousClass2gO r3 = r4.A02;
            if (r3 != null) {
                this.A01.run();
                ViewGroup viewGroup = r4.A0B;
                viewGroup.setBackgroundColor(viewGroup.getContext().getColor(17170445));
                if (r4.A06.getParent() != null) {
                    TransitionManager.endTransitions(viewGroup);
                }
                TransitionManager.go(r4.A04, (Transition) null);
                r4.A0F.A02.A08(r3);
            }
        }
    }
}
