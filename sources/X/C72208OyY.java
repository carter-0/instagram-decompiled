package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.model.direct.DirectMessageSearchThread;
import com.instagram.model.direct.DirectSearchResult;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;
import java.util.ArrayList;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* renamed from: X.OyY  reason: case insensitive filesystem */
public final class C72208OyY implements AnonymousClass0lh, C74341PtH {
    public long A00;
    public OO3 A01;
    public OKM A02;
    public AnonymousClass2Ep A03;
    public C254783t2 A04;
    public String A05;
    public String A06;
    public ScheduledFuture A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public final 0wc A0C;
    public final UserSession A0D;
    public final OJh A0E = new OJh(this);
    public final ScheduledExecutorService A0F = C61560nl.A00().A00;
    public final boolean A0G;
    public final 2Dm A0H;

    public final void A07(C69495Nmd nmd) {
        Integer num;
        String str;
        OO3 oo3 = this.A01;
        if (oo3 != null) {
            oo3.A02(nmd, (Long) null, (String) null, false);
        }
        if (this.A06 != null) {
            OKM okm = this.A02;
            if (okm != null) {
                if (nmd == C69495Nmd.ABANDON) {
                    num = AnonymousClass05K.A00;
                } else {
                    num = AnonymousClass05K.A01;
                }
                if (num.intValue() != 0) {
                    str = "onClick";
                } else {
                    str = "abandon";
                }
                Integer num2 = okm.A00;
                if (num2 != null) {
                    okm.A01.endFlow(num2.intValue(), str);
                }
            }
            A03();
        }
    }

    public static C72208OyY A00(UserSession userSession) {
        return (C72208OyY) userSession.A01(C72208OyY.class, new C73467Pd9(userSession, 4));
    }

    public static String A01(C72208OyY oyY) {
        17k.A07(oyY.A03, "Event logging is only called when mThread != null");
        17k.A07(oyY.A04, "threadTarget should not be null in select, send, and dwell");
        C254783t2 r1 = oyY.A04;
        0qQ.A0B(r1, 0);
        if (r1 instanceof AnonymousClass9HR) {
            return null;
        }
        return oyY.A03.C6C();
    }

    public static ArrayList A02(C72208OyY oyY) {
        17k.A07(oyY.A03, "private getLoggableRecipientIds() is only called when mThread != null");
        ArrayList BRW = oyY.A03.BRW();
        if (BRW.isEmpty()) {
            C66582MXn.A1N(oyY.A0D.A06, BRW);
        }
        return BRW;
    }

    private void A03() {
        ScheduledFuture scheduledFuture = this.A07;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        AnonymousClass2Ep r0 = this.A03;
        if (r0 != null) {
            ((AnonymousClass3U9) r0).A01.A0c = null;
        }
        this.A06 = null;
        this.A07 = null;
        this.A03 = null;
        this.A00 = 0;
        this.A09 = false;
        this.A08 = false;
    }

    public static void A04(C72208OyY oyY) {
        C254783t2 r0;
        String str;
        17k.A07(oyY.A03, "private logSendEvent() is only called when mThread != null");
        17k.A07(oyY.A06, "private logSendEvent() is only called when mSearchSessionId != null");
        oyY.A09 = true;
        0Aj A0e = AnonymousClass7TE.A0e(oyY.A0C, "direct_inbox_search_send");
        if (A0e.isSampled()) {
            C66580MXl.A1H(A0e, oyY.A06);
            C66581MXm.A1F(A0e, oyY.A00);
            A0e.AAe("recipient_ids", A02(oyY));
            C66580MXl.A1J(A0e, A01(oyY));
            if (oyY.A0G && !oyY.A08 && !oyY.A0A && (r0 = oyY.A04) != null) {
                C254923tH A002 = AnonymousClass6W3.A00(r0);
                if (A002 != null) {
                    str = A002.A00;
                } else {
                    str = null;
                }
                A0e.AAJ(TraceFieldType.TransportType, str);
            }
            A0e.Cgf();
        }
        ScheduledFuture scheduledFuture = oyY.A07;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
    }

