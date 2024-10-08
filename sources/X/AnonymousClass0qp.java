package X;

import android.animation.AnimatorSet;
import android.os.Build;
import android.view.ViewGroup;

/* renamed from: X.0qp  reason: invalid class name */
public final class AnonymousClass0qp extends AnonymousClass076 {
    public AnimatorSet A00;
    public final 0rK A01;

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: X.0qp.A03(android.view.ViewGroup):void, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:58)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public final void A03(android.view.ViewGroup r1) {
        /*
        // Can't load method instructions: Load method exception: null in method: X.0qp.A03(android.view.ViewGroup):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0qp.A03(android.view.ViewGroup):void");
    }

    public final boolean A07() {
        return true;
    }

    public final void A04(ViewGroup viewGroup) {
        AnimatorSet animatorSet = this.A00;
        0hm r0 = this.A01.A00;
        if (animatorSet == null) {
            r0.A02(this);
            return;
        }
        if (r0.A05) {
            animatorSet.reverse();
        } else {
            animatorSet.end();
        }
        0hq.A0I(2);
    }

    public final void A05(ViewGroup viewGroup) {
        0hm r1 = this.A01.A00;
        AnimatorSet animatorSet = this.A00;
        if (animatorSet == null) {
            r1.A02(this);
            return;
        }
        animatorSet.start();
        0hq.A0I(2);
    }

    public final void A06(ViewGroup viewGroup, 003 r13) {
        0hm r2 = this.A01.A00;
        AnimatorSet animatorSet = this.A00;
        if (animatorSet == null) {
            r2.A02(this);
        } else if (Build.VERSION.SDK_INT >= 34 && r2.A07.mTransitioning) {
            0hq.A0I(2);
            long totalDuration = animatorSet.getTotalDuration();
            long j = (long) (r13.A00 * ((float) totalDuration));
            if (j == 0) {
                j = 1;
            }
            if (j == totalDuration) {
                j = totalDuration - 1;
            }
            0hq.A0I(2);
            animatorSet.setCurrentPlayTime(j);
        }
    }

    public AnonymousClass0qp(0rK r1) {
        this.A01 = r1;
    }
}
