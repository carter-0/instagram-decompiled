package X;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* renamed from: X.4Xv  reason: invalid class name and case insensitive filesystem */
public abstract class C266174Xv {
    public static C257263x7 A00(C256573vz r15, C256733wG r16, C257253x6 r17, String str, int i) {
        Map emptyMap = Collections.emptyMap();
        Uri A00 = r15.A00(str);
        long j = r15.A02;
        long j2 = r15.A01;
        C256733wG r0 = r16;
        String A02 = r0.A02();
        if (A02 == null) {
            A02 = r15.A00(((C256383vg) r0.A04.get(0)).A03).toString();
        }
        C256703wD.A02(A00);
        return new C257263x7(A00, r17, A02, emptyMap, (byte[]) null, 1, i, 0, j, j2);
    }
}
