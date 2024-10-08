package X;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.common.draggableview.DraggableViewContainer;
import com.instagram.android.R;

public final class PML implements C74361Ptb {
    public C62320sa A00;
    public boolean A01;
    public final View A02;
    public final ViewGroup A03;
    public final C74291PsJ A04;
    public final C74291PsJ A05;
    public final AnonymousClass0iw A06;
    public final 2el A07;
    public final C70525O9y A08;
    public final C70526O9z A09;
    public final AnonymousClass0eM A0A = C73894PlV.A00(this, 33);
    public final AnonymousClass0eM A0B = C73894PlV.A00(this, 34);
    public final AnonymousClass0eM A0C = C73894PlV.A00(this, 35);
    public final AnonymousClass0eM A0D = C73894PlV.A00(this, 36);
    public final AnonymousClass0eM A0E = C73894PlV.A00(this, 37);
    public final AnonymousClass0eM A0F = C73894PlV.A00(this, 38);
    public final AnonymousClass0eM A0G = C73894PlV.A00(this, 39);
    public final AnonymousClass0eM A0H = C73894PlV.A00(this, 40);
    public final AnonymousClass0eM A0I = C73894PlV.A00(this, 41);
    public final C62320sa A0J;
    public final C62320sa A0K;
    public final C62320sa A0L;
    public final C62320sa A0M;
    public final 0sL A0N;
    public final 0sK A0O;
    public final boolean A0P;

    public PML(View view, ViewGroup viewGroup, C74291PsJ psJ, C74291PsJ psJ2, AnonymousClass0iw r6, 2el r7, C70525O9y o9y, C70526O9z o9z, C62320sa r10, C62320sa r11, C62320sa r12, C62320sa r13, 0sL r14, 0sK r15, boolean z) {
        DbW.A1P(viewGroup, 1, psJ);
        0qQ.A0B(psJ2, 14);
        this.A03 = viewGroup;
        this.A02 = view;
        this.A06 = r6;
        this.A0O = r15;
        this.A08 = o9y;
        this.A0J = r10;
        this.A0N = r14;
        this.A07 = r7;
        this.A09 = o9z;
        this.A0M = r11;
        this.A0L = r12;
        this.A04 = psJ;
        this.A0K = r13;
        this.A05 = psJ2;
        this.A0P = z;
    }

    public final void A00() {
        ViewGroup viewGroup = this.A03;
        AnonymousClass0eM r4 = this.A0A;
        if (viewGroup.indexOfChild(AnonymousClass7TE.A0c(r4)) != -1) {
            viewGroup.removeView(AnonymousClass7TE.A0c(r4));
            ViewGroup A0C2 = C66583MXo.A0C(r4);
            AnonymousClass0eM r2 = this.A0E;
            if (A0C2.indexOfChild(AnonymousClass7TE.A0c(r2)) != -1) {
                C66583MXo.A0C(r4).removeView(AnonymousClass7TE.A0c(r2));
            }
            AnonymousClass7TE.A0c(r2).setBackground((Drawable) null);
            C66583MXo.A0C(this.A0B).addView(AnonymousClass7TE.A0c(r2));
        }
    }

