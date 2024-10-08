package X;

import android.view.View;
import com.instagram.igds.components.bottomsheet.BottomSheetFragment;

/* renamed from: X.TqK  reason: case insensitive filesystem */
public final class C14125TqK extends C252233om {
    public final /* synthetic */ AnonymousClass4DJ A00;
    public final /* synthetic */ BottomSheetFragment A01;

    public final void D6z(View view) {
        0qQ.A0B(view, 0);
        BottomSheetFragment bottomSheetFragment = this.A01;
        if (182.A06(0Tu.A05, bottomSheetFragment.getSession(), 36314115996518855L)) {
            WCI wci = new WCI(4, view, bottomSheetFragment);
            view.getViewTreeObserver().addOnPreDrawListener(wci);
            view.addOnAttachStateChangeListener(new W8J(wci, 4));
            return;
        }
        view.getViewTreeObserver().addOnPreDrawListener(new WCI(3, view, bottomSheetFragment));
    }

    public C14125TqK(AnonymousClass4DJ r1, BottomSheetFragment bottomSheetFragment) {
        this.A01 = bottomSheetFragment;
        this.A00 = r1;
    }

    public final void onDestroy() {
        this.A00.unregisterLifecycleListener(this);
    }
}
