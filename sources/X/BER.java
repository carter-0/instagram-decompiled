package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.ContextualLinkCtaType;
import java.util.List;

public final class BER extends AnonymousClass0T0 implements C46306DUj {
    public final ContextualLinkCtaType A00;
    public final 1s1 A01;
    public final 1s8 A02;
    public final C270564gw A03;
    public final List A04;
    public final List A05;

    public BER(ContextualLinkCtaType contextualLinkCtaType, 1s1 r3, 1s8 r4, C270564gw r5, List list, List list2) {
        0qQ.A0B(contextualLinkCtaType, 2);
        this.A01 = r3;
        this.A00 = contextualLinkCtaType;
        this.A02 = r4;
        this.A04 = list;
        this.A05 = list2;
        this.A03 = r5;
    }

    public final BER F28(1E9 r1) {
        return this;
    }

    public final BER F29(1E6 r1) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BER) {
                BER ber = (BER) obj;
                if (!0qQ.A0K(this.A01, ber.A01) || this.A00 != ber.A00 || !0qQ.A0K(this.A02, ber.A02) || !0qQ.A0K(this.A04, ber.A04) || !0qQ.A0K(this.A05, ber.A05) || !0qQ.A0K(this.A03, ber.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass1s2 AqV() {
        return this.A01;
    }

    public final ContextualLinkCtaType ArC() {
        return this.A00;
    }

    public final /* bridge */ /* synthetic */ C67161s9 BP1() {
        return this.A02;
    }

    public final List Bhr() {
        return this.A04;
    }

    public final List BoE() {
        return this.A05;
    }

    public final C270564gw C4a() {
        return this.A03;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTContextualLinkCtaInfo", CWN.A00(this));
    }

    public final int hashCode() {
        return ((((((AnonymousClass7TF.A07(this.A00, AnonymousClass7TG.A0C(this.A01) * 31) + AnonymousClass7TG.A0C(this.A02)) * 31) + AnonymousClass7TG.A0C(this.A04)) * 31) + AnonymousClass7TG.A0C(this.A05)) * 31) + AnonymousClass7TE.A0L(this.A03);
    }

    public final C46306DUj E7F(1E9 r1) {
        return this;
    }
}
