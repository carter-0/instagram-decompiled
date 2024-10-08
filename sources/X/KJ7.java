package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.DisplayMetrics;

public final class KJ7 extends 0ng {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ Bitmap A02;
    public final /* synthetic */ MTS A03;
    public final /* synthetic */ String A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KJ7(Context context, Bitmap bitmap, MTS mts, String str, int i) {
        super(68, 1, false, true);
        this.A01 = context;
        this.A02 = bitmap;
        this.A00 = i;
        this.A04 = str;
        this.A03 = mts;
    }

    public final void run() {
        Context context = this.A01;
        DisplayMetrics A0E = AnonymousClass7TF.A0E(context);
        LTL.A07(LTL.A01(context, this.A02, A0E.widthPixels / 2, A0E.heightPixels / 2, this.A00, false), this.A03, LTL.A02(this.A04));
    }
}
