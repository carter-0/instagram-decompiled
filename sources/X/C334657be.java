package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.PopupWindow;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.roundedcornerlayout.RoundedCornerFrameLayout;

/* renamed from: X.7be  reason: invalid class name and case insensitive filesystem */
public final class C334657be {
    public float A00;
    public A64 A01;
    public C355148Ov A02;
    public C62320sa A03 = C334667bf.A00;
    public final C52971GgO A04;
    public final UserSession A05;

    public C334657be(C52971GgO ggO, UserSession userSession) {
        0qQ.A0B(userSession, 1);
        0qQ.A0B(ggO, 2);
        this.A05 = userSession;
        this.A04 = ggO;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0050, code lost:
        if (r0.A0d != true) goto L_0x0052;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0034, code lost:
        if (r0.A0d != true) goto L_0x0036;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0042, code lost:
        if (r0.A0d != true) goto L_0x0044;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(X.C335907dj r14, X.A64 r15, X.C334657be r16, X.C334297b2 r17, com.instagram.common.session.UserSession r18) {
        /*
            r9 = 0
            r10 = 0
            r0 = -1025(0xfffffffffffffbff, float:NaN)
            X.7dj r4 = X.C335907dj.A00((X.C335867df) null, r14, (X.C337227fv) null, (X.C335857de) null, r9, (X.C337207ft) null, (X.C337217fu) null, (java.lang.Boolean) null, (java.lang.Boolean) null, (java.lang.Integer) null, (java.lang.Integer) null, (java.lang.Long) null, (java.lang.String) null, (java.lang.String) null, (java.util.List) null, r0, 65535, false, false, false, false, false, false, false, false)
            r1 = r15
            android.view.View r0 = r15.A00
            android.content.Context r2 = r0.getContext()
            X.0qQ.A07(r2)
            java.lang.Class<android.app.Activity> r0 = android.app.Activity.class
            android.content.Context r3 = X.C334957c9.A00(r2, r0)
            android.app.Activity r3 = (android.app.Activity) r3
            r0 = r16
            X.GgO r7 = r0.A04
            X.7a5 r0 = r7.A0B
            X.0Ud r2 = r0.A03
            java.lang.Object r5 = r2.getValue()
            X.7a7 r5 = (X.C333777a7) r5
            java.lang.Object r0 = r2.getValue()
            X.7a7 r0 = (X.C333777a7) r0
            r15 = 1
            if (r0 == 0) goto L_0x0036
            boolean r0 = r0.A0d
            r12 = 1
            if (r0 == r15) goto L_0x0037
        L_0x0036:
            r12 = 0
        L_0x0037:
            java.lang.Object r0 = r2.getValue()
            X.7a7 r0 = (X.C333777a7) r0
            if (r0 == 0) goto L_0x0044
            boolean r0 = r0.A0d
            r13 = 1
            if (r0 == r15) goto L_0x0045
        L_0x0044:
            r13 = 0
        L_0x0045:
            java.lang.Object r0 = r2.getValue()
            X.7a7 r0 = (X.C333777a7) r0
            if (r0 == 0) goto L_0x0052
            boolean r0 = r0.A0d
            r14 = 1
            if (r0 == r15) goto L_0x0053
        L_0x0052:
            r14 = 0
        L_0x0053:
            X.7hK r2 = new X.7hK
            r6 = r17
            r8 = r18
            r11 = r10
            r16 = r10
            r17 = r10
            r18 = r10
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            com.facebook.litho.LithoView r0 = r1.A01
            r0.setComponent(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C334657be.A01(X.7dj, X.A64, X.7be, X.7b2, com.instagram.common.session.UserSession):void");
    }

    public final void A03(AnonymousClass4DH r6) {
        0qQ.A0B(r6, 0);
        A64 a64 = this.A01;
        if (a64 != null) {
            C355148Ov r1 = this.A02;
            if (r1 != null) {
                r1.setOnDismissListener(new APK(this));
            }
            C355148Ov r4 = this.A02;
            if (r4 != null) {
                r4.showAsDropDown(a64.A01, (int) 0nA.A04(r6.requireContext(), 6), (int) 0nA.A04(r6.requireContext(), 12));
            }
        }
    }

    public static final C14090Tph A00(View view, C62320sa r4, float f) {
        C14090Tph tph = new C14090Tph(C14001To3.A0I, view, f);
        C14002To4 to4 = tph.A01;
        to4.A02(400.0f);
        to4.A01(0.5f);
        tph.A05(new APT(r4));
        return tph;
    }

    public static final void A02(C334657be r6, boolean z) {
        C355148Ov r0 = r6.A02;
        if (r0 != null) {
            r0.setOnDismissListener((PopupWindow.OnDismissListener) null);
        }
        C355148Ov r02 = r6.A02;
        if (r02 != null) {
            r02.dismiss();
        }
        C52971GgO ggO = r6.A04;
        ggO.A0A.A0D();
        if (!ggO.A02) {
            I21 i21 = I21.A00;
            UserSession userSession = ggO.A0E;
            02m r2 = 02m.A0p;
            0qQ.A07(r2);
            r2.markerPoint(309476254, 002.A0O(AnonymousClass000.A00(3941), 1));
            i21.A00(userSession);
        }
        A64 a64 = r6.A01;
        if (a64 != null) {
            C58188Ins ins = new C58188Ins(36, a64, r6);
            RoundedCornerFrameLayout roundedCornerFrameLayout = a64.A02;
            if (roundedCornerFrameLayout.getTranslationY() == r6.A00 || !z) {
                ins.invoke();
                return;
            }
            a64.A00.setBackground((Drawable) null);
            A00(roundedCornerFrameLayout, ins, r6.A00).A02();
        }
    }
}
