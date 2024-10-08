package com.instagram.comments.mvvm.view.fragment;

import X.0sL;
import X.0sP;
import X.AnonymousClass1Ek;
import X.AnonymousClass32A;
import X.AnonymousClass4D7;
import X.AnonymousClass4DH;
import X.AnonymousClass4DU;
import X.C334177an;
import X.C334297b2;
import X.C334657be;
import X.C334677bg;
import X.C52971GgO;
import X.C59544JNq;
import X.C60340gF;
import X.C62320sa;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.comments.mvvm.view.fragment.CommentViewUiEffectHandler$handleCommentUiEffects$1", f = "CommentViewUiEffectHandler.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class CommentViewUiEffectHandler$handleCommentUiEffects$1 extends AnonymousClass1Ek implements 0sL {
    public /* synthetic */ Object A00;
    public final /* synthetic */ FragmentActivity A01;
    public final /* synthetic */ C59544JNq A02;
    public final /* synthetic */ AnonymousClass4DH A03;
    public final /* synthetic */ C334677bg A04;
    public final /* synthetic */ C334177an A05;
    public final /* synthetic */ C334657be A06;
    public final /* synthetic */ C334297b2 A07;
    public final /* synthetic */ C52971GgO A08;
    public final /* synthetic */ UserSession A09;
    public final /* synthetic */ AnonymousClass4DU A0A;
    public final /* synthetic */ AnonymousClass32A A0B;
    public final /* synthetic */ String A0C;
    public final /* synthetic */ C62320sa A0D;
    public final /* synthetic */ C62320sa A0E;
    public final /* synthetic */ 0sP A0F;
    public final /* synthetic */ boolean A0G;
    public final /* synthetic */ boolean A0H;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CommentViewUiEffectHandler$handleCommentUiEffects$1(FragmentActivity fragmentActivity, C59544JNq jNq, AnonymousClass4DH r4, C334677bg r5, C334177an r6, C334657be r7, C334297b2 r8, C52971GgO ggO, UserSession userSession, AnonymousClass4DU r11, AnonymousClass32A r12, String str, AnonymousClass4D7 r14, C62320sa r15, C62320sa r16, 0sP r17, boolean z, boolean z2) {
        super(2, r14);
        this.A01 = fragmentActivity;
        this.A09 = userSession;
        this.A0C = str;
        this.A08 = ggO;
        this.A0F = r17;
        this.A05 = r6;
        this.A0B = r12;
        this.A0G = z;
        this.A03 = r4;
        this.A04 = r5;
        this.A0E = r15;
        this.A0A = r11;
        this.A02 = jNq;
        this.A0D = r16;
        this.A0H = z2;
        this.A06 = r7;
        this.A07 = r8;
    }

    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r31) {
        FragmentActivity fragmentActivity = this.A01;
        String str = this.A0C;
        C52971GgO ggO = this.A08;
        0sP r12 = this.A0F;
        C334177an r11 = this.A05;
        AnonymousClass32A r10 = this.A0B;
        boolean z = this.A0G;
        AnonymousClass4DH r8 = this.A03;
        C334677bg r7 = this.A04;
        C62320sa r6 = this.A0E;
        AnonymousClass4DU r5 = this.A0A;
        C59544JNq jNq = this.A02;
        C62320sa r3 = this.A0D;
        boolean z2 = this.A0H;
        C334657be r1 = this.A06;
        UserSession userSession = this.A09;
        AnonymousClass4DU r19 = r5;
        AnonymousClass32A r20 = r10;
        C334657be r15 = r1;
        C334297b2 r16 = this.A07;
        C52971GgO ggO2 = ggO;
        C334677bg r13 = r7;
        C334177an r14 = r11;
        C59544JNq jNq2 = jNq;
        AnonymousClass4DH r122 = r8;
        FragmentActivity fragmentActivity2 = fragmentActivity;
        CommentViewUiEffectHandler$handleCommentUiEffects$1 commentViewUiEffectHandler$handleCommentUiEffects$1 = new CommentViewUiEffectHandler$handleCommentUiEffects$1(fragmentActivity2, jNq2, r122, r13, r14, r15, r16, ggO2, userSession, r19, r20, str, r31, r6, r3, r12, z, z2);
        commentViewUiEffectHandler$handleCommentUiEffects$1.A00 = obj;
        return commentViewUiEffectHandler$handleCommentUiEffects$1;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((CommentViewUiEffectHandler$handleCommentUiEffects$1) create(obj, (AnonymousClass4D7) obj2)).invokeSuspend(C60340gF.A00);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v15, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v16, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v12, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v112, resolved type: com.instagram.user.model.User} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v18, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v19, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v20, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r11v18, types: [X.07Z, java.lang.Object, X.4DH] */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x0767, code lost:
        if (r7.A01 == false) goto L_0x0769;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:311:0x0c94, code lost:
        if (r6 != null) goto L_0x0c81;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:336:0x0d49, code lost:
        if (((X.AnonymousClass37F) r6).A0g != true) goto L_0x0d4b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:342:0x0de0, code lost:
        if (r4 != null) goto L_0x0dec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:351:0x0e1e, code lost:
        if (((X.AnonymousClass37F) r0).A0g != true) goto L_0x0e20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x024c, code lost:
        if (((X.C376469Ic) r0).A00 != 0) goto L_0x024e;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r26) {
        /*
            r25 = this;
            X.0eS.A00(r26)
            r2 = r25
            java.lang.Object r0 = r2.A00
            X.7ai r0 = (X.C334127ai) r0
            boolean r1 = r0 instanceof X.C334687bi
            if (r1 == 0) goto L_0x002f
            X.9qh r5 = new X.9qh
            r5.<init>()
            androidx.fragment.app.FragmentActivity r3 = r2.A01
            com.instagram.common.session.UserSession r4 = r2.A09
            X.7bi r0 = (X.C334687bi) r0
            com.instagram.user.model.User r6 = r0.A00
            java.lang.String r8 = r2.A0C
            r9 = 0
            r10 = 0
            java.lang.String r7 = "comment_actions_menu_mvvm"
            X.C49960FGs.A04(r3, r4, r5, r6, r7, r8, r9, r10)
        L_0x0023:
            X.GgO r0 = r2.A08
            X.05G r1 = r0.A0O
            X.7ah r0 = X.C334117ah.A00
            r1.Epw(r0)
            X.0gF r0 = X.C60340gF.A00
            return r0
        L_0x002f:
            r4 = 2
            boolean r1 = X.AnonymousClass9J9.A00(r4, r0)
            java.lang.String r9 = "Required value was null."
            if (r1 == 0) goto L_0x00de
            androidx.fragment.app.FragmentActivity r15 = r2.A01
            com.instagram.common.session.UserSession r10 = r2.A09
            X.9J9 r0 = (X.AnonymousClass9J9) r0
            java.lang.Object r1 = r0.A01
            X.1bK r1 = (X.1bK) r1
            if (r1 == 0) goto L_0x1164
            X.3gp r11 = new X.3gp
            r11.<init>(r1)
            X.GgO r9 = r2.A08
            java.lang.String r13 = r0.A02
            java.lang.String r14 = r0.A03
            r0 = 0
            X.0qQ.A0B(r15, r0)
            r0 = 1
            X.0qQ.A0B(r10, r0)
            r0 = 3
            X.0qQ.A0B(r9, r0)
            r0 = 4
            X.0qQ.A0B(r13, r0)
            java.lang.String r0 = "tap_hide"
            r18 = 0
            X.AAQ.A01(r10, r11, r0)
            X.1Av r0 = X.1Au.A00(r10)
            X.0xa r0 = r0.A01
            java.lang.String r4 = "hidden_comments_nux_count"
            r5 = 0
            int r0 = r0.getInt(r4, r5)
            r3 = 1
            if (r0 < r3) goto L_0x0d2d
            X.Aok r12 = new X.Aok
            r12.<init>(r9, r13, r14)
            android.os.Handler r4 = X.A28.A00
            java.util.ArrayList r0 = X.A27.A00
            int r0 = X.C48775Ejy.A00(r10)
            long r0 = (long) r0
            r4.postDelayed(r12, r0)
            X.6ap r4 = new X.6ap
            r4.<init>()
            android.content.res.Resources r1 = r15.getResources()
            r0 = 2131963327(0x7f132dbf, float:1.9563404E38)
            java.lang.String r0 = r1.getString(r0)
            r4.A0D = r0
            android.content.res.Resources r1 = r15.getResources()
            r0 = 2131975851(0x7f135eab, float:1.9588806E38)
            java.lang.String r0 = r1.getString(r0)
            X.0qQ.A07(r0)
            r4.A0G = r0
            X.Ae5 r8 = new X.Ae5
            r8.<init>(r9, r10, r11, r12, r13, r14)
            r4.A0A = r8
            r4.A0L = r3
            r4.A06()
            com.instagram.user.model.User r0 = r11.A08
            if (r0 == 0) goto L_0x00ce
            java.lang.String r0 = r0.getUsername()
            android.content.res.Resources r3 = r15.getResources()
            r1 = 2131963326(0x7f132dbe, float:1.9563402E38)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r0 = r3.getString(r1, r0)
            r4.A0I = r0
        L_0x00ce:
            X.1xC r3 = X.1xC.A01
            X.Dc2 r1 = r4.A00()
        L_0x00d4:
            X.3GP r0 = new X.3GP
            r0.<init>(r1)
            r3.A00(r0)
            goto L_0x0023
        L_0x00de:
            boolean r1 = r0 instanceof X.C334697bj
            if (r1 == 0) goto L_0x00f4
            X.0sP r3 = r2.A0F
            if (r3 == 0) goto L_0x0023
            X.7bj r0 = (X.C334697bj) r0
            float r1 = r0.A00
            java.lang.Float r0 = new java.lang.Float
            r0.<init>(r1)
            r3.invoke(r0)
            goto L_0x0023
        L_0x00f4:
            r3 = 1
            boolean r12 = r0 instanceof X.AnonymousClass9JC
            if (r12 == 0) goto L_0x0175
            r5 = r0
            X.9JC r5 = (X.AnonymousClass9JC) r5
            int r1 = r5.A00
            if (r1 != r3) goto L_0x0175
            androidx.fragment.app.FragmentActivity r4 = r2.A01
            com.instagram.common.session.UserSession r7 = r2.A09
            java.lang.Object r0 = r5.A01
            X.1bK r0 = (X.1bK) r0
            if (r0 == 0) goto L_0x116a
            X.3gp r8 = new X.3gp
            r8.<init>(r0)
            X.GgO r6 = r2.A08
            java.lang.String r9 = r5.A03
            java.lang.String r10 = r5.A04
            java.lang.Object r1 = r5.A02
            r0 = 0
            X.0qQ.A0B(r4, r0)
            X.0qQ.A0B(r7, r3)
            r0 = 3
            X.0qQ.A0B(r6, r0)
            r0 = 4
            X.0qQ.A0B(r9, r0)
            r0 = 6
            X.0qQ.A0B(r1, r0)
            X.7de r0 = X.C335857de.COVERED_COMMENT
            r11 = 0
            if (r1 != r0) goto L_0x0130
            r11 = 1
        L_0x0130:
            X.7de r0 = X.C335857de.HIDDEN_COMMENT
            r12 = 0
            if (r1 != r0) goto L_0x0136
            r12 = 1
        L_0x0136:
            if (r11 == 0) goto L_0x016d
            java.lang.String r1 = r8.A0G
            r0 = 407(0x197, float:5.7E-43)
            java.lang.String r0 = X.C66579MXk.A00(r0)
            r6.A0e(r1, r0)
        L_0x0143:
            X.8ab r1 = new X.8ab
            r1.<init>((android.app.Activity) r4)
            r0 = 2131975877(0x7f135ec5, float:1.9588859E38)
            r1.A09(r0)
            r0 = 2131975878(0x7f135ec6, float:1.958886E38)
            X.AKl r5 = new X.AKl
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            r1.A0I(r5, r0)
            r3 = 2131954722(0x7f130c22, float:1.9545951E38)
            X.AKX r0 = new X.AKX
            r0.<init>(r7, r8, r12)
            r1.A0G(r0, r3)
        L_0x0164:
            android.app.Dialog r1 = r1.A02()
        L_0x0168:
            X.AnonymousClass0fN.A00(r1)
            goto L_0x0023
        L_0x016d:
            if (r12 == 0) goto L_0x0143
            java.lang.String r0 = "tap_unhide"
            X.AAQ.A00(r7, r8, r0)
            goto L_0x0143
        L_0x0175:
            r6 = 5
            boolean r1 = X.AnonymousClass9IK.A00(r6, r0)
            if (r1 == 0) goto L_0x0189
            X.9IK r0 = (X.AnonymousClass9IK) r0
            java.lang.Object r1 = r0.A01
            X.JLg r1 = (X.C59482JLg) r1
            androidx.fragment.app.FragmentActivity r0 = r2.A01
            X.C334177an.A00(r0, r1)
            goto L_0x0023
        L_0x0189:
            boolean r1 = r0 instanceof X.C334707bk
            if (r1 == 0) goto L_0x0205
            X.7an r1 = r2.A05
            X.0eM r1 = r1.A00
            java.lang.Object r4 = r1.getValue()
            X.A3Z r4 = (X.A3Z) r4
            androidx.fragment.app.FragmentActivity r7 = r2.A01
            r1 = r0
            X.7bk r1 = (X.C334707bk) r1
            int r8 = r1.A00
            X.GgO r5 = r2.A08
            r1 = 34
            X.Ins r6 = new X.Ins
            r6.<init>(r1, r0, r5)
            r0 = 0
            X.0qQ.A0B(r7, r0)
            X.Dc2 r5 = r4.A00
            if (r5 == 0) goto L_0x01b9
            X.1xC r1 = X.1xC.A01
            X.3GR r0 = new X.3GR
            r0.<init>(r5)
            r1.A00(r0)
        L_0x01b9:
            android.content.res.Resources r5 = r7.getResources()
            r1 = 2131821016(0x7f1101d8, float:1.9274763E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r0 = r5.getQuantityString(r1, r8, r0)
            X.0qQ.A07(r0)
            X.6ap r5 = new X.6ap
            r5.<init>()
            r5.A0D = r0
            android.content.res.Resources r1 = r7.getResources()
            r0 = 2131975851(0x7f135eab, float:1.9588806E38)
            java.lang.String r0 = r1.getString(r0)
            X.0qQ.A07(r0)
            r5.A0G = r0
            X.Ae0 r0 = new X.Ae0
            r0.<init>(r4, r6)
            r5.A0A(r0)
            r5.A0L = r3
            r5.A06()
            X.Dc2 r3 = r5.A00()
            X.1xC r1 = X.1xC.A01
            X.3GP r0 = new X.3GP
            r0.<init>(r3)
            r1.A00(r0)
        L_0x0201:
            r4.A00 = r3
            goto L_0x0023
        L_0x0205:
            X.7bl r1 = X.C334717bl.A00
            boolean r1 = X.0qQ.A0K(r0, r1)
            if (r1 == 0) goto L_0x0227
            X.7an r0 = r2.A05
            X.0eM r0 = r0.A00
            java.lang.Object r4 = r0.getValue()
            X.A3Z r4 = (X.A3Z) r4
            X.Dc2 r3 = r4.A00
            if (r3 == 0) goto L_0x0225
            X.1xC r1 = X.1xC.A01
            X.3GR r0 = new X.3GR
            r0.<init>(r3)
            r1.A00(r0)
        L_0x0225:
            r3 = 0
            goto L_0x0201
        L_0x0227:
            boolean r11 = r0 instanceof X.C376589Io
            if (r11 == 0) goto L_0x0241
            r5 = r0
            X.9Io r5 = (X.C376589Io) r5
            int r1 = r5.A00
            if (r1 != r4) goto L_0x0241
            X.1Wj r4 = X.1Wj.A00
            if (r4 == 0) goto L_0x0023
            androidx.fragment.app.FragmentActivity r3 = r2.A01
            com.instagram.common.session.UserSession r1 = r2.A09
            java.lang.String r0 = r5.A01
            r4.A03(r1, r3, r0)
            goto L_0x0023
        L_0x0241:
            r1 = 0
            boolean r10 = r0 instanceof X.C376469Ic
            if (r10 == 0) goto L_0x024e
            r5 = r0
            X.9Ic r5 = (X.C376469Ic) r5
            int r5 = r5.A00
            r7 = 1
            if (r5 == r1) goto L_0x024f
        L_0x024e:
            r7 = 0
        L_0x024f:
            r5 = 0
            if (r7 == 0) goto L_0x027e
            X.32A r7 = r2.A0B
            androidx.fragment.app.FragmentActivity r6 = r2.A01
            r4 = r0
            X.9Ic r4 = (X.C376469Ic) r4
            java.lang.Object r3 = r4.A02
            android.graphics.RectF r3 = (android.graphics.RectF) r3
            X.Aey r1 = new X.Aey
            r1.<init>(r0)
            X.Upq r0 = new X.Upq
            r0.<init>((android.app.Activity) r6, (android.graphics.RectF) r3, (X.C230222pE) r1)
            r7.A05 = r0
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r0 = r0.toString()
            r7.A0C = r0
            java.lang.Object r1 = r4.A03
            com.instagram.model.reels.Reel r1 = (com.instagram.model.reels.Reel) r1
            X.3BQ r0 = X.AnonymousClass3BQ.COMMENTS
            r7.A03(r1, r0, r5)
            goto L_0x0023
        L_0x027e:
            boolean r7 = X.AnonymousClass9J9.A00(r3, r0)
            r8 = 6
            if (r7 == 0) goto L_0x02bf
            com.instagram.common.session.UserSession r10 = r2.A09
            X.9J9 r0 = (X.AnonymousClass9J9) r0
            java.lang.String r4 = r0.A02
            java.lang.String r3 = r2.A0C
            java.lang.String r1 = "comment_thread_view"
            X.Dfc r3 = X.C46548Dgp.A01(r10, r4, r1, r3)
            java.lang.Object r1 = r0.A01
            com.instagram.fanclub.intf.UserPayFanclubUpsellParams r1 = (com.instagram.fanclub.intf.UserPayFanclubUpsellParams) r1
            r3.A00 = r1
            java.lang.String r0 = r0.A03
            r3.A0N = r0
            com.instagram.profile.intf.UserDetailLaunchConfig r1 = r3.A04()
            boolean r0 = r2.A0G
            if (r0 == 0) goto L_0x0dbc
            java.lang.Class<com.instagram.modal.ModalActivity> r11 = com.instagram.modal.ModalActivity.class
            X.1a0 r0 = X.C46447Df9.A03()
            X.1a1 r0 = r0.A01
            android.os.Bundle r9 = r0.A01(r10, r1)
            androidx.fragment.app.FragmentActivity r8 = r2.A01
            java.lang.String r12 = "profile"
        L_0x02b5:
            X.6W8 r7 = new X.6W8
            r7.<init>(r8, r9, r10, r11, r12)
            r7.A0C(r8)
            goto L_0x0023
        L_0x02bf:
            boolean r7 = r0 instanceof X.C334727bm
            if (r7 == 0) goto L_0x031d
            androidx.fragment.app.FragmentActivity r9 = r2.A01
            X.4DH r11 = r2.A03
            com.instagram.common.session.UserSession r13 = r2.A09
            X.7bm r0 = (X.C334727bm) r0
            X.7cr r12 = r0.A03
            X.28D r10 = r0.A02
            android.content.DialogInterface$OnShowListener r7 = r0.A01
            android.content.DialogInterface$OnDismissListener r0 = r0.A00
            X.0qQ.A0B(r9, r1)
            X.0qQ.A0B(r11, r3)
            X.0qQ.A0B(r13, r4)
            r1 = 4
            X.0qQ.A0B(r10, r1)
            X.0qQ.A0B(r7, r6)
            X.0qQ.A0B(r0, r8)
            X.8ab r1 = new X.8ab
            r1.<init>((android.app.Activity) r9)
            r3 = 2131956150(0x7f1311b6, float:1.9548848E38)
            java.lang.String r3 = r9.getString(r3)
            r1.A05 = r3
            r3 = 2131956152(0x7f1311b8, float:1.9548852E38)
            r1.A08(r3)
            r3 = 2131237693(0x7f081b3d, float:1.8091644E38)
            android.graphics.drawable.Drawable r3 = r9.getDrawable(r3)
            r1.A0i(r3)
            r3 = 2131956154(0x7f1311ba, float:1.9548856E38)
            X.AKj r8 = new X.AKj
            r8.<init>(r9, r10, r11, r12, r13)
            r1.A0I(r8, r3)
            r1.A0g(r7)
            r1.A0f(r0)
            r0 = 2131956153(0x7f1311b9, float:1.9548854E38)
            r1.A0H(r5, r0)
            goto L_0x0164
        L_0x031d:
            if (r10 == 0) goto L_0x0374
            r10 = r0
            X.9Ic r10 = (X.C376469Ic) r10
            int r7 = r10.A00
            if (r7 != r3) goto L_0x0374
            X.7an r0 = r2.A05
            X.0eM r0 = r0.A01
            r0.getValue()
            androidx.fragment.app.FragmentActivity r8 = r2.A01
            com.instagram.common.session.UserSession r0 = r2.A09
            java.lang.Object r7 = r10.A03
            android.content.DialogInterface$OnClickListener r7 = (android.content.DialogInterface.OnClickListener) r7
            java.lang.Object r6 = r10.A01
            android.content.DialogInterface$OnClickListener r6 = (android.content.DialogInterface.OnClickListener) r6
            java.lang.Object r5 = r10.A02
            android.content.DialogInterface$OnCancelListener r5 = (android.content.DialogInterface.OnCancelListener) r5
            X.0qQ.A0B(r8, r1)
            X.0qQ.A0B(r0, r3)
            X.0qQ.A0B(r7, r4)
            r0 = 3
            X.0qQ.A0B(r6, r0)
            r0 = 4
            X.0qQ.A0B(r5, r0)
            X.02m r3 = X.02m.A0p
            X.0qQ.A07(r3)
            r1 = 309476254(0x12723b9e, float:7.643522E-28)
            java.lang.String r0 = "unpin_screen_impression"
            r3.markerPoint(r1, r0)
            X.8ab r1 = new X.8ab
            r1.<init>((android.app.Activity) r8)
            r0 = 2131975961(0x7f135f19, float:1.958903E38)
            r1.A09(r0)
            r0 = 2131975962(0x7f135f1a, float:1.9589031E38)
            r1.A0I(r7, r0)
            r1.A0C(r6)
        L_0x036f:
            r1.A0B(r5)
            goto L_0x0164
        L_0x0374:
            boolean r7 = r0 instanceof X.C334737bn
            if (r7 == 0) goto L_0x0383
            X.7bg r0 = r2.A04
            X.6zK r0 = r0.A00
            if (r0 == 0) goto L_0x0023
            r0.A00()
            goto L_0x0023
        L_0x0383:
            if (r11 == 0) goto L_0x03ee
            r10 = r0
            X.9Io r10 = (X.C376589Io) r10
            int r7 = r10.A00
            if (r7 != r1) goto L_0x03ee
            java.lang.String r6 = r10.A01
            r0 = 893(0x37d, float:1.251E-42)
            java.lang.String r4 = X.AnonymousClass000.A00(r0)
            X.0eP r0 = new X.0eP
            r0.<init>(r4, r6)
            X.0eP[] r0 = new X.0eP[]{r0}
            android.os.Bundle r9 = X.Q21.A00(r0)
            boolean r0 = r2.A0G
            if (r0 == 0) goto L_0x0d9e
            X.37E r0 = X.AnonymousClass37D.A00
            androidx.fragment.app.FragmentActivity r8 = r2.A01
            X.37D r0 = r0.A01(r8)
            X.7Pu r7 = X.C48943Emh.A00(r0)
            if (r7 == 0) goto L_0x0663
            com.instagram.common.session.UserSession r6 = r2.A09
            X.0qQ.A0B(r6, r1)
            X.0Tu r0 = X.0Tu.A05
            r4 = 36329865636692331(0x8111d20003416b, double:3.0384915450466514E-306)
            boolean r0 = X.182.A06(r0, r6, r4)
            if (r0 == 0) goto L_0x0663
            X.C46339Dch.A00()
            X.0qQ.A0B(r9, r1)
            X.E6n r4 = new X.E6n
            r4.<init>()
            r4.setArguments(r9)
            X.7Pr r1 = new X.7Pr
            r1.<init>(r6)
            r1.A11 = r3
            r1.A1G = r3
            r0 = 1060320051(0x3f333333, float:0.7)
            r1.A03 = r0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            r1.A0a = r0
            r1.A1O = r3
            r7.A0F(r4, r1)
            goto L_0x0023
        L_0x03ee:
            boolean r7 = r0 instanceof X.C334747bo
            if (r7 == 0) goto L_0x04a7
            androidx.fragment.app.FragmentActivity r15 = r2.A01
            X.GgO r11 = r2.A08
            com.instagram.common.session.UserSession r10 = r2.A09
            X.7bo r0 = (X.C334747bo) r0
            boolean r9 = r2.A0G
            X.0sa r12 = r2.A0E
            X.4DU r7 = r2.A0A
            X.0qQ.A0B(r15, r1)
            X.0qQ.A0B(r11, r3)
            X.0qQ.A0B(r10, r4)
            r4 = 3
            X.0qQ.A0B(r0, r4)
            X.0qQ.A0B(r7, r8)
            java.lang.String r8 = r0.A06
            X.TpH r5 = r0.A01
            X.UzD r4 = r0.A02
            r16 = r7
            r17 = r10
            r18 = r5
            r19 = r4
            r20 = r8
            X.OcF r8 = X.ORV.A01(r15, r16, r17, r18, r19, r20)
            com.instagram.user.model.User r13 = r0.A00
            r8.A01 = r13
            X.Pvj r4 = r0.A03
            r8.A07(r4)
            r8.A05()
            X.7Pr r5 = new X.7Pr
            r5.<init>(r10)
            java.lang.String r4 = r13.getUsername()
            r5.A0d = r4
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            r5.A0a = r3
            r3 = 1060320051(0x3f333333, float:0.7)
            r5.A03 = r3
            X.37E r3 = X.AnonymousClass37D.A00
            X.37D r4 = r3.A01(r15)
            X.7Pu r3 = X.C48943Emh.A00(r4)
            if (r3 != 0) goto L_0x0456
            X.7Pu r3 = r5.A00()
        L_0x0456:
            if (r4 == 0) goto L_0x0462
            X.AgV r14 = new X.AgV
            r14.<init>(r0, r10, r12)
            r12 = r4
            X.37F r12 = (X.AnonymousClass37F) r12
            r12.A0H = r14
        L_0x0462:
            boolean r12 = r0.A0B
            if (r12 == 0) goto L_0x0de3
            java.lang.String r17 = r13.getId()
            java.lang.String r14 = r0.A05
            java.lang.String r13 = r0.A08
            boolean r12 = r0.A0A
            r16 = r10
            r18 = r14
            r19 = r13
            r20 = r6
            r21 = r12
            X.Nhk r6 = X.O3G.A00(r16, r17, r18, r19, r20, r21)
            r6.A02 = r3
            X.AhG r14 = new X.AhG
            r16 = r11
            r17 = r0
            r18 = r10
            r19 = r7
            r20 = r3
            r21 = r8
            r14.<init>(r15, r16, r17, r18, r19, r20, r21)
            r6.A06 = r14
            if (r9 == 0) goto L_0x0de0
            if (r4 == 0) goto L_0x04a2
            androidx.fragment.app.Fragment r0 = r4.A09()
            if (r0 == 0) goto L_0x04a2
            com.instagram.igds.components.bottomsheet.BottomSheetFragment r0 = (com.instagram.igds.components.bottomsheet.BottomSheetFragment) r0
            r0.A0T(r1)
        L_0x04a2:
            r3.A0F(r6, r5)
            goto L_0x0023
        L_0x04a7:
            boolean r7 = r0 instanceof X.C334757bp
            if (r7 == 0) goto L_0x0503
            androidx.fragment.app.FragmentActivity r7 = r2.A01
            X.7bp r0 = (X.C334757bp) r0
            X.0qQ.A0B(r7, r1)
            X.0qQ.A0B(r0, r3)
            com.instagram.user.model.User r1 = r0.A00
            java.lang.String r4 = r1.getUsername()
            r3 = 2131972357(0x7f135105, float:1.958172E38)
            java.lang.Object[] r1 = new java.lang.Object[]{r4}
            java.lang.String r6 = r7.getString(r3, r1)
            X.0qQ.A07(r6)
            r3 = 2131972355(0x7f135103, float:1.9581715E38)
            java.lang.Object[] r1 = new java.lang.Object[]{r4}
            java.lang.String r3 = r7.getString(r3, r1)
            X.0qQ.A07(r3)
            r1 = 2131972354(0x7f135102, float:1.9581713E38)
            java.lang.String r4 = r7.getString(r1)
            X.0qQ.A07(r4)
            X.8ab r1 = new X.8ab
            r1.<init>((android.app.Activity) r7)
            r1.A05 = r6
            r1.A0q(r3)
            X.AJm r3 = new X.AJm
            r3.<init>(r0)
            r1.A0c(r3, r4)
            r3 = 2131972356(0x7f135104, float:1.9581717E38)
            r1.A0H(r5, r3)
            X.AKv r3 = new X.AKv
            r3.<init>(r0)
            r1.A0f(r3)
            goto L_0x0164
        L_0x0503:
            boolean r10 = r0 instanceof X.AnonymousClass9IX
            if (r10 == 0) goto L_0x0586
            r13 = r0
            X.9IX r13 = (X.AnonymousClass9IX) r13
            int r7 = r13.A00
            if (r7 != r1) goto L_0x0586
            androidx.fragment.app.FragmentActivity r7 = r2.A01
            int r10 = r13.A01
            java.lang.Object r9 = r13.A02
            X.0sa r9 = (X.C62320sa) r9
            java.lang.Object r6 = r13.A03
            X.0sP r6 = (X.0sP) r6
            X.0qQ.A0B(r7, r1)
            X.0qQ.A0B(r9, r4)
            r0 = 3
            X.0qQ.A0B(r6, r0)
            android.content.res.Resources r11 = r7.getResources()
            X.0qQ.A07(r11)
            r1 = 2131820587(0x7f11002b, float:1.9273893E38)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r10)
            java.lang.Object[] r0 = new java.lang.Object[]{r5}
            java.lang.String r8 = r11.getQuantityString(r1, r10, r0)
            X.0qQ.A07(r8)
            r1 = 2131820585(0x7f110029, float:1.927389E38)
            java.lang.Object[] r0 = new java.lang.Object[]{r5}
            java.lang.String r4 = r11.getQuantityString(r1, r10, r0)
            X.0qQ.A07(r4)
            r1 = 2131820586(0x7f11002a, float:1.9273891E38)
            java.lang.Object[] r0 = new java.lang.Object[]{r5, r5}
            java.lang.String r5 = r11.getQuantityString(r1, r10, r0)
            X.0qQ.A07(r5)
            X.8ab r1 = new X.8ab
            r1.<init>((android.content.Context) r7)
            r1.A05 = r8
            r1.A0q(r4)
            X.AJi r4 = new X.AJi
            r4.<init>(r9)
            X.8ae r0 = X.C358278ae.RED
            r1.A0Y(r4, r0, r5, r3)
            r0 = 2131954722(0x7f130c22, float:1.9545951E38)
            java.lang.String r3 = r7.getString(r0)
            X.0qQ.A07(r3)
            X.AJj r0 = new X.AJj
            r0.<init>(r6)
            r1.A0a(r0, r3)
            X.AJY r5 = new X.AJY
            r5.<init>(r6)
            goto L_0x036f
        L_0x0586:
            boolean r7 = r0 instanceof X.C334767bq
            if (r7 == 0) goto L_0x05e2
            androidx.fragment.app.FragmentActivity r7 = r2.A01
            X.4DU r8 = r2.A0A
            com.instagram.common.session.UserSession r9 = r2.A09
            X.7bq r0 = (X.C334767bq) r0
            X.0qQ.A0B(r7, r1)
            X.0qQ.A0B(r8, r3)
            X.0qQ.A0B(r9, r4)
            r1 = 3
            X.0qQ.A0B(r0, r1)
            X.7Pr r6 = new X.7Pr
            r6.<init>(r9)
            com.instagram.user.model.User r4 = r0.A00
            java.lang.String r1 = r4.getUsername()
            r6.A0d = r1
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r3)
            r6.A0a = r1
            r1 = 1060320051(0x3f333333, float:0.7)
            r6.A03 = r1
            X.37E r1 = X.AnonymousClass37D.A00
            X.37D r1 = r1.A01(r7)
            X.7Pu r10 = X.C48943Emh.A00(r1)
            if (r10 != 0) goto L_0x05c7
            X.7Pu r10 = r6.A00()
        L_0x05c7:
            java.lang.String r3 = r0.A01
            java.lang.String r1 = "comment_id"
            X.0eP r0 = new X.0eP
            r0.<init>(r1, r3)
            java.util.Map r1 = X.0se.A0M(r0)
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>(r1)
            r13 = r3
            r14 = r0
            r11 = r4
            r12 = r5
            X.F8Z.A01(r7, r8, r9, r10, r11, r12, r13, r14)
            goto L_0x0023
        L_0x05e2:
            if (r10 == 0) goto L_0x066f
            r13 = r0
            X.9IX r13 = (X.AnonymousClass9IX) r13
            int r7 = r13.A00
            if (r7 != r3) goto L_0x066f
            androidx.fragment.app.FragmentActivity r7 = r2.A01
            int r10 = r13.A01
            java.lang.Object r9 = r13.A02
            X.0sa r9 = (X.C62320sa) r9
            java.lang.Object r6 = r13.A03
            X.0sP r6 = (X.0sP) r6
            X.0qQ.A0B(r7, r1)
            X.0qQ.A0B(r9, r4)
            r0 = 3
            X.0qQ.A0B(r6, r0)
            android.content.res.Resources r11 = r7.getResources()
            X.0qQ.A07(r11)
            r1 = 2131820925(0x7f11017d, float:1.9274579E38)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r10)
            java.lang.Object[] r0 = new java.lang.Object[]{r5}
            java.lang.String r8 = r11.getQuantityString(r1, r10, r0)
            X.0qQ.A07(r8)
            r1 = 2131820923(0x7f11017b, float:1.9274575E38)
            java.lang.Object[] r0 = new java.lang.Object[]{r5}
            java.lang.String r4 = r11.getQuantityString(r1, r10, r0)
            X.0qQ.A07(r4)
            r1 = 2131820924(0x7f11017c, float:1.9274577E38)
            java.lang.Object[] r0 = new java.lang.Object[]{r5}
            java.lang.String r5 = r11.getQuantityString(r1, r10, r0)
            X.0qQ.A07(r5)
            X.8ab r1 = new X.8ab
            r1.<init>((android.content.Context) r7)
            r1.A05 = r8
            r1.A0q(r4)
            X.AJk r4 = new X.AJk
            r4.<init>(r9)
            X.8ae r0 = X.C358278ae.RED
            r1.A0Y(r4, r0, r5, r3)
            r0 = 2131954722(0x7f130c22, float:1.9545951E38)
            java.lang.String r3 = r7.getString(r0)
            X.0qQ.A07(r3)
            X.AJl r0 = new X.AJl
            r0.<init>(r6)
            r1.A0a(r0, r3)
            X.AJZ r5 = new X.AJZ
            r5.<init>(r6)
            goto L_0x036f
        L_0x0663:
            com.instagram.common.session.UserSession r10 = r2.A09
            java.lang.Class<com.instagram.modal.ModalActivity> r11 = com.instagram.modal.ModalActivity.class
            r0 = 2184(0x888, float:3.06E-42)
            java.lang.String r12 = X.C273654mx.A00(r0)
            goto L_0x02b5
        L_0x066f:
            boolean r7 = X.AnonymousClass9IW.A00(r4, r0)
            if (r7 == 0) goto L_0x06f1
            androidx.fragment.app.FragmentActivity r12 = r2.A01
            r8 = r0
            X.9IW r8 = (X.AnonymousClass9IW) r8
            X.4DH r11 = r2.A03
            X.4DU r9 = r2.A0A
            com.instagram.common.session.UserSession r14 = r2.A09
            X.GgO r6 = r2.A08
            X.7an r10 = r2.A05
            r16 = 24
            X.IoC r7 = new X.IoC
            r15 = r7
            r17 = r0
            r18 = r10
            r19 = r12
            r20 = r6
            r15.<init>(r16, r17, r18, r19, r20)
            r0 = 35
            X.Ins r6 = new X.Ins
            r6.<init>(r0, r12, r10)
            X.0qQ.A0B(r12, r1)
            X.0qQ.A0B(r8, r3)
            X.0qQ.A0B(r11, r4)
            r0 = 3
            X.0qQ.A0B(r9, r0)
            r10 = 4
            X.0qQ.A0B(r14, r10)
            X.6ST r4 = new X.6ST
            r4.<init>(r12, r3)
            r0 = 2131956375(0x7f131297, float:1.9549304E38)
            java.lang.String r0 = r12.getString(r0)
            r4.A00(r0)
            X.1YZ r3 = X.1YZ.A02
            if (r3 == 0) goto L_0x0023
            X.0gy r13 = X.AnonymousClass07i.A00(r11)
            java.lang.Object r1 = r8.A02
            java.util.List r1 = (java.util.List) r1
            java.lang.String r0 = r9.getModuleName()
            java.lang.Object r8 = r8.A01
            X.AhK r15 = new X.AhK
            r15.<init>(r4, r7, r6)
            r4 = 3
            X.0qQ.A0B(r1, r4)
            X.0qQ.A0B(r0, r10)
            X.7aO r16 = r3.A01(r14)
            if (r8 == 0) goto L_0x06ee
            java.lang.String r19 = r8.toString()
        L_0x06e3:
            r20 = r1
            r17 = r0
            r18 = r5
            X.C334237aw.A02(r12, r13, r14, r15, r16, r17, r18, r19, r20)
            goto L_0x0023
        L_0x06ee:
            r19 = 0
            goto L_0x06e3
        L_0x06f1:
            boolean r7 = r0 instanceof X.C334777br
            if (r7 == 0) goto L_0x0723
            X.7an r0 = r2.A05
            X.0eM r3 = r0.A01
            java.lang.Object r0 = r3.getValue()
            X.A3a r0 = (X.C39636A3a) r0
            X.6ST r0 = r0.A00
            if (r0 == 0) goto L_0x0706
            r0.dismiss()
        L_0x0706:
            r3.getValue()
            androidx.fragment.app.FragmentActivity r4 = r2.A01
            X.0qQ.A0B(r4, r1)
            r3 = 2131969489(0x7f1345d1, float:1.9575902E38)
            r0 = 3
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r0 = r4.getString(r3, r0)
            X.C59689JTv.A00(r4, r0, r5, r1)
            goto L_0x0023
        L_0x0723:
            boolean r7 = r0 instanceof X.C334787bs
            if (r7 == 0) goto L_0x0749
            X.7an r0 = r2.A05
            X.0eM r0 = r0.A01
            java.lang.Object r0 = r0.getValue()
            X.A3a r0 = (X.C39636A3a) r0
            androidx.fragment.app.FragmentActivity r4 = r2.A01
            X.0qQ.A0B(r4, r1)
            X.6ST r1 = new X.6ST
            r1.<init>(r4, r3)
            r0.A00 = r1
            r0 = 2131969458(0x7f1345b2, float:1.957584E38)
            java.lang.String r0 = r4.getString(r0)
            r1.A00(r0)
            goto L_0x0168
        L_0x0749:
            boolean r10 = r0 instanceof X.AnonymousClass9I3
            if (r10 == 0) goto L_0x0781
            r7 = r0
            X.9I3 r7 = (X.AnonymousClass9I3) r7
            int r13 = r7.A00
            if (r13 != r1) goto L_0x0781
            X.7an r3 = r2.A05
            X.0eM r0 = r3.A01
            java.lang.Object r0 = r0.getValue()
            X.A3a r0 = (X.C39636A3a) r0
            X.6ST r0 = r0.A00
            if (r0 == 0) goto L_0x0765
            r0.dismiss()
        L_0x0765:
            boolean r0 = r7.A01
            if (r0 != 0) goto L_0x0023
        L_0x0769:
            X.0eM r0 = r3.A01
            r0.getValue()
            androidx.fragment.app.FragmentActivity r4 = r2.A01
            X.0qQ.A0B(r4, r1)
            r0 = 2131974093(0x7f1357cd, float:1.958524E38)
            java.lang.String r3 = r4.getString(r0)
            java.lang.String r0 = "PinnedComment onFailure"
            X.C59689JTv.A00(r4, r3, r0, r1)
            goto L_0x0023
        L_0x0781:
            boolean r7 = r0 instanceof X.C334797bt
            if (r7 == 0) goto L_0x0788
            X.7an r3 = r2.A05
            goto L_0x0769
        L_0x0788:
            boolean r7 = r0 instanceof X.C334807bu
            if (r7 == 0) goto L_0x07a0
            X.7an r0 = r2.A05
            X.0eM r0 = r0.A01
            r0.getValue()
            androidx.fragment.app.FragmentActivity r3 = r2.A01
            X.0qQ.A0B(r3, r1)
            r0 = 2131975967(0x7f135f1f, float:1.9589041E38)
            X.C59689JTv.A01(r3, r5, r0, r1)
            goto L_0x0023
        L_0x07a0:
            boolean r7 = X.AnonymousClass9IW.A00(r3, r0)
            if (r7 == 0) goto L_0x07ea
            X.1Y4 r4 = X.C3018960m.A00()
            r4.A00()
            X.9IW r0 = (X.AnonymousClass9IW) r0
            java.lang.Object r9 = r0.A01
            X.7aA r9 = (X.C333797aA) r9
            java.lang.Object r8 = r0.A02
            java.lang.Integer r8 = (java.lang.Integer) r8
            X.GgO r0 = r2.A08
            androidx.fragment.app.FragmentActivity r7 = r2.A01
            X.OBF r6 = new X.OBF
            r6.<init>(r7, r0)
            X.0qQ.A0B(r9, r1)
            X.0qQ.A0B(r8, r3)
            X.Ngk r4 = new X.Ngk
            r4.<init>()
            r4.A01 = r9
            java.lang.Integer r0 = X.AnonymousClass05K.A0u
            if (r8 != r0) goto L_0x07d3
            java.lang.Integer r8 = X.AnonymousClass05K.A00
        L_0x07d3:
            r4.A02 = r8
            r4.A00 = r6
            com.instagram.common.session.UserSession r3 = r2.A09
            r0 = 2131956402(0x7f1312b2, float:1.9549359E38)
        L_0x07dc:
            java.lang.String r10 = r7.getString(r0)
            r6 = r7
            r7 = r4
            r8 = r3
            r9 = r5
            r11 = r1
            X.C393879xB.A00(r6, r7, r8, r9, r10, r11)
            goto L_0x0023
        L_0x07ea:
            boolean r7 = r0 instanceof X.C334817bv
            if (r7 == 0) goto L_0x0808
            X.4DU r3 = r2.A0A
            java.lang.String r6 = r3.getModuleName()
            X.7bv r0 = (X.C334817bv) r0
            java.lang.String r4 = r0.A00
            java.lang.String r3 = r0.A01
            boolean r0 = r0.A02
            X.E6d r4 = X.C49186Eqr.A00(r6, r4, r3, r0)
            androidx.fragment.app.FragmentActivity r7 = r2.A01
            com.instagram.common.session.UserSession r3 = r2.A09
            r0 = 2131969561(0x7f134619, float:1.9576048E38)
            goto L_0x07dc
        L_0x0808:
            boolean r7 = X.AnonymousClass9J9.A00(r1, r0)
            if (r7 == 0) goto L_0x0834
            X.GgO r1 = r2.A08
            X.7a5 r1 = r1.A0B
            X.1Xl r1 = r1.A00
            if (r1 == 0) goto L_0x0023
            X.1Xj r8 = r1.BPf()
            if (r8 == 0) goto L_0x0023
            androidx.fragment.app.FragmentActivity r3 = r2.A01
            com.instagram.common.session.UserSession r7 = r2.A09
            X.4DH r5 = r2.A03
            X.9J9 r0 = (X.AnonymousClass9J9) r0
            java.lang.String r10 = r0.A02
            java.lang.String r11 = r0.A03
            java.lang.Object r9 = r0.A01
            com.instagram.user.model.User r9 = (com.instagram.user.model.User) r9
            X.28D r6 = X.28D.A20
            r4 = r3
            X.I5a.A00(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            goto L_0x0023
        L_0x0834:
            boolean r7 = r0 instanceof X.C334827bw
            if (r7 == 0) goto L_0x0949
            X.0sP r7 = r2.A0F
            if (r7 == 0) goto L_0x0846
            r6 = 1065353216(0x3f800000, float:1.0)
            java.lang.Float r4 = new java.lang.Float
            r4.<init>(r6)
            r7.invoke(r4)
        L_0x0846:
            androidx.fragment.app.FragmentActivity r7 = r2.A01
            com.instagram.common.session.UserSession r9 = r2.A09
            X.7bw r0 = (X.C334827bw) r0
            java.lang.String r14 = r0.A04
            java.lang.String r13 = r0.A05
            X.1Xj r6 = r0.A00
            if (r6 == 0) goto L_0x0946
            java.lang.String r12 = r6.getId()
        L_0x0858:
            java.lang.String r10 = r0.A03
            com.instagram.user.model.User r4 = r0.A01
            r16 = r4
            java.lang.String r15 = r0.A02
            if (r6 == 0) goto L_0x0866
            com.instagram.model.mediasize.ExtendedImageUrl r5 = r6.A1n(r7)
        L_0x0866:
            X.4DU r8 = r2.A0A
            X.0qQ.A0B(r9, r3)
            r0 = 9
            X.0qQ.A0B(r8, r0)
            if (r7 == 0) goto L_0x0023
            if (r4 == 0) goto L_0x0023
            if (r5 == 0) goto L_0x0023
            X.37E r0 = X.AnonymousClass37D.A00
            X.37D r4 = r0.A01(r7)
            X.7Pu r6 = X.C48943Emh.A00(r4)
            X.1as r0 = X.1as.A04
            X.1ap r0 = r0.A02
            java.lang.String r11 = "story_comment_reply"
            X.OOA r8 = r0.A06(r8, r9, r11)
            r8.A03(r14)
            r8.A04(r13)
            java.lang.String r0 = r16.getId()
            r8.A06(r0)
            r8.A02(r12)
            X.0qQ.A0B(r15, r1)
            android.os.Bundle r0 = r8.A01
            r12 = 220(0xdc, float:3.08E-43)
            java.lang.String r12 = X.C66579MXk.A00(r12)
            r0.putString(r12, r15)
            java.lang.String r17 = r16.getUsername()
            com.instagram.model.mediasize.ExtendedImageUrl r14 = new com.instagram.model.mediasize.ExtendedImageUrl
            r14.<init>(r5)
            com.instagram.common.typedurl.ImageUrl r5 = r16.Bh3()
            com.instagram.model.mediasize.ExtendedImageUrl r15 = new com.instagram.model.mediasize.ExtendedImageUrl
            r15.<init>(r5)
            com.instagram.model.direct.DirectPendingLayeredXma r13 = new com.instagram.model.direct.DirectPendingLayeredXma
            r18 = r10
            r19 = r1
            r20 = r1
            r13.<init>(r14, r15, r16, r17, r18, r19, r20)
            r5 = 223(0xdf, float:3.12E-43)
            java.lang.String r5 = X.C66579MXk.A00(r5)
            r0.putParcelable(r5, r13)
            r5 = 124(0x7c, float:1.74E-43)
            java.lang.String r12 = X.C66579MXk.A00(r5)
            r5 = 221(0xdd, float:3.1E-43)
            java.lang.String r5 = X.C66579MXk.A00(r5)
            r0.putString(r5, r12)
            X.0qQ.A0B(r10, r1)
            r5 = 92
            java.lang.String r5 = X.C66579MXk.A00(r5)
            r0.putString(r5, r10)
            r8.A05(r10)
            r8.A01(r11)
            if (r4 == 0) goto L_0x0023
            r0 = r4
            X.37F r0 = (X.AnonymousClass37F) r0
            boolean r0 = r0.A0g
            if (r0 == 0) goto L_0x0de8
            if (r6 == 0) goto L_0x0de8
            X.7Pr r4 = new X.7Pr
            r4.<init>(r9)
            r4.A11 = r3
            r4.A1O = r3
            r0 = 1061997773(0x3f4ccccd, float:0.8)
            r4.A03 = r0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            r4.A0a = r0
            r10 = 0
            java.lang.String r12 = ""
            X.7Ps r9 = new X.7Ps
            r11 = r10
            r13 = r1
            r14 = r1
            r9.<init>(r10, r11, r12, r13, r14)
            r0 = 2131237906(0x7f081c12, float:1.8092076E38)
            r9.A02 = r0
            r0 = 2130970279(0x7f0406a7, float:1.7549264E38)
            int r0 = X.2Yu.A0H(r7, r0)
            int r0 = r7.getColor(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r9.A08 = r0
            X.AM4 r0 = new X.AM4
            r0.<init>(r7)
            r9.A05 = r0
            X.7Pt r0 = r9.A00()
            r4.A06(r0)
            X.NK2 r0 = r8.A00()
            r6.A0F(r0, r4)
            goto L_0x0023
        L_0x0946:
            r12 = r5
            goto L_0x0858
        L_0x0949:
            boolean r7 = r0 instanceof X.C334837bx
            if (r7 == 0) goto L_0x096c
            X.GgO r0 = r2.A08
            X.7a5 r0 = r0.A0B
            X.1Xl r0 = r0.A00
            if (r0 == 0) goto L_0x0023
            X.1Xj r1 = r0.BPf()
            if (r1 == 0) goto L_0x0023
            X.JNq r3 = r2.A02
            if (r3 == 0) goto L_0x0023
            X.5o3 r0 = X.C267324bN.A0d
            X.4bN r1 = r0.A04(r1)
            java.lang.Integer r0 = X.AnonymousClass05K.A0Y
            r3.Cvo(r1, r0, r5)
            goto L_0x0023
        L_0x096c:
            if (r12 == 0) goto L_0x0999
            r7 = r0
            X.9JC r7 = (X.AnonymousClass9JC) r7
            int r12 = r7.A00
            if (r12 != r1) goto L_0x0999
            com.instagram.wellbeing.respectfulcommentnudge.impl.RespectfulNudgePluginImpl r4 = X.C335077cL.A00()
            java.lang.Object r10 = r7.A02
            X.7dS r10 = (X.C335737dS) r10
            java.lang.Object r8 = r7.A01
            X.1Xj r8 = (X.1Xj) r8
            java.lang.String r11 = r7.A03
            java.lang.String r12 = r7.A04
            com.instagram.common.session.UserSession r7 = r2.A09
            androidx.fragment.app.FragmentActivity r5 = r2.A01
            X.0wc r6 = X.AnonymousClass0kN.A02(r7)
            X.GgO r1 = r2.A08
            X.7dU r9 = new X.7dU
            r9.<init>(r1, r0)
            r4.A03(r5, r6, r7, r8, r9, r10, r11, r12)
            goto L_0x0023
        L_0x0999:
            boolean r7 = r0 instanceof X.C334847by
            if (r7 == 0) goto L_0x0a29
            X.7by r0 = (X.C334847by) r0
            X.HMF r15 = r0.A00
            int r7 = r15.ordinal()
            if (r7 == r6) goto L_0x0e86
            if (r7 == r8) goto L_0x0e86
            if (r7 == r4) goto L_0x0e67
            r6 = 3
            if (r7 == r6) goto L_0x0df1
            r6 = 4
            if (r7 == r6) goto L_0x0df1
            java.util.Set r7 = r0.A04
            boolean r6 = r2.A0H
            com.instagram.common.session.UserSession r8 = r2.A09
            int r0 = r7.size()
            if (r0 != r3) goto L_0x0023
            if (r6 == 0) goto L_0x0023
            com.instagram.user.model.User[] r0 = new com.instagram.user.model.User[r1]
            java.lang.Object[] r0 = r7.toArray(r0)
            com.instagram.user.model.User[] r0 = (com.instagram.user.model.User[]) r0
            r3 = r0[r1]
            X.0eE r0 = X.AnonymousClass0t1.A01
            com.instagram.user.model.User r0 = r0.A01(r8)
            boolean r0 = X.0qQ.A0K(r3, r0)
            if (r0 != 0) goto L_0x0023
            X.AnonymousClass1pc.A00()
            X.0qQ.A0B(r8, r1)
            X.0Tu r0 = X.0Tu.A06
            r6 = 2342154934771778354(0x2081018100000332, double:4.058739438428641E-152)
            boolean r0 = X.182.A06(r0, r8, r6)
            if (r0 == 0) goto L_0x0023
            X.1Av r0 = X.1Au.A00(r8)
            X.0xa r3 = r0.A01
            java.lang.String r0 = "custom_comment_filter_upsell_shown_count"
            int r0 = r3.getInt(r0, r1)
            if (r0 > r4) goto L_0x0023
            X.HMp r1 = X.C54658HMp.CUSTOM_COMMENT_FILTER
            java.util.Map r0 = X.C56461Hyt.A00
            java.lang.Object r0 = r0.get(r1)
            X.Hre r0 = (X.C56032Hre) r0
            if (r0 == 0) goto L_0x0023
            boolean r0 = r0.A01(r8)
            if (r0 != 0) goto L_0x0023
            X.0Tu r3 = X.0Tu.A05
            r0 = 36314798891207468(0x81041e00000b2c, double:3.0289632745331096E-306)
            boolean r0 = X.182.A06(r3, r8, r0)
            if (r0 == 0) goto L_0x0023
            X.GgO r4 = r2.A08
            X.6oS r3 = X.C318116oQ.A00(r4)
            r0 = 26
            X.MG7 r1 = new X.MG7
            r1.<init>(r4, r5, r0)
            X.19B r0 = X.19B.A00
            X.1Eo.A05(r0, r1, r3)
            goto L_0x0023
        L_0x0a29:
            boolean r6 = r0 instanceof X.C334857bz
            if (r6 == 0) goto L_0x0ae9
            X.1pZ r11 = X.AnonymousClass1pc.A00()
            com.instagram.common.session.UserSession r9 = r2.A09
            androidx.fragment.app.FragmentActivity r5 = r2.A01
            X.4DH r8 = r2.A03
            X.4DU r7 = r2.A0A
            X.0sa r0 = r2.A0D
            java.lang.Object r0 = r0.invoke()
            java.lang.Number r0 = (java.lang.Number) r0
            int r6 = r0.intValue()
            X.1pX r11 = (X.1pX) r11
            X.0qQ.A0B(r9, r1)
            X.0qQ.A0B(r5, r3)
            X.0qQ.A0B(r8, r4)
            r0 = 3
            X.0qQ.A0B(r7, r0)
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r12 = r0.toString()
            X.0qQ.A07(r12)
            X.Hs7 r10 = new X.Hs7
            r10.<init>(r7, r9)
            r0 = 730(0x2da, float:1.023E-42)
            java.lang.String r4 = X.C66579MXk.A00(r0)
            r0 = 43
            java.lang.String r0 = X.C66579MXk.A00(r0)
            r10.A01(r0, r12, r4)
            X.1Av r0 = X.1Au.A00(r9)
            X.0xa r0 = r0.A01
            X.0xY r7 = r0.AR4()
            java.lang.String r4 = "custom_comment_filter_upsell_shown_count"
            int r0 = r0.getInt(r4, r1)
            int r0 = r0 + 1
            r7.E5Z(r4, r0)
            r7.apply()
            X.HMp r1 = X.C54658HMp.CUSTOM_COMMENT_FILTER
            java.util.Map r0 = X.C56461Hyt.A00
            java.lang.Object r0 = r0.get(r1)
            X.Hre r0 = (X.C56032Hre) r0
            if (r0 == 0) goto L_0x0a9a
            r0.A00(r9)
        L_0x0a9a:
            r0 = 2131238771(0x7f081f73, float:1.809383E38)
            android.graphics.drawable.Drawable r4 = r5.getDrawable(r0)
            if (r4 == 0) goto L_0x0ab2
            int r0 = X.2Yu.A05(r5)
            int r0 = r5.getColor(r0)
            android.graphics.ColorFilter r0 = X.AnonymousClass37O.A00(r0)
            r4.setColorFilter(r0)
        L_0x0ab2:
            X.6ap r1 = new X.6ap
            r1.<init>()
            r1.A06()
            r1.A02 = r6
            r0 = 2131976138(0x7f135fca, float:1.9589388E38)
            java.lang.String r0 = r5.getString(r0)
            r1.A0D = r0
            r0 = 2131976137(0x7f135fc9, float:1.9589386E38)
            java.lang.String r0 = r5.getString(r0)
            X.0qQ.A07(r0)
            r1.A0G = r0
            r1.A02()
            r1.A04 = r4
            X.PHo r7 = new X.PHo
            r7.<init>(r8, r9, r10, r11, r12)
            r1.A0A = r7
            r1.A0L = r3
            X.Dc2 r1 = r1.A00()
            r11.A00 = r1
            X.1xC r3 = X.1xC.A01
            goto L_0x00d4
        L_0x0ae9:
            boolean r6 = r0 instanceof X.C334867c0
            if (r6 == 0) goto L_0x0b0c
            X.GgO r0 = r2.A08
            X.7a5 r0 = r0.A0B
            X.1Xl r0 = r0.A00
            if (r0 == 0) goto L_0x0023
            X.1Xj r11 = r0.BPf()
            if (r11 == 0) goto L_0x0023
            com.instagram.common.session.UserSession r0 = r2.A09
            androidx.fragment.app.FragmentActivity r6 = r2.A01
            X.4DH r7 = r2.A03
            X.28D r8 = X.28D.A1S
            r12 = r5
            r13 = r1
            r9 = r0
            r10 = r5
            X.C243473Yx.A02(r6, r7, r8, r9, r10, r11, r12, r13)
            goto L_0x0023
        L_0x0b0c:
            boolean r6 = X.AnonymousClass9IK.A00(r4, r0)
            if (r6 == 0) goto L_0x0b5d
            X.GgO r3 = r2.A08
            X.7a5 r3 = r3.A0B
            X.1Xl r3 = r3.A00
            if (r3 == 0) goto L_0x0023
            X.1Xj r12 = r3.BPf()
            if (r12 == 0) goto L_0x0023
            androidx.fragment.app.FragmentActivity r8 = r2.A01
            int r4 = X.AnonymousClass0nB.A01(r8)
            int r3 = X.AnonymousClass0nB.A00(r8)
            float r4 = (float) r4
            float r3 = (float) r3
            r7 = 0
            android.graphics.RectF r6 = new android.graphics.RectF
            r6.<init>(r7, r7, r4, r3)
            r6.offsetTo(r7, r3)
            com.instagram.common.session.UserSession r4 = r2.A09
            X.9IK r0 = (X.AnonymousClass9IK) r0
            java.lang.Object r0 = r0.A01
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x0b5b
            int r15 = r0.intValue()
        L_0x0b43:
            android.graphics.RectF r3 = new android.graphics.RectF
            r3.<init>(r7, r7, r7, r7)
            r0 = 2412(0x96c, float:3.38E-42)
            java.lang.String r13 = X.AnonymousClass000.A00(r0)
            r7 = r8
            r8 = r6
            r9 = r3
            r10 = r4
            r11 = r5
            r14 = r5
            r16 = r1
            X.FFV.A02(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            goto L_0x0023
        L_0x0b5b:
            r15 = -1
            goto L_0x0b43
        L_0x0b5d:
            r7 = 3
            boolean r6 = X.AnonymousClass9IK.A00(r7, r0)
            if (r6 == 0) goto L_0x0bd3
            X.GgO r1 = r2.A08
            X.7a5 r1 = r1.A0B
            X.1Xl r1 = r1.A00
            if (r1 == 0) goto L_0x0023
            X.1Xj r7 = r1.BPf()
            if (r7 == 0) goto L_0x0023
            X.6ap r5 = new X.6ap
            r5.<init>()
            r5.A04()
            androidx.fragment.app.FragmentActivity r6 = r2.A01
            r1 = 2131952402(0x7f130312, float:1.9541246E38)
            java.lang.String r1 = r6.getString(r1)
            r5.A0D = r1
            r4 = 2131952403(0x7f130313, float:1.9541248E38)
            X.1Xy r1 = r7.A0C
            com.instagram.user.model.User r1 = r1.CCd()
            if (r1 == 0) goto L_0x1170
            java.lang.String r1 = r1.getUsername()
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            java.lang.String r1 = r6.getString(r4, r1)
            r5.A0I = r1
            com.instagram.common.typedurl.ImageUrl r1 = r7.A1Q()
            r5.A09 = r1
            r5.A03()
            r1 = 2131952401(0x7f130311, float:1.9541244E38)
            java.lang.String r1 = r6.getString(r1)
            X.0qQ.A07(r1)
            r5.A0G = r1
            r1 = 5000(0x1388, float:7.006E-42)
            r5.A01 = r1
            X.9IK r0 = (X.AnonymousClass9IK) r0
            java.lang.Object r0 = r0.A01
            X.MVB r0 = (X.MVB) r0
            r5.A0A(r0)
            r5.A0L = r3
            X.1xC r3 = X.1xC.A01
            X.Dc2 r1 = r5.A00()
            r0 = 3666(0xe52, float:5.137E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.0qQ.A0C(r1, r0)
            goto L_0x00d4
        L_0x0bd3:
            boolean r6 = X.AnonymousClass9IW.A00(r1, r0)
            if (r6 == 0) goto L_0x0bf1
            X.9IW r0 = (X.AnonymousClass9IW) r0
            java.lang.Object r1 = r0.A02
            com.instagram.user.model.User r1 = (com.instagram.user.model.User) r1
            com.instagram.model.direct.DirectShareTarget r4 = new com.instagram.model.direct.DirectShareTarget
            r4.<init>((com.instagram.user.model.User) r1)
            X.1as r3 = X.1as.A04
            com.instagram.common.session.UserSession r1 = r2.A09
            java.lang.Object r0 = r0.A01
            X.3gp r0 = (X.C247733gp) r0
            r3.A09(r1, r0, r4)
            goto L_0x0023
        L_0x0bf1:
            boolean r6 = X.AnonymousClass9IK.A00(r8, r0)
            if (r6 == 0) goto L_0x0c17
            X.37E r6 = X.AnonymousClass37D.A00
            androidx.fragment.app.FragmentActivity r5 = r2.A01
            X.37D r4 = r6.A01(r5)
            if (r4 == 0) goto L_0x0c0c
            com.instagram.common.session.UserSession r3 = r2.A09
            X.AgU r1 = new X.AgU
            r1.<init>(r5, r0, r3)
            X.37F r4 = (X.AnonymousClass37F) r4
            r4.A0H = r1
        L_0x0c0c:
            X.37D r0 = r6.A01(r5)
            if (r0 == 0) goto L_0x0023
            r0.A0B()
            goto L_0x0023
        L_0x0c17:
            r6 = 4
            boolean r6 = X.AnonymousClass9IK.A00(r6, r0)
            if (r6 == 0) goto L_0x0c3e
            androidx.fragment.app.FragmentActivity r4 = r2.A01
            X.0nA.A0J(r4)
            com.instagram.common.session.UserSession r3 = r2.A09
            X.9IK r0 = (X.AnonymousClass9IK) r0
            java.lang.Object r1 = r0.A01
            X.4bv r1 = (X.C267624bv) r1
            java.lang.String r9 = "ig_comments"
            r0 = 3292(0xcdc, float:4.613E-42)
            java.lang.String r10 = X.AnonymousClass000.A00(r0)
            r11 = 2131953537(0x7f130781, float:1.9543548E38)
            r6 = r5
            r7 = r1
            r8 = r3
            X.C48368EdP.A00(r4, r5, r6, r7, r8, r9, r10, r11)
            goto L_0x0023
        L_0x0c3e:
            boolean r6 = r0 instanceof X.C334877c1
            if (r6 == 0) goto L_0x0c5b
            androidx.fragment.app.FragmentActivity r3 = r2.A01
            X.GgO r4 = r2.A08
            com.instagram.common.session.UserSession r5 = r2.A09
            X.7c1 r0 = (X.C334877c1) r0
            java.lang.String r9 = r0.A02
            java.lang.String r10 = r0.A03
            com.instagram.user.model.User r7 = r0.A00
            X.G87 r8 = r0.A01
            org.json.JSONObject r11 = r0.A04
            X.4DU r6 = r2.A0A
            X.HX8.A00(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            goto L_0x0023
        L_0x0c5b:
            boolean r6 = X.AnonymousClass9IK.A00(r3, r0)
            if (r6 == 0) goto L_0x0c97
            X.4DH r1 = r2.A03
            android.content.Context r7 = r1.requireContext()
            X.9IK r0 = (X.AnonymousClass9IK) r0
            java.lang.Object r6 = r0.A01
            X.1Xj r6 = (X.1Xj) r6
            com.instagram.common.session.UserSession r3 = r2.A09
            X.0qQ.A0B(r3, r4)
            r1 = 0
            if (r6 == 0) goto L_0x0c94
            X.1Xy r0 = r6.A0C
            X.DTf r0 = r0.At2()
            if (r0 == 0) goto L_0x0c94
            java.lang.String r5 = r0.B49()
        L_0x0c81:
            X.1Xy r0 = r6.A0C
            X.DTf r0 = r0.At2()
            if (r0 == 0) goto L_0x0c8d
            java.lang.String r1 = r0.B4A()
        L_0x0c8d:
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            X.C49932FFl.A01(r7, r3, r0, r5, r1)
            goto L_0x0023
        L_0x0c94:
            if (r6 == 0) goto L_0x0c8d
            goto L_0x0c81
        L_0x0c97:
            boolean r6 = X.AnonymousClass9IK.A00(r1, r0)
            if (r6 == 0) goto L_0x0ce3
            X.4DH r1 = r2.A03
            android.content.Context r5 = r1.requireContext()
            X.9IK r0 = (X.AnonymousClass9IK) r0
            java.lang.Object r6 = r0.A01
            X.1Xj r6 = (X.1Xj) r6
            com.instagram.common.session.UserSession r3 = r2.A09
            X.0qQ.A0B(r3, r4)
            android.net.Uri$Builder r1 = new android.net.Uri$Builder
            r1.<init>()
            java.lang.String r0 = "fb"
            android.net.Uri$Builder r1 = r1.scheme(r0)
            r0 = 3126(0xc36, float:4.38E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            android.net.Uri$Builder r1 = r1.authority(r0)
            if (r6 == 0) goto L_0x0ce1
            X.1Xy r0 = r6.A0C
            X.DTf r0 = r0.At2()
            if (r0 == 0) goto L_0x0ce1
            java.lang.String r0 = r0.B4A()
        L_0x0cd1:
            android.net.Uri$Builder r0 = r1.path(r0)
            android.net.Uri r0 = r0.build()
            X.0qQ.A0A(r0)
            X.C49932FFl.A00(r5, r0, r3, r6)
            goto L_0x0023
        L_0x0ce1:
            r0 = 0
            goto L_0x0cd1
        L_0x0ce3:
            boolean r6 = r0 instanceof X.C334887c2
            if (r6 == 0) goto L_0x0cfa
            com.instagram.common.session.UserSession r4 = r2.A09
            androidx.fragment.app.FragmentActivity r3 = r2.A01
            X.7c2 r0 = (X.C334887c2) r0
            java.lang.String r1 = r0.A00
            if (r1 != 0) goto L_0x0cf3
            java.lang.String r1 = ""
        L_0x0cf3:
            java.lang.String r0 = "comment_unified_feedback"
            X.C49965FGy.A04(r3, r4, r1, r0, r5)
            goto L_0x0023
        L_0x0cfa:
            if (r11 == 0) goto L_0x0f3a
            r8 = r0
            X.9Io r8 = (X.C376589Io) r8
            int r6 = r8.A00
            if (r6 != r3) goto L_0x0f3a
            androidx.fragment.app.FragmentActivity r4 = r2.A01
            r1 = 2131956420(0x7f1312c4, float:1.9549395E38)
            java.lang.String r0 = r8.A01
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r3 = r4.getString(r1, r0)
            X.0qQ.A07(r3)
            X.8ab r1 = new X.8ab
            r1.<init>((android.app.Activity) r4)
            r0 = 2131956421(0x7f1312c5, float:1.9549397E38)
            r1.A09(r0)
            r1.A0q(r3)
            X.AJh r0 = new X.AJh
            r0.<init>(r4)
            r1.A0E(r0)
            goto L_0x0164
        L_0x0d2d:
            com.instagram.user.model.User r0 = r11.A08
            if (r0 == 0) goto L_0x0023
            java.lang.String r0 = r0.getUsername()
            X.37E r1 = X.AnonymousClass37D.A00
            X.37D r6 = r1.A01(r15)
            X.1Y4 r1 = X.C3018960m.A00()
            r1.A00()
            if (r6 == 0) goto L_0x0d4b
            X.37F r6 = (X.AnonymousClass37F) r6
            boolean r6 = r6.A0g
            r1 = 1
            if (r6 == r3) goto L_0x0d4c
        L_0x0d4b:
            r1 = 0
        L_0x0d4c:
            X.ODM r6 = new X.ODM
            r6.<init>(r9, r13, r14)
            X.NKC r8 = new X.NKC
            r8.<init>()
            android.os.Bundle r7 = new android.os.Bundle
            r7.<init>()
            r9 = 107(0x6b, float:1.5E-43)
            java.lang.String r9 = X.C66579MXk.A00(r9)
            r7.putString(r9, r0)
            r0 = 667(0x29b, float:9.35E-43)
            java.lang.String r0 = X.C66579MXk.A00(r0)
            r7.putBoolean(r0, r1)
            java.lang.String r1 = r10.A05
            java.lang.String r0 = "IgSessionManager.SESSION_TOKEN_KEY"
            r7.putString(r0, r1)
            r8.setArguments(r7)
            r8.A00 = r6
            r8.A01 = r11
            r17 = r10
            r19 = r18
            r20 = r3
            r16 = r8
            X.C393879xB.A00(r15, r16, r17, r18, r19, r20)
            X.1Av r0 = X.1Au.A00(r10)
            X.0xa r3 = r0.A01
            int r0 = r3.getInt(r4, r5)
            int r1 = r0 + 1
            X.0xY r0 = r3.AR4()
            r0.E5Z(r4, r1)
            r0.apply()
            goto L_0x0023
        L_0x0d9e:
            androidx.fragment.app.FragmentActivity r4 = r2.A01
            com.instagram.common.session.UserSession r0 = r2.A09
            X.6Yo r3 = new X.6Yo
            r3.<init>(r4, r0)
            r3.A08()
            X.C46339Dch.A00()
            X.0qQ.A0B(r9, r1)
            X.E6n r0 = new X.E6n
            r0.<init>()
            r0.setArguments(r9)
            r3.A0B(r5, r0)
            goto L_0x0ddb
        L_0x0dbc:
            androidx.fragment.app.FragmentActivity r0 = r2.A01
            X.6Yo r3 = new X.6Yo
            r3.<init>(r0, r10)
            r3.A08()
            X.1a0 r0 = X.C46447Df9.A03()
            X.1a1 r0 = r0.A01
            androidx.fragment.app.Fragment r0 = r0.A02(r10, r1)
            r3.A0B(r5, r0)
            r0 = 1206(0x4b6, float:1.69E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r3.A0B = r0
        L_0x0ddb:
            r3.A04()
            goto L_0x0023
        L_0x0de0:
            if (r4 == 0) goto L_0x0023
            goto L_0x0dec
        L_0x0de3:
            X.C71093OcF.A00(r3, r8)
            goto L_0x0023
        L_0x0de8:
            X.NK2 r6 = r8.A00()
        L_0x0dec:
            r4.A0J(r6)
            goto L_0x0023
        L_0x0df1:
            X.AnonymousClass1pc.A00()
            com.instagram.common.session.UserSession r9 = r2.A09
            androidx.fragment.app.FragmentActivity r6 = r2.A01
            X.0sa r4 = r2.A0D
            java.lang.Object r4 = r4.invoke()
            java.lang.Number r4 = (java.lang.Number) r4
            int r5 = r4.intValue()
            java.util.List r7 = r0.A02
            X.0qQ.A0B(r9, r1)
            X.0qQ.A0B(r6, r3)
            if (r7 == 0) goto L_0x0023
            X.37E r0 = X.AnonymousClass37D.A00
            X.37D r0 = r0.A01(r6)
            X.C48943Emh.A00(r0)
            if (r0 == 0) goto L_0x0e20
            X.37F r0 = (X.AnonymousClass37F) r0
            boolean r0 = r0.A0g
            r4 = 1
            if (r0 == r3) goto L_0x0e21
        L_0x0e20:
            r4 = 0
        L_0x0e21:
            X.7Pr r8 = new X.7Pr
            r8.<init>(r9)
            r8.A1G = r3
            r0 = 1059481190(0x3f266666, float:0.65)
            r8.A03 = r0
            if (r4 != 0) goto L_0x0023
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r7)
            r0 = 3483(0xd9b, float:4.881E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r4.putStringArrayList(r0, r3)
            r0 = 3485(0xd9d, float:4.884E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r4.putInt(r0, r5)
            r0 = 1537(0x601, float:2.154E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r4.putBoolean(r0, r1)
            r0 = 3484(0xd9c, float:4.882E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r4.putBoolean(r0, r1)
            X.UZ4 r1 = new X.UZ4
            r1.<init>()
            r1.setArguments(r4)
            goto L_0x0f31
        L_0x0e67:
            X.1pZ r3 = X.AnonymousClass1pc.A00()
            com.instagram.common.session.UserSession r6 = r2.A09
            androidx.fragment.app.FragmentActivity r4 = r2.A01
            X.4DU r5 = r2.A0A
            X.0sa r1 = r2.A0D
            java.lang.Object r1 = r1.invoke()
            java.lang.Number r1 = (java.lang.Number) r1
            int r9 = r1.intValue()
            java.util.Set r8 = r0.A04
            java.util.List r7 = r0.A03
            r3.CnP(r4, r5, r6, r7, r8, r9)
            goto L_0x0023
        L_0x0e86:
            X.1pZ r7 = X.AnonymousClass1pc.A00()
            com.instagram.common.session.UserSession r9 = r2.A09
            androidx.fragment.app.FragmentActivity r6 = r2.A01
            X.4DU r11 = r2.A0A
            java.util.Set r10 = r0.A04
            java.util.List r8 = r0.A03
            java.lang.String r5 = r0.A01
            X.0sa r0 = r2.A0D
            java.lang.Object r0 = r0.invoke()
            java.lang.Number r0 = (java.lang.Number) r0
            int r20 = r0.intValue()
            X.1pX r7 = (X.1pX) r7
            X.0qQ.A0B(r9, r1)
            X.0qQ.A0B(r6, r3)
            X.0qQ.A0B(r11, r4)
            r0 = 3
            X.0qQ.A0B(r10, r0)
            boolean r0 = r10.isEmpty()
            if (r0 != 0) goto L_0x0023
            r13 = 0
            if (r8 == 0) goto L_0x0023
            boolean r0 = r8.isEmpty()
            if (r0 != 0) goto L_0x0023
            java.util.Iterator r12 = r10.iterator()
        L_0x0ec4:
            boolean r0 = r12.hasNext()
            r10 = 0
            if (r0 == 0) goto L_0x0ee7
            java.lang.Object r11 = r12.next()
            r0 = r11
            com.instagram.user.model.User r0 = (com.instagram.user.model.User) r0
            java.lang.String r4 = r0.getId()
            java.lang.Object r0 = X.00k.A0O(r8, r1)
            if (r0 == 0) goto L_0x0ee0
            java.lang.String r10 = r0.toString()
        L_0x0ee0:
            boolean r0 = X.0qQ.A0K(r4, r10)
            if (r0 == 0) goto L_0x0ec4
            r10 = r11
        L_0x0ee7:
            com.instagram.user.model.User r10 = (com.instagram.user.model.User) r10
            if (r10 == 0) goto L_0x0023
            java.lang.String r17 = r10.getId()
            java.lang.String r18 = r10.getUsername()
            com.instagram.common.typedurl.ImageUrl r16 = r10.Bh3()
            X.37E r0 = X.AnonymousClass37D.A00
            X.37D r0 = r0.A01(r6)
            X.7Pu r4 = X.C48943Emh.A00(r0)
            if (r0 == 0) goto L_0x0f0a
            X.37F r0 = (X.AnonymousClass37F) r0
            boolean r0 = r0.A0g
            if (r0 != r3) goto L_0x0f0a
            r13 = 1
        L_0x0f0a:
            X.7Pr r8 = new X.7Pr
            r8.<init>(r9)
            r8.A1G = r3
            r8.A0x = r3
            r0 = 1061997773(0x3f4ccccd, float:0.8)
            r8.A03 = r0
            X.1pb r14 = r7.A01
            r19 = r5
            if (r13 == 0) goto L_0x0f2b
            r21 = r3
            X.UbQ r0 = r14.A00(r15, r16, r17, r18, r19, r20, r21)
            if (r4 == 0) goto L_0x0023
            r4.A0F(r0, r8)
            goto L_0x0023
        L_0x0f2b:
            r21 = r1
            X.UbQ r1 = r14.A00(r15, r16, r17, r18, r19, r20, r21)
        L_0x0f31:
            X.7Pu r0 = r8.A00()
            r0.A02(r6, r1)
            goto L_0x0023
        L_0x0f3a:
            boolean r6 = r0 instanceof X.C334897c3
            if (r6 == 0) goto L_0x0ff8
            X.7be r6 = r2.A06
            X.4DH r10 = r2.A03
            X.7b2 r9 = r2.A07
            X.7c3 r0 = (X.C334897c3) r0
            X.7dj r8 = r0.A01
            java.util.List r12 = r0.A02
            float r11 = r0.A00
            X.0qQ.A0B(r10, r1)
            X.0qQ.A0B(r9, r3)
            X.0qQ.A0B(r8, r4)
            X.0qQ.A0B(r12, r7)
            boolean r0 = X.2Su.A03
            r16 = 2131625803(0x7f0e074b, float:1.8878824E38)
            android.content.Context r0 = r10.requireContext()
            android.view.LayoutInflater r13 = android.view.LayoutInflater.from(r0)
            X.0qQ.A07(r13)
            r14 = r5
            r15 = r5
            r17 = r1
            r18 = r1
            android.view.View r4 = X.2Su.A01(r13, r14, r15, r16, r17, r18)
            X.A64 r13 = new X.A64
            r13.<init>(r4)
            r6.A01 = r13
            r6.A00 = r11
            androidx.fragment.app.FragmentActivity r0 = r10.requireActivity()
            android.view.ViewGroup r7 = X.C232972uk.A03(r0)
            if (r7 == 0) goto L_0x0023
            android.view.View r14 = r13.A00
            r15 = -1
            android.view.ViewGroup$LayoutParams r0 = new android.view.ViewGroup$LayoutParams
            r0.<init>(r15, r15)
            r7.addView(r14, r0)
            android.content.Context r0 = r10.requireContext()
            java.util.List r16 = X.HX5.A00(r0, r12)
            android.content.Context r0 = r10.requireContext()
            com.instagram.common.session.UserSession r15 = r6.A05
            X.8Ov r12 = new X.8Ov
            r12.<init>(r0, r15, r5, r1)
            r0 = r16
            r12.A02(r0)
            X.APL r0 = new X.APL
            r0.<init>(r6)
            r12.setOnDismissListener(r0)
            r12.setTouchable(r3)
            r12.setFocusable(r1)
            r12.setOutsideTouchable(r1)
            r6.A02 = r12
            X.C334657be.A01(r8, r13, r6, r9, r15)
            X.AOm r0 = new X.AOm
            r0.<init>(r10, r13, r6, r11)
            r14.addOnLayoutChangeListener(r0)
            X.07V r0 = r10.getLifecycle()
            X.0xx r3 = X.C71772f0.A00(r0)
            r17 = 38
            X.MHG r11 = new X.MHG
            r14 = r6
            r15 = r13
            r16 = r5
            r13 = r8
            r12 = r9
            r11.<init>(r12, r13, r14, r15, r16, r17)
            X.19B r0 = X.19B.A00
            X.1Eo.A05(r0, r11, r3)
            android.content.Context r0 = r10.requireContext()
            android.graphics.drawable.BitmapDrawable r0 = X.C232972uk.A00(r0, r7)
            r4.setBackground(r0)
            X.AM3 r0 = new X.AM3
            r0.<init>(r6)
            X.AnonymousClass0fU.A00(r0, r4)
            r4.setVisibility(r1)
            goto L_0x0023
        L_0x0ff8:
            if (r10 == 0) goto L_0x100e
            r8 = r0
            X.9I3 r8 = (X.AnonymousClass9I3) r8
            int r6 = r8.A00
            if (r6 != r3) goto L_0x100e
            X.7be r3 = r2.A06
            boolean r1 = r8.A01
            X.A64 r0 = r3.A01
            if (r0 == 0) goto L_0x0023
            X.C334657be.A02(r3, r1)
            goto L_0x0023
        L_0x100e:
            boolean r3 = r0 instanceof X.C334907c4
            if (r3 == 0) goto L_0x1024
            X.7be r1 = r2.A06
            X.8Ov r0 = r1.A02
            if (r0 == 0) goto L_0x101b
            r0.setOnDismissListener(r5)
        L_0x101b:
            X.8Ov r0 = r1.A02
            if (r0 == 0) goto L_0x0023
            r0.dismiss()
            goto L_0x0023
        L_0x1024:
            boolean r3 = r0 instanceof X.C334917c5
            if (r3 == 0) goto L_0x1031
            X.7be r1 = r2.A06
            X.4DH r0 = r2.A03
            r1.A03(r0)
            goto L_0x0023
        L_0x1031:
            boolean r3 = r0 instanceof X.C334927c6
            if (r3 == 0) goto L_0x1071
            com.instagram.common.session.UserSession r8 = r2.A09
            X.7c6 r0 = (X.C334927c6) r0
            X.1Xl r4 = r0.A02
            X.4jb r9 = new X.4jb
            r9.<init>(r8, r4)
            int r3 = r0.A00
            r9.A00 = r3
            int r1 = r0.A01
            r9.A01 = r1
            X.4DH r7 = r2.A03
            X.2EG r11 = X.2EG.A1F
            X.4DU r10 = r2.A0A
            X.Q03 r6 = new X.Q03
            r6.<init>(r7, r8, r9, r10, r11)
            X.1Xj r0 = r4.BPf()
            r6.A01(r0)
            r6.A09 = r3
            r6.A0B = r1
            boolean r0 = r4 instanceof X.AnonymousClass3OA
            if (r0 == 0) goto L_0x1065
            r5 = r4
            X.3OA r5 = (X.AnonymousClass3OA) r5
        L_0x1065:
            r6.A0O = r5
            X.Q02 r0 = new X.Q02
            r0.<init>(r6)
            r0.A02()
            goto L_0x0023
        L_0x1071:
            boolean r3 = r0 instanceof X.C334937c7
            if (r3 == 0) goto L_0x115a
            androidx.fragment.app.FragmentActivity r13 = r2.A01
            boolean r3 = X.0oI.A0A(r13)
            if (r3 == 0) goto L_0x1151
            X.GgO r3 = r2.A08
            X.7c7 r0 = (X.C334937c7) r0
            java.lang.String r6 = r0.A05
            java.lang.String r10 = r0.A04
            java.lang.String r9 = r0.A03
            java.lang.String r8 = r0.A01
            X.0qQ.A0B(r6, r1)
            X.0qQ.A0B(r9, r4)
            X.0qQ.A0B(r8, r7)
            X.7a0 r7 = r3.A0C
            X.0wc r4 = r7.A01
            java.lang.String r3 = "instagram_comments_threads_share_tap"
            X.0kJ r1 = r4.A00
            X.0Aj r4 = r4.A00(r1, r3)
            boolean r1 = r4.isSampled()
            if (r1 == 0) goto L_0x1115
            java.util.concurrent.atomic.AtomicBoolean r1 = X.1Xj.A0i
            java.lang.String r3 = X.1Xv.A06(r6)
            int r1 = r3.length()
            if (r1 != 0) goto L_0x10b2
            java.lang.String r3 = "0"
        L_0x10b2:
            long r11 = java.lang.Long.parseLong(r3)
            java.lang.Long r3 = java.lang.Long.valueOf(r11)
            java.lang.String r1 = "media_id"
            r4.A9F(r1, r3)
            if (r10 == 0) goto L_0x114d
            r1 = 10
            java.lang.Long r1 = X.00y.A0n(r1, r10)
            if (r1 == 0) goto L_0x114d
            long r10 = r1.longValue()
        L_0x10cd:
            java.lang.Long r3 = java.lang.Long.valueOf(r10)
            r1 = 165(0xa5, float:2.31E-43)
            java.lang.String r1 = X.C273654mx.A00(r1)
            r4.A9F(r1, r3)
            X.4DU r1 = r7.A03
            java.lang.String r3 = r1.getModuleName()
            java.lang.String r1 = "containermodule"
            r4.AAJ(r1, r3)
            r7 = 10
            java.lang.Long r3 = X.00y.A0n(r7, r9)
            java.lang.String r1 = "comment_id"
            r4.A9F(r1, r3)
            java.lang.Long r3 = X.00y.A0n(r7, r8)
            r1 = 562(0x232, float:7.88E-43)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            r4.A9F(r1, r3)
            X.5OB r3 = X.AnonymousClass5OB.COMMENT_BUTTON
            java.lang.String r1 = "entry_point"
            r4.A8M(r3, r1)
            java.lang.String r3 = "long_press"
            java.lang.String r1 = "action"
            r4.AAJ(r1, r3)
            java.lang.String r3 = X.AnonymousClass1K6.A00
            java.lang.String r1 = "canonical_nav_chain"
            r4.AAJ(r1, r3)
            r4.Cgf()
        L_0x1115:
            com.instagram.common.session.UserSession r4 = r2.A09
            X.1E8 r1 = X.1E7.A00(r4)
            X.1Xj r17 = r1.A02(r6)
            com.instagram.model.mediatype.ProductType r3 = r0.A00
            com.instagram.model.mediatype.ProductType r1 = com.instagram.model.mediatype.ProductType.CLIPS
            if (r3 != r1) goto L_0x114a
            r1 = 3862(0xf16, float:5.412E-42)
        L_0x1127:
            java.lang.String r22 = X.AnonymousClass000.A00(r1)
            X.EWV r20 = X.EWV.A0B
            X.0hq r14 = r13.getSupportFragmentManager()
            X.0gy r15 = X.AnonymousClass07i.A00(r13)
            X.4DU r1 = r2.A0A
            java.lang.String r0 = r0.A02
            r21 = r5
            r23 = r5
            r24 = r0
            r16 = r4
            r18 = r1
            r19 = r5
            X.C46395DeI.A0F(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            goto L_0x0023
        L_0x114a:
            r1 = 3113(0xc29, float:4.362E-42)
            goto L_0x1127
        L_0x114d:
            r10 = 0
            goto L_0x10cd
        L_0x1151:
            com.instagram.common.session.UserSession r1 = r2.A09
            java.lang.String r0 = "comment_action_menu"
            X.C49965FGy.A03(r13, r1, r0, r5)
            goto L_0x0023
        L_0x115a:
            boolean r0 = r0 instanceof X.C334117ah
            if (r0 != 0) goto L_0x0023
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x1164:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r9)
            throw r0
        L_0x116a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r9)
            throw r0
        L_0x1170:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.comments.mvvm.view.fragment.CommentViewUiEffectHandler$handleCommentUiEffects$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
