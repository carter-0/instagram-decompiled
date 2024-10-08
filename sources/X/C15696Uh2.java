package X;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout;

/* renamed from: X.Uh2  reason: case insensitive filesystem */
public final class C15696Uh2 extends C252233om implements AnonymousClass4DU, C252203oj, C232702uH, View.OnKeyListener {
    public static final C71392co A0N = C71392co.A03(3.0d, 5.0d);
    public static final String __redex_internal_original_name = "FixedMediaHeaderController";
    public long A00;
    public long A01;
    public View A02;
    public View A03;
    public RecyclerView A04;
    public WXB A05;
    public C232722uK A06;
    public boolean A07;
    public boolean A08;
    public Drawable A09;
    public TouchInterceptorFrameLayout A0A;
    public final int A0B;
    public final View.OnTouchListener A0C;
    public final C249403jg A0D;
    public final 2cs A0E;
    public final C18426VrV A0F;
    public final UserSession A0G;
    public final 1Xj A0H;
    public final AnonymousClass3W1 A0I;
    public final String A0J;
    public final int[] A0K;
    public final int[] A0L;
    public final boolean A0M;

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001a, code lost:
        if (r2 == X.AnonymousClass3OB.PAUSED) goto L_0x001c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A03() {
        /*
            r15 = this;
            r7 = r15
            X.1Xj r6 = r15.A0H
            boolean r0 = r6.CeS()
            if (r0 == 0) goto L_0x003a
            X.2uK r5 = r15.A06
            java.lang.String r3 = "Required value was null."
            if (r5 == 0) goto L_0x0081
            X.3OB r2 = r5.A0J()
            X.3OB r4 = X.AnonymousClass3OB.IDLE
            if (r2 == r4) goto L_0x001c
            X.3OB r0 = X.AnonymousClass3OB.PAUSED
            r1 = 0
            if (r2 != r0) goto L_0x001d
        L_0x001c:
            r1 = 1
        L_0x001d:
            boolean r0 = r15.A08
            if (r0 == 0) goto L_0x003b
            if (r1 == 0) goto L_0x003b
            boolean r0 = r5.A0Y()
            if (r0 != 0) goto L_0x003b
            boolean r0 = A02(r15)
            if (r0 == 0) goto L_0x003a
            X.3OB r1 = r5.A0J()
            X.3OB r0 = X.AnonymousClass3OB.PAUSED
            if (r1 != r0) goto L_0x005e
            r5.A0M()
        L_0x003a:
            return
        L_0x003b:
            X.WXB r2 = r15.A05
            if (r2 == 0) goto L_0x007b
            X.2uK r0 = r15.A06
            r1 = 0
            if (r0 == 0) goto L_0x004a
            X.3OB r1 = r0.A0J()
            if (r1 == r4) goto L_0x004e
        L_0x004a:
            X.3OB r0 = X.AnonymousClass3OB.PAUSED
            if (r1 != r0) goto L_0x003a
        L_0x004e:
            X.3V4 r0 = r2.A03
            X.2eb r0 = r0.A01
            android.view.View r1 = r0.A01()
            X.0qQ.A07(r1)
            r0 = 0
            r1.setVisibility(r0)
            return
        L_0x005e:
            X.WXB r8 = r15.A05
            if (r8 == 0) goto L_0x0075
            r10 = 0
            r11 = -1
            X.3W1 r0 = r15.A0I
            int r12 = r0.A01()
            r13 = 1
            X.4Lx r9 = new X.4Lx
            r9.<init>(r10, r10, r10, r10)
            r14 = r10
            r5.A0R(r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return
        L_0x0075:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r3)
            throw r0
        L_0x007b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r3)
            throw r0
        L_0x0081:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15696Uh2.A03():void");
    }

    public final void A04(WXB wxb) {
        1Xj r1 = this.A0H;
        if (r1.CeS()) {
            C232722uK r0 = this.A06;
            if (r0 != null) {
                r0.A0Q(r1, this, wxb, this.A0I, (C262864Gh) null, 0);
                return;
            }
            throw DbU.A0h();
        }
    }

    public final void D6z(View view) {
        Drawable drawable;
        0qQ.A0B(view, 0);
        this.A0A = view.requireViewById(R.id.layout_container_main);
        this.A02 = view.requireViewById(R.id.canvas_container);
        this.A03 = DbY.A0F(view, R.id.fixed_header_stub);
        TouchInterceptorFrameLayout touchInterceptorFrameLayout = this.A0A;
        if (touchInterceptorFrameLayout != null) {
            touchInterceptorFrameLayout.setBackgroundColor(-1);
        }
        TouchInterceptorFrameLayout touchInterceptorFrameLayout2 = this.A0A;
        if (touchInterceptorFrameLayout2 != null) {
            drawable = touchInterceptorFrameLayout2.getBackground();
        } else {
            drawable = null;
        }
        this.A09 = drawable;
    }

    public final void DYx(1Xj r1, int i) {
    }

    public final void DmB(2cs r1) {
    }

    public final void DmC(2cs r1) {
    }

    public final void DmD(2cs r1) {
    }

    public final void DmE(2cs r12) {
        0qQ.A0B(r12, 0);
        View view = this.A03;
        if (view == null) {
            0wb.A01.Ew0("onSpringUpdatedFailed", "fixedMediaHeaderView is null");
            return;
        }
        float f = (float) r12.A09.A00;
        double d = (double) f;
        int[] iArr = this.A0K;
        int i = iArr[1];
        view.setTranslationY(((float) AnonymousClass37Q.A01(d, (double) (-i))) + ((float) i));
        view.setTranslationX((float) AnonymousClass37Q.A02(d, (double) iArr[0]));
        if (this.A0L != null) {
            view.setScaleX(f);
            view.setScaleY(f);
        }
        Drawable drawable = this.A09;
        if (drawable != null) {
            drawable.setAlpha(AnonymousClass7TE.A06(f, 255.0f));
        }
    }

    public final /* synthetic */ void Dql(1Xj r1, AnonymousClass3V3 r2, AnonymousClass3W1 r3) {
    }

    public final void Dxf(1Xj r1, String str) {
    }

    public final void Dxw(1Xj r1, boolean z) {
    }

    public final void DyO(C257183wz r1, 1Xj r2) {
    }

    public final boolean isOrganicEligible() {
        return true;
    }

    public final void onDestroyView() {
        this.A06 = null;
        this.A04 = null;
        this.A09 = null;
        this.A0A = null;
        this.A02 = null;
        this.A03 = null;
    }

    public final void onPause() {
        this.A08 = false;
        C232722uK r2 = this.A06;
        if (r2 != null) {
            if (this.A0H.CeS() && r2.A0J() == AnonymousClass3OB.PLAYING) {
                r2.A0L();
            }
            RecyclerView recyclerView = this.A04;
            if (recyclerView != null) {
                recyclerView.A16(this.A0D);
                recyclerView.setOnTouchListener((View.OnTouchListener) null);
            }
            if (!this.A07) {
                this.A07 = true;
                long currentTimeMillis = System.currentTimeMillis();
                this.A01 += currentTimeMillis - this.A00;
                this.A00 = currentTimeMillis;
                return;
            }
            return;
        }
        throw DbU.A0h();
    }

    public final void onResume() {
        this.A08 = true;
        A03();
        RecyclerView recyclerView = this.A04;
        if (recyclerView != null) {
            recyclerView.A15(this.A0D);
            recyclerView.setOnTouchListener(this.A0C);
        }
        A01(this);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        if (bundle == null) {
            View view2 = this.A03;
            if (view2 != null) {
                view2.getViewTreeObserver().addOnPreDrawListener(new WCI(2, view2, this));
                return;
            }
            throw AnonymousClass7TE.A0y();
        }
    }

    /* JADX WARNING: type inference failed for: r0v6, types: [java.lang.Object, X.VrV] */
    public C15696Uh2(Fragment fragment, UserSession userSession, 1Xj r16, String str, String str2, int[] iArr, int[] iArr2, int i, int i2, boolean z) {
        String str3;
        1Xj r2 = r16;
        String str4 = str2;
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession, 5);
        this.A0M = z;
        this.A0G = userSession;
        this.A0B = i;
        this.A0K = iArr;
        this.A0L = iArr2;
        String str5 = str;
        if (str == null || str5.length() == 0) {
            str3 = "canvas";
        } else {
            str3 = 002.A0R("canvas_", str5);
        }
        this.A0J = str3;
        this.A0F = new Object();
        r2 = r2.A5H() ? r2.A1b() : r2;
        this.A0H = r2;
        AnonymousClass3W1 A18 = G9t.A18(r2);
        this.A0I = A18;
        this.A07 = true;
        this.A0C = new WC3(this, 6);
        this.A0D = new UB1(this, 5);
        A18.A0E(i2, A18.A03);
        2cs A0J2 = AnonymousClass7TF.A0J();
        A0J2.A09(A0N);
        A0J2.A06 = true;
        this.A0E = A0J2;
        C232722uK r22 = new C232722uK(fragment.requireContext(), userSession2, this, (C228412ld) null, str2 == null ? "" : str4, false, true, true, true, false);
        this.A06 = r22;
        r22.A0P.add(this);
    }

