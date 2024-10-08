package X;

import android.content.Context;

public final class PVQ implements Runnable {
    public final /* synthetic */ NJC A00;

    public PVQ(NJC njc) {
        this.A00 = njc;
    }

    public final void run() {
        Context context = this.A00.getContext();
        if (context != null) {
            DbX.A14(context, AnonymousClass37D.A00);
        }
    }
}
