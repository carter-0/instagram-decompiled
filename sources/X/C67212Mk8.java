package X;

import com.facebook.common.time.AwakeTimeSinceBootClock;
import java.util.concurrent.TimeUnit;

/* renamed from: X.Mk8  reason: case insensitive filesystem */
public final class C67212Mk8 {
    public int A00;
    public long A01 = -1;
    public 0yf A02 = new 01r(0);
    public 0yf A03 = new 01r(0);
    public 0yf A04 = new 01r(0);
    public 0yf A05 = new 01r(0);
    public 0yf A06 = new 01r(0);
    public 0yf A07 = new 01r(0);
    public 0yf A08 = new 01r(0);
    public 0yf A09 = new 01r(0);
    public 0yf A0A = new 01r(0);
    public 0yf A0B = new 01r(0);
    public 04u A0C = new 04u(0);
    public AnonymousClass0JR A0D = AwakeTimeSinceBootClock.INSTANCE;
    public C67213Mk9 A0E;
    public String A0F;

    /* JADX WARNING: type inference failed for: r1v6, types: [java.lang.Object, X.OHD] */
    public static void A00(C67212Mk8 mk8, Long l, Object obj, String str) {
        0yf r4 = mk8.A05;
        Number number = (Number) r4.get(str);
        if (number != null) {
            long longValue = l.longValue() - number.longValue();
            r4.remove(str);
            if (mk8.A00 == 0) {
                mk8.A06.put(str, obj);
                0yf r1 = mk8.A09;
                if (r1.get(str) != null) {
                    r1.get(str);
                }
                0yf r12 = mk8.A07;
                if (r12.get(str) != null) {
                    r12.get(str);
                }
                if (longValue >= 0) {
                    mk8.A0F.getClass();
                    obj.getClass();
                    boolean contains = mk8.A0C.contains(str);
                    if (mk8.A01 != -1) {
                        TimeUnit.MILLISECONDS.toMillis(mk8.A0D.now() - mk8.A01);
                    }
                    ? obj2 = new Object();
                    obj2.A04 = longValue;
                    obj2.A03 = longValue;
                    obj2.A01 = longValue;
                    obj2.A02 = longValue;
                    obj2.A00 = 1;
                    obj2.A06 = contains;
                    obj2.A05 = obj;
                    mk8.A0E.A00.Cit(obj2, contains);
                    return;
                }
                return;
            }
            long j = longValue;
            0yf r42 = mk8.A08;
            Number number2 = (Number) r42.get(str);
            if (number2 != null) {
                j = Math.max(number2.longValue(), longValue);
            }
            r42.put(str, Long.valueOf(j));
            long j2 = longValue;
            0yf r43 = mk8.A0B;
            Number number3 = (Number) r43.get(str);
            if (number3 != null) {
                j2 = longValue + number3.longValue();
            }
            r43.put(str, Long.valueOf(j2));
            0yf r13 = mk8.A03;
            if (!r13.containsKey(str)) {
                r13.put(str, Long.valueOf(longValue));
            }
            mk8.A04.put(str, Long.valueOf(longValue));
            long j3 = -1;
            if (mk8.A01 != -1) {
                j3 = TimeUnit.MILLISECONDS.toMillis(mk8.A0D.now() - mk8.A01);
            }
            mk8.A0A.put(str, Long.valueOf(j3));
            if (mk8.A00 == 1) {
                mk8.A06.put(str, obj);
            }
        }
    }
}
