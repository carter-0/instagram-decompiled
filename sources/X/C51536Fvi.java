package X;

import android.app.Activity;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.Fvi  reason: case insensitive filesystem */
public final /* synthetic */ class C51536Fvi implements Runnable {
    public final /* synthetic */ C268654dm A00;
    public final /* synthetic */ C49708F2t A01;
    public final /* synthetic */ C47695EDe A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ AtomicBoolean A04;

    public /* synthetic */ C51536Fvi(C268654dm r1, C49708F2t f2t, C47695EDe eDe, String str, AtomicBoolean atomicBoolean) {
        this.A02 = eDe;
        this.A04 = atomicBoolean;
        this.A01 = f2t;
        this.A00 = r1;
        this.A03 = str;
    }

    public final void run() {
        C47695EDe eDe = this.A02;
        AtomicBoolean atomicBoolean = this.A04;
        C49708F2t f2t = this.A01;
        C268654dm r1 = this.A00;
        String str = this.A03;
        atomicBoolean.set(true);
        String str2 = eDe.A0A;
        G8H g8h = eDe.A06;
        AnonymousClass0aP r4 = eDe.A05;
        Activity activity = eDe.A01;
        activity.getClass();
        EM4 em4 = (EM4) r1.A00();
        if (em4 != null) {
            F6O.A01(activity, r4, f2t, em4, g8h, str2, str);
        }
    }
}
