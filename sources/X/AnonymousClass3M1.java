package X;

import android.app.Activity;
import android.graphics.Rect;
import android.os.IBinder;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;

/* renamed from: X.3M1  reason: invalid class name */
public final class AnonymousClass3M1 implements Runnable {
    public final /* synthetic */ 2MD A00;

    public final synchronized void run() {
        View findViewById;
        2MD r5 = this.A00;
        if (!r5.A07.isEmpty() && r5.A01 != null) {
            synchronized (r5) {
                Activity A002 = 2MD.A00(r5);
                if (A002 != null && (findViewById = A002.findViewById(16908290)) != null && findViewById.getWindowToken() != null) {
                    IBinder windowToken = findViewById.getWindowToken();
                    windowToken.getClass();
                    Rect rect = new Rect();
                    Window window = A002.getWindow();
                    17k.A07(window, "rootActivity.getWindow() is null");
                    window.getDecorView().getWindowVisibleDisplayFrame(rect);
                    FrameLayout frameLayout = r5.A01;
                    r5.A00 = frameLayout;
                    r5.A01 = null;
                    2MD.A03(windowToken, frameLayout, r5, rect.top);
                    r5.A04.postDelayed(r5.A06, 4000);
                }
            }
        }
    }

    public AnonymousClass3M1(2MD r1) {
        this.A00 = r1;
    }
}
