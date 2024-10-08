package X;

import java.io.Serializable;

/* renamed from: X.3xP  reason: invalid class name and case insensitive filesystem */
public abstract class C257443xP implements Serializable {
    public abstract boolean equals(Object obj);

    public abstract int hashCode();

    public abstract String toString();

    public static C257443xP A00(Object obj) {
        if (obj == null) {
            return C2612848z.A00;
        }
        return new C257453xQ(obj);
    }

    public final C257443xP A02(AnonymousClass2hV r3) {
        if (this instanceof C2612848z) {
            return C2612848z.A00;
        }
        Object apply = r3.apply(((C257453xQ) this).A00);
        17k.A07(apply, "the Function passed to Optional.transform() must not return null.");
        return new C257453xQ(apply);
    }

    public final Object A03() {
        if (this instanceof C257453xQ) {
            return ((C257453xQ) this).A00;
        }
        throw new IllegalStateException(Pxd.A00(544));
    }

    public final Object A04() {
        if (this instanceof C2612848z) {
            return null;
        }
        return ((C257453xQ) this).A00;
    }

    public final Object A05(Object obj) {
        if (this instanceof C257453xQ) {
            17k.A07(obj, "use Optional.orNull() instead of Optional.or(null)");
            return ((C257453xQ) this).A00;
        }
        17k.A07(obj, "use Optional.orNull() instead of Optional.or(null)");
        return obj;
    }

    public final boolean A06() {
        if (this instanceof C2612848z) {
            return false;
        }
        return true;
    }

    public static C257453xQ A01(Object obj) {
        obj.getClass();
        return new C257453xQ(obj);
    }
}
