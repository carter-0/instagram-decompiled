package X;

import android.util.LruCache;
import java.util.concurrent.TimeUnit;

/* renamed from: X.IjT  reason: case insensitive filesystem */
public final class C57974IjT implements Runnable {
    public final /* synthetic */ C267324bN A00;
    public final /* synthetic */ AnonymousClass3W1 A01;
    public final /* synthetic */ C55995Hr1 A02;
    public final /* synthetic */ boolean A03;
    public final /* synthetic */ boolean A04;

    public C57974IjT(C267324bN r1, AnonymousClass3W1 r2, C55995Hr1 hr1, boolean z, boolean z2) {
        this.A01 = r2;
        this.A04 = z;
        this.A02 = hr1;
        this.A00 = r1;
        this.A03 = z2;
    }

    public final void run() {
        0xY AR4;
        AnonymousClass3W1 r1 = this.A01;
        if (r1.A2h || r1.A1p || r1.A0n != null) {
            r1.A2L = true;
            return;
        }
        C51966G9m.A1N(r1.A3T, r1, true);
        r1.A1L = "delay_swipe_left_nudge_or_nux";
        if (this.A04) {
            C55995Hr1 hr1 = this.A02;
            C267324bN r3 = this.A00;
            LruCache lruCache = hr1.A01;
            if (lruCache.get(C51966G9m.A1B(r3)) == null) {
                lruCache.put(C51966G9m.A1B(r3), C51966G9m.A1B(r3));
                0xa r32 = hr1.A02;
                AnonymousClass7TG.A1L(r32.AR4(), r32, "KEY_NUX_SHOWN_COUNT", 0);
            }
        } else if (this.A03) {
            C55950HqE hqE = this.A02.A03;
            synchronized (hqE) {
                long millis = TimeUnit.MINUTES.toMillis(182.A01(0Tu.A06, hqE.A00, 36599018355559785L));
                long currentTimeMillis = System.currentTimeMillis();
                0xa r9 = hqE.A01;
                if ((!r9.contains("KEY_FIRST_NUDGE_TIMESTAMP_MS") || currentTimeMillis - r9.getLong("KEY_FIRST_NUDGE_TIMESTAMP_MS", currentTimeMillis) <= millis) && r9.getInt("KEY_NUDGE_SHOWN_COUNT", 0) != 0) {
                    AR4 = r9.AR4();
                    AR4.E5Z("KEY_NUDGE_SHOWN_COUNT", r9.getInt("KEY_NUDGE_SHOWN_COUNT", 0) + 1);
                } else {
                    AR4 = r9.AR4();
                    AR4.ED3("KEY_FIRST_NUDGE_TIMESTAMP_MS");
                    AR4.ED3("KEY_NUDGE_SHOWN_COUNT");
                    AR4.E5c("KEY_FIRST_NUDGE_TIMESTAMP_MS", currentTimeMillis);
                    AR4.E5Z("KEY_NUDGE_SHOWN_COUNT", 1);
                }
                AR4.apply();
            }
        }
    }
}
