package X;

import android.app.Application;
import android.content.Context;
import android.view.View;
import android.view.WindowManager;
import com.facebook.video.grootplayer.loggersdk.debug.SharedVideoLoggerWatchTimeDebugDialog$lifecycleCallbacks$1;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.SFd  reason: case insensitive filesystem */
public final class C11203SFd {
    public static final C11203SFd A07 = new C11203SFd();
    public Context A00;
    public View A01;
    public WindowManager A02;
    public HashMap A03;
    public HashMap A04;
    public final Application.ActivityLifecycleCallbacks A05 = new SharedVideoLoggerWatchTimeDebugDialog$lifecycleCallbacks$1(this);
    public final AtomicBoolean A06 = JTQ.A0k();
}
