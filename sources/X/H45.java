package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

public final class H45 extends C231632rz {
    public final Context A00;
    public final AnonymousClass0iw A01;
    public final UserSession A02;
    public final C55917Hpe A03;

    public final int getIdentifier(int i, Object obj, Object obj2) {
        0qQ.A0B(obj, 1);
        return DbS.A0q(obj).hashCode();
    }

    public final int getViewModelHash(int i, Object obj, Object obj2) {
        return AnonymousClass972.MUTABLE_FLAG_MASK;
    }

    public final int getViewTypeCount() {
        return 1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0095, code lost:
        if (r1 != null) goto L_0x0097;
     */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00ec  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void bindView(int r17, android.view.View r18, java.lang.Object r19, java.lang.Object r20) {
        /*
            r16 = this;
            r11 = r20
            r4 = r19
            r0 = -713934043(0xffffffffd5723b25, float:-1.66459899E13)
            int r3 = X.AnonymousClass0fD.A03(r0)
            r8 = 1
            r0 = r18
            int r1 = X.DbW.A02(r8, r0, r4)
            com.instagram.user.model.User r4 = (com.instagram.user.model.User) r4
            r2 = r16
            com.instagram.common.session.UserSession r14 = r2.A02
            com.instagram.model.reels.Reel r13 = X.1OP.A01(r14, r4)
            java.lang.Object r10 = r0.getTag()
            if (r10 == 0) goto L_0x0135
            X.Hnj r10 = (X.C55803Hnj) r10
            X.0iw r5 = r2.A01
            X.Hpe r6 = r2.A03
            boolean r0 = r11 instanceof java.lang.Integer
            if (r0 != 0) goto L_0x002d
            r11 = 0
        L_0x002d:
            boolean r7 = X.DbW.A1S(r8, r10, r14)
            int r12 = X.DbW.A03(r1, r5, r4)
            r9 = 5
            X.0qQ.A0B(r6, r9)
            com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView r1 = r10.A04
            com.instagram.common.typedurl.ImageUrl r2 = r4.Bh3()
            r0 = 0
            r1.A0F(r0, r5, r2)
            android.view.ViewGroup r5 = r10.A00
            android.content.Context r2 = r5.getContext()
            if (r13 == 0) goto L_0x0129
            r1.setGradientSpinnerVisible(r8)
            com.instagram.api.schemas.RingSpec r0 = X.AnonymousClass3NW.A00(r14, r13)
            r1.setGradientColor(r0)
            X.ID0.A00(r1, r6, r10, r13, r12)
            r0 = 2131976678(0x7f1361e6, float:1.9590483E38)
        L_0x005b:
            java.lang.String r0 = X.DbY.A0b(r2, r4, r0)
            r1.setContentDescription(r0)
            X.2eS.A01(r1)
            java.lang.String r1 = r4.A0Q()
            X.4Cl r0 = r4.A03
            java.lang.Integer r15 = r0.BVD()
            if (r15 == 0) goto L_0x0125
            int r14 = r15.intValue()
            if (r14 <= 0) goto L_0x0125
            android.content.res.Resources r13 = r2.getResources()
            r12 = 2131820849(0x7f110131, float:1.9274425E38)
            android.content.res.Resources r0 = X.AnonymousClass7TF.A0A(r2)
            java.lang.String r0 = X.C253673rC.A03(r0, r15)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r12 = r13.getQuantityString(r12, r14, r0)
        L_0x008e:
            int r0 = r1.length()
            if (r0 != 0) goto L_0x0115
            r1 = r12
        L_0x0095:
            if (r1 == 0) goto L_0x010d
        L_0x0097:
            int r0 = r1.length()
            if (r0 == 0) goto L_0x010d
            com.instagram.common.ui.base.IgTextView r0 = r10.A03
            r0.setVisibility(r7)
            r0.setText(r1)
        L_0x00a5:
            com.instagram.common.ui.base.IgTextView r1 = r10.A02
            X.DbU.A1H(r1, r4)
            boolean r0 = r4.isVerified()
            X.C244273av.A0B(r1, r0)
            X.ID0.A00(r5, r6, r11, r4, r9)
            android.view.ViewGroup r1 = r10.A01
            r0 = 2130968710(0x7f040086, float:1.7546081E38)
            int r0 = X.2Yu.A0H(r2, r0)
            X.DbU.A11(r2, r1, r0)
            X.H07 r2 = r6.A00
            X.0eM r0 = r2.A0A
            X.0lg r1 = X.DbT.A0X(r0)
            X.0eM r0 = r2.A07
            java.lang.Object r6 = r0.getValue()
            X.0iw r6 = (X.AnonymousClass0iw) r6
            java.lang.String r5 = r4.getId()
            java.lang.String r4 = r2.A04
            X.0qQ.A0B(r1, r7)
            X.0qQ.A0B(r6, r8)
            X.0wc r1 = X.AnonymousClass0kN.A01(r6, r1)
            java.lang.String r0 = "instagram_organic_creator_inspiration_hub_account_impression"
            X.0Aj r2 = X.AnonymousClass7TE.A0e(r1, r0)
            boolean r0 = r2.isSampled()
            if (r0 == 0) goto L_0x0106
            java.lang.String r1 = r6.getModuleName()
            java.lang.String r0 = "containermodule"
            X.C51973G9u.A14(r2, r0, r1)
            java.lang.Long r1 = X.AnonymousClass7TE.A10(r5)
            java.lang.String r0 = "target_id"
            r2.A9F(r0, r1)
            java.lang.String r0 = "section_type"
            r2.AAJ(r0, r4)
            r2.Cgf()
        L_0x0106:
            r0 = 280133291(0x10b27eab, float:7.0403783E-29)
            X.AnonymousClass0fD.A0A(r0, r3)
            return
        L_0x010d:
            com.instagram.common.ui.base.IgTextView r1 = r10.A03
            r0 = 8
            r1.setVisibility(r0)
            goto L_0x00a5
        L_0x0115:
            if (r12 == 0) goto L_0x0097
            int r0 = r12.length()
            if (r0 == 0) goto L_0x0097
            java.lang.String r0 = " • "
            java.lang.String r1 = X.002.A0g(r1, r0, r12)
            goto L_0x0095
        L_0x0125:
            java.lang.String r12 = ""
            goto L_0x008e
        L_0x0129:
            r1.setGradientSpinnerVisible(r7)
            r0 = 4
            X.ID0.A00(r1, r6, r11, r4, r0)
            r0 = 2131963112(0x7f132ce8, float:1.9562968E38)
            goto L_0x005b
        L_0x0135:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0y()
            r0 = -1499596839(0xffffffffa69df7d9, float:-1.0961243E-15)
            X.AnonymousClass0fD.A0A(r0, r3)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.H45.bindView(int, android.view.View, java.lang.Object, java.lang.Object):void");
    }

    public H45(Context context, AnonymousClass0iw r2, UserSession userSession, C55917Hpe hpe) {
        this.A00 = context;
        this.A02 = userSession;
        this.A01 = r2;
        this.A03 = hpe;
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r2, Object obj, Object obj2) {
        r2.A7U(C51972G9s.A1b(obj2, r2) ? 1 : 0);
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A04 = DbX.A04(viewGroup, 1247217487);
        ViewGroup viewGroup2 = (ViewGroup) DbW.A09(LayoutInflater.from(this.A00), viewGroup, R.layout.creator_inspiration_hub_account_fragment_row_user, false);
        viewGroup2.setTag(new C55803Hnj(viewGroup2));
        AnonymousClass0fD.A0A(-1746104579, A04);
        return viewGroup2;
    }
}
