package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.K9v  reason: case insensitive filesystem */
public final class C61490K9v extends C231632rz {
    public final Context A00;
    public final AnonymousClass4DH A01;
    public final UserSession A02;
    public final C47522E6i A03;

    public C61490K9v(Context context, AnonymousClass4DH r3, UserSession userSession, C47522E6i e6i) {
        0qQ.A0B(userSession, 3);
        this.A00 = context;
        this.A01 = r3;
        this.A02 = userSession;
        this.A03 = e6i;
    }

    public final int getViewTypeCount() {
        return 1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x011f, code lost:
        if (r5 != null) goto L_0x0121;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0125, code lost:
        if (r5.length() == 0) goto L_0x0127;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void bindView(int r18, android.view.View r19, java.lang.Object r20, java.lang.Object r21) {
        /*
            r17 = this;
            r12 = r20
            r0 = -459393065(0xffffffffe49e37d7, float:-2.3348874E22)
            int r2 = X.AnonymousClass0fD.A03(r0)
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.share.facebook.upsell.crosspost.FeedShareToFbRowModel"
            X.0qQ.A0C(r12, r0)
            X.L75 r12 = (X.L75) r12
            if (r19 == 0) goto L_0x00ef
            java.lang.Object r0 = r19.getTag()
            if (r0 == 0) goto L_0x00ef
            java.lang.Object r14 = r19.getTag()
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.share.facebook.upsell.crosspost.FeedShareToFbRowViewBinder.Holder"
            X.0qQ.A0C(r14, r0)
            X.LB7 r14 = (X.LB7) r14
            r0 = r17
            android.content.Context r9 = r0.A00
            X.4DH r8 = r0.A01
            com.instagram.common.session.UserSession r10 = r0.A02
            X.E6i r13 = r0.A03
            r0 = 0
            X.0qQ.A0B(r14, r0)
            X.C51974G9v.A1P(r12, r9, r8, r10)
            r0 = 5
            X.0qQ.A0B(r13, r0)
            X.8jd r1 = X.C363388je.A00(r10)
            com.facebook.common.callercontext.CallerContext r0 = X.C64374Laq.A01
            X.5wF r5 = r1.A00(r0)
            boolean r0 = X.C363558jv.A00(r10)
            r12.A01 = r0
            boolean r0 = X.C363388je.A03(r5)
            r12.A00 = r0
            java.lang.String r4 = r5.A05
            int r0 = r4.length()
            r3 = 0
            if (r0 <= 0) goto L_0x0137
            X.3oV r1 = r14.A05
            r0 = 8
            r1.setVisibility(r0)
            com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView r1 = r14.A09
            r1.setVisibility(r3)
            android.content.Context r0 = r8.getContext()
            X.AnonymousClass3YO.A00(r0, r8, r1, r4)
        L_0x006a:
            com.instagram.common.ui.base.IgTextView r1 = r14.A03
            r1.setSingleLine(r3)
            r4 = 1
            r1.setAccessibilityHeading(r4)
            r1.setVisibility(r3)
            r0 = 2131973602(0x7f1355e2, float:1.9584244E38)
            r1.setText(r0)
            java.lang.String r6 = r5.A04
            X.5w9 r0 = X.AnonymousClass5w8.A05
            X.5w8 r0 = X.AnonymousClass5w9.A00(r10)
            java.lang.String r5 = r0.A05(r9, r10)
            int r0 = r6.length()
            if (r0 <= 0) goto L_0x0116
            if (r5 == 0) goto L_0x0127
            int r0 = r5.length()
            if (r0 == 0) goto L_0x0121
            com.instagram.common.ui.base.IgTextView r1 = r14.A02
            r0 = 2131964456(0x7f133228, float:1.9565694E38)
            X.JTR.A18(r9, r1, r6, r5, r0)
            X.3oV r0 = r14.A07
            r0.setVisibility(r3)
        L_0x00a3:
            X.3oV r0 = r14.A06
            r6 = 8
            r0.setVisibility(r6)
            X.3oV r0 = r14.A04
            r0.setVisibility(r6)
            X.1Xj r11 = r12.A02
            X.3YP r1 = r11.A1k()
            X.3YP r0 = X.AnonymousClass3YP.SHARED
            boolean r1 = X.AnonymousClass7TF.A1W(r1, r0)
            com.instagram.igds.components.button.IgdsButton r5 = r14.A08
            int r0 = r5.getVisibility()
            if (r1 == 0) goto L_0x00f6
            if (r0 == 0) goto L_0x00e7
            X.818 r9 = X.AnonymousClass818.IG_SELF_FEED_LIKES_SHEET
            X.JZY r8 = X.JZY.UNAVAILABLE
            X.JZZ r7 = X.JZZ.FEED
            X.Jqo r4 = new X.Jqo
            r4.<init>()
            java.lang.String r1 = r11.getId()
            java.lang.String r0 = "media_id"
            r4.A06(r0, r1)
            r0 = 58
            java.lang.String r1 = X.C273654mx.A00(r0)
            java.lang.String r0 = "unavailable_reason"
            r4.A06(r0, r1)
            X.JZX.A00(r8, r7, r9, r4, r10)
        L_0x00e7:
            r5.setVisibility(r6)
            com.instagram.common.ui.base.IgTextView r0 = r14.A01
            r0.setVisibility(r3)
        L_0x00ef:
            r0 = 208239092(0xc6979f4, float:1.7986366E-31)
            X.AnonymousClass0fD.A0A(r0, r2)
            return
        L_0x00f6:
            if (r0 == 0) goto L_0x00fe
            X.8sM r1 = X.C368278sM.VIEW
            r0 = 0
            X.C64374Laq.A03(r1, r10, r12, r0)
        L_0x00fe:
            java.lang.String r15 = X.C51972G9s.A0n()
            r0 = 2131973447(0x7f135547, float:1.958393E38)
            r5.setText((int) r0)
            r5.setVisibility(r3)
            X.LXm r7 = new X.LXm
            r16 = r4
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16)
            X.AnonymousClass0fU.A00(r7, r5)
            goto L_0x00ef
        L_0x0116:
            if (r0 != 0) goto L_0x011f
            X.8sM r1 = X.C368278sM.SUPPRESS
            java.lang.String r0 = "empty_name"
            X.C64374Laq.A03(r1, r10, r12, r0)
        L_0x011f:
            if (r5 == 0) goto L_0x0127
        L_0x0121:
            int r0 = r5.length()
            if (r0 != 0) goto L_0x012e
        L_0x0127:
            X.8sM r1 = X.C368278sM.SUPPRESS
            java.lang.String r0 = "empty_audience"
            X.C64374Laq.A03(r1, r10, r12, r0)
        L_0x012e:
            X.3oV r1 = r14.A07
            r0 = 8
            r1.setVisibility(r0)
            goto L_0x00a3
        L_0x0137:
            com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView r1 = r14.A09
            r0 = 8
            r1.setVisibility(r0)
            X.3oV r0 = r14.A05
            r0.setVisibility(r3)
            goto L_0x006a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61490K9v.bindView(int, android.view.View, java.lang.Object, java.lang.Object):void");
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r2, Object obj, Object obj2) {
        if (r2 != null) {
            r2.A7U(0);
        }
    }

    public final void onViewDetachedFromWindow(View view, int i, Object obj, Object obj2) {
        UserSession userSession = this.A02;
        0qQ.A0B(userSession, 0);
        if (C64374Laq.A00 != null) {
            AnonymousClass1Nd.A00(userSession).A02(C64374Laq.A00, C61149Jy0.class);
            C64374Laq.A00 = null;
        }
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A04 = DbX.A04(viewGroup, 977007881);
        Context context = this.A00;
        UserSession userSession = this.A02;
        boolean A06 = 182.A06(DbS.A0J(userSession, 2), userSession, 36329865636495720L);
        int i2 = R.layout.row_share_to_fb_layout;
        if (A06) {
            i2 = R.layout.row_share_to_fb_large_icon_layout;
        }
        View A0A = DbU.A0A(LayoutInflater.from(context), viewGroup, i2, false);
        A0A.setTag(new LB7(A0A));
        AnonymousClass0fD.A0A(1385155892, A04);
        return A0A;
    }
}
