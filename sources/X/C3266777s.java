package X;

/* renamed from: X.77s  reason: invalid class name and case insensitive filesystem */
public final class C3266777s {
    public final AnonymousClass0eM A00;
    public final String A01;

    public C3266777s(String str, AnonymousClass0eM r3) {
        0qQ.A0B(str, 1);
        this.A01 = str;
        this.A00 = r3;
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        Class<?> cls2 = getClass();
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!0qQ.A0K(cls2, cls) || !(obj instanceof C3266777s)) {
            return false;
        }
        return 0qQ.A0K(((C3266777s) obj).A01, this.A01);
    }

    public final int hashCode() {
        return this.A01.hashCode();
    }
}
