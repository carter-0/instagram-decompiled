package X;

/* renamed from: X.9IK  reason: invalid class name */
public final class AnonymousClass9IK extends AnonymousClass0T0 implements C334127ai {
    public final int A00;
    public final Object A01;

    public AnonymousClass9IK(1Xj r1, int i) {
        this.A00 = i;
        this.A01 = r1;
    }

    public static boolean A00(int i, Object obj) {
        if (!(obj instanceof AnonymousClass9IK) || ((AnonymousClass9IK) obj).A00 != i) {
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
            case 2:
                if (this != obj) {
                    i = 2;
                    break;
                } else {
                    return true;
                }
            case 3:
                if (this != obj) {
                    i = 3;
                    break;
                } else {
                    return true;
                }
            case 4:
                if (this != obj) {
                    i = 4;
                    break;
                } else {
                    return true;
                }
            case 5:
                if (this != obj) {
                    i = 5;
                    break;
                } else {
                    return true;
                }
            default:
                if (this != obj) {
                    i = 6;
                    break;
                } else {
                    return true;
                }
        }
        if (!A00(i, obj) || !0qQ.A0K(this.A01, ((AnonymousClass9IK) obj).A01)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Object obj;
        if (2 - this.A00 != 0) {
            obj = this.A01;
        } else {
            obj = this.A01;
            if (obj == null) {
                return 0;
            }
        }
        return obj.hashCode();
    }

    public AnonymousClass9IK(C59482JLg jLg) {
        this.A00 = 5;
        this.A01 = jLg;
    }

    public AnonymousClass9IK(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }
}
