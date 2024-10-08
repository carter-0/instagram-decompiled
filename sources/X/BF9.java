package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import java.util.LinkedHashMap;

public final class BF9 extends AnonymousClass0T0 implements C46239DRu {
    public final String A00;

    public final BF9 F4p() {
        return this;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof BF9) && 0qQ.A0K(this.A00, ((BF9) obj).A00));
    }

    public final int hashCode() {
        return AnonymousClass7TG.A0E(this.A00);
    }

    public BF9(String str) {
        this.A00 = str;
    }

    public final TreeUpdaterJNI FHC() {
        LinkedHashMap A0t = C41845B3m.A0t();
        String str = this.A00;
        if (str != null) {
            A0t.put(DevServerEntity.COLUMN_DESCRIPTION, str);
        }
        return C41845B3m.A0T("XDTIGOffsiteLeadAdsProfileCardDict", 0Yt.A0B(A0t));
    }
}