    public static final int A00(C15696Uh2 uh2) {
        View view;
        RecyclerView recyclerView = uh2.A04;
        if (recyclerView != null) {
            C249703kE A0W = recyclerView.A0W(0);
            if (A0W == null || (view = A0W.itemView) == null) {
                return 0;
            }
            return view.getTop();
        }
        throw AnonymousClass7TE.A0y();
    }

    public static final void A01(C15696Uh2 uh2) {
        if (uh2.A07) {
            RecyclerView recyclerView = uh2.A04;
            if (recyclerView == null || !recyclerView.isLaidOut()) {
                if (!uh2.A08) {
                    return;
                }
            } else if (A00(uh2) <= 0) {
                return;
            }
            uh2.A00 = System.currentTimeMillis();
            uh2.A07 = false;
        }
    }

    public static final boolean A02(C15696Uh2 uh2) {
        RecyclerView recyclerView = uh2.A04;
        if (recyclerView == null || !recyclerView.isLaidOut()) {
            return uh2.A08;
        }
        return AnonymousClass7TF.A1R((((float) A00(uh2)) > (((float) uh2.A0B) * 0.5f) ? 1 : (((float) A00(uh2)) == (((float) uh2.A0B) * 0.5f) ? 0 : -1)));
    }

    public final void DnU(1Xj r3, int i, int i2, int i3) {
        AnonymousClass3W1 r1 = this.A0I;
        r1.A0E(i, r1.A03);
    }

    public final String getModuleName() {
        return this.A0J;
    }

    public final boolean isSponsoredEligible() {
        return this.A0M;
    }

    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        DbY.A1S(view, keyEvent);
        if (this.A0H.CeS()) {
            C232722uK r0 = this.A06;
            if (r0 == null) {
                throw DbU.A0h();
            } else if (!r0.onKey(view, i, keyEvent)) {
                return false;
            } else {
                return true;
            }
        }
        return false;
    }
}
