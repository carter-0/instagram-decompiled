package X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Vh8  reason: case insensitive filesystem */
public final class C17855Vh8 {
    public C17523VZc A00 = null;
    public String A01 = null;
    public final List A02;
    public final List A03;

    public C17855Vh8() {
        0sl r2 = 0sl.A00;
        0sn r1 = 0sn.A00;
        this.A02 = new ArrayList(r2);
        this.A03 = new ArrayList(r1);
    }

    public final ArrayList A00(C18062Vko vko) {
        ArrayList A0q = AnonymousClass7TF.A0q(vko, 0);
        Iterator it = this.A02.iterator();
        while (it.hasNext()) {
            A0q.add(vko.A00(AnonymousClass7TE.A18(it)));
        }
        Collections.sort(A0q);
        return A0q;
    }
}
