package X;

import java.lang.ref.WeakReference;

public final class VV6 {
    public int A00;
    public boolean A01;
    public final WeakReference A02;

    public VV6(X1C x1c, int i) {
        this.A02 = new WeakReference(x1c);
        this.A00 = i;
    }
}
