package X;

public final class TPC implements AnonymousClass0eK, C13629Tdv {
    public static final Object A02 = Pxe.A0p();
    public volatile Object A00;
    public volatile AnonymousClass0eK A01;

    public final Object get() {
        Object obj;
        Object obj2 = this.A00;
        Object obj3 = A02;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            obj = this.A00;
            if (obj == obj3) {
                obj = this.A01.get();
                Object obj4 = this.A00;
                if (obj4 == obj3 || obj4 == obj) {
                    this.A00 = obj;
                    this.A01 = null;
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
