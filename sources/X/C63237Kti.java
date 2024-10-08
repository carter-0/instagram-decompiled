package X;

import com.instagram.common.ui.base.IgTextView;

/* renamed from: X.Kti  reason: case insensitive filesystem */
public abstract class C63237Kti {
    public static final void A00(IgTextView igTextView) {
        0qQ.A0B(igTextView, 0);
        if (!igTextView.isLaidOut() || igTextView.isLayoutRequested()) {
            igTextView.addOnLayoutChangeListener(new LYT(igTextView, 9));
        } else {
            JTT.A0z(AnonymousClass7TE.A0W(), igTextView);
        }
    }
}
