package X;

import java.io.File;
import java.util.concurrent.CountDownLatch;

public final class RC3 extends File {
    public final CountDownLatch A00 = Pxf.A0y();
    public volatile boolean A01 = false;
    public volatile boolean A02 = false;

    public RC3(String str, boolean z) {
        super(str);
        this.A02 = z;
    }
}
