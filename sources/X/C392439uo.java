package X;

/* renamed from: X.9uo  reason: invalid class name and case insensitive filesystem */
public abstract class C392439uo {
    public static C367508qr A00(C367508qr r4, int i, int i2) {
        float f = (float) r4.A00;
        float f2 = (float) r4.A01;
        int i3 = (int) (((float) i) * (f / f2));
        if (i3 <= i2) {
            return new C367508qr(i, i3);
        }
        return new C367508qr((int) (((float) i2) * (f2 / f)), i2);
    }
}
