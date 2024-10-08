package X;

import android.os.Bundle;
import com.instagram.common.session.UserSession;

/* renamed from: X.3Ay  reason: invalid class name and case insensitive filesystem */
public final class C238203Ay {
    public final UserSession A00;
    public final C2370236a A01;
    public final C2365134a A02;
    public final C228302lG A03;
    public final C238183Aw A04;
    public final C228312lJ A05;
    public final C228472lj A06;
    public final C227802jw A07;
    public final C229112mr A08;
    public final AnonymousClass36M A09;

    public C238203Ay(UserSession userSession, C2370236a r3, C2365134a r4, C228302lG r5, C238183Aw r6, C228312lJ r7, C228472lj r8, C227802jw r9, C229112mr r10, AnonymousClass36M r11) {
        0qQ.A0B(r3, 2);
        0qQ.A0B(r8, 7);
        this.A00 = userSession;
        this.A01 = r3;
        this.A02 = r4;
        this.A09 = r11;
        this.A07 = r9;
        this.A04 = r6;
        this.A06 = r8;
        this.A08 = r10;
        this.A05 = r7;
        this.A03 = r5;
    }

    public final void A00() {
        if (this.A07.A0W()) {
            if (182.A06(0Tu.A05, this.A00, 36323406006135952L)) {
                return;
            }
        }
        A03(true);
    }

