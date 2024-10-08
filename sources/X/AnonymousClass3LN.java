package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.3LN  reason: invalid class name */
public final class AnonymousClass3LN implements AnonymousClass0lh {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final Integer A04;
    public final List A05 = new ArrayList();
    public final 0sJ A06;

    public AnonymousClass3LN(Integer num, 0sJ r3, int i, int i2, int i3, int i4) {
        0qQ.A0B(num, 5);
        this.A03 = i;
        this.A02 = i2;
        this.A00 = i3;
        this.A01 = i4;
        this.A04 = num;
        this.A06 = r3;
    }

    public final void onSessionWillEnd() {
        this.A05.clear();
    }
}
