package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;

public final class BG7 extends AnonymousClass0T0 implements C46259DSo {
    public final String A00;
    public final String A01;

    public final BG7 F8N() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BG7) {
                BG7 bg7 = (BG7) obj;
                if (!0qQ.A0K(this.A00, bg7.A00) || !0qQ.A0K(this.A01, bg7.A01)) {
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
        if (getTitle() != null) {
            C41845B3m.A12(getTitle(), A1H);
        }
        if (getUrl() != null) {
            C41845B3m.A0y(getUrl(), A1H);
        }
        return C41845B3m.A0T("XDTQPActionData", 0Yt.A0B(A1H));
    }

    public final String getTitle() {
        return this.A00;
    }

    public final String getUrl() {
        return this.A01;
    }

    public final int hashCode() {
        return (AnonymousClass7TG.A0E(this.A00) * 31) + C41845B3m.A00(this.A01);
    }

    public BG7(String str, String str2) {
        this.A00 = str;
        this.A01 = str2;
    }
}
