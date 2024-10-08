package X;

/* renamed from: X.Qkj  reason: case insensitive filesystem */
public final class C8236Qkj extends C282595Dw {
    public final Object A00;

    public final int A03(int i) {
        Object obj = this.A00;
        if (obj instanceof Number) {
            return AnonymousClass7TE.A0M(obj);
        }
        return 0;
    }

    public final String A06() {
        Object obj = this.A00;
        if (obj == null) {
            return "null";
        }
        return obj.toString();
    }

    public final 16L A0B() {
        return 16L.A0E;
    }

    public final void EN9(17Z r5, C269504fE r6) {
        Object obj = this.A00;
        if (obj == null) {
            r6.A0T(r5);
        } else if (obj instanceof C252523pF) {
            ((C252523pF) obj).EN9(r5, r6);
        } else {
            r6.A0J((C13901TjO) null, obj.getClass(), true).A0A(r5, r6, obj);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof C8236Qkj)) {
            return false;
        }
        Object obj2 = this.A00;
        Object obj3 = ((C8236Qkj) obj).A00;
        if (obj2 == null) {
            return DbW.A1a(obj3);
        }
        return obj2.equals(obj3);
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public C8236Qkj(Object obj) {
        this.A00 = obj;
    }
}
