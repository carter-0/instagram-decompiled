package X;

import com.facebook.react.modules.appstate.AppStateModule;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: X.XaW  reason: case insensitive filesystem */
public final class C21421XaW {
    public static C21421XaW A03;
    public final 0Bf A00;
    public final 0Bf A01;
    public final 0Bg A02;

    public C21421XaW(0lg r13) {
        0Bf r0;
        ScheduledExecutorService newSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
        0Tu r2 = 0Tu.A05;
        this.A01 = new 0Bf("foreground", 182.A01(r2, r13, 36592876549243626L), 182.A01(r2, r13, 36592876548915941L), 182.A01(r2, r13, 36592876548981478L));
        this.A00 = new 0Bf(AppStateModule.APP_STATE_BACKGROUND, 182.A01(r2, r13, 36592876548850404L), 182.A01(r2, r13, 36592876549178089L), 182.A01(r2, r13, 36592876549047015L));
        0Bg r1 = new 0Bg(new C22144Xw8(newSingleThreadScheduledExecutor, 182.A01(r2, r13, 36592876549112552L) * 1000), newSingleThreadScheduledExecutor);
        this.A02 = r1;
        if (14i.A08()) {
            r0 = this.A00;
        } else {
            r0 = this.A01;
        }
        r1.A00(r0);
    }
}
