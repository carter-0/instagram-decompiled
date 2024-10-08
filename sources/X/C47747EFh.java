package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;

/* renamed from: X.EFh  reason: case insensitive filesystem */
public final class C47747EFh extends C232222tE {
    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        0qQ.A0B(viewGroup, 0);
        return new C46974DoS(F8B.A00(viewGroup));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0017, code lost:
        if (r2.length() == 0) goto L_0x0019;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void bind(X.C232262tL r9, X.C249703kE r10) {
        /*
            r8 = this;
            X.DtW r9 = (X.C47245DtW) r9
            X.DoS r10 = (X.C46974DoS) r10
            r6 = 0
            if (r10 == 0) goto L_0x00cf
            X.F03 r4 = r10.A02
        L_0x0009:
            if (r9 == 0) goto L_0x00d5
            if (r4 == 0) goto L_0x00d5
            java.lang.String r2 = r9.A04
            r5 = 0
            if (r2 == 0) goto L_0x0019
            int r1 = r2.length()
            r0 = 0
            if (r1 != 0) goto L_0x001a
        L_0x0019:
            r0 = 1
        L_0x001a:
            r7 = 8
            android.widget.TextView r1 = r4.A03
            if (r0 == 0) goto L_0x00c0
            java.lang.String r3 = r9.A06
            r1.setText(r3)
            android.widget.TextView r0 = r4.A04
            r0.setVisibility(r7)
        L_0x002a:
            boolean r0 = r9.A07
            X.C244273av.A0B(r1, r0)
            java.lang.String r2 = r9.A05
            if (r2 == 0) goto L_0x0038
            android.widget.TextView r0 = r4.A02
            r0.setText(r2)
        L_0x0038:
            android.widget.TextView r1 = r4.A02
            if (r2 == 0) goto L_0x0043
            int r0 = r2.length()
            if (r0 == 0) goto L_0x0043
            r7 = 0
        L_0x0043:
            r1.setVisibility(r7)
            com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView r2 = r4.A01
            com.instagram.common.typedurl.ImageUrl r1 = r9.A02
            X.FUE r0 = new X.FUE
            r0.<init>()
            r2.A0F(r6, r0, r1)
            android.content.Context r6 = r2.getContext()
            int r1 = X.Dbb.A01(r6)
            android.view.ViewGroup$LayoutParams r0 = r2.getLayoutParams()
            r0.height = r1
            android.view.ViewGroup$LayoutParams r0 = r2.getLayoutParams()
            r0.width = r1
            r2.A0B(r1, r5)
            r2.A06()
            android.view.ViewGroup r4 = r4.A00
            android.view.ViewGroup$LayoutParams r2 = r4.getLayoutParams()
            android.content.res.Resources r1 = r6.getResources()
            r0 = 2131165235(0x7f070033, float:1.7944681E38)
            X.DbT.A1B(r1, r2, r0)
            X.2eb r0 = r10.A01
            android.view.View r1 = r0.A01()
            X.0qQ.A07(r1)
            android.widget.CompoundButton r1 = (android.widget.CompoundButton) r1
            boolean r0 = r9.A01
            r1.setChecked(r0)
            r0 = 14
            X.FPG.A00(r4, r0, r1, r9)
            X.Exx r0 = r9.A03
            int r1 = r9.A00
            X.0qQ.A0B(r3, r5)
            X.E7Q r2 = r0.A00
            java.util.HashSet r0 = r2.A0P
            boolean r0 = r0.add(r3)
            if (r0 == 0) goto L_0x00d5
            java.util.HashMap r0 = r2.A0N
            java.lang.Object r0 = r0.get(r3)
            X.Dt4 r0 = (X.C47217Dt4) r0
            if (r0 == 0) goto L_0x00d5
            X.6KM r1 = X.E7Q.A00(r0, r1)
            if (r1 == 0) goto L_0x00d5
            X.2om r0 = r2.A0C
            if (r0 != 0) goto L_0x00d2
            java.lang.String r0 = "recommendedUserLogger"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x00c0:
            r1.setText(r2)
            android.widget.TextView r0 = r4.A04
            java.lang.String r3 = r9.A06
            r0.setText(r3)
            r0.setVisibility(r5)
            goto L_0x002a
        L_0x00cf:
            r4 = r6
            goto L_0x0009
        L_0x00d2:
            X.DbV.A1T(r1, r0)
        L_0x00d5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47747EFh.bind(X.2tL, X.3kE):void");
    }

    public final Class modelClass() {
        return C47245DtW.class;
    }
}
