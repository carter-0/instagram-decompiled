package com.instagram.business.promote.mediapicker.view;

import X.AnonymousClass7TG;
import android.content.Context;
import android.util.AttributeSet;
import com.google.android.material.appbar.AppBarLayout;

public final class ThresholdScrollingBehavior extends AppBarLayout.ScrollingViewBehavior {
    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x0010: MOVE  (r2v2 X.2dP) = (r2v0 X.2dP)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    public final boolean A0D(android.view.View r5, android.view.View r6, androidx.coordinatorlayout.widget.CoordinatorLayout r7) {
        /*
            r4 = this;
            r3 = 0
            X.C51973G9u.A1E(r7, r5, r6)
            super.A0D(r5, r6, r7)
            android.view.ViewGroup$LayoutParams r2 = r6.getLayoutParams()
            boolean r0 = r2 instanceof X.2dP
            r1 = 0
            if (r0 == 0) goto L_0x0016
            X.2dP r2 = (X.2dP) r2
            if (r2 == 0) goto L_0x0016
            androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior r1 = r2.A0A
        L_0x0016:
            boolean r0 = r1 instanceof com.google.android.material.appbar.AppBarLayout.Behavior
            if (r0 == 0) goto L_0x0030
            if (r1 == 0) goto L_0x0030
            android.view.ViewGroup$LayoutParams r2 = r5.getLayoutParams()
            if (r2 == 0) goto L_0x002d
            int r1 = r7.getHeight()
            int r0 = r5.getTop()
            int r1 = r1 - r0
            r2.height = r1
        L_0x002d:
            r5.requestLayout()
        L_0x0030:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.business.promote.mediapicker.view.ThresholdScrollingBehavior.A0D(android.view.View, android.view.View, androidx.coordinatorlayout.widget.CoordinatorLayout):boolean");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ThresholdScrollingBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AnonymousClass7TG.A1O(context, attributeSet);
    }

    public ThresholdScrollingBehavior() {
    }
}
