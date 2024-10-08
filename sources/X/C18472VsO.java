package X;

import com.instagram.direct.stella.StellaIpcDirectMessagingServiceClient;

/* renamed from: X.VsO  reason: case insensitive filesystem */
public final class C18472VsO {
    public Object A00;
    public final C17978VjG A01;
    public final Runnable A02 = new C19963Wia(this);
    public final /* synthetic */ C17823Vgc A03;

    public static synchronized void A00(C18472VsO vsO) {
        long j;
        synchronized (vsO) {
            C17823Vgc vgc = vsO.A03;
            AnonymousClass507 r8 = vgc.A02;
            if (r8.A06 != null) {
                long j2 = vgc.A00;
                if (j2 == Long.MIN_VALUE) {
                    if (r8.A05.size() > 10) {
                        j = StellaIpcDirectMessagingServiceClient.KEEP_CONNECTION_ALIVE_MS;
                    } else {
                        j = 0;
                    }
                    vgc.A00 = (j - (((long) vsO.A01.A00) * 1000)) + r8.A03.A01.now();
                } else {
                    j = (j2 + (((long) vsO.A01.A00) * 1000)) - r8.A03.A01.now();
                }
                C271464it r3 = r8.A04;
                Runnable runnable = vsO.A02;
                r3.A01(runnable, Math.max(0, j));
                vsO.A00 = runnable;
            }
        }
    }

    public C18472VsO(C17823Vgc vgc, C17978VjG vjG) {
        this.A03 = vgc;
        this.A01 = vjG;
        A00(this);
    }
}
