package X;

import android.view.View;

/* renamed from: X.JyP  reason: case insensitive filesystem */
public final class C61173JyP extends AnonymousClass0T0 implements C232262tL {
    public final int A00 = 2131964094;
    public final View.OnClickListener A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C61173JyP) {
                C61173JyP jyP = (C61173JyP) obj;
                if (this.A00 != jyP.A00 || !0qQ.A0K(this.A01, jyP.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return Integer.valueOf(this.A00);
    }

    public final int hashCode() {
        return AnonymousClass7TF.A07(this.A01, this.A00 * 31);
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C61173JyP jyP = (C61173JyP) obj;
        0qQ.A0B(jyP, 0);
        return AnonymousClass7TF.A1S(this.A00, jyP.A00);
    }

    public C61173JyP(View.OnClickListener onClickListener) {
        this.A01 = onClickListener;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("ViewModel(textRes=");
        A1A.append(this.A00);
        A1A.append(", tapListener=");
        A1A.append(this.A01);
        A1A.append(AnonymousClass000.A00(2011));
        return C51975G9x.A0i((String) null, A1A);
    }
}
