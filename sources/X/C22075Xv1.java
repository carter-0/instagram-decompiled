package X;

import java.util.HashMap;
import java.util.Iterator;

/* renamed from: X.Xv1  reason: case insensitive filesystem */
public final class C22075Xv1 implements YB6 {
    public long A00 = -1;
    public final C11677Sea A01;
    public final HashMap A02 = AnonymousClass7TE.A1E();

    public C22075Xv1() {
        C11677Sea sea = new C11677Sea();
        002.A0g("bufferForPlaybackMs", " cannot be less than ", "0");
        002.A0g("bufferForPlaybackAfterRebufferMs", " cannot be less than ", "0");
        002.A0g("minBufferMs", " cannot be less than ", "bufferForPlaybackMs");
        002.A0g("minBufferMs", " cannot be less than ", "bufferForPlaybackAfterRebufferMs");
        002.A0g("maxBufferMs", " cannot be less than ", "minBufferMs");
        002.A0g("backBufferDurationMs", " cannot be less than ", "0");
        this.A01 = sea;
    }

    public static void A00(C22075Xv1 xv1) {
        HashMap hashMap = xv1.A02;
        boolean isEmpty = hashMap.isEmpty();
        C11677Sea sea = xv1.A01;
        if (isEmpty) {
            synchronized (sea) {
                sea.A00(0);
            }
            return;
        }
        Iterator A0t = AnonymousClass7TF.A0t(hashMap);
        int i = 0;
        while (A0t.hasNext()) {
            i += ((C21358XYl) A0t.next()).A00;
        }
        sea.A00(i);
    }
}
