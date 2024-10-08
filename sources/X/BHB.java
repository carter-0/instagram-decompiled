package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;

public final class BHB extends AnonymousClass0T0 implements C46262DSr {
    public final String A00;
    public final String A01;

    public final BHB FAz() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BHB) {
                BHB bhb = (BHB) obj;
                if (!0qQ.A0K(this.A00, bhb.A00) || !0qQ.A0K(this.A01, bhb.A01)) {
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
        if (getId() != null) {
            C41845B3m.A0x(getId(), A1H);
        }
        if (getText() != null) {
            C41845B3m.A10(getText(), A1H);
        }
        return C41845B3m.A0T("XDTStoryQuickCaptionDict", 0Yt.A0B(A1H));
    }

    public final String getId() {
        return this.A00;
    }

    public final String getText() {
        return this.A01;
    }

    public final int hashCode() {
        return (AnonymousClass7TG.A0E(this.A00) * 31) + C41845B3m.A00(this.A01);
    }

    public BHB(String str, String str2) {
        this.A00 = str;
        this.A01 = str2;
    }
}
