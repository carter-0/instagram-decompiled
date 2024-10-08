package X;

import android.graphics.Bitmap;

public final class TA1 implements Cloneable {
    public final Bitmap A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public final /* bridge */ /* synthetic */ Object clone() {
        return new TA1(this.A00, this.A03, this.A01, this.A02);
    }

    public TA1(Bitmap bitmap, String str, String str2, String str3) {
        AnonymousClass7TG.A1U(str, str2, str3);
        this.A03 = str;
        this.A01 = str2;
        this.A02 = str3;
        this.A00 = bitmap;
    }
}
