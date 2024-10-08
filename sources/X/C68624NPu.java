package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.NPu  reason: case insensitive filesystem */
public final class C68624NPu extends C232232tF {
    public final AnonymousClass0iw A00;
    public final UserSession A01;
    public final O6K A02;

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AnonymousClass7TF.A1H(viewGroup, layoutInflater);
        return new C67994MyM(DbT.A0D(layoutInflater, viewGroup, R.layout.direct_channel_discovery_row_item, false));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x00a7, code lost:
        if (r7 != null) goto L_0x00a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0049, code lost:
        if (r7.isEmpty() != false) goto L_0x004b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void bind(X.C232262tL r19, X.C249703kE r20) {
        /*
            r18 = this;
            r4 = r20
            r3 = r19
            X.N65 r3 = (X.N65) r3
            X.MyM r4 = (X.C67994MyM) r4
            r11 = 0
            boolean r8 = X.AnonymousClass7TF.A1U(r11, r3, r4)
            android.widget.TextView r1 = r4.A01
            java.lang.String r0 = r3.A08
            r1.setText(r0)
            android.widget.TextView r5 = r4.A00
            android.content.Context r12 = X.AnonymousClass7TE.A0S(r5)
            r0 = 2131959344(0x7f131e30, float:1.9555326E38)
            java.lang.String r1 = r12.getString(r0)
            java.lang.String r0 = " • "
            java.lang.String r14 = r3.A04
            java.lang.String r6 = X.002.A0g(r1, r0, r14)
            X.0qQ.A07(r6)
            r2 = r18
            com.instagram.common.session.UserSession r13 = r2.A01
            java.lang.String r15 = r3.A06
            int r1 = r3.A00
            boolean r0 = r3.A09
            r17 = r0
            r16 = r1
            java.util.List r7 = X.OP7.A01(r12, r13, r14, r15, r16, r17)
            java.lang.CharSequence r0 = X.C69914NuG.A00(r12, r6, r14, r0)
            if (r7 == 0) goto L_0x004b
            boolean r1 = r7.isEmpty()
            r6 = 0
            if (r1 == 0) goto L_0x004c
        L_0x004b:
            r6 = 1
        L_0x004c:
            java.lang.String r1 = "Required value was null."
            if (r6 != 0) goto L_0x00a7
            if (r7 == 0) goto L_0x00cc
            int r1 = r7.size()
            if (r1 <= r8) goto L_0x00a9
            r0 = 4
            r5.setVisibility(r0)
            X.PYT r0 = new X.PYT
            r0.<init>(r5, r7)
            r5.post(r0)
        L_0x0064:
            com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView r5 = r4.A03
            java.lang.String r0 = r3.A05
            com.instagram.common.typedurl.SimpleImageUrl r1 = X.DbS.A0V(r0)
            X.0iw r0 = r2.A00
            r9 = 0
            r5.A0F(r9, r0, r1)
            r5.setGradientSpinnerVisible(r11)
            r5.setGradientSpinnerActivated(r11)
            android.view.View r1 = r4.itemView
            r0 = 31
            X.C71405Ok4.A01(r1, r0, r3, r2)
            X.Odl r4 = X.OPT.A00(r13)
            java.lang.String r6 = r3.A07
            java.lang.Integer r2 = r3.A03
            int r1 = r3.A01
            X.NkE r0 = r3.A02
            X.AnonymousClass7TF.A1C(r6, r11, r0)
            java.lang.String r7 = X.C71140Odl.A02(r2)
            java.lang.Long r5 = X.DbS.A0j(r1)
            java.lang.String r1 = "current_filter"
            java.util.HashMap r10 = X.AnonymousClass7TE.A1E()
            java.lang.String r0 = r0.A03
            r10.put(r1, r0)
            java.lang.String r8 = "inbox_directory_sheet"
            X.C71140Odl.A06(r4, r5, r6, r7, r8, r9, r10, r11)
            return
        L_0x00a7:
            if (r7 == 0) goto L_0x00b5
        L_0x00a9:
            boolean r1 = r7.isEmpty()
            if (r1 != 0) goto L_0x00b5
            java.lang.Object r0 = r7.get(r11)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
        L_0x00b5:
            int r1 = r0.length()
            if (r1 != 0) goto L_0x00c1
            r0 = 8
            r5.setVisibility(r0)
            goto L_0x0064
        L_0x00c1:
            r5.setVisibility(r11)
            r5.setText(r0)
            r0 = 0
            r5.setCompoundDrawables(r0, r0, r0, r0)
            goto L_0x0064
        L_0x00cc:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C68624NPu.bind(X.2tL, X.3kE):void");
    }

    public final Class modelClass() {
        return N65.class;
    }

    public C68624NPu(AnonymousClass0iw r1, UserSession userSession, O6K o6k) {
        AnonymousClass7TG.A1P(userSession, o6k);
        this.A01 = userSession;
        this.A00 = r1;
        this.A02 = o6k;
    }
}
