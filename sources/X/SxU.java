package X;

import android.os.Parcel;
import com.google.android.gms.auth.blockstore.RetrieveBytesRequest;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.internal.auth_blockstore.zza;
import com.google.android.gms.internal.auth_blockstore.zzv;

public final /* synthetic */ class SxU implements C13636Te2 {
    public final /* synthetic */ RetrieveBytesRequest A00;
    public final /* synthetic */ AnonymousClass63D A01;

    public /* synthetic */ SxU(RetrieveBytesRequest retrieveBytesRequest, AnonymousClass63D r2) {
        this.A01 = r2;
        this.A00 = retrieveBytesRequest;
    }

    public final void accept(Object obj, Object obj2) {
        RetrieveBytesRequest retrieveBytesRequest = this.A00;
        zzv zzv = new zzv((C365498nD) obj2);
        int A03 = AnonymousClass0fD.A03(-1993799605);
        Parcel A0K = Pxh.A0K(zzv);
        A0K.writeInt(1);
        retrieveBytesRequest.writeToParcel(A0K, 0);
        ((zza) ((BaseGmsClient) obj).A03()).A00(A0K, 12);
        AnonymousClass0fD.A0A(-1388156947, A03);
    }
}
