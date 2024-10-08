package X;

import java.util.concurrent.Callable;

/* renamed from: X.As8  reason: case insensitive filesystem */
public final class C41325As8 implements Callable {
    public final /* synthetic */ 2PC A00;
    public final /* synthetic */ Object A01;

    public C41325As8(2PC r1, Object obj) {
        this.A00 = r1;
        this.A01 = obj;
    }

    public final Object call() {
        0fh.A01("DirectSQLiteTable.asyncPostProcess", -320520058);
        try {
            2PC r2 = this.A00;
            return r2.A0D(r2.A00, this.A01);
        } finally {
            0fh.A00(1699433574);
        }
    }
}
