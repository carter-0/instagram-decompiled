package X;

import java.util.List;
import java.util.concurrent.Executor;

public final class S3A {
    public Executor A00;
    public Executor A01;
    public String A02;
    public final List A03 = Pxf.A0v();
    public final List A04 = Pxf.A0v();
    public final List A05 = Pxf.A0v();
    public final List A06 = Pxf.A0v();
    public final List A07 = Pxf.A0v();

    public final synchronized void A00(String str) {
        if (!AnonymousClass5He.A00(str)) {
            String str2 = this.A02;
            if (str2 == null || !str2.equals(str)) {
                this.A02 = str;
                this.A00.execute(new TB2(this));
            }
        }
    }

    public S3A(Executor executor, Executor executor2) {
        this.A00 = executor;
        this.A01 = executor2;
    }
}
