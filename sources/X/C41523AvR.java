package X;

import java.security.GeneralSecurityException;
import javax.crypto.Mac;

/* renamed from: X.AvR  reason: case insensitive filesystem */
public final class C41523AvR extends ThreadLocal {
    public final /* synthetic */ C40233AWx A00;

    public C41523AvR(C40233AWx aWx) {
        this.A00 = aWx;
    }

    public final /* bridge */ /* synthetic */ Object initialValue() {
        try {
            AnonymousClass9DU r3 = AnonymousClass9DU.A05;
            C40233AWx aWx = this.A00;
            C3739197l r0 = C40233AWx.A04;
            Mac mac = (Mac) r3.A00.BHw(aWx.A00);
            mac.init(aWx.A01);
            return mac;
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException(e);
        }
    }
}
