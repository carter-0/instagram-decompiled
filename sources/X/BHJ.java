package X;

import com.facebook.pando.TreeUpdaterJNI;

public final class BHJ extends AnonymousClass0T0 implements C46316DUt {
    public final Boolean A00;
    public final Boolean A01;
    public final Float A02;
    public final Float A03;
    public final Integer A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;

    public final BHJ FBH() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BHJ) {
                BHJ bhj = (BHJ) obj;
                if (!0qQ.A0K(this.A05, bhj.A05) || !0qQ.A0K(this.A06, bhj.A06) || !0qQ.A0K(this.A00, bhj.A00) || !0qQ.A0K(this.A07, bhj.A07) || !0qQ.A0K(this.A08, bhj.A08) || !0qQ.A0K(this.A02, bhj.A02) || !0qQ.A0K(this.A04, bhj.A04) || !0qQ.A0K(this.A09, bhj.A09) || !0qQ.A0K(this.A01, bhj.A01) || !0qQ.A0K(this.A03, bhj.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final Float Bwr() {
        return this.A02;
    }

    public final Integer Bws() {
        return this.A04;
    }

    public final Boolean CEx() {
        return this.A01;
    }

    public final Float CFH() {
        return this.A03;
    }

    public final Boolean CVh() {
        return this.A00;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTStorySliderStickerDict", C44440Cey.A00(this));
    }

    public final String getBackgroundColor() {
        return this.A05;
    }

    public final String getEmoji() {
        return this.A06;
    }

    public final String getQuestion() {
        return this.A07;
    }

    public final String getSliderId() {
        return this.A08;
    }

    public final String getTextColor() {
        return this.A09;
    }

    public final int hashCode() {
        return (((((((((((((((((AnonymousClass7TG.A0E(this.A05) * 31) + AnonymousClass7TG.A0E(this.A06)) * 31) + AnonymousClass7TG.A0C(this.A00)) * 31) + AnonymousClass7TG.A0E(this.A07)) * 31) + AnonymousClass7TG.A0E(this.A08)) * 31) + AnonymousClass7TG.A0C(this.A02)) * 31) + AnonymousClass7TG.A0C(this.A04)) * 31) + AnonymousClass7TG.A0E(this.A09)) * 31) + AnonymousClass7TG.A0C(this.A01)) * 31) + AnonymousClass7TE.A0L(this.A03);
    }

    public BHJ(Boolean bool, Boolean bool2, Float f, Float f2, Integer num, String str, String str2, String str3, String str4, String str5) {
        this.A05 = str;
        this.A06 = str2;
        this.A00 = bool;
        this.A07 = str3;
        this.A08 = str4;
        this.A02 = f;
        this.A04 = num;
        this.A09 = str5;
        this.A01 = bool2;
        this.A03 = f2;
    }
}
