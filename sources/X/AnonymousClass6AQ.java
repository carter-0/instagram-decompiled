package X;

import com.google.common.util.concurrent.SettableFuture;
import com.instagram.common.session.UserSession;
import com.meta.foa.instagram.performancelogging.messagingready.IGFOAMessagingReadyLogger;

/* renamed from: X.6AQ  reason: invalid class name */
public final class AnonymousClass6AQ {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public long A05;
    public long A06;
    public boolean A07;
    public boolean A08;
    public final SettableFuture A09;
    public final SettableFuture A0A;
    public final AnonymousClass1aS A0B;
    public final AnonymousClass1aS A0C;
    public final AnonymousClass1aS A0D;
    public final AnonymousClass1aS A0E;
    public final UserSession A0F;
    public final 2I1 A0G;
    public final IGFOAMessagingReadyLogger A0H;
    public final Integer[] A0I = {0, 0, 0, 0, 0};

    /* JADX WARNING: type inference failed for: r0v4, types: [X.1qK, java.lang.Object] */
    public final void A00() {
        this.A00 = 3;
        UserSession userSession = this.A0F;
        if (userSession != null) {
            AnonymousClass65E A002 = AnonymousClass65D.A00(userSession);
            if (A002.A00() && AnonymousClass65A.A02(A002.A00, 36315949950570287L)) {
                AnonymousClass1Nd.A00(userSession).A00(new Object());
            }
        }
    }

    public final void A01() {
        2I1 r5 = this.A0G;
        if (r5 != null) {
            02m r4 = r5.A02;
            int i = r5.A01;
            int i2 = r5.A00;
            r4.markerPoint(i, i2, "act_login_end");
            r4.markerAnnotate(i, i2, "end_reason", "act_login_fail");
            2I1.A00(r5);
            r4.markerEnd(i, i2, 3);
        }
        IGFOAMessagingReadyLogger iGFOAMessagingReadyLogger = this.A0H;
        if (iGFOAMessagingReadyLogger != null) {
            iGFOAMessagingReadyLogger.onLogActLoginEnd();
            iGFOAMessagingReadyLogger.onEndFlowFail("act_login_fail");
        }
        this.A01 = 3;
        this.A0D.accept(3);
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [java.lang.Object, com.google.common.util.concurrent.SettableFuture] */
    /* JADX WARNING: type inference failed for: r0v6, types: [java.lang.Object, com.google.common.util.concurrent.SettableFuture] */
    public AnonymousClass6AQ(UserSession userSession, 2I1 r6, IGFOAMessagingReadyLogger iGFOAMessagingReadyLogger) {
        this.A0F = userSession;
        this.A0G = r6;
        this.A0H = iGFOAMessagingReadyLogger;
        System.currentTimeMillis();
        this.A00 = 99;
        this.A01 = 99;
        this.A05 = -1;
        this.A06 = -1;
        this.A02 = -1;
        this.A0A = new Object();
        this.A09 = new Object();
        this.A0D = 1aF.A01(99);
        this.A0B = 1aF.A01(99);
        this.A0C = 1aF.A01("");
        this.A0E = 1aF.A01(false);
    }
}
