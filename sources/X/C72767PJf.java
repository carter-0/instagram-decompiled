package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.rtc.RtcCallAudience;
import com.instagram.model.rtc.RtcCallKey;
import com.instagram.model.rtc.RtcEnterCallArgs;
import com.instagram.model.rtc.RtcIgNotification;
import com.instagram.model.rtc.RtcJoinCallArgs;
import com.instagram.model.rtc.cowatch.RtcStartCoWatchPlaybackArguments;
import com.instagram.rtc.activity.RtcCallIntentHandlerActivity;
import java.util.List;

/* renamed from: X.PJf  reason: case insensitive filesystem */
public final class C72767PJf implements C74496Pvq {
    public boolean A00 = false;
    public final int A01;
    public final C69465Nm9 A02;
    public final AnonymousClass0iw A03;
    public final UserSession A04;
    public final C69277Nid A05;
    public final C69278Nie A06;
    public final RtcCallAudience A07;
    public final RtcCallKey A08;
    public final C331537Rj A09;
    public final RtcEnterCallArgs A0A;
    public final RtcIgNotification A0B;
    public final RtcStartCoWatchPlaybackArguments A0C;
    public final C70810OMf A0D;
    public final RtcCallIntentHandlerActivity A0E;
    public final OEO A0F;
    public final C72192OyC A0G;
    public final Boolean A0H;
    public final String A0I;
    public final String A0J;
    public final String A0K;
    public final String A0L;
    public final String A0M;
    public final String A0N;
    public final String A0O;
    public final String A0P;
    public final List A0Q;
    public final List A0R;
    public final C262224Cq A0S;
    public final boolean A0T;
    public final boolean A0U;

