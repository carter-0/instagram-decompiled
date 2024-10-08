package X;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;

/* renamed from: X.388  reason: invalid class name */
public final class AnonymousClass388 {
    public View.OnClickListener A00;
    public View A01;
    public IgTextView A02;
    public boolean A03;
    public final View A04;
    public final ViewStub A05;
    public final UserSession A06;
    public final Integer A07;
    public final AnonymousClass0eM A08;
    public final C62320sa A09;
    public final Activity A0A;
    public final 1Av A0B;
    public final C62320sa A0C;

    /* JADX WARNING: Removed duplicated region for block: B:43:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0103  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x012b  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x016b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(java.lang.CharSequence r9, boolean r10) {
        /*
            r8 = this;
            boolean r0 = r8.A03
            if (r0 != 0) goto L_0x0045
            if (r10 == 0) goto L_0x0173
            com.instagram.common.session.UserSession r3 = r8.A06
            X.0Tu r2 = X.0Tu.A05
            r0 = 36324694496325886(0x810d1e000730fe, double:3.0352212950564007E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x0026
            android.view.ViewStub r0 = r8.A05
            android.view.View r1 = r0.inflate()
            r0 = 2131437280(0x7f0b26e0, float:1.8496454E38)
            android.view.View r0 = r1.findViewById(r0)
            com.instagram.common.ui.base.IgTextView r0 = (com.instagram.common.ui.base.IgTextView) r0
            r8.A02 = r0
        L_0x0026:
            X.0sa r0 = r8.A09
            java.lang.Object r0 = r0.invoke()
            android.view.View r0 = (android.view.View) r0
            r8.A01 = r0
            com.instagram.common.ui.base.IgTextView r1 = r8.A02
            if (r1 == 0) goto L_0x0039
            r0 = 8
            r1.setVisibility(r0)
        L_0x0039:
            com.instagram.common.ui.base.IgTextView r1 = r8.A02
            if (r1 == 0) goto L_0x0042
            android.view.View$OnClickListener r0 = r8.A00
            X.AnonymousClass0fU.A00(r0, r1)
        L_0x0042:
            r0 = 1
            r8.A03 = r0
        L_0x0045:
            com.instagram.common.ui.base.IgTextView r1 = r8.A02
            r4 = 0
            if (r1 == 0) goto L_0x0052
            r0 = 8
            if (r10 == 0) goto L_0x004f
            r0 = 0
        L_0x004f:
            r1.setVisibility(r0)
        L_0x0052:
            com.instagram.common.ui.base.IgTextView r0 = r8.A02
            if (r0 == 0) goto L_0x0059
            r0.setText(r9)
        L_0x0059:
            java.lang.Integer r2 = r8.A07
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r2 != r0) goto L_0x00e0
            r7 = 0
        L_0x0060:
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            r1 = 0
            if (r2 != r0) goto L_0x00de
            com.instagram.common.session.UserSession r5 = r8.A06
            X.0Tu r0 = X.0Tu.A06
            r2 = 36319136808180665(0x81081000001bb9, double:3.031706590694349E-306)
            boolean r0 = X.182.A06(r0, r5, r2)
            if (r0 == 0) goto L_0x00de
            android.view.View r0 = r8.A01
            java.lang.String r5 = "actionBarContainer"
            if (r0 == 0) goto L_0x00d4
            android.view.ViewGroup r2 = X.C3019160o.A01(r0)
            r0 = 2131431797(0x7f0b1175, float:1.8485333E38)
            android.view.View r3 = r2.findViewById(r0)
            if (r3 == 0) goto L_0x00de
            int r2 = r3.getVisibility()
            r0 = 8
            if (r2 == r0) goto L_0x00de
            r0 = -2
            r3.measure(r0, r0)
            int r2 = r3.getMeasuredHeight()
            if (r10 == 0) goto L_0x00a5
            X.0eM r0 = r8.A08
            java.lang.Object r0 = r0.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            int r1 = r0.intValue()
        L_0x00a5:
            android.view.View r0 = r8.A01
            if (r0 == 0) goto L_0x00d4
            A00(r0, r1)
            int r1 = r1 + r7
            A00(r3, r1)
            android.view.View r0 = r8.A04
            int r1 = r1 + r2
            A00(r0, r1)
            r0 = 1
        L_0x00b7:
            r6 = 0
            if (r0 != 0) goto L_0x00ff
            android.view.View r1 = r8.A04
            if (r10 == 0) goto L_0x00dc
            X.0eM r0 = r8.A08
            java.lang.Object r0 = r0.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            int r0 = r0 + r7
        L_0x00cb:
            A00(r1, r0)
            android.view.View r1 = r8.A01
            if (r1 != 0) goto L_0x00ee
            java.lang.String r5 = "actionBarContainer"
        L_0x00d4:
            X.0qQ.A0F(r5)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x00dc:
            r0 = r7
            goto L_0x00cb
        L_0x00de:
            r0 = 0
            goto L_0x00b7
        L_0x00e0:
            X.0sa r0 = r8.A0C
            java.lang.Object r0 = r0.invoke()
            java.lang.Number r0 = (java.lang.Number) r0
            int r7 = r0.intValue()
            goto L_0x0060
        L_0x00ee:
            if (r10 == 0) goto L_0x0171
            X.0eM r0 = r8.A08
            java.lang.Object r0 = r0.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
        L_0x00fc:
            A00(r1, r0)
        L_0x00ff:
            com.instagram.common.ui.base.IgTextView r3 = r8.A02
            if (r3 == 0) goto L_0x0129
            android.app.Activity r2 = r8.A0A
            android.content.res.Resources r1 = r2.getResources()
            r0 = 2131959909(0x7f132065, float:1.9556472E38)
            java.lang.String r1 = r1.getString(r0)
            X.0qQ.A07(r1)
            X.6jx r0 = new X.6jx
            r0.<init>((java.lang.CharSequence) r1)
            X.5Gt r1 = new X.5Gt
            r1.<init>(r2, r0)
            r1.A03(r3)
            X.2fy r0 = X.C226262fy.BELOW_ANCHOR
            r1.A06(r0)
            X.5Gv r6 = r1.A00()
        L_0x0129:
            if (r10 == 0) goto L_0x016b
            com.instagram.common.session.UserSession r5 = r8.A06
            X.0Tu r2 = X.0Tu.A05
            r0 = 36314919150619544(0x81043a00050b98, double:3.029039327069552E-306)
            boolean r0 = X.182.A06(r2, r5, r0)
            if (r0 == 0) goto L_0x015f
            X.1Av r4 = r8.A0B
            X.0s0 r3 = r4.A2L
            X.0YZ[] r2 = X.1Av.A8a
            r1 = 405(0x195, float:5.68E-43)
            r0 = r2[r1]
            java.lang.Object r0 = r3.CDM(r4, r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x015f
            if (r6 == 0) goto L_0x0155
            r6.A07(r5)
        L_0x0155:
            r0 = 1
            r1 = r2[r1]
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r3.Epx(r4, r0, r1)
        L_0x015f:
            X.0eM r0 = r8.A08
            java.lang.Object r0 = r0.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            r0.intValue()
            return
        L_0x016b:
            if (r6 == 0) goto L_0x015f
            r6.A08(r4)
            goto L_0x015f
        L_0x0171:
            r0 = 0
            goto L_0x00fc
        L_0x0173:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass388.A01(java.lang.CharSequence, boolean):void");
    }

    public AnonymousClass388(Activity activity, View view, ViewStub viewStub, UserSession userSession, Integer num, C62320sa r9, C62320sa r10) {
        IgTextView igTextView;
        this.A06 = userSession;
        this.A0A = activity;
        this.A04 = view;
        this.A05 = viewStub;
        this.A09 = r9;
        this.A0C = r10;
        this.A07 = num;
        if (!182.A06(0Tu.A05, userSession, 36324694496325886L)) {
            igTextView = (IgTextView) viewStub.inflate().findViewById(R.id.ongoing_call_notification_bar);
        } else {
            igTextView = null;
        }
        this.A02 = igTextView;
        this.A0B = 1Au.A00(userSession);
        this.A08 = AnonymousClass1YB.A00(new AnonymousClass9LX(this, 39));
    }

    public static final void A00(View view, int i) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null && marginLayoutParams.topMargin != i) {
            marginLayoutParams.topMargin = i;
            view.setLayoutParams(marginLayoutParams);
        }
    }
}
