package X;

import android.net.Uri;
import java.util.List;

/* renamed from: X.GtW  reason: case insensitive filesystem */
public final class C53741GtW extends C251343mx {
    public final int A00 = 2;
    public final 2WX A01;
    public final C57540IcS A02;
    public final List A03;

    public C53741GtW(2WX r2, C57540IcS icS, List list) {
        C51972G9s.A1B(list, r2);
        this.A03 = list;
        this.A02 = icS;
        this.A01 = r2;
    }

    public final C251263mp A0X(AnonymousClass3Y5 r23) {
        double d;
        double d2;
        int i = 0;
        AnonymousClass3Y5 r21 = r23;
        AnonymousClass3Y5 r0 = r21;
        0qQ.A0B(r0, 0);
        C56121Ht9 ht9 = (C56121Ht9) I3I.A02(r0, this.A02);
        int i2 = ht9.A01;
        int i3 = ht9.A00;
        int i4 = ht9.A02;
        int i5 = this.A00;
        List list = this.A03;
        int min = Math.min(i5, list.size());
        int i6 = min - 1;
        long A07 = C51965G9l.A07((i3 * i6) + i2);
        long A072 = C51965G9l.A07(i2 + (i4 * i6));
        2WX r6 = this.A01;
        AnonymousClass9JR A0c = C51965G9l.A0c(AnonymousClass05K.A00, 0, A07);
        if (r6 == 2WX.A02) {
            r6 = null;
        }
        2WX A0T = C51972G9s.A0T(C51965G9l.A0X(r6, A0c), 0, A072);
        2Wb A0Q = C51972G9s.A0Q(r21);
        int i7 = 0;
        for (int i8 = 0; i8 < min; i8++) {
            i += i4 * i8;
            i7 += i3 * i8;
            if (i8 == 0) {
                d = (double) (i - 2);
            } else {
                d = (double) i;
            }
            long doubleToRawLongBits = Double.doubleToRawLongBits(d);
            if (i8 == 0) {
                d2 = (double) (i7 - 2);
            } else {
                d2 = (double) i7;
            }
            long doubleToRawLongBits2 = Double.doubleToRawLongBits(d2);
            C244413b9 r14 = C244413b9.ABSOLUTE;
            Integer num = AnonymousClass05K.A0Y;
            A0Q.A00(new C53695Gsm((Uri) list.get(i8), AnonymousClass9JR.A00(AnonymousClass9JR.A00(G9t.A0z((2WX) null, num, r14), AnonymousClass05K.A0N, 1, doubleToRawLongBits), num, 1, doubleToRawLongBits2), ht9.A03));
        }
        return C243563Zg.A0B(A0Q, r21, A0T);
    }
}
