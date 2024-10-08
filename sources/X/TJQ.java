package X;

import java.util.Set;

public final class TJQ implements Runnable {
    public final int A00;
    public final AnonymousClass39K A01;
    public final C2805352f A02;
    public final boolean A03;

    public final void run() {
        C282905Ff r0;
        boolean z = this.A03;
        AnonymousClass39K r5 = this.A01;
        C2805352f r4 = this.A02;
        int i = this.A00;
        String str = r4.A00.A01;
        synchronized (r5.A09) {
            if (z) {
                r0 = AnonymousClass39K.A00(r5, str);
            } else if (r5.A05.get(str) != null) {
                AnonymousClass389.A00();
            } else {
                Set set = (Set) r5.A06.get(str);
                if (set != null && set.contains(r4)) {
                    r0 = AnonymousClass39K.A00(r5, str);
                }
            }
            AnonymousClass39K.A01(r0, i);
        }
        AnonymousClass389.A00();
        AnonymousClass389.A01("StopWorkRunnable");
    }

    public TJQ(AnonymousClass39K r1, C2805352f r2, int i, boolean z) {
        this.A01 = r1;
        this.A02 = r2;
        this.A03 = z;
        this.A00 = i;
    }
}
