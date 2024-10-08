package X;

import android.animation.ValueAnimator;
import android.content.Context;
import androidx.viewpager2.widget.ViewPager2;
import com.instagram.clips.intf.ClipsViewerConfig;
import com.instagram.clips.intf.ClipsViewerSource;
import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.RealtimeConstants;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class GE2 implements JRF, AnonymousClass32U {
    public float A00;
    public C267324bN A01;
    public Boolean A02;
    public String A03 = "bounce_nux";
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public final ValueAnimator A09 = new ValueAnimator();
    public final Context A0A;
    public final GMD A0B;
    public final ClipsViewerConfig A0C;
    public final UserSession A0D;
    public final AnonymousClass4DU A0E;
    public final 0xa A0F;
    public final AnonymousClass93U A0G;
    public final Runnable A0H;
    public final C62320sa A0I;
    public final C62320sa A0J;
    public final boolean A0K;
    public final JRO A0L;
    public final List A0M;
    public final boolean A0N;

    public GE2(Context context, ClipsViewerConfig clipsViewerConfig, JRO jro, UserSession userSession, AnonymousClass4DU r11, AnonymousClass93U r12, C52016GBn gBn, C62320sa r14, C62320sa r15) {
        boolean z;
        0qQ.A0B(r12, 6);
        this.A0A = context;
        this.A0E = r11;
        this.A0D = userSession;
        this.A0J = r14;
        this.A0C = clipsViewerConfig;
        this.A0G = r12;
        this.A0I = r15;
        this.A0L = jro;
        this.A0F = C51969G9p.A0n(1Al.A01(userSession), 1An.A0j, this);
        ClipsViewerSource clipsViewerSource = ClipsViewerSource.DIRECT;
        boolean z2 = false;
        List A1P = 0sr.A1P(new String[]{RealtimeConstants.GRAPHQL_SUBSCRIPTION_MESSAGE_TOPIC_FOR_DIRECT_TYPING, "reel_feed_timeline", C273654mx.A00(903), AnonymousClass000.A00(2811)});
        this.A0M = A1P;
        if (!(A1P instanceof Collection) || !A1P.isEmpty()) {
            Iterator it = A1P.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (00l.A0d(this.A0E.getModuleName(), AnonymousClass7TE.A18(it), false)) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        this.A0N = z;
        if (this.A0C.A0J == clipsViewerSource) {
            UserSession userSession2 = this.A0D;
            if (182.A06(0Tu.A05, userSession2, 36318634297006412L) || C328457Ew.A00(userSession2).booleanValue()) {
                z2 = true;
            }
        }
        this.A0K = z2;
        GMD A002 = GNS.A00(this.A0D);
        0qQ.A07(A002);
        this.A0B = A002;
        this.A0H = new C52455GTh(this);
        gBn.A94(this);
        0xa r1 = this.A0F;
        if (DbT.A1a(r1, "KEY_HAS_SUCCESSFULLY_SWIPED") && !r1.contains("KEY_LAST_SWIPED_TIMESTAMP_MS")) {
            long currentTimeMillis = System.currentTimeMillis();
            0xY AR4 = r1.AR4();
            AR4.E5c("KEY_LAST_SWIPED_TIMESTAMP_MS", currentTimeMillis);
            AR4.E5c("KEY_SURFACE_LAST_SWIPED_TIMESTAMP_MS", currentTimeMillis);
            AR4.apply();
        }
    }

    public final /* synthetic */ void DVz(int i) {
    }

    public final /* synthetic */ void DW0(int i) {
    }

    public final /* synthetic */ void DWA(int i, int i2) {
    }

    public final void DWY() {
        A03(this, false);
    }

    public final void DhU(Integer num) {
        int A032 = C51967G9n.A03(num, 0);
        boolean z = false;
        if (A032 == 1) {
            ViewPager2 viewPager2 = ((C52012GBj) this.A0I.invoke()).A00;
            if (viewPager2 == null || !viewPager2.A06.A06.A07) {
                z = true;
            }
        } else if (!(A032 == 2 || A032 == 0)) {
            throw AnonymousClass7TE.A1K();
        }
        this.A08 = z;
    }

    public final /* synthetic */ void Dpv() {
    }

    public final /* synthetic */ void Dpy(C267324bN r1, int i) {
    }

    public static final C267324bN A00(GE2 ge2) {
        int A012 = C52012GBj.A01(ge2.A0I) + 1;
        C62320sa r1 = ge2.A0J;
        if (GD6.A01(r1).A0A() > A012) {
            return GD6.A01(r1).A0E(A012);
        }
        return null;
    }

    public static final void A01(C267324bN r8, GE2 ge2, boolean z) {
        String str;
        AnonymousClass4DU r7 = ge2.A0E;
        UserSession userSession = ge2.A0D;
        1Xj r5 = r8.A02;
        AnonymousClass93U r6 = ge2.A0G;
        String str2 = ge2.A0C.A1H;
        String str3 = ge2.A03;
        0qQ.A0B(str3, 5);
        if (r5 != null && str2 != null) {
            0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r7, userSession), "instagram_scroll_awareness_nux_dismissal");
            A0e.AAJ("nux_type", str3);
            if (z) {
                str = "tap_dismiss";
            } else {
                str = "back_or_exit_button";
            }
            A0e.AAJ("action_source", str);
            DbW.A16(A0e, r7);
            String id = r5.getId();
            if (id != null) {
                C51965G9l.A1P(A0e, id);
                C51974G9v.A0q(A0e, r6, 0);
                A0e.AAJ("viewer_init_media_compound_key", str2);
                C51972G9s.A14(A0e, r5);
                C51972G9s.A15(A0e, r5);
                A0e.Cgf();
                return;
            }
            throw AnonymousClass7TE.A0y();
        }
    }

    /* JADX WARNING: type inference failed for: r13v0, types: [java.lang.Object, X.0rk] */
    public static final void A02(GE2 ge2) {
        C267324bN A002;
        C62320sa r1 = ge2.A0J;
        if (GD6.A01(r1).A0A() > 0 && (A002 = A00(ge2)) != null && !GD6.A01(r1).BzC(A002).A0f) {
            UserSession userSession = ge2.A0D;
            boolean A062 = 182.A06(0Tu.A05, userSession, 36322632912546100L);
            if (A002.A01 == C295365o2.ORGANIC) {
                0xa r6 = ge2.A0F;
                if (C51966G9m.A07(r6.getLong("KEY_LAST_SEEN_TIMESTAMP_MS", 0)) > 86400000 && !2eO.A00(ge2.A0A) && !A062) {
                    ClipsViewerConfig clipsViewerConfig = ge2.A0C;
                    if (!clipsViewerConfig.A00()) {
                        ge2.A04 = false;
                        Object invoke = ge2.A0I.invoke();
                        JRO jro = ge2.A0L;
                        ValueAnimator valueAnimator = ge2.A09;
                        if (!valueAnimator.isRunning()) {
                            valueAnimator.removeAllUpdateListeners();
                            valueAnimator.removeAllListeners();
                            float[] A1b = C51965G9l.A1b();
                            // fill-array-data instruction
                            A1b[0] = -1052246016;
                            A1b[1] = 0;
                            valueAnimator.setFloatValues(A1b);
                            valueAnimator.setDuration(1000);
                            valueAnimator.setRepeatCount(1);
                            valueAnimator.setRepeatMode(1);
                            ? obj = new Object();
                            obj.A00 = 3;
                            valueAnimator.addUpdateListener(new I83(20, invoke, (Object) ge2));
                            valueAnimator.addListener(new C52778GcV(1, jro, invoke, obj, A002, ge2));
                            valueAnimator.start();
                        }
                        if (ge2.A07 && AnonymousClass7TF.A1Y(ge2.A02, true)) {
                            0xY AR4 = r6.AR4();
                            AR4.E5T("KEY_HAS_SEEN_DIRECT_SWIPE_UP_NUX", true);
                            AR4.apply();
                        }
                        0xY AR42 = r6.AR4();
                        AR42.E5c("KEY_LAST_SEEN_TIMESTAMP_MS", System.currentTimeMillis());
                        AR42.apply();
                        AnonymousClass4DU r9 = ge2.A0E;
                        1Xj r8 = A002.A02;
                        AnonymousClass93U r62 = ge2.A0G;
                        String str = clipsViewerConfig.A1H;
                        String str2 = ge2.A03;
                        0qQ.A0B(str2, 5);
                        if (r8 != null && str != null) {
                            0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r9, userSession), "instagram_scroll_awareness_nux_impression");
                            A0e.AAJ("nux_type", str2);
                            DbW.A16(A0e, r9);
                            String id = r8.getId();
                            if (id != null) {
                                C51965G9l.A1P(A0e, id);
                                C51974G9v.A0q(A0e, r62, 0);
                                A0e.AAJ("viewer_init_media_compound_key", str);
                                C51972G9s.A14(A0e, r8);
                                C51972G9s.A15(A0e, r8);
                                A0e.Cgf();
                                return;
                            }
                            throw AnonymousClass7TE.A0y();
                        }
                    }
                }
            }
        }
    }

    public static final void A03(GE2 ge2, boolean z) {
        C267324bN r2 = ge2.A01;
        if (!(r2 == null && (r2 = A00(ge2)) == null) && A04(r2, ge2.A0L, ge2, false, false) && z) {
            AnonymousClass4DU r7 = ge2.A0E;
            UserSession userSession = ge2.A0D;
            1Xj r6 = r2.A02;
            AnonymousClass93U r5 = ge2.A0G;
            String str = ge2.A0C.A1H;
            String str2 = ge2.A03;
            0qQ.A0B(str2, 5);
            if (!(r6 == null || str == null)) {
                0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r7, userSession), "instagram_scroll_awareness_nux_scroll");
                A0e.AAJ("nux_type", str2);
                DbW.A16(A0e, r7);
                String id = r6.getId();
                if (id != null) {
                    C51965G9l.A1P(A0e, id);
                    C51974G9v.A0q(A0e, r5, 0);
                    C51973G9u.A10(A0e);
                    A0e.AAJ("viewer_init_media_compound_key", str);
                    C51972G9s.A14(A0e, r6);
                    C51972G9s.A15(A0e, r6);
                    DbX.A1L(A0e);
                } else {
                    throw AnonymousClass7TE.A0y();
                }
            }
        }
        ge2.A09.cancel();
        ((C52012GBj) ge2.A0I.invoke()).A0G();
    }

    public static final boolean A04(C267324bN r3, JRO jro, GE2 ge2, boolean z, boolean z2) {
        C62320sa r2 = ge2.A0J;
        if (GD6.A01(r2).BzC(r3).A0f == z && !z2) {
            return false;
        }
        jro.EaO(r3, ge2.A07);
        jro.Ekn(r3, z);
        jro.Eec(r3, true);
        r2.invoke();
        if (!z) {
            if (!0qQ.A0K(ge2.A01, r3)) {
                return true;
            }
            r3 = null;
        }
        ge2.A01 = r3;
        return true;
    }

    public final void DW8(int i, int i2) {
        if (i != i2) {
            this.A05 = true;
            0xY AR4 = this.A0F.AR4();
            AR4.E5T("KEY_HAS_SUCCESSFULLY_SWIPED", true);
            AR4.E5c("KEY_LAST_SWIPED_TIMESTAMP_MS", System.currentTimeMillis());
            AR4.apply();
            A03(this, false);
            this.A06 = false;
        }
    }

    public final void DhG(float f, float f2) {
        C52012GBj gBj = (C52012GBj) this.A0I.invoke();
        ViewPager2 viewPager2 = gBj.A00;
        if ((viewPager2 == null || !viewPager2.A06.A06.A07) && gBj.A0D() == AnonymousClass05K.A01) {
            A03(this, !this.A04);
        }
    }

    public final void DxZ(C267324bN r2, int i, int i2) {
        if (!this.A06 && i2 >= 2 && i == 0 && this.A0N) {
            11Z.A03(new C57788IgT(this));
        }
    }

    public final void Dzs() {
    }

    public final void D7O(C267324bN r1, List list) {
    }

    public final void DaP(C52078GDy gDy, boolean z) {
    }

    public final void Dxg(C267324bN r1, int i) {
    }

    public final void Dxi(C267324bN r1, int i) {
    }

    public final void Dxm(C267324bN r5, Integer num, int i) {
        boolean z;
        long j;
        C67231sQ A0n;
        C270584gy CF4;
        1Xj A0l = C51968G9o.A0l(r5);
        if (A0l == null || (A0n = C51966G9m.A0n(A0l)) == null || (CF4 = A0n.CF4()) == null) {
            z = false;
        } else {
            z = CF4.AxZ();
        }
        1Xj r0 = r5.A02;
        if (r0 != null) {
            j = r0.A1B();
        } else {
            j = 10000;
        }
        if (!z) {
            11Z.A04(this.A0H, j);
        }
    }

    public final void Dzr(C267324bN r1, JRO jro, boolean z) {
    }

    public final void DaS(C267324bN r1, int i, int i2, boolean z) {
    }

    public final void Dxl(C267324bN r1, C52058GDe gDe, C52019GBq gBq, C52078GDy gDy, boolean z) {
    }
}
