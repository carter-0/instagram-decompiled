package X;

import android.graphics.drawable.Drawable;

/* renamed from: X.HtX  reason: case insensitive filesystem */
public final class C56145HtX {
    public final long A00;
    public final Drawable A01;
    public final 2WX A02;
    public final C56143HtV A03;
    public final I1u A04;
    public final CharSequence A05;
    public final CharSequence A06;
    public final Integer A07;
    public final Integer A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C56145HtX) {
                C56145HtX htX = (C56145HtX) obj;
                if (!0qQ.A0K(this.A06, htX.A06) || this.A08 != htX.A08 || this.A00 != htX.A00 || this.A0B != htX.A0B || !0qQ.A0K(this.A04, htX.A04) || !0qQ.A0K(this.A03, htX.A03) || this.A09 != htX.A09 || !0qQ.A0K(this.A02, htX.A02) || !0qQ.A0K(this.A01, htX.A01) || this.A07 != htX.A07 || !0qQ.A0K(this.A05, htX.A05) || this.A0A != htX.A0A) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public C56145HtX(Drawable drawable, 2WX r3, C56143HtV htV, I1u i1u, CharSequence charSequence, CharSequence charSequence2, Integer num, Integer num2, long j, boolean z, boolean z2, boolean z3) {
        0qQ.A0B(num2, 10);
        this.A06 = charSequence;
        this.A08 = num;
        this.A00 = j;
        this.A0B = z;
        this.A04 = i1u;
        this.A03 = htV;
        this.A09 = z2;
        this.A02 = r3;
        this.A01 = drawable;
        this.A07 = num2;
        this.A05 = charSequence2;
        this.A0A = z3;
    }

    public final int hashCode() {
        int A0K = AnonymousClass7TE.A0K(this.A06);
        Integer num = this.A08;
        int A072 = C51972G9s.A07(this.A00, AnonymousClass7TG.A0B(num, C55232HeN.A00(num), A0K));
        int A092 = (((AnonymousClass7TF.A09(this.A09, (((AnonymousClass7TF.A09(this.A0B, A072) + AnonymousClass7TG.A0C(this.A04)) * 31) + AnonymousClass7TG.A0C(this.A03)) * 31) + AnonymousClass7TG.A0C(this.A02)) * 31) + AnonymousClass7TG.A0C(this.A01)) * 31;
        Integer num2 = this.A07;
        return DbS.A06(this.A0A, (AnonymousClass7TG.A0B(num2, C46642DiN.A01(num2), A092) + AnonymousClass7TE.A0L(this.A05)) * 31);
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("MetaAiBottomSheetConfig(titleString=");
        A1A.append(this.A06);
        A1A.append(", titleTextType=");
        A1A.append(C55232HeN.A00(this.A08));
        A1A.append(", titleCapSize=");
        A1A.append(2Wd.A04(this.A00));
        A1A.append(", shouldShowMetaAiDonut=");
        A1A.append(this.A0B);
        A1A.append(", navigationButtonConfig=");
        A1A.append(this.A04);
        A1A.append(", actionButtonConfig=");
        A1A.append(this.A03);
        A1A.append(", overrideDefaultNavigation=");
        A1A.append(this.A09);
        A1A.append(", headerStyle=");
        A1A.append(this.A02);
        A1A.append(", customBackgroundDrawable=");
        A1A.append(this.A01);
        A1A.append(", darkModeConfig=");
        A1A.append(C46642DiN.A01(this.A07));
        A1A.append(", subTitleString=");
        A1A.append(this.A05);
        A1A.append(", shouldShowHeader=");
        return G9t.A1C(A1A, this.A0A);
    }
}
