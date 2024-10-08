package X;

import java.util.ArrayList;
import java.util.List;

public final class LC2 {
    public final /* synthetic */ K6K A00;

    public LC2(K6K k6k) {
        this.A00 = k6k;
    }

    public final void A00(C53401GnY gnY) {
        Long l;
        List list;
        List<AnonymousClass9IY> list2;
        K6K k6k = this.A00;
        AnonymousClass0eM r5 = k6k.A0l;
        if (182.A06(0Tu.A06, DbT.A0X(r5), 36325742468871355L)) {
            AnonymousClass7IR r52 = new AnonymousClass7IR(k6k, AnonymousClass7TE.A0l(r5));
            C254783t2 r7 = k6k.A0K;
            XSV A002 = OP1.A00(k6k.A0H);
            K6G A003 = K6K.A00(k6k);
            ArrayList arrayList = null;
            if (A003 != null) {
                l = DbS.A0j(A003.A00().size());
            } else {
                l = null;
            }
            AnonymousClass2Ep r0 = k6k.A0H;
            if (r0 != null) {
                list = r0.BJy().A02;
            } else {
                list = null;
            }
            if (!(gnY == null || (list2 = (List) gnY.A00) == null)) {
                arrayList = AnonymousClass7TE.A1C();
                for (AnonymousClass9IY r02 : list2) {
                    try {
                        String str = gnY.A04;
                        int i = r02.A02;
                        String obj = str.subSequence(i, r02.A01 + i).toString();
                        if (obj != null) {
                            arrayList.add(obj);
                        }
                    } catch (IndexOutOfBoundsException unused) {
                        DbT.A1Q(0wj.A01, C273654mx.A00(2180), 20134884);
                    }
                }
            }
            r52.A00(A002, r7, l, "send", "media_picker_composer", list, arrayList);
        }
        K6K.A01(gnY, k6k, 0, k6k.A0U, JTQ.A0L(k6k).A00());
    }
}
