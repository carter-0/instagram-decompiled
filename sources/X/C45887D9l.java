package X;

import com.fbpay.hub.transactions.api.UpcomingPayout;
import com.google.common.collect.ImmutableList;

/* renamed from: X.D9l  reason: case insensitive filesystem */
public final class C45887D9l {
    public final UpcomingPayout A00;
    public final ImmutableList A01;
    public final String A02;

    public C45887D9l(UpcomingPayout upcomingPayout, ImmutableList immutableList, String str) {
        this.A02 = str;
        C11367SPk.A03(immutableList, "transactions");
        this.A01 = immutableList;
        this.A00 = upcomingPayout;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C45887D9l) {
                C45887D9l d9l = (C45887D9l) obj;
                if (!0qQ.A0K(this.A02, d9l.A02) || !0qQ.A0K(this.A01, d9l.A01) || !0qQ.A0K(this.A00, d9l.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C11367SPk.A02(this.A00, C11367SPk.A02(this.A01, C11367SPk.A02(this.A02, 1)));
    }

    public C45887D9l(C45265CtU ctU) {
        this.A02 = ctU.A01;
        ImmutableList immutableList = ctU.A00;
        C11367SPk.A03(immutableList, "transactions");
        this.A01 = immutableList;
        this.A00 = null;
    }
}
