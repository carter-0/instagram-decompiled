package X;

import androidx.cardview.widget.CardView;

/* renamed from: X.PWd  reason: case insensitive filesystem */
public final class C73096PWd implements Runnable {
    public final /* synthetic */ C68462NJa A00;

    public C73096PWd(C68462NJa nJa) {
        this.A00 = nJa;
    }

    public final void run() {
        C68462NJa nJa = this.A00;
        if (nJa.isAdded()) {
            CardView cardView = nJa.A08;
            if (cardView == null) {
                0qQ.A0F("locationSharingPill");
                throw AnonymousClass00P.createAndThrow();
            } else {
                C51972G9s.A0I(cardView).withEndAction(new C73095PWc(nJa));
            }
        }
    }
}
