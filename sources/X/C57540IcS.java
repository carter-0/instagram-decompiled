package X;

import android.content.Context;

/* renamed from: X.IcS  reason: case insensitive filesystem */
public final class C57540IcS implements C59561JOh {
    public final Integer A00;

    public C57540IcS(Integer num) {
        0qQ.A0B(num, 1);
        this.A00 = num;
    }

    public final /* bridge */ /* synthetic */ Object EIh(Context context, C59535JNh jNh) {
        Integer num;
        int i;
        boolean A1U = AnonymousClass7TF.A1U(0, context, jNh);
        Integer num2 = AnonymousClass05K.A00;
        C21255XRa xRa = C21255XRa.A0R;
        int intValue = this.A00.intValue();
        if (intValue == 0) {
            num = AnonymousClass05K.A01;
        } else if (intValue == A1U) {
            num = AnonymousClass05K.A0N;
        } else if (intValue == 2) {
            num = AnonymousClass05K.A0Y;
        } else {
            throw AnonymousClass7TE.A1K();
        }
        C57544IcW icW = new C57544IcW(xRa, (C56060Hs9) null, num2, num, A1U);
        int i2 = 20;
        if (intValue != 0) {
            i = 40;
            if (intValue != A1U) {
                i = 48;
            }
        } else {
            i2 = 12;
            i = 28;
        }
        return new C56121Ht9(icW, i2, i2, i);
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C57540IcS) && this.A00 == ((C57540IcS) obj).A00);
    }

    public final int hashCode() {
        String str;
        int intValue = this.A00.intValue();
        switch (intValue) {
            case 1:
                str = "DP40";
                break;
            case 2:
                str = "DP48";
                break;
            default:
                str = "DP28";
                break;
        }
        return C51968G9o.A0F(str, intValue) + 1231;
    }

    public final String toString() {
        String str;
        switch (this.A00.intValue()) {
            case 1:
                str = "DP40";
                break;
            case 2:
                str = "DP48";
                break;
            default:
                str = "DP28";
                break;
        }
        return 002.A0m("CdsStackedPhotoVariant(photoSize=", str, ", isOffsetDiagonally=", ')', true);
    }
}
