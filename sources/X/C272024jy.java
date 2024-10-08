package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.PollType;
import com.instagram.api.schemas.StoryPollColorType;
import java.util.List;

/* renamed from: X.4jy  reason: invalid class name and case insensitive filesystem */
public final class C272024jy extends AnonymousClass0T0 implements C272034jz {
    public final PollType A00;
    public final C258213ye A01;
    public final StoryPollColorType A02;
    public final Boolean A03;
    public final Boolean A04;
    public final Boolean A05;
    public final Boolean A06;
    public final Boolean A07;
    public final Integer A08;
    public final Integer A09;
    public final Integer A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final List A0E;
    public final List A0F;

    public final C272024jy FGJ(1E9 r1) {
        return this;
    }

    public final C272024jy FGK(1E6 r1) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C272024jy) {
                C272024jy r5 = (C272024jy) obj;
                if (this.A02 != r5.A02 || !0qQ.A0K(this.A08, r5.A08) || !0qQ.A0K(this.A03, r5.A03) || !0qQ.A0K(this.A0B, r5.A0B) || !0qQ.A0K(this.A04, r5.A04) || !0qQ.A0K(this.A05, r5.A05) || !0qQ.A0K(this.A0C, r5.A0C) || this.A00 != r5.A00 || !0qQ.A0K(this.A0E, r5.A0E) || !0qQ.A0K(this.A0D, r5.A0D) || !0qQ.A0K(this.A01, r5.A01) || !0qQ.A0K(this.A0F, r5.A0F) || !0qQ.A0K(this.A09, r5.A09) || !0qQ.A0K(this.A06, r5.A06) || !0qQ.A0K(this.A07, r5.A07) || !0qQ.A0K(this.A0A, r5.A0A)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        StoryPollColorType storyPollColorType = this.A02;
        int i = 0;
        int hashCode = (storyPollColorType == null ? 0 : storyPollColorType.hashCode()) * 31;
        Integer num = this.A08;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.A03;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.A0B;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool2 = this.A04;
        int hashCode5 = (hashCode4 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.A05;
        int hashCode6 = (hashCode5 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str2 = this.A0C;
        int hashCode7 = (hashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
        PollType pollType = this.A00;
        int hashCode8 = (hashCode7 + (pollType == null ? 0 : pollType.hashCode())) * 31;
        List list = this.A0E;
        int hashCode9 = (hashCode8 + (list == null ? 0 : list.hashCode())) * 31;
        String str3 = this.A0D;
        int hashCode10 = (hashCode9 + (str3 == null ? 0 : str3.hashCode())) * 31;
        C258213ye r0 = this.A01;
        int hashCode11 = (hashCode10 + (r0 == null ? 0 : r0.hashCode())) * 31;
        List list2 = this.A0F;
        int hashCode12 = (hashCode11 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Integer num2 = this.A09;
        int hashCode13 = (hashCode12 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool4 = this.A06;
        int hashCode14 = (hashCode13 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.A07;
        int hashCode15 = (hashCode14 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Integer num3 = this.A0A;
        if (num3 != null) {
            i = num3.hashCode();
        }
        return hashCode15 + i;
    }

    public final StoryPollColorType Aoy() {
        return this.A02;
    }

    public final Integer B2k() {
        return this.A08;
    }

    public final Boolean B60() {
        return this.A03;
    }

    public final PollType Bda() {
        return this.A00;
    }

    public final List Bhl() {
        return this.A0E;
    }

    public final /* bridge */ /* synthetic */ C258223yf BxM() {
        return this.A01;
    }

    public final List C48() {
        return this.A0F;
    }

    public final Integer C8u() {
        return this.A09;
    }

    public final Boolean CEx() {
        return this.A06;
    }

    public final Boolean CF6() {
        return this.A07;
    }

    public final Integer CFI() {
        return this.A0A;
    }

    public final Boolean CXp() {
        return this.A04;
    }

    public final Boolean Cbm() {
        return this.A05;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTPollSticker", C44981CoK.A00(this));
    }

    public final String getId() {
        return this.A0B;
    }

    public final String getPollId() {
        return this.A0C;
    }

    public final String getQuestion() {
        return this.A0D;
    }

    public C272024jy(PollType pollType, C258213ye r3, StoryPollColorType storyPollColorType, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Integer num, Integer num2, Integer num3, String str, String str2, String str3, List list, List list2) {
        this.A02 = storyPollColorType;
        this.A08 = num;
        this.A03 = bool;
        this.A0B = str;
        this.A04 = bool2;
        this.A05 = bool3;
        this.A0C = str2;
        this.A00 = pollType;
        this.A0E = list;
        this.A0D = str3;
        this.A01 = r3;
        this.A0F = list2;
        this.A09 = num2;
        this.A06 = bool4;
        this.A07 = bool5;
        this.A0A = num3;
    }

    public final C272034jz EAM(1E9 r1) {
        return this;
    }
}
