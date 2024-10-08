package X;

import android.content.Context;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.feed.widget.IgProgressImageView;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.sponsored.serverrendered.ServerRenderedSponsoredContentView;
import com.instagram.ui.widget.framelayout.MediaFrameLayout;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.HKg  reason: case insensitive filesystem */
public final class C54597HKg extends GZJ implements C232732uM {
    public AnonymousClass4M3 A00;
    public AnonymousClass6K2 A01;
    public C263754Nf A02;
    public C52078GDy A03;
    public Integer A04;
    public Runnable A05;
    public boolean A06;
    public final AnonymousClass4DH A07;
    public final C252323ov A08;
    public final IZC A09 = new IZC(this);
    public final Set A0A = new CopyOnWriteArraySet();

    public final int E20(String str) {
        AnonymousClass4M3 r3 = this.A00;
        int i = 0;
        if (r3 == null) {
            return 0;
        }
        if (BdI() == AnonymousClass3OB.PLAYING) {
            r3.E21(str);
        }
        JRK jrk = this.A02;
        if (jrk != null) {
            jrk.pause();
            i = jrk.getCurrentPositionMs();
        }
        AnonymousClass4M3 r0 = this.A00;
        if (r0 != null) {
            return r0.getCurrentPositionMs();
        }
        return i;
    }

    public final boolean E4I(C229382nI r21, C267324bN r22, C52058GDe gDe, C52078GDy gDy, float f, int i, int i2, boolean z, boolean z2) {
        AnonymousClass3OB r1;
        JRK jrk;
        XB5 xb5;
        AnonymousClass6K2 r0;
        MediaFrameLayout mediaFrameLayout;
        ImageUrl A1Q;
        AnonymousClass6K2 r02;
        IgProgressImageView igProgressImageView;
        C229382nI r6 = r21;
        C267324bN r11 = r22;
        DbW.A1O(r11, 1, r6);
        AnonymousClass4DH r7 = this.A07;
        Context context = r7.getContext();
        boolean z3 = false;
        if (context != null && r7.isResumed()) {
            AnonymousClass4M3 r14 = this.A00;
            if (r14 != null) {
                r1 = ((AnonymousClass4M1) r14).A0M;
            } else {
                r1 = null;
            }
            if (r1 != AnonymousClass3OB.STOPPING) {
                C52078GDy gDy2 = gDy;
                this.A03 = gDy2;
                this.A00 = r11;
                this.A01 = gDe;
                AnonymousClass4M1 r142 = r14;
                if (r14 == null) {
                    AnonymousClass4M1 A002 = AnonymousClass4M0.A00(context, this.A03, this.A08, this, r7.getModuleName());
                    A002.EjF(AnonymousClass4M7.FILL);
                    A002.Ech(true);
                    A002.A0N = this;
                    A002.A0Z = true;
                    A002.A06 = 100;
                    this.A00 = A002;
                    r142 = A002;
                }
                r142.EyP("unknown", true);
                this.A04 = AnonymousClass05K.A00;
                UserSession userSession = this.A03;
                if (182.A06(0Tu.A06, userSession, 36326966533568612L)) {
                    jrk = gDy2.A04;
                } else {
                    C52078GDy gDy3 = this.A03;
                    if (gDy3 != null) {
                        jrk = (ServerRenderedSponsoredContentView) gDy3.A08.findViewById(R.id.clips_server_rendered_component_id);
                    } else {
                        jrk = null;
                    }
                }
                this.A02 = jrk;
                1Xj A0s = C51966G9m.A0s(r11);
                C263754Nf r13 = new C263754Nf((Object) r11, i);
                this.A02 = r13;
                if (A0s.A52()) {
                    JRK jrk2 = this.A02;
                    if (jrk2 != null) {
                        r0 = jrk2.getVideoView();
                    } else {
                        r0 = null;
                    }
                    this.A01 = r0;
                    ExtendedImageUrl A1n = A0s.A1n(context);
                    if (!(A1n == null || (A1Q = A0s.A1Q()) == null || (r02 = this.A01) == null || (igProgressImageView = r02.A00) == null)) {
                        igProgressImageView.setUrlWithFallback(A1n, A1Q, r7);
                    }
                    AnonymousClass6K2 r03 = this.A01;
                    if (r03 == null || (mediaFrameLayout = r03.A01) == null) {
                        z3 = true;
                    } else {
                        this.A05 = new C57989Iji(r11, mediaFrameLayout, r13, r142, this, r7.getModuleName(), f, i2, z);
                    }
                    this.A06 = z3;
                }
                JRK jrk3 = this.A02;
                if (jrk3 != null) {
                    C257853y4 r04 = r11.A06().A0I;
                    if (r04 != null) {
                        xb5 = r04.BUi();
                        if (xb5 != null) {
                            jrk3.CN9(userSession, this.A04, true);
                        }
                    } else {
                        xb5 = null;
                    }
                    jrk3.setTransformation(r11.A06(), userSession, r6, this.A09);
                    if (xb5 != null) {
                        jrk3.ADT(xb5, C51966G9m.A1B(r11));
                    }
                }
                if (((AnonymousClass4M1) r142).A0M == AnonymousClass3OB.IDLE) {
                    Runnable runnable = this.A05;
                    if (runnable != null) {
                        runnable.run();
                    }
                    this.A05 = null;
                }
                return true;
            }
        }
        return false;
    }

