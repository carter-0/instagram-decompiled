package X;

/* renamed from: X.V5a  reason: case insensitive filesystem */
public abstract class C16767V5a {
    public static boolean A00(AnonymousClass8KU r4) {
        if (!(r4 instanceof C365188mg)) {
            return false;
        }
        int Bpb = ((C365188mg) r4).Bpb();
        if ((Bpb & 4) == 4 || (Bpb & 16) == 16) {
            return true;
        }
        return false;
    }
}
