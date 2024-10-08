package X;

public final class P0X implements C74490Pvk {
    public final int A00;
    public final NB3 A01;
    public final NB5 A02;

    public final String BZR() {
        String A0t = C66581MXm.A0t(this.A01, this.A00);
        0qQ.A07(A0t);
        return A0t;
    }

    public final byte[] Baz() {
        NB3 nb3 = this.A01;
        byte[] blob = nb3.mResultSet.getBlob(this.A00, 4);
        0qQ.A07(blob);
        return blob;
    }

    public final byte[] C32(int i) {
        byte[] blob = this.A02.mResultSet.getBlob(i, 5);
        0qQ.A07(blob);
        return blob;
    }

    public final long C33(int i) {
        return this.A02.mResultSet.getLong(i, 4);
    }

    public final int C34() {
        return C66580MXl.A04(this.A02);
    }

    public final long C7a() {
        NB3 nb3 = this.A01;
        return nb3.mResultSet.getLong(this.A00, 3);
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.NB5, X.5z0] */
    public P0X(NB3 nb3, int i) {
        this.A01 = nb3;
        this.A00 = i;
        this.A02 = new C301345z0(nb3.mResultSet.getChildResultSet(i, 5));
    }
}
