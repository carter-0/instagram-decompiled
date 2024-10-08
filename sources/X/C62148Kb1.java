package X;

import android.animation.Animator;
import com.instagram.ui.widget.slideouticon.SlideInAndOutIconView;
import java.util.Iterator;

/* renamed from: X.Kb1  reason: case insensitive filesystem */
public final class C62148Kb1 extends AnonymousClass4HM {
    public final /* synthetic */ AnonymousClass4UR A00;

    public C62148Kb1(AnonymousClass4UR r1) {
        this.A00 = r1;
    }

    public final void onAnimationEnd(Animator animator) {
        AnonymousClass4UR r2 = this.A00;
        Iterator it = r2.A07.iterator();
        while (it.hasNext()) {
            C242213Tb r0 = (C242213Tb) JTR.A10(it);
            if (r0 != null) {
                ((SlideInAndOutIconView) r0).A01();
            }
        }
        r2.A01();
        r2.A05 = AnonymousClass4Ki.STOPPED;
    }
}
