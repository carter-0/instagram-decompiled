package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.WMw  reason: case insensitive filesystem */
public final class C19140WMw implements AnonymousClass4DS, C252213ok, AnonymousClass06Q {
    public static final C71392co A0J = C71392co.A01();
    public float A00 = 0.0f;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public float A05;
    public ViewOutlineProvider A06;
    public Integer A07 = AnonymousClass05K.A01;
    public boolean A08;
    public final float A09;
    public final View A0A;
    public final ViewGroup A0B;
    public final ViewGroup A0C;
    public final 06N A0D;
    public final 0hq A0E;
    public final C19702We4 A0F;
    public final C227242it A0G;
    public final boolean A0H;
    public final UserSession A0I;

    public static void A00(C19140WMw wMw, float f) {
        ViewGroup viewGroup = wMw.A0C;
        wMw.A0B.setLayoutParams(new FrameLayout.LayoutParams(-1, (int) Math.max(((float) viewGroup.getHeight()) * f, ((float) viewGroup.getHeight()) * wMw.A00)));
    }

    public final void A01() {
        this.A0F.A03(true, 0.0f);
        this.A0A.setImportantForAccessibility(1);
        this.A0G.DAt();
    }

    public final void A02() {
        0hq r1 = this.A0E;
        if (r1.A0P(R.id.fragment_container) != null && !r1.A12()) {
            try {
                r1.A13();
            } catch (Exception unused) {
                0wb.A03("FragmentDrawerController", "removeCurrentDrawerFragment failed");
            }
        }
    }

    public final void A03() {
        C19702We4 we4 = this.A0F;
        if (we4 != null) {
            we4.A03(true, we4.A0C.A01);
            this.A0G.Dfn();
        }
    }

    public final void A04(Fragment fragment, boolean z, boolean z2) {
        0hq r3 = this.A0E;
        if (!r3.A0G && AnonymousClass06S.A01(r3)) {
            0s1 r1 = new 0s1(r3);
            r1.A0A(fragment, R.id.fragment_container);
            r1.A0I("drawer_back_stack");
            r1.A00();
            A00(this, this.A01);
            ViewGroup viewGroup = this.A0C;
            if (z2) {
                viewGroup.setVisibility(0);
                C19702We4 we4 = this.A0F;
                we4.A03(z, we4.A0C.A01);
                r3.A0a();
                this.A0A.setImportantForAccessibility(4);
                2eQ.A05(viewGroup, 1000);
                06N r12 = this.A0D;
                if (r12 != null) {
                    r3.A0r(r12, true);
                    return;
                }
                return;
            }
            viewGroup.setVisibility(0);
            r3.A0a();
            this.A0A.setImportantForAccessibility(4);
            2eQ.A05(viewGroup, 1000);
        }
    }

    public final void A05(boolean z) {
        C19702We4 we4 = this.A0F;
        if (we4 != null) {
            we4.A03(z, 0.0f);
        }
        06N r1 = this.A0D;
        if (r1 != null) {
            this.A0E.A0q(r1);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0028, code lost:
        r6 = r8.A0F;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A06(boolean r9) {
        /*
            r8 = this;
            X.0hq r1 = r8.A0E
            r0 = 2131433135(0x7f0b16af, float:1.8488047E38)
            androidx.fragment.app.Fragment r1 = r1.A0P(r0)
            boolean r0 = r1 instanceof X.AnonymousClass4DR
            r4 = 1
            if (r0 == 0) goto L_0x0017
            X.4DR r1 = (X.AnonymousClass4DR) r1
            boolean r0 = r1.onBackPressed()
            if (r0 == 0) goto L_0x0017
            return r4
        L_0x0017:
            com.instagram.common.session.UserSession r3 = r8.A0I
            X.0Tu r2 = X.0Tu.A05
            r0 = 36322306494375997(0x810af20005283d, double:3.033711113007579E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            r3 = 0
            r5 = 0
            if (r0 == 0) goto L_0x004d
            X.We4 r6 = r8.A0F
            X.2cs r7 = r6.A03
            if (r7 == 0) goto L_0x0044
            double r0 = r7.A01
            float r2 = (float) r0
            int r0 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r0 != 0) goto L_0x004d
            X.2ct r0 = r7.A09
            double r1 = r0.A00
            float r0 = (float) r1
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 != 0) goto L_0x004d
            boolean r0 = r7.A0C()
            if (r0 == 0) goto L_0x004d
        L_0x0044:
            r6.A03(r3, r5)
            X.2it r0 = r8.A0G
            r0.DAt()
            return r4
        L_0x004d:
            X.We4 r0 = r8.A0F
            X.2cs r0 = r0.A03
            if (r0 == 0) goto L_0x0060
            double r1 = r0.A01
            float r0 = (float) r1
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x0060
            if (r9 == 0) goto L_0x0060
            r8.A05(r4)
            return r4
        L_0x0060:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19140WMw.A06(boolean):boolean");
    }

    public final void configureActionBar(2da r1) {
    }

    public final void onBackStackChanged() {
    }

    public C19140WMw(View view, ViewGroup viewGroup, ViewGroup viewGroup2, 06N r11, 0hq r12, UserSession userSession, AnonymousClass8R7 r14, C227242it r15, float f, float f2, boolean z) {
        this.A0A = view;
        this.A0E = r12;
        this.A0D = r11;
        this.A0C = viewGroup;
        this.A0B = viewGroup2;
        this.A0G = r15;
        this.A01 = f;
        this.A0I = userSession;
        this.A09 = f2;
        this.A0H = z;
        this.A06 = view.getOutlineProvider();
        this.A08 = view.getClipToOutline();
        Context context = viewGroup.getContext();
        C19702We4 we4 = new C19702We4(context, viewGroup2, viewGroup, r14, this);
        we4.A07 = true;
        2cs r1 = we4.A03;
        if (r1 != null) {
            r1.A06 = true;
        }
        C71392co r0 = A0J;
        if (r1 != null) {
            r1.A09(r0);
        }
        this.A0F = we4;
        WC3.A00(viewGroup, 16, this);
        r12.A0s(this);
    }

    public final void DMr(int i, boolean z) {
    }
}
