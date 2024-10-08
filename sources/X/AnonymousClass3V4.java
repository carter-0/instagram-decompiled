package X;

import android.content.Context;
import android.view.View;
import android.view.ViewStub;

/* renamed from: X.3V4  reason: invalid class name */
public final class AnonymousClass3V4 {
    public View.OnClickListener A00;
    public final C71662eb A01;

    public final void A00(C245853da r4) {
        0qQ.A0B(r4, 0);
        if (r4.ordinal() != 1) {
            C71662eb r1 = this.A01;
            View A012 = r1.A01();
            0qQ.A07(A012);
            Context context = A012.getContext();
            0qQ.A07(context);
            if (!2eO.A00(context)) {
                r1.A03(0);
                View A013 = r1.A01();
                0qQ.A07(A013);
                AnonymousClass0fU.A00(this.A00, A013);
                return;
            }
            return;
        }
        this.A01.A03(8);
    }

    public AnonymousClass3V4(ViewStub viewStub) {
        this.A01 = new C71662eb(viewStub);
    }
}
