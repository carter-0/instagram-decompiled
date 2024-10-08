package X;

/* renamed from: X.9IJ  reason: invalid class name */
public final class AnonymousClass9IJ extends AnonymousClass0T0 implements AnonymousClass913 {
    public final int A00;
    public final Object A01;

    public AnonymousClass9IJ(C279864zZ r1, int i) {
        this.A00 = i;
        this.A01 = r1;
    }

    public static boolean A00(int i, Object obj) {
        if (!(obj instanceof AnonymousClass9IJ) || ((AnonymousClass9IJ) obj).A00 != i) {
            return false;
        }
        return true;
    }

    public final C279864zZ BWY() {
        return (C279864zZ) this.A01;
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
            default:
                if (this != obj) {
                    i = 5;
                    break;
                } else {
                    return true;
                }
        }
        if (!A00(i, obj) || !0qQ.A0K(this.A01, ((AnonymousClass9IJ) obj).A01)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.A01.hashCode();
    }
}
