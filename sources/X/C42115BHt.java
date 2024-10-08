package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.BHt  reason: case insensitive filesystem */
public final class C42115BHt extends AnonymousClass0T0 implements DTU {
    public final String A00;
    public final String A01;
    public final String A02;

    public final C42115BHt FCi() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C42115BHt) {
                C42115BHt bHt = (C42115BHt) obj;
                if (!0qQ.A0K(this.A00, bHt.A00) || !0qQ.A0K(this.A01, bHt.A01) || !0qQ.A0K(this.A02, bHt.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String AdC() {
        return this.A02;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTTextPostShareToIgStoryStickerDict", C44526CgM.A00(this));
    }

    public final String getAttributionAppId() {
        return this.A00;
    }

    public final String getAttributionAppName() {
        return this.A01;
    }

    public final int hashCode() {
        return (((AnonymousClass7TG.A0E(this.A00) * 31) + AnonymousClass7TG.A0E(this.A01)) * 31) + C41845B3m.A00(this.A02);
    }

    public C42115BHt(String str, String str2, String str3) {
        this.A00 = str;
        this.A01 = str2;
        this.A02 = str3;
    }
}
