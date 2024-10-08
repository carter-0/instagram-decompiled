package X;

import java.util.concurrent.ThreadFactory;

public final /* synthetic */ class Y4C implements ThreadFactory {
    public final /* synthetic */ String A00;
    public final /* synthetic */ boolean A01;

    public /* synthetic */ Y4C(String str, boolean z) {
        this.A00 = str;
        this.A01 = z;
    }

    public final Thread newThread(Runnable runnable) {
        String str = this.A00;
        boolean z = this.A01;
        C22023Xt4 xt4 = SUS.A04;
        Thread thread = new Thread(runnable, str);
        thread.setDaemon(z);
        return thread;
    }
}
