package X;

import java.net.InetAddress;

public final class H86 extends 0ng {
    public final /* synthetic */ AnonymousClass124 A00;
    public final /* synthetic */ String A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public H86(AnonymousClass124 r4, String str) {
        super(1498268459, 3, true, true);
        this.A00 = r4;
        this.A01 = str;
    }

    public final void run() {
        C60340gF r0;
        String str = this.A01;
        try {
            long nanoTime = System.nanoTime() - AnonymousClass49C.A00;
            InetAddress.getByName(str);
            AnonymousClass30M.A07(AnonymousClass49C.A01.A00(nanoTime));
            r0 = C60340gF.A00;
        } catch (Throwable th) {
            r0 = new 0eQ(th);
        }
        Throwable A002 = 0eR.A00(r0);
        if (A002 != null) {
            0KC.A0G("DnsInitializer", "dns check got error", A002);
        }
    }
}
