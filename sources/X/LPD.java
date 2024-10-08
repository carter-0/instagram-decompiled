package X;

import android.content.Context;
import android.view.View;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.spinner.SpinnerImageView;
import com.instagram.user.model.User;

public final class LPD {
    public C66464MSs A00;
    public L5A A01;
    public Integer A02 = AnonymousClass05K.A00;
    public String A03;
    public String A04;
    public final Context A05;
    public final AnonymousClass07i A06;
    public final User A07;
    public final 0sP A08;

    public LPD(Context context, AnonymousClass07i r4, UserSession userSession, User user) {
        C20785Wyw wyw = new C20785Wyw(userSession, 6);
        this.A05 = context;
        this.A06 = r4;
        this.A07 = user;
        this.A08 = wyw;
    }

    private final void A00(boolean z) {
        if (this.A02 == AnonymousClass05K.A00) {
            this.A02 = AnonymousClass05K.A01;
            C66464MSs mSs = this.A00;
            if (mSs != null) {
                C65681Lxw lxw = (C65681Lxw) mSs;
                if (2 - lxw.A00 == 0) {
                    LP7 lp7 = (LP7) lxw.A01;
                    SpinnerImageView spinnerImageView = lp7.A08;
                    if (spinnerImageView == null) {
                        View view = lp7.A01;
                        view.getClass();
                        spinnerImageView = (SpinnerImageView) DbY.A0F(view, R.id.loading_spinner);
                        lp7.A08 = spinnerImageView;
                    }
                    spinnerImageView.setVisibility(0);
                    DbS.A1T(lp7.A08);
                }
                Context context = this.A05;
                AnonymousClass07i r3 = this.A06;
                0sP r1 = this.A08;
                String str = this.A03;
                if (str != null) {
                    Object invoke = r1.invoke(str);
                    ((1OC) invoke).A00 = new KAJ(this, z);
                    1ES.A00(context, r3, (AnonymousClass11X) invoke);
                    return;
                }
                throw DbU.A0h();
            }
            JTO.A1K();
            throw AnonymousClass00P.createAndThrow();
        }
    }

    public final void A01() {
        if (this.A02 == AnonymousClass05K.A00 && this.A03 != null) {
            User user = this.A07;
            if (user.A1R() || user.A1Q()) {
                A00(true);
                return;
            }
        }
        C66464MSs mSs = this.A00;
        if (mSs != null) {
            mSs.ExP();
        } else {
            JTO.A1K();
            throw AnonymousClass00P.createAndThrow();
        }
    }

    public final void A02() {
        if (this.A02 == AnonymousClass05K.A00 && this.A03 != null) {
            User user = this.A07;
            if (user.A1R() || user.A1Q()) {
                A00(false);
            }
        }
    }

    public final void A03() {
        L5A l5a = this.A01;
        if (l5a != null) {
            C358248ab A0Y = DbS.A0Y(this.A05);
            A0Y.A05 = l5a.A01;
            A0Y.A0q(l5a.A00);
            Dba.A1M(A0Y);
            Dba.A1L(A0Y);
        }
    }

    public final void A04(String str) {
        String str2 = this.A03;
        if (str2 == null || !str2.equals(str)) {
            this.A03 = str;
            this.A02 = AnonymousClass05K.A00;
        }
    }

    public final boolean A05() {
        if (this.A02 != AnonymousClass05K.A0N || this.A01 == null) {
            return false;
        }
        return true;
    }

    public final boolean A06() {
        switch (this.A02.intValue()) {
            case 0:
            case 2:
                return true;
            default:
                return false;
        }
    }
}
