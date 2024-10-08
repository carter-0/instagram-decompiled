package X;

import com.instagram.common.session.UserSession;
import java.util.Map;
import java.util.Random;

/* renamed from: X.OZu  reason: case insensitive filesystem */
public final class C71033OZu {
    public final 02m A00 = 02m.A0p;
    public final Map A01 = AnonymousClass7TE.A1H();
    public final Random A02 = new Random();

    public C71033OZu(UserSession userSession) {
        0qQ.A0B(userSession, 1);
    }

    public final void A02(String str, String str2) {
        0qQ.A0B(str, 0);
        if (A01(this, str)) {
            this.A00.markerPoint(724174487, A00(this, str), str2);
        }
    }

    public final void A03(String str, String str2, String str3) {
        0qQ.A0B(str, 0);
        if (A01(this, str)) {
            this.A00.markerAnnotate(724174487, A00(this, str), str2, str3);
        }
    }

    public final void A04(String str, short s) {
        0qQ.A0B(str, 0);
        if (A01(this, str)) {
            this.A00.markerEnd(724174487, A00(this, str), s);
        }
    }

    public static final int A00(C71033OZu oZu, String str) {
        Map map = oZu.A01;
        Object obj = map.get(str);
        if (obj == null) {
            obj = Integer.valueOf(oZu.A02.nextInt());
            map.put(str, obj);
        }
        return AnonymousClass7TE.A0M(obj);
    }

    public static final boolean A01(C71033OZu oZu, String str) {
        return oZu.A00.isMarkerOn(724174487, A00(oZu, str));
    }

    public final void A05(String str, Integer[] numArr) {
        0qQ.A0B(numArr, 2);
        if (A01(this, str)) {
            02m r6 = this.A00;
            int A002 = A00(this, str);
            int length = numArr.length;
            int[] iArr = new int[length];
            for (int i = 0; i < length; i++) {
                iArr[i] = numArr[i].intValue();
            }
            r6.markerAnnotate(724174487, A002, "thread_fetch_failure_extra_error_codes", iArr);
        }
    }
}
