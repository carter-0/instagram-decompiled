package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

public final class UNZ extends AnonymousClass0T0 implements C21045XAz {
    public final Boolean A00;
    public final Boolean A01;
    public final Integer A02;
    public final Integer A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final List A0B;
    public final List A0C;

    public final UNZ FB0() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof UNZ) {
                UNZ unz = (UNZ) obj;
                if (!0qQ.A0K(this.A02, unz.A02) || !0qQ.A0K(this.A04, unz.A04) || !0qQ.A0K(this.A05, unz.A05) || !0qQ.A0K(this.A00, unz.A00) || !0qQ.A0K(this.A06, unz.A06) || !0qQ.A0K(this.A0B, unz.A0B) || !0qQ.A0K(this.A07, unz.A07) || !0qQ.A0K(this.A08, unz.A08) || !0qQ.A0K(this.A09, unz.A09) || !0qQ.A0K(this.A0C, unz.A0C) || !0qQ.A0K(this.A0A, unz.A0A) || !0qQ.A0K(this.A03, unz.A03) || !0qQ.A0K(this.A01, unz.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final Integer ArZ() {
        return this.A02;
    }

    public final String Avv() {
        return this.A04;
    }

    public final Boolean B60() {
        return this.A00;
    }

    public final List BYc() {
        return this.A0B;
    }

    public final String Biw() {
        return this.A08;
    }

    public final List C48() {
        return this.A0C;
    }

    public final Integer CEs() {
        return this.A03;
    }

    public final Boolean CEu() {
        return this.A01;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTStoryQuizDict", V8I.A00(this));
    }

    public final String getEndBackgroundColor() {
        return this.A05;
    }

    public final String getId() {
        return this.A06;
    }

    public final String getQuestion() {
        return this.A07;
    }

    public final String getStartBackgroundColor() {
        return this.A09;
    }

    public final String getTextColor() {
        return this.A0A;
    }

    public final int hashCode() {
        return (((((((((((((((((((((((AnonymousClass7TG.A0C(this.A02) * 31) + AnonymousClass7TG.A0E(this.A04)) * 31) + AnonymousClass7TG.A0E(this.A05)) * 31) + AnonymousClass7TG.A0C(this.A00)) * 31) + AnonymousClass7TG.A0E(this.A06)) * 31) + AnonymousClass7TG.A0C(this.A0B)) * 31) + AnonymousClass7TG.A0E(this.A07)) * 31) + AnonymousClass7TG.A0E(this.A08)) * 31) + AnonymousClass7TG.A0E(this.A09)) * 31) + AnonymousClass7TG.A0C(this.A0C)) * 31) + AnonymousClass7TG.A0E(this.A0A)) * 31) + AnonymousClass7TG.A0C(this.A03)) * 31) + AnonymousClass7TE.A0L(this.A01);
    }

    public UNZ(Boolean bool, Boolean bool2, Integer num, Integer num2, String str, String str2, String str3, String str4, String str5, String str6, String str7, List list, List list2) {
        this.A02 = num;
        this.A04 = str;
        this.A05 = str2;
        this.A00 = bool;
        this.A06 = str3;
        this.A0B = list;
        this.A07 = str4;
        this.A08 = str5;
        this.A09 = str6;
        this.A0C = list2;
        this.A0A = str7;
        this.A03 = num2;
        this.A01 = bool2;
    }
}
