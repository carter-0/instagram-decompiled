package X;

import android.content.Context;
import android.os.SystemClock;
import com.instagram.api.schemas.AFI_TYPE;
import com.instagram.common.session.UserSession;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: X.2uw  reason: invalid class name and case insensitive filesystem */
public final class C233092uw implements C233012uo, C233102ux {
    public int A00 = -1;
    public long A01;
    public long A02 = -1;
    public 1OC A03;
    public 1Xj A04;
    public AnonymousClass3W1 A05;
    public C233072uu A06;
    public Boolean A07;
    public Integer A08 = AnonymousClass05K.A00;
    public Integer A09;
    public String A0A = "";
    public String A0B = "";
    public final Context A0C;
    public final UserSession A0D;
    public final C233122uz A0E = new C233122uz(new C233112uy(this));
    public final C230662pz A0F;

    public final boolean A7L(C233632w4 r2, C233042ur r3, C233072uu r4) {
        return true;
    }

    public final int BWK() {
        return 0;
    }

    public final int BfG() {
        return 0;
    }

    public final /* synthetic */ void CJE(C376459Ib r1, List list) {
    }

    public final void Cmr() {
    }

    public final void Cn7(C233632w4 r1, C238523Ce r2, boolean z) {
    }

    public final /* synthetic */ void Cn8(AnonymousClass9J0 r2, C233632w4 r3, C238523Ce r4, String str, String str2, double d, boolean z) {
        0qQ.A0B(r3, 1);
        0qQ.A0B(r4, 3);
    }

    public final void Cn9(int i) {
    }

    public final void Cui(AFI_TYPE afi_type, 1Xj r11, AnonymousClass3W1 r12, Integer num, int i) {
        AFI_TYPE afi_type2;
        0qQ.A0B(r11, 0);
        0qQ.A0B(num, 3);
        if (SystemClock.elapsedRealtime() >= this.A01 + 1000) {
            this.A01 = SystemClock.elapsedRealtime();
            this.A09 = num;
            this.A00 = i;
            UserSession userSession = this.A0D;
            this.A07 = Boolean.valueOf(C231122qu.A0O(userSession, r11));
            String A0F2 = C231122qu.A0F(userSession, r11);
            if (A0F2 == null) {
                A0F2 = "";
            }
            this.A0B = A0F2;
            this.A0A = String.valueOf(r11.A2T());
            this.A04 = r11;
            this.A05 = r12;
            String A072 = C231122qu.A07(userSession, r11);
            if (A072 != null) {
                boolean A5o = r11.A5o();
                this.A08 = AnonymousClass05K.A01;
                Integer num2 = this.A09;
                if (num2 == null) {
                    0qQ.A0F("triggerSource");
                    throw AnonymousClass00P.createAndThrow();
                }
                if (num2 == AnonymousClass05K.A0C) {
                    afi_type2 = AFI_TYPE.DWELL_FEED_SEE_MORE_LESS;
                } else {
                    afi_type2 = AFI_TYPE.SEE_MORE_LESS;
                }
                1NY r3 = new 1NY(userSession, -2);
                r3.A08(AnonymousClass05K.A0N);
                r3.A0A("ads_feedback_interface/get/");
                r3.A0O((15p) null, C54046GyV.class, C56207Hua.class, false);
                r3.A9m("afi_type", afi_type2.A00);
                r3.A9m("ad_id", A072);
                r3.A0H("is_sensitive_ads", A5o);
                Context context = this.A0C;
                1G2.A00(context, r3, userSession, new 1Cn(context), false);
                1OC A0M = r3.A0M();
                A0M.A00 = new C54239H4i(this.A0E);
                this.A03 = A0M;
                1ES.A05(A0M, 1180321215, 2, true, true);
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
    }

    public final boolean D69(int i, int i2) {
        return false;
    }

    public final void DsJ(int i) {
    }

    public final boolean EsX(AFI_TYPE afi_type, 1Xj r8, Integer num) {
        0qQ.A0B(num, 1);
        if (r8 != null) {
            UserSession userSession = this.A0D;
            if ((!C231122qu.A0O(userSession, r8) || num != AnonymousClass05K.A0C || 182.A06(0Tu.A05, userSession, 36318965009816343L)) && r8.CcK() && 182.A06(0Tu.A05, userSession, 36314670042188533L)) {
                return true;
            }
        }
        return false;
    }

    public final void deactivate() {
    }

    public final /* synthetic */ boolean AFi() {
        return false;
    }

    public final /* synthetic */ AnonymousClass4lJ AN3() {
        return new C57364IYv();
    }

    public final /* synthetic */ String B4s() {
        return "";
    }

    public final /* synthetic */ Set Bsw() {
        return new HashSet();
    }

    public final boolean CTb() {
        if (this.A08 != AnonymousClass05K.A00) {
            return true;
        }
        return false;
    }

    public final /* synthetic */ void Cmj(boolean z) {
        throw new UnsupportedOperationException(AnonymousClass000.A00(110));
    }

    public C233092uw(Context context, UserSession userSession, C230662pz r6) {
        this.A0C = context;
        this.A0D = userSession;
        this.A0F = r6;
    }

    public final void EUa(AFI_TYPE afi_type, long j) {
        this.A02 = j;
    }
}
