package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.K9w  reason: case insensitive filesystem */
public final class C61491K9w extends C231632rz {
    public final Context A00;
    public final AnonymousClass4DH A01;
    public final UserSession A02;
    public final C47522E6i A03;

    public C61491K9w(Context context, AnonymousClass4DH r3, UserSession userSession, C47522E6i e6i) {
        0qQ.A0B(userSession, 3);
        this.A00 = context;
        this.A01 = r3;
        this.A02 = userSession;
        this.A03 = e6i;
    }

    public final int getViewTypeCount() {
        return 1;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v13, resolved type: com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: android.widget.LinearLayout} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v9, resolved type: com.instagram.igds.components.button.IgdsButton} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v48, resolved type: com.instagram.common.ui.widget.imageview.CircularImageView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v61, resolved type: com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v17, resolved type: android.widget.LinearLayout} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v18, resolved type: android.widget.LinearLayout} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v62, resolved type: com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView} */
    /* JADX WARNING: type inference failed for: r5v1, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    /* JADX WARNING: type inference failed for: r2v12, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void bindView(int r20, android.view.View r21, java.lang.Object r22, java.lang.Object r23) {
        /*
            r19 = this;
            r8 = r22
            r0 = 1026181936(0x3d2a4b30, float:0.04157561)
            int r1 = X.AnonymousClass0fD.A03(r0)
            boolean r4 = r8 instanceof X.L2V
            java.lang.String r2 = "null cannot be cast to non-null type com.instagram.share.facebook.upsell.crosspost.ReelsShareToFbRowViewBinder.Holder"
            r10 = 0
            if (r4 != 0) goto L_0x0018
            boolean r0 = r8 instanceof X.L56
            if (r0 != 0) goto L_0x0018
            boolean r0 = r8 instanceof X.L57
            if (r0 == 0) goto L_0x009b
        L_0x0018:
            if (r21 == 0) goto L_0x001e
            java.lang.Object r10 = r21.getTag()
        L_0x001e:
            X.0qQ.A0C(r10, r2)
            X.LAl r10 = (X.C63882LAl) r10
            r0 = r19
            android.content.Context r5 = r0.A00
            X.4DH r9 = r0.A01
            com.instagram.common.session.UserSession r6 = r0.A02
            X.E6i r7 = r0.A03
            r0 = 0
            X.0qQ.A0B(r10, r0)
            X.C51974G9v.A1P(r8, r5, r9, r6)
            r0 = 5
            X.0qQ.A0B(r7, r0)
            X.2D6 r3 = X.2D5.A00(r6)
            if (r4 == 0) goto L_0x00a2
            com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView r2 = r10.A07
            r0 = 8
            r2.setVisibility(r0)
            com.instagram.common.ui.widget.imageview.CircularImageView r2 = r10.A04
            r0 = 0
            r2.setVisibility(r0)
            com.instagram.common.ui.base.IgTextView r2 = r10.A03
            r2.setVisibility(r0)
            r0 = 2131971832(0x7f134ef8, float:1.9580654E38)
            r2.setText(r0)
            com.instagram.common.ui.base.IgTextView r0 = r10.A02
            r2 = 8
            r0.setVisibility(r2)
            com.instagram.igds.components.button.IgdsButton r0 = r10.A05
            r0.setVisibility(r2)
            com.instagram.igds.components.button.IgdsButton r2 = r10.A06
            r0 = 0
            r2.setVisibility(r0)
            r0 = 2131973441(0x7f135541, float:1.9583918E38)
            r2.setText((int) r0)
            r4 = 4
            X.LXh r3 = new X.LXh
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            X.AnonymousClass0fU.A00(r3, r2)
            boolean r0 = X.C367288qV.A08(r6)
            if (r0 == 0) goto L_0x009b
            X.1wn r0 = X.LTD.A00
            if (r0 != 0) goto L_0x009b
            r12 = 2
            X.LgS r11 = new X.LgS
            r13 = r5
            r14 = r9
            r15 = r6
            r16 = r8
            r17 = r10
            r18 = r7
            r11.<init>(r12, r13, r14, r15, r16, r17, r18)
            X.LTD.A00 = r11
            X.1Ng r2 = X.AnonymousClass1Nd.A00(r6)
            java.lang.Class<X.Jy0> r0 = X.C61149Jy0.class
            r2.A01(r11, r0)
        L_0x009b:
            r0 = 561880925(0x217d9f5d, float:8.593065E-19)
            X.AnonymousClass0fD.A0A(r0, r1)
            return
        L_0x00a2:
            boolean r0 = r8 instanceof X.L56
            if (r0 == 0) goto L_0x00b1
            X.L56 r8 = (X.L56) r8
            r2 = r5
            r3 = r9
            r4 = r6
            r5 = r8
            r6 = r10
            X.LTD.A01(r2, r3, r4, r5, r6, r7)
            goto L_0x009b
        L_0x00b1:
            boolean r0 = r8 instanceof X.L57
            if (r0 == 0) goto L_0x009b
            X.L57 r8 = (X.L57) r8
            X.8je r2 = X.C363378jd.A08
            com.facebook.common.callercontext.CallerContext r0 = X.LTD.A01
            r2.A04(r0, r6)
            boolean r0 = r3.A0C()
            r8.A00 = r0
            X.1Xj r2 = r8.A01
            X.3YP r0 = r2.A1k()
            X.3YP r4 = X.AnonymousClass3YP.NOT_SHARED
            boolean r0 = X.AnonymousClass7TF.A1W(r0, r4)
            r3 = 8
            if (r0 != 0) goto L_0x019a
            X.3YP r5 = r2.A1k()
            X.3YP r0 = X.AnonymousClass3YP.SHARING
            if (r5 == r0) goto L_0x019a
            com.instagram.common.ui.widget.imageview.CircularImageView r0 = r10.A04
        L_0x00de:
            r0.setVisibility(r3)
            X.3YP r0 = r2.A1k()
            boolean r0 = X.AnonymousClass7TF.A1W(r0, r4)
            if (r0 != 0) goto L_0x018c
            X.3YP r5 = r2.A1k()
            X.3YP r0 = X.AnonymousClass3YP.SHARING
            if (r5 == r0) goto L_0x018c
            com.instagram.common.ui.base.IgTextView r0 = r10.A03
            r0.setVisibility(r3)
        L_0x00f8:
            X.3YP r0 = r2.A1k()
            boolean r0 = X.AnonymousClass7TF.A1W(r0, r4)
            if (r0 != 0) goto L_0x017e
            X.3YP r5 = r2.A1k()
            X.3YP r0 = X.AnonymousClass3YP.SHARING
            if (r5 == r0) goto L_0x017e
            com.instagram.common.ui.base.IgTextView r0 = r10.A02
            r0.setVisibility(r3)
        L_0x010f:
            X.3YP r0 = r2.A1k()
            boolean r0 = X.AnonymousClass7TF.A1W(r0, r4)
            if (r0 == 0) goto L_0x0122
            X.8sM r5 = X.C368278sM.VIEW
            java.lang.String r0 = r2.getId()
            X.LTD.A02(r5, r6, r0)
        L_0x0122:
            boolean r0 = r8.A00
            if (r0 == 0) goto L_0x0153
            X.3YP r0 = r2.A1k()
            boolean r0 = X.AnonymousClass7TF.A1W(r0, r4)
            r4 = 0
            if (r0 == 0) goto L_0x01bf
            com.instagram.igds.components.button.IgdsButton r0 = r10.A05
            r0.setVisibility(r3)
            com.instagram.igds.components.button.IgdsButton r2 = r10.A06
            r2.setVisibility(r4)
            r0 = 2131971775(0x7f134ebf, float:1.9580539E38)
            r2.setText((int) r0)
            r12 = 7
            X.LXf r11 = new X.LXf
            r13 = r7
            r14 = r10
            r15 = r9
            r16 = r6
            r17 = r8
            r11.<init>(r12, r13, r14, r15, r16, r17)
        L_0x014e:
            X.AnonymousClass0fU.A00(r11, r2)
            goto L_0x009b
        L_0x0153:
            com.instagram.igds.components.button.IgdsButton r0 = r10.A06
            r0.setVisibility(r3)
            X.3YP r0 = r2.A1k()
            boolean r0 = X.AnonymousClass7TF.A1W(r0, r4)
            r4 = 0
            if (r0 == 0) goto L_0x01a4
            com.instagram.igds.components.button.IgdsButton r3 = r10.A05
            r3.setVisibility(r4)
            r2 = 2131238090(0x7f081cca, float:1.8092449E38)
            X.4lx r0 = X.C273084lx.END
            r3.A02(r0, r2)
            android.widget.LinearLayout r2 = r10.A00
            r12 = 6
            X.LXb r11 = new X.LXb
            r13 = r9
            r14 = r10
            r15 = r8
            r16 = r6
            r11.<init>(r12, r13, r14, r15, r16)
            goto L_0x014e
        L_0x017e:
            com.instagram.common.ui.base.IgTextView r5 = r10.A02
            r0 = 0
            r5.setVisibility(r0)
            com.instagram.user.model.User r0 = X.AnonymousClass7TF.A0Q(r6)
            X.DbU.A1H(r5, r0)
            goto L_0x010f
        L_0x018c:
            com.instagram.common.ui.base.IgTextView r5 = r10.A03
            r0 = 0
            r5.setVisibility(r0)
            r0 = 2131971891(0x7f134f33, float:1.9580774E38)
            r5.setText(r0)
            goto L_0x00f8
        L_0x019a:
            com.instagram.common.ui.widget.imageview.CircularImageView r5 = r10.A04
            r0 = 0
            r5.setVisibility(r0)
            com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView r0 = r10.A07
            goto L_0x00de
        L_0x01a4:
            X.3YP r2 = r2.A1k()
            X.3YP r0 = X.AnonymousClass3YP.SHARING
            if (r2 != r0) goto L_0x01dc
            android.widget.LinearLayout r0 = r10.A00
            r0.setEnabled(r4)
            com.instagram.igds.components.button.IgdsButton r3 = r10.A05
            r3.setVisibility(r4)
            r2 = 2131238090(0x7f081cca, float:1.8092449E38)
            X.4lx r0 = X.C273084lx.END
            r3.A02(r0, r2)
            goto L_0x01d7
        L_0x01bf:
            X.3YP r2 = r2.A1k()
            X.3YP r0 = X.AnonymousClass3YP.SHARING
            if (r2 != r0) goto L_0x01df
            com.instagram.igds.components.button.IgdsButton r0 = r10.A05
            r0.setVisibility(r3)
            com.instagram.igds.components.button.IgdsButton r3 = r10.A06
            r3.setVisibility(r4)
            r0 = 2131971775(0x7f134ebf, float:1.9580539E38)
            r3.setText((int) r0)
        L_0x01d7:
            X.JTQ.A1I(r3)
            goto L_0x009b
        L_0x01dc:
            com.instagram.igds.components.button.IgdsButton r0 = r10.A05
            goto L_0x01e1
        L_0x01df:
            com.instagram.igds.components.button.IgdsButton r0 = r10.A06
        L_0x01e1:
            r0.setVisibility(r3)
            r7.A04()
            goto L_0x009b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61491K9w.bindView(int, android.view.View, java.lang.Object, java.lang.Object):void");
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r2, Object obj, Object obj2) {
        if (r2 != null) {
            r2.A7U(0);
        }
    }

    public final void onViewDetachedFromWindow(View view, int i, Object obj, Object obj2) {
        UserSession userSession = this.A02;
        0qQ.A0B(userSession, 0);
        if (LTD.A00 != null) {
            AnonymousClass1Nd.A00(userSession).A02(LTD.A00, C61149Jy0.class);
            LTD.A00 = null;
        }
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A032 = AnonymousClass0fD.A03(5526017);
        Context context = this.A00;
        UserSession userSession = this.A02;
        boolean A06 = 182.A06(DbS.A0J(userSession, 2), userSession, 36329865636495720L);
        int i2 = R.layout.reels_row_share_to_fb_layout;
        if (A06) {
            i2 = R.layout.reels_row_share_to_fb_large_icon_layout;
        }
        View A0A = DbU.A0A(LayoutInflater.from(context), viewGroup, i2, false);
        A0A.setTag(new C63882LAl(A0A));
        AnonymousClass0fD.A0A(519078393, A032);
        return A0A;
    }
}
