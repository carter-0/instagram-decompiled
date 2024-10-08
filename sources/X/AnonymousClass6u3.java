package X;

import java.util.Set;

/* renamed from: X.6u3  reason: invalid class name */
public final class AnonymousClass6u3 implements Runnable {
    public final /* synthetic */ float A00;
    public final /* synthetic */ C331897Sw A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;

    public AnonymousClass6u3(C331897Sw r1, String str, String str2, float f) {
        this.A01 = r1;
        this.A02 = str;
        this.A03 = str2;
        this.A00 = f;
    }

    public final void run() {
        C331897Sw r1 = this.A01;
        C331897Sw r0 = C331897Sw.A0A;
        Set<C320986tO> set = (Set) r1.A05.get(this.A02);
        if (set != null) {
            String str = this.A03;
            float f = this.A00;
            for (C320986tO DaG : set) {
                DaG.DaG(str, f);
            }
        }
    }
}
