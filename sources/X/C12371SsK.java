package X;

import android.media.MediaFormat;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: X.SsK  reason: case insensitive filesystem */
public final class C12371SsK implements C13726Tfw {
    public MediaFormat A00;
    public Q1A A01 = null;
    public ArrayList A02;
    public CountDownLatch A03 = new CountDownLatch(1);
    public LinkedBlockingQueue A04;
    public LinkedBlockingQueue A05 = new LinkedBlockingQueue();
    public LinkedBlockingQueue A06 = new LinkedBlockingQueue();
    public volatile boolean A07;
    public volatile boolean A08 = true;

    public final C13854TiZ ALq() {
        this.A04 = new LinkedBlockingQueue();
        return new C12367SsG(this);
    }

    public final C13859Tie ALy() {
        return new C12369SsI(this);
    }
}
