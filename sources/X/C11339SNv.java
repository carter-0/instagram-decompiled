package X;

import android.os.Handler;
import com.facebook.proxygen.LigerSamplePolicy;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.SNv  reason: case insensitive filesystem */
public final class C11339SNv {
    public static Handler A00;
    public static C376609Iq A01;
    public static final C11339SNv A02 = new Object();
    public static final ConcurrentHashMap A03 = new ConcurrentHashMap();
    public static final ConcurrentLinkedQueue A04 = new ConcurrentLinkedQueue();
    public static final AtomicLong A05 = Pxe.A1D(0);
    public static final AtomicLong A06 = Pxe.A1D(0);
    public static final AtomicLong A07 = Pxe.A1D(0);
    public static final AtomicLong A08 = Pxe.A1D(0);
    public static final AtomicLong A09 = Pxe.A1D(0);

    public static final void A00() {
        String str;
        boolean z;
        Number number;
        PzN pzN = (PzN) A04.peek();
        long j = LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT;
        if (pzN != null) {
            long currentTimeMillis = System.currentTimeMillis();
            C376609Iq r0 = A01;
            if (r0 == null) {
                str = "config";
                0qQ.A0F(str);
                throw AnonymousClass00P.createAndThrow();
            }
            long j2 = currentTimeMillis - r0.A01;
            if (pzN instanceof C7846QbU) {
                z = true;
            } else {
                z = pzN instanceof PzP;
            }
            long j3 = 0;
            if (z) {
                Object obj = pzN.A03.get("timestamp");
                if ((obj instanceof Long) && (number = (Number) obj) != null) {
                    j3 = number.longValue();
                }
            }
            long j4 = j3 - j2;
            if (j4 > LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT) {
                j = j4;
            }
        }
        Handler handler = A00;
        if (handler == null) {
            str = "backgroundHandler";
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
        handler.postDelayed(C13087TKu.A00, j);
    }

    public final void A01(C376609Iq r11) {
        List A0x;
        A01 = r11;
        A00 = Pxg.A0N(Pxf.A0J("RelLithoDebugEventStore", 10));
        C376609Iq r1 = A01;
        if (r1 == null) {
            0qQ.A0F("config");
            throw AnonymousClass00P.createAndThrow();
        }
        String str = r1.A04;
        if (str.length() == 0) {
            A0x = 0sr.A1P(new String[]{"Litho.Resolve.ComponentRendered", "Litho.ComponentTree.Resolve", "Litho.TreeFuture.Interrupt", "Litho.TreeFuture.Resume", "Litho.TreeFuture.Run", "Litho.TreeFuture.Wait", "Litho.TreeFuture.Get", "Litho.TreeFuture.GetPartial"});
        } else {
            A0x = DbX.A0x(str);
        }
        String[] A1b = DbU.A1b(A0x, 0);
        2SN.A00.add(new C7847QbV(Arrays.copyOf(A1b, A1b.length)));
    }
}
