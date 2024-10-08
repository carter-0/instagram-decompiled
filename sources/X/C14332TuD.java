package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgFrameLayout;
import com.instagram.watchandbrowse.ui.WatchAndBrowseMainView;

/* renamed from: X.TuD  reason: case insensitive filesystem */
public final class C14332TuD implements AnonymousClass2xU {
    public int A00 = -1;
    public IgFrameLayout A01;
    public C246993fb A02;
    public C54512HGy A03;
    public WatchAndBrowseMainView A04;
    public boolean A05;
    public final View A06;
    public final ViewGroup A07;
    public final Activity A08;
    public final Context A09;
    public final UserSession A0A;
    public final C14333TuE A0B;

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00f2, code lost:
        if (X.AnonymousClass7TE.A1a(r7.invoke(r6, r9, r0.A00.AiE(r10.A01, A00(), r5, r4))) == true) goto L_0x00f4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DQp(X.AnonymousClass3W1 r11, int r12) {
        /*
            r10 = this;
            r1 = 0
            X.0qQ.A0B(r11, r1)
            java.lang.String r2 = "GridWatchAndBrowseViewHolder"
            r0 = 50
            if (r12 != r0) goto L_0x016c
            java.lang.Integer r0 = r11.A13
            int r2 = r0.intValue()
            r8 = 1
            X.3fb r0 = r10.A00()
            X.4Jl r0 = r0.A00
            if (r2 == r1) goto L_0x006c
            X.0sa r0 = r0.A03
            java.lang.Object r2 = r0.invoke()
            X.C66580MXl.A1R(r2)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            com.instagram.common.ui.base.IgFrameLayout r0 = r10.A01
            if (r0 == 0) goto L_0x0064
            android.view.View r0 = r0.getChildAt(r1)
            if (r0 == 0) goto L_0x0064
            r0.getMeasuredHeight()
            android.view.ViewGroup r0 = r10.A07
            if (r0 == 0) goto L_0x0064
            android.view.View r0 = r10.A06
            if (r0 == 0) goto L_0x0064
            X.3fb r0 = r10.A00()
            X.4Jl r0 = r0.A00
            X.0sa r0 = r0.A07
            r0.invoke()
            android.transition.Scene r3 = new android.transition.Scene
            r3.<init>(r2)
            X.WnJ r0 = new X.WnJ
            r0.<init>(r2, r10)
            r3.setEnterAction(r0)
            r2.setClipChildren(r1)
            android.transition.TransitionManager r2 = new android.transition.TransitionManager
            r2.<init>()
            android.transition.ChangeTransform r0 = new android.transition.ChangeTransform
            r0.<init>()
            r2.setTransition(r3, r0)
            r2.transitionTo(r3)
        L_0x0064:
            r10.A05 = r1
            com.instagram.watchandbrowse.ui.WatchAndBrowseMainView r0 = r10.A04
            X.AnonymousClass7TH.A0R(r0)
        L_0x006b:
            return
        L_0x006c:
            X.0sa r0 = r0.A05
            java.lang.Object r0 = r0.invoke()
            X.HGy r0 = (X.C54512HGy) r0
            r10.A03 = r0
            X.3fb r0 = r10.A00()
            X.4Jl r0 = r0.A00
            X.0sa r0 = r0.A03
            java.lang.Object r2 = r0.invoke()
            android.view.View r2 = (android.view.View) r2
            if (r2 == 0) goto L_0x006b
            com.instagram.watchandbrowse.ui.WatchAndBrowseMainView r0 = r10.A04
            if (r0 != 0) goto L_0x00c3
            r0 = 2131443960(0x7f0b40f8, float:1.8510003E38)
            android.view.View r0 = r2.requireViewById(r0)
            r4 = 0
            X.3oV r0 = X.2b1.A01(r0, r1, r1)
            android.view.View r5 = r0.getView()
            com.instagram.watchandbrowse.ui.WatchAndBrowseMainView r5 = (com.instagram.watchandbrowse.ui.WatchAndBrowseMainView) r5
            r10.A04 = r5
            if (r5 == 0) goto L_0x00b0
            android.content.Context r3 = r10.A09
            X.3fb r0 = r10.A00()
            X.4Jl r2 = r0.A00
            X.GkT r0 = new X.GkT
            r0.<init>(r3, r2)
            r5.A00(r0)
        L_0x00b0:
            com.instagram.watchandbrowse.ui.WatchAndBrowseMainView r5 = r10.A04
            if (r5 == 0) goto L_0x00b6
            com.instagram.common.ui.base.IgFrameLayout r4 = r5.A01
        L_0x00b6:
            r10.A01 = r4
            X.TuE r3 = r10.A0B
            X.HGy r2 = r10.A03
            X.3fb r0 = r10.A00()
            r3.CNI(r4, r0, r2, r5)
        L_0x00c3:
            X.HGy r9 = r10.A03
            if (r9 == 0) goto L_0x016a
            X.3fb r0 = r10.A00()
            X.4Jl r0 = r0.A00
            X.0sK r7 = r0.A0G
            android.view.ViewGroup r6 = r10.A07
            java.lang.String r0 = X.AnonymousClass000.A00(r1)
            X.0qQ.A0C(r6, r0)
            X.TuE r0 = r10.A0B
            X.HGy r5 = r10.A03
            com.instagram.watchandbrowse.ui.WatchAndBrowseMainView r4 = r10.A04
            com.instagram.common.ui.base.IgFrameLayout r3 = r10.A01
            X.3fb r2 = r10.A00()
            X.3Uz r0 = r0.A00
            X.Hom r0 = r0.AiE(r3, r2, r5, r4)
            java.lang.Object r0 = r7.invoke(r6, r9, r0)
            boolean r0 = X.AnonymousClass7TE.A1a(r0)
            if (r0 != r8) goto L_0x016a
        L_0x00f4:
            r10.A05 = r8
            if (r8 == 0) goto L_0x006b
            android.view.View r0 = r10.A06
            if (r0 == 0) goto L_0x0162
            X.3fb r0 = r10.A00()
            X.4Jl r0 = r0.A00
            X.0sa r0 = r0.A00
            r0.invoke()
            X.3fb r0 = r10.A00()
            X.4Jl r0 = r0.A00
            X.0sP r2 = r0.A0C
            X.HGy r0 = r10.A03
            java.lang.Object r0 = r2.invoke(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x0162
            int r6 = r0.intValue()
            X.3fb r0 = r10.A00()
            X.4Jl r0 = r0.A00
            X.0sa r0 = r0.A02
            java.lang.Object r0 = r0.invoke()
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x0162
            int r5 = r0.intValue()
            X.3fb r0 = r10.A00()
            X.4Jl r0 = r0.A00
            X.0sa r0 = r0.A03
            java.lang.Object r4 = r0.invoke()
            X.C66580MXl.A1R(r4)
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            android.transition.ChangeTransform r3 = new android.transition.ChangeTransform
            r3.<init>()
            android.transition.Scene r2 = new android.transition.Scene
            r2.<init>(r4)
            X.Wom r0 = new X.Wom
            r0.<init>(r10, r6, r5)
            r2.setEnterAction(r0)
            r4.setClipChildren(r1)
            android.transition.TransitionManager r0 = new android.transition.TransitionManager
            r0.<init>()
            r0.setTransition(r2, r3)
            r0.transitionTo(r2)
        L_0x0162:
            com.instagram.watchandbrowse.ui.WatchAndBrowseMainView r0 = r10.A04
            if (r0 == 0) goto L_0x006b
            r0.setVisibility(r1)
            return
        L_0x016a:
            r8 = 0
            goto L_0x00f4
        L_0x016c:
            r0 = 18
            if (r12 != r0) goto L_0x006b
            boolean r0 = r11.A1w
            if (r0 != 0) goto L_0x006b
            boolean r0 = r10.A05
            if (r0 == 0) goto L_0x006b
            X.3fb r0 = r10.A00()
            X.4Jl r0 = r0.A00
            X.0sa r0 = r0.A06
            boolean r0 = X.C51971G9r.A1b(r0)
            if (r0 != 0) goto L_0x006b
            r0 = 3549(0xddd, float:4.973E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.0KC.A0D(r2, r0)
            X.3fb r0 = r10.A00()
            X.4Jl r0 = r0.A00
            X.0sa r0 = r0.A01
            r0.invoke()
            r10.A05 = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14332TuD.DQp(X.3W1, int):void");
    }

    public final C246993fb A00() {
        C246993fb r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        0qQ.A0F("uiState");
        throw AnonymousClass00P.createAndThrow();
    }

    public C14332TuD(Activity activity, Context context, ViewGroup viewGroup, UserSession userSession) {
        View view;
        this.A09 = context;
        this.A07 = viewGroup;
        this.A0A = userSession;
        this.A08 = activity;
        this.A0B = new C14333TuE(new AnonymousClass3Uy(activity, context, userSession));
        if (viewGroup != null) {
            view = viewGroup.findViewById(R.id.image_button);
        } else {
            view = null;
        }
        this.A06 = view;
    }
}
