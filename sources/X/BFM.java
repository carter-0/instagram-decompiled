package X;

import com.facebook.pando.TreeUpdaterJNI;

public final class BFM extends AnonymousClass0T0 implements C46315DUs {
    public final float A00;
    public final float A01;
    public final Boolean A02;
    public final Float A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;

    public final BFM F5c() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BFM) {
                BFM bfm = (BFM) obj;
                if (!0qQ.A0K(this.A04, bfm.A04) || !0qQ.A0K(this.A05, bfm.A05) || !0qQ.A0K(this.A06, bfm.A06) || !0qQ.A0K(this.A07, bfm.A07) || !0qQ.A0K(this.A02, bfm.A02) || Float.compare(this.A00, bfm.A00) != 0 || Float.compare(this.A01, bfm.A01) != 0 || !0qQ.A0K(this.A08, bfm.A08) || !0qQ.A0K(this.A09, bfm.A09) || !0qQ.A0K(this.A03, bfm.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String Aoi() {
        return this.A04;
    }

    public final String B0I() {
        return this.A06;
    }

    public final String B3Z() {
        return this.A07;
    }

    public final float BLU() {
        return this.A00;
    }

    public final float BNU() {
        return this.A01;
    }

    public final String Bct() {
        return this.A09;
    }

    public final Float Bj6() {
        return this.A03;
    }

    public final Boolean CQI() {
        return this.A02;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTLocationCoordinates", C44212CZz.A00(this));
    }

    public final String getEffectId() {
        return this.A05;
    }

    public final String getName() {
        return this.A08;
    }

    public final int hashCode() {
        return (((((((((((((((((AnonymousClass7TG.A0E(this.A04) * 31) + AnonymousClass7TG.A0E(this.A05)) * 31) + AnonymousClass7TG.A0E(this.A06)) * 31) + AnonymousClass7TG.A0E(this.A07)) * 31) + AnonymousClass7TG.A0C(this.A02)) * 31) + Float.floatToIntBits(this.A00)) * 31) + Float.floatToIntBits(this.A01)) * 31) + AnonymousClass7TG.A0E(this.A08)) * 31) + AnonymousClass7TG.A0E(this.A09)) * 31) + AnonymousClass7TE.A0L(this.A03);
    }

    public BFM(Boolean bool, Float f, String str, String str2, String str3, String str4, String str5, String str6, float f2, float f3) {
        this.A04 = str;
        this.A05 = str2;
        this.A06 = str3;
        this.A07 = str4;
        this.A02 = bool;
        this.A00 = f2;
        this.A01 = f3;
        this.A08 = str5;
        this.A09 = str6;
        this.A03 = f;
    }
}
