package X;

import android.view.View;

/* renamed from: X.VBy  reason: case insensitive filesystem */
public abstract class C16946VBy {
    public static void A00(C17706Vcb vcb, int i, boolean z) {
        int i2;
        if (z) {
            vcb.A0A.setVisibility(i);
            vcb.A09.setVisibility(i);
        }
        if (i == 0) {
            i2 = AnonymousClass7TE.A0D(vcb.A02.getResources());
        } else {
            i2 = 0;
        }
        View view = vcb.A02;
        view.setPadding(0, i2, 0, i2);
        view.setVisibility(i);
        vcb.A01.setVisibility(i);
    }
}
