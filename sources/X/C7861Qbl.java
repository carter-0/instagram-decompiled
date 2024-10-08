package X;

/* renamed from: X.Qbl  reason: case insensitive filesystem */
public final class C7861Qbl extends T9D {
    public final Object A00;

    public final boolean equals(Object obj) {
        if (obj instanceof C7861Qbl) {
            return this.A00.equals(((C7861Qbl) obj).A00);
        }
        return false;
    }

    public final int hashCode() {
        return this.A00.hashCode() + 1502476572;
    }

    public C7861Qbl(Object obj) {
        this.A00 = obj;
    }

    public static C7861Qbl A00(Object obj) {
        obj.getClass();
        return new C7861Qbl(obj);
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("Optional.of(");
        return Pxg.A0q(this.A00, A1A);
    }
}
