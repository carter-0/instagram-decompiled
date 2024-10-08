package X;

import java.util.HashSet;

/* renamed from: X.3vV  reason: invalid class name and case insensitive filesystem */
public final class C256273vV implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ 1wH A01;
    public final /* synthetic */ 1aV A02;

    public C256273vV(1wH r1, 1aV r2, int i) {
        this.A01 = r1;
        this.A00 = i;
        this.A02 = r2;
    }

    public final void run() {
        Object orDefault;
        1wH r2 = this.A01;
        int i = this.A00;
        if (i == -1) {
            orDefault = new HashSet();
        } else {
            orDefault = r2.A04.getOrDefault(Integer.valueOf(i), new HashSet());
        }
        this.A02.accept(orDefault);
    }
}
