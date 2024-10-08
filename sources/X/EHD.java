package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.peoplecell.IgdsPeopleCell;

public final class EHD extends C232232tF {
    public final Fragment A00;
    public final UserSession A01;
    public final C49678F1k A02;
    public final boolean A03;

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        0qQ.A0B(viewGroup, 0);
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        return new C46939Dnt(this.A02, new IgdsPeopleCell(AnonymousClass7TE.A0S(viewGroup), false));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0048, code lost:
        if (r12 == null) goto L_0x004a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void bind(X.C232262tL r24, X.C249703kE r25) {
        /*
            r23 = this;
            r14 = r25
            r0 = r24
            X.DtU r0 = (X.C47243DtU) r0
            X.Dnt r14 = (X.C46939Dnt) r14
            boolean r10 = X.AnonymousClass7TG.A1Z(r0, r14)
            com.instagram.user.model.User r15 = r0.A02
            X.4Yx r6 = r0.A00
            X.4lo r5 = r0.A01
            boolean r4 = r0.A03
            r0 = r23
            boolean r8 = r0.A03
            com.instagram.common.session.UserSession r13 = r0.A01
            androidx.fragment.app.Fragment r11 = r0.A00
            r3 = 0
            X.0qQ.A0B(r15, r3)
            X.AnonymousClass7TF.A1B(r6, r10, r5)
            X.AnonymousClass7TG.A1S(r13, r11)
            android.content.Context r2 = r11.requireContext()
            com.instagram.igds.components.peoplecell.IgdsPeopleCell r1 = r14.A01
            r1.A01()
            java.lang.String r7 = r15.getUsername()
            r0 = 0
            r1.A08(r7, r3)
            java.lang.String r7 = r15.getFullName()
            r1.A07(r7)
            X.1OP r7 = X.1OP.$redex_init_class
            com.instagram.model.reels.Reel r12 = X.AnonymousClass3PQ.A02(r13, r15)
            if (r8 == 0) goto L_0x004a
            r16 = 1
            if (r12 != 0) goto L_0x004c
        L_0x004a:
            r16 = 0
        L_0x004c:
            X.Exl r7 = new X.Exl
            r7.<init>(r11, r15)
            X.FOP r9 = new X.FOP
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)
            r7.A00 = r9
            com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView r8 = r1.A08
            if (r16 == 0) goto L_0x010d
            com.instagram.api.schemas.RingSpec r9 = X.AnonymousClass3NW.A00(r13, r12)
            r8.setGradientColor(r9)
            r8.setGradientSpinnerVisible(r10)
            r9 = 2131973009(0x7f135391, float:1.9583042E38)
        L_0x0069:
            java.lang.String r9 = X.DbY.A0b(r2, r15, r9)
            r8.setContentDescription(r9)
            r1.A03(r13, r7, r15)
            r17 = 7
            X.FO6 r7 = new X.FO6
            r18 = r11
            r19 = r15
            r20 = r14
            r21 = r13
            r16 = r7
            r16.<init>(r17, r18, r19, r20, r21)
            X.AnonymousClass0fU.A00(r7, r1)
            java.lang.CharSequence r6 = X.C66909Mes.A00(r2, r6)
            java.lang.String r7 = r6.toString()
            r6 = 2
            X.0qQ.A0B(r7, r6)
            X.4lp r19 = X.C273024lp.MEDIUM
            X.ELh r6 = new X.ELh
            r20 = r7
            r21 = r3
            r22 = r3
            r18 = r5
            r17 = r2
            r16 = r6
            r16.<init>(r17, r18, r19, r20, r21, r22)
            r3 = 11
            X.FPF.A00(r6, r3, r15, r14)
            if (r4 == 0) goto L_0x00c5
            java.lang.Integer r19 = X.AnonymousClass05K.A01
            java.lang.Integer r20 = X.AnonymousClass05K.A0C
            int r21 = X.2Yu.A0B(r2)
            r0 = 10
            X.FPF r3 = new X.FPF
            r3.<init>((int) r0, (java.lang.Object) r15, (java.lang.Object) r14)
            X.EHb r0 = new X.EHb
            r16 = r0
            r18 = r3
            r16.<init>(r17, r18, r19, r20, r21)
        L_0x00c5:
            r1.A05(r6, r0)
            X.F1k r0 = r14.A00
            X.E7M r0 = r0.A00
            X.0eM r0 = r0.A02
            java.lang.Object r2 = r0.getValue()
            X.DlY r2 = (X.C46797DlY) r2
            X.17M r1 = r15.A02
            X.17M r0 = X.17M.A03
            if (r1 != r0) goto L_0x0109
            X.4lm r0 = r2.A02
            java.lang.Integer r3 = X.C46797DlY.A09
            X.0qQ.A0B(r3, r10)
            X.0wc r1 = r0.A00
            java.lang.String r0 = "ig_fan_club_fan_suggested_creator_impression"
            X.0Aj r2 = X.AnonymousClass7TE.A0e(r1, r0)
            java.lang.String r0 = r15.getId()
            X.DbY.A1G(r2, r0)
            java.lang.String r0 = X.C63261Ku6.A00(r3)
            X.DbS.A1O(r2, r0)
            com.instagram.user.model.FollowStatus r1 = r15.B6o()
            com.instagram.user.model.FollowStatus r0 = com.instagram.user.model.FollowStatus.A05
            if (r1 != r0) goto L_0x010a
            java.lang.String r1 = "connected"
        L_0x0101:
            java.lang.String r0 = "type"
            r2.AAJ(r0, r1)
            r2.Cgf()
        L_0x0109:
            return
        L_0x010a:
            java.lang.String r1 = "unconnected"
            goto L_0x0101
        L_0x010d:
            r8.setGradientSpinnerVisible(r3)
            r9 = 2131963112(0x7f132ce8, float:1.9562968E38)
            goto L_0x0069
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EHD.bind(X.2tL, X.3kE):void");
    }

    public final Class modelClass() {
        return C47243DtU.class;
    }

    public EHD(Fragment fragment, UserSession userSession, C49678F1k f1k, boolean z) {
        AnonymousClass7TG.A1P(userSession, f1k);
        this.A01 = userSession;
        this.A00 = fragment;
        this.A02 = f1k;
        this.A03 = z;
    }
}
