package X;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.facebook.quicklog.QuickPerformanceLogger;
import java.util.concurrent.CountDownLatch;

public final class AL5 implements ServiceConnection {
    public final /* synthetic */ A7N A00;
    public final /* synthetic */ CountDownLatch A01;

    public AL5(A7N a7n, CountDownLatch countDownLatch) {
        this.A00 = a7n;
        this.A01 = countDownLatch;
    }

    public final void onBindingDied(ComponentName componentName) {
        A7N a7n = this.A00;
        a7n.A05 = false;
        this.A01.countDown();
        QuickPerformanceLogger quickPerformanceLogger = a7n.A01;
        quickPerformanceLogger.markerPoint(47654742, "binding_died");
        quickPerformanceLogger.markerEnd(47654742, 3);
    }

    public final void onNullBinding(ComponentName componentName) {
        A7N a7n = this.A00;
        a7n.A05 = true;
        this.A01.countDown();
        QuickPerformanceLogger quickPerformanceLogger = a7n.A01;
        quickPerformanceLogger.markerPoint(47654742, "service_connected");
        quickPerformanceLogger.markerEnd(47654742, 2);
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        A7N a7n = this.A00;
        a7n.A05 = true;
        this.A01.countDown();
        QuickPerformanceLogger quickPerformanceLogger = a7n.A01;
        quickPerformanceLogger.markerPoint(47654742, "service_connected");
        quickPerformanceLogger.markerEnd(47654742, 2);
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        A7N a7n = this.A00;
        a7n.A05 = false;
        this.A01.countDown();
        QuickPerformanceLogger quickPerformanceLogger = a7n.A01;
        quickPerformanceLogger.markerPoint(47654742, "service_disconnected");
        quickPerformanceLogger.markerEnd(47654742, 3);
    }
}
