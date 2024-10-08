package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

public final class W1T {
    public static final W1T A00 = new Object();

    public static final void A01(FragmentActivity fragmentActivity, UserSession userSession, boolean z) {
        0qQ.A0B(userSession, 1);
        if (z) {
            DbX.A10(fragmentActivity, AnonymousClass37D.A00);
            return;
        }
        C309516Yo r1 = new C309516Yo(fragmentActivity, userSession);
        r1.A0E = true;
        r1.A0G(Pxd.A00(796), 1);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x004e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02(android.os.Bundle r6, androidx.fragment.app.Fragment r7, androidx.fragment.app.Fragment r8, com.instagram.common.session.UserSession r9, java.lang.String r10, boolean r11) {
        /*
            r5 = this;
            r0 = 0
            X.0qQ.A0B(r9, r0)
            r1 = r7
            boolean r0 = r7 instanceof X.C16388Uu6
            if (r0 != 0) goto L_0x0014
            androidx.fragment.app.Fragment r1 = r7.mParentFragment
            boolean r0 = r1 instanceof X.C16388Uu6
            if (r0 == 0) goto L_0x003b
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.leadads.fragment.LeadAdsFormContainerFragment"
            X.0qQ.A0C(r1, r0)
        L_0x0014:
            if (r1 == 0) goto L_0x003b
            r8.setArguments(r6)
            X.0s1 r4 = X.DbW.A0C(r1)
            if (r11 == 0) goto L_0x002e
            r3 = 2130772095(0x7f01007f, float:1.7147299E38)
            r2 = 2130772066(0x7f010062, float:1.714724E38)
            r1 = 2130772064(0x7f010060, float:1.7147236E38)
            r0 = 2130772097(0x7f010081, float:1.7147303E38)
            r4.A07(r3, r2, r1, r0)
        L_0x002e:
            r0 = 2131435285(0x7f0b1f15, float:1.8492408E38)
            r4.A0D(r8, r10, r0)
            r4.A0I(r10)
            r4.A00()
            return
        L_0x003b:
            androidx.fragment.app.FragmentActivity r1 = r7.requireActivity()
            X.6Yo r0 = new X.6Yo
            r0.<init>(r1, r9)
            r0.A0B(r6, r8)
            if (r11 == 0) goto L_0x004c
            r0.A09()
        L_0x004c:
            if (r10 == 0) goto L_0x0052
            r0.A0C = r10
            r0.A0A = r10
        L_0x0052:
            r0.A04()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.W1T.A02(android.os.Bundle, androidx.fragment.app.Fragment, androidx.fragment.app.Fragment, com.instagram.common.session.UserSession, java.lang.String, boolean):void");
    }

    public final void A03(Fragment fragment, UserSession userSession, boolean z) {
        0qQ.A0B(userSession, 1);
        Fragment fragment2 = fragment.mParentFragment;
        if ((fragment2 instanceof C16388Uu6) && fragment2 != null) {
            if (0qQ.A0K(fragment.mTag, "lead_ad_post_click_initial_fragment_backstack")) {
                A01(fragment2.requireActivity(), userSession, z);
            } else {
                fragment2.getChildFragmentManager().A0c();
            }
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x000e: MOVE  (r1v3 com.instagram.base.activity.BaseFragmentActivity) = (r1v2 com.instagram.base.activity.BaseFragmentActivity)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    public static final void A00(androidx.fragment.app.Fragment r1) {
        /*
            androidx.fragment.app.Fragment r1 = r1.mParentFragment
            boolean r0 = r1 instanceof X.C16388Uu6
            if (r0 == 0) goto L_0x0015
            androidx.fragment.app.FragmentActivity r1 = r1.getActivity()
            boolean r0 = r1 instanceof com.instagram.base.activity.BaseFragmentActivity
            if (r0 == 0) goto L_0x0015
            com.instagram.base.activity.BaseFragmentActivity r1 = (com.instagram.base.activity.BaseFragmentActivity) r1
            if (r1 == 0) goto L_0x0015
            r1.A0a()
        L_0x0015:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.W1T.A00(androidx.fragment.app.Fragment):void");
    }
}
