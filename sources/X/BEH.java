package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;

public final class BEH extends AnonymousClass0T0 implements DSW {
    public final int A00;
    public final long A01;

    public final BEH F1k() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BEH) {
                BEH beh = (BEH) obj;
                if (!(this.A01 == beh.A01 && this.A00 == beh.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        getEffectId();
        A1H.put("effect_id", Long.valueOf(getEffectId()));
        getSegmentIndex();
        return C41845B3m.A0T("XDTClipsTemplateSegmentEffectInfo", C41845B3m.A0u("segment_index", Integer.valueOf(getSegmentIndex()), A1H));
    }

    public final long getEffectId() {
        return this.A01;
    }

    public final int getSegmentIndex() {
        return this.A00;
    }

    public final int hashCode() {
        long j = this.A01;
        return (((int) (j ^ (j >>> 32))) * 31) + this.A00;
    }

    public BEH(long j, int i) {
        this.A01 = j;
        this.A00 = i;
    }
}
