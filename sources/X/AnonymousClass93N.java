package X;

import java.util.Set;

/* renamed from: X.93N  reason: invalid class name */
public final class AnonymousClass93N implements Runnable {
    public final /* synthetic */ AnonymousClass2fL A00;
    public final /* synthetic */ Set A01;
    public final /* synthetic */ Set A02;

    public AnonymousClass93N(AnonymousClass2fL r1, Set set, Set set2) {
        this.A00 = r1;
        this.A02 = set;
        this.A01 = set2;
    }

    public final void run() {
        for (Object remove : this.A02) {
            this.A00.A02.remove(remove);
        }
        AnonymousClass2fL r2 = this.A00;
        Set set = r2.A01.A02;
        Set set2 = this.A01;
        set.removeAll(set2);
        r2.A03.addAll(set2);
    }
}
