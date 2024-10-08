package X;

import com.instagram.location.impl.LocationPluginImpl;
import com.instagram.location.impl.LocationSignalPackageImpl;
import java.util.Map;

public final class LcO implements 2IR {
    public final /* synthetic */ LocationPluginImpl A00;
    public final /* synthetic */ MSX A01;

    public LcO(LocationPluginImpl locationPluginImpl, MSX msx) {
        this.A00 = locationPluginImpl;
        this.A01 = msx;
    }

    public final void onFailure(Throwable th) {
        Map map = this.A00.A04;
        MSX msx = this.A01;
        if (map.containsKey(msx)) {
            map.remove(msx);
        }
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        SG0 sg0 = (SG0) obj;
        Map map = this.A00.A04;
        MSX msx = this.A01;
        if (map.containsKey(msx)) {
            try {
                msx.DOn(new LocationSignalPackageImpl(sg0));
            } finally {
                map.remove(msx);
            }
        }
    }
}
