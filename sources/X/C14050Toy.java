package X;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.List;

/* renamed from: X.Toy  reason: case insensitive filesystem */
public final class C14050Toy extends C14072TpM {
    public final List A00 = new ArrayList(3);

    public final void A00(int i) {
        try {
            for (C14072TpM A002 : this.A00) {
                A002.A00(i);
            }
        } catch (ConcurrentModificationException e) {
            throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", e);
        }
    }

    public final void A01(int i) {
        try {
            for (C14072TpM A01 : this.A00) {
                A01.A01(i);
            }
        } catch (ConcurrentModificationException e) {
            throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", e);
        }
    }

    public final void A02(int i, float f, int i2) {
        try {
            for (C14072TpM A02 : this.A00) {
                A02.A02(i, f, i2);
            }
        } catch (ConcurrentModificationException e) {
            throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", e);
        }
    }
}
