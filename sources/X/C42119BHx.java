package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.BHx  reason: case insensitive filesystem */
public final class C42119BHx extends AnonymousClass0T0 implements C46270DSz {
    public final String A00;
    public final String A01;

    public final C42119BHx FCo() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C42119BHx) {
                C42119BHx bHx = (C42119BHx) obj;
                if (!0qQ.A0K(this.A00, bHx.A00) || !0qQ.A0K(this.A01, bHx.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String BKV() {
        return this.A00;
    }

    public final String C9a() {
        return this.A01;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTTextStickerTranslationData", C44531CgR.A00(this));
    }

    public final int hashCode() {
        return (AnonymousClass7TG.A0E(this.A00) * 31) + C41845B3m.A00(this.A01);
    }

    public C42119BHx(String str, String str2) {
        this.A00 = str;
        this.A01 = str2;
    }
}
