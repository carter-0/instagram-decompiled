package X;

import android.transition.Transition;
import com.instagram.common.ui.base.IgEditText;

/* renamed from: X.OhK  reason: case insensitive filesystem */
public final class C71279OhK implements Transition.TransitionListener {
    public final int A00;
    public final Object A01;

    public C71279OhK(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void onTransitionEnd(Transition transition) {
        String str;
        if (this.A00 != 0) {
            PMQ pmq = (PMQ) this.A01;
            pmq.A01();
            C74363Ptd ptd = pmq.A01;
            if (ptd != null) {
                ptd.Dts();
                return;
            }
            str = "animationListener";
        } else {
            C68449NIn nIn = (C68449NIn) this.A01;
            IgEditText igEditText = nIn.A0H;
            if (igEditText == null) {
                str = "noteEditText";
            } else {
                igEditText.setHint(C68449NIn.A04(nIn));
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void onTransitionStart(Transition transition) {
        if (this.A00 != 0) {
            PMQ.A00((PMQ) this.A01, false);
        }
    }

    public final void onTransitionCancel(Transition transition) {
    }

    public final void onTransitionPause(Transition transition) {
    }

    public final void onTransitionResume(Transition transition) {
    }
}
