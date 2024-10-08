package X;

import android.content.pm.PackageManager;
import java.util.Iterator;

/* renamed from: X.THi  reason: case insensitive filesystem */
public final class C13000THi implements Runnable {
    public final /* synthetic */ AnonymousClass3JC A00;
    public final /* synthetic */ T79 A01;

    public C13000THi(AnonymousClass3JC r1, T79 t79) {
        this.A01 = t79;
        this.A00 = r1;
    }

    public final void run() {
        C250663lr optionalTreeField;
        C250663lr optionalTreeField2;
        long j;
        T79 t79 = this.A01;
        C250663lr r3 = (C250663lr) this.A00.A01;
        if (r3 != null && (optionalTreeField = r3.getOptionalTreeField(0, "ig_on_device_app_history_privacy", AnonymousClass5JV.class, 2076880744)) != null && (optionalTreeField2 = optionalTreeField.getOptionalTreeField(0, "data", AnonymousClass5JW.class, -2128759826)) != null) {
            String A002 = AnonymousClass000.A00(163);
            if (optionalTreeField2.hasFieldValue(A002) && optionalTreeField2.getCoercedBooleanField(0, A002)) {
                0xY AR4 = t79.A04.AR4();
                AR4.E5c("last_query_time_in_sec", AnonymousClass7TG.A0I());
                AR4.apply();
                Iterator it = DbX.A0x(t79.A05).iterator();
                while (it.hasNext()) {
                    String A18 = AnonymousClass7TE.A18(it);
                    if (A18 != null && !00l.A0W(A18)) {
                        boolean z = false;
                        try {
                            t79.A00.getPackageManager().getPackageInfo(A18, 128);
                            z = true;
                        } catch (PackageManager.NameNotFoundException | RuntimeException unused) {
                        }
                        0Aj A0e = AnonymousClass7TE.A0e(t79.A01, "on_device_app_history_top_spend_apps");
                        if (z) {
                            j = 1;
                        } else {
                            j = 0;
                        }
                        if (A0e.isSampled()) {
                            A0e.AAJ("package_name", A18);
                            A0e.A9F("install_status", Long.valueOf(j));
                            A0e.Cgf();
                        }
                    }
                }
            }
        }
    }
}
