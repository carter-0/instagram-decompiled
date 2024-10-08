package X;

import com.instagram.android.R;
import java.lang.ref.WeakReference;
import java.util.AbstractMap;

/* renamed from: X.Fpy  reason: case insensitive filesystem */
public final class C51188Fpy implements Runnable {
    public final /* synthetic */ C49699F2k A00;

    public C51188Fpy(C49699F2k f2k) {
        this.A00 = f2k;
    }

    public final void run() {
        C49699F2k f2k = this.A00;
        C49576Eyl eyl = f2k.A04;
        WeakReference weakReference = eyl.A03;
        Object obj = weakReference.get();
        if (obj != null) {
            C277014uI r2 = eyl.A01;
            C308276Tl A0P = DbS.A0P();
            A0P.A01(eyl.A02);
            C299275ur.A00(eyl.A00, DbT.A0V(A0P, obj), r2);
        }
        if (!f2k.A06) {
            C307786Rm r22 = (C307786Rm) weakReference.get();
            if (r22 != null) {
                ((AbstractMap) r22.A00(R.id.bk_context_key_timers)).remove(eyl.A02);
            }
        } else if (!f2k.A00 && !f2k.A01) {
            f2k.A03.postDelayed(this, f2k.A02);
        }
    }
}
