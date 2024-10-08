package X;

import com.facebook.pando.TreeUpdaterJNI;

public final class BG8 extends AnonymousClass0T0 implements DTO {
    public final String A00;
    public final String A01;
    public final String A02;

    public final BG8 F8P() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BG8) {
                BG8 bg8 = (BG8) obj;
                if (!0qQ.A0K(this.A00, bg8.A00) || !0qQ.A0K(this.A01, bg8.A01) || !0qQ.A0K(this.A02, bg8.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String Bno() {
        return this.A01;
    }

    public final String Bnp() {
        return this.A02;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTQuestionStickerResponseReplyObject", C44295Ccd.A00(this));
    }

    public final String getOriginalMediaId() {
        return this.A00;
    }

    public final int hashCode() {
        return (((AnonymousClass7TG.A0E(this.A00) * 31) + AnonymousClass7TG.A0E(this.A01)) * 31) + C41845B3m.A00(this.A02);
    }

    public BG8(String str, String str2, String str3) {
        this.A00 = str;
        this.A01 = str2;
        this.A02 = str3;
    }
}
