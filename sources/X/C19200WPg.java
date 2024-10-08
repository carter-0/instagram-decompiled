package X;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.ReelViewerConfig;
import java.util.List;

/* renamed from: X.WPg  reason: case insensitive filesystem */
public final class C19200WPg implements AnonymousClass0iw {
    public static final DialogInterface A0P = new C18847W5q();
    public static final String __redex_internal_original_name = "ReelSelfMenuOptionsOverflowHelper";
    public DialogInterface.OnDismissListener A00;
    public final Activity A01;
    public final Context A02;
    public final Fragment A03;
    public final 0hq A04;
    public final AnonymousClass07i A05;
    public final AnonymousClass0iw A06;
    public final UserSession A07;
    public final 1Xj A08;
    public final AnonymousClass4DU A09;
    public final C255773uh A0A;
    public final C250973mM A0B;
    public final ReelViewerConfig A0C;
    public final AnonymousClass3BQ A0D;
    public final C17528VZh A0E;
    public final AnonymousClass6Z6 A0F;
    public final String A0G;
    public final List A0H;
    public final List A0I;
    public final List A0J;
    public final List A0K;
    public final C62320sa A0L;
    public final Resources A0M;
    public final AnonymousClass36V A0N;
    public final LEM A0O;

    public C19200WPg(Activity activity, Context context, Resources resources, Fragment fragment, AnonymousClass0iw r22, UserSession userSession, AnonymousClass36V r24, AnonymousClass4DU r25, C255773uh r26, C250973mM r27, ReelViewerConfig reelViewerConfig, AnonymousClass3BQ r29, AnonymousClass6Z6 r30, C62320sa r31) {
        C16593Uxn[] uxnArr;
        List A1P;
        AnonymousClass6Z6 r9 = r30;
        0qQ.A0B(r9, 11);
        this.A01 = activity;
        Fragment fragment2 = fragment;
        this.A03 = fragment2;
        AnonymousClass0iw r6 = r22;
        this.A06 = r6;
        this.A02 = context;
        this.A0M = resources;
        this.A0B = r27;
        C255773uh r8 = r26;
        this.A0A = r8;
        this.A09 = r25;
        this.A0D = r29;
        UserSession userSession2 = userSession;
        this.A07 = userSession2;
        this.A0F = r9;
        this.A0N = r24;
        ReelViewerConfig reelViewerConfig2 = reelViewerConfig;
        this.A0C = reelViewerConfig2;
        this.A0L = r31;
        this.A04 = fragment2.getParentFragmentManager();
        this.A05 = AnonymousClass07i.A00(fragment2);
        this.A0E = new C17528VZh(fragment2, userSession2, r8);
        this.A0O = new LEM(fragment2, r6, userSession2, r8, r9);
        1Xj r2 = r8.A0b;
        this.A08 = r2;
        this.A0G = DbX.A0r(r8.A0i);
        if (r8.A1e()) {
            A1P = AnonymousClass7TE.A1I(C16593Uxn.DELETE);
        } else {
            if (reelViewerConfig2.A0L) {
                uxnArr = new C16593Uxn[]{C16593Uxn.DELETE, C16593Uxn.ARCHIVE, C16593Uxn.SEE_WHY_MISINFORMATION, C16593Uxn.SAVE_TO_CAMERA_ROLL, C16593Uxn.COPY_LINK, C16593Uxn.SHOW_QR_CODE, C16593Uxn.SHARE, C16593Uxn.ADD_MENTIONS};
            } else if (r2 == null || r2.A2K() != AnonymousClass05K.A0C || !reelViewerConfig2.A0B) {
                uxnArr = new C16593Uxn[]{C16593Uxn.DELETE, C16593Uxn.ARCHIVE, C16593Uxn.ADD_CAPTIONS, C16593Uxn.SEE_WHY_MISINFORMATION, C16593Uxn.SAVE_TO_CAMERA_ROLL, C16593Uxn.SEND_TO_DIRECT, C16593Uxn.HIGHLIGHT, C16593Uxn.SHARE_TO_FACEBOOK, C16593Uxn.SHARE_AS_POST, C16593Uxn.PAID_PARTNERSHIP, C16593Uxn.EDIT_GEN_AI, C16593Uxn.COPY_LINK, C16593Uxn.SHOW_QR_CODE, C16593Uxn.SHARE, C16593Uxn.ADD_MENTIONS, C16593Uxn.STORY_SETTINGS};
            } else {
                uxnArr = new C16593Uxn[]{C16593Uxn.DELETE_HARD, C16593Uxn.RESTORE};
            }
            A1P = 0sr.A1P(uxnArr);
        }
        this.A0H = A1P;
        this.A0J = 0sr.A1P(new C16593Uxn[]{C16593Uxn.STORIES_DELETE_TEMPLATE, C16593Uxn.STORIES_DELETE_MUSIC_TEMPLATE});
        this.A0K = 0sr.A1P(new C16593Uxn[]{C16593Uxn.TURN_OFF_COMMENTING, C16593Uxn.TURN_ON_COMMENTING});
        this.A0I = 0sr.A1P(new C16593Uxn[]{C16593Uxn.DEV_PAUSE_PLAYBACK, C16593Uxn.DEV_RESUME_PLAYBACK, C16593Uxn.DEV_BULK_LIKE, C16593Uxn.DEV_SHOW_RANKER_SCORE});
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x01f2, code lost:
        r1 = X.182.A06(X.0Tu.A05, r12, 36318247749949468L);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x025c, code lost:
        if (X.182.A06(X.0Tu.A05, r4, 36316718741983855L) == false) goto L_0x025e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0156, code lost:
        if (X.2R8.A05(r12, r0) != false) goto L_0x0219;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x017f, code lost:
        if (r1 != X.AnonymousClass05K.A01) goto L_0x0024;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01ca, code lost:
        r0 = X.182.A06(r3, r12, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x01ce, code lost:
        if (r0 != false) goto L_0x0024;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0049, code lost:
        r4.add(r5);
     */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x0024 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.List A00(X.C19200WPg r17) {
        /*
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2 = r17
            java.util.List r0 = r2.A0H
            r1.addAll(r0)
            java.util.List r0 = r2.A0K
            r1.addAll(r0)
            java.util.List r0 = r2.A0J
            r1.addAll(r0)
            java.util.List r0 = r2.A0I
            r1.addAll(r0)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r10 = r1.iterator()
        L_0x0024:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x021d
            java.lang.Object r5 = r10.next()
            r1 = r5
            X.Uxn r1 = (X.C16593Uxn) r1
            X.3uh r13 = r2.A0A
            com.instagram.common.session.UserSession r12 = r2.A07
            boolean r0 = r13.A1s(r12)
            r17 = 0
            if (r0 == 0) goto L_0x0042
            boolean r0 = r1.A00
            if (r0 != 0) goto L_0x0042
            goto L_0x0024
        L_0x0042:
            int r0 = r1.ordinal()
            switch(r0) {
                case 0: goto L_0x005c;
                case 1: goto L_0x0049;
                case 2: goto L_0x00b8;
                case 3: goto L_0x00eb;
                case 4: goto L_0x0049;
                case 5: goto L_0x004d;
                case 6: goto L_0x00f5;
                case 7: goto L_0x0113;
                case 8: goto L_0x0049;
                case 9: goto L_0x0122;
                case 10: goto L_0x0122;
                case 11: goto L_0x0134;
                case 12: goto L_0x015a;
                case 13: goto L_0x016d;
                case 14: goto L_0x0183;
                case 15: goto L_0x00b2;
                case 16: goto L_0x01d2;
                case 17: goto L_0x0049;
                case 18: goto L_0x01d9;
                case 19: goto L_0x01e6;
                case 20: goto L_0x01fe;
                case 21: goto L_0x0210;
                case 22: goto L_0x0215;
                case 23: goto L_0x0215;
                case 24: goto L_0x0215;
                case 25: goto L_0x0215;
                default: goto L_0x0049;
            }
        L_0x0049:
            r4.add(r5)
            goto L_0x0024
        L_0x004d:
            boolean r0 = r2.A03()
            if (r0 == 0) goto L_0x0024
            X.0Tu r3 = X.0Tu.A05
            r0 = 36329079657545497(0x81111b00013f19, double:3.0379944886693096E-306)
            goto L_0x01ca
        L_0x005c:
            X.1Av r6 = X.1Au.A00(r12)
            X.0s0 r3 = r6.A0D
            X.0YZ[] r1 = X.1Av.A8a
            r0 = 64
            boolean r0 = X.AnonymousClass7TG.A1a(r6, r3, r1, r0)
            if (r0 == 0) goto L_0x0024
            X.3QO r1 = r13.A0B()
            X.3QO r0 = X.AnonymousClass3QO.CLOSE_FRIENDS
            if (r1 == r0) goto L_0x0024
            X.3QO r1 = r13.A0B()
            X.3QO r0 = X.AnonymousClass3QO.OPAL
            if (r1 == r0) goto L_0x0024
            boolean r0 = r13.A1D()
            if (r0 != 0) goto L_0x0024
            X.3QO r1 = r13.A0B()
            X.3QO r0 = X.AnonymousClass3QO.CUSTOM
            if (r1 == r0) goto L_0x0024
            X.3QO r1 = r13.A0B()
            X.3QO r0 = X.AnonymousClass3QO.HALLPASS
            if (r1 == r0) goto L_0x0024
            X.3WT r0 = X.AnonymousClass3WT.SECRET_STICKER
            boolean r0 = r13.A1t(r0)
            if (r0 != 0) goto L_0x0024
            boolean r0 = r13.CWu()
            if (r0 == 0) goto L_0x0024
            boolean r0 = r13.A1g()
            if (r0 == 0) goto L_0x0024
            com.instagram.model.reels.ReelViewerConfig r3 = r2.A0C
            X.3mM r1 = r2.A0B
            X.3BQ r0 = r2.A0D
            boolean r0 = X.AnonymousClass6YK.A05(r12, r13, r1, r3, r0)
            goto L_0x01ce
        L_0x00b2:
            boolean r1 = X.AnonymousClass430.A00(r12)
            goto L_0x0219
        L_0x00b8:
            X.1Xj r3 = r2.A08
            if (r3 == 0) goto L_0x00de
            long r8 = r3.A1A()
            r0 = 86400(0x15180, double:4.26873E-319)
            long r8 = r8 + r0
            long r6 = X.AnonymousClass7TG.A0I()
            int r0 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            boolean r0 = X.C51970G9q.A1T(r0)
            if (r0 != 0) goto L_0x00de
            boolean r0 = r3.A5O()
            if (r0 == 0) goto L_0x00de
            boolean r0 = X.AnonymousClass8PU.A08(r12)
            if (r0 == 0) goto L_0x00de
            goto L_0x0024
        L_0x00de:
            X.0Tu r3 = X.0Tu.A05
            r0 = 36318909174913766(0x8107db00001ae6, double:3.0315626344997565E-306)
            boolean r1 = X.182.A06(r3, r12, r0)
            goto L_0x0219
        L_0x00eb:
            X.1Xj r0 = r2.A08
            if (r0 == 0) goto L_0x0024
            boolean r1 = X.C56587I2r.A02(r0)
            goto L_0x0219
        L_0x00f5:
            com.instagram.reels.store.ReelStore r1 = com.instagram.reels.store.ReelStore.A03(r12)
            java.lang.String r0 = r13.A0k
            com.instagram.model.reels.Reel r0 = r1.A0M(r0)
            if (r0 == 0) goto L_0x0049
            boolean r0 = r0.A0h()
            if (r0 == 0) goto L_0x0049
            boolean r0 = r2.A03()
            if (r0 == 0) goto L_0x0049
            boolean r0 = X.C14290TtO.A00(r12)
            goto L_0x01ce
        L_0x0113:
            boolean r0 = r2.A03()
            if (r0 == 0) goto L_0x0024
            X.0Tu r3 = X.0Tu.A05
            r0 = 36329079657479960(0x81111b00003f18, double:3.037994488627864E-306)
            goto L_0x01ca
        L_0x0122:
            X.1Xj r0 = r2.A08
            if (r0 == 0) goto L_0x0024
            java.lang.Integer r1 = r0.A2K()
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r1 != r0) goto L_0x0024
            com.instagram.model.reels.ReelViewerConfig r0 = r2.A0C
            boolean r1 = r0.A0B
            goto L_0x0219
        L_0x0134:
            X.1Xj r7 = r2.A08
            if (r7 == 0) goto L_0x0024
            boolean r0 = r13.CcK()
            if (r0 == 0) goto L_0x0024
            boolean r6 = r7.CeS()
            boolean r3 = r7.A51()
            boolean r1 = r7.A4L()
            java.lang.String r0 = X.C51973G9u.A0k(r7)
            if (r6 == 0) goto L_0x0024
            if (r3 == 0) goto L_0x0024
            boolean r0 = X.2R8.A05(r12, r0)
            if (r0 == 0) goto L_0x0049
            goto L_0x0219
        L_0x015a:
            androidx.fragment.app.Fragment r0 = r2.A03
            android.content.Context r11 = r0.requireContext()
            X.3mM r14 = r2.A0B
            X.3BQ r0 = r2.A0D
            com.instagram.model.reels.ReelViewerConfig r15 = r2.A0C
            r16 = r0
            java.lang.Integer r1 = X.JZT.A01(r11, r12, r13, r14, r15, r16, r17)
            goto L_0x017d
        L_0x016d:
            X.3mM r14 = r2.A0B
            com.instagram.model.reels.ReelViewerConfig r15 = r2.A0C
            X.3BQ r0 = r2.A0D
            android.content.Context r11 = r2.A02
            r16 = r0
            X.N4R r0 = X.JZT.A00(r11, r12, r13, r14, r15, r16, r17)
            java.lang.Object r1 = r0.A00
        L_0x017d:
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r1 != r0) goto L_0x0024
            goto L_0x0049
        L_0x0183:
            X.3BQ r1 = r2.A0D
            X.3BQ r0 = X.AnonymousClass3BQ.DIRECT
            r3 = 1
            if (r1 == r0) goto L_0x0024
            android.app.Activity r1 = r2.A01
            r0 = 2130970923(0x7f04092b, float:1.755057E38)
            boolean r0 = X.2Yu.A0L(r1, r0, r3)
            if (r0 == 0) goto L_0x0024
            boolean r0 = r13.A1g()
            if (r0 == 0) goto L_0x0024
            X.3mM r0 = r2.A0B
            boolean r0 = r0.A0D()
            if (r0 != 0) goto L_0x0024
            X.3WT r0 = X.AnonymousClass3WT.SECRET_STICKER
            boolean r0 = r13.A1t(r0)
            if (r0 != 0) goto L_0x0024
            X.3QO r1 = r13.A0B()
            X.3QO r0 = X.AnonymousClass3QO.OPAL
            if (r1 == r0) goto L_0x0024
            X.3QO r1 = r13.A0B()
            X.3QO r0 = X.AnonymousClass3QO.CUSTOM
            if (r1 == r0) goto L_0x0024
            X.3QO r1 = r13.A0B()
            X.3QO r0 = X.AnonymousClass3QO.HALLPASS
            if (r1 == r0) goto L_0x0024
            X.0Tu r3 = X.0Tu.A05
            r0 = 36325759647823049(0x810e16000134c9, double:3.0358949011522274E-306)
        L_0x01ca:
            boolean r0 = X.182.A06(r3, r12, r0)
        L_0x01ce:
            if (r0 != 0) goto L_0x0024
            goto L_0x0049
        L_0x01d2:
            X.1Xj r0 = r2.A08
            boolean r1 = X.C250563lf.A0q(r12, r0)
            goto L_0x0219
        L_0x01d9:
            boolean r0 = r13.A0i()
            if (r0 == 0) goto L_0x0024
            boolean r0 = r13.A0j()
            if (r0 != 0) goto L_0x0024
            goto L_0x01f2
        L_0x01e6:
            boolean r0 = r13.A0i()
            if (r0 == 0) goto L_0x0024
            boolean r0 = r13.A0j()
            if (r0 == 0) goto L_0x0024
        L_0x01f2:
            X.0Tu r3 = X.0Tu.A05
            r0 = 36318247749949468(0x8107410000181c, double:3.03114434668899E-306)
            boolean r1 = X.182.A06(r3, r12, r0)
            goto L_0x0219
        L_0x01fe:
            boolean r0 = r13.A13()
            if (r0 == 0) goto L_0x0024
            X.0Tu r3 = X.0Tu.A05
            r0 = 36319939967524664(0x8108cb00071f38, double:3.032214511897557E-306)
            boolean r1 = X.182.A06(r3, r12, r0)
            goto L_0x0219
        L_0x0210:
            boolean r1 = r13.A1n(r12)
            goto L_0x0219
        L_0x0215:
            boolean r1 = X.2R8.A00(r12)
        L_0x0219:
            if (r1 == 0) goto L_0x0024
            goto L_0x0049
        L_0x021d:
            java.util.ArrayList r6 = X.AnonymousClass7TG.A0r(r4)
            java.util.Iterator r8 = r4.iterator()
        L_0x0225:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x0305
            java.lang.Object r5 = r8.next()
            X.Uxn r5 = (X.C16593Uxn) r5
            int r0 = r5.ordinal()
            switch(r0) {
                case 0: goto L_0x023e;
                case 1: goto L_0x0263;
                case 2: goto L_0x026a;
                case 3: goto L_0x0270;
                case 4: goto L_0x0276;
                case 5: goto L_0x0287;
                case 6: goto L_0x028d;
                case 7: goto L_0x0293;
                case 8: goto L_0x0299;
                case 9: goto L_0x029f;
                case 10: goto L_0x02a5;
                case 11: goto L_0x02ab;
                case 12: goto L_0x02b1;
                case 13: goto L_0x02b7;
                case 14: goto L_0x02bd;
                case 15: goto L_0x02c3;
                case 16: goto L_0x02c9;
                case 17: goto L_0x02cf;
                case 18: goto L_0x02d5;
                case 19: goto L_0x02db;
                case 20: goto L_0x02e1;
                case 21: goto L_0x02e7;
                case 22: goto L_0x02f1;
                case 23: goto L_0x02f4;
                case 24: goto L_0x02f7;
                case 25: goto L_0x02fe;
                default: goto L_0x0238;
            }
        L_0x0238:
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x023e:
            android.content.res.Resources r7 = r2.A0M
            com.instagram.common.session.UserSession r4 = r2.A07
            com.instagram.user.model.User r0 = X.DbT.A0j(r4)
            boolean r0 = X.2Ek.A00(r0)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x025e
            X.0Tu r3 = X.0Tu.A05
            r0 = 36316718741983855(0x8105dd0006126f, double:3.0301773958947153E-306)
            boolean r0 = X.182.A06(r3, r4, r0)
            r1 = 2131973100(0x7f1353ec, float:1.9583226E38)
            if (r0 != 0) goto L_0x02ec
        L_0x025e:
            r1 = 2131973099(0x7f1353eb, float:1.9583224E38)
            goto L_0x02ec
        L_0x0263:
            android.content.res.Resources r7 = r2.A0M
            r1 = 2131957531(0x7f13171b, float:1.9551649E38)
            goto L_0x02ec
        L_0x026a:
            android.content.res.Resources r7 = r2.A0M
            r1 = 2131953150(0x7f1305fe, float:1.9542763E38)
            goto L_0x02ec
        L_0x0270:
            android.content.res.Resources r7 = r2.A0M
            r1 = 2131973016(0x7f135398, float:1.9583056E38)
            goto L_0x02ec
        L_0x0276:
            X.3uh r0 = r2.A0A
            boolean r0 = r0.A1m()
            android.content.res.Resources r7 = r2.A0M
            r1 = 2131972572(0x7f1351dc, float:1.9582155E38)
            if (r0 == 0) goto L_0x02ec
            r1 = 2131972588(0x7f1351ec, float:1.9582188E38)
            goto L_0x02ec
        L_0x0287:
            android.content.res.Resources r7 = r2.A0M
            r1 = 2131956749(0x7f13140d, float:1.9550062E38)
            goto L_0x02ec
        L_0x028d:
            android.content.res.Resources r7 = r2.A0M
            r1 = 2131971010(0x7f134bc2, float:1.9578987E38)
            goto L_0x02ec
        L_0x0293:
            android.content.res.Resources r7 = r2.A0M
            r1 = 2131973441(0x7f135541, float:1.9583918E38)
            goto L_0x02ec
        L_0x0299:
            android.content.res.Resources r7 = r2.A0M
            r1 = 2131952308(0x7f1302b4, float:1.9541055E38)
            goto L_0x02ec
        L_0x029f:
            android.content.res.Resources r7 = r2.A0M
            r1 = 2131971524(0x7f134dc4, float:1.958003E38)
            goto L_0x02ec
        L_0x02a5:
            android.content.res.Resources r7 = r2.A0M
            r1 = 2131971601(0x7f134e11, float:1.9580186E38)
            goto L_0x02ec
        L_0x02ab:
            android.content.res.Resources r7 = r2.A0M
            r1 = 2131954764(0x7f130c4c, float:1.9546036E38)
            goto L_0x02ec
        L_0x02b1:
            android.content.res.Resources r7 = r2.A0M
            r1 = 2131971474(0x7f134d92, float:1.9579928E38)
            goto L_0x02ec
        L_0x02b7:
            android.content.res.Resources r7 = r2.A0M
            r1 = 2131973564(0x7f1355bc, float:1.9584167E38)
            goto L_0x02ec
        L_0x02bd:
            android.content.res.Resources r7 = r2.A0M
            r1 = 2131973445(0x7f135545, float:1.9583926E38)
            goto L_0x02ec
        L_0x02c3:
            android.content.res.Resources r7 = r2.A0M
            r1 = 2131969192(0x7f1344a8, float:1.95753E38)
            goto L_0x02ec
        L_0x02c9:
            android.content.res.Resources r7 = r2.A0M
            r1 = 2131961453(0x7f13266d, float:1.9559603E38)
            goto L_0x02ec
        L_0x02cf:
            android.content.res.Resources r7 = r2.A0M
            r1 = 2131971635(0x7f134e33, float:1.9580255E38)
            goto L_0x02ec
        L_0x02d5:
            android.content.res.Resources r7 = r2.A0M
            r1 = 2131974388(0x7f1358f4, float:1.9585839E38)
            goto L_0x02ec
        L_0x02db:
            android.content.res.Resources r7 = r2.A0M
            r1 = 2131974390(0x7f1358f6, float:1.9585843E38)
            goto L_0x02ec
        L_0x02e1:
            android.content.res.Resources r7 = r2.A0M
            r1 = 2131974324(0x7f1358b4, float:1.9585709E38)
            goto L_0x02ec
        L_0x02e7:
            android.content.res.Resources r7 = r2.A0M
            r1 = 2131974282(0x7f13588a, float:1.9585624E38)
        L_0x02ec:
            java.lang.String r0 = r7.getString(r1)
            goto L_0x0300
        L_0x02f1:
            java.lang.String r0 = "[INTERNAL] Pause Playback"
            goto L_0x0300
        L_0x02f4:
            java.lang.String r0 = "[INTERNAL] Resume Playback"
            goto L_0x0300
        L_0x02f7:
            r0 = 226(0xe2, float:3.17E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)
            goto L_0x0300
        L_0x02fe:
            java.lang.String r0 = "[INTERNAL] Show Reel Ranker Score"
        L_0x0300:
            X.AnonymousClass7TF.A1I(r5, r0, r6)
            goto L_0x0225
        L_0x0305:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19200WPg.A00(X.WPg):java.util.List");
    }

    public static final void A02(C19200WPg wPg) {
        DialogInterface.OnDismissListener onDismissListener = wPg.A00;
        if (onDismissListener != null) {
            onDismissListener.onDismiss(A0P);
        }
        11Z.A03(new C20059WkJ(wPg));
    }

    private final boolean A03() {
        C250973mM r1 = this.A0B;
        C255773uh r2 = this.A0A;
        if (!C17120VIq.A00(this.A07, r2, r1) || r2.A0B() == AnonymousClass3QO.HALLPASS || r2.A1t(AnonymousClass3WT.SECRET_STICKER)) {
            return false;
        }
        return true;
    }

    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0325, code lost:
        if (r10.A1Y() == false) goto L_0x034f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0327, code lost:
        r14 = r10.A0d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0329, code lost:
        if (r14 == null) goto L_0x034f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x032b, code lost:
        r13 = r14.A00;
        X.0qQ.A07(r13);
        r12 = r13.A3k;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0332, code lost:
        if (r12 == null) goto L_0x034f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0334, code lost:
        r1.A0G(new X.C71196OfI(r15, r14, r0, r11, r13, r12, 1), 2131972504);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x034f, code lost:
        X.DbT.A1V(r1);
        X.VFY.A00(r17, "view", "dialog", (java.lang.String) null, r5);
        X.C49089EpE.A00(r7).A02("delete_story_confirmation_dialog");
        X.C49089EpE.A00(r7).A03(com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, r15.getModuleName());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x036f, code lost:
        if (r16 == false) goto L_0x050f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0371, code lost:
        if (r6 == null) goto L_0x0431;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0373, code lost:
        r3 = X.C49089EpE.A00(r7);
        r2 = r6.getId();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x037b, code lost:
        if (r2 == null) goto L_0x042b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x037d, code lost:
        r3.A03("media_id", r2);
        X.C49089EpE.A00(r7).A03("media_type", r6.BR7().name());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0399, code lost:
        if (r10.A1Y() == false) goto L_0x03bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x039b, code lost:
        r12 = 2131957582;
        r14 = X.182.A06(X.0Tu.A05, r7, 36318943534914311L);
        r2 = r0.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x03ae, code lost:
        if (r14 == false) goto L_0x03b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x03b0, code lost:
        X.C13988Tno.A0s(r2, r13, 2131957581);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x03b8, code lost:
        X.C13988Tno.A0s(r2, r13, 2131957580);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x03c3, code lost:
        if (r10.A1m() == false) goto L_0x03f5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x03c5, code lost:
        if (r5 == false) goto L_0x03e8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x03c7, code lost:
        r12 = 2131957507;
        r2 = r0.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x03cc, code lost:
        if (r23 == false) goto L_0x03dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x03ce, code lost:
        X.Dba.A0s(r2, "\n\n", r13, 2131957504);
        X.C13988Tno.A0s(r2, r13, 2131957505);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x03dc, code lost:
        r13.append(r2.getText(2131957506));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x03e8, code lost:
        r12 = 2131957616;
        r2 = r0.A01;
        X.C13988Tno.A0s(r2, r13, 2131957574);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x03f5, code lost:
        if (r5 == false) goto L_0x0418;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x03f7, code lost:
        r12 = 2131957507;
        r2 = r0.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x03fc, code lost:
        if (r23 == false) goto L_0x040c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x03fe, code lost:
        X.Dba.A0s(r2, "\n\n", r13, 2131957504);
        X.C13988Tno.A0s(r2, r13, 2131957505);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x040c, code lost:
        r13.append(r2.getText(2131957506));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x0418, code lost:
        r12 = 2131957584;
        r2 = r0.A01;
        X.C13988Tno.A0s(r2, r13, 2131957574);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x0430, code lost:
        throw new java.lang.IllegalStateException("Required value was null.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x0436, code lost:
        throw new java.lang.IllegalStateException("Required value was null.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x04b3, code lost:
        r3 = r31;
        r7.A0C(new X.W5U(r3, r2));
        r7.A0B(new X.W4V(r3, r6));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x04c5, code lost:
        X.DbT.A1V(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x050f, code lost:
        r0.A00 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x0512, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0187, code lost:
        X.C59689JTv.A07(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x01f7, code lost:
        r4.A0D(r1);
        r4.A04();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0270, code lost:
        if (r6.A4x() == false) goto L_0x0272;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0297, code lost:
        if (r22 != false) goto L_0x029e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x029c, code lost:
        if (r6 != null) goto L_0x029e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x029e, code lost:
        r21 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x02a0, code lost:
        r17 = new X.C17589Vah(r15, r7, r20, r21, r22, r23);
        r13 = new java.lang.StringBuilder();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x02b4, code lost:
        if (r10.A1e() == false) goto L_0x0395;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x02b6, code lost:
        r12 = 2131957597;
        r2 = r0.A01;
        X.C13988Tno.A0s(r2, r13, 2131957575);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x02c1, code lost:
        r1 = new X.C358248ab(r2);
        r2 = r13.toString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x02ca, code lost:
        if (r2 != null) goto L_0x02ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x02cc, code lost:
        r2 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x02ce, code lost:
        r1.A0q(android.text.Html.fromHtml(r2));
        r1.A09(r12);
        r12 = 2131957531;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x02db, code lost:
        if (r5 == false) goto L_0x02e0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x02dd, code lost:
        r12 = 2131957535;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x02e0, code lost:
        r17 = new X.C49997FIg(2, r17, r24, r0, r11, r5);
        r13 = X.C358278ae.A06;
        r1.A0Q(r17, r13, r12);
        r1.A0C(new X.C50017FJc(9, (java.lang.Object) r17, (java.lang.Object) r0, r5));
        r1.A0B(new X.C18813W4a(1, r0, r17, r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x030a, code lost:
        if (r5 == false) goto L_0x0321;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x030c, code lost:
        r1.A0O(new X.C49997FIg(2, r17, r24, r0, r11, false), r13, 2131957562);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(android.content.DialogInterface.OnDismissListener r20, X.AnonymousClass0iw r21, X.X4P r22, X.X4Q r23, X.AnonymousClass6ZF r24, X.C311376ca r25, X.X4R r26, X.X4U r27, X.C16593Uxn r28, X.C19200WPg r29, X.AnonymousClass6ZK r30, X.AnonymousClass6ZD r31, X.AnonymousClass6ZC r32) {
        /*
            int r1 = r28.ordinal()
            r4 = 1
            java.lang.String r9 = "Required value was null."
            r3 = r20
            r15 = r21
            r0 = r29
            r2 = r32
            switch(r1) {
                case 0: goto L_0x01ff;
                case 1: goto L_0x0208;
                case 2: goto L_0x0437;
                case 3: goto L_0x0440;
                case 4: goto L_0x0018;
                case 5: goto L_0x002b;
                case 6: goto L_0x0041;
                case 7: goto L_0x0097;
                case 8: goto L_0x0449;
                case 9: goto L_0x0452;
                case 10: goto L_0x0486;
                case 11: goto L_0x00ab;
                case 12: goto L_0x04cf;
                case 13: goto L_0x04d7;
                case 14: goto L_0x04e7;
                case 15: goto L_0x04fe;
                case 16: goto L_0x0120;
                case 17: goto L_0x0149;
                case 18: goto L_0x015c;
                case 19: goto L_0x0174;
                case 20: goto L_0x018c;
                case 21: goto L_0x0504;
                case 22: goto L_0x019e;
                case 23: goto L_0x01a9;
                case 24: goto L_0x01b0;
                case 25: goto L_0x01d5;
                default: goto L_0x0012;
            }
        L_0x0012:
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x0018:
            android.content.Context r4 = r0.A02
            X.3uh r1 = r0.A0A
            X.Wb8 r3 = new X.Wb8
            r3.<init>(r0)
            com.instagram.music.common.model.MusicOverlayStickerModel r2 = X.C271404in.A04(r1)
            r1 = 0
            X.FCO.A01(r4, r2, r3, r1)
            goto L_0x050f
        L_0x002b:
            android.app.Activity r1 = r0.A01
            X.0hq r3 = r0.A04
            X.3uh r7 = r0.A0A
            X.4DU r6 = r0.A09
            X.07i r4 = r0.A05
            com.instagram.common.session.UserSession r5 = r0.A07
            java.lang.String r9 = "location_story_action_sheet"
            r10 = 0
            r2 = 0
            r8 = r2
            X.C46395DeI.A07(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            goto L_0x050f
        L_0x0041:
            com.instagram.common.session.UserSession r8 = r0.A07
            com.instagram.reels.store.ReelStore r1 = com.instagram.reels.store.ReelStore.A03(r8)
            X.3uh r3 = r0.A0A
            java.lang.String r10 = r3.A0k
            com.instagram.model.reels.Reel r2 = r1.A0M(r10)
            r4 = 0
            if (r2 == 0) goto L_0x050f
            X.1Ns r1 = r2.A0W
            if (r1 == 0) goto L_0x005a
            java.lang.String r4 = r1.getName()
        L_0x005a:
            boolean r1 = r2.A0h()
            if (r1 == 0) goto L_0x050f
            if (r4 == 0) goto L_0x050f
            java.lang.String r12 = r2.A0r
            if (r12 != 0) goto L_0x0073
            android.app.Activity r1 = r0.A01
            android.content.res.Resources r2 = r1.getResources()
            r1 = 2131971002(0x7f134bba, float:1.9578971E38)
            java.lang.String r12 = X.AnonymousClass7TF.A0d(r2, r1)
        L_0x0073:
            android.app.Activity r5 = r0.A01
            X.0hq r6 = r0.A04
            java.lang.String r11 = r3.A0j
            android.content.res.Resources r3 = r5.getResources()
            r2 = 2131970991(0x7f134baf, float:1.9578949E38)
            r1 = 64
            java.lang.String r1 = X.002.A0D(r4, r1)
            java.lang.String r13 = X.AnonymousClass7TF.A0e(r3, r1, r2)
            java.lang.String r14 = r0.A0G
            X.4DU r9 = r0.A09
            X.07i r7 = r0.A05
            java.lang.String r15 = "story_highlight_action_sheet"
            X.C46395DeI.A0K(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            goto L_0x050f
        L_0x0097:
            android.app.Activity r1 = r0.A01
            X.0hq r2 = r0.A04
            X.3uh r6 = r0.A0A
            X.4DU r5 = r0.A09
            X.07i r3 = r0.A05
            com.instagram.common.session.UserSession r4 = r0.A07
            java.lang.String r8 = "location_story_action_sheet"
            r7 = 0
            X.C46395DeI.A0G(r1, r2, r3, r4, r5, r6, r7, r8)
            goto L_0x050f
        L_0x00ab:
            X.1Xj r1 = r0.A08
            if (r1 == 0) goto L_0x050f
            androidx.fragment.app.Fragment r5 = r0.A03
            android.content.Context r2 = r5.requireContext()
            com.instagram.common.session.UserSession r8 = r0.A07
            r10 = 0
            r1 = 198(0xc6, float:2.77E-43)
            java.lang.String r9 = X.AnonymousClass000.A00(r1)
            r11 = 0
            boolean r1 = X.AnonymousClass3WP.A05(r8)
            r7 = 0
            if (r1 == 0) goto L_0x0117
            X.E2R r6 = X.C48763Ejm.A00(r11)
        L_0x00ca:
            boolean r1 = X.AnonymousClass3WS.A04(r8)
            if (r1 != 0) goto L_0x00d6
            boolean r1 = X.AnonymousClass3WS.A02(r8)
            if (r1 == 0) goto L_0x00d7
        L_0x00d6:
            r7 = 1
        L_0x00d7:
            X.7Pr r4 = new X.7Pr
            r4.<init>(r8)
            android.content.res.Resources r2 = r2.getResources()
            r1 = 2131954758(0x7f130c46, float:1.9546024E38)
            if (r7 == 0) goto L_0x00e8
            r1 = 2131954760(0x7f130c48, float:1.9546028E38)
        L_0x00e8:
            java.lang.String r1 = r2.getString(r1)
            r4.A0d = r1
            X.7Pu r2 = r4.A00()
            r1 = 56
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            X.FCT.A01(r10, r8, r9, r1, r10)
            androidx.fragment.app.FragmentActivity r1 = r5.getActivity()
            if (r1 == 0) goto L_0x050f
            androidx.fragment.app.Fragment r6 = (androidx.fragment.app.Fragment) r6
            r2.A02(r1, r6)
            X.37D r2 = X.DbT.A0i(r1)
            if (r2 == 0) goto L_0x050f
            X.IZx r1 = new X.IZx
            r1.<init>(r3)
            X.37F r2 = (X.AnonymousClass37F) r2
            r2.A0H = r1
            goto L_0x050f
        L_0x0117:
            r13 = r11
            r14 = r11
            r15 = r11
            r12 = r4
            X.ES1 r6 = X.C48762Ejl.A00(r8, r9, r10, r11, r12, r13, r14, r15)
            goto L_0x00ca
        L_0x0120:
            X.WgQ r6 = new X.WgQ
            r6.<init>(r4, r3, r0)
            androidx.fragment.app.Fragment r1 = r0.A03
            android.content.Context r2 = r1.requireContext()
            com.instagram.common.session.UserSession r5 = r0.A07
            X.0iw r1 = r0.A06
            java.lang.String r7 = r1.getModuleName()
            X.1Xj r1 = r0.A08
            r8 = 0
            if (r1 == 0) goto L_0x0147
            java.lang.String r8 = r1.A2n()
            com.instagram.api.schemas.MediaGenAIDetectionMethod r4 = r1.A1I()
        L_0x0140:
            X.9OT r3 = X.AnonymousClass9OT.STORY
            X.C250563lf.A0P(r2, r3, r4, r5, r6, r7, r8)
            goto L_0x050f
        L_0x0147:
            r4 = r8
            goto L_0x0140
        L_0x0149:
            androidx.fragment.app.Fragment r1 = r0.A03
            androidx.fragment.app.FragmentActivity r2 = r1.requireActivity()
            com.instagram.common.session.UserSession r1 = r0.A07
            X.6Yo r4 = new X.6Yo
            r4.<init>(r2, r1)
            X.Kai r1 = X.C250563lf.A0E()
            goto L_0x01f7
        L_0x015c:
            X.1Xj r4 = r0.A08
            if (r4 == 0) goto L_0x050f
            android.app.Activity r3 = r0.A01
            com.instagram.common.session.UserSession r2 = r0.A07
            X.3W1 r1 = X.G9t.A18(r4)
            X.C56304HwH.A01(r3, r2, r4, r1)
            X.0sa r1 = r0.A0L
            r1.invoke()
            r1 = 2131974386(0x7f1358f2, float:1.9585835E38)
            goto L_0x0187
        L_0x0174:
            X.1Xj r2 = r0.A08
            if (r2 == 0) goto L_0x050f
            android.app.Activity r3 = r0.A01
            com.instagram.common.session.UserSession r1 = r0.A07
            X.C56304HwH.A00(r3, r1, r2)
            X.0sa r1 = r0.A0L
            r1.invoke()
            r1 = 2131974387(0x7f1358f3, float:1.9585837E38)
        L_0x0187:
            X.C59689JTv.A07(r3, r1)
            goto L_0x050f
        L_0x018c:
            X.3uh r5 = r0.A0A
            android.app.Activity r4 = r0.A01
            com.instagram.common.session.UserSession r3 = r0.A07
            r2 = 41
            X.W5U r1 = new X.W5U
            r1.<init>(r0, r2)
            X.C63406KwS.A00(r4, r1, r15, r3, r5)
            goto L_0x050f
        L_0x019e:
            X.6Z5 r1 = r2.A00
            X.4mU r2 = r1.A17
            java.lang.String r1 = "user_paused_video"
            r2.EHY(r1)
            goto L_0x050f
        L_0x01a9:
            X.6Z5 r1 = r2.A00
            X.G9w.A1O(r1)
            goto L_0x050f
        L_0x01b0:
            r1 = 40
            X.Ufn r4 = new X.Ufn
            r4.<init>(r0, r1)
            com.instagram.common.session.UserSession r3 = r0.A07
            X.3uh r1 = r0.A0A
            java.lang.String r2 = r1.A0j
            X.1NY r3 = X.DbU.A0N(r3)
            java.lang.String r1 = "story_interactions/bulk_story_like/"
            X.C51968G9o.A1K(r3, r1, r2)
            java.lang.Class<X.1XP> r2 = X.1XP.class
            java.lang.Class<X.1XY> r1 = X.1XY.class
            X.1OC r1 = X.DbT.A0S(r3, r2, r1)
            r1.A00 = r4
            X.1ES.A03(r1)
            goto L_0x050f
        L_0x01d5:
            androidx.fragment.app.Fragment r1 = r0.A03
            androidx.fragment.app.FragmentActivity r1 = r1.requireActivity()
            com.instagram.common.session.UserSession r3 = r0.A07
            X.6Yo r4 = new X.6Yo
            r4.<init>(r1, r3)
            X.3uh r1 = r0.A0A
            java.lang.String r2 = r1.A0k
            java.lang.String r1 = "reel_id"
            android.os.Bundle r2 = X.DbY.A0B(r1, r2)
            X.AnonymousClass0Dg.A00(r2, r3)
            X.H0i r1 = new X.H0i
            r1.<init>()
            r1.setArguments(r2)
        L_0x01f7:
            r4.A0D(r1)
            r4.A04()
            goto L_0x050f
        L_0x01ff:
            X.3uh r1 = r0.A0A
            r2 = r27
            r2.DjF(r1)
            goto L_0x050f
        L_0x0208:
            X.3mM r1 = r0.A0B
            com.instagram.model.reels.Reel r11 = r1.A0H
            java.lang.String r20 = X.C51972G9s.A0n()
            X.3uh r10 = r0.A0A
            boolean r16 = r10.CWu()
            if (r16 == 0) goto L_0x0238
            boolean r1 = r10.A0n()
            if (r1 == 0) goto L_0x0238
            android.app.Activity r1 = r0.A01
            X.8ab r7 = new X.8ab
            r7.<init>((android.app.Activity) r1)
            r1 = 2131975821(0x7f135e8d, float:1.9588745E38)
            r7.A09(r1)
            r1 = 2131975820(0x7f135e8c, float:1.9588743E38)
            r7.A08(r1)
            X.W5L r1 = X.W5L.A00
            r7.A0C(r1)
            goto L_0x04c5
        L_0x0238:
            r8 = 0
            if (r16 == 0) goto L_0x025e
            X.1Xj r1 = r0.A08
            if (r1 == 0) goto L_0x025e
            X.1Xy r1 = r1.A0C
            java.lang.String r1 = r1.getBoostedBySponsor()
            if (r1 == 0) goto L_0x025e
            android.app.Activity r4 = r0.A01
            com.instagram.common.session.UserSession r3 = r0.A07
            r1 = 2131954740(0x7f130c34, float:1.9545988E38)
            java.lang.String r2 = X.AnonymousClass7TE.A16(r4, r1)
            r1 = 2131954739(0x7f130c33, float:1.9545986E38)
            java.lang.String r1 = X.AnonymousClass7TE.A16(r4, r1)
            X.C49946FGa.A04(r4, r8, r3, r2, r1)
            goto L_0x050f
        L_0x025e:
            com.instagram.common.session.UserSession r7 = r0.A07
            boolean r22 = X.AnonymousClass8PU.A08(r7)
            X.1Xj r6 = r0.A08
            r27 = 0
            if (r6 == 0) goto L_0x0272
            boolean r1 = r6.A4x()
            r23 = 1
            if (r1 != 0) goto L_0x0425
        L_0x0272:
            r23 = 0
            if (r6 != 0) goto L_0x0425
            r1 = r8
        L_0x0277:
            java.lang.String.valueOf(r1)
            if (r6 == 0) goto L_0x0299
            long r12 = r6.A1A()
            r1 = 86400(0x15180, double:4.26873E-319)
            long r12 = r12 + r1
            long r2 = X.AnonymousClass7TG.A0I()
            int r1 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            boolean r1 = X.C51970G9q.A1T(r1)
            if (r1 != 0) goto L_0x0299
            boolean r1 = r6.A5O()
            if (r1 == 0) goto L_0x0299
            r5 = 1
            if (r22 != 0) goto L_0x029e
        L_0x0299:
            r5 = 0
            r21 = 0
            if (r6 == 0) goto L_0x02a0
        L_0x029e:
            r21 = 1
        L_0x02a0:
            X.Vah r3 = new X.Vah
            r17 = r3
            r18 = r15
            r19 = r7
            r17.<init>(r18, r19, r20, r21, r22, r23)
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            boolean r1 = r10.A1e()
            if (r1 == 0) goto L_0x0395
            r12 = 2131957597(0x7f13175d, float:1.9551782E38)
            android.app.Activity r2 = r0.A01
            r1 = 2131957575(0x7f131747, float:1.9551738E38)
            X.C13988Tno.A0s(r2, r13, r1)
        L_0x02c1:
            X.8ab r1 = new X.8ab
            r1.<init>((android.app.Activity) r2)
            java.lang.String r2 = r13.toString()
            if (r2 != 0) goto L_0x02ce
            java.lang.String r2 = ""
        L_0x02ce:
            android.text.Spanned r2 = android.text.Html.fromHtml(r2)
            r1.A0q(r2)
            r1.A09(r12)
            r12 = 2131957531(0x7f13171b, float:1.9551649E38)
            if (r5 == 0) goto L_0x02e0
            r12 = 2131957535(0x7f13171f, float:1.9551657E38)
        L_0x02e0:
            r18 = 2
            X.FIg r2 = new X.FIg
            r20 = r24
            r17 = r2
            r19 = r3
            r21 = r0
            r22 = r11
            r23 = r5
            r17.<init>(r18, r19, r20, r21, r22, r23)
            X.8ae r13 = X.C358278ae.RED_BOLD
            r1.A0Q(r2, r13, r12)
            r12 = 9
            X.FJc r2 = new X.FJc
            r2.<init>((int) r12, (java.lang.Object) r3, (java.lang.Object) r0, (boolean) r5)
            r1.A0C(r2)
            X.W4a r2 = new X.W4a
            r2.<init>(r4, r0, r3, r5)
            r1.A0B(r2)
            if (r5 == 0) goto L_0x0321
            r12 = 2131957562(0x7f13173a, float:1.9551711E38)
            X.FIg r2 = new X.FIg
            r21 = r2
            r23 = r3
            r25 = r0
            r26 = r11
            r22 = r18
            r21.<init>(r22, r23, r24, r25, r26, r27)
            r1.A0O(r2, r13, r12)
        L_0x0321:
            boolean r2 = r10.A1Y()
            if (r2 == 0) goto L_0x034f
            X.4gK r14 = r10.A0d
            if (r14 == 0) goto L_0x034f
            X.3Q2 r13 = r14.A00
            X.0qQ.A07(r13)
            java.lang.String r12 = r13.A3k
            if (r12 == 0) goto L_0x034f
            r10 = 2131972504(0x7f135198, float:1.9582017E38)
            X.OfI r2 = new X.OfI
            r21 = r11
            r22 = r13
            r23 = r12
            r24 = r4
            r18 = r15
            r19 = r14
            r20 = r0
            r17 = r2
            r17.<init>(r18, r19, r20, r21, r22, r23, r24)
            r1.A0G(r2, r10)
        L_0x034f:
            X.DbT.A1V(r1)
            java.lang.String r2 = "view"
            java.lang.String r1 = "dialog"
            X.VFY.A00(r3, r2, r1, r8, r5)
            X.Vkw r2 = X.C49089EpE.A00(r7)
            java.lang.String r1 = "delete_story_confirmation_dialog"
            r2.A02(r1)
            X.Vkw r3 = X.C49089EpE.A00(r7)
            java.lang.String r2 = r15.getModuleName()
            java.lang.String r1 = "entry_point"
            r3.A03(r1, r2)
            if (r16 == 0) goto L_0x050f
            if (r6 == 0) goto L_0x0431
            X.Vkw r3 = X.C49089EpE.A00(r7)
            java.lang.String r2 = r6.getId()
            if (r2 == 0) goto L_0x042b
            java.lang.String r1 = "media_id"
            r3.A03(r1, r2)
            X.Vkw r3 = X.C49089EpE.A00(r7)
            X.1iA r1 = r6.BR7()
            java.lang.String r2 = r1.name()
            java.lang.String r1 = "media_type"
            r3.A03(r1, r2)
            goto L_0x050f
        L_0x0395:
            boolean r1 = r10.A1Y()
            if (r1 == 0) goto L_0x03bd
            r12 = 2131957582(0x7f13174e, float:1.9551752E38)
            X.0Tu r14 = X.0Tu.A05
            r1 = 36318943534914311(0x8107e300041b07, double:3.031584363902458E-306)
            boolean r14 = X.182.A06(r14, r7, r1)
            android.app.Activity r2 = r0.A01
            r1 = 2131957580(0x7f13174c, float:1.9551748E38)
            if (r14 == 0) goto L_0x03b8
            r1 = 2131957581(0x7f13174d, float:1.955175E38)
            X.C13988Tno.A0s(r2, r13, r1)
            goto L_0x02c1
        L_0x03b8:
            X.C13988Tno.A0s(r2, r13, r1)
            goto L_0x02c1
        L_0x03bd:
            boolean r2 = r10.A1m()
            java.lang.String r1 = "\n\n"
            if (r2 == 0) goto L_0x03f5
            if (r5 == 0) goto L_0x03e8
            r12 = 2131957507(0x7f131703, float:1.95516E38)
            android.app.Activity r2 = r0.A01
            if (r23 == 0) goto L_0x03dc
            r14 = 2131957504(0x7f131700, float:1.9551594E38)
            X.Dba.A0s(r2, r1, r13, r14)
            r1 = 2131957505(0x7f131701, float:1.9551596E38)
            X.C13988Tno.A0s(r2, r13, r1)
            goto L_0x02c1
        L_0x03dc:
            r1 = 2131957506(0x7f131702, float:1.9551598E38)
            java.lang.CharSequence r1 = r2.getText(r1)
            r13.append(r1)
            goto L_0x02c1
        L_0x03e8:
            r12 = 2131957616(0x7f131770, float:1.955182E38)
            android.app.Activity r2 = r0.A01
            r1 = 2131957574(0x7f131746, float:1.9551736E38)
            X.C13988Tno.A0s(r2, r13, r1)
            goto L_0x02c1
        L_0x03f5:
            if (r5 == 0) goto L_0x0418
            r12 = 2131957507(0x7f131703, float:1.95516E38)
            android.app.Activity r2 = r0.A01
            if (r23 == 0) goto L_0x040c
            r14 = 2131957504(0x7f131700, float:1.9551594E38)
            X.Dba.A0s(r2, r1, r13, r14)
            r1 = 2131957505(0x7f131701, float:1.9551596E38)
            X.C13988Tno.A0s(r2, r13, r1)
            goto L_0x02c1
        L_0x040c:
            r1 = 2131957506(0x7f131702, float:1.9551598E38)
            java.lang.CharSequence r1 = r2.getText(r1)
            r13.append(r1)
            goto L_0x02c1
        L_0x0418:
            r12 = 2131957584(0x7f131750, float:1.9551756E38)
            android.app.Activity r2 = r0.A01
            r1 = 2131957574(0x7f131746, float:1.9551736E38)
            X.C13988Tno.A0s(r2, r13, r1)
            goto L_0x02c1
        L_0x0425:
            X.3YP r1 = r6.A1k()
            goto L_0x0277
        L_0x042b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r9)
            throw r0
        L_0x0431:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r9)
            throw r0
        L_0x0437:
            X.3uh r1 = r0.A0A
            r2 = r23
            r2.Cvu(r1)
            goto L_0x050f
        L_0x0440:
            X.3uh r1 = r0.A0A
            r2 = r30
            r2.A00(r1)
            goto L_0x050f
        L_0x0449:
            X.3uh r1 = r0.A0A
            r2 = r22
            r2.Cu8(r1)
            goto L_0x050f
        L_0x0452:
            X.0hq r5 = r0.A04
            android.content.DialogInterface$OnDismissListener r3 = r0.A00
            if (r3 == 0) goto L_0x0480
            android.app.Activity r1 = r0.A01
            X.8ab r7 = new X.8ab
            r7.<init>((android.app.Activity) r1)
            r1 = 2131971460(0x7f134d84, float:1.95799E38)
            r7.A09(r1)
            r1 = 2131971459(0x7f134d83, float:1.9579898E38)
            r7.A08(r1)
            r2 = 2131971524(0x7f134dc4, float:1.958003E38)
            r6 = 5
            X.W5R r1 = new X.W5R
            r1.<init>((android.content.DialogInterface.OnDismissListener) r3, (X.0hq) r5, (X.C19200WPg) r0, (int) r6)
            r7.A0I(r1, r2)
            r7.A0r(r4)
            r7.A0s(r4)
            r2 = 39
            goto L_0x04b3
        L_0x0480:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r9)
            throw r0
        L_0x0486:
            X.0hq r5 = r0.A04
            android.content.DialogInterface$OnDismissListener r3 = r0.A00
            if (r3 == 0) goto L_0x04c9
            android.app.Activity r1 = r0.A01
            X.8ab r7 = new X.8ab
            r7.<init>((android.app.Activity) r1)
            r1 = 2131971462(0x7f134d86, float:1.9579904E38)
            r7.A09(r1)
            r1 = 2131971461(0x7f134d85, float:1.9579902E38)
            r7.A08(r1)
            r2 = 2131971601(0x7f134e11, float:1.9580186E38)
            r6 = 6
            X.W5R r1 = new X.W5R
            r1.<init>((android.content.DialogInterface.OnDismissListener) r3, (X.0hq) r5, (X.C19200WPg) r0, (int) r6)
            r7.A0I(r1, r2)
            r7.A0r(r4)
            r7.A0s(r4)
            r2 = 40
        L_0x04b3:
            X.W5U r1 = new X.W5U
            r3 = r31
            r1.<init>(r3, r2)
            r7.A0C(r1)
            X.W4V r1 = new X.W4V
            r1.<init>(r3, r6)
            r7.A0B(r1)
        L_0x04c5:
            X.DbT.A1V(r7)
            goto L_0x050f
        L_0x04c9:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r9)
            throw r0
        L_0x04cf:
            X.3uh r1 = r0.A0A
            r2 = r26
            r2.DJN(r1)
            goto L_0x050f
        L_0x04d7:
            X.3mM r4 = r0.A0B
            X.3uh r3 = r0.A0A
            java.lang.String r2 = X.AnonymousClass7TF.A0c()
            java.lang.Integer r1 = X.AnonymousClass05K.A01
            r5 = r25
            r5.DkG(r3, r4, r1, r2)
            goto L_0x050f
        L_0x04e7:
            X.36V r5 = r0.A0N
            if (r5 == 0) goto L_0x04f8
            android.app.Activity r3 = r0.A01
            X.3uh r2 = r0.A0A
            X.Fkh r1 = new X.Fkh
            r1.<init>(r4, r5, r0)
            X.FCO.A00(r3, r2, r1)
            goto L_0x050f
        L_0x04f8:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r9)
            throw r0
        L_0x04fe:
            X.LEM r1 = r0.A0O
            r1.A00(r3, r4)
            goto L_0x050f
        L_0x0504:
            X.3uh r4 = r0.A0A
            android.app.Activity r3 = r0.A01
            X.0hq r2 = r0.A04
            com.instagram.common.session.UserSession r1 = r0.A07
            X.C17040VFo.A00(r3, r2, r1, r4)
        L_0x050f:
            r1 = 0
            r0.A00 = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19200WPg.A01(android.content.DialogInterface$OnDismissListener, X.0iw, X.X4P, X.X4Q, X.6ZF, X.6ca, X.X4R, X.X4U, X.Uxn, X.WPg, X.6ZK, X.6ZD, X.6ZC):void");
    }
}
