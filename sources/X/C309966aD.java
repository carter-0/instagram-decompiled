package X;

import android.content.Intent;
import com.instagram.model.reels.Reel;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.6aD  reason: invalid class name and case insensitive filesystem */
public final class C309966aD implements AnonymousClass6Z1 {
    public final List A00 = new CopyOnWriteArrayList();

    public final void A00(AnonymousClass6Z1 r3) {
        0qQ.A0B(r3, 0);
        List list = this.A00;
        if (!list.contains(r3)) {
            list.add(r3);
        }
    }

    public final void D7Q(C255773uh r3, C250973mM r4, C316026kz r5, C309426Yf r6) {
        0qQ.A0B(r5, 0);
        0qQ.A0B(r3, 1);
        0qQ.A0B(r6, 2);
        0qQ.A0B(r4, 3);
        for (AnonymousClass6Z1 D7Q : this.A00) {
            D7Q.D7Q(r3, r4, r5, r6);
        }
    }

    public final void DLs(Reel reel) {
        0qQ.A0B(reel, 0);
        for (AnonymousClass6Z1 DLs : this.A00) {
            DLs.DLs(reel);
        }
    }

    public final void DWT(String str) {
        0qQ.A0B(str, 0);
        for (AnonymousClass6Z1 DWT : this.A00) {
            DWT.DWT(str);
        }
    }

    public final void DyN(C255773uh r3, C316036l0 r4) {
        0qQ.A0B(r3, 0);
        0qQ.A0B(r4, 1);
        for (AnonymousClass6Z1 DyN : this.A00) {
            DyN.DyN(r3, r4);
        }
    }

    public final boolean BVb() {
        List<AnonymousClass6Z1> list = this.A00;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            for (AnonymousClass6Z1 BVb : list) {
                if (BVb.BVb()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int BrB() {
        Object obj;
        Iterator it = this.A00.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((AnonymousClass6Z1) obj).BrB() > 0) {
                break;
            }
        }
        AnonymousClass6Z1 r1 = (AnonymousClass6Z1) obj;
        if (r1 != null) {
            return r1.BrB();
        }
        return 0;
    }

    public final boolean Bu3() {
        boolean z = false;
        for (AnonymousClass6Z1 Bu3 : this.A00) {
            z |= Bu3.Bu3();
        }
        return z;
    }

    public final boolean Cau() {
        List<AnonymousClass6Z1> list = this.A00;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            for (AnonymousClass6Z1 Cau : list) {
                if (Cau.Cau()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void DMq(int i) {
        for (AnonymousClass6Z1 DMq : this.A00) {
            DMq.DMq(i);
        }
    }

    public final void DNx() {
        for (AnonymousClass6Z1 DNx : this.A00) {
            DNx.DNx();
        }
    }

    public final void DNy() {
        for (AnonymousClass6Z1 DNy : this.A00) {
            DNy.DNy();
        }
    }

    public final void DVL() {
        for (AnonymousClass6Z1 DVL : this.A00) {
            DVL.DVL();
        }
    }

    public final void Dfe() {
        for (AnonymousClass6Z1 Dfe : this.A00) {
            Dfe.Dfe();
        }
    }

    public final void DiL(int i) {
        for (AnonymousClass6Z1 DiL : this.A00) {
            DiL.DiL(i);
        }
    }

    public final void DiM(int i, int i2) {
        for (AnonymousClass6Z1 DiM : this.A00) {
            DiM.DiM(i, i2);
        }
    }

    public final void DiO(int i, int i2) {
        for (AnonymousClass6Z1 DiO : this.A00) {
            DiO.DiO(i, i2);
        }
    }

    public final void DiP() {
        for (AnonymousClass6Z1 DiP : this.A00) {
            DiP.DiP();
        }
    }

    public final boolean Dpr() {
        boolean z = false;
        for (AnonymousClass6Z1 Dpr : this.A00) {
            z |= Dpr.Dpr();
        }
        return z;
    }

    public final boolean Dq0() {
        boolean z = false;
        for (AnonymousClass6Z1 Dq0 : this.A00) {
            z |= Dq0.Dq0();
        }
        return z;
    }

    public final boolean Dqd() {
        boolean z = false;
        for (AnonymousClass6Z1 Dqd : this.A00) {
            z |= Dqd.Dqd();
        }
        return z;
    }

    public final void DxL() {
        for (AnonymousClass6Z1 DxL : this.A00) {
            DxL.DxL();
        }
    }

    public final void DxN() {
        for (AnonymousClass6Z1 DxN : this.A00) {
            DxN.DxN();
        }
    }

    public final void DxU() {
        for (AnonymousClass6Z1 DxU : this.A00) {
            DxU.DxU();
        }
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        for (AnonymousClass6Z1 onActivityResult : this.A00) {
            onActivityResult.onActivityResult(i, i2, intent);
        }
    }

    public final void onDestroy() {
        for (AnonymousClass6Z1 onDestroy : this.A00) {
            onDestroy.onDestroy();
        }
    }

    public final void onDestroyView() {
        for (AnonymousClass6Z1 onDestroyView : this.A00) {
            onDestroyView.onDestroyView();
        }
    }
}
