package X;

/* renamed from: X.4iN  reason: invalid class name */
public final class AnonymousClass4iN extends C268944eK {
    public final C268894eF A00;
    public final Object A01;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        return this.A00.equals(((AnonymousClass4iN) obj).A00);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[array type, component type: ");
        sb.append(this.A00);
        sb.append("]");
        return sb.toString();
    }

    public AnonymousClass4iN(C268894eF r10, C268924eI r11, Object obj, Object obj2, Object obj3, boolean z) {
        super((C268894eF) null, r11, obj.getClass(), obj2, obj3, (C268894eF[]) null, r10.hashCode(), z);
        this.A00 = r10;
        this.A01 = obj;
    }

    public final boolean A0K() {
        if (super.A0K() || this.A00.A0K()) {
            return true;
        }
        return false;
    }
}
