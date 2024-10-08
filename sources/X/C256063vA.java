package X;

import android.widget.TextView;
import java.util.List;

/* renamed from: X.3vA  reason: invalid class name and case insensitive filesystem */
public final class C256063vA implements C247233fz {
    public boolean A00 = true;
    public final C256003v4 A01;

    public C256063vA(C256003v4 r2) {
        this.A01 = r2;
    }

    public final void setEnabled(boolean z) {
        this.A00 = false;
    }

    public final TextView C2f() {
        return (TextView) this.A01.A03.A01();
    }

    public final void ETR(List list) {
        C263164Jj.A02(this.A01, list, this.A00);
    }

    public final void Eqk(boolean z) {
        if (!z || !this.A00) {
            C263164Jj.A00(this.A01);
        } else {
            C263164Jj.A01(this.A01);
        }
    }
}
