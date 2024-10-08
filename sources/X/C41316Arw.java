package X;

import java.util.concurrent.Callable;

/* renamed from: X.Arw  reason: case insensitive filesystem */
public final /* synthetic */ class C41316Arw implements Callable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C340777lo A01;

    public /* synthetic */ C41316Arw(C340777lo r1, int i) {
        this.A01 = r1;
        this.A00 = i;
    }

    public final Object call() {
        return Boolean.valueOf(this.A01.A09(this.A00));
    }
}
