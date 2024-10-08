package X;

import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

public final class EAY extends C231632rz {
    public final AnonymousClass0iw A00;
    public final UserSession A01;
    public final G88 A02;
    public final String A03;

    public final int getViewTypeCount() {
        return 1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x006e, code lost:
        if (r11 == 0) goto L_0x0070;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void bindView(int r25, android.view.View r26, java.lang.Object r27, java.lang.Object r28) {
        /*
            r24 = this;
            r5 = r27
            r0 = 1969643378(0x75665f72, float:2.9203226E32)
            int r17 = X.AnonymousClass0fD.A03(r0)
            r0 = r26
            r1 = r28
            X.AnonymousClass7TG.A1U(r0, r5, r1)
            java.lang.Object r10 = r0.getTag()
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.user.userlist.adapter.SpotlightUserRowViewBinder.Holder"
            X.0qQ.A0C(r10, r0)
            X.F0o r10 = (X.C49657F0o) r10
            r0 = r24
            com.instagram.common.session.UserSession r6 = r0.A01
            X.3UM r5 = (X.AnonymousClass3UM) r5
            int r16 = X.AnonymousClass7TE.A0M(r1)
            X.0iw r4 = r0.A00
            java.lang.String r3 = r0.A03
            X.G88 r2 = r0.A02
            r9 = 0
            X.0qQ.A0B(r10, r9)
            r8 = 1
            X.AnonymousClass7TF.A1B(r6, r8, r5)
            r14 = 4
            X.0qQ.A0B(r4, r14)
            r7 = 5
            X.0qQ.A0B(r3, r7)
            r12 = 6
            X.0qQ.A0B(r2, r12)
            com.instagram.user.model.User r1 = r5.CCd()
            if (r1 == 0) goto L_0x00f7
            com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView r11 = r10.A06
            com.instagram.common.typedurl.ImageUrl r13 = r1.Bh3()
            r0 = 0
            r11.A0F(r0, r4, r13)
            r23 = 3
            X.FOt r0 = new X.FOt
            r22 = r16
            r19 = r2
            r20 = r5
            r21 = r3
            r18 = r0
            r18.<init>(r19, r20, r21, r22, r23)
            X.AnonymousClass0fU.A00(r0, r11)
            java.lang.String r0 = r1.getFullName()
            if (r0 == 0) goto L_0x0070
            int r11 = r0.length()
            r0 = 0
            if (r11 != 0) goto L_0x0071
        L_0x0070:
            r0 = 1
        L_0x0071:
            r11 = 8
            android.widget.TextView r13 = r10.A01
            if (r0 != 0) goto L_0x0100
            java.lang.String r0 = r1.getFullName()
            r13.setText(r0)
            X.3oV r15 = r10.A04
            android.view.View r0 = r15.getView()
            android.widget.TextView r0 = (android.widget.TextView) r0
            X.DbU.A1H(r0, r1)
            android.view.View r15 = r15.getView()
            X.FOt r0 = new X.FOt
            r18 = r0
            r23 = r14
            r18.<init>(r19, r20, r21, r22, r23)
            X.AnonymousClass0fU.A00(r0, r15)
        L_0x0099:
            X.FOt r0 = new X.FOt
            r18 = r0
            r23 = r7
            r18.<init>(r19, r20, r21, r22, r23)
            X.AnonymousClass0fU.A00(r0, r13)
            android.widget.TextView r0 = r10.A02
            r0.setVisibility(r11)
            X.3oV r14 = r10.A05
            android.view.View r13 = r14.getView()
            android.widget.TextView r13 = (android.widget.TextView) r13
            android.view.View r0 = r14.getView()
            android.content.Context r7 = r0.getContext()
            r0 = 2131962791(0x7f132ba7, float:1.9562317E38)
            X.DbT.A18(r7, r13, r0)
            android.view.View r7 = r14.getView()
            X.FOt r0 = new X.FOt
            r18 = r0
            r23 = r12
            r18.<init>(r19, r20, r21, r22, r23)
            X.AnonymousClass0fU.A00(r0, r7)
            android.view.ViewGroup r0 = r10.A00
            r0.setVisibility(r11)
            android.widget.TextView r0 = r10.A03
            r0.setVisibility(r11)
            com.instagram.user.follow.FollowButton r0 = r10.A07
            r0.setVisibility(r9)
            r0.A0A = r8
            X.4at r0 = r0.A0J
            r12 = 2
            X.EUD r7 = new X.EUD
            r11 = r16
            r8 = r2
            r9 = r5
            r10 = r3
            r7.<init>(r8, r9, r10, r11, r12)
            r0.A07(r7)
            r0.A03(r4, r6, r1)
            r2.DgN(r5, r3, r11)
        L_0x00f7:
            r1 = 367786586(0x15ebfa5a, float:9.531073E-26)
            r0 = r17
            X.AnonymousClass0fD.A0A(r1, r0)
            return
        L_0x0100:
            X.DbU.A1H(r13, r1)
            X.3oV r0 = r10.A04
            android.view.View r0 = r0.getView()
            r0.setVisibility(r11)
            goto L_0x0099
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EAY.bindView(int, android.view.View, java.lang.Object, java.lang.Object):void");
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r1, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        DbW.A1I(r1);
    }

    public EAY(AnonymousClass0iw r1, UserSession userSession, G88 g88, String str) {
        this.A01 = userSession;
        this.A00 = r1;
        this.A02 = g88;
        this.A03 = str;
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A04 = DbX.A04(viewGroup, 657800693);
        ViewGroup viewGroup2 = (ViewGroup) DbW.A09(DbV.A0D(viewGroup), viewGroup, R.layout.direct_thread_context_lines, false);
        viewGroup2.setTag(new C49657F0o(viewGroup2));
        AnonymousClass0fD.A0A(-1511875543, A04);
        return viewGroup2;
    }
}
