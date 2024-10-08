package X;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.Mc4  reason: case insensitive filesystem */
public final class C66759Mc4 extends C392289uY {
    public final FragmentActivity A00;
    public final UserSession A01;
    public final AnonymousClass4kA A02;

    public final View A06(Context context) {
        0qQ.A0B(context, 0);
        return new C70609ODg(context, this).A00;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0024, code lost:
        if (r9.isMuted() != false) goto L_0x0027;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0026, code lost:
        r4 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0027, code lost:
        r3 = !X.AnonymousClass0oH.A01(r6.A00.getApplicationContext());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0033, code lost:
        if (r2 == false) goto L_0x006f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0035, code lost:
        if (r4 == false) goto L_0x006f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0037, code lost:
        r2 = r6.A02.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0042, code lost:
        if (r2.getBoolean("has_seen_broadcast_channel_pushability_upsell", false) != false) goto L_0x006f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0044, code lost:
        if (r3 == false) goto L_0x006f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0046, code lost:
        r5 = r6.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005c, code lost:
        if (((long) r2.getInt("broadcast_channel_visit_count_for_pushability", 0)) < X.182.A01(X.0Tu.A06, r5, 36600882374381608L)) goto L_0x006f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0069, code lost:
        if (X.182.A06(X.0Tu.A05, r5, 36319407397543280L) == false) goto L_0x006f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x006b, code lost:
        r8.DoM(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x006e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x006f, code lost:
        r8.onFailure();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0072, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000e, code lost:
        if (r9.C6a() != 29) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0011, code lost:
        if (r9 != null) goto L_0x0013;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        if (r9.COP() != true) goto L_0x0027;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001e, code lost:
        if (r9.BHS() != 7) goto L_0x0027;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A07(X.C39761A8b r7, X.C74401PuH r8, X.AnonymousClass2Ep r9, boolean r10) {
        /*
            r6 = this;
            r3 = 1
            X.0qQ.A0B(r8, r3)
            r4 = 0
            if (r9 == 0) goto L_0x0010
            int r1 = r9.C6a()
            r0 = 29
            r2 = 1
            if (r1 == r0) goto L_0x0013
        L_0x0010:
            r2 = 0
            if (r9 == 0) goto L_0x0027
        L_0x0013:
            boolean r0 = r9.COP()
            if (r0 != r3) goto L_0x0027
            int r1 = r9.BHS()
            r0 = 7
            if (r1 != r0) goto L_0x0027
            boolean r0 = r9.isMuted()
            if (r0 != 0) goto L_0x0027
            r4 = 1
        L_0x0027:
            androidx.fragment.app.FragmentActivity r0 = r6.A00
            android.content.Context r0 = r0.getApplicationContext()
            boolean r0 = X.AnonymousClass0oH.A01(r0)
            r3 = r0 ^ 1
            if (r2 == 0) goto L_0x006f
            if (r4 == 0) goto L_0x006f
            X.4kA r0 = r6.A02
            X.0xa r2 = r0.A00
            java.lang.String r0 = "has_seen_broadcast_channel_pushability_upsell"
            r1 = 0
            boolean r0 = r2.getBoolean(r0, r1)
            if (r0 != 0) goto L_0x006f
            if (r3 == 0) goto L_0x006f
            java.lang.String r0 = "broadcast_channel_visit_count_for_pushability"
            int r0 = r2.getInt(r0, r1)
            long r3 = (long) r0
            com.instagram.common.session.UserSession r5 = r6.A01
            X.0Tu r2 = X.0Tu.A06
            r0 = 36600882374381608(0x82084f00641028, double:3.209883621258159E-306)
            long r1 = X.182.A01(r2, r5, r0)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x006f
            X.0Tu r2 = X.0Tu.A05
            r0 = 36319407397543280(0x81084f00621d70, double:3.0318777124968427E-306)
            boolean r0 = X.182.A06(r2, r5, r0)
            if (r0 == 0) goto L_0x006f
            r8.DoM(r6)
            return
        L_0x006f:
            r8.onFailure()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66759Mc4.A07(X.A8b, X.PuH, X.2Ep, boolean):void");
    }

    public C66759Mc4(FragmentActivity fragmentActivity, UserSession userSession) {
        this.A00 = fragmentActivity;
        this.A01 = userSession;
        this.A02 = AnonymousClass4k9.A00(userSession);
    }
}
