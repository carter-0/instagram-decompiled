package X;

/* renamed from: X.4eJ  reason: invalid class name and case insensitive filesystem */
public class C268934eJ extends C268944eK {
    /* JADX WARNING: type inference failed for: r0v0, types: [X.4eK, X.4eJ] */
    public static C268934eJ A00(Class cls) {
        return new C268944eK((C268894eF) null, (C268924eI) null, cls, (Object) null, (Object) null, (C268894eF[]) null, 0, false);
    }

    public C268934eJ(Class cls) {
        super((C268894eF) null, C268924eI.A04, cls, (Object) null, (Object) null, (C268894eF[]) null, 0, false);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && obj.getClass() == getClass()) {
            C268944eK r4 = (C268944eK) obj;
            if (r4.A00 == this.A00) {
                return this.A01.equals(r4.A01);
            }
        }
        return false;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(40);
        sb.append("[simple type, class ");
        sb.append(A0R());
        sb.append(']');
        return sb.toString();
    }
}
