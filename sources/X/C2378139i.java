package X;

/* renamed from: X.39i  reason: invalid class name and case insensitive filesystem */
public abstract class C2378139i {
    public final AnonymousClass39B A00;

    public final int A00() {
        if (this instanceof C2378039h) {
            return 6;
        }
        if (this instanceof C2378439l) {
            return 7;
        }
        if (this instanceof C2378339k) {
            return 9;
        }
        if ((this instanceof C2378539m) || (this instanceof C2378639n) || (this instanceof C2378739o)) {
            return 7;
        }
        return 5;
    }

    public boolean A01(AnonymousClass3DG r4) {
        Integer num;
        Integer num2;
        if (this instanceof C2378339k) {
            return r4.A0B.A07;
        }
        if (this instanceof C2378639n) {
            num = r4.A0B.A02;
            num2 = AnonymousClass05K.A0N;
        } else if (this instanceof C2378739o) {
            num = r4.A0B.A02;
            num2 = AnonymousClass05K.A0Y;
        } else if (this instanceof C2378439l) {
            num = r4.A0B.A02;
            num2 = AnonymousClass05K.A01;
        } else if (this instanceof C2378239j) {
            return r4.A0B.A04;
        } else {
            return r4.A0B.A05;
        }
        if (num == num2) {
            return true;
        }
        return false;
    }

    public final boolean A02(Object obj) {
        boolean z;
        boolean z2;
        if (!(this instanceof C2378039h)) {
            if (this instanceof C2378439l) {
                C2805052c r3 = (C2805052c) obj;
                0qQ.A0B(r3, 0);
                if (!r3.A00 || !r3.A03) {
                    return true;
                }
                return false;
            } else if (!(this instanceof C2378339k)) {
                if (this instanceof C2378539m) {
                    C2805052c r32 = (C2805052c) obj;
                    0qQ.A0B(r32, 0);
                    if (!r32.A00 || r32.A01) {
                        return true;
                    }
                    return false;
                }
                if (this instanceof C2378639n) {
                    C2805052c r33 = (C2805052c) obj;
                    0qQ.A0B(r33, 0);
                    z = false;
                    if (!r33.A00) {
                        return true;
                    }
                    z2 = r33.A02;
                } else if (this instanceof C2378739o) {
                    C2805052c r34 = (C2805052c) obj;
                    0qQ.A0B(r34, 0);
                    z = false;
                    if (!r34.A00) {
                        return true;
                    }
                    z2 = r34.A01;
                }
                if (!z2) {
                    return true;
                }
                return z;
            }
        }
        return !((Boolean) obj).booleanValue();
    }

    public C2378139i(AnonymousClass39B r1) {
        this.A00 = r1;
    }
}
