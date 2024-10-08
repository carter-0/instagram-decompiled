package X;

import android.content.Context;
import android.os.Build;
import java.util.Set;

/* renamed from: X.OTq  reason: case insensitive filesystem */
public final class C70969OTq {
    public static boolean A09;
    public boolean A00;
    public final Runnable A01;
    public final Runnable A02;
    public final Runnable A03;
    public final Set A04 = DbS.A0y();
    public final AnonymousClass0eM A05 = AnonymousClass0eN.A01(new TTN(this, 5));
    public final C62320sa A06;
    public final boolean A07;
    public volatile boolean A08;

    public C70969OTq(Context context, C62320sa r8) {
        AnonymousClass7TF.A1B(context, 1, r8);
        this.A06 = r8;
        int i = Build.VERSION.SDK_INT;
        boolean z = false;
        this.A00 = AnonymousClass7TF.A1T(i, 31);
        if (i >= 31 && context.getApplicationInfo().targetSdkVersion >= 31) {
            z = true;
        }
        this.A07 = z;
        this.A02 = new PUO(this);
        this.A03 = new PUP(this);
        this.A01 = new PUN(this);
        if (A09) {
            C71004OWb.A00.A03("ForegroundEligibilityStatus", "An instance ForegroundEligibilityStatus has already been instantiated in this process", (Throwable) null);
        }
        A09 = true;
    }

    public static final boolean A00(C70969OTq oTq) {
        return 0qQ.A0K(JTO.A0E(oTq.A05).getLooper().getThread(), Thread.currentThread());
    }
}
