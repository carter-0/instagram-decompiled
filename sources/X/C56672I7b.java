package X;

import android.animation.Animator;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.I7b  reason: case insensitive filesystem */
public final class C56672I7b implements Animator.AnimatorListener {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public final void onAnimationRepeat(Animator animator) {
    }

    public C56672I7b(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
    }

    public final void onAnimationCancel(Animator animator) {
        if (1 - this.A00 == 0) {
            C50422FbV fbV = (C50422FbV) this.A02;
            int A07 = DbX.A07(fbV.A04);
            RecyclerView recyclerView = fbV.A00;
            ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
            layoutParams.height = A07;
            recyclerView.setLayoutParams(layoutParams);
            DbS.A1U(this.A01);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: android.animation.ValueAnimator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: android.animation.AnimatorSet} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: android.animation.ValueAnimator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: android.animation.ValueAnimator} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onAnimationEnd(android.animation.Animator r4) {
        /*
            r3 = this;
            int r0 = r3.A00
            switch(r0) {
                case 0: goto L_0x003a;
                case 1: goto L_0x0054;
                case 2: goto L_0x002c;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r3.A01
            X.1Av r0 = (X.1Av) r0
            X.0xa r2 = r0.A01
            r0 = 1848(0x738, float:2.59E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            int r0 = X.DbT.A00(r2, r1)
            int r0 = r0 + 1
            X.AnonymousClass7TG.A1M(r2, r1, r0)
            android.animation.AnimatorSet r1 = new android.animation.AnimatorSet
            r1.<init>()
            java.lang.Object r0 = r3.A02
            X.6hr r0 = (X.C314226hr) r0
            java.util.ArrayList r0 = r0.A0V
            r1.playTogether(r0)
        L_0x0028:
            r1.start()
        L_0x002b:
            return
        L_0x002c:
            java.lang.Object r0 = r3.A01
            X.DbS.A1U(r0)
            java.lang.Object r0 = r3.A02
            com.instagram.friendmap.view.customview.FriendMapAnimatedLikeView r0 = (com.instagram.friendmap.view.customview.FriendMapAnimatedLikeView) r0
            android.animation.ValueAnimator r1 = r0.A01
            if (r1 == 0) goto L_0x002b
            goto L_0x0028
        L_0x003a:
            java.lang.Object r1 = r3.A02
            android.app.Dialog r1 = (android.app.Dialog) r1
            boolean r0 = r1.isShowing()
            if (r0 == 0) goto L_0x002b
            java.lang.Object r0 = r3.A01
            android.app.Activity r0 = (android.app.Activity) r0
            if (r0 == 0) goto L_0x002b
            boolean r0 = r0.isDestroyed()
            if (r0 != 0) goto L_0x002b
            r1.dismiss()
            return
        L_0x0054:
            java.lang.Object r0 = r3.A01
            X.DbS.A1U(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56672I7b.onAnimationEnd(android.animation.Animator):void");
    }

    public final void onAnimationStart(Animator animator) {
        if (1 - this.A00 == 0) {
            RecyclerView recyclerView = ((C50422FbV) this.A02).A00;
            ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
            layoutParams.height = 0;
            recyclerView.setLayoutParams(layoutParams);
            recyclerView.setVisibility(0);
        }
    }
}
