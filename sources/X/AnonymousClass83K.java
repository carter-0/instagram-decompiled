package X;

import java.util.Map;

/* renamed from: X.83K  reason: invalid class name */
public final class AnonymousClass83K extends AnonymousClass0T0 {
    public final AnonymousClass831 A00;
    public final C357588Yu A01;
    public final Map A02;

    public AnonymousClass83K(C357588Yu r2, AnonymousClass831 r3, Map map) {
        0qQ.A0B(r3, 1);
        0qQ.A0B(map, 2);
        this.A00 = r3;
        this.A02 = map;
        this.A01 = r2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass83K) {
                AnonymousClass83K r5 = (AnonymousClass83K) obj;
                if (!0qQ.A0K(this.A00, r5.A00) || !0qQ.A0K(this.A02, r5.A02) || this.A01 != r5.A01) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = ((this.A00.hashCode() * 31) + this.A02.hashCode()) * 31;
        C357588Yu r0 = this.A01;
        return hashCode + (r0 == null ? 0 : r0.hashCode());
    }
}
