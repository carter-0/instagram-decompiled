package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.List;

/* renamed from: X.4j4  reason: invalid class name */
public final class AnonymousClass4j4 extends BroadcastReceiver {
    public final /* synthetic */ C271464it A00;

    public AnonymousClass4j4(C271464it r1) {
        this.A00 = r1;
    }

    public final void onReceive(Context context, Intent intent) {
        AnonymousClass4j3[] r7;
        String str;
        int A01 = AnonymousClass0fD.A01(1780001104);
        AnonymousClass0fQ.A01(this, context, intent);
        List list = this.A00.A01;
        synchronized (list) {
            r7 = (AnonymousClass4j3[]) list.toArray(new AnonymousClass4j3[list.size()]);
        }
        for (AnonymousClass4j3 r0 : r7) {
            AnonymousClass1Qz r3 = ((AnonymousClass4j2) r0).A00;
            synchronized (r3) {
                try {
                    Integer A03 = r3.A03();
                    if (A03 != AnonymousClass05K.A00) {
                        int intValue = A03.intValue();
                        if (intValue != 0) {
                            if (intValue != 1) {
                                str = "token_not_found";
                            } else {
                                str = "token_stale";
                            }
                            r3.A08 = AnonymousClass1Qz.A04;
                            r3.A01.A01++;
                            1R0.A02(r3, str, false);
                        } else {
                            throw new UnsupportedOperationException();
                        }
                    }
                } catch (Exception e) {
                    0wb.A06("IgZeroTokenManager", "Connectivity event handler", e);
                }
            }
        }
        AnonymousClass0fD.A0E(-78595573, A01, intent);
        return;
    }
}
