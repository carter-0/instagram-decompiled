package X;

public abstract class RR6 {
    public int A00;
    public int A01;

    public final String toString() {
        if (this instanceof RBZ) {
            return ((RBZ) this).A00;
        }
        if (this instanceof C8824RBa) {
            return DbT.A10(((C8824RBa) this).A01);
        }
        throw AnonymousClass7TE.A1K();
    }
}
