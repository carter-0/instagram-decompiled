package X;

import com.instagram.business.fragment.OnboardingCheckListFragment;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.FsW  reason: case insensitive filesystem */
public final class C51338FsW implements Runnable {
    public final /* synthetic */ FXZ A00;
    public final /* synthetic */ C321856ur A01;

    public C51338FsW(FXZ fxz, C321856ur r2) {
        this.A00 = fxz;
        this.A01 = r2;
    }

    public final void run() {
        F3i f3i = ((OnboardingCheckListFragment) this.A00.A01).A04;
        Integer num = this.A01.A00;
        0qQ.A0B(num, 0);
        List list = f3i.A03;
        if (list != null) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                F3Q f3q = (F3Q) it.next();
                String str = f3q.A05;
                0qQ.A07(str);
                if (C48741EjQ.A00(str) == num) {
                    f3q.A03 = "complete";
                    break;
                }
            }
            f3i.A00();
        }
    }
}
