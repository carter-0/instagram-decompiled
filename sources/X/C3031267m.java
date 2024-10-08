package X;

import com.facebook.msys.mci.SessionedNotificationCenter;
import com.instagram.common.session.UserSession;
import com.instagram.direct.perf.navigation.ttrc.MPLTracker;

/* renamed from: X.67m  reason: invalid class name and case insensitive filesystem */
public final class C3031267m implements C3031367n {
    public C3031867s A00;
    public boolean A01;

    public final void Ezd() {
        this.A01 = true;
        AnonymousClass1aS r0 = 1aD.A06;
        C3031867s r02 = this.A00;
        if (r02 == null) {
            0qQ.A0F("igMsysAppStateHandler");
            throw AnonymousClass00P.createAndThrow();
        } else {
            14i.A06(r02);
        }
    }

    public static final void A00(C3031167l r4, C3031267m r5) {
        if (182.A06(0Tu.A05, r4.A02, 36313076611155678L)) {
            MPLTracker mPLTracker = new MPLTracker();
            if (mPLTracker.isReady()) {
                SessionedNotificationCenter sessionedNotificationCenter = r4.A01.getAccountSession().getSessionedNotificationCenter();
                0qQ.A07(sessionedNotificationCenter);
                mPLTracker.registerMPLTTRCListenerSessionedNotifications(sessionedNotificationCenter);
                mPLTracker.syncTamGroupStateListenForCompletion();
            }
        }
        if (!r5.A01) {
            C3031867s r1 = r5.A00;
            if (r1 == null) {
                0qQ.A0F("igMsysAppStateHandler");
                throw AnonymousClass00P.createAndThrow();
            }
            if (14i.A08()) {
                r1.onAppBackgrounded();
            } else {
                r1.onAppForegrounded();
            }
            14i.A03(15Y.A03, r1);
        }
    }

    public final /* bridge */ /* synthetic */ void EpW(Object obj) {
        C3031167l r7 = (C3031167l) obj;
        0qQ.A0B(r7, 0);
        AnonymousClass1aS r0 = 1aD.A06;
        UserSession userSession = r7.A02;
        this.A00 = new C3031867s(r7.A01, userSession);
        long A012 = 182.A01(0Tu.A05, userSession, 36601260325736577L);
        if (A012 <= 0) {
            A00(r7, this);
        } else {
            0no.A00().A01(new C68663NRv(r7, this), A012);
        }
    }
}
