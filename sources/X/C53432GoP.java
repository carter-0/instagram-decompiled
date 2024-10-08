package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.AfiInterestsRecoStyle;
import java.util.List;

/* renamed from: X.GoP  reason: case insensitive filesystem */
public final class C53432GoP extends AnonymousClass0T0 implements C269904fs {
    public final AfiInterestsRecoStyle A00;
    public final Integer A01;
    public final Integer A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final List A06;

    public final C53432GoP F0O() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53432GoP) {
                C53432GoP goP = (C53432GoP) obj;
                if (!0qQ.A0K(this.A03, goP.A03) || !0qQ.A0K(this.A01, goP.A01) || !0qQ.A0K(this.A06, goP.A06) || !0qQ.A0K(this.A02, goP.A02) || this.A00 != goP.A00 || !0qQ.A0K(this.A04, goP.A04) || !0qQ.A0K(this.A05, goP.A05)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String B2Z() {
        return this.A03;
    }

    public final Integer B2c() {
        return this.A01;
    }

    public final List BIP() {
        return this.A06;
    }

    public final Integer BXG() {
        return this.A02;
    }

    public final AfiInterestsRecoStyle C21() {
        return this.A00;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTAfiInterestsRecoInfo", HTJ.A00(this));
    }

    public final String getSubtitle() {
        return this.A04;
    }

    public final String getTitle() {
        return this.A05;
    }

    public final int hashCode() {
        return (((((((((((AnonymousClass7TG.A0E(this.A03) * 31) + AnonymousClass7TG.A0C(this.A01)) * 31) + AnonymousClass7TG.A0C(this.A06)) * 31) + AnonymousClass7TG.A0C(this.A02)) * 31) + AnonymousClass7TG.A0C(this.A00)) * 31) + AnonymousClass7TG.A0E(this.A04)) * 31) + C41845B3m.A00(this.A05);
    }

    public C53432GoP(AfiInterestsRecoStyle afiInterestsRecoStyle, Integer num, Integer num2, String str, String str2, String str3, List list) {
        this.A03 = str;
        this.A01 = num;
        this.A06 = list;
        this.A02 = num2;
        this.A00 = afiInterestsRecoStyle;
        this.A04 = str2;
        this.A05 = str3;
    }
}
