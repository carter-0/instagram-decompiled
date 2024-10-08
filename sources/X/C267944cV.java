package X;

/* renamed from: X.4cV  reason: invalid class name and case insensitive filesystem */
public abstract class C267944cV extends C267794cD {
    public C267794cD A00;
    public final int A01 = AnonymousClass5WB.A01(this);

    public final void A0H(C267804cE r9) {
        String obj;
        C267794cD r1 = (C267794cD) r9;
        C267794cD r2 = r1.A03;
        boolean z = false;
        if (r2 != r9) {
            z = true;
        }
        C267794cD r6 = null;
        if (z) {
            if (r9 instanceof C267794cD) {
                r6 = r1.A04;
            }
            if (r2 != this.A03 || !0qQ.A0K(r6, this)) {
                throw new IllegalStateException("Cannot delegate to an already delegated node");
            }
            return;
        }
        if (!(!r2.A08)) {
            obj = "Cannot delegate to an already attached node";
        } else {
            r2.A06(this.A03);
            int i = this.A01;
            int A02 = AnonymousClass5WB.A02(r2);
            r2.A01 = A02;
            int i2 = this.A01;
            int i3 = A02 & 2;
            if (i3 == 0 || (i2 & 2) == 0 || (this instanceof C268434dO)) {
                r2.A02 = this.A00;
                this.A00 = r2;
                r2.A04 = this;
                A00(i2 | A02, false);
                if (this.A08) {
                    if (i3 == 0 || (i & 2) != 0) {
                        A07(this.A05);
                    } else {
                        AnonymousClass5RP r12 = AnonymousClass5WH.A02(this).A0W;
                        this.A03.A07((C268054cg) null);
                        r12.A06();
                    }
                    r2.A08();
                    r2.A0B();
                    AnonymousClass5WB.A03(r2);
                    return;
                }
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Delegating to multiple LayoutModifierNodes without the delegating node implementing LayoutModifierNode itself is not allowed.\nDelegating Node: ");
            sb.append(this);
            sb.append("\nDelegate Node: ");
            sb.append(r2);
            obj = sb.toString();
        }
        I2E.A01(obj);
        throw AnonymousClass00P.createAndThrow();
    }

    private final void A00(int i, boolean z) {
        int i2;
        int i3 = this.A01;
        this.A01 = i;
        if (i3 != i) {
            C267794cD r2 = this.A03;
            if (r2 == this) {
                this.A00 = i;
            }
            if (this.A08) {
                C267794cD r1 = this;
                do {
                    i |= r1.A01;
                    r1.A01 = i;
                    if (r1 == r2 || (r1 = r1.A04) == null) {
                        if (z && r1 == r2) {
                            i = AnonymousClass5WB.A02(r2);
                            r2.A01 = i;
                        }
                    }
                    i |= r1.A01;
                    r1.A01 = i;
                    break;
                } while ((r1 = r1.A04) == null);
                i = AnonymousClass5WB.A02(r2);
                r2.A01 = i;
                if (r1 != null) {
                    C267794cD r0 = r1.A02;
                    if (r0 != null) {
                        i2 = r0.A00;
                    } else {
                        i2 = 0;
                    }
                    int i4 = i | i2;
                    do {
                        i4 |= r1.A01;
                        r1.A00 = i4;
                        r1 = r1.A04;
                    } while (r1 != null);
                }
            }
        }
    }

    public final void A09() {
        for (C267794cD r0 = this.A00; r0 != null; r0 = r0.A02) {
            r0.A09();
        }
        super.A09();
    }

    public final void A0B() {
        for (C267794cD r0 = this.A00; r0 != null; r0 = r0.A02) {
            r0.A0B();
        }
        super.A0B();
    }

    public final void A0I(C267804cE r7) {
        C267794cD r2 = null;
        for (C267794cD r5 = this.A00; r5 != null; r5 = r5.A02) {
            if (r5 == r7) {
                if (r5.A08) {
                    AnonymousClass5WB.A05(r5, -1, 2);
                    r5.A0C();
                    r5.A09();
                }
                r5.A06(r5);
                r5.A00 = 0;
                C267794cD r0 = r5.A02;
                if (r2 == null) {
                    this.A00 = r0;
                } else {
                    r2.A02 = r0;
                }
                r5.A02 = null;
                r5.A04 = null;
                int i = this.A01;
                int A02 = AnonymousClass5WB.A02(this);
                A00(A02, true);
                if (this.A08 && (i & 2) != 0 && (A02 & 2) == 0) {
                    AnonymousClass5RP r1 = AnonymousClass5WH.A02(this).A0W;
                    this.A03.A07((C268054cg) null);
                    r1.A06();
                    return;
                }
                return;
            }
            r2 = r5;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Could not find delegate: ");
        sb.append(r7);
        throw new IllegalStateException(sb.toString());
    }

    public final void A08() {
        super.A08();
        for (C267794cD r1 = this.A00; r1 != null; r1 = r1.A02) {
            r1.A07(this.A05);
            if (!r1.A08) {
                r1.A08();
            }
        }
    }

    public final void A0A() {
        super.A0A();
        for (C267794cD r0 = this.A00; r0 != null; r0 = r0.A02) {
            r0.A0A();
        }
    }

    public final void A0C() {
        super.A0C();
        for (C267794cD r0 = this.A00; r0 != null; r0 = r0.A02) {
            r0.A0C();
        }
    }
}
