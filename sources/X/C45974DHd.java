package X;

import com.instagram.model.reels.Reel;
import com.instagram.user.model.User;
import java.util.Set;

/* renamed from: X.DHd  reason: case insensitive filesystem */
public final class C45974DHd implements C46203DQf {
    public final /* synthetic */ C239413Gj A00;
    public final /* synthetic */ Set A01;
    public final /* synthetic */ boolean A02;

    public C45974DHd(C239413Gj r1, Set set, boolean z) {
        this.A00 = r1;
        this.A02 = z;
        this.A01 = set;
    }

    public final void Cz6(Reel reel) {
        C239413Gj r4 = this.A00;
        boolean z = this.A02;
        Set set = this.A01;
        if (set.size() == 1) {
            C239413Gj.A03(reel, (User) set.iterator().next(), r4, "ig_live_co_broadcast_notification_type", z);
        }
    }
}
