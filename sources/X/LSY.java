package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class LSY {
    public static final AnonymousClass831 A00(AnonymousClass51O r2, AnonymousClass831 r3) {
        0qQ.A0B(r3, 0);
        ArrayList A05 = r3.A05();
        0qQ.A0C(A05, "null cannot be cast to non-null type java.util.ArrayList<T of com.instagram.creation.capture.quickcapture.video.model.SegmentStoreKt.push>");
        A05.add(r2);
        return JTR.A0m(r3, A05);
    }

    public static final AnonymousClass831 A01(AnonymousClass51O r2, AnonymousClass831 r3, int i) {
        0qQ.A0B(r3, 0);
        ArrayList A05 = r3.A05();
        0qQ.A0C(A05, "null cannot be cast to non-null type java.util.ArrayList<T of com.instagram.creation.capture.quickcapture.video.model.SegmentStoreKt.insert>");
        A05.add(i, r2);
        return JTR.A0m(r3, A05);
    }

    public static final AnonymousClass831 A03(AnonymousClass831 r6, List list) {
        0qQ.A0B(r6, 0);
        ArrayList A05 = r6.A05();
        0qQ.A0C(A05, "null cannot be cast to non-null type java.util.ArrayList<T of com.instagram.creation.capture.quickcapture.video.model.SegmentStoreKt.updateSegments>");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            0eP A1A = JTO.A1A(it);
            Number number = (Number) A1A.A00;
            if (number.intValue() >= 0 && number.intValue() < A05.size()) {
                A05.set(number.intValue(), A1A.A01);
            }
        }
        return JTR.A0m(r6, A05);
    }

    public static final 0eP A04(AnonymousClass831 r3) {
        0qQ.A0B(r3, 0);
        if (AnonymousClass7TE.A1b(r3.A01)) {
            ArrayList A05 = r3.A05();
            0qQ.A0C(A05, "null cannot be cast to non-null type java.util.ArrayList<T of com.instagram.creation.capture.quickcapture.video.model.SegmentStoreKt.pop>");
            Object remove = A05.remove(A05.size() - 1);
            0qQ.A07(remove);
            return AnonymousClass7TE.A1L(JTR.A0m(r3, A05), remove);
        }
        throw DbT.A0m();
    }

    public static final AnonymousClass831 A02(AnonymousClass51O r2, AnonymousClass831 r3, int i) {
        DbY.A1S(r3, r2);
        ArrayList A05 = r3.A05();
        0qQ.A0C(A05, "null cannot be cast to non-null type java.util.ArrayList<T of com.instagram.creation.capture.quickcapture.video.model.SegmentStoreKt.updateSegment>");
        if (i >= 0 && i < A05.size()) {
            A05.set(i, r2);
        }
        return JTR.A0m(r3, A05);
    }
}
