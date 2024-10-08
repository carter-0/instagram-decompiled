package X;

import com.facebook.cameracore.mediapipeline.arengineservices.modules.DynamicServiceModule;
import java.util.AbstractCollection;

public final class ASP implements C3502583y {
    public final 1US A00;

    public final synchronized void CgN(AnonymousClass83x r3) {
        try {
            r3.onSuccess(C392599v4.A00(this.A00));
        } catch (RuntimeException e) {
            r3.DEf(false, e);
        }
        return;
    }

    public static void A00(B2O b2o, 0Gb r3, 1US r4, AbstractCollection abstractCollection) {
        abstractCollection.add(new DynamicServiceModule(b2o, new ASP(r4), r3));
    }

    public final AnonymousClass84T ASc() {
        return C392599v4.A00(this.A00);
    }

    public ASP(1US r1) {
        this.A00 = r1;
    }
}
