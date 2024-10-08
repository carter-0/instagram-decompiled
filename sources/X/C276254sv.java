package X;

import android.net.wifi.ScanResult;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.4sv  reason: invalid class name and case insensitive filesystem */
public final class C276254sv {
    public final AnonymousClass0JP A00;
    public final AnonymousClass0JR A01;

    public C276254sv(AnonymousClass0JP r1, AnonymousClass0JR r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public final void A00(List list) {
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ScanResult scanResult = (ScanResult) it.next();
                if (scanResult != null) {
                    long now = this.A00.now() - scanResult.timestamp;
                    if (Math.abs(now) <= 600000) {
                        scanResult.timestamp = (this.A01.now() - now) * 1000;
                    }
                }
            }
        }
    }
}
