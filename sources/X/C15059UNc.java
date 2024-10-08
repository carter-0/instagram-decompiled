package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.INLINE_SURVEY_QUESTION_TYPES;
import java.util.List;

/* renamed from: X.UNc  reason: case insensitive filesystem */
public final class C15059UNc extends AnonymousClass0T0 implements C21041XAu {
    public final INLINE_SURVEY_QUESTION_TYPES A00;
    public final Boolean A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final List A08;

    public final C15059UNc FCG() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C15059UNc) {
                C15059UNc uNc = (C15059UNc) obj;
                if (!0qQ.A0K(this.A08, uNc.A08) || !0qQ.A0K(this.A02, uNc.A02) || !0qQ.A0K(this.A03, uNc.A03) || !0qQ.A0K(this.A04, uNc.A04) || !0qQ.A0K(this.A05, uNc.A05) || !0qQ.A0K(this.A01, uNc.A01) || !0qQ.A0K(this.A06, uNc.A06) || !0qQ.A0K(this.A07, uNc.A07) || this.A00 != uNc.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final List Abw() {
        return this.A08;
    }

    public final String Axp() {
        return this.A02;
    }

    public final String BWJ() {
        return this.A04;
    }

    public final String Bcp() {
        return this.A05;
    }

    public final Boolean C2H() {
        return this.A01;
    }

    public final String C2J() {
        return this.A06;
    }

    public final INLINE_SURVEY_QUESTION_TYPES CAP() {
        return this.A00;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTSurveyQuestionDict", V8M.A00(this));
    }

    public final String getId() {
        return this.A03;
    }

    public final String getTitle() {
        return this.A07;
    }

    public final int hashCode() {
        return (((((((((((((((AnonymousClass7TG.A0C(this.A08) * 31) + AnonymousClass7TG.A0E(this.A02)) * 31) + AnonymousClass7TG.A0E(this.A03)) * 31) + AnonymousClass7TG.A0E(this.A04)) * 31) + AnonymousClass7TG.A0E(this.A05)) * 31) + AnonymousClass7TG.A0C(this.A01)) * 31) + AnonymousClass7TG.A0E(this.A06)) * 31) + AnonymousClass7TG.A0E(this.A07)) * 31) + AnonymousClass7TE.A0L(this.A00);
    }

    public C15059UNc(INLINE_SURVEY_QUESTION_TYPES inline_survey_question_types, Boolean bool, String str, String str2, String str3, String str4, String str5, String str6, List list) {
        this.A08 = list;
        this.A02 = str;
        this.A03 = str2;
        this.A04 = str3;
        this.A05 = str4;
        this.A01 = bool;
        this.A06 = str5;
        this.A07 = str6;
        this.A00 = inline_survey_question_types;
    }
}