    public final void A05(int i) {
        String str;
        OO3 oo3 = this.A01;
        if (oo3 != null && (str = oo3.A07) != null) {
            0Aj A0e = AnonymousClass7TE.A0e(oo3.A0E, "universal_search_button_impression");
            C66580MXl.A1H(A0e, str);
            A0e.A8M(C71112Od3.A00(i), "button_name");
            A0e.Cgf();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000b, code lost:
        if (r4.A0A != false) goto L_0x000d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A06(long r5) {
        /*
            r4 = this;
            X.OO3 r3 = r4.A01
            if (r3 == 0) goto L_0x001e
            boolean r0 = r4.A08
            if (r0 != 0) goto L_0x000d
            boolean r0 = r4.A0A
            r1 = 0
            if (r0 == 0) goto L_0x000e
        L_0x000d:
            r1 = 1
        L_0x000e:
            boolean r0 = r3.A0B
            if (r0 != 0) goto L_0x001b
            r3.A0D = r1
            X.Nmd r2 = X.C69495Nmd.ABANDON
            r1 = 0
            r0 = 0
            r3.A02(r2, r0, r0, r1)
        L_0x001b:
            r3.A00()
        L_0x001e:
            java.lang.String r0 = r4.A06
            if (r0 == 0) goto L_0x0051
            X.OKM r1 = r4.A02
            if (r1 == 0) goto L_0x0035
            java.lang.String r2 = "abandon"
            java.lang.Integer r0 = r1.A00
            if (r0 == 0) goto L_0x0035
            com.facebook.messaging.analytics.search.universal.qpllatency.QPLSearchLatencyLoggingJni r1 = r1.A01
            int r0 = r0.intValue()
            r1.endFlow(r0, r2)
        L_0x0035:
            X.0wc r1 = r4.A0C
            java.lang.String r0 = "direct_exit_search"
            X.0Aj r1 = X.AnonymousClass7TE.A0e(r1, r0)
            boolean r0 = r1.isSampled()
            if (r0 == 0) goto L_0x004e
            java.lang.String r0 = r4.A06
            X.C66580MXl.A1H(r1, r0)
            X.C66581MXm.A1F(r1, r5)
            r1.Cgf()
        L_0x004e:
            r4.A03()
        L_0x0051:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C72208OyY.A06(long):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x01de, code lost:
        if (r1.hasNext() == false) goto L_0x0101;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x01e0, code lost:
        X.C66582MXn.A1N(X.C66580MXl.A0k(r1).getId(), r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x01ec, code lost:
        r2 = X.AnonymousClass7TE.A1I(X.C69469NmD.A04);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x01f4, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x01f7, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x01fa, code lost:
        r0 = java.lang.Long.valueOf(r27);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x021a, code lost:
        if (r8.A0A != false) goto L_0x0050;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004e, code lost:
        if (((com.instagram.model.direct.DirectShareTarget) r6).A0E() != false) goto L_0x0050;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0050, code lost:
        r9 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0051, code lost:
        X.0qQ.A0B(r6, 0);
        r5.A01 = r3;
        r5.A04 = r10;
        r5.A03 = r1;
        r8 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0060, code lost:
        if (r27 >= 0) goto L_0x01fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0062, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0063, code lost:
        r5.A05 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0065, code lost:
        if (r20 == null) goto L_0x01f7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0067, code lost:
        r0 = r7.A0G;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0069, code lost:
        r5.A0A = r0;
        r5.A0D = r9;
        r13 = r5.A07;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x006f, code lost:
        if (r13 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0071, code lost:
        r12 = X.AnonymousClass7TE.A0e(r5.A0E, "universal_search_result_selected");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x007d, code lost:
        if (r12.isSampled() == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x007f, code lost:
        if (r20 == null) goto L_0x01f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0081, code lost:
        r1 = r7.A08;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0083, code lost:
        r16 = X.AnonymousClass7TF.A1W(r1, X.AnonymousClass05K.A0D);
        r14 = new X.0bb();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x008e, code lost:
        if (r4 == false) goto L_0x01ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0090, code lost:
        r1 = (com.instagram.model.direct.DirectShareTarget) r6;
        r2 = X.C71112Od3.A05(r1.A08);
        r15 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00a2, code lost:
        if (r1.A0Y(r5.A0F.A06) != false) goto L_0x00a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00a4, code lost:
        r15 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00a5, code lost:
        r14.A06("query_string", r5.A06);
        r14.A01(X.C71112Od3.A01(r10), "result_type");
        r0 = r23;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00b9, code lost:
        if (r23 < 0) goto L_0x00be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00bb, code lost:
        X.C66583MXo.A1A(r14, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00be, code lost:
        r12.AAK(r14, "search_result");
        r0 = r5.A06;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00c5, code lost:
        if (r0 == null) goto L_0x00ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00c7, code lost:
        r1 = r0.length();
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00cc, code lost:
        if (r1 != 0) goto L_0x00cf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00ce, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00cf, code lost:
        r12.A8M(X.C71112Od3.A03(r22, !r0), "ui_section");
        X.C66580MXl.A1H(r12, r13);
        r12.AAe("data_sources", r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00e4, code lost:
        if (r16 != false) goto L_0x00ef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00e6, code lost:
        r12.A7p("is_interop_thread", java.lang.Boolean.valueOf(r15));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00ef, code lost:
        r12.A9F("ui_section_index", java.lang.Long.valueOf(r25));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00f8, code lost:
        if (r4 == false) goto L_0x01a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00fa, code lost:
        r2 = ((com.instagram.model.direct.DirectShareTarget) r6).A0C();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0101, code lost:
        r12.AAe("recipient_ids", r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0106, code lost:
        if (r16 != false) goto L_0x0115;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0108, code lost:
        if (r20 == null) goto L_0x01a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x010a, code lost:
        r0 = r7.A0G;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x010c, code lost:
        r12.A7p("with_story_ring", java.lang.Boolean.valueOf(r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0115, code lost:
        r12.A9F("ui_section_rank_index", r5.A05);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x011c, code lost:
        if (r20 == null) goto L_0x0135;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x011e, code lost:
        r0 = r7.A0B;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0120, code lost:
        if (r0 == null) goto L_0x0135;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0122, code lost:
        r2 = new X.0bb();
        r2.A06(com.facebook.proxygen.TraceFieldType.RequestID, X.C71112Od3.A04(r0));
        r12.AAK(r2, "mnet_request");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0135, code lost:
        if (r4 == false) goto L_0x019a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0137, code lost:
        r1 = (com.instagram.model.direct.DirectShareTarget) r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x013e, code lost:
        if (r1.A0U() == false) goto L_0x019a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0140, code lost:
        r1 = X.AnonymousClass6W3.A00(X.DbS.A0c(r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x014a, code lost:
        if (r1 != X.C254923tH.A05) goto L_0x0152;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x014c, code lost:
        if (r3 == null) goto L_0x0152;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x014e, code lost:
        r8 = r3.C6C();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0152, code lost:
        X.C66580MXl.A1J(r12, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0155, code lost:
        if (r16 != false) goto L_0x0166;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0159, code lost:
        if (r5.A0I != false) goto L_0x015d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x015b, code lost:
        if (r9 != false) goto L_0x0166;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x015d, code lost:
        r12.A8M(X.C71112Od3.A02(r1), com.facebook.proxygen.TraceFieldType.TransportType);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0168, code lost:
        if (r5.A0H == false) goto L_0x0173;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x016a, code lost:
        if (r16 != false) goto L_0x016f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x016c, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x016d, code lost:
        if (r9 != false) goto L_0x0170;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x016f, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0170, code lost:
        X.C66581MXm.A1G(r12, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0175, code lost:
        if ((r6 instanceof com.instagram.model.direct.DirectSearchPrompt) == false) goto L_0x0193;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0177, code lost:
        r6 = (com.instagram.model.direct.DirectSearchPrompt) r6;
        r0 = r6.A00;
        r5.A02 = r0;
        r2 = r6.A02;
        r5.A08 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0185, code lost:
        if (r0.ordinal() != 0) goto L_0x0197;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0187, code lost:
        r1 = X.C69461Nm5.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0189, code lost:
        r12.A8M(r1, "suggested_prompt_type");
        r12.AAJ("suggested_prompt_id", r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0193, code lost:
        r12.Cgf();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0197, code lost:
        r1 = X.C69461Nm5.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x019c, code lost:
        if ((r6 instanceof com.instagram.model.direct.DirectSearchPrompt) == false) goto L_0x01a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x019e, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x01a0, code lost:
        r1 = X.C254923tH.A05;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x01a3, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x01a8, code lost:
        if ((r6 instanceof com.instagram.model.direct.DirectMessageSearchMessage) == false) goto L_0x01c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x01aa, code lost:
        r2 = X.AnonymousClass7TE.A1C();
        r1 = ((com.instagram.model.direct.DirectMessageSearchMessage) r6).A04.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x01bb, code lost:
        if (r1.hasNext() == false) goto L_0x0101;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x01bd, code lost:
        X.C66582MXn.A1N(X.C66580MXl.A0k(r1).getId(), r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x01c9, code lost:
        r0 = r6 instanceof com.instagram.model.direct.DirectMessageSearchThread;
        r2 = X.AnonymousClass7TE.A1C();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x01cf, code lost:
        if (r0 == false) goto L_0x0101;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x01d1, code lost:
        r1 = ((com.instagram.model.direct.DirectMessageSearchThread) r6).A03.iterator();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A08(X.PE1 r20, com.instagram.model.direct.DirectSearchResult r21, int r22, long r23, long r25, long r27) {
        /*
            r19 = this;
            r8 = r19
            r6 = r21
            X.OKM r1 = r8.A02
            if (r1 == 0) goto L_0x0017
            java.lang.String r2 = "onClick"
            java.lang.Integer r0 = r1.A00
            if (r0 == 0) goto L_0x0017
            com.facebook.messaging.analytics.search.universal.qpllatency.QPLSearchLatencyLoggingJni r1 = r1.A01
            int r0 = r0.intValue()
            r1.endFlow(r0, r2)
        L_0x0017:
            X.OO3 r5 = r8.A01
            if (r5 == 0) goto L_0x0196
            boolean r4 = r6 instanceof com.instagram.model.direct.DirectShareTarget
            r3 = 0
            r7 = r20
            if (r4 == 0) goto L_0x0200
            r9 = r6
            com.instagram.model.direct.DirectShareTarget r9 = (com.instagram.model.direct.DirectShareTarget) r9
            X.2Dm r10 = r8.A0H
            java.lang.String r2 = r9.A08()
            java.util.List r1 = X.DbT.A14(r9)
            com.instagram.direct.model.thread.CreatorBroadcastThreadInfo r0 = r9.A04
            X.3U9 r3 = r10.BYg(r0, r2, r3, r1)
            com.instagram.common.session.UserSession r0 = r8.A0D
            java.lang.String r1 = r0.A06
            boolean r0 = r8.A0B
            java.lang.Integer r10 = r9.A04(r1, r0)
            X.3t2 r1 = X.DbS.A0c(r9)
        L_0x0043:
            if (r10 == 0) goto L_0x0196
            if (r4 == 0) goto L_0x0217
            r0 = r6
            com.instagram.model.direct.DirectShareTarget r0 = (com.instagram.model.direct.DirectShareTarget) r0
            boolean r0 = r0.A0E()
            if (r0 == 0) goto L_0x0217
        L_0x0050:
            r9 = 1
        L_0x0051:
            r11 = 0
            X.0qQ.A0B(r6, r11)
            r5.A01 = r3
            r5.A04 = r10
            r5.A03 = r1
            r17 = 0
            r8 = 0
            int r0 = (r27 > r17 ? 1 : (r27 == r17 ? 0 : -1))
            if (r0 >= 0) goto L_0x01fa
            r0 = r8
        L_0x0063:
            r5.A05 = r0
            if (r20 == 0) goto L_0x01f7
            boolean r0 = r7.A0G
        L_0x0069:
            r5.A0A = r0
            r5.A0D = r9
            java.lang.String r13 = r5.A07
            if (r13 == 0) goto L_0x0196
            X.0wc r1 = r5.A0E
            java.lang.String r0 = "universal_search_result_selected"
            X.0Aj r12 = X.AnonymousClass7TE.A0e(r1, r0)
            boolean r0 = r12.isSampled()
            if (r0 == 0) goto L_0x0196
            if (r20 == 0) goto L_0x01f4
            java.lang.Integer r1 = r7.A08
        L_0x0083:
            java.lang.Integer r0 = X.AnonymousClass05K.A0D
            boolean r16 = X.AnonymousClass7TF.A1W(r1, r0)
            X.N1F r14 = new X.N1F
            r14.<init>()
            if (r4 == 0) goto L_0x01ec
            r1 = r6
            com.instagram.model.direct.DirectShareTarget r1 = (com.instagram.model.direct.DirectShareTarget) r1
            com.instagram.model.direct.DirectShareTargetLoggingInfo r0 = r1.A08
            java.util.List r2 = X.C71112Od3.A05(r0)
            com.instagram.common.session.UserSession r0 = r5.A0F
            java.lang.String r0 = r0.A06
            boolean r0 = r1.A0Y(r0)
            r15 = 1
            if (r0 != 0) goto L_0x00a5
        L_0x00a4:
            r15 = 0
        L_0x00a5:
            java.lang.String r1 = r5.A06
            java.lang.String r0 = "query_string"
            r14.A06(r0, r1)
            X.Nmn r1 = X.C71112Od3.A01(r10)
            java.lang.String r0 = "result_type"
            r14.A01(r1, r0)
            r0 = r23
            int r10 = (r23 > r17 ? 1 : (r23 == r17 ? 0 : -1))
            if (r10 < 0) goto L_0x00be
            X.C66583MXo.A1A(r14, r0)
        L_0x00be:
            java.lang.String r0 = "search_result"
            r12.AAK(r14, r0)
            java.lang.String r0 = r5.A06
            if (r0 == 0) goto L_0x00ce
            int r1 = r0.length()
            r0 = 0
            if (r1 != 0) goto L_0x00cf
        L_0x00ce:
            r0 = 1
        L_0x00cf:
            r0 = r0 ^ 1
            r1 = r22
            X.Nmm r1 = X.C71112Od3.A03(r1, r0)
            java.lang.String r0 = "ui_section"
            r12.A8M(r1, r0)
            X.C66580MXl.A1H(r12, r13)
            java.lang.String r0 = "data_sources"
            r12.AAe(r0, r2)
            if (r16 != 0) goto L_0x00ef
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r15)
            java.lang.String r0 = "is_interop_thread"
            r12.A7p(r0, r1)
        L_0x00ef:
            java.lang.Long r1 = java.lang.Long.valueOf(r25)
            java.lang.String r0 = "ui_section_index"
            r12.A9F(r0, r1)
            if (r4 == 0) goto L_0x01a6
            r0 = r6
            com.instagram.model.direct.DirectShareTarget r0 = (com.instagram.model.direct.DirectShareTarget) r0
            java.util.ArrayList r2 = r0.A0C()
        L_0x0101:
            java.lang.String r0 = "recipient_ids"
            r12.AAe(r0, r2)
            if (r16 != 0) goto L_0x0115
            if (r20 == 0) goto L_0x01a3
            boolean r0 = r7.A0G
        L_0x010c:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "with_story_ring"
            r12.A7p(r0, r1)
        L_0x0115:
            java.lang.Long r1 = r5.A05
            java.lang.String r0 = "ui_section_rank_index"
            r12.A9F(r0, r1)
            if (r20 == 0) goto L_0x0135
            java.lang.String r0 = r7.A0B
            if (r0 == 0) goto L_0x0135
            X.N1H r2 = new X.N1H
            r2.<init>()
            java.lang.String r1 = X.C71112Od3.A04(r0)
            java.lang.String r0 = "request_id"
            r2.A06(r0, r1)
            java.lang.String r0 = "mnet_request"
            r12.AAK(r2, r0)
        L_0x0135:
            if (r4 == 0) goto L_0x019a
            r1 = r6
            com.instagram.model.direct.DirectShareTarget r1 = (com.instagram.model.direct.DirectShareTarget) r1
            boolean r0 = r1.A0U()
            if (r0 == 0) goto L_0x019a
            X.3t2 r0 = X.DbS.A0c(r1)
            X.3tH r1 = X.AnonymousClass6W3.A00(r0)
        L_0x0148:
            X.3tH r0 = X.C254923tH.DJANGO
            if (r1 != r0) goto L_0x0152
            if (r3 == 0) goto L_0x0152
            java.lang.String r8 = r3.C6C()
        L_0x0152:
            X.C66580MXl.A1J(r12, r8)
            if (r16 != 0) goto L_0x0166
            boolean r0 = r5.A0I
            if (r0 != 0) goto L_0x015d
            if (r9 != 0) goto L_0x0166
        L_0x015d:
            X.NmF r1 = X.C71112Od3.A02(r1)
            java.lang.String r0 = "transport_type"
            r12.A8M(r1, r0)
        L_0x0166:
            boolean r0 = r5.A0H
            if (r0 == 0) goto L_0x0173
            if (r16 != 0) goto L_0x016f
            r0 = 1
            if (r9 != 0) goto L_0x0170
        L_0x016f:
            r0 = 0
        L_0x0170:
            X.C66581MXm.A1G(r12, r0)
        L_0x0173:
            boolean r0 = r6 instanceof com.instagram.model.direct.DirectSearchPrompt
            if (r0 == 0) goto L_0x0193
            com.instagram.model.direct.DirectSearchPrompt r6 = (com.instagram.model.direct.DirectSearchPrompt) r6
            X.9VB r0 = r6.A00
            r5.A02 = r0
            java.lang.String r2 = r6.A02
            r5.A08 = r2
            int r0 = r0.ordinal()
            if (r0 != r11) goto L_0x0197
            X.Nm5 r1 = X.C69461Nm5.IMAGE
        L_0x0189:
            java.lang.String r0 = "suggested_prompt_type"
            r12.A8M(r1, r0)
            java.lang.String r0 = "suggested_prompt_id"
            r12.AAJ(r0, r2)
        L_0x0193:
            r12.Cgf()
        L_0x0196:
            return
        L_0x0197:
            X.Nm5 r1 = X.C69461Nm5.TEXT
            goto L_0x0189
        L_0x019a:
            boolean r0 = r6 instanceof com.instagram.model.direct.DirectSearchPrompt
            if (r0 == 0) goto L_0x01a0
            r1 = r8
            goto L_0x0148
        L_0x01a0:
            X.3tH r1 = X.C254923tH.DJANGO
            goto L_0x0148
        L_0x01a3:
            r0 = 0
            goto L_0x010c
        L_0x01a6:
            boolean r0 = r6 instanceof com.instagram.model.direct.DirectMessageSearchMessage
            if (r0 == 0) goto L_0x01c9
            java.util.ArrayList r2 = X.AnonymousClass7TE.A1C()
            r0 = r6
            com.instagram.model.direct.DirectMessageSearchMessage r0 = (com.instagram.model.direct.DirectMessageSearchMessage) r0
            com.google.common.collect.ImmutableList r0 = r0.A04
            java.util.Iterator r1 = r0.iterator()
        L_0x01b7:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0101
            com.instagram.pendingmedia.model.recipients.PendingRecipient r0 = X.C66580MXl.A0k(r1)
            java.lang.String r0 = r0.getId()
            X.C66582MXn.A1N(r0, r2)
            goto L_0x01b7
        L_0x01c9:
            boolean r0 = r6 instanceof com.instagram.model.direct.DirectMessageSearchThread
            java.util.ArrayList r2 = X.AnonymousClass7TE.A1C()
            if (r0 == 0) goto L_0x0101
            r0 = r6
            com.instagram.model.direct.DirectMessageSearchThread r0 = (com.instagram.model.direct.DirectMessageSearchThread) r0
            com.google.common.collect.ImmutableList r0 = r0.A03
            java.util.Iterator r1 = r0.iterator()
        L_0x01da:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0101
            com.instagram.pendingmedia.model.recipients.PendingRecipient r0 = X.C66580MXl.A0k(r1)
            java.lang.String r0 = r0.getId()
            X.C66582MXn.A1N(r0, r2)
            goto L_0x01da
        L_0x01ec:
            X.NmD r0 = X.C69469NmD.SERVER_ENTITIES_NAMED_DSQ2
            java.util.List r2 = X.AnonymousClass7TE.A1I(r0)
            goto L_0x00a4
        L_0x01f4:
            r1 = r8
            goto L_0x0083
        L_0x01f7:
            r0 = 0
            goto L_0x0069
        L_0x01fa:
            java.lang.Long r0 = java.lang.Long.valueOf(r27)
            goto L_0x0063
        L_0x0200:
            boolean r0 = r6 instanceof com.instagram.model.direct.DirectMessageSearchMessage
            if (r0 == 0) goto L_0x021e
            r0 = r6
            com.instagram.model.direct.DirectMessageSearchMessage r0 = (com.instagram.model.direct.DirectMessageSearchMessage) r0
            X.2Dm r2 = r8.A0H
            java.lang.String r1 = r0.A09
            com.google.common.collect.ImmutableList r0 = r0.A04
        L_0x020d:
            X.3U9 r3 = r2.BYg(r3, r1, r3, r0)
            java.lang.Integer r10 = X.AnonymousClass05K.A00
            X.3t0 r1 = X.C66580MXl.A0g(r1)
        L_0x0217:
            boolean r0 = r8.A0A
            r9 = 0
            if (r0 == 0) goto L_0x0051
            goto L_0x0050
        L_0x021e:
            boolean r0 = r6 instanceof com.instagram.model.direct.DirectMessageSearchThread
            if (r0 == 0) goto L_0x022c
            r0 = r6
            com.instagram.model.direct.DirectMessageSearchThread r0 = (com.instagram.model.direct.DirectMessageSearchThread) r0
            X.2Dm r2 = r8.A0H
            java.lang.String r1 = r0.A08
            com.google.common.collect.ImmutableList r0 = r0.A03
            goto L_0x020d
        L_0x022c:
            boolean r0 = r6 instanceof com.instagram.model.direct.DirectSearchResharedContent
            if (r0 == 0) goto L_0x0272
            r0 = r6
            com.instagram.model.direct.DirectSearchResharedContent r0 = (com.instagram.model.direct.DirectSearchResharedContent) r0
            X.1Xj r9 = r0.A01
            if (r9 == 0) goto L_0x0196
            com.google.common.collect.ImmutableList$Builder r10 = new com.google.common.collect.ImmutableList$Builder
            r10.<init>()
            java.util.Set r0 = r0.A02
            com.google.common.collect.ImmutableSet r0 = com.google.common.collect.ImmutableSet.A03(r0)
            java.util.Iterator r2 = r0.iterator()
        L_0x0246:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0259
            com.instagram.user.model.User r1 = X.DbT.A0k(r2)
            com.instagram.pendingmedia.model.recipients.PendingRecipient r0 = new com.instagram.pendingmedia.model.recipients.PendingRecipient
            r0.<init>((com.instagram.user.model.User) r1)
            r10.add(r0)
            goto L_0x0246
        L_0x0259:
            X.2Dm r2 = r8.A0H
            java.lang.String r1 = r9.A2n()
            com.google.common.collect.ImmutableList r0 = r10.build()
            X.3U9 r3 = r2.BYg(r3, r1, r3, r0)
            java.lang.String r0 = r9.A2n()
            X.3t0 r1 = X.C66580MXl.A0g(r0)
            java.lang.Integer r10 = X.AnonymousClass05K.A1F
            goto L_0x0217
        L_0x0272:
            boolean r0 = r6 instanceof com.instagram.model.direct.DirectSearchPrompt
            if (r0 == 0) goto L_0x027b
            java.lang.Integer r10 = X.AnonymousClass05K.A0B
        L_0x0278:
            r1 = r3
            goto L_0x0043
        L_0x027b:
            if (r20 == 0) goto L_0x0196
            java.lang.Integer r10 = r7.A08
            java.lang.Integer r0 = X.AnonymousClass05K.A0E
            if (r10 != r0) goto L_0x0196
            goto L_0x0278
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C72208OyY.A08(X.PE1, com.instagram.model.direct.DirectSearchResult, int, long, long, long):void");
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [X.NSQ, java.lang.Runnable] */
    public final void A09(DirectSearchResult directSearchResult) {
        OO3 oo3 = this.A01;
        if (oo3 == null) {
            return;
        }
        if (directSearchResult == null || !(directSearchResult instanceof DirectMessageSearchThread)) {
            oo3.A09 = oo3.A0G.schedule(new NSQ(oo3, (Long) null, (String) null, false), 2, TimeUnit.SECONDS);
        }
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [X.NRL, java.lang.Runnable] */
    public final void A0A(DirectSearchResult directSearchResult, String str, int i, long j, long j2) {
        String A082;
        C254783t2 r0;
        String str2;
        if (this.A06 != null && (directSearchResult instanceof DirectShareTarget)) {
            DirectShareTarget directShareTarget = (DirectShareTarget) directSearchResult;
            2Dm r4 = this.A0H;
            if (DbS.A0c(directShareTarget) instanceof MsysThreadId) {
                A082 = null;
            } else {
                A082 = directShareTarget.A08();
            }
            this.A03 = r4.BYg(directShareTarget.A04, A082, (String) null, DbT.A14(directShareTarget));
            Pattern pattern = 0mp.A06;
            this.A00 = (long) DbX.A05(str);
            this.A04 = DbS.A0c(directShareTarget);
            this.A08 = directShareTarget.A0E();
            0Aj A0e = AnonymousClass7TE.A0e(this.A0C, "direct_compose_select_recipient");
            if (A0e.isSampled()) {
                C66581MXm.A1E(A0e, j);
                A0e.A9F("relative_position", Long.valueOf(j2));
                DbS.A1N(A0e, "DIRECT");
                C66580MXl.A1H(A0e, this.A06);
                A0e.AAJ("search_string", str);
                C66581MXm.A1F(A0e, this.A00);
                C66580MXl.A1J(A0e, A01(this));
                A0e.AAe("recipient_ids", A02(this));
                A0e.AAJ("section_type", C69838Nt2.A00(i));
                if (this.A0G && !this.A08 && !this.A0A && (r0 = this.A04) != null) {
                    C254923tH A002 = AnonymousClass6W3.A00(r0);
                    if (A002 != null) {
                        str2 = A002.A00;
                    } else {
                        str2 = null;
                    }
                    A0e.AAJ(TraceFieldType.TransportType, str2);
                }
                DbX.A1L(A0e);
            }
            this.A07 = this.A0F.schedule(new NRL(this), 30, TimeUnit.SECONDS);
        }
    }

    public final void A0B(Integer num, int i, long j) {
        OO3 oo3 = this.A01;
        if (oo3 != null) {
            oo3.A03(num, i, j);
        }
    }

    public final void A0C(String str) {
        OO3 oo3 = this.A01;
        if (oo3 != null) {
            0Aj A0e = AnonymousClass7TE.A0e(oo3.A0E, "messaging_ai_agent_feedback");
            if (A0e.isSampled()) {
                0bb r2 = new 0bb();
                r2.A01(C69430Nla.IGD_UNIVERSAL_SEARCH, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
                r2.A06(PublicKeyCredentialControllerUtility.JSON_KEY_RESPONSE, str);
                AnonymousClass7TE.A1W(A0e, "action_type", 0);
                AnonymousClass7TE.A1W(A0e, "view_name", 35);
                A0e.AAK(r2, "feedback");
                A0e.Cgf();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004a, code lost:
        if (r3.length() == 0) goto L_0x004c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00a7, code lost:
        if (r3.length() == 0) goto L_0x00a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001b, code lost:
        if (r12.A0A != false) goto L_0x001d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Cit(X.OHD r23, boolean r24) {
        /*
            r22 = this;
            r13 = r23
            java.lang.Object r11 = r13.A05
            X.PE1 r11 = (X.PE1) r11
            int r0 = r13.A00
            long r6 = (long) r0
            r12 = r22
            X.OO3 r10 = r12.A01
            r21 = r24
            if (r10 == 0) goto L_0x0170
            if (r11 == 0) goto L_0x0170
            boolean r0 = r11.A0F
            if (r0 != 0) goto L_0x001d
            boolean r0 = r12.A0A
            r20 = 0
            if (r0 == 0) goto L_0x001f
        L_0x001d:
            r20 = 1
        L_0x001f:
            java.lang.String r14 = r10.A07
            if (r14 == 0) goto L_0x0170
            X.0wc r1 = r10.A0E
            java.lang.String r0 = "universal_search_impression"
            X.0Aj r9 = X.AnonymousClass7TE.A0e(r1, r0)
            boolean r0 = r9.isSampled()
            if (r0 == 0) goto L_0x0170
            java.lang.Integer r8 = r11.A08
            java.lang.Integer r0 = X.AnonymousClass05K.A0D
            r5 = 0
            r19 = 1
            boolean r18 = X.AnonymousClass7TF.A1W(r8, r0)
            X.N1E r4 = new X.N1E
            r4.<init>()
            java.lang.String r3 = r11.A00
            if (r3 == 0) goto L_0x004c
            int r1 = r3.length()
            r0 = 0
            if (r1 != 0) goto L_0x004d
        L_0x004c:
            r0 = 1
        L_0x004d:
            r17 = 0
            r1 = r3
            if (r0 == 0) goto L_0x0054
            r1 = r17
        L_0x0054:
            java.lang.String r0 = "query_string"
            r4.A06(r0, r1)
            X.0qQ.A07(r8)
            X.Nmn r1 = X.C71112Od3.A01(r8)
            java.lang.String r0 = "result_type"
            r4.A01(r1, r0)
            int r0 = r11.A01
            long r0 = (long) r0
            r15 = 0
            int r2 = (r0 > r15 ? 1 : (r0 == r15 ? 0 : -1))
            if (r2 < 0) goto L_0x0071
            X.C66583MXo.A1A(r4, r0)
        L_0x0071:
            com.instagram.model.direct.DirectShareTargetLoggingInfo r15 = r11.A06
            X.3t2 r2 = r11.A07
            java.util.ArrayList r1 = X.AnonymousClass7TE.A1C()
            java.util.List r0 = r11.A0E
            if (r0 == 0) goto L_0x0099
            com.google.common.collect.ImmutableList r0 = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) r0)
            if (r0 == 0) goto L_0x0099
            X.3kO r16 = X.C66580MXl.A0J(r0)
        L_0x0087:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x0099
            com.instagram.pendingmedia.model.recipients.PendingRecipient r0 = X.C66580MXl.A0k(r16)
            java.lang.String r0 = r0.getId()
            X.C66582MXn.A1N(r0, r1)
            goto L_0x0087
        L_0x0099:
            java.lang.String r0 = "search_result"
            r9.AAK(r4, r0)
            int r4 = r11.A03
            if (r3 == 0) goto L_0x00a9
            int r3 = r3.length()
            r0 = 0
            if (r3 != 0) goto L_0x00aa
        L_0x00a9:
            r0 = 1
        L_0x00aa:
            r0 = r0 ^ 1
            X.Nmm r3 = X.C71112Od3.A03(r4, r0)
            java.lang.String r0 = "ui_section"
            r9.A8M(r3, r0)
            X.C66580MXl.A1H(r9, r14)
            java.util.List r3 = X.C71112Od3.A05(r15)
            r0 = r21
            X.C66584MXp.A0y(r9, r3, r0)
            if (r18 != 0) goto L_0x00d6
            java.lang.String r3 = X.O19.A00(r8)
            java.lang.String r0 = "ig"
            boolean r0 = X.00l.A0d(r3, r0, r5)
            java.lang.Boolean r3 = X.DbT.A0l(r0)
            java.lang.String r0 = "is_interop_thread"
            r9.A7p(r0, r3)
        L_0x00d6:
            int r0 = r11.A02
            java.lang.Long r3 = X.DbS.A0j(r0)
            java.lang.String r0 = "ui_section_index"
            r9.A9F(r0, r3)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r19)
            java.lang.String r0 = "is_clickable"
            r9.A7p(r0, r3)
            if (r2 == 0) goto L_0x02d4
            X.3t3 r0 = X.AnonymousClass6W3.A05(r2)
            if (r0 == 0) goto L_0x02d4
            X.3t0 r0 = X.C300965yF.A02(r0)
            if (r0 == 0) goto L_0x02d4
            java.lang.String r0 = r0.A00
        L_0x00fa:
            X.C66580MXl.A1J(r9, r0)
            java.lang.String r0 = "recipient_ids"
            r9.AAe(r0, r1)
            if (r18 != 0) goto L_0x0124
            boolean r0 = r11.A0G
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "with_story_ring"
            r9.A7p(r0, r1)
            boolean r0 = r10.A0I
            if (r0 != 0) goto L_0x0115
            if (r20 != 0) goto L_0x0124
        L_0x0115:
            if (r2 == 0) goto L_0x011b
            X.3tH r17 = X.AnonymousClass6W3.A00(r2)
        L_0x011b:
            X.NmF r1 = X.C71112Od3.A02(r17)
            java.lang.String r0 = "transport_type"
            r9.A8M(r1, r0)
        L_0x0124:
            java.lang.String r0 = r11.A0B
            if (r0 == 0) goto L_0x0146
            X.N1H r2 = new X.N1H
            r2.<init>()
            java.lang.String r1 = X.C71112Od3.A04(r0)
            java.lang.String r0 = "request_id"
            r2.A06(r0, r1)
            if (r15 == 0) goto L_0x0141
            java.lang.Double r1 = r15.A01
            if (r1 == 0) goto L_0x0141
            java.lang.String r0 = "final_score"
            r2.A04(r0, r1)
        L_0x0141:
            java.lang.String r0 = "mnet_request"
            r9.AAK(r2, r0)
        L_0x0146:
            boolean r0 = r10.A0H
            if (r0 == 0) goto L_0x0152
            if (r18 != 0) goto L_0x014f
            if (r20 == 0) goto L_0x014f
            r5 = 1
        L_0x014f:
            X.C66581MXm.A1G(r9, r5)
        L_0x0152:
            X.9VB r0 = r11.A05
            if (r0 == 0) goto L_0x0164
            r1 = 0
            int r0 = r0.ordinal()
            if (r0 != r1) goto L_0x02d0
            X.Nm5 r1 = X.C69461Nm5.IMAGE
        L_0x015f:
            java.lang.String r0 = "suggested_prompt_type"
            r9.A8M(r1, r0)
        L_0x0164:
            java.lang.String r1 = r11.A0D
            if (r1 == 0) goto L_0x016d
            java.lang.String r0 = "suggested_prompt_id"
            r9.AAJ(r0, r1)
        L_0x016d:
            r9.Cgf()
        L_0x0170:
            java.lang.String r0 = r12.A06
            if (r0 == 0) goto L_0x0290
            if (r11 == 0) goto L_0x0290
            r1 = 0
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0290
            X.3t2 r10 = r11.A07
            long r4 = r13.A04
            java.lang.Long r9 = java.lang.Long.valueOf(r4)
            boolean r1 = r10 instanceof X.C254773t1
            r0 = 0
            if (r1 == 0) goto L_0x02cd
            X.3sy r8 = X.AnonymousClass6W3.A06(r10)
        L_0x018d:
            X.0wc r2 = r12.A0C
            java.lang.String r1 = "direct_inbox_search_impression"
            X.0Aj r3 = X.AnonymousClass7TE.A0e(r2, r1)
            boolean r1 = r3.isSampled()
            if (r1 == 0) goto L_0x0290
            java.lang.String r1 = r12.A06
            X.C66580MXl.A1H(r3, r1)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r21)
            java.lang.String r1 = "selected"
            r3.A7p(r1, r2)
            int r1 = r11.A01
            java.lang.Long r2 = X.DbS.A0j(r1)
            java.lang.String r1 = "absolute_position"
            r3.A9F(r1, r2)
            int r1 = r11.A02
            java.lang.Long r2 = X.DbS.A0j(r1)
            java.lang.String r1 = "relative_position"
            r3.A9F(r1, r2)
            int r1 = r11.A04
            java.lang.Long r2 = X.DbS.A0j(r1)
            java.lang.String r1 = "ui_section_position"
            r3.A9F(r1, r2)
            long r1 = r13.A03
            java.lang.Long r2 = java.lang.Long.valueOf(r1)
            r1 = 3003(0xbbb, float:4.208E-42)
            java.lang.String r1 = X.C273654mx.A00(r1)
            r3.A9F(r1, r2)
            long r1 = r13.A01
            java.lang.Long r2 = java.lang.Long.valueOf(r1)
            java.lang.String r1 = "first_duration_ms"
            r3.A9F(r1, r2)
            long r1 = r13.A02
            java.lang.Long r2 = java.lang.Long.valueOf(r1)
            java.lang.String r1 = "last_duration_ms"
            r3.A9F(r1, r2)
            java.lang.String r1 = "total_duration_ms"
            r3.A9F(r1, r9)
            long r4 = r4 / r6
            java.lang.Long r2 = java.lang.Long.valueOf(r4)
            java.lang.String r1 = "avg_duration_ms"
            r3.A9F(r1, r2)
            java.lang.Long r2 = java.lang.Long.valueOf(r6)
            java.lang.String r1 = "num_of_vpv_entries"
            r3.A9F(r1, r2)
            java.lang.String r2 = r11.A0B
            java.lang.String r1 = "mnet_request_id"
            r3.AAJ(r1, r2)
            java.lang.String r2 = r11.A00
            java.lang.String r1 = "search_query"
            r3.AAJ(r1, r2)
            int r1 = r11.A03
            java.lang.String r2 = X.C69838Nt2.A00(r1)
            java.lang.String r1 = "ui_section"
            r3.AAJ(r1, r2)
            java.lang.String r2 = r11.A0C
            java.lang.String r1 = "query_session_id"
            r3.AAJ(r1, r2)
            if (r8 == 0) goto L_0x0231
            boolean r1 = r8 instanceof com.instagram.model.direct.DirectThreadKey
            if (r1 == 0) goto L_0x0231
            com.instagram.model.direct.DirectThreadKey r8 = (com.instagram.model.direct.DirectThreadKey) r8
            java.lang.String r0 = r8.A00
        L_0x0231:
            X.C66580MXl.A1J(r3, r0)
            java.util.List r1 = r11.A0E
            if (r1 == 0) goto L_0x0272
            com.google.common.collect.ImmutableList r0 = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) r1)
            if (r0 == 0) goto L_0x0272
            com.google.common.collect.ImmutableList r1 = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) r1)
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x0293
            X.N0Y r2 = new X.N0Y
            r2.<init>()
            com.instagram.common.session.UserSession r0 = r12.A0D
            java.lang.String r0 = r0.A06
            java.lang.Long r1 = X.DbV.A0q(r0)
            java.lang.String r0 = "recipient_id"
            r2.A05(r0, r1)
            X.Nly r1 = X.C69454Nly.INSTAGRAM
            r0 = 664(0x298, float:9.3E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r2.A01(r1, r0)
            X.N0Y[] r0 = new X.N0Y[]{r2}
            java.util.List r6 = java.util.Arrays.asList(r0)
        L_0x026d:
            java.lang.String r0 = "recipient_info"
            r3.AAe(r0, r6)
        L_0x0272:
            boolean r0 = r12.A0G
            if (r0 == 0) goto L_0x028d
            boolean r0 = r11.A0F
            if (r0 != 0) goto L_0x028d
            boolean r0 = r12.A0A
            if (r0 != 0) goto L_0x028d
            if (r10 == 0) goto L_0x028d
            X.3tH r0 = X.AnonymousClass6W3.A00(r10)
            if (r0 == 0) goto L_0x0291
            java.lang.String r1 = r0.A00
        L_0x0288:
            java.lang.String r0 = "transport_type"
            r3.AAJ(r0, r1)
        L_0x028d:
            r3.Cgf()
        L_0x0290:
            return
        L_0x0291:
            r1 = 0
            goto L_0x0288
        L_0x0293:
            java.util.ArrayList r6 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r5 = r1.iterator()
        L_0x029b:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x026d
            com.instagram.pendingmedia.model.recipients.PendingRecipient r4 = X.C66580MXl.A0k(r5)
            X.N0Y r2 = new X.N0Y
            r2.<init>()
            java.lang.String r0 = r4.getId()
            java.lang.Long r1 = X.DbV.A0q(r0)
            java.lang.String r0 = "recipient_id"
            r2.A05(r0, r1)
            int r0 = r4.A01
            if (r0 != 0) goto L_0x02ca
            X.Nly r1 = X.C69454Nly.INSTAGRAM
        L_0x02bd:
            r0 = 664(0x298, float:9.3E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r2.A01(r1, r0)
            r6.add(r2)
            goto L_0x029b
        L_0x02ca:
            X.Nly r1 = X.C69454Nly.FACEBOOK
            goto L_0x02bd
        L_0x02cd:
            r8 = r0
            goto L_0x018d
        L_0x02d0:
            X.Nm5 r1 = X.C69461Nm5.TEXT
            goto L_0x015f
        L_0x02d4:
            r0 = r17
            goto L_0x00fa
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C72208OyY.Cit(X.OHD, boolean):void");
    }

    public C72208OyY(UserSession userSession) {
        this.A0D = userSession;
        this.A0H = 2L2.A00(userSession);
        0wc A012 = AnonymousClass0kN.A01(new Os4(this), userSession);
        this.A0C = A012;
        0Tu r2 = 0Tu.A05;
        this.A0G = 182.A06(r2, userSession, 36312741602198777L);
        if (182.A06(r2, userSession, 36313471746312213L)) {
            this.A01 = new OO3(A012, userSession);
        }
        this.A0B = 182.A06(r2, userSession, 36313944192977219L);
        this.A0A = 182.A06(r2, userSession, 36313471746574361L);
        0qQ.A0B(userSession, 0);
        if (182.A06(r2, userSession, 36320416708632973L)) {
            this.A02 = C69969Nv9.A00(userSession);
        }
    }

    public final void onSessionWillEnd() {
        A03();
        OO3 oo3 = this.A01;
        if (oo3 != null) {
            oo3.A00();
        }
    }
}
