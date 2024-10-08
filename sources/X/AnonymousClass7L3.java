package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.messageid.DirectMessageIdentifier;
import java.util.List;
import java.util.UUID;

/* renamed from: X.7L3  reason: invalid class name */
public final class AnonymousClass7L3 implements C331117Pq {
    public C330507Nc A00;
    public C69225Nhf A01;
    public AnonymousClass758 A02;
    public C14044Tol A03;
    public Integer A04 = AnonymousClass05K.A00;
    public final Context A05;
    public final UserSession A06;
    public final AnonymousClass7GR A07;
    public final AnonymousClass4DU A08;
    public final String A09;
    public final String A0A;
    public final double A0B;

    public final void DxV(C263754Nf r1) {
    }

    public final void Dxx(C263754Nf r1) {
    }

    public final void Dyj(int i, int i2) {
    }

    public final void onCompletion() {
    }

    public final void onCues(List list) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0007, code lost:
        r2 = r0.A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onLoop(int r4) {
        /*
            r3 = this;
            r0 = 1
            if (r4 < r0) goto L_0x0025
            X.7Nc r0 = r3.A00
            if (r0 == 0) goto L_0x0016
            X.7Nb r2 = r0.A00
            com.instagram.model.direct.messageid.DirectMessageIdentifier r0 = r2.A00
            if (r0 == 0) goto L_0x0016
            java.lang.String r1 = r0.A02
            if (r1 == 0) goto L_0x0016
            java.util.Set r0 = r2.A0C
            r0.add(r1)
        L_0x0016:
            X.Nhf r0 = r3.A01
            if (r0 == 0) goto L_0x0025
            X.758 r2 = r0.A01
            r2.getClass()
            r1 = 8
            r0 = 0
            r2.EgV(r1, r0)
        L_0x0025:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7L3.onLoop(int):void");
    }

    public final void onVideoPlayerError(C263754Nf r1, String str) {
    }

    public static void A00(AnonymousClass7L3 r3) {
        C69225Nhf nhf = r3.A01;
        if (nhf != null) {
            AnonymousClass758 r2 = nhf.A01;
            r2.getClass();
            r2.setVideoIconState(AnonymousClass3TO.PLAY);
            r2.ET5(0);
            if (!AnonymousClass3OE.A00(r3.A06).A00()) {
                r2.Er6(C245853da.SHOW);
            }
            r2.EgV(8, 0);
        }
        r3.A01 = null;
    }

    public final void A01(C74505Pw0 pw0, AnonymousClass758 r21) {
        String str;
        AnonymousClass3WR CEL;
        this.A04 = AnonymousClass05K.A01;
        AnonymousClass758 r6 = r21;
        1Xj BPr = r6.BPr();
        DirectMessageIdentifier Ax8 = r6.Ax8();
        AnonymousClass7GR r4 = this.A07;
        if (Ax8 != null) {
            str = Ax8.A00();
        } else {
            str = null;
        }
        r4.A01(str);
        C69225Nhf nhf = new C69225Nhf(pw0, Ax8);
        this.A01 = nhf;
        nhf.A01 = r6;
        C14044Tol tol = this.A03;
        if (tol == null) {
            UserSession userSession = this.A06;
            C69222Nhc nhc = new C69222Nhc(userSession, r4, this.A08, this.A0A);
            tol = new C14044Tol(this.A05, userSession, nhc, this, this.A09);
            this.A03 = tol;
        }
        tol.getClass();
        String CEE = r6.CEE();
        if (BPr == null) {
            C271394im r42 = new C271394im(AnonymousClass05K.A1F, UUID.randomUUID().toString());
            String CEE2 = r6.CEE();
            r42.A0B = CEE2;
            boolean z = true;
            r42.A0G = true;
            r42.A02 = -1;
            if (CEE2 == null || CEE2.isEmpty()) {
                z = false;
            }
            r42.A0I = z;
            CEL = r42.A00();
        } else {
            CEL = BPr.CEL();
        }
        tol.A09(r6.C5q(), CEL, this.A01, CEE, this.A09, 0.0f, -1, 0, true, true);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001b, code lost:
        if (r1.equals(r0.C5q()) == false) goto L_0x001d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02(X.AnonymousClass758 r5, com.instagram.model.direct.messageid.DirectMessageIdentifier r6) {
        /*
            r4 = this;
            X.Tol r0 = r4.A03
            if (r0 == 0) goto L_0x0033
            X.Nhf r0 = r4.A01
            r3 = 1
            if (r0 == 0) goto L_0x001d
            com.instagram.ui.widget.roundedcornerlayout.RoundedCornerMediaFrameLayout r1 = r5.C5q()
            X.758 r0 = r0.A01
            r0.getClass()
            com.instagram.ui.widget.roundedcornerlayout.RoundedCornerMediaFrameLayout r0 = r0.C5q()
            boolean r0 = r1.equals(r0)
            r2 = 1
            if (r0 != 0) goto L_0x001e
        L_0x001d:
            r2 = 0
        L_0x001e:
            X.Nhf r1 = r4.A01
            if (r1 == 0) goto L_0x0045
            com.instagram.model.direct.messageid.DirectMessageIdentifier r0 = r1.A02
            boolean r0 = r6.A02(r0)
            if (r0 == 0) goto L_0x0045
        L_0x002a:
            if (r2 == 0) goto L_0x0034
            if (r3 != 0) goto L_0x0033
            java.lang.String r0 = "media_mismatch"
            r4.A03(r0)
        L_0x0033:
            return
        L_0x0034:
            if (r3 == 0) goto L_0x0033
            r1.getClass()
            r1.A01 = r5
            X.Tol r1 = r4.A03
            com.instagram.ui.widget.roundedcornerlayout.RoundedCornerMediaFrameLayout r0 = r5.C5q()
            r1.A07(r0)
            return
        L_0x0045:
            r3 = 0
            goto L_0x002a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7L3.A02(X.758, com.instagram.model.direct.messageid.DirectMessageIdentifier):void");
    }

    public final void A03(String str) {
        this.A04 = AnonymousClass05K.A0N;
        C14044Tol tol = this.A03;
        if (tol != null) {
            tol.A0D(str, true);
        }
        A00(this);
    }

    public final void Dxy(C263754Nf r4) {
        C69225Nhf nhf = (C69225Nhf) r4;
        C14044Tol tol = this.A03;
        if (tol != null) {
            int max = Math.max((tol.A06.AzN() - 5500) - tol.A06.getCurrentPositionMs(), 0);
            AnonymousClass758 r0 = nhf.A01;
            r0.getClass();
            r0.EgV(0, max);
        }
    }

    public final void onPrepare(C263754Nf r3) {
        AnonymousClass758 r1 = ((C69225Nhf) r3).A01;
        r1.getClass();
        r1.Er6(C245853da.HIDDEN);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x006c, code lost:
        r2 = r0.A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onProgressStateChanged(boolean r7) {
        /*
            r6 = this;
            X.Nhf r4 = r6.A01
            X.Tol r5 = r6.A03
            if (r5 == 0) goto L_0x0032
            if (r4 == 0) goto L_0x0032
            if (r7 == 0) goto L_0x0033
            X.758 r3 = r4.A01
            r3.getClass()
            X.4M3 r2 = r5.A06
            int r1 = r2.AzN()
            int r0 = r2.getCurrentPositionMs()
            int r1 = r1 - r0
            r3.EiL(r1)
            X.Nhf r0 = r6.A01
            r0.getClass()
            X.758 r1 = r0.A01
            r1.getClass()
            X.3TO r0 = X.AnonymousClass3TO.LOADING_ANIMATE_TIMER
            r1.setVideoIconState(r0)
            int r0 = r2.getCurrentPositionMs()
            r4.A00 = r0
        L_0x0032:
            return
        L_0x0033:
            X.4M3 r0 = r5.A06
            int r3 = r0.getCurrentPositionMs()
            int r0 = r4.A00
            r2 = 3000(0xbb8, float:4.204E-42)
            if (r0 < 0) goto L_0x007c
            int r0 = r3 - r0
            if (r0 >= r2) goto L_0x007c
            X.Nhf r0 = r6.A01
            r0.getClass()
            X.758 r1 = r0.A01
            r1.getClass()
            X.3TO r0 = X.AnonymousClass3TO.TIMER
            r1.setVideoIconState(r0)
            X.Nhf r0 = r6.A01
            r0.getClass()
            X.758 r1 = r0.A01
            r1.getClass()
            X.4M3 r0 = r5.A06
            int r0 = r0.AzN()
            int r0 = r0 - r3
            r1.EiL(r0)
        L_0x0066:
            if (r3 < r2) goto L_0x0032
            X.7Nc r0 = r6.A00
            if (r0 == 0) goto L_0x0032
            X.7Nb r2 = r0.A00
            com.instagram.model.direct.messageid.DirectMessageIdentifier r0 = r2.A00
            if (r0 == 0) goto L_0x0032
            java.lang.String r1 = r0.A02
            if (r1 == 0) goto L_0x0032
            java.util.Set r0 = r2.A0C
            r0.add(r1)
            return
        L_0x007c:
            X.Nhf r0 = r6.A01
            r0.getClass()
            X.758 r1 = r0.A01
            r1.getClass()
            X.3TO r0 = X.AnonymousClass3TO.GONE
            r1.setVideoIconState(r0)
            r0 = -1
            r4.A00 = r0
            goto L_0x0066
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7L3.onProgressStateChanged(boolean):void");
    }

    public final void onProgressUpdate(int i, int i2, boolean z) {
        C14044Tol tol = this.A03;
        if (tol != null) {
            double d = this.A0B;
            if (d > 0.0d && ((double) i) > d) {
                tol.A05(0, false);
            }
        }
    }

    public final void onStopVideo(String str, boolean z) {
        this.A04 = AnonymousClass05K.A00;
        AnonymousClass758 r1 = this.A02;
        if (z && r1 != null) {
            A01((C74505Pw0) null, r1);
        }
        this.A02 = null;
    }

    public final void onVideoDownloading(C263754Nf r5) {
        C69225Nhf nhf = (C69225Nhf) r5;
        AnonymousClass758 r3 = nhf.A01;
        r3.getClass();
        C14044Tol tol = this.A03;
        if (tol != null) {
            r3.EiL(tol.A06.AzN() - tol.A06.getCurrentPositionMs());
            r3.setVideoIconState(AnonymousClass3TO.LOADING_ANIMATE_TIMER);
            nhf.A00 = 0;
            return;
        }
        r3.setVideoIconState(AnonymousClass3TO.LOADING);
    }

    public final void onVideoStartedPlaying(C263754Nf r2) {
        this.A04 = AnonymousClass05K.A0C;
    }

    public final void onVideoViewPrepared(C263754Nf r3) {
        AnonymousClass758 r1 = ((C69225Nhf) r3).A01;
        r1.getClass();
        r1.setVideoIconState(AnonymousClass3TO.GONE);
        r1.ET5(4);
    }

    public AnonymousClass7L3(Context context, UserSession userSession, AnonymousClass4DU r7, String str, String str2) {
        this.A05 = context.getApplicationContext();
        this.A06 = userSession;
        this.A09 = str;
        this.A08 = r7;
        this.A0A = str2;
        this.A07 = new AnonymousClass7GR(userSession);
        this.A0B = (double) 182.A01(0Tu.A05, userSession, 36597605308566372L);
    }
}
