package X;

import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.imagebutton.IgImageButton;
import com.instagram.user.model.User;
import java.util.Arrays;

/* renamed from: X.6uD  reason: invalid class name and case insensitive filesystem */
public abstract class C321466uD {
    public static final int A00(UserSession userSession, 1Xj r5) {
        Boolean bool;
        0qQ.A0B(userSession, 0);
        0qQ.A0B(r5, 1);
        User A2A = r5.A2A(userSession);
        String id = r5.getId();
        1iA BR7 = r5.BR7();
        Integer Bd0 = r5.A0C.Bd0();
        if (A2A != null) {
            bool = Boolean.valueOf(r5.A6h(A2A.getId()));
        } else {
            bool = null;
        }
        return Arrays.hashCode(new Object[]{id, BR7, Bd0, bool, r5.A1w()});
    }

    public static final void A03(View.OnClickListener onClickListener, View.OnTouchListener onTouchListener, AnonymousClass0iw r16, UserSession userSession, 1Xj r18, IgImageButton igImageButton, float f, int i, int i2, boolean z, boolean z2) {
        A02(onClickListener, onTouchListener, r16, userSession, r18, (C267644bx) null, (AnonymousClass726) null, igImageButton, (String) null, (String) null, f, i, i2, 0, z, z2, false, false, false);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.instagram.igds.components.imagebutton.IgImageButton, android.view.View, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A04(com.instagram.igds.components.imagebutton.IgImageButton r1) {
        /*
            r0 = 0
            X.0qQ.A0B(r1, r0)
            r0 = 4
            r1.setVisibility(r0)
            r0 = 0
            r1.setContentDescription(r0)
            r1.setOnClickListener(r0)
            r1.setOnTouchListener(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C321466uD.A04(com.instagram.igds.components.imagebutton.IgImageButton):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00c3, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00c4, code lost:
        X.1zE.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00c7, code lost:
        throw r0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0096 A[Catch:{ all -> 0x00c3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00a4 A[Catch:{ all -> 0x00c3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00ac A[Catch:{ all -> 0x00c3 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(android.view.View.OnClickListener r11, android.view.View.OnTouchListener r12, X.AnonymousClass0iw r13, com.instagram.common.session.UserSession r14, com.instagram.common.ui.widget.imageview.IgImageView r15, X.1Xj r16, X.C267644bx r17, X.AnonymousClass726 r18, float r19, int r20, int r21, int r22, boolean r23, boolean r24, boolean r25) {
        /*
            r5 = r16
            r10 = 0
            java.lang.String r0 = "MediaGridItemViewBinder.bindMediaView"
            X.0lp r2 = X.0lq.A00(r0)
            r4 = r15
            r0 = r18
            if (r18 == 0) goto L_0x0011
            r0.ECC(r15, r5)     // Catch:{ all -> 0x00c1 }
        L_0x0011:
            r7 = r20
            r8 = r21
            X.C246673ez.A05(r15, r14, r5, r7, r8)     // Catch:{ all -> 0x00c1 }
            X.6uK r3 = new X.6uK     // Catch:{ all -> 0x00c1 }
            r6 = r17
            r9 = r25
            r3.<init>(r4, r5, r6, r7, r8, r9)     // Catch:{ all -> 0x00c1 }
            r15.A0E = r3     // Catch:{ all -> 0x00c1 }
            r0 = 0
            r15.setColorFilter(r0)     // Catch:{ all -> 0x00c1 }
            r15.A0I = r0     // Catch:{ all -> 0x00c1 }
            r1 = 0
            r15.setVisibility(r10)     // Catch:{ all -> 0x00c1 }
            r0 = 255(0xff, float:3.57E-43)
            r15.setImageAlpha(r0)     // Catch:{ all -> 0x00c1 }
            r15.setOnTouchListener(r12)     // Catch:{ all -> 0x00c1 }
            X.AnonymousClass0fU.A00(r11, r15)     // Catch:{ all -> 0x00c1 }
            if (r11 == 0) goto L_0x003b
            r1 = 1
        L_0x003b:
            r15.setClickable(r1)     // Catch:{ all -> 0x00c1 }
            android.widget.ImageView$ScaleType r0 = android.widget.ImageView.ScaleType.CENTER_CROP     // Catch:{ all -> 0x00c1 }
            r15.setScaleType(r0)     // Catch:{ all -> 0x00c1 }
            java.lang.String r0 = r5.BTL()     // Catch:{ all -> 0x00c1 }
            if (r0 == 0) goto L_0x0055
            int r0 = r0.length()     // Catch:{ all -> 0x00c1 }
            if (r0 == 0) goto L_0x0055
            java.lang.String r0 = r5.BTL()     // Catch:{ all -> 0x00c1 }
            r15.A0K = r0     // Catch:{ all -> 0x00c1 }
        L_0x0055:
            r0 = r19
            r15.A00 = r0     // Catch:{ all -> 0x00c1 }
            X.1Xy r0 = r5.A0C     // Catch:{ all -> 0x00c1 }
            X.DUr r1 = r0.BeN()     // Catch:{ all -> 0x00c1 }
            boolean r0 = r5.A5D()     // Catch:{ all -> 0x00c1 }
            if (r0 == 0) goto L_0x0072
            r3 = r22
            X.1Xj r0 = r5.A1c(r3)     // Catch:{ all -> 0x00c1 }
            if (r0 == 0) goto L_0x0072
            X.1Xj r5 = r5.A1c(r3)     // Catch:{ all -> 0x00c1 }
            goto L_0x0094
        L_0x0072:
            if (r1 == 0) goto L_0x0094
            java.util.List r0 = r1.Bf5()     // Catch:{ all -> 0x00c1 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x00c1 }
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0094
            java.util.List r0 = r1.Bf5()     // Catch:{ all -> 0x00c1 }
            java.lang.Object r0 = r0.get(r10)     // Catch:{ all -> 0x00c1 }
            if (r0 == 0) goto L_0x0094
            java.util.List r0 = r1.Bf5()     // Catch:{ all -> 0x00c1 }
            java.lang.Object r5 = r0.get(r10)     // Catch:{ all -> 0x00c1 }
            X.1Xj r5 = (X.1Xj) r5     // Catch:{ all -> 0x00c1 }
        L_0x0094:
            if (r24 == 0) goto L_0x00a4
            if (r5 == 0) goto L_0x00b6
            android.content.Context r0 = r15.getContext()     // Catch:{ all -> 0x00c1 }
            X.0qQ.A07(r0)     // Catch:{ all -> 0x00c1 }
            com.instagram.model.mediasize.ExtendedImageUrl r8 = r5.A1n(r0)     // Catch:{ all -> 0x00c1 }
            goto L_0x00aa
        L_0x00a4:
            if (r5 == 0) goto L_0x00b6
            com.instagram.common.typedurl.ImageUrl r8 = r5.A1Q()     // Catch:{ all -> 0x00c1 }
        L_0x00aa:
            if (r8 == 0) goto L_0x00b6
            X.1Tw r12 = X.1Tw.A03     // Catch:{ all -> 0x00c1 }
            r9 = r13
            r11 = r23
            r7 = r15
            r7.setUrl(r8, r9, r10, r11, r12)     // Catch:{ all -> 0x00c1 }
            goto L_0x00bd
        L_0x00b6:
            java.lang.String r1 = "MediaGridItemViewBinder"
            java.lang.String r0 = "tried to bind a media grid item with a null image url"
            X.0wb.A03(r1, r0)     // Catch:{ all -> 0x00c1 }
        L_0x00bd:
            r2.close()
            return
        L_0x00c1:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00c3 }
        L_0x00c3:
            r0 = move-exception
            X.1zE.A00(r2, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C321466uD.A01(android.view.View$OnClickListener, android.view.View$OnTouchListener, X.0iw, com.instagram.common.session.UserSession, com.instagram.common.ui.widget.imageview.IgImageView, X.1Xj, X.4bx, X.726, float, int, int, int, boolean, boolean, boolean):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: com.instagram.common.ui.widget.imageview.IgImageView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: com.instagram.igds.components.imagebutton.IgImageButton} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v2, resolved type: com.instagram.igds.components.imagebutton.IgImageButton} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v3, resolved type: com.instagram.igds.components.imagebutton.IgImageButton} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0082 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00c8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A02(android.view.View.OnClickListener r16, android.view.View.OnTouchListener r17, X.AnonymousClass0iw r18, com.instagram.common.session.UserSession r19, X.1Xj r20, X.C267644bx r21, X.AnonymousClass726 r22, com.instagram.igds.components.imagebutton.IgImageButton r23, java.lang.String r24, java.lang.String r25, float r26, int r27, int r28, int r29, boolean r30, boolean r31, boolean r32, boolean r33, boolean r34) {
        /*
            r0 = 1
            r5 = r23
            X.0qQ.A0B(r5, r0)
            r0 = 2
            r6 = r20
            X.0qQ.A0B(r6, r0)
            r11 = r28
            r10 = r27
            r9 = r26
            r15 = r34
            r7 = r21
            r14 = r32
            r4 = r19
            r13 = r31
            r3 = r18
            r12 = r29
            r1 = r16
            r2 = r17
            r8 = r22
            A01(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            if (r30 == 0) goto L_0x01df
            X.3X1 r1 = r6.A1w()
            X.3X1 r0 = X.AnonymousClass3X1.PREVIEW
            if (r1 != r0) goto L_0x013d
            X.0Tu r2 = X.0Tu.A05
            r0 = 36315894107868825(0x81051d00000e99, double:3.029655893959835E-306)
            boolean r0 = X.182.A06(r2, r4, r0)
            if (r0 == 0) goto L_0x013d
            X.6uM r0 = X.C321546uM.A0D
        L_0x0042:
            r5.setIcon(r0)
        L_0x0045:
            X.3QO r1 = r6.A1t()
            X.3QO r0 = X.AnonymousClass3QO.CLOSE_FRIENDS
            if (r1 != r0) goto L_0x00c8
            X.6uM r0 = X.C321546uM.A09
            r5.setSecondaryIcon(r0)
        L_0x0052:
            r0 = 0
            r5.setMediaOverlay(r0)
            java.lang.String r0 = r6.getId()
            if (r0 == 0) goto L_0x007a
            java.lang.String r0 = r6.getId()
            r1 = r25
            boolean r0 = X.0qQ.A0K(r0, r1)
            if (r0 == 0) goto L_0x007a
            X.0Tu r2 = X.0Tu.A05
            r0 = 36322551307249907(0x810b2b000128f3, double:3.033865933654822E-306)
            boolean r0 = X.182.A06(r2, r4, r0)
            if (r0 == 0) goto L_0x007a
            X.6uN r0 = X.C321556uN.JUST_SEEN
            r5.setMediaOverlay(r0)
        L_0x007a:
            X.1Xy r0 = r6.A0C
            com.instagram.user.model.User r0 = r0.CCd()
            if (r33 == 0) goto L_0x00c3
            if (r0 == 0) goto L_0x00c3
            com.instagram.common.typedurl.ImageUrl r1 = r0.Bh3()
            java.lang.String r0 = r0.getUsername()
            r5.setUserInfo(r1, r0)
        L_0x008f:
            if (r21 == 0) goto L_0x00bd
            boolean r0 = X.C321566uO.A00(r4, r6)
            if (r0 == 0) goto L_0x00bd
            X.6jB r0 = X.C314986jA.A00(r4)
            X.0xa r1 = r0.A01
            java.lang.String r2 = "is_content_preview_nux_in_own_profile_shown"
            r0 = 0
            boolean r0 = r1.getBoolean(r2, r0)
            if (r0 != 0) goto L_0x00bd
            X.6jB r0 = X.C314986jA.A00(r4)
            r1 = 1
            X.0xa r0 = r0.A01
            X.0xY r0 = r0.AR4()
            r0.E5T(r2, r1)
            r0.apply()
            r0 = 2131961993(0x7f132889, float:1.9560699E38)
            r7.EvS(r5, r0)
        L_0x00bd:
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            X.2eS.A04(r5, r0)
            return
        L_0x00c3:
            r0 = 0
            r5.setUserInfoInternal(r0, r0)
            goto L_0x008f
        L_0x00c8:
            boolean r0 = r6.A5m()
            if (r0 == 0) goto L_0x012f
            boolean r0 = r6.CeS()
            if (r0 == 0) goto L_0x012f
            X.0Tu r2 = X.0Tu.A05
            r0 = 2342163288486060216(0x2081091a002c20b8, double:4.0658226795139635E-152)
            boolean r0 = X.182.A06(r2, r4, r0)
            if (r0 == 0) goto L_0x012f
            android.text.Spannable r0 = X.C306386Ly.A0d
            android.content.Context r2 = r5.getContext()
            X.0qQ.A07(r2)
            android.content.res.Resources r3 = r5.getResources()
            r0 = 2131165266(0x7f070052, float:1.7944744E38)
            float r0 = r3.getDimension(r0)
            float r0 = X.0nA.A00(r2, r0)
            int r0 = java.lang.Math.round(r0)
            X.6Ly r8 = new X.6Ly
            r8.<init>(r2, r0)
            long r0 = r6.A1B()
            java.lang.String r0 = X.1G0.A02(r0)
            r8.A0M(r0)
            r0 = 2131165207(0x7f070017, float:1.7944625E38)
            float r0 = r3.getDimension(r0)
            r8.A0A(r0)
            int r0 = X.2Yu.A0A(r2)
            int r0 = r2.getColor(r0)
            r8.A0F(r0)
            X.5nn r9 = X.C295225nn.A03
            r12 = -1
            r10 = 0
            r11 = r5
            r13 = r12
            r14 = r12
            r15 = r12
            com.instagram.igds.components.imagebutton.IgImageButton.A06(r8, r9, r10, r11, r12, r13, r14, r15)
            goto L_0x0052
        L_0x012f:
            X.5nn r9 = X.C295225nn.A06
            r8 = 0
            r12 = -1
            r10 = r8
            r11 = r5
            r13 = r12
            r14 = r12
            r15 = r12
            com.instagram.igds.components.imagebutton.IgImageButton.A06(r8, r9, r10, r11, r12, r13, r14, r15)
            goto L_0x0052
        L_0x013d:
            boolean r0 = X.C321536uL.A02(r4)
            if (r0 == 0) goto L_0x0147
            X.6uM r0 = X.C321546uM.A0I
            goto L_0x0042
        L_0x0147:
            r0 = r24
            if (r24 == 0) goto L_0x0155
            boolean r0 = r6.A6h(r0)
            if (r0 == 0) goto L_0x0155
            X.6uM r0 = X.C321546uM.A0J
            goto L_0x0042
        L_0x0155:
            boolean r0 = X.C243203Xv.A00(r4, r6)
            if (r0 == 0) goto L_0x015f
            X.6uM r0 = X.C321546uM.A0M
            goto L_0x0042
        L_0x015f:
            X.0Tu r2 = X.0Tu.A05
            r0 = 36317951397205688(0x8106fc000016b8, double:3.030956932020507E-306)
            boolean r0 = X.182.A06(r2, r4, r0)
            if (r0 == 0) goto L_0x0184
            X.1Xy r0 = r6.A0C
            java.lang.Integer r0 = r0.Alv()
            if (r0 == 0) goto L_0x018b
            int r0 = r0.intValue()
            if (r0 <= 0) goto L_0x018b
        L_0x017a:
            boolean r0 = r6.CcK()
            if (r0 != 0) goto L_0x018b
            X.6uM r0 = X.C321546uM.A08
            goto L_0x0042
        L_0x0184:
            boolean r0 = r6.A5D()
            if (r0 == 0) goto L_0x018b
            goto L_0x017a
        L_0x018b:
            boolean r0 = r6.CeS()
            if (r0 == 0) goto L_0x01ab
            boolean r0 = r6.A5G()
            if (r0 != 0) goto L_0x01a7
            boolean r0 = r6.CcK()
            if (r0 != 0) goto L_0x01a7
            boolean r0 = r6.A5I()
            if (r0 != 0) goto L_0x01a7
            X.6uM r0 = X.C321546uM.A0N
            goto L_0x0042
        L_0x01a7:
            X.6uM r0 = X.C321546uM.A0K
            goto L_0x0042
        L_0x01ab:
            boolean r0 = r6.A4g()
            if (r0 == 0) goto L_0x01cb
            X.5nn r9 = X.C295225nn.A06
            r1 = 2131238218(0x7f081d4a, float:1.8092708E38)
            r12 = -1
            android.content.Context r0 = r5.getContext()
            android.graphics.drawable.Drawable r8 = r0.getDrawable(r1)
            if (r8 == 0) goto L_0x0045
            r10 = 0
            r11 = r5
            r13 = r12
            r14 = r12
            r15 = r12
            com.instagram.igds.components.imagebutton.IgImageButton.A05(r8, r9, r10, r11, r12, r13, r14, r15)
            goto L_0x0045
        L_0x01cb:
            java.lang.String r0 = r3.getModuleName()
            boolean r0 = X.C324476zN.A0U(r4, r0)
            if (r0 != 0) goto L_0x01df
            boolean r0 = r6.A4u()
            if (r0 == 0) goto L_0x01df
            X.6uM r0 = X.C321546uM.A0L
            goto L_0x0042
        L_0x01df:
            r5.A0H()
            goto L_0x0045
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C321466uD.A02(android.view.View$OnClickListener, android.view.View$OnTouchListener, X.0iw, com.instagram.common.session.UserSession, X.1Xj, X.4bx, X.726, com.instagram.igds.components.imagebutton.IgImageButton, java.lang.String, java.lang.String, float, int, int, int, boolean, boolean, boolean, boolean, boolean):void");
    }
}
