package X;

import java.io.Serializable;
import java.util.List;

/* renamed from: X.Jzt  reason: case insensitive filesystem */
public final class C61261Jzt extends AnonymousClass0T0 implements Serializable {
    public final C61262Jzu A00;
    public final List A01;

    public C61261Jzt(C61262Jzu jzu, List list) {
        0qQ.A0B(list, 1);
        this.A01 = list;
        this.A00 = jzu;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C61261Jzt) {
                C61261Jzt jzt = (C61261Jzt) obj;
                if (!0qQ.A0K(this.A01, jzt.A01) || !0qQ.A0K(this.A00, jzt.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A00, AnonymousClass7TE.A0K(this.A01));
    }
}
