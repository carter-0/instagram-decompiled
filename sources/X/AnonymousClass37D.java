package X;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.util.Log;
import android.view.MotionEvent;
import androidx.fragment.app.Fragment;
import com.instagram.android.R;
import java.util.Set;

/* renamed from: X.37D  reason: invalid class name */
public abstract class AnonymousClass37D {
    public static final AnonymousClass37E A00 = new Object();

    public final int A08() {
        return ((C252063oV) ((AnonymousClass37F) this).A11.getValue()).getView().getHeight();
    }

    public final Fragment A09() {
        AnonymousClass37F r2 = (AnonymousClass37F) this;
        0hq r1 = (0hq) r2.A0x.get();
        if (r1 != null) {
            return r1.A0P(r2.A0q);
        }
        0wb.A03(Pxd.A00(54), "FragmentManager is null getBottomSheetFragment");
        return null;
    }

    public final void A0A() {
        Float f;
        C7218Pzn pzn = ((AnonymousClass37F) this).A0D;
        if (pzn != null) {
            C53277GlP glP = new C53277GlP(pzn.A0A, pzn.A0B, pzn.A03, pzn.A04, 1);
            2cs r2 = pzn.A0V;
            if (((float) r2.A09.A00) * 2.0f < C7218Pzn.A01(pzn)) {
                r2.A08(0.0d, true);
                r2.A06(0.0d);
                C7218Pzn.A09(pzn, 1);
                C7221Pzq pzq = pzn.A0Y;
                pzq.A02(new C61065Jw3((Object) glP, 1, 1, 14));
                pzq.A00();
                return;
            }
            r2.A08((double) C7218Pzn.A01(pzn), true);
            r2.A06((double) C7218Pzn.A01(pzn));
            C7221Pzq pzq2 = pzn.A0Y;
            pzq2.A02(new C61065Jw3((Object) glP, 0, 4, 14));
            MotionEvent motionEvent = (MotionEvent) glP.A03;
            if (motionEvent != null) {
                f = Float.valueOf(motionEvent.getY());
            } else {
                f = null;
            }
            pzq2.A03(C7218Pzn.A07(pzn, f));
        }
    }

    public final void A0C() {
        long j;
        AnonymousClass37F r6 = (AnonymousClass37F) this;
        if (!r6.A0Y && r6.A07 != 0) {
            r6.A0D();
            if (r6.A0B != null) {
                j = 7000;
            } else {
                j = 2000;
            }
            Handler handler = r6.A0s;
            Runnable runnable = r6.A0w;
            handler.postDelayed(runnable, r6.A07);
            handler.postDelayed(runnable, r6.A07 + j);
            r6.A10.add(runnable);
        }
    }

    public final void A0D() {
        AnonymousClass37F r1 = (AnonymousClass37F) this;
        Set set = r1.A10;
        if (!set.isEmpty()) {
            r1.A0s.removeCallbacks((Runnable) 00k.A09(set));
            set.clear();
        }
    }

    public final void A0E(double d) {
        C7218Pzn pzn = ((AnonymousClass37F) this).A0D;
        if (pzn != null) {
            2cs r4 = pzn.A0V;
            double A01 = ((double) ((float) r4.A09.A00)) + (((double) C7218Pzn.A01(pzn)) * d);
            r4.A08(A01, true);
            r4.A06(A01);
        }
    }

    public final void A0F(float f) {
        C7218Pzn pzn = ((AnonymousClass37F) this).A0D;
        if (pzn != null) {
            pzn.A0V.A06((double) (((float) C7218Pzn.A05(pzn)) * f));
        }
    }

    public final void A0G(int i) {
        boolean z;
        AnonymousClass37F r3 = (AnonymousClass37F) this;
        if (i != 255) {
            if (r3.A04 == 255) {
                Activity activity = r3.A0r;
                r3.A04 = AnonymousClass2uJ.A00(activity);
                if (activity.getWindow() == null || activity.getWindow().getDecorView() == null) {
                    z = false;
                } else {
                    z = new C586704n(activity.getWindow().getDecorView(), activity.getWindow()).A00.A06();
                }
                r3.A0d = z;
            }
            Activity activity2 = r3.A0r;
            AnonymousClass2uJ.A04(activity2, i);
            AnonymousClass2uJ.A06(activity2, true);
        }
    }

