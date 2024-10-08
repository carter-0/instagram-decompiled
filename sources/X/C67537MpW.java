package X;

import android.os.Handler;
import com.facebook.quicklog.MarkerEditor;

/* renamed from: X.MpW  reason: case insensitive filesystem */
public final class C67537MpW {
    public static C67537MpW A09;
    public static final C70135Nxp A0A = new Object();
    public Handler A00;
    public final 02m A01;
    public volatile int A02;
    public volatile int A03;
    public volatile int A04;
    public volatile boolean A05;
    public volatile boolean A06;
    public volatile boolean A07;
    public volatile boolean A08;

    public static final synchronized C67537MpW A00(02m r3) {
        C67537MpW mpW;
        synchronized (C67537MpW.class) {
            synchronized (A0A) {
                0qQ.A0B(r3, 0);
                mpW = A09;
                if (mpW == null) {
                    mpW = new C67537MpW(r3);
                    A09 = mpW;
                }
            }
        }
        return mpW;
    }

    public final void A01() {
        this.A08 = false;
        this.A07 = false;
        this.A06 = false;
        this.A05 = false;
        this.A02 = 0;
        this.A03 = 0;
        this.A04 = 0;
        02m r4 = this.A01;
        r4.markerStart(31797299);
        MarkerEditor withMarker = r4.withMarker(31797299);
        withMarker.setSurviveUserSwitch(true);
        withMarker.markerEditingCompleted();
        1a8 r5 = C70374O4b.A00;
        r5.A01();
        PUD.A00(1aD.A06.A0G(), r5, C74178PqK.A00(r4, 40), 3);
        Handler handler = this.A00;
        if (handler != null) {
            handler.removeCallbacksAndMessages((Object) null);
        }
        Handler A0D = AnonymousClass7TF.A0D();
        this.A00 = A0D;
        A0D.postDelayed(new PWB(this), 20000);
    }

    public final void A02(AnonymousClass3H3 r6) {
        02m r4 = this.A01;
        r4.markerAnnotate(31797299, "total_badge_count", r6.A02);
        int i = r6.A00;
        if (i != -1) {
            r4.markerAnnotate(31797299, "open_badge_count", i);
        }
        int i2 = r6.A01;
        if (i2 != -1) {
            r4.markerAnnotate(31797299, "e2ee_badge_count", i2);
        }
    }

    public final void A03(String str, String str2) {
        02m r2 = this.A01;
        r2.markerAnnotate(31797299, "from_pk", str);
        if (str2 != null && str2.length() != 0) {
            r2.markerAnnotate(31797299, "to_pk", str2);
        }
    }

    public C67537MpW(02m r1) {
        this.A01 = r1;
    }
}
