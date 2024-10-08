package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

/* renamed from: X.BIr  reason: case insensitive filesystem */
public final class C42136BIr extends AnonymousClass0T0 implements C46295DTy {
    public final Boolean A00;
    public final String A01;
    public final List A02;

    public final C42136BIr FGG(1E9 r1) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C42136BIr) {
                C42136BIr bIr = (C42136BIr) obj;
                if (!0qQ.A0K(this.A02, bIr.A02) || !0qQ.A0K(this.A01, bIr.A01) || !0qQ.A0K(this.A00, bIr.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final List AyX() {
        return this.A02;
    }

    public final String BP8() {
        return this.A01;
    }

    public final Boolean BU7() {
        return this.A00;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTStoryFundraiserDonations", C44976CoF.A00(this));
    }

    public final int hashCode() {
        return (((AnonymousClass7TG.A0C(this.A02) * 31) + AnonymousClass7TG.A0E(this.A01)) * 31) + AnonymousClass7TE.A0L(this.A00);
    }

    public C42136BIr(Boolean bool, String str, List list) {
        this.A02 = list;
        this.A01 = str;
        this.A00 = bool;
    }

    public final C46295DTy EAK(1E9 r1) {
        return this;
    }
}
