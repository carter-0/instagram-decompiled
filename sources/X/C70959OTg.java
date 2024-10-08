package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.OTg  reason: case insensitive filesystem */
public final class C70959OTg {
    public O9Q A00;
    public String A01;
    public final Context A02;
    public final UserSession A03;
    public final OMP A04;
    public final Object A05 = new Object();

    public /* synthetic */ C70959OTg(Context context, UserSession userSession) {
        OMP omp = new OMP(context, userSession);
        this.A02 = context;
        this.A03 = userSession;
        this.A04 = omp;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0012, code lost:
        r2 = r0.A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C70959OTg r4, java.lang.String r5) {
        /*
            java.lang.Object r1 = r4.A05
            monitor-enter(r1)
            java.lang.String r0 = r4.A01     // Catch:{ all -> 0x0036 }
            boolean r0 = r5.equals(r0)     // Catch:{ all -> 0x0036 }
            if (r0 == 0) goto L_0x000e
            X.O9Q r0 = r4.A00     // Catch:{ all -> 0x0036 }
            goto L_0x000f
        L_0x000e:
            r0 = 0
        L_0x000f:
            monitor-exit(r1)
            if (r0 == 0) goto L_0x0035
            X.NfE r2 = r0.A00
            com.facebook.rsys.mediasync.gen.MediaSyncState r0 = r2.A00
            if (r0 == 0) goto L_0x0035
            X.Oe9 r1 = r2.A0A
            X.N36 r0 = r1.A0B(r0)
            X.Put r0 = r0.A00
            r2.A01 = r0
            X.05G r5 = r2.A0F
            com.facebook.rsys.mediasync.gen.MediaSyncState r4 = r2.A00
            java.lang.String r3 = r2.A03
            r2 = 0
            X.N36 r1 = r1.A0C(r4, r0)
            X.Jw8 r0 = new X.Jw8
            r0.<init>((com.facebook.rsys.mediasync.gen.MediaSyncState) r4, (X.N36) r1, (com.instagram.model.rtc.cowatch.RtcStartCoWatchPlaybackArguments) r2, (java.lang.String) r3)
            X.C66581MXm.A1T(r0, r5)
        L_0x0035:
            return
        L_0x0036:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70959OTg.A00(X.OTg, java.lang.String):void");
    }
}
