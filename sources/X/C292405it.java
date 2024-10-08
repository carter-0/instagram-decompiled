package X;

import com.instagram.location.impl.LocationPluginImpl;
import java.util.Map;

/* renamed from: X.5it  reason: invalid class name and case insensitive filesystem */
public final class C292405it extends 0ng {
    public final /* synthetic */ C296485q8 A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C292405it(C296485q8 r2) {
        super(280);
        this.A00 = r2;
    }

    public final void run() {
        C296485q8 r5 = this.A00;
        LocationPluginImpl locationPluginImpl = r5.A01;
        synchronized (locationPluginImpl.A02) {
            C267874cM r2 = (C267874cM) r5.A02.get();
            if (r2 != null) {
                Map map = locationPluginImpl.A03;
                if (map.containsKey(r2)) {
                    r5.A00.A06();
                    map.remove(r2);
                    LocationPluginImpl.A06(locationPluginImpl);
                }
            }
        }
    }
}
