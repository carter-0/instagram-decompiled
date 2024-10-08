package X;

import android.content.Context;

public final class PVT implements Runnable {
    public final /* synthetic */ NJm A00;

    public PVT(NJm nJm) {
        this.A00 = nJm;
    }

    public final void run() {
        if ("there's already an e2ee thread for them".length() > 0) {
            Context context = this.A00.A00;
            if (context == null) {
                0qQ.A0F("directThemedContext");
                throw AnonymousClass00P.createAndThrow();
            } else {
                C59689JTv.A09(context, "there's already an e2ee thread for them");
            }
        }
    }
}
