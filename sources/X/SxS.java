package X;

import android.os.Parcel;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.internal.auth.zza;
import com.google.android.gms.internal.auth.zzbw;
import com.google.android.gms.internal.auth.zzx;

public final /* synthetic */ class SxS implements C13636Te2 {
    public final /* synthetic */ QpR A00;
    public final /* synthetic */ zzbw A01;

    public /* synthetic */ SxS(QpR qpR, zzbw zzbw) {
        this.A00 = qpR;
        this.A01 = zzbw;
    }

    public final void accept(Object obj, Object obj2) {
        zza zza = (zza) ((BaseGmsClient) obj).A03();
        zzx zzx = new zzx((C365498nD) obj2);
        zzbw zzbw = this.A01;
        int A03 = AnonymousClass0fD.A03(-1783021223);
        Parcel A002 = zza.A00();
        Pxf.A16(zzx, A002);
        SMV.A00(A002, zzbw);
        zza.A02(A002, 2);
        AnonymousClass0fD.A0A(1505747303, A03);
    }
}
