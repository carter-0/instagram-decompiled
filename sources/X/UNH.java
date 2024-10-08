package X;

import com.facebook.pando.TreeUpdaterJNI;

public final class UNH extends AnonymousClass0T0 implements C275664qi {
    public final UNI A00;
    public final UNL A01;
    public final XAS A02;
    public final C21027XAg A03;
    public final Long A04;

    public final UNH F6c() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof UNH) {
                UNH unh = (UNH) obj;
                if (!0qQ.A0K(this.A02, unh.A02) || !0qQ.A0K(this.A00, unh.A00) || !0qQ.A0K(this.A01, unh.A01) || !0qQ.A0K(this.A03, unh.A03) || !0qQ.A0K(this.A04, unh.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final XAS BSl() {
        return this.A02;
    }

    public final /* bridge */ /* synthetic */ C21036XAp BSm() {
        return this.A00;
    }

    public final /* bridge */ /* synthetic */ C21025XAe BSn() {
        return this.A01;
    }

    public final C21027XAg BSp() {
        return this.A03;
    }

    public final Long BYa() {
        return this.A04;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTNativeInfoCard", C16831V7m.A00(this));
    }

    public final int hashCode() {
        return (((((((AnonymousClass7TG.A0C(this.A02) * 31) + AnonymousClass7TG.A0C(this.A00)) * 31) + AnonymousClass7TG.A0C(this.A01)) * 31) + AnonymousClass7TG.A0C(this.A03)) * 31) + AnonymousClass7TE.A0L(this.A04);
    }

    public UNH(UNI uni, UNL unl, XAS xas, C21027XAg xAg, Long l) {
        this.A02 = xas;
        this.A00 = uni;
        this.A01 = unl;
        this.A03 = xAg;
        this.A04 = l;
    }
}
