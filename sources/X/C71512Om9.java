package X;

import com.facebook.messaging.lockbox.LockBoxStorageManager;

/* renamed from: X.Om9  reason: case insensitive filesystem */
public final class C71512Om9 implements C74290PsI {
    public final /* synthetic */ String A00;

    public C71512Om9(String str) {
        this.A00 = str;
    }

    public final /* bridge */ /* synthetic */ void run(Object obj) {
        Number number = (Number) obj;
        if (number != null && number.intValue() == 1) {
            C3024663k r3 = LockBoxStorageManager.backupManager;
            if (r3 == null) {
                0qQ.A0F("backupManager");
                throw AnonymousClass00P.createAndThrow();
            }
            String str = this.A00;
            C69508Nmq nmq = C69508Nmq.A05;
            0qQ.A0B(str, 0);
            r3.A00.A00(nmq, str);
        }
    }
}
