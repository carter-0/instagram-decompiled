package X;

import android.animation.Animator;
import android.animation.ValueAnimator;
import com.instagram.android.R;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public final class Q3U {
    public static final long A00 = JTR.A0N(TimeUnit.SECONDS);
    public static final Q3U A01 = new Object();

    public static final long A00(Animator animator) {
        0qQ.A0B(animator, 0);
        if (animator instanceof Q4v) {
            Q4v q4v = (Q4v) animator;
            return (q4v.A04 * ((long) q4v.A00)) + A00(q4v.A05);
        } else if (animator instanceof C7300Q3a) {
            List<Animator> list = ((C7300Q3a) animator).A02;
            ArrayList A0r = AnonymousClass7TG.A0r(list);
            for (Animator A002 : list) {
                AnonymousClass7TE.A1Y(A0r, A00(A002));
            }
            return DbY.A04((Number) 00k.A04(A0r));
        } else if (animator instanceof Q3Q) {
            return ((ValueAnimator) animator).getCurrentPlayTime();
        } else {
            return 0;
        }
    }

    public static final Animator A01(C307786Rm r1, String str) {
        0qQ.A0B(str, 1);
        return (Animator) ((AbstractMap) r1.A00(R.id.bk_context_key_animations)).get(str);
    }

    public static final void A02(Animator animator, long j) {
        0qQ.A0B(animator, 0);
        animator.setStartDelay(animator.getStartDelay() + j);
    }

    public static final void A03(Animator animator, long j) {
        0qQ.A0B(animator, 0);
        long j2 = j;
        if (animator instanceof Q4v) {
            Q4v q4v = (Q4v) animator;
            long A06 = C229632nm.A06(j2, 0, q4v.getDuration());
            long j3 = q4v.A04;
            q4v.A00 = (int) (A06 / j3);
            A03(q4v.A05, A06 % j3);
        } else if (animator instanceof C7300Q3a) {
            for (Animator A03 : ((C7300Q3a) animator).A02) {
                A03(A03, j);
            }
        } else if (animator instanceof Q3Q) {
            ((ValueAnimator) animator).setCurrentPlayTime(j);
        }
    }

    public static final void A04(Animator animator, C307786Rm r2, C307896Rx r3, C277014uI r4) {
        0qQ.A0B(animator, 0);
        animator.addListener(new C7346Q4y(r2, r3, r4));
    }

    public final void A06(C307786Rm r14, String str, String str2, boolean z) {
        String str3 = str;
        0qQ.A0B(str, 1);
        Animator animator = (Animator) ((AbstractMap) r14.A00(R.id.bk_context_key_animations)).get(str);
        if (animator == null) {
            return;
        }
        if (animator.isStarted()) {
            animator.start();
            return;
        }
        C229392nJ r5 = r14.A02;
        C229612nk Abl = r5.AgE().Abl();
        animator.addListener(new Q3V(r14, Abl, str, z));
        animator.addPauseListener(new Q3W(Abl, str));
        animator.start();
        if (Abl != null) {
            Map map = Abl.A02;
            int size = map.size();
            Iterator A0v = AnonymousClass7TF.A0v(map);
            while (A0v.hasNext()) {
                Q3X q3x = (Q3X) A0v.next();
                int i = q3x.A02 + 1;
                q3x.A02 = i;
                q3x.A03 = Math.max(q3x.A03, i);
            }
            int i2 = Abl.A00;
            String str4 = str2;
            Q3X q3x2 = new Q3X(Abl.A01, str4, (String) r5.AMV().get(R.id.bk_context_key_analytics_module), str3, i2, C229612nk.A03.getAndIncrement(), size);
            map.put(str, q3x2);
            C307446Qd A02 = C307476Qg.A02(r14);
            if (!A02.A0N) {
                List list = A02.A0E;
                synchronized (list) {
                    list.add(q3x2);
                }
            }
            q3x2.A06 = true;
            q3x2.A09.markerStart(36713009, q3x2.A07);
        }
    }

    public static final void A05(Animator animator, C307786Rm r2, String str) {
        AnonymousClass7TG.A1O(animator, str);
        Animator animator2 = (Animator) ((AbstractMap) r2.A00(R.id.bk_context_key_animations)).put(str, animator);
        if (animator2 != null) {
            animator2.cancel();
            1Kn.A02("BloksAnimation", String.format("Found previously started animator with key %s. Canceling it.", new Object[]{str}));
        }
    }
}
