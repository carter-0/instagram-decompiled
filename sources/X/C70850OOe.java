package X;

import android.view.View;

/* renamed from: X.OOe  reason: case insensitive filesystem */
public abstract class C70850OOe {
    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x0011: MOVE  (r6v1 com.instagram.common.session.UserSession) = (r6v0 com.instagram.common.session.UserSession)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0165  */
    public static final void A01(X.C70712OHh r17, X.C67681MsJ r18, X.C307786Rm r19, X.C276544tV r20, com.instagram.user.model.User r21) {
        /*
            r9 = 0
            r8 = r18
            r14 = r19
            X.AnonymousClass7TG.A1O(r8, r14)
            X.0lg r6 = X.C308206Td.A0A(r14)
            boolean r0 = r6 instanceof com.instagram.common.session.UserSession
            r10 = 0
            if (r0 == 0) goto L_0x01aa
            com.instagram.common.session.UserSession r6 = (com.instagram.common.session.UserSession) r6
            if (r6 == 0) goto L_0x01aa
            r15 = r17
            java.util.List r1 = r15.A06
            boolean r0 = X.AnonymousClass7TE.A1b(r1)
            r5 = 0
            r7 = r21
            if (r0 == 0) goto L_0x0050
            java.util.ArrayList r4 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r11 = r1.iterator()
        L_0x002a:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x005e
            java.lang.String r3 = X.AnonymousClass7TE.A18(r11)
            com.instagram.user.model.User r2 = X.DbV.A0j(r6, r3)
            if (r2 == 0) goto L_0x002a
            X.1OP r0 = X.1OP.$redex_init_class
            com.instagram.reels.store.ReelStore r1 = com.instagram.reels.store.ReelStore.A03(r6)
            X.0qQ.A07(r1)
            X.1Nr r0 = new X.1Nr
            r0.<init>(r2)
            com.instagram.model.reels.Reel r0 = r1.A0K(r0, r3, r9)
            r4.add(r0)
            goto L_0x002a
        L_0x0050:
            boolean r1 = r15.A07
            X.1OP r0 = X.1OP.$redex_init_class
            if (r1 == 0) goto L_0x019c
            com.instagram.model.reels.Reel r0 = X.AnonymousClass3PQ.A03(r6, r7)
        L_0x005a:
            java.util.List r4 = X.0sr.A1N(r0)
        L_0x005e:
            java.lang.Object r3 = X.00k.A0O(r4, r9)
            com.instagram.model.reels.Reel r3 = (com.instagram.model.reels.Reel) r3
            if (r3 == 0) goto L_0x00d9
            java.lang.String r1 = r15.A05
            java.lang.String r0 = "image_preview_card"
            boolean r0 = X.Q06.A00(r1, r0)
            if (r0 == 0) goto L_0x00d9
            java.lang.String r0 = "with_preview_card"
            r8.setRenderType(r0)
            X.3BQ r0 = X.AnonymousClass3BQ.IN_FEED_STORIES_TRAY
            X.3BT r11 = new X.3BT
            r11.<init>(r10, r3, r0)
            X.0eM r0 = r8.A06
            com.instagram.common.ui.widget.imageview.IgImageView r2 = X.C66580MXl.A0R(r0)
            X.0iw r1 = X.C308206Td.A07(r14)
            X.AnonymousClass7TF.A1C(r2, r9, r1)
            android.widget.ImageView$ScaleType r0 = android.widget.ImageView.ScaleType.CENTER_CROP
            r2.setScaleType(r0)
            boolean r0 = r11.A06(r6)
            if (r0 != 0) goto L_0x016f
            X.3uh r12 = r11.A00(r6)
            if (r12 == 0) goto L_0x00b8
            X.1Xj r13 = r12.A0b
            if (r13 == 0) goto L_0x00ab
            X.3gz r0 = new X.3gz
            r0.<init>()
            r2.A0A = r0
            java.lang.String r0 = r13.BTL()
            r2.A0K = r0
        L_0x00ab:
            android.content.Context r0 = r2.getContext()
            com.instagram.common.typedurl.ImageUrl r0 = r12.A08(r0)
        L_0x00b3:
            if (r0 == 0) goto L_0x00b8
        L_0x00b5:
            r2.setUrl(r0, r1)
        L_0x00b8:
            X.0eM r0 = r8.A07
            android.widget.TextView r1 = X.JTO.A0I(r0)
            java.lang.String r0 = "null cannot be cast to non-null type android.widget.TextView"
            X.0qQ.A0C(r1, r0)
            android.content.Context r2 = r14.A00
            java.lang.String r0 = X.C241533Po.A00(r6, r11)
            r1.setText(r0)
            boolean r0 = r11.A04(r6)
            if (r0 == 0) goto L_0x0165
            int r0 = X.DbV.A01(r2)
        L_0x00d6:
            r1.setTextColor(r0)
        L_0x00d9:
            com.instagram.common.typedurl.ImageUrl r1 = r7.Bh3()
            X.0iw r0 = X.C308206Td.A07(r14)
            r8.setProfilePicUrl(r1, r0)
            java.lang.Integer r12 = r15.A03
            java.lang.Integer r0 = r15.A04
            r11 = 0
            if (r0 != 0) goto L_0x0163
            android.content.Context r2 = X.AnonymousClass7TE.A0S(r8)
            r1 = 2132017208(0x7f140038, float:1.9672688E38)
            int[] r0 = X.C71382cm.A0F
            android.content.res.TypedArray r1 = r2.obtainStyledAttributes(r1, r0)
            X.0qQ.A07(r1)
            r0 = 5
            int r11 = r1.getDimensionPixelSize(r0, r9)
        L_0x0100:
            r2 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            if (r12 != 0) goto L_0x011b
            if (r1 != 0) goto L_0x0116
            android.content.Context r12 = X.AnonymousClass7TE.A0S(r8)
            r1 = 2132017208(0x7f140038, float:1.9672688E38)
            int[] r0 = X.C71382cm.A0F
            android.content.res.TypedArray r1 = r12.obtainStyledAttributes(r1, r0)
            X.0qQ.A07(r1)
        L_0x0116:
            r0 = 2
            int r2 = r1.getColor(r0, r2)
        L_0x011b:
            if (r11 != 0) goto L_0x0158
            com.instagram.common.ui.widget.imageview.CircularImageView r0 = r8.A03
            r0.setStrokeAlpha(r9)
        L_0x0122:
            java.lang.Integer r0 = r15.A02
            r8.setRingSpacing(r0)
            if (r3 == 0) goto L_0x012a
            r5 = 1
        L_0x012a:
            r8.setShowRing(r5)
            r1 = r20
            if (r3 == 0) goto L_0x014e
            boolean r0 = r3.A16(r6)
            r0 = r0 ^ 1
            r8.setRingActive(r0)
            r13 = 1
            X.WAH r12 = new X.WAH
            r20 = r4
            r19 = r8
            r18 = r3
            r17 = r6
            r16 = r1
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21)
        L_0x014a:
            X.AnonymousClass0fU.A00(r12, r8)
            return
        L_0x014e:
            X.4uI r0 = r15.A00
            if (r0 == 0) goto L_0x01a6
            X.Ojy r12 = new X.Ojy
            r12.<init>(r9, r1, r15, r14)
            goto L_0x014a
        L_0x0158:
            com.instagram.common.ui.widget.imageview.CircularImageView r1 = r8.A03
            int r0 = r1.A00
            r1.setStrokeAlpha(r0)
            r1.A0H(r11, r2)
            goto L_0x0122
        L_0x0163:
            r1 = 0
            goto L_0x0100
        L_0x0165:
            int r0 = X.2Yu.A0E(r2)
            int r0 = r2.getColor(r0)
            goto L_0x00d6
        L_0x016f:
            com.instagram.model.reels.Reel r0 = r11.A03
            X.PFz r12 = r0.A0E
            if (r12 == 0) goto L_0x0192
            X.3I4 r0 = r12.A00
            java.lang.String r0 = r0.getPreview()
            if (r0 == 0) goto L_0x018c
            X.3gz r0 = new X.3gz
            r0.<init>()
            r2.A0A = r0
            X.3I4 r0 = r12.A00
            java.lang.String r0 = r0.getPreview()
            r2.A0K = r0
        L_0x018c:
            com.instagram.model.mediasize.ExtendedImageUrl r0 = r12.A00()
            goto L_0x00b5
        L_0x0192:
            X.1Ns r0 = r0.A0W
            if (r0 == 0) goto L_0x00b8
            com.instagram.common.typedurl.ImageUrl r0 = r0.Ary()
            goto L_0x00b3
        L_0x019c:
            r0 = 1
            X.0qQ.A0B(r7, r0)
            com.instagram.model.reels.Reel r0 = X.AnonymousClass3PQ.A02(r6, r7)
            goto L_0x005a
        L_0x01a6:
            r8.setOnClickListener(r10)
            return
        L_0x01aa:
            java.lang.String r1 = "UserAvatarBinderUtils"
            java.lang.String r0 = "Attempt to render user avatar outside of logged in user context"
            X.1Kn.A02(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70850OOe.A01(X.OHh, X.MsJ, X.6Rm, X.4tV, com.instagram.user.model.User):void");
    }

    public static final C308196Tc A00(2Th r6, String str, int i, int i2) {
        if (View.MeasureSpec.getMode(i) == 0 || View.MeasureSpec.getMode(i2) == 0) {
            1Kn.A02("UserAvatarBinderUtils", "Measure specs  are UNSPECIFIED for UserAvatar");
            return new C308196Tc(r6, (Object) null, 0, 0);
        }
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int[] iArr = new int[2];
        if (Q06.A00(str, "image_preview_card")) {
            iArr[0] = size;
        } else {
            size2 = Math.min(size, size2);
            iArr[0] = size2;
        }
        iArr[1] = size2;
        return new C308196Tc(r6, (Object) null, iArr[0], size2);
    }
}
