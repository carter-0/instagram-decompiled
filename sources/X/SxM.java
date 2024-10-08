package X;

import android.os.Parcel;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions;
import com.google.android.gms.fido.fido2.zzf;
import com.google.android.gms.internal.fido.zza;

public final /* synthetic */ class SxM implements C13636Te2 {
    public final /* synthetic */ C8363QpL A00;
    public final /* synthetic */ PublicKeyCredentialCreationOptions A01;

    public /* synthetic */ SxM(C8363QpL qpL, PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions) {
        this.A00 = qpL;
        this.A01 = publicKeyCredentialCreationOptions;
    }

    public final void accept(Object obj, Object obj2) {
        zzf zzf = new zzf((C365498nD) obj2);
        PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions = this.A01;
        int A03 = AnonymousClass0fD.A03(1408861356);
        int A032 = AnonymousClass0fD.A03(-583546164);
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.gms.fido.fido2.internal.regular.IFido2AppService");
        AnonymousClass0fD.A0A(-746055467, A032);
        obtain.writeStrongBinder(zzf);
        obtain.writeInt(1);
        publicKeyCredentialCreationOptions.writeToParcel(obtain, 0);
        ((zza) ((BaseGmsClient) obj).A03()).A00(obtain, 1);
        AnonymousClass0fD.A0A(-947669095, A03);
    }
}
