package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.video.live.streaming.common.BroadcastType;
import java.io.File;
import java.util.concurrent.CancellationException;

/* renamed from: X.M0l  reason: case insensitive filesystem */
public final class C65819M0l implements C66537MVr {
    public static C21478XcN A0K;
    public static C18594Vul A0L;
    public static C18594Vul A0M;
    public long A00;
    public C21028XAh A01;
    public OAP A02;
    public C262204Co A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public final C340307l3 A07;
    public final C72192OyC A08;
    public final C18014Vjq A09;
    public final LRP A0A;
    public final BroadcastType A0B;
    public final MUT A0C;
    public final L5Y A0D;
    public final String A0E;
    public final C262224Cq A0F;
    public final boolean A0G;
    public final AnonymousClass12V A0H;
    public final UserSession A0I;
    public final GVI A0J = new GVI(new M0G(this), 100);

    public C65819M0l(Context context, C340307l3 r5, UserSession userSession, C18014Vjq vjq, LRP lrp, MUT mut, L5Y l5y, String str, boolean z) {
        AnonymousClass7TF.A1E(str, 3, lrp);
        0qQ.A0B(mut, 9);
        this.A0I = userSession;
        this.A0E = str;
        this.A0D = l5y;
        this.A07 = r5;
        this.A09 = vjq;
        this.A0A = lrp;
        this.A0G = z;
        this.A0C = mut;
        this.A08 = C66953Mfm.A00(context, userSession);
        AnonymousClass12T r0 = AnonymousClass12T.A00;
        this.A0H = r0;
        this.A0F = 19E.A02(AnonymousClass199.A02(r0.A04, new AnonymousClass19G((C262204Co) null)));
        this.A02 = new OAP(this);
        this.A0B = BroadcastType.LIVESWAP_RTC_RSYS_INFRA;
    }

    public final boolean CSg() {
        return false;
    }

    public final void Cr5(C21028XAh xAh) {
    }

    public final BroadcastType Ai8() {
        return this.A0B;
    }

    public final long C8j() {
        return this.A00;
    }

    public final void CMe(C21478XcN xcN) {
        MJ6 mj6 = new MJ6(19, xcN, this);
        this.A03 = C51966G9m.A1L(new MGC((Object) mj6, (Object) this, (AnonymousClass4D7) null, 3), this.A0F);
    }

    public final void ECT(C18594Vul vul, boolean z) {
        this.A08.A01(1, true);
        C18594Vul.A02(vul, new XZO((File) null));
        if (this.A05) {
            this.A0A.A01(AnonymousClass05K.A0C);
        }
        19E.A05((CancellationException) null, this.A0F);
    }

    public final void EPE(boolean z) {
        this.A06 = z;
        this.A08.A0A.A7I(new C72813PLb(!z));
    }

    public final void Eww(C18594Vul vul) {
        C21028XAh xAh;
        this.A0J.A01();
        A0L = vul;
        boolean z = this.A06;
        PLL pll = this.A08.A0A;
        pll.A7I(new C72813PLb(!z));
        pll.A7I(new PLY(true));
        if (!this.A0G && !this.A04 && (xAh = this.A01) != null) {
            C18594Vul vul2 = A0L;
            if (vul2 != null) {
                vul2.A04(AnonymousClass7TE.A1I(xAh));
            }
            this.A04 = true;
        }
    }

    public final void EyB(C21478XcN xcN, boolean z) {
        this.A0J.A00();
        A0L = null;
        PLL pll = this.A08.A0A;
        pll.A7I(new C72813PLb(false));
        pll.A7I(new PLY(false));
        if (xcN != null) {
            xcN.A01();
        }
    }
}