    public final boolean A02() {
        AnonymousClass0eM r2 = this.A0A;
        if (!r2.CVQ() || this.A03.indexOfChild(AnonymousClass7TE.A0c(r2)) == -1) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void ADN(X.C74270Pry r19) {
        /*
            r18 = this;
            r6 = r19
            X.N9h r6 = (X.C68294N9h) r6
            r3 = 0
            X.0qQ.A0B(r6, r3)
            r5 = r18
            X.0eM r7 = r5.A0E
            android.view.View r1 = X.AnonymousClass7TE.A0c(r7)
            boolean r0 = r6.A0A
            int r0 = X.DbW.A01(r0)
            r1.setVisibility(r0)
            boolean r1 = r6.A07
            boolean r0 = r5.A01
            if (r0 == r1) goto L_0x0086
            r5.A01 = r1
            X.0eM r2 = r5.A0I
            java.lang.Object r0 = r2.getValue()
            if (r1 == 0) goto L_0x0062
            if (r0 == 0) goto L_0x0086
            java.lang.Object r0 = r2.getValue()
            X.Ozd r0 = (X.C72268Ozd) r0
            if (r0 == 0) goto L_0x0035
            r0.A00 = r3
        L_0x0035:
            X.2el r4 = r5.A07
            r0 = 0
            X.30a r1 = X.AnonymousClass30Y.A00(r0, r0, r0)
            java.lang.Object r0 = r2.getValue()
            X.Ozd r0 = (X.C72268Ozd) r0
            X.30Y r2 = X.DbU.A0a(r0, r1)
            java.lang.Object r1 = r7.getValue()
            com.facebook.rtc.views.omnigridview.OmniGridView r1 = (com.facebook.rtc.views.omnigridview.OmniGridView) r1
            X.NE9 r0 = r1.A05
            if (r0 != 0) goto L_0x005a
            java.lang.String r0 = "gridSelfItemDefinition"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x005a:
            android.view.View r0 = r0.A01(r1, r1)
            r4.A05(r0, r2)
            goto L_0x0086
        L_0x0062:
            if (r0 == 0) goto L_0x0086
            java.lang.Object r1 = r2.getValue()
            X.Ozd r1 = (X.C72268Ozd) r1
            if (r1 == 0) goto L_0x0079
            r0 = 1
            r1.A00 = r0
            X.0eM r0 = r1.A02
            android.os.Handler r1 = X.JTO.A0E(r0)
            r0 = 0
            r1.removeCallbacksAndMessages(r0)
        L_0x0079:
            X.2el r1 = r5.A07
            java.lang.Object r0 = r7.getValue()
            com.facebook.rtc.views.omnigridview.OmniGridView r0 = (com.facebook.rtc.views.omnigridview.OmniGridView) r0
            android.view.View r0 = r0.A01
            r1.A04(r0)
        L_0x0086:
            boolean r0 = r6.A05
            r4 = 0
            if (r0 != 0) goto L_0x00fa
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            java.lang.Integer r15 = java.lang.Integer.valueOf(r0)
        L_0x0091:
            java.util.List r10 = r6.A03
        L_0x0093:
            X.JVf r12 = r6.A00
            if (r12 == 0) goto L_0x0172
            X.N3V r14 = r6.A01
            if (r14 == 0) goto L_0x0172
            boolean r9 = r6.A09
            java.util.List r1 = r6.A02
            boolean r0 = X.AnonymousClass7TE.A1b(r1)
            if (r0 == 0) goto L_0x00d1
            X.JwM r13 = new X.JwM
            r13.<init>((java.util.List) r1)
        L_0x00aa:
            java.lang.Object r2 = r7.getValue()
            com.facebook.rtc.views.omnigridview.OmniGridView r2 = (com.facebook.rtc.views.omnigridview.OmniGridView) r2
            if (r9 == 0) goto L_0x0109
            java.util.ArrayList r7 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r9 = r10.iterator()
        L_0x00ba:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x010a
            java.lang.Object r8 = r9.next()
            r0 = r8
            X.N3g r0 = (X.C68166N3g) r0
            com.facebook.rtc.views.omnigrid.GridItemType r1 = r0.A03
            com.facebook.rtc.views.omnigrid.GridItemType r0 = com.facebook.rtc.views.omnigrid.GridItemType.SELF_VIEW
            if (r1 != r0) goto L_0x00ba
            r7.add(r8)
            goto L_0x00ba
        L_0x00d1:
            if (r9 == 0) goto L_0x00f8
            java.util.ArrayList r8 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r11 = r10.iterator()
        L_0x00db:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x00f2
            java.lang.Object r2 = r11.next()
            r0 = r2
            X.N3g r0 = (X.C68166N3g) r0
            com.facebook.rtc.views.omnigrid.GridItemType r1 = r0.A03
            com.facebook.rtc.views.omnigrid.GridItemType r0 = com.facebook.rtc.views.omnigrid.GridItemType.SELF_VIEW
            if (r1 == r0) goto L_0x00db
            r8.add(r2)
            goto L_0x00db
        L_0x00f2:
            X.JwM r13 = new X.JwM
            r13.<init>((java.util.List) r8)
            goto L_0x00aa
        L_0x00f8:
            r13 = r4
            goto L_0x00aa
        L_0x00fa:
            r15 = r4
            java.util.List r2 = r6.A03
            int r1 = r2.size()
            r0 = 6
            if (r1 <= r0) goto L_0x0091
            java.util.List r10 = r2.subList(r3, r0)
            goto L_0x0093
        L_0x0109:
            r7 = r10
        L_0x010a:
            java.util.Map r0 = r6.A04
            X.Jvx r11 = new X.Jvx
            r16 = r7
            r17 = r0
            r11.<init>((X.C59721JVf) r12, (X.C61084JwM) r13, (X.N3V) r14, (java.lang.Integer) r15, (java.util.List) r16, (java.util.Map) r17)
            boolean r0 = r6.A06
            r2.A05(r11, r0)
            boolean r0 = r6.A08
            if (r0 == 0) goto L_0x013f
            X.0eM r4 = r5.A0F
            X.DbW.A1R(r4, r3)
            X.0sa r0 = r5.A0K
            r5.A00 = r0
            android.view.View r3 = X.AnonymousClass7TE.A0c(r4)
            X.PXT r2 = new X.PXT
            r2.<init>(r0)
            r0 = 4000(0xfa0, double:1.9763E-320)
            r3.postDelayed(r2, r0)
            android.view.View r1 = X.AnonymousClass7TE.A0c(r4)
            r0 = 48
            X.C71396Ojv.A00(r1, r0, r5)
            return
        L_0x013f:
            X.0eM r0 = r5.A0G
            java.lang.Object r0 = r0.getValue()
            X.3oV r0 = (X.C252063oV) r0
            boolean r0 = r0.CVM()
            if (r0 == 0) goto L_0x0172
            X.0eM r3 = r5.A0F
            java.lang.Object r0 = r3.getValue()
            X.C51969G9p.A1M(r0)
            android.view.View r2 = X.AnonymousClass7TE.A0c(r3)
            X.0sa r1 = r5.A00
            if (r1 == 0) goto L_0x0170
            X.PXT r0 = new X.PXT
            r0.<init>(r1)
        L_0x0163:
            r2.removeCallbacks(r0)
            r5.A00 = r4
            android.view.View r0 = X.AnonymousClass7TE.A0c(r3)
            r0.setOnClickListener(r4)
            return
        L_0x0170:
            r0 = r4
            goto L_0x0163
        L_0x0172:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.PML.ADN(X.Pry):void");
    }

    public final void A01(int i, int i2) {
        AnonymousClass0eM r1 = this.A0H;
        int dimensionPixelSize = ((Resources) r1.getValue()).getDimensionPixelSize(R.dimen.abc_select_dialog_padding_start_material);
        int dimensionPixelSize2 = ((Resources) r1.getValue()).getDimensionPixelSize(R.dimen.abc_select_dialog_padding_start_material);
        int dimensionPixelSize3 = ((Resources) r1.getValue()).getDimensionPixelSize(R.dimen.abc_edit_text_inset_top_material);
        ((DraggableViewContainer) this.A0A.getValue()).A0A(AnonymousClass7TE.A0c(this.A0E), (C69292Nis) null, (C15048ULb) null, DbX.A07(this.A0D), DbX.A07(this.A0C), dimensionPixelSize, i + dimensionPixelSize3, dimensionPixelSize2, i2 + dimensionPixelSize3, true);
    }
}
