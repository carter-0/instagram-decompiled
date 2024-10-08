package X;

import android.content.Context;
import com.instagram.android.R;

/* renamed from: X.Vh9  reason: case insensitive filesystem */
public final class C17856Vh9 {
    public int A00;
    public final int A01;
    public final int A02;
    public final X43 A03;

    public final void A00(2da r3, int i) {
        int i2 = this.A01;
        if (i == -2) {
            i = this.A02;
        } else if (i == -1) {
            i = i2;
        }
        if (i >= i2) {
            r3.ETf(i2);
            if (this.A00 != i) {
                this.A00 = i;
                this.A03.DIu();
                return;
            }
            return;
        }
        throw DbT.A0m();
    }

    public C17856Vh9(Context context, X43 x43) {
        this.A03 = x43;
        this.A01 = AnonymousClass3D4.A00(context);
        this.A02 = context.getResources().getDimensionPixelSize(R.dimen.bio_product_sticker_width);
    }
}
