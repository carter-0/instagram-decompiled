package X;

import android.view.View;

/* renamed from: X.N3z  reason: case insensitive filesystem */
public final class C68184N3z extends AnonymousClass0T0 {
    public final View.OnClickListener A00;
    public final View.OnClickListener A01;
    public final C266444Yx A02;
    public final C74276Ps4 A03;
    public final Integer A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;

    public C68184N3z(View.OnClickListener onClickListener, View.OnClickListener onClickListener2, C266444Yx r4, C74276Ps4 ps4, Integer num, boolean z, boolean z2, boolean z3) {
        0qQ.A0B(ps4, 6);
        this.A05 = z;
        this.A02 = r4;
        this.A04 = num;
        this.A06 = z2;
        this.A07 = z3;
        this.A03 = ps4;
        this.A01 = onClickListener;
        this.A00 = onClickListener2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C68184N3z) {
                C68184N3z n3z = (C68184N3z) obj;
                if (this.A05 != n3z.A05 || !0qQ.A0K(this.A02, n3z.A02) || !0qQ.A0K(this.A04, n3z.A04) || this.A06 != n3z.A06 || this.A07 != n3z.A07 || !0qQ.A0K(this.A03, n3z.A03) || !0qQ.A0K(this.A01, n3z.A01) || !0qQ.A0K(this.A00, n3z.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((AnonymousClass7TF.A07(this.A03, AnonymousClass7TF.A09(this.A07, AnonymousClass7TF.A09(this.A06, (((C51965G9l.A05(this.A05) + AnonymousClass7TG.A0C(this.A02)) * 31) + AnonymousClass7TG.A0C(this.A04)) * 31))) + AnonymousClass7TG.A0C(this.A01)) * 31) + AnonymousClass7TE.A0L(this.A00);
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("UiState(isPlaceholder=");
        A1A.append(this.A05);
        A1A.append(", title=");
        A1A.append(this.A02);
        A1A.append(", titleHighlightColor=");
        A1A.append(this.A04);
        A1A.append(", shouldSetLinkMovementMethodForTitle=");
        A1A.append(this.A06);
        A1A.append(", shouldShowVerifiedBadge=");
        A1A.append(this.A07);
        A1A.append(", timestampState=");
        A1A.append(this.A03);
        A1A.append(", textContainerOnClickListener=");
        A1A.append(this.A01);
        A1A.append(", headerContainerOnClickListener=");
        return AnonymousClass7TG.A0n(this.A00, A1A);
    }

    public C68184N3z() {
        this((View.OnClickListener) null, (View.OnClickListener) null, (C266444Yx) null, PQ6.A00, (Integer) null, false, false, false);
    }
}
