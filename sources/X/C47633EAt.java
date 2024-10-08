package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.model.fbusertag.FBUserTag;
import com.instagram.model.people.PeopleTag;
import com.instagram.tagging.model.Tag;
import com.instagram.user.model.User;

/* renamed from: X.EAt  reason: case insensitive filesystem */
public final class C47633EAt extends C231632rz {
    public final String A00;
    public final Context A01;
    public final AnonymousClass0iw A02;
    public final UserSession A03;
    public final C51917G7l A04;
    public final C51918G7m A05;
    public final C51919G7n A06;
    public final Integer A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final boolean A0G;

    public final int getViewTypeCount() {
        return 2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0134, code lost:
        if (r5.A08() == null) goto L_0x0136;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0149, code lost:
        if (r0.A0D != false) goto L_0x014b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0241, code lost:
        if (r13.length() == 0) goto L_0x0243;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void bindView(int r37, android.view.View r38, java.lang.Object r39, java.lang.Object r40) {
        /*
            r36 = this;
            r2 = r39
            r0 = -2071361023(0xffffffff84898a01, float:-3.233528E-36)
            int r23 = X.AnonymousClass0fD.A03(r0)
            X.Jw4 r2 = (X.C61066Jw4) r2
            java.lang.Object r5 = r2.A00
            com.instagram.tagging.model.Tag r5 = (com.instagram.tagging.model.Tag) r5
            boolean r1 = r5 instanceof com.instagram.model.people.PeopleTag
            r0 = r36
            if (r1 == 0) goto L_0x0333
            com.instagram.model.people.PeopleTag r5 = (com.instagram.model.people.PeopleTag) r5
            com.instagram.common.session.UserSession r12 = r0.A03
            r11 = 0
            boolean r10 = X.AnonymousClass7TF.A1U(r11, r12, r5)
            X.17i r3 = X.17h.A00(r12)
            java.lang.String r1 = r5.getId()
            com.instagram.user.model.User r9 = r3.A02(r1)
            if (r9 != 0) goto L_0x0038
            X.17i r3 = X.17h.A00(r12)
            com.instagram.user.model.User r1 = r5.A07()
            com.instagram.user.model.User r9 = r3.A01(r1, r11, r11)
        L_0x0038:
            r1 = r37
            if (r37 != 0) goto L_0x0314
            java.lang.String r3 = r0.A00
            java.lang.String r1 = r9.getId()
            if (r3 != r1) goto L_0x0108
            java.lang.String r6 = r0.A09
            if (r6 == 0) goto L_0x0108
            java.lang.String r1 = "DIRECT_MESSAGE"
            boolean r14 = r6.equals(r1)
            if (r14 != 0) goto L_0x0058
            java.lang.String r1 = "EMAIL"
            boolean r1 = r6.equals(r1)
            if (r1 == 0) goto L_0x0108
        L_0x0058:
            java.lang.Object r3 = X.DbT.A0o(r38)
            X.F18 r3 = (X.F18) r3
            X.0iw r13 = r0.A02
            int r2 = X.AnonymousClass7TE.A0M(r40)
            boolean r12 = r0.A0F
            X.G7l r15 = r0.A04
            java.lang.String r4 = r0.A0A
            X.0qQ.A0B(r3, r11)
            X.DbW.A1N(r13, r10, r15)
            android.view.ViewGroup r8 = r3.A01
            android.content.Context r7 = r8.getContext()
            android.widget.TextView r0 = r3.A05
            r1 = 8
            r0.setVisibility(r1)
            X.2eb r0 = r3.A0C
            r0.A03(r1)
            X.2eb r0 = r3.A0B
            r0.A03(r1)
            X.2eb r0 = r3.A09
            r0.A03(r1)
            com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView r5 = r3.A0E
            com.instagram.common.typedurl.ImageUrl r0 = r9.Bh3()
            r1 = 0
            r5.A0F(r1, r13, r0)
            r5.setGradientSpinnerVisible(r11)
            r0 = 25
            X.FPA.A00(r5, r15, r9, r2, r0)
            X.FFY.A02(r7, r9, r3, r1, r11)
            X.F18.A00(r8, r3, r10)
            X.FFY.A04(r3)
            if (r12 == 0) goto L_0x00b5
            android.view.ViewGroup r1 = r3.A03
            r0 = 2130969338(0x7f0402fa, float:1.7547355E38)
            int r0 = X.2Yu.A0H(r7, r0)
            X.DbU.A11(r7, r1, r0)
        L_0x00b5:
            if (r14 == 0) goto L_0x00dc
            X.2eb r0 = r3.A0A
            r0.A03(r11)
            X.2eb r1 = r3.A0A
            android.view.View r0 = r1.A01()
            r0.setClickable(r10)
            android.view.View r0 = r1.A01()
            r1 = 26
            X.FPA r14 = new X.FPA
            r14.<init>((int) r2, (int) r1, (java.lang.Object) r15, (java.lang.Object) r9)
        L_0x00d0:
            X.AnonymousClass0fU.A00(r14, r0)
        L_0x00d3:
            r1 = 2144264724(0x7fcee214, float:NaN)
            r0 = r23
            X.AnonymousClass0fD.A0A(r1, r0)
            return
        L_0x00dc:
            java.lang.String r0 = "EMAIL"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x00d3
            if (r4 == 0) goto L_0x00d3
            X.2eb r0 = r3.A08
            r0.A03(r11)
            X.2eb r1 = r3.A08
            android.view.View r0 = r1.A01()
            r0.setClickable(r10)
            android.view.View r0 = r1.A01()
            r20 = 4
            X.FOC r14 = new X.FOC
            r16 = r3
            r17 = r9
            r18 = r4
            r19 = r2
            r14.<init>(r15, r16, r17, r18, r19, r20)
            goto L_0x00d0
        L_0x0108:
            java.lang.Object r8 = X.DbT.A0o(r38)
            X.F18 r8 = (X.F18) r8
            X.G7n r7 = r0.A06
            X.0iw r1 = r0.A02
            r35 = r1
            int r22 = X.AnonymousClass7TE.A0M(r40)
            boolean r1 = r0.A0G
            r21 = r1
            java.lang.Integer r1 = r0.A07
            r34 = r1
            boolean r1 = r0.A0F
            r20 = r1
            boolean r3 = r0.A0E
            if (r3 == 0) goto L_0x0136
            boolean r1 = r9.A1f()
            if (r1 == 0) goto L_0x0136
            java.lang.String r1 = r5.A08()
            r19 = 1
            if (r1 != 0) goto L_0x0138
        L_0x0136:
            r19 = 0
        L_0x0138:
            boolean r1 = r5.A02
            if (r1 == 0) goto L_0x02e3
            java.lang.String r13 = r5.A08()
        L_0x0140:
            java.lang.String r1 = r0.A0B
            r33 = r1
            if (r3 == 0) goto L_0x014b
            boolean r1 = r0.A0D
            r14 = 1
            if (r1 == 0) goto L_0x014c
        L_0x014b:
            r14 = 0
        L_0x014c:
            boolean r1 = r2.A02
            java.lang.String r2 = r0.A08
            r18 = r2
            com.instagram.user.model.User r2 = r5.A07()
            java.lang.String r2 = r2.getId()
            java.lang.String r0 = r0.A0C
            boolean r2 = r2.equals(r0)
            X.0qQ.A0B(r8, r11)
            X.0qQ.A0B(r7, r10)
            r17 = 2
            r3 = r17
            r0 = r35
            X.AnonymousClass7TF.A1C(r12, r3, r0)
            r3 = 7
            r0 = r34
            X.0qQ.A0B(r0, r3)
            android.view.ViewGroup r0 = r8.A01
            r32 = r0
            android.content.Context r6 = r32.getContext()
            com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView r5 = r8.A0E
            com.instagram.common.typedurl.ImageUrl r3 = r9.Bh3()
            r4 = 0
            r0 = r35
            r5.A0F(r4, r0, r3)
            r5.setGradientSpinnerVisible(r11)
            r3 = 27
            r0 = r22
            X.FPA.A00(r5, r7, r9, r0, r3)
            X.0qQ.A0A(r6)
            if (r14 == 0) goto L_0x02e0
            if (r1 == 0) goto L_0x02e0
            java.lang.String r0 = r9.getUsername()
        L_0x019e:
            X.FFY.A02(r6, r9, r8, r0, r2)
            if (r19 != 0) goto L_0x022b
            if (r13 == 0) goto L_0x01ab
            int r0 = r13.length()
            if (r0 != 0) goto L_0x022b
        L_0x01ab:
            r3 = 8
            android.widget.TextView r0 = r8.A05
            r0.setVisibility(r3)
        L_0x01b2:
            X.2eb r2 = r8.A09
            if (r21 == 0) goto L_0x0227
            r2.A03(r11)
            android.view.View r1 = r2.A01()
            com.instagram.user.follow.FollowButtonBase r1 = (com.instagram.user.follow.FollowButtonBase) r1
            r0 = r20
            r1.setIsElevated(r0)
            r0 = r33
            X.1Xj r1 = X.DbV.A0U(r12, r0)
            if (r1 == 0) goto L_0x01d6
            android.view.View r0 = r2.A01()
            com.instagram.user.follow.FollowButtonBase r0 = (com.instagram.user.follow.FollowButtonBase) r0
            X.4at r0 = r0.A0J
            r0.A04 = r1
        L_0x01d6:
            if (r18 == 0) goto L_0x01e4
            android.view.View r0 = r2.A01()
            com.instagram.user.follow.FollowButtonBase r0 = (com.instagram.user.follow.FollowButtonBase) r0
            X.4at r1 = r0.A0J
            r0 = r18
            r1.A0H = r0
        L_0x01e4:
            android.view.View r0 = r2.A01()
            com.instagram.user.follow.FollowButtonBase r0 = (com.instagram.user.follow.FollowButtonBase) r0
            X.4at r1 = r0.A0J
            r0 = r35
            r1.A03(r0, r12, r9)
        L_0x01f1:
            r0 = r32
            X.F18.A00(r0, r8, r10)
            X.2eb r0 = r8.A0D
            r0.A03(r3)
            r5.setBottomBadgeDrawable(r4)
            X.2eb r0 = r8.A0A
            r0.A03(r3)
            X.2eb r0 = r8.A08
            r0.A03(r3)
            X.FFY.A04(r8)
            if (r19 != 0) goto L_0x0216
            r2 = 28
            r1 = r22
            r0 = r32
            X.FPA.A00(r0, r7, r9, r1, r2)
        L_0x0216:
            int r1 = r34.intValue()
            if (r1 == r11) goto L_0x02e6
            if (r1 == r10) goto L_0x02f1
            r0 = r17
            if (r1 == r0) goto L_0x0304
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0227:
            r2.A03(r3)
            goto L_0x01f1
        L_0x022b:
            android.widget.TextView r2 = r8.A05
            r2.setVisibility(r11)
            r3 = 8
            android.text.SpannableStringBuilder r1 = new android.text.SpannableStringBuilder
            r1.<init>()
            if (r19 == 0) goto L_0x02d4
            if (r13 == 0) goto L_0x0243
            int r0 = r13.length()
            r31 = 0
            if (r0 != 0) goto L_0x0245
        L_0x0243:
            r31 = 1
        L_0x0245:
            android.view.ViewGroup r0 = r8.A01
            android.content.Context r16 = r0.getContext()
            if (r31 != 0) goto L_0x02c8
            r1.append(r13)
            java.lang.String r0 = " • "
            r1.append(r0)
            int r0 = r1.length()
            android.content.res.Resources r14 = r16.getResources()
            r13 = 2131957189(0x7f1315c5, float:1.9550955E38)
        L_0x0260:
            java.lang.CharSequence r13 = r14.getText(r13)
            r1.append(r13)
            java.lang.String r30 = r13.toString()
            java.lang.Integer r29 = X.AnonymousClass05K.A01
            r14 = 16
            X.04x r13 = new X.04x
            r13.<init>(r14, r4)
            X.E8d r15 = new X.E8d
            r24 = r15
            r25 = r16
            r26 = r13
            r27 = r7
            r28 = r9
            r24.<init>(r25, r26, r27, r28, r29, r30, r31)
            int r13 = r1.length()
            r14 = 33
            r1.setSpan(r15, r11, r13, r14)
            int r13 = X.2Yu.A0D(r16)
            r15 = r16
            int r13 = r15.getColor(r13)
            android.text.style.ForegroundColorSpan r16 = new android.text.style.ForegroundColorSpan
            r15 = r13
            r13 = r16
            r13.<init>(r15)
            int r13 = r1.length()
            r15 = r13
            r13 = r16
            r1.setSpan(r13, r0, r15, r14)
            X.6Jl r15 = new X.6Jl
            r15.<init>()
            int r13 = r1.length()
            r1.setSpan(r15, r0, r13, r14)
        L_0x02b4:
            r2.setText(r1)
            r0 = 2132018624(0x7f1405c0, float:1.967556E38)
            r2.setTextAppearance(r0)
            X.DbT.A1H(r2)
            r2.setSingleLine()
            X.2eS.A01(r2)
            goto L_0x01b2
        L_0x02c8:
            int r0 = r1.length()
            android.content.res.Resources r14 = r16.getResources()
            r13 = 2131957191(0x7f1315c7, float:1.9550959E38)
            goto L_0x0260
        L_0x02d4:
            if (r13 == 0) goto L_0x02b4
            int r0 = r13.length()
            if (r0 == 0) goto L_0x02b4
            r1.append(r13)
            goto L_0x02b4
        L_0x02e0:
            r0 = 0
            goto L_0x019e
        L_0x02e3:
            r13 = 0
            goto L_0x0140
        L_0x02e6:
            X.2eb r0 = r8.A0C
            r0.A03(r3)
            X.2eb r0 = r8.A0B
            r0.A03(r3)
            goto L_0x0304
        L_0x02f1:
            X.2eb r0 = r8.A0B
            r0.A03(r3)
            X.2eb r0 = r8.A0C
            r0.A03(r11)
            X.2eb r0 = r8.A0C
            android.view.View r0 = r0.A01()
            X.FP7.A00(r0, r3, r7, r9)
        L_0x0304:
            if (r20 == 0) goto L_0x00d3
            android.view.ViewGroup r1 = r8.A03
            r0 = 2130969338(0x7f0402fa, float:1.7547355E38)
            int r0 = X.2Yu.A0H(r6, r0)
            X.DbU.A11(r6, r1, r0)
            goto L_0x00d3
        L_0x0314:
            if (r1 != r10) goto L_0x00d3
            java.lang.Object r0 = X.DbT.A0o(r38)
            X.Ex4 r0 = (X.Ex4) r0
            X.0qQ.A0B(r0, r10)
            android.widget.TextView r3 = r0.A00
            android.view.View r0 = r0.A01
            android.content.Context r2 = r0.getContext()
            r1 = 2131972449(0x7f135161, float:1.9581906E38)
            java.lang.String r0 = r9.B8Q()
            X.DbX.A13(r2, r3, r0, r1)
            goto L_0x00d3
        L_0x0333:
            boolean r1 = r5 instanceof com.instagram.model.fbusertag.FBUserTag
            if (r1 == 0) goto L_0x00d3
            com.instagram.model.fbusertag.FBUserTag r5 = (com.instagram.model.fbusertag.FBUserTag) r5
            java.lang.Object r11 = X.DbT.A0o(r38)
            X.F18 r11 = (X.F18) r11
            X.0iw r14 = r0.A02
            int r25 = X.AnonymousClass7TE.A0M(r40)
            boolean r15 = r0.A0F
            X.G7m r10 = r0.A05
            java.lang.Integer r9 = r0.A07
            com.instagram.common.session.UserSession r8 = r0.A03
            r7 = 0
            X.0qQ.A0B(r11, r7)
            r6 = 1
            X.AnonymousClass7TF.A1B(r14, r6, r5)
            X.AnonymousClass7TG.A1S(r10, r9)
            r4 = 7
            X.0qQ.A0B(r8, r4)
            android.view.ViewGroup r3 = r11.A01
            android.content.Context r2 = r3.getContext()
            android.widget.TextView r0 = r11.A05
            r1 = 8
            r0.setVisibility(r1)
            X.2eb r0 = r11.A0C
            r0.A03(r1)
            X.2eb r0 = r11.A0B
            r0.A03(r1)
            X.2eb r0 = r11.A09
            r0.A03(r1)
            com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView r13 = r11.A0E
            com.instagram.model.fbusertag.FBUserTag$FBUserInfo r0 = r5.A02
            java.lang.String r0 = r0.A03
            com.instagram.common.typedurl.SimpleImageUrl r12 = X.DbS.A0V(r0)
            r0 = 0
            r13.A0F(r0, r14, r12)
            r13.setGradientSpinnerVisible(r7)
            r26 = 3
            X.FOx r0 = new X.FOx
            r28 = r8
            r29 = r5
            r30 = r10
            r31 = r9
            r24 = r0
            r27 = r2
            r24.<init>((int) r25, (int) r26, (java.lang.Object) r27, (java.lang.Object) r28, (java.lang.Object) r29, (java.lang.Object) r30, (java.lang.Object) r31)
            X.AnonymousClass0fU.A00(r0, r13)
            r0 = 2131231777(0x7f080421, float:1.8079645E38)
            android.graphics.drawable.Drawable r0 = r2.getDrawable(r0)
            if (r0 == 0) goto L_0x03ab
            r13.setBottomBadgeDrawable(r0)
        L_0x03ab:
            com.instagram.model.fbusertag.FBUserTag$FBUserInfo r0 = r5.A02
            java.lang.String r0 = r0.A01
            X.0qQ.A07(r0)
            android.widget.TextView r12 = r11.A06
            r12.setText(r0)
            r0 = 2132018629(0x7f1405c5, float:1.967557E38)
            r12.setTextAppearance(r0)
            android.content.Context r0 = r12.getContext()
            X.DbY.A12(r12, r0)
            android.widget.TextView r12 = r11.A07
            r12.setVisibility(r7)
            android.content.Context r13 = r12.getContext()
            r0 = 2131961885(0x7f13281d, float:1.956048E38)
            X.DbT.A18(r13, r12, r0)
            r0 = 2132018624(0x7f1405c0, float:1.967556E38)
            r12.setTextAppearance(r0)
            X.2eb r0 = r11.A0D
            r0.A03(r7)
            X.2eb r12 = r11.A0D
            android.view.View r0 = r12.A01()
            r0.setClickable(r6)
            android.view.View r12 = r12.A01()
            r17 = 15
            X.FO6 r0 = new X.FO6
            r16 = r0
            r18 = r2
            r19 = r10
            r20 = r8
            r21 = r5
            r16.<init>(r17, r18, r19, r20, r21)
            X.AnonymousClass0fU.A00(r0, r12)
            X.F18.A00(r3, r11, r6)
            X.FFY.A04(r11)
            r26 = 4
            X.FOx r0 = new X.FOx
            r24 = r0
            r24.<init>((int) r25, (int) r26, (java.lang.Object) r27, (java.lang.Object) r28, (java.lang.Object) r29, (java.lang.Object) r30, (java.lang.Object) r31)
            X.AnonymousClass0fU.A00(r0, r3)
            android.view.ViewGroup r3 = r11.A03
            r0 = 2130968710(0x7f040086, float:1.7546081E38)
            if (r15 == 0) goto L_0x041b
            r0 = 2130969338(0x7f0402fa, float:1.7547355E38)
        L_0x041b:
            int r0 = X.2Yu.A0H(r2, r0)
            X.DbU.A11(r2, r3, r0)
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r9 != r0) goto L_0x00d3
            X.2eb r0 = r11.A0D
            r0.A03(r1)
            X.2eb r0 = r11.A0C
            r0.A03(r7)
            X.2eb r1 = r11.A0C
            android.view.View r0 = r1.A01()
            r0.setClickable(r6)
            android.view.View r0 = r1.A01()
            X.FP7.A00(r0, r4, r10, r5)
            goto L_0x00d3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47633EAt.bindView(int, android.view.View, java.lang.Object, java.lang.Object):void");
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r4, Object obj, Object obj2) {
        C61066Jw4 jw4 = (C61066Jw4) obj;
        r4.A7U(0);
        String str = this.A00;
        if (str != null) {
            Tag tag = (Tag) jw4.A00;
            if ((tag instanceof PeopleTag) && tag.getId().equals(str)) {
                r4.A7U(1);
            }
        }
    }

    public final int getViewModelHash(int i, Object obj, Object obj2) {
        FBUserTag.FBUserInfo fBUserInfo;
        Tag tag = (Tag) ((C61066Jw4) obj).A00;
        if (tag instanceof PeopleTag) {
            PeopleTag peopleTag = (PeopleTag) tag;
            UserSession userSession = this.A03;
            AnonymousClass7TF.A1H(userSession, peopleTag);
            User A022 = 17h.A00(userSession).A02(peopleTag.getId());
            if (A022 == null) {
                A022 = 17h.A00(userSession).A01(peopleTag.A07(), false, false);
            }
            if (this.A0G) {
                return A022.B6o().ordinal();
            }
            if (peopleTag.A08() != null) {
                return peopleTag.A08().hashCode();
            }
            return AnonymousClass972.MUTABLE_FLAG_MASK;
        } else if (!(tag instanceof FBUserTag) || (fBUserInfo = ((FBUserTag) tag).A02) == null) {
            return AnonymousClass972.MUTABLE_FLAG_MASK;
        } else {
            return fBUserInfo.hashCode();
        }
    }

    public C47633EAt(Context context, AnonymousClass0iw r3, UserSession userSession, C51917G7l g7l, C51918G7m g7m, C51919G7n g7n, Integer num, String str, String str2, String str3, String str4, String str5, String str6, boolean z, boolean z2, boolean z3, boolean z4) {
        this.A01 = context;
        this.A03 = userSession;
        this.A02 = r3;
        this.A06 = g7n;
        this.A07 = num;
        this.A0G = z;
        this.A0F = z2;
        this.A0E = z3;
        this.A00 = str;
        this.A05 = g7m;
        this.A0B = str2;
        this.A0D = z4;
        this.A08 = str3;
        this.A09 = str4;
        this.A0A = str5;
        this.A04 = g7l;
        this.A0C = str6;
    }

    public final View createView(int i, ViewGroup viewGroup) {
        View A012;
        int i2;
        int A032 = AnonymousClass0fD.A03(-740423777);
        if (i == 0) {
            A012 = FFY.A01(this.A01, viewGroup);
            i2 = 696759584;
        } else if (i == 1) {
            Context context = this.A01;
            A012 = LayoutInflater.from(context).inflate(R.layout.row_copyright_attribution_description, viewGroup, DbW.A1S(1, context, viewGroup));
            0qQ.A0C(A012, AnonymousClass000.A00(0));
            A012.setTag(new Ex4(A012));
            i2 = -1560999054;
        } else {
            IllegalArgumentException A0a = DbW.A0a("viewType does not exist: ", i);
            AnonymousClass0fD.A0A(-94675492, A032);
            throw A0a;
        }
        AnonymousClass0fD.A0A(i2, A032);
        return A012;
    }

    public final int getIdentifier(int i, Object obj, Object obj2) {
        return DbS.A0q(obj).hashCode();
    }
}
