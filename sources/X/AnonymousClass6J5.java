package X;

/* renamed from: X.6J5  reason: invalid class name */
public abstract class AnonymousClass6J5 {
    public static final int A00(AnonymousClass6J1 r1, Object obj, int i) {
        int itemCount;
        int BGq;
        if (obj == null || (itemCount = r1.getItemCount()) == 0 || ((i < itemCount && obj.equals(r1.BK0(i))) || (BGq = r1.BGq(obj)) == -1)) {
            return i;
        }
        return BGq;
    }
}