    public final void EJE() {
    }

    public final void onCompletion() {
    }

    public final void onCues(List list) {
        0qQ.A0B(list, 0);
        for (C52016GBn gBn : this.A0A) {
            C267324bN r2 = this.A00;
            if (r2 != null) {
                for (JRF D7O : gBn.A0I) {
                    D7O.D7O(r2, list);
                }
            }
        }
    }

    public final void onDrawnToSurface() {
    }

    public final void onSeeking(long j) {
    }

    public final void onStopVideo(String str, boolean z) {
        AnonymousClass4M3 r2;
        0qQ.A0B(str, 0);
        Runnable runnable = this.A05;
        if (runnable != null) {
            runnable.run();
            this.A05 = null;
        }
        if (str.equals("fragment_paused") && (r2 = this.A00) != null && this.A02 != null) {
            Iterator it = this.A0A.iterator();
            while (it.hasNext()) {
                it.next();
                r2.getCurrentPositionMs();
            }
        }
    }

    public final void onSurfaceTextureDestroyed() {
    }

    public final void onVideoDownloading(C263754Nf r1) {
    }

    public final void onVideoStartedPlaying(C263754Nf r12) {
        Integer num;
        0qQ.A0B(r12, 0);
        JRK jrk = this.A02;
        if (jrk != null) {
            jrk.Dy9();
        }
        C263764Ng r0 = r12.A02;
        boolean z = r0.A02;
        C257183wz r5 = r0.A01;
        0qQ.A06(r5);
        C257183wz r4 = r0.A00;
        0qQ.A06(r4);
        boolean z2 = r0.A03;
        for (C52016GBn gBn : this.A0A) {
            synchronized (gBn) {
                C376449Ia r8 = new C376449Ia(r5, r4, z, z2);
                for (JRJ DyX : gBn.A0J) {
                    DyX.DyX(r8, C52019GBq.A00(gBn));
                }
                C52019GBq A012 = C52016GBn.A01(gBn);
                C267324bN A032 = A012.A03.A03(C52019GBq.A00(gBn));
                if (A032 != null) {
                    if (A032.A02 != null) {
                        C267324bN A002 = C52016GBn.A00(gBn);
                        if (A002 != null) {
                            num = C52019GBq.A01(A002, gBn).A0H;
                        } else {
                            num = null;
                        }
                        for (JRF Dxm : gBn.A0I) {
                            Dxm.Dxm(A032, num, C52019GBq.A00(gBn));
                        }
                    }
                    I4M i4m = gBn.A02;
                    if (i4m != null) {
                        i4m.A02(A032.getId());
                    }
                    C66902Mel A003 = C66903Mem.A00(gBn.A0E);
                    AtomicBoolean atomicBoolean = 1Xj.A0i;
                    A003.A00(1Xv.A06(A032.getId()));
                }
            }
        }
    }

    public final void onVideoSwitchToWarmupPlayer(C263754Nf r1) {
    }

    public final void A95(C52016GBn gBn) {
        this.A0A.add(gBn);
    }

    public final void AHf() {
        this.A0A.clear();
    }

    public final C376689Iy Ato() {
        AnonymousClass4M3 r0 = this.A00;
        if (r0 != null) {
            return r0.Ato();
        }
        return null;
    }

    public final C267324bN Atp() {
        return this.A00;
    }

    public final AnonymousClass3OB BdI() {
        AnonymousClass3OB r0;
        AnonymousClass4M3 r02 = this.A00;
        if (r02 == null || (r0 = ((AnonymousClass4M1) r02).A0M) == null) {
            return AnonymousClass3OB.IDLE;
        }
        return r0;
    }

    public final C263754Nf CEB() {
        return this.A02;
    }

    public final C52078GDy CEb() {
        return this.A03;
    }

    public final boolean CJa() {
        AnonymousClass4M3 r0 = this.A00;
        if (r0 != null) {
            return r0.CJa();
        }
        return false;
    }

    public final void ECP(String str) {
        AnonymousClass4M3 r1 = this.A00;
        if (r1 != null) {
            r1.E21(str);
            r1.ECP(str);
            this.A00 = null;
        }
        super.ECP(str);
        this.A03 = null;
        this.A01 = null;
    }

