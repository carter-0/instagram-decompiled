package X;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Locale;

/* renamed from: X.Tp6  reason: case insensitive filesystem */
public final class C14058Tp6 extends C14072TpM {
    public X21 A00;
    public final LinearLayoutManager A01;

    public final void A02(int i, float f, int i2) {
        if (this.A00 != null) {
            float f2 = -f;
            int i3 = 0;
            while (true) {
                LinearLayoutManager linearLayoutManager = this.A01;
                if (i3 < linearLayoutManager.A0T()) {
                    View A0X = linearLayoutManager.A0X(i3);
                    if (A0X != null) {
                        this.A00.FHo(A0X, ((float) (C252553pI.A06(A0X) - i)) + f2);
                        i3++;
                    } else {
                        throw new IllegalStateException(String.format(Locale.US, "LayoutManager returned a null child at pos %d/%d while transforming pages", new Object[]{Integer.valueOf(i3), Integer.valueOf(linearLayoutManager.A0T())}));
                    }
                } else {
                    return;
                }
            }
        }
    }

    public C14058Tp6(LinearLayoutManager linearLayoutManager) {
        this.A01 = linearLayoutManager;
    }
}
