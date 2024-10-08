package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

public final class EAV extends C231632rz {
    public final Context A00;
    public final AnonymousClass0iw A01;
    public final UserSession A02;
    public final G7Z A03;

    public final int getViewTypeCount() {
        return 1;
    }

    public EAV(Context context, AnonymousClass0iw r2, UserSession userSession, G7Z g7z) {
        this.A00 = context;
        this.A02 = userSession;
        this.A01 = r2;
        this.A03 = g7z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00c6, code lost:
        if (r4.Es1(r15) == false) goto L_0x00c8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void bindView(int r13, android.view.View r14, java.lang.Object r15, java.lang.Object r16) {
        /*
            r12 = this;
            r0 = -907884641(0xffffffffc9e2c79f, float:-1857779.9)
            int r2 = X.DbX.A04(r14, r0)
            r8 = 2
            X.0qQ.A0B(r15, r8)
            java.lang.Object r0 = r14.getTag()
            boolean r0 = r0 instanceof X.C49621Eze
            if (r0 == 0) goto L_0x00cd
            java.lang.Object r6 = r14.getTag()
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.direct.audiencepicker.DirectAudiencePickerViewBinder.Holder"
            X.0qQ.A0C(r6, r0)
            X.Eze r6 = (X.C49621Eze) r6
            com.instagram.common.session.UserSession r9 = r12.A02
            X.Dra r15 = (X.C47159Dra) r15
            X.0iw r11 = r12.A01
            X.G7Z r4 = r12.A03
            X.AnonymousClass7TG.A1N(r6, r9)
            X.AnonymousClass7TG.A0w(r8, r15, r11, r4)
            com.instagram.model.direct.DirectShareTarget r7 = r15.A07
            X.34S r5 = X.OXB.A00(r9, r7)
            boolean r0 = r7.A0M()
            r10 = 0
            com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView r3 = r6.A04
            java.lang.Object r1 = r5.A00
            com.instagram.common.typedurl.ImageUrl r1 = (com.instagram.common.typedurl.ImageUrl) r1
            if (r0 == 0) goto L_0x0103
            java.lang.Object r0 = r5.A01
            com.instagram.common.typedurl.ImageUrl r0 = (com.instagram.common.typedurl.ImageUrl) r0
            r3.A0G(r10, r11, r1, r0)
        L_0x0046:
            r5 = 0
            r3.setGradientSpinnerVisible(r5)
            java.lang.Integer r1 = r15.A01
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            if (r1 != r0) goto L_0x0067
            android.content.Context r11 = r3.getContext()
            r3.setGradientSpinnerVisible(r5)
            boolean r0 = r7.A0M()
            if (r0 != 0) goto L_0x00da
            boolean r0 = r15.A06
            if (r0 == 0) goto L_0x00da
            r0 = 2130970900(0x7f040914, float:1.7550523E38)
        L_0x0064:
            X.DbY.A0x(r11, r3, r0)
        L_0x0067:
            com.instagram.user.model.User r3 = X.AnonymousClass7TF.A0Q(r9)
            android.widget.TextView r1 = r6.A02
            java.lang.String r0 = X.DbT.A0y(r7)
            r1.setText(r0)
            boolean r0 = r7.A0V()
            X.C244273av.A0B(r1, r0)
            java.lang.String r1 = X.AnonymousClass50n.A03(r7, r3)
            X.0qQ.A07(r1)
            android.widget.TextView r3 = r6.A01
            android.content.Context r0 = X.AnonymousClass7TE.A0S(r3)
            android.text.SpannableStringBuilder r1 = X.C49751F5c.A00(r0, r9, r7, r1, r8)
            if (r1 == 0) goto L_0x00d4
            int r0 = r1.length()
            if (r0 == 0) goto L_0x00d4
            r3.setText(r1)
            r3.setVisibility(r5)
        L_0x009a:
            X.3oV r5 = r6.A03
            android.view.View r1 = r5.getView()
            android.widget.CompoundButton r1 = (android.widget.CompoundButton) r1
            boolean r0 = r15.A04
            r1.setChecked(r0)
            android.view.View r3 = r6.A00
            r0 = 21
            X.FPH.A00(r3, r15, r6, r4, r0)
            boolean r0 = r15.A02
            r3.setEnabled(r0)
            android.view.View r0 = r5.getView()
            android.widget.CompoundButton r0 = (android.widget.CompoundButton) r0
            boolean r0 = r0.isChecked()
            if (r0 != 0) goto L_0x00c8
            boolean r1 = r4.Es1(r15)
            r0 = 1050253722(0x3e99999a, float:0.3)
            if (r1 != 0) goto L_0x00ca
        L_0x00c8:
            r0 = 1065353216(0x3f800000, float:1.0)
        L_0x00ca:
            r3.setAlpha(r0)
        L_0x00cd:
            r0 = 347392350(0x14b4c95e, float:1.825478E-26)
            X.AnonymousClass0fD.A0A(r0, r2)
            return
        L_0x00d4:
            r0 = 8
            r3.setVisibility(r0)
            goto L_0x009a
        L_0x00da:
            boolean r0 = r15.A05
            if (r0 == 0) goto L_0x00e2
            r0 = 2130970844(0x7f0408dc, float:1.755041E38)
            goto L_0x0064
        L_0x00e2:
            boolean r0 = X.DbV.A1Y(r9)
            if (r0 == 0) goto L_0x00fb
            int r1 = r15.A00
            if (r1 <= 0) goto L_0x00fb
            r0 = 2131960124(0x7f13213c, float:1.9556908E38)
            X.U0t r0 = X.DbZ.A0X(r11, r1, r0)
            r3.setPresenceBadgeDrawable(r0)
            r3.setBottomBadgeDrawable(r10)
            goto L_0x0067
        L_0x00fb:
            r3.setBottomBadgeDrawable(r10)
            r3.setPresenceBadgeDrawable(r10)
            goto L_0x0067
        L_0x0103:
            r3.A0F(r10, r11, r1)
            goto L_0x0046
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EAV.bindView(int, android.view.View, java.lang.Object, java.lang.Object):void");
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A032 = AnonymousClass0fD.A03(170110668);
        View A0D = DbT.A0D(LayoutInflater.from(this.A00), viewGroup, R.layout.selectable_user_row, false);
        A0D.setTag(new C49621Eze(A0D));
        AnonymousClass0fD.A0A(-1013015843, A032);
        return A0D;
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r1, Object obj, Object obj2) {
        DbW.A1I(r1);
    }
}
