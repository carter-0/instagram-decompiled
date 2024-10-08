package X;

import java.util.Iterator;

public abstract class TAS implements Iterable, C62650uo {
    public final char A00;
    public final char A01;
    public final int A02 = 1;

    public TAS(char c, char c2) {
        this.A00 = c;
        this.A01 = (char) C70002Hb.A00(c, c2, 1);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.TSs, java.util.Iterator] */
    public final /* bridge */ /* synthetic */ Iterator iterator() {
        return new C13277TSs(this.A00, this.A01);
    }
}
