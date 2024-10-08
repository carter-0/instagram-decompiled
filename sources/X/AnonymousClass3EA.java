package X;

import java.util.concurrent.TimeUnit;

/* renamed from: X.3EA  reason: invalid class name */
public final class AnonymousClass3EA implements C61110lV {
    public boolean A00;
    public boolean A01;
    public final 02m A02;
    public final 0xm A03;

    public AnonymousClass3EA(02m r2, 0xm r3) {
        0qQ.A0B(r3, 2);
        this.A02 = r2;
        this.A03 = r3;
    }

    public static final void A00(AnonymousClass3H3 r5, AnonymousClass3EA r6) {
        02m r4 = r6.A02;
        r4.markerAnnotate(20133815, "direct_inbox_icon_badge_count", r5.A02);
        int i = r5.A00;
        if (i != -1) {
            r4.markerAnnotate(20133815, "open_direct_inbox_icon_badge_count", i);
        }
        int i2 = r5.A01;
        if (i2 != -1) {
            r4.markerAnnotate(20133815, "e2ee_direct_inbox_icon_badge_count", i2);
        }
    }

    public static final void A01(AnonymousClass3EA r3) {
        02m r32 = r3.A02;
        r32.markerAnnotate(20133815, "cancel_reason", 002.A0R("app startup trigger changed: ", C64031Cc.A02));
        r32.markerEnd(20133815, 4);
    }

    public final void onAppBackgrounded() {
        int A032 = AnonymousClass0fD.A03(-1837103014);
        this.A01 = false;
        this.A00 = false;
        AnonymousClass0fD.A0A(565032560, A032);
    }

    public final void onAppForegrounded() {
        int i;
        int A032 = AnonymousClass0fD.A03(-1465458303);
        if (!this.A01 || !0qQ.A0K(C64031Cc.A02, "normal")) {
            i = 273021290;
        } else {
            02m r7 = this.A02;
            r7.markerStart(20133815, 0, C64031Cc.A08, TimeUnit.MILLISECONDS);
            r7.markerPoint(20133815, "app_foregrounded");
            0xa r6 = this.A03.A00;
            r7.markerAnnotate(20133815, "app_icon_badge_count", r6.getInt("launcher_badge_count", 0));
            int i2 = r6.getInt("launcher_badge_count_direct", 0);
            int i3 = r6.getInt("open_thread_count_for_launcher_badge", -1);
            int i4 = r6.getInt("armadillo_thread_count_for_launcher_badge", -1);
            r7.markerAnnotate(20133815, "app_icon_badge_count_direct", i2);
            if (i3 != -1) {
                r7.markerAnnotate(20133815, "open_app_icon_badge_count_direct", i3);
            }
            if (i4 != -1) {
                r7.markerAnnotate(20133815, "e2ee_app_icon_badge_count_direct", i4);
            }
            r7.markerAnnotate(20133815, "app_startup_type", C64031Cc.A09.toString());
            i = -886715019;
        }
        AnonymousClass0fD.A0A(i, A032);
    }
}
