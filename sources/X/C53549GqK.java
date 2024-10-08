package X;

import android.view.View;

/* renamed from: X.GqK  reason: case insensitive filesystem */
public final class C53549GqK extends AnonymousClass0T0 implements MSZ {
    public final View.OnClickListener A00;
    public final Boolean A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53549GqK) {
                C53549GqK gqK = (C53549GqK) obj;
                if (!0qQ.A0K(this.A00, gqK.A00) || !0qQ.A0K(this.A0B, gqK.A0B) || !0qQ.A0K(this.A09, gqK.A09) || !0qQ.A0K(this.A03, gqK.A03) || !0qQ.A0K(this.A02, gqK.A02) || !0qQ.A0K(this.A07, gqK.A07) || !0qQ.A0K(this.A04, gqK.A04) || !0qQ.A0K(this.A05, gqK.A05) || !0qQ.A0K(this.A08, gqK.A08) || !0qQ.A0K(this.A06, gqK.A06) || !0qQ.A0K(this.A0A, gqK.A0A) || !0qQ.A0K(this.A01, gqK.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final Integer BJc() {
        return AnonymousClass05K.A1F;
    }

    public final int hashCode() {
        return (((((((((((((((((((((AnonymousClass7TG.A0C(this.A00) * 31) + AnonymousClass7TG.A0E(this.A0B)) * 31) + AnonymousClass7TG.A0E(this.A09)) * 31) + AnonymousClass7TG.A0E(this.A03)) * 31) + AnonymousClass7TG.A0E(this.A02)) * 31) + AnonymousClass7TG.A0E(this.A07)) * 31) + AnonymousClass7TG.A0E(this.A04)) * 31) + AnonymousClass7TG.A0E(this.A05)) * 31) + AnonymousClass7TG.A0E(this.A08)) * 31) + AnonymousClass7TG.A0E(this.A06)) * 31) + AnonymousClass7TG.A0E(this.A0A)) * 31) + AnonymousClass7TE.A0L(this.A01);
    }

    public C53549GqK(View.OnClickListener onClickListener, Boolean bool, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        this.A00 = onClickListener;
        this.A0B = str;
        this.A09 = str2;
        this.A03 = str3;
        this.A02 = str4;
        this.A07 = str5;
        this.A04 = str6;
        this.A05 = str7;
        this.A08 = str8;
        this.A06 = str9;
        this.A0A = str10;
        this.A01 = bool;
    }

    public C53549GqK() {
        this((View.OnClickListener) null, AnonymousClass7TE.A0u(), (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null);
    }
}
