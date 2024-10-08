package X;

import android.content.Context;
import android.view.View;

/* renamed from: X.Mur  reason: case insensitive filesystem */
public final class C67787Mur extends AnonymousClass52S {
    public int A00;
    public final int A01;

    public final void A05(View view, AnonymousClass52U r7, AnonymousClass3AW r8) {
        AnonymousClass7TF.A1B(view, 0, r7);
        C252553pI r2 = this.A02;
        if (r2 != null) {
            int BaC = r2.BaC();
            float Ba8 = ((float) ((r2.A00 - r2.Ba8()) - BaC)) * 0.8f;
            int A002 = C2808154f.A00(view, r2) - BaC;
            if (A002 > 0) {
                A002 -= (int) Ba8;
            }
            int i = ((int) Ba8) - this.A00;
            if (Math.abs(A002) > i) {
                int i2 = -1;
                if (A002 > 0) {
                    i2 = 1;
                }
                A002 = i2 * i;
            }
            if (A002 < 0) {
                A002 -= this.A01;
            }
            int A0A = A0A(A002);
            if (A0A > 0) {
                r7.A00(this.A06, 0, A002, A0A);
            }
        }
    }

    public final int A09() {
        return -1;
    }

    public C67787Mur(Context context, int i) {
        super(context);
        this.A01 = i;
    }

    public final void A06(AnonymousClass52U r6, AnonymousClass3AW r7, int i, int i2) {
        AnonymousClass7TG.A1Q(r7, r6);
        this.A00 += i2;
        C252553pI r2 = this.A02;
        if (r2 != null) {
            if (((double) this.A00) >= Math.floor((double) (((float) ((r2.A00 - r2.Ba8()) - r2.BaC())) * 0.8f))) {
                A02();
                return;
            }
        }
        super.A06(r6, r7, i, i2);
    }
}
