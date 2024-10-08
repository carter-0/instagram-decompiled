package X;

import com.instagram.common.session.UserSession;
import com.instagram.profile.intf.UserDetailEntryInfo;
import com.instagram.user.model.User;
import java.util.Arrays;

/* renamed from: X.6w0  reason: invalid class name and case insensitive filesystem */
public final class C322546w0 extends C231632rz {
    public final C322556w1 A00;

    public C322546w0(AnonymousClass4DH r25, C229382nI r26, AnonymousClass0iw r27, UserSession userSession, 2el r29, C14029ToV toV, UserDetailEntryInfo userDetailEntryInfo, C46463DfR dfR, C322356vh r33, 2bv r34, C230882qT r35, User user, String str, String str2, String str3, String str4, String str5, boolean z, boolean z2, boolean z3) {
        C14029ToV toV2 = toV;
        0qQ.A0B(toV2, 8);
        String str6 = str2;
        0qQ.A0B(str6, 10);
        C322356vh r12 = r33;
        0qQ.A0B(r12, 16);
        C46463DfR dfR2 = dfR;
        0qQ.A0B(dfR2, 17);
        2el r8 = r29;
        0qQ.A0B(r8, 18);
        String str7 = str5;
        0qQ.A0B(str7, 20);
        2bv r13 = r34;
        UserDetailEntryInfo userDetailEntryInfo2 = userDetailEntryInfo;
        UserSession userSession2 = userSession;
        String str8 = str4;
        AnonymousClass0iw r6 = r27;
        String str9 = str3;
        C229382nI r5 = r26;
        AnonymousClass4DH r4 = r25;
        String str10 = str;
        String str11 = str7;
        String str12 = str6;
        this.A00 = new C322556w1(r4, r5, r6, userSession2, r8, toV2, userDetailEntryInfo2, dfR2, r12, r13, r35, user, str10, str12, str9, str8, str11, z2, z3, z);
    }

