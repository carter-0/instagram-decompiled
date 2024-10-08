package X;

import android.content.Context;

/* renamed from: X.JyL  reason: case insensitive filesystem */
public final class C61169JyL extends AnonymousClass0T0 implements C232262tL {
    public final int A00;
    public final Context A01;
    public final C63593Kzg A02;
    public final C69300Nj1 A03;
    public final Boolean A04;
    public final Integer A05;
    public final boolean A06;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C61169JyL) {
                C61169JyL jyL = (C61169JyL) obj;
                if (this.A00 != jyL.A00 || !0qQ.A0K(this.A05, jyL.A05) || !0qQ.A0K(this.A04, jyL.A04) || !0qQ.A0K(this.A01, jyL.A01) || !0qQ.A0K(this.A02, jyL.A02) || this.A06 != jyL.A06 || this.A03 != jyL.A03) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return String.valueOf(this.A00);
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A03, AnonymousClass7TF.A09(this.A06, ((((((((this.A00 * 31) + AnonymousClass7TG.A0C(this.A05)) * 31) + AnonymousClass7TG.A0C(this.A04)) * 31) + AnonymousClass7TG.A0C(this.A01)) * 31) + AnonymousClass7TE.A0L(this.A02)) * 31));
    }

    public C61169JyL(Context context, C63593Kzg kzg, C69300Nj1 nj1, Boolean bool, Integer num, int i, boolean z) {
        this.A00 = i;
        this.A05 = num;
        this.A04 = bool;
        this.A01 = context;
        this.A02 = kzg;
        this.A06 = z;
        this.A03 = nj1;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }
}
