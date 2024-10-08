package X;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;

/* renamed from: X.4Dn  reason: invalid class name and case insensitive filesystem */
public final class C262394Dn extends C262404Do {
    public final int A00;
    public final int A01;
    public final Configuration A02;
    public final Integer A03;

    /* renamed from: CSn */
    public final boolean CSo(C262414Dp r4) {
        C262394Dn r42;
        0qQ.A0B(r4, 0);
        if (this == r4 || ((r4 instanceof C262394Dn) && (r42 = (C262394Dn) r4) != null && r42.A01 == this.A01 && 0qQ.A0K(r42.A02, this.A02) && r42.A00 == this.A00 && 0qQ.A0K(r42.A03, this.A03))) {
            return true;
        }
        return false;
    }

    public C262394Dn(Context context, AnonymousClass2V4 r4, Integer num, int i, int i2) {
        Drawable drawable;
        Configuration configuration = new Configuration(context.getResources().getConfiguration());
        if (i == 0 || (drawable = r4.A00.getDrawable(i)) == null) {
            throw new IllegalArgumentException(002.A0R(AnonymousClass000.A00(927), Integer.toHexString(i)));
        }
        this.A00 = drawable;
        this.A01 = i;
        this.A02 = configuration;
        this.A03 = num;
        this.A00 = i2;
    }
}
