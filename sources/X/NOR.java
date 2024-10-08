package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

public final class NOR extends C232222tE {
    public final AnonymousClass0iw A00;
    public final C74461PvG A01;
    public final UserSession A02;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: android.text.SpannableStringBuilder} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v11, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v12, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void bind(X.C232262tL r9, X.C249703kE r10) {
        /*
            r8 = this;
            X.Otp r9 = (X.C71964Otp) r9
            X.Mz0 r10 = (X.C68034Mz0) r10
            boolean r5 = X.AnonymousClass7TG.A1Z(r9, r10)
            X.0iw r6 = r8.A00
            r0 = 3
            X.0qQ.A0B(r6, r0)
            X.47o r4 = r9.A00
            java.lang.String r1 = r4.B9y()
            r3 = 0
            com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView r2 = r10.A06
            java.lang.String r0 = r4.B9z()
            if (r1 != 0) goto L_0x00b7
            com.instagram.common.typedurl.SimpleImageUrl r0 = X.DbS.A0V(r0)
            r2.A0F(r3, r6, r0)
        L_0x0024:
            r3 = 0
            r2.setGradientSpinnerVisible(r3)
            java.lang.Integer r0 = r4.C6b()
            r7 = 1
            if (r0 == 0) goto L_0x00b5
            int r1 = r0.intValue()
            r0 = 29
            if (r1 != r0) goto L_0x00b5
            X.47m r0 = r4.AsV()
            if (r0 == 0) goto L_0x00b5
            int r1 = r0.AdN()
            r0 = 2
            if (r1 != r0) goto L_0x00b5
        L_0x0044:
            com.instagram.common.ui.base.IgTextView r6 = r10.A05
            if (r7 == 0) goto L_0x00b0
            java.lang.String r0 = r4.getTitle()
            android.text.SpannableStringBuilder r1 = X.DbS.A0C(r0)
            android.content.Context r0 = X.AnonymousClass7TE.A0S(r6)
            X.F5q.A01(r0, r1, r3, r5, r3)
        L_0x0057:
            X.DbZ.A14(r6, r1)
            com.instagram.common.ui.base.IgTextView r1 = r10.A04
            java.lang.String r0 = r4.getSubtitle()
            r1.setText(r0)
            boolean r6 = r9.A01
            com.instagram.common.ui.base.IgSimpleImageView r5 = r10.A03
            android.content.Context r1 = r10.A00
            if (r6 == 0) goto L_0x00a6
            r0 = 2131238617(0x7f081ed9, float:1.8093518E38)
            X.DbU.A13(r1, r5, r0)
            r0 = 2130970165(0x7f040635, float:1.7549032E38)
        L_0x0074:
            int r0 = X.2Yu.A0H(r1, r0)
            X.DbU.A14(r1, r5, r0)
            r5.setSelected(r6)
            java.lang.Integer r0 = r4.BXU()
            if (r0 == 0) goto L_0x009e
            int r1 = r0.intValue()
            r0 = 250(0xfa, float:3.5E-43)
            if (r1 < r0) goto L_0x009e
            r0 = 4
            r5.setVisibility(r0)
            r0 = 1050253722(0x3e99999a, float:0.3)
        L_0x0093:
            r2.setAlpha(r0)
            android.view.View r1 = r10.A01
            r0 = 56
            X.C71408Ok7.A00(r1, r0, r8, r9)
            return
        L_0x009e:
            r5.setVisibility(r3)
            android.view.View r2 = r10.A02
            r0 = 1065353216(0x3f800000, float:1.0)
            goto L_0x0093
        L_0x00a6:
            r0 = 2131240242(0x7f082532, float:1.8096814E38)
            X.DbU.A13(r1, r5, r0)
            r0 = 2130970330(0x7f0406da, float:1.7549367E38)
            goto L_0x0074
        L_0x00b0:
            java.lang.String r1 = r4.getTitle()
            goto L_0x0057
        L_0x00b5:
            r7 = 0
            goto L_0x0044
        L_0x00b7:
            com.instagram.common.typedurl.SimpleImageUrl r1 = X.DbS.A0V(r0)
            java.lang.String r0 = r4.B9y()
            com.instagram.common.typedurl.SimpleImageUrl r0 = X.DbS.A0V(r0)
            r2.A0G(r3, r6, r1, r0)
            goto L_0x0024
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NOR.bind(X.2tL, X.3kE):void");
    }

    public final Class modelClass() {
        return C71964Otp.class;
    }

    public NOR(AnonymousClass0iw r1, UserSession userSession, C74461PvG pvG) {
        AnonymousClass7TG.A1P(pvG, userSession);
        this.A01 = pvG;
        this.A00 = r1;
        this.A02 = userSession;
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AnonymousClass7TG.A1N(viewGroup, layoutInflater);
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        return new C68034Mz0(DbT.A0D(layoutInflater, viewGroup, R.layout.existing_thread_row, false));
    }
}
