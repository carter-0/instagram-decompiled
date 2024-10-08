package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.5Hn  reason: invalid class name and case insensitive filesystem */
public final class C283405Hn extends AnonymousClass0T0 implements AnonymousClass6LH {
    public final String A00;
    public final boolean A01;

    public C283405Hn(String str, boolean z) {
        0qQ.A0B(str, 1);
        this.A00 = str;
        this.A01 = z;
    }

    public final C283405Hn FGT() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C283405Hn) {
                C283405Hn r5 = (C283405Hn) obj;
                if (!0qQ.A0K(this.A00, r5.A00) || this.A01 != r5.A01) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final boolean CF3() {
        return this.A01;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTStoryReactionStickerTappableData", C45000Cod.A00(this));
    }

    public final String getEmoji() {
        return this.A00;
    }

    public final int hashCode() {
        int hashCode = this.A00.hashCode() * 31;
        int i = 1237;
        if (this.A01) {
            i = 1231;
        }
        return hashCode + i;
    }
}
