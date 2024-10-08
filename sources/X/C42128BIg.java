package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.StoryAdKeywordStyleEnum;
import com.instagram.api.schemas.StoryAdKeywordTypeEnum;

/* renamed from: X.BIg  reason: case insensitive filesystem */
public final class C42128BIg extends AnonymousClass0T0 implements C46305DUi {
    public final StoryAdKeywordStyleEnum A00;
    public final StoryAdKeywordTypeEnum A01;
    public final Integer A02;
    public final Integer A03;
    public final String A04;
    public final String A05;
    public final String A06;

    public final C42128BIg FFA() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C42128BIg) {
                C42128BIg bIg = (C42128BIg) obj;
                if (!0qQ.A0K(this.A02, bIg.A02) || !0qQ.A0K(this.A04, bIg.A04) || !0qQ.A0K(this.A05, bIg.A05) || this.A00 != bIg.A00 || this.A01 != bIg.A01 || !0qQ.A0K(this.A03, bIg.A03) || !0qQ.A0K(this.A06, bIg.A06)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final Integer B1T() {
        return this.A02;
    }

    public final String BKD() {
        return this.A04;
    }

    public final String BKE() {
        return this.A05;
    }

    public final StoryAdKeywordStyleEnum BKH() {
        return this.A00;
    }

    public final StoryAdKeywordTypeEnum BKI() {
        return this.A01;
    }

    public final Integer Byg() {
        return this.A03;
    }

    public final String C83() {
        return this.A06;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTStoryAdKeywordInfoDict", C44903Cmt.A00(this));
    }

    public final int hashCode() {
        return (((((((((((AnonymousClass7TG.A0C(this.A02) * 31) + AnonymousClass7TG.A0E(this.A04)) * 31) + AnonymousClass7TG.A0E(this.A05)) * 31) + AnonymousClass7TG.A0C(this.A00)) * 31) + AnonymousClass7TG.A0C(this.A01)) * 31) + AnonymousClass7TG.A0C(this.A03)) * 31) + C41845B3m.A00(this.A06);
    }

    public C42128BIg(StoryAdKeywordStyleEnum storyAdKeywordStyleEnum, StoryAdKeywordTypeEnum storyAdKeywordTypeEnum, Integer num, Integer num2, String str, String str2, String str3) {
        this.A02 = num;
        this.A04 = str;
        this.A05 = str2;
        this.A00 = storyAdKeywordStyleEnum;
        this.A01 = storyAdKeywordTypeEnum;
        this.A03 = num2;
        this.A06 = str3;
    }
}
