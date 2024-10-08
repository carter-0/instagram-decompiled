package X;

import android.os.Parcel;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.internal.p001authapiphone.zza;
import com.google.android.gms.internal.p001authapiphone.zzz;

public final /* synthetic */ class SxJ implements C13636Te2 {
    public final /* synthetic */ C8364QpM A00;

    public /* synthetic */ SxJ(C8364QpM qpM) {
        this.A00 = qpM;
    }

    public final void accept(Object obj, Object obj2) {
        zzz zzz = new zzz((C365498nD) obj2);
        int A03 = AnonymousClass0fD.A03(490627002);
        int A032 = AnonymousClass0fD.A03(1701337753);
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService");
        AnonymousClass0fD.A0A(-1514507378, A032);
        Pxf.A16(zzz, obtain);
        ((zza) ((BaseGmsClient) obj).A03()).A00(obtain, 1);
        AnonymousClass0fD.A0A(-1778752554, A03);
    }
}
