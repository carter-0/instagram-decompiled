package X;

/* renamed from: X.7Ob  reason: invalid class name and case insensitive filesystem */
public abstract class C330757Ob {
    public static final boolean A00(C331837So r6, C331837So r7, boolean z) {
        if (r6 == r7) {
            return true;
        }
        if ((r6 instanceof AnonymousClass7LQ) && (r7 instanceof AnonymousClass7LQ)) {
            return C254703su.A0B(((AnonymousClass7LQ) r6).A0e, ((AnonymousClass7LQ) r7).A0e);
        }
        if (r6.getType() != r7.getType()) {
            return false;
        }
        int type = r6.getType();
        if (type == 2) {
            return true;
        }
        if (type != 32) {
            if (type == 157 || type == 158) {
                return true;
            }
            switch (type) {
                case 34:
                case 35:
                    break;
                case 36:
                    return true;
                default:
                    switch (type) {
                        case 55:
                            return true;
                        case 56:
                        case 57:
                            break;
                        default:
                            return false;
                    }
            }
        } else if (!z) {
            return true;
        } else {
            if (!(r6 instanceof C331007Pc) || !(r7 instanceof C331007Pc)) {
                return false;
            }
        }
        return r6.C7Z() == r7.C7Z();
    }
}
