package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import java.util.Map;

public final class UL7 extends AnonymousClass0T0 {
    public static final UL7 A01 = new UL7(AnonymousClass7TF.A0w(NetInfoModule.CONNECTION_TYPE_WIFI, 0Yt.A0E()));
    public final Map A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof UL7) && 0qQ.A0K(this.A00, ((UL7) obj).A00));
    }

    public final int hashCode() {
        return AnonymousClass7TG.A0C(this.A00);
    }

    public UL7(Map map) {
        this.A00 = map;
    }
}
