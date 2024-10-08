package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;

public final class BHH extends AnonymousClass0T0 implements DS8 {
    public final String A00;

    public final BHH FBE() {
        return this;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof BHH) && 0qQ.A0K(this.A00, ((BHH) obj).A00));
    }

    public final int hashCode() {
        return AnonymousClass7TG.A0E(this.A00);
    }

    public BHH(String str) {
        this.A00 = str;
    }

    public final TreeUpdaterJNI FHC() {
        LinkedHashMap A0t = C41845B3m.A0t();
        String str = this.A00;
        if (str != null) {
            C41845B3m.A0x(str, A0t);
        }
        return C41845B3m.A0T("XDTStorySellerCollectionStickerTappableData", 0Yt.A0B(A0t));
    }
}
