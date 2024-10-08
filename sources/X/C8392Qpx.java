package X;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.common.Feature;
import com.google.android.gms.internal.p001authapiphone.zza;
import com.google.android.gms.internal.p001authapiphone.zzh;

/* renamed from: X.Qpx  reason: case insensitive filesystem */
public final class C8392Qpx extends AnonymousClass645 {
    public final String A05() {
        return "com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService";
    }

    public final String A06() {
        return "com.google.android.gms.auth.api.phone.service.SmsRetrieverApiService.START";
    }

    public final boolean A09() {
        return true;
    }

    public final int getMinApkVersion() {
        return 12451000;
    }

    public final /* bridge */ /* synthetic */ IInterface A04(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService");
        if (queryLocalInterface instanceof zzh) {
            return queryLocalInterface;
        }
        zza zza = new zza(iBinder);
        AnonymousClass0fD.A0A(1004762225, AnonymousClass0fD.A03(-1029614092));
        return zza;
    }

    public final Feature[] A0A() {
        return C10130Rn7.A04;
    }
}
