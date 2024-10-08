package X;

import android.graphics.Typeface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.profile.bindergroup.AccountLinkModel;

/* renamed from: X.EAu  reason: case insensitive filesystem */
public final class C47634EAu extends C231632rz {
    public final AnonymousClass0iw A00;
    public final UserSession A01;
    public final 0sP A02;
    public final 0sP A03;

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r4, Object obj, Object obj2) {
        boolean A1U = AnonymousClass7TF.A1U(0, r4, obj);
        if (obj instanceof AccountLinkModel.BottomMessageData) {
            r4.A7U(A1U ? 1 : 0);
        } else {
            r4.A7U(0);
        }
    }

    public final int getViewTypeCount() {
        return 2;
    }

    public static void A00(TextView textView, C49663F0u f0u) {
        f0u.A07.setVisibility(8);
        f0u.A04.setVisibility(8);
        textView.setTypeface(Typeface.defaultFromStyle(1));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0212, code lost:
        if ((r13 instanceof com.instagram.profile.bindergroup.AccountLinkModel.AddFacebookPageLinkData) != false) goto L_0x0214;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0257, code lost:
        if (r8 != false) goto L_0x0259;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void bindView(int r17, android.view.View r18, java.lang.Object r19, java.lang.Object r20) {
        /*
            r16 = this;
            r13 = r19
            r0 = -1648940696(0xffffffff9db72968, float:-4.848251E-21)
            int r5 = X.AnonymousClass0fD.A03(r0)
            r12 = 1
            r0 = r18
            int r3 = X.DbW.A02(r12, r0, r13)
            r1 = r17
            if (r17 == 0) goto L_0x0034
            if (r1 != r12) goto L_0x002d
            java.lang.Object r1 = r0.getTag()
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.profile.bindergroup.AccountLinkBottomMessageViewBinder.Holder"
            X.0qQ.A0C(r1, r0)
            X.Ewg r1 = (X.C49501Ewg) r1
            com.instagram.profile.bindergroup.AccountLinkModel$BottomMessageData r13 = (com.instagram.profile.bindergroup.AccountLinkModel.BottomMessageData) r13
            X.Dba.A0j(r12, r1, r13)
            android.widget.TextView r1 = r1.A00
            java.lang.CharSequence r0 = r13.A00
            X.DbX.A1G(r1, r0)
        L_0x002d:
            r0 = -1319326000(0xffffffffb15caed0, float:-3.2113583E-9)
            X.AnonymousClass0fD.A0A(r0, r5)
            return
        L_0x0034:
            java.lang.Object r10 = r0.getTag()
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.profile.bindergroup.AccountLinkViewBinder.Holder"
            X.0qQ.A0C(r10, r0)
            X.F0u r10 = (X.C49663F0u) r10
            com.instagram.profile.bindergroup.AccountLinkModel r13 = (com.instagram.profile.bindergroup.AccountLinkModel) r13
            r0 = r16
            X.0sP r2 = r0.A02
            X.0sP r1 = r0.A03
            X.0iw r8 = r0.A00
            boolean r9 = X.DbW.A1S(r12, r10, r13)
            X.AnonymousClass7TG.A0w(r3, r2, r1, r8)
            android.view.View r11 = r10.A00
            r0 = 18
            X.FPG.A00(r11, r0, r13, r2)
            android.widget.TextView r7 = r10.A02
            r7.setVisibility(r9)
            com.instagram.common.ui.base.IgSimpleImageView r6 = r10.A06
            r6.setVisibility(r9)
            r0 = 19
            X.FPG.A00(r6, r0, r13, r1)
            com.instagram.common.ui.base.IgSimpleImageView r4 = r10.A05
            int r0 = r13.A00
            r4.setImageResource(r0)
            android.widget.TextView r3 = r10.A03
            r2 = r13
            boolean r1 = r13 instanceof com.instagram.profile.bindergroup.AccountLinkModel.FacebookPageLinkData
            if (r1 == 0) goto L_0x01a6
            com.instagram.profile.bindergroup.AccountLinkModel$FacebookPageLinkData r2 = (com.instagram.profile.bindergroup.AccountLinkModel.FacebookPageLinkData) r2
            java.lang.String r0 = r2.A01
        L_0x0078:
            r3.setText(r0)
            boolean r0 = r13 instanceof com.instagram.profile.bindergroup.AccountLinkModel.FacebookLinkData
            r2 = 8
            if (r0 == 0) goto L_0x0094
            r4.setVisibility(r9)
            A00(r3, r10)
            com.instagram.profile.bindergroup.AccountLinkModel$FacebookLinkData r13 = (com.instagram.profile.bindergroup.AccountLinkModel.FacebookLinkData) r13
            java.lang.String r0 = r13.A00
            r7.setText(r0)
        L_0x008e:
            android.widget.TextView r0 = r10.A01
        L_0x0090:
            r0.setVisibility(r2)
            goto L_0x002d
        L_0x0094:
            boolean r15 = r13 instanceof com.instagram.profile.bindergroup.AccountLinkModel.FacebookLinkDataV2
            java.lang.String r14 = "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams"
            r0 = 0
            if (r15 == 0) goto L_0x00e0
            r4.setVisibility(r9)
            A00(r3, r10)
            com.instagram.profile.bindergroup.AccountLinkModel$FacebookLinkDataV2 r13 = (com.instagram.profile.bindergroup.AccountLinkModel.FacebookLinkDataV2) r13
            java.lang.String r1 = r13.A00
        L_0x00a5:
            r7.setText(r1)
            android.widget.TextView r1 = r10.A01
            r1.setVisibility(r2)
            r1 = 2131238090(0x7f081cca, float:1.8092449E38)
            r6.setImageResource(r1)
            r6.setOnClickListener(r0)
            android.view.ViewGroup$MarginLayoutParams r0 = X.DbW.A0A(r6, r14)
            r0.setMargins(r9, r9, r9, r9)
            r6.setLayoutParams(r0)
            android.graphics.drawable.Drawable r2 = r6.getDrawable()
            android.content.Context r1 = r6.getContext()
            int r0 = X.2Yu.A09(r1)
            X.DbU.A10(r1, r2, r0)
            int r2 = r11.getPaddingLeft()
            int r1 = r11.getPaddingTop()
            int r0 = r11.getPaddingBottom()
            r11.setPadding(r2, r1, r9, r0)
            goto L_0x002d
        L_0x00e0:
            boolean r15 = r13 instanceof com.instagram.profile.bindergroup.AccountLinkModel.ExternalLinkData
            if (r15 == 0) goto L_0x00ee
            r4.setVisibility(r9)
            A00(r3, r10)
            r7.setVisibility(r2)
            goto L_0x008e
        L_0x00ee:
            boolean r15 = r13 instanceof com.instagram.profile.bindergroup.AccountLinkModel.ExternalLinkDataV2
            if (r15 == 0) goto L_0x00fb
            com.instagram.profile.bindergroup.AccountLinkModel$ExternalLinkDataV2 r13 = (com.instagram.profile.bindergroup.AccountLinkModel.ExternalLinkDataV2) r13
            java.lang.String r0 = r13.A01
            X.C49064Eoi.A00(r10, r0)
            goto L_0x002d
        L_0x00fb:
            boolean r15 = r13 instanceof com.instagram.profile.bindergroup.AccountLinkModel.ExternalLinkDataEnhanced
            if (r15 == 0) goto L_0x012d
            com.instagram.profile.bindergroup.AccountLinkModel$ExternalLinkDataEnhanced r13 = (com.instagram.profile.bindergroup.AccountLinkModel.ExternalLinkDataEnhanced) r13
            java.lang.String r0 = r13.A03
            X.C49064Eoi.A00(r10, r0)
            android.widget.TextView r1 = r10.A01
            boolean r0 = r13.A05
            int r0 = X.DbW.A01(r0)
            r1.setVisibility(r0)
            java.lang.String r1 = r13.A02
            if (r1 == 0) goto L_0x016d
            int r0 = r1.length()
            if (r0 == 0) goto L_0x016d
            r4.setVisibility(r2)
            com.instagram.common.ui.base.IgFrameLayout r0 = r10.A04
            r0.setVisibility(r2)
            com.instagram.common.ui.widget.imageview.IgImageView r0 = r10.A07
            r0.setVisibility(r9)
            X.DbV.A1P(r8, r0, r1)
            goto L_0x002d
        L_0x012d:
            boolean r8 = r13 instanceof com.instagram.profile.bindergroup.AccountLinkModel.AddExternalLinkData
            if (r8 == 0) goto L_0x0150
            r4.setVisibility(r9)
            com.instagram.common.ui.widget.imageview.IgImageView r0 = r10.A07
            r0.setVisibility(r2)
            com.instagram.common.ui.base.IgFrameLayout r0 = r10.A04
            r0.setVisibility(r2)
            android.graphics.Typeface r0 = android.graphics.Typeface.DEFAULT
            r3.setTypeface(r0)
            r7.setVisibility(r2)
            android.widget.TextView r0 = r10.A01
            r0.setVisibility(r2)
            r6.setVisibility(r2)
            goto L_0x002d
        L_0x0150:
            boolean r8 = r13 instanceof com.instagram.profile.bindergroup.AccountLinkModel.AddExternalLinkDataV2
            if (r8 != 0) goto L_0x0237
            boolean r8 = r13 instanceof com.instagram.profile.bindergroup.AccountLinkModel.AddExternalLinkDataEnhanced
            if (r8 != 0) goto L_0x0237
            boolean r15 = r13 instanceof com.instagram.profile.bindergroup.AccountLinkModel.AddFacebookLinkData
            r8 = 1050253722(0x3e99999a, float:0.3)
            if (r15 != 0) goto L_0x0214
            if (r1 == 0) goto L_0x0210
            r4.setVisibility(r9)
            A00(r3, r10)
            com.instagram.profile.bindergroup.AccountLinkModel$FacebookPageLinkData r13 = (com.instagram.profile.bindergroup.AccountLinkModel.FacebookPageLinkData) r13
            java.lang.String r1 = r13.A00
            goto L_0x00a5
        L_0x016d:
            java.lang.String r3 = r13.A00
            if (r3 == 0) goto L_0x019a
            int r0 = r3.length()
            if (r0 == 0) goto L_0x019a
            r4.setVisibility(r2)
            com.instagram.common.ui.widget.imageview.IgImageView r0 = r10.A07
            r0.setVisibility(r2)
            com.instagram.common.ui.base.IgFrameLayout r0 = r10.A04
            r0.setVisibility(r9)
            com.instagram.common.ui.widget.imageview.IgImageView r1 = r10.A08
            X.DbV.A1P(r8, r1, r3)
            android.content.Context r0 = r1.getContext()
            int r0 = X.2Yu.A01(r0)
            android.graphics.ColorFilter r0 = X.AnonymousClass37O.A00(r0)
            r1.setColorFilter(r0)
            goto L_0x002d
        L_0x019a:
            r4.setVisibility(r9)
            com.instagram.common.ui.widget.imageview.IgImageView r0 = r10.A07
            r0.setVisibility(r2)
            com.instagram.common.ui.base.IgFrameLayout r0 = r10.A04
            goto L_0x0090
        L_0x01a6:
            boolean r0 = r13 instanceof com.instagram.profile.bindergroup.AccountLinkModel.FacebookLinkDataV2
            if (r0 == 0) goto L_0x01b0
            com.instagram.profile.bindergroup.AccountLinkModel$FacebookLinkDataV2 r2 = (com.instagram.profile.bindergroup.AccountLinkModel.FacebookLinkDataV2) r2
            java.lang.String r0 = r2.A01
            goto L_0x0078
        L_0x01b0:
            boolean r0 = r13 instanceof com.instagram.profile.bindergroup.AccountLinkModel.FacebookLinkData
            if (r0 == 0) goto L_0x01ba
            com.instagram.profile.bindergroup.AccountLinkModel$FacebookLinkData r2 = (com.instagram.profile.bindergroup.AccountLinkModel.FacebookLinkData) r2
            java.lang.String r0 = r2.A01
            goto L_0x0078
        L_0x01ba:
            boolean r0 = r13 instanceof com.instagram.profile.bindergroup.AccountLinkModel.ExternalLinkDataV2
            if (r0 == 0) goto L_0x01c4
            com.instagram.profile.bindergroup.AccountLinkModel$ExternalLinkDataV2 r2 = (com.instagram.profile.bindergroup.AccountLinkModel.ExternalLinkDataV2) r2
            java.lang.String r0 = r2.A02
            goto L_0x0078
        L_0x01c4:
            boolean r0 = r13 instanceof com.instagram.profile.bindergroup.AccountLinkModel.ExternalLinkDataEnhanced
            if (r0 == 0) goto L_0x01ce
            com.instagram.profile.bindergroup.AccountLinkModel$ExternalLinkDataEnhanced r2 = (com.instagram.profile.bindergroup.AccountLinkModel.ExternalLinkDataEnhanced) r2
            java.lang.String r0 = r2.A04
            goto L_0x0078
        L_0x01ce:
            boolean r0 = r13 instanceof com.instagram.profile.bindergroup.AccountLinkModel.ExternalLinkData
            if (r0 == 0) goto L_0x01d8
            com.instagram.profile.bindergroup.AccountLinkModel$ExternalLinkData r2 = (com.instagram.profile.bindergroup.AccountLinkModel.ExternalLinkData) r2
            java.lang.String r0 = r2.A00
            goto L_0x0078
        L_0x01d8:
            boolean r0 = r13 instanceof com.instagram.profile.bindergroup.AccountLinkModel.BottomMessageData
            if (r0 == 0) goto L_0x01e2
            com.instagram.profile.bindergroup.AccountLinkModel$BottomMessageData r2 = (com.instagram.profile.bindergroup.AccountLinkModel.BottomMessageData) r2
            java.lang.String r0 = r2.A01
            goto L_0x0078
        L_0x01e2:
            boolean r0 = r13 instanceof com.instagram.profile.bindergroup.AccountLinkModel.AddFacebookPageLinkData
            if (r0 == 0) goto L_0x01ec
            com.instagram.profile.bindergroup.AccountLinkModel$AddFacebookPageLinkData r2 = (com.instagram.profile.bindergroup.AccountLinkModel.AddFacebookPageLinkData) r2
            java.lang.String r0 = r2.A00
            goto L_0x0078
        L_0x01ec:
            boolean r0 = r13 instanceof com.instagram.profile.bindergroup.AccountLinkModel.AddFacebookLinkData
            if (r0 == 0) goto L_0x01f6
            com.instagram.profile.bindergroup.AccountLinkModel$AddFacebookLinkData r2 = (com.instagram.profile.bindergroup.AccountLinkModel.AddFacebookLinkData) r2
            java.lang.String r0 = r2.A00
            goto L_0x0078
        L_0x01f6:
            boolean r0 = r13 instanceof com.instagram.profile.bindergroup.AccountLinkModel.AddExternalLinkDataV2
            if (r0 == 0) goto L_0x0200
            com.instagram.profile.bindergroup.AccountLinkModel$AddExternalLinkDataV2 r2 = (com.instagram.profile.bindergroup.AccountLinkModel.AddExternalLinkDataV2) r2
            java.lang.String r0 = r2.A00
            goto L_0x0078
        L_0x0200:
            boolean r0 = r13 instanceof com.instagram.profile.bindergroup.AccountLinkModel.AddExternalLinkDataEnhanced
            if (r0 == 0) goto L_0x020a
            com.instagram.profile.bindergroup.AccountLinkModel$AddExternalLinkDataEnhanced r2 = (com.instagram.profile.bindergroup.AccountLinkModel.AddExternalLinkDataEnhanced) r2
            java.lang.String r0 = r2.A00
            goto L_0x0078
        L_0x020a:
            com.instagram.profile.bindergroup.AccountLinkModel$AddExternalLinkData r2 = (com.instagram.profile.bindergroup.AccountLinkModel.AddExternalLinkData) r2
            java.lang.String r0 = r2.A00
            goto L_0x0078
        L_0x0210:
            boolean r0 = r13 instanceof com.instagram.profile.bindergroup.AccountLinkModel.AddFacebookPageLinkData
            if (r0 == 0) goto L_0x002d
        L_0x0214:
            r4.setVisibility(r9)
            A00(r3, r10)
            r7.setVisibility(r2)
            android.widget.TextView r0 = r10.A01
            r0.setVisibility(r2)
            r6.setVisibility(r2)
            boolean r0 = r13.A00()
            if (r0 != 0) goto L_0x022d
            r8 = 1065353216(0x3f800000, float:1.0)
        L_0x022d:
            r11.setAlpha(r8)
            if (r0 == 0) goto L_0x025e
            r11.setBackgroundResource(r9)
            goto L_0x002d
        L_0x0237:
            boolean r8 = r13.A00()
            r1 = 0
            r4.setVisibility(r9)
            A00(r3, r10)
            r7.setVisibility(r2)
            r6.setVisibility(r2)
            android.widget.TextView r0 = r10.A01
            r0.setVisibility(r2)
            r0 = 1065353216(0x3f800000, float:1.0)
            if (r8 == 0) goto L_0x0254
            r0 = 1050253722(0x3e99999a, float:0.3)
        L_0x0254:
            r11.setAlpha(r0)
            if (r8 == 0) goto L_0x025e
        L_0x0259:
            r11.setBackgroundResource(r1)
            goto L_0x002d
        L_0x025e:
            android.util.TypedValue r2 = new android.util.TypedValue
            r2.<init>()
            android.content.Context r0 = r11.getContext()
            android.content.res.Resources$Theme r1 = r0.getTheme()
            r0 = 16843534(0x101030e, float:2.369575E-38)
            r1.resolveAttribute(r0, r2, r12)
            int r1 = r2.resourceId
            goto L_0x0259
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47634EAu.bindView(int, android.view.View, java.lang.Object, java.lang.Object):void");
    }

    public C47634EAu(AnonymousClass0iw r1, UserSession userSession, 0sP r3, 0sP r4) {
        this.A01 = userSession;
        this.A02 = r3;
        this.A03 = r4;
        this.A00 = r1;
    }

    public final View createView(int i, ViewGroup viewGroup) {
        View A0A;
        Object f0u;
        int A032 = AnonymousClass0fD.A03(-1373547756);
        0qQ.A0B(viewGroup, 1);
        if (i == 0) {
            A0A = DbU.A0A(DbV.A0D(viewGroup), viewGroup, R.layout.layout_edit_link_row, false);
            f0u = new C49663F0u(A0A);
        } else if (i == 1) {
            A0A = DbU.A0A(DbV.A0D(viewGroup), viewGroup, R.layout.layout_profile_edit_bottom_message_row, false);
            f0u = new C49501Ewg(A0A);
        } else {
            IllegalStateException A0z = AnonymousClass7TE.A0z(AnonymousClass000.A00(972));
            AnonymousClass0fD.A0A(-87482482, A032);
            throw A0z;
        }
        A0A.setTag(f0u);
        AnonymousClass0fD.A0A(-1768997064, A032);
        return A0A;
    }
}
