package X;

/* renamed from: X.9IU  reason: invalid class name */
public final class AnonymousClass9IU extends AnonymousClass0T0 implements AnonymousClass3ZE {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public AnonymousClass9IU(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    public static boolean A00(int i, Object obj) {
        if (!(obj instanceof AnonymousClass9IU) || ((AnonymousClass9IU) obj).A00 != i) {
            return false;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        int i;
        Object obj2;
        Object obj3;
        switch (this.A00) {
            case 0:
                if (this == obj) {
                    return true;
                }
                if (!A00(0, obj)) {
                    return false;
                }
                AnonymousClass9IU r3 = (AnonymousClass9IU) obj;
                if (0qQ.A0K(this.A02, r3.A02)) {
                    obj2 = this.A01;
                    obj3 = r3.A01;
                    break;
                } else {
                    return false;
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
        if (!A00(i, obj)) {
            return false;
        }
        AnonymousClass9IU r32 = (AnonymousClass9IU) obj;
        if (!0qQ.A0K(this.A01, r32.A01)) {
            return false;
        }
        obj2 = this.A02;
        obj3 = r32.A02;
        if (!0qQ.A0K(obj2, obj3)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        Object obj;
        if (this.A00 != 0) {
            hashCode = this.A01.hashCode() * 31;
            obj = this.A02;
        } else {
            hashCode = this.A02.hashCode() * 31;
            obj = this.A01;
        }
        return hashCode + obj.hashCode();
    }
}
