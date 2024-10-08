package X;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.os.Handler;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.I5d  reason: case insensitive filesystem */
public final class C56625I5d {
    public int A00;
    public int A01;
    public C57465Ib9 A02;
    public boolean A03;
    public final Handler A04 = AnonymousClass7TF.A0D();
    public final Runnable A05;
    public final Runnable A06;
    public final Runnable A07;
    public final List A08 = AnonymousClass7TE.A1C();
    public final long A09;
    public final long A0A;
    public final Context A0B;
    public final AnonymousClass0iw A0C;
    public final UserSession A0D;

    public C56625I5d(Context context, AnonymousClass0iw r8, UserSession userSession) {
        long j;
        this.A0B = context;
        this.A0D = userSession;
        this.A0C = r8;
        0Tu r5 = 0Tu.A06;
        this.A09 = AnonymousClass1GB.A02(182.A00(r5, userSession, 37163664818241831L) * 1000.0d);
        if (182.A06(r5, userSession, 2342162249104825410L)) {
            j = 100;
        } else {
            j = 900;
        }
        this.A0A = j;
        this.A06 = new C57766Ig7(this);
        this.A07 = new C57767Ig8(this);
        this.A05 = new C57765Ig6(this);
        this.A03 = true;
    }

    public static final void A00(C56625I5d i5d) {
        C57610Idb idb;
        for (C57465Ib9 ib9 : i5d.A08) {
            C57466IbA ibA = ib9.A00;
            if (ibA != null) {
                C14044Tol tol = ibA.A00;
                if (tol != null) {
                    tol.A05(0, false);
                }
            } else {
                JQR jqr = ib9.A08;
                if ((jqr instanceof C57610Idb) && (idb = (C57610Idb) jqr) != null) {
                    C55975Hqg hqg = idb.A00;
                    if (hqg == null) {
                        0qQ.A0F("photoDelegate");
                        throw AnonymousClass00P.createAndThrow();
                    }
                    UserSession userSession = hqg.A03;
                    if (182.A06(C51968G9o.A0b(userSession), userSession, 36319239888051235L)) {
                        Animator animator = hqg.A00;
                        if (animator != null) {
                            animator.end();
                        }
                        AnimatorSet animatorSet = new AnimatorSet();
                        animatorSet.playTogether(hqg.A00(1.0f, 100));
                        animatorSet.start();
                        hqg.A00 = animatorSet;
                    }
                }
            }
        }
        i5d.A04.postDelayed(i5d.A07, 150);
    }

    public static final void A01(C56625I5d i5d) {
        Handler handler;
        Runnable runnable;
        long j;
        C14044Tol tol;
        C57465Ib9 ib9 = i5d.A02;
        if (ib9 != null) {
            C57466IbA ibA = ib9.A00;
            if (!(ibA == null || (tol = ibA.A00) == null)) {
                tol.A0A("paused_for_replay");
            }
            int i = i5d.A00 + 1;
            i5d.A00 = i;
            List list = i5d.A08;
            if (i < list.size()) {
                C57465Ib9 ib92 = (C57465Ib9) 00k.A0O(list, i5d.A00);
                i5d.A02 = ib92;
                if (ib92 != null) {
                    ib92.A01();
                }
                handler = i5d.A04;
                runnable = i5d.A06;
                j = i5d.A09;
            } else {
                i5d.A00 = 0;
                handler = i5d.A04;
                runnable = i5d.A05;
                j = i5d.A0A;
            }
            handler.postDelayed(runnable, j);
        }
    }

    public static final void A02(C56625I5d i5d) {
        if (i5d.A03) {
            i5d.A00 = 0;
            C57465Ib9 ib9 = (C57465Ib9) 00k.A0O(i5d.A08, 0);
            i5d.A02 = ib9;
            if (ib9 != null) {
                ib9.A01();
            }
            i5d.A04.postDelayed(i5d.A06, i5d.A09);
            return;
        }
        A01(i5d);
        i5d.A03 = true;
    }

    public final void A03() {
        Handler handler = this.A04;
        handler.removeCallbacks(this.A06);
        handler.removeCallbacks(this.A07);
        handler.removeCallbacks(this.A05);
        List<C57465Ib9> list = this.A08;
        for (C57465Ib9 A002 : list) {
            A002.A00();
        }
        list.clear();
        this.A01 = 0;
    }
}
