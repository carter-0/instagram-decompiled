package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Fny  reason: case insensitive filesystem */
public final class C51068Fny implements C51963G9j {
    public final C246623eu A00;
    public final UserSession A01;

    public final /* synthetic */ boolean AB8() {
        return false;
    }

    public final String AD3() {
        if (182.A06(0Tu.A05, this.A01, 36321365896930608L)) {
            return "cross";
        }
        return "back_arrow";
    }

    public final /* synthetic */ String AE9() {
        return "cross";
    }

    public final boolean APE() {
        UserSession userSession = this.A01;
        if (!C49203Er8.A00(userSession).booleanValue() || !182.A06(0Tu.A05, userSession, 36321365897389364L)) {
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
        if (!C49203Er8.A00(userSession).booleanValue()) {
            return Float.valueOf(0.2f);
        }
        C246623eu r22 = this.A00;
        if (!r22.A03 || !AnonymousClass4U5.A00(r22)) {
            r2 = 0Tu.A05;
            j = 37165790827446674L;
        } else {
            r2 = 0Tu.A05;
            j = 37165790827774357L;
        }
        return DbW.A0Z(r2, userSession, j);
    }

    public final Boolean Aoe() {
        boolean z;
        UserSession userSession = this.A01;
        if (C49203Er8.A00(userSession).booleanValue()) {
            z = 182.A06(0Tu.A05, userSession, 36321365897127218L);
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public final Boolean Aof() {
        boolean z;
        UserSession userSession = this.A01;
        if (C49203Er8.A00(userSession).booleanValue()) {
            C246623eu r2 = this.A00;
            if (!r2.A03 || !AnonymousClass4U5.A00(r2) || !182.A06(0Tu.A05, userSession, 36321365897454901L)) {
                z = 182.A06(0Tu.A05, userSession, 36321365897389364L);
                return Boolean.valueOf(z);
            }
        }
        z = false;
        return Boolean.valueOf(z);
    }

    public final boolean BNp() {
        UserSession userSession = this.A01;
        if (C49203Er8.A00(userSession).booleanValue()) {
            return DbY.A1Z(0Tu.A05, userSession, 36321365897061681L);
        }
        return true;
    }

    public final Float BPC() {
        return DbW.A0Z(0Tu.A05, this.A01, 37165790827643283L);
    }

    public final String BQz() {
        UserSession userSession = this.A01;
        if (C49203Er8.A00(userSession).booleanValue()) {
            return 182.A04(0Tu.A05, userSession, 36884315850408501L);
        }
        return "disabled";
    }

    public final String BR0() {
        UserSession userSession = this.A01;
        if (C49203Er8.A00(userSession).booleanValue()) {
            return 182.A04(0Tu.A05, userSession, 36884315850670646L);
        }
        return "expand_browser";
    }

    public final float BT3() {
        UserSession userSession = this.A01;
        if (C49203Er8.A00(userSession).booleanValue()) {
            return (float) 182.A00(0Tu.A05, userSession, 37165790827708820L);
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

    public C51068Fny(UserSession userSession, C246623eu r2) {
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