    public final void A0H(Context context, Fragment fragment, Integer num, boolean z) {
        int color = context.getColor(R.color.fds_transparent);
        ((AnonymousClass37F) this).A0L = true;
        A0L(fragment, (0xF) null, num, color, context.getColor(2Yu.A0C(context)), z);
    }

    public final void A0I(Fragment fragment) {
        A0N(fragment, AnonymousClass05K.A00, 255, 255, true);
    }

    public final void A0K(Fragment fragment, 0hq r6, Integer num) {
        AnonymousClass37F r1 = (AnonymousClass37F) this;
        if (fragment instanceof AnonymousClass0iw) {
            AnonymousClass0iw r5 = (AnonymousClass0iw) fragment;
            0lg r2 = r1.A0v;
            boolean z = r1.A0j;
            0qQ.A0B(r5, 0);
            0qQ.A0B(r2, 2);
            if (!z) {
                num.intValue();
            }
            C71342cb.A00(r2).A0B(C3724190t.A00, r5, (String) null, r6.A0M());
        }
    }

    public final void A0M(Fragment fragment, C13679Teo teo) {
        AnonymousClass37F r0 = (AnonymousClass37F) this;
        r0.A0I = teo;
        r0.A0J(fragment);
    }

    public final void A0N(Fragment fragment, Integer num, int i, int i2, boolean z) {
        0qQ.A0B(fragment, 0);
        0qQ.A0B(num, 2);
        A0L(fragment, (0xF) null, num, i, i2, z);
    }

    public final void A0O(GPw gPw) {
        AnonymousClass37F r1 = (AnonymousClass37F) this;
        r1.A0E = gPw;
        if (gPw.A00) {
            AnonymousClass37F.A06(r1.A0t, r1);
        } else {
            AnonymousClass37F.A01(r1).setAlpha(0.0f);
        }
    }

    public final void A0P(C332277Ui r4) {
        AnonymousClass37F r2 = (AnonymousClass37F) this;
        if (r4 == null && !r2.A0g && !r2.A0b) {
            Log.w("BottomSheetNavigator", "You don't have to null out the Listener manually");
        }
        r2.A0H = r4;
    }

    public final void A0Q(C262944Gp r3) {
        0qQ.A0B(r3, 0);
        ((AnonymousClass37F) this).A0z.add(r3);
    }

    public final void A0R(C262944Gp r3) {
        0qQ.A0B(r3, 0);
        Set set = ((AnonymousClass37F) this).A0z;
        if (set.contains(r3)) {
            set.remove(r3);
        }
    }

    public final void A0S(Integer num) {
        AnonymousClass37F r1 = (AnonymousClass37F) this;
        Fragment A09 = r1.A09();
        if (A09 != null) {
            AnonymousClass37F.A05(A09, r1, num);
        }
    }

    public final void A0T(Integer num) {
        0qQ.A0B(num, 0);
        C7218Pzn pzn = ((AnonymousClass37F) this).A0D;
        if (pzn != null) {
            C7218Pzn.A09(pzn, 2);
            pzn.A0F = num;
            pzn.A0V.A06((double) C7218Pzn.A02(pzn));
        }
    }

    public final void A0U(Integer num, boolean z) {
        C7218Pzn pzn = ((AnonymousClass37F) this).A0D;
        if (pzn != null && C7218Pzn.A0B(pzn)) {
            pzn.A0F = num;
            C7218Pzn.A09(pzn, 4);
            if (!z) {
                pzn.A0V.A08((double) C7218Pzn.A01(pzn), true);
            }
            pzn.A0V.A06((double) C7218Pzn.A01(pzn));
        }
    }

    public final void A0V(boolean z) {
        C7218Pzn pzn = ((AnonymousClass37F) this).A0D;
        if (pzn != null) {
            double d = C7218Pzn.A0e;
            pzn.A0H(AnonymousClass05K.A04, z);
        }
    }

