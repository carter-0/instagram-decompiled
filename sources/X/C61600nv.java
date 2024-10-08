package X;

/* renamed from: X.0nv  reason: invalid class name and case insensitive filesystem */
public final class C61600nv {
    public int A00 = 0;
    public final int A01;
    public final byte[] A02 = new byte[256];

    public C61600nv(int i) {
        if (i < 1 || i > 256) {
            throw new IllegalArgumentException();
        }
        this.A01 = i;
    }
}
