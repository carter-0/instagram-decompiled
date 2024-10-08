package X;

import android.content.Context;

public final class TFT implements Runnable {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ SRY A01;

    public TFT(Context context, SRY sry) {
        this.A01 = sry;
        this.A00 = context;
    }

    public final void run() {
        SRY sry = this.A01;
        Context context = this.A00;
        int i = sry.A00 - 1;
        sry.A00 = i;
        if (i == 0 && sry.A01 != null) {
            if (sry.A06 != null) {
                synchronized (sry) {
                    if (sry.A04 != null) {
                        0LA.A04(AnonymousClass0LO.A70);
                        0LA.A04(AnonymousClass0LO.A6z);
                        sry.A04 = null;
                    }
                }
                context.unbindService(sry.A01);
            }
            sry.A03.quit();
            sry.A01 = null;
            sry.A06 = null;
            sry.A07 = null;
            sry.A03 = null;
            sry.A02 = null;
        }
    }
}
