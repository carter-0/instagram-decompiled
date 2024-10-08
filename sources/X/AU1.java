package X;

import android.view.View;
import java.util.List;

public final class AU1 implements C344337rh {
    public final /* synthetic */ C345567tj A00;

    public final void DZB(C346027uT r4) {
        0qQ.A0B(r4, 0);
        if (r4.A00() != null) {
            List list = this.A00.A03.A00;
            0qQ.A07(list);
            if (0 < list.size()) {
                list.get(0);
                throw AnonymousClass7TE.A11("onSurfaceCreated");
            }
        }
    }

    public final void DZC(C346027uT r4) {
        0qQ.A0B(r4, 0);
        if (r4.A00() != null) {
            List list = this.A00.A03.A00;
            0qQ.A07(list);
            if (0 < list.size()) {
                list.get(0);
                throw AnonymousClass7TE.A11("onSurfaceDestroyed");
            }
        }
    }

    public final void DZD(C346027uT r4, int i, int i2) {
        0qQ.A0B(r4, 0);
        if (r4.A00() != null) {
            List list = this.A00.A03.A00;
            0qQ.A07(list);
            if (0 < list.size()) {
                list.get(0);
                throw AnonymousClass7TE.A11("onSurfaceChanged");
            }
        }
    }

    public final void DZH(View view) {
    }

    public AU1(C345567tj r1) {
        this.A00 = r1;
    }
}
