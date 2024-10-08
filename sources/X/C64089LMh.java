package X;

import android.content.Context;
import android.view.View;

/* renamed from: X.LMh  reason: case insensitive filesystem */
public final class C64089LMh {
    public final Context A00;
    public final View A01;
    public final C57452Iaw A02;
    public final C57451Iav A03;

    public static final void A00(C340307l3 r4, X7C x7c, int i, int i2) {
        r4.setInitialCameraFacing(1);
        C340177kp r1 = C340177kp.HIGH;
        r4.Ej6(new C382469dk(r1, r1, (C340147km) null));
        r4.Egd(x7c.Ajl().getSurfaceTexture(), i, i2);
        r4.AJI(new C15099UOz(4, x7c, r4), (C341047mF) null, AnonymousClass80L.A00);
    }

    public C64089LMh(View view) {
        this.A01 = view;
        Context A0S = AnonymousClass7TE.A0S(view);
        this.A00 = A0S;
        C57451Iav iav = new C57451Iav(A0S);
        iav.A05.setText(AnonymousClass7TE.A16(A0S, 2131965220));
        this.A03 = iav;
        this.A02 = new C57452Iaw(A0S);
    }
}
