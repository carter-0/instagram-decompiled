package X;

import java.util.concurrent.ThreadFactory;

public final class TOO implements ThreadFactory {
    public final int A00;
    public final String A01;

    public TOO(String str, int i) {
        this.A00 = i;
        if (i != 0) {
            this.A01 = str;
        } else {
            this.A01 = str;
        }
    }

    public final Thread newThread(Runnable runnable) {
        Thread thread;
        int i = this.A00;
        String str = this.A01;
        if (i != 0) {
            return thread;
        }
        thread = new Thread(runnable, str);
        thread.setPriority(3);
        return thread;
    }
}
