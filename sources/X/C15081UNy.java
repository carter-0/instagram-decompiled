package X;

import android.view.View;

/* renamed from: X.UNy  reason: case insensitive filesystem */
public final class C15081UNy extends AnonymousClass0T0 implements C232262tL {
    public final View.OnClickListener A00;
    public final Integer A01;
    public final Integer A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C15081UNy) {
                C15081UNy uNy = (C15081UNy) obj;
                if (!0qQ.A0K(this.A05, uNy.A05) || !0qQ.A0K(this.A06, uNy.A06) || !0qQ.A0K(this.A04, uNy.A04) || !0qQ.A0K(this.A03, uNy.A03) || !0qQ.A0K(this.A00, uNy.A00) || !0qQ.A0K(this.A01, uNy.A01) || !0qQ.A0K(this.A02, uNy.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        0qQ.A0B(obj, 0);
        return equals(obj);
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A05;
    }

    public final int hashCode() {
        return ((((((((((AnonymousClass7TF.A08(this.A06, AnonymousClass7TE.A0O(this.A05)) * 31 * 31) + AnonymousClass7TG.A0E(this.A04)) * 31) + AnonymousClass7TG.A0E(this.A03)) * 31) + AnonymousClass7TG.A0C(this.A00)) * 31) + AnonymousClass7TG.A0C(this.A01)) * 31) + AnonymousClass7TG.A0C(this.A02)) * 31;
    }

    public C15081UNy(View.OnClickListener onClickListener, Integer num, Integer num2, String str, String str2, String str3, String str4) {
        this.A05 = str;
        this.A06 = str2;
        this.A04 = str3;
        this.A03 = str4;
        this.A00 = onClickListener;
        this.A01 = num;
        this.A02 = num2;
    }
}
