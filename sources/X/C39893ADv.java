package X;

import com.facebook.odin.prediction.litennmodelparams.DynamicNNModelParams;
import java.io.File;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: X.ADv  reason: case insensitive filesystem */
public final class C39893ADv {
    public DynamicNNModelParams A00;
    public final C258743zZ A01;
    public final ReentrantLock A02 = new ReentrantLock();
    public final C9266RVr A03;

    public C39893ADv(C258743zZ r2, C9266RVr rVr) {
        0qQ.A0B(r2, 1);
        this.A01 = r2;
        this.A03 = rVr;
    }

    public final void A02(DynamicNNModelParams dynamicNNModelParams) {
        0qQ.A0B(dynamicNNModelParams, 0);
        ReentrantLock reentrantLock = this.A02;
        reentrantLock.lock();
        try {
            File A002 = A00(this);
            C250873mC r1 = C250863mB.A03;
            C255463uA[] r0 = DynamicNNModelParams.A08;
            C272134kB.A01(A002, r1.A02(dynamicNNModelParams, C20502Wsi.A00), AnonymousClass15Q.A05);
        } finally {
            reentrantLock.unlock();
        }
    }

    public final AnonymousClass40G A01() {
        AnonymousClass40G r4;
        ReentrantLock reentrantLock = this.A02;
        reentrantLock.lock();
        try {
            DynamicNNModelParams dynamicNNModelParams = this.A00;
            if (dynamicNNModelParams != null) {
                r4 = new AnonymousClass40G(dynamicNNModelParams, (String) null, true);
            } else {
                File A002 = A00(this);
                if (!A002.exists() || !A002.canRead()) {
                    r4 = new AnonymousClass40G((Object) null, (String) null, false);
                } else {
                    String A003 = C272134kB.A00(A002, AnonymousClass15Q.A05);
                    C250873mC r1 = C250863mB.A03;
                    C255463uA[] r0 = DynamicNNModelParams.A08;
                    DynamicNNModelParams dynamicNNModelParams2 = (DynamicNNModelParams) r1.A00(A003, C360578eo.A00(C20502Wsi.A00));
                    this.A00 = dynamicNNModelParams2;
                    r4 = new AnonymousClass40G(dynamicNNModelParams2, (String) null, true);
                }
            }
            return r4;
        } finally {
            reentrantLock.unlock();
        }
    }

    public static final File A00(C39893ADv aDv) {
        return new File(AnonymousClass1F2.A00().AXT((1LJ) null, 341716450), 002.A0R(aDv.A01.CCQ(), "_weights.json"));
    }
}
