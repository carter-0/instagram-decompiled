package X;

import java.util.List;

/* renamed from: X.9ce  reason: invalid class name and case insensitive filesystem */
public final class C381849ce extends AnonymousClass0T0 implements C46228DRj {
    public final Boolean A00;
    public final String A01;
    public final String A02;
    public final List A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C381849ce) {
                C381849ce r5 = (C381849ce) obj;
                if (!0qQ.A0K(this.A01, r5.A01) || !0qQ.A0K(this.A00, r5.A00) || !0qQ.A0K(this.A02, r5.A02) || !0qQ.A0K(this.A03, r5.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((AnonymousClass7TG.A0E(this.A01) * 31) + AnonymousClass7TG.A0C(this.A00)) * 31) + AnonymousClass7TG.A0E(this.A02)) * 31) + AnonymousClass7TE.A0L(this.A03);
    }

    public C381849ce(Boolean bool, String str, String str2, List list) {
        this.A01 = str;
        this.A00 = bool;
        this.A02 = str2;
        this.A03 = list;
    }

    public final C46228DRj E7Q(1E9 r1) {
        return this;
    }
}
