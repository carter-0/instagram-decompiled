package X;

import android.content.DialogInterface;
import com.instagram.common.session.UserSession;

public final class LUU implements DialogInterface.OnClickListener {
    public final int A00;
    public final Object A01;
    public final boolean A02;
    public final boolean A03;

    public LUU(Object obj, int i, boolean z, boolean z2) {
        this.A00 = i;
        this.A01 = obj;
        this.A03 = z;
        this.A02 = z2;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.A00) {
            case 0:
                boolean z = this.A03;
                boolean z2 = this.A02;
                C367288qV r3 = C367288qV.A01;
                UserSession userSession = ((C65199Lp3) this.A01).A02;
                if (z2) {
                    r3.A0C(userSession, "REELS_ROW_SHARE", z, true);
                    return;
                } else {
                    C367288qV.A02(userSession, z);
                    return;
                }
            case 1:
                UaM.A01((UaM) this.A01, this.A03, this.A02);
                return;
            case 2:
                ((UaM) this.A01).A02().A07(this.A03, this.A02);
                return;
            case 3:
                C15311UaI.A00((C15311UaI) this.A01, this.A03, this.A02);
                return;
            default:
                ((C15311UaI) this.A01).A01().A01(this.A03, this.A02);
                return;
        }
    }
}
