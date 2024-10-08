package X;

import androidx.cardview.widget.CardView;

/* renamed from: X.PWc  reason: case insensitive filesystem */
public final class C73095PWc implements Runnable {
    public final /* synthetic */ C68462NJa A00;

    public C73095PWc(C68462NJa nJa) {
        this.A00 = nJa;
    }

    public final void run() {
        C68462NJa nJa = this.A00;
        CardView cardView = nJa.A08;
        if (cardView != null) {
            cardView.clearAnimation();
            CardView cardView2 = nJa.A08;
            if (cardView2 != null) {
                cardView2.setVisibility(8);
                return;
            }
        }
        0qQ.A0F("locationSharingPill");
        throw AnonymousClass00P.createAndThrow();
    }
}
