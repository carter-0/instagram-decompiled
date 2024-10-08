package X;

import android.view.View;
import com.instagram.android.R;

/* renamed from: X.Qgi  reason: case insensitive filesystem */
public abstract class C8090Qgi extends C10783Ry4 {
    /* JADX WARNING: type inference failed for: r6v0, types: [X.RwX, X.QgW] */
    public static C8097Qgp A00(View.OnClickListener onClickListener, SST sst, SO0 so0, boolean z) {
        boolean z2;
        C12397Ssl ssl;
        C8092Qgk A00 = C8092Qgk.A00(14);
        A00.A02 = so0;
        ? rwX = new C10693RwX();
        rwX.A00 = new C12397Ssl((Integer) null, 15, R.drawable.radio_button_background, R.dimen.account_recs_header_image_margin);
        if (z) {
            z2 = false;
            ssl = new C12397Ssl(16, (Integer) null, R.drawable.radio_button_center, 0);
        } else {
            z2 = false;
            ssl = new C12397Ssl((Integer) null, (Integer) null, 0, 0);
        }
        rwX.A02 = ssl;
        C8080QgY A02 = SIE.A02(rwX, A00);
        A02.A04 = sst;
        A02.A03 = z2;
        A00.A01(new C8086Qge(A02), 1);
        A00.A03 = onClickListener;
        return new C8097Qgp(A00);
    }
}
