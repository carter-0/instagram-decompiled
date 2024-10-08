package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

/* renamed from: X.BHv  reason: case insensitive filesystem */
public final class C42117BHv extends AnonymousClass0T0 implements C46318DUv {
    public final Boolean A00;
    public final Boolean A01;
    public final Float A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final List A09;

    public final C42117BHv FCl() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C42117BHv) {
                C42117BHv bHv = (C42117BHv) obj;
                if (!0qQ.A0K(this.A03, bHv.A03) || !0qQ.A0K(this.A02, bHv.A02) || !0qQ.A0K(this.A04, bHv.A04) || !0qQ.A0K(this.A00, bHv.A00) || !0qQ.A0K(this.A01, bHv.A01) || !0qQ.A0K(this.A05, bHv.A05) || !0qQ.A0K(this.A06, bHv.A06) || !0qQ.A0K(this.A07, bHv.A07) || !0qQ.A0K(this.A08, bHv.A08) || !0qQ.A0K(this.A09, bHv.A09)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String B0s() {
        return this.A03;
    }

    public final Float B79() {
        return this.A02;
    }

    public final String C4s() {
        return this.A06;
    }

    public final String C5C() {
        return this.A08;
    }

    public final List C9Y() {
        return this.A09;
    }

    public final Boolean COk() {
        return this.A00;
    }

    public final Boolean CTq() {
        return this.A01;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTTextStickerTappableData", C44529CgP.A00(this));
    }

    public final String getId() {
        return this.A04;
    }

    public final String getText() {
        return this.A05;
    }

    public final String getTextColor() {
        return this.A07;
    }

    public final int hashCode() {
        return (((((((((((((((((AnonymousClass7TG.A0E(this.A03) * 31) + AnonymousClass7TG.A0C(this.A02)) * 31) + AnonymousClass7TG.A0E(this.A04)) * 31) + AnonymousClass7TG.A0C(this.A00)) * 31) + AnonymousClass7TG.A0C(this.A01)) * 31) + AnonymousClass7TG.A0E(this.A05)) * 31) + AnonymousClass7TG.A0E(this.A06)) * 31) + AnonymousClass7TG.A0E(this.A07)) * 31) + AnonymousClass7TG.A0E(this.A08)) * 31) + AnonymousClass7TE.A0L(this.A09);
    }

    public C42117BHv(Boolean bool, Boolean bool2, Float f, String str, String str2, String str3, String str4, String str5, String str6, List list) {
        this.A03 = str;
        this.A02 = f;
        this.A04 = str2;
        this.A00 = bool;
        this.A01 = bool2;
        this.A05 = str3;
        this.A06 = str4;
        this.A07 = str5;
        this.A08 = str6;
        this.A09 = list;
    }
}
