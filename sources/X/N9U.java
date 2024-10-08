package X;

import android.graphics.Bitmap;

public final class N9U extends AnonymousClass0T0 implements C74270Pry {
    public final Bitmap A00;
    public final Integer A01;
    public final boolean A02;
    public final boolean A03;

    public N9U(Bitmap bitmap, Integer num, boolean z, boolean z2) {
        0qQ.A0B(bitmap, 1);
        this.A00 = bitmap;
        this.A02 = z;
        this.A03 = z2;
        this.A01 = num;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof N9U) {
                N9U n9u = (N9U) obj;
                if (!(0qQ.A0K(this.A00, n9u.A00) && this.A02 == n9u.A02 && this.A03 == n9u.A03 && this.A01 == n9u.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str;
        int A09 = AnonymousClass7TF.A09(this.A03, AnonymousClass7TF.A09(this.A02, AnonymousClass7TE.A0K(this.A00)));
        int intValue = this.A01.intValue();
        switch (intValue) {
            case 1:
                str = "DIRECT";
                break;
            case 2:
                str = "CAMERA";
                break;
            default:
                str = "STORIES";
                break;
        }
        return A09 + C51966G9m.A04(str, intValue);
    }
}
