package X;

import com.facebook.mobileconfig.factory.MobileConfigUpdateConfigsCallback;
import java.util.Iterator;

/* renamed from: X.5Ht  reason: invalid class name and case insensitive filesystem */
public final class C283455Ht implements MobileConfigUpdateConfigsCallback {
    public final /* synthetic */ AnonymousClass0mD A00;
    public final /* synthetic */ 1AV A01;

    public C283455Ht(AnonymousClass0mD r1, 1AV r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void onNetworkComplete(boolean z) {
        C293395kf r0;
        1AV r3 = this.A01;
        if (r3.A04) {
            1AU r5 = r3.A01;
            1AA r4 = r5.A00;
            0qQ.A0A(r4);
            0Tu r2 = 0Tu.A04;
            if (r4.Ah1(r2, 36312827501937935L, false)) {
                r5.A03(r4.Ah1(r2, 36312827502003472L, false));
            }
        }
        if (AnonymousClass1A9.A00() && r3.A03.compareAndSet(false, true)) {
            r3.A01.A00.A0E();
        }
        if (r3.A01.A00.A06 == 2) {
            0xY AR4 = AnonymousClass0xl.A00(C61170le.A00).A00.AR4();
            AR4.E5T("session_based_client_config_success_fetched", z);
            AR4.apply();
        }
        AnonymousClass0mD r32 = this.A00;
        if (z) {
            r0 = C293395kf.SUCCESS_DID_UPDATE;
        } else {
            r0 = C293395kf.FAILURE;
        }
        r32.A00 = r0;
        r32.A02.countDown();
        if (!r32.A01.isEmpty()) {
            Iterator it = r32.A01.iterator();
            while (it.hasNext()) {
                ((0mC) it.next()).run(r32.A00);
            }
        }
    }
}
