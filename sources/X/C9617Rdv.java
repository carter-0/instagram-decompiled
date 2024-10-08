package X;

import android.net.wifi.ScanResult;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Rdv  reason: case insensitive filesystem */
public abstract class C9617Rdv {
    public static ArrayList A00(List list, long j, long j2) {
        if (list == null) {
            return null;
        }
        ArrayList A1C = AnonymousClass7TE.A1C();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            it.next();
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            ScanResult scanResult = (ScanResult) it2.next();
            if (j2 - AnonymousClass7TE.A0P(scanResult.timestamp + 500) <= j) {
                A1C.add(scanResult);
            }
        }
        return A1C;
    }
}
