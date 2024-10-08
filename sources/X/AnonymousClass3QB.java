package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: X.3QB  reason: invalid class name */
public final class AnonymousClass3QB {
    public AnonymousClass3QC A00 = new Object();
    public boolean A01;
    public final AnonymousClass3Q2 A02;
    public final Object A03 = new Object();
    public final Set A04 = new LinkedHashSet();
    public volatile boolean A05;

    public final void A00() {
        Set set;
        Object obj = this.A03;
        synchronized (obj) {
            set = obj;
            if (!this.A01) {
            }
        }
        Set set2 = this.A04;
        synchronized (set2) {
            Iterator it = new ArrayList(set2).iterator();
            while (it.hasNext()) {
                ((AnonymousClass2sT) it.next()).DaJ(this.A02);
            }
            set = set2;
        }
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [X.3QC, java.lang.Object] */
    public AnonymousClass3QB(AnonymousClass3Q2 r2) {
        this.A02 = r2;
    }
}
