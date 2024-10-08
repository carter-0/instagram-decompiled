package X;

import android.content.SharedPreferences;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: X.4CE  reason: invalid class name */
public final class AnonymousClass4CE implements C61110lV {
    public static AnonymousClass4CE A05;
    public long A00;
    public final SharedPreferences A01;
    public final AnonymousClass4CG A02;
    public final 1B5 A03;
    public final ScheduledExecutorService A04;

    public AnonymousClass4CE(1B5 r5) {
        AnonymousClass4CF r2;
        SharedPreferences sharedPreferences = r5.A05.getSharedPreferences("stash_utilization_metrics", 0);
        synchronized (AnonymousClass4CF.class) {
            r2 = AnonymousClass4CF.A02;
            if (r2 == null) {
                r2 = new AnonymousClass4CF();
                AnonymousClass4CF.A02 = r2;
            }
        }
        this.A00 = 0;
        this.A03 = r5;
        this.A02 = new AnonymousClass4CG(sharedPreferences, r2, r5.A03(AnonymousClass05K.A01));
        this.A01 = sharedPreferences;
        this.A04 = C61560nl.A00().A00;
    }

    public final void onAppBackgrounded() {
        int A032 = AnonymousClass0fD.A03(-1121844769);
        AnonymousClass4CG r4 = this.A02;
        r4.A03.execute(new C20148Wm8(r4, AnonymousClass4CG.A04));
        AnonymousClass0fD.A0A(708344107, A032);
    }

    public final void onAppForegrounded() {
        AnonymousClass0fD.A0A(1294444040, AnonymousClass0fD.A03(612862373));
    }
}
