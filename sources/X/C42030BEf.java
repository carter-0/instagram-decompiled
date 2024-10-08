package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: X.BEf  reason: case insensitive filesystem */
public final class C42030BEf extends AnonymousClass0T0 implements C46236DRr {
    public final List A00;

    public final C42030BEf F2o() {
        return this;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C42030BEf) && 0qQ.A0K(this.A00, ((C42030BEf) obj).A00));
    }

    public final int hashCode() {
        return AnonymousClass7TG.A0C(this.A00);
    }

    public C42030BEf(List list) {
        this.A00 = list;
    }

    public final TreeUpdaterJNI FHC() {
        LinkedHashMap A0t = C41845B3m.A0t();
        List list = this.A00;
        if (list != null) {
            A0t.put("grid_media_ids", list);
        }
        return C41845B3m.A0T("XDTExploreShareableGridTappableData", 0Yt.A0B(A0t));
    }
}
