package X;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.DelayQueue;

public final class VQX {
    public final BlockingQueue A00 = new DelayQueue();
    public final C20562Wud[] A01;

    public VQX(int i) {
        this.A01 = new C20562Wud[i];
        int i2 = 0;
        while (true) {
            C20562Wud[] wudArr = this.A01;
            if (i2 < wudArr.length) {
                wudArr[i2] = new C20562Wud(this);
                this.A01[i2].setName(002.A0O("GCD-Thread #", i2));
                this.A01[i2].start();
                i2++;
            } else {
                return;
            }
        }
    }
}
