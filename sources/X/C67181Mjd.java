package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.Mjd  reason: case insensitive filesystem */
public final class C67181Mjd extends C232232tF {
    public final Context A00;
    public final AnonymousClass0iw A01;
    public final UserSession A02;
    public final C294875nB A03;

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        JTQ.A1L(viewGroup, layoutInflater);
        View A0D = DbT.A0D(layoutInflater, viewGroup, R.layout.direct_inbox_row_layout, false);
        UserSession userSession = this.A02;
        return new C67283MlI(A0D, (AnonymousClass34Y) null, 182.A06(DbS.A0J(userSession, 0), userSession, 36328431117483354L));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v6, resolved type: android.text.SpannableStringBuilder} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v7, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v8, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v9, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v10, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void bind(X.C232262tL r23, X.C249703kE r24) {
        /*
            r22 = this;
            r5 = r24
            r6 = r23
            X.N5p r6 = (X.C68200N5p) r6
            X.MlI r5 = (X.C67283MlI) r5
            r3 = 0
            boolean r2 = X.AnonymousClass7TF.A1U(r3, r6, r5)
            com.instagram.model.direct.DirectShareTarget r14 = r6.A01
            boolean r10 = r14.A0U
            java.lang.String r4 = X.DbT.A0y(r14)
            com.instagram.common.ui.base.IgTextView r1 = r5.A0A
            r1.setText(r4)
            android.content.Context r0 = r1.getContext()
            X.DbY.A12(r1, r0)
            r9 = 0
            r1.setTypeface(r9, r10)
            com.instagram.common.ui.base.IgTextView r8 = r5.A09
            java.util.List r0 = r14.A0Q
            int r0 = r0.size()
            r7 = r22
            if (r0 <= 0) goto L_0x0142
            com.instagram.pendingmedia.model.recipients.PendingRecipient r13 = X.DbY.A0W(r14, r3)
            android.content.Context r12 = r7.A00
            android.content.res.Resources r11 = r12.getResources()
            r1 = 2131959456(0x7f131ea0, float:1.9555553E38)
            java.lang.String r0 = r13.A0C
            java.lang.String r0 = X.AnonymousClass7TF.A0e(r11, r0, r1)
            android.text.SpannableStringBuilder r11 = X.DbS.A0C(r0)
            boolean r0 = r13.A0b
            if (r0 == 0) goto L_0x0065
            java.lang.String r0 = r13.A0C
            int r1 = X.00l.A08(r11, r0, r3, r3)
            r0 = -1
            if (r1 == r0) goto L_0x0065
            java.lang.String r0 = r13.A0C
            int r1 = X.00l.A08(r11, r0, r3, r3)
            java.lang.String r0 = r13.A0C
            int r0 = X.DbX.A05(r0)
            int r1 = r1 + r0
            X.C244273av.A04(r12, r11, r1)
        L_0x0065:
            r8.setText(r11)
            android.content.Context r1 = r8.getContext()
            if (r10 == 0) goto L_0x013c
            int r0 = X.2Yu.A07(r1)
        L_0x0072:
            X.DbT.A17(r1, r8, r0)
            r8.setTypeface(r9, r10)
            X.Mha r11 = r5.A0O
            com.instagram.direct.model.thread.CreatorBroadcastThreadInfo r0 = r14.A04
            if (r0 == 0) goto L_0x00f9
            com.instagram.common.typedurl.ImageUrl r1 = r0.A02
            if (r1 == 0) goto L_0x0087
            X.0iw r0 = r7.A01
            r11.A02(r9, r0, r1)
        L_0x0087:
            com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView r0 = r11.A04
            r0.setGradientSpinnerVisible(r3)
            r0.setGradientSpinnerActivated(r3)
            X.2eb r2 = r5.A0L
            X.Mhs r1 = r5.A0R
            android.content.Context r15 = r7.A00
            r16 = r10
            r17 = r3
            r18 = r3
            r19 = r3
            r20 = r3
            X.DcN r0 = X.C66696Mb3.A00(r15, r16, r17, r18, r19, r20)
            X.C46488Dfr.A00(r2, r1, r0)
            java.lang.String r2 = r14.A08()
            if (r2 != 0) goto L_0x00b3
            java.lang.String r2 = r14.A09()
            X.0qQ.A07(r2)
        L_0x00b3:
            java.util.ArrayList r1 = r14.A0B()
            int r0 = r6.A00
            r5.getAbsoluteAdapterPosition()
            X.MhZ r13 = new X.MhZ
            r13.<init>(r0, r2, r9, r1)
            android.view.ViewGroup r1 = r5.A07
            r9 = 6
            X.Ojz r8 = new X.Ojz
            r10 = r6
            r11 = r7
            r12 = r14
            r8.<init>((int) r9, (java.lang.Object) r10, (java.lang.Object) r11, (java.lang.Object) r12, (java.lang.Object) r13)
            X.AnonymousClass0fU.A00(r8, r1)
            X.OkN r15 = new X.OkN
            r16 = r7
            r17 = r13
            r18 = r6
            r19 = r5
            r20 = r14
            r21 = r4
            r15.<init>(r16, r17, r18, r19, r20, r21)
            r1.setOnLongClickListener(r15)
            X.5nB r11 = r7.A03
            r16 = 39
            android.view.View r12 = X.JTO.A0F(r5)
            java.lang.String r15 = "inbox_channel_invitation"
            r18 = r0
            r19 = r0
            r17 = r0
            r20 = r3
            r11.DpB(r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return
        L_0x00f9:
            com.instagram.direct.model.thread.DiscoverableThreadInfo r0 = r14.A06
            if (r0 == 0) goto L_0x0087
            java.lang.String r8 = r0.A01
            if (r8 == 0) goto L_0x0087
            X.0eE r1 = X.AnonymousClass0t1.A01
            com.instagram.common.session.UserSession r0 = r7.A02
            com.instagram.user.model.User r1 = r1.A01(r0)
            java.util.List r0 = X.DbT.A14(r14)
            X.34S r1 = X.AnonymousClass3UE.A00(r9, r1, r8, r9, r0)
            java.lang.Object r8 = r1.A00
            java.util.List r0 = X.DbT.A14(r14)
            int r0 = r0.size()
            if (r0 <= r2) goto L_0x013a
            java.lang.Object r2 = r1.A01
        L_0x011f:
            X.0iw r1 = r7.A01
            X.0qQ.A07(r8)
            com.instagram.common.typedurl.ImageUrl r8 = (com.instagram.common.typedurl.ImageUrl) r8
            com.instagram.common.typedurl.ImageUrl r2 = (com.instagram.common.typedurl.ImageUrl) r2
            X.AnonymousClass7TF.A1H(r1, r8)
            X.3oV r0 = r11.A03
            X.C66582MXn.A1G(r0)
            com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView r0 = r11.A04
            r0.setVisibility(r3)
            r0.A0G(r9, r1, r8, r2)
            goto L_0x0087
        L_0x013a:
            r2 = r9
            goto L_0x011f
        L_0x013c:
            int r0 = X.2Yu.A08(r1)
            goto L_0x0072
        L_0x0142:
            java.lang.String r11 = r14.A05()
            goto L_0x0065
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67181Mjd.bind(X.2tL, X.3kE):void");
    }

    public final Class modelClass() {
        return C68200N5p.class;
    }

    public C67181Mjd(Context context, AnonymousClass0iw r2, UserSession userSession, C294875nB r4) {
        this.A00 = context;
        this.A02 = userSession;
        this.A03 = r4;
        this.A01 = r2;
    }
}
