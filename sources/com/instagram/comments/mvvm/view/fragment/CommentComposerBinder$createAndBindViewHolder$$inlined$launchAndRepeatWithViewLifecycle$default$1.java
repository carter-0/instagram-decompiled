package com.instagram.comments.mvvm.view.fragment;

import X.07U;
import X.0eS;
import X.0lr;
import X.0r1;
import X.0sL;
import X.1Hj;
import X.AnonymousClass07V;
import X.AnonymousClass07Z;
import X.AnonymousClass1Ek;
import X.AnonymousClass3DM;
import X.AnonymousClass4D7;
import X.AnonymousClass4DH;
import X.AnonymousClass4DU;
import X.C249763kK;
import X.C317746nl;
import X.C334347b7;
import X.C334397bC;
import X.C52971GgO;
import X.C53335GmL;
import X.C60340gF;
import X.C62320sa;
import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.comments.mvvm.view.fragment.CommentComposerBinder$createAndBindViewHolder$$inlined$launchAndRepeatWithViewLifecycle$default$1", f = "CommentComposerBinder.kt", i = {}, l = {73}, m = "invokeSuspend", n = {}, s = {})
public final class CommentComposerBinder$createAndBindViewHolder$$inlined$launchAndRepeatWithViewLifecycle$default$1 extends AnonymousClass1Ek implements 0sL {
    public int A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ View A02;
    public final /* synthetic */ 07U A03;
    public final /* synthetic */ AnonymousClass07Z A04;
    public final /* synthetic */ AnonymousClass4DH A05;
    public final /* synthetic */ C334397bC A06;
    public final /* synthetic */ C53335GmL A07;
    public final /* synthetic */ C334347b7 A08;
    public final /* synthetic */ C52971GgO A09;
    public final /* synthetic */ UserSession A0A;
    public final /* synthetic */ 0lr A0B;
    public final /* synthetic */ AnonymousClass4DU A0C;
    public final /* synthetic */ C317746nl A0D;
    public final /* synthetic */ C249763kK A0E;
    public final /* synthetic */ C62320sa A0F;
    public final /* synthetic */ C62320sa A0G;
    public final /* synthetic */ 0r1 A0H;