    public final void EDv(C52016GBn gBn) {
        this.A0A.remove(gBn);
    }

    public final boolean EOZ() {
        AnonymousClass4M3 r0 = this.A00;
        if (r0 != null) {
            return r0.EOZ();
        }
        return false;
    }

    public final void EPC(boolean z) {
        AnonymousClass4M3 r0 = this.A00;
        if (r0 != null) {
            r0.EPC(z);
        }
    }

    public final void EgQ(String str) {
        AnonymousClass4M3 r0 = this.A00;
        if (r0 != null) {
            r0.EgQ(str);
        }
    }

    public final void EnT(boolean z, String str) {
        AnonymousClass4M3 r0 = this.A00;
        if (r0 != null) {
            r0.EnT(z, str);
        }
    }

    public final void Eqr(float f, int i) {
        JRK jrk = this.A02;
        if (jrk != null) {
            jrk.Eqr(f, i);
        }
        AnonymousClass4M3 r0 = this.A00;
        if (r0 != null) {
            r0.Eqr(f, i);
        }
        C263754Nf r1 = this.A02;
        if (r1 != null) {
            r1.A00 = AnonymousClass7TF.A1R((f > 0.0f ? 1 : (f == 0.0f ? 0 : -1)));
        }
    }

    public final void onLoop(int i) {
        C267324bN r2 = this.A00;
        if (r2 != null) {
            for (C52016GBn A0J : this.A0A) {
                A0J.A0J(r2, i);
            }
        }
    }

    public final void onPrepare(C263754Nf r4) {
        C267324bN r2 = this.A00;
        if (r2 != null) {
            for (C52016GBn A0G : this.A0A) {
                A0G.A0G(r2);
            }
        }
    }

    public final void onProgressStateChanged(boolean z) {
        for (C52016GBn A0P : this.A0A) {
            A0P.A0P(this, z);
        }
    }

    public final void onProgressUpdate(int i, int i2, boolean z) {
        C267324bN r2 = this.A00;
        if (r2 != null) {
            for (C52016GBn A0K : this.A0A) {
                A0K.A0K(r2, i, i2, z);
            }
        }
    }

    public final void onStopped(C263754Nf r3, int i) {
        for (C52016GBn A0C : this.A0A) {
            A0C.A0C();
        }
    }

    public final void onSurfaceTextureUpdated(C263754Nf r5) {
        C267324bN r3;
        C52058GDe gDe;
        if (this.A03 != null) {
            Integer num = this.A04;
            if (num == AnonymousClass05K.A01) {
                this.A04 = AnonymousClass05K.A0C;
            } else if (!(num != AnonymousClass05K.A0C || (r3 = this.A00) == null || (gDe = this.A01) == null)) {
                for (C52016GBn A0L : this.A0A) {
                    A0L.A0L(r3, gDe, this);
                }
            }
            AnonymousClass6K2 r0 = this.A01;
            if (r0 != null) {
                AnonymousClass7TH.A0R(r0.A00);
            }
        }
    }

    public final void onVideoPlayerError(C263754Nf r3, String str) {
        JRK jrk = this.A02;
        if (jrk != null) {
            jrk.Dy7();
        }
        for (C52016GBn A0Q : this.A0A) {
            A0Q.A0Q(str);
        }
    }

    public final void onVideoPrepared(C263754Nf r4, boolean z) {
        JRK jrk = this.A02;
        if (jrk != null) {
            jrk.Dy8();
        }
        C267324bN r2 = this.A00;
        if (r2 != null) {
            for (C52016GBn A0M : this.A0A) {
                A0M.A0M(r2, this, z);
            }
        }
    }

    public final void onVideoViewPrepared(C263754Nf r2) {
        this.A04 = AnonymousClass05K.A01;
    }

    public C54597HKg(AnonymousClass4DH r2, UserSession userSession, C252323ov r4, String str) {
        super(userSession, str);
        this.A07 = r2;
        this.A08 = r4;
    }

    public final boolean Cqv(C267324bN r3, C52078GDy gDy) {
        AnonymousClass7TG.A1N(gDy, r3);
        C52078GDy gDy2 = this.A03;
        if (gDy2 == null || !gDy.equals(gDy2) || !r3.equals(this.A00) || this.A06) {
            return true;
        }
        return false;
    }

    public final boolean EJ0(String str, boolean z) {
        JRK jrk;
        AnonymousClass3OB BdI = BdI();
        AnonymousClass4M3 r1 = this.A00;
        if (r1 == null || !(BdI == AnonymousClass3OB.PAUSED || BdI == AnonymousClass3OB.PREPARED)) {
            JRK jrk2 = this.A02;
            if (jrk2 == null || jrk2.isPlaying() || (jrk = this.A02) == null) {
                return false;
            }
            return jrk.EIz();
        }
        r1.E2q(str, z);
        return true;
    }
}
