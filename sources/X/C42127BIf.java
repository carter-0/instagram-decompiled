package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.BIf  reason: case insensitive filesystem */
public final class C42127BIf extends AnonymousClass0T0 implements DUX {
    public final C61222JzF A00;
    public final User A01;
    public final Long A02;
    public final String A03;
    public final List A04;

    public final C42127BIf FEz(1E9 r1) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C42127BIf) {
                C42127BIf bIf = (C42127BIf) obj;
                if (!0qQ.A0K(this.A02, bIf.A02) || !0qQ.A0K(this.A00, bIf.A00) || !0qQ.A0K(this.A01, bIf.A01) || !0qQ.A0K(this.A03, bIf.A03) || !0qQ.A0K(this.A04, bIf.A04)) {
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

    public final /* bridge */ /* synthetic */ C66565MWt At9() {
        return this.A00;
    }

    public final User BRo() {
        return this.A01;
    }

    public final String BRq() {
        return this.A03;
    }

    public final List BgG() {
        return this.A04;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTShoppingNetegoInStoryShopSuggestion", C44898Cmo.A00(this));
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A04, AnonymousClass7TF.A08(this.A03, AnonymousClass7TF.A07(this.A01, AnonymousClass7TF.A07(this.A00, AnonymousClass7TG.A0C(this.A02) * 31))));
    }

    public C42127BIf(C61222JzF jzF, User user, Long l, String str, List list) {
        AnonymousClass7TG.A1Q(jzF, user);
        AnonymousClass7TG.A1R(str, list);
        this.A02 = l;
        this.A00 = jzF;
        this.A01 = user;
        this.A03 = str;
        this.A04 = list;
    }

    public final DUX EA0(1E9 r1) {
        return this;
    }
}
