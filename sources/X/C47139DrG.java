package X;

import java.util.HashMap;

/* renamed from: X.DrG  reason: case insensitive filesystem */
public final class C47139DrG extends AnonymousClass0T0 {
    public final Boolean A00;
    public final HashMap A01;

    public C47139DrG(Boolean bool, HashMap hashMap) {
        0qQ.A0B(hashMap, 1);
        this.A01 = hashMap;
        this.A00 = bool;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C47139DrG) {
                C47139DrG drG = (C47139DrG) obj;
                if (!0qQ.A0K(this.A01, drG.A01) || !0qQ.A0K(this.A00, drG.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0K(this.A01) + AnonymousClass7TG.A0C(this.A00);
    }
}
