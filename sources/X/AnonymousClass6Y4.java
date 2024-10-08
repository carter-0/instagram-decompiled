package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.util.Property;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.6Y4  reason: invalid class name */
public final class AnonymousClass6Y4 extends AnimatorListenerAdapter {
    public final /* synthetic */ C309306Xt A00;

    public AnonymousClass6Y4(C309306Xt r1) {
        this.A00 = r1;
    }

    public final void onAnimationStart(Animator animator) {
        super.onAnimationStart(animator);
        C309306Xt r2 = this.A00;
        Property property = C309306Xt.A0A;
        List list = r2.A05;
        if (list != null && !r2.A06) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }
}
