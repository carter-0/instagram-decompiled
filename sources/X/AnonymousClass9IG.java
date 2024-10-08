package X;

/* renamed from: X.9IG  reason: invalid class name */
public final class AnonymousClass9IG extends AnonymousClass0T0 implements C303846Ba {
    public final int A00;
    public final Object A01;

    public AnonymousClass9IG(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static boolean A00(int i, Object obj) {
        if (!(obj instanceof AnonymousClass9IG) || ((AnonymousClass9IG) obj).A00 != i) {
            return false;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        int i;
        switch (this.A00) {
            case 0:
                if (this != obj) {
                    i = 0;
                    break;
                } else {
                    return true;
                }
            case 1:
                if (this != obj) {
                    i = 1;
                    break;
                } else {
                    return true;
                }
            default:
                if (this != obj) {
                    i = 2;
                    break;
                } else {
                    return true;
                }
        }
        if (!A00(i, obj) || !0qQ.A0K(this.A01, ((AnonymousClass9IG) obj).A01)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.A01.hashCode();
    }
}
