package X;

import android.animation.Animator;

public final class UKL extends AnonymousClass0T0 {
    public float A00 = 0.0f;
    public int A01 = 1;
    public Animator.AnimatorListener A02 = null;
    public String A03 = "";
    public boolean A04 = true;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof UKL) {
                UKL ukl = (UKL) obj;
                if (!(0qQ.A0K(this.A03, ukl.A03) && this.A04 == ukl.A04 && this.A01 == ukl.A01 && 0qQ.A0K(this.A02, ukl.A02) && Float.compare(this.A00, ukl.A00) == 0)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((AnonymousClass7TF.A09(this.A04, AnonymousClass7TE.A0O(this.A03)) + this.A01) * 31) + AnonymousClass7TG.A0C(this.A02)) * 31) + Float.floatToIntBits(this.A00);
    }
}
