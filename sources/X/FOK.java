package X;

import android.view.View;
import com.instagram.common.session.UserSession;
import java.util.Set;

public final class FOK implements View.OnClickListener {
    public final /* synthetic */ AnonymousClass0iw A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ C49594EzD A02;
    public final /* synthetic */ C322526vy A03;
    public final /* synthetic */ ONF A04;
    public final /* synthetic */ String A05;

    public FOK(AnonymousClass0iw r1, UserSession userSession, C49594EzD ezD, C322526vy r4, ONF onf, String str) {
        this.A02 = ezD;
        this.A03 = r4;
        this.A01 = userSession;
        this.A05 = str;
        this.A04 = onf;
        this.A00 = r1;
    }

    public final void onClick(View view) {
        Set A1F;
        int A052 = AnonymousClass0fD.A05(211624840);
        this.A02.A00.setVisibility(8);
        this.A03.A0D = false;
        1Av A002 = 1Au.A00(this.A01);
        String str = this.A05;
        0xa r3 = A002.A01;
        String A003 = C273654mx.A00(1424);
        if (r3.contains(A003)) {
            A1F = 00k.A0j(r3.C1t(A003));
        } else {
            A1F = AnonymousClass7TE.A1F();
        }
        A1F.add(str);
        0xY AR4 = r3.AR4();
        AR4.E5h(A003, A1F);
        AR4.apply();
        00y.A0n(10, str);
        this.A00.getModuleName();
        AnonymousClass0fD.A0C(1284869631, A052);
    }
}
