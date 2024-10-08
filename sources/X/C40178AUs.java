package X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.AUs  reason: case insensitive filesystem */
public final class C40178AUs implements C340147km {
    public final Comparator A00 = new ArV((Object) this, 8);

    public final C343137pj Ap9(C340177kp r19, C340177kp r20, List list, List list2, List list3, List list4, int i, int i2, int i3) {
        List<C343047pa> list5 = list;
        List list6 = list3;
        AnonymousClass7TF.A1B(list5, 0, list6);
        C343047pa r11 = (C343047pa) AnonymousClass7TE.A13(list5);
        for (C343047pa r5 : list5) {
            if (C343047pa.A00(r11) < C343047pa.A00(r5)) {
                r11 = r5;
            }
        }
        double d = ((double) r11.A01) / ((double) r11.A02);
        int min = Math.min(i2, i);
        ArrayList A1D = AnonymousClass7TE.A1D(list6);
        Comparator comparator = this.A00;
        01V.A1D(A1D, comparator);
        List unmodifiableList = Collections.unmodifiableList(A1D);
        0qQ.A07(unmodifiableList);
        Iterator it = unmodifiableList.iterator();
        C343047pa r9 = null;
        while (true) {
            if (it.hasNext()) {
                C343047pa r8 = (C343047pa) it.next();
                int i4 = r8.A01;
                int i5 = r8.A02;
                if (Math.abs((((double) i4) / ((double) i5)) - d) <= 0.1d && (r9 == null || C343047pa.A00(r9) <= ((long) i5) * ((long) i4))) {
                    r9 = r8;
                    if (Math.min(i4, i5) >= min) {
                        break;
                    }
                }
            } else if (r9 == null) {
                ArrayList A1D2 = AnonymousClass7TE.A1D(list6);
                01V.A1D(A1D2, comparator);
                List<C343047pa> unmodifiableList2 = Collections.unmodifiableList(A1D2);
                0qQ.A07(unmodifiableList2);
                for (C343047pa r52 : unmodifiableList2) {
                    if (r9 == null || C343047pa.A00(r9) <= C343047pa.A00(r52)) {
                        r9 = r52;
                        if (Math.min(r52.A01, r52.A02) > min) {
                            break;
                        }
                    }
                }
            }
        }
        return new C343137pj(r9, r11, r9, (C343047pa) null);
    }

    public final C343137pj Bc4(C340177kp r2, List list, List list2, int i, int i2, int i3) {
        throw AnonymousClass7TE.A1B("getPhotoModeSizes() is not implemented");
    }

    public final C343137pj Bf6(List list, int i, int i2, int i3) {
        throw AnonymousClass7TE.A1B("getPreviewModeSizes() is not implemented");
    }

    public final C343137pj CEC(C340177kp r2, List list, List list2, int i, int i2, int i3) {
        throw AnonymousClass7TE.A1B("getVideoModeSizes() is not implemented");
    }
}
