package androidx.window.layout.adapter.extensions;

import X.02R;
import X.0qQ;
import X.C18526Vtc;
import X.C265674Vs;
import android.content.Context;
import androidx.window.extensions.core.util.function.Consumer;
import androidx.window.extensions.layout.WindowLayoutInfo;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;

public final class MulticastConsumer implements 02R, Consumer {
    public C265674Vs A00;
    public final Set A01 = new LinkedHashSet();
    public final ReentrantLock A02 = new ReentrantLock();
    public final Context A03;

    public void accept(WindowLayoutInfo windowLayoutInfo) {
        0qQ.A0B(windowLayoutInfo, 0);
        ReentrantLock reentrantLock = this.A02;
        reentrantLock.lock();
        try {
            C265674Vs A002 = C18526Vtc.A00.A00(this.A03, windowLayoutInfo);
            this.A00 = A002;
            for (02R accept : this.A01) {
                accept.accept(A002);
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void A00(02R r3) {
        ReentrantLock reentrantLock = this.A02;
        reentrantLock.lock();
        try {
            C265674Vs r0 = this.A00;
            if (r0 != null) {
                r3.accept(r0);
            }
            this.A01.add(r3);
        } finally {
            reentrantLock.unlock();
        }
    }

    public MulticastConsumer(Context context) {
        this.A03 = context;
    }
}
