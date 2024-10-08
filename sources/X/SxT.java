package X;

import android.os.Parcel;
import com.google.android.gms.auth.blockstore.StoreBytesData;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.internal.auth_blockstore.zza;
import com.google.android.gms.internal.auth_blockstore.zzu;

public final /* synthetic */ class SxT implements C13636Te2 {
    public final /* synthetic */ StoreBytesData A00;
    public final /* synthetic */ AnonymousClass63D A01;

    public /* synthetic */ SxT(StoreBytesData storeBytesData, AnonymousClass63D r2) {
        this.A01 = r2;
        this.A00 = storeBytesData;
    }

    public final void accept(Object obj, Object obj2) {
        StoreBytesData storeBytesData = this.A00;
        zzu zzu = new zzu((C365498nD) obj2);
        int A03 = AnonymousClass0fD.A03(1854331366);
        Parcel A0K = Pxh.A0K(zzu);
        A0K.writeInt(1);
        storeBytesData.writeToParcel(A0K, 0);
        ((zza) ((BaseGmsClient) obj).A03()).A00(A0K, 10);
        AnonymousClass0fD.A0A(-324524744, A03);
    }
}
