package X;

import android.content.Context;
import android.os.Handler;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.clips.intf.ClipsViewerConfig;
import com.instagram.common.session.UserSession;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

public final class GNL extends GCD implements C59589JPj, C250603lj {
    public C267324bN A00;
    public C267324bN A01;
    public List A02;
    public boolean A03;
    public final float A04;
    public final long A05;
    public final Context A06;
    public final Handler A07;
    public final Fragment A08;
    public final FragmentActivity A09;
    public final 0hq A0A;
    public final AnonymousClass07Z A0B;
    public final AnonymousClass07i A0C;
    public final JRO A0D;
    public final UserSession A0E;
    public final AnonymousClass4DU A0F;
    public final C249763kK A0G;
    public final GD6 A0H;
    public final GCC A0I;
    public final GNH A0J;
    public final GME A0K;
    public final GNK A0L;
    public final GNM A0M;
    public final C52038GCk A0N;
    public final GC3 A0O;
    public final C52016GBn A0P;
    public final Runnable A0Q;
    public final Runnable A0R;
    public final Runnable A0S;
    public final Runnable A0T;
    public final AtomicBoolean A0U = new AtomicBoolean();
    public final boolean A0V;
    public final boolean A0W;
    public final ClipsViewerConfig A0X;

    public final void ATF(AnonymousClass30Y r5, C252093oY r6) {
        JRN A022;
        AnonymousClass7TF.A1H(r5, r6);
        int A0A2 = C51968G9o.A0A(r5, r6);
        if (A0A2 != 0 && A0A2 == 2) {
            Object obj = r5.A04;
            0qQ.A06(obj);
            Object obj2 = r5.A03;
            0qQ.A06(obj2);
            C267324bN r2 = (C267324bN) obj2;
            AnonymousClass3W1 r1 = ((C52058GDe) obj).A0E;
            if (r1 != null) {
                if (r1.A2E) {
                    r1.A2E = false;
                    AnonymousClass3W1.A00(r1, 59);
                }
                if (r1.A2F) {
                    r1.A2F = false;
                    AnonymousClass3W1.A00(r1, 60);
                }
            }
            A02(r2);
            this.A0U.set(false);
            C52016GBn gBn = this.A0P;
            C52078GDy A023 = C52019GBq.A02(gBn);
            if (!(A023 == null || (A022 = C52016GBn.A02(gBn, A023)) == null)) {
                A022.Eg1(1.0f);
            }
            this.A07.removeCallbacks(this.A0T);
            this.A03 = false;
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public GNL(android.content.Context r13, androidx.fragment.app.Fragment r14, androidx.fragment.app.FragmentActivity r15, X.0hq r16, X.AnonymousClass07Z r17, X.AnonymousClass07i r18, com.instagram.clips.intf.ClipsViewerConfig r19, X.JRO r20, com.instagram.common.session.UserSession r21, X.AnonymousClass4DU r22, X.C249763kK r23, X.GD6 r24, X.GCC r25, X.GNH r26, X.GME r27, X.GNK r28, X.GC3 r29, X.C52016GBn r30) {
        /*
            r12 = this;
            r11 = r30
            r6 = r19
            r7 = r21
            X.C51974G9v.A1M(r7, r6, r11)
            r0 = 12
            r8 = r22
            X.0qQ.A0B(r8, r0)
            r0 = 13
            r1 = r23
            r2 = r20
            X.C51969G9p.A1P(r2, r0, r1)
            r10 = r29
            r5 = r15
            r4 = r12
            r9 = r25
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            r12.A06 = r13
            r12.A0E = r7
            r12.A0X = r6
            r12.A0P = r11
            r12.A0I = r9
            r12.A0O = r10
            r0 = r24
            r12.A0H = r0
            r0 = r27
            r12.A0K = r0
            r0 = r26
            r12.A0J = r0
            r0 = r28
            r12.A0L = r0
            r12.A09 = r15
            r12.A0F = r8
            r12.A0D = r2
            r12.A0G = r1
            r0 = r18
            r12.A0C = r0
            r0 = r16
            r12.A0A = r0
            r0 = r17
            r12.A0B = r0
            r12.A08 = r14
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>()
            r12.A0U = r0
            X.0Tu r2 = X.0Tu.A05
            r0 = 36604434306241589(0x820b8a00071435, double:3.2121298772688926E-306)
            int r3 = X.DbS.A04(r2, r7, r0)
            r0 = 36604434306307126(0x820b8a00081436, double:3.2121298773103385E-306)
            int r1 = X.DbS.A04(r2, r7, r0)
            X.GNM r0 = new X.GNM
            r0.<init>(r7, r3, r1)
            r12.A0M = r0
            android.os.Handler r0 = X.AnonymousClass7TF.A0D()
            r12.A07 = r0
            r0 = 36325862727365930(0x810e2e0006352a, double:3.0359600890702133E-306)
            boolean r0 = X.182.A06(r2, r7, r0)
            r12.A0W = r0
            r0 = 36325862727431467(0x810e2e0007352b, double:3.035960089111659E-306)
            boolean r0 = X.182.A06(r2, r7, r0)
            r12.A0V = r0
            r0 = 36607337704199730(0x820e2e00081632, double:3.213965997828666E-306)
            long r0 = X.182.A01(r2, r7, r0)
            r12.A05 = r0
            r0 = 37167384259330498(0x840b8a000201c2, double:3.568141694419832E-306)
            float r0 = X.C51965G9l.A00(r2, r7, r0)
            r12.A04 = r0
            X.GCk r0 = new X.GCk
            r0.<init>(r7)
            r12.A0N = r0
            X.GNN r0 = new X.GNN
            r0.<init>(r12)
            r12.A0T = r0
            X.GNR r0 = new X.GNR
            r0.<init>(r12)
            r12.A0R = r0
            X.GNP r0 = new X.GNP
            r0.<init>(r12)
            r12.A0S = r0
            X.GNQ r0 = new X.GNQ
            r0.<init>(r12)
            r12.A0Q = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GNL.<init>(android.content.Context, androidx.fragment.app.Fragment, androidx.fragment.app.FragmentActivity, X.0hq, X.07Z, X.07i, com.instagram.clips.intf.ClipsViewerConfig, X.JRO, com.instagram.common.session.UserSession, X.4DU, X.3kK, X.GD6, X.GCC, X.GNH, X.GME, X.GNK, X.GC3, X.GBn):void");
    }

    private final void A02(C267324bN r4) {
        if (r4 == null) {
            return;
        }
        if (A06(r4, this) || A05(r4, this)) {
            C52058GDe A002 = JSx.A00(r4, this.A0H);
            this.A09.getWindow().clearFlags(8192);
            if (A002.A0R) {
                this.A0N.A00(AnonymousClass05K.A0j);
            }
            JRO jro = this.A0D;
            jro.EaG(r4, false);
            jro.EW1(r4, 0);
            Handler handler = this.A07;
            handler.removeCallbacks(this.A0R);
            handler.removeCallbacks(this.A0S);
            handler.removeCallbacks(this.A0Q);
            A0C();
        }
    }

    public static final void A03(C267324bN r7, GNL gnl, String str) {
        long j;
        String A2n;
        Long A10;
        0xa r4 = gnl.A0M.A00;
        0xY AR4 = r4.AR4();
        AR4.E5c("key_clips_fast_play_ui_last_shown_timestamp_ms", System.currentTimeMillis());
        AnonymousClass7TG.A1L(AR4, r4, "key_clips_fast_play_ui_shown_count", 0);
        1Xj r1 = r7.A02;
        if (r1 != null) {
            AnonymousClass3W1 BQr = gnl.A0H.BQr(r1);
            if (!BQr.A2F) {
                BQr.A2F = true;
                AnonymousClass3W1.A00(BQr, 60);
            }
        }
        GNK gnk = gnl.A0L;
        long A0B2 = (long) gnl.A0H.A0A.A0B(r7);
        UserSession userSession = gnk.A01;
        AnonymousClass0iw r5 = gnk.A00;
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r5, userSession), "instagram_clips_fast_reels_nux_impression");
        if (A0e.isSampled()) {
            DbW.A16(A0e, r5);
            1Xj r0 = r7.A02;
            if (r0 == null || (A2n = r0.A2n()) == null || (A10 = AnonymousClass7TE.A10(A2n)) == null) {
                j = 0;
            } else {
                j = A10.longValue();
            }
            C51970G9q.A18(A0e, j);
            C51970G9q.A19(A0e, A0B2);
            AnonymousClass93T r12 = gnk.A02;
            C51965G9l.A1O(A0e, r12.A01);
            C51965G9l.A1R(A0e, r12.A00);
            C51973G9u.A14(A0e, "ranking_info_token", r7.A0Q);
            A0e.AAJ("fast_reels_nux_trigger", str);
            DbX.A1L(A0e);
        }
    }

    public static final boolean A04(C267324bN r2, GNL gnl) {
        if (r2.A01 == C295365o2.ORGANIC && r2.A0J == 1iA.A0a && !AnonymousClass3ZC.A0W(r2.A02)) {
            UserSession userSession = gnl.A0E;
            if (!182.A06(AnonymousClass7TF.A0H(userSession), userSession, 36322959329077963L)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public static final boolean A05(C267324bN r2, GNL gnl) {
        if (r2.A01 == C295365o2.ORGANIC && !AnonymousClass3ZC.A0W(r2.A02)) {
            UserSession userSession = gnl.A0E;
            if (!182.A06(AnonymousClass7TF.A0H(userSession), userSession, 36325862727103785L)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public static final boolean A06(C267324bN r2, GNL gnl) {
        if (r2.A01 == C295365o2.ORGANIC && !AnonymousClass3ZC.A0W(r2.A02)) {
            UserSession userSession = gnl.A0E;
            if (!182.A06(AnonymousClass7TF.A0H(userSession), userSession, 36325862726972712L)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public static final boolean A09(GNL gnl, float f) {
        Context context = gnl.A06;
        UserSession userSession = gnl.A0E;
        float A002 = 0nA.A00(context, C51965G9l.A00(AnonymousClass7TF.A0H(userSession), userSession, 37167384259396035L));
        if (0.0f <= f && f <= A002) {
            return true;
        }
        float A012 = ((float) AnonymousClass0nB.A01(context)) - f;
        if (0.0f > A012 || A012 > A002) {
            return false;
        }
        return true;
    }

    public final void DEq(AnonymousClass3W1 r2) {
        if (!r2.A2E && !r2.A2F && !this.A03) {
            A0C();
        }
    }

    public final void DhY(C267324bN r5) {
        if (r5 != null && A04(r5, this) && this.A0M.A00()) {
            this.A00 = r5;
            this.A07.postDelayed(this.A0T, 2000);
        }
    }

    public final void onDestroyView() {
        A02(this.A01);
        super.onDestroyView();
    }
}
