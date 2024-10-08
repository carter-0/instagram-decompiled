package X;

/* renamed from: X.Gpn  reason: case insensitive filesystem */
public final class C53517Gpn extends AnonymousClass0T0 implements JPI {
    public final Object A00;
    public final String A01;
    public final boolean A02;

    public C53517Gpn(Object obj, String str, boolean z) {
        0qQ.A0B(str, 1);
        this.A01 = str;
        this.A02 = z;
        this.A00 = obj;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53517Gpn) {
                C53517Gpn gpn = (C53517Gpn) obj;
                if (!0qQ.A0K(this.A01, gpn.A01) || this.A02 != gpn.A02 || !0qQ.A0K(this.A00, gpn.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final boolean getEnabled() {
        return this.A02;
    }

    public final Object getKey() {
        return this.A00;
    }

    public final int hashCode() {
        return AnonymousClass7TF.A09(this.A02, AnonymousClass7TE.A0O(this.A01)) + AnonymousClass7TG.A0C(this.A00);
    }
}
