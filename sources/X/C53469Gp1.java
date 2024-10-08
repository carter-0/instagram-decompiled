package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.WearablesAppAttributionType;
import com.instagram.api.schemas.WorldLocationPagesInfo;
import com.instagram.user.model.User;

/* renamed from: X.Gp1  reason: case insensitive filesystem */
public final class C53469Gp1 extends AnonymousClass0T0 implements JSO {
    public final WearablesAppAttributionType A00;
    public final WorldLocationPagesInfo A01;
    public final User A02;
    public final Integer A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;
    public final String A0F;
    public final String A0G;
    public final String A0H;
    public final boolean A0I;

    public C53469Gp1(WearablesAppAttributionType wearablesAppAttributionType, WorldLocationPagesInfo worldLocationPagesInfo, User user, Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, boolean z) {
        0qQ.A0B(str, 1);
        C51974G9v.A1S(str2, str3, str4, str5, str6);
        this.A04 = str;
        this.A05 = str2;
        this.A06 = str3;
        this.A07 = str4;
        this.A08 = str5;
        this.A09 = str6;
        this.A00 = wearablesAppAttributionType;
        this.A03 = num;
        this.A0A = str7;
        this.A0B = str8;
        this.A0C = str9;
        this.A0I = z;
        this.A0D = str10;
        this.A0E = str11;
        this.A0F = str12;
        this.A0G = str13;
        this.A02 = user;
        this.A0H = str14;
        this.A01 = worldLocationPagesInfo;
    }

    public final JSO E9Y(1E9 r1) {
        return this;
    }

    public final C53469Gp1 FDP(1E9 r1) {
        return this;
    }

    public final C53469Gp1 FDQ(1E6 r1) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53469Gp1) {
                C53469Gp1 gp1 = (C53469Gp1) obj;
                if (!0qQ.A0K(this.A04, gp1.A04) || !0qQ.A0K(this.A05, gp1.A05) || !0qQ.A0K(this.A06, gp1.A06) || !0qQ.A0K(this.A07, gp1.A07) || !0qQ.A0K(this.A08, gp1.A08) || !0qQ.A0K(this.A09, gp1.A09) || this.A00 != gp1.A00 || !0qQ.A0K(this.A03, gp1.A03) || !0qQ.A0K(this.A0A, gp1.A0A) || !0qQ.A0K(this.A0B, gp1.A0B) || !0qQ.A0K(this.A0C, gp1.A0C) || this.A0I != gp1.A0I || !0qQ.A0K(this.A0D, gp1.A0D) || !0qQ.A0K(this.A0E, gp1.A0E) || !0qQ.A0K(this.A0F, gp1.A0F) || !0qQ.A0K(this.A0G, gp1.A0G) || !0qQ.A0K(this.A02, gp1.A02) || !0qQ.A0K(this.A0H, gp1.A0H) || !0qQ.A0K(this.A01, gp1.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final WearablesAppAttributionType AdB() {
        return this.A00;
    }

    public final Integer BES() {
        return this.A03;
    }

    public final String Bce() {
        return this.A0D;
    }

    public final String Bcf() {
        return this.A0E;
    }

    public final String Bcg() {
        return this.A0F;
    }

    public final String Bci() {
        return this.A0G;
    }

    public final User Bcj() {
        return this.A02;
    }

    public final String Bck() {
        return this.A0H;
    }

    public final WorldLocationPagesInfo CGk() {
        return this.A01;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTWearablesAppAttribution", HU8.A00(this));
    }

    public final String getAttributionCtaActionUrl() {
        return this.A04;
    }

    public final String getAttributionCtaText() {
        return this.A05;
    }

    public final String getAttributionIconUrl() {
        return this.A06;
    }

    public final String getAttributionSubtitle() {
        return this.A07;
    }

    public final String getAttributionTitle() {
        return this.A08;
    }

    public final String getAttributionTopIconUrl() {
        return this.A09;
    }

    public final String getIconicHorizonWorldDeeplink() {
        return this.A0A;
    }

    public final String getIconicHorizonWorldId() {
        return this.A0B;
    }

    public final String getIconicHorizonWorldName() {
        return this.A0C;
    }

    public final int hashCode() {
        int A082 = AnonymousClass7TF.A08(this.A08, AnonymousClass7TF.A08(this.A07, AnonymousClass7TF.A08(this.A06, AnonymousClass7TF.A08(this.A05, AnonymousClass7TE.A0O(this.A04)))));
        return ((((((((((((AnonymousClass7TF.A09(this.A0I, (((((((((AnonymousClass7TF.A08(this.A09, A082) + AnonymousClass7TG.A0C(this.A00)) * 31) + AnonymousClass7TG.A0C(this.A03)) * 31) + AnonymousClass7TG.A0E(this.A0A)) * 31) + AnonymousClass7TG.A0E(this.A0B)) * 31) + AnonymousClass7TG.A0E(this.A0C)) * 31) + AnonymousClass7TG.A0E(this.A0D)) * 31) + AnonymousClass7TG.A0E(this.A0E)) * 31) + AnonymousClass7TG.A0E(this.A0F)) * 31) + AnonymousClass7TG.A0E(this.A0G)) * 31) + AnonymousClass7TG.A0C(this.A02)) * 31) + AnonymousClass7TG.A0E(this.A0H)) * 31) + AnonymousClass7TE.A0L(this.A01);
    }

    public final boolean isWearableMediaProducer() {
        return this.A0I;
    }
}
