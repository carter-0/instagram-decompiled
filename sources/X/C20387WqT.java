package X;

import com.facebook.react.common.mapbuffer.WritableMapBuffer;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: X.WqT  reason: case insensitive filesystem */
public final class C20387WqT implements Iterator, C62650uo {
    public int A00;
    public final int A01 = 1;
    public final Object A02;

    public C20387WqT(C20423Wr8 wr8) {
        this.A00 = wr8.A00;
        this.A02 = wr8.A01.iterator();
    }

    public final boolean hasNext() {
        if (this.A01 == 0) {
            int i = this.A00;
            WritableMapBuffer writableMapBuffer = WritableMapBuffer.$redex_init_class;
            if (i < ((WritableMapBuffer) this.A02).A00.size()) {
                return true;
            }
            return false;
        } else if (this.A00 <= 0 || !((Iterator) this.A02).hasNext()) {
            return false;
        } else {
            return true;
        }
    }

    public final /* bridge */ /* synthetic */ Object next() {
        if (this.A01 != 0) {
            int i = this.A00;
            if (i != 0) {
                this.A00 = i - 1;
                return ((Iterator) this.A02).next();
            }
            throw new NoSuchElementException();
        }
        int i2 = this.A00;
        this.A00 = i2 + 1;
        return new C19060WIm((WritableMapBuffer) this.A02, i2);
    }

    public final void remove() {
        int i = this.A01;
        throw Pxh.A0s();
    }

    public C20387WqT(WritableMapBuffer writableMapBuffer) {
        this.A02 = writableMapBuffer;
    }
}
