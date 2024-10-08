package X;

import com.instagram.ui.widget.bubblespinner.BubbleSpinner;

/* renamed from: X.8xO  reason: invalid class name and case insensitive filesystem */
public final class C370988xO implements C370998xP {
    public final /* synthetic */ C370978xN A00;

    public C370988xO(C370978xN r1) {
        this.A00 = r1;
    }

    public final void Dei() {
        BubbleSpinner bubbleSpinner = this.A00.A0B;
        if (bubbleSpinner != null) {
            bubbleSpinner.setVisibility(0);
            bubbleSpinner.setLoadingStatus(AnonymousClass8YA.LOADING);
        }
    }
}
