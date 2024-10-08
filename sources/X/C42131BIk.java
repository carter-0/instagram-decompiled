package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.DropsEventPageNavigationMetadata;
import com.instagram.model.shopping.drops.DropsLaunchAnimation;
import com.instagram.model.shopping.drops.DropsLaunchAnimationIntf;
import com.instagram.user.model.ProductCollection;
import java.util.List;

/* renamed from: X.BIk  reason: case insensitive filesystem */
public final class C42131BIk extends AnonymousClass0T0 implements DV0 {
    public final DropsEventPageNavigationMetadata A00;
    public final DropsLaunchAnimation A01;
    public final ProductCollection A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final List A0A;

    public final C42131BIk FFi(1E9 r1) {
        return this;
    }

    public final C42131BIk FFj(1E6 r1) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C42131BIk) {
                C42131BIk bIk = (C42131BIk) obj;
                if (!0qQ.A0K(this.A02, bIk.A02) || !0qQ.A0K(this.A01, bIk.A01) || !0qQ.A0K(this.A00, bIk.A00) || !0qQ.A0K(this.A03, bIk.A03) || !0qQ.A0K(this.A04, bIk.A04) || !0qQ.A0K(this.A05, bIk.A05) || !0qQ.A0K(this.A0A, bIk.A0A) || !0qQ.A0K(this.A06, bIk.A06) || !0qQ.A0K(this.A07, bIk.A07) || !0qQ.A0K(this.A08, bIk.A08) || !0qQ.A0K(this.A09, bIk.A09)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final ProductCollection Aoo() {
        return this.A02;
    }

    public final /* bridge */ /* synthetic */ DropsLaunchAnimationIntf AzD() {
        return this.A01;
    }

    public final DropsEventPageNavigationMetadata B2L() {
        return this.A00;
    }

    public final String BRr() {
        return this.A05;
    }

    public final List Bzq() {
        return this.A0A;
    }

    public final String C5C() {
        return this.A07;
    }

    public final String CDo() {
        return this.A09;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTStorySellerCollectionTappableData", C44934CnU.A00(this));
    }

    public final String getId() {
        return this.A03;
    }

    public final String getMediaId() {
        return this.A04;
    }

    public final String getText() {
        return this.A06;
    }

    public final String getUserId() {
        return this.A08;
    }

    public final int hashCode() {
        return (((((((((((((((((((AnonymousClass7TG.A0C(this.A02) * 31) + AnonymousClass7TG.A0C(this.A01)) * 31) + AnonymousClass7TG.A0C(this.A00)) * 31) + AnonymousClass7TG.A0E(this.A03)) * 31) + AnonymousClass7TG.A0E(this.A04)) * 31) + AnonymousClass7TG.A0E(this.A05)) * 31) + AnonymousClass7TG.A0C(this.A0A)) * 31) + AnonymousClass7TG.A0E(this.A06)) * 31) + AnonymousClass7TG.A0E(this.A07)) * 31) + AnonymousClass7TG.A0E(this.A08)) * 31) + C41845B3m.A00(this.A09);
    }

    public C42131BIk(DropsEventPageNavigationMetadata dropsEventPageNavigationMetadata, DropsLaunchAnimation dropsLaunchAnimation, ProductCollection productCollection, String str, String str2, String str3, String str4, String str5, String str6, String str7, List list) {
        this.A02 = productCollection;
        this.A01 = dropsLaunchAnimation;
        this.A00 = dropsEventPageNavigationMetadata;
        this.A03 = str;
        this.A04 = str2;
        this.A05 = str3;
        this.A0A = list;
        this.A06 = str4;
        this.A07 = str5;
        this.A08 = str6;
        this.A09 = str7;
    }

    public final DV0 EA9(1E9 r1) {
        return this;
    }
}
