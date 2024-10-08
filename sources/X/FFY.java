package X;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;
import com.instagram.user.model.User;

public abstract class FFY {
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0158, code lost:
        if (X.182.A06(r15, r2, 36328637275848178L) != false) goto L_0x015a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A03(com.instagram.user.model.User r16, X.F18 r17, X.F14 r18, java.lang.Integer r19) {
        /*
            r10 = r17
            com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView r8 = r10.A0E
            r11 = r16
            com.instagram.common.typedurl.ImageUrl r0 = r11.Bh3()
            r9 = r18
            X.0iw r14 = r9.A09
            r2 = 0
            r8.A0F(r2, r14, r0)
            android.view.ViewGroup r0 = r10.A01
            r18 = r0
            android.content.Context r7 = r18.getContext()
            com.instagram.model.reels.Reel r1 = r9.A00
            r6 = 1
            r5 = 0
            if (r1 == 0) goto L_0x018b
            r8.setGradientSpinnerVisible(r6)
            com.instagram.common.session.UserSession r0 = r9.A0A
            com.instagram.api.schemas.RingSpec r0 = X.AnonymousClass3NW.A00(r0, r1)
            r8.setGradientColor(r0)
            X.FOs r0 = new X.FOs
            r0.<init>((int) r5, (java.lang.Object) r1, (java.lang.Object) r10, (java.lang.Object) r9)
            X.AnonymousClass0fU.A00(r0, r8)
            r0 = 2131976678(0x7f1361e6, float:1.9590483E38)
        L_0x0037:
            java.lang.String r0 = X.DbY.A0b(r7, r11, r0)
            r8.setContentDescription(r0)
            X.2eS.A01(r8)
            r8.setImportantForAccessibility(r6)
            A02(r7, r11, r10, r2, r5)
            boolean r0 = r9.A08
            r4 = 8
            if (r0 == 0) goto L_0x0184
            java.lang.String r0 = X.DbS.A0o(r11)
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0184
            android.widget.TextView r1 = r10.A05
            r1.setVisibility(r5)
            java.lang.String r0 = X.DbS.A0o(r11)
            r1.setText(r0)
        L_0x0063:
            boolean r0 = r9.A07
            if (r0 == 0) goto L_0x0115
            boolean r0 = r11.A29()
            if (r0 == 0) goto L_0x0115
            X.2eb r2 = r10.A09
            r2.A03(r5)
            android.view.View r1 = r2.A01()
            com.instagram.user.follow.FollowButtonBase r1 = (com.instagram.user.follow.FollowButtonBase) r1
            X.3aK r0 = X.C243923aK.MESSAGE_OPTION
            r1.setBaseStyle(r0)
            android.view.View r0 = r2.A01()
            com.instagram.user.follow.FollowButtonBase r0 = (com.instagram.user.follow.FollowButtonBase) r0
            X.4at r1 = r0.A0J
            com.instagram.common.session.UserSession r0 = r9.A0A
            r1.A03(r14, r0, r11)
            android.view.View r1 = r2.A01()
            r0 = 25
            X.FP7.A00(r1, r0, r9, r11)
        L_0x0093:
            X.2eb r0 = r10.A0D
            if (r0 == 0) goto L_0x009a
            r0.A03(r4)
        L_0x009a:
            r0 = r18
            X.F18.A00(r0, r10, r6)
            A04(r10)
            java.lang.Integer r1 = r9.A02
            if (r1 == 0) goto L_0x00b5
            java.lang.Integer r0 = r9.A03
            if (r0 == 0) goto L_0x00b5
            int r1 = r1.intValue()
            int r0 = r0.intValue()
            r8.A0B(r1, r0)
        L_0x00b5:
            r2 = 2
            X.FOs r1 = new X.FOs
            r0 = r19
            r1.<init>((int) r2, (java.lang.Object) r11, (java.lang.Object) r0, (java.lang.Object) r9)
            r0 = r18
            X.AnonymousClass0fU.A00(r1, r0)
            java.lang.Integer r0 = r9.A01
            int r0 = r0.intValue()
            if (r0 == r5) goto L_0x010a
            if (r0 == r6) goto L_0x00f7
            if (r0 != r2) goto L_0x00e3
            X.2eb r0 = r10.A0C
            r0.A03(r4)
            X.2eb r0 = r10.A0B
            r0.A03(r5)
            X.2eb r0 = r10.A0B
            android.view.View r1 = r0.A01()
            r0 = 27
        L_0x00e0:
            X.FP7.A00(r1, r0, r9, r11)
        L_0x00e3:
            android.view.ViewGroup r2 = r10.A03
            boolean r1 = r9.A04
            r0 = 2130968710(0x7f040086, float:1.7546081E38)
            if (r1 == 0) goto L_0x00ef
            r0 = 2130969338(0x7f0402fa, float:1.7547355E38)
        L_0x00ef:
            int r0 = X.2Yu.A0H(r7, r0)
            X.DbU.A11(r7, r2, r0)
            return
        L_0x00f7:
            X.2eb r0 = r10.A0B
            r0.A03(r4)
            X.2eb r0 = r10.A0C
            r0.A03(r5)
            X.2eb r0 = r10.A0C
            android.view.View r1 = r0.A01()
            r0 = 26
            goto L_0x00e0
        L_0x010a:
            X.2eb r0 = r10.A0C
            r0.A03(r4)
            X.2eb r0 = r10.A0B
            r0.A03(r4)
            goto L_0x00e3
        L_0x0115:
            boolean r0 = r9.A06
            X.2eb r13 = r10.A09
            if (r0 == 0) goto L_0x017d
            r13.A03(r5)
            android.view.View r0 = r13.A01()
            com.instagram.user.follow.FollowButtonBase r0 = (com.instagram.user.follow.FollowButtonBase) r0
            X.4at r12 = r0.A0J
            android.view.View r3 = r13.A01()
            com.instagram.user.follow.FollowButtonBase r3 = (com.instagram.user.follow.FollowButtonBase) r3
            com.instagram.common.session.UserSession r2 = r9.A0A
            X.0Tu r15 = X.0Tu.A05
            r16 = 36326923583895636(0x810f2500003854, double:3.036630979011326E-306)
            r0 = r16
            boolean r0 = X.182.A06(r15, r2, r0)
            if (r0 != 0) goto L_0x015a
            X.0Tu r15 = X.0Tu.A06
            r16 = 36328632980880881(0x8110b300003df1, double:3.037712008547984E-306)
            r0 = r16
            boolean r0 = X.182.A06(r15, r2, r0)
            if (r0 != 0) goto L_0x015a
            r16 = 36328637275848178(0x8110b400003df2, double:3.037714724702597E-306)
            r0 = r16
            boolean r1 = X.182.A06(r15, r2, r0)
            r0 = 0
            if (r1 == 0) goto L_0x015b
        L_0x015a:
            r0 = 1
        L_0x015b:
            r3.A0A = r0
            X.EUB r1 = new X.EUB
            r0 = r19
            r1.<init>(r6, r9, r0)
            r12.A07(r1)
            r12.A03(r14, r2, r11)
            boolean r0 = r9.A05
            if (r0 == 0) goto L_0x0174
            java.lang.String r0 = r14.getModuleName()
            r12.A0K = r0
        L_0x0174:
            android.view.View r0 = r13.A01()
            X.DbT.A1G(r0, r2, r11)
            goto L_0x0093
        L_0x017d:
            if (r13 == 0) goto L_0x0093
            r13.A03(r4)
            goto L_0x0093
        L_0x0184:
            android.widget.TextView r0 = r10.A05
            r0.setVisibility(r4)
            goto L_0x0063
        L_0x018b:
            r8.setGradientSpinnerVisible(r5)
            X.FOs r1 = new X.FOs
            r0 = r19
            r1.<init>((int) r6, (java.lang.Object) r11, (java.lang.Object) r0, (java.lang.Object) r9)
            X.AnonymousClass0fU.A00(r1, r8)
            r0 = 2131963112(0x7f132ce8, float:1.9562968E38)
            goto L_0x0037
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FFY.A03(com.instagram.user.model.User, X.F18, X.F14, java.lang.Integer):void");
    }

    public static void A04(F18 f18) {
        f18.A0E.setAlpha(1.0f);
        f18.A06.setAlpha(1.0f);
        f18.A07.setAlpha(1.0f);
        f18.A05.setAlpha(1.0f);
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [X.F18, java.lang.Object] */
    public static ViewGroup A01(Context context, ViewGroup viewGroup) {
        ViewGroup viewGroup2 = (ViewGroup) DbT.A0C(LayoutInflater.from(context), viewGroup, R.layout.row_user);
        ? obj = new Object();
        obj.A01 = viewGroup2;
        obj.A03 = DbU.A0C(viewGroup2, R.id.row_user_container_base);
        obj.A02 = DbU.A0C(viewGroup2, R.id.text_container);
        obj.A0E = (GradientSpinnerAvatarView) viewGroup2.requireViewById(R.id.row_user_imageview);
        obj.A06 = DbU.A0G(viewGroup2, R.id.row_user_primary_name);
        obj.A07 = DbU.A0G(viewGroup2, R.id.row_user_secondary_name);
        obj.A05 = DbU.A0G(viewGroup2, R.id.row_user_label);
        obj.A00 = viewGroup2.requireViewById(R.id.bottom_row_divider);
        obj.A0B = DbY.A0S(viewGroup2, R.id.overflow_button_stub);
        obj.A0C = DbY.A0S(viewGroup2, R.id.remove_tag_button_stub);
        obj.A09 = DbY.A0S(viewGroup2, R.id.follow_button_stub);
        obj.A0D = DbY.A0S(viewGroup2, R.id.view_profile_button_stub);
        obj.A04 = DbU.A0G(viewGroup2, R.id.row_user_branded_content_brand_tagging_approval_request_pending_label);
        obj.A0A = DbY.A0S(viewGroup2, R.id.user_message_button);
        obj.A08 = DbY.A0S(viewGroup2, R.id.user_email_button);
        viewGroup2.setTag(obj);
        return viewGroup2;
    }

    public static void A02(Context context, User user, F18 f18, String str, boolean z) {
        StringBuilder A0n;
        String fullName = user.getFullName();
        String str2 = "";
        boolean isEmpty = TextUtils.isEmpty(fullName);
        boolean isEmpty2 = TextUtils.isEmpty(str2);
        if (!isEmpty) {
            if (isEmpty2 && z) {
                A0n = AnonymousClass7TE.A1A();
                A0n.append(context.getResources().getString(2131969099));
                A0n.append(" • ");
                A0n.append(fullName);
            } else if (TextUtils.isEmpty(str2)) {
                str2 = fullName;
            } else {
                A0n = AnonymousClass7TF.A0n(fullName);
                A0n.append(" • ");
                A0n.append(str2);
            }
            str2 = A0n.toString();
        } else if (isEmpty2 && z) {
            str2 = context.getResources().getString(2131969099);
        }
        boolean isEmpty3 = TextUtils.isEmpty(str2);
        TextView textView = f18.A07;
        if (isEmpty3) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
            textView.setText(str2);
        }
        TextView textView2 = f18.A06;
        if (str == null) {
            str = user.getUsername();
        }
        textView2.setText(str);
        Context context2 = textView2.getContext();
        textView2.setTextAppearance(context2, R.style.igds_emphasized_body_1);
        textView2.setTypeface(0oh.A03(context, Typeface.DEFAULT_BOLD, AnonymousClass05K.A0C));
        DbY.A12(textView2, context2);
        textView.setTextAppearance(textView.getContext(), R.style.igds_body_1);
        textView.setTypeface(0oh.A03(context, Typeface.DEFAULT, AnonymousClass05K.A00));
        C244273av.A0B(textView2, user.isVerified());
    }
}
