package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.clips.intf.ClipsViewerConfig;
import com.instagram.clips.intf.ClipsWatchAndBrowseData;
import com.instagram.common.session.UserSession;

public class GCD extends C52050GCw implements AnonymousClass32U {
    public boolean A00;
    public boolean A01;
    public final FragmentActivity A02;
    public final ClipsViewerConfig A03;
    public final UserSession A04;
    public final AnonymousClass4DU A05;
    public final GCC A06;
    public final GC3 A07;
    public final boolean A08;
    public final C52016GBn A09;

    public final void A0D(C52058GDe gDe) {
        boolean A1V;
        C52078GDy A022;
        0qQ.A0B(gDe, 1);
        UserSession userSession = this.A04;
        if (182.A06(C51965G9l.A0Z(userSession, 0), userSession, 36321254227780816L)) {
            A1V = gDe.A0Y;
        } else {
            A1V = AnonymousClass7TF.A1V(gDe.A0J);
        }
        this.A01 = A1V;
        C52016GBn gBn = this.A09;
        gBn.A0N((C267324bN) null, "long_pressed", true, false);
        11Z.A02(new C52321GNn(this.A06, 8));
        if (this.A01 && 1KU.A07(userSession) && (A022 = C52019GBq.A02(gBn)) != null) {
            C52078GDy.A01(A022, false, false);
        }
    }

    public final /* synthetic */ void DVz(int i) {
    }

    public final /* synthetic */ void DW0(int i) {
    }

    public final /* synthetic */ void DW8(int i, int i2) {
    }

    public final /* synthetic */ void DWA(int i, int i2) {
    }

    public final /* synthetic */ void DWY() {
    }

    public final /* synthetic */ void DhG(float f, float f2) {
    }

    public final /* synthetic */ void DhU(Integer num) {
    }

    public final /* synthetic */ void Dpv() {
    }

    public final /* synthetic */ void Dpy(C267324bN r1, int i) {
    }

    public static double A00(Object obj, float f) {
        return Math.pow(((Number) obj).doubleValue() - ((double) f), 2.0d);
    }

    public static final boolean A01(C267324bN r6, C52058GDe gDe, GCD gcd) {
        GJF gjf;
        ClipsViewerConfig clipsViewerConfig = gcd.A03;
        if (!clipsViewerConfig.A00() || !r6.A0J()) {
            return false;
        }
        AnonymousClass3W1 r3 = gDe.A0E;
        GJF gjf2 = null;
        if (r3 != null) {
            gjf = r3.A0n;
        } else {
            gjf = null;
        }
        if (gjf == GJF.CLOSED) {
            return false;
        }
        ClipsWatchAndBrowseData clipsWatchAndBrowseData = clipsViewerConfig.A0K;
        if (clipsWatchAndBrowseData == null || clipsWatchAndBrowseData.A0E) {
            if (r3 != null) {
                gjf2 = r3.A0n;
            }
            if (gjf2 == GJF.ANCHORED) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final void A0C() {
        this.A07.A05.A03();
        this.A06.A0C();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004c, code lost:
        if (r6 != false) goto L_0x004e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0E(X.C52058GDe r5, boolean r6, boolean r7) {
        /*
            r4 = this;
            boolean r0 = r4.A01
            if (r0 == 0) goto L_0x0038
            com.instagram.common.session.UserSession r3 = r4.A04
            boolean r0 = X.1KU.A07(r3)
            if (r0 == 0) goto L_0x0038
            X.0Tu r2 = X.C51968G9o.A0b(r3)
            r0 = 36321254227846353(0x8109fd000c24d1, double:3.033045655417095E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 != 0) goto L_0x0038
            if (r7 == 0) goto L_0x0032
            X.GCC r0 = r4.A06
            r0.A0C()
        L_0x0022:
            X.GBn r0 = r4.A09
            X.GDy r1 = X.C52019GBq.A02(r0)
            if (r1 == 0) goto L_0x002e
            r0 = 1
            X.C52078GDy.A01(r1, r0, r0)
        L_0x002e:
            r0 = 0
            r4.A01 = r0
            return
        L_0x0032:
            if (r6 == 0) goto L_0x0022
            r4.A0C()
            goto L_0x0022
        L_0x0038:
            boolean r0 = r5.A0Z
            if (r0 != 0) goto L_0x004e
            X.GBn r2 = r4.A09
            java.lang.String r1 = "resume"
            r0 = 0
            r2.A0R(r1, r0)
            if (r7 == 0) goto L_0x004c
            X.GCC r0 = r4.A06
            r0.A0C()
            goto L_0x002e
        L_0x004c:
            if (r6 == 0) goto L_0x002e
        L_0x004e:
            r4.A0C()
            goto L_0x002e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GCD.A0E(X.GDe, boolean, boolean):void");
    }

    public GCD(FragmentActivity fragmentActivity, ClipsViewerConfig clipsViewerConfig, UserSession userSession, AnonymousClass4DU r7, GCC gcc, GC3 gc3, C52016GBn gBn) {
        AnonymousClass7TG.A1U(userSession, clipsViewerConfig, gBn);
        0qQ.A0B(r7, 7);
        this.A04 = userSession;
        this.A03 = clipsViewerConfig;
        this.A09 = gBn;
        this.A06 = gcc;
        this.A07 = gc3;
        this.A02 = fragmentActivity;
        this.A05 = r7;
        this.A08 = 182.A06(0Tu.A05, userSession, 36330806234333974L);
    }
}
