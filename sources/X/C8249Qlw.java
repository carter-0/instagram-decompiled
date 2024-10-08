package X;

/* renamed from: X.Qlw  reason: case insensitive filesystem */
public class C8249Qlw extends C268944eK {
    public final C268894eF A00;

    public final boolean A0M() {
        return true;
    }

    public final boolean A0N() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj == null || obj.getClass() != getClass()) {
                return false;
            }
            C8249Qlw qlw = (C8249Qlw) obj;
            if (this.A00 != qlw.A00 || !this.A00.equals(qlw.A00)) {
                return false;
            }
        }
        return true;
    }

    public final C268894eF A03() {
        return this.A00;
    }

    public final /* bridge */ /* synthetic */ C268894eF A06() {
        if (this instanceof Qlt) {
            Qlt qlt = (Qlt) this;
            if (qlt.A03) {
                return qlt;
            }
            Class cls = qlt.A00;
            C268924eI r4 = qlt.A01;
            return new C8249Qlw(qlt.A00, qlt.A00.A06(), r4, cls, qlt.A02, qlt.A01, qlt.A02, true);
        } else if (this.A03) {
            return this;
        } else {
            Class cls2 = this.A00;
            C268924eI r42 = this.A01;
            return new C8249Qlw(this.A00, this.A00.A06(), r42, cls2, this.A02, this.A01, this.A02, true);
        }
    }

    public final C268894eF A08(C268894eF r10) {
        boolean z = this instanceof Qlt;
        C268894eF r0 = this.A00;
        C268894eF r2 = r10;
        if (z) {
            if (r0 == r10) {
                return this;
            }
            Class cls = this.A00;
            C268924eI r3 = this.A01;
            return new C8249Qlw(this.A00, r2, r3, cls, this.A02, this.A01, this.A02, this.A03);
        } else if (r0 == r10) {
            return this;
        } else {
            Class cls2 = this.A00;
            C268924eI r32 = this.A01;
            return new C8249Qlw(this.A00, r2, r32, cls2, this.A02, this.A01, this.A02, this.A03);
        }
    }

    public final C268894eF A0A(C268894eF r10, C268924eI r11, Class cls, C268894eF[] r13) {
        boolean z = this instanceof Qlt;
        C268894eF r2 = this.A00;
        Object obj = this.A02;
        Object obj2 = this.A01;
        boolean z2 = this.A03;
        C268894eF r1 = r10;
        C268924eI r3 = r11;
        Class cls2 = cls;
        C268894eF[] r7 = r13;
        if (z) {
            return new C8249Qlw(r1, r2, r3, cls2, obj, obj2, r7, z2);
        }
        return new C8249Qlw(r1, r2, r3, cls2, obj, obj2, r7, z2);
    }

    public final /* bridge */ /* synthetic */ C268894eF A0C(Object obj) {
        if (this instanceof Qlt) {
            Qlt qlt = (Qlt) this;
            Class cls = qlt.A00;
            C268924eI r4 = qlt.A01;
            return new C8249Qlw(qlt.A00, qlt.A00.A0E(obj), r4, cls, qlt.A02, qlt.A01, qlt.A02, qlt.A03);
        }
        Class cls2 = this.A00;
        C268924eI r42 = this.A01;
        return new C8249Qlw(this.A00, this.A00.A0E(obj), r42, cls2, this.A02, this.A01, this.A02, this.A03);
    }

    public final /* bridge */ /* synthetic */ C268894eF A0D(Object obj) {
        if (this instanceof Qlt) {
            Qlt qlt = (Qlt) this;
            Class cls = qlt.A00;
            C268924eI r4 = qlt.A01;
            return new C8249Qlw(qlt.A00, qlt.A00.A0F(obj), r4, cls, qlt.A02, qlt.A01, qlt.A02, qlt.A03);
        }
        Class cls2 = this.A00;
        C268924eI r42 = this.A01;
        return new C8249Qlw(this.A00, this.A00.A0F(obj), r42, cls2, this.A02, this.A01, this.A02, this.A03);
    }

    public final /* bridge */ /* synthetic */ C268894eF A0E(Object obj) {
        boolean z = this instanceof Qlt;
        Class cls = this.A00;
        C268924eI r3 = this.A01;
        C268894eF r1 = this.A00;
        C268894eF[] r7 = this.A02;
        C268894eF r2 = this.A00;
        Object obj2 = this.A02;
        boolean z2 = this.A03;
        Object obj3 = obj;
        if (z) {
            return new C8249Qlw(r1, r2, r3, cls, obj2, obj3, r7, z2);
        }
        return new C8249Qlw(r1, r2, r3, cls, obj2, obj3, r7, z2);
    }

    public final /* bridge */ /* synthetic */ C268894eF A0F(Object obj) {
        boolean z = this instanceof Qlt;
        Class cls = this.A00;
        C268924eI r3 = this.A01;
        C268894eF r1 = this.A00;
        C268894eF[] r7 = this.A02;
        C268894eF r2 = this.A00;
        Object obj2 = this.A01;
        boolean z2 = this.A03;
        Object obj3 = obj;
        if (z) {
            return new C8249Qlw(r1, r2, r3, cls, obj3, obj2, r7, z2);
        }
        return new C8249Qlw(r1, r2, r3, cls, obj3, obj2, r7, z2);
    }

    public final StringBuilder A0H(StringBuilder sb) {
        C268944eK.A01(this.A00, sb, true);
        return sb;
    }

    public final StringBuilder A0I(StringBuilder sb) {
        C268944eK.A01(this.A00, sb, false);
        sb.append('<');
        this.A00.A0I(sb);
        sb.append(">;");
        return sb;
    }

    public C8249Qlw(C268894eF r10, C268894eF r11, C268924eI r12, Class cls, Object obj, Object obj2, C268894eF[] r16, boolean z) {
        super(r10, r12, cls, obj, obj2, r16, r11.hashCode(), z);
        this.A00 = r11;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        r1 = r3.A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C268894eF A09(X.C268894eF r4) {
        /*
            r3 = this;
            X.4eF r2 = super.A09(r4)
            X.4eF r0 = r4.A03()
            if (r0 == 0) goto L_0x0016
            X.4eF r1 = r3.A00
            X.4eF r0 = r1.A09(r0)
            if (r0 == r1) goto L_0x0016
            X.4eF r2 = r2.A08(r0)
        L_0x0016:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8249Qlw.A09(X.4eF):X.4eF");
    }

    public final boolean A0K() {
        if (super.A0K() || this.A00.A0K()) {
            return true;
        }
        return false;
    }

    public final String A0R() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        Class cls = this.A00;
        Pxe.A1W(cls, A1A);
        C268894eF r2 = this.A00;
        if (r2 != null && cls.getTypeParameters().length == 1) {
            A1A.append('<');
            A1A.append(((C268944eK) r2).A0R());
            A1A.append('>');
        }
        return A1A.toString();
    }

    public String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("[collection-like type; class ");
        Pxe.A1W(this.A00, A1A);
        A1A.append(", contains ");
        return Pxg.A0r(this.A00, A1A);
    }
}
