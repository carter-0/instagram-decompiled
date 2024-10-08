package X;

import java.util.List;

/* renamed from: X.4mP  reason: invalid class name and case insensitive filesystem */
public final class C273364mP extends 2UH {
    public boolean A00 = false;

    public final int A00() {
        return 7;
    }

    public final String A01() {
        return "account_switch";
    }

    public final void A02(StringBuilder sb) {
        0qQ.A0B(sb, 0);
        sb.append(this.A00);
    }

    public final void A03(List list) {
        0qQ.A0B(list, 0);
        this.A00 = Boolean.parseBoolean((String) list.get(0));
    }

    public final boolean A04(1Jp r3) {
        0qQ.A0B(r3, 0);
        if (!(r3 instanceof C252833pm)) {
            return false;
        }
        this.A00 = ((C252833pm) r3).A00;
        return true;
    }

    public final String toString() {
        if (this.A00) {
            return AnonymousClass000.A00(3526);
        }
        return "switched account";
    }
}
