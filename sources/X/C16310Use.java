package X;

import android.animation.Animator;
import android.view.ViewTreeObserver;
import java.util.List;

/* renamed from: X.Use  reason: case insensitive filesystem */
public final class C16310Use extends AnonymousClass4HM {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C18561VuD A01;
    public final /* synthetic */ List A02;

    public C16310Use(C18561VuD vuD, List list, int i) {
        this.A01 = vuD;
        this.A02 = list;
        this.A00 = i;
    }

    public final void onAnimationEnd(Animator animator) {
        this.A02.clear();
        C18561VuD vuD = this.A01;
        int i = this.A00;
        ViewTreeObserver viewTreeObserver = vuD.A02.CEd().getViewTreeObserver();
        viewTreeObserver.addOnPreDrawListener(new WCJ(viewTreeObserver, vuD, i));
        vuD.A01.AGj();
    }
}
