package X;

/* renamed from: X.8fx  reason: invalid class name and case insensitive filesystem */
public abstract class C361278fx {
    public final int A00;
    public final Object A01;

    public final Object A00() {
        Object obj = this.A01;
        if (obj != null) {
            return obj;
        }
        throw new IllegalStateException(002.A0g("Calling #get() on Resource [", getClass().getCanonicalName(), "] without data"));
    }

    public final boolean A01() {
        if ((this instanceof C361338g4) || (this instanceof AnonymousClass8RJ)) {
            return true;
        }
        return false;
    }

    public C361278fx(int i, Object obj) {
        this.A00 = i;
        this.A01 = obj;
    }
}
