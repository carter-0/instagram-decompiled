package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.reels.question.constants.QuestionStickerType;
import java.util.List;

public final class UNR extends AnonymousClass0T0 implements C46321DUy {
    public final QuestionStickerType A00;
    public final Boolean A01;
    public final Boolean A02;
    public final Long A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final List A0A;

    public final UNR F8O() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof UNR) {
                UNR unr = (UNR) obj;
                if (!0qQ.A0K(this.A04, unr.A04) || !0qQ.A0K(this.A01, unr.A01) || !0qQ.A0K(this.A05, unr.A05) || !0qQ.A0K(this.A06, unr.A06) || !0qQ.A0K(this.A07, unr.A07) || !0qQ.A0K(this.A08, unr.A08) || !0qQ.A0K(this.A03, unr.A03) || this.A00 != unr.A00 || !0qQ.A0K(this.A0A, unr.A0A) || !0qQ.A0K(this.A09, unr.A09) || !0qQ.A0K(this.A02, unr.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String Bid() {
        return this.A08;
    }

    public final Long Bij() {
        return this.A03;
    }

    public final QuestionStickerType Bin() {
        return this.A00;
    }

    public final List Bns() {
        return this.A0A;
    }

    public final Boolean CEv() {
        return this.A02;
    }

    public final Boolean CQE() {
        return this.A01;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTQuestionStickerDict", C44294Ccc.A00(this));
    }

    public final String getBackgroundColor() {
        return this.A04;
    }

    public final String getMediaId() {
        return this.A05;
    }

    public final String getProfilePicUrl() {
        return this.A06;
    }

    public final String getQuestion() {
        return this.A07;
    }

    public final String getTextColor() {
        return this.A09;
    }

    public final int hashCode() {
        return (((((((((((((((((((AnonymousClass7TG.A0E(this.A04) * 31) + AnonymousClass7TG.A0C(this.A01)) * 31) + AnonymousClass7TG.A0E(this.A05)) * 31) + AnonymousClass7TG.A0E(this.A06)) * 31) + AnonymousClass7TG.A0E(this.A07)) * 31) + AnonymousClass7TG.A0E(this.A08)) * 31) + AnonymousClass7TG.A0C(this.A03)) * 31) + AnonymousClass7TG.A0C(this.A00)) * 31) + AnonymousClass7TG.A0C(this.A0A)) * 31) + AnonymousClass7TG.A0E(this.A09)) * 31) + AnonymousClass7TE.A0L(this.A02);
    }

    public UNR(QuestionStickerType questionStickerType, Boolean bool, Boolean bool2, Long l, String str, String str2, String str3, String str4, String str5, String str6, List list) {
        this.A04 = str;
        this.A01 = bool;
        this.A05 = str2;
        this.A06 = str3;
        this.A07 = str4;
        this.A08 = str5;
        this.A03 = l;
        this.A00 = questionStickerType;
        this.A0A = list;
        this.A09 = str6;
        this.A02 = bool2;
    }
}
