package X;

import android.os.Process;
import com.facebook.systrace.Systrace;
import com.instagram.banyan.BanyanCoordinator;
import java.util.concurrent.Callable;

/* renamed from: X.5fz  reason: invalid class name and case insensitive filesystem */
public final class C290805fz implements Callable {
    public final /* synthetic */ C290645fe A00;
    public final /* synthetic */ boolean A01;

    public C290805fz(C290645fe r1, boolean z) {
        this.A01 = z;
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        BanyanCoordinator banyanCoordinator;
        if (!this.A01) {
            banyanCoordinator = this.A00.A00;
        } else {
            C290645fe r5 = this.A00;
            int threadPriority = Process.getThreadPriority(Process.myTid());
            if (0 >= threadPriority) {
                banyanCoordinator = r5.A00;
            } else {
                if (Systrace.A0E(1)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(AnonymousClass000.A00(125));
                    sb.append(0);
                    0fS.A01(sb.toString(), -354609198);
                }
                Process.setThreadPriority(0);
                try {
                    r5.A00.A0A();
                    Process.setThreadPriority(threadPriority);
                    if (Systrace.A0E(1)) {
                        0fS.A00(-96062548);
                    }
                    return C60340gF.A00;
                } catch (Throwable th) {
                    Process.setThreadPriority(threadPriority);
                    if (Systrace.A0E(1)) {
                        0fS.A00(-1377413530);
                    }
                    throw th;
                }
            }
        }
        banyanCoordinator.A0A();
        return C60340gF.A00;
    }
}
