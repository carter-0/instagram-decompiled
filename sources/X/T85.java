package X;

import com.instagram.common.session.UserSession;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public final class T85 implements C13790Th5 {
    public final int A00;
    public final long A01;
    public final List A02 = new CopyOnWriteArrayList();
    public final List A03 = new CopyOnWriteArrayList();
    public final AnonymousClass0eM A04;
    public final int A05;

    public T85(UserSession userSession, int i, int i2, long j) {
        0qQ.A0B(userSession, 1);
        this.A01 = j;
        this.A05 = i;
        this.A00 = i2;
        this.A04 = AnonymousClass0eN.A01(new C41562AwU(userSession, 42));
    }

    public final List E6m(Integer num) {
        0qQ.A0B(num, 0);
        if (num == AnonymousClass05K.A00) {
            return this.A02;
        }
        return this.A03;
    }

    public final void FOA(long j, Integer num) {
        0qQ.A0B(num, 0);
        AnonymousClass1HI.A02.Eym(new C8803RAe(this, num, j));
    }

    public final int CgU() {
        List list = this.A02;
        AnonymousClass0eM r4 = this.A04;
        int i = this.A05;
        list.addAll((Collection) ((AnonymousClass40N) r4.getValue()).E6Y("iab_reel_swipes", i).A00);
        List list2 = this.A03;
        list2.addAll((Collection) ((AnonymousClass40N) r4.getValue()).E6Y("profile_reel_swipes", i).A00);
        return list.size() + list2.size();
    }
}
