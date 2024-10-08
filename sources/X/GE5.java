package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.os.CountDownTimer;
import android.provider.Settings;
import android.view.KeyEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.gradientspinner.GradientSpinner;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class GE5 implements C59624JQs, JRF, AnonymousClass32U, C250603lj {
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public long A05;
    public ValueAnimator A06;
    public CountDownTimer A07;
    public RecyclerView A08;
    public C267324bN A09;
    public GradientSpinner A0A;
    public WeakReference A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public final float A0K;
    public final long A0L;
    public final Context A0M;
    public final C53095GiT A0N;
    public final C61082JwK A0O = new C61082JwK(false, (Integer) null, 3, (DefaultConstructorMarker) null, 49);
    public final C57048IMo A0P;
    public final JRO A0Q;
    public final UserSession A0R;
    public final AnonymousClass4DU A0S;
    public final C55996Hr2 A0T;
    public final C62320sa A0U;
    public final C62320sa A0V;
    public final boolean A0W;
    public final boolean A0X;
    public final boolean A0Y;
    public final boolean A0Z;
    public final boolean A0a;
    public final boolean A0b;
    public final float A0c;
    public final int A0d;
    public final Map A0e = AnonymousClass7TE.A1H();

    public GE5(Context context, JRO jro, UserSession userSession, AnonymousClass4DU r16, C62320sa r17, C62320sa r18) {
        this.A0R = userSession;
        this.A0M = context;
        this.A0S = r16;
        this.A0U = r17;
        this.A0V = r18;
        this.A0Q = jro;
        C55996Hr2 hr2 = new C55996Hr2(userSession);
        hr2.A04 = J6J.A00(this, 44);
        hr2.A02 = C58715IwO.A01(this, 48);
        hr2.A03 = C58715IwO.A01(this, 49);
        hr2.A01 = new C58674Ivj(this, 0);
        this.A0T = hr2;
        0Tu r4 = 0Tu.A06;
        int A002 = (int) 182.A00(r4, userSession, 37167341309657536L);
        this.A0d = A002;
        long j = ((long) A002) * 1000;
        this.A0L = j;
        this.A0K = C51965G9l.A00(r4, userSession, 37167341309723073L);
        this.A0b = 182.A06(r4, userSession, 36322916379404959L);
        this.A0W = 182.A06(r4, userSession, 36322916379798179L);
        this.A0a = C52368GPp.A00(userSession);
        this.A0X = 182.A06(C51968G9o.A0b(userSession), userSession, 36322916380125860L);
        this.A0Z = 182.A06(C51968G9o.A0b(userSession), userSession, 36322916380322470L);
        this.A0Y = GH7.A01(userSession);
        this.A0c = Settings.Global.getFloat(context.getContentResolver(), AnonymousClass000.A00(506), 1.0f);
        this.A05 = j;
        this.A06 = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f});
        this.A00 = 1.0f;
        this.A0P = new C57048IMo(this, 2);
        this.A0N = new C53095GiT(this, 8);
    }

    public final void ATF(AnonymousClass30Y r6, C252093oY r7) {
        KeyEvent.Callback callback;
        AnonymousClass7TF.A1H(r6, r7);
        Integer CEk = r7.CEk(r6);
        0qQ.A07(CEk);
        Object obj = r6.A03;
        0qQ.A06(obj);
        Integer num = AnonymousClass05K.A00;
        if (CRt((C267324bN) obj, Boolean.valueOf(AnonymousClass7TF.A1W(CEk, num)))) {
            int intValue = CEk.intValue();
            if (intValue == 0) {
                C61082JwK jwK = this.A0O;
                jwK.A01 = false;
                jwK.A00 = num;
                C62320sa r2 = this.A0U;
                ((C52012GBj) r2.invoke()).A0J(this.A0P);
                ViewPager2 viewPager2 = ((C52012GBj) r2.invoke()).A00;
                RecyclerView recyclerView = null;
                if (viewPager2 != null) {
                    callback = viewPager2.getChildAt(0);
                } else {
                    callback = null;
                }
                if (callback instanceof RecyclerView) {
                    recyclerView = (RecyclerView) callback;
                }
                this.A08 = recyclerView;
                if (recyclerView != null) {
                    recyclerView.A15(this.A0N);
                }
                if (this.A0D) {
                    this.A0G = false;
                }
                this.A0I = false;
                this.A0H = false;
            } else if (intValue == 2) {
                ((C52012GBj) this.A0U.invoke()).A0K(this.A0P);
                RecyclerView recyclerView2 = this.A08;
                if (recyclerView2 != null) {
                    recyclerView2.A16(this.A0N);
                }
                if (!this.A0I) {
                    A06(this, AnonymousClass05K.A0N);
                    A02();
                }
            } else {
                return;
            }
            this.A0B = null;
        }
    }

    public final int BlO(C267324bN r6) {
        long j;
        if (this.A0Y || !r6.CcK() || !GH7.A00(r6, this.A0R)) {
            return 0;
        }
        if (this.A0H) {
            return this.A01;
        }
        Long A012 = A01(r6, this);
        if (A012 != null) {
            j = A012.longValue();
            long j2 = this.A0L;
            if (j == j2) {
                j = j2;
            }
        } else {
            j = this.A0L;
        }
        return AnonymousClass1GB.A01(((float) j) / 1000.0f);
    }

    /* JADX WARNING: type inference failed for: r1v4, types: [X.GlH, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0036, code lost:
        if (r0.longValue() != 0) goto L_0x0038;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean CRt(X.C267324bN r10, java.lang.Boolean r11) {
        /*
            r9 = this;
            r7 = 0
            X.0qQ.A0B(r10, r7)
            boolean r0 = r9.A0Y
            if (r0 != 0) goto L_0x008e
            boolean r0 = r10.CcK()
            if (r0 == 0) goto L_0x008e
            com.instagram.common.session.UserSession r6 = r9.A0R
            boolean r0 = X.GH7.A00(r10, r6)
            r8 = 0
            if (r0 == 0) goto L_0x008e
            X.0sa r0 = r9.A0V
            java.lang.Object r0 = r0.invoke()
            X.GD6 r0 = (X.GD6) r0
            X.GBg r0 = r0.A0A
            X.GDe r0 = r0.BzC(r10)
            X.3W1 r5 = r0.A0E
            java.lang.Long r0 = A01(r10, r9)
            r3 = 0
            if (r0 == 0) goto L_0x0038
            long r1 = r0.longValue()
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            r1 = 1
            if (r0 == 0) goto L_0x0039
        L_0x0038:
            r1 = 0
        L_0x0039:
            if (r5 == 0) goto L_0x004a
            X.3W8 r0 = r5.A3U
            java.lang.Object r0 = r0.A00
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x004a
            if (r1 != 0) goto L_0x004a
            r8 = 1
        L_0x004a:
            X.1Xj r0 = r10.A02
            if (r0 == 0) goto L_0x008c
            java.lang.String r5 = r0.getId()
        L_0x0052:
            r4 = 0
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r8)
            if (r5 == 0) goto L_0x008b
            X.HEL r0 = X.C55136Hck.A00(r6)
            java.util.concurrent.ConcurrentHashMap r2 = r0.A00
            java.lang.Object r1 = r2.get(r5)
            X.GlH r1 = (X.C53269GlH) r1
            if (r1 != 0) goto L_0x0072
            X.GlH r1 = new X.GlH
            r1.<init>()
            r1.A02 = r7
            r1.A01 = r7
            r1.A00 = r4
        L_0x0072:
            if (r3 == 0) goto L_0x0088
            X.HEL r0 = X.C55136Hck.A00(r6)
            java.util.concurrent.ConcurrentHashMap r0 = r0.A00
            java.lang.Object r0 = r0.get(r5)
            X.GlH r0 = (X.C53269GlH) r0
            if (r0 == 0) goto L_0x0086
            java.lang.Boolean r0 = r0.A00
            if (r0 != 0) goto L_0x0088
        L_0x0086:
            r1.A00 = r3
        L_0x0088:
            r2.put(r5, r1)
        L_0x008b:
            return r8
        L_0x008c:
            r5 = 0
            goto L_0x0052
        L_0x008e:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GE5.CRt(X.4bN, java.lang.Boolean):boolean");
    }

    public final boolean CZm(C267324bN r5) {
        int A0B2;
        C267324bN A0C2;
        if (this.A0Y || (A0B2 = GD6.A01(this.A0V).A0B(r5)) <= 0 || (A0C2 = ((C52012GBj) this.A0U.invoke()).A0C(A0B2 - 1)) == null) {
            return false;
        }
        return CRt(A0C2, false);
    }

    public final /* synthetic */ void DVz(int i) {
    }

    public final /* synthetic */ void DW0(int i) {
    }

    public final /* synthetic */ void DWA(int i, int i2) {
    }

    public final /* synthetic */ void DWY() {
    }

    public final /* synthetic */ void DhG(float f, float f2) {
    }

    public final void DhU(Integer num) {
        String str;
        0qQ.A0B(num, 0);
        if (!this.A0Y) {
            C61082JwK jwK = this.A0O;
            jwK.A00 = num;
            C267324bN A002 = A00(this);
            if (A002 != null) {
                Integer num2 = AnonymousClass05K.A0C;
                if (num == num2 && (!this.A0G || this.A02 != this.A03 || !this.A0D)) {
                    int BlO = BlO(A002);
                    C52030GCc gCc = new C52030GCc(DbT.A05(this.A0M), this.A0R, this.A0S);
                    if (this.A0J) {
                        str = "swipe_up";
                    } else {
                        str = "swipe_down";
                    }
                    C56373HxR.A01(new GSY((Float) null, (Float) null, str, (String) null), gCc, A002, BlO);
                }
                if (num == AnonymousClass05K.A00 && this.A04 == 1 && this.A0X) {
                    A07(true);
                }
                if (this.A0E && ((!this.A0G || this.A02 == this.A03) && jwK.A01)) {
                    jwK.A01 = false;
                }
                if (num != num2) {
                    this.A0Q.EaB(A002, false);
                }
            }
        }
    }

    public final /* synthetic */ void Dpv() {
    }

    public final /* synthetic */ void Dpy(C267324bN r1, int i) {
    }

    public final void Dxi(C267324bN r2, int i) {
        0qQ.A0B(r2, 0);
        if (CRt(r2, false) && !this.A0I) {
            A02();
        }
    }

    public final void Dxm(C267324bN r6, Integer num, int i) {
        0qQ.A0B(r6, 0);
        this.A01 = 0;
        if (CRt(r6, false)) {
            String A1B = C51966G9m.A1B(r6);
            this.A0E = true;
            this.A02 = i;
            this.A0G = false;
            if (!this.A0e.containsKey(A1B)) {
                A04(r6, this, this.A0L);
            }
            Long A012 = A01(r6, this);
            if (A012 == null || A012.longValue() != 0) {
                11Z.A03(new C57879Ihw(r6, this));
            }
        }
    }

    public static final C267324bN A00(GE5 ge5) {
        try {
            return C52012GBj.A04((C52012GBj) ge5.A0U.invoke());
        } catch (Exception unused) {
            return null;
        }
    }

    private final void A02() {
        CountDownTimer countDownTimer = this.A07;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        if (this.A0b || this.A0X || this.A0Z) {
            this.A06.cancel();
        }
        this.A0G = true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0049, code lost:
        if (X.GD6.A00(((X.C52012GBj) r4.invoke()).A09) != 0) goto L_0x0065;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A03(X.C267324bN r4, X.GE5 r5) {
        /*
            X.0sa r2 = r5.A0V
            X.GBg r0 = X.GD6.A01(r2)
            X.GDe r0 = r0.BzC(r4)
            X.3W1 r3 = r0.A0E
            if (r3 == 0) goto L_0x0014
            r1 = 1
            X.3W8 r0 = r3.A3U
            X.C51966G9m.A1N(r0, r3, r1)
        L_0x0014:
            r0 = 0
            A04(r4, r5, r0)
            r3 = 0
            r5.A07(r3)
            X.4bN r1 = r5.A09
            if (r1 != 0) goto L_0x0065
            X.0sa r4 = r5.A0U
            int r0 = X.C52012GBj.A01(r4)
            int r1 = r0 + 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            if (r0 == 0) goto L_0x004b
            if (r1 <= 0) goto L_0x004b
            java.lang.Object r0 = r4.invoke()
            X.GBj r0 = (X.C52012GBj) r0
            X.4bN r1 = r0.A0C(r1)
            if (r1 == 0) goto L_0x004b
            java.lang.Object r0 = r4.invoke()
            X.GBj r0 = (X.C52012GBj) r0
            X.GD6 r0 = r0.A09
            int r0 = X.GD6.A00(r0)
            if (r0 != 0) goto L_0x0065
        L_0x004b:
            X.Hr2 r1 = r5.A0T
            int r0 = r5.A0d
            r1.A00(r0)
            r0 = 1065353216(0x3f800000, float:1.0)
            r5.A00 = r0
            r5.A0E = r3
            r0 = 0
            r5.A0B = r0
            java.lang.Integer r0 = X.AnonymousClass05K.A0u
            A06(r5, r0)
            r5.A0C = r3
            r5.A04 = r3
            return
        L_0x0065:
            X.4bN r0 = A00(r5)
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x004b
            X.GBg r0 = X.GD6.A01(r2)
            X.GDe r0 = r0.BzC(r1)
            boolean r0 = r0.A0d
            if (r0 == r3) goto L_0x004b
            X.JRO r0 = r5.A0Q
            r0.Ekk(r1, r3)
            r2.invoke()
            X.4bN r2 = r5.A09
            boolean r1 = X.0qQ.A0K(r2, r1)
            r0 = 0
            if (r1 != 0) goto L_0x008d
            r0 = r2
        L_0x008d:
            r5.A09 = r0
            goto L_0x004b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GE5.A03(X.4bN, X.GE5):void");
    }

    public static final void A05(GE5 ge5) {
        int A0H2;
        View rootView;
        GradientSpinner gradientSpinner = null;
        if (!ge5.A0b || (!ge5.A0X && !ge5.A0Z)) {
            ge5.A0A = null;
        } else {
            View A022 = C52012GBj.A02((C52012GBj) ge5.A0U.invoke());
            if (!(A022 == null || (rootView = A022.getRootView()) == null)) {
                gradientSpinner = (GradientSpinner) rootView.findViewWithTag("clips_snack_bar_delayed_skip_ads_timer_progress_ring");
            }
            ge5.A0A = gradientSpinner;
            boolean z = ge5.A0Z;
            Context context = ge5.A0M;
            if (z) {
                A0H2 = R.color.fds_transparent;
            } else {
                A0H2 = 2Yu.A0H(context, R.attr.igds_color_progress_bar_on_media);
            }
            int color = context.getColor(A0H2);
            GradientSpinner gradientSpinner2 = ge5.A0A;
            if (gradientSpinner2 != null) {
                gradientSpinner2.setInactiveColour(color);
            }
        }
        if (ge5.A0A != null) {
            float f = ((float) ge5.A05) / ((float) ge5.A0L);
            ge5.A00 = f;
            float[] A1b = C51965G9l.A1b();
            A1b[0] = f;
            A1b[1] = 0.0f;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(A1b);
            ge5.A06 = ofFloat;
            ofFloat.setDuration((long) (((float) ge5.A05) / ge5.A0c));
            C51969G9p.A10(ge5.A06);
            I84.A01(ge5.A06, ge5, 38);
            ge5.A06.start();
        }
    }

    public static final void A06(GE5 ge5, Integer num) {
        C267324bN A0C2 = ((C52012GBj) ge5.A0U.invoke()).A0C(ge5.A02);
        if (A0C2 != null) {
            AnonymousClass4DU r4 = ge5.A0S;
            UserSession userSession = ge5.A0R;
            int BlO = ge5.BlO(A0C2);
            if (A0C2.CcK() && A0C2.A06().A0t) {
                HZV.A00(userSession, C51966G9m.A0s(A0C2), r4, num, "unknown", BlO);
            }
        }
    }

    public final C55996Hr2 Arh() {
        return this.A0T;
    }

    public final boolean CRI(C267324bN r2) {
        return GH7.A00(r2, this.A0R);
    }

    public final void DW8(int i, int i2) {
        this.A03 = i;
        if (this.A0E && i == this.A02 && this.A0G && this.A0D) {
            this.A0G = false;
        }
    }

    public final void Dzs() {
    }

    public static final Long A01(C267324bN r1, GE5 ge5) {
        if (!r1.CcK()) {
            return null;
        }
        return (Long) ge5.A0e.get(C51966G9m.A1B(r1));
    }

    public static final void A04(C267324bN r2, GE5 ge5, long j) {
        if (r2.CcK()) {
            ge5.A0e.put(C51966G9m.A1B(r2), Long.valueOf(j));
            ge5.A0T.A00(ge5.A0d);
        }
    }

    private final void A07(boolean z) {
        C267324bN A002 = A00(this);
        if (A002 == null) {
            return;
        }
        if (this.A0Z) {
            this.A0Q.Ekl(A002, z);
        } else if (this.A0X) {
            this.A0Q.Ekh(A002, z);
        } else if (this.A0W) {
            this.A0Q.Eki(A002, z);
        } else if (this.A0a) {
            this.A0Q.Ekj(A002, z);
        }
    }

    public final void D7O(C267324bN r1, List list) {
    }

    public final void DaP(C52078GDy gDy, boolean z) {
    }

    public final void Dxg(C267324bN r1, int i) {
    }

    public final void DxZ(C267324bN r1, int i, int i2) {
    }

    public final void Dzr(C267324bN r1, JRO jro, boolean z) {
    }

    public final void DaS(C267324bN r1, int i, int i2, boolean z) {
    }

    public final void Dxl(C267324bN r1, C52058GDe gDe, C52019GBq gBq, C52078GDy gDy, boolean z) {
    }
}