    public final void A01(Bundle bundle) {
        1Av A002 = 1Au.A00(this.A00);
        if (bundle != null) {
            0s0 r3 = A002.A5v;
            AnonymousClass0YZ[] r2 = 1Av.A8a;
            if (((Boolean) r3.CDM(A002, r2[390])).booleanValue()) {
                r3.Epx(A002, false, r2[390]);
                0xY AR4 = A002.A01.AR4();
                AR4.E5g("injected_post_to_feed_id", "");
                AR4.apply();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x008b, code lost:
        if (r1 != true) goto L_0x008d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00cc, code lost:
        if (X.182.A06(X.0Tu.A05, r11.A00, 36317620685575540L) == false) goto L_0x00ce;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00be  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02(X.1FI r12, java.util.Map r13) {
        /*
            r11 = this;
            X.1FI r5 = X.1FI.A0J
            if (r12 != r5) goto L_0x004c
            X.2jw r0 = r11.A07
            X.2kj r0 = r0.A0A()
            X.2lT r0 = r0.A0S()
            X.2lW r3 = r0.A04
            java.lang.String r2 = r0.A05
            java.lang.Integer r1 = X.AnonymousClass05K.A0N
            r6 = 0
            boolean r0 = r3.A08(r6, r1, r2)
            if (r0 == 0) goto L_0x0020
            java.lang.String r0 = "cancel_ongoing_marker"
            r3.A05(r6, r1, r2, r0)
        L_0x0020:
            r3.A04(r6, r1, r2)
            com.instagram.common.session.UserSession r0 = r11.A00
            X.2lF r4 = X.C228282lE.A00(r0)
            java.lang.Long r0 = r4.A01
            if (r0 == 0) goto L_0x003a
            long r0 = r0.longValue()
            X.1QP r3 = r4.A02
            java.lang.String r2 = "logic_constraint"
            r3.flowEndCancel(r0, r2)
            r4.A01 = r6
        L_0x003a:
            X.1QP r3 = r4.A02
            java.lang.Integer r2 = X.AnonymousClass05K.A0Y
            java.lang.String r1 = "reload_feed"
            java.lang.String r0 = "pull_to_refresh"
            long r0 = r3.A00(r2, r1, r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r4.A01 = r0
        L_0x004c:
            X.2jw r4 = r11.A07
            android.content.Context r7 = r4.getContext()
            android.os.Bundle r2 = r4.mArguments
            r3 = 0
            X.0qQ.A0B(r12, r3)
            X.2lG r1 = r11.A03
            java.lang.String r0 = r12.toString()
            r1.A00(r0)
            X.2lJ r0 = r11.A05
            r0.A02()
            r11.A01(r2)
            X.2mr r10 = r11.A08
            boolean r0 = r10.A01()
            r2 = 0
            r6 = 1
            if (r0 == 0) goto L_0x00d2
            com.instagram.common.session.UserSession r9 = r11.A00
            X.0Tu r8 = X.0Tu.A05
            r0 = 36317620685051247(0x8106af0005156f, double:3.030747788322367E-306)
            boolean r0 = X.182.A06(r8, r9, r0)
            if (r0 != 0) goto L_0x00d2
            X.3Az r0 = r4.A0B
            if (r0 == 0) goto L_0x008d
            boolean r1 = r0.A0A()
            r0 = 1
            if (r1 == r6) goto L_0x008e
        L_0x008d:
            r0 = 0
        L_0x008e:
            r6 = r0 ^ 1
        L_0x0090:
            X.34a r1 = r11.A02
            X.2kn r0 = r1.A0O
            boolean r0 = r0.A0H()
            if (r0 != 0) goto L_0x009f
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            r1.A0C(r2, r0)
        L_0x009f:
            if (r12 != r5) goto L_0x00a6
            X.36M r0 = r11.A09
            r0.A00(r3)
        L_0x00a6:
            X.36a r2 = r11.A01
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "MainFeedFragment.onRefreshClicked."
            r1.append(r0)
            r1.append(r12)
            java.lang.String r0 = r1.toString()
            r2.A03(r0)
            if (r6 == 0) goto L_0x00ce
            com.instagram.common.session.UserSession r3 = r11.A00
            X.0Tu r2 = X.0Tu.A05
            r0 = 36317620685575540(0x8106af000d1574, double:3.030747788653932E-306)
            boolean r1 = X.182.A06(r2, r3, r0)
            r0 = 1
            if (r1 != 0) goto L_0x00cf
        L_0x00ce:
            r0 = 0
        L_0x00cf:
            r4.A0M = r0
            return
        L_0x00d2:
            boolean r0 = r10.CT5()
            if (r0 == 0) goto L_0x00ec
            X.4DU r1 = X.AnonymousClass2kO.A00
            java.lang.String r0 = "action_bar_feed_retry"
            X.0xI r1 = X.0xI.A00(r1, r0)
            X.AnonymousClass6WL.A03(r7, r1)
            com.instagram.common.session.UserSession r0 = r11.A00
            X.0xN r0 = X.C60510iO.A00(r0)
            r0.EFq(r1)
        L_0x00ec:
            X.3Az r0 = r4.A0B
            if (r0 == 0) goto L_0x0117
            boolean r0 = r0.A0A()
            if (r0 != 0) goto L_0x0117
            X.3Aw r7 = r11.A04
            java.lang.Integer r1 = X.AnonymousClass05K.A00
            java.lang.String r0 = "This operation must be run on UI thread."
            X.11Z.A06(r0)
            java.lang.Integer r0 = r7.A01
            if (r0 != 0) goto L_0x010d
            r7.A01 = r1
            X.0JR r0 = r7.A02
            long r0 = r0.now()
            r7.A00 = r0
        L_0x010d:
            r4.A0R = r6
            X.2lj r0 = r11.A06
            boolean r6 = r0.A0A(r12, r2, r13)
            goto L_0x0090
        L_0x0117:
            r6 = 0
            goto L_0x0090
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C238203Ay.A02(X.1FI, java.util.Map):void");
    }

    public final void A03(boolean z) {
        C227802jw r3 = this.A07;
        A01(r3.mArguments);
        if (z) {
            r3.A0A().A0x().A00();
        }
        if (r3.mView != null) {
            C238143As r2 = (C238143As) r3.getScrollingViewProxy();
            if (r2 != null && r2.CaA() && !r3.A0R) {
                r2.Ev6();
            }
            r3.A0V(true, true);
        }
    }
}
