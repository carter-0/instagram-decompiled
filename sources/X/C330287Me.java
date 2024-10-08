package X;

import android.util.Pair;
import com.instagram.common.session.UserSession;
import com.meta.foa.instagram.performancelogging.lss.IGFOAMessagingLocalSendSpeedLogger;
import java.util.List;
import java.util.concurrent.ExecutorService;

/* renamed from: X.7Me  reason: invalid class name and case insensitive filesystem */
public final class C330287Me {
    public int A00;
    public long A01 = -1;
    public Pair A02 = null;
    public boolean A03;
    public boolean A04 = false;
    public boolean A05;
    public final UserSession A06;
    public final AnonymousClass4D6 A07 = 1ES.A01();
    public final AnonymousClass7SA A08;
    public final AnonymousClass7SC A09;
    public final AnonymousClass3SZ A0A;
    public final C331717Sc A0B;
    public final ExecutorService A0C = new 0na(1740191742, 2, false, false);
    public volatile boolean A0D;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0019, code lost:
        if (X.AnonymousClass0Ke.A00(X.C60960kU.A00) < 2013) goto L_0x001b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(X.AnonymousClass7SD r13, com.instagram.model.direct.DirectThreadKey r14) {
        /*
            r12 = this;
            r5 = r12
            boolean r8 = r12.A05
            boolean r9 = r12.A04
            X.Oyt r4 = new X.Oyt
            r6 = r13
            r7 = r14
            r4.<init>(r5, r6, r7, r8, r9)
            r10 = 0
            r3 = 1
            if (r9 != 0) goto L_0x001b
            android.content.Context r0 = X.C60960kU.A00
            int r2 = X.AnonymousClass0Ke.A00(r0)
            r1 = 2013(0x7dd, float:2.821E-42)
            r0 = 1
            if (r2 >= r1) goto L_0x001c
        L_0x001b:
            r0 = 0
        L_0x001c:
            r12.A04 = r3
            if (r0 == 0) goto L_0x0032
            int r0 = r12.A00
            int r0 = r0 + 1
            r12.A00 = r0
            r4.onStart()
            r4.run()
            r4.onFinish()
        L_0x002f:
            r12.A05 = r10
            return
        L_0x0032:
            X.4D6 r6 = r12.A07
            r8 = 302(0x12e, float:4.23E-43)
            r9 = 2
            r7 = r4
            r11 = r10
            r6.schedule(r7, r8, r9, r10, r11)
            int r0 = r12.A00
            int r0 = r0 + 1
            r12.A00 = r0
            goto L_0x002f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C330287Me.A00(X.7SD, com.instagram.model.direct.DirectThreadKey):void");
    }

    public final void A01(AnonymousClass7SD r15, Integer num, List list, List list2, List list3) {
        IGFOAMessagingLocalSendSpeedLogger A002;
        List list4 = list;
        if (!(list == null || list4.size() != 1 || ((C254703su) list4.get(0)).A0f() == null || (A002 = C328727Fx.A00(this.A06, Integer.valueOf(((C254703su) list4.get(0)).A0f().hashCode()))) == null)) {
            A002.onLogScheduleThreadRowUpdateTaskStart();
            A002.annotateNumPendingThreadRowUpdateTasks(this.A00 + 1);
        }
        C66652MaL maL = new C66652MaL(this, r15, num, list4, list2, list3);
        UserSession userSession = this.A06;
        0Tu r2 = 0Tu.A05;
        if (182.A06(r2, userSession, 36324033071296196L)) {
            this.A07.schedule(maL, 303, 2, false, false);
        } else if (182.A06(r2, userSession, 36324033071361733L)) {
            this.A07.schedule(maL, 303, 1, false, false);
        } else {
            this.A07.schedule(maL);
        }
        this.A00++;
    }

    public C330287Me(UserSession userSession, AnonymousClass7SA r6, AnonymousClass7SC r7, AnonymousClass3SZ r8, C331717Sc r9) {
        this.A06 = userSession;
        this.A09 = r7;
        this.A08 = r6;
        this.A0A = r8;
        this.A0B = r9;
        this.A05 = true;
    }
}
