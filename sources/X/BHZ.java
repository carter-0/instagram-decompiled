package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;

public final class BHZ extends AnonymousClass0T0 implements DSA {
    public final String A00;

    public final BHZ FBw() {
        return this;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof BHZ) && 0qQ.A0K(this.A00, ((BHZ) obj).A00));
    }

    public final int hashCode() {
        return AnonymousClass7TG.A0E(this.A00);
    }

    public BHZ(String str) {
        this.A00 = str;
    }

    public final TreeUpdaterJNI FHC() {
        LinkedHashMap A0t = C41845B3m.A0t();
        String str = this.A00;
        if (str != null) {
            C41845B3m.A0x(str, A0t);
        }
        return C41845B3m.A0T("XDTStoryVotingInfoCenterStickerTappableData", 0Yt.A0B(A0t));
    }
}
