package X;

import java.util.concurrent.Callable;

/* renamed from: X.2l2  reason: invalid class name */
public final class AnonymousClass2l2 implements Callable {
    public final /* synthetic */ 1Mn A00;
    public final /* synthetic */ String A01;

    public AnonymousClass2l2(1Mn r1, String str) {
        this.A00 = r1;
        this.A01 = str;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        1Mn r1 = this.A00;
        boolean z = 1Mn.A08;
        boolean z2 = false;
        if (r1.A03.A00(this.A01) != null) {
            z2 = true;
        }
        return Boolean.valueOf(z2);
    }
}
