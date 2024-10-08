package X;

import android.content.Context;
import android.util.LruCache;
import com.facebook.stash.core.Stash;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public final class ADE {
    public static ADE A08;
    public static final 1QU A09;
    public final Context A00;
    public final LruCache A01 = new LruCache(100);
    public final Stash A02 = 1L7.A01().A04(1887470792);
    public final C331927Sz A03 = new C331927Sz();
    public final Map A04 = AnonymousClass7TE.A1H();
    public final ExecutorService A05 = Executors.newSingleThreadExecutor();
    public final ExecutorService A06 = Executors.newSingleThreadExecutor();
    public final 0bY A07 = new 1Q7("IgSecureUriParser").A00;

    static {
        AnonymousClass1QT r1 = new AnonymousClass1QT();
        r1.A04 = 1CE.A06;
        r1.A03 = 1Fe.A03;
        A09 = r1.A00();
    }

    public ADE(Context context) {
        this.A00 = context;
    }
}
