package X;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.5E9  reason: invalid class name */
public final class AnonymousClass5E9 extends C268204cx implements Serializable {
    public final List A00 = new ArrayList();

    public final C252503pD A04(String str) {
        return null;
    }

    public final boolean A0A() {
        return true;
    }

    public final boolean A01(C269504fE r2) {
        return this.A00.isEmpty();
    }

    public final Iterator A08() {
        return this.A00.iterator();
    }

    public final void A0B(C252503pD r2) {
        if (r2 == null) {
            r2 = C383839gL.A00;
        }
        this.A00.add(r2);
    }

    public final void EN9(17Z r5, C269504fE r6) {
        List list = this.A00;
        int size = list.size();
        r5.A0p(this, size);
        for (int i = 0; i < size; i++) {
            ((C268214cy) ((C252503pD) list.get(i))).EN9(r5, r6);
        }
        r5.A0Y();
    }

    public final void ENF(17Z r4, C269504fE r5, SPK spk) {
        C10798RyK A03 = spk.A03(r4, spk.A05(16L.A0C, this));
        for (C252503pD r0 : this.A00) {
            ((C268214cy) r0).EN9(r4, r5);
        }
        spk.A04(r4, A03);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof AnonymousClass5E9)) {
            return false;
        }
        return this.A00.equals(((AnonymousClass5E9) obj).A00);
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public AnonymousClass5E9(C269474fB r2) {
        super(r2);
    }

    public final C252503pD A05(String str) {
        return C8238Qkl.A00;
    }
}
