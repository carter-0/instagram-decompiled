package X;

import com.facebook.vesta.VestaClient;
import java.util.concurrent.Executor;

/* renamed from: X.OFm  reason: case insensitive filesystem */
public final class C70665OFm {
    public int A00 = 10;
    public boolean A01 = false;
    public boolean A02 = false;
    public final OOB A03;
    public final C70639OEl A04;

    public C70665OFm(OOB oob, 1vo r6, Integer num, Executor executor) {
        this.A04 = new C70639OEl(new C70680OGb(r6, executor, VestaClient.getApiVersionNative()), num);
        this.A03 = oob;
    }
}
