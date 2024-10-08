package X;

import com.facebook.locationsharing.core.models.LiveLocationSharer;
import java.util.List;
import java.util.concurrent.Executor;

public final class WIM implements C327267Ac {
    public final C327267Ac A00;
    public final Executor A01;
    public final Executor A02;

    public final void BtW(C13920TlM tlM, String str) {
        this.A02.execute(new C20274WoP(tlM, this, str));
    }

    public final void FMc(C13919TlL tlL, LiveLocationSharer liveLocationSharer, String str) {
        this.A02.execute(new C20318WpD(tlL, this, liveLocationSharer, str));
    }

    public final void FMd(C13919TlL tlL, String str, List list) {
        this.A02.execute(new C20317WpC(tlL, this, str, list));
    }

    public WIM(C327267Ac r1, Executor executor, Executor executor2) {
        this.A00 = r1;
        this.A02 = executor;
        this.A01 = executor2;
    }
}
