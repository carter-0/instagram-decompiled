package X;

import com.instagram.android.R;

public final class UO2 extends AnonymousClass0T0 implements C232262tL {
    public final int A00;
    public final Integer A01;
    public final Integer A02;
    public final String A03;

    public UO2(Integer num, Integer num2, String str, int i) {
        0qQ.A0B(str, 1);
        this.A03 = str;
        this.A00 = i;
        this.A01 = num;
        this.A02 = num2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof UO2) {
                UO2 uo2 = (UO2) obj;
                if (!0qQ.A0K(this.A03, uo2.A03) || this.A00 != uo2.A00 || !0qQ.A0K(this.A01, uo2.A01) || !0qQ.A0K(this.A02, uo2.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A03;
    }

    public final int hashCode() {
        return ((((AnonymousClass7TE.A0O(this.A03) + this.A00) * 31) + AnonymousClass7TG.A0C(this.A01)) * 31) + AnonymousClass7TE.A0L(this.A02);
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        UO2 uo2 = (UO2) obj;
        0qQ.A0B(uo2, 0);
        if (this.A00 != uo2.A00 || !0qQ.A0K(this.A01, uo2.A01)) {
            return false;
        }
        return true;
    }

    public UO2() {
        this((Integer) null, (Integer) null, AnonymousClass7TF.A0b(), R.dimen.abc_button_padding_horizontal_material);
    }
}
