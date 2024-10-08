package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* renamed from: X.2hM  reason: invalid class name */
public abstract class AnonymousClass2hM {
    public static final 2el A00(View view) {
        0qQ.A0B(view, 0);
        return A01(C226592hN.A00(view));
    }

    public static final 2el A01(AnonymousClass2hP r3) {
        View view;
        Class<C249483jr> cls = C249483jr.class;
        C249483jr r0 = (C249483jr) 0mE.A00(r3.getContext(), cls);
        if (r0 == null) {
            if (!(r3 instanceof C226602hO) || (view = (View) ((C226602hO) r3).A00.get()) == null) {
                return null;
            }
            ViewParent parent = view.getParent();
            while (parent instanceof ViewGroup) {
                View view2 = (View) parent;
                r0 = (C249483jr) 0mE.A00(view2.getContext(), cls);
                parent = view2.getParent();
                if (r0 != null) {
                }
            }
            return null;
        }
        return r0.CFM();
    }
}
