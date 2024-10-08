package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Fnw  reason: case insensitive filesystem */
public final class C51066Fnw implements C51963G9j {
    public final C246623eu A00;
    public final UserSession A01;

    public final /* synthetic */ boolean AB8() {
        return false;
    }

    public final String AD3() {
        if (182.A06(0Tu.A06, this.A01, 36319239890017335L)) {
            return "cross";
        }
        return "back_arrow";
    }

    public final /* synthetic */ String AE9() {
        return "cross";
    }

    public final boolean APE() {
        UserSession userSession = this.A01;
        if (!I2T.A02(userSession) || !182.A06(0Tu.A06, userSession, 36319239889427505L)) {
            return false;
        }
        return AnonymousClass7TF.A1Y(Aoe(), false);
    }

    public final /* synthetic */ boolean APM() {
        return false;
    }

    public final /* synthetic */ boolean ARM() {
        return false;
    }

    public final /* synthetic */ boolean ARX() {
        return false;
    }

    public final /* synthetic */ boolean ARc() {
        return true;
    }

    public final /* synthetic */ boolean ARi() {
        return false;
    }

    public final Float Aod() {
        0Tu r2;
        long j;
        UserSession userSession = this.A01;
        if (!I2T.A02(userSession)) {
            return Float.valueOf(0.2f);
        }
        C246623eu r1 = this.A00;
        if (!r1.A03 || !AnonymousClass4U5.A00(r1)) {
            r2 = 0Tu.A06;
            j = 37163664819355945L;
        } else {
            r2 = 0Tu.A06;
            j = 37163664819421482L;
        }
        return DbW.A0Z(r2, userSession, j);
    }

    public final Boolean Aoe() {
        UserSession userSession = this.A01;
        if (I2T.A02(userSession)) {
            return AnonymousClass7TF.A0R(0Tu.A06, userSession, 36319239889493042L);
        }
        return AnonymousClass7TE.A0u();
    }

    public final Boolean Aof() {
        boolean A06;
        UserSession userSession = this.A01;
        if (!I2T.A02(userSession)) {
            return AnonymousClass7TE.A0u();
        }
        C246623eu r1 = this.A00;
        if (!r1.A03 || !AnonymousClass4U5.A00(r1) || !182.A06(0Tu.A06, userSession, 36319239890607167L)) {
            A06 = 182.A06(0Tu.A06, userSession, 36319239889427505L);
        } else {
            A06 = false;
        }
        return Boolean.valueOf(A06);
    }

    public final boolean BNp() {
        UserSession userSession = this.A01;
        if (I2T.A02(userSession)) {
            return 182.A06(0Tu.A06, userSession, 36319239889361968L);
        }
        return true;
    }

    public final Float BPC() {
        return DbW.A0Z(0Tu.A06, this.A01, 37163664819880235L);
    }

    public final String BQz() {
        UserSession userSession = this.A01;
        if (I2T.A02(userSession)) {
            return 182.A04(0Tu.A06, userSession, 36882189842973109L);
        }
        return "disabled";
    }

    public final String BR0() {
        UserSession userSession = this.A01;
        if (I2T.A02(userSession)) {
            return 182.A04(0Tu.A06, userSession, 36882189843038646L);
        }
        return "expand_browser";
    }

    public final float BT3() {
        UserSession userSession = this.A01;
        if (I2T.A02(userSession)) {
            return (float) 182.A00(0Tu.A06, userSession, 37163664819028264L);
        }
        return 0.2f;
    }

    public final /* synthetic */ boolean CLh() {
        return false;
    }

    public final /* synthetic */ boolean CTm() {
        return false;
    }

    public final /* synthetic */ boolean CTn() {
        return false;
    }

    public final /* synthetic */ boolean CWx() {
        return false;
    }

    public final /* synthetic */ boolean CYH() {
        return false;
    }

    public final /* synthetic */ boolean Cd3() {
        return false;
    }

    public final /* synthetic */ boolean Ceb() {
        return false;
    }

    public final /* synthetic */ boolean EDM() {
        return false;
    }

    public final /* synthetic */ boolean Et7() {
        return false;
    }

    public final /* synthetic */ boolean Ezb() {
        return false;
    }

    public final /* synthetic */ EVS backPressDestination() {
        return EVS.CLOSED_STATE;
    }

    public final /* synthetic */ double getDragUpReleaseRatio() {
        return 0.5d;
    }

    public final /* synthetic */ double getSwipeDownDistanceAdjustment() {
        return 0.0d;
    }

    public final /* synthetic */ double getSwipeUpDistanceAdjustment() {
        return 0.0d;
    }

    public C51066Fnw(UserSession userSession, C246623eu r2) {
        this.A01 = userSession;
        this.A00 = r2;
    }

    public final /* synthetic */ Boolean ARY() {
        return AnonymousClass7TE.A0u();
    }

    public final /* synthetic */ float B6O() {
        return 0.35f;
    }

    public final /* synthetic */ float B6P() {
        return 0.45f;
    }

    public final /* synthetic */ Boolean BD5() {
        return AnonymousClass7TE.A0u();
    }

    public final /* synthetic */ Boolean BD6() {
        return AnonymousClass7TE.A0u();
    }

    public final /* synthetic */ float getSwipeDownFlingVelocity() {
        return 3500.0f;
    }

    public final /* synthetic */ float getSwipeUpFlingVelocity() {
        return 3500.0f;
    }
}
