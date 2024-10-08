package X;

import android.content.Context;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

public final class UHJ extends C18973WFa {
    public static Thread A06;
    public static final BlockingQueue A07 = new ArrayBlockingQueue(10);
    public static final AtomicBoolean A08 = new AtomicBoolean();
    public static volatile C19866Wgt A09;
    public String A00;
    public String A01;
    public final int A02;
    public final C18585Vuc A03;
    public final AtomicLong A04 = new AtomicLong(0);
    public final AtomicLong A05 = new AtomicLong(0);

    public UHJ(Context context, C18585Vuc vuc, int i) {
        super(i);
        if (A08.compareAndSet(false, true)) {
            C18796W2e.A01(new UHE(context, this));
        }
        this.A00 = "";
        int i2 = AnonymousClass7TF.A0E(context).densityDpi;
        int i3 = 320;
        if (i2 <= 320) {
            i3 = C355538Qj.DEFAULT_SWIPE_ANIMATION_DURATION;
            if (i2 <= 250) {
                i3 = 72;
            }
        }
        this.A02 = i3;
        this.A03 = vuc;
    }
}
