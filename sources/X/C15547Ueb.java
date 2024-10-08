package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.feed.widget.IgProgressImageView;
import com.instagram.genericsurvey.fragment.GenericSurveyFragment;
import com.instagram.ui.widget.framelayout.MediaFrameLayout;

/* renamed from: X.Ueb  reason: case insensitive filesystem */
public final class C15547Ueb extends C231632rz {
    public final GenericSurveyFragment A00;
    public final boolean A01;
    public final FragmentActivity A02;
    public final UserSession A03;
    public final AnonymousClass4DU A04;
    public final VZW A05;

    public final int getViewTypeCount() {
        return 2;
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r4, Object obj, Object obj2) {
        C17927ViI viI = (C17927ViI) obj2;
        AnonymousClass7TF.A1B(r4, 0, viI);
        if (viI.A03 == AnonymousClass05K.A0C && !viI.A06 && !this.A01) {
            r4.A7U(0);
        }
        r4.A7U(1);
    }

    public C15547Ueb(FragmentActivity fragmentActivity, UserSession userSession, AnonymousClass4DU r6, GenericSurveyFragment genericSurveyFragment, VZW vzw) {
        this.A03 = userSession;
        this.A04 = r6;
        this.A00 = genericSurveyFragment;
        this.A05 = vzw;
        this.A02 = fragmentActivity;
        this.A01 = 182.A06(0Tu.A05, userSession, 36320811845428094L);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0114, code lost:
        if (java.lang.Integer.valueOf(r4) == null) goto L_0x0116;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void bindView(int r30, android.view.View r31, java.lang.Object r32, java.lang.Object r33) {
        /*
            r29 = this;
            r0 = -313193541(0xffffffffed550bbb, float:-4.1209055E27)
            int r21 = X.AnonymousClass0fD.A03(r0)
            r14 = 1
            r1 = r31
            r5 = r32
            int r20 = X.DbW.A02(r14, r1, r5)
            java.lang.String r3 = "Required value was null."
            r0 = r30
            if (r30 == 0) goto L_0x024a
            if (r0 != r14) goto L_0x0278
            r4 = r29
            boolean r0 = r4.A01
            com.instagram.common.session.UserSession r9 = r4.A03
            X.4DU r2 = r4.A04
            java.lang.Object r8 = r1.getTag()
            if (r0 == 0) goto L_0x0231
            if (r8 == 0) goto L_0x026f
            X.Wax r8 = (X.C19511Wax) r8
            r0 = r5
            com.instagram.model.reels.Reel r0 = (com.instagram.model.reels.Reel) r0
            r24 = r0
            java.util.List r26 = X.AnonymousClass7TE.A1I(r5)
            X.VZW r11 = r4.A05
            X.VNO r19 = new X.VNO
            r0 = r19
            r0.<init>(r4)
            androidx.fragment.app.FragmentActivity r1 = r4.A02
            boolean r10 = X.DbW.A1S(r14, r9, r2)
            r0 = r20
            X.0qQ.A0B(r8, r0)
            r4 = 3
            r0 = r24
            X.DbW.A1N(r0, r4, r11)
            r0 = 7
            X.0qQ.A0B(r1, r0)
            android.widget.FrameLayout r7 = r8.A01
            android.content.Context r6 = r7.getContext()
            r0 = r24
            X.3uh r12 = r0.A0A(r9, r10)
            X.0qQ.A07(r12)
            X.1Xj r0 = r12.A0b
            r28 = r0
            r28.getClass()
            X.0qQ.A0A(r6)
            int r5 = X.0nA.A09(r6)
            int r15 = X.0nA.A08(r6)
            int r4 = X.0nA.A08(r6)
            X.0hq r0 = r1.getSupportFragmentManager()
            X.06j r0 = r0.A0U
            java.util.List r0 = r0.A04()
            X.0qQ.A07(r0)
            java.lang.Object r0 = X.00k.A0J(r0)
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            r17 = 0
            if (r0 == 0) goto L_0x0116
            X.0hq r0 = r0.getChildFragmentManager()
            if (r0 == 0) goto L_0x0116
            X.06j r0 = r0.A0U
            java.util.List r0 = r0.A04()
            if (r0 == 0) goto L_0x0116
            java.util.Iterator r16 = r0.iterator()
        L_0x009f:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x022d
            java.lang.Object r13 = r16.next()
            r0 = r13
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            java.lang.String r1 = r0.mTag
            java.lang.String r0 = "com.instagram.genericsurvey.fragment.GenericSurveyFragment"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x009f
        L_0x00b6:
            androidx.fragment.app.Fragment r13 = (androidx.fragment.app.Fragment) r13
            if (r13 == 0) goto L_0x0116
            X.2dY r0 = X.2dZ.A0t
            X.2dZ r0 = r0.A05(r13)
            if (r0 == 0) goto L_0x0116
            android.view.ViewGroup r0 = r0.A0Q
            if (r0 == 0) goto L_0x0116
            int r18 = r0.getHeight()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r18)
            if (r0 == 0) goto L_0x0116
            android.content.res.Resources r1 = r6.getResources()
            r0 = 2131165288(0x7f070068, float:1.7944789E38)
            int r0 = r1.getDimensionPixelSize(r0)
            int r17 = r0 * 2
            r0 = 2131165216(0x7f070020, float:1.7944643E38)
            int r0 = r1.getDimensionPixelSize(r0)
            int r17 = r17 + r0
            android.content.res.Resources r1 = r6.getResources()
            int r0 = X.AnonymousClass7TE.A0D(r1)
            int r16 = r0 * 2
            int r0 = X.AnonymousClass7TE.A0C(r1)
            int r0 = r0 * 2
            int r16 = r16 + r0
            r0 = 2131165248(0x7f070040, float:1.7944708E38)
            int r13 = r1.getDimensionPixelSize(r0)
            r0 = 2131165216(0x7f070020, float:1.7944643E38)
            int r0 = r1.getDimensionPixelSize(r0)
            int r16 = r16 + r13
            int r16 = r16 + r0
            int r4 = r4 - r18
            int r4 = r4 - r17
            int r4 = r4 - r16
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            if (r0 != 0) goto L_0x0117
        L_0x0116:
            r4 = r15
        L_0x0117:
            X.0Tu r13 = X.0Tu.A05
            r0 = 36320811845493631(0x8109960001237f, double:3.0327658910359026E-306)
            boolean r18 = X.182.A06(r13, r9, r0)
            com.instagram.common.ui.widget.imageview.CircularImageView r0 = r8.A06
            com.instagram.user.model.User r1 = r12.A0i
            if (r1 == 0) goto L_0x0269
            X.DbU.A1S(r2, r0, r1)
            android.widget.TextView r0 = r8.A04
            r22 = r0
            java.lang.String r1 = r1.getFullName()
            r0.setText(r1)
            com.instagram.feed.widget.IgProgressImageView r13 = r8.A07
            r13.setAdjustViewBounds(r14)
            com.instagram.common.typedurl.ImageUrl r0 = r12.A08(r6)
            if (r0 == 0) goto L_0x0263
            r13.setUrl(r0, r2)
            android.widget.FrameLayout r3 = r8.A02
            int r14 = X.C66582MXn.A04(r3, r5)
            float r2 = (float) r5
            float r0 = (float) r15
            float r2 = r2 / r0
            float r0 = (float) r14
            float r0 = r0 / r2
            int r15 = (int) r0
            java.lang.String r17 = r28.A2u()
            java.lang.String r16 = r28.A2t()
            r0 = 1
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            if (r17 == 0) goto L_0x0191
            if (r16 == 0) goto L_0x0191
            android.view.ViewGroup$LayoutParams r0 = r7.getLayoutParams()
            X.0qQ.A0C(r0, r1)
            if (r18 == 0) goto L_0x016b
            r15 = r4
        L_0x016b:
            r0.height = r15
            if (r18 == 0) goto L_0x0172
            float r14 = (float) r4
            float r14 = r14 * r2
            int r14 = (int) r14
        L_0x0172:
            r0.width = r14
            r7.setLayoutParams(r0)
            android.graphics.drawable.GradientDrawable$Orientation r14 = android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM
            int r2 = android.graphics.Color.parseColor(r17)
            int r0 = android.graphics.Color.parseColor(r16)
            int[] r0 = new int[]{r2, r0}
            android.graphics.drawable.GradientDrawable r2 = new android.graphics.drawable.GradientDrawable
            r2.<init>(r14, r0)
            r0 = 0
            r2.setCornerRadius(r0)
            r7.setBackground(r2)
        L_0x0191:
            boolean r0 = r12.CcK()
            r12 = 8
            android.widget.TextView r14 = r8.A03
            if (r0 == 0) goto L_0x021e
            r14.setVisibility(r10)
            android.content.res.Resources r2 = r6.getResources()
            r0 = 2131957526(0x7f131716, float:1.9551638E38)
            X.DbU.A1A(r2, r14, r0)
            android.view.ViewGroup$LayoutParams r2 = r22.getLayoutParams()
            X.0qQ.A0C(r2, r1)
            android.widget.FrameLayout$LayoutParams r2 = (android.widget.FrameLayout.LayoutParams) r2
            r0 = 48
        L_0x01b3:
            r2.gravity = r0
            r23 = 12
            X.WBF r0 = new X.WBF
            r22 = r0
            r25 = r19
            r27 = r8
            r22.<init>((int) r23, (java.lang.Object) r24, (java.lang.Object) r25, (java.lang.Object) r26, (java.lang.Object) r27)
            X.AnonymousClass0fU.A00(r0, r7)
            float r2 = r28.A0l()
            boolean r0 = r28.CeS()
            if (r0 == 0) goto L_0x01fe
            com.instagram.ui.widget.framelayout.MediaFrameLayout r0 = r8.A08
            r0.A00 = r2
            r0.setVisibility(r10)
            r13.setVisibility(r12)
            X.Tol r1 = r11.A01
            r1.A07(r0)
            r0 = r28
            boolean r0 = r0.A6W(r9)
            if (r0 == 0) goto L_0x01fe
            boolean r0 = r28.A4Y()
            if (r0 == 0) goto L_0x01fe
            boolean r0 = r1.A0E()
            X.C63280KuP.A00(r6, r8, r0)
            X.3TS r0 = r8.A05
            com.instagram.ui.widget.slideouticon.SlideInAndOutIconView r1 = r0.A01()
            r0 = 36
            X.WB4.A00(r1, r6, r8, r11, r0)
        L_0x01fe:
            if (r18 == 0) goto L_0x0215
            float r0 = (float) r4
            float r0 = r0 * r2
            int r0 = (int) r0
            int r0 = java.lang.Math.min(r0, r5)
            int r5 = r5 - r0
            int r5 = r5 / r20
            int r1 = r3.getPaddingTop()
            int r0 = r3.getPaddingBottom()
            r3.setPadding(r5, r1, r5, r0)
        L_0x0215:
            r1 = 1230573634(0x49591042, float:889092.1)
            r0 = r21
            X.AnonymousClass0fD.A0A(r1, r0)
            return
        L_0x021e:
            r14.setVisibility(r12)
            android.view.ViewGroup$LayoutParams r2 = r22.getLayoutParams()
            X.0qQ.A0C(r2, r1)
            android.widget.FrameLayout$LayoutParams r2 = (android.widget.FrameLayout.LayoutParams) r2
            r0 = 16
            goto L_0x01b3
        L_0x022d:
            r13 = r17
            goto L_0x00b6
        L_0x0231:
            if (r8 == 0) goto L_0x0290
            X.Fkg r8 = (X.C50901Fkg) r8
            r1 = r5
            com.instagram.model.reels.Reel r1 = (com.instagram.model.reels.Reel) r1
            java.util.List r10 = X.AnonymousClass7TE.A1I(r5)
            r11 = 0
            X.WXQ r0 = new X.WXQ
            r0.<init>(r4)
            r5 = r2
            r6 = r9
            r7 = r0
            r9 = r1
            X.C48937Emb.A00(r5, r6, r7, r8, r9, r10, r11)
            goto L_0x0215
        L_0x024a:
            java.lang.Object r1 = r1.getTag()
            if (r1 == 0) goto L_0x0287
            X.V3B r1 = (X.V3B) r1
            r0 = 0
            X.0qQ.A0B(r1, r0)
            android.widget.TextView r2 = r1.A00
            android.content.res.Resources r1 = X.DbU.A05(r2)
            r0 = 2131969730(0x7f1346c2, float:1.9576391E38)
            X.DbU.A1A(r1, r2, r0)
            goto L_0x0215
        L_0x0263:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r3)
            throw r0
        L_0x0269:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r3)
            throw r0
        L_0x026f:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            r2.<init>(r3)
            r1 = 878818076(0x3461b31c, float:2.1019918E-7)
            goto L_0x0298
        L_0x0278:
            r0 = 33
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            r2.<init>(r0)
            r1 = -619103737(0xffffffffdb193a07, float:-4.3129473E16)
            goto L_0x0298
        L_0x0287:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            r2.<init>(r3)
            r1 = 723712124(0x2b22f87c, float:5.7898803E-13)
            goto L_0x0298
        L_0x0290:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            r2.<init>(r3)
            r1 = 2111099625(0x7dd4d2e9, float:3.536143E37)
        L_0x0298:
            r0 = r21
            X.AnonymousClass0fD.A0A(r1, r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15547Ueb.bindView(int, android.view.View, java.lang.Object, java.lang.Object):void");
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [X.V3B, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r4v3, types: [X.Wax, java.lang.Object] */
    public final View createView(int i, ViewGroup viewGroup) {
        View A0A;
        Object obj;
        int A032 = AnonymousClass0fD.A03(1513748853);
        0qQ.A0B(viewGroup, 1);
        if (i == 0) {
            A0A = DbU.A0A(DbV.A0D(viewGroup), viewGroup, R.layout.reel_preview_hint_view, false);
            0qQ.A0B(A0A, 1);
            ? obj2 = new Object();
            obj2.A00 = AnonymousClass7TG.A0R(A0A, R.id.hint);
            obj = obj2;
        } else if (i == 1) {
            boolean z = this.A01;
            LayoutInflater A0D = DbV.A0D(viewGroup);
            if (z) {
                A0A = DbU.A0A(A0D, viewGroup, R.layout.reel_preview_content_with_autoplay_view, false);
                0qQ.A0B(A0A, 1);
                ? obj3 = new Object();
                obj3.A00 = A0A;
                obj3.A08 = (MediaFrameLayout) AnonymousClass7TF.A0F(A0A, R.id.preview_video);
                obj3.A07 = (IgProgressImageView) AnonymousClass7TF.A0F(obj3.A00, R.id.preview_image);
                obj3.A06 = DbX.A0a(obj3.A00, R.id.reel_preview_profile_picture);
                obj3.A04 = AnonymousClass7TG.A0R(obj3.A00, R.id.reel_preview_username);
                obj3.A03 = AnonymousClass7TG.A0R(obj3.A00, R.id.reel_preview_subtitle);
                obj3.A02 = (FrameLayout) AnonymousClass7TF.A0F(obj3.A00, R.id.reel_preview_container);
                obj3.A01 = (FrameLayout) AnonymousClass7TF.A0F(obj3.A00, R.id.reel_preview_frame_layout);
                obj3.A05 = new AnonymousClass3TS(DbU.A0D(obj3.A00, R.id.audio_icon_view_stub));
                obj = obj3;
            } else {
                A0A = DbU.A0A(A0D, viewGroup, R.layout.reel_preview_content_view, false);
                A0A.setTag(new C50901Fkg(A0A));
                AnonymousClass0fD.A0A(-1647762688, A032);
                return A0A;
            }
        } else {
            UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException("Unhandled view type");
            AnonymousClass0fD.A0A(1411904802, A032);
            throw unsupportedOperationException;
        }
        A0A.setTag(obj);
        AnonymousClass0fD.A0A(-1647762688, A032);
        return A0A;
    }
}
