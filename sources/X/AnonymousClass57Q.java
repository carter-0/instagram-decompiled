package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.os.CountDownTimer;
import android.provider.Settings;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.57Q  reason: invalid class name */
public final class AnonymousClass57Q extends C249383je {
    public float A00 = 1.0f;
    public int A01;
    public int A02;
    public ValueAnimator A03 = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f});
    public CountDownTimer A04;
    public 1Xj A05;
    public C227802jw A06;
    public String A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public final float A0G;
    public final Context A0H;
    public final UserSession A0I;
    public final C234012wq A0J;
    public final C234022wr A0K;
    public final C234002wp A0L;
    public final HEM A0M;
    public final ConcurrentHashMap A0N;
    public final ConcurrentHashMap A0O;
    public final C231332rR A0P;
    public final C21399Xa7 A0Q;

    public AnonymousClass57Q(Context context, UserSession userSession, C234012wq r7, C234022wr r8, C234002wp r9, C231332rR r10, C21399Xa7 xa7) {
        0qQ.A0B(userSession, 2);
        0qQ.A0B(r8, 5);
        this.A0H = context;
        this.A0I = userSession;
        this.A0P = r10;
        this.A0Q = xa7;
        this.A0K = r8;
        this.A0J = r7;
        this.A0L = r9;
        int A012 = (int) 182.A01(0Tu.A06, userSession, 36606315501852024L);
        this.A02 = A012;
        this.A01 = A012;
        this.A0M = (HEM) userSession.A01(HEM.class, new C20608Wvp(userSession, 23));
        this.A0N = new ConcurrentHashMap();
        this.A0O = new ConcurrentHashMap();
        this.A0G = Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f);
    }

    public static final void A01(AnonymousClass57Q r7, String str, boolean z) {
        Integer num;
        AnonymousClass3W1 r5;
        View view;
        AnonymousClass57Q r6 = r7;
        r7.A0E = z;
        String str2 = str;
        if (!z) {
            r6.A0O.put(str, C54622HLf.STARTED);
            C227802jw r0 = r6.A06;
            if (!(r0 == null || (view = r0.A01) == null)) {
                view.setVisibility(0);
            }
            C227802jw r3 = r6.A06;
            if (r3 != null) {
                IgSimpleImageView igSimpleImageView = r3.A03;
                if (igSimpleImageView != null) {
                    igSimpleImageView.setVisibility(8);
                }
                IgTextView igTextView = r3.A04;
                if (igTextView != null) {
                    igTextView.setVisibility(0);
                }
            }
        }
        CountDownTimer countDownTimer = r6.A04;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        float f = r6.A00;
        int i = r6.A02;
        float f2 = f * ((float) i) * 1000.0f;
        int ceil = (int) ((float) Math.ceil((double) (f2 / 1000.0f)));
        r6.A01 = ceil;
        if (ceil == i) {
            num = AnonymousClass05K.A0C;
        } else {
            num = AnonymousClass05K.A0Y;
        }
        A00(r6, num, "unknown");
        0eP r02 = (0eP) r6.A0N.get(str);
        if (r02 != null) {
            r5 = (AnonymousClass3W1) r02.A01;
        } else {
            r5 = null;
        }
        r6.A04 = new C52805Gcx(r5, r6, str2, (long) f2).start();
        r6.A03.cancel();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{r6.A00, 0.0f});
        r6.A03 = ofFloat;
        ofFloat.setDuration((long) (((r6.A00 * ((float) r6.A02)) * 1000.0f) / r6.A0G));
        r6.A03.setInterpolator(new LinearInterpolator());
        r6.A03.addUpdateListener(new I7k(r6));
        r6.A03.start();
    }

    public final void A05(1Xj r3) {
        String id;
        if (A08(r3, false) && (id = r3.getId()) != null) {
            A01(this, id, true);
        }
    }

    public static final void A00(AnonymousClass57Q r6, Integer num, String str) {
        1Xj r2;
        String str2 = r6.A07;
        if (str2 != null) {
            C21399Xa7 xa7 = r6.A0Q;
            0eP r0 = (0eP) r6.A0N.get(str2);
            if (r0 != null) {
                r2 = (1Xj) r0.A00;
            } else {
                r2 = null;
            }
            int i = r6.A01;
            if (r2 != null) {
                HZV.A00(xa7.A00, r2, xa7.A01, num, str, i);
            }
        }
    }

    public static final boolean A02(AnonymousClass57Q r3) {
        String str = r3.A07;
        if (str == null || r3.A0O.get(str) == C54622HLf.HIDDEN) {
            return false;
        }
        return true;
    }

    public final void A03() {
        View view;
        AnonymousClass3W1 r1;
        String str = this.A07;
        if (str != null) {
            0eP r0 = (0eP) this.A0N.get(str);
            if (!(r0 == null || (r1 = (AnonymousClass3W1) r0.A01) == null)) {
                r1.A2b = true;
                r1.A3A = false;
            }
            this.A0O.put(str, C54622HLf.HIDDEN);
            C227802jw r02 = this.A06;
            if (!(r02 == null || (view = r02.A01) == null)) {
                view.setVisibility(8);
            }
            C227802jw r6 = this.A06;
            if (r6 != null) {
                if (((C234022wr) r6.A0l.getValue()).A00()) {
                    2dZ.A0t.A03(r6.getActivity()).Etr(true);
                    AnonymousClass3AD r03 = r6.A0G;
                    if (r03 != null) {
                        r03.ARa();
                    }
                    r6.A0A().A0J().A0B.A03 = 0;
                }
                AnonymousClass2rI A0J2 = r6.A0A().A0J();
                GSY gsy = C242583Vb.A00;
                if (gsy != null) {
                    List list = (List) gsy.A00;
                    if (list == null || list.isEmpty()) {
                        A0J2.A0a.CgO();
                    } else {
                        ((C231352rU) A0J2.A00).A0F(A0J2.A0S, gsy.A03, (List) gsy.A00, true);
                        A0J2.A0A(-1);
                    }
                }
                C242583Vb.A00 = null;
                A0J2.A0A.A03 = 0;
                r6.A0A().A0J().AV9();
            }
            this.A01 = this.A02;
            CountDownTimer countDownTimer = this.A04;
            if (countDownTimer != null) {
                countDownTimer.cancel();
            }
            this.A03.cancel();
            this.A00 = 1.0f;
            this.A09 = false;
            HQQ.A00 = true;
            UserSession userSession = this.A0I;
            0qQ.A0B(userSession, 0);
            if (182.A06(0Tu.A06, userSession, 36324840528818593L)) {
                this.A07 = null;
            }
            HQQ.A01 = null;
            this.A0A = false;
        }
    }

    public final void A04() {
        if (this.A09) {
            return;
        }
        if (!this.A0A) {
            this.A0F = true;
            return;
        }
        String str = this.A07;
        if (str != null) {
            C227802jw r3 = this.A06;
            if (r3 != null) {
                r3.getRecyclerView().suppressLayout(true);
                2dZ.A0t.A03(r3.getActivity()).Etr(false);
                AnonymousClass3AD r0 = r3.A0G;
                if (r0 != null) {
                    r0.APL();
                }
                AnonymousClass2rI A0J2 = r3.A0A().A0J();
                try {
                    C238133Ar scrollingViewProxy = A0J2.A0Y.getScrollingViewProxy();
                    int B6L = scrollingViewProxy.B6L();
                    int BLQ = scrollingViewProxy.BLQ();
                    if (B6L >= 0 && BLQ >= 0) {
                        int i = B6L;
                        while (true) {
                            if (i > BLQ) {
                                break;
                            }
                            try {
                                Object item = A0J2.getItem(i);
                                if (item != null) {
                                    if ((item instanceof 1Xl) && 0qQ.A0K(((1Xl) item).BPf().getId(), str)) {
                                        View AnE = scrollingViewProxy.AnE(i);
                                        if (AnE == null) {
                                            VEZ.A00("Null view in getDelayedSkipMediaPositionInfo.", B6L, BLQ, i, scrollingViewProxy.AnH(), scrollingViewProxy.getCount(), true);
                                        } else {
                                            if (i < 0) {
                                                i = 0;
                                            }
                                            AnE.getTop();
                                            r3.A0A().A0J().A0B.A03 = 150;
                                            r3.A0A().A0J().AV9();
                                            r3.A00 = i;
                                            r3.getScrollingViewProxy().Evr(i, -150);
                                        }
                                    }
                                }
                                i++;
                            } catch (IndexOutOfBoundsException unused) {
                                VEZ.A00("IndexOutOfBounds in getDelayedSkipMediaPositionInfo.", B6L, BLQ, i, scrollingViewProxy.AnH(), scrollingViewProxy.getCount(), true);
                            }
                        }
                    }
                } catch (IllegalStateException e) {
                    AnonymousClass2rI.A00(e);
                }
                r3.getRecyclerView().suppressLayout(false);
            }
            this.A09 = true;
        }
    }

    public final void A07(boolean z) {
        String str;
        if (!this.A0E) {
            String str2 = this.A07;
            if (str2 != null) {
                ConcurrentHashMap concurrentHashMap = this.A0O;
                if (concurrentHashMap.get(str2) == C54622HLf.STARTED) {
                    concurrentHashMap.put(str2, C54622HLf.PAUSED);
                    Integer num = AnonymousClass05K.A0N;
                    if (z) {
                        str = "scroll";
                    } else {
                        str = "navigation";
                    }
                    A00(this, num, str);
                    CountDownTimer countDownTimer = this.A04;
                    if (countDownTimer != null) {
                        countDownTimer.cancel();
                    }
                    this.A03.cancel();
                }
            }
            C227802jw r2 = this.A06;
            if (r2 != null) {
                IgSimpleImageView igSimpleImageView = r2.A03;
                if (igSimpleImageView != null) {
                    igSimpleImageView.setVisibility(0);
                }
                IgTextView igTextView = r2.A04;
                if (igTextView != null) {
                    igTextView.setVisibility(8);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001e, code lost:
        if (r1.equals(r7.getId()) == false) goto L_0x0020;
     */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0053  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A08(X.1Xj r7, boolean r8) {
        /*
            r6 = this;
            X.2wp r5 = r6.A0L
            boolean r0 = r5.A03()
            r3 = 1
            if (r0 == 0) goto L_0x0059
            if (r7 == 0) goto L_0x0059
            boolean r0 = r7.CcK()
            if (r0 != r3) goto L_0x0059
            java.lang.String r1 = r6.A07
            if (r1 == 0) goto L_0x0020
            java.lang.String r0 = r7.getId()
            boolean r0 = r1.equals(r0)
            r4 = 1
            if (r0 != 0) goto L_0x0021
        L_0x0020:
            r4 = 0
        L_0x0021:
            boolean r0 = r5.A03()
            r2 = 0
            if (r0 == 0) goto L_0x0070
            boolean r0 = r5.A05(r7)
            if (r0 == 0) goto L_0x0070
            X.2wq r0 = r5.A03
            boolean r1 = r0.A01()
            boolean r0 = r5.A06(r7)
            if (r1 != 0) goto L_0x006a
            if (r0 != 0) goto L_0x006a
            if (r8 == 0) goto L_0x0042
            X.HQQ.A02 = r2
            X.HQQ.A03 = r2
        L_0x0042:
            X.1Xy r0 = r7.A0C
            X.3lZ r0 = r0.getInjected()
            if (r0 == 0) goto L_0x0068
            java.lang.String r0 = r0.AZ4()
        L_0x004e:
            X.HQQ.A01 = r0
            r1 = 1
        L_0x0051:
            if (r4 != 0) goto L_0x0065
            java.lang.String r0 = r6.A07
            if (r0 == 0) goto L_0x005b
            X.HQQ.A04 = r3
        L_0x0059:
            r3 = 0
            return r3
        L_0x005b:
            X.2wq r0 = r6.A0J
            boolean r0 = r0.A01()
            if (r0 != 0) goto L_0x0059
            if (r1 == 0) goto L_0x0059
        L_0x0065:
            X.HQQ.A04 = r2
            return r3
        L_0x0068:
            r0 = 0
            goto L_0x004e
        L_0x006a:
            if (r8 == 0) goto L_0x0070
            X.HQQ.A02 = r1
            X.HQQ.A03 = r0
        L_0x0070:
            r1 = 0
            goto L_0x0051
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass57Q.A08(X.1Xj, boolean):boolean");
    }

    public final void A06(Integer num, boolean z, boolean z2) {
        C227802jw r0;
        View view;
        if (A02(this)) {
            if (!this.A0K.A00() ? this.A08 || num != AnonymousClass05K.A01 || !z : !z) {
                if (!z2) {
                    return;
                }
            }
            AnonymousClass2S0.A01.A03();
            UserSession userSession = this.A0I;
            0qQ.A0B(userSession, 0);
            if (!(182.A06(0Tu.A06, userSession, 36324840529473957L) || (r0 = this.A06) == null || (view = r0.A01) == null)) {
                HZU.A00(view, true).start();
            }
            if (z && num == AnonymousClass05K.A01) {
                this.A08 = true;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x007e, code lost:
        if (r8 != false) goto L_0x005a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0017, code lost:
        if (r28 >= 0) goto L_0x0019;
     */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x006b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onScroll(X.C238133Ar r23, int r24, int r25, int r26, int r27, int r28) {
        /*
            r22 = this;
            r0 = 160033847(0x989ec37, float:3.3203686E-33)
            int r0 = X.AnonymousClass0fD.A03(r0)
            r3 = 0
            r9 = r23
            X.0qQ.A0B(r9, r3)
            r14 = 1
            r8 = 1
            r6 = r22
            r4 = r28
            if (r28 > 0) goto L_0x0019
            r8 = 0
            r7 = 1
            if (r28 < 0) goto L_0x0022
        L_0x0019:
            r7 = 0
            if (r8 == 0) goto L_0x0022
            boolean r1 = r6.A0A
            if (r1 != 0) goto L_0x0022
            r6.A0A = r14
        L_0x0022:
            boolean r1 = A02(r6)
            if (r1 != 0) goto L_0x002f
            r1 = -473779277(0xffffffffe3c2b3b3, float:-7.183234E21)
        L_0x002b:
            X.AnonymousClass0fD.A0A(r1, r0)
            return
        L_0x002f:
            boolean r1 = r6.A0B
            if (r1 == 0) goto L_0x004d
            X.2jw r5 = r6.A06
            if (r5 == 0) goto L_0x004b
            X.2dY r2 = X.2dZ.A0t
            androidx.fragment.app.FragmentActivity r1 = r5.getActivity()
            X.2dZ r1 = r2.A03(r1)
            r1.Etr(r3)
            X.3AD r1 = r5.A0G
            if (r1 == 0) goto L_0x004b
            r1.APL()
        L_0x004b:
            r6.A0B = r3
        L_0x004d:
            boolean r1 = r9.COv()
            if (r1 == 0) goto L_0x007e
            if (r8 == 0) goto L_0x0063
            java.lang.Integer r1 = X.AnonymousClass05K.A01
            r6.A06(r1, r14, r3)
        L_0x005a:
            boolean r1 = r6.A0F
            if (r1 == 0) goto L_0x0063
            r6.A04()
            r6.A0F = r3
        L_0x0063:
            X.2wr r1 = r6.A0K
            boolean r1 = r1.A00()
            if (r1 == 0) goto L_0x0238
            if (r7 == 0) goto L_0x00e0
            X.2jw r5 = r6.A06
            if (r5 == 0) goto L_0x0238
            java.lang.String r8 = r6.A07
            if (r8 == 0) goto L_0x0238
            X.2kj r1 = r5.A0A()
            X.2rI r7 = r1.A0J()
            goto L_0x0081
        L_0x007e:
            if (r8 == 0) goto L_0x0063
            goto L_0x005a
        L_0x0081:
            X.4DV r1 = r7.A0Y     // Catch:{ IllegalStateException -> 0x0200 }
            X.3Ar r2 = r1.getScrollingViewProxy()     // Catch:{ IllegalStateException -> 0x0200 }
            int r9 = r2.B6L()     // Catch:{ IllegalStateException -> 0x0200 }
            int r10 = r2.BLQ()     // Catch:{ IllegalStateException -> 0x0200 }
            if (r9 < 0) goto L_0x0238
            if (r10 < 0) goto L_0x0238
            r11 = r9
        L_0x0094:
            if (r11 > r10) goto L_0x0238
            java.lang.Object r6 = r7.getItem(r11)     // Catch:{ IndexOutOfBoundsException -> 0x00d1 }
            if (r6 == 0) goto L_0x00c5
            boolean r1 = r6 instanceof X.1Xl     // Catch:{ IllegalStateException -> 0x0200 }
            if (r1 == 0) goto L_0x00c5
            X.1Xl r6 = (X.1Xl) r6     // Catch:{ IllegalStateException -> 0x0200 }
            X.1Xj r1 = r6.BPf()     // Catch:{ IllegalStateException -> 0x0200 }
            java.lang.String r1 = r1.getId()     // Catch:{ IllegalStateException -> 0x0200 }
            boolean r1 = X.0qQ.A0K(r1, r8)     // Catch:{ IllegalStateException -> 0x0200 }
            if (r1 == 0) goto L_0x00c5
            java.lang.String r8 = "Null view in getDelayedSkipMediaPositionInfo."
            android.view.View r1 = r2.AnE(r11)     // Catch:{ IllegalStateException -> 0x0200 }
            if (r1 != 0) goto L_0x00c8
            int r12 = r2.AnH()     // Catch:{ IllegalStateException -> 0x0200 }
            int r13 = r2.getCount()     // Catch:{ IllegalStateException -> 0x0200 }
            X.VEZ.A00(r8, r9, r10, r11, r12, r13, r14)     // Catch:{ IllegalStateException -> 0x0200 }
            goto L_0x0238
        L_0x00c5:
            int r11 = r11 + 1
            goto L_0x0094
        L_0x00c8:
            if (r11 >= r3) goto L_0x00cb
            r11 = 0
        L_0x00cb:
            int r6 = r1.getTop()     // Catch:{ IllegalStateException -> 0x0200 }
            goto L_0x0205
        L_0x00d1:
            java.lang.String r8 = "IndexOutOfBounds in getDelayedSkipMediaPositionInfo."
            int r12 = r2.AnH()     // Catch:{ IllegalStateException -> 0x0200 }
            int r13 = r2.getCount()     // Catch:{ IllegalStateException -> 0x0200 }
            X.VEZ.A00(r8, r9, r10, r11, r12, r13, r14)     // Catch:{ IllegalStateException -> 0x0200 }
            goto L_0x0238
        L_0x00e0:
            if (r8 == 0) goto L_0x0238
            X.2jw r5 = r6.A06
            if (r5 == 0) goto L_0x0238
            java.lang.String r9 = r6.A07
            if (r9 == 0) goto L_0x0238
            X.2kj r1 = r5.A0A()
            X.2rI r11 = r1.A0J()
            r6 = 0
            X.4DV r1 = r11.A0Y     // Catch:{ IllegalStateException -> 0x0200 }
            X.3Ar r8 = r1.getScrollingViewProxy()     // Catch:{ IllegalStateException -> 0x0200 }
            int r16 = r8.B6L()     // Catch:{ IllegalStateException -> 0x0200 }
            int r7 = r8.BLQ()     // Catch:{ IllegalStateException -> 0x0200 }
            if (r16 < 0) goto L_0x0238
            if (r7 < 0) goto L_0x0238
            r2 = r16
        L_0x0107:
            if (r2 > r7) goto L_0x0238
            java.lang.Object r10 = r11.getItem(r2)     // Catch:{ IndexOutOfBoundsException -> 0x01ec }
            if (r10 == 0) goto L_0x013f
            boolean r1 = r10 instanceof X.1Xl     // Catch:{ IllegalStateException -> 0x0200 }
            if (r1 == 0) goto L_0x013f
            r1 = r10
            X.1Xl r1 = (X.1Xl) r1     // Catch:{ IllegalStateException -> 0x0200 }
            X.1Xj r1 = r1.BPf()     // Catch:{ IllegalStateException -> 0x0200 }
            java.lang.String r1 = r1.getId()     // Catch:{ IllegalStateException -> 0x0200 }
            boolean r1 = X.0qQ.A0K(r1, r9)     // Catch:{ IllegalStateException -> 0x0200 }
            if (r1 == 0) goto L_0x013f
            java.lang.String r15 = "Null view in getDelayedSkipMediaPositionInfo."
            android.view.View r9 = r8.AnE(r2)     // Catch:{ IllegalStateException -> 0x0200 }
            if (r9 != 0) goto L_0x0142
            int r19 = r8.AnH()     // Catch:{ IllegalStateException -> 0x0200 }
            int r20 = r8.getCount()     // Catch:{ IllegalStateException -> 0x0200 }
            r17 = r7
            r18 = r2
            r21 = r14
            X.VEZ.A00(r15, r16, r17, r18, r19, r20, r21)     // Catch:{ IllegalStateException -> 0x0200 }
            goto L_0x0238
        L_0x013f:
            int r2 = r2 + 1
            goto L_0x0107
        L_0x0142:
            if (r2 > r7) goto L_0x014d
            java.lang.Object r1 = r11.getItem(r2)     // Catch:{ IllegalStateException -> 0x0200 }
            if (r1 != r10) goto L_0x014d
            int r2 = r2 + 1
            goto L_0x0142
        L_0x014d:
            int r1 = r2 + -1
            android.view.View r1 = r8.AnE(r1)     // Catch:{ IllegalStateException -> 0x0200 }
            if (r1 == 0) goto L_0x0162
            int r1 = r1.getBottom()     // Catch:{ IllegalStateException -> 0x0200 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ IllegalStateException -> 0x0200 }
        L_0x015d:
            int r8 = r9.getTop()     // Catch:{ IllegalStateException -> 0x0200 }
            goto L_0x0164
        L_0x0162:
            r1 = r6
            goto L_0x015d
        L_0x0164:
            if (r1 == 0) goto L_0x0238
            int r7 = r1.intValue()
            java.lang.Integer r1 = r5.A0J
            if (r1 == 0) goto L_0x0238
            int r9 = r1.intValue()
            androidx.recyclerview.widget.RecyclerView r1 = r5.getRecyclerView()
            int r1 = r1.getHeight()
            int r1 = r1 - r9
            r2 = -150(0xffffffffffffff6a, float:NaN)
            if (r7 >= r1) goto L_0x01c8
            if (r8 >= 0) goto L_0x01c8
            androidx.recyclerview.widget.RecyclerView r1 = r5.getRecyclerView()
            int r1 = r1.getScrollState()
            if (r1 == r14) goto L_0x01c8
            androidx.recyclerview.widget.RecyclerView r1 = r5.getRecyclerView()
            int r1 = r1.getHeight()
            int r1 = r1 - r9
            int r1 = r1 + -150
            if (r7 > r1) goto L_0x01bd
            if (r8 > r2) goto L_0x01bd
            androidx.recyclerview.widget.RecyclerView r1 = r5.getRecyclerView()
            r1.getHeight()
            X.57Q r2 = r5.A0A
            if (r2 == 0) goto L_0x01aa
            java.lang.Integer r1 = X.AnonymousClass05K.A01
            r2.A06(r1, r14, r3)
        L_0x01aa:
            X.3Ar r4 = r5.getScrollingViewProxy()
            int r2 = r5.A00
            r1 = -1
            if (r2 == r1) goto L_0x01b6
            r4.Evr(r2, r3)
        L_0x01b6:
            X.57Q r1 = r5.A0A
            if (r1 == 0) goto L_0x0238
            r1.A0D = r3
            goto L_0x0238
        L_0x01bd:
            X.57Q r1 = r5.A0A
            if (r1 == 0) goto L_0x0238
            r1.A0D = r3
            r1.A0C = r3
            r1.A0D = r14
            goto L_0x0238
        L_0x01c8:
            androidx.recyclerview.widget.RecyclerView r1 = r5.getRecyclerView()
            int r1 = r1.getHeight()
            int r1 = r1 - r9
            int r1 = r1 + -150
            if (r7 > r1) goto L_0x0238
            if (r8 > r2) goto L_0x0238
            androidx.recyclerview.widget.RecyclerView r1 = r5.getRecyclerView()
            int r1 = r1.getScrollState()
            if (r1 != r14) goto L_0x0238
            androidx.recyclerview.widget.RecyclerView r2 = r5.getRecyclerView()
            if (r2 == 0) goto L_0x0238
            int r1 = -r4
            androidx.recyclerview.widget.RecyclerView.A0D(r6, r2, r3, r1)
            goto L_0x0238
        L_0x01ec:
            java.lang.String r15 = "IndexOutOfBounds in getDelayedSkipMediaPositionInfo."
            int r19 = r8.AnH()     // Catch:{ IllegalStateException -> 0x0200 }
            int r20 = r8.getCount()     // Catch:{ IllegalStateException -> 0x0200 }
            r17 = r7
            r18 = r2
            r21 = r14
            X.VEZ.A00(r15, r16, r17, r18, r19, r20, r21)     // Catch:{ IllegalStateException -> 0x0200 }
            goto L_0x0238
        L_0x0200:
            r1 = move-exception
            X.AnonymousClass2rI.A00(r1)
            goto L_0x0238
        L_0x0205:
            int r1 = r5.A00
            int r1 = java.lang.Math.min(r1, r11)
            r5.A00 = r1
            r2 = 150(0x96, float:2.1E-43)
            if (r6 <= 0) goto L_0x0238
            androidx.recyclerview.widget.RecyclerView r1 = r5.getRecyclerView()
            int r1 = r1.getScrollState()
            if (r1 == r14) goto L_0x0248
            if (r6 < r2) goto L_0x023d
            X.57Q r2 = r5.A0A
            if (r2 == 0) goto L_0x0226
            java.lang.Integer r1 = X.AnonymousClass05K.A00
            r2.A06(r1, r14, r3)
        L_0x0226:
            X.3Ar r4 = r5.getScrollingViewProxy()
            int r2 = r5.A00
            r1 = -1
            if (r2 == r1) goto L_0x0232
            r4.Evr(r2, r3)
        L_0x0232:
            X.57Q r1 = r5.A0A
            if (r1 == 0) goto L_0x0238
            r1.A0C = r3
        L_0x0238:
            r1 = 914104181(0x367c1f75, float:3.7569237E-6)
            goto L_0x002b
        L_0x023d:
            X.57Q r1 = r5.A0A
            if (r1 == 0) goto L_0x0238
            r1.A0D = r3
            r1.A0C = r3
            r1.A0C = r14
            goto L_0x0238
        L_0x0248:
            if (r6 < r2) goto L_0x0238
            androidx.recyclerview.widget.RecyclerView r1 = r5.getRecyclerView()
            int r1 = r1.getScrollState()
            if (r1 != r14) goto L_0x0238
            androidx.recyclerview.widget.RecyclerView r5 = r5.getRecyclerView()
            int r2 = -r4
            r1 = 0
            androidx.recyclerview.widget.RecyclerView.A0D(r1, r5, r3, r2)
            goto L_0x0238
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass57Q.onScroll(X.3Ar, int, int, int, int, int):void");
    }

    public final void onScrollStateChanged(C238133Ar r13, int i) {
        int i2;
        C227802jw r0;
        String str;
        int A032 = AnonymousClass0fD.A03(158193245);
        0qQ.A0B(r13, 0);
        if (!A02(this)) {
            i2 = 577650554;
        } else {
            if (i == 0 && !((!this.A0D && !this.A0C) || (r0 = this.A06) == null || (str = this.A07) == null)) {
                AnonymousClass2rI A0J2 = r0.A0A().A0J();
                try {
                    C238133Ar scrollingViewProxy = A0J2.A0Y.getScrollingViewProxy();
                    int B6L = scrollingViewProxy.B6L();
                    int BLQ = scrollingViewProxy.BLQ();
                    if (B6L >= 0 && BLQ >= 0) {
                        int i3 = B6L;
                        while (true) {
                            if (i3 > BLQ) {
                                break;
                            }
                            try {
                                Object item = A0J2.getItem(i3);
                                if (item != null) {
                                    if ((item instanceof 1Xl) && 0qQ.A0K(((1Xl) item).BPf().getId(), str)) {
                                        View AnE = scrollingViewProxy.AnE(i3);
                                        if (AnE == null) {
                                            VEZ.A00("Null view in getDelayedSkipMediaPositionInfo.", B6L, BLQ, i3, scrollingViewProxy.AnH(), scrollingViewProxy.getCount(), true);
                                        } else {
                                            AnE.getTop();
                                        }
                                    }
                                }
                                i3++;
                            } catch (IndexOutOfBoundsException unused) {
                                VEZ.A00("IndexOutOfBounds in getDelayedSkipMediaPositionInfo.", B6L, BLQ, i3, scrollingViewProxy.AnH(), scrollingViewProxy.getCount(), true);
                            }
                        }
                    }
                } catch (IllegalStateException e) {
                    AnonymousClass2rI.A00(e);
                }
            }
            super.onScrollStateChanged(r13, i);
            i2 = 2062055975;
        }
        AnonymousClass0fD.A0A(i2, A032);
    }
}
