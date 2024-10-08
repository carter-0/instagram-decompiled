package X;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.instagram.common.session.UserSession;
import com.instagram.mainactivity.InstagramMainActivity;
import java.lang.ref.WeakReference;

/* renamed from: X.37Y  reason: invalid class name */
public final class AnonymousClass37Y implements C61110lV, AnonymousClass0lh {
    public long A00;
    public 0hq A01;
    public AnonymousClass2Zc A02;
    public Runnable A03 = AnonymousClass37Z.A00;
    public WeakReference A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public final Handler A08 = new Handler(Looper.getMainLooper());
    public final 02m A09;
    public final UserSession A0A;

    public final void A00() {
        UserSession userSession = this.A0A;
        0qQ.A0B(userSession, 0);
        if (182.A06(0Tu.A05, userSession, 36330836299367202L)) {
            this.A04 = null;
            this.A01 = null;
            this.A02 = null;
        }
    }

    public AnonymousClass37Y(UserSession userSession) {
        this.A0A = userSession;
        02m r0 = 02m.A0p;
        0qQ.A07(r0);
        this.A09 = r0;
        if (182.A06(0Tu.A05, userSession, 36323917106982507L)) {
            14i.A04(15Y.A02, this, true, false);
        } else {
            14i.A03(15Y.A03, this);
        }
    }

    public final void onAppBackgrounded() {
        int A032 = AnonymousClass0fD.A03(-1287486064);
        1Av A002 = 1Au.A00(this.A0A);
        long currentTimeMillis = System.currentTimeMillis();
        0xY AR4 = A002.A01.AR4();
        AR4.E5c("reset_to_main_feed_background_time", currentTimeMillis);
        AR4.apply();
        this.A07 = true;
        AnonymousClass0fD.A0A(1157651327, A032);
    }

    public final void onAppForegrounded() {
        int i;
        Bundle bundle;
        int A032 = AnonymousClass0fD.A03(-75182378);
        this.A00 = System.currentTimeMillis();
        UserSession userSession = this.A0A;
        0Tu r5 = 0Tu.A05;
        if (182.A06(r5, userSession, 36320524084585004L)) {
            if (!this.A07) {
                i = -1414931127;
            } else if (this.A02 == null || (bundle = InstagramMainActivity.A0s) == null || bundle.isEmpty()) {
                long j = this.A00 - 1Au.A00(userSession).A01.getLong("reset_to_main_feed_background_time", 0);
                String str = C71342cb.A00(userSession).A0B;
                if (182.A06(r5, userSession, 36320524084847152L) && str != null) {
                    WeakReference weakReference = this.A04;
                    if (C11343SOa.A01.A02(this.A01, userSession, str, weakReference, j / 1000)) {
                        02m r1 = this.A09;
                        r1.markerStart(728433975);
                        r1.markerAnnotate(728433975, AnonymousClass000.A00(869), str);
                        r1.markerEnd(728433975, 2);
                    }
                }
                if (182.A06(r5, userSession, 36320524085502518L) && str != null) {
                    try {
                        0hq r6 = this.A01;
                        WeakReference weakReference2 = this.A04;
                        C11343SOa.A01.A01(r6, userSession, this.A02, str, weakReference2, j / 1000);
                    } catch (Exception e) {
                        02m r3 = this.A09;
                        r3.markerAnnotate(728433975, AnonymousClass000.A00(871), e.toString());
                        r3.markerAnnotate(728433975, AnonymousClass000.A00(870), str);
                        r3.markerEnd(728433975, 3);
                    }
                }
            } else {
                i = -1530371187;
            }
            AnonymousClass0fD.A0A(i, A032);
        }
        i = 5431646;
        AnonymousClass0fD.A0A(i, A032);
    }

    public final void onSessionWillEnd() {
        14i.A06(this);
        if (JVU.A01(this.A0A, AnonymousClass05K.A0j)) {
            14i.A07(this);
        }
        this.A08.removeCallbacks(this.A03);
    }
}