    public final void A0W(boolean z) {
        AnonymousClass37F r3 = (AnonymousClass37F) this;
        if (z) {
            AnonymousClass37F.A06(r3.A0t, r3);
            return;
        }
        AnonymousClass37F.A01(r3).setAlpha(0.0f);
        Activity activity = (Activity) 0mE.A00(AnonymousClass37F.A02(r3).getContext(), Activity.class);
        int i = r3.A05;
        if (i != 255) {
            2db.A02(activity, i);
        }
    }

    public final boolean A0X() {
        AnonymousClass4DR A09;
        AnonymousClass37F r2 = (AnonymousClass37F) this;
        if (!r2.A0L || (A09 = r2.A09()) == null) {
            return false;
        }
        if (!(A09 instanceof AnonymousClass4DR) || !A09.onBackPressed()) {
            AnonymousClass37F.A05(A09, r2, AnonymousClass05K.A15);
        }
        return true;
    }

    public final boolean A0Y() {
        C7218Pzn pzn = ((AnonymousClass37F) this).A0D;
        if (pzn != null) {
            2cs r4 = pzn.A0V;
            if (0qQ.A0J(Float.valueOf((float) r4.A01), Float.valueOf((float) r4.A09.A00))) {
                return true;
            }
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001a, code lost:
        if (X.C7218Pzn.A0B(r3) != false) goto L_0x001c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A0Z(X.EVS r5, java.lang.Integer r6) {
        /*
            r4 = this;
            r0 = r4
            X.37F r0 = (X.AnonymousClass37F) r0
            r2 = 1
            X.0qQ.A0B(r6, r2)
            X.Pzn r3 = r0.A0D
            if (r3 == 0) goto L_0x004b
            int r1 = r3.A09
            r0 = 2
            if (r1 != r0) goto L_0x004b
            X.EVS r0 = X.EVS.LOWEST_PARTIAL_STATE
            if (r5 != r0) goto L_0x0034
            r3.A0F = r6
            boolean r0 = X.C7218Pzn.A0B(r3)
            if (r0 == 0) goto L_0x0042
        L_0x001c:
            boolean r0 = X.C7218Pzn.A0B(r3)
            if (r0 == 0) goto L_0x0032
            r3.A0F = r6
            r0 = 4
            X.C7218Pzn.A09(r3, r0)
            X.2cs r2 = r3.A0V
            float r0 = X.C7218Pzn.A01(r3)
            double r0 = (double) r0
            r2.A06(r0)
        L_0x0032:
            r0 = 1
            return r0
        L_0x0034:
            X.EVS r0 = X.EVS.PREVIOUS_PARTIAL_STATE
            if (r5 != r0) goto L_0x0046
            r3.A0F = r6
            int r1 = r3.A08
            r0 = 4
            if (r1 == r0) goto L_0x001c
            r0 = 3
            if (r1 != r0) goto L_0x0032
        L_0x0042:
            r3.A0H(r6, r2)
            goto L_0x0032
        L_0x0046:
            X.EVS r0 = X.EVS.HIGHEST_PARTIAL_STATE
            if (r5 != r0) goto L_0x004b
            goto L_0x0042
        L_0x004b:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass37D.A0Z(X.EVS, java.lang.Integer):boolean");
    }

    public final void A0B() {
        A0S(AnonymousClass05K.A1F);
    }

    public final void A0J(Fragment fragment) {
        A0N(fragment, AnonymousClass05K.A00, 255, 255, true);
    }

    /* JADX WARNING: type inference failed for: r0v34, types: [X.1qK, java.lang.Object] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0278  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0287  */
    /* JADX WARNING: Removed duplicated region for block: B:99:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0L(androidx.fragment.app.Fragment r26, X.0xF r27, java.lang.Integer r28, int r29, int r30, boolean r31) {
        /*
            r25 = this;
            r12 = r29
            r9 = r25
            X.37F r9 = (X.AnonymousClass37F) r9
            r8 = 0
            r11 = 4
            java.lang.ref.WeakReference r0 = r9.A0x
            java.lang.Object r7 = r0.get()
            X.0hq r7 = (X.0hq) r7
            if (r7 != 0) goto L_0x001e
            r0 = 54
            java.lang.String r1 = X.Pxd.A00(r0)
            java.lang.String r0 = "FragmentManager is null in goInternal"
            X.0wb.A03(r1, r0)
        L_0x001d:
            return
        L_0x001e:
            boolean r0 = r9.A0g
            r10 = r26
            r18 = r27
            r24 = r28
            r22 = r30
            r15 = r31
            if (r0 == 0) goto L_0x0046
            boolean r0 = r9.A0f
            if (r0 == 0) goto L_0x0046
            X.FmT r0 = new X.FmT
            r21 = r12
            r23 = r15
            r16 = r0
            r17 = r10
            r19 = r9
            r20 = r24
            r16.<init>(r17, r18, r19, r20, r21, r22, r23)
            r9.A0H = r0
            r9.A0B()
        L_0x0046:
            boolean r0 = r9.A0g
            if (r0 != 0) goto L_0x001d
            boolean r0 = X.AnonymousClass06S.A00(r7)
            if (r0 != 0) goto L_0x001d
            boolean r0 = X.AnonymousClass06S.A01(r7)
            if (r0 == 0) goto L_0x001d
            android.os.Bundle r2 = r10.mArguments
            if (r2 != 0) goto L_0x005f
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
        L_0x005f:
            java.lang.String r0 = "IgSessionManager.SESSION_TOKEN_KEY"
            java.lang.String r0 = r2.getString(r0)
            if (r0 != 0) goto L_0x006c
            X.0lg r0 = r9.A0v
            X.AnonymousClass0Dg.A00(r2, r0)
        L_0x006c:
            if (r27 == 0) goto L_0x0077
            java.util.HashMap r1 = X.0j8.A03(r18)
            java.lang.String r0 = "BottomSheetNavigator.ARG_EXTRA_BUNDLE"
            r2.putSerializable(r0, r1)
        L_0x0077:
            r10.setArguments(r2)
            androidx.fragment.app.Fragment r0 = r10.getTargetFragment()
            if (r0 == 0) goto L_0x0090
            java.lang.Class r0 = r9.getClass()
            java.lang.String r1 = r0.getSimpleName()
            X.0qQ.A07(r1)
            java.lang.String r0 = "Currently we don't support setTargetFragment(T38697510), instead use BottomSheetResultHandler."
            X.0wb.A03(r1, r0)
        L_0x0090:
            X.GPw r0 = r9.A0E
            r6 = 1
            if (r0 != 0) goto L_0x00a0
            boolean r0 = r9.A0V
            r1 = r0 ^ 1
            X.GPw r0 = new X.GPw
            r0.<init>(r1, r6, r15)
            r9.A0E = r0
        L_0x00a0:
            X.Pzo r0 = new X.Pzo
            r0.<init>(r9)
            r9.A08 = r0
            com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout r1 = X.AnonymousClass37F.A01(r9)
            android.view.View$OnClickListener r0 = r9.A08
            X.AnonymousClass0fU.A00(r0, r1)
            com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout r0 = X.AnonymousClass37F.A01(r9)
            r13 = 2
            r0.setImportantForAccessibility(r13)
            com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout r0 = X.AnonymousClass37F.A02(r9)
            android.view.ViewGroup$LayoutParams r5 = r0.getLayoutParams()
            int r4 = r5.height
            boolean r0 = r10 instanceof X.C268594df
            if (r0 == 0) goto L_0x01a6
            r3 = r10
            X.4df r3 = (X.C268594df) r3
            float r1 = r3.CMx()
            float r0 = r3.Cmb()
            r2 = 1
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x02c5
            double r0 = X.C7218Pzn.A0e
            com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout r17 = X.AnonymousClass37F.A02(r9)
            X.Pzq r1 = new X.Pzq
            r1.<init>(r10, r3, r9)
            X.0lg r0 = r9.A0v
            r18 = r0
            X.Teo r14 = r9.A0I
            X.Pzn r0 = new X.Pzn
            r16 = r0
            r19 = r3
            r20 = r1
            r21 = r14
            r16.<init>(r17, r18, r19, r20, r21)
            r9.A0D = r0
            X.2co r14 = r9.A0A
            X.2cs r1 = r0.A0V
            r1.A09(r14)
            boolean r1 = r9.A0T
            r0.A0I = r1
            boolean r1 = r9.A0V
            r0.A0K = r1
            boolean r1 = r9.A0k
            r0.A0P = r1
            int[] r1 = r9.A0o
            if (r1 != 0) goto L_0x010e
            r2 = 0
        L_0x010e:
            r0.A0N = r2
            boolean r1 = r9.A0Q
            r0.A0G = r1
            X.SHR r1 = r9.A0J
            r0.A0E = r1
            float r1 = r9.A01
            r0.A02 = r1
            boolean r1 = r9.A0U
            r0.A0J = r1
            int r1 = r9.A02
            r0.A05 = r1
            int r2 = r3.AqL()
            r5.height = r2
        L_0x012a:
            boolean r0 = r10 instanceof X.C13677Tem
            if (r0 == 0) goto L_0x0139
            X.Pzn r1 = r9.A0D
            if (r1 == 0) goto L_0x02bd
            X.T8F r0 = new X.T8F
            r0.<init>(r10)
            r1.A0C = r0
        L_0x0139:
            if (r4 == r2) goto L_0x0142
            com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout r0 = X.AnonymousClass37F.A02(r9)
            r0.setLayoutParams(r5)
        L_0x0142:
            com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout r2 = X.AnonymousClass37F.A01(r9)
            X.906 r1 = new X.906
            r1.<init>()
            X.Pzt r0 = new X.Pzt
            r0.<init>(r9)
            r2.A00(r1, r0)
            com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout r1 = X.AnonymousClass37F.A02(r9)
            boolean r0 = r9.A0R
            r0 = r0 ^ 1
            r1.setClickable(r0)
            X.0eM r2 = r9.A11
            java.lang.Object r0 = r2.getValue()
            X.3oV r0 = (X.C252063oV) r0
            android.view.View r0 = r0.getView()
            android.content.Context r1 = r0.getContext()
            X.Pzp r0 = new X.Pzp
            r0.<init>(r9)
            android.view.GestureDetector r4 = new android.view.GestureDetector
            r4.<init>(r1, r0)
            java.lang.Object r0 = r2.getValue()
            X.3oV r0 = (X.C252063oV) r0
            android.view.View r3 = r0.getView()
            com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout r3 = (com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout) r3
            X.Pzr r1 = new X.Pzr
            r1.<init>(r4, r10, r9)
            X.Pzs r0 = new X.Pzs
            r0.<init>(r4, r10, r9)
            r3.A00(r1, r0)
            boolean r0 = r9.A0R
            if (r0 != 0) goto L_0x01c8
            r3 = 1
            boolean r0 = com.facebook.systrace.Systrace.A0E(r3)
            if (r0 == 0) goto L_0x01af
            r1 = -25890127(0xfffffffffe74f2b1, float:-8.139794E37)
            java.lang.String r0 = "IgBottomSheetNavigator::markOtherViewsNotImportantForAccessibility"
            X.0fS.A01(r0, r1)
            goto L_0x01af
        L_0x01a6:
            r0 = -2
            r5.height = r0
            r2 = -2
            r0 = 0
            r9.A0D = r0
            goto L_0x012a
        L_0x01af:
            java.lang.Object r0 = r2.getValue()     // Catch:{ all -> 0x02a7 }
            X.3oV r0 = (X.C252063oV) r0     // Catch:{ all -> 0x02a7 }
            android.view.View r0 = r0.getView()     // Catch:{ all -> 0x02a7 }
            X.AnonymousClass37F.A04(r0, r9)     // Catch:{ all -> 0x02a7 }
            boolean r0 = com.facebook.systrace.Systrace.A0E(r3)
            if (r0 == 0) goto L_0x01c8
            r0 = -1341792775(0xffffffffb005ddf9, float:-4.870056E-10)
            X.0fS.A00(r0)
        L_0x01c8:
            boolean r0 = r9.A0O
            if (r0 == 0) goto L_0x01d8
            com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout r1 = X.AnonymousClass37F.A02(r9)
            X.SbO r0 = new X.SbO
            r0.<init>(r9)
            r1.CNi(r0)
        L_0x01d8:
            X.2cs r0 = r9.A0t
            r0.A0A(r9)
            r1 = r10
            X.4DJ r1 = (X.AnonymousClass4DJ) r1
            X.37K r0 = r9.A0u
            r1.registerLifecycleListener(r0)
            java.lang.Object r0 = r2.getValue()
            X.3oV r0 = (X.C252063oV) r0
            r0.setVisibility(r8)
            android.app.Activity r1 = r9.A0r
            X.0lg r3 = r9.A0v
            java.lang.Integer r2 = X.AnonymousClass05K.A00
            X.0qQ.A0B(r1, r8)
            X.0qQ.A0B(r3, r6)
            X.2cc r5 = X.C71342cb.A00(r3)
            r4 = 0
            X.907 r0 = X.AnonymousClass907.A00
            r5.A07(r1, r0, r4)
            r9.A09 = r10
            X.1Ng r4 = X.AnonymousClass1Nd.A00(r3)
            X.3KT r0 = new X.3KT
            r0.<init>()
            r4.A00(r0)
            X.0s1 r5 = new X.0s1
            r5.<init>(r7)
            int[] r4 = r9.A0o
            if (r4 == 0) goto L_0x022a
            int r0 = r4.length
            if (r0 != r11) goto L_0x022a
            r11 = r4[r8]
            r0 = r4[r6]
            r13 = r4[r13]
            r14 = 3
            r4 = r4[r14]
            r5.A07(r11, r0, r13, r4)
        L_0x022a:
            int r4 = r9.A0q
            java.lang.String r0 = "BottomSheetConstants.FRAGMENT_TAG"
            r5.A0D(r10, r0, r4)
            r5.A0I(r0)
            r5.A00()
            r7.A0a()
            r5 = 255(0xff, float:3.57E-43)
            if (r12 != r5) goto L_0x0254
            if (r31 == 0) goto L_0x0264
            int r4 = X.2db.A00(r1)
            r0 = 2131099778(0x7f060082, float:1.7811919E38)
            int r0 = r1.getColor(r0)
            if (r4 == r0) goto L_0x0264
            r0 = 2131099788(0x7f06008c, float:1.781194E38)
            int r12 = r1.getColor(r0)
        L_0x0254:
            if (r12 == r5) goto L_0x0264
            int r0 = X.2db.A00(r1)
            r9.A05 = r0
            r9.A03 = r12
            X.2db.A0A(r1)
            X.2db.A06(r1, r6)
        L_0x0264:
            r0 = r22
            r9.A0G(r0)
            r9.A0g = r6
            X.0Tu r4 = X.0Tu.A05
            r0 = 36311736579654384(0x810155000202f0, double:3.0270266563760004E-306)
            boolean r0 = X.182.A06(r4, r3, r0)
            if (r0 == 0) goto L_0x0281
            X.2eh r1 = X.AnonymousClass2eg.A00
            android.view.View r0 = r10.mView
            if (r0 == 0) goto L_0x02b5
            r1.A00(r0)
        L_0x0281:
            r9.A0Y = r8
            r0 = r24
            if (r0 == r2) goto L_0x001d
            android.view.View r0 = X.AnonymousClass37F.A00(r9)
            if (r0 == 0) goto L_0x0290
            r0.getBackground()
        L_0x0290:
            android.view.View r0 = X.AnonymousClass37F.A00(r9)
            if (r0 == 0) goto L_0x001d
            X.AnonymousClass37F.A02(r9)
            r9.A0R = r6
            com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout r1 = X.AnonymousClass37F.A02(r9)
            boolean r0 = r9.A0R
            r0 = r0 ^ 1
            r1.setClickable(r0)
            return
        L_0x02a7:
            r1 = move-exception
            boolean r0 = com.facebook.systrace.Systrace.A0E(r3)
            if (r0 == 0) goto L_0x02bc
            r0 = -1329751040(0xffffffffb0bd9c00, float:-1.3795898E-9)
            X.0fS.A00(r0)
            throw r1
        L_0x02b5:
            java.lang.String r0 = "Required value was null."
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>(r0)
        L_0x02bc:
            throw r1
        L_0x02bd:
            java.lang.String r0 = "Required value was null."
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        L_0x02c5:
            java.lang.String r0 = "Initial opening ratio cannot be greater than maximum opening ratio."
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass37D.A0L(androidx.fragment.app.Fragment, X.0xF, java.lang.Integer, int, int, boolean):void");
    }
}
