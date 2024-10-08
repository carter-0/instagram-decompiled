package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

/* renamed from: X.BHk  reason: case insensitive filesystem */
public final class C42107BHk extends AnonymousClass0T0 implements C46317DUu {
    public final C15059UNc A00;
    public final Boolean A01;
    public final Boolean A02;
    public final Boolean A03;
    public final Boolean A04;
    public final Integer A05;
    public final Integer A06;
    public final String A07;
    public final String A08;
    public final List A09;

    public final C42107BHk FCH() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C42107BHk) {
                C42107BHk bHk = (C42107BHk) obj;
                if (!0qQ.A0K(this.A01, bHk.A01) || !0qQ.A0K(this.A02, bHk.A02) || !0qQ.A0K(this.A00, bHk.A00) || !0qQ.A0K(this.A03, bHk.A03) || !0qQ.A0K(this.A07, bHk.A07) || !0qQ.A0K(this.A04, bHk.A04) || !0qQ.A0K(this.A08, bHk.A08) || !0qQ.A0K(this.A09, bHk.A09) || !0qQ.A0K(this.A05, bHk.A05) || !0qQ.A0K(this.A06, bHk.A06)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final Boolean B18() {
        return this.A01;
    }

    public final Boolean B1B() {
        return this.A02;
    }

    public final /* bridge */ /* synthetic */ C21041XAu B3R() {
        return this.A00;
    }

    public final Boolean BCD() {
        return this.A03;
    }

    public final Boolean BNs() {
        return this.A04;
    }

    public final String BU0() {
        return this.A08;
    }

    public final List Bip() {
        return this.A09;
    }

    public final Integer CBe() {
        return this.A05;
    }

    public final Integer CDn() {
        return this.A06;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTSurveyQuestionModuleDict", C44498Cfu.A00(this));
    }

    public final String getId() {
        return this.A07;
    }

    public final int hashCode() {
        return (((((((((((((((((AnonymousClass7TG.A0C(this.A01) * 31) + AnonymousClass7TG.A0C(this.A02)) * 31) + AnonymousClass7TG.A0C(this.A00)) * 31) + AnonymousClass7TG.A0C(this.A03)) * 31) + AnonymousClass7TG.A0E(this.A07)) * 31) + AnonymousClass7TG.A0C(this.A04)) * 31) + AnonymousClass7TG.A0E(this.A08)) * 31) + AnonymousClass7TG.A0C(this.A09)) * 31) + AnonymousClass7TG.A0C(this.A05)) * 31) + AnonymousClass7TE.A0L(this.A06);
    }

    public C42107BHk(C15059UNc uNc, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Integer num, Integer num2, String str, String str2, List list) {
        this.A01 = bool;
        this.A02 = bool2;
        this.A00 = uNc;
        this.A03 = bool3;
        this.A07 = str;
        this.A04 = bool4;
        this.A08 = str2;
        this.A09 = list;
        this.A05 = num;
        this.A06 = num2;
    }
}
