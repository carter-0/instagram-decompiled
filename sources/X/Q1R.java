package X;

import java.util.concurrent.LinkedBlockingQueue;

public final class Q1R {
    public static final Q1R A03 = new Q1R();
    public final LinkedBlockingQueue A00 = new LinkedBlockingQueue(200);
    public volatile boolean A01;
    public volatile boolean A02 = true;

    public final void A00(String str, String str2, String str3, String str4, Throwable th, Object... objArr) {
        Object[] objArr2 = objArr;
        0qQ.A0B(objArr, 6);
        if (!this.A01) {
            String str5 = str2;
            if (!str2.equals("player") || !this.A02) {
                String str6 = str;
                if (str.length() != 0 && str2.length() != 0) {
                    this.A00.offer(new S3E(str6, str5, str3, str4, th, objArr2));
                    if (SEU.A02.A00.get()) {
                        0qQ.A0F("scheduler");
                        throw AnonymousClass00P.createAndThrow();
                    }
                }
            }
        }
    }
}
