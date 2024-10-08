package X;

import android.os.SystemClock;
import java.util.List;

/* renamed from: X.7lU  reason: invalid class name and case insensitive filesystem */
public abstract class C340577lU {
    public static int A00;
    public static final C3496981j A01 = new C3496981j();

    public static void A01(String str, String str2) {
        A00(0, 0, 002.A0g(str, ": ", str2));
    }

    public static void A02(String str, String str2) {
        A00(3, 0, 002.A0g(str, ": ", str2));
    }

    public static void A03(String str, String str2) {
        A00(2, 0, 002.A0g(str, ": ", str2));
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [java.lang.Object, X.7o1] */
    public static void A00(int i, int i2, Object obj) {
        C342087o1 r5;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        List list = A01.A00;
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            C340557lS r12 = (C340557lS) list.get(i3);
            C341397mo r3 = (C341397mo) r12;
            C340227ku r7 = r3.A02;
            C342077o0 r0 = r3.A00;
            if (r0 == null) {
                r0 = new C342077o0(r3);
                r3.A00 = r0;
            }
            long now = r0.A00.now();
            int i4 = A00;
            synchronized (C342087o1.A08) {
                C342087o1 r52 = C342087o1.A07;
                if (r52 != null) {
                    C342087o1.A07 = r52.A00;
                    r52.A00 = null;
                    C342087o1.A06--;
                    r5 = r52;
                } else {
                    ? obj2 = new Object();
                    obj2.A00 = null;
                    r5 = obj2;
                }
                r5.A04 = r12;
                r5.A05 = obj;
                r5.A02 = elapsedRealtime;
                r5.A03 = now;
                r5.A01 = i4;
            }
            r7.obtainMessage(i, i2, 0, r5).sendToTarget();
        }
    }
}
