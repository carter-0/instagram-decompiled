package X;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.0f8  reason: invalid class name */
public final class AnonymousClass0f8 {
    public static final File A03 = null;
    public boolean A00;
    public final Object A01 = new Object[0];
    public final List A02 = new ArrayList();

    public final void A00() {
        synchronized (this.A01) {
            this.A00 = true;
            int i = 0;
            while (true) {
                List list = this.A02;
                if (i < list.size()) {
                    ((AnonymousClass0f6) list.get(i)).Dsp();
                    i++;
                }
            }
        }
    }
}
