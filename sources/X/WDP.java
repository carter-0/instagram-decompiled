package X;

import android.view.Window;

public final class WDP implements C20936X5e {
    public final /* synthetic */ 2X4 A00;

    public WDP(2X4 r1) {
        this.A00 = r1;
    }

    public final void D4F(C18932WDk wDk, boolean z) {
        C18932WDk A002 = wDk.A00();
        boolean A1a = C51969G9p.A1a(A002, wDk);
        2X4 r5 = this.A00;
        if (A1a) {
            wDk = A002;
        }
        AnonymousClass2Yk[] r4 = r5.A0g;
        int i = 0;
        if (r4 != null) {
            int length = r4.length;
            while (i < length) {
                AnonymousClass2Yk r1 = r4[i];
                if (r1 == null || r1.A0A != wDk) {
                    i++;
                } else if (A1a) {
                    r5.A0X(A002, r1, r1.A01);
                    r5.A0Y(r1, true);
                    return;
                } else {
                    r5.A0Y(r1, z);
                    return;
                }
            }
        }
    }

    public final boolean DVR(C18932WDk wDk) {
        Window.Callback callback;
        if (wDk != wDk.A00()) {
            return true;
        }
        2X4 r2 = this.A00;
        if (!r2.A0Y || (callback = r2.A0A.getCallback()) == null || r2.A0U) {
            return true;
        }
        callback.onMenuOpened(108, wDk);
        return true;
    }
}
