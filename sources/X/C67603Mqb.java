package X;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import com.instagram.shopping.fragment.destination.wishlist.WishListFeedFragment;

/* renamed from: X.Mqb  reason: case insensitive filesystem */
public final class C67603Mqb extends AnonymousClass52S {
    public final int A00;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C67603Mqb(Context context, Object obj, int i) {
        super(context);
        this.A00 = i;
        this.A01 = obj;
    }

    public final void A05(View view, AnonymousClass52U r6, AnonymousClass3AW r7) {
        int i;
        int i2;
        int i3;
        switch (this.A00) {
            case 0:
                C380649Yz r1 = (C380649Yz) this.A01;
                int[] A09 = r1.A09(view, r1.A04.A0D);
                i = A09[0];
                i2 = A09[1];
                i3 = A0A(Math.max(Math.abs(i), Math.abs(i2)));
                if (i3 <= 0) {
                    return;
                }
                break;
            case 3:
                AnonymousClass7TF.A1B(view, 0, r6);
                C66900Mei mei = (C66900Mei) this.A01;
                C252553pI r0 = mei.A02.A0D;
                if (r0 != null) {
                    int[] A092 = mei.A09(view, r0);
                    Integer A04 = 03t.A04(A092, 0);
                    Integer A042 = 03t.A04(A092, 1);
                    if (A04 != null && A042 != null) {
                        i = A04.intValue();
                        int abs = Math.abs(i);
                        i2 = A042.intValue();
                        i3 = A0A(Math.max(abs, Math.abs(i2)));
                        if (i3 <= 0) {
                            return;
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
                break;
            default:
                super.A05(view, r6, r7);
                return;
        }
        r6.A00(this.A06, i, i2, i3);
    }

    public final float A07(DisplayMetrics displayMetrics) {
        float f;
        float f2;
        switch (this.A00) {
            case 2:
                f = 250.0f / ((float) ((WishListFeedFragment) this.A01).A01.getCount());
                break;
            case 3:
                0qQ.A0B(displayMetrics, 0);
                f = ((C66900Mei) this.A01).A00;
                break;
            default:
                f2 = (float) displayMetrics.densityDpi;
                f = 100.0f;
                break;
        }
        f2 = (float) displayMetrics.densityDpi;
        return f / f2;
    }

    public final int A0B(int i) {
        switch (this.A00) {
            case 0:
                return Math.min(100, super.A0B(i));
            case 3:
                return Math.min(((C66900Mei) this.A01).A01, super.A0B(i));
            default:
                return super.A0B(i);
        }
    }
}
