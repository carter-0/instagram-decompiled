package X;

import com.instagram.common.session.UserSession;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public final class T84 implements C13790Th5 {
    public final int A00;
    public final int A01;
    public final long A02;
    public final List A03 = new CopyOnWriteArrayList();
    public final AnonymousClass0eM A04;

    public T84(UserSession userSession, int i, int i2, long j) {
        0qQ.A0B(userSession, 1);
        this.A02 = j;
        this.A01 = i;
        this.A00 = i2;
        this.A04 = AnonymousClass0eN.A01(new C41562AwU(userSession, 43));
    }

    public final List E6m(Integer num) {
        0qQ.A0B(num, 0);
        if (num == AnonymousClass05K.A00) {
            return this.A03;
        }
        return 0sn.A00;
    }

    public final int CgU() {
        List list = this.A03;
        list.addAll((Collection) ((AnonymousClass40N) this.A04.getValue()).E6Y("reels_swipe_history", this.A01).A00);
        return list.size();
    }

    public final void FOA(long j, Integer num) {
        AnonymousClass1HI.A02.Eym(new C8802RAd(this, j));
    }
}
