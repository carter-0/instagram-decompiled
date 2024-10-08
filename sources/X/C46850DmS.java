package X;

import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import java.util.List;

/* renamed from: X.DmS  reason: case insensitive filesystem */
public final class C46850DmS extends 2Rw implements C2366034j {
    public final List A00 = AnonymousClass7TE.A1C();
    public final List A01 = AnonymousClass7TE.A1C();
    public final AnonymousClass0iw A02;
    public final UserSession A03;
    public final C47499E5e A04;

    public C46850DmS(AnonymousClass0iw r2, UserSession userSession, C47499E5e e5e) {
        0qQ.A0B(userSession, 1);
        this.A03 = userSession;
        this.A02 = r2;
        this.A04 = e5e;
    }

    public final int CMG(Reel reel) {
        0qQ.A0B(reel, 0);
        return this.A01.indexOf(reel);
    }

    public final int CMH(Reel reel, C255773uh r3) {
        0qQ.A0B(reel, 0);
        return this.A01.indexOf(reel);
    }

    public final void Ei9(List list, boolean z, UserSession userSession) {
        0qQ.A0B(list, 0);
        DbW.A0z(this, list, this.A01);
    }

    public final C249703kE onCreateViewHolder(ViewGroup viewGroup, int i) {
        0qQ.A0B(viewGroup, 0);
        if (i == 0) {
            int i2 = C249703kE.FLAG_ADAPTER_FULLUPDATE;
            return new C47027DpJ((ViewGroup) DbW.A09(DbV.A0D(viewGroup), viewGroup, R.layout.group_mention_user_list_row, false));
        }
        throw DbW.A0a(AnonymousClass000.A00(4145), i);
    }

