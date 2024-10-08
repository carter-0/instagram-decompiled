package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

public final class KE8 extends C228042kh {
    public final Context A00;
    public final AnonymousClass0iw A01;
    public final UserSession A02;
    public final C313666go A03;

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x006d, code lost:
        if (X.182.A06(X.0Tu.A05, r4, 36325686633313413L) == false) goto L_0x006f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x006f, code lost:
        r13 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0075, code lost:
        return new X.C60300Jiy(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0077, code lost:
        if (r6 == r2) goto L_0x0061;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ X.2YL create() {
        /*
            r14 = this;
            X.8Yd r0 = X.C357488Yc.A03
            android.content.Context r3 = r14.A00
            com.instagram.common.session.UserSession r4 = r14.A02
            X.8Yc r1 = r0.A00(r3, r4)
            X.6h0 r0 = X.C313776gz.A0K
            X.6go r6 = r14.A03
            X.6gz r0 = r0.A00(r4, r6)
            X.LES r10 = r0.A02()
            X.6h4 r9 = r0.A03
            X.JVe r11 = r0.A03()
            X.W0T r5 = r1.A00()
            X.6go r2 = X.C313666go.BROADCASTER
            if (r6 != r2) goto L_0x007a
            X.0iw r0 = r14.A01
            X.KbY r0 = X.C64139LPo.A01(r0, r4)
            X.M0X r7 = r0.A01(r3)
        L_0x002e:
            X.0iw r3 = r14.A01
            X.6go r1 = X.C313666go.GUEST
            X.AnonymousClass7TG.A1N(r4, r3)
            X.6gn r0 = X.C313646gm.A0A
            X.6gm r1 = r0.A00(r3, r4, r1)
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.video.live.mvvm.model.logger.store.IgLiveParticipantLoggerStore"
            X.0qQ.A0C(r1, r0)
            X.KbZ r1 = (X.C62177KbZ) r1
            X.M0W r8 = r1.A01
            if (r6 != r2) goto L_0x0076
            X.0Tu r3 = X.0Tu.A06
            r0 = 36325686633837705(0x810e0500083489, double:3.035848726813892E-306)
            boolean r0 = X.182.A06(r3, r4, r0)
            if (r0 != 0) goto L_0x0060
            X.0Tu r3 = X.0Tu.A05
            r0 = 36325686633378950(0x810e0500013486, double:3.0358487265237736E-306)
            boolean r0 = X.182.A06(r3, r4, r0)
            if (r0 == 0) goto L_0x0076
        L_0x0060:
            r12 = 1
        L_0x0061:
            X.0Tu r2 = X.0Tu.A05
            r0 = 36325686633313413(0x810e0500003485, double:3.035848726482328E-306)
            boolean r0 = X.182.A06(r2, r4, r0)
            r13 = 1
            if (r0 != 0) goto L_0x0070
        L_0x006f:
            r13 = 0
        L_0x0070:
            X.Jiy r3 = new X.Jiy
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return r3
        L_0x0076:
            r12 = 0
            if (r6 != r2) goto L_0x006f
            goto L_0x0061
        L_0x007a:
            r7 = 0
            goto L_0x002e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.KE8.create():X.2YL");
    }

    public KE8(Context context, AnonymousClass0iw r2, UserSession userSession, C313666go r4) {
        C51972G9s.A1B(userSession, r4);
        this.A02 = userSession;
        this.A01 = r2;
        this.A00 = context;
        this.A03 = r4;
    }
}
