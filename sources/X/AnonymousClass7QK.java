package X;

import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import java.util.concurrent.CancellationException;

/* renamed from: X.7QK  reason: invalid class name */
public final class AnonymousClass7QK {
    public ViewGroup A00;
    public AnonymousClass7QM A01 = AnonymousClass7QM.UNSPECIFIED;
    public C262204Co A02;
    public boolean A03;
    public boolean A04;
    public final AnonymousClass7QL A05;
    public final AnonymousClass7QH A06;
    public final C262224Cq A07;

    public final void A01(AnonymousClass7QM r5) {
        0qQ.A0B(r5, 0);
        if (!this.A03 && r5 == AnonymousClass7QM.SEND_QUERY) {
            this.A03 = true;
        }
        AnonymousClass7QM r1 = this.A01;
        if (r1 != AnonymousClass7QM.SEND_QUERY || r5 != AnonymousClass7QM.STOP_TYPING) {
            if (r1 == r5 && r5 == AnonymousClass7QM.START_TYPING) {
                C262204Co r0 = this.A02;
                if (r0 != null) {
                    r0.AG7((CancellationException) null);
                }
                C262224Cq r3 = this.A07;
                C376889Js r2 = new C376889Js(this, (AnonymousClass4D7) null, 5);
                this.A02 = 1Eo.A03(AnonymousClass05K.A00, 19B.A00, r2, r3);
            } else {
                this.A05.A03(r5);
            }
            this.A01 = r5;
        }
    }

    public final void A00(ViewGroup viewGroup) {
        ViewGroup viewGroup2;
        if (0qQ.A0K(this.A00, viewGroup)) {
            this.A00 = null;
            AnonymousClass7QH r0 = this.A06;
            r0.A00();
            W1V w1v = r0.A01;
            if (w1v != null) {
                FrameLayout frameLayout = w1v.A09;
                ViewParent parent = frameLayout.getParent();
                if ((parent instanceof ViewGroup) && (viewGroup2 = (ViewGroup) parent) != null) {
                    viewGroup2.removeView(frameLayout);
                }
            }
        }
    }

    public AnonymousClass7QK(AnonymousClass7QH r3) {
        this.A06 = r3;
        this.A05 = new AnonymousClass7QL(r3);
        AnonymousClass19G r1 = new AnonymousClass19G((C262204Co) null);
        AnonymousClass4CZ r0 = AnonymousClass12W.A00;
        this.A07 = 19E.A02(r1.plus(AnonymousClass12y.A00));
    }
}
