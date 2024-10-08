package X;

import android.content.Context;
import java.util.Iterator;
import java.util.NoSuchElementException;

@Deprecated
/* renamed from: X.TMf  reason: case insensitive filesystem */
public final class C13121TMf implements Iterator, Iterable {
    public int A00 = -1;
    public int A01 = 0;
    public final Context A02;
    public final Object A03 = Pxe.A0p();
    public final int[] A04;

    public final Iterator iterator() {
        this.A00 = 0;
        return this;
    }

    public final boolean hasNext() {
        return AnonymousClass7TF.A1T(this.A01, 0);
    }

    public final Object next() {
        int i = this.A01;
        int[] iArr = this.A04;
        if (i != 0) {
            this.A01 = i + 1;
            this.A00 = iArr[i];
            return this;
        }
        throw new NoSuchElementException("There were no registered Plugins for this Socket/PluginList combination.");
    }

    public C13121TMf(Context context) {
        this.A02 = context;
        this.A04 = new int[0];
    }

    public final void remove() {
        throw C66580MXl.A11();
    }
}