    public final Object Bkf(int i) {
        return this.A01.get(i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x00ca, code lost:
        if (r1 == 0) goto L_0x00cc;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onBindViewHolder(X.C249703kE r19, int r20) {
        /*
            r18 = this;
            r13 = r19
            r12 = 0
            X.0qQ.A0B(r13, r12)
            r0 = r18
            r1 = r20
            r0.getItemViewType(r1)
            com.instagram.common.session.UserSession r11 = r0.A03
            X.0iw r10 = r0.A02
            X.E5e r9 = r0.A04
            java.util.List r0 = r0.A00
            java.lang.Object r1 = r0.get(r1)
            X.Dtb r1 = (X.C47250Dtb) r1
            X.DpJ r13 = (X.C47027DpJ) r13
            r8 = 1
            r0 = 3
            X.AnonymousClass7TF.A1D(r1, r0, r13)
            com.instagram.user.model.User r7 = r1.A01
            int r6 = r1.A00
            java.lang.String r14 = r1.A02
            com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView r5 = r13.A06
            com.instagram.common.typedurl.ImageUrl r1 = r7.Bh3()
            r0 = 0
            r5.A0F(r0, r10, r1)
            android.view.ViewGroup r4 = r13.A00
            android.content.Context r1 = r4.getContext()
            if (r14 == 0) goto L_0x0152
            X.1Nr r3 = new X.1Nr
            r3.<init>(r7)
            java.lang.String r0 = r11.A06
            boolean r0 = X.DbV.A1Z(r7, r0)
            com.instagram.model.reels.Reel r2 = new com.instagram.model.reels.Reel
            r2.<init>(r3, r14, r0)
            r5.setGradientSpinnerVisible(r8)
            X.2O0 r0 = X.2O0.A00(r11)
            long r16 = r0.A02(r2)
            r14 = 0
            int r0 = (r16 > r14 ? 1 : (r16 == r14 ? 0 : -1))
            boolean r0 = X.AnonymousClass7TF.A1Q(r0)
            r5.setGradientSpinnerActivated(r0)
            com.instagram.api.schemas.RingSpec r0 = X.AnonymousClass3NW.A00(r11, r2)
            r5.setGradientColor(r0)
            r0 = 53
            X.FPH.A00(r5, r9, r2, r13, r0)
            r0 = 2131976678(0x7f1361e6, float:1.9590483E38)
        L_0x006f:
            java.lang.String r0 = X.DbY.A0b(r1, r7, r0)
            r5.setContentDescription(r0)
            X.2eS.A01(r5)
            r5.setImportantForAccessibility(r8)
            java.lang.String r1 = ""
            java.lang.String r2 = r7.getFullName()
            if (r2 == 0) goto L_0x0149
            int r0 = r2.length()
            if (r0 == 0) goto L_0x0149
            android.widget.TextView r3 = r13.A03
            r3.setVisibility(r12)
            r3.setText(r2)
        L_0x0092:
            android.widget.TextView r2 = r13.A02
            int r0 = r1.length()
            if (r0 != 0) goto L_0x009e
            java.lang.String r1 = r7.getUsername()
        L_0x009e:
            r2.setText(r1)
            android.content.Context r1 = r2.getContext()
            r0 = 2132018629(0x7f1405c5, float:1.967557E38)
            r2.setTextAppearance(r1, r0)
            X.DbY.A12(r2, r1)
            android.content.Context r1 = r3.getContext()
            r0 = 2132018624(0x7f1405c0, float:1.967556E38)
            r3.setTextAppearance(r1, r0)
            boolean r0 = r7.isVerified()
            X.C244273av.A0B(r2, r0)
            java.lang.String r0 = X.DbS.A0o(r7)
            if (r0 == 0) goto L_0x00cc
            int r1 = r0.length()
            r0 = 0
            if (r1 != 0) goto L_0x00cd
        L_0x00cc:
            r0 = 1
        L_0x00cd:
            r14 = 8
            android.widget.TextView r1 = r13.A01
            if (r0 == 0) goto L_0x013e
            r1.setVisibility(r14)
        L_0x00d6:
            boolean r0 = r7.A29()
            if (r0 != 0) goto L_0x0112
            X.3oV r15 = r13.A05
            r15.setVisibility(r12)
            com.instagram.common.ui.base.IgSimpleImageView r0 = r13.A04
            r0.setVisibility(r14)
            android.view.View r0 = r15.getView()
            com.instagram.user.follow.FollowButtonBase r0 = (com.instagram.user.follow.FollowButtonBase) r0
            X.4at r0 = r0.A0J
            r0.A03(r10, r11, r7)
            android.view.View r0 = r15.getView()
            X.DbT.A1G(r0, r11, r7)
        L_0x00f8:
            r4.setEnabled(r8)
            r0 = 1065353216(0x3f800000, float:1.0)
            r4.setAlpha(r0)
            r5.setAlpha(r0)
            r2.setAlpha(r0)
            r3.setAlpha(r0)
            r1.setAlpha(r0)
            r0 = 24
            X.FPA.A00(r4, r9, r7, r6, r0)
            return
        L_0x0112:
            java.lang.String r0 = r11.A06
            boolean r15 = X.DbV.A1Z(r7, r0)
            com.instagram.common.ui.base.IgSimpleImageView r0 = r13.A04
            if (r15 != 0) goto L_0x0135
            r0.setVisibility(r12)
            X.3oV r12 = r13.A05
            r12.setVisibility(r14)
            r13 = 14
            X.FO6 r12 = new X.FO6
            r17 = r11
            r15 = r9
            r16 = r7
            r14 = r10
            r12.<init>(r13, r14, r15, r16, r17)
            X.AnonymousClass0fU.A00(r12, r0)
            goto L_0x00f8
        L_0x0135:
            r0.setVisibility(r14)
            X.3oV r0 = r13.A05
            r0.setVisibility(r14)
            goto L_0x00f8
        L_0x013e:
            r1.setVisibility(r12)
            java.lang.String r0 = X.DbS.A0o(r7)
            r1.setText(r0)
            goto L_0x00d6
        L_0x0149:
            android.widget.TextView r3 = r13.A03
            r0 = 8
            r3.setVisibility(r0)
            goto L_0x0092
        L_0x0152:
            r5.setGradientSpinnerVisible(r12)
            r0 = 23
            X.FPA.A00(r5, r9, r7, r6, r0)
            r0 = 2131963112(0x7f132ce8, float:1.9562968E38)
            goto L_0x006f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C46850DmS.onBindViewHolder(X.3kE, int):void");
    }

    public final int getItemCount() {
        int A032 = AnonymousClass0fD.A03(1165981921);
        int size = this.A00.size();
        AnonymousClass0fD.A0A(1600236827, A032);
        return size;
    }

    public final int getItemViewType(int i) {
        AnonymousClass0fD.A0A(-1384087837, AnonymousClass0fD.A03(-90623725));
        return 0;
    }
}
