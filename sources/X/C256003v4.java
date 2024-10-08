package X;

import android.view.View;
import android.view.ViewStub;

/* renamed from: X.3v4  reason: invalid class name and case insensitive filesystem */
public final class C256003v4 {
    public int A00;
    public C246873fN A01;
    public boolean A02 = true;
    public final C71662eb A03;
    public final boolean A04;

    public final void A00(int i) {
        View A012;
        this.A00 = i;
        if ((!this.A04 || this.A03.A00 != null) && (A012 = this.A03.A01()) != null) {
            0nA.A0T(A012, this.A00);
        }
    }

    public C256003v4(ViewStub viewStub, boolean z) {
        this.A04 = z;
        C71662eb r1 = new C71662eb(viewStub);
        this.A03 = r1;
        r1.A02 = new C2607546x(this);
    }
}
