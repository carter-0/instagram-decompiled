package com.instagram.profile.ui.refresh;

import X.0qQ;
import X.2cs;
import X.AnonymousClass05K;
import X.AnonymousClass08u;
import X.AnonymousClass3AD;
import X.AnonymousClass3AH;
import X.C19763Wf4;
import X.C252203oj;
import X.C267634bw;
import X.C323726y0;
import X.C323736y1;
import X.C324246ys;
import X.C61340me;
import X.C71392co;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public final class RefreshableAppBarLayoutBehavior extends AppBarLayout.Behavior implements AnonymousClass08u, C252203oj, C324246ys {
    public float A00;
    public float A01;
    public float A02;
    public int A03;
    public C323736y1 A04;
    public AnonymousClass3AD A05;
    public Integer A06 = AnonymousClass05K.A01;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public View A0D;
    public boolean A0E;
    public final AnonymousClass3AH A0F = new AnonymousClass3AH(String.valueOf(hashCode()));
    public final List A0G = new CopyOnWriteArrayList();
    public final List A0H = new CopyOnWriteArrayList();
    public final List A0I = new ArrayList();
    public final 2cs A0J;

    public final /* bridge */ /* synthetic */ boolean A0L(MotionEvent motionEvent, View view, CoordinatorLayout coordinatorLayout) {
        0qQ.A0B(coordinatorLayout, 0);
        0qQ.A0B(view, 1);
        0qQ.A0B(motionEvent, 2);
        if (this.A0B) {
            this.A0C = true;
        }
        return super.A0L(motionEvent, view, coordinatorLayout);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0015, code lost:
        if (r1 != 3) goto L_0x0017;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ boolean A0M(android.view.MotionEvent r6, android.view.View r7, androidx.coordinatorlayout.widget.CoordinatorLayout r8) {
        /*
            r5 = this;
            r4 = 0
            r2 = 1
            X.0qQ.A0B(r7, r2)
            r0 = 2
            X.0qQ.A0B(r6, r0)
            int r1 = r6.getActionMasked()
            if (r1 == 0) goto L_0x0060
            r3 = 0
            if (r1 == r2) goto L_0x0042
            if (r1 == r0) goto L_0x001c
            r0 = 3
            if (r1 == r0) goto L_0x0042
        L_0x0017:
            boolean r0 = super.A0M(r6, r7, r8)
            return r0
        L_0x001c:
            r5.A00()
            float r2 = r6.getRawY()
            float r1 = r5.A01
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x002c
            r5.A01 = r2
            goto L_0x0017
        L_0x002c:
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0017
            boolean r0 = r5.A0A
            if (r0 == 0) goto L_0x0017
            float r1 = r2 - r1
            boolean r0 = r5.A09
            if (r0 != 0) goto L_0x003e
            int r0 = (int) r1
            A03(r5, r0)
        L_0x003e:
            r5.A01 = r2
            r0 = 1
            return r0
        L_0x0042:
            A02(r5)
            r5.A01 = r3
            java.util.List r0 = r5.A0G
            java.util.Iterator r1 = r0.iterator()
        L_0x004d:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x005d
            java.lang.Object r0 = r1.next()
            X.4bw r0 = (X.C267634bw) r0
            r0.DnR()
            goto L_0x004d
        L_0x005d:
            r5.A07 = r4
            goto L_0x0017
        L_0x0060:
            r5.A00()
            goto L_0x0017
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.profile.ui.refresh.RefreshableAppBarLayoutBehavior.A0M(android.view.MotionEvent, android.view.View, androidx.coordinatorlayout.widget.CoordinatorLayout):boolean");
    }

    public final void A0W(View view, CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i) {
        0qQ.A0B(appBarLayout, 1);
        0qQ.A0B(view, 2);
        A02(this);
        this.A0B = false;
        this.A0C = false;
        if (this.A08) {
            this.A08 = false;
        }
        super.A0W(view, coordinatorLayout, appBarLayout, i);
    }

    public final void A0X(View view, CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int[] iArr, int i, int i2, int i3) {
        0qQ.A0B(coordinatorLayout, 0);
        0qQ.A0B(appBarLayout, 1);
        0qQ.A0B(view, 2);
        if (i3 == 1) {
            this.A0B = true;
        }
        super.A0P(view, coordinatorLayout, appBarLayout, iArr, i, i2, i3);
    }

    public final boolean A0Y(View view, View view2, CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i, int i2) {
        0qQ.A0B(appBarLayout, 1);
        0qQ.A0B(view, 2);
        0qQ.A0B(view2, 3);
        this.A08 = false;
        if (super.A0Y(view, view2, coordinatorLayout, appBarLayout, i, i2) || this.A0A) {
            return true;
        }
        return false;
    }

    public final boolean A0Z(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i) {
        0qQ.A0B(coordinatorLayout, 0);
        0qQ.A0B(appBarLayout, 1);
        appBarLayout.A02(this);
        this.A0D = appBarLayout;
        this.A04.A00 = appBarLayout;
        return super.A0Q(coordinatorLayout, appBarLayout, i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002a, code lost:
        if (r4.CbJ() != false) goto L_0x002c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DUz(com.google.android.material.appbar.AppBarLayout r8, int r9) {
        /*
            r7 = this;
            r0 = 0
            X.0qQ.A0B(r8, r0)
            boolean r1 = r7.A0E
            X.3AD r0 = r7.A05
            if (r1 == 0) goto L_0x007c
            if (r0 == 0) goto L_0x000f
            r0.APL()
        L_0x000f:
            java.util.List r0 = r7.A0H
            java.util.Iterator r6 = r0.iterator()
        L_0x0015:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x00a7
            java.lang.Object r4 = r6.next()
            com.instagram.profile.fragment.UserDetailFragment r4 = (com.instagram.profile.fragment.UserDetailFragment) r4
            boolean r5 = r7.A0A
            if (r5 != 0) goto L_0x002c
            boolean r1 = r4.CbJ()
            r0 = 1
            if (r1 == 0) goto L_0x002d
        L_0x002c:
            r0 = 0
        L_0x002d:
            r4.A1e = r0
            X.2dZ r0 = com.instagram.profile.fragment.UserDetailFragment.A00(r4)
            if (r0 == 0) goto L_0x006c
            X.2dZ r1 = com.instagram.profile.fragment.UserDetailFragment.A00(r4)
            boolean r0 = r4.A1e
            r1.A0Y(r0)
            boolean r0 = r4.A1f
            if (r5 == r0) goto L_0x006c
            com.instagram.common.session.UserSession r3 = r4.A0I
            X.0Tu r2 = X.0Tu.A05
            r0 = 36326691655727023(0x810eef000137af, double:3.036484306703595E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x006c
            boolean r0 = r4.isResumed()
            if (r0 == 0) goto L_0x006c
            X.2dZ r0 = com.instagram.profile.fragment.UserDetailFragment.A00(r4)
            if (r0 == 0) goto L_0x006c
            X.2dZ r0 = com.instagram.profile.fragment.UserDetailFragment.A00(r4)
            r0.A0T()
        L_0x006c:
            r4.A1f = r5
            boolean r0 = r4.CbJ()
            if (r0 == 0) goto L_0x0015
            X.HCA r0 = r4.A1O
            if (r0 == 0) goto L_0x0015
            r0.A01()
            goto L_0x0015
        L_0x007c:
            if (r9 != 0) goto L_0x00a1
            if (r0 == 0) goto L_0x0083
            r0.ARa()
        L_0x0083:
            r2 = 0
            int r1 = r8.getTotalScrollRange()
            if (r9 != 0) goto L_0x0095
            java.lang.Integer r1 = X.AnonymousClass05K.A01
        L_0x008c:
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r1 != r0) goto L_0x0091
            r2 = 1
        L_0x0091:
            r7.A0A = r2
            goto L_0x000f
        L_0x0095:
            int r0 = java.lang.Math.abs(r9)
            if (r0 < r1) goto L_0x009e
            java.lang.Integer r1 = X.AnonymousClass05K.A00
            goto L_0x008c
        L_0x009e:
            java.lang.Integer r1 = X.AnonymousClass05K.A0C
            goto L_0x008c
        L_0x00a1:
            if (r0 == 0) goto L_0x0083
            r0.APL()
            goto L_0x0083
        L_0x00a7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.profile.ui.refresh.RefreshableAppBarLayoutBehavior.DUz(com.google.android.material.appbar.AppBarLayout, int):void");
    }

    public final void DmC(2cs r5) {
        0qQ.A0B(r5, 0);
        this.A03 = (int) r5.A01;
        this.A09 = false;
        A01();
    }

    public final void DmD(2cs r1) {
    }

    public final void DmE(2cs r5) {
        0qQ.A0B(r5, 0);
        View view = this.A0D;
        if (view != null) {
            view.setTranslationY((float) ((int) r5.A09.A00));
        }
        int i = (int) r5.A09.A00;
        for (View translationY : this.A0I) {
            translationY.setTranslationY((float) i);
        }
    }

    public final void onPageScrollStateChanged(int i) {
    }

    public final void onPageSelected(int i) {
    }

    private final void A00() {
        if (!this.A07) {
            for (C267634bw Dmb : this.A0G) {
                Dmb.Dmb();
            }
            this.A07 = true;
        }
    }

    private final void A01() {
        float min = Math.min(1.0f, ((float) this.A03) / this.A02);
        this.A0F.A00((double) min, false);
        for (C267634bw DhP : this.A0G) {
            DhP.DhP(min, this.A03);
        }
    }

    public static final void A02(RefreshableAppBarLayoutBehavior refreshableAppBarLayoutBehavior) {
        int i;
        if (refreshableAppBarLayoutBehavior.A03 > 0) {
            refreshableAppBarLayoutBehavior.A09 = true;
            2cs r2 = refreshableAppBarLayoutBehavior.A0J;
            r2.A0A(refreshableAppBarLayoutBehavior);
            r2.A09(C71392co.A04(70.0d, 11.0d));
            r2.A02 = 1.0d;
            r2.A00 = 0.5d;
            if (refreshableAppBarLayoutBehavior.A06 == AnonymousClass05K.A00) {
                i = Float.valueOf(refreshableAppBarLayoutBehavior.A02);
            } else {
                i = 0;
            }
            r2.A06(i.doubleValue());
        }
    }

    public final void DmB(2cs r5) {
        if (this.A06 == AnonymousClass05K.A00) {
            this.A0F.A00(1.0d, true);
            AnonymousClass3AD r0 = this.A05;
            if (r0 != null) {
                r0.setIsLoading(true);
            }
            for (C267634bw Dcp : this.A0G) {
                Dcp.Dcp();
            }
        }
    }

    public RefreshableAppBarLayoutBehavior(View view, C323726y0 r4, boolean z) {
        2cs A022 = C61340me.A00().A02();
        A022.A06 = true;
        this.A0J = A022;
        this.A04 = new C323736y1(view, r4, this);
        this.A0E = z;
    }

    public static final void A03(RefreshableAppBarLayoutBehavior refreshableAppBarLayoutBehavior, int i) {
        View view;
        int abs = Math.abs(i);
        int i2 = refreshableAppBarLayoutBehavior.A03;
        if (((float) i2) < refreshableAppBarLayoutBehavior.A00) {
            i2 += abs;
            refreshableAppBarLayoutBehavior.A03 = i2;
        }
        if (!(refreshableAppBarLayoutBehavior.A05 instanceof C19763Wf4) && (view = refreshableAppBarLayoutBehavior.A0D) != null) {
            view.setTranslationY((float) i2);
            int i3 = refreshableAppBarLayoutBehavior.A03;
            for (View translationY : refreshableAppBarLayoutBehavior.A0I) {
                translationY.setTranslationY((float) i3);
            }
            refreshableAppBarLayoutBehavior.A0J.A05((double) refreshableAppBarLayoutBehavior.A03);
            refreshableAppBarLayoutBehavior.A01();
            if (((float) refreshableAppBarLayoutBehavior.A03) >= refreshableAppBarLayoutBehavior.A00) {
                A02(refreshableAppBarLayoutBehavior);
            }
        }
        if (((float) refreshableAppBarLayoutBehavior.A03) >= refreshableAppBarLayoutBehavior.A02) {
            refreshableAppBarLayoutBehavior.A06 = AnonymousClass05K.A00;
            AnonymousClass3AD r1 = refreshableAppBarLayoutBehavior.A05;
            if (r1 != null) {
                r1.setIsLoading(true);
            }
        }
    }

    public final boolean A0R(int i) {
        return super.A0R(i);
    }

    public final void A0a(int i) {
        super.A0R(i);
    }

    public final void onPageScrolled(int i, float f, int i2) {
    }
}
