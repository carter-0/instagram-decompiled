package X;

import android.os.IBinder;
import android.os.IInterface;
import android.util.Log;
import com.google.android.gms.common.Feature;
import com.google.android.gms.internal.auth.zza;
import com.google.android.gms.internal.auth.zzp;

/* renamed from: X.Qq0  reason: case insensitive filesystem */
public final class C8395Qq0 extends AnonymousClass645 {
    public final String A05() {
        return "com.google.android.gms.auth.account.data.IGoogleAuthService";
    }

    public final String A06() {
        return "com.google.android.gms.auth.account.authapi.START";
    }

    public final boolean A08() {
        return true;
    }

    public final boolean A09() {
        return true;
    }

    public final int getMinApkVersion() {
        return 17895000;
    }

    public final /* synthetic */ IInterface A04(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.account.data.IGoogleAuthService");
        if (queryLocalInterface instanceof zzp) {
            return queryLocalInterface;
        }
        zza zza = new zza("com.google.android.gms.auth.account.data.IGoogleAuthService", iBinder);
        AnonymousClass0fD.A0A(-1007404123, AnonymousClass0fD.A03(-715125604));
        return zza;
    }

    public final Feature[] A0A() {
        return new Feature[]{C10138RnF.A0C, C10138RnF.A0B, C10138RnF.A00};
    }

    public final void APT(String str) {
        Log.w("GoogleAuthSvcClientImpl", "GoogleAuthServiceClientImpl disconnected with reason: ".concat(String.valueOf(str)));
        super.APT(str);
    }
}
