package X;

import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.IAccountAccessor;
import java.util.Collections;
import java.util.Set;

/* renamed from: X.5yX  reason: invalid class name and case insensitive filesystem */
public final class C301125yX implements Runnable {
    public final /* synthetic */ ConnectionResult A00;
    public final /* synthetic */ AnonymousClass64P A01;

    public C301125yX(ConnectionResult connectionResult, AnonymousClass64P r2) {
        this.A01 = r2;
        this.A00 = connectionResult;
    }

    public final void run() {
        Set emptySet;
        IAccountAccessor iAccountAccessor;
        AnonymousClass64P r6 = this.A01;
        AnonymousClass63w r5 = (AnonymousClass63w) r6.A05.A09.get(r6.A04);
        if (r5 != null) {
            ConnectionResult connectionResult = this.A00;
            boolean z = false;
            if (connectionResult.A01 == 0) {
                z = true;
            }
            if (z) {
                r6.A02 = true;
                AnonymousClass647 r3 = r6.A03;
                if (!r3.requiresSignIn()) {
                    try {
                        AnonymousClass645 r1 = (AnonymousClass645) r3;
                        if (r1.requiresSignIn()) {
                            emptySet = r1.A01;
                        } else {
                            emptySet = Collections.emptySet();
                        }
                        r3.Blb((IAccountAccessor) null, emptySet);
                    } catch (SecurityException e) {
                        Log.e("GoogleApiManager", "Failed to get service from broker. ", e);
                        r3.APT("Failed to get service from broker.");
                        r5.A0C(new ConnectionResult(10), (Exception) null);
                    }
                } else if (r6.A02 && (iAccountAccessor = r6.A00) != null) {
                    r3.Blb(iAccountAccessor, r6.A01);
                }
            } else {
                r5.A0C(connectionResult, (Exception) null);
            }
        }
    }
}
