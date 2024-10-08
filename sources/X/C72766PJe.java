package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.rtc.RtcCallKey;
import com.instagram.rtc.activity.RtcCallIntentHandlerActivity;
import com.instagram.rtc.activity.RtcIncomingParams;

/* renamed from: X.PJe  reason: case insensitive filesystem */
public final class C72766PJe implements C74496Pvq {
    public boolean A00 = false;
    public final C74562PxB A01;
    public final AnonymousClass0iw A02;
    public final UserSession A03;
    public final RtcCallKey A04;
    public final C70810OMf A05;
    public final RtcCallIntentHandlerActivity A06;
    public final RtcIncomingParams A07;
    public final C72192OyC A08;
    public final AnonymousClass0eM A09;
    public final C262224Cq A0A;

    /* JADX WARNING: type inference failed for: r0v1, types: [com.instagram.rtc.activity.RtcCallIntentHandlerActivity, android.app.Activity] */
    public final /* synthetic */ void AIa() {
        this.A00 = false;
        this.A06.finish();
    }

    public final void start() {
        this.A00 = true;
        if (G9t.A1b(this.A09)) {
            DbX.A1X(this, this.A0A, 32);
        } else {
            this.A06.A02(this.A07.A01, true);
        }
    }

    public final boolean Ae4() {
        return true;
    }

    public final RtcCallIntentHandlerActivity Bos() {
        return this.A06;
    }

    public final UserSession CCy() {
        return this.A03;
    }

    public final boolean isRunning() {
        return this.A00;
    }

    /* JADX WARNING: type inference failed for: r10v0, types: [X.07Z, com.instagram.rtc.activity.RtcCallIntentHandlerActivity, android.content.Context] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C72766PJe(X.C74562PxB r7, X.AnonymousClass0iw r8, com.instagram.common.session.UserSession r9, com.instagram.rtc.activity.RtcCallIntentHandlerActivity r10, com.instagram.rtc.activity.RtcIncomingParams r11) {
        /*
            r6 = this;
            android.content.Context r0 = X.DbT.A05(r10)
            X.OyC r5 = X.C66953Mfm.A00(r0, r9)
            r4 = 0
            X.OMf r3 = new X.OMf
            r3.<init>(r10, r8, r9)
            X.0xx r2 = X.DbW.A0E(r10)
            java.lang.String r0 = r11.A00
            com.instagram.model.rtc.RtcCallKey r1 = new com.instagram.model.rtc.RtcCallKey
            r1.<init>(r0)
            r0 = 4
            X.0qQ.A0B(r5, r0)
            r6.<init>()
            r6.A06 = r10
            r6.A03 = r9
            r6.A02 = r8
            r6.A08 = r5
            r6.A00 = r4
            r6.A05 = r3
            r6.A0A = r2
            r6.A07 = r11
            r6.A04 = r1
            r6.A01 = r7
            X.0eO r1 = X.0eO.A02
            r0 = 3
            X.Pm5 r0 = X.C73925Pm5.A01(r6, r0)
            X.0eM r0 = X.AnonymousClass0eN.A00(r1, r0)
            r6.A09 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C72766PJe.<init>(X.PxB, X.0iw, com.instagram.common.session.UserSession, com.instagram.rtc.activity.RtcCallIntentHandlerActivity, com.instagram.rtc.activity.RtcIncomingParams):void");
    }

    public final void Exw() {
        C70902OQu.A01(this);
        if (!G9t.A1b(this.A09)) {
            DbX.A1X(this, this.A0A, 32);
        }
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("IncomingCallOperation: callKey=");
        return AnonymousClass7TF.A0i(this.A04, A1A);
    }
}
