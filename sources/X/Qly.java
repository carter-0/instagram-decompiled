package X;

public class Qly extends C268944eK {
    public final C268894eF A00;
    public final C268894eF A01;

    public final boolean A0N() {
        return true;
    }

    public final boolean A0O() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj == null || obj.getClass() != getClass()) {
                return false;
            }
            Qly qly = (Qly) obj;
            if (this.A00 != qly.A00 || !this.A00.equals(qly.A00) || !this.A01.equals(qly.A01)) {
                return false;
            }
        }
        return true;
    }

    public final C268894eF A03() {
        return this.A01;
    }

    public final C268894eF A04() {
        return this.A00;
    }

    public final /* bridge */ /* synthetic */ C268894eF A06() {
        if (this instanceof Qlu) {
            Qlu qlu = (Qlu) this;
            if (qlu.A03) {
                return qlu;
            }
            Class cls = qlu.A00;
            C268924eI r5 = qlu.A01;
            return new Qly(qlu.A00, qlu.A00.A06(), qlu.A01.A06(), r5, cls, qlu.A02, qlu.A01, qlu.A02, true);
        } else if (this.A03) {
            return this;
        } else {
            Class cls2 = this.A00;
            C268924eI r52 = this.A01;
            return new Qly(this.A00, this.A00, this.A01.A06(), r52, cls2, this.A02, this.A01, this.A02, true);
        }
    }

    public final C268894eF A08(C268894eF r11) {
        boolean z = this instanceof Qlu;
        C268894eF r0 = this.A01;
        C268894eF r3 = r11;
        if (z) {
            if (r0 == r11) {
                return this;
            }
            Class cls = this.A00;
            C268924eI r4 = this.A01;
            return new Qly(this.A00, this.A00, r3, r4, cls, this.A02, this.A01, this.A02, this.A03);
        } else if (r0 == r11) {
            return this;
        } else {
            Class cls2 = this.A00;
            C268924eI r42 = this.A01;
            return new Qly(this.A00, this.A00, r3, r42, cls2, this.A02, this.A01, this.A02, this.A03);
        }
    }

    public final C268894eF A0A(C268894eF r11, C268924eI r12, Class cls, C268894eF[] r14) {
        boolean z = this instanceof Qlu;
        C268894eF r2 = this.A00;
        C268894eF r3 = this.A01;
        Object obj = this.A02;
        Object obj2 = this.A01;
        boolean z2 = this.A03;
        C268894eF r1 = r11;
        C268924eI r4 = r12;
        Class cls2 = cls;
        C268894eF[] r8 = r14;
        if (z) {
            return new Qly(r1, r2, r3, r4, cls2, obj, obj2, r8, z2);
        }
        return new Qly(r1, r2, r3, r4, cls2, obj, obj2, r8, z2);
    }

    public final /* bridge */ /* synthetic */ C268894eF A0C(Object obj) {
        if (this instanceof Qlu) {
            Qlu qlu = (Qlu) this;
            Class cls = qlu.A00;
            C268924eI r5 = qlu.A01;
            return new Qly(qlu.A00, qlu.A00, qlu.A01.A0E(obj), r5, cls, qlu.A02, qlu.A01, qlu.A02, qlu.A03);
        }
        Class cls2 = this.A00;
        C268924eI r52 = this.A01;
        return new Qly(this.A00, this.A00, this.A01.A0E(obj), r52, cls2, this.A02, this.A01, this.A02, this.A03);
    }

    public final /* bridge */ /* synthetic */ C268894eF A0D(Object obj) {
        if (this instanceof Qlu) {
            Qlu qlu = (Qlu) this;
            Class cls = qlu.A00;
            C268924eI r5 = qlu.A01;
            return new Qly(qlu.A00, qlu.A00, qlu.A01.A0F(obj), r5, cls, qlu.A02, qlu.A01, qlu.A02, qlu.A03);
        }
        Class cls2 = this.A00;
        C268924eI r52 = this.A01;
        return new Qly(this.A00, this.A00, this.A01.A0F(obj), r52, cls2, this.A02, this.A01, this.A02, this.A03);
    }

    public final /* bridge */ /* synthetic */ C268894eF A0E(Object obj) {
        Object obj2 = obj;
        if (this instanceof Qlu) {
            Qlu qlu = (Qlu) this;
            Class cls = qlu.A00;
            C268924eI r4 = qlu.A01;
            return new Qly(qlu.A00, qlu.A00, qlu.A01, r4, cls, qlu.A02, obj2, qlu.A02, qlu.A03);
        }
        Class cls2 = this.A00;
        C268924eI r42 = this.A01;
        return new Qly(this.A00, this.A00, this.A01, r42, cls2, this.A02, obj2, this.A02, this.A03);
    }

    public final /* bridge */ /* synthetic */ C268894eF A0F(Object obj) {
        Object obj2 = obj;
        if (this instanceof Qlu) {
            Qlu qlu = (Qlu) this;
            Class cls = qlu.A00;
            C268924eI r4 = qlu.A01;
            return new Qly(qlu.A00, qlu.A00, qlu.A01, r4, cls, obj2, qlu.A01, qlu.A02, qlu.A03);
        }
        Class cls2 = this.A00;
        C268924eI r42 = this.A01;
        return new Qly(this.A00, this.A00, this.A01, r42, cls2, obj2, this.A01, this.A02, this.A03);
    }

    public final StringBuilder A0H(StringBuilder sb) {
        C268944eK.A01(this.A00, sb, true);
        return sb;
    }

    public final StringBuilder A0I(StringBuilder sb) {
        C268944eK.A01(this.A00, sb, false);
        sb.append('<');
        this.A00.A0I(sb);
        this.A01.A0I(sb);
        sb.append(">;");
        return sb;
    }

    public final Qly A0S(C268894eF r11) {
        boolean z = this instanceof Qlu;
        C268894eF r0 = this.A00;
        C268894eF r2 = r11;
        if (z) {
            if (r11 == r0) {
                return this;
            }
            Class cls = this.A00;
            C268924eI r4 = this.A01;
            return new Qly(this.A00, r2, this.A01, r4, cls, this.A02, this.A01, this.A02, this.A03);
        } else if (r11 == r0) {
            return this;
        } else {
            Class cls2 = this.A00;
            C268924eI r42 = this.A01;
            return new Qly(this.A00, r2, this.A01, r42, cls2, this.A02, this.A01, this.A02, this.A03);
        }
    }

    public final Qly A0T(Object obj) {
        boolean z = this instanceof Qlu;
        Class cls = this.A00;
        C268924eI r5 = this.A01;
        C268894eF r2 = this.A00;
        C268894eF[] r9 = this.A02;
        C268894eF A0F = this.A00.A0F(obj);
        C268894eF r4 = this.A01;
        Object obj2 = this.A02;
        Object obj3 = this.A01;
        boolean z2 = this.A03;
        if (z) {
            return new Qly(r2, A0F, r4, r5, cls, obj2, obj3, r9, z2);
        }
        return new Qly(r2, A0F, r4, r5, cls, obj2, obj3, r9, z2);
    }

    public String toString() {
        return String.format("[map-like type; class %s, %s -> %s]", new Object[]{this.A00.getName(), this.A00, this.A01});
    }

    public Qly(C268894eF r1, C268894eF r2, C268944eK r3) {
        super(r3);
        this.A00 = r1;
        this.A01 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000e, code lost:
        r1 = r4.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0022, code lost:
        r1 = r4.A01;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C268894eF A09(X.C268894eF r5) {
        /*
            r4 = this;
            X.4eF r3 = super.A09(r5)
            X.4eF r2 = r5.A04()
            boolean r0 = r3 instanceof X.Qly
            if (r0 == 0) goto L_0x001c
            if (r2 == 0) goto L_0x001c
            X.4eF r1 = r4.A00
            X.4eF r0 = r1.A09(r2)
            if (r0 == r1) goto L_0x001c
            X.Qly r3 = (X.Qly) r3
            X.Qly r3 = r3.A0S(r0)
        L_0x001c:
            X.4eF r0 = r5.A03()
            if (r0 == 0) goto L_0x002e
            X.4eF r1 = r4.A01
            X.4eF r0 = r1.A09(r0)
            if (r0 == r1) goto L_0x002e
            X.4eF r3 = r3.A08(r0)
        L_0x002e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Qly.A09(X.4eF):X.4eF");
    }

    public final boolean A0K() {
        if (super.A0K() || this.A01.A0K() || this.A00.A0K()) {
            return true;
        }
        return false;
    }

    public final String A0R() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        Class cls = this.A00;
        Pxe.A1W(cls, A1A);
        C268894eF r2 = this.A00;
        if (r2 != null && cls.getTypeParameters().length == 2) {
            A1A.append('<');
            A1A.append(((C268944eK) r2).A0R());
            A1A.append(',');
            A1A.append(((C268944eK) this.A01).A0R());
            A1A.append('>');
        }
        return A1A.toString();
    }

    public Qly(C268894eF r10, C268894eF r11, C268894eF r12, C268924eI r13, Class cls, Object obj, Object obj2, C268894eF[] r17, boolean z) {
        super(r10, r13, cls, obj, obj2, r17, r11.hashCode() ^ r12.hashCode(), z);
        this.A00 = r11;
        this.A01 = r12;
    }
}
