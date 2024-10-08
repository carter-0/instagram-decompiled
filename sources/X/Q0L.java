package X;

import com.instagram.location.impl.LocationPluginImpl;
import java.util.Iterator;
import java.util.Map;

public final class Q0L extends 0ng {
    public final /* synthetic */ LocationPluginImpl A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Q0L(LocationPluginImpl locationPluginImpl) {
        super(148, 4, false, false);
        this.A00 = locationPluginImpl;
    }

    public final void run() {
        LocationPluginImpl locationPluginImpl = this.A00;
        synchronized (locationPluginImpl.A02) {
            try {
                Map map = locationPluginImpl.A03;
                Iterator A0v = AnonymousClass7TF.A0v(map);
                while (A0v.hasNext()) {
                    ((AnonymousClass60p) A0v.next()).A06();
                }
                map.clear();
            } catch (Exception e) {
                0KC.A0F("LocationPluginImpl", "Failed to stop locations on app background", e);
            } catch (Throwable th) {
                LocationPluginImpl.A06(locationPluginImpl);
                throw th;
            }
            LocationPluginImpl.A06(locationPluginImpl);
        }
    }
}
