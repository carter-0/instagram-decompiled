package X;

import android.app.ActivityManager;
import com.instagram.common.session.UserSession;

/* renamed from: X.7tX  reason: invalid class name and case insensitive filesystem */
public final class C345467tX extends C345477tY implements C345487tZ {
    public volatile C345167t2 A00;
    public volatile C345257tC A01;

    public final void A09() {
        C343717qg r0 = C345167t2.A01;
        C343837qt r2 = this.A00;
        this.A00 = (C345167t2) r2.Ape(r0);
        C343717qg r1 = C345257tC.A00;
        if (r2.CQN(r1)) {
            this.A01 = (C345257tC) r2.Ape(r1);
        }
    }

    public final C344287rc BJx() {
        C344287rc r0 = C345487tZ.A00;
        0qQ.A08(r0);
        return r0;
    }

    public final boolean CL7(String str, String str2) {
        long j;
        Number number;
        boolean CTO;
        Number number2;
        C343717qg r2 = C345317tI.A00;
        C343837qt r1 = this.A00;
        if (!r1.CQN(r2)) {
            return true;
        }
        C345307tH r22 = (C345307tH) ((C345317tI) r1.Ape(r2));
        C345327tJ r0 = r22.A01;
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        r0.A00.getMemoryInfo(memoryInfo);
        long j2 = memoryInfo.availMem;
        C343967r6 r6 = r22.A02;
        boolean z = r6 instanceof C343947r4;
        if (z) {
            j = 182.A01(0Tu.A06, ((C343947r4) r6).A00, 36606985516488195L);
        } else {
            j = 0;
        }
        if (j2 < j) {
            CTO = r6.CTO(130);
        } else if (!z) {
            return true;
        } else {
            UserSession userSession = ((C343947r4) r6).A00;
            0Tu r9 = 0Tu.A06;
            if ((182.A01(r9, userSession, 36606985516619268L) != 10 || (number2 = (Number) C39615A2f.A00.get(str)) == null || j2 >= number2.longValue()) && (182.A01(r9, userSession, 36606985516619268L) != 30 || (number = (Number) C39615A2f.A01.get(str)) == null || j2 >= number.longValue())) {
                return true;
            }
            CTO = r6.CTO(131);
        }
        return !CTO;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r2 = (X.C345247tB) r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DHC() {
        /*
            r3 = this;
            X.7tC r2 = r3.A01
            if (r2 == 0) goto L_0x0020
            X.7tB r2 = (X.C345247tB) r2
            X.7rv r1 = r2.A03
            if (r1 == 0) goto L_0x0020
            X.7qt r0 = r2.A00
            android.content.Context r0 = r0.getContext()
            boolean r0 = X.C340267kz.A00(r0)
            if (r0 != 0) goto L_0x0020
            X.7qC r0 = new X.7qC
            r0.<init>(r2)
            r2.A00 = r0
            r1.EiV(r0)
        L_0x0020:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C345467tX.DHC():void");
    }
}
