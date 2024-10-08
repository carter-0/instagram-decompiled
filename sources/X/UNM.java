package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.NativeInfoCardTextAlignment;

public final class UNM extends AnonymousClass0T0 implements C21031XAk {
    public final NativeInfoCardTextAlignment A00;
    public final Float A01;
    public final Integer A02;
    public final String A03;
    public final String A04;

    public final UNM F6j() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof UNM) {
                UNM unm = (UNM) obj;
                if (this.A00 != unm.A00 || !0qQ.A0K(this.A01, unm.A01) || !0qQ.A0K(this.A02, unm.A02) || !0qQ.A0K(this.A03, unm.A03) || !0qQ.A0K(this.A04, unm.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final NativeInfoCardTextAlignment Aaj() {
        return this.A00;
    }

    public final Float B79() {
        return this.A01;
    }

    public final Integer BPG() {
        return this.A02;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTNativeInfoCardStyledText", C16840V7v.A00(this));
    }

    public final String getText() {
        return this.A03;
    }

    public final String getTextColor() {
        return this.A04;
    }

    public final int hashCode() {
        return (((((((AnonymousClass7TG.A0C(this.A00) * 31) + AnonymousClass7TG.A0C(this.A01)) * 31) + AnonymousClass7TG.A0C(this.A02)) * 31) + AnonymousClass7TG.A0E(this.A03)) * 31) + C41845B3m.A00(this.A04);
    }

    public UNM(NativeInfoCardTextAlignment nativeInfoCardTextAlignment, Float f, Integer num, String str, String str2) {
        this.A00 = nativeInfoCardTextAlignment;
        this.A01 = f;
        this.A02 = num;
        this.A03 = str;
        this.A04 = str2;
    }
}
