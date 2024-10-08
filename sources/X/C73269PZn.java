package X;

import android.widget.ImageView;

/* renamed from: X.PZn  reason: case insensitive filesystem */
public final class C73269PZn implements Runnable {
    public final /* synthetic */ C69106Nel A00;
    public final /* synthetic */ boolean A01;

    public C73269PZn(C69106Nel nel, boolean z) {
        this.A00 = nel;
        this.A01 = z;
    }

    public final void run() {
        AnonymousClass61R r7;
        C69106Nel nel = this.A00;
        boolean z = this.A01;
        if (nel.A03 == null) {
            PMQ pmq = nel.A0G;
            pmq.A09.getValue();
            nel.A04 = new C67010Mgi(nel.A0A, C66583MXo.A0C(pmq.A0B), nel.A0B, false);
        }
        C67010Mgi mgi = nel.A04;
        if (mgi != null) {
            C71111Ocu.A02(nel.A0D, false);
            PMQ pmq2 = nel.A0G;
            DbW.A1R(pmq2.A09, 0);
            C66582MXn.A1P(pmq2.A0D, 0);
            int A002 = C69106Nel.A00(nel, nel.A05.A00);
            ImageView imageView = (ImageView) nel.A0H.getValue();
            AnonymousClass61R r2 = (AnonymousClass61R) nel.A0J.getValue();
            C72277Ozm ozm = new C72277Ozm(nel, z);
            if (r2 != null) {
                r7 = r2;
            } else {
                int i = mgi.A00;
                if (i == 3000) {
                    r7 = mgi.A0C;
                } else if (i != 10000) {
                    r7 = null;
                } else {
                    r7 = mgi.A0B;
                }
            }
            mgi.A04 = r2;
            C67010Mgi.A00(imageView, r7, ozm, mgi, AnonymousClass05K.A00, Integer.valueOf(A002), (long) mgi.A00, true, true);
        }
    }
}
