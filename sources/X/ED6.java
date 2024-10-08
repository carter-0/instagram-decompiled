package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

public abstract class ED6 extends 1P0 {
    public final Context A00;
    public final UserSession A01;
    public final 1Xj A02;
    public final Integer A03;
    public final AnonymousClass6ST A04;

    public ED6(Context context, UserSession userSession, 1Xj r5) {
        Integer num;
        this.A02 = r5;
        this.A01 = userSession;
        this.A00 = context;
        this.A04 = new AnonymousClass6ST(context);
        if (this instanceof ELD) {
            num = AnonymousClass05K.A0C;
        } else {
            if (!(this instanceof ELC)) {
                1Xj r1 = this.A02;
                if (r1.A5Y() || r1.A0C.BAG() != null || r1.A5x()) {
                    num = AnonymousClass05K.A01;
                }
            }
            num = AnonymousClass05K.A00;
        }
        this.A03 = num;
    }

    public void onFail(C268654dm r5) {
        int i;
        int A032 = AnonymousClass0fD.A03(-1594559832);
        Context context = this.A00;
        if (this instanceof ELD) {
            i = 2131971435;
        } else if (this instanceof ELC) {
            i = 2131963289;
        } else {
            i = 2131957571;
            if (this.A02.A5s()) {
                i = 2131957588;
            }
        }
        C59689JTv.A0F(context, "edit_media_callback_failure", i);
        AnonymousClass0fD.A0A(368184900, A032);
    }

    public void onFinish() {
        int A032 = AnonymousClass0fD.A03(-1999385497);
        this.A04.dismiss();
        AnonymousClass0fD.A0A(1316591152, A032);
    }

    public final void onStart() {
        Context context;
        int i;
        int A032 = AnonymousClass0fD.A03(1350833840);
        AnonymousClass6ST r4 = this.A04;
        int intValue = this.A03.intValue();
        if (intValue == 0) {
            context = this.A00;
            i = 2131957623;
        } else if (intValue != 1) {
            context = this.A00;
            i = 2131976092;
            if (intValue != 2) {
                i = 2131963398;
            }
        } else {
            context = this.A00;
            i = 2131972142;
        }
        DbU.A18(context, r4, i);
        AnonymousClass0fN.A00(r4);
        AnonymousClass0fD.A0A(-1931160970, A032);
    }

    public void onSuccess(Object obj) {
        int A032 = AnonymousClass0fD.A03(791900889);
        this.A02.AE7(this.A01);
        AnonymousClass0fD.A0A(2097192265, A032);
    }
}
