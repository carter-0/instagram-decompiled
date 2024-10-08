package X;

import java.util.Set;

/* renamed from: X.IiB  reason: case insensitive filesystem */
public final class C57894IiB implements Runnable {
    public final /* synthetic */ AnonymousClass6LO A00;
    public final /* synthetic */ AnonymousClass59O A01;
    public final /* synthetic */ Set A02;

    public C57894IiB(AnonymousClass6LO r1, AnonymousClass59O r2, Set set) {
        this.A02 = set;
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void run() {
        for (AnonymousClass6L7 AUx : this.A02) {
            try {
                this.A01.AUx(this.A00, AUx, (String) null, false);
            } catch (C242623Vf unused) {
            }
        }
    }
}
