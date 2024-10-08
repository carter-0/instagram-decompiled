package X;

import com.facebook.mqtt.service.XplatServiceDelegate;

/* renamed from: X.TBs  reason: case insensitive filesystem */
public final class C12878TBs implements Runnable {
    public final /* synthetic */ XplatServiceDelegate A00;

    public C12878TBs(XplatServiceDelegate xplatServiceDelegate) {
        this.A00 = xplatServiceDelegate;
    }

    public final void run() {
        synchronized (XplatServiceDelegate.A04) {
            XplatServiceDelegate.A02.A01();
            XplatServiceDelegate.A03.A00();
        }
    }
}
