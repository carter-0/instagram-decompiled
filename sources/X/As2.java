package X;

import java.util.concurrent.Callable;

public final class As2 implements Callable {
    public final /* synthetic */ C311976dc A00;
    public final /* synthetic */ C39679A4v A01;

    public As2(C311976dc r1, C39679A4v a4v) {
        this.A00 = r1;
        this.A01 = a4v;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        C311976dc r0 = this.A00;
        C251983oI r2 = r0.A07;
        r2.beginTransaction();
        try {
            int A002 = r0.A03.A00(this.A01);
            r2.setTransactionSuccessful();
            return Integer.valueOf(A002);
        } finally {
            r2.endTransaction();
        }
    }
}