    /* JADX WARNING: type inference failed for: r0v1, types: [com.instagram.rtc.activity.RtcCallIntentHandlerActivity, android.app.Activity] */
    public final /* synthetic */ void AIa() {
        this.A00 = false;
        this.A0E.finish();
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [com.instagram.rtc.activity.RtcCallIntentHandlerActivity, android.content.Context] */
    public final void start() {
        String str;
        OEO oeo;
        C74561PxA ExN;
        this.A00 = true;
        if (!this.A0G.A09()) {
            boolean A1a = DbW.A1a(this.A08);
            C331537Rj r1 = this.A09;
            if ((r1 == C331537Rj.DIRECT_INBOX_THREAD || r1 == C331537Rj.DIRECT_THREAD) && this.A0T) {
                if (!A1a) {
                    oeo = this.A0F;
                    ExN = oeo.A01.Ex9((Boolean) null, this.A0U);
                }
                oeo = this.A0F;
                boolean z = this.A0T;
                boolean z2 = this.A0U;
                String str2 = r1.A00;
                0qQ.A0B(str2, 2);
                ExN = oeo.A01.ExN((Boolean) null, str2, z, z2);
            } else {
                if (!A1a) {
                    oeo = this.A0F;
                    ExN = oeo.A01.Ex3((Boolean) null, this.A0T, this.A0U);
                }
                oeo = this.A0F;
                boolean z3 = this.A0T;
                boolean z22 = this.A0U;
                String str22 = r1.A00;
                0qQ.A0B(str22, 2);
                ExN = oeo.A01.ExN((Boolean) null, str22, z3, z22);
            }
            oeo.A00 = ExN;
        }
        String str3 = this.A0L;
        int i = this.A01;
        RtcIgNotification rtcIgNotification = this.A0B;
        RtcCallKey rtcCallKey = this.A08;
        String str4 = this.A0O;
        String str5 = this.A0N;
        String str6 = this.A0I;
        String str7 = this.A0M;
        if (!(str3 == null || str3.length() == 0)) {
            new 1Fs(this.A0E).A00.cancel(str3, i);
            if (rtcIgNotification != null) {
                1XB r14 = AnonymousClass38W.A00().A01;
                UserSession userSession = this.A04;
                if (rtcCallKey != null) {
                    str = rtcCallKey.A00;
                } else {
                    str = null;
                }
                0xI A022 = 1XB.A02(rtcIgNotification, r14, AnonymousClass05K.A0N, str, str4, str5, str6, str7);
                if (A022 != null) {
                    A022.A0C("reason", "clicked");
                    DbU.A1R(A022, userSession);
                }
            } else if (rtcCallKey != null) {
                1XB r4 = AnonymousClass38W.A00().A01;
                C331537Rj r3 = C331537Rj.MQTT_RING_NOTIFICATION;
                String str8 = this.A04.A06;
                0xI A012 = 1XB.A01(r3, r4, AnonymousClass05K.A0N, str8, (String) null, rtcCallKey.A00, str4, str5, str6, str7);
                A012.A0C("push_type", "mqtt");
                A012.A0C("reason", "clicked");
                1XC.A00(A012, str8);
            }
        }
        RtcCallIntentHandlerActivity rtcCallIntentHandlerActivity = this.A0E;
        boolean z4 = this.A0U;
        boolean z5 = true;
        boolean z6 = !z4;
        if (rtcCallKey == null) {
            z5 = false;
        }
        rtcCallIntentHandlerActivity.A02(z6, z5);
    }

    public static final boolean A00(C72767PJf pJf) {
        if (pJf.A08 != null) {
            return true;
        }
        OW1 ow1 = new OW1(new ON9(0wj.A01).A00, "Call Key cant be null for incoming calls", 659044095);
        boolean z = pJf.A0A instanceof RtcJoinCallArgs;
        ow1.A01.ABR("isJoiningCall", z);
        ow1.A03.put("isJoiningCall", String.valueOf(z));
        ow1.A02("source", pJf.A09.A00);
        ow1.A02("threadId", String.valueOf(pJf.A0O));
        ow1.A02("target", pJf.A0J);
        ow1.A02("call State", O2N.A00(((N9J) pJf.A0G.A09.A0K.A00.A00).A01));
        ow1.A02("e2eeCallType", pJf.A05.toString());
        ow1.A01();
        return false;
    }

    public final boolean Ae4() {
        return true;
    }

    public final RtcCallIntentHandlerActivity Bos() {
        return this.A0E;
    }

    public final UserSession CCy() {
        return this.A04;
    }

    public final boolean isRunning() {
        return this.A00;
    }

    /* JADX WARNING: type inference failed for: r10v0, types: [X.07Z, com.instagram.rtc.activity.RtcCallIntentHandlerActivity, android.content.Context] */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00df, code lost:
        r0 = (r9 = (com.instagram.model.rtc.RtcJoinCallArgs) r9).A01;
     */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C72767PJf(X.AnonymousClass0iw r7, com.instagram.common.session.UserSession r8, com.instagram.model.rtc.RtcEnterCallArgs r9, com.instagram.rtc.activity.RtcCallIntentHandlerActivity r10) {
        /*
            r6 = this;
            android.content.Context r0 = X.DbT.A05(r10)
            X.OyC r5 = X.C66953Mfm.A00(r0, r8)
            r4 = 0
            X.OMf r3 = new X.OMf
            r3.<init>(r10, r7, r8)
            X.0xx r2 = X.DbW.A0E(r10)
            X.OWA r0 = r5.A06
            X.OEO r1 = r0.A0G
            r0 = 9
            X.0qQ.A0B(r1, r0)
            r6.<init>()
            r6.A0E = r10
            r6.A04 = r8
            r6.A03 = r7
            r6.A0G = r5
            r6.A00 = r4
            r6.A0D = r3
            r6.A0S = r2
            r6.A0F = r1
            r6.A0A = r9
            com.instagram.model.rtc.RtcCallAudience r3 = r9.AdH()
            r6.A07 = r3
            com.instagram.model.rtc.RtcCallSource r4 = r9.Bxh()
            X.7Rj r0 = r4.A01
            r6.A09 = r0
            boolean r0 = r9.CGf()
            r6.A0U = r0
            X.Nid r0 = r9.Azh()
            r6.A05 = r0
            java.util.List r0 = r3.A05
            r6.A0R = r0
            com.instagram.model.rtc.RtcThreadKey r2 = r4.A02
            com.instagram.model.direct.DirectThreadKey r1 = r2.A00
            java.lang.String r0 = r1.A00
            r6.A0O = r0
            java.lang.String r0 = r1.A01
            r6.A0P = r0
            java.lang.String r0 = r2.A04
            r6.A0N = r0
            java.lang.String r0 = r2.A01
            r6.A0I = r0
            java.lang.String r0 = r2.A03
            r6.A0M = r0
            X.Nm9 r0 = r4.A00
            r6.A02 = r0
            java.util.List r0 = r3.A04
            r6.A0Q = r0
            com.instagram.common.typedurl.ImageUrl r0 = r3.A00
            java.lang.String r0 = X.JTP.A0o(r0)
            r6.A0K = r0
            java.lang.String r0 = r3.A01
            r6.A0J = r0
            boolean r0 = r3.A06
            r6.A0T = r0
            boolean r2 = r9 instanceof com.instagram.model.rtc.RtcCreateCallArgs
            r3 = 0
            if (r2 == 0) goto L_0x00fc
            r0 = r9
            com.instagram.model.rtc.RtcCreateCallArgs r0 = (com.instagram.model.rtc.RtcCreateCallArgs) r0
            boolean r0 = r0.A0A
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
        L_0x008c:
            r6.A0H = r0
            if (r2 == 0) goto L_0x00fa
            r0 = r9
            com.instagram.model.rtc.RtcCreateCallArgs r0 = (com.instagram.model.rtc.RtcCreateCallArgs) r0
            com.instagram.model.rtc.cowatch.RtcStartCoWatchPlaybackArguments r0 = r0.A07
        L_0x0095:
            r6.A0C = r0
            boolean r1 = r9 instanceof com.instagram.model.rtc.RtcJoinCallArgs
            if (r1 == 0) goto L_0x00f8
            r0 = r9
            com.instagram.model.rtc.RtcJoinCallArgs r0 = (com.instagram.model.rtc.RtcJoinCallArgs) r0
            com.instagram.model.rtc.RtcCallKey r0 = r0.A02
        L_0x00a0:
            r6.A08 = r0
            if (r1 == 0) goto L_0x00ad
            r0 = r9
            com.instagram.model.rtc.RtcJoinCallArgs r0 = (com.instagram.model.rtc.RtcJoinCallArgs) r0
            if (r0 == 0) goto L_0x00ad
            java.lang.String r0 = r0.A04
            if (r0 != 0) goto L_0x00b6
        L_0x00ad:
            if (r2 == 0) goto L_0x00f6
            r0 = r9
            com.instagram.model.rtc.RtcCreateCallArgs r0 = (com.instagram.model.rtc.RtcCreateCallArgs) r0
            if (r0 == 0) goto L_0x00f6
            java.lang.String r0 = r0.A08
        L_0x00b6:
            r6.A0L = r0
            if (r1 == 0) goto L_0x00ea
            r0 = r9
            com.instagram.model.rtc.RtcJoinCallArgs r0 = (com.instagram.model.rtc.RtcJoinCallArgs) r0
            if (r0 == 0) goto L_0x00ea
            int r0 = r0.A00
        L_0x00c1:
            r6.A01 = r0
            if (r1 == 0) goto L_0x00ce
            r0 = r9
            com.instagram.model.rtc.RtcJoinCallArgs r0 = (com.instagram.model.rtc.RtcJoinCallArgs) r0
            if (r0 == 0) goto L_0x00ce
            com.instagram.model.rtc.RtcIgNotification r0 = r0.A03
            if (r0 != 0) goto L_0x00d7
        L_0x00ce:
            if (r2 == 0) goto L_0x00e8
            r0 = r9
            com.instagram.model.rtc.RtcCreateCallArgs r0 = (com.instagram.model.rtc.RtcCreateCallArgs) r0
            if (r0 == 0) goto L_0x00e8
            com.instagram.model.rtc.RtcIgNotification r0 = r0.A06
        L_0x00d7:
            r6.A0B = r0
            if (r1 == 0) goto L_0x00e3
            com.instagram.model.rtc.RtcJoinCallArgs r9 = (com.instagram.model.rtc.RtcJoinCallArgs) r9
            if (r9 == 0) goto L_0x00e3
            X.Nie r0 = r9.A01
            if (r0 != 0) goto L_0x00e5
        L_0x00e3:
            X.Nie r0 = X.C69278Nie.NOT_SET
        L_0x00e5:
            r6.A06 = r0
            return
        L_0x00e8:
            r0 = r3
            goto L_0x00d7
        L_0x00ea:
            if (r2 == 0) goto L_0x00f4
            r0 = r9
            com.instagram.model.rtc.RtcCreateCallArgs r0 = (com.instagram.model.rtc.RtcCreateCallArgs) r0
            if (r0 == 0) goto L_0x00f4
            int r0 = r0.A00
            goto L_0x00c1
        L_0x00f4:
            r0 = -1
            goto L_0x00c1
        L_0x00f6:
            r0 = r3
            goto L_0x00b6
        L_0x00f8:
            r0 = r3
            goto L_0x00a0
        L_0x00fa:
            r0 = r3
            goto L_0x0095
        L_0x00fc:
            r0 = r3
            goto L_0x008c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C72767PJf.<init>(X.0iw, com.instagram.common.session.UserSession, com.instagram.model.rtc.RtcEnterCallArgs, com.instagram.rtc.activity.RtcCallIntentHandlerActivity):void");
    }

    public final void Exw() {
        C70902OQu.A01(this);
        C71004OWb.A00.A00("RtcCallIntentHandlerActivity.EnterCallOperation", "Starting EnterCallOperation");
        DbX.A1X(this, this.A0S, 31);
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("EnterCallOperation: callKey=");
        A1A.append(this.A08);
        A1A.append(", threadId=");
        A1A.append(this.A0O);
        A1A.append(", source=");
        return AnonymousClass7TF.A0i(this.A09, A1A);
    }
}
