package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.user.model.ProductDetailsProductItemDict;
import com.instagram.user.model.ProductDetailsProductItemDictIntf;
import java.util.List;

/* renamed from: X.BIe  reason: case insensitive filesystem */
public final class C42126BIe extends AnonymousClass0T0 implements C46304DUh {
    public final C61222JzF A00;
    public final ProductDetailsProductItemDict A01;
    public final Long A02;
    public final String A03;
    public final String A04;
    public final List A05;

    public C42126BIe(C61222JzF jzF, ProductDetailsProductItemDict productDetailsProductItemDict, Long l, String str, String str2, List list) {
        AnonymousClass7TF.A1D(jzF, 3, productDetailsProductItemDict);
        this.A02 = l;
        this.A03 = str;
        this.A00 = jzF;
        this.A01 = productDetailsProductItemDict;
        this.A04 = str2;
        this.A05 = list;
    }

    public final C42126BIe FEy(1E9 r1) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C42126BIe) {
                C42126BIe bIe = (C42126BIe) obj;
                if (!0qQ.A0K(this.A02, bIe.A02) || !0qQ.A0K(this.A03, bIe.A03) || !0qQ.A0K(this.A00, bIe.A00) || !0qQ.A0K(this.A01, bIe.A01) || !0qQ.A0K(this.A04, bIe.A04) || !0qQ.A0K(this.A05, bIe.A05)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final Long AZ3() {
        return this.A02;
    }

    public final String Ali() {
        return this.A03;
    }

    public final /* bridge */ /* synthetic */ C66565MWt At9() {
        return this.A00;
    }

    public final /* bridge */ /* synthetic */ ProductDetailsProductItemDictIntf BSv() {
        return this.A01;
    }

    public final String Bg4() {
        return this.A04;
    }

    public final List Btj() {
        return this.A05;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTShoppingNetegoInStoryProductSuggestion", C44896Cmm.A00(this));
    }

    public final int hashCode() {
        return ((AnonymousClass7TF.A07(this.A01, AnonymousClass7TF.A07(this.A00, ((AnonymousClass7TG.A0C(this.A02) * 31) + AnonymousClass7TG.A0E(this.A03)) * 31)) + AnonymousClass7TG.A0E(this.A04)) * 31) + AnonymousClass7TE.A0L(this.A05);
    }

    public final C46304DUh E9z(1E9 r1) {
        return this;
    }
}
