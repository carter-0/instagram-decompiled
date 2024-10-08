package X;

/* renamed from: X.5af  reason: invalid class name and case insensitive filesystem */
public abstract class C287725af {
    public final float A00(int i) {
        if (this instanceof C287735ag) {
            C287735ag r1 = (C287735ag) this;
            if (i == 0) {
                return r1.A00;
            }
            if (i == 1) {
                return r1.A01;
            }
            return 0.0f;
        } else if (this instanceof C287715ae) {
            C287715ae r0 = (C287715ae) this;
            if (i == 0) {
                return r0.A00;
            }
            return 0.0f;
        } else if (this instanceof C287755ai) {
            C287755ai r12 = (C287755ai) this;
            if (i == 0) {
                return r12.A00;
            }
            if (i == 1) {
                return r12.A01;
            }
            if (i == 2) {
                return r12.A02;
            }
            if (i == 3) {
                return r12.A03;
            }
            return 0.0f;
        } else {
            C287745ah r13 = (C287745ah) this;
            if (i == 0) {
                return r13.A00;
            }
            if (i == 1) {
                return r13.A01;
            }
            if (i == 2) {
                return r13.A02;
            }
            return 0.0f;
        }
    }

    public final int A01() {
        if (this instanceof C287735ag) {
            return 2;
        }
        if (this instanceof C287715ae) {
            return 1;
        }
        if (this instanceof C287755ai) {
            return 4;
        }
        return 3;
    }

    public final void A02() {
        if (this instanceof C287715ae) {
            ((C287715ae) this).A00 = 0.0f;
        } else if (this instanceof C287735ag) {
            C287735ag r1 = (C287735ag) this;
            r1.A00 = 0.0f;
            r1.A01 = 0.0f;
        } else if (this instanceof C287755ai) {
            C287755ai r12 = (C287755ai) this;
            r12.A00 = 0.0f;
            r12.A01 = 0.0f;
            r12.A02 = 0.0f;
            r12.A03 = 0.0f;
        } else {
            C287745ah r13 = (C287745ah) this;
            r13.A00 = 0.0f;
            r13.A01 = 0.0f;
            r13.A02 = 0.0f;
        }
    }

    public final void A03(int i, float f) {
        if (this instanceof C287735ag) {
            C287735ag r1 = (C287735ag) this;
            if (i == 0) {
                r1.A00 = f;
            } else if (i == 1) {
                r1.A01 = f;
            }
        } else if (this instanceof C287715ae) {
            C287715ae r0 = (C287715ae) this;
            if (i == 0) {
                r0.A00 = f;
            }
        } else if (this instanceof C287755ai) {
            C287755ai r12 = (C287755ai) this;
            if (i == 0) {
                r12.A00 = f;
            } else if (i == 1) {
                r12.A01 = f;
            } else if (i == 2) {
                r12.A02 = f;
            } else if (i == 3) {
                r12.A03 = f;
            }
        } else {
            C287745ah r13 = (C287745ah) this;
            if (i == 0) {
                r13.A00 = f;
            } else if (i == 1) {
                r13.A01 = f;
            } else if (i == 2) {
                r13.A02 = f;
            }
        }
    }
}
