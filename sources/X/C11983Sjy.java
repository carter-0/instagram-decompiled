package X;

import android.content.Context;
import android.net.ConnectivityManager;
import android.util.Log;
import java.util.Set;

/* renamed from: X.Sjy  reason: case insensitive filesystem */
public final class C11983Sjy implements C13917TlJ {
    public final Context A00;
    public final C13539TcB A01;

    public final void onDestroy() {
    }

    public final void onStart() {
        boolean z;
        C11192SEs A002 = C11192SEs.A00(this.A00);
        C13539TcB tcB = this.A01;
        synchronized (A002) {
            Set set = A002.A02;
            set.add(tcB);
            if (!A002.A00 && !set.isEmpty()) {
                C10660Rvu rvu = A002.A01;
                C13882Tj5 tj5 = rvu.A03;
                rvu.A00 = AnonymousClass7TF.A1V(((ConnectivityManager) tj5.get()).getActiveNetwork());
                try {
                    ((ConnectivityManager) tj5.get()).registerDefaultNetworkCallback(rvu.A01);
                    z = true;
                } catch (RuntimeException e) {
                    if (Log.isLoggable("ConnectivityMonitor", 5)) {
                        Log.w("ConnectivityMonitor", C66579MXk.A00(565), e);
                    }
                    z = false;
                }
                A002.A00 = z;
            }
        }
    }

    public final void onStop() {
        C11192SEs A002 = C11192SEs.A00(this.A00);
        C13539TcB tcB = this.A01;
        synchronized (A002) {
            Set set = A002.A02;
            set.remove(tcB);
            if (A002.A00 && set.isEmpty()) {
                C10660Rvu rvu = A002.A01;
                ((ConnectivityManager) rvu.A03.get()).unregisterNetworkCallback(rvu.A01);
                A002.A00 = false;
            }
        }
    }

    public C11983Sjy(Context context, C13539TcB tcB) {
        this.A00 = context.getApplicationContext();
        this.A01 = tcB;
    }
}
