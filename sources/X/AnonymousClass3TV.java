package X;

import android.view.ViewStub;

/* renamed from: X.3TV  reason: invalid class name */
public final class AnonymousClass3TV implements AnonymousClass2xU {
    public int A00;
    public AnonymousClass3W1 A01;
    public final C252063oV A02;

    public AnonymousClass3TV(ViewStub viewStub) {
        0qQ.A0B(viewStub, 1);
        this.A02 = 2b1.A01(viewStub, false, false);
    }

    public final void DQp(AnonymousClass3W1 r7, int i) {
        0qQ.A0B(r7, 0);
        if (i == 4 || i == 38) {
            int i2 = r7.A02;
            int i3 = r7.A04;
            boolean z = false;
            if (i3 < this.A00) {
                z = true;
            }
            boolean z2 = false;
            if (i2 == i3 - 1) {
                z2 = true;
            }
            if (!z || !z2) {
                this.A02.setVisibility(8);
            } else {
                this.A02.setVisibility(0);
            }
        }
    }
}
