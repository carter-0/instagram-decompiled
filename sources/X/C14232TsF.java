package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;

/* renamed from: X.TsF  reason: case insensitive filesystem */
public final class C14232TsF {
    public static final C14232TsF A00 = new Object();

    public static final View A00(Context context, ViewGroup viewGroup) {
        View A09 = DbU.A09(DbT.A0B(context), viewGroup, R.layout.row_feed_media_insights, false);
        A09.setTag(new C14235TsI(A09, AnonymousClass7TF.A0G(A09, R.id.insights_view)));
        return A09;
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [com.instagram.common.accessibility.AccessibleTextView, android.widget.TextView, android.view.View] */
    /* JADX WARNING: type inference failed for: r2v3, types: [com.instagram.common.accessibility.AccessibleTextView, android.widget.TextView, android.view.View] */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00a9, code lost:
        if (X.182.A06(X.0Tu.A05, r13, 36321215572354214L) != false) goto L_0x00ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x01cc, code lost:
        if (r2 == null) goto L_0x01ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x01e5, code lost:
        switch(r2.ordinal()) {
            case 1: goto L_0x0217;
            case 2: goto L_0x0224;
            case 3: goto L_0x0234;
            case 4: goto L_0x0240;
            case 5: goto L_0x01e8;
            case 6: goto L_0x01e8;
            case 7: goto L_0x0261;
            case 8: goto L_0x026d;
            case 9: goto L_0x01e8;
            case 10: goto L_0x0279;
            default: goto L_0x01e8;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x01f6, code lost:
        if (X.182.A06(X.0Tu.A05, r13, 36321215572354214L) != false) goto L_0x00ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x01fa, code lost:
        if (r2 == null) goto L_0x01fc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0213, code lost:
        switch(r2.ordinal()) {
            case 1: goto L_0x0217;
            case 2: goto L_0x0224;
            case 3: goto L_0x0234;
            case 4: goto L_0x0240;
            case 5: goto L_0x0234;
            case 6: goto L_0x024d;
            case 7: goto L_0x0261;
            case 8: goto L_0x026d;
            case 9: goto L_0x0216;
            case 10: goto L_0x0279;
            default: goto L_0x0216;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0217, code lost:
        r2 = X.2Yu.A08(r3);
        r13 = X.2Yu.A0C(r3);
        r1 = 2131969280;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0224, code lost:
        r13 = X.2Yu.A0H(r3, com.instagram.android.R.attr.promoteTextColorInactive);
        r2 = com.instagram.android.R.drawable.secondary_button_selector_panavision_soft_update;
        r1 = 2131970693;
        r0 = 1.0f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0234, code lost:
        r2 = X.2Yu.A0E(r3);
        r13 = com.instagram.android.R.drawable.primary_button_selector_panavision_soft_update;
        r1 = 2131953965;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0240, code lost:
        r2 = X.2Yu.A03(r3);
        r13 = X.2Yu.A0C(r3);
        r1 = 2131968499;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x024d, code lost:
        r13 = X.2Yu.A0E(r3);
        r2 = com.instagram.android.R.drawable.primary_button_selector_panavision_soft_update;
        r1 = 2131957172;
        r0 = 0.4f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x025a, code lost:
        r15 = new X.C14234TsH(r0, r13, r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0261, code lost:
        r2 = X.2Yu.A0E(r3);
        r13 = com.instagram.android.R.drawable.primary_button_selector_panavision_soft_update;
        r1 = 2131962478;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x026d, code lost:
        r2 = X.2Yu.A0E(r3);
        r13 = com.instagram.android.R.drawable.primary_button_selector_panavision_soft_update;
        r1 = 2131970698;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0279, code lost:
        r2 = X.2Yu.A0E(r3);
        r13 = com.instagram.android.R.drawable.primary_button_selector_panavision_soft_update;
        r1 = 2131952249;
     */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00d0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(com.instagram.common.session.UserSession r21, X.C14233TsG r22, X.C14235TsI r23, X.1Xj r24, X.AnonymousClass4DU r25, X.AnonymousClass3W1 r26) {
        /*
            r20 = this;
            r10 = 0
            r12 = r22
            r11 = r23
            boolean r9 = X.AnonymousClass7TF.A1U(r10, r11, r12)
            r13 = r21
            r16 = r25
            r14 = r26
            r0 = r16
            X.C51974G9v.A1M(r14, r0, r13)
            r0 = 5
            r3 = r24
            X.0qQ.A0B(r3, r0)
            boolean r1 = r12.A06
            boolean r2 = r12.A07
            X.1QG r8 = X.1QE.A0E()
            r7 = 8
            if (r1 != 0) goto L_0x002e
            if (r2 != 0) goto L_0x002e
            android.view.View r0 = r11.A00
            r0.setVisibility(r7)
            return
        L_0x002e:
            android.view.View r0 = r11.A00
            r0.setVisibility(r10)
            com.instagram.common.ui.base.IgLinearLayout r6 = r11.A03
            int r0 = X.DbW.A01(r1)
            r6.setVisibility(r0)
            if (r1 == 0) goto L_0x006b
            com.instagram.user.model.User r1 = X.AnonymousClass7TF.A0Q(r13)
            com.instagram.user.model.User r0 = X.C51966G9m.A11(r3)
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x006b
            X.0wc r1 = X.AnonymousClass0kN.A02(r13)
            java.lang.String r0 = "instagram_feed_self_view_insights_cta_impression"
            X.0Aj r3 = X.AnonymousClass7TE.A0e(r1, r0)
            boolean r0 = r3.isSampled()
            if (r0 == 0) goto L_0x006b
            java.lang.String r1 = ""
            java.lang.String r0 = "tool"
            r3.AAJ(r0, r1)
            java.lang.String r0 = "debug"
            r3.AAJ(r0, r1)
            r3.Cgf()
        L_0x006b:
            android.widget.TextView r5 = r11.A01
            int r0 = X.DbW.A01(r2)
            r5.setVisibility(r0)
            if (r2 == 0) goto L_0x00f0
            X.JwC r4 = r12.A01
            java.lang.Object r1 = r4.A03
            X.0sK r1 = (X.0sK) r1
            r0 = r16
            r1.invoke(r14, r0, r5)
            android.content.Context r3 = r5.getContext()
            X.UyC r2 = r12.A02
            boolean r0 = r12.A04
            if (r0 == 0) goto L_0x0090
            X.UyC r2 = X.C16616UyC.UNAVAILABLE
            r5.setEnabled(r10)
        L_0x0090:
            X.0qQ.A0A(r3)
            boolean r1 = r12.A05
            X.0qQ.A0B(r3, r10)
            X.UyC r0 = X.C16616UyC.NOT_DELIVERING
            if (r1 == 0) goto L_0x01e9
            if (r2 != r0) goto L_0x01cc
            X.0Tu r15 = X.0Tu.A05
            r0 = 36321215572354214(0x8109f4000024a6, double:3.033021209528213E-306)
            boolean r0 = X.182.A06(r15, r13, r0)
            if (r0 == 0) goto L_0x01e1
        L_0x00ab:
            int r2 = X.2Yu.A0E(r3)
            r13 = 2131239551(0x7f08227f, float:1.8095412E38)
            r1 = 2131968502(0x7f1341f6, float:1.95739E38)
        L_0x00b5:
            r0 = 1065353216(0x3f800000, float:1.0)
            X.TsH r15 = new X.TsH
            r15.<init>(r0, r2, r13, r1)
        L_0x00bc:
            int r0 = r15.A02
            r5.setText(r0)
            int r0 = r15.A03
            X.DbT.A17(r3, r5, r0)
            int r1 = r15.A01
            r5.setBackgroundResource(r1)
            r0 = 2131239551(0x7f08227f, float:1.8095412E38)
            if (r1 != r0) goto L_0x00d3
            X.1QE.A0H(r5, r5)
        L_0x00d3:
            float r0 = r15.A00
            r5.setAlpha(r0)
            r15 = 11
            X.WBF r0 = new X.WBF
            r17 = r16
            r18 = r11
            r19 = r14
            r14 = r0
            r16 = r12
            r14.<init>((int) r15, (java.lang.Object) r16, (java.lang.Object) r17, (java.lang.Object) r18, (java.lang.Object) r19)
            X.AnonymousClass0fU.A00(r0, r5)
            java.lang.Object r0 = r4.A01
            X.C51965G9l.A1W(r0, r5)
        L_0x00f0:
            java.lang.String r13 = r12.A03
            if (r13 == 0) goto L_0x0161
            int r0 = r13.length()
            if (r0 == 0) goto L_0x0161
            com.instagram.common.accessibility.AccessibleTextView r2 = r11.A02
            boolean r3 = r8.A00
            android.content.Context r8 = r2.getContext()
            android.content.res.Resources r1 = r8.getResources()
            r0 = 2131976633(0x7f1361b9, float:1.9590392E38)
            java.lang.String r7 = X.AnonymousClass7TF.A0d(r1, r0)
            X.U2I r4 = new X.U2I
            r4.<init>(r2, r12, r3)
            android.text.SpannableStringBuilder r5 = new android.text.SpannableStringBuilder
            r5.<init>()
            android.text.SpannableString r3 = new android.text.SpannableString
            r3.<init>(r13)
            r0 = 2130970277(0x7f0406a5, float:1.754926E38)
            int r0 = X.AnonymousClass7TF.A03(r8, r0)
            android.text.style.ForegroundColorSpan r1 = new android.text.style.ForegroundColorSpan
            r1.<init>(r0)
            int r0 = r3.length()
            r3.setSpan(r1, r10, r0, r10)
            r5.append(r3)
            java.lang.String r0 = " "
            r5.append(r0)
            r1 = 32
            r0 = 160(0xa0, float:2.24E-43)
            java.lang.String r0 = r7.replace(r1, r0)
            X.0qQ.A07(r0)
            android.text.SpannableString r1 = new android.text.SpannableString
            r1.<init>(r0)
            int r0 = r1.length()
            r1.setSpan(r4, r10, r0, r10)
            r5.append(r1)
            r2.setText(r5)
            r0 = 0
            r6.setOnClickListener(r0)
            java.lang.Integer r0 = X.AnonymousClass05K.A00
        L_0x015a:
            X.2eS.A04(r2, r0)
            X.DbT.A1H(r2)
            return
        L_0x0161:
            android.content.Context r3 = r6.getContext()
            android.content.res.Resources r1 = r3.getResources()
            r0 = 2131976633(0x7f1361b9, float:1.9590392E38)
            java.lang.String r13 = X.AnonymousClass7TF.A0d(r1, r0)
            com.instagram.common.accessibility.AccessibleTextView r2 = r11.A02
            r2.setText(r13)
            com.instagram.common.ui.base.IgSimpleImageView r4 = r11.A04
            r4.setVisibility(r7)
            boolean r0 = r12.A08
            if (r0 == 0) goto L_0x01aa
            int r5 = r12.A00
            android.content.res.Resources r1 = r3.getResources()
            r0 = 2131961000(0x7f1324a8, float:1.9558685E38)
            java.lang.String r11 = X.AnonymousClass7TF.A0d(r1, r0)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            android.content.res.Resources r1 = r3.getResources()
            r0 = 1000(0x3e8, float:1.401E-42)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = X.C14066TpE.A00(r1, r5, r0, r9)
            X.0qQ.A07(r0)
            java.lang.String r0 = X.002.A0g(r0, r11, r13)
            r2.setText(r0)
            r4.setVisibility(r10)
        L_0x01aa:
            r0 = 2131100371(0x7f0602d3, float:1.7813122E38)
            int r1 = r3.getColor(r0)
            boolean r0 = r8.A00
            if (r0 == 0) goto L_0x01bc
            r0 = 2130970277(0x7f0406a5, float:1.754926E38)
            int r1 = X.AnonymousClass7TF.A03(r3, r0)
        L_0x01bc:
            r2.setTextColor(r1)
            r4.setColorFilter(r1)
            r0 = 7
            X.WB9.A00(r6, r0, r12)
            X.WB9.A00(r2, r7, r12)
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            goto L_0x015a
        L_0x01cc:
            if (r2 != 0) goto L_0x01e1
        L_0x01ce:
            r0 = 2130970880(0x7f040900, float:1.7550483E38)
            int r2 = X.2Yu.A0H(r3, r0)
            r0 = 2130970879(0x7f0408ff, float:1.755048E38)
            int r13 = X.2Yu.A0H(r3, r0)
            r1 = 2131961427(0x7f132653, float:1.955955E38)
            goto L_0x00b5
        L_0x01e1:
            int r0 = r2.ordinal()
            switch(r0) {
                case 1: goto L_0x0217;
                case 2: goto L_0x0224;
                case 3: goto L_0x0234;
                case 4: goto L_0x0240;
                case 5: goto L_0x01e8;
                case 6: goto L_0x01e8;
                case 7: goto L_0x0261;
                case 8: goto L_0x026d;
                case 9: goto L_0x01e8;
                case 10: goto L_0x0279;
                default: goto L_0x01e8;
            }
        L_0x01e8:
            goto L_0x01ce
        L_0x01e9:
            if (r2 != r0) goto L_0x01fa
            X.0Tu r15 = X.0Tu.A05
            r0 = 36321215572354214(0x8109f4000024a6, double:3.033021209528213E-306)
            boolean r0 = X.182.A06(r15, r13, r0)
            if (r0 == 0) goto L_0x020f
            goto L_0x00ab
        L_0x01fa:
            if (r2 != 0) goto L_0x020f
        L_0x01fc:
            int r13 = X.2Yu.A0E(r3)
            r2 = 2131957172(0x7f1315b4, float:1.955092E38)
            r1 = 2131239551(0x7f08227f, float:1.8095412E38)
            r0 = 1065353216(0x3f800000, float:1.0)
            X.TsH r15 = new X.TsH
            r15.<init>(r0, r13, r1, r2)
            goto L_0x00bc
        L_0x020f:
            int r0 = r2.ordinal()
            switch(r0) {
                case 1: goto L_0x0217;
                case 2: goto L_0x0224;
                case 3: goto L_0x0234;
                case 4: goto L_0x0240;
                case 5: goto L_0x0234;
                case 6: goto L_0x024d;
                case 7: goto L_0x0261;
                case 8: goto L_0x026d;
                case 9: goto L_0x0216;
                case 10: goto L_0x0279;
                default: goto L_0x0216;
            }
        L_0x0216:
            goto L_0x01fc
        L_0x0217:
            int r2 = X.2Yu.A08(r3)
            int r13 = X.2Yu.A0C(r3)
            r1 = 2131969280(0x7f134500, float:1.9575478E38)
            goto L_0x00b5
        L_0x0224:
            r0 = 2130970880(0x7f040900, float:1.7550483E38)
            int r13 = X.2Yu.A0H(r3, r0)
            r2 = 2131239896(0x7f0823d8, float:1.8096112E38)
            r1 = 2131970693(0x7f134a85, float:1.9578344E38)
            r0 = 1065353216(0x3f800000, float:1.0)
            goto L_0x025a
        L_0x0234:
            int r2 = X.2Yu.A0E(r3)
            r13 = 2131239551(0x7f08227f, float:1.8095412E38)
            r1 = 2131953965(0x7f13092d, float:1.9544416E38)
            goto L_0x00b5
        L_0x0240:
            int r2 = X.2Yu.A03(r3)
            int r13 = X.2Yu.A0C(r3)
            r1 = 2131968499(0x7f1341f3, float:1.9573894E38)
            goto L_0x00b5
        L_0x024d:
            int r13 = X.2Yu.A0E(r3)
            r2 = 2131239551(0x7f08227f, float:1.8095412E38)
            r1 = 2131957172(0x7f1315b4, float:1.955092E38)
            r0 = 1053609165(0x3ecccccd, float:0.4)
        L_0x025a:
            X.TsH r15 = new X.TsH
            r15.<init>(r0, r13, r2, r1)
            goto L_0x00bc
        L_0x0261:
            int r2 = X.2Yu.A0E(r3)
            r13 = 2131239551(0x7f08227f, float:1.8095412E38)
            r1 = 2131962478(0x7f132a6e, float:1.9561682E38)
            goto L_0x00b5
        L_0x026d:
            int r2 = X.2Yu.A0E(r3)
            r13 = 2131239551(0x7f08227f, float:1.8095412E38)
            r1 = 2131970698(0x7f134a8a, float:1.9578354E38)
            goto L_0x00b5
        L_0x0279:
            int r2 = X.2Yu.A0E(r3)
            r13 = 2131239551(0x7f08227f, float:1.8095412E38)
            r1 = 2131952249(0x7f130279, float:1.9540935E38)
            goto L_0x00b5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14232TsF.A01(com.instagram.common.session.UserSession, X.TsG, X.TsI, X.1Xj, X.4DU, X.3W1):void");
    }
}
