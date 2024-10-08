package com.instagram.comments.mvvm.view.fragment;

import X.0lr;
import X.0sL;
import X.AnonymousClass1Ek;
import X.AnonymousClass4D7;
import X.AnonymousClass4DH;
import X.AnonymousClass4DU;
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

@DebugMetadata(c = "com.instagram.comments.mvvm.view.fragment.CommentComposerBinder$createAndBindViewHolder$5$1", f = "CommentComposerBinder.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class CommentComposerBinder$createAndBindViewHolder$5$1 extends AnonymousClass1Ek implements 0sL {
    public /* synthetic */ Object A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ View A02;
    public final /* synthetic */ AnonymousClass4DH A03;
    public final /* synthetic */ C334397bC A04;
    public final /* synthetic */ C53335GmL A05;
    public final /* synthetic */ C334347b7 A06;
    public final /* synthetic */ C52971GgO A07;
    public final /* synthetic */ UserSession A08;
    public final /* synthetic */ 0lr A09;
    public final /* synthetic */ AnonymousClass4DU A0A;
    public final /* synthetic */ C62320sa A0B;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CommentComposerBinder$createAndBindViewHolder$5$1(Context context, View view, AnonymousClass4DH r4, C334397bC r5, C53335GmL gmL, C334347b7 r7, C52971GgO ggO, UserSession userSession, 0lr r10, AnonymousClass4DU r11, AnonymousClass4D7 r12, C62320sa r13) {
        super(2, r12);
        this.A04 = r5;
        this.A06 = r7;
        this.A0B = r13;
        this.A02 = view;
        this.A01 = context;
        this.A08 = userSession;
        this.A07 = ggO;
        this.A03 = r4;
        this.A0A = r11;
        this.A09 = r10;
        this.A05 = gmL;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.instagram.comments.mvvm.view.fragment.CommentComposerBinder$createAndBindViewHolder$5$1, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r15) {
        C334397bC r4 = this.A04;
        C334347b7 r6 = this.A06;
        C62320sa r12 = this.A0B;
        View view = this.A02;
        Context context = this.A01;
        UserSession userSession = this.A08;
        C52971GgO ggO = this.A07;
        AnonymousClass4DH r3 = this.A03;
        AnonymousClass4DU r10 = this.A0A;
        ? commentComposerBinder$createAndBindViewHolder$5$1 = new CommentComposerBinder$createAndBindViewHolder$5$1(context, view, r3, r4, this.A05, r6, ggO, userSession, this.A09, r10, r15, r12);
        commentComposerBinder$createAndBindViewHolder$5$1.A00 = obj;
        return commentComposerBinder$createAndBindViewHolder$5$1;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((CommentComposerBinder$createAndBindViewHolder$5$1) create(obj, (AnonymousClass4D7) obj2)).invokeSuspend(C60340gF.A00);
    }

    /* JADX WARNING: type inference failed for: r1v75, types: [X.A1p, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v88, types: [X.9qM] */
    /* JADX WARNING: type inference failed for: r1v89, types: [X.A1p, java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r24) {
        /*
            r23 = this;
            X.0eS.A00(r24)
            r0 = r23
            java.lang.Object r3 = r0.A00
            X.7ag r3 = (X.C334107ag) r3
            boolean r1 = r3 instanceof X.C335227cc
            java.lang.String r6 = ""
            if (r1 == 0) goto L_0x002b
            X.7bC r5 = r0.A04
            X.7cc r3 = (X.C335227cc) r3
            int r4 = r3.A00
            java.lang.String r2 = r3.A01
            X.9bn r1 = new X.9bn
            r1.<init>(r4, r2, r6)
            r5.E4L(r1)
        L_0x001f:
            X.GgO r0 = r0.A07
            X.05G r1 = r0.A0P
            X.7af r0 = X.C334097af.A00
            r1.Epw(r0)
            X.0gF r0 = X.C60340gF.A00
            return r0
        L_0x002b:
            boolean r1 = r3 instanceof X.C335237cd
            if (r1 == 0) goto L_0x0037
            X.7b7 r1 = r0.A06
            com.instagram.ui.widget.textview.ComposerAutoCompleteTextView r1 = r1.A0B
            r1.setText(r6)
            goto L_0x001f
        L_0x0037:
            boolean r1 = r3 instanceof X.C335247ce
            if (r1 == 0) goto L_0x0052
            X.7ce r3 = (X.C335247ce) r3
            X.7a4 r2 = r3.A00
            if (r2 == 0) goto L_0x0046
            X.7bC r1 = r0.A04
            r1.DfK(r2)
        L_0x0046:
            X.7b6 r5 = X.C334337b6.A00
            X.7b7 r4 = r0.A06
            java.lang.CharSequence r2 = r3.A01
            X.0sa r1 = r0.A0B
            r5.A08(r4, r2, r1)
            goto L_0x001f
        L_0x0052:
            boolean r1 = r3 instanceof X.C335257cf
            if (r1 == 0) goto L_0x0065
            X.7b7 r4 = r0.A06
            X.0sa r3 = r0.A0B
            com.instagram.ui.widget.textview.ComposerAutoCompleteTextView r2 = r4.A0B
            X.7dy r1 = new X.7dy
            r1.<init>(r4, r3)
            r2.post(r1)
            goto L_0x001f
        L_0x0065:
            boolean r1 = r3 instanceof X.C335267cg
            if (r1 == 0) goto L_0x0083
            android.view.View r1 = r0.A02
            X.0nA.A0N(r1)
            android.content.Context r6 = r0.A01
            com.instagram.common.session.UserSession r5 = r0.A08
            X.7cg r3 = (X.C335267cg) r3
            java.lang.String r4 = r3.A00
            X.NjK r3 = X.C69319NjK.COMMENT_COMPOSER
            X.GgO r2 = r0.A07
            X.In0 r1 = new X.In0
            r1.<init>(r2)
            X.C70857OOm.A01(r6, r5, r3, r4, r1)
            goto L_0x001f
        L_0x0083:
            boolean r1 = r3 instanceof X.C335277ch
            r2 = 0
            if (r1 == 0) goto L_0x0128
            android.view.View r1 = r0.A02
            X.0nA.A0N(r1)
            r6 = r3
            X.7ch r6 = (X.C335277ch) r6
            boolean r1 = r6.A02
            if (r1 == 0) goto L_0x0119
            X.4DH r9 = r0.A03
            com.instagram.common.session.UserSession r10 = r0.A08
            r1 = 28
            X.Ivp r8 = new X.Ivp
            r8.<init>(r10, r1)
            r1 = 29
            X.Ivp r6 = new X.Ivp
            r6.<init>(r9, r1)
            X.0eO r5 = X.0eO.A02
            r4 = 30
            X.Ivp r1 = new X.Ivp
            r1.<init>(r6, r4)
            X.0eM r7 = X.AnonymousClass0eN.A00(r5, r1)
            java.lang.Class<X.6i1> r1 = X.C314326i1.class
            X.0Yh r6 = new X.0Yh
            r6.<init>(r1)
            r1 = 31
            X.Ivp r5 = new X.Ivp
            r5.<init>(r7, r1)
            r4 = 24
            X.Ins r1 = new X.Ins
            r1.<init>(r4, r2, r7)
            X.2kA r4 = new X.2kA
            r4.<init>(r5, r8, r1, r6)
            java.lang.Object r1 = r4.getValue()
            X.6i1 r1 = (X.C314326i1) r1
            boolean r1 = r1.A02()
            if (r1 == 0) goto L_0x001f
            java.lang.Object r8 = r4.getValue()
            X.4DU r1 = r0.A0A
            r12 = 23
            X.IoC r11 = new X.IoC
            r13 = r3
            r14 = r10
            r15 = r1
            r16 = r9
            r11.<init>(r12, r13, r14, r15, r16)
            r1 = 0
            X.0qQ.A0B(r8, r1)
            r1 = 1
            X.0qQ.A0B(r9, r1)
            r1 = 2
            X.0qQ.A0B(r10, r1)
            X.07U r7 = X.07U.A05
            X.07Z r6 = r9.getViewLifecycleOwner()
            X.0xx r3 = X.AnonymousClass07a.A00(r6)
            r13 = 13
            X.JTw r5 = new X.JTw
            r12 = r2
            r5.<init>((java.lang.Object) r6, (java.lang.Object) r7, (java.lang.Object) r8, (java.lang.Object) r9, (java.lang.Object) r10, (java.lang.Object) r11, (X.AnonymousClass4D7) r12, (int) r13)
            X.19B r1 = X.19B.A00
            X.1Eo.A05(r1, r5, r3)
            java.lang.Object r1 = r4.getValue()
            X.6i1 r1 = (X.C314326i1) r1
            r1.A00()
            goto L_0x001f
        L_0x0119:
            com.instagram.common.session.UserSession r5 = r0.A08
            X.4DH r4 = r0.A03
            boolean r3 = r6.A01
            X.1Xj r2 = r6.A00
            X.4DU r1 = r0.A0A
            X.C334337b6.A06(r4, r5, r2, r1, r3)
            goto L_0x001f
        L_0x0128:
            boolean r1 = r3 instanceof X.C335287ci
            if (r1 == 0) goto L_0x019f
            android.view.View r1 = r0.A02
            X.0nA.A0N(r1)
            X.4DH r1 = r0.A03
            androidx.fragment.app.FragmentActivity r4 = r1.getActivity()
            if (r4 == 0) goto L_0x001f
            X.7ci r3 = (X.C335287ci) r3
            X.7ft r9 = r3.A00
            java.lang.String r10 = r3.A01
            com.instagram.common.session.UserSession r6 = r0.A08
            X.GgO r8 = r0.A07
            X.37E r1 = X.AnonymousClass37D.A00
            X.37D r1 = r1.A01(r4)
            X.7Pu r5 = X.C48943Emh.A00(r1)
            X.1Yl r3 = X.C357108Wn.A00()
            X.A1p r1 = r3.A00
            if (r1 != 0) goto L_0x015c
            X.A1p r1 = new X.A1p
            r1.<init>()
            r3.A00 = r1
        L_0x015c:
            r11 = 0
            if (r5 == 0) goto L_0x0160
            r11 = 1
        L_0x0160:
            java.lang.String r12 = "comment_create"
            r1 = 0
            X.0qQ.A0B(r6, r1)
            X.E1o r5 = new X.E1o
            r5.<init>()
            android.os.Bundle r7 = new android.os.Bundle
            r7.<init>()
            java.lang.String r3 = r6.A05
            java.lang.String r1 = "IgSessionManager.SESSION_TOKEN_KEY"
            r7.putString(r1, r3)
            java.lang.String r1 = "action_source"
            r7.putString(r1, r12)
            r1 = 313(0x139, float:4.39E-43)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            r7.putBoolean(r1, r11)
            r5.setArguments(r7)
            X.ExQ r1 = new X.ExQ
            r1.<init>(r8, r9, r10)
            r5.A00 = r1
            X.9qM r1 = new X.9qM
            r1.<init>(r8, r9, r10)
        L_0x0194:
            r8 = 1
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r1
            r7 = r2
            X.C393879xB.A00(r3, r4, r5, r6, r7, r8)
            goto L_0x001f
        L_0x019f:
            boolean r1 = r3 instanceof X.C335297cj
            if (r1 == 0) goto L_0x024e
            android.view.View r1 = r0.A02
            X.0nA.A0N(r1)
            X.4DH r1 = r0.A03
            androidx.fragment.app.FragmentActivity r4 = r1.getActivity()
            if (r4 == 0) goto L_0x001f
            X.GgO r1 = r0.A07
            r16 = r1
            X.0lr r1 = r0.A09
            r17 = r1
            com.instagram.common.session.UserSession r6 = r0.A08
            X.7cj r3 = (X.C335297cj) r3
            java.lang.String r1 = r3.A04
            r21 = r1
            java.lang.String r1 = r3.A03
            r22 = r1
            X.7ft r5 = r3.A00
            X.7fu r9 = r3.A01
            X.8Wt r10 = r3.A02
            X.37E r1 = X.AnonymousClass37D.A00
            X.37D r1 = r1.A01(r4)
            X.7Pu r1 = X.C48943Emh.A00(r1)
            r8 = 0
            if (r1 == 0) goto L_0x01d8
            r8 = 1
        L_0x01d8:
            X.1Yl r3 = X.C357108Wn.A00()
            X.A1p r1 = r3.A00
            if (r1 != 0) goto L_0x01e7
            X.A1p r1 = new X.A1p
            r1.<init>()
            r3.A00 = r1
        L_0x01e7:
            X.9rq r14 = X.C390789rq.COMMENT
            X.9ri r13 = X.C390709ri.A02
            java.lang.String r12 = "comment_create"
            java.lang.String r11 = r5.A02
            X.AhP r7 = new X.AhP
            r20 = r10
            r15 = r7
            r18 = r5
            r19 = r9
            r15.<init>(r16, r17, r18, r19, r20, r21, r22)
            r1 = 0
            X.0qQ.A0B(r6, r1)
            X.AnonymousClass7TG.A1U(r14, r13, r12)
            X.E3e r5 = new X.E3e
            r5.<init>()
            android.os.Bundle r3 = X.AnonymousClass7TE.A0a()
            java.lang.String r15 = r6.A05
            java.lang.String r1 = "IgSessionManager.SESSION_TOKEN_KEY"
            r3.putString(r1, r15)
            r1 = 393(0x189, float:5.51E-43)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            r3.putSerializable(r1, r14)
            r1 = 1225(0x4c9, float:1.717E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            r3.putSerializable(r1, r13)
            java.lang.String r1 = "action_source"
            r3.putString(r1, r12)
            java.lang.String r1 = "text_language"
            r3.putString(r1, r11)
            r1 = 313(0x139, float:4.39E-43)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            r3.putBoolean(r1, r8)
            r5.setArguments(r3)
            r5.A00 = r7
            X.9qO r1 = new X.9qO
            r11 = r1
            r12 = r16
            r13 = r17
            r14 = r9
            r15 = r10
            r16 = r21
            r17 = r22
            r11.<init>(r12, r13, r14, r15, r16, r17)
            goto L_0x0194
        L_0x024e:
            boolean r1 = r3 instanceof X.C335307ck
            if (r1 == 0) goto L_0x0269
            X.4DH r4 = r0.A03
            androidx.fragment.app.FragmentActivity r2 = r4.getActivity()
            if (r2 == 0) goto L_0x001f
            X.I4D r1 = X.I4D.A00
            com.instagram.common.session.UserSession r6 = r0.A08
            X.7ck r3 = (X.C335307ck) r3
            X.7cr r5 = r3.A01
            X.28D r3 = r3.A00
            r1.A01(r2, r3, r4, r5, r6)
            goto L_0x001f
        L_0x0269:
            boolean r1 = r3 instanceof X.C335317cl
            if (r1 == 0) goto L_0x0293
            X.4DH r1 = r0.A03
            androidx.fragment.app.FragmentActivity r6 = r1.getActivity()
            if (r6 == 0) goto L_0x001f
            X.7b7 r1 = r0.A06
            com.instagram.common.ui.widget.imageview.IgImageView r5 = r1.A0A
            com.instagram.common.session.UserSession r4 = r0.A08
            X.7cl r3 = (X.C335317cl) r3
            X.2xK r2 = r3.A00
            r1 = 2
            X.0qQ.A0B(r4, r1)
            r1 = 3
            X.0qQ.A0B(r2, r1)
            X.Aq4 r3 = new X.Aq4
            r3.<init>(r6, r5, r4, r2)
            r1 = 500(0x1f4, double:2.47E-321)
            r5.postDelayed(r3, r1)
            goto L_0x001f
        L_0x0293:
            boolean r1 = r3 instanceof X.C335327cm
            r4 = 500(0x1f4, double:2.47E-321)
            if (r1 == 0) goto L_0x02a9
            X.7b7 r1 = r0.A06
            com.instagram.ui.widget.textview.ComposerAutoCompleteTextView r8 = r1.A0B
            X.7bC r1 = r0.A04
            X.AmW r7 = new X.AmW
            r7.<init>(r1, r3)
        L_0x02a4:
            r8.postDelayed(r7, r4)
            goto L_0x001f
        L_0x02a9:
            boolean r1 = r3 instanceof X.C335337cn
            if (r1 != 0) goto L_0x001f
            boolean r1 = r3 instanceof X.C335347co
            if (r1 == 0) goto L_0x02d5
            X.4DH r1 = r0.A03
            androidx.fragment.app.FragmentActivity r8 = r1.getActivity()
            if (r8 == 0) goto L_0x001f
            X.7b7 r1 = r0.A06
            com.instagram.ui.widget.textview.ComposerAutoCompleteTextView r7 = r1.A0B
            com.instagram.common.session.UserSession r6 = r0.A08
            X.7co r3 = (X.C335347co) r3
            X.2xK r2 = r3.A00
            r1 = 2
            X.0qQ.A0B(r6, r1)
            r1 = 3
            X.0qQ.A0B(r2, r1)
            X.Aq5 r1 = new X.Aq5
            r1.<init>(r8, r7, r6, r2)
            r7.postDelayed(r1, r4)
            goto L_0x001f
        L_0x02d5:
            boolean r1 = r3 instanceof X.C335357cp
            if (r1 == 0) goto L_0x02ef
            X.4DH r1 = r0.A03
            androidx.fragment.app.FragmentActivity r6 = r1.getActivity()
            if (r6 == 0) goto L_0x001f
            X.7b7 r3 = r0.A06
            com.instagram.ui.widget.textview.ComposerAutoCompleteTextView r8 = r3.A0B
            android.content.Context r2 = r0.A01
            com.instagram.common.session.UserSession r1 = r0.A08
            X.Iiy r7 = new X.Iiy
            r7.<init>(r2, r6, r3, r1)
            goto L_0x02a4
        L_0x02ef:
            boolean r1 = r3 instanceof X.C334467bJ
            if (r1 == 0) goto L_0x0313
            X.4DH r1 = r0.A03
            androidx.fragment.app.FragmentActivity r5 = r1.getActivity()
            if (r5 == 0) goto L_0x001f
            X.7b7 r1 = r0.A06
            com.instagram.common.ui.widget.imageview.IgImageView r4 = r1.A07
            X.7bJ r3 = (X.C334467bJ) r3
            X.2xK r2 = r3.A00
            r1 = 2
            X.0qQ.A0B(r2, r1)
            X.Aol r3 = new X.Aol
            r3.<init>(r5, r4, r2)
            r1 = 1000(0x3e8, double:4.94E-321)
            r4.postDelayed(r3, r1)
            goto L_0x001f
        L_0x0313:
            boolean r1 = r3 instanceof X.C335367cq
            if (r1 == 0) goto L_0x032c
            X.7b7 r1 = r0.A06
            com.instagram.ui.widget.textview.ComposerAutoCompleteTextView r4 = r1.A0B
            X.7cq r3 = (X.C335367cq) r3
            java.lang.String r3 = r3.A00
            int r2 = r4.getSelectionStart()
            int r1 = r4.getSelectionEnd()
            X.C334337b6.A00(r4, r3, r2, r1)
            goto L_0x001f
        L_0x032c:
            boolean r1 = r3 instanceof X.C334097af
            if (r1 != 0) goto L_0x001f
            boolean r1 = r3 instanceof X.AXX
            if (r1 == 0) goto L_0x0371
            com.instagram.common.session.UserSession r1 = r0.A08
            com.instagram.bloks.hosting.IgBloksScreenConfig r6 = new com.instagram.bloks.hosting.IgBloksScreenConfig
            r6.<init>((X.0lg) r1)
            r1 = 58
            java.lang.String r1 = X.C66579MXk.A00(r1)
            r6.A0R = r1
            android.content.Context r1 = r0.A01
            X.A9R r5 = new X.A9R
            r5.<init>(r1)
            java.lang.String r2 = "ig_comments"
            java.util.Map r4 = r5.A02
            java.lang.String r1 = "entrypoint"
            r4.put(r1, r2)
            X.AXX r3 = (X.AXX) r3
            java.lang.String r2 = r3.A00
            r1 = 886(0x376, float:1.242E-42)
            java.lang.String r1 = X.C66579MXk.A00(r1)
            r4.put(r1, r2)
            X.GgO r3 = r0.A07
            r2 = 39
            X.JJQ r1 = new X.JJQ
            r1.<init>(r3, r2)
            r5.A01(r1)
            r5.A00(r6)
            goto L_0x001f
        L_0x0371:
            boolean r1 = r3 instanceof X.AXY
            if (r1 == 0) goto L_0x03b0
            r2 = r3
            X.AXY r2 = (X.AXY) r2
            java.util.List r10 = r2.A03
            X.4DH r1 = r0.A03
            androidx.fragment.app.FragmentActivity r9 = r1.getActivity()
            if (r9 == 0) goto L_0x001f
            android.content.Context r8 = r0.A01
            com.instagram.common.session.UserSession r7 = r0.A08
            X.GgO r6 = r0.A07
            X.4DU r5 = r0.A0A
            X.0qQ.A0A(r8)
            java.lang.Integer r4 = r2.A00
            java.lang.Integer r2 = X.AnonymousClass05K.A00
            r1 = 0
            if (r4 != r2) goto L_0x0395
            r1 = 1
        L_0x0395:
            X.8ab r4 = X.FGc.A00(r8, r9, r7, r10, r1)
            r2 = 2131966151(0x7f1338c7, float:1.9569132E38)
            X.AKd r1 = new X.AKd
            r1.<init>(r3, r6, r7, r5)
            r4.A0G(r1, r2)
            r4.A06()
            android.app.Dialog r1 = r4.A02()
            X.AnonymousClass0fN.A00(r1)
            goto L_0x001f
        L_0x03b0:
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.comments.mvvm.view.fragment.CommentComposerBinder$createAndBindViewHolder$5$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
