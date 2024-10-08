package X;

import java.util.Collection;

/* renamed from: X.4dB  reason: invalid class name and case insensitive filesystem */
public final class C268314dB extends AnonymousClass0T0 {
    public final Collection A00;
    public final Collection A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C268314dB) {
                C268314dB r5 = (C268314dB) obj;
                if (!0qQ.A0K(this.A01, r5.A01) || !0qQ.A0K(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.A01.hashCode() * 31) + this.A00.hashCode();
    }

    public C268314dB(Collection collection, Collection collection2) {
        this.A01 = collection;
        this.A00 = collection2;
    }
}
