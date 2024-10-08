package X;

import android.view.View;

/* renamed from: X.Uq5  reason: case insensitive filesystem */
public final class C16180Uq5 extends V2X {
    public final View.OnClickListener A00;
    public final String A01;
    public final String A02;

    public C16180Uq5(String str, String str2, View.OnClickListener onClickListener) {
        0qQ.A0B(str, 1);
        this.A02 = str;
        this.A01 = str2;
        this.A00 = onClickListener;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C16180Uq5) {
                C16180Uq5 uq5 = (C16180Uq5) obj;
                if (!0qQ.A0K(this.A02, uq5.A02) || !0qQ.A0K(this.A01, uq5.A01) || !0qQ.A0K(this.A00, uq5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A00, AnonymousClass7TF.A08(this.A01, AnonymousClass7TE.A0O(this.A02)));
    }
}
