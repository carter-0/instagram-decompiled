package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

public final class UNI extends AnonymousClass0T0 implements C21036XAp {
    public final C21024XAd A00;
    public final C21032XAl A01;
    public final XAX A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final List A06;

    public final UNI F6f() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof UNI) {
                UNI uni = (UNI) obj;
                if (!0qQ.A0K(this.A00, uni.A00) || !0qQ.A0K(this.A03, uni.A03) || !0qQ.A0K(this.A06, uni.A06) || !0qQ.A0K(this.A04, uni.A04) || !0qQ.A0K(this.A05, uni.A05) || !0qQ.A0K(this.A02, uni.A02) || !0qQ.A0K(this.A01, uni.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final C21024XAd Aeh() {
        return this.A00;
    }

    public final List BSk() {
        return this.A06;
    }

    public final String BsT() {
        return this.A04;
    }

    public final XAX C6r() {
        return this.A02;
    }

    public final C21032XAl C7f() {
        return this.A01;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTNativeInfoCardMetadataPayloadV1", C16832V7n.A00(this));
    }

    public final String getDescription() {
        return this.A03;
    }

    public final String getTextColor() {
        return this.A05;
    }

    public final int hashCode() {
        return (((((((((((AnonymousClass7TG.A0C(this.A00) * 31) + AnonymousClass7TG.A0E(this.A03)) * 31) + AnonymousClass7TG.A0C(this.A06)) * 31) + AnonymousClass7TG.A0E(this.A04)) * 31) + AnonymousClass7TG.A0E(this.A05)) * 31) + AnonymousClass7TG.A0C(this.A02)) * 31) + AnonymousClass7TE.A0L(this.A01);
    }

    public UNI(C21024XAd xAd, C21032XAl xAl, XAX xax, String str, String str2, String str3, List list) {
        this.A00 = xAd;
        this.A03 = str;
        this.A06 = list;
        this.A04 = str2;
        this.A05 = str3;
        this.A02 = xax;
        this.A01 = xAl;
    }
}
