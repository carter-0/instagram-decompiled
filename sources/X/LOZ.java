package X;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.ui.primer.PrimerBottomSheetConfig;

public final class LOZ {
    public View.OnClickListener A00 = null;
    public View.OnClickListener A01 = null;
    public C331157Pu A02;
    public CharSequence A03;
    public final UserSession A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final PrimerBottomSheetConfig A08;

    public LOZ(UserSession userSession, PrimerBottomSheetConfig primerBottomSheetConfig, CharSequence charSequence, boolean z, boolean z2, boolean z3) {
        0qQ.A0B(userSession, 1);
        this.A04 = userSession;
        this.A08 = primerBottomSheetConfig;
        this.A03 = charSequence;
        this.A05 = z;
        this.A07 = z2;
        this.A06 = z3;
    }

    public final void A02(Context context) {
        0qQ.A0B(context, 0);
        C331127Pr A0W = DbS.A0W(this.A04);
        A0W.A0k = this.A05;
        A0W.A0q = false;
        A0W.A11 = this.A06;
        A0W.A0y = this.A07;
        C331157Pu A002 = A0W.A00();
        this.A02 = A002;
        0qQ.A0C(A002, "null cannot be cast to non-null type com.instagram.igds.components.bottomsheet.BottomSheet");
        this.A02 = A002.A03(context, A00(this));
    }

    public static final K5L A00(LOZ loz) {
        UserSession userSession = loz.A04;
        PrimerBottomSheetConfig primerBottomSheetConfig = loz.A08;
        0qQ.A0B(primerBottomSheetConfig, 1);
        Bundle A09 = DbY.A09(userSession);
        A09.putParcelable("arg_config", primerBottomSheetConfig);
        K5L k5l = new K5L();
        k5l.setArguments(A09);
        k5l.A00 = loz.A00;
        k5l.A01 = loz.A01;
        k5l.A03 = loz.A03;
        return k5l;
    }

    public final void A01() {
        DbW.A1K(this.A02);
    }
}
