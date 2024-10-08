package X;

import java.util.concurrent.ThreadFactory;

public final class TOJ implements ThreadFactory {
    public final int A00;

    public TOJ(int i) {
        this.A00 = i;
    }

    public final Thread newThread(Runnable runnable) {
        String str;
        switch (this.A00) {
            case 0:
                return new Thread(new TFG(this, runnable), "glide-active-resources");
            case 1:
                str = "com.facebook.papaya.scheduling_thread";
                break;
            default:
                str = "com.facebook.papaya.random_thread";
                break;
        }
        return new Thread(runnable, str);
    }
}
