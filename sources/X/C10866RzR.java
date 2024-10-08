package X;

import android.content.Intent;

/* renamed from: X.RzR  reason: case insensitive filesystem */
public final class C10866RzR {
    public final SPF A00(Intent intent) {
        0qQ.A0B(intent, 0);
        SPF spf = SPF.A06;
        if (spf == null) {
            intent.hashCode();
            SPF.A05 = intent.hashCode();
            spf = new SPF(intent);
        }
        if (!(SPF.A05 == intent.hashCode() || SPF.A06 == null)) {
            intent.hashCode();
            SPF.A05 = intent.hashCode();
            spf = new SPF(intent);
        }
        if (!0qQ.A0K(SPF.A06, spf)) {
            SPF.A06 = spf;
        }
        return spf;
    }
}
