package X;

import java.util.Set;

/* renamed from: X.AmS  reason: case insensitive filesystem */
public final /* synthetic */ class C40982AmS implements Runnable {
    public final AnonymousClass96M A00;
    public final C3734495k A01;

    public C40982AmS(AnonymousClass96M r1, C3734495k r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public final void run() {
        Set set;
        Object obj;
        AnonymousClass96M r2 = this.A00;
        C3734495k r1 = this.A01;
        synchronized (r2) {
            if (r2.A00 == null) {
                set = r2.A01;
                obj = r1;
            } else {
                set = r2.A00;
                obj = r1.get();
            }
            set.add(obj);
        }
    }
}
