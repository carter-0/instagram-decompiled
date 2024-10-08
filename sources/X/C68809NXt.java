package X;

import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import java.util.List;

/* renamed from: X.NXt  reason: case insensitive filesystem */
public final class C68809NXt extends C3259674w {
    public final int A00;
    public final Drawable A01;
    public final SpannableString A02;
    public final String A03;
    public final List A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C68809NXt(Drawable drawable, SpannableString spannableString, String str, List list, int i, boolean z, boolean z2, boolean z3) {
        super(drawable, spannableString, (1aV) null, list);
        AnonymousClass7TG.A1Q(spannableString, list);
        this.A03 = str;
        this.A02 = spannableString;
        this.A04 = list;
        this.A05 = z;
        this.A07 = z2;
        this.A01 = drawable;
        this.A00 = i;
        this.A06 = z3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C68809NXt) {
                C68809NXt nXt = (C68809NXt) obj;
                if (!0qQ.A0K(this.A03, nXt.A03) || !0qQ.A0K(this.A02, nXt.A02) || !0qQ.A0K(this.A04, nXt.A04) || this.A05 != nXt.A05 || this.A07 != nXt.A07 || !0qQ.A0K(this.A01, nXt.A01) || this.A00 != nXt.A00 || this.A06 != nXt.A06) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int A00() {
        return this.A00;
    }

    public final Drawable A01() {
        return this.A01;
    }

    public final SpannableString A02() {
        return this.A02;
    }

    public final 1aV A03() {
        return null;
    }

    public final String A04() {
        return this.A03;
    }

    public final List A05() {
        return this.A04;
    }

    public final boolean A06() {
        return this.A05;
    }

    public final boolean A07() {
        return this.A06;
    }

    public final boolean A08() {
        return this.A07;
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A03;
    }

    public final int hashCode() {
        int A09 = AnonymousClass7TF.A09(this.A05, AnonymousClass7TF.A07(this.A04, AnonymousClass7TF.A07(this.A02, AnonymousClass7TE.A0O(this.A03))));
        return AnonymousClass7TF.A09(this.A06, (((AnonymousClass7TF.A09(this.A07, A09) + AnonymousClass7TG.A0C(this.A01)) * 31) + this.A00) * 31);
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        String str;
        C68809NXt nXt = (C68809NXt) obj;
        String str2 = this.A03;
        if (nXt != null) {
            str = nXt.A03;
        } else {
            str = null;
        }
        if (0qQ.A0K(str2, str)) {
            if (Dba.A1X(nXt.A02, this.A02.toString()) && 0qQ.A0K(this.A04, nXt.A04) && this.A05 == nXt.A05 && this.A07 == nXt.A07 && 0qQ.A0K(this.A01, nXt.A01) && this.A00 == nXt.A00 && this.A06 == nXt.A06) {
                return true;
            }
            return false;
        }
        return false;
    }
}
