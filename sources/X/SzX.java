package X;

public final class SzX implements C13653TeK {
    public static final Object A02 = Pxe.A0p();
    public volatile C13653TeK A00;
    public volatile Object A01;

    public final Object A6t() {
        Object obj;
        Object obj2 = this.A01;
        Object obj3 = A02;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            obj = this.A01;
            if (obj == obj3) {
                obj = this.A00.A6t();
                Object obj4 = this.A01;
                if (obj4 == obj3 || obj4 == obj) {
                    this.A01 = obj;
                    this.A00 = null;
                } else {
                    StringBuilder A1A = AnonymousClass7TE.A1A();
                    A1A.append("Scoped provider was invoked recursively returning different results: ");
                    A1A.append(obj4);
                    A1A.append(" & ");
                    A1A.append(obj);
                    throw AnonymousClass7TE.A0z(AnonymousClass7TF.A0l(". This is likely due to a circular dependency.", A1A));
                }
            }
        }
        return obj;
    }
}
