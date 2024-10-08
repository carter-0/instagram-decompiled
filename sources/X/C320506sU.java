package X;

import java.util.UUID;
import java.util.concurrent.TimeUnit;

/* renamed from: X.6sU  reason: invalid class name and case insensitive filesystem */
public final class C320506sU implements C249763kK {
    public long A00 = (System.currentTimeMillis() / 1000);
    public String A01;
    public final AnonymousClass8ZN A02;

    public C320506sU(AnonymousClass8ZN r5, String str) {
        0qQ.A0B(str, 1);
        this.A01 = str;
        this.A02 = r5;
    }

    public final String getSessionId() {
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        if (currentTimeMillis - this.A00 > TimeUnit.MINUTES.toSeconds(30)) {
            this.A01 = UUID.randomUUID().toString();
        }
        this.A00 = currentTimeMillis;
        return this.A01;
    }
}