    @DebugMetadata(c = "com.instagram.comments.mvvm.view.fragment.CommentComposerBinder$createAndBindViewHolder$$inlined$launchAndRepeatWithViewLifecycle$default$1$1", f = "CommentComposerBinder.kt", i = {}, l = {109}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.instagram.comments.mvvm.view.fragment.CommentComposerBinder$createAndBindViewHolder$$inlined$launchAndRepeatWithViewLifecycle$default$1$1  reason: invalid class name */
    public final class AnonymousClass1 extends AnonymousClass1Ek implements 0sL {
        public int A00;
        public /* synthetic */ Object A01;

        /* JADX WARNING: type inference failed for: r3v0, types: [X.4D7, com.instagram.comments.mvvm.view.fragment.CommentComposerBinder$createAndBindViewHolder$$inlined$launchAndRepeatWithViewLifecycle$default$1$1] */
        public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r22) {
            C52971GgO ggO = ggO2;
            UserSession userSession = userSession2;
            AnonymousClass4DH r6 = r18;
            C334397bC r7 = r19;
            C334347b7 r9 = r21;
            C62320sa r2 = r29;
            View view = view2;
            Context context = context2;
            AnonymousClass4DU r13 = r25;
            0lr r12 = r24;
            C62320sa r17 = r2;
            ? r3 = new AnonymousClass1(context, view, r6, r7, gmL2, r9, ggO, userSession, r12, r13, r26, r27, r22, r17, r30, r31);
            r3.A01 = obj;
            return r3;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create(obj, (AnonymousClass4D7) obj2)).invokeSuspend(C60340gF.A00);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v0, resolved type: X.4DH} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v1, resolved type: X.4DH} */
        /* JADX WARNING: type inference failed for: r6v0, types: [X.4D7, com.instagram.comments.mvvm.view.fragment.CommentComposerBinder$createAndBindViewHolder$$inlined$launchAndRepeatWithViewLifecycle$default$1$1] */
        /* JADX WARNING: type inference failed for: r29v0, types: [X.0r1, java.lang.Object] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:14:0x0110 A[RETURN] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r35) {
            /*
                r34 = this;
                X.1Hj r5 = X.1Hj.A02
                r6 = r34
                int r0 = r6.A00
                r8 = 1
                if (r0 == 0) goto L_0x000f
                X.0eS.A00(r35)
            L_0x000c:
                X.0gF r5 = X.C60340gF.A00
                return r5
            L_0x000f:
                X.0eS.A00(r35)
                java.lang.Object r11 = r6.A01
                X.4Cq r11 = (X.C262224Cq) r11
                X.GgO r7 = r22
                X.0Ud r1 = r7.A0W
                X.7bC r0 = r19
                r33 = r0
                X.7b7 r0 = r21
                r32 = r0
                X.0sa r14 = r29
                android.view.View r13 = r17
                android.content.Context r0 = r16
                r31 = r0
                com.instagram.common.session.UserSession r4 = r23
                X.4DH r3 = r18
                X.4DU r15 = r25
                X.0lr r10 = r24
                X.GmL r9 = r20
                r2 = 0
                com.instagram.comments.mvvm.view.fragment.CommentComposerBinder$createAndBindViewHolder$5$1 r12 = new com.instagram.comments.mvvm.view.fragment.CommentComposerBinder$createAndBindViewHolder$5$1
                r16 = r12
                r17 = r0
                r18 = r13
                r19 = r3
                r20 = r33
                r21 = r9
                r22 = r32
                r23 = r7
                r24 = r4
                r25 = r10
                r26 = r15
                r27 = r2
                r28 = r14
                r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
                X.0pz r0 = new X.0pz
                r0.<init>(r12, r1)
                X.AnonymousClass11O.A03(r11, r0)
                boolean r0 = X.C334457bI.A00(r4)
                if (r0 == 0) goto L_0x0115
                X.0xx r11 = X.AnonymousClass07a.A00(r3)
                r0 = 0
                X.0qQ.A0B(r4, r0)
                r0 = 126(0x7e, float:1.77E-43)
                com.instagram.stickersearch.AvatarStickerPreRenderInteractor r12 = new com.instagram.stickersearch.AvatarStickerPreRenderInteractor
                r12.<init>(r2, r4, r0)
                X.0Tu r13 = X.0Tu.A05
                r0 = 36320356578959707(0x81092c0001215b, double:3.032477978646638E-306)
                boolean r0 = X.182.A06(r13, r4, r0)
                if (r0 == 0) goto L_0x0111
                X.6nw r19 = X.C317846nw.STATIC_AVATAR_STICKERS
            L_0x0080:
                r21 = 26
                X.MH4 r1 = new X.MH4
                r16 = r1
                r17 = r12
                r18 = r4
                r20 = r2
                r16.<init>(r17, r18, r19, r20, r21)
                X.19B r12 = X.19B.A00
                java.lang.Integer r0 = X.AnonymousClass05K.A00
                X.1Eo.A03(r0, r12, r1, r11)
                r0 = 32
                X.9Kp r13 = new X.9Kp
                r13.<init>(r4, r0)
                java.lang.Class<X.7cR> r0 = X.C335127cR.class
                X.0Yh r12 = new X.0Yh
                r12.<init>(r0)
                r0 = 34
                X.9Kp r11 = new X.9Kp
                r11.<init>(r3, r0)
                r0 = 46
                X.9M0 r1 = new X.9M0
                r1.<init>(r0, r2, r3)
                X.2kA r0 = new X.2kA
                r0.<init>(r11, r13, r1, r12)
                java.lang.Object r19 = r0.getValue()
            L_0x00bb:
                X.07U r18 = X.07U.A05
                X.07Z r17 = r3.getViewLifecycleOwner()
                X.0xx r1 = X.AnonymousClass07a.A00(r17)
                r22 = 6
                X.9KM r0 = new X.9KM
                r16 = r0
                r20 = r7
                r21 = r2
                r16.<init>((java.lang.Object) r17, (java.lang.Object) r18, (java.lang.Object) r19, (java.lang.Object) r20, (X.AnonymousClass4D7) r21, (int) r22)
                X.19B r12 = X.19B.A00
                java.lang.Integer r11 = X.AnonymousClass05K.A00
                X.1Eo.A03(r11, r12, r0, r1)
            L_0x00d9:
                X.0r1 r29 = new X.0r1
                r29.<init>()
                X.0Ud r14 = r7.A0V
                X.6nl r13 = r26
                X.3kK r12 = r27
                X.0sa r11 = r30
                X.0r1 r1 = r31
                com.instagram.comments.mvvm.view.fragment.CommentComposerBinder$createAndBindViewHolder$5$2 r0 = new com.instagram.comments.mvvm.view.fragment.CommentComposerBinder$createAndBindViewHolder$5$2
                r24 = r15
                r25 = r13
                r26 = r12
                r28 = r11
                r30 = r1
                r21 = r7
                r22 = r4
                r23 = r10
                r18 = r33
                r19 = r9
                r20 = r32
                r15 = r0
                r16 = r31
                r17 = r3
                r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
                r6.A00 = r8
                java.lang.Object r0 = X.AnonymousClass11O.A00(r6, r0, r14)
                if (r0 != r5) goto L_0x000c
                return r5
            L_0x0111:
                X.6nw r19 = X.C317846nw.MIXED_AVATAR_STICKERS
                goto L_0x0080
            L_0x0115:
                r0 = 0
                X.0qQ.A0B(r4, r0)
                X.0Tu r11 = X.0Tu.A05
                r0 = 36320356579221853(0x81092c0005215d, double:3.03247797881242E-306)
                boolean r0 = X.182.A06(r11, r4, r0)
                if (r0 == 0) goto L_0x00d9
                r0 = 33
                X.9Kp r13 = new X.9Kp
                r13.<init>(r4, r0)
                java.lang.Class<X.7cR> r0 = X.C335127cR.class
                X.0Yh r12 = new X.0Yh
                r12.<init>(r0)
                r0 = 35
                X.9Kp r11 = new X.9Kp
                r11.<init>(r3, r0)
                r0 = 47
                X.9M0 r1 = new X.9M0
                r1.<init>(r0, r2, r3)
                X.2kA r0 = new X.2kA
                r0.<init>(r11, r13, r1, r12)
                java.lang.Object r19 = r0.getValue()
                goto L_0x00bb
            */
            throw new UnsupportedOperationException("Method not decompiled: com.instagram.comments.mvvm.view.fragment.CommentComposerBinder$createAndBindViewHolder$$inlined$launchAndRepeatWithViewLifecycle$default$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CommentComposerBinder$createAndBindViewHolder$$inlined$launchAndRepeatWithViewLifecycle$default$1(Context context, View view, 07U r5, AnonymousClass07Z r6, AnonymousClass4DH r7, C334397bC r8, C53335GmL gmL, C334347b7 r10, C52971GgO ggO, UserSession userSession, 0lr r13, AnonymousClass4DU r14, C317746nl r15, C249763kK r16, AnonymousClass4D7 r17, C62320sa r18, C62320sa r19, 0r1 r20) {
        super(2, r17);
        this.A04 = r6;
        this.A03 = r5;
        this.A09 = ggO;
        this.A0A = userSession;
        this.A05 = r7;
        this.A06 = r8;
        this.A08 = r10;
        this.A0F = r18;
        this.A02 = view;
        this.A01 = context;
        this.A0C = r14;
        this.A0B = r13;
        this.A07 = gmL;
        this.A0D = r15;
        this.A0E = r16;
        this.A0G = r19;
        this.A0H = r20;
    }

    /* JADX WARNING: type inference failed for: r16v0, types: [X.4D7, com.instagram.comments.mvvm.view.fragment.CommentComposerBinder$createAndBindViewHolder$$inlined$launchAndRepeatWithViewLifecycle$default$1] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r37) {
        AnonymousClass07Z r17 = this.A04;
        07U r15 = this.A03;
        C52971GgO ggO = this.A09;
        UserSession userSession = this.A0A;
        AnonymousClass4DH r12 = this.A05;
        C334397bC r11 = this.A06;
        C334347b7 r10 = this.A08;
        C62320sa r9 = this.A0F;
        View view = this.A02;
        Context context = this.A01;
        AnonymousClass4DU r6 = this.A0C;
        0lr r5 = this.A0B;
        C53335GmL gmL = this.A07;
        C317746nl r3 = this.A0D;
        C249763kK r2 = this.A0E;
        AnonymousClass07Z r20 = r17;
        return new CommentComposerBinder$createAndBindViewHolder$$inlined$launchAndRepeatWithViewLifecycle$default$1(context, view, r15, r20, r12, r11, gmL, r10, ggO, userSession, r5, r6, r3, r2, r37, r9, this.A0G, this.A0H);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((CommentComposerBinder$createAndBindViewHolder$$inlined$launchAndRepeatWithViewLifecycle$default$1) create(obj, (AnonymousClass4D7) obj2)).invokeSuspend(C60340gF.A00);
    }

    /* JADX WARNING: type inference failed for: r14v0, types: [X.4D7, com.instagram.comments.mvvm.view.fragment.CommentComposerBinder$createAndBindViewHolder$$inlined$launchAndRepeatWithViewLifecycle$default$1] */
    public final Object invokeSuspend(Object obj) {
        Object obj2 = 1Hj.A02;
        if (this.A00 != 0) {
            0eS.A00(obj);
        } else {
            0eS.A00(obj);
            AnonymousClass07V lifecycle = this.A04.getLifecycle();
            07U r10 = this.A03;
            C52971GgO ggO = this.A09;
            UserSession userSession = this.A0A;
            final AnonymousClass4DH r18 = this.A05;
            final C334397bC r19 = this.A06;
            C62320sa r15 = this.A0F;
            View view = this.A02;
            Context context = this.A01;
            AnonymousClass4DU r7 = this.A0C;
            0lr r6 = this.A0B;
            C53335GmL gmL = this.A07;
            C317746nl r4 = this.A0D;
            C249763kK r3 = this.A0E;
            final C249763kK r27 = r3;
            final C62320sa r29 = r15;
            final C62320sa r30 = this.A0G;
            final 0r1 r31 = this.A0H;
            final C52971GgO ggO2 = ggO;
            final UserSession userSession2 = userSession;
            final 0lr r24 = r6;
            final AnonymousClass4DU r25 = r7;
            final C317746nl r26 = r4;
            final View view2 = view;
            final C53335GmL gmL2 = gmL;
            final C334347b7 r21 = this.A08;
            final Context context2 = context;
            AnonymousClass1 r152 = new AnonymousClass1((AnonymousClass4D7) null);
            this.A00 = 1;
            if (AnonymousClass3DM.A00(r10, lifecycle, this, r152) == obj2) {
                return obj2;
            }
        }
        return C60340gF.A00;
    }
}
