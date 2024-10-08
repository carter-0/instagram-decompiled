package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.ClipChainType;

public final class BE4 extends AnonymousClass0T0 implements DTA {
    public final int A00;
    public final ClipChainType A01;
    public final String A02;

    public final BE4 F1O() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BE4) {
                BE4 be4 = (BE4) obj;
                if (!(this.A00 == be4.A00 && this.A01 == be4.A01 && 0qQ.A0K(this.A02, be4.A02))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int Anm() {
        return this.A00;
    }

    public final ClipChainType Ans() {
        return this.A01;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTClipChainMetadataDict", CVV.A00(this));
    }

    public final String getTitle() {
        return this.A02;
    }

    public final int hashCode() {
        return C41845B3m.A01(this.A02, AnonymousClass7TF.A07(this.A01, this.A00 * 31));
    }

    public BE4(ClipChainType clipChainType, String str, int i) {
        AnonymousClass7TG.A1Q(clipChainType, str);
        this.A00 = i;
        this.A01 = clipChainType;
        this.A02 = str;
    }
}
