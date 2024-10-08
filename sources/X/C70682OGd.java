package X;

import com.facebook.vesta.VestaClient;
import java.util.concurrent.Executor;

/* renamed from: X.OGd  reason: case insensitive filesystem */
public final class C70682OGd {
    public int A00 = 10;
    public boolean A01 = false;
    public boolean A02 = false;
    public final OOB A03;
    public final O5T A04;
    public final Integer A05;

    public C70682OGd(OOB oob, 1vo r6, Integer num, Executor executor) {
        this.A04 = new O5T(new C70681OGc(r6, executor, VestaClient.getApiVersionNative()));
        this.A03 = oob;
        this.A05 = num;
    }
}
