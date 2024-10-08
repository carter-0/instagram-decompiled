package X;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import com.facebook.quicklog.QuickPerformanceLogger;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.4ux  reason: invalid class name and case insensitive filesystem */
public final class C277344ux {
    public int A00;
    public Choreographer A01;
    public boolean A02;
    public final Context A03;
    public final Handler A04;
    public final QuickPerformanceLogger A05;
    public final C277334uw A06;
    public final Set A07 = new HashSet();

    public C277344ux(Context context, QuickPerformanceLogger quickPerformanceLogger, C277334uw r5) {
        0qQ.A0B(context, 1);
        0qQ.A0B(quickPerformanceLogger, 2);
        Handler handler = new Handler(Looper.getMainLooper());
        this.A03 = context;
        this.A04 = handler;
        this.A05 = quickPerformanceLogger;
        this.A06 = r5;
        Choreographer instance = Choreographer.getInstance();
        0qQ.A07(instance);
        this.A01 = instance;
    }
}
