package X;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import java.util.Map;

/* renamed from: X.2pL  reason: invalid class name and case insensitive filesystem */
public final class C230292pL {
    public Integer A00;
    public Integer A01 = AnonymousClass05K.A00;
    public Integer A02;
    public Runnable A03;
    public String A04;
    public Map A05;
    public C62320sa A06;
    public boolean A07;
    public final Handler A08 = new Handler(Looper.getMainLooper());
    public final UserSession A09;
    public final long A0A;
    public final Activity A0B;

    public C230292pL(Activity activity, UserSession userSession, long j) {
        0qQ.A0B(userSession, 2);
        this.A0B = activity;
        this.A09 = userSession;
        this.A0A = j;
    }

    public final void A01(String str) {
        1Wj r3;
        0qQ.A0B(str, 0);
        if (this.A01 == AnonymousClass05K.A0C) {
            Map map = this.A05;
            if (map != null) {
                map.put(C46326Dbu.A00(), str);
            }
            String str2 = this.A04;
            if (!(str2 == null || (r3 = 1Wj.A00) == null)) {
                r3.A00(this.A0B, this.A09, str2, this.A05);
            }
            this.A00 = null;
            this.A05 = null;
            this.A02 = null;
            this.A01 = AnonymousClass05K.A0N;
            C62320sa r0 = this.A06;
            if (r0 != null) {
                r0.invoke();
            }
        }
    }

    public final void A02(String str, String str2) {
        0qQ.A0B(str, 0);
        if (this.A01 == AnonymousClass05K.A00 && !this.A07) {
            this.A07 = true;
            C57906IiN iiN = new C57906IiN(this, str, str2);
            this.A08.postDelayed(iiN, this.A0A);
            this.A03 = iiN;
        }
    }

    public final void A03(String str, String str2, String str3) {
        0qQ.A0B(str, 0);
        0qQ.A0B(str2, 1);
        Integer num = AnonymousClass05K.A01;
        this.A02 = num;
        this.A05 = 0Yt.A07(new 0eP[]{new 0eP("ad_id", str), new 0eP("multi_ads_unit_id", str2), new 0eP(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, this.A09.A06), new 0eP("trigger_type", "click")});
        this.A01 = num;
        this.A04 = str3;
    }

    public final void A00(int i) {
        Integer num = this.A00;
        if (num == null || i != num.intValue()) {
            this.A02 = null;
            this.A05 = null;
            this.A01 = AnonymousClass05K.A00;
            Runnable runnable = this.A03;
            if (runnable != null) {
                this.A08.removeCallbacks(runnable);
                this.A07 = false;
            }
        }
        this.A00 = Integer.valueOf(i);
    }
}
