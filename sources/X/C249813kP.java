package X;

import android.os.SystemClock;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: X.3kP  reason: invalid class name and case insensitive filesystem */
public class C249813kP {
    public static C249813kP A00 = new Object();

    public void A07(String str, String str2) {
    }

    public final void A01(int i, String str) {
        if (this instanceof C249823kQ) {
            C249823kQ r2 = (C249823kQ) this;
            0qQ.A0B(str, 1);
            C249823kQ.A00(r2, new C377619Mn(str, r2, 8), i);
        }
    }

    public final void A02(int i, String str, int i2) {
        if (this instanceof C249823kQ) {
            C249823kQ r2 = (C249823kQ) this;
            C249823kQ.A00(r2, new C377639Mp(r2, str, i2, 1), i);
        }
    }

    public final void A03(int i, String str, String str2) {
        if (this instanceof C249823kQ) {
            C249823kQ r2 = (C249823kQ) this;
            0qQ.A0B(str, 1);
            C249823kQ.A00(r2, new AnonymousClass9N5(r2, str, str2, 2), i);
        }
    }

    public final void A04(String str, String str2, int i) {
        if (this instanceof C249823kQ) {
            0qQ.A0B(str2, 1);
            AnonymousClass2UU.A00(new C283665Is(str, Integer.valueOf(i), str2));
        }
    }

    public final void A05(String str, String str2, String str3) {
        if (this instanceof C249823kQ) {
            0qQ.A0B(str, 0);
            0qQ.A0B(str2, 1);
            AnonymousClass2UU.A00(new C283665Is(str, str3, str2));
        }
    }

    public final void A06(String str, String str2, boolean z) {
        long j;
        if (this instanceof C249823kQ) {
            C249823kQ r1 = (C249823kQ) this;
            String str3 = str;
            0qQ.A0B(str, 0);
            if (1Jk.A07) {
                2UQ r5 = r1.A01;
                boolean z2 = r1.A00.A0E;
                1Jm A01 = 1Jk.A01();
                if (z2) {
                    j = A01.A00;
                } else {
                    j = A01.A00;
                }
                0eP r4 = new 0eP(str, Long.valueOf(j));
                ReentrantLock reentrantLock = r5.A02;
                reentrantLock.lock();
                try {
                    Map map = r5.A00;
                    if (map.get(r4) == null) {
                        if (z || r5.A01.add(str)) {
                            map.put(r4, new C338617iF(str3, str2, C338637iH.A00(str, j, true), j, SystemClock.uptimeMillis()));
                            reentrantLock.unlock();
                            C262224Cq r3 = r5.A03;
                            AnonymousClass9K1 r2 = new AnonymousClass9K1((Object) r4, (Object) r5, (AnonymousClass4D7) null, 34);
                            1Eo.A03(AnonymousClass05K.A00, 19B.A00, r2, r3);
                        }
                    }
                } finally {
                    reentrantLock.unlock();
                }
            }
        }
    }
}
