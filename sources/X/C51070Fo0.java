package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Fo0  reason: case insensitive filesystem */
public final class C51070Fo0 implements G8L {
    public final UserSession A00;

    public final /* synthetic */ boolean AB8() {
        return false;
    }

    public final String AD3() {
        if (182.A06(0Tu.A05, this.A00, 36318148967405512L)) {
            return "back_arrow";
        }
        return "cross";
    }

    public final String AE9() {
        if (182.A06(0Tu.A05, this.A00, 36318148968519631L)) {
            return "down_arrow";
        }
        return "cross";
    }

    public final /* synthetic */ boolean APE() {
        return false;
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

    public final Boolean ARY() {
        return AnonymousClass7TF.A0R(0Tu.A05, this.A00, 2342161158180837317L);
    }

    public final /* synthetic */ boolean ARc() {
        return false;
    }

    public final /* synthetic */ boolean ARi() {
        return false;
    }

    public final Float Aod() {
        return DbW.A0Z(0Tu.A05, this.A00, 37162573896810736L);
    }

    public final Boolean Aoe() {
        return AnonymousClass7TF.A0R(0Tu.A05, this.A00, 36318148966815683L);
    }

    public final Boolean Aof() {
        return AnonymousClass7TF.A0R(0Tu.A05, this.A00, 36318148966619074L);
    }

    public final float B6O() {
        return (float) 182.A00(0Tu.A05, this.A00, 37169368534155758L);
    }

    public final Float BPC() {
        return DbW.A0Z(0Tu.A05, this.A00, 37162573896024303L);
    }

    public final String BQz() {
        return 182.A04(0Tu.A05, this.A00, 36881098919903602L);
    }

    public final String BR0() {
        return 182.A04(0Tu.A05, this.A00, 36881098919838065L);
    }

    public final /* synthetic */ float BT3() {
        return 0.0f;
    }

    public final /* synthetic */ boolean CLh() {
        return false;
    }

    public final boolean CTm() {
        return 182.A06(0Tu.A05, this.A00, 36324943603970551L);
    }

    public final /* synthetic */ boolean CTn() {
        return false;
    }

    public final boolean CWx() {
        return 182.A06(0Tu.A05, this.A00, 2342161158181033927L);
    }

    public final boolean CYH() {
        return 182.A06(0Tu.A05, this.A00, 36318148968323021L);
    }

    public final boolean Cd3() {
        return 182.A06(0Tu.A05, this.A00, 36318148967471049L);
    }

    public final boolean Ceb() {
        return 182.A06(0Tu.A05, this.A00, 2342161158182082510L);
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

    public final EVS backPressDestination() {
        String A04 = 182.A04(0Tu.A05, this.A00, 36881098921869683L);
        int hashCode = A04.hashCode();
        if (hashCode != -746053640) {
            if (hashCode != -285958901) {
                if (hashCode == 1579758726 && A04.equals("lowest_partial_state")) {
                    return EVS.LOWEST_PARTIAL_STATE;
                }
            } else if (A04.equals("previous_partial_state")) {
                return EVS.PREVIOUS_PARTIAL_STATE;
            }
        } else if (A04.equals("highest_partial_state")) {
            return EVS.HIGHEST_PARTIAL_STATE;
        }
        return EVS.CLOSED_STATE;
    }

    public final double getDragUpReleaseRatio() {
        return 182.A00(0Tu.A05, this.A00, 37162573898842354L);
    }

    public final /* synthetic */ double getSwipeDownDistanceAdjustment() {
        return 0.0d;
    }

    public final /* synthetic */ double getSwipeUpDistanceAdjustment() {
        return 0.0d;
    }

    public C51070Fo0(UserSession userSession) {
        this.A00 = userSession;
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

    public final boolean BNp() {
        if (!DbX.A1a(Aof())) {
            return true;
        }
        return DbY.A1Z(0Tu.A05, this.A00, 2342161158180968390L);
    }

    public final /* synthetic */ float getSwipeDownFlingVelocity() {
        return 3500.0f;
    }

    public final /* synthetic */ float getSwipeUpFlingVelocity() {
        return 3500.0f;
    }
}
