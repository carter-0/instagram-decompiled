package X;

/* renamed from: X.4DE  reason: invalid class name */
public final class AnonymousClass4DE implements C71062aE {
    public final int A00;
    public final 2aD A01;
    public final String A02;
    public final String A03;

    public AnonymousClass4DE(2aD r4, String str) {
        String obj;
        0qQ.A0B(str, 1);
        this.A01 = r4;
        String obj2 = r4 != null ? r4.toString() : null;
        String str2 = "";
        this.A02 = 002.A0T(str, obj2 == null ? str2 : obj2, '/');
        if (!(r4 == null || (obj = r4.toString()) == null)) {
            str2 = obj;
        }
        this.A03 = str2;
        this.A00 = (r4 == null ? 2aD.A0Z : r4).A00;
    }

    public final boolean Akm() {
        return false;
    }

    public final String BOD() {
        return this.A03;
    }

    public final int BYi() {
        return this.A00;
    }

    public final boolean equals(Object obj) {
        AnonymousClass4DE r4;
        if (obj instanceof AnonymousClass4DE) {
            r4 = (AnonymousClass4DE) obj;
        } else {
            r4 = null;
        }
        if (r4 == null || !0qQ.A0K(r4.A02, this.A02) || r4.A00 != this.A00) {
            return false;
        }
        return true;
    }

    public final String getIdentifier() {
        return this.A02;
    }

    public final int hashCode() {
        return this.A02.hashCode();
    }

    public final String toString() {
        return this.A02;
    }
}
