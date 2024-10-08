package X;

import android.util.LruCache;
import com.instagram.fanclub.api.FanClubApi;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;

/* renamed from: X.6x6  reason: invalid class name and case insensitive filesystem */
public final class C323196x6 implements AnonymousClass0lh {
    public static final long A04 = TimeUnit.SECONDS.toMillis(60);
    public final LruCache A00 = new LruCache(50);
    public final FanClubApi A01;
    public final Set A02 = new LinkedHashSet();
    public final C262224Cq A03;

    public C323196x6(AnonymousClass12V r3, FanClubApi fanClubApi) {
        0qQ.A0B(r3, 2);
        this.A01 = fanClubApi;
        this.A03 = 19E.A02(((AnonymousClass12U) r3).A04);
    }

    public final void onSessionWillEnd() {
        this.A00.evictAll();
        19E.A05((CancellationException) null, this.A03);
    }
}
