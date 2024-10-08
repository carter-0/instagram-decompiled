package X;

import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.internal.zact;
import com.google.android.gms.common.internal.AccountAccessor;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.common.internal.zav;
import com.google.android.gms.signin.internal.zak;
import java.util.Set;

public final class TH6 implements Runnable {
    public final /* synthetic */ zact A00;
    public final /* synthetic */ zak A01;

    public TH6(zact zact, zak zak) {
        this.A00 = zact;
        this.A01 = zak;
    }

    public final void run() {
        IAccountAccessor A002;
        zact zact = this.A00;
        zak zak = this.A01;
        ConnectionResult connectionResult = zak.A01;
        if (connectionResult.A01 == 0) {
            zav zav = zak.A02;
            AnonymousClass3Qk.A02(zav);
            connectionResult = zav.A02;
            if (connectionResult.A01 == 0) {
                AnonymousClass64R r4 = zact.A00;
                IBinder iBinder = zav.A01;
                if (iBinder == null) {
                    A002 = null;
                } else {
                    A002 = AccountAccessor.A00(iBinder);
                }
                Set set = zact.A06;
                AnonymousClass64P r42 = (AnonymousClass64P) r4;
                if (A002 == null || set == null) {
                    Log.wtf(C273654mx.A00(1273), "Received null response from onSignInSuccess", new Exception());
                    r42.FOV(new ConnectionResult(4));
                    zact.A01.disconnect();
                }
                r42.A00 = A002;
                r42.A01 = set;
                if (r42.A02) {
                    r42.A03.Blb(A002, set);
                }
                zact.A01.disconnect();
            }
            String valueOf = String.valueOf(String.valueOf(connectionResult));
            Log.wtf("SignInCoordinator", "Sign-in succeeded with resolve account failure: ".concat(valueOf), new Exception());
        }
        zact.A00.FOV(connectionResult);
        zact.A01.disconnect();
    }
}