    /* JADX WARNING: type inference failed for: r3v25, types: [com.instagram.ui.widget.imageview.PulsingMultiImageView, android.view.View] */
    /* JADX WARNING: type inference failed for: r3v26, types: [com.instagram.ui.widget.imageview.PulsingMultiImageView, android.view.View] */
    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x056d: MOVE  (r4v28 X.6vI) = (r4v22 X.6vI)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0360 A[Catch:{ all -> 0x026a, all -> 0x0b47 }] */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x0600 A[Catch:{ all -> 0x026a, all -> 0x0b47 }] */
    /* JADX WARNING: Removed duplicated region for block: B:205:0x0612 A[Catch:{ all -> 0x026a, all -> 0x0b47 }] */
    /* JADX WARNING: Removed duplicated region for block: B:206:0x0624 A[Catch:{ all -> 0x026a, all -> 0x0b47 }] */
    /* JADX WARNING: Removed duplicated region for block: B:247:0x07b5 A[Catch:{ all -> 0x026a, all -> 0x0b47 }] */
    /* JADX WARNING: Removed duplicated region for block: B:250:0x07d2 A[Catch:{ all -> 0x026a, all -> 0x0b47 }] */
    /* JADX WARNING: Removed duplicated region for block: B:256:0x07e7 A[Catch:{ all -> 0x026a, all -> 0x0b47 }] */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0327 A[Catch:{ all -> 0x026a, all -> 0x0b47 }] */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0348 A[Catch:{ all -> 0x026a, all -> 0x0b47 }] */
    public final void bindView(int r44, android.view.View r45, java.lang.Object r46, java.lang.Object r47) {
        /*
            r43 = this;
            r2 = r47
            r1 = r46
            r0 = 120490181(0x72e88c5, float:1.3130498E-34)
            int r18 = X.AnonymousClass0fD.A03(r0)
            r0 = 1
            r5 = r45
            X.0qQ.A0B(r5, r0)
            r11 = 2
            X.0qQ.A0B(r1, r11)
            r3 = 3
            X.0qQ.A0B(r2, r3)
            r0 = r43
            X.6w1 r0 = r0.A00
            X.6vx r1 = (X.C322516vx) r1
            X.6vy r2 = (X.C322526vy) r2
            X.0qQ.A0B(r1, r11)
            X.0qQ.A0B(r2, r3)
            r16 = 1
            boolean r3 = com.facebook.systrace.Systrace.A0E(r16)
            if (r3 == 0) goto L_0x0037
            r4 = 1196191542(0x474c6f36, float:52335.21)
            java.lang.String r3 = "ProfileHeaderBinderGroup.bindView"
            X.0fS.A01(r3, r4)
        L_0x0037:
            X.4DH r3 = r0.A02     // Catch:{ all -> 0x0b47 }
            r42 = r3
            android.content.Context r3 = r42.getContext()     // Catch:{ all -> 0x0b47 }
            if (r3 != 0) goto L_0x004c
            boolean r0 = com.facebook.systrace.Systrace.A0E(r16)
            if (r0 == 0) goto L_0x0b32
            r0 = -1038198511(0xffffffffc21e5911, float:-39.58698)
            goto L_0x0b2f
        L_0x004c:
            X.6xI r4 = r0.A00     // Catch:{ all -> 0x0b47 }
            java.lang.String r3 = "Required value was null."
            if (r4 == 0) goto L_0x0b3b
            X.6w2 r6 = X.AnonymousClass707.A00(r44)     // Catch:{ all -> 0x0b47 }
            int r6 = r6.ordinal()     // Catch:{ all -> 0x0b47 }
            switch(r6) {
                case 0: goto L_0x005f;
                case 1: goto L_0x013e;
                case 2: goto L_0x0287;
                case 3: goto L_0x044e;
                case 4: goto L_0x04e6;
                case 5: goto L_0x0533;
                case 6: goto L_0x0695;
                case 7: goto L_0x06ba;
                case 8: goto L_0x005d;
                case 9: goto L_0x005d;
                case 10: goto L_0x0717;
                case 11: goto L_0x07f5;
                case 12: goto L_0x0890;
                case 13: goto L_0x08f2;
                case 14: goto L_0x0995;
                case 15: goto L_0x0a26;
                case 16: goto L_0x0a47;
                case 17: goto L_0x0b13;
                default: goto L_0x005d;
            }     // Catch:{ all -> 0x0b47 }
        L_0x005d:
            goto L_0x0b26
        L_0x005f:
            java.lang.Object r8 = r5.getTag()     // Catch:{ all -> 0x0b47 }
            if (r8 == 0) goto L_0x0137
            X.Mfr r8 = (X.C66958Mfr) r8     // Catch:{ all -> 0x0b47 }
            X.9J4 r2 = r1.A01     // Catch:{ all -> 0x0b47 }
            if (r2 == 0) goto L_0x0130
            r5 = 0
            X.0qQ.A0B(r8, r5)     // Catch:{ all -> 0x0b47 }
            android.view.View r0 = r8.A00     // Catch:{ all -> 0x0b47 }
            android.content.Context r6 = r0.getContext()     // Catch:{ all -> 0x0b47 }
            android.widget.TextView r3 = r8.A01     // Catch:{ all -> 0x0b47 }
            java.lang.Object r0 = r2.A04     // Catch:{ all -> 0x0b47 }
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0     // Catch:{ all -> 0x0b47 }
            r3.setText(r0)     // Catch:{ all -> 0x0b47 }
            r3.setContentDescription(r0)     // Catch:{ all -> 0x0b47 }
            X.0qQ.A0A(r6)     // Catch:{ all -> 0x0b47 }
            com.instagram.igds.components.button.IgdsButton r1 = r8.A04     // Catch:{ all -> 0x0b47 }
            java.lang.Object r0 = r2.A01     // Catch:{ all -> 0x0b47 }
            X.9IR r0 = (X.AnonymousClass9IR) r0     // Catch:{ all -> 0x0b47 }
            X.AnonymousClass9P6.A00(r6, r0, r1)     // Catch:{ all -> 0x0b47 }
            com.instagram.igds.components.button.IgdsButton r1 = r8.A05     // Catch:{ all -> 0x0b47 }
            java.lang.Object r0 = r2.A02     // Catch:{ all -> 0x0b47 }
            X.9IR r0 = (X.AnonymousClass9IR) r0     // Catch:{ all -> 0x0b47 }
            X.AnonymousClass9P6.A00(r6, r0, r1)     // Catch:{ all -> 0x0b47 }
            java.lang.Object r7 = r2.A03     // Catch:{ all -> 0x0b47 }
            java.lang.Integer r7 = (java.lang.Integer) r7     // Catch:{ all -> 0x0b47 }
            r6 = 8
            X.3oV r9 = r8.A02     // Catch:{ all -> 0x0b47 }
            if (r7 == 0) goto L_0x00b6
            r9.setVisibility(r5)     // Catch:{ all -> 0x0b47 }
            android.view.View r1 = r9.getView()     // Catch:{ all -> 0x0b47 }
            android.widget.ImageView r1 = (android.widget.ImageView) r1     // Catch:{ all -> 0x0b47 }
            int r0 = r7.intValue()     // Catch:{ all -> 0x0b47 }
            r1.setImageResource(r0)     // Catch:{ all -> 0x0b47 }
        L_0x00b0:
            X.3oV r0 = r8.A03     // Catch:{ all -> 0x0b47 }
            r0.setVisibility(r6)     // Catch:{ all -> 0x0b47 }
            goto L_0x00ba
        L_0x00b6:
            r9.setVisibility(r6)     // Catch:{ all -> 0x0b47 }
            goto L_0x00b0
        L_0x00ba:
            if (r7 == 0) goto L_0x00f4
            r8 = 2131165204(0x7f070014, float:1.7944619E38)
            r7 = 2131165190(0x7f070006, float:1.794459E38)
            android.view.View r0 = r9.getView()     // Catch:{ all -> 0x0b47 }
            android.content.Context r0 = r0.getContext()     // Catch:{ all -> 0x0b47 }
            android.content.res.Resources r6 = r0.getResources()     // Catch:{ all -> 0x0b47 }
            android.view.View r0 = r9.getView()     // Catch:{ all -> 0x0b47 }
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()     // Catch:{ all -> 0x0b47 }
            int r0 = r6.getDimensionPixelSize(r8)     // Catch:{ all -> 0x0b47 }
            r1.width = r0     // Catch:{ all -> 0x0b47 }
            r1.height = r0     // Catch:{ all -> 0x0b47 }
            android.view.View r0 = r9.getView()     // Catch:{ all -> 0x0b47 }
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()     // Catch:{ all -> 0x0b47 }
            java.lang.String r0 = "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams"
            X.0qQ.A0C(r1, r0)     // Catch:{ all -> 0x0b47 }
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1     // Catch:{ all -> 0x0b47 }
            int r0 = r6.getDimensionPixelSize(r7)     // Catch:{ all -> 0x0b47 }
            r1.setMarginEnd(r0)     // Catch:{ all -> 0x0b47 }
        L_0x00f4:
            android.content.res.Resources r1 = r3.getResources()     // Catch:{ all -> 0x0b47 }
            r0 = 2131165216(0x7f070020, float:1.7944643E38)
            int r0 = r1.getDimensionPixelSize(r0)     // Catch:{ all -> 0x0b47 }
            float r0 = (float) r0     // Catch:{ all -> 0x0b47 }
            r3.setTextSize(r5, r0)     // Catch:{ all -> 0x0b47 }
            r0 = 17
            r3.setGravity(r0)     // Catch:{ all -> 0x0b47 }
            java.lang.Object r1 = r2.A05     // Catch:{ all -> 0x0b47 }
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ all -> 0x0b47 }
            X.0qQ.A0B(r1, r5)     // Catch:{ all -> 0x0b47 }
            java.lang.Integer r0 = X.AnonymousClass05K.A00     // Catch:{ all -> 0x0b47 }
            if (r1 != r0) goto L_0x0b26
            com.instagram.profile.fragment.UserDetailFragment r3 = r4.A03     // Catch:{ all -> 0x0b47 }
            X.Dc6 r0 = r3.A10     // Catch:{ all -> 0x0b47 }
            com.instagram.user.model.User r2 = r0.A03     // Catch:{ all -> 0x0b47 }
            boolean r0 = r3.A1a     // Catch:{ all -> 0x0b47 }
            if (r0 != 0) goto L_0x0b26
            if (r2 == 0) goto L_0x0b26
            com.instagram.common.session.UserSession r1 = r3.A0I     // Catch:{ all -> 0x0b47 }
            java.lang.String r0 = r2.getId()     // Catch:{ all -> 0x0b47 }
            X.0qQ.A0B(r1, r5)     // Catch:{ all -> 0x0b47 }
            X.DdQ.A02(r3, r1, r0, r5)     // Catch:{ all -> 0x0b47 }
            r0 = 1
            r3.A1a = r0     // Catch:{ all -> 0x0b47 }
            goto L_0x0b26
        L_0x0130:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0b47 }
            r0.<init>(r3)     // Catch:{ all -> 0x0b47 }
            goto L_0x0b46
        L_0x0137:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0b47 }
            r0.<init>(r3)     // Catch:{ all -> 0x0b47 }
            goto L_0x0b46
        L_0x013e:
            java.lang.Object r11 = r5.getTag()     // Catch:{ all -> 0x0b47 }
            if (r11 == 0) goto L_0x0280
            X.70B r11 = (X.AnonymousClass70B) r11     // Catch:{ all -> 0x0b47 }
            com.instagram.common.session.UserSession r10 = r0.A05     // Catch:{ all -> 0x0b47 }
            X.0iw r5 = r0.A04     // Catch:{ all -> 0x0b47 }
            r22 = r5
            com.instagram.user.model.User r9 = r1.A0E     // Catch:{ all -> 0x0b47 }
            if (r9 == 0) goto L_0x0279
            X.6x7 r3 = r4.A02     // Catch:{ all -> 0x0b47 }
            X.0eM r3 = r3.A0d     // Catch:{ all -> 0x0b47 }
            java.lang.Object r13 = r3.getValue()     // Catch:{ all -> 0x0b47 }
            X.70J r13 = (X.AnonymousClass70J) r13     // Catch:{ all -> 0x0b47 }
            boolean r3 = r0.A0K     // Catch:{ all -> 0x0b47 }
            r41 = r3
            X.2bv r3 = r0.A0B     // Catch:{ all -> 0x0b47 }
            r27 = r3
            X.2qT r3 = r0.A0C     // Catch:{ all -> 0x0b47 }
            r28 = r3
            X.1Xj r3 = r1.A08     // Catch:{ all -> 0x0b47 }
            r40 = r3
            X.6rP r3 = r1.A0C     // Catch:{ all -> 0x0b47 }
            r26 = r3
            X.6vw r3 = r2.A03     // Catch:{ all -> 0x0b47 }
            r39 = r3
            X.0qQ.A07(r39)     // Catch:{ all -> 0x0b47 }
            boolean r3 = r2.A06     // Catch:{ all -> 0x0b47 }
            r38 = r3
            boolean r3 = r2.A0K     // Catch:{ all -> 0x0b47 }
            java.lang.String r4 = r1.A0F     // Catch:{ all -> 0x0b47 }
            r37 = r4
            com.instagram.avatars.coinflip.AvatarCoinFlipConfig r4 = r2.A02     // Catch:{ all -> 0x0b47 }
            r21 = r4
            boolean r4 = r0.A0J     // Catch:{ all -> 0x0b47 }
            r30 = r4
            X.JVM r4 = r1.A09     // Catch:{ all -> 0x0b47 }
            r35 = r4
            com.instagram.aistudio.profile.model.AiStudioProfileBannerModel r4 = r1.A02     // Catch:{ all -> 0x0b47 }
            r33 = r4
            boolean r4 = r1.A0M     // Catch:{ all -> 0x0b47 }
            r34 = r4
            boolean r15 = r1.A0I     // Catch:{ all -> 0x0b47 }
            X.2xy r12 = r1.A0A     // Catch:{ all -> 0x0b47 }
            int r4 = r2.A00     // Catch:{ all -> 0x0b47 }
            r36 = 0
            if (r4 <= 0) goto L_0x019f
            r36 = 1
        L_0x019f:
            java.lang.String r14 = r0.A0F     // Catch:{ all -> 0x0b47 }
            X.4zZ r8 = r1.A03     // Catch:{ all -> 0x0b47 }
            boolean r7 = r2.A07     // Catch:{ all -> 0x0b47 }
            boolean r6 = r2.A0I     // Catch:{ all -> 0x0b47 }
            boolean r5 = r2.A0F     // Catch:{ all -> 0x0b47 }
            r0 = 0
            X.0qQ.A0B(r11, r0)     // Catch:{ all -> 0x0b47 }
            r0 = 5
            X.0qQ.A0B(r13, r0)     // Catch:{ all -> 0x0b47 }
            boolean r0 = com.facebook.systrace.Systrace.A0E(r16)     // Catch:{ all -> 0x0b47 }
            if (r0 == 0) goto L_0x01bf
            r4 = -157591969(0xfffffffff69b565f, float:-1.5753083E33)
            java.lang.String r0 = "ProfileUserInfoViewBinder.bindView"
            X.0fS.A01(r0, r4)     // Catch:{ all -> 0x0b47 }
        L_0x01bf:
            android.content.Context r0 = r42.requireContext()     // Catch:{ all -> 0x026a }
            com.instagram.ui.dynamiclayout.DynamicConstraintLayout r4 = r11.A0R     // Catch:{ all -> 0x026a }
            if (r3 == 0) goto L_0x01c9
            r0 = 0
            goto L_0x01d4
        L_0x01c9:
            android.content.res.Resources r3 = r0.getResources()     // Catch:{ all -> 0x026a }
            r0 = 2131165218(0x7f070022, float:1.7944647E38)
            int r0 = r3.getDimensionPixelSize(r0)     // Catch:{ all -> 0x026a }
        L_0x01d4:
            X.0nA.A0X(r4, r0)     // Catch:{ all -> 0x026a }
            X.70G r3 = r11.AeZ()     // Catch:{ all -> 0x026a }
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.profile.bindergroup.ProfileAvatarViewBinder.Holder"
            X.0qQ.A0C(r3, r0)     // Catch:{ all -> 0x026a }
            X.70F r3 = (X.AnonymousClass70F) r3     // Catch:{ all -> 0x026a }
            X.6x7 r0 = r13.A07     // Catch:{ all -> 0x026a }
            X.0eM r0 = r0.A0W     // Catch:{ all -> 0x026a }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x026a }
            X.6xE r0 = (X.C323276xE) r0     // Catch:{ all -> 0x026a }
            r19 = r42
            r20 = r8
            r23 = r10
            r24 = r3
            r25 = r0
            r29 = r9
            r31 = r7
            r32 = r6
            X.AnonymousClass70L.A02(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)     // Catch:{ all -> 0x026a }
            r19 = r33
            r20 = r42
            r21 = r22
            r22 = r10
            r23 = r40
            r24 = r39
            r25 = r35
            r26 = r12
            r27 = r11
            r28 = r13
            r30 = r37
            r31 = r14
            r32 = r41
            r33 = r38
            r35 = r15
            r37 = r5
            X.AnonymousClass708.A06(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37)     // Catch:{ all -> 0x026a }
            boolean r0 = com.facebook.systrace.Systrace.A0E(r16)     // Catch:{ all -> 0x0b47 }
            if (r0 == 0) goto L_0x022e
            r0 = 1429929271(0x553afd37, float:1.28497945E13)
            X.0fS.A00(r0)     // Catch:{ all -> 0x0b47 }
        L_0x022e:
            int r0 = r2.A00     // Catch:{ all -> 0x0b47 }
            int r0 = r0 + 1
            r2.A00 = r0     // Catch:{ all -> 0x0b47 }
            com.instagram.user.model.User r5 = r1.A0E     // Catch:{ all -> 0x0b47 }
            if (r5 == 0) goto L_0x0b26
            java.lang.String r4 = r5.getId()     // Catch:{ all -> 0x0b47 }
            X.4Cl r0 = r5.A03     // Catch:{ all -> 0x0b47 }
            java.lang.Integer r0 = r0.BPt()     // Catch:{ all -> 0x0b47 }
            r3 = -1
            if (r0 == 0) goto L_0x0268
            int r1 = r0.intValue()     // Catch:{ all -> 0x0b47 }
        L_0x0249:
            r2 = 766842320(0x2db515d0, float:2.0587004E-11)
            java.lang.String r0 = "number_of_media"
            X.AnonymousClass59S.A04(r10, r4, r0, r2, r1)     // Catch:{ all -> 0x0b47 }
            java.lang.String r1 = r5.getId()     // Catch:{ all -> 0x0b47 }
            X.4Cl r0 = r5.A03     // Catch:{ all -> 0x0b47 }
            java.lang.Integer r0 = r0.B6v()     // Catch:{ all -> 0x0b47 }
            if (r0 == 0) goto L_0x0261
            int r3 = r0.intValue()     // Catch:{ all -> 0x0b47 }
        L_0x0261:
            java.lang.String r0 = "number_of_followers"
            X.AnonymousClass59S.A04(r10, r1, r0, r2, r3)     // Catch:{ all -> 0x0b47 }
            goto L_0x0b26
        L_0x0268:
            r1 = -1
            goto L_0x0249
        L_0x026a:
            r1 = move-exception
            boolean r0 = com.facebook.systrace.Systrace.A0E(r16)     // Catch:{ all -> 0x0b47 }
            if (r0 == 0) goto L_0x08f1
            r0 = -667610330(0xffffffffd8351326, float:-7.9637539E14)
            X.0fS.A00(r0)     // Catch:{ all -> 0x0b47 }
            goto L_0x08f1
        L_0x0279:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0b47 }
            r0.<init>(r3)     // Catch:{ all -> 0x0b47 }
            goto L_0x0b46
        L_0x0280:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0b47 }
            r0.<init>(r3)     // Catch:{ all -> 0x0b47 }
            goto L_0x0b46
        L_0x0287:
            java.lang.Object r7 = r5.getTag()     // Catch:{ all -> 0x0b47 }
            if (r7 == 0) goto L_0x0447
            X.70B r7 = (X.AnonymousClass70B) r7     // Catch:{ all -> 0x0b47 }
            com.instagram.common.session.UserSession r6 = r0.A05     // Catch:{ all -> 0x0b47 }
            com.instagram.user.model.User r5 = r1.A0E     // Catch:{ all -> 0x0b47 }
            if (r5 == 0) goto L_0x0440
            X.0iw r8 = r0.A04     // Catch:{ all -> 0x0b47 }
            X.6x7 r3 = r4.A02     // Catch:{ all -> 0x0b47 }
            X.0eM r3 = r3.A0d     // Catch:{ all -> 0x0b47 }
            java.lang.Object r4 = r3.getValue()     // Catch:{ all -> 0x0b47 }
            X.70J r4 = (X.AnonymousClass70J) r4     // Catch:{ all -> 0x0b47 }
            boolean r0 = r0.A0K     // Catch:{ all -> 0x0b47 }
            r32 = r0
            X.1Xj r0 = r1.A08     // Catch:{ all -> 0x0b47 }
            r26 = r0
            X.6rP r11 = r1.A0C     // Catch:{ all -> 0x0b47 }
            X.6vw r0 = r2.A03     // Catch:{ all -> 0x0b47 }
            r25 = r0
            X.0qQ.A07(r25)     // Catch:{ all -> 0x0b47 }
            boolean r15 = r2.A06     // Catch:{ all -> 0x0b47 }
            int r0 = r2.A00     // Catch:{ all -> 0x0b47 }
            r36 = 0
            if (r0 <= 0) goto L_0x02bc
            r36 = 1
        L_0x02bc:
            boolean r13 = r2.A0F     // Catch:{ all -> 0x0b47 }
            r10 = 0
            X.0qQ.A0B(r7, r10)     // Catch:{ all -> 0x0b47 }
            r0 = 5
            X.0qQ.A0B(r4, r0)     // Catch:{ all -> 0x0b47 }
            android.content.Context r0 = r42.requireContext()     // Catch:{ all -> 0x0b47 }
            com.instagram.ui.dynamiclayout.DynamicConstraintLayout r3 = r7.A0R     // Catch:{ all -> 0x0b47 }
            android.content.res.Resources r1 = r0.getResources()     // Catch:{ all -> 0x0b47 }
            r0 = 2131165218(0x7f070022, float:1.7944647E38)
            int r0 = r1.getDimensionPixelSize(r0)     // Catch:{ all -> 0x0b47 }
            X.0nA.A0X(r3, r0)     // Catch:{ all -> 0x0b47 }
            X.70G r9 = r7.AeZ()     // Catch:{ all -> 0x0b47 }
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.profile.bindergroup.ProfileCobroadcastAvatarViewBinder.Holder"
            X.0qQ.A0C(r9, r0)     // Catch:{ all -> 0x0b47 }
            X.FgE r9 = (X.C50653FgE) r9     // Catch:{ all -> 0x0b47 }
            X.6x7 r0 = r4.A07     // Catch:{ all -> 0x0b47 }
            X.0eM r0 = r0.A0W     // Catch:{ all -> 0x0b47 }
            java.lang.Object r3 = r0.getValue()     // Catch:{ all -> 0x0b47 }
            X.6xE r3 = (X.C323276xE) r3     // Catch:{ all -> 0x0b47 }
            r12 = 0
            if (r11 == 0) goto L_0x0328
            com.instagram.model.reels.Reel r0 = r11.A01(r6)     // Catch:{ all -> 0x0b47 }
            if (r0 == 0) goto L_0x0328
            com.instagram.model.reels.Reel r0 = r11.A01(r6)     // Catch:{ all -> 0x0b47 }
            X.1Ns r0 = r0.A0W     // Catch:{ all -> 0x0b47 }
            r0.getClass()     // Catch:{ all -> 0x0b47 }
            com.instagram.user.model.User r14 = r0.CCd()     // Catch:{ all -> 0x0b47 }
        L_0x0305:
            java.util.Set r0 = r11.A03()     // Catch:{ all -> 0x0b47 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0b47 }
            boolean r0 = r0.hasNext()     // Catch:{ all -> 0x0b47 }
            if (r0 == 0) goto L_0x0321
            java.util.Set r0 = r11.A03()     // Catch:{ all -> 0x0b47 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0b47 }
            java.lang.Object r12 = r0.next()     // Catch:{ all -> 0x0b47 }
            com.instagram.user.model.User r12 = (com.instagram.user.model.User) r12     // Catch:{ all -> 0x0b47 }
        L_0x0321:
            boolean r0 = r5.equals(r14)     // Catch:{ all -> 0x0b47 }
            if (r0 == 0) goto L_0x0342
            goto L_0x032c
        L_0x0328:
            r14 = r12
            if (r11 == 0) goto L_0x0321
            goto L_0x0305
        L_0x032c:
            if (r14 == 0) goto L_0x0337
            com.instagram.ui.widget.imageview.PulsingMultiImageView r1 = r9.A08     // Catch:{ all -> 0x0b47 }
            com.instagram.common.typedurl.ImageUrl r0 = r14.Bh3()     // Catch:{ all -> 0x0b47 }
            r1.setAnimatingImageUrl(r0, r8)     // Catch:{ all -> 0x0b47 }
        L_0x0337:
            if (r12 == 0) goto L_0x0342
            com.instagram.ui.widget.imageview.PulsingMultiImageView r1 = r9.A07     // Catch:{ all -> 0x0b47 }
            com.instagram.common.typedurl.ImageUrl r0 = r12.Bh3()     // Catch:{ all -> 0x0b47 }
            r1.setAnimatingImageUrl(r0, r8)     // Catch:{ all -> 0x0b47 }
        L_0x0342:
            boolean r0 = r5.equals(r12)     // Catch:{ all -> 0x0b47 }
            if (r0 == 0) goto L_0x035e
            if (r12 == 0) goto L_0x0353
            com.instagram.ui.widget.imageview.PulsingMultiImageView r0 = r9.A08     // Catch:{ all -> 0x0b47 }
            com.instagram.common.typedurl.ImageUrl r1 = r12.Bh3()     // Catch:{ all -> 0x0b47 }
            r0.setAnimatingImageUrl(r1, r8)     // Catch:{ all -> 0x0b47 }
        L_0x0353:
            if (r14 == 0) goto L_0x035e
            com.instagram.ui.widget.imageview.PulsingMultiImageView r1 = r9.A07     // Catch:{ all -> 0x0b47 }
            com.instagram.common.typedurl.ImageUrl r0 = r14.Bh3()     // Catch:{ all -> 0x0b47 }
            r1.setAnimatingImageUrl(r0, r8)     // Catch:{ all -> 0x0b47 }
        L_0x035e:
            if (r11 == 0) goto L_0x03f3
            com.instagram.ui.widget.gradientspinner.GradientSpinner r12 = r9.A06     // Catch:{ all -> 0x0b47 }
            com.instagram.model.reels.Reel r0 = r11.A01(r6)     // Catch:{ all -> 0x0b47 }
            X.3NV r1 = r0.A0E()     // Catch:{ all -> 0x0b47 }
            r19 = 1
            com.instagram.model.reels.Reel r0 = r11.A01(r6)     // Catch:{ all -> 0x0b47 }
            X.4gL r0 = r0.A0H     // Catch:{ all -> 0x0b47 }
            if (r0 == 0) goto L_0x038f
            com.instagram.model.reels.Reel r0 = r11.A01(r6)     // Catch:{ all -> 0x0b47 }
            X.4gL r0 = r0.A0H     // Catch:{ all -> 0x0b47 }
            X.4w0 r0 = r0.A02     // Catch:{ all -> 0x0b47 }
            if (r0 == 0) goto L_0x038f
            com.instagram.model.reels.Reel r0 = r11.A01(r6)     // Catch:{ all -> 0x0b47 }
            X.4gL r0 = r0.A0H     // Catch:{ all -> 0x0b47 }
            X.4w0 r0 = r0.A02     // Catch:{ all -> 0x0b47 }
            X.4vt r0 = r0.A0A     // Catch:{ all -> 0x0b47 }
            boolean r14 = r0.CVs()     // Catch:{ all -> 0x0b47 }
            r0 = 1
            if (r14 != 0) goto L_0x0390
        L_0x038f:
            r0 = 0
        L_0x0390:
            X.AnonymousClass3NW.A03(r12, r1, r0)     // Catch:{ all -> 0x0b47 }
            com.instagram.model.reels.Reel r0 = r11.A01(r6)     // Catch:{ all -> 0x0b47 }
            X.3NV r22 = r0.A0E()     // Catch:{ all -> 0x0b47 }
            com.instagram.model.reels.Reel r0 = r11.A01(r6)     // Catch:{ all -> 0x0b47 }
            boolean r0 = r0.A0j()     // Catch:{ all -> 0x0b47 }
            java.lang.Boolean r23 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x0b47 }
            com.instagram.model.reels.Reel r0 = r11.A01(r6)     // Catch:{ all -> 0x0b47 }
            X.4gL r0 = r0.A0H     // Catch:{ all -> 0x0b47 }
            if (r0 == 0) goto L_0x043d
            com.instagram.model.reels.Reel r0 = r11.A01(r6)     // Catch:{ all -> 0x0b47 }
            X.4gL r0 = r0.A0H     // Catch:{ all -> 0x0b47 }
            X.4w0 r0 = r0.A02     // Catch:{ all -> 0x0b47 }
            if (r0 == 0) goto L_0x043d
            com.instagram.model.reels.Reel r0 = r11.A01(r6)     // Catch:{ all -> 0x0b47 }
            X.4gL r0 = r0.A0H     // Catch:{ all -> 0x0b47 }
            X.4w0 r0 = r0.A02     // Catch:{ all -> 0x0b47 }
            X.4vt r0 = r0.A0A     // Catch:{ all -> 0x0b47 }
            boolean r0 = r0.CVs()     // Catch:{ all -> 0x0b47 }
            if (r0 == 0) goto L_0x043d
        L_0x03c9:
            java.lang.Boolean r24 = java.lang.Boolean.valueOf(r19)     // Catch:{ all -> 0x0b47 }
            android.view.View r12 = r9.A01     // Catch:{ all -> 0x0b47 }
            android.widget.ImageView r1 = r9.A03     // Catch:{ all -> 0x0b47 }
            android.widget.TextView r0 = r9.A04     // Catch:{ all -> 0x0b47 }
            r19 = r12
            r20 = r1
            r21 = r0
            X.C278194wQ.A00(r19, r20, r21, r22, r23, r24)     // Catch:{ all -> 0x0b47 }
            boolean r0 = r11.A05(r6)     // Catch:{ all -> 0x0b47 }
            if (r0 != 0) goto L_0x03f3
            boolean r0 = r11.A00     // Catch:{ all -> 0x0b47 }
            if (r0 == 0) goto L_0x03f3
            r11.A00 = r10     // Catch:{ all -> 0x0b47 }
            java.util.ArrayList r1 = r11.A02(r6)     // Catch:{ all -> 0x0b47 }
            com.instagram.model.reels.Reel r0 = r11.A00()     // Catch:{ all -> 0x0b47 }
            r3.DN4(r0, r9, r1)     // Catch:{ all -> 0x0b47 }
        L_0x03f3:
            X.FNw r1 = new X.FNw     // Catch:{ all -> 0x0b47 }
            r1.<init>(r3, r9, r11, r5)     // Catch:{ all -> 0x0b47 }
            X.FPX r0 = new X.FPX     // Catch:{ all -> 0x0b47 }
            r0.<init>(r3, r11, r5)     // Catch:{ all -> 0x0b47 }
            com.instagram.ui.widget.imageview.PulsingMultiImageView r3 = r9.A07     // Catch:{ all -> 0x0b47 }
            X.AnonymousClass0fU.A00(r1, r3)     // Catch:{ all -> 0x0b47 }
            r3.setOnLongClickListener(r0)     // Catch:{ all -> 0x0b47 }
            com.instagram.ui.widget.imageview.PulsingMultiImageView r3 = r9.A08     // Catch:{ all -> 0x0b47 }
            X.AnonymousClass0fU.A00(r1, r3)     // Catch:{ all -> 0x0b47 }
            r3.setOnLongClickListener(r0)     // Catch:{ all -> 0x0b47 }
            r9.Eu3(r8)     // Catch:{ all -> 0x0b47 }
            r19 = 0
            r20 = r42
            r21 = r8
            r22 = r6
            r23 = r26
            r24 = r25
            r25 = r19
            r26 = r19
            r27 = r7
            r28 = r4
            r29 = r5
            r30 = r19
            r31 = r19
            r33 = r15
            r34 = r10
            r35 = r10
            r37 = r13
            X.AnonymousClass708.A06(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37)     // Catch:{ all -> 0x0b47 }
            int r0 = r2.A00     // Catch:{ all -> 0x0b47 }
            int r0 = r0 + 1
            r2.A00 = r0     // Catch:{ all -> 0x0b47 }
            goto L_0x0b26
        L_0x043d:
            r19 = 0
            goto L_0x03c9
        L_0x0440:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0b47 }
            r0.<init>(r3)     // Catch:{ all -> 0x0b47 }
            goto L_0x0b46
        L_0x0447:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0b47 }
            r0.<init>(r3)     // Catch:{ all -> 0x0b47 }
            goto L_0x0b46
        L_0x044e:
            java.lang.Object r7 = r5.getTag()     // Catch:{ all -> 0x0b47 }
            if (r7 == 0) goto L_0x04df
            X.70u r7 = (X.C3250370u) r7     // Catch:{ all -> 0x0b47 }
            android.content.Context r19 = r5.getContext()     // Catch:{ all -> 0x0b47 }
            X.0qQ.A07(r19)     // Catch:{ all -> 0x0b47 }
            X.70w r9 = X.C3250570w.A00     // Catch:{ all -> 0x0b47 }
            android.content.Context r8 = r0.A01     // Catch:{ all -> 0x0b47 }
            com.instagram.common.session.UserSession r5 = r0.A05     // Catch:{ all -> 0x0b47 }
            r23 = r5
            com.instagram.user.model.User r6 = r1.A0E     // Catch:{ all -> 0x0b47 }
            if (r6 == 0) goto L_0x04d8
            X.0iw r5 = r0.A04     // Catch:{ all -> 0x0b47 }
            r22 = r5
            java.lang.String r5 = r0.A0G     // Catch:{ all -> 0x0b47 }
            r10 = r8
            r11 = r22
            r12 = r23
            r13 = r4
            r14 = r6
            r15 = r5
            java.util.ArrayList r38 = r9.A05(r10, r11, r12, r13, r14, r15)     // Catch:{ all -> 0x0b47 }
            com.instagram.user.model.User r9 = r1.A0E     // Catch:{ all -> 0x0b47 }
            if (r9 == 0) goto L_0x04d1
            androidx.fragment.app.FragmentActivity r21 = r42.requireActivity()     // Catch:{ all -> 0x0b47 }
            X.1Xj r1 = r1.A08     // Catch:{ all -> 0x0b47 }
            r25 = r1
            X.6vv r15 = r2.A04     // Catch:{ all -> 0x0b47 }
            X.0qQ.A07(r15)     // Catch:{ all -> 0x0b47 }
            boolean r14 = r2.A0G     // Catch:{ all -> 0x0b47 }
            boolean r13 = r0.A0L     // Catch:{ all -> 0x0b47 }
            X.ToV r11 = r0.A07     // Catch:{ all -> 0x0b47 }
            java.lang.String r10 = r0.A0H     // Catch:{ all -> 0x0b47 }
            X.2el r8 = r0.A06     // Catch:{ all -> 0x0b47 }
            X.712 r6 = new X.712     // Catch:{ all -> 0x0b47 }
            r6.<init>(r2)     // Catch:{ all -> 0x0b47 }
            X.714 r5 = new X.714     // Catch:{ all -> 0x0b47 }
            r5.<init>(r2)     // Catch:{ all -> 0x0b47 }
            android.os.Parcelable r12 = r2.A01     // Catch:{ all -> 0x0b47 }
            java.lang.String r3 = r0.A0F     // Catch:{ all -> 0x0b47 }
            java.lang.String r2 = r0.A0E     // Catch:{ all -> 0x0b47 }
            com.instagram.profile.intf.UserDetailEntryInfo r1 = r0.A08     // Catch:{ all -> 0x0b47 }
            java.lang.String r0 = r0.A0I     // Catch:{ all -> 0x0b47 }
            r20 = r12
            r24 = r8
            r26 = r15
            r27 = r11
            r28 = r6
            r29 = r5
            r30 = r4
            r31 = r7
            r32 = r1
            r33 = r9
            r34 = r10
            r35 = r3
            r36 = r2
            r37 = r0
            r39 = r14
            r40 = r13
            r41 = r13
            X.AnonymousClass715.A00(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41)     // Catch:{ all -> 0x0b47 }
            goto L_0x0b26
        L_0x04d1:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0b47 }
            r0.<init>(r3)     // Catch:{ all -> 0x0b47 }
            goto L_0x0b46
        L_0x04d8:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0b47 }
            r0.<init>(r3)     // Catch:{ all -> 0x0b47 }
            goto L_0x0b46
        L_0x04df:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0b47 }
            r0.<init>(r3)     // Catch:{ all -> 0x0b47 }
            goto L_0x0b46
        L_0x04e6:
            com.instagram.user.model.User r6 = r1.A0E     // Catch:{ all -> 0x0b47 }
            if (r6 == 0) goto L_0x052c
            com.instagram.common.session.UserSession r8 = r0.A05     // Catch:{ all -> 0x0b47 }
            boolean r3 = r2.A0H     // Catch:{ all -> 0x0b47 }
            X.0iw r7 = r0.A04     // Catch:{ all -> 0x0b47 }
            X.VOc r2 = new X.VOc     // Catch:{ all -> 0x0b47 }
            r2.<init>(r4)     // Catch:{ all -> 0x0b47 }
            X.4Cl r0 = r6.A03     // Catch:{ all -> 0x0b47 }
            java.lang.Integer r0 = r0.BXN()     // Catch:{ all -> 0x0b47 }
            if (r0 == 0) goto L_0x0507
            int r4 = r0.intValue()     // Catch:{ all -> 0x0b47 }
            r0 = 99
            r13 = 1
            if (r4 > r0) goto L_0x0509
            goto L_0x0508
        L_0x0507:
            r4 = 0
        L_0x0508:
            r13 = 0
        L_0x0509:
            android.content.Context r1 = r5.getContext()     // Catch:{ all -> 0x0b47 }
            X.0qQ.A07(r1)     // Catch:{ all -> 0x0b47 }
            r0 = 0
            java.lang.String r10 = X.Eq9.A00(r1, r8, r6, r0)     // Catch:{ all -> 0x0b47 }
            X.4Cl r0 = r6.A03     // Catch:{ all -> 0x0b47 }
            com.instagram.common.typedurl.ImageUrl r8 = r0.Btu()     // Catch:{ all -> 0x0b47 }
            r9 = 0
            r1 = 17
            X.Wvu r0 = new X.Wvu     // Catch:{ all -> 0x0b47 }
            r0.<init>(r1, r6, r2)     // Catch:{ all -> 0x0b47 }
            r6 = r5
            r11 = r0
            r12 = r4
            r14 = r3
            X.C70336O2o.A00(r6, r7, r8, r9, r10, r11, r12, r13, r14)     // Catch:{ all -> 0x0b47 }
            goto L_0x0b26
        L_0x052c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0b47 }
            r0.<init>(r3)     // Catch:{ all -> 0x0b47 }
            goto L_0x0b46
        L_0x0533:
            java.lang.Object r7 = r5.getTag()     // Catch:{ all -> 0x0b47 }
            if (r7 == 0) goto L_0x068e
            X.71H r7 = (X.AnonymousClass71H) r7     // Catch:{ all -> 0x0b47 }
            X.6x7 r4 = r4.A02     // Catch:{ all -> 0x0b47 }
            X.6wa r8 = r4.A0D     // Catch:{ all -> 0x0b47 }
            boolean r9 = r2.A08     // Catch:{ all -> 0x0b47 }
            boolean r2 = r0.A0K     // Catch:{ all -> 0x0b47 }
            com.instagram.common.session.UserSession r10 = r0.A05     // Catch:{ all -> 0x0b47 }
            com.instagram.user.model.User r0 = r1.A0E     // Catch:{ all -> 0x0b47 }
            if (r0 == 0) goto L_0x0687
            r6 = 0
            X.0qQ.A0B(r7, r6)     // Catch:{ all -> 0x0b47 }
            X.0qQ.A0B(r8, r11)     // Catch:{ all -> 0x0b47 }
            android.content.Context r12 = r7.A01     // Catch:{ all -> 0x0b47 }
            X.4Cl r4 = r0.A03     // Catch:{ all -> 0x0b47 }
            com.instagram.api.schemas.IGUserHighlightsTrayType r5 = r4.BDd()     // Catch:{ all -> 0x0b47 }
            if (r5 != 0) goto L_0x055c
            com.instagram.api.schemas.IGUserHighlightsTrayType r5 = com.instagram.api.schemas.IGUserHighlightsTrayType.DEFAULT     // Catch:{ all -> 0x0b47 }
        L_0x055c:
            com.instagram.api.schemas.IGUserHighlightsTrayType r4 = com.instagram.api.schemas.IGUserHighlightsTrayType.CARDS     // Catch:{ all -> 0x0b47 }
            if (r5 != r4) goto L_0x0586
            java.lang.Integer r4 = X.AnonymousClass05K.A0C     // Catch:{ all -> 0x0b47 }
        L_0x0562:
            X.AnonymousClass71I.A00(r12, r7, r4)     // Catch:{ all -> 0x0b47 }
            com.instagram.ui.widget.nestablescrollingview.NestableRecyclerView r5 = r7.A09     // Catch:{ all -> 0x0b47 }
            X.2Rw r4 = r5.A0A     // Catch:{ all -> 0x0b47 }
            boolean r11 = r4 instanceof X.C322126vI     // Catch:{ all -> 0x0b47 }
            if (r11 == 0) goto L_0x0571
            X.6vI r4 = (X.C322126vI) r4     // Catch:{ all -> 0x0b47 }
            if (r4 != 0) goto L_0x0578
        L_0x0571:
            X.6vI r4 = r1.A04     // Catch:{ all -> 0x0b47 }
            if (r4 == 0) goto L_0x0680
            r5.setAdapter(r4)     // Catch:{ all -> 0x0b47 }
        L_0x0578:
            boolean r1 = r0.A1q()     // Catch:{ all -> 0x0b47 }
            r4.A08 = r1     // Catch:{ all -> 0x0b47 }
            android.view.View r11 = r7.A03     // Catch:{ all -> 0x0b47 }
            r3 = 8
            r11.setVisibility(r3)     // Catch:{ all -> 0x0b47 }
            goto L_0x0589
        L_0x0586:
            java.lang.Integer r4 = X.AnonymousClass05K.A01     // Catch:{ all -> 0x0b47 }
            goto L_0x0562
        L_0x0589:
            r15 = 1
            if (r2 == 0) goto L_0x0596
            boolean r13 = r4.A0A()     // Catch:{ all -> 0x0b47 }
            if (r13 == 0) goto L_0x0594
            if (r1 == 0) goto L_0x0596
        L_0x0594:
            r14 = 1
            goto L_0x0597
        L_0x0596:
            r14 = 0
        L_0x0597:
            boolean r13 = r4.A0A()     // Catch:{ all -> 0x0b47 }
            if (r13 == 0) goto L_0x059f
            if (r1 == 0) goto L_0x05a6
        L_0x059f:
            boolean r13 = X.C324376zB.A02(r10, r0)     // Catch:{ all -> 0x0b47 }
            if (r13 == 0) goto L_0x05a6
            goto L_0x05a7
        L_0x05a6:
            r15 = 0
        L_0x05a7:
            if (r14 != 0) goto L_0x05ab
            if (r15 == 0) goto L_0x0676
        L_0x05ab:
            boolean r0 = X.C324376zB.A02(r10, r0)     // Catch:{ all -> 0x0b47 }
            if (r0 == 0) goto L_0x0676
            if (r2 == 0) goto L_0x0666
            X.0Tu r2 = X.0Tu.A05     // Catch:{ all -> 0x0b47 }
            r0 = 36324110380314424(0x810c9600002f38, double:3.034851897738706E-306)
            boolean r0 = X.182.A06(r2, r10, r0)     // Catch:{ all -> 0x0b47 }
            if (r0 != 0) goto L_0x05d9
            r0 = 36322289314179110(0x810aee00002826, double:3.0337002481818884E-306)
            boolean r0 = X.182.A06(r2, r10, r0)     // Catch:{ all -> 0x0b47 }
            if (r0 == 0) goto L_0x05d7
            r0 = 36322289314900017(0x810aee000b2831, double:3.033700248637793E-306)
            boolean r0 = X.182.A06(r2, r10, r0)     // Catch:{ all -> 0x0b47 }
            if (r0 != 0) goto L_0x05d7
            goto L_0x05d9
        L_0x05d7:
            r13 = 0
            goto L_0x05da
        L_0x05d9:
            r13 = 1
        L_0x05da:
            java.util.List r0 = r4.A0G     // Catch:{ all -> 0x0b47 }
            java.lang.Object r0 = X.00k.A0J(r0)     // Catch:{ all -> 0x0b47 }
            X.3BT r0 = (X.AnonymousClass3BT) r0     // Catch:{ all -> 0x0b47 }
            r4 = 1
            if (r0 == 0) goto L_0x0601
            com.instagram.model.reels.Reel r0 = r0.A03     // Catch:{ all -> 0x0b47 }
            boolean r0 = r0.A0p()     // Catch:{ all -> 0x0b47 }
            if (r0 != r4) goto L_0x0601
        L_0x05ed:
            android.view.View r1 = r7.A04     // Catch:{ all -> 0x0b47 }
            r1.setVisibility(r6)     // Catch:{ all -> 0x0b47 }
            X.6qm r0 = new X.6qm     // Catch:{ all -> 0x0b47 }
            r0.<init>(r8, r9)     // Catch:{ all -> 0x0b47 }
            X.AnonymousClass0fU.A00(r0, r1)     // Catch:{ all -> 0x0b47 }
            android.view.View r2 = r7.A02     // Catch:{ all -> 0x0b47 }
            r0 = 180(0xb4, float:2.52E-43)
            if (r9 == 0) goto L_0x0604
            goto L_0x0603
        L_0x0601:
            r4 = 0
            goto L_0x05ed
        L_0x0603:
            r0 = 0
        L_0x0604:
            float r0 = (float) r0     // Catch:{ all -> 0x0b47 }
            r2.setRotation(r0)     // Catch:{ all -> 0x0b47 }
            r5.setVisibility(r6)     // Catch:{ all -> 0x0b47 }
            android.widget.TextView r2 = r7.A06     // Catch:{ all -> 0x0b47 }
            r2.setVisibility(r3)     // Catch:{ all -> 0x0b47 }
            if (r9 == 0) goto L_0x0624
            android.widget.TextView r1 = r7.A08     // Catch:{ all -> 0x0b47 }
            r0 = 2131974434(0x7f135922, float:1.9585932E38)
            r1.setText(r0)     // Catch:{ all -> 0x0b47 }
            r5.setVisibility(r3)     // Catch:{ all -> 0x0b47 }
            android.widget.TextView r0 = r7.A07     // Catch:{ all -> 0x0b47 }
            r0.setVisibility(r3)     // Catch:{ all -> 0x0b47 }
            goto L_0x0b26
        L_0x0624:
            if (r4 == 0) goto L_0x063e
            android.widget.TextView r1 = r7.A08     // Catch:{ all -> 0x0b47 }
            r0 = 2131974439(0x7f135927, float:1.9585942E38)
            r1.setText(r0)     // Catch:{ all -> 0x0b47 }
            android.widget.TextView r1 = r7.A07     // Catch:{ all -> 0x0b47 }
            r0 = 2131974438(0x7f135926, float:1.958594E38)
            r1.setText(r0)     // Catch:{ all -> 0x0b47 }
            r1.setVisibility(r6)     // Catch:{ all -> 0x0b47 }
            r2.setVisibility(r6)     // Catch:{ all -> 0x0b47 }
            goto L_0x0b26
        L_0x063e:
            if (r13 == 0) goto L_0x0655
            r11.setVisibility(r6)     // Catch:{ all -> 0x0b47 }
            android.widget.TextView r2 = r7.A05     // Catch:{ all -> 0x0b47 }
            r0 = 0
            android.content.res.ColorStateList r0 = X.1QE.A0B(r12, r0)     // Catch:{ all -> 0x0b47 }
            r2.setTextColor(r0)     // Catch:{ all -> 0x0b47 }
            X.FLU r0 = new X.FLU     // Catch:{ all -> 0x0b47 }
            r0.<init>(r8)     // Catch:{ all -> 0x0b47 }
            X.AnonymousClass0fU.A00(r0, r2)     // Catch:{ all -> 0x0b47 }
        L_0x0655:
            r1.setVisibility(r3)     // Catch:{ all -> 0x0b47 }
            r0 = 47
            X.G2j r1 = new X.G2j     // Catch:{ all -> 0x0b47 }
            r1.<init>(r10, r0)     // Catch:{ all -> 0x0b47 }
            java.lang.Class<X.6qn> r0 = X.C319556qn.class
            r10.A01(r0, r1)     // Catch:{ all -> 0x0b47 }
            goto L_0x0b26
        L_0x0666:
            boolean r0 = r4.A02     // Catch:{ all -> 0x0b47 }
            if (r0 != 0) goto L_0x066c
            if (r1 == 0) goto L_0x0b26
        L_0x066c:
            android.view.View r0 = r7.A04     // Catch:{ all -> 0x0b47 }
            r0.setVisibility(r3)     // Catch:{ all -> 0x0b47 }
            r5.setVisibility(r6)     // Catch:{ all -> 0x0b47 }
            goto L_0x0b26
        L_0x0676:
            r5.setVisibility(r3)     // Catch:{ all -> 0x0b47 }
            android.view.View r0 = r7.A04     // Catch:{ all -> 0x0b47 }
            r0.setVisibility(r3)     // Catch:{ all -> 0x0b47 }
            goto L_0x0b26
        L_0x0680:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0b47 }
            r1.<init>(r3)     // Catch:{ all -> 0x0b47 }
            goto L_0x08f1
        L_0x0687:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0b47 }
            r0.<init>(r3)     // Catch:{ all -> 0x0b47 }
            goto L_0x0b46
        L_0x068e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0b47 }
            r0.<init>(r3)     // Catch:{ all -> 0x0b47 }
            goto L_0x0b46
        L_0x0695:
            java.lang.Object r4 = r5.getTag()     // Catch:{ all -> 0x0b47 }
            if (r4 == 0) goto L_0x06b3
            X.Ddz r4 = (X.C46382Ddz) r4     // Catch:{ all -> 0x0b47 }
            android.content.Context r2 = r5.getContext()     // Catch:{ all -> 0x0b47 }
            com.instagram.user.model.User r1 = r1.A0E     // Catch:{ all -> 0x0b47 }
            if (r1 == 0) goto L_0x06ac
            com.instagram.common.session.UserSession r0 = r0.A05     // Catch:{ all -> 0x0b47 }
            X.C46381Ddy.A01(r2, r0, r4, r1)     // Catch:{ all -> 0x0b47 }
            goto L_0x0b26
        L_0x06ac:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0b47 }
            r0.<init>(r3)     // Catch:{ all -> 0x0b47 }
            goto L_0x0b46
        L_0x06b3:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0b47 }
            r0.<init>(r3)     // Catch:{ all -> 0x0b47 }
            goto L_0x0b46
        L_0x06ba:
            X.ToZ r19 = X.C14148Tqk.A00     // Catch:{ all -> 0x0b47 }
            android.content.Context r20 = r5.getContext()     // Catch:{ all -> 0x0b47 }
            X.0qQ.A07(r20)     // Catch:{ all -> 0x0b47 }
            com.instagram.common.session.UserSession r7 = r0.A05     // Catch:{ all -> 0x0b47 }
            androidx.fragment.app.FragmentActivity r22 = r42.requireActivity()     // Catch:{ all -> 0x0b47 }
            com.instagram.user.model.User r8 = r0.A0D     // Catch:{ all -> 0x0b47 }
            X.0iw r6 = r0.A04     // Catch:{ all -> 0x0b47 }
            java.lang.Object r2 = r5.getTag()     // Catch:{ all -> 0x0b47 }
            if (r2 == 0) goto L_0x0710
            X.Tqg r2 = (X.C14144Tqg) r2     // Catch:{ all -> 0x0b47 }
            X.6x7 r4 = r4.A02     // Catch:{ all -> 0x0b47 }
            X.71F r9 = r4.BwV()     // Catch:{ all -> 0x0b47 }
            com.instagram.user.model.User r1 = r1.A0E     // Catch:{ all -> 0x0b47 }
            if (r1 == 0) goto L_0x0709
            java.lang.String r10 = r1.getId()     // Catch:{ all -> 0x0b47 }
            r21 = 0
            X.6rz r26 = new X.6rz     // Catch:{ all -> 0x0b47 }
            r5 = r26
            r5.<init>(r6, r7, r8, r9, r10)     // Catch:{ all -> 0x0b47 }
            X.ToV r0 = r0.A07     // Catch:{ all -> 0x0b47 }
            r33 = 0
            r23 = r6
            r24 = r21
            r25 = r7
            r27 = r0
            r28 = r2
            r29 = r21
            r30 = r21
            r31 = r21
            r32 = r8
            r34 = r33
            r19.A01(r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)     // Catch:{ all -> 0x0b47 }
            goto L_0x0b26
        L_0x0709:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0b47 }
            r0.<init>(r3)     // Catch:{ all -> 0x0b47 }
            goto L_0x0b46
        L_0x0710:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0b47 }
            r0.<init>(r3)     // Catch:{ all -> 0x0b47 }
            goto L_0x0b46
        L_0x0717:
            X.EbS r1 = r1.A0B     // Catch:{ all -> 0x0b47 }
            if (r1 == 0) goto L_0x0b26
            com.instagram.common.session.UserSession r10 = r0.A05     // Catch:{ all -> 0x0b47 }
            X.0iw r12 = r0.A04     // Catch:{ all -> 0x0b47 }
            java.lang.Object r13 = r5.getTag()     // Catch:{ all -> 0x0b47 }
            if (r13 == 0) goto L_0x07ee
            X.EzC r13 = (X.C49593EzC) r13     // Catch:{ all -> 0x0b47 }
            int r14 = r1.A00     // Catch:{ all -> 0x0b47 }
            int r9 = r1.A01     // Catch:{ all -> 0x0b47 }
            boolean r8 = r1.A04     // Catch:{ all -> 0x0b47 }
            X.6x7 r0 = r4.A02     // Catch:{ all -> 0x0b47 }
            X.6rM r7 = r0.Bgg()     // Catch:{ all -> 0x0b47 }
            android.widget.TextView r6 = r13.A02     // Catch:{ all -> 0x0b47 }
            android.content.Context r5 = r6.getContext()     // Catch:{ all -> 0x0b47 }
            r2 = 2131956478(0x7f1312fe, float:1.9549513E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r14)     // Catch:{ all -> 0x0b47 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x0b47 }
            r4 = 1
            java.lang.Object[] r0 = new java.lang.Object[]{r1, r0}     // Catch:{ all -> 0x0b47 }
            java.lang.String r3 = r5.getString(r2, r0)     // Catch:{ all -> 0x0b47 }
            com.facebook.common.callercontext.CallerContext r0 = X.FRZ.A00     // Catch:{ all -> 0x0b47 }
            X.0Tu r2 = X.0Tu.A05     // Catch:{ all -> 0x0b47 }
            r0 = 36326240684226196(0x810e8600023694, double:3.0361991105105557E-306)
            boolean r0 = X.182.A06(r2, r10, r0)     // Catch:{ all -> 0x0b47 }
            java.lang.String r1 = " "
            if (r0 == 0) goto L_0x0772
            r0 = 2131974204(0x7f13583c, float:1.9585465E38)
            java.lang.String r0 = r5.getString(r0)     // Catch:{ all -> 0x0b47 }
            java.lang.String r0 = X.002.A0g(r3, r1, r0)     // Catch:{ all -> 0x0b47 }
            android.text.SpannableString r1 = new android.text.SpannableString     // Catch:{ all -> 0x0b47 }
            r1.<init>(r0)     // Catch:{ all -> 0x0b47 }
            r0 = 2130970277(0x7f0406a5, float:1.754926E38)
            goto L_0x078f
        L_0x0772:
            r0 = 2131974203(0x7f13583b, float:1.9585463E38)
            java.lang.String r0 = r5.getString(r0)     // Catch:{ all -> 0x0b47 }
            java.lang.String r0 = X.002.A0g(r3, r1, r0)     // Catch:{ all -> 0x0b47 }
            android.text.SpannableString r1 = new android.text.SpannableString     // Catch:{ all -> 0x0b47 }
            r1.<init>(r0)     // Catch:{ all -> 0x0b47 }
            r6.setAllCaps(r4)     // Catch:{ all -> 0x0b47 }
            int r9 = r9 / r11
            if (r14 > r9) goto L_0x078c
            r4 = 2131099673(0x7f060019, float:1.7811706E38)
            goto L_0x0793
        L_0x078c:
            r0 = 2130970331(0x7f0406db, float:1.754937E38)
        L_0x078f:
            int r4 = X.2Yu.A0H(r5, r0)     // Catch:{ all -> 0x0b47 }
        L_0x0793:
            java.lang.String r2 = r1.toString()     // Catch:{ all -> 0x0b47 }
            r0 = 2130970310(0x7f0406c6, float:1.7549327E38)
            int r0 = X.2Yu.A0H(r5, r0)     // Catch:{ all -> 0x0b47 }
            int r0 = r5.getColor(r0)     // Catch:{ all -> 0x0b47 }
            X.0mq.A02(r1, r2, r0)     // Catch:{ all -> 0x0b47 }
            int r0 = r5.getColor(r4)     // Catch:{ all -> 0x0b47 }
            X.0mq.A02(r1, r3, r0)     // Catch:{ all -> 0x0b47 }
            r6.setText(r1)     // Catch:{ all -> 0x0b47 }
            com.instagram.common.ui.base.IgSimpleImageView r1 = r13.A03     // Catch:{ all -> 0x0b47 }
            r0 = 8
            if (r8 == 0) goto L_0x07b6
            r0 = 0
        L_0x07b6:
            r1.setVisibility(r0)     // Catch:{ all -> 0x0b47 }
            android.view.View r1 = r13.A01     // Catch:{ all -> 0x0b47 }
            X.FLT r0 = new X.FLT     // Catch:{ all -> 0x0b47 }
            r0.<init>(r7)     // Catch:{ all -> 0x0b47 }
            X.AnonymousClass0fU.A00(r0, r1)     // Catch:{ all -> 0x0b47 }
            X.1Av r4 = X.1Au.A00(r10)     // Catch:{ all -> 0x0b47 }
            X.0xa r3 = r4.A01     // Catch:{ all -> 0x0b47 }
            java.lang.String r2 = "show_business_onboarding_check_list_tooltip"
            r0 = 0
            boolean r0 = r3.getBoolean(r2, r0)     // Catch:{ all -> 0x0b47 }
            if (r0 == 0) goto L_0x07e3
            java.lang.Runnable r0 = r13.A00     // Catch:{ all -> 0x0b47 }
            if (r0 == 0) goto L_0x07d9
            r1.removeCallbacks(r0)     // Catch:{ all -> 0x0b47 }
        L_0x07d9:
            X.Ful r0 = new X.Ful     // Catch:{ all -> 0x0b47 }
            r0.<init>(r10, r4, r13)     // Catch:{ all -> 0x0b47 }
            r13.A00 = r0     // Catch:{ all -> 0x0b47 }
            r1.post(r0)     // Catch:{ all -> 0x0b47 }
        L_0x07e3:
            boolean r0 = X.C48212Eat.A00     // Catch:{ all -> 0x0b47 }
            if (r0 != 0) goto L_0x0b26
            X.FtN r0 = new X.FtN     // Catch:{ all -> 0x0b47 }
            r0.<init>(r12, r10)     // Catch:{ all -> 0x0b47 }
            goto L_0x08e7
        L_0x07ee:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0b47 }
            r0.<init>(r3)     // Catch:{ all -> 0x0b47 }
            goto L_0x0b46
        L_0x07f5:
            com.instagram.fanclub.intf.UserPayFanclubUpsellParams r2 = r1.A07     // Catch:{ all -> 0x0b47 }
            if (r2 == 0) goto L_0x0889
            java.lang.String r1 = r0.A0G     // Catch:{ all -> 0x0b47 }
            if (r1 == 0) goto L_0x0882
            android.content.Context r8 = r0.A01     // Catch:{ all -> 0x0b47 }
            com.instagram.common.session.UserSession r0 = r0.A05     // Catch:{ all -> 0x0b47 }
            X.17i r0 = X.17h.A00(r0)     // Catch:{ all -> 0x0b47 }
            com.instagram.user.model.User r0 = r0.A02(r1)     // Catch:{ all -> 0x0b47 }
            if (r0 == 0) goto L_0x087b
            java.lang.String r10 = r0.getUsername()     // Catch:{ all -> 0x0b47 }
            java.lang.String r7 = r2.A00     // Catch:{ all -> 0x0b47 }
            java.lang.String r9 = r2.A01     // Catch:{ all -> 0x0b47 }
            boolean r2 = r2.A02     // Catch:{ all -> 0x0b47 }
            r0 = 4
            X.0qQ.A0B(r7, r0)     // Catch:{ all -> 0x0b47 }
            r0 = 5
            X.0qQ.A0B(r9, r0)     // Catch:{ all -> 0x0b47 }
            android.content.res.Resources r3 = r8.getResources()     // Catch:{ all -> 0x0b47 }
            r1 = 2131976321(0x7f136081, float:1.958976E38)
            if (r2 == 0) goto L_0x0829
            r1 = 2131976322(0x7f136082, float:1.9589761E38)
        L_0x0829:
            java.lang.Object[] r0 = new java.lang.Object[]{r10, r9}     // Catch:{ all -> 0x0b47 }
            java.lang.String r0 = r3.getString(r1, r0)     // Catch:{ all -> 0x0b47 }
            android.text.SpannableStringBuilder r6 = new android.text.SpannableStringBuilder     // Catch:{ all -> 0x0b47 }
            r6.<init>(r0)     // Catch:{ all -> 0x0b47 }
            X.6Jl r0 = new X.6Jl     // Catch:{ all -> 0x0b47 }
            r0.<init>()     // Catch:{ all -> 0x0b47 }
            X.AnonymousClass7AV.A02(r6, r0, r10)     // Catch:{ all -> 0x0b47 }
            X.6Jl r0 = new X.6Jl     // Catch:{ all -> 0x0b47 }
            r0.<init>()     // Catch:{ all -> 0x0b47 }
            X.AnonymousClass7AV.A02(r6, r0, r9)     // Catch:{ all -> 0x0b47 }
            r0 = 2131443488(0x7f0b3f20, float:1.8509046E38)
            android.view.View r3 = r5.requireViewById(r0)     // Catch:{ all -> 0x0b47 }
            android.widget.TextView r3 = (android.widget.TextView) r3     // Catch:{ all -> 0x0b47 }
            if (r2 == 0) goto L_0x086f
            android.content.res.Resources r1 = r8.getResources()     // Catch:{ all -> 0x0b47 }
            r0 = 2131976290(0x7f136062, float:1.9589696E38)
            java.lang.String r2 = r1.getString(r0)     // Catch:{ all -> 0x0b47 }
            X.0qQ.A07(r2)     // Catch:{ all -> 0x0b47 }
            int r0 = X.2Yu.A0D(r8)     // Catch:{ all -> 0x0b47 }
            int r1 = r8.getColor(r0)     // Catch:{ all -> 0x0b47 }
            X.ESa r0 = new X.ESa     // Catch:{ all -> 0x0b47 }
            r0.<init>(r4, r7, r1)     // Catch:{ all -> 0x0b47 }
            X.AnonymousClass7AV.A05(r6, r0, r2)     // Catch:{ all -> 0x0b47 }
        L_0x086f:
            r3.setText(r6)     // Catch:{ all -> 0x0b47 }
            android.text.method.MovementMethod r0 = android.text.method.LinkMovementMethod.getInstance()     // Catch:{ all -> 0x0b47 }
            r3.setMovementMethod(r0)     // Catch:{ all -> 0x0b47 }
            goto L_0x0b26
        L_0x087b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0b47 }
            r0.<init>(r3)     // Catch:{ all -> 0x0b47 }
            goto L_0x0b46
        L_0x0882:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0b47 }
            r0.<init>(r3)     // Catch:{ all -> 0x0b47 }
            goto L_0x0b46
        L_0x0889:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0b47 }
            r0.<init>(r3)     // Catch:{ all -> 0x0b47 }
            goto L_0x0b46
        L_0x0890:
            X.68u r7 = r1.A05     // Catch:{ all -> 0x0b47 }
            if (r7 == 0) goto L_0x0b26
            X.2nI r1 = r0.A03     // Catch:{ all -> 0x0b47 }
            X.DfR r4 = r0.A09     // Catch:{ all -> 0x0b47 }
            r6 = 0
            X.0qQ.A0B(r1, r11)     // Catch:{ all -> 0x0b47 }
            java.lang.Object r2 = r5.getTag()     // Catch:{ all -> 0x0b47 }
            boolean r0 = r2 instanceof X.C46403DeQ     // Catch:{ all -> 0x0b47 }
            if (r0 == 0) goto L_0x08ec
            X.DeQ r2 = (X.C46403DeQ) r2     // Catch:{ all -> 0x0b47 }
            if (r2 == 0) goto L_0x08ec
            android.content.Context r3 = r5.getContext()     // Catch:{ all -> 0x0b47 }
            X.6NR r0 = new X.6NR     // Catch:{ all -> 0x0b47 }
            r0.<init>(r3, r7, r1)     // Catch:{ all -> 0x0b47 }
            X.6NS r3 = r0.A00()     // Catch:{ all -> 0x0b47 }
            X.6NS r0 = r2.A00     // Catch:{ all -> 0x0b47 }
            boolean r0 = X.0qQ.A0K(r0, r3)     // Catch:{ all -> 0x0b47 }
            if (r0 != 0) goto L_0x08cb
            X.6NS r0 = r2.A00     // Catch:{ all -> 0x0b47 }
            if (r0 == 0) goto L_0x08c4
            r0.A05()     // Catch:{ all -> 0x0b47 }
        L_0x08c4:
            r2.A00 = r3     // Catch:{ all -> 0x0b47 }
            X.4n2 r0 = r2.A02     // Catch:{ all -> 0x0b47 }
            r3.A07(r0)     // Catch:{ all -> 0x0b47 }
        L_0x08cb:
            android.widget.FrameLayout r0 = r2.A01     // Catch:{ all -> 0x0b47 }
            r0.setVisibility(r6)     // Catch:{ all -> 0x0b47 }
            X.DeS r0 = new X.DeS     // Catch:{ all -> 0x0b47 }
            r0.<init>(r1, r2)     // Catch:{ all -> 0x0b47 }
            r1.A05(r0)     // Catch:{ all -> 0x0b47 }
            X.02m r1 = X.02m.A0p     // Catch:{ all -> 0x0b47 }
            r0 = 962534132(0x395f1af4, float:2.1276978E-4)
            r1.markerEnd(r0, r11)     // Catch:{ all -> 0x0b47 }
            android.view.View r1 = r2.itemView     // Catch:{ all -> 0x0b47 }
            X.DeR r0 = new X.DeR     // Catch:{ all -> 0x0b47 }
            r0.<init>(r5, r4)     // Catch:{ all -> 0x0b47 }
        L_0x08e7:
            r1.post(r0)     // Catch:{ all -> 0x0b47 }
            goto L_0x0b26
        L_0x08ec:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0b47 }
            r1.<init>(r3)     // Catch:{ all -> 0x0b47 }
        L_0x08f1:
            throw r1     // Catch:{ all -> 0x0b47 }
        L_0x08f2:
            com.instagram.fanclub.intf.FanClubGuidedActivationProfileBannerParams r1 = r1.A06     // Catch:{ all -> 0x0b47 }
            if (r1 == 0) goto L_0x0b26
            android.content.Context r6 = r0.A01     // Catch:{ all -> 0x0b47 }
            com.instagram.common.session.UserSession r3 = r0.A05     // Catch:{ all -> 0x0b47 }
            int r8 = r1.A00     // Catch:{ all -> 0x0b47 }
            r10 = 0
            X.4lm r2 = X.C272994ll.A00(r3)     // Catch:{ all -> 0x0b47 }
            java.lang.String r9 = r3.A06     // Catch:{ all -> 0x0b47 }
            java.lang.String r7 = "PROFILE"
            X.0wc r4 = r2.A00     // Catch:{ all -> 0x0b47 }
            java.lang.String r1 = "subscription_notification_deferral_profile_banner_impression"
            X.0kJ r0 = r4.A00     // Catch:{ all -> 0x0b47 }
            X.0Aj r4 = r4.A00(r0, r1)     // Catch:{ all -> 0x0b47 }
            java.lang.String r1 = "profile"
            java.lang.String r0 = "container_module"
            r4.AAJ(r0, r1)     // Catch:{ all -> 0x0b47 }
            long r0 = java.lang.Long.parseLong(r9)     // Catch:{ all -> 0x0b47 }
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0b47 }
            java.lang.String r0 = "creator_igid"
            r4.A9F(r0, r1)     // Catch:{ all -> 0x0b47 }
            java.lang.String r0 = "origin"
            r4.AAJ(r0, r7)     // Catch:{ all -> 0x0b47 }
            r4.Cgf()     // Catch:{ all -> 0x0b47 }
            r0 = 2131433731(0x7f0b1903, float:1.8489256E38)
            android.view.View r7 = r5.requireViewById(r0)     // Catch:{ all -> 0x0b47 }
            X.0qQ.A07(r7)     // Catch:{ all -> 0x0b47 }
            android.widget.TextView r7 = (android.widget.TextView) r7     // Catch:{ all -> 0x0b47 }
            r0 = 2131433730(0x7f0b1902, float:1.8489254E38)
            android.view.View r4 = r5.requireViewById(r0)     // Catch:{ all -> 0x0b47 }
            X.0qQ.A07(r4)     // Catch:{ all -> 0x0b47 }
            android.widget.TextView r4 = (android.widget.TextView) r4     // Catch:{ all -> 0x0b47 }
            android.content.res.Resources r9 = r6.getResources()     // Catch:{ all -> 0x0b47 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x0b47 }
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch:{ all -> 0x0b47 }
            r5 = 2131820706(0x7f1100a2, float:1.9274135E38)
            r0 = r0[r10]     // Catch:{ all -> 0x0b47 }
            boolean r1 = r0 instanceof java.lang.Number     // Catch:{ all -> 0x0b47 }
            if (r1 != 0) goto L_0x096c
            boolean r1 = r0 instanceof java.lang.Boolean     // Catch:{ all -> 0x0b47 }
            if (r1 != 0) goto L_0x096c
            boolean r1 = r0 instanceof java.util.Date     // Catch:{ all -> 0x0b47 }
            if (r1 != 0) goto L_0x096c
            boolean r1 = r0 instanceof java.lang.Character     // Catch:{ all -> 0x0b47 }
            if (r1 != 0) goto L_0x096c
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0b47 }
            java.lang.String r0 = android.text.Html.escapeHtml(r0)     // Catch:{ all -> 0x0b47 }
        L_0x096c:
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch:{ all -> 0x0b47 }
            java.lang.String r0 = r9.getQuantityString(r5, r8, r0)     // Catch:{ all -> 0x0b47 }
            android.text.Spanned r0 = android.text.Html.fromHtml(r0)     // Catch:{ all -> 0x0b47 }
            r7.setText(r0)     // Catch:{ all -> 0x0b47 }
            android.content.res.Resources r1 = r6.getResources()     // Catch:{ all -> 0x0b47 }
            r0 = 2131962017(0x7f1328a1, float:1.9560747E38)
            java.lang.String r0 = r1.getString(r0)     // Catch:{ all -> 0x0b47 }
            r4.setText(r0)     // Catch:{ all -> 0x0b47 }
            X.FNO r1 = new X.FNO     // Catch:{ all -> 0x0b47 }
            r0 = r42
            r1.<init>(r0, r3, r2)     // Catch:{ all -> 0x0b47 }
            X.AnonymousClass0fU.A00(r1, r4)     // Catch:{ all -> 0x0b47 }
            goto L_0x0b26
        L_0x0995:
            java.lang.String r13 = r0.A0G     // Catch:{ all -> 0x0b47 }
            if (r13 != 0) goto L_0x09a1
            com.instagram.user.model.User r1 = r1.A0E     // Catch:{ all -> 0x0b47 }
            if (r1 == 0) goto L_0x0a1f
            java.lang.String r13 = r1.getId()     // Catch:{ all -> 0x0b47 }
        L_0x09a1:
            android.content.Context r8 = r0.A01     // Catch:{ all -> 0x0b47 }
            com.instagram.common.session.UserSession r11 = r0.A05     // Catch:{ all -> 0x0b47 }
            android.os.Bundle r9 = r42.requireArguments()     // Catch:{ all -> 0x0b47 }
            androidx.fragment.app.FragmentActivity r7 = r42.requireActivity()     // Catch:{ all -> 0x0b47 }
            X.0iw r10 = r0.A04     // Catch:{ all -> 0x0b47 }
            r1 = 0
            java.lang.Object r4 = r5.getTag()     // Catch:{ all -> 0x0b47 }
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.profile.bindergroup.RecsFromFriendsPromptBannerViewBinder.RecsFromFriendsBannerHolder"
            X.0qQ.A0C(r4, r0)     // Catch:{ all -> 0x0b47 }
            X.EzD r4 = (X.C49594EzD) r4     // Catch:{ all -> 0x0b47 }
            X.ONF r12 = new X.ONF     // Catch:{ all -> 0x0b47 }
            r12.<init>(r10, r11)     // Catch:{ all -> 0x0b47 }
            r5.setVisibility(r1)     // Catch:{ all -> 0x0b47 }
            r0 = 10
            java.lang.Long r6 = X.00y.A0n(r0, r13)     // Catch:{ all -> 0x0b47 }
            java.lang.String r1 = r10.getModuleName()     // Catch:{ all -> 0x0b47 }
            java.lang.String r0 = "entry_point_banner"
            r12.A01(r6, r0, r1)     // Catch:{ all -> 0x0b47 }
            com.instagram.common.ui.base.IgTextView r6 = r4.A02     // Catch:{ all -> 0x0b47 }
            android.content.res.Resources r5 = r5.getResources()     // Catch:{ all -> 0x0b47 }
            r1 = 2131972394(0x7f13512a, float:1.9581794E38)
            X.17i r0 = X.17h.A00(r11)     // Catch:{ all -> 0x0b47 }
            com.instagram.user.model.User r0 = r0.A02(r13)     // Catch:{ all -> 0x0b47 }
            if (r0 == 0) goto L_0x0a18
            java.lang.String r0 = r0.B8Q()     // Catch:{ all -> 0x0b47 }
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch:{ all -> 0x0b47 }
            java.lang.String r0 = r5.getString(r1, r0)     // Catch:{ all -> 0x0b47 }
            r6.setText(r0)     // Catch:{ all -> 0x0b47 }
            com.instagram.common.ui.base.IgSimpleImageView r1 = r4.A01     // Catch:{ all -> 0x0b47 }
            X.FOK r0 = new X.FOK     // Catch:{ all -> 0x0b47 }
            r19 = r0
            r20 = r10
            r21 = r11
            r22 = r4
            r23 = r2
            r24 = r12
            r25 = r13
            r19.<init>(r20, r21, r22, r23, r24, r25)     // Catch:{ all -> 0x0b47 }
            X.AnonymousClass0fU.A00(r0, r1)     // Catch:{ all -> 0x0b47 }
            com.instagram.igds.components.button.IgdsButton r0 = r4.A03     // Catch:{ all -> 0x0b47 }
            X.OjU r6 = new X.OjU     // Catch:{ all -> 0x0b47 }
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)     // Catch:{ all -> 0x0b47 }
            X.AnonymousClass0fU.A00(r6, r0)     // Catch:{ all -> 0x0b47 }
            goto L_0x0b26
        L_0x0a18:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0b47 }
            r0.<init>(r3)     // Catch:{ all -> 0x0b47 }
            goto L_0x0b46
        L_0x0a1f:
            r0 = 8
            r5.setVisibility(r0)     // Catch:{ all -> 0x0b47 }
            goto L_0x0b26
        L_0x0a26:
            android.content.Context r1 = r0.A01     // Catch:{ all -> 0x0b47 }
            java.lang.String r4 = "TEST"
            r0 = 2131440371(0x7f0b32f3, float:1.8502723E38)
            android.view.View r3 = r5.requireViewById(r0)     // Catch:{ all -> 0x0b47 }
            android.widget.TextView r3 = (android.widget.TextView) r3     // Catch:{ all -> 0x0b47 }
            android.content.res.Resources r2 = r1.getResources()     // Catch:{ all -> 0x0b47 }
            r1 = 2131970960(0x7f134b90, float:1.9578886E38)
            java.lang.String[] r0 = new java.lang.String[]{r4}     // Catch:{ all -> 0x0b47 }
            android.text.Spanned r0 = X.0bC.A01(r2, r0, r1)     // Catch:{ all -> 0x0b47 }
            r3.setText(r0)     // Catch:{ all -> 0x0b47 }
            goto L_0x0b26
        L_0x0a47:
            android.content.Context r8 = r5.getContext()     // Catch:{ all -> 0x0b47 }
            X.0qQ.A07(r8)     // Catch:{ all -> 0x0b47 }
            X.70w r19 = X.C3250570w.A00     // Catch:{ all -> 0x0b47 }
            android.content.Context r10 = r0.A01     // Catch:{ all -> 0x0b47 }
            com.instagram.common.session.UserSession r7 = r0.A05     // Catch:{ all -> 0x0b47 }
            com.instagram.user.model.User r9 = r1.A0E     // Catch:{ all -> 0x0b47 }
            if (r9 == 0) goto L_0x0b0d
            X.0iw r6 = r0.A04     // Catch:{ all -> 0x0b47 }
            r28 = r6
            java.lang.String r6 = r0.A0G     // Catch:{ all -> 0x0b47 }
            r20 = r10
            r21 = r28
            r22 = r7
            r23 = r4
            r24 = r9
            r25 = r6
            java.util.ArrayList r38 = r19.A05(r20, r21, r22, r23, r24, r25)     // Catch:{ all -> 0x0b47 }
            com.instagram.user.model.User r9 = r1.A0E     // Catch:{ all -> 0x0b47 }
            if (r9 == 0) goto L_0x0b41
            androidx.fragment.app.FragmentActivity r21 = r42.requireActivity()     // Catch:{ all -> 0x0b47 }
            X.1Xj r1 = r1.A08     // Catch:{ all -> 0x0b47 }
            r25 = r1
            X.6vv r1 = r2.A04     // Catch:{ all -> 0x0b47 }
            r26 = r1
            X.0qQ.A07(r26)     // Catch:{ all -> 0x0b47 }
            boolean r1 = r2.A0G     // Catch:{ all -> 0x0b47 }
            r39 = r1
            boolean r1 = r0.A0L     // Catch:{ all -> 0x0b47 }
            r40 = r1
            X.ToV r1 = r0.A07     // Catch:{ all -> 0x0b47 }
            r27 = r1
            java.lang.String r1 = r0.A0H     // Catch:{ all -> 0x0b47 }
            r34 = r1
            X.2el r1 = r0.A06     // Catch:{ all -> 0x0b47 }
            r24 = r1
            X.712 r11 = new X.712     // Catch:{ all -> 0x0b47 }
            r11.<init>(r2)     // Catch:{ all -> 0x0b47 }
            X.714 r10 = new X.714     // Catch:{ all -> 0x0b47 }
            r10.<init>(r2)     // Catch:{ all -> 0x0b47 }
            android.os.Parcelable r15 = r2.A01     // Catch:{ all -> 0x0b47 }
            java.lang.String r14 = r0.A0F     // Catch:{ all -> 0x0b47 }
            java.lang.String r12 = r0.A0E     // Catch:{ all -> 0x0b47 }
            com.instagram.profile.intf.UserDetailEntryInfo r6 = r0.A08     // Catch:{ all -> 0x0b47 }
            java.lang.String r13 = r0.A0I     // Catch:{ all -> 0x0b47 }
            r0 = 2131440356(0x7f0b32e4, float:1.8502693E38)
            android.view.View r2 = r5.findViewById(r0)     // Catch:{ all -> 0x0b47 }
            X.0qQ.A07(r2)     // Catch:{ all -> 0x0b47 }
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2     // Catch:{ all -> 0x0b47 }
            android.view.View r1 = X.C46381Ddy.A00(r8, r2, r7)     // Catch:{ all -> 0x0b47 }
            X.Ddz r0 = new X.Ddz     // Catch:{ all -> 0x0b47 }
            r0.<init>(r1, r7)     // Catch:{ all -> 0x0b47 }
            X.C46381Ddy.A01(r8, r7, r0, r9)     // Catch:{ all -> 0x0b47 }
            r2.removeAllViews()     // Catch:{ all -> 0x0b47 }
            r2.addView(r1)     // Catch:{ all -> 0x0b47 }
            r0 = 2131438483(0x7f0b2b93, float:1.8498894E38)
            android.view.View r3 = r5.findViewById(r0)     // Catch:{ all -> 0x0b47 }
            X.0qQ.A07(r3)     // Catch:{ all -> 0x0b47 }
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3     // Catch:{ all -> 0x0b47 }
            android.view.View r2 = X.C3250270t.A02(r3, r7)     // Catch:{ all -> 0x0b47 }
            r1 = 1
            X.70u r0 = new X.70u     // Catch:{ all -> 0x0b47 }
            r0.<init>(r2, r1)     // Catch:{ all -> 0x0b47 }
            r19 = r8
            r20 = r15
            r22 = r28
            r23 = r7
            r28 = r11
            r29 = r10
            r30 = r4
            r31 = r0
            r32 = r6
            r33 = r9
            r35 = r14
            r36 = r12
            r37 = r13
            r41 = r40
            X.AnonymousClass715.A00(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41)     // Catch:{ all -> 0x0b47 }
            r3.removeAllViews()     // Catch:{ all -> 0x0b47 }
            r3.addView(r2)     // Catch:{ all -> 0x0b47 }
            r0 = 2131237326(0x7f0819ce, float:1.80909E38)
            android.graphics.drawable.Drawable r0 = r8.getDrawable(r0)     // Catch:{ all -> 0x0b47 }
            r5.setBackground(r0)     // Catch:{ all -> 0x0b47 }
            goto L_0x0b26
        L_0x0b0d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0b47 }
            r0.<init>(r3)     // Catch:{ all -> 0x0b47 }
            goto L_0x0b46
        L_0x0b13:
            r0 = 2131438495(0x7f0b2b9f, float:1.8498919E38)
            android.view.View r1 = r5.requireViewById(r0)     // Catch:{ all -> 0x0b47 }
            X.0qQ.A07(r1)     // Catch:{ all -> 0x0b47 }
            com.instagram.igds.components.banner.IgdsBanner r1 = (com.instagram.igds.components.banner.IgdsBanner) r1     // Catch:{ all -> 0x0b47 }
            X.PHI r0 = new X.PHI     // Catch:{ all -> 0x0b47 }
            r0.<init>()     // Catch:{ all -> 0x0b47 }
            r1.A00 = r0     // Catch:{ all -> 0x0b47 }
        L_0x0b26:
            boolean r0 = com.facebook.systrace.Systrace.A0E(r16)
            if (r0 == 0) goto L_0x0b32
            r0 = -336574226(0xffffffffebf048ee, float:-5.809732E26)
        L_0x0b2f:
            X.0fS.A00(r0)
        L_0x0b32:
            r1 = -2022521724(0xffffffff8772c484, float:-1.8263807E-34)
            r0 = r18
            X.AnonymousClass0fD.A0A(r1, r0)
            return
        L_0x0b3b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0b47 }
            r0.<init>(r3)     // Catch:{ all -> 0x0b47 }
            goto L_0x0b46
        L_0x0b41:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0b47 }
            r0.<init>(r3)     // Catch:{ all -> 0x0b47 }
        L_0x0b46:
            throw r0     // Catch:{ all -> 0x0b47 }
        L_0x0b47:
            r1 = move-exception
            boolean r0 = com.facebook.systrace.Systrace.A0E(r16)
            if (r0 == 0) goto L_0x0b54
            r0 = -981759827(0xffffffffc57b88ad, float:-4024.5422)
            X.0fS.A00(r0)
        L_0x0b54:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C322546w0.bindView(int, android.view.View, java.lang.Object, java.lang.Object):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00dd, code lost:
        if (X.C46380Ddx.A00(r1) == false) goto L_0x00df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00f8, code lost:
        if (X.182.A06(X.0Tu.A05, r6, 36329019528068836L) == false) goto L_0x00fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0133, code lost:
        if (X.182.A06(X.0Tu.A05, r6, 36329715312967964L) == false) goto L_0x0135;
     */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0139  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0142  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x014f  */
    /* JADX WARNING: Removed duplicated region for block: B:97:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(X.C232672uC r10, java.lang.Object r11, java.lang.Object r12) {
        /*
            r9 = this;
            X.6vx r11 = (X.C322516vx) r11
            X.6vy r12 = (X.C322526vy) r12
            r0 = 0
            X.0qQ.A0B(r10, r0)
            r0 = 1
            X.0qQ.A0B(r11, r0)
            r0 = 2
            X.0qQ.A0B(r12, r0)
            X.6w1 r5 = r9.A00
            r6 = 0
            r7 = 1
            com.instagram.user.model.User r4 = r11.A0E
            if (r4 != 0) goto L_0x0020
            X.6w2 r0 = X.C322566w2.ITEM_TYPE_USER_INFO_NOT_FOUND
        L_0x001a:
            int r0 = r0.A00
            r10.A7U(r0)
        L_0x001f:
            return
        L_0x0020:
            com.instagram.fanclub.intf.UserPayFanclubUpsellParams r0 = r11.A07
            if (r0 == 0) goto L_0x0035
            X.6w2 r0 = X.C322566w2.ITEM_TYPE_DIVIDER
            int r1 = r0.A00
            r10.A7U(r1)
            X.6w2 r0 = X.C322566w2.ITEM_TYPE_USER_PAY_FANCLUB_UPSELL
            int r0 = r0.A00
            r10.A7U(r0)
            r10.A7U(r1)
        L_0x0035:
            com.instagram.fanclub.intf.FanClubGuidedActivationProfileBannerParams r0 = r11.A06
            if (r0 == 0) goto L_0x0040
            X.6w2 r0 = X.C322566w2.ITEM_TYPE_FAN_CLUB_GUIDED_ACTIVATION_BANNER
            int r0 = r0.A00
            r10.A7U(r0)
        L_0x0040:
            boolean r0 = r11.A0L
            if (r0 == 0) goto L_0x004b
            X.6w2 r0 = X.C322566w2.ITEM_TYPE_HEADER_LIMITS_OFF_BANNER
            int r0 = r0.A00
            r10.A7U(r0)
        L_0x004b:
            boolean r3 = r5.A0L
            if (r3 != 0) goto L_0x005a
            boolean r0 = r12.A0E
            if (r0 == 0) goto L_0x005a
            X.6w2 r0 = X.C322566w2.ITEM_TYPE_HEADER_REQUEST_BANNER
            int r0 = r0.A00
            r10.A7U(r0)
        L_0x005a:
            boolean r0 = r12.A0D
            if (r0 == 0) goto L_0x0065
            X.6w2 r0 = X.C322566w2.ITEM_TYPE_RECS_FROM_FRIENDS_BANNER
            int r0 = r0.A00
            r10.A7U(r0)
        L_0x0065:
            r2 = 1
            if (r3 == 0) goto L_0x0095
            X.0eE r1 = X.AnonymousClass0t1.A01
            com.instagram.common.session.UserSession r0 = r5.A05
            com.instagram.user.model.User r0 = r1.A01(r0)
            boolean r0 = r0.A2L()
            if (r0 == 0) goto L_0x0095
            X.EbS r8 = r11.A0B
            if (r8 == 0) goto L_0x0095
            boolean r0 = r8.A02
            if (r0 != r7) goto L_0x0095
            int r1 = r8.A00
            int r0 = r8.A01
            if (r1 == r0) goto L_0x0095
            X.6w2 r0 = X.C322566w2.ITEM_TYPE_DIVIDER
            int r1 = r0.A00
            r10.A7U(r1)
            X.6w2 r0 = X.C322566w2.ITEM_TYPE_BUSINESS_ONBOARDING_CHECKLIST
            int r0 = r0.A00
            r10.A7U(r0)
            r10.A7U(r1)
        L_0x0095:
            X.6rP r0 = r11.A0C
            if (r0 == 0) goto L_0x0175
            java.util.Set r0 = r0.A03()
            if (r0 == 0) goto L_0x0175
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 != r7) goto L_0x0175
            X.6w2 r0 = X.C322566w2.ITEM_TYPE_USER_INFO_WITH_COBROADCAST
        L_0x00a9:
            int r0 = r0.A00
            r10.A7U(r0)
            boolean r0 = r12.A0K
            if (r0 == 0) goto L_0x00b9
            X.6w2 r0 = X.C322566w2.ITEM_TYPE_SHOP_ROW
            int r0 = r0.A00
            r10.A7U(r0)
        L_0x00b9:
            X.68u r0 = r11.A05
            if (r0 == 0) goto L_0x00c4
            X.6w2 r0 = X.C322566w2.ITEM_TYPE_PRODASH_HYPERCARD
            int r0 = r0.A00
            r10.A7U(r0)
        L_0x00c4:
            if (r3 != 0) goto L_0x00df
            boolean r0 = r12.A0G
            if (r0 != 0) goto L_0x00df
            com.instagram.common.session.UserSession r1 = r5.A05
            boolean r0 = X.C324376zB.A02(r1, r4)
            if (r0 != 0) goto L_0x00df
            boolean r0 = X.C324376zB.A01(r1, r4)
            if (r0 == 0) goto L_0x00df
            boolean r0 = X.C46380Ddx.A00(r1)
            r8 = 1
            if (r0 != 0) goto L_0x00e7
        L_0x00df:
            r8 = 0
            X.6w2 r0 = X.C322566w2.ITEM_TYPE_ACTION_BUTTONS
            int r0 = r0.A00
            r10.A7U(r0)
        L_0x00e7:
            r12.A0C = r6
            if (r3 == 0) goto L_0x00fa
            com.instagram.common.session.UserSession r6 = r5.A05
            X.0Tu r7 = X.0Tu.A05
            r0 = 36329019528068836(0x81110d00023ee4, double:3.037956462546147E-306)
            boolean r0 = X.182.A06(r7, r6, r0)
            if (r0 != 0) goto L_0x0173
        L_0x00fa:
            com.instagram.common.session.UserSession r6 = r5.A05
            boolean r0 = X.C324376zB.A01(r6, r4)
            if (r0 == 0) goto L_0x010f
            X.0Tu r7 = X.0Tu.A05
            r0 = 36329715312967964(0x8111af0005411c, double:3.0383964797180567E-306)
            boolean r0 = X.182.A06(r7, r6, r0)
            if (r0 != 0) goto L_0x0116
        L_0x010f:
            X.6w2 r0 = X.C322566w2.ITEM_TYPE_REEL_TRAY
            int r0 = r0.A00
            r10.A7U(r0)
        L_0x0116:
            if (r3 != 0) goto L_0x0173
            boolean r0 = r12.A0G
            if (r0 != 0) goto L_0x0173
            boolean r0 = X.C324376zB.A02(r6, r4)
            if (r0 != 0) goto L_0x0173
            boolean r0 = X.C324376zB.A01(r6, r4)
            if (r0 == 0) goto L_0x0135
            X.0Tu r7 = X.0Tu.A05
            r0 = 36329715312967964(0x8111af0005411c, double:3.0383964797180567E-306)
            boolean r0 = X.182.A06(r7, r6, r0)
            if (r0 != 0) goto L_0x0173
        L_0x0135:
            r12.A0C = r2
            if (r2 == 0) goto L_0x0140
            X.6w2 r0 = X.C322566w2.ITEM_TYPE_DIVIDER
            int r0 = r0.A00
            r10.A7U(r0)
        L_0x0140:
            if (r8 == 0) goto L_0x0149
            X.6w2 r0 = X.C322566w2.ITEM_TYPE_PROFILE_EMPTY_NOTICE_WITH_USER_ACTION
            int r0 = r0.A00
            r10.A7U(r0)
        L_0x0149:
            if (r3 != 0) goto L_0x001f
            boolean r0 = r12.A0G
            if (r0 != 0) goto L_0x001f
            boolean r0 = X.C324376zB.A02(r6, r4)
            if (r0 != 0) goto L_0x016c
            boolean r0 = X.C324376zB.A01(r6, r4)
            if (r0 == 0) goto L_0x0161
            boolean r0 = X.C46380Ddx.A00(r6)
            if (r0 != 0) goto L_0x016c
        L_0x0161:
            boolean r0 = r5.A0M
            if (r0 == 0) goto L_0x0170
            X.6w2 r0 = X.C322566w2.ITEM_TYPE_PUBLIC_HIGHLIGHTS_EMPTY_PROFILE_NOTICE
        L_0x0167:
            int r0 = r0.A00
            r10.A7U(r0)
        L_0x016c:
            X.6w2 r0 = X.C322566w2.ITEM_TYPE_STANDALONE_USER_CHAINING
            goto L_0x001a
        L_0x0170:
            X.6w2 r0 = X.C322566w2.ITEM_TYPE_EMPTY_PROFILE_NOTICE
            goto L_0x0167
        L_0x0173:
            r2 = 0
            goto L_0x0135
        L_0x0175:
            X.6w2 r0 = X.C322566w2.ITEM_TYPE_USER_INFO
            goto L_0x00a9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C322546w0.buildRowViewTypes(X.2uC, java.lang.Object, java.lang.Object):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0063, code lost:
        r6[r0] = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0135, code lost:
        r2 = r0.A0N();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0146, code lost:
        return X.17d.A00(r2).hashCode() + r2.intValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0161, code lost:
        if (r2 <= 99) goto L_0x0163;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0183, code lost:
        r6[r1] = java.lang.Boolean.valueOf(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x019e, code lost:
        r6[r2] = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:?, code lost:
        return java.util.Arrays.hashCode(r6);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int getViewModelHash(int r14, java.lang.Object r15, java.lang.Object r16) {
        /*
            r13 = this;
            r0 = r16
            r8 = 1
            X.0qQ.A0B(r15, r8)
            if (r16 == 0) goto L_0x01a5
            X.6w1 r6 = r13.A00
            X.6vx r15 = (X.C322516vx) r15
            X.6vy r0 = (X.C322526vy) r0
            X.0qQ.A0B(r15, r8)
            r5 = 2
            X.0qQ.A0B(r0, r5)
            X.6w2 r1 = X.AnonymousClass707.A00(r14)
            int r3 = r1.ordinal()
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            java.lang.String r2 = "Required value was null."
            switch(r3) {
                case 0: goto L_0x002a;
                case 1: goto L_0x0030;
                case 2: goto L_0x0030;
                case 3: goto L_0x006d;
                case 4: goto L_0x0147;
                case 5: goto L_0x009e;
                case 6: goto L_0x00e0;
                case 7: goto L_0x0192;
                case 8: goto L_0x01a4;
                case 9: goto L_0x01a4;
                case 10: goto L_0x00ea;
                case 11: goto L_0x0106;
                case 12: goto L_0x01a4;
                case 13: goto L_0x011d;
                case 14: goto L_0x01a4;
                case 15: goto L_0x01a4;
                case 16: goto L_0x012b;
                case 17: goto L_0x01a4;
                default: goto L_0x0024;
            }
        L_0x0024:
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x002a:
            X.9J4 r9 = r15.A01
            java.lang.Object[] r6 = new java.lang.Object[r8]
            r0 = 0
            goto L_0x0063
        L_0x0030:
            com.instagram.user.model.User r10 = r15.A0E
            if (r10 == 0) goto L_0x0067
            boolean r12 = r6.A0K
            X.6rP r7 = r15.A0C
            X.6vw r4 = r0.A03
            X.0qQ.A07(r4)
            boolean r3 = r0.A06
            boolean r11 = r0.A0K
            java.lang.String r9 = r15.A0F
            r2 = 0
            r1 = 3
            r0 = 7
            java.lang.Object[] r6 = new java.lang.Object[r0]
            r6[r2] = r10
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r12)
            r6[r8] = r0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r11)
            r6[r5] = r0
            r6[r1] = r7
            r0 = 4
            r6[r0] = r4
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r3)
            r0 = 5
            r6[r0] = r1
            r0 = 6
        L_0x0063:
            r6[r0] = r9
            goto L_0x01a0
        L_0x0067:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r2)
            throw r0
        L_0x006d:
            X.6vv r9 = r0.A04
            boolean r7 = r0.A0G
            boolean r3 = r6.A0L
            X.ToV r2 = r6.A07
            boolean r4 = r0.A0C
            r1 = 0
            r0 = 6
            java.lang.Object[] r6 = new java.lang.Object[r0]
            r6[r1] = r9
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r7)
            r6[r8] = r0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            r6[r5] = r0
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r3)
            r0 = 3
            r6[r0] = r1
            int r0 = r2.hashCode()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 4
            r6[r0] = r1
            r1 = 5
            goto L_0x0183
        L_0x009e:
            boolean r1 = r0.A08
            X.6vI r4 = r15.A04
            if (r4 == 0) goto L_0x00da
            com.instagram.user.model.User r3 = r15.A0E
            if (r3 == 0) goto L_0x00d4
            com.instagram.common.session.UserSession r2 = r6.A05
            r0 = 5
            java.lang.Object[] r6 = new java.lang.Object[r0]
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r0 = 0
            r6[r0] = r1
            r6[r8] = r4
            java.util.List r0 = r4.A0G
            boolean r0 = r0.isEmpty()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r6[r5] = r0
            boolean r0 = X.C324376zB.A02(r2, r3)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            r0 = 3
            r6[r0] = r1
            r1 = 4
            boolean r4 = r3.A1q()
            goto L_0x0183
        L_0x00d4:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r2)
            throw r0
        L_0x00da:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r2)
            throw r0
        L_0x00e0:
            com.instagram.user.model.User r0 = r15.A0E
            if (r0 != 0) goto L_0x0135
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r2)
            throw r0
        L_0x00ea:
            X.EbS r0 = r15.A0B
            if (r0 == 0) goto L_0x01a4
            int r2 = r0.A00
            int r1 = r0.A01
            boolean r0 = r0.A04
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            java.lang.Object[] r6 = new java.lang.Object[]{r2, r1, r0}
            goto L_0x01a0
        L_0x0106:
            com.instagram.fanclub.intf.UserPayFanclubUpsellParams r2 = r15.A07
            if (r2 == 0) goto L_0x01a4
            boolean r0 = r2.A02
            java.lang.String r3 = r2.A01
            r2 = 1
            X.0qQ.A0B(r3, r8)
            java.lang.Object[] r6 = new java.lang.Object[r5]
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            r0 = 0
            r6[r0] = r1
            goto L_0x019e
        L_0x011d:
            com.instagram.fanclub.intf.FanClubGuidedActivationProfileBannerParams r0 = r15.A06
            if (r0 == 0) goto L_0x01a4
            int r0 = r0.A00
            java.lang.Object[] r6 = new java.lang.Object[r8]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            r2 = 0
            goto L_0x019e
        L_0x012b:
            com.instagram.user.model.User r0 = r15.A0E
            if (r0 != 0) goto L_0x0135
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r2)
            throw r0
        L_0x0135:
            java.lang.Integer r2 = r0.A0N()
            java.lang.String r0 = X.17d.A00(r2)
            int r1 = r0.hashCode()
            int r0 = r2.intValue()
            int r1 = r1 + r0
            return r1
        L_0x0147:
            android.content.Context r10 = r6.A01
            com.instagram.user.model.User r7 = r15.A0E
            if (r7 == 0) goto L_0x018c
            com.instagram.common.session.UserSession r9 = r6.A05
            boolean r4 = r0.A0H
            r3 = 0
            X.4Cl r0 = r7.A03
            java.lang.Integer r0 = r0.BXN()
            if (r0 == 0) goto L_0x018a
            int r2 = r0.intValue()
            r0 = 99
            r1 = 1
            if (r2 > r0) goto L_0x0164
        L_0x0163:
            r1 = 0
        L_0x0164:
            r0 = 5
            java.lang.Object[] r6 = new java.lang.Object[r0]
            java.lang.String r0 = X.Eq9.A00(r10, r9, r7, r3)
            r6[r3] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r6[r8] = r0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            r6[r5] = r0
            r1 = 3
            X.4Cl r0 = r7.A03
            com.instagram.common.typedurl.ImageUrl r0 = r0.Btu()
            r6[r1] = r0
            r1 = 4
        L_0x0183:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            r6[r1] = r0
            goto L_0x01a0
        L_0x018a:
            r2 = 0
            goto L_0x0163
        L_0x018c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r2)
            throw r0
        L_0x0192:
            X.ToV r1 = r6.A07
            r0 = 0
            java.lang.Object[] r6 = new java.lang.Object[r5]
            r6[r0] = r1
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r0)
            r2 = 1
        L_0x019e:
            r6[r2] = r3
        L_0x01a0:
            int r1 = java.util.Arrays.hashCode(r6)
        L_0x01a4:
            return r1
        L_0x01a5:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C322546w0.getViewModelHash(int, java.lang.Object, java.lang.Object):int");
    }

    public final int getViewTypeCount() {
        return C322566w2.A02.length;
    }

    /* JADX WARNING: type inference failed for: r1v20, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.widget.ImageView] */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0183, code lost:
        r3.setTag(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0194, code lost:
        r3 = r1.inflate(r0, r15, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x01a4, code lost:
        X.0qQ.A07(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x01ab, code lost:
        if (r9 == X.C322566w2.A07.A00) goto L_0x01b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x01ad, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x01b2, code lost:
        if (r9 != X.C322566w2.A0E.A00) goto L_0x01b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x01b4, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x01b5, code lost:
        if (r0 == false) goto L_0x01c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x01b7, code lost:
        r3.setBackgroundColor(r5.A01.getColor(com.instagram.android.R.color.fds_transparent));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x01cf, code lost:
        X.AnonymousClass0fD.A0A(575492508, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x01d5, code lost:
        return r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View createView(int r20, android.view.ViewGroup r21) {
        /*
            r19 = this;
            r0 = -990029924(0xffffffffc4fd579c, float:-2026.7378)
            int r6 = X.AnonymousClass0fD.A03(r0)
            r8 = 1
            r15 = r21
            X.0qQ.A0B(r15, r8)
            r0 = r19
            X.6w1 r5 = r0.A00
            r11 = 1
            boolean r0 = com.facebook.systrace.Systrace.A0E(r11)
            if (r0 == 0) goto L_0x0021
            r1 = -2010854330(0xffffffff8824cc46, float:-4.9592077E-34)
            java.lang.String r0 = "ProfileHeaderBinderGroup.createView"
            X.0fS.A01(r0, r1)
        L_0x0021:
            com.instagram.common.session.UserSession r7 = r5.A05     // Catch:{ all -> 0x01d6 }
            boolean r1 = r5.A0L     // Catch:{ all -> 0x01d6 }
            android.content.Context r4 = r15.getContext()     // Catch:{ all -> 0x01d6 }
            r9 = r20
            X.6w2 r0 = X.AnonymousClass707.A00(r9)     // Catch:{ all -> 0x01d6 }
            int r0 = r0.ordinal()     // Catch:{ all -> 0x01d6 }
            r3 = 0
            switch(r0) {
                case 0: goto L_0x0094;
                case 1: goto L_0x003d;
                case 2: goto L_0x00af;
                case 3: goto L_0x00c4;
                case 4: goto L_0x00b5;
                case 5: goto L_0x00ca;
                case 6: goto L_0x011c;
                case 7: goto L_0x0122;
                case 8: goto L_0x0199;
                case 9: goto L_0x0043;
                case 10: goto L_0x0069;
                case 11: goto L_0x0132;
                case 12: goto L_0x0140;
                case 13: goto L_0x015c;
                case 14: goto L_0x016a;
                case 15: goto L_0x007b;
                case 16: goto L_0x0084;
                case 17: goto L_0x0187;
                default: goto L_0x0037;
            }     // Catch:{ all -> 0x01d6 }
        L_0x0037:
            X.Wub r0 = new X.Wub     // Catch:{ all -> 0x01d6 }
            r0.<init>()     // Catch:{ all -> 0x01d6 }
            throw r0     // Catch:{ all -> 0x01d6 }
        L_0x003d:
            android.view.View r3 = X.AnonymousClass708.A01(r15, r7, r3, r1)     // Catch:{ all -> 0x01d6 }
            goto L_0x01a7
        L_0x0043:
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r4)     // Catch:{ all -> 0x01d6 }
            r0 = 2131628361(0x7f0e1149, float:1.8884013E38)
            android.view.View r3 = r1.inflate(r0, r15, r3)     // Catch:{ all -> 0x01d6 }
            r0 = 2131440364(0x7f0b32ec, float:1.850271E38)
            android.view.View r1 = r3.requireViewById(r0)     // Catch:{ all -> 0x01d6 }
            X.0qQ.A07(r1)     // Catch:{ all -> 0x01d6 }
            com.instagram.common.ui.widget.imageview.CircularImageView r1 = (com.instagram.common.ui.widget.imageview.CircularImageView) r1     // Catch:{ all -> 0x01d6 }
            X.0qQ.A0A(r4)     // Catch:{ all -> 0x01d6 }
            r0 = 2131239607(0x7f0822b7, float:1.8095526E38)
            android.graphics.drawable.Drawable r0 = r4.getDrawable(r0)     // Catch:{ all -> 0x01d6 }
            r1.setImageDrawable(r0)     // Catch:{ all -> 0x01d6 }
            goto L_0x01a7
        L_0x0069:
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r4)     // Catch:{ all -> 0x01d6 }
            r0 = 2131628083(0x7f0e1033, float:1.8883449E38)
            android.view.View r3 = r1.inflate(r0, r15, r3)     // Catch:{ all -> 0x01d6 }
            X.EzC r0 = new X.EzC     // Catch:{ all -> 0x01d6 }
            r0.<init>(r3)     // Catch:{ all -> 0x01d6 }
            goto L_0x0183
        L_0x007b:
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r4)     // Catch:{ all -> 0x01d6 }
            r0 = 2131629181(0x7f0e147d, float:1.8885676E38)
            goto L_0x0194
        L_0x0084:
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r4)     // Catch:{ all -> 0x01d6 }
            r0 = 2131628342(0x7f0e1136, float:1.8883974E38)
            android.view.View r3 = r1.inflate(r0, r15, r3)     // Catch:{ all -> 0x01d6 }
            X.0qQ.A0A(r3)     // Catch:{ all -> 0x01d6 }
            goto L_0x01a7
        L_0x0094:
            X.0qQ.A0A(r4)     // Catch:{ all -> 0x01d6 }
            X.0qQ.A0B(r4, r3)     // Catch:{ all -> 0x01d6 }
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r4)     // Catch:{ all -> 0x01d6 }
            r0 = 2131628347(0x7f0e113b, float:1.8883984E38)
            android.view.View r3 = r1.inflate(r0, r15, r3)     // Catch:{ all -> 0x01d6 }
            X.0qQ.A0A(r3)     // Catch:{ all -> 0x01d6 }
            X.Mfr r0 = new X.Mfr     // Catch:{ all -> 0x01d6 }
            r0.<init>(r3)     // Catch:{ all -> 0x01d6 }
            goto L_0x0183
        L_0x00af:
            android.view.View r3 = X.AnonymousClass708.A01(r15, r7, r8, r1)     // Catch:{ all -> 0x01d6 }
            goto L_0x01a7
        L_0x00b5:
            X.0qQ.A0A(r4)     // Catch:{ all -> 0x01d6 }
            X.0qQ.A0B(r4, r3)     // Catch:{ all -> 0x01d6 }
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r4)     // Catch:{ all -> 0x01d6 }
            r0 = 2131629379(0x7f0e1543, float:1.8886077E38)
            goto L_0x0194
        L_0x00c4:
            android.view.View r3 = X.C3250270t.A02(r15, r7)     // Catch:{ all -> 0x01d6 }
            goto L_0x01a4
        L_0x00ca:
            X.0qQ.A0A(r4)     // Catch:{ all -> 0x01d6 }
            X.0qQ.A0B(r4, r3)     // Catch:{ all -> 0x01d6 }
            X.0Tu r2 = X.0Tu.A05     // Catch:{ all -> 0x01d6 }
            r0 = 36604949708477597(0x820c020065149d, double:3.2124558197183023E-306)
            long r0 = X.182.A01(r2, r7, r0)     // Catch:{ all -> 0x01d6 }
            int r10 = (int) r0     // Catch:{ all -> 0x01d6 }
            if (r10 <= 0) goto L_0x0110
            r16 = 2131626761(0x7f0e0b09, float:1.8880767E38)
            android.view.LayoutInflater r13 = android.view.LayoutInflater.from(r4)     // Catch:{ all -> 0x01d6 }
            X.0qQ.A07(r13)     // Catch:{ all -> 0x01d6 }
            r1 = -1
            r0 = -2
            android.view.ViewGroup$LayoutParams r14 = new android.view.ViewGroup$LayoutParams     // Catch:{ all -> 0x01d6 }
            r14.<init>(r1, r0)     // Catch:{ all -> 0x01d6 }
            r18 = r8
            r17 = r3
            android.view.View r3 = X.2Su.A01(r13, r14, r15, r16, r17, r18)     // Catch:{ all -> 0x01d6 }
        L_0x00f7:
            r0 = 36319098153606042(0x81080700021b9a, double:3.031682145385708E-306)
            boolean r0 = X.182.A06(r2, r7, r0)     // Catch:{ all -> 0x01d6 }
            if (r0 == 0) goto L_0x0107
            r0 = 8
            r3.setVisibility(r0)     // Catch:{ all -> 0x01d6 }
        L_0x0107:
            X.0qQ.A0A(r3)     // Catch:{ all -> 0x01d6 }
            X.71H r0 = new X.71H     // Catch:{ all -> 0x01d6 }
            r0.<init>(r4, r3)     // Catch:{ all -> 0x01d6 }
            goto L_0x0183
        L_0x0110:
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r4)     // Catch:{ all -> 0x01d6 }
            r0 = 2131626761(0x7f0e0b09, float:1.8880767E38)
            android.view.View r3 = r1.inflate(r0, r15, r3)     // Catch:{ all -> 0x01d6 }
            goto L_0x00f7
        L_0x011c:
            android.view.View r3 = X.C46381Ddy.A00(r4, r15, r7)     // Catch:{ all -> 0x01d6 }
            goto L_0x01a4
        L_0x0122:
            X.0qQ.A0A(r4)     // Catch:{ all -> 0x01d6 }
            r14 = 0
            r16 = r8
            r17 = r3
            r18 = r3
            r13 = r4
            android.view.View r3 = X.C14033ToZ.A00(r13, r14, r15, r16, r17, r18)     // Catch:{ all -> 0x01d6 }
            goto L_0x01a7
        L_0x0132:
            X.0qQ.A0A(r4)     // Catch:{ all -> 0x01d6 }
            X.0qQ.A0B(r4, r3)     // Catch:{ all -> 0x01d6 }
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r4)     // Catch:{ all -> 0x01d6 }
            r0 = 2131629798(0x7f0e16e6, float:1.8886927E38)
            goto L_0x0194
        L_0x0140:
            X.0qQ.A0A(r4)     // Catch:{ all -> 0x01d6 }
            X.0qQ.A0B(r4, r3)     // Catch:{ all -> 0x01d6 }
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r4)     // Catch:{ all -> 0x01d6 }
            r0 = 2131628345(0x7f0e1139, float:1.888398E38)
            android.view.View r3 = r1.inflate(r0, r15, r3)     // Catch:{ all -> 0x01d6 }
            int r0 = X.C249703kE.FLAG_ADAPTER_FULLUPDATE     // Catch:{ all -> 0x01d6 }
            X.0qQ.A0A(r3)     // Catch:{ all -> 0x01d6 }
            X.DeQ r0 = new X.DeQ     // Catch:{ all -> 0x01d6 }
            r0.<init>(r3)     // Catch:{ all -> 0x01d6 }
            goto L_0x0183
        L_0x015c:
            X.0qQ.A0A(r4)     // Catch:{ all -> 0x01d6 }
            X.0qQ.A0B(r4, r3)     // Catch:{ all -> 0x01d6 }
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r4)     // Catch:{ all -> 0x01d6 }
            r0 = 2131625942(0x7f0e07d6, float:1.8879106E38)
            goto L_0x0194
        L_0x016a:
            X.0qQ.A0A(r4)     // Catch:{ all -> 0x01d6 }
            X.0qQ.A0B(r4, r3)     // Catch:{ all -> 0x01d6 }
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r4)     // Catch:{ all -> 0x01d6 }
            r0 = 2131628718(0x7f0e12ae, float:1.8884737E38)
            android.view.View r3 = r1.inflate(r0, r15, r3)     // Catch:{ all -> 0x01d6 }
            X.0qQ.A0A(r3)     // Catch:{ all -> 0x01d6 }
            X.EzD r0 = new X.EzD     // Catch:{ all -> 0x01d6 }
            r0.<init>(r3)     // Catch:{ all -> 0x01d6 }
        L_0x0183:
            r3.setTag(r0)     // Catch:{ all -> 0x01d6 }
            goto L_0x01a7
        L_0x0187:
            X.0qQ.A0A(r4)     // Catch:{ all -> 0x01d6 }
            X.0qQ.A0B(r4, r3)     // Catch:{ all -> 0x01d6 }
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r4)     // Catch:{ all -> 0x01d6 }
            r0 = 2131628369(0x7f0e1151, float:1.8884029E38)
        L_0x0194:
            android.view.View r3 = r1.inflate(r0, r15, r3)     // Catch:{ all -> 0x01d6 }
            goto L_0x01a4
        L_0x0199:
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r4)     // Catch:{ all -> 0x01d6 }
            r0 = 2131629046(0x7f0e13f6, float:1.8885402E38)
            android.view.View r3 = r1.inflate(r0, r15, r3)     // Catch:{ all -> 0x01d6 }
        L_0x01a4:
            X.0qQ.A07(r3)     // Catch:{ all -> 0x01d6 }
        L_0x01a7:
            X.6w2 r0 = X.C322566w2.ITEM_TYPE_DIVIDER     // Catch:{ all -> 0x01d6 }
            int r0 = r0.A00     // Catch:{ all -> 0x01d6 }
            if (r9 == r0) goto L_0x01b4
            X.6w2 r0 = X.C322566w2.ITEM_TYPE_PUBLIC_HIGHLIGHTS_EMPTY_PROFILE_NOTICE     // Catch:{ all -> 0x01d6 }
            int r1 = r0.A00     // Catch:{ all -> 0x01d6 }
            r0 = 1
            if (r9 != r1) goto L_0x01b5
        L_0x01b4:
            r0 = 0
        L_0x01b5:
            if (r0 == 0) goto L_0x01c3
            android.content.Context r1 = r5.A01     // Catch:{ all -> 0x01d6 }
            r0 = 2131100175(0x7f06020f, float:1.7812724E38)
            int r0 = r1.getColor(r0)     // Catch:{ all -> 0x01d6 }
            r3.setBackgroundColor(r0)     // Catch:{ all -> 0x01d6 }
        L_0x01c3:
            boolean r0 = com.facebook.systrace.Systrace.A0E(r11)
            if (r0 == 0) goto L_0x01cf
            r0 = 305847981(0x123adead, float:5.896572E-28)
            X.0fS.A00(r0)
        L_0x01cf:
            r0 = 575492508(0x224d519c, float:2.7825884E-18)
            X.AnonymousClass0fD.A0A(r0, r6)
            return r3
        L_0x01d6:
            r1 = move-exception
            boolean r0 = com.facebook.systrace.Systrace.A0E(r11)
            if (r0 == 0) goto L_0x01e3
            r0 = 974856315(0x3a1b207b, float:5.917621E-4)
            X.0fS.A00(r0)
        L_0x01e3:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C322546w0.createView(int, android.view.ViewGroup):android.view.View");
    }

    public final int getIdentifier(int i, Object obj, Object obj2) {
        return Arrays.hashCode(new Object[]{Integer.valueOf(i)});
    }
}
