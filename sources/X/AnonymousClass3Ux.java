package X;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.watchandbrowse.ui.WatchAndBrowseMainView;

/* renamed from: X.3Ux  reason: invalid class name */
public final class AnonymousClass3Ux implements AnonymousClass2xU {
    public C246993fb A00;
    public C54512HGy A01;
    public boolean A02;
    public boolean A03;
    public WatchAndBrowseMainView A04;
    public boolean A05;
    public final Activity A06;
    public final ViewGroup A07;
    public final UserSession A08;
    public final AnonymousClass3V1 A09 = new AnonymousClass3V1(this);
    public final Context A0A;
    public final AnonymousClass3V0 A0B;

    public final void DQp(AnonymousClass3W1 r11, int i) {
        boolean z;
        C238123Aq r1;
        C238123Aq r12;
        View view;
        C238123Aq r13;
        0qQ.A0B(r11, 0);
        if (i == 50) {
            Integer num = r11.A13;
            num.intValue();
            if (num.intValue() != 0) {
                this.A05 = false;
                this.A0B.EII();
                ViewGroup viewGroup = this.A07;
                if (viewGroup != null) {
                    int measuredHeight = viewGroup.getMeasuredHeight();
                    View childAt = viewGroup.getChildAt(0);
                    if (childAt != null) {
                        int measuredHeight2 = childAt.getMeasuredHeight();
                        Object invoke = A00().A00.A04.invoke();
                        if ((invoke instanceof C238123Aq) && invoke != null) {
                            int A012 = (int) 182.A01(0Tu.A05, this.A08, 36599623944441441L);
                            DJO djo = DJO.A00;
                            LinearInterpolator linearInterpolator = new LinearInterpolator();
                            ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{measuredHeight, measuredHeight2});
                            ofInt.setDuration((long) A012);
                            ofInt.setInterpolator(linearInterpolator);
                            ofInt.addUpdateListener(new LTj(viewGroup));
                            ofInt.addListener(new C62147Kb0(djo));
                            int intValue = ((Number) A00().A00.A0B.invoke(Integer.valueOf(measuredHeight2))).intValue();
                            ofInt.start();
                            A00().A00.A0H.invoke(Integer.valueOf(-intValue), Integer.valueOf(A012), invoke);
                        }
                    }
                }
                Object invoke2 = A00().A00.A04.invoke();
                if ((invoke2 instanceof C238123Aq) && (r13 = (C238123Aq) invoke2) != null) {
                    r13.EEZ(this.A09);
                }
                WatchAndBrowseMainView watchAndBrowseMainView = this.A04;
                if (watchAndBrowseMainView != null) {
                    watchAndBrowseMainView.setVisibility(8);
                    return;
                }
                return;
            }
            this.A01 = (C54512HGy) A00().A00.A05.invoke();
            View view2 = (View) A00().A00.A03.invoke();
            if (view2 != null) {
                WatchAndBrowseMainView watchAndBrowseMainView2 = this.A04;
                Object obj = null;
                if (watchAndBrowseMainView2 == null) {
                    if (182.A06(0Tu.A05, this.A08, 36325768237823183L)) {
                        view = view2.findViewById(R.id.watch_and_browse_stub);
                        if (view == null) {
                            watchAndBrowseMainView2 = null;
                        }
                        watchAndBrowseMainView2 = (WatchAndBrowseMainView) 2b1.A01(view, false, false).getView();
                    } else {
                        view = view2.requireViewById(R.id.watch_and_browse_stub);
                        watchAndBrowseMainView2 = (WatchAndBrowseMainView) 2b1.A01(view, false, false).getView();
                    }
                    this.A04 = watchAndBrowseMainView2;
                }
                if (watchAndBrowseMainView2 != null) {
                    watchAndBrowseMainView2.A00(new C53219GkT(this.A0A, A00().A00));
                }
                AnonymousClass3V0 r5 = this.A0B;
                WatchAndBrowseMainView watchAndBrowseMainView3 = this.A04;
                C54512HGy hGy = this.A01;
                ViewGroup viewGroup2 = this.A07;
                r5.CNI(viewGroup2, A00(), hGy, watchAndBrowseMainView3);
                C54512HGy hGy2 = this.A01;
                if (hGy2 != null) {
                    if (viewGroup2 != null) {
                        obj = A00().A00.A0G.invoke(viewGroup2, hGy2, r5.A00.AiE(viewGroup2, A00(), this.A01, this.A04));
                    }
                    z = 0qQ.A0K(obj, true);
                } else {
                    z = false;
                }
                this.A05 = z;
                if (z) {
                    r5.CnH(this.A01, this.A04);
                    Object invoke3 = A00().A00.A04.invoke();
                    if ((invoke3 instanceof C238123Aq) && (r12 = (C238123Aq) invoke3) != null) {
                        r12.AAD(this.A09);
                    }
                    Object invoke4 = A00().A00.A04.invoke();
                    if ((invoke4 instanceof C238123Aq) && (r1 = (C238123Aq) invoke4) != null) {
                        r1.EyK();
                        A00().A00.A00.invoke();
                        2dZ.A0t.A03(this.A06).Etr(false);
                        0sL r3 = A00().A00.A0E;
                        0qQ.A0C(viewGroup2, "null cannot be cast to non-null type android.view.ViewGroup");
                        r3.invoke(48, viewGroup2);
                        View childAt2 = viewGroup2.getChildAt(0);
                        if (childAt2 != null) {
                            int measuredHeight3 = childAt2.getMeasuredHeight();
                            C54512HGy hGy3 = this.A01;
                            if (hGy3 != null) {
                                int i2 = hGy3.A03;
                                Number number = (Number) A00().A00.A0C.invoke(this.A01);
                                if (number != null) {
                                    int intValue2 = number.intValue();
                                    C54512HGy hGy4 = this.A01;
                                    if (hGy4 != null && hGy4.A0E) {
                                        intValue2 += ((Number) A00().A00.A0D.invoke(Integer.valueOf(i2), number)).intValue();
                                    }
                                    int A013 = (int) 182.A01(0Tu.A05, this.A08, 36599623944703586L);
                                    DJN djn = DJN.A00;
                                    LinearInterpolator linearInterpolator2 = new LinearInterpolator();
                                    ValueAnimator ofInt2 = ValueAnimator.ofInt(new int[]{measuredHeight3, intValue2});
                                    long j = (long) A013;
                                    ofInt2.setDuration(j);
                                    ofInt2.setInterpolator(linearInterpolator2);
                                    ofInt2.addUpdateListener(new LTj(viewGroup2));
                                    ofInt2.addListener(new C62147Kb0(djn));
                                    0sL r14 = A00().A00.A0F;
                                    0qQ.A0C(viewGroup2, "null cannot be cast to non-null type android.view.View");
                                    r14.invoke(viewGroup2, 0);
                                    ofInt2.start();
                                    new Handler(Looper.getMainLooper()).postDelayed(new C57838IhH(this, r11), j);
                                }
                            }
                        }
                    }
                    WatchAndBrowseMainView watchAndBrowseMainView4 = this.A04;
                    if (watchAndBrowseMainView4 != null) {
                        watchAndBrowseMainView4.setVisibility(0);
                    }
                }
            }
        } else if (i == 18) {
            boolean z2 = r11.A1w;
            boolean z3 = this.A05;
            if (!z2) {
                if (z3 && !((Boolean) A00().A00.A06.invoke()).booleanValue()) {
                    0KC.A0D("WatchAndBrowseMediaViewHolder", AnonymousClass000.A00(3549));
                    A00().A00.A01.invoke();
                    this.A05 = false;
                }
            } else if (z3 && ((Boolean) A00().A00.A06.invoke()).booleanValue()) {
                this.A0B.CnH(this.A01, this.A04);
            }
        }
    }

    public final C246993fb A00() {
        C246993fb r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        0qQ.A0F("uiState");
        throw AnonymousClass00P.createAndThrow();
    }

    public AnonymousClass3Ux(Activity activity, Context context, ViewGroup viewGroup, UserSession userSession) {
        this.A0A = context;
        this.A07 = viewGroup;
        this.A08 = userSession;
        this.A06 = activity;
        this.A0B = new AnonymousClass3V0(new AnonymousClass3Uy(activity, context, userSession));
    }
}
