package X;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.common.Feature;
import com.google.android.gms.internal.fido.zza;
import com.google.android.gms.internal.fido.zzs;

/* renamed from: X.Qpz  reason: case insensitive filesystem */
public final class C8394Qpz extends AnonymousClass645 {
    public final String A05() {
        return "com.google.android.gms.fido.fido2.internal.regular.IFido2AppService";
    }

    public final String A06() {
        return "com.google.android.gms.fido.fido2.regular.START";
    }

    public final boolean A09() {
        return true;
    }

    public final int getMinApkVersion() {
        return 13000000;
    }

    public final /* synthetic */ IInterface A04(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fido.fido2.internal.regular.IFido2AppService");
        if (queryLocalInterface instanceof zzs) {
            return queryLocalInterface;
        }
        zza zza = new zza(iBinder);
        AnonymousClass0fD.A0A(1495950521, AnonymousClass0fD.A03(730207251));
        return zza;
    }

    public final Feature[] A0A() {
        return new Feature[]{C10141RnI.A0A, C10141RnI.A09};
    }

    public final Bundle A02() {
        Bundle A0a = AnonymousClass7TE.A0a();
        A0a.putString("FIDO2_ACTION_START_SERVICE", "com.google.android.gms.fido.fido2.regular.START");
        return A0a;
    }
}
